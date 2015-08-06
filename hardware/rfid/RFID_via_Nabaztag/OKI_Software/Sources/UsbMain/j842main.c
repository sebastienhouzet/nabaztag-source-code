/*******************************************************************************
	j842main.c
	JOB60842サンプルプログラム
	メインプログラム

	Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
	  All rights reserved.

	更新履歴
	Mar.31,2003 rev1.00:新規作成
*******************************************************************************/
#define DEBUG
/* #define DEBUG_CMP */

#include <stdio.h>
#include <string.h>
#include "config.h"
#include "typedef.h"
#include "usbctrl.h"
#include "otg.h"
#include "usbh.h"
#include "usbp.h"
#include "usbh_class.h"
#include "usbp_api.h"

int printout_flag = 0;
int connect_request = 0;
int transfer_request = 0;
int old_state = 0;
int otg_request_status = 0;

#define USB_MODE USB_OTG

#ifndef DATABUFFER
  #define DATABUFFER		1
#endif

/* DATABUFFER==0 ML60841内部RAMをバッファにする */
/* DATABUFFER==1 外部RAMをバッファにする        */
#if (DATABUFFER==0)
  #define MALLOC(a)			usbh_malloc(a)
  #define FREE(a)			usbh_free(a)
#else
  #define MALLOC(a)			malloc(a)
  #define FREE(a)			free(a)
#endif

#ifndef BULK_DATA_MAX
  #define BULK_DATA_MAX 	(1024)
#endif

#ifndef BULK_DATA_INC
  #define BULK_DATA_INC	(-1)	/* 転送バイト数の増減 */
#endif

#ifndef DEADLOOP
  #define DEADLOOP		0		/* 転送レート測定のため */
#endif

#define BULK_OUT_EP		1		/* バルクアウト転送EP番号 */
#define BULK_IN_EP		2		/* バルクイン転送EP番号 */

#ifdef DEBUG_CMP
  #define memcmp usbhost_okijob_memcmp
#endif

/*******************************************************************************
	Routine Name    ：console_in
	Form            ：static void console_in(void)
	Parameters      ：なし
	Return value    ：なし
	Description     ：コンソール入力
*******************************************************************************/
static void console_in(void)
{
	int key;

	key = con_getc();

	if(key != NULL){
		con_printf("\n");
		switch(key){
		case 'h':
			con_printf("Demo Help\n");
#if (USB_MODE==USB_OTG)
			con_printf(" r: Host Bus Request \n");
			con_printf(" d: Host Bus Drop\n");
			con_printf(" s: Host Bus Suspend\n");
#endif
			con_printf(" t: Host transfer Request\n");
			con_printf(" c: Host transfer Cancel\n");
			break;
#if (USB_MODE==USB_OTG)
		case 'r':
			connect_request = 1;
            otg_request_status = BUS_REQ;
			break;
		case 'd':
			connect_request = -1;
            otg_request_status = DROP_REQ;
			break;
		case 's':
			connect_request = 0;
			transfer_request = 0;
            otg_request_status = SUSPEND_REQ;
			break;
#endif
		case 't':
			transfer_request = 1;
			break;
		case 'c':
			transfer_request = 0;
			break;
/*
		case '1':
			usbctrl_reg_dump();
			break;
		case '2':
			hcd_malloc_info(0);
			break;
		case '3':
			hcd_malloc_info(2);
			break;
*/
        default:
            break;
		}
	}/* if(key != NULL){ */
    else{
        otg_request_status = 0;
    }
}


/*******************************************************************************
	Routine Name    ：usbperi_main
	Form            ：static void usbperi_main(void)
	Parameters      ：なし
	Return value    ：なし
	Description     ：USBペリフェラルメイン処理
*******************************************************************************/
static void usbperi_main(void)
{


    usbp_main();
    return;
}


/*******************************************************************************
	Routine Name    ：memsetl_inc
	Form            ：int memsetl_inc(long *dest, unsigned char data, int size)
	Parameters      ：dest          データ設定先頭アドレス
	                  data          データ初期値
	                  size          データサイズ
	Return value    ：0
	Description     ：テスト用 メモリセットルーチン
*******************************************************************************/
int memsetl_inc(long *dest, unsigned char data, int size)
{
	int loop;
	int datal;

	for(loop = 0; loop < size; loop+=sizeof(long)){
		datal = (data+3);
		datal = (datal <<8) | (data+2);
		datal = (datal <<8) | (data+1);
		datal = (datal <<8) | data;
		data += 4;
		*dest++ = datal;
	}

	return 0;
}


