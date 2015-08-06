/*******************************************************************************
    60842mac.h
    JOB60842サンプルプログラム
    ML60842レジスタ制御マクロ定義
    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/
#ifndef _ML60842MAC_H_
#define	_ML60842MAC_H_



/****************************************************************************
                    ML60842用レジスタアクセスのマクロ                        
****************************************************************************/

#include "ml60842.h"


#define write_reg32(_reg_, data) *(volatile unsigned long *)_reg_ = (unsigned long)data
#define read_reg32(_reg_) *(volatile unsigned long *)_reg_


#define EP0STALL_CLR_DATA	0x00		/* EP0 ストールビットクリアデータ */
#define EPnSTALL_CLR_DATA	0x00		/* EPn(n=1~5) ストールビットクリアデータ */

/*--------------------------------
      DMA設定                     
--------------------------------*/

/* デバイスコントローラ部DMA設定 */
	/* DMA転送の対象となるEPの指定 */
	/* 引数にはF_DMA_EP?のマクロ定義を使用 */
	#define SET_DMA_CONT0_EP(ep)\
		if(ep==EP1) {\
			write_reg32(DMA0CON, ((read_reg32(DMA0CON) & 0x05)| F_DMA_EP1) );\
		}\
		else if (ep==EP2) {\
			write_reg32(DMA0CON, ((read_reg32(DMA0CON) & 0x05)| F_DMA_EP2) );\
		}\
		else if (ep==EP4) {\
			write_reg32(DMA0CON, ((read_reg32(DMA0CON) & 0x05)| F_DMA_EP4) );\
		}\
		else if (ep==EP5) {\
			write_reg32(DMA0CON, ((read_reg32(DMA0CON) & 0x05)| F_DMA_EP5) );\
		}\
		
	#define SET_DMA_CONT1_EP(ep)\
		if(ep==EP1) {\
			write_reg32(DMA1CON, ((read_reg32(DMA1CON) & 0x05)| F_DMA_EP1) );\
		}\
		else if (ep==EP2) {\
			write_reg32(DMA1CON, ((read_reg32(DMA1CON) & 0x05)| F_DMA_EP2) );\
		}\
		else if (ep==EP4) {\
			write_reg32(DMA1CON, ((read_reg32(DMA1CON) & 0x05)| F_DMA_EP4) );\
		}\
		else if (ep==EP5) {\
			write_reg32(DMA1CON, ((read_reg32(DMA1CON) & 0x05)| F_DMA_EP5) );\
		}\
		

	/* DMAバイトカウント挿入機能 */
	#define SET_DMA_CONT0_BYTE_CNT()\
		write_reg32(DMA0CON, ((read_reg32(DMA0CON))| B_BYTE_COUNT))
	#define SET_DMA_CONT1_BYTE_CNT()\
		write_reg32(DMA1CON, ((read_reg32(DMA1CON))| B_BYTE_COUNT))
	#define DIS_DMA_CONT0_BYTE_CNT()\
		write_reg32(DMA0CON, ((read_reg32(DMA0CON))& ~B_BYTE_COUNT))
	#define DIS_DMA_CONT1_BYTE_CNT()\
		write_reg32(DMA1CON, ((read_reg32(DMA1CON))& ~B_BYTE_COUNT))

	/* DMAイネーブル */
	#define SET_DMA_CONT0_ENABLE()\
		write_reg32(DMA0CON, ((read_reg32(DMA0CON))| B_DMA_ENABLE))
	#define SET_DMA_CONT1_ENABLE()\
		write_reg32(DMA1CON, ((read_reg32(DMA1CON))| B_DMA_ENABLE))
	#define DIS_DMA_CONT0_ENABLE()\
		write_reg32(DMA0CON, ((read_reg32(DMA0CON))& ~B_DMA_ENABLE))
	#define DIS_DMA_CONT1_ENABLE()\
		write_reg32(DMA1CON, ((read_reg32(DMA1CON))& ~B_DMA_ENABLE))

