/*******************************************************************************
    usbp_request.c
    JOB60842サンプルプログラム 
    標準デバイスリクエスト処理

    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/
#include "usbp.h"
#include "usbp_api.h"

static void usbp_func_Get_Descriptor_String(Device_Request *device_request_pointer, uchar *buf);

/* local macro functions */
/*
	set_buf_EP0TX()
	Control Read転送用バッファにデータをセットするマクロ関数
	送信データがホストからの要求より多い場合に，要求数に合わ
	せてバッファにセットするデータをトランケートする。
*/
#define	set_buf_EP0TX(_dst,_src,_length,_limit)	\
		{						\
			ushort len = 0;\
			len = _length;			\
			if (len > _limit) len = _limit;		\
			while (len--) *_dst++ = *_src++;		\
		}


/*--------------------------------------
      エンドポイント転送方向の確認      
--------------------------------------*/
	/* Get_Statusでrecipientにエンドポイントが指定されたとき
	  USBコンフィグレーションレジスタ内の転送方向と
	  デバイスリクエストwIndex内の転送方向が一致しているか確認する
      ただし、EP0は転送方向のチェックは行わない */
	#define CHK_DIR_WINDEX_AND_CONTROL(ep)\
		(((ep) == EP0) || ((CHK_EPn_HOST_TO_DEVICE(ep)) == \
		(((uchar)device_request_pointer->wIndex) & (DEVICE_to_HOST))))

	/* Set_Interfaceで送信用FIFOクリアを行うために
	  USBコンフィグレーションレジスタ内の転送方向が
	  Device to Hostか確認する */
	#define CHK_DIR_DEVICE_TO_HOST(ep)\
		((CHK_EPn_HOST_TO_DEVICE(ep)) == DEVICE_to_HOST)


/*******************************************************************************
	Routine Name:	usbp_func_Clear_Feature
	Form:			void usbp_func_Clear_Feature(Device_Request *device_request_pointer, uchar *buf)
	Parameters:		Device_Request *device_request_pointer:デバイスリクエストのポインタ
					uchar *buf:バッファへのポインタ
	Return value:	なし
	Description:	wValueで指定されたFeatureをクリアする 
******************************************************************************/
/*
 ---------------------------------------------------------------------------
   Clear Feature                                                            
 ---------------------------------------------------------------------------
   wValueで指定されたFeatureをクリアする                                    
                                                                            
     +--------------------+-----------------------------------------------+ 
      wValue                処理                                            
     +--------------------+-----------------------------------------------+ 
      DEVICE_REMOTE_WAKEUP  Remote Wakeup の状態を保持している変数をリセッ  
                            トする                                          
     +--------------------+-----------------------------------------------+ 
      ENDPOINT_STALL        wIndex で指定された Endpoint Control Register   
                            の STALL bit をクリアする                       
     +--------------------+-----------------------------------------------+ 
                                                                            
   (注)bmRequestTypeが 00000001B (Interface) の場合は処理が未定義のため未実 
       装です                                                               
                                                                            
   デフォルト・ステート:動作未定義なのでアドレス・ステートと同じ処理を行う  
   アドレス・ステート  :インタフェースまたはエンドポイント0以外を           
                        参照した場合はリクエスト・エラーを返す              
   構成済みステート    :リクエストに応じた処理を行う                        
 ---------------------------------------------------------------------------
 */
void usbp_func_Clear_Feature(Device_Request *device_request_pointer, uchar *buf)
{
	bmRequestType recipient = device_request_pointer->bmRequestType & (uchar)REQUEST_RECIPIENT;
	uchar ep = (uchar)(device_request_pointer->wIndex & M_EP_NUM);
	/* リクエスト・エラーチェック */
	if(device_request_pointer->wLength != 0	)	/* S990701 USB Rev.1.1対応 */
	{	/* --- エラー条件 ---
			1.wLength=0でない
		*/
		SET_STALL_EP0();			/* STALL bit ON */
		return;
	}

	switch(usb_status.dvcstate)
	{
		case DEFAULT_STATE:
		case ADDRESS_STATE:
		case CONFIGURED_STATE:
			if((recipient == DEVICE_RECIPIENT) &&/* Device */
			   (device_request_pointer->wValue == DEVICE_REMOTE_WAKEUP))
			{
				usb_status.remote_wakeup = RESET;
			}
			else if(recipient == INTERFACE_RECIPIENT)
			{														/* Interface */
				/* 処理が未定義のため未実装 */

				SET_STALL_EP0();			/* STALL bit ON */
			}
			else if((recipient == ENDPOINT_RECIPIENT) &&	/* Endpoint */
					(device_request_pointer->wValue == ENDPOINT_STALL) &&
					(ep < EP_MAX) && (ep_stat[ep] == SET) &&
					CHK_DIR_WINDEX_AND_CONTROL(ep))
			{	/* EPが範囲内 */
				if((usb_status.dvcstate == CONFIGURED_STATE) ||
						/* USB Rev.1.1対応 */
					 (ep == EP0))
				{/* 現在のデバイス・ステートにおいて、参照エンドポイントは有効 */
					CLR_EPn_FIFO(ep);		/* FIFO クリア */
					CLR_STALL_EPn(ep);		/* STALL bit OFF */
					CLR_TOGL_EPn(ep);		/* トグルビットリセット */
				}
				else
				{	/* アドレス・ステートまたはデフォルト・ステートで
					エンドポイント0以外を参照するリクエストに対してはエラーを返す*/
					SET_STALL_EP0();			/* STALL bit ON */

				}
			}
			else
			{
				SET_STALL_EP0();			/* STALL bit ON */
				
			}
			break;
		default:
			SET_STALL_EP0();			/* STALL bit ON */
			break;
	}
}
/**** Clear_Feature ********************************************************/


