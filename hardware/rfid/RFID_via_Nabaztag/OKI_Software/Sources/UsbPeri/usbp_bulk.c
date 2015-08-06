/*******************************************************************************
    usbp_bulk.c
    JOB60842サンプルプログラム 
    USBペリフェラルバルクループバッグドライバルーチン群


    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/
#include "config.h"
#include "usbp.h"
#include "usbp_class.h"
#include "usbp_api.h"


/*----------------------------------------------------------------------------*/
/*グローバル変数定義*/
#ifdef USB_BUFFER_ADDRESS
  #define BULKBUF_SIZE	(USB_BUFFER_SIZE/4)
  uchar	*buf1 = (uchar *)USB_BUFFER_ADDRESS;
  uchar	*buf2 = (uchar *)USB_BUFFER_ADDRESS+USB_BUFFER_SIZE/4;
  uchar	*buf3 = (uchar *)USB_BUFFER_ADDRESS+USB_BUFFER_SIZE/2;
  uchar	*buf4 = (uchar *)USB_BUFFER_ADDRESS+((USB_BUFFER_SIZE/4)*3);
#else
  #define BULKBUF_SIZE	(1024)
  uchar	buf1[BULKBUF_SIZE];		/* データ送受信バッファ */
  uchar	buf2[BULKBUF_SIZE];		/* データ送受信バッファ */
  uchar	buf3[BULKBUF_SIZE];		/* データ送受信バッファ */
  uchar	buf4[BULKBUF_SIZE];		/* データ送受信バッファ */
#endif

uchar 	*buf_rx;				/* データ受信バッファポインタ */
uchar 	*buf_tx;				/* データ送信バッファポインタ */
uchar 	*buf_rx2;				/* データ受信バッファポインタ */
uchar 	*buf_tx2;				/* データ送信バッファポインタ */
uint 	send_cnt;
uint 	recv_cnt;
uint 	send_cnt2;
uint 	recv_cnt2;

#define INT_BUFFER_SIZE 16
uchar	buf_int[INT_BUFFER_SIZE] = {0,1,2,3,4,5,6,7,8,9,0xA,0xB,0xC,0xD,0xE,0xF};

uchar 	ready_nullpkt_xfer = 0;	/* Nullパケット送信準備を示すフラグ */

/*----------------------------------------------------------------------------*/
/*プロトタイプ宣言*/
static void bulk_rx(uchar *buf, ulong size);
static void bulk_tx(uchar *buf, ulong size);
static void bulk_rx2(uchar *buf, ulong size);
static void bulk_tx2(uchar *buf, ulong size);
static void interrup_tx(uchar *buf, ulong size);

/*******************************************************************************
	Routine Name:	usbp_bulk_init
	Form:			void usbp_bulk_init(uchar interface, uchar alternate)
	Parameters:		uchar	interface Interface番号
					uchar	alternate Alternate番号
	Return value:	無し
	Description:	エンドポイントの設定状況によりコールバック関数の設定を行う。

******************************************************************************/
void usbp_bulk_init(uchar interface, uchar alternate)
{
	if(interface != 0)
		return;
	if(alternate != 0)
		return;
	/*------------------------------------------------------------
	   BULK用エンドポイントに関する初期化処理                     
	------------------------------------------------------------*/
	buf_rx = buf1;	/* 受信用バッファポインタ設定 */
	buf_tx = buf2;	/* 送信用バッファポインタ設定 */
	buf_rx2 = buf3;	/* 受信用バッファポインタ設定 */
	buf_tx2 = buf4;	/* 送信用バッファポインタ設定 */

	send_cnt = 0;
	recv_cnt = 0;
	send_cnt2 = 0;
	recv_cnt2 = 0;

	/* BULK OUT エンドポイント設定 */
	usbp_set_trans_callback(EP_RX, bulk_rx);	/* コールバック関数設定 */
	usbp_rx_data(buf_rx, EP_RX, 64);		/* 受信準備 */

	/* BULK IN エンドポイント設定 */
	usbp_set_trans_callback(EP_TX, bulk_tx);	/* コールバック関数設定 */


	/* BULK OUT エンドポイント設定 */
	usbp_set_trans_callback(EP_RX2, bulk_rx2);	/* コールバック関数設定 */
	usbp_rx_data(buf_rx2, EP_RX2, 64);		/* 受信準備 */

	/* BULK IN エンドポイント設定 */
	usbp_set_trans_callback(EP_TX2, bulk_tx2);	/* コールバック関数設定 */
	

	/* Interrupt IN エンドポイント設定 */
	usbp_set_trans_callback(EP_INT, interrup_tx);	/* コールバック関数設定 */
	usbp_tx_data(buf_int, EP_INT, EPINT_PLD);		/* 送信準備 */
#if defined(USBP_DEBUG_PRINT)
	sio_printf("BULK ENDPOINT INITIALIZED.\n");
#endif
}


