/*******************************************************************************
    usbp_api.c
    JOB60842サンプルプログラム 
    API関数

    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/
#include "usbp.h"


/*
 ---------------------------------------------------------------------------
   ダミーコールバック関数                                                   
 ---------------------------------------------------------------------------
 */
static void dummy_cbf(uchar *buf, uint transferred_size);
static void dummy_cbf_reset(void);
void dummy_cbf_for_set_interface(uchar interface, uchar alternate);


/*******************************************************************************
	Routine Name:	usbp_init
	Form:			int usbp_init(void)
	Parameters:		なし
	Return value:	正常時　E_OK
					異常時　E_NG
	Description:	ペリフェラルドライバの初期化を行う
******************************************************************************/
int usbp_init(Device_Desc	*device_desc)
{
#if defined(PERI_TEST)
	PULLUP_OFF();
#endif /*defined(PERI_TEST)*/
	/*------------------------------------------------------------
	   Control Write Transfer 用エンドポイント構造体              
	------------------------------------------------------------*/
	epV[EP0RX].transferred_size	= 0;
	epV[EP0RX].demand_size	= 0;
	epV[EP0RX].buf		= (uchar *)cont_buf;
	epV[EP0RX].callback	= dummy_cbf;
	epV[EP0RX].demand_null	= 0;

	/*------------------------------------------------------------
	   エンドポイント１用構造体                                   
	------------------------------------------------------------*/
	epV[EP1].transferred_size	= 0;
	epV[EP1].demand_size	= 0;
	epV[EP1].buf		= (uchar *)NULL;
	epV[EP1].callback	= dummy_cbf;
	epV[EP1].demand_null	= 0;

	/*------------------------------------------------------------
	   エンドポイント２用構造体                                   
	------------------------------------------------------------*/
	epV[EP2].transferred_size	= 0;
	epV[EP2].demand_size	= 0;
	epV[EP2].buf		= (uchar *)NULL;
	epV[EP2].callback	= dummy_cbf;
	epV[EP2].demand_null	= 0;

	/*------------------------------------------------------------
	   エンドポイント３用構造体 (Interrupt転送専用)               
	------------------------------------------------------------*/
	epV[EP3].transferred_size	= 0;
	epV[EP3].demand_size	= 0;
	epV[EP3].buf		= (uchar *)NULL;
	epV[EP3].callback	= dummy_cbf;
	epV[EP3].demand_null	= 0;

	/*------------------------------------------------------------
	   エンドポイント４用構造体                                   
	------------------------------------------------------------*/
	epV[EP4].transferred_size	= 0;
	epV[EP4].demand_size	= 0;
	epV[EP4].buf		= (uchar *)NULL;
	epV[EP4].callback	= dummy_cbf;
	epV[EP4].demand_null	= 0;

	/*------------------------------------------------------------
	   エンドポイント５用構造体                                   
	------------------------------------------------------------*/
	epV[EP5].transferred_size	= 0;
	epV[EP5].demand_size	= 0;
	epV[EP5].buf		= (uchar *)NULL;
	epV[EP5].callback	= dummy_cbf;
	epV[EP5].demand_null	= 0;

	/*------------------------------------------------------------
	   Control Read Transfer 用エンドポイント構造体               
	------------------------------------------------------------*/
	epV[EP0TX].transferred_size= 0;
	epV[EP0TX].demand_size	= 0;
	epV[EP0TX].buf		= (uchar *)cont_buf;
	epV[EP0TX].callback	= dummy_cbf;
	epV[EP0TX].demand_null	= 0;

	/*------------------------------------------------------------
	   Endpoint0の設定                                            
	------------------------------------------------------------*/
	/* 初期値不定のSTALLビットのクリア */
	CLR_STALL_EP0();

	/*------------------------------------------------------------
	   各種ステータス変数の初期化                                 
	------------------------------------------------------------*/
	usb_status.configuration = NULL;
	usb_status.reset_assert_callback    = dummy_cbf_reset;
	usb_status.reset_deassert_callback  = dummy_cbf_reset;
	usb_status.set_interface_callback   = dummy_cbf_for_set_interface;
	usb_status.remote_wakeup = 0;
	usb_status.address       = 0;
	usb_status.dvcstate      = DEFAULT_STATE; /* Device state: DEFAULT */
	usb_status.stall_req     = 0;

	/*------------------------------------------------------------
       USBデバイス省電設定                                        
	------------------------------------------------------------*/
	#ifdef ENA_PW_DWN_MODE
		ENA_POWER_DOWN();
	#endif
	
	/*------------------------------------------------------------
       USBデバイスディスクリプタの設定                            
	------------------------------------------------------------*/
	device_descriptor = device_desc;
	
	
	/*------------------------------------------------------------
       エンドポイントステータスの設定                            
	------------------------------------------------------------*/
	ep_stat[EP0] = SET;
	
	/*------------------------------------------------------------
	   割込み制御初期化                                           
	       セットアップレディ割込み                               
	       USBバスリセット割込み                                  
	       サスペンデッドステート割込み                           
	------------------------------------------------------------*/
	ENA_SETUP_BUSRES_SUSPEND_INT();
	
#if defined(PERI_TEST)
	/* D+ プルアップ */
	PULLUP_ON();
#endif /*defined(PERI_TEST)*/
	
	return(E_OK);
}