/*******************************************************************************
	Routine Name:	usbp_func_Get_Configuration
	Form:			void usbp_func_Get_Configuration(Device_Request *device_request_pointer, uchar *buf)
	Parameters:		なし
	Return value:	なし
	Description:	現在設定されている Configuration Descriptor の bConfigurationValue を返  
					す．設定されていない場合は 0 を返す．
******************************************************************************/
/*
 ---------------------------------------------------------------------------
   Get Configuration                                                        
 ---------------------------------------------------------------------------
   現在設定されている Configuration Descriptor の bConfigurationValue を返  
   す．設定されていない場合は 0 を返す．                                    
                                                                            
   デフォルト・ステート:動作未定義なのでアドレス・ステートと同じ処理を行う  
   アドレス・ステート  : 0 を返す                                           
   構成済みステート    :現在設定されている構成の bConfiguration値を返す     
 ---------------------------------------------------------------------------
 */
void usbp_func_Get_Configuration(Device_Request *device_request_pointer, uchar *buf)
{
	bmRequestType recipient = device_request_pointer->bmRequestType & (uchar)REQUEST_RECIPIENT;
	Config_Desc *p_c_desc = usb_status.configuration;
	/* リクエスト・エラーチェック */
	if((recipient != DEVICE_RECIPIENT) ||
	    (device_request_pointer->wValue != 0) ||			/* S990701 USB Rev.1.1対応 */
		(device_request_pointer->wIndex != 0) ||
		(device_request_pointer->wLength != 1)	||
		(device_request_pointer->bmRequestType & DEVICE_to_HOST) != DEVICE_to_HOST)
	{	/* --- エラー条件 ---
			0.recipient=DEVICEでない
			1.wValue=0でない
			2.wIndex=0でない
			3.wLength=1でない
		*/
		
		SET_STALL_EP0();			/* STALL bit ON */
		return;
	}

	switch(usb_status.dvcstate)
	{
		case DEFAULT_STATE:
		case ADDRESS_STATE:
			*buf = 0;	/* アドレス・ステート時は"0"を返す */
			
			break;
		case CONFIGURED_STATE:
			*buf = p_c_desc->bConfigurationValue;
			
			break;
		default:
			SET_STALL_EP0();			/* STALL bit ON */
			
			return;
	}
	epV[EP0TX].demand_size = 1; /* 送信データ数設定 */

}
/**** Get_Configuration ****************************************************/


/*******************************************************************************
	Routine Name:	usbp_func_Get_Descriptor
	Form:			void usbp_func_Get_Descriptor(Device_Request *device_request_pointer, uchar *buf)
	Parameters:		なし
	Return value:	なし
	Description:	wValueの High Byte(Descriptor Index)で指定された Descriptor の設定を返す
******************************************************************************/
/*
 ---------------------------------------------------------------------------
   Get Descriptor                                                           
 ---------------------------------------------------------------------------
   wValueの High Byte(Descriptor Index)で指定された Descriptor の設定を返す 
                                                                            
     +--------------+-----------------------------------------------------+ 
      wValue          処理                                                  
     +--------------+-----------------------------------------------------+ 
      DEVICE          Device Descriptor を返す                              
     +--------------+-----------------------------------------------------+ 
      CONFIGURATION   Configuration + Interface + Endpoint Descriptor を返  
                      す                                                    
     +--------------+-----------------------------------------------------+ 
      STRING          String Descriptor を返す                              
     +--------------------------------------------------------------------+ 
                                                                            
   デフォルト・ステート:リクエストに応じた処理を行う                        
   アドレス・ステート  :リクエストに応じた処理を行う                        
   構成済みステート    :リクエストに応じた処理を行う                        
 ---------------------------------------------------------------------------
 */