/*--------------------------------
      送信データバイト数          
--------------------------------*/
	/* 送信データバイト数設定 */
	#define SET_EPn_TXCNT(ep, size)\
		write_reg32((uint)(epC[ep].epntxcnt), size)

	/* 送信データバイト数取得(2バイト) */
	#define GET_EPn_TXCNT(ep)\
		read_reg32((uint)(epC[ep].epntxcnt))

/*----------------------------
      パケットレディ設定      
----------------------------*/
	/* EPn(n=0,1,2,3,4,5)の受信パケットレディリセット
		ep = EP0RX,EP1,EP2,EP3,EP4,EP5 */
	#define CLR_PKTRDY(ep)\
		write_reg32((uint)epC[ep].epnstat, (read_reg32((uint)epC[ep].epnstat) |\
			B_RECV_PKTRDY))

	/* EPn(n=0,1,2,3,4,5)の送信パケットレディセット
		ep = EP0TX,EP1,EP2,EP3,EP4,EP5 */
	#define SET_PKTRDY(ep)\
		write_reg32((uint)epC[ep].epnstat, (read_reg32((uint)epC[ep].epnstat) |\
			B_TRNS_PKTRDY))

	/* 送信パケットレディビット取得 */
	#define GET_PKTRDY(ep)\
		(read_reg32((uint)epC[ep].epnstat) & B_TRNS_PKTRDY)
/*----------------------
      割り込み禁止      
----------------------*/
	/* EP0受信パケットレディ割り込み禁止 */
	#define DIS_EP0RX_PKTRDY_INT()\
		write_reg32(INTENBL, (read_reg32(INTENBL) & (~epC[EP0RX].b_pktrdy_int)))

	/* EP0送信パケットレディ割り込み禁止 */
	#define DIS_EP0TX_PKTRDY_INT()\
		write_reg32(INTENBL, (read_reg32(INTENBL) & (~epC[EP0TX].b_pktrdy_int)))

	/* EP0送受信パケットレディ割り込み禁止 */
	#define DIS_EP0TXRX_PKTRDY_INT()\
	write_reg32(INTENBL, (read_reg32(INTENBL) & (~(epC[EP0TX].b_pktrdy_int | \
								epC[EP0RX].b_pktrdy_int))))

	/* EPn(n=1,2,3,4,5)パケットレディ割り込み禁止
		ep = EP1,EP2,EP3,EP4,EP5 */
	#define DIS_PKTRDY_INT(ep)\
	write_reg32(INTENBL, (read_reg32(INTENBL) & (~(epC[ep].b_pktrdy_int))))

	/* SOF割り込み禁止 */
	#define DIS_SOF_INT()\
	write_reg32(INTENBL, (read_reg32(INTENBL) & (~B_SOF_INT)))

	/* サスペンデッド割り込み禁止 */
	#define DIS_SUSPENDED_INT()\
	write_reg32(INTENBL, ((ulong)(read_reg32(INTENBL)) & (~B_SUSPENDED_STATE_INT)))

/*----------------------
      割り込み許可      
----------------------*/
	/* EP0受信パケットレディ割り込み許可 */
	#define ENA_EP0RX_PKTRDY_INT()\
	write_reg32(INTENBL, (read_reg32(INTENBL) | epC[EP0RX].b_pktrdy_int))

	/* EP0送信パケットレディ割り込み許可 */
	#define ENA_EP0TX_PKTRDY_INT()\
	write_reg32(INTENBL, (read_reg32(INTENBL) | epC[EP0TX].b_pktrdy_int))

	/* EPn(n=1,2,3,4,5)パケットレディ割り込み許可
		ep = EP1,EP2,EP3,EP4,EP5 */
	#define ENA_PKTRDY_INT(ep)\
		write_reg32(INTENBL, (read_reg32(INTENBL) | epC[ep].b_pktrdy_int))

	/* SOF割り込み許可 */
	#define ENA_SOF_INT()\
		write_reg32(INTENBL, (read_reg32(INTENBL) | B_SOF_INT))

	/* USBバスリセット・アサート割り込み許可 */
	#define ENA_BUS_RESET_INT()\
		write_reg32(INTENBL, (read_reg32(INTENBL) | B_BUS_RESET_INT))

	/* USBバスリセット・デアサート割り込み許可 */
	#define ENA_BUS_RESET_DES_INT()\
		write_reg32(INTENBL, (read_reg32(INTENBL) | B_BUS_RESET_DES_INT))

	/* サスペンデッド割り込み許可 */
	#define ENA_SUSPENDED_INT()\
		write_reg32(INTENBL, (read_reg32(INTENBL) | B_SUSPENDED_STATE_INT))

	/* デバイスアウェイクステート割込み許可 */
	#define ENA_AWAKE_INT()\
		write_reg32(INTENBL, (read_reg32(INTENBL) | B_AWAKE_INT))

	/* セットアップレディ,バスリセット,サスペンデッド,
		バスリセットデアサート,アウェイク割り込み許可(初期処理用) */
	#define ENA_SETUP_BUSRES_SUSPEND_INT()\
		write_reg32(INTENBL, (((B_SETUP_RDY_INT | \
		B_BUS_RESET_INT | B_SUSPENDED_STATE_INT | \
		B_BUS_RESET_DES_INT | B_AWAKE_INT))))

