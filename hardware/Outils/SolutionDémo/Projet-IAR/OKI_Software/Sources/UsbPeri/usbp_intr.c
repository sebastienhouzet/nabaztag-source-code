/*******************************************************************************
    usbp_intr.c
    JOB60842サンプルプログラム 
    割込み処理関数
    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/
#include "usbp.h"
#include "ml60842.h"
#include "config.h"

/*****************************************************************************
	外部割り込み処理														 
*****************************************************************************/
/*******************************************************************************
	Routine Name:	usbp_interrupt
	Form:			void usbp_interrupt(void)
	Parameters:		無し
	Return value:	無し
	Description:	USB ペリフェラル割り込み処理
******************************************************************************/
void usbp_interrupt(void)
{
	ushort status;
	int i;
	do{
		status = (ushort)(read_reg32(INTSTAT));

		if (status & B_SOF_INT)
		{	/* SOF割り込みステータス */
			/* SOF割込みステータスクリア */
			CLR_B_SOF_STATE();	/* 要求クリア */
		}

		else if (status & B_EP1PKTRDY_INT)
		{	/* EP1パケットレディ */
			if(CHK_EPn_HOST_TO_DEVICE(EP1) == DEVICE_to_HOST)
			{
				write_FIFO(EP1);
			}
			else
			{
				read_FIFO(EP1);
			}
		}

		else if (status & B_EP2PKTRDY_INT)
		{	/* EP2パケットレディ */	
			if(CHK_EPn_HOST_TO_DEVICE(EP2) == DEVICE_to_HOST)
			{
				write_FIFO(EP2);
			}
			else
			{
				read_FIFO(EP2);
			}
		}

		else if (status & B_EP3PKTRDY_INT)
		{	/* EP3パケットレディ */	
			if(CHK_EPn_HOST_TO_DEVICE(EP3) == DEVICE_to_HOST)
			{
				write_FIFO(EP3);
			}
			else
			{
				read_FIFO(EP3);
			}
		}

		else if (status & B_EP4PKTRDY_INT)
		{	/* EP4パケットレディ */	
			if(CHK_EPn_HOST_TO_DEVICE(EP4) == DEVICE_to_HOST)
			{
				write_FIFO(EP4);
			}
			else
			{
				read_FIFO(EP4);
			}
		}

		else if (status & B_EP5PKTRDY_INT)
		{	/* EP5パケットレディ */	
			if(CHK_EPn_HOST_TO_DEVICE(EP5) == DEVICE_to_HOST)
			{
				write_FIFO(EP5);
			}
			else
			{
				read_FIFO(EP5);
			}
		}

		else if (status & B_SETUP_RDY_INT)
		{	/* セットアップレディ */
			usbp_Decode_Request();
		}

		else if (status & B_EP0RXPKTRDY_INT)
		{	/* EP0受信パケットレディ */
			read_FIFO(EP0RX);
		}

		else if (status & B_EP0TXPKTRDY_INT)
		{	/* EP0送信パケットレディ */
			write_FIFO(EP0TX);
		}

		if (status & B_BUS_RESET_INT)
		{	/* USBバスリセット */
			/* USBバスリセットステータスクリア */
			CLR_BUS_RESET_STATE();

			/*------------------------------------------------------------
				各種ステータス変数の初期化								
			------------------------------------------------------------*/
			usb_status.configuration = NULL;
			usb_status.remote_wakeup = 0;
			usb_status.address = 0;
			usb_status.dvcstate = DEFAULT_STATE;	/* Device state :DEFAULT */
			usb_status.stall_req = 0;
			
			/*------------------------------------------------------------
				EP通信データ管理変数の初期化						
			------------------------------------------------------------*/
			for(i = 0; i <= EP_MAX + 1; i++)
			{
				epV[i].transferred_size = 0;	/* 通信データ総数 */
				epV[i].demand_size  = 0;		/* 通信要求データ数 */
			}

			/*------------------------------------------------------------
				USBバスリセット通知											
			------------------------------------------------------------*/
			(*usb_status.reset_assert_callback)();
#if OTG_ENABLE
				/* On The Go コントローラドライバに通知 */
#if defined(PERI_TEST)
/*			usbctrl_otg_request(B_UNCONFIGRATION);*/
#else
			usbctrl_otg_request(B_UNCONFIGRATION);
#endif /* defined(PERI_TEST) */
#endif
#if defined(USBP_DEBUG_PRINT)
			sio_printf("USB BUS RESET ASSERT.\n");
#endif
		}

		else if (status & B_BUS_RESET_DES_INT)
		{	/* USBバスリセット・デアサート */

			/* バスリセット・デアサート時の処理を入れる */
			 CLR_BUS_RESET_DES_STATE();	/* 要求クリア */
			(*usb_status.reset_deassert_callback)();
#if defined(USBP_DEBUG_PRINT)
			sio_printf("USB BUS RESET DEASSERT.\n");
#endif
		}

		else if (status & B_SUSPENDED_STATE_INT)
		{	/* サスペンデッドステート */
			CLR_SUSPENDED_STATE();	/* 要求クリア */
#if OTG_ENABLE
				/* On The Go コントローラドライバに通知 */
#if defined(PERI_TEST)
/*			usbctrl_otg_request(BUS_SUSPENDED);*/
#else
			usbctrl_otg_request(BUS_SUSPENDED);
#endif /* defined(PERI_TEST) */
#endif
#if defined(USBP_DEBUG_PRINT)
			sio_printf("USB BUS SUSPENDED.\n");
#endif
		}

		else if (status & B_AWAKE_INT)
		{	/* デバイスアウェイクステート */
			/* AWAKE処理を入れる */
			CLR_AWAKE_STATE();			/* 要求クリア */
#if defined(USBP_DEBUG_PRINT)
			sio_printf("USB BUS WAKE UP.\n");
#endif
		}

	}while(status);

}

/* End of file */