void usbp_func_Get_Descriptor(Device_Request *device_request_pointer, uchar *buf)
{
	uchar *p_desc;
	uchar *buf_p = buf;
	uchar DescriptorType;
	uint tmp = (device_request_pointer->wValue >> 8);
	uchar DescriptorIndex = (uchar)(device_request_pointer->wValue);

	uint num;

	ushort i, j, k, l;
	Device_Desc *p_d_desc;
	Config_Desc *p_c_desc;
	Config_if *p_cfg_if;
	Interface_Desc *p_i_desc;
	Endpoint_Desc *p_e_desc;
#if defined(OTG_ENABLE)
	OTG_Desc *p_otg_desc;
#endif
	bmRequestType recipient = device_request_pointer->bmRequestType & (uchar)REQUEST_RECIPIENT;

	DescriptorType = (uchar)tmp;


	/* リクエスト・エラーチェック */
	if(((device_request_pointer->bmRequestType & DEVICE_to_HOST) != DEVICE_to_HOST)
	|| (recipient != DEVICE_RECIPIENT) )	
	{	/* --- エラー条件 ---
			1.bmRequestの方向が0x80でない
		*/
		SET_STALL_EP0();			/* STALL bit ON */
		return;
	}

	switch (DescriptorType)
	{
	case DEVICE:
		p_desc = (uchar *)device_descriptor;

		set_buf_EP0TX(buf_p			/* dest */
			,p_desc				/* src */
			,device_descriptor->bLength	/* length */
			,device_request_pointer->wLength);		/* length requested */

		if((device_descriptor->bLength) > (device_request_pointer->wLength))
		{
			num =  (device_request_pointer->wLength);
			
		}
		else
		{
			num =  (device_descriptor->bLength);
			
		}



		epV[EP0TX].demand_size = num;

		break;

	case CONFIGURATION:
		{
			p_d_desc = device_descriptor;
			p_c_desc = p_d_desc->p_CFG_desc;

			if (DescriptorIndex >= device_descriptor->bNumConfigurations)
			{
				SET_STALL_EP0();			/* STALL bit ON */
			}
			else
			{
				/* 該当Configuratioin Descriptorまで移動 */
				p_c_desc += DescriptorIndex;

				/* InterfaceDescriptorへのブリッジ */
				p_cfg_if = p_c_desc->p_CFG_if;

				/* Configuration Descriptorの内容をバッファに格納 */
				p_desc = (uchar *)p_c_desc;
				for(i=0; i<p_c_desc->bLength; i++)
				{
					*buf_p++ = *p_desc++;
				}

				/* Configurationが持っているInterface数ループ */
				for(i=0; i<p_c_desc->bNumInterfaces; i++)
				{
					p_i_desc = p_cfg_if->p_IF_desc;

					/* Interface DescriptorがもつAlternateSetting数ループ */
					for(j=0; j<p_cfg_if->bAlternateSetting; j++)
					{
						p_e_desc = p_i_desc->p_EP_desc;

						/* Interface Descriptorの内容をバッファに格納 */
						p_desc = (uchar *)p_i_desc;
						for(k=0; k<p_i_desc->bLength; k++)
						{
							*buf_p++ = *p_desc++;
						}

						/* Interfaceが持っているEndpoint数ループ */
						for(k=0; k<p_i_desc->bNumEndpoints; k++)
						{
							/* Endpoint Descriptorの内容をバッファに格納 */
							p_desc = (uchar *)p_e_desc;
							for(l=0; l<p_e_desc->bLength; l++)
							{
								*buf_p++ = *p_desc++;
							}
							p_e_desc++;
							
						}
						p_i_desc++;
					}
					p_cfg_if++;
				}
/* 
	OTG ディスクリプタは、最後にデータを出すとして実装する。
*/
#if defined(OTG_ENABLE)
				p_cfg_if = p_c_desc->p_CFG_if;
				p_otg_desc = p_cfg_if->p_OTG_desc;
				p_desc = (uchar *)p_otg_desc;
				for(i=0; i< p_otg_desc->bLength; i++)
				{
					*buf_p++ = *p_desc++;
				}
#endif
				/* 送信データがホストからの要求より多い場合に，要求数に合わせる */

				if (p_c_desc->wTotalLength > device_request_pointer->wLength)
				{
					epV[EP0TX].demand_size = device_request_pointer->wLength; /* 送信データ数設定 */

				}
				else
				{
					epV[EP0TX].demand_size = p_c_desc->wTotalLength; /* 送信データ数設定 */

				}
			}
		}
		break;
    case STRING:
        {
			usbp_func_Get_Descriptor_String(device_request_pointer, buf);
        }
		break;

	default:
	
		SET_STALL_EP0();			/* STALL bit ON */
		break;
	}
}
/**** Get_Descriptor *******************************************************/


/*******************************************************************************
	Routine Name:	usbp_func_Get_Interface
	Form:			void usbp_func_Get_Interface(Device_Request *device_request_pointer, uchar *buf)
	Parameters:		なし
	Return value:	なし
	Description:	bInterfaceNumber = wIndex となる Interface Descriptor の中で             
					現在設定されている bAlternateSetting 値を返す
******************************************************************************/
/*
 ---------------------------------------------------------------------------
   Get Interface                                                            
 ---------------------------------------------------------------------------
   bInterfaceNumber = wIndex となる Interface Descriptor の中で             
   現在設定されている bAlternateSetting 値を返す                            
                                                                            
   デフォルト・ステート:動作未定義なのでアドレス・ステートと同じ処理を行う  
   アドレス・ステート  :リクエスト・エラーを返す                            
   構成済みステート    :リクエストに応じた処理を行う                        
 ---------------------------------------------------------------------------
 */
void usbp_func_Get_Interface(Device_Request *device_request_pointer, uchar *buf)
{
	Config_Desc *p_c_desc = usb_status.configuration;
	Config_if   *p_cfg_if = p_c_desc->p_CFG_if;
	uchar i, status;
	bmRequestType recipient = device_request_pointer->bmRequestType & (uchar)REQUEST_RECIPIENT;

	/* リクエスト・エラーチェック */
	if((device_request_pointer->wValue != 0) ||					/* S990701 USB Rev.1.1対応 */
		(device_request_pointer->wLength != 1) 	||
		 (recipient != INTERFACE_RECIPIENT) ||
		 (device_request_pointer->bmRequestType & DEVICE_to_HOST) != DEVICE_to_HOST )

	{	/* --- エラー条件 ---
			1.wValue=0でない
			2.wLength=1でない
		*/
		
		SET_STALL_EP0();			/* STALL bit ON */
		return;
	}

	switch(usb_status.dvcstate)
	{
		case DEFAULT_STATE:
		case ADDRESS_STATE:
			SET_STALL_EP0();		/* 構成済みでないのでリクエストエラー */
			break;

		case CONFIGURED_STATE:
			status = RESET;

			for (i=0; i<p_c_desc->bNumInterfaces; i++)
			{
				if (p_cfg_if->bInterfaceNumber == device_request_pointer->wIndex)
				{
					*buf = p_cfg_if->currentAlternateSetting;
					status = SET;
					
					break;
				}
				p_cfg_if++;
			}

			/* 指定されたInterface Descriptorが存在したかチェック */
			if (status == SET)
			{

				epV[EP0TX].demand_size = 1; /* 送信データ数設定 */	
			}
			else
			{	/* 存在しないのでリクエスト・エラーを返す */
			
				SET_STALL_EP0();			/* STALL bit ON */
			}

			break;

		default:
		
			SET_STALL_EP0();			/* STALL bit ON */
			break;
	}
}
/**** Get_Interface ********************************************************/