/*----------------------------
      割り込み要因クリア      
----------------------------*/
	/* セットアップレディリセット */
	#define CLR_SETUPRDY()\
		write_reg32(EP0RXCNTSTAT, B_EP0_SETUP_RDY)

	/* SOF割込みステータスリセット */
	#define CLR_B_SOF_STATE()\
		write_reg32(INTSTAT, B_SOF_INT)

	/* USBバスリセット・アサート割込みステータスリセット */
	#define CLR_BUS_RESET_STATE()\
		write_reg32(INTSTAT, B_BUS_RESET_INT)

	/* USBバスリセット・デアサート割り込みステータスリセット */
	#define CLR_BUS_RESET_DES_STATE()\
		write_reg32(INTSTAT, B_BUS_RESET_DES_INT)

	/* デバイスサスペンデッドステート割込みステータスリセット */
	#define CLR_SUSPENDED_STATE()\
		write_reg32(INTSTAT, B_SUSPENDED_STATE_INT)

	/* デバイスアェークステート割込みステータスリセット */
	#define CLR_AWAKE_STATE()\
		write_reg32(INTSTAT, B_AWAKE_INT)

/*------------------------------
      割り込み要因チェック      
------------------------------*/
	#define GET_INT_PTN()\
		(read_reg32(INTSTAT))

	/* セットアップレディ */
	#define SETUP_RDY_INT()\
		(read_reg32(INTSTAT) & B_SETUP_RDY_INT)

	/* EP1パケットレディ */
	#define EP1_PKTRDY_INT()\
		(read_reg32(INTSTAT) & B_EP1PKTRDY_INT)

	/* EP2パケットレディ */
	#define EP2_PKTRDY_INT()\
		(read_reg32(INTSTAT) &  B_EP2PKTRDY_INT)

	/* EP3パケットレディ */
	#define EP3_PKTRDY_INT()\
		(read_reg32(INTSTAT) & B_EP3PKTRDY_INT)

	/* EP4パケットレディ */
	#define EP4_PKTRDY_INT()\
		(read_reg32(INTSTAT) & B_EP4PKTRDY_INT)

	/* EP5パケットレディ */
	#define EP5_PKTRDY_INT()\
		(read_reg32(INTSTAT) & B_EP5PKTRDY_INT)

	/* EP0受信パケットレディ */
	#define EP0_RXPKTRDY_INT()\
		(read_reg32(INTSTAT) & B_EP0RXPKTRDY_INT)

	/* EP0送信パケットレディ */
	#define EP0_TXPKTRDY_INT()\
		(read_reg32(INTSTAT) & B_EP0TXPKTRDY_INT)

	/* SOF */
	#define SOF_INT()\
		(read_reg32(INTSTAT) & B_SOF_INT)

	/* USBバスリセットアサート */
	#define USB_BUSRESET_ASS_INT()\
		(read_reg32(INTSTAT) & B_BUS_RESET_INT)

	/* USBバスリセットデアサート */
	#define USB_BUSRESET_DES_INT()\
		(read_reg32(INTSTAT) & B_BUS_RESET_DES_INT)

	/* サスペンデッド */
	#define SUSPENDED_INT()\
		(read_reg32(INTSTAT) & B_SUSPENDED_STATE_INT)

	/* アウェイクステート */
	#define AWAKE_INT()\
		(read_reg32(INTSTAT) &  B_AWAKE_INT)

