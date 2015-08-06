/*******************************************************************************
    usbp_trans.c
    JOB60842サンプルプログラム 
    データ送受信処理

    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/
#define USBPMAIN
#include"config.h"
#include"usbp.h"
#include"usbp_class.h"

#if defined(PERI_TEST)
#include "usbp_test.h"
#endif /*defined(PERI_TEST)*/

/***********************************************************
 DMA 転送機能を有効にする。
***********************************************************/
#if 0
#define USBP_DMA_ENABLE
#define DMA_ENABLE_TX 1
#define DMA_ENABLE_RX 0
#endif
/***********************************************************
 DMAチャネルは１チャンネルのみ有効です。
 このため、送信か受信のエンドポイントのどちらか一方を
 DMAに指定してください。
***********************************************************/

void usbp_Execute_Request(Device_Request *device_request);

static void read_fifo(ulong *fifo, uchar *buf, uint cnt);
static void write_fifo(ulong *fifo, uchar *buf, uint cnt);

#if defined(USBP_DMA_ENABLE)
static void dma_write_fifo(ulong *fifo, uchar *buf, uint cnt);
static void dma_read_fifo(ulong *fifo, uchar *buf, uint cnt);
#endif /* defined(USBP_DMA_ENABLE) */


/*******************************************************************************
	Routine Name:	usbp_Decode_Request
	Form:			void usbp_Decode_Request(void)
	Parameters:		なし
	Return value:	なし
	Description:	USB Device Requests (8byte) 受信 デコード処理 
******************************************************************************/

void usbp_Decode_Request(void)
{
	/*------------------------------------------------------------
	   EP0送受信割込み禁止                                        
	       コントロールデータ転送中に，新たなセットアップがはじ   
	       まった場合，割込み許可になっている可能性があるため     
	------------------------------------------------------------*/
	DIS_EP0TXRX_PKTRDY_INT();

	/*------------------------------------------------------------
	   デバイスリクエスト(8Byte)を読み込む                        
	------------------------------------------------------------*/
	device_request.bmRequestType = GET_bmRequestType();
	device_request.bRequest      = GET_bRequest();
	device_request.wValue        = GET_wValue();
	device_request.wIndex        = GET_wIndex();
	device_request.wLength       = GET_wLength();

	/*------------------------------------------------------------
	   リクエスト情報を読み込んだので setup_rdy のリセット        
	------------------------------------------------------------*/
	CLR_SETUPRDY();

	/*------------------------------------------------------------
	   送受信カウンタ初期化                                       
	------------------------------------------------------------*/
	epV[EP0RX].transferred_size = 0;	/* 受信データ総数 */
	epV[EP0RX].demand_size  = 0;		/* 受信要求データ数 */
	epV[EP0TX].transferred_size = 0;	/* 送信データ総数 */
	epV[EP0TX].demand_size  = 0;		/* 送信要求データ数 */

	if (device_request.wLength == 0x00)
	{	/* Control No-Data Transfer */
		/*------------------------------------------------------------
		   ホスト・デバイス間でデータの送受信なし                     
		------------------------------------------------------------*/
		usbp_Execute_Request(&device_request);			/* Device Request 処理 */

		if((device_request.bmRequestType & DEVICE_to_HOST) != DEVICE_to_HOST)
		{
			SET_PKTRDY(EP0TX);			/* EP0送信パケットレディセット */
			ENA_EP0TX_PKTRDY_INT();		/* EP0送信パケットレディ割込み許可 */
		}
		else
		{
			/*	転送方向がDEVICE_to_HOSTでデータステージ無しの場合に対応 */
			/* EP0のロック解除処理 */
			CLR_PKTRDY(EP0RX);			/* 受信パケットレディリセット */
		}

	} 

	else if (device_request.bmRequestType & DEVICE_to_HOST)
	{	/* Control Read Transfer */
		/*------------------------------------------------------------
		   ホストにデータを送る場合はデータを作成して，送信パケット   
		   レディ割込み許可                                           
		------------------------------------------------------------*/
		usbp_Execute_Request(&device_request);		/* Device Request 処理 */

		ENA_EP0TX_PKTRDY_INT();			/* EP0送信パケットレディ割込み許可 */

		/*------------------------------------------------------------
		   データ転送中にステータスステージに移行したときのために受   
		   信パケットレディビットをクリア                             
		  ----------------------------------------------------------  
		   ステータスステージでコマンド実行を行うリクエストの場合，   
		   ここで受信パケットレディのクリアを行うことは非常に危険で   
	       す．ここでクリアすることによってステータスステージ終了確   
		   認のためのOUTトークンに対して，無条件でACKを返答します．   
		    (本来ステータスステージが終了していない場合はNAKを返答)   
		  ----------------------------------------------------------  
		   ステータスステージでコマンド実行を伴うリクエストがある場   
		   合は，ポーリングなどによりEP0ステータスレジスタのD4:3を    
		   監視し，ステータスステージに移行確認後，パケットレディを   
		   クリアする必要があります．                                 
		------------------------------------------------------------*/
		CLR_PKTRDY(EP0RX);

	} 

	else	/* HOST to DEVICE */
	{	/* Control Write Transfer */
		/*------------------------------------------------------------
		   ホストからデータを受信するために受信パケットレディ割込み   
		   許可                                                       
		------------------------------------------------------------*/
		ENA_EP0RX_PKTRDY_INT();
	}
#if defined(USBP_DEBUG_PRINT)
#if defined(PERI_TEST)
			reg_print(INTENBL);
#endif /*defined(PERI_TEST)*/
#endif
}