/*******************************************************************************
	Routine Name:	usbp_func_Get_Status
	Form:			void usbp_func_Get_Status(Device_Request *device_request_pointer, uchar *buf)
	Parameters:		なし
	Return value:	なし
	Description:	bmRequestTypeで指定された recipiesnt のステータスを返す
******************************************************************************/
/*
 ---------------------------------------------------------------------------
   Get Status                                                               
 ---------------------------------------------------------------------------
   bmRequestTypeで指定された recipiesnt のステータスを返す                  
                                                                            
     +----------+---------------------------------------------------------+ 
      DEVICE      Remote Wakeup の可/不可の状態，電力供給方法を返す         

     +----------+---------------------------------------------------------+ 
      INTERFACE   0 を返す                                                  
     +----------+---------------------------------------------------------+ 
      ENDPOINT    wIndex で指定された Endpoint の STALL 状態を返す          
     +----------+---------------------------------------------------------+ 
                                                                            
   デフォルト・ステート:動作未定義なのでアドレス・ステートと同じ処理を行う  
   アドレス・ステート  :インタフェースまたはエンドポイント0以外を           
                        参照した場合はリクエスト・エラーを返す              
   構成済みステート    :リクエストに応じた処理を行う                        
 ---------------------------------------------------------------------------
 */
void usbp_func_Get_Status(Device_Request *device_request_pointer, uchar *buf)
{
	bmRequestType recipient = (uchar)(device_request_pointer->bmRequestType & REQUEST_RECIPIENT);
	uchar   ep = (uchar)(device_request_pointer->wIndex & M_EP_NUM);
	uchar *buf_p = buf, i;
	Config_Desc *p_c_desc = usb_status.configuration;
	Config_if   *p_cfg_if = p_c_desc->p_CFG_if;

	*buf_p     = 0;
	*(buf_p+1) = 0;

	/* リクエスト・エラーチェック */
	if((device_request_pointer->wValue != 0) ||			/* S990701 USB Rev.1.1対応 */
		(device_request_pointer->wLength != 2)
		|| (device_request_pointer->bmRequestType & DEVICE_to_HOST) != DEVICE_to_HOST)
	{	/* --- エラー条件 ---
			1.wValue=0でない
			2.wLength=2でない
			3.bmRequestTypeの方向が0x80でない
		*/
		
		SET_STALL_EP0();			/* STALL bit ON */
		return;
	}

	switch(usb_status.dvcstate)
	{
		case DEFAULT_STATE:
		case ADDRESS_STATE:
			if(recipient == DEVICE_RECIPIENT ||
				recipient == INTERFACE_RECIPIENT)
			{
				/* 構成済みステート以外でDEVICE､
					INTERFACEが指定されたのでリクエストエラー */
					
				SET_STALL_EP0();
				break;
			}
			if(recipient == ENDPOINT_RECIPIENT && ep != EP0)
			{
				/* EP0以外が指定されているのでリクエストエラー */
				SET_STALL_EP0();
				
				break;
			}
		case CONFIGURED_STATE:

			if (recipient == DEVICE_RECIPIENT)
			{													/* Device */
				p_c_desc = usb_status.configuration;

				if(device_request_pointer->wIndex != 0)			/* S990701 USB Rev.1.1対応 */
				{	/* --- エラー条件 ---
						1.wIndex=0でない
					*/
					
					SET_STALL_EP0();
				}

				/* Self Powered */
				if (p_c_desc->bmAttributes & 0x60)
				{
					*buf_p = 1;
				}
				/* Remote Wakeup */
				*buf_p = *buf_p | (usb_status.remote_wakeup << 1);
			}
			else if (recipient == INTERFACE_RECIPIENT)
			{													/* Interface */
				for (i=0; i<p_c_desc->bNumInterfaces; i++)
				{
					/* 指定された Interface Number をもつ Interface Descriptor を探す */
					if (p_cfg_if->bInterfaceNumber == device_request_pointer->wIndex)
					{
						break;
					}
					p_cfg_if++;
				}
				if(i >= p_c_desc->bNumInterfaces)
				{
					SET_STALL_EP0();			/* STALL bit ON */	/* Rev.1.1対応 */
				}
			}
			else if ((recipient == ENDPOINT_RECIPIENT) ) /* Endpoint */
			{
				if(	ep < EP_MAX && ep_stat[ep] == SET )		/* EPが範囲内 */
				{
					if(	ep == EP0 )
					{	/* 転送方向のチェック */	/* S990621 */
					/*
					  wIndexで指示されたEP Control Registerのストールビットの状態を返す
					*/
						if (CHK_STALL_EPn(ep))
						{
							*buf_p = 1;
						}
					}
					else if(CHK_EPn_HOST_TO_DEVICE(ep) 
					== 	((uchar)(device_request_pointer->wIndex) & DEVICE_to_HOST))
					{
						/*
						  wIndexで指示されたEP Control Registerのストールビットの状態を返す
						*/
						if (CHK_STALL_EPn(ep))
						{
							*buf_p = 1;
						}
					}
					else
					{
						SET_STALL_EP0();			/* STALL bit ON */
					}
				}
				else
				{
						SET_STALL_EP0();			/* STALL bit ON */
						
				}
			}
			else
			{
				SET_STALL_EP0();			/* STALL bit ON */
			}

			epV[EP0TX].demand_size = 2; /* 送信データ数設定 */	
			break;

		default:
			SET_STALL_EP0();			/* STALL bit ON */
			break;
	}
}
/**** Get_Status ***********************************************************/


