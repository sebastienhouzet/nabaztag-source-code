/*******************************************************************************
    usbp_main.c
    JOB60842サンプルプログラム 
    ペリフェラルメインプログラム

    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/

#include "usbp.h"
#include "usbp_class.h"
#include "usbp_api.h"
#include "config.h"
#include "ml674000.h"
#include "m674kapi.h"


#if defined(PERI_TEST)
#include "usbp_test.h"
int loop_continue = 1;
#endif /*defined(PERI_TEST)*/

/*******************************************************************************
	Routine Name:	usbperi_init
	Form:			int usbperi_init(void)
	Parameters:		なし
	Return value:	正常時　E_OK
					異常時　E_NG
	Description:	ペリフェラルドライバの初期化を行う
******************************************************************************/
int usbperi_init(void)
{
	int ret = E_OK;
	ret |= usbp_init(&device_descriptor1);
	ret |= usbp_set_callback_set_interface(usbp_bulk_init);
	return ret;
}

#if defined(PERI_TEST_MAIN)
/*******************************************************************************
	Routine Name:	main
	Form:			int main(void)
	Parameters:		なし
	Return value:	常に０
	Description:	テスト用メイン関数
******************************************************************************/
int main(void)
{
	uint loop;
	cpu_init();
	
    /* リトルエンディアン設定 */
    write_reg32(Endian, 0x00000000);

	/*割り込みの初期化*/
	write_reg32(SttTrnsCnt, read_reg32(SttTrnsCnt));
	write_reg32(OTGIntMask, 0x00000000);
	write_reg32(INTENBL, 0);
	write_reg32(HostCtl, B_DMAIRQ_MASK|B_OHCIIRQ_MASK);

	/*ペリフェラル機能に切換え*/
	write_reg32(HostPeriSel, B_PERI_SEL);
	/*ビジー解除待ち*/
	loop=0;
	while(read_reg32(HostPeriSel) & B_OPERATION){
		loop++;
	}
	write_reg32(RstClkCtl, 0x00000000);
	/*ペリフェラル部リセット*/
	write_reg32(RstClkCtl, B_PRST);
	/*ビジー解除待ち*/
	loop=0;
	while(read_reg32(HostPeriSel) & B_OPERATION){
		loop++;
	}
    write_reg32(OTGCtl, (read_reg32(OTGCtl) & ~(B_PDCTLDP | B_PDCTLDM | B_PUCTLDP)) | B_ABSESSVLDENB );

	IRQ_Install(EIRQ3, IRQ_LV_EXUSB, usbp_interrupt);
	usbperi_init();
	
	usbp_main();
	return 0;
}
#endif /*defined(PERI_TEST)*/
/*******************************************************************************
    Routine Name    ：usbp_main
    Form            ：void usbp_main(void);
    Parameters      ：なし
    Return value    ：なし
    Description     ：USBペリフェラルメイン処理
*******************************************************************************/
void usbp_main(void)
{
#if defined(PERI_TEST)
#if defined(USBP_DEBUG_PRINT)
	sio_printf("USBP_DEBUG_PRINT_ENABLE\n");
#endif
	for(;;)
	{
		if(loop_continue == 0)
		{
			break;
		}
	}
#endif
    return;
}

/* End of file */