/*******************************************************************************
	Routine Name:	usbp_Execute_Request
	Form:			void usbp_Execute_Request(void)
	Parameters:		なし
	Return value:	なし
	Description:	USB Device Requests (8byte) 受信 デコード処理 
******************************************************************************/
void usbp_Execute_Request(Device_Request *device_request)
{
	bmRequestType type;
	uchar *buf;
	type = (bmRequestType)(device_request->bmRequestType & REQUEST_TYPE);
	buf = epV[EP0RX].buf;

#if defined(USBP_DEBUG_PRINT)
	sio_printf("%02X ",device_request->bmRequestType);
	sio_printf("%02X ",device_request->bRequest);
	sio_printf("%04X ",device_request->wValue);
	sio_printf("%04X ",device_request->wIndex);
	sio_printf("%04X\t",device_request->wLength);
#endif

	switch (type)
	{
	case STANDARD_TYPE:
		switch (device_request->bRequest)
		{
		case CLEAR_FEATURE:
			usbp_func_Clear_Feature(device_request, buf);
#if defined(USBP_DEBUG_PRINT)
			sio_printf("CLEAR_FEATURE.\n");
#endif
			break;
		case GET_CONFIGURATION:
			usbp_func_Get_Configuration(device_request, buf);
#if defined(USBP_DEBUG_PRINT)
			sio_printf("GET_CONFIGURATION.\n");
#endif
			break;
		case GET_DESCRIPTOR:
			usbp_func_Get_Descriptor(device_request, buf);
#if defined(USBP_DEBUG_PRINT)
			sio_printf("GET_DESCRIPTOR.\n");
#endif
			break;
		case GET_INTERFACE:
			usbp_func_Get_Interface(device_request, buf);
#if defined(USBP_DEBUG_PRINT)
			sio_printf("GET_INTERFACE.\n");
#endif
			break;
		case GET_STATUS:
			usbp_func_Get_Status(device_request, buf);
#if defined(USBP_DEBUG_PRINT)
			sio_printf("GET_STATUS.\n");
#endif
			break;
		case SET_ADDRESS:
			usbp_func_Set_Address(device_request, buf);
#if defined(USBP_DEBUG_PRINT)
			sio_printf("SET_ADDRESS.\n");
#endif
			break;
		case SET_CONFIGURATION:
			usbp_func_Set_Configuration(device_request, buf);
#if defined(USBP_DEBUG_PRINT)
			sio_printf("SET_CONFIGURATION.\n");
#endif
			break;
		case SET_DESCRIPTOR:
			usbp_func_Set_Descriptor(device_request, buf);
#if defined(USBP_DEBUG_PRINT)
			sio_printf("SET_DESCRIPTOR.\n");
#endif
			break;
		case SET_FEATURE:
			usbp_func_Set_Feature(device_request, buf);
#if defined(USBP_DEBUG_PRINT)
			sio_printf("SET_FEATURE.\n");
#endif
			break;
		case SET_INTERFACE:
			usbp_func_Set_Interface(device_request, buf);
#if defined(USBP_DEBUG_PRINT)
			sio_printf("SET_INTERFACE.\n");
#if defined(PERI_TEST)
			reg_print(INTENBL);
#endif /*defined(PERI_TEST)*/
#endif
			break;
		case SYNCH_FRAME:
			usbp_func_Synch_Frame(device_request, buf);
#if defined(USBP_DEBUG_PRINT)
			sio_printf("SYNCH_FRAME.\n");
#if defined(PERI_TEST)
			reg_print(INTENBL);
#endif /*defined(PERI_TEST)*/
#endif
			break;
		default:
			/* STALL 処理*/
			usbp_func_stall();
#if defined(USBP_DEBUG_PRINT)
			sio_printf("STALL.\n");
#endif
			break;
		}
		break;
	case VENDOR_TYPE:
		/*
		 * bmRequestType の D6..5 が Vendor を指定する場合の処理を行う．
		 */
		usbp_vendor_func();
#if defined(USBP_DEBUG_PRINT)
			sio_printf("VENDOR.\n");
#endif
		break;
	case CLASS_TYPE:
		/*
		 * bmRequestType の D6..5 が Class を指定する場合の処理を行う．
		 */
		usbp_class_func();
#if defined(USBP_DEBUG_PRINT)
			sio_printf("CLASS.\n");
#endif
		break;
	default:
		/* STALL 処理 */
		SET_STALL_EP0();	/* STALL */
		break;
	}
}