/*------------------------------------
      リモートウェイクアップ設定      
------------------------------------*/
	/* リモートウェイクアップビットのチェック */
	#define CHK_WAKEUP()\
		(read_reg32(INTSTAT) & B_AWAKE_INT)

	/* リモートウェイクアップビットのセット */
	#define SET_WAKEUP()\
		write_reg32(SYSCON,(ulong)((read_reg32(SYSCON)| B_REMOTE_WAKEUP)& ~B_SOFT_RESET))

/*----------------------
      ストール設定      
----------------------*/
	/* EP0のストールビットのセット */
	#define SET_STALL_EP0()\
		write_reg32((uint)(epC[EP0].epncontrol), B_STALL)

	/* EPn(n=1,2,3,4,5)のストールビットのセット
		ep = EP1,EP2,EP3,EP4,EP5 */
	#define SET_STALL_EPn(ep) \
		write_reg32( ((uint)epC[ep].epncontrol) ,\
		( ((read_reg32((uint)epC[ep].epncontrol)) & 0x08) | B_STALL))

	/* EP0のストールビットのクリア */
	#define CLR_STALL_EP0()\
		write_reg32((uint)epC[EP0].epncontrol,EP0STALL_CLR_DATA)

	/* EPn(n=1,2,3,4,5)のストールビットのクリア
		ep = EP1,EP2,EP3,EP4,EP5 */
	#define CLR_STALL_EPn(ep)\
		write_reg32((uint)epC[ep].epncontrol,(ushort)((read_reg32((uint)(epC[ep].epncontrol)))& (ushort)EPnSTALL_CLR_DATA ))

	/* EPn(n=0,1,2,3,4,5)ストールビットの有無確認
		ep = EP0,EP1,EP2,EP3,EP4,EP5 */
	#define CHK_STALL_EPn(ep)\
		(read_reg32((uint)epC[ep].epncontrol) & B_STALL)

/*--------------------------
      トグルビット設定      
--------------------------*/
	/* EPn(n=0,1,2,3,4,5)のトグルビットのリセット
		ep = EP0,EP1,EP2,EP3,EP4,EP5 */
	#define CLR_TOGL_EPn(ep)\
		write_reg32((uint)epC[ep].epncontrol,\
		((read_reg32((uint)epC[ep].epncontrol) & 0x03) | B_DATA_SEQUENCE))


/*----------------------------------
      コンフィグレーション設定      
----------------------------------*/
	/* EPn(n=1,2,3,4,5)のコンフィグレーションビットセット
		ep = EP1,EP2,EP3,EP4,EP5 */
		#define SET_CONFIGBIT_EPn(ep)\
			write_reg32((uint)epC[ep].epnconfig, \
				(read_reg32((uint)epC[ep].epnconfig)| ((uchar)B_CONFIG) ))

	/* Set Interface時，EPn(n=1,2,3,4,5)のコンフィグレーションビットセット
		転送方向の設定 & CONFIGURATION BIT ON & STALL ビット初期化を行う */
	#define SETINIT_CONFIGBIT_EPn(ep)\
			write_reg32((uint)epC[ep].epnconfig, \
			((read_reg32((uint)epC[ep].epnconfig) & 0xFFFFFF00) |\
			(((p_e_desc->bEndpointAddress & DEVICE_to_HOST)|\
			B_CONFIG | (p_e_desc->bmAttributes & 0x03))\
			)));\
			CLR_STALL_EPn(ep);

	/* EPn(n=1,2,3,4,5)のコンフィグレーションビットリセット
		ep = EP1,EP2,EP3,EP4,EP5 */
		#define CLR_CONFIGBIT_EPn(ep)\
			write_reg32((uint)epC[ep].epnconfig, (read_reg32((uint)epC[ep].epncontrol))\
			 & ((uint)(~B_CONFIG)));

	/* すべてのEPn(n=1,2,3,4,5)のコンフィグレーションビットリセット
		ep = EP1,EP2,EP3,EP4,EP5 */