/*******************************************************************************
	Routine Name:	usbp_func_Set_Address

	Form:			void usbp_func_Set_Address(Device_Request *device_request_pointer, uchar *buf)
	Parameters:		なし
	Return value:	なし
	Description:	wValue で指定されたアドレスを設定する
					アドレス設定は Status Stage の handshake 後に行うため変数に保持する
******************************************************************************/
/*
 ---------------------------------------------------------------------------
   Set Address                                                              
 ---------------------------------------------------------------------------
   wValue で指定されたアドレスを設定する                                    
       アドレス設定は Status Stage の handshake 後に行うため変数に保持する  
                                                                            
   デフォルト・ステート:リクエストに応じた処理を行う                        
   アドレス・ステート  :リクエストに応じた処理を行う                        
   構成済みステート    :動作未定義なのでアドレス変更処理を継続する??????    
 ---------------------------------------------------------------------------
 */
void usbp_func_Set_Address(Device_Request *device_request_pointer, uchar *buf)
{
	bmRequestType recipient = (uchar)(device_request_pointer->bmRequestType & REQUEST_RECIPIENT);
	/* リクエスト・エラーチェック */
	if((device_request_pointer->wIndex != 0) ||		/* S990701 USB Rev.1.1対応 */
		(device_request_pointer->wLength != 0) ||
		(device_request_pointer->wValue > 127)  ||
		 (recipient != DEVICE_RECIPIENT) )
	{	/* --- エラー条件 ---
			1.wIndex=0でない
			2.wLength=0でない
			3.指定アドレス値が127より大きい
		*/
		SET_STALL_EP0();			/* STALL bit ON */
		return;
	}

	switch(usb_status.dvcstate)
	{
		case DEFAULT_STATE:
		case ADDRESS_STATE:
		case CONFIGURED_STATE:
			if (device_request_pointer->wValue < 128)
			{
				if((usb_status.dvcstate != CONFIGURED_STATE) ||
					(device_request_pointer->wValue != 0))
				{
					usb_status.address = (uchar)device_request_pointer->wValue;
					
				}
				else
				{/* 構成済みステート時のアドレス値"0"はエラー */
					SET_STALL_EP0();			/* STALL bit ON */
					
				}
			}
			else
			{
				SET_STALL_EP0();			/* STALL bit ON */
			}
			break;

		default:
		
			SET_STALL_EP0();			/* STALL bit ON */
			break;
	}
}
/**** Set_Address **********************************************************/



/*******************************************************************************
	Routine Name:	usbp_func_Set_Configuration
	Form:			void usbp_func_Set_Configuration(Device_Request *device_request_pointer, uchar *buf)
	Parameters:		なし
	Return value:	なし
	Description:	wValue で指定された bConfigurationValue を持つ Configuration Descriptor  
					の値を用いて設定を行う
******************************************************************************/
/*
 ---------------------------------------------------------------------------
   Set Configuration                                                        
 ---------------------------------------------------------------------------
   wValue で指定された bConfigurationValue を持つ Configuration Descriptor  
   の値を用いて設定を行う                                                   
                                                                            
   デフォルト・ステート:動作未定義なのでリクエスト・エラーを返す            
   アドレス・ステート  :リクエストに応じた処理を行う                        
   構成済みステート    :リクエストに応じた処理を行う                        
 ---------------------------------------------------------------------------
 */
void usbp_func_Set_Configuration(Device_Request *device_request_pointer, uchar *buf)
{
	Config_Desc *p_c_desc = device_descriptor->p_CFG_desc;
	uchar i, status;

	/* リクエスト・エラーチェック */
	if((device_request_pointer->wIndex != 0) ||				/* S990701 USB Rev.1.1対応 */
		(device_request_pointer->wLength != 0) ||
		((device_request_pointer->wValue & 0xff00) != 0) ||
		((device_request_pointer->bmRequestType & DEVICE_to_HOST) == DEVICE_to_HOST))
	{	/* --- エラー条件 ---
			1.wIndex=0でない
			2.wLength=0でない
			3.wValueの上位バイトが=0でない
		*/
		
		SET_STALL_EP0();			/* STALL bit ON */
 		return;
	}

	switch(usb_status.dvcstate)
	{
		case DEFAULT_STATE:
		
			SET_STALL_EP0();			/* STALL bit ON */
			break;

		case ADDRESS_STATE:
		case CONFIGURED_STATE:
			if (device_request_pointer->wValue == 0)
			{	/* アドレス・ステートに移行する */
				/* 未設定状態にするために Configuration Bit OFF */

				CLR_CONFIGBIT_ALL_EPn();		/* すべてのエンドポイントのconfigビットクリア */
				usb_status.configuration = NULL;
				usb_status.dvcstate = ADDRESS_STATE;	/* Device state :ADDRESS */

				/* Endpointの有効状態を無効に変更 */
				for (i=EP1; i<EP_MAX; i++)
					ep_stat[i] = RESET;

				DIS_SOF_INT();							/* SOF割込みを禁止する */
#if OTG_ENABLE
				/* On The Go コントローラドライバに通知 */
				usbctrl_otg_request(B_UNCONFIGRATION);
#endif

			}
			else
			{
				status = RESET;

				for(i=0; i<device_descriptor->bNumConfigurations; i++)
				{
					if(p_c_desc->bConfigurationValue == device_request_pointer->wValue)
					{
						usb_status.configuration = p_c_desc;
						usb_status.dvcstate = CONFIGURED_STATE;	/* Device state :CONFIGURED */

						/* 該当するConfigurationDescriptorのデフォルト設定 */
						device_request_pointer->wValue = 0;
						device_request_pointer->wIndex = 0;
						do {
							usbp_func_Set_Interface(device_request_pointer, buf);  
							device_request_pointer->wIndex++;
						} while (device_request_pointer->wIndex < p_c_desc->bNumInterfaces);
						
						if(CHK_STALL_EPn(EP0))
						{
						/* Set_Interface実行によりEP0がSTALLした場合は構成済みステートに移行しない */

							usb_status.configuration = NULL;
							usb_status.dvcstate = ADDRESS_STATE;	/* Device state :ADDRESS */
						}

						status = SET;

						break;
					}

					p_c_desc++;
				}

				/* 指定されたConfiguration Descriptorが存在したかチェック */
				if (status == RESET)
				{
					SET_STALL_EP0();			/* STALL bit ON */
					
				}
#if OTG_ENABLE
				else
				{
					/* On The Go コントローラドライバに通知 */
					usbctrl_otg_request(B_CONFIGRATION);
					/* SUSPEND 割り込みを有効にする。 */
					ENA_SUSPENDED_INT();
				}
#endif
			}
			break;

		default:
			SET_STALL_EP0();			/* STALL bit ON */
			break;
	}
}
/**** Set_Configuration ****************************************************/