/*
 ---------------------------------------------------------------------------
   受信データ読み込み処理                                                   
 ---------------------------------------------------------------------------
 */
/*******************************************************************************
	Routine Name:	read_FIFO
	Form:			void read_FIFO(void)
	Parameters:		無し
	Return value:	無し
	Description:	FIFO READ 処理関数
******************************************************************************/
void read_FIFO(char ep)
{
	ulong *fifo;
	uchar *buf;
	ushort cnt;
	ushort payload;
	
	if((ep != EP4) && (ep != EP5))
		cnt = GET_RECV_BYTE(ep);					/* 受信データ数 */
	else
		cnt = GET_RECV_BYTE_EP4or5(ep);					/* 受信データ数 */

	/*------------------------------------------------------------
	   FIFOからデータの読込み                                     
	------------------------------------------------------------*/
	buf  = epV[ep].buf + epV[ep].transferred_size;		/* 受信バッファのポインタ移動 */
	fifo = GET_RFIFO_ADRS_EPn(ep);
	epV[ep].transferred_size += (uint)cnt;				/* 受信データ総数 */
#if defined(USBP_DMA_ENABLE)
#if DMA_ENABLE_RX 
	if(ep == EP_RX)
	{
		SET_DMA_CONT0_EP(ep);
		SET_DMA_CONT0_ENABLE();
		dma_read_fifo(fifo, buf, (uint)cnt);
		DIS_DMA_CONT0_ENABLE();
	}
	else
#endif
#endif /* defined(USBP_DMA_ENABLE) */
	{
		read_fifo(fifo, buf, (uint)cnt);
		
		/*------------------------------------------------------------
		   受信パケットレディリセット                                 
		------------------------------------------------------------*/
		CLR_PKTRDY(ep);								/* 受信パケットレディリセット */
	}
	
	if(ep == EP0RX)
	{
		/*------------------------------------------------------------
		   Control転送全データ受信                                    
		------------------------------------------------------------*/
		if (device_request.wLength != 0 &&
			epV[EP0RX].transferred_size == device_request.wLength)
		{
			usbp_Execute_Request(&device_request);		/* Device Request デコード処理 */
			SET_PKTRDY(EP0TX);				/* 送信パケットレディセット */
			DIS_EP0RX_PKTRDY_INT();			/* EP0 受信パケットレディ割込み禁止 */
		}
	}
	else
	{
		if((ep != EP4) && (ep != EP5))
			payload = GET_PAYLOAD_EPn(ep);					/* 受信ペイロード数 */
		else
			payload = GET_PAYLOAD_EP4or5(ep);				/* 受信ペイロード数 */
		if(cnt == payload)
		{
			if(epV[ep].transferred_size >= epV[ep].demand_size)
			{
				/* 転送が終了した。 */
				epV[ep].demand_size = 0;
				DIS_PKTRDY_INT(ep);
				(*epV[ep].callback)(buf, epV[ep].transferred_size);	/* 受信情報通知 */
			}
		}
		else
		{
			/* 転送が終了した。 ショートパケット受信のため */
			epV[ep].demand_size = 0;
			DIS_PKTRDY_INT(ep);
			(*epV[ep].callback)(buf, epV[ep].transferred_size);	/* 受信情報通知 */
		}
	}
}

/*
 ---------------------------------------------------------------------------
   送信データ書き込み処理                                                   
 ---------------------------------------------------------------------------
 */