/*******************************************************************************
	Routine Name:	usbp_tx_data
	Form:			int usbp_tx_data(uchar *buf, uchar ep, uint size, long time)
	Parameters:		uchar *buf	送信データが格納されたバッファへのポインタ          
					uchar ep	送信用 Endpoint                                     
					uint size	送信データ数                                        
	Return value:	正常時　E_OK
					異常時　E_NG
	Description:	データバッファのポインタをエンドポイント送信処理ハンドラに、
					設定して、送信パケットレディ割り込みを許可する。
******************************************************************************/
int usbp_tx_data(uchar *buf, uchar ep, uint size)
{
/* 2003_02_04 */
/* データ転送方向とエンドポイント番号を確認する。*/
	if((ep > EP0RX) && (ep <= EP0TX))
	{
		if(ep != EP0TX)
		{
			if(CHK_EPn_HOST_TO_DEVICE(ep) != DEVICE_to_HOST)
			{
				return(E_NG);
			}
		} 
	}
	else
	{
		return(E_NG);
	}
/* 2003_02_04 */
	if (epV[ep].demand_size != 0) return(E_NG);
	epV[ep].buf = buf; /* 送信用バッファポインタ設定 */
	epV[ep].demand_size = size; /* 送信データ数設定 */
	epV[ep].transferred_size = 0; /* 送信データ総数初期化 */
	ENA_PKTRDY_INT(ep); /* 送信パケットレディ割込み許可 */
	return(E_OK);
}


/*******************************************************************************
	Routine Name:	usbp_rx_data
	Form:			int usbp_rx_data(uchar *buf, uchar ep, uint size, long time)
	Parameters:		uchar *buf	受信データを格納するバッファへのポインタ          
					uchar ep	受信用 Endpoint                                     
					uint size	受信データ数                                        
	Return value:	なし
	Description:	データバッファのポインタをエンドポイント受信処理ハンドラに、
					設定して、受信パケットレディ割り込みを許可する。
******************************************************************************/
int usbp_rx_data(uchar *buf, uchar ep, uint size)
{
/* 2003_02_04 */
/* データ転送方向とエンドポイント番号を確認する。*/
	if(ep < EP0TX)
	{
		if(ep != EP0RX)
		{
			if(CHK_EPn_HOST_TO_DEVICE(ep) == DEVICE_to_HOST)
			{
				return(E_NG);
			}
		} 
	}
	else
	{
		return(E_NG);
	}
/* 2003_02_04 */
	epV[ep].buf = buf; /* 受信用バッファポインタ設定 */
	epV[ep].demand_size = size; /* 送信データ数設定 */
	epV[ep].transferred_size = 0; /* 受信データ総数初期化 */
	ENA_PKTRDY_INT(ep); /* 送信パケットレディ割込み許可 */
	return(E_OK);
}