/*******************************************************************************
	Routine Name:	usbp_func_Set_Descriptor
	Form:			void usbp_func_Set_Descriptor(Device_Request *device_request_pointer, uchar *buf)
	Parameters:		なし
	Return value:	なし
	Description:	ホストが Descriptor の設定を追加・変更する
******************************************************************************/
/*
 ---------------------------------------------------------------------------
   Set Descriptor                                                           
 ---------------------------------------------------------------------------
   ホストが Descriptor の設定を追加・変更する                               
                                                                            
   (注)オプションなので未実装です．                                         
 ---------------------------------------------------------------------------
 */
void usbp_func_Set_Descriptor(Device_Request *device_request_pointer, uchar *buf)
{
	/* オプションのため未実装 */
	SET_STALL_EP0();			/* STALL bit ON */
	
}
/**** Set_Descriptor *******************************************************/



/*******************************************************************************
	Routine Name:	usbp_func_Set_Feature
	Form:			void usbp_func_Set_Feature(Device_Request *device_request_pointer, uchar *buf)
	Parameters:		なし
	Return value:	なし
	Description:	wValue で指定された Feature をセットする
******************************************************************************/
/*
 ---------------------------------------------------------------------------
   Set Feature                                                              
 ---------------------------------------------------------------------------
   wValue で指定された Feature をセットする                                 
                                                                            
     +--------------------+-----------------------------------------------+ 
      wValue                処理                                            
     +--------------------+-----------------------------------------------+ 
      DEVICE_REMOTE_WAKEUP  Remote Wakeup の状態を保持している変数をセット  
                            する                                            
     +--------------------+-----------------------------------------------+ 
      ENDPOINT_STALL        wIndex で指定された Endpoint Control Register   
                            の STALL bit をセットする                       
     +--------------------+-----------------------------------------------+ 
                                                                            
   (注)bmRequestTypeが 00000001B (Interface) の場合は処理が未定義のため未実 
       装です                                                               
                                                                            
   デフォルト・ステート:動作未定義なのでアドレス・ステートと同じ処理を行う  
   アドレス・ステート  :インタフェースまたはエンドポイント0以外を           
                        参照した場合はリクエスト・エラーを返す              
   構成済みステート    :リクエストに応じた処理を行う                        
 ---------------------------------------------------------------------------
 */
void usbp_func_Set_Feature(Device_Request *device_request_pointer, uchar *buf)
{
	bmRequestType recipient = (bmRequestType)(device_request_pointer->bmRequestType & REQUEST_RECIPIENT);
	uchar ep = (uchar)(device_request_pointer->wIndex & M_EP_NUM);

	/* リクエスト・エラーチェック */
	if((device_request_pointer->wLength != 0) ||
	((device_request_pointer->bmRequestType & DEVICE_to_HOST) == DEVICE_to_HOST))
	{	/* --- エラー条件 ---
			1.wLength=0でない
		*/
		
		SET_STALL_EP0();			/* STALL bit ON */
		return;
	}

	switch(usb_status.dvcstate)
	{
		case DEFAULT_STATE:
		case ADDRESS_STATE:
		case CONFIGURED_STATE:
			if(recipient == DEVICE_RECIPIENT)
			{														/* Device */
				switch((device_request_pointer -> wValue))
				{
					case DEVICE_REMOTE_WAKEUP:
						usb_status.remote_wakeup = SET;
						break;
#if OTG_ENABLE
					case B_HNP_ENABLE:
						/* On The Go コントローラドライバに通知 */
						usbctrl_otg_request(B_HNP_ENABLE_SET);
						break;
					case A_HNP_SUPPORT:
						/* On The Go コントローラドライバに通知 */
						usbctrl_otg_request(A_HNP_SUPPORT_SET);
						break;
					case A_ALT_HNP_ENABLE:
						/* On The Go コントローラドライバに通知 */
						usbctrl_otg_request(A_ALT_HNP_SUPPORT_SET);
						break;
#endif
					default:
						SET_STALL_EP0();			/* STALL bit ON */
						break;
				}
			}
			else if (recipient == INTERFACE_RECIPIENT)
			{														/* Interface */
				/* 処理が未定義のため未実装 */
				SET_STALL_EP0();			/* STALL bit ON */
				
			}
			else if (recipient == ENDPOINT_RECIPIENT )	/* Endpoint */
			{
				if(	device_request_pointer->wValue == ENDPOINT_STALL)
				{
					if(ep < EP_MAX && ep_stat[ep] == SET)
					{
						if(	CHK_DIR_WINDEX_AND_CONTROL(ep))/* EPが範囲内 */
						{
							if(usb_status.dvcstate == CONFIGURED_STATE || ep == EP0)	
							{	/* 現在のデバイス・ステートにおいて、参照エンドポイントは有効 */
								/* SetFeatureに対するACKをHOSTに返すため、ここではSTALLしない */
								usb_status.stall_req = (uchar)(REQ_STALL | ep);/* STALL要求をセット */
								
							}
							else
							{	/* アドレス・ステートでエンドポイント0以外を参照する
								リクエストに対してはエラーを返す */
								SET_STALL_EP0();			/* STALL bit ON */
								
							}
						}
						else
						{
							SET_STALL_EP0();			/* STALL bit ON */
							
						}
					}
					else
					{
						SET_STALL_EP0();			/* STALL bit ON */
						
					}
				}
				else
				{
					SET_STALL_EP0();			/* STALL bit ON */
					
				}
			}
			else
			{
				SET_STALL_EP0();			/* STALL bit ON */
				
			}
			break;

		default:
			
			SET_STALL_EP0();			/* STALL bit ON */
			break;
	}
}
/**** Set_Feature **********************************************************/