/*******************************************************************************
	Routine Name:	bulk_rx
	Form:			static void bulk_rx(uchar *buf, ulong size)
	Parameters:		unsigned char *buf - バッファポインタ
					unsigned long size - サイズ
	Return value:	無し
	Description:	BULK OUT Endpoint用コールバック関数

******************************************************************************/
static void bulk_rx(uchar *buf, ulong size)
{
	/*
	** 受信データがあり，送信待ちデータが無い場合
	*/
	if (size > 0)
	{
		uchar *tmp;
		recv_cnt +=  size;

		if(recv_cnt > 0 && (send_cnt == 0))
		{
			send_cnt = recv_cnt;
			tmp = buf_tx;
			buf_tx = buf_rx;
			buf_rx = tmp;
			usbp_tx_data(buf_tx, EP_TX, send_cnt);
			usbp_rx_data(buf_rx, EP_RX, 64);
			recv_cnt = 0;
#if defined(USBP_DEBUG_PRINT)
			sio_printf("RX = %08X\n",send_cnt);
#endif
			return;
		}
		else
		{
			/*
			** 受信データがバッファサイズを超えない様に
			*/
			if ((uint)(buf-buf_rx)+size+64 > BULKBUF_SIZE)
			{
				usbp_rx_data(buf_rx, EP_RX, 64);
				/* 以前に受信したデータは消失します */
			}
			else
			{
				usbp_rx_data((buf + size), EP_RX, 64);
			}
		}
	}
}


/*******************************************************************************
	Routine Name:	bulk_tx
	Form:			static void bulk_tx(uchar *buf, ulong size)
	Parameters:		unsigned char *buf - バッファポインタ
					unsigned long size - サイズ
	Return value:	無し
	Description:	BULK IN Endpoint用コールバック関数

******************************************************************************/
static void bulk_tx(uchar *buf, ulong size)
{
	uchar *tmp;

	send_cnt = 0;	/* 送信データ数クリア */

	if(recv_cnt > 0)
	{
		send_cnt = recv_cnt;

		tmp = buf_tx;
		buf_tx = buf_rx;
		buf_rx = tmp;

		usbp_tx_data(buf_tx, EP_TX, send_cnt);
		usbp_rx_data(buf_rx, EP_RX, 64);

		recv_cnt = 0;
#if defined(USBP_DEBUG_PRINT)
			sio_printf("TX = %08X\n",send_cnt);
#endif
	}

}


/*******************************************************************************
	Routine Name:	bulk_rx2
	Form:			static void bulk_rx2(uchar *buf, ulong size)
	Parameters:		unsigned char *buf - バッファポインタ
					unsigned long size - サイズ
	Return value:	無し
	Description:	BULK OUT Endpoint用コールバック関数

******************************************************************************/
static void bulk_rx2(uchar *buf, ulong size)
{
	/*
	** 受信データがあり，送信待ちデータが無い場合
	*/
	if (size > 0)
	{
		uchar *tmp;
		recv_cnt2 +=  size;

		if(recv_cnt2 > 0 && (send_cnt2 == 0))
		{
			send_cnt2 = recv_cnt2;
			tmp = buf_tx2;
			buf_tx2 = buf_rx2;
			buf_rx2 = tmp;
			usbp_tx_data(buf_tx2, EP_TX2, send_cnt2);
			usbp_rx_data(buf_rx2, EP_RX2, 64);
			recv_cnt2 = 0;
#if defined(USBP_DEBUG_PRINT)
			sio_printf("Data Transfer Request.(@RX Call Back2)\t");
			sio_printf("send_cnt = %08X\n",send_cnt2);
#endif
			return;
		}
		else
		{
			/*
			** 受信データがバッファサイズを超えない様に
			*/
			if ((uint)(buf-buf_rx2)+size+64 > BULKBUF_SIZE)
			{
				usbp_rx_data(buf_rx2, EP_RX2, 64);
				/* 以前に受信したデータは消失します */
			}
			else
			{
				usbp_rx_data((buf + size), EP_RX2, 64);
			}
		}
	}
}


/*******************************************************************************
	Routine Name:	bulk_tx2
	Form:			static void bulk_tx2(uchar *buf, ulong size)
	Parameters:		unsigned char *buf - バッファポインタ
					unsigned long size - サイズ
	Return value:	無し
	Description:	BULK IN Endpoint用コールバック関数

******************************************************************************/
static void bulk_tx2(uchar *buf, ulong size)
{
	uchar *tmp;

	send_cnt2 = 0;	/* 送信データ数クリア */

	if(recv_cnt2 > 0)
	{
		send_cnt2 = recv_cnt2;

		tmp = buf_tx2;
		buf_tx2 = buf_rx2;
		buf_rx2 = tmp;

		usbp_tx_data(buf_tx2, EP_TX2, send_cnt2);
		usbp_rx_data(buf_rx2, EP_RX2, 64);

		recv_cnt2 = 0;
#if defined(USBP_DEBUG_PRINT)
			sio_printf("Data Transfer Request.(@TX Call Back2)\t");
			sio_printf("send_cnt = %08X\n",send_cnt2);
#endif
	}

}

/*******************************************************************************
	Routine Name:	interrup_tx
	Form:			static void interrup_tx(uchar *buf, ulong size)
	Parameters:		unsigned char *buf - バッファポインタ
					unsigned long size - サイズ
	Return value:	無し
	Description:	BULK IN Endpoint用コールバック関数

******************************************************************************/

static void interrup_tx(uchar *buf, ulong size)
{
	int i;
	uchar tmp = buf_int[0];

	for(i=0; i<(INT_BUFFER_SIZE-1); i++)
	{
		buf_int[i] = buf_int[i+1];
	}
	buf_int[i] = tmp;
	usbp_tx_data(buf_int, EP_INT, EPINT_PLD);		/* 送信準備 */
#if defined(USBP_DEBUG_PRINT)
			sio_printf("EP_INT\n");
#endif
}


/* End of file */