#define CLR_CONFIGBIT_ALL_EPn()\
			{\
			write_reg32((uint)epC[EP1].epnconfig, (read_reg32((uint)epC[EP1].epnconfig))\
			 & ((uint)(~B_CONFIG)));\
			write_reg32((uint)epC[EP2].epnconfig, (read_reg32((uint)epC[EP2].epnconfig))\
			 & ((uint)(~B_CONFIG)));\
			write_reg32((uint)epC[EP3].epnconfig, (read_reg32((uint)epC[EP3].epnconfig))\
			 & ((uint)(~B_CONFIG)));\
			write_reg32((uint)epC[EP4].epnconfig, (read_reg32((uint)epC[EP4].epnconfig))\
			 & ((uint)(~B_CONFIG)));\
			write_reg32((uint)epC[EP5].epnconfig, (read_reg32((uint)epC[EP5].epnconfig))\
			 & ((uint)(~B_CONFIG)));\
			 }

/*------------------------------
      ペイロードサイズ設定      
------------------------------*/
	/* EPn(n=0,1,2,3,4,5)のペイロードサイズ設定
		ep = EP0RX,EP0TX,EP1,EP2,EP3,EP4,EP5 */

	#define SET_PAYLOAD_EPn(ep, size)\
	{\
		if( (ep!=EP4) && (ep!=EP5))\
		{\
			write_reg32((uint)(epC[ep].epnpayload),	\
			((read_reg32((uint)(epC[ep].epnpayload)) & 0xFF) | (((uint)size<<8)&0xFF00)));\
		}\
		else\
		{\
			write_reg32((uint)(epC[ep].epnpayload),	\
			((read_reg32((uint)(epC[ep].epnpayload)) & 0x0000FFFFul)\
			 | (((uint)size<<16) & 0x0FFF0000ul)));\
		}\
	}\
			

	/* EPn(n=0,1,2,3,4,5)のペイロードサイズ取得
		ep = EP0TX,EP0RX,EP1,EP2,EP3 */
	#define GET_PAYLOAD_EPn(ep)\
		((read_reg32((uint)(epC[ep].epnpayload)))>>8 & 0xFF)

	#define GET_PAYLOAD_EP4or5(ep)\
		(ushort)(((read_reg32((uint)(epC[ep].epnpayload))) >> 16) & 0xFFFF)


/*--------------------------
      転送方向チェック      
--------------------------*/
	/* EPn(n=1,2,3,4,5)の転送方向チェック
		ep = EP1,EP2,EP3,EP4,EP5 */
	#define CHK_EPn_HOST_TO_DEVICE(ep)\
		(uchar)(read_reg32((uint)(epC[ep].epnconfig)) & DEVICE_to_HOST)

/*--------------------
      FIFOクリア      
--------------------*/
	/* EPn(n=1,2,3,4,5)のFIFOレジスタクリア
		ep = EP1,EP2,EP3,EP4,EP5 */
	#define CLR_EPn_FIFO(ep)\
	write_reg32(((uint)epC[ep].epncontrol), B_CLR_FIFO)

/*----------------------
      アドレス設定      
----------------------*/
	/* SET_ADDRESSリクエストによるアドレスをDVCADRレジスタに設定 */
	#define SET_ADDRESS_DATA(address)\
		write_reg32((uint)DVCADR, address)

	/* DVCADRレジスタから設定されているアドレス値を取得 */
	#define GET_ADDRESS_DATA()\
		read_reg32((uint)DVCADR)

/*---------------------------------------
      FIFOレジスタのアドレス取得         
---------------------------------------*/
	/* EPn(n=0,1,2,3,4,5)のライトFIFOレジスタのアドレスを取得
		ep = EP0TX,EP1,EP2,EP3,EP4,EP5 */
	#define GET_WFIFO_ADRS_EPn(ep)\
		epC[ep].fifo_W

	/* EPn(n=0,1,2,3,4,5)のリードFIFOレジスタのアドレスを取得
		ep = EP0RX,EP1,EP2,EP3,EP4,EP5 */
	#define GET_RFIFO_ADRS_EPn(ep)\
		epC[ep].fifo_R