/*******************************************************************************
	Routine Name:	usbp_func_Set_Interface
	Form:			void usbp_func_Set_Interface(Device_Request *device_request_pointer, uchar *buf)
	Parameters:		なし
	Return value:	なし
	Description:	bInterfaceNumber = wIndex となる Interface Descriptor の中で             
					bAlternateSetting = wValue となる Descriptor が保有する Endpoint の設定  
					をする
******************************************************************************/
/*

 ---------------------------------------------------------------------------
   Set Interface                                                            
 ---------------------------------------------------------------------------
   bInterfaceNumber = wIndex となる Interface Descriptor の中で             
   bAlternateSetting = wValue となる Descriptor が保有する Endpoint の設定  
   をする                                                                   
                                                                            
   デフォルト・ステート:動作未定義なのでリクエスト・エラーを返す            
   アドレス・ステート  :リクエスト・エラーを返す                            
   構成済みステート    :リクエストに応じた処理を行う                        
 ---------------------------------------------------------------------------
 */
void usbp_func_Set_Interface(Device_Request *device_request_pointer, uchar *buf)
{
	Config_Desc *p_c_desc = usb_status.configuration;
	Config_if   *p_cfg_if /* = p_c_desc->p_CFG_if */ ;
	uchar i, j, k, status;
	uchar iso_enbl, ep;
	Interface_Desc *p_i_desc, *p_i_desc_configuration = NULL;
	Endpoint_Desc *p_e_desc;

	/* リクエスト・エラーチェック */
	if((device_request_pointer->wLength != 0) ||
	 ((device_request_pointer->bmRequestType & DEVICE_to_HOST) == DEVICE_to_HOST))
	{	/* --- エラー条件 ---
			1.wLength=0でない
		*/
		SET_STALL_EP0();			/* STALL bit ON */
		return;
	}
	p_cfg_if = p_c_desc->p_CFG_if;	/* 構成-IFブリッジを求める */

	status = RESET;

	switch(usb_status.dvcstate)
	{
		case DEFAULT_STATE:
		case ADDRESS_STATE:
			SET_STALL_EP0();	/* 構成済でなければstall */
			break;

		case CONFIGURED_STATE:
			for (i=0; i<p_c_desc->bNumInterfaces; i++)
			{
				/* 指定された Interface Number をもつ Interface Descriptor を探す */
				if (p_cfg_if->bInterfaceNumber == device_request_pointer->wIndex)
				{
					p_i_desc = p_cfg_if->p_IF_desc;
					for (j=0; j<p_cfg_if->bAlternateSetting; j++)
					{
						/* 指定された AlternateSetting 値をもつ Descriptor を探す */
						if (p_i_desc->bAlternateSetting == device_request_pointer->wValue)
						{
							status = SET;
							p_i_desc_configuration = p_i_desc;
							break;
						}
						p_i_desc++;
					}
					p_i_desc = p_cfg_if->p_IF_desc;
					
					/* Interface Descriptorが持つ全EPのCONFIGURATION BIT OFF */
					if(status == SET)
					{
						for (j=0; j<p_cfg_if->bAlternateSetting; j++)
						{
							p_e_desc = p_i_desc->p_EP_desc;

							/* Endpointの検索 */
							for (k=0; k<p_i_desc->bNumEndpoints; k++)
							{
								ep = (uchar)((p_e_desc->bEndpointAddress) & M_EP_NUM);
								/* CONFIGURATION BIT OFF */
								CLR_CONFIGBIT_EPn(ep);
								/* Endpointの設定 */
								ep_stat[k] = RESET;	/* S990723 */
								p_e_desc++;
							}
							p_i_desc++;
						}

						p_e_desc = p_i_desc_configuration->p_EP_desc;
						p_cfg_if->currentAlternateSetting = (uchar)(device_request_pointer->wValue);
						iso_enbl = RESET;	/* ISOエンドポイント検出用変数初期化 */
						for (k=0; k<p_i_desc_configuration->bNumEndpoints; k++)
						{
							ep = (uchar)((p_e_desc->bEndpointAddress) & M_EP_NUM);
							/* 転送方向の設定 & CONFIGURATION BIT ON & STALL ビット初期化 */
							SETINIT_CONFIGBIT_EPn(ep);
							/* ペイロードサイズ設定 */
							SET_PAYLOAD_EPn(ep, p_e_desc->wMaxPacketSize);
							/* データシーケンストグル・ビットの初期化 */
							CLR_TOGL_EPn(ep);
							if(CHK_DIR_DEVICE_TO_HOST(ep))
							{ /* エンドポイント転送方向がDevice to Hostかチェック */
								/* 送信用EPのFIFOクリア */
								CLR_EPn_FIFO(ep);
							}
							ep_stat[ep] = SET;	/* S990723 */
							if((p_e_desc->bmAttributes&0x03) == ISOCHRONOUS)	/* S990720*/
							{
								iso_enbl = SET;			/* ISO用エンドポイント検出 */
							}			
							p_e_desc++;/* O000427 */
						}

#if (defined(ML60842) || defined(ML60852))
						/* EPモードの設定 */
						if(ep_stat[EP5] == SET)
#if defined(FORCE_5EP_MODE)
							SET_5EP_MODE();				/* 5EP MODE設定 */
#else
							SET_6EP_MODE();				/* 6EP MODE設定 */
#endif
						else
#if defined(FORCE_6EP_MODE)
							SET_6EP_MODE();				/* 6EP MODE設定 */
#else
							SET_5EP_MODE();				/* 5EP MODE設定 */
#endif
#endif /*(defined(ML60842) || defined(ML60852))*/
#if (defined(EP4_ISO_OUT) || defined(EP4_ISO_IN) || defined(EP5_ISO_OUT) || defined(EP5_ISO_IN))	/* S990720 */
						/* エンドポイントにISOが指定されているか確認し
							設定されている場合はSOF割込みを許可する */
						if(iso_enbl == SET)
							ENA_SOF_INT();				/* SOF 割込み許可 */
						else
							DIS_SOF_INT();				/* SOF 割込み禁止 */
#endif
						(*usb_status.set_interface_callback)((p_cfg_if->bInterfaceNumber),(p_i_desc->bAlternateSetting ));
					}
					break;
				}
				p_cfg_if++;
			}

			/* Endpointの設定が終了したかチェック */
			if (status == RESET)
			{
				SET_STALL_EP0();			/* STALL bit ON */
				
			}
			break;

		default:
			SET_STALL_EP0();			/* STALL bit ON */
			
			break;
	}
}
/**** Set_Interface ********************************************************/