#ifdef DEBUG_CMP
/*******************************************************************************
	Routine Name    ：usbhost_okijob_memcmp
	Form            ：int usbhost_okijob_memcmp(const void *s1, const void *s2,
	                                            size_t size)
	Parameters      ：s1            比較データ1先頭アドレス
	                  s2            比較データ2先頭アドレス
	                  size          データサイズ
	Return value    ：実行結果
	                  正常時  OK
	                  異常時  NG
	Description     ：メモリ比較ルーチン
*******************************************************************************/
int usbhost_okijob_memcmp(const void *s1, const void *s2, size_t size)
{
    char *data1 = (char*)s1;
    char *data2 = (char*)s2;
    ulong cnt = 0;
    ulong ng_cnt = 0;


	while( cnt < size ){
        if( *data1 != *data2 ){
            con_printf( "Compare Error!!\n" );
            con_printf( "data1: %x Address: %x\n", *data1, data1 );
            con_printf( "data2: %x Address: %x\n", *data2, data2 );
            con_printf( "%u byte\n\n", cnt );
            ng_cnt ++;
        }
        data1 ++;
        data2 ++;
        cnt ++;
    }

    if( ng_cnt != 0 ){
        con_printf( "NG: %u\n\n", ng_cnt );
        return NG;
    }
    return OK;
}
#endif


/*******************************************************************************
	Routine Name    ：usbhost_okijob_test
	Form            ：static void usbhost_okijob_test(void)
	Parameters      ：なし
	Return value    ：なし
	Description     ：ループバックテスト
*******************************************************************************/
static void usbhost_okijob_test(void)
{
	static void * handle = NULL;
	static long length_bak = BULK_DATA_MAX;
	static unsigned char data = 0;
	int ret, status;
	long length;
	void *bulk_out, *bulk_in;

    /* ハンドル取得 */
    handle = okijob_open(); 

	if(!handle) return;

	length = length_bak;
	length_bak += BULK_DATA_INC;
	if (length_bak <= 0){
		length_bak = BULK_DATA_MAX;
	}
	else if(length_bak > BULK_DATA_MAX){
		length_bak = 1;
	}

	status = 0;
	while(1){

		bulk_out = MALLOC((unsigned long)length);
		if(!bulk_out){
			status =  -1;
            FREE(bulk_out);
			break;
		}

		bulk_in = MALLOC((unsigned long)length);
		if(!bulk_in){
			status =  -1;
            FREE(bulk_out);
			FREE(bulk_in);
			break;
		}

		memsetl_inc((long *)bulk_out, data++, length);

        do{
		    ret = okijob_bulk(handle, BULK_OUT_EP, bulk_out, (unsigned long)length);
		    if(ret<=0){
		 	    status = -3;
			    break;
		    }

		    ret = okijob_bulk(handle, BULK_IN_EP, bulk_in, (unsigned long)length);
		    if(ret<=0){
		 	    status = -4;
			    break;
		    }
	    }while(DEADLOOP);

		if(status >= 0){
			if(memcmp(bulk_out, bulk_in, (unsigned long)length)!=0){
				status = -2;
			}
		}

		FREE(bulk_out);
		FREE(bulk_in);
		break;
	}

	if(status>=0){
		dbg_printf(" OKIJOB(%d): Test OK! (%dB) \n", okijob_number(handle), length);
	}else{
		dbg_printf(" OKIJOB(%d): Test ERROR! (%dB) ", okijob_number(handle), length);
		switch(status){
			case -1: dbg_printf("enought momory."); break;
			case -2: dbg_printf("data compare error."); break;
			case -3: dbg_printf("bulk-out transfer failed."); break;
			case -4: dbg_printf("bulk-in transfer failed."); break;
			default: dbg_printf("unknown error."); break;
		}
    }
	dbg_printf("\n\n");
	okijob_close(handle);
	handle = NULL;
}