/*--------------------------
      受信バイト数取得      
--------------------------*/
	/* EPn(n=0,1,2,3,4,5)のペイロードサイズ設定
		ep = EP0RX,EP0TX,EP1,EP2,EP3,EP4,EP5 */

	#define GET_RECV_BYTE(ep)\
		(unsigned char)((read_reg32((uint)(epC[ep].recv_byte_cnt)))>>8 & 0xFF)

	#define GET_RECV_BYTE_EP4or5(ep)\
		(ushort)(((read_reg32((uint)(epC[ep].recv_byte_cnt)))>>16) & 0xFFFF)



/*------------------------
      プルアップ制御      
------------------------*/
	#define PULLUP_ON()\
		write_reg32(OTGCtl,(((read_reg32(OTGCtl))| B_PUCTLDP) ))

	/* プルアップOFF */
	#define PULLUP_OFF()\
		write_reg32(OTGCtl,(((read_reg32(OTGCtl))& (~B_PUCTLDP))))



/*--------------------------------
      サスペンド時の省電設定      
--------------------------------*/
	/* サスペンド時に省電にする */
	#define ENA_POWER_DOWN()\
		write_reg32(SYSCON,(((read_reg32(SYSCON))| B_PWDWN_MODE)& ~B_SOFT_RESET))

	/* サスペンド時に省電にしない */
	#define DIS_POWER_DOWN()\
		write_reg32(SYSCON,(((read_reg32(SYSCON))& ~B_PWDWN_MODE)& ~B_SOFT_RESET))

/*------------------------
      EPモードの設定      
------------------------*/
	/* 5EPモードに設定する */
	#define SET_5EP_MODE()\
		write_reg32(SYSCON,(((read_reg32(SYSCON)) | (B_EP_MODE)) &~B_SOFT_RESET))

	/* 6EPモードに設定する */
	#define SET_6EP_MODE()\
		write_reg32(SYSCON,(((read_reg32(SYSCON))& (~B_EP_MODE)) &~B_SOFT_RESET))

/*------------------------------------
      デバイスリクエストの取得      
------------------------------------*/
	#define GET_bmRequestType()		(uchar)(read_reg32(SETUP0W))
	#define GET_bRequest()			(uchar)(read_reg32(SETUP0W) >> 8 & 0x00FF)
	#define GET_wValue()	 		(wValue)(((read_reg32(SETUP0W))>>16) & 0xFFFFul)
	#define GET_wIndex()			(wIndex)(((read_reg32(SETUP2W))))
	#define GET_wLength()			(wLength)(((read_reg32(SETUP2W))>>16) & 0xFFFFul)

/*----------------------------------------------------------
      直前フレームにISO IN転送が存在しているかの確認     
----------------------------------------------------------*/

	#define CHK_ISO_IN_RECVED_EP4() \
		((read_reg32(EP4RXCNTSTAT)  & ISO_IN_RCVED_STS) == ISO_IN_RCVED_STS)
	#define CHK_ISO_IN_RECVED_EP5() \
		((read_reg32(EP5RXCNTSTAT)  & ISO_IN_RCVED_STS) == ISO_IN_RCVED_STS)
	#define SET_ISO_MODE_1_EP4() \
		(write_reg32(ISOMODE,( read_reg32(ISOMODE) & ~(0x10))))
	#define SET_ISO_MODE_2_EP4() \
		(write_reg32(ISOMODE,( read_reg32(ISOMODE) | (0x10))))
	#define SET_ISO_MODE_1_EP5() \
		(write_reg32(ISOMODE,( read_reg32(ISOMODE) & ~(0x20))))
	#define SET_ISO_MODE_2_EP5() \
		(write_reg32(ISOMODE,( read_reg32(ISOMODE) | (0x20))))
	#define CHECK_SET_ISO_MODE_EP4() \
		((read_reg32(ISOMODE) & (0x10)) == 0x10)
	#define CHECK_SET_ISO_MODE_EP5() \
		((read_reg32(ISOMODE) & (0x20)) == 0x20)


/******************************************************************************/
#endif /*_ML60842MAC_H_*/

/* End of file */