/*******************************************************************************
	Routine Name:	usbp_set_trans_callback
	Form:			ER usbp_set_trans_callback(uchar ep, void (*func)(uchar, uint))
	Parameters:		uchar ep				Endpointの指定
					void (*func)(uchar)	callback関数へのポインタ
	Return value:	常にE_OK
	Description:	データ受信終了時、またはデータ送信準備のためのコールバック関数
					を設定する。
******************************************************************************/
int usbp_set_trans_callback(uchar ep, void (*func)(uchar *buf, ulong transferred_size))
{
/* 2003_02_04 */
/* epが範囲外であった場合 */
	if(ep > EP0TX)
	{
		return(E_OK);
	}
	epV[ep].callback = func;
	return(E_OK);
}


/*******************************************************************************
	Routine Name:	usbp_busreset_assert_callback
	Form:			int usbp_busreset_assert_callback(void *func(void))
	Parameters:		void (*func)(void)	callback関数へのポインタ
	Return value:	正常時　E_OK
	Description:	USBバスリセットアサート要因のためのコールバック関数
					を設定する。
******************************************************************************/
int usbp_busreset_assert_callback(void (*func)(void))
{
	usb_status.reset_assert_callback = func;
	return E_OK;
}



/*******************************************************************************
	Routine Name:	usbp_busreset_deassert_callback
	Form:			int usbp_busreset_deassert_callback(void *func(void))
	Parameters:		void (*func)(void)	callback関数へのポインタ
	Return value:	正常時　E_OK
	Description:	USBバスリセットデアサート要因のためのコールバック関数
					を設定する。
******************************************************************************/
int usbp_busreset_deassert_callback(void (*func)(void))
{
	usb_status.reset_deassert_callback = func;
	return E_OK;

}

/*******************************************************************************
	Routine Name:	usbp_int_enable
	Form:			ER usbp_int_enable(uchar ep)
	Parameters:		uchar ep	Endpoint番号
	Return value:	正常時　E_OK
					異常時　E_NG
	Description:	パケットレディ割り込みを許可する。
******************************************************************************/
int usbp_int_enable(uchar ep)
{
	/* パケットレディ割込み許可 */
	if (ep == EP1 || ep == EP2 || ep == EP3 || ep == EP4 || ep == EP5)
	{
		ENA_PKTRDY_INT(ep);/* 送信パケットレディ割込み許可 */
		return(E_OK);
	}
	else
	{
		return(E_NG);
	}
}

/*******************************************************************************
	Routine Name:	usbp_int_disable
	Form:			ER usbp_int_disable(uchar ep)
	Parameters:		uchar ep	Endpoint番号
	Return value:	正常時　E_OK
					異常時　E_NG
	Description:	パケットレディ割り込みを禁止する。
******************************************************************************/
int usbp_int_disable(uchar ep)
{
	/* パケットレディ割込み許可 */
	if (ep == EP1 || ep == EP2 || ep == EP3 || ep == EP4 || ep == EP5)
	{
		DIS_PKTRDY_INT(ep);/* 送信パケットレディ割込み許可 */
		return(E_OK);
	}
	else
	{
		return(E_NG);
	}
}

/*******************************************************************************
	Routine Name:	usbp_remote_wakeup
	Form:			ER usbp_remote_wakeup(void)
	Parameters:		なし
	Return value:	正常時　E_OK
					異常時　E_NG
	Description:	バス上にリモートウェイクアップ信号を出力する。
******************************************************************************/
int usbp_remote_wakeup(void)
{
	int  status = E_NG;

	if (usb_status.remote_wakeup == SET)
	{
		SET_WAKEUP();
		status = E_OK;
	}

	return(status);
}