/*******************************************************************************
	Routine Name    ：usbhost_main
	Form            ：static void usbhost_main(void)
	Parameters      ：なし
	Return value    ：なし
	Description     ：USBホストメイン処理
*******************************************************************************/
static void usbhost_main(void)
{
    int ret;
    int status[6];

    /* ホストイベント処理 */
    usbhost_events();

    /* マウスステータス表示 */
    ret = mouse_status( status );
    if( ret == OK ){
        con_printf( "USB Mouse Status\n" );
        con_printf( "X = %d Y = %d Z = %d\n", status[0], status[1], status[2] );
        con_printf( "Right = %d Left = %d Middle = %d\n\n", status[3], status[4], status[5] );
    }

    /* バルクループバックテスト */
    if( transfer_request == 1 ){
        usbhost_okijob_test();
    }
}


/*******************************************************************************
	Routine Name    ：main
	Form            ：int main(void)
	Parameters      ：なし
	Return value    ：ret           実行結果
	Description     ：メインルーチン
*******************************************************************************/
int main(void)
{
	int ret;

	/* CPU 初期化 */
	ret = cpu_init();
	if(ret!=OK){
        return ret;
    }

	con_printf("\n\n\n");
	con_printf("Demo System Start!\n");

	/* メモリ 初期化 */
	memset( (uchar *)USB_BUFFER_ADDRESS, 0, USB_BUFFER_SIZE );

	/* USBコントローラ 初期化 */
    usbctrl_peri_driver_set( usbperi_init, usbp_interrupt );
    usbctrl_host_driver_set( NULL, usbhost_interrupt );
    old_state = STATE_IDLE;
	ret = usbctrl_init( USB_MODE );
#if (USB_MODE==USB_HOST)
    connect_request = 1;
#endif
	if(ret!=OK){
        return ret;
    }
	IRQ_Install(EIRQ3, IRQ_LV_EXUSB, usbctrl_interrupt);
	mdelay(1000);

	/* メインループ */
	while(1){

        /* コンソール入力 */
		console_in();

        /* アイドル動作 */
        if( usbctrl_state == STATE_IDLE ){
            /* ホスト起動中? */
            if( old_state == STATE_HOST_ACTV ){
                usbhost_exit();
            }
            /* リクエストあり？ */
            if( otg_request_status != 0 ){
		        usbctrl_otg_request(otg_request_status);
            }
            old_state = STATE_IDLE;
        }
        /* ペリフェラル動作 */
        else if( usbctrl_state == STATE_PERI_ACTV ){
            /* ホスト起動中? */
            if( old_state == STATE_HOST_ACTV ){
                usbhost_exit();
            }
            if( old_state != STATE_PERI_ACTV ){
	    		con_printf("USB Peripheral Active!\n");
            }
            /* リクエストあり？ */
            if( otg_request_status != 0 ){
		        usbctrl_otg_request(otg_request_status);
            }
            /* ペリフェラルメイン処理 */
            usbperi_main();
            old_state = STATE_PERI_ACTV;
		}
        /* ホスト動作 */
		else if( usbctrl_state == STATE_HOST_ACTV ){
            if( old_state != STATE_HOST_ACTV ){
    			con_printf("USB Host Active!\n");
                /* ホスト初期化 */
                ret = usbhost_init();
                if( ret != OK ){
                    return ret;
                }
                old_state = STATE_HOST_ACTV;
            }
            /* ホスト動作開始 */
            usbhost_main();
            /* サスペンド要求 */
            if( (connect_request == 0) && (otg_request_status == SUSPEND_REQ) ){
                ret = usbctrl_otg_request( SUSPEND_REQ );
                if( ret != OK ){
                    return ret;
                }
            }
            /* バス使用禁止要求 */
            else if( (connect_request == -1) && (otg_request_status == DROP_REQ) ){
                ret = usbctrl_otg_request( DROP_REQ );
                if( ret != OK ){
                    return ret;
                }
            }
		}
        /* SRP実施 */
		else if( usbctrl_state == STATE_OTG_SRP ){
            ret = usbctrl_otg_srp();
            if( ret != OK ){
                return ret;
            }
            old_state = STATE_OTG_SRP;
		}
	}/* while(1){ */

	return ret;
}

/* End of file */