/*******************************************************************************
	Routine Name:	write_FIFO
	Form:			void write_FIFO(void)
	Parameters:		無し
	Return value:	無し
	Description:	FIFO WRITE 処理関数
******************************************************************************/
void write_FIFO(char ep)
{
	uint payload;
	uchar *buf;
	ulong *fifo;
	uint txsize;

	/*------------------------------------------------------------
	   送信データをFIFOに書く                       
	------------------------------------------------------------*/
	if (epV[ep].demand_size > epV[ep].transferred_size)
	{
		if( (ep!=EP4) && (ep!=EP5))
			payload	  = GET_PAYLOAD_EPn(ep);
		else
			payload	  = GET_PAYLOAD_EP4or5(ep);
		buf       = epV[ep].buf + epV[ep].transferred_size;
		fifo      = GET_WFIFO_ADRS_EPn(ep);
		
		txsize = epV[ep].demand_size - epV[ep].transferred_size;
		
#if defined(USBP_DMA_ENABLE)
#if DMA_ENABLE_TX
		if(ep == EP_TX)
		{
			SET_DMA_CONT0_EP(ep);
			SET_DMA_CONT0_ENABLE();
			if (txsize > payload)
			{
				/* ペイロードサイズチェック */
				SET_EPn_TXCNT(ep, payload);				/* 送信データバイト数設定 */
				dma_write_fifo(fifo, buf, payload);	
				epV[ep].transferred_size += payload;
			}
			else
			{
				SET_EPn_TXCNT(ep, txsize);	/* 送信データバイト数設定 */
				dma_write_fifo(fifo, buf, txsize);
				epV[ep].transferred_size += txsize;
			}
			DIS_DMA_CONT0_ENABLE();
		}
		else
#endif
#endif /* defined(USBP_DMA_ENABLE) */
		{
			if (txsize > payload)
			{
				/* ペイロードサイズチェック */
				SET_EPn_TXCNT(ep, payload);				/* 送信データバイト数設定 */
				write_fifo(fifo, buf, payload);	
	
				epV[ep].transferred_size += payload;
			}
			else
			{
				SET_EPn_TXCNT(ep, txsize);	/* 送信データバイト数設定 */
				write_fifo(fifo, buf, txsize);
	
				epV[ep].transferred_size += txsize;
			}
	
			/*------------------------------------------------------------
				送信パケットレディセット                                   
			------------------------------------------------------------*/
			SET_PKTRDY(ep);	/* 送信パケットレディセット */
		}
	}

	else
	{
		if(ep != EP0TX)
		{
			/* 全データ送信後の送信パケットレディ割込み禁止 */
			DIS_PKTRDY_INT(ep);
			epV[ep].demand_size = 0;
			(*epV[ep].callback)(epV[ep].buf, epV[ep].transferred_size);	/* 送信終了通知 */
		}
		else
		{
			/*
			 * Set Address Request の例外処理
			 *	Set Address Request のアドレス設定は送信パケットレディの
			 *	リセット後(ACK受信後)に行う
			 */
			if (GET_ADDRESS_DATA() != usb_status.address)
			{
				SET_ADDRESS_DATA(usb_status.address);
				if(usb_status.address == 0)			/* USB Rev.1.1対応 */
				{
					/* アドレス"0"が設定された場合はデフォルト･ステートに戻る */
					CLR_CONFIGBIT_ALL_EPn();		/* すべてのエンドポイントのconfigビットクリア */
					usb_status.configuration = NULL;
					usb_status.dvcstate = DEFAULT_STATE;	/* Device state :DEFAULT */
				}

				else if(usb_status.dvcstate != CONFIGURED_STATE)
				{
					usb_status.dvcstate = ADDRESS_STATE;	/* Device state :ADDRESS */
				}
			}

			/*
				SetFeatureでENDPOINT_HALT指定時の例外処理
				SetFeatureのSTALL設定は送信パケットレディのセット後に行う
			*/
			if(usb_status.stall_req & REQ_STALL)
			{
				usb_status.stall_req &= ~REQ_STALL;
				SET_STALL_EPn(usb_status.stall_req);
			}

			/* 全データ送信後の送信パケットレディ割込み禁止 */
			DIS_EP0TX_PKTRDY_INT();

			/* EP0のロック解除処理 */
			CLR_PKTRDY(EP0RX);				/* 受信パケットレディリセット */

			/* 送信データ数 % Payload = 0 の場合のNULLパケット作成 */
			if (device_request.wLength != 0x00)
			{	/* Control Data Transfer */
				SET_PKTRDY(EP0TX);
			}			
		}
	}
}


/*
 ---------------------------------------------------------------------------
   受信データ読み込み下層処理                                               
 ---------------------------------------------------------------------------
 */