/*******************************************************************************
	Routine Name:	usbp_cfg_status
	Form:			ER usbp_cfg_status(Config_Desc **desc)
	Parameters:		Config_Desc **desc　現構成のConfiguration Descriptorへの
					ポインタを格納するためのポインタ
	Return value:	正常時	現在のConfiguration DescriptorのbConfigration Value
					エラー	-1
	Description:	デバイスの構成情報を取得する。
******************************************************************************/
signed char usbp_cfg_status(Config_Desc **desc)
{
	signed char status = -1;
	*desc = usb_status.configuration;
	if (*desc != NULL)
		status = (signed char)((*desc)->bConfigurationValue);
	return status;
}

/*******************************************************************************
	Routine Name:	usbp_alt_status
	Form:			ER usbp_alt_status(uchar interface)
	Parameters:		uchar interface　インターフェース番号
	Return value:	正常時	指定したインターフェースナンバーのAlternateSetting値
					エラー	-1
	Description:	指定したインターフェースナンバーのAlternateSetting値を取得する。
******************************************************************************/
signed char usbp_alt_status(bInterfaceNumber interface)
{
	char i;
	signed char status = -1;

	if (usb_status.configuration != NULL)
	{
		Config_if *p_cfg_if = usb_status.configuration->p_CFG_if;

		for (i=0; i<(usb_status.configuration)->bNumInterfaces; i++)
		{
			if (p_cfg_if->bInterfaceNumber == interface)
			{
				status = (signed char)(p_cfg_if->currentAlternateSetting);
				break;
			}

			p_cfg_if++;
		}
	}
	return status;
}


/*******************************************************************************
	Routine Name:	usbp_exit
	Form:			ER usbp_exit(void)
	Parameters:		なし
	Return value:	正常時　E_OK
					異常時　E_NG
	Description:	USBPドライバを終了する。
******************************************************************************/
int usbp_exit(void)
{
	/* 割り込みを禁止して、ドライバ動作を中止する。*/
	/*------------------------------------------------------------
	   割込み制御初期化                                           
	       セットアップレディ割込みのみ許可する。
			ハードウェアの初期状態                               
	------------------------------------------------------------*/
	write_reg32(INTENBL, (read_reg32(INTENBL) & (B_SETUP_RDY_INT)));
	/*------------------------------------------------------------
	   各種ステータス変数の初期化                                 
	------------------------------------------------------------*/
	usb_status.configuration = NULL;
	usb_status.reset_assert_callback    = dummy_cbf_reset;
	usb_status.reset_deassert_callback  = dummy_cbf_reset;
	usb_status.set_interface_callback   = dummy_cbf_for_set_interface;
	usb_status.remote_wakeup = 0;
	usb_status.address       = 0;
	usb_status.dvcstate      = DEFAULT_STATE; /* Device state: DEFAULT */
	usb_status.stall_req     = 0;
	PULLUP_OFF();
	return E_OK;
}

/*******************************************************************************
	Routine Name:	usbp_set_callback_set_interface
	Form:			ER usbp_set_callback_set_interface(void (*func)( uchar, uchar ))
	Parameters:		void (*func)( uchar, uchar )	callback関数へのポインタ
	Return value:	常にE_OK
	Description:	SetInterfaceによってInterface設定が行なわれたことを
					アプリケーションに通知するための関数を設定する。
******************************************************************************/
int usbp_set_callback_set_interface (void (*func)( uchar, uchar ))
{
	usb_status.set_interface_callback = func;
	return E_OK;
}


/*
 ---------------------------------------------------------------------------
   ダミーコールバック関数                                                   
 ---------------------------------------------------------------------------
 */
static void dummy_cbf(uchar *buf, uint transferred_size){
	;
}

static void dummy_cbf_reset(void)
{
	;
}

void dummy_cbf_for_set_interface(uchar interface, uchar alternate)
{
	;
}