/*******************************************************************************
	Routine Name:	usbp_func_Synch_Frame
	Form:			void usbp_func_Synch_Frame(Device_Request *device_request_pointer, uchar *buf)
	Parameters:		なし
	Return value:	なし
	Description:	特定パターンが開始したフレーム番号をホストに返す
******************************************************************************/
/*
 ---------------------------------------------------------------------------
   Synch Frame                                                              
 ---------------------------------------------------------------------------
   特定パターンが開始したフレーム番号をホストに返す                         
 ---------------------------------------------------------------------------
 */
void usbp_func_Synch_Frame(Device_Request *device_request_pointer, uchar *buf)
{
		SET_STALL_EP0();			/* STALL bit ON */
}
/**** Synch_Frame **********************************************************/



/*******************************************************************************
	Routine Name:	usbp_func_Get_Descriptor_String
	Form:			void usbp_func_Get_Descriptor_String(Device_Request *, uchar *)
	Parameters:		Device_Request *device_request
					uchar *buf
	Return value:	なし
	Description:	wValueの High Byte(Descriptor Index)で指定された String 
					Descriptor の設定を返す
******************************************************************************/
static void usbp_func_Get_Descriptor_String(Device_Request *device_request, uchar *buf)
{
	uint i;
	uchar string_length = 0;
	const uchar *pointer;
    uchar DescriptorIndex = (uchar)(device_request->wValue);
	if( DescriptorIndex == 0x00)
	{
	    *buf++ = string_desc[0].bLength;
	    *buf++ = string_desc[0].bDescriptorType;
		pointer = (const uchar *)(string_desc[0].string);
	    for(i = 0; i < string_desc[0].bLength-2; i++)
	    {
			*buf++ = *pointer;
			pointer++;
		}
		
        /* Data will be truncated when the requested data size is less
           than prepared. */
		if ( string_desc[0].bLength> device_request->wLength)
			epV[EP0TX].demand_size = device_request->wLength; /* 送信データ数設定 */
		else
			epV[EP0TX].demand_size = string_desc[0].bLength; /* 送信データ数設定 */
	}
	else
	{
		if((device_request->wIndex) == 0x0409)
		{
			switch( DescriptorIndex )
			{
				case 0x01:
				case 0x02:
				case 0x03:
				case 0x04:
					string_length = *buf++ = string_desc[DescriptorIndex].bLength;
					*buf++ = string_desc[DescriptorIndex].bDescriptorType;
					pointer = (const uchar *)(string_desc[DescriptorIndex].string);
					for(i = 0; i < string_desc[DescriptorIndex].bLength-2 ; i++)
					{
						*buf++ = *pointer;
						pointer++;
					}
 	        		 break;
	        	default:
					SET_STALL_EP0();            /* STALL bit ON */
	    			break;
			}
			if ( string_length> device_request->wLength)
				epV[EP0TX].demand_size = device_request->wLength; /* 送信データ数設定 */
			else
				epV[EP0TX].demand_size = string_length; /* 送信データ数設定 */
		}
		else
		{
			SET_STALL_EP0();            /* STALL bit ON */
		}
	}
}


/*******************************************************************************
	Routine Name:	usbp_func_stall
	Form:			void usbp_func_stall(void)
	Parameters:		なし
	Return value:	なし
	Description:	定義外のリクエストでSTALL処理を行う場合に呼び出す
******************************************************************************/
/*
 ---------------------------------------------------------------------------
   Stall 処理用の関数                                                       
 ---------------------------------------------------------------------------
   定義外のリクエストでSTALL処理を行う場合に呼び出す                        
 ---------------------------------------------------------------------------
 */
void usbp_func_stall(void)
{
		SET_STALL_EP0();			/* STALL bit ON */
}

/* End of file */