#if defined(USBP_DMA_ENABLE)
int dma_start(int dir, void *device, void *memory, int size);
int dma_stop(int mode);
/*******************************************************************************
	Routine Name:	dma_read_fifo
	Form:			void dma_read_fifo(void)
	Parameters:		無し
	Return value:	無し
	Description:	FIFO DMA READ 処理関数
******************************************************************************/
static void dma_read_fifo(ulong *fifo, uchar *buf, uint cnt)
{
	if((cnt % 2) != 0)
	{
		cnt += 1;
	}
	dma_start(0, fifo, buf, (int)cnt);
	dma_stop(1);
}
#endif /* defined(USBP_DMA_ENABLE) */

/*******************************************************************************
	Routine Name:	read_fifo
	Form:			void read_fifo(void)
	Parameters:		無し
	Return value:	無し
	Description:	FIFO READ 処理関数
******************************************************************************/
static void read_fifo(ulong *fifo, uchar *buf, uint cnt)
{
	ulong *buf_long;
	buf_long = (ulong *)((uint)buf & 0xFFFFFFFC);
	while (cnt > 0)
	{
		/* データをFIFOから読み込み */
		if(cnt == 64)
		{
			*buf_long = *fifo;		/* 32bit */ /*  4 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /*  8 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 12 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 16 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 20 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 24 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 28 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 32 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 36 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 40 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 44 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 48 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 52 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 56 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 60 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 64 */
			buf_long++;
			return;
		}
		if(cnt >= 32)
		{
			*buf_long = *fifo;		/* 32bit */ /*  4 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /*  8 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 12 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 16 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 20 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 24 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 28 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 32 */
			buf_long++;
			cnt = cnt - 32;
		}
		if(cnt >= 16)
		{
			*buf_long = *fifo;		/* 32bit */ /*  4 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /*  8 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 12 */
			buf_long++;
			*buf_long = *fifo;		/* 32bit */ /* 16 */
			buf_long++;
			cnt = cnt - 16;
		}
		if(cnt > 0)
		{
			*buf_long = *fifo;		/* 32bit */
			buf_long++;

			if ( cnt > 3 )
				cnt = cnt - (uint)4;
			else
				cnt = 0;
		}
	}
}


/*
 ---------------------------------------------------------------------------
   送信データ書き込み下層処理                                               
 ---------------------------------------------------------------------------
 */
#if defined(USBP_DMA_ENABLE)

/*******************************************************************************
	Routine Name:	dma_write_fifo
	Form:			void dma_write_fifo(void)
	Parameters:		無し
	Return value:	無し
	Description:	FIFO DMA WRITE 処理関数
******************************************************************************/

static void dma_write_fifo(ulong *fifo, uchar *buf, uint cnt)
{
	if((cnt % 2) != 0)
	{
		cnt += 1;
	}
	dma_start(1, fifo, buf, (int)cnt);
	dma_stop(1);

}
#endif /* defined(USBP_DMA_ENABLE) */

/*******************************************************************************
	Routine Name:	write_fifo
	Form:			void write_fifo(void)
	Parameters:		無し
	Return value:	無し
	Description:	FIFO WRITE 処理関数
******************************************************************************/
static void write_fifo(ulong *fifo, uchar *buf, uint cnt)
{
	ulong *buf_long;
	buf_long = (ulong *)((uint)buf & 0xFFFFFFFC);
	while(cnt > 0)
	{
		/* データをFIFOへ書き込み */
		if(cnt == 64)
		{
			*fifo = *buf_long;		/* 32bit */ /*  4 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /*  8 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 12 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 16 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 20 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 24 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 28 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 32 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 36 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 40 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 44 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 48 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 52 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 56 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 60 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 64 */
			buf_long++;
			cnt -= 64;
		}
		if(cnt >= 32)
		{
			*fifo = *buf_long;		/* 32bit */ /*  4 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /*  8 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 12 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 16 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 20 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 24 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 28 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 32 */
			buf_long++;
			cnt -= 32;
		}
		if(cnt >= 16)
		{
			*fifo = *buf_long;		/* 32bit */ /*  4 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /*  8 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 12 */
			buf_long++;
			*fifo = *buf_long;		/* 32bit */ /* 16 */
			buf_long++;
			cnt -= 16;
		}
		if(cnt > 0)
		{
			*fifo = *buf_long;		/* 32bit */ /*  4 */
			buf_long++;
			
			if ( cnt > 3 )
				cnt = cnt - (uint)4;
			else
				cnt = 0;
		}
	}
}


/* End of file */

