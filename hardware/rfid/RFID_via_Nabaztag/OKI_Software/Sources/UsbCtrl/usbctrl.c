/*******************************************************************************
    usbctrl.c
    JOB60842サンプルプログラム USBコントローラ 制御

    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev.1.00:新規作成
*******************************************************************************/
#include "typedef.h"
#include "config.h"
#include "usbctrl.h"
#include "otg.h"


/*グローバル変数*/
ulong usbctrl_state = 0;

struct _usbctrl_driver_table {
	int (*usb_peri_init)(void);
	void (*usb_peri_interrupt)(void);
	int (*usb_host_init)(void);
	void (*usb_host_interrupt)(void);
}usbctrl_driver_table;

/*プロトタイプ宣言*/


/*******************************************************************************
    Routine Name    ：usbctrl_mode_set
    Form            ：int usbctrl_mode_set(int mode);
    Parameters      ：
    Return value    ：実行結果
    Description     ：USBコントローラ モード設定
*******************************************************************************/
int usbctrl_mode_set(int mode)
{
	int loop;
	int ret;

	if(mode == USB_PERIPHERAL)
	{
		/*ペリフェラル機能に切換え*/
		writel_reg(HostPeriSel, B_PERI_SEL);

		/*ビジー解除待ち*/
		loop=0;
		while(readl_reg(HostPeriSel) & B_OPERATION)
		{
			if(loop++>100) return E_NG;
		}

		writel_reg(RstClkCtl, B_XRUN);
		/*ペリフェラル部リセット*/
		writel_reg(RstClkCtl, B_PRST);

		/*ビジー解除待ち*/
		loop=0;
		while(readl_reg(HostPeriSel) & B_OPERATION)
		{
			if(loop++>100) return E_NG;
		}

		/*プルダウンＯＦＦ、プルアップＯＦＦ*/
		usbctrl_resistance_set(HIGH_Z);

		usbctrl_state = STATE_PERI_ACTV;
		if( usbctrl_driver_table.usb_peri_init != NULL )
		{
			ret = usbctrl_driver_table.usb_peri_init();
			if( ret != 0 )
			{
				return E_NG;
			}
		}

		/*プルダウンＯＦＦ、プルアップＯＮ*/
		usbctrl_resistance_set(PULLUP);

	}
	else if(mode == USB_HOST)
	{
		/*プルダウンＯＮ、プルアップＯＦＦ*/
		usbctrl_resistance_set(PULLDOWN);

		/*ホスト機能に切換え*/
		writel_reg(HostPeriSel, B_HOST_SEL);

		/*ビジー解除待ち*/
		loop=0;
		while(readl_reg(HostPeriSel) & B_OPERATION)
		{
			if(loop++>100) return E_NG;
		}

		if( usbctrl_driver_table.usb_host_init != NULL )
		{
			ret = usbctrl_driver_table.usb_host_init();
			if( ret != 0 )
			{
				return E_NG;
			}
		}
		usbctrl_state = STATE_HOST_ACTV;
	}
	else if(mode == USB_IDLE )
	{
		/*ペリフェラル機能に切換え*/
		writel_reg(HostPeriSel, B_PERI_SEL);

		/*ビジー解除待ち*/
		loop=0;
		while(readl_reg(HostPeriSel) & B_OPERATION)
		{
			if(loop++>100) return E_NG;
		}

		writel_reg(RstClkCtl, B_XRUN);
		/*ペリフェラル部リセット*/
		writel_reg(RstClkCtl, B_PRST);

		/*ビジー解除待ち*/
		loop=0;
		while(readl_reg(HostPeriSel) & B_OPERATION)
		{
			if(loop++>100) return E_NG;
		}

		/*プルダウンＯＦＦ、プルアップＯＦＦ*/
		usbctrl_resistance_set(HIGH_Z);
		writel_reg(INTENBL, 0);
		usbctrl_state = STATE_IDLE;
	}
	else if(mode == USB_OTG_SRP )
	{
		writel_reg( HostCtl, (B_DMAIRQ_MASK | B_OHCIIRQ_MASK) );
		writel_reg(INTENBL, 0);
		usbctrl_state = STATE_OTG_SRP;
	}
	else
	{
		return E_NG;
	}

	return E_OK;
}


/*******************************************************************************
    Routine Name    ：usbctrl_init
    Form            ：int usbctrl_init(int mode);
    Parameters      ：
    Return value    ：
    Description     ：USBコントローラ 初期化
*******************************************************************************/
int usbctrl_init(int mode)
{
	int loop;


	writel_reg(RstClkCtl, B_XRUN);
	/*ML60842リセット*/
	writel_reg(RstClkCtl, B_CRST);

	/*ビジー解除待ち*/
	loop=0;
	while(readl_reg(HostPeriSel) & B_OPERATION)
	{
		if(loop++>100) return E_NG;
	}

    /* リトルエンディアン設定 */
	writel_reg(Endian, B_LITTLEENDIAN);

	/*割り込みの初期化*/
	writel_reg(SttTrnsCnt, readl_reg(SttTrnsCnt));
	writel_reg(OTGIntMask, 0x00000000);
	writel_reg(INTENBL, 0);
	writel_reg(HostCtl, B_DMAIRQ_MASK|B_OHCIIRQ_MASK);

	if( mode == USB_OTG )
	{
		usbctrl_otg_init();
		writel_reg(OTGIntMask, (readl_reg(OTGIntMask) | B_IDSELCHGINT) );
	}
	else if( mode == USB_PERIPHERAL )
	{
		usbctrl_mode_set( USB_PERIPHERAL );
		usbctrl_vbus_thress( VBUS_SESS );
		usbctrl_vbus_set( VBUS_OFF );
	}
	else if( mode == USB_HOST )
	{
		usbctrl_mode_set( USB_HOST );
		usbctrl_vbus_thress( VBUS_NC );
		usbctrl_vbus_set( VBUS_HOSTSET );
	}
	else
	{
		return E_NG;
	}

	return E_OK;
}


/*******************************************************************************
    Routine Name    ：usbctrl_peri_driver_set
    Form            ：void usbctrl_peri_driver_set(int (*initialize)(void),
                                                   void (*interrupt)(void));
    Parameters      ：
    Return value    ：
    Description     ：ペリフェラルドライバ初期化ルーチン、割り込みハンドラ登録
*******************************************************************************/
void usbctrl_peri_driver_set(int (*initialize)(void), void (*interrupt)(void))
{


	usbctrl_driver_table.usb_peri_init = initialize;
	usbctrl_driver_table.usb_peri_interrupt = interrupt;

	return;
}


/*******************************************************************************
    Routine Name    ：usbctrl_host_driver_set
    Form            ：void usbctrl_host_driver_set(int (*initialize)(void),
                                                   void (*interrupt)(void));
    Parameters      ：
    Return value    ：
    Description     ：ペリフェラルドライバ初期化ルーチン、割り込みハンドラ登録
*******************************************************************************/
void usbctrl_host_driver_set(int (*initialize)(void), void (*interrupt)(void))
{


	usbctrl_driver_table.usb_host_init = initialize;
	usbctrl_driver_table.usb_host_interrupt = interrupt;

	return;
}


/*******************************************************************************
    Routine Name    ：usbctrl_id_check
    Form            ：int usbctrl_id_check(void);
    Parameters      ：
    Return value    ：ID端子状態
    Description     ：USBコントローラのID端子状態
*******************************************************************************/
int usbctrl_id_check(void)
{


	return (readl_reg(OTGIntStt) & B_IDSELST) ? TRUE : FALSE;
}


/*******************************************************************************
    Routine Name    ：usbctrl_bus_status
    Form            ：int usbctrl_bus_status(void);
    Parameters      ：
    Return value    ：USBバス状態
    Description     ：USBバスの状態
*******************************************************************************/
int usbctrl_bus_status(void)
{
	uint    bus_status;


	bus_status = readl_reg(OTGIntStt);
	bus_status &= 0x30000000;
    
	if( bus_status == F_SE0 )
	{
		return USB_SE0;
	}
	else if( bus_status == F_KSTATE )
	{
		return USB_K_STATE;
	}
	else if( bus_status == F_JSTATE )
	{
		return USB_J_STATE;
	}

	return USB_SE1;
}


/*******************************************************************************
    Routine Name    ：usbctrl_resistance_set
    Form            ：void usbctrl_resistance_set(int mode);
    Parameters      ：mode          モード指定
    Return value    ：
    Description     ：プルアップ・プルダウンの設定
*******************************************************************************/
void usbctrl_resistance_set(int mode)
{
	uint    otg_ctl;

	otg_ctl = (readl_reg(OTGCtl) & ~(B_PDCTLDP | B_PDCTLDM | B_PUCTLDP));

	if( mode == PULLUP )
	{
		otg_ctl |= B_PUCTLDP;
	}
	else if( mode == PULLDOWN )
	{
		otg_ctl |= (B_PDCTLDM | B_PDCTLDP);
	}
	else if( mode == HIGH_Z )
	{
	}

	writel_reg(OTGCtl, otg_ctl);

	return;
}


/*******************************************************************************
    Routine Name    ：usbctrl_vbus_set
    Form            ：void usbctrl_vbus_set(int mode);
    Parameters      ：mode          モード指定
    Return value    ：
    Description     ：USBコントローラ VBUS制御
*******************************************************************************/
void usbctrl_vbus_set(int mode)
{
	uint    ctl;


	ctl = readl_reg(OTGCtl);
	ctl &= ~(B_DISCHRGVBUS | B_CHRGVBUS | B_DRVVBUS | M_VBUSMODE);

	switch(mode)
	{
	case VBUS_OFF:
		ctl |= V_OFF;
		break;

	case VBUS_ON:
		ctl |= V_ON;
		break;

	case VBUS_CHARGE:
		ctl |= V_CHRG;
		break;

	case VBUS_DISCHARGE:
		ctl |= V_DISCHRG;
		break;

	case VBUS_HOSTSET:
		ctl |= V_HOST;
		break;

	default:
		return;
	}

	writel_reg(OTGCtl, ctl);
}


/*******************************************************************************
    Routine Name    ：usbctrl_vbus_status
    Form            ：int usbctrl_vbus_status(void);
    Parameters      ：
    Return value    ：電圧状態
    Description     ：VBUSステータス
*******************************************************************************/
int usbctrl_vbus_status(void)
{
	uint status;


	status = readl_reg(OTGIntStt);

	/* VBUS=A_VBUS_VALID */
	if( status & B_AVBUSVLDST )
	{
		return 2;
	}
	/* AB_SESS_VALID < VBUS < A_VBUS_VALID */
	else if( status & B_ABSESSVLDST )
	{
		return 1;
	}

	/* VBUS < AB_SESS_VALID */
	return 0;
}


/*******************************************************************************
    Routine Name    ：usbctrl_vbus_thress
    Form            ：void usbctrl_vbus_thress(int mode);
    Parameters      ：検出電圧
    Return value    ：
    Description     ：USBコントローラ VBUS Thresshold 制御
*******************************************************************************/
void usbctrl_vbus_thress(int mode)
{
	uint msk;
	uint ctl;


	msk = readl_reg( OTGIntMask );
	ctl = (readl_reg(OTGCtl) & ~(M_SELSV));

	if( mode == VBUS_RISE )
	{
		/* 設定電圧は、4.0Vに設定 */
		writel_reg( OTGCtl, (ctl | B_AVBUSVLDENB | B_ABSESSVLDENB) );
		writel_reg( OTGIntMask, ((msk | B_AVBUSVLDCHGINT) & ~B_ABSESSVLDCHGINT) );
	}
	else if( mode == VBUS_FALL )
	{
		/* 設定電圧は、4.5Vに設定 */
		ctl |= 0x00000500;
		writel_reg( OTGCtl, (ctl | B_AVBUSVLDENB | B_ABSESSVLDENB) );
		writel_reg( OTGIntMask, ((msk | B_AVBUSVLDCHGINT) & ~B_ABSESSVLDCHGINT) );
	}
	else if( mode == VBUS_SESS )
	{
		writel_reg( OTGCtl, (ctl | B_AVBUSVLDENB | B_ABSESSVLDENB) );
		writel_reg( OTGIntMask, ((msk & ~B_AVBUSVLDCHGINT) | B_ABSESSVLDCHGINT) );
	}
	else if( mode == VBUS_NC )
	{
		writel_reg( OTGCtl, (ctl & ~(B_AVBUSVLDENB| B_ABSESSVLDENB)) );
		writel_reg( OTGIntMask, (msk & ~(B_AVBUSVLDCHGINT | B_ABSESSVLDCHGINT)) );
	}

	return;
}


/*******************************************************************************
    Routine Name    ：usbctrl_se0_det_int
    Form            ：void usbctrl_se0_det_int(void);
    Parameters      ：
    Return value    ：
    Description     ：SE0検出割り込みイネーブル
*******************************************************************************/
void usbctrl_se0_det_int(int sw)
{
	if(sw == ENABLE)
	{
		writel_reg(OTGCtl, readl_reg(OTGCtl) | B_BSE0SRPDETENB);
		writel_reg(OTGIntMask, readl_reg(OTGIntMask) | B_BSE0SRPDETSTINT);
	}
	else
	{
		writel_reg(OTGCtl, readl_reg(OTGCtl) & ~B_BSE0SRPDETENB);
		writel_reg(OTGIntMask, readl_reg(OTGIntMask) & ~B_BSE0SRPDETSTINT);
	}
}


/*******************************************************************************
    Routine Name    ：usbctrl_interrupt
    Form            ：void usbctrl_interrupt(void);
    Parameters      ：
    Return value    ：
    Description     ：USBコントローラ 割り込み処理
*******************************************************************************/
void usbctrl_interrupt(void)
{
	ulong status;
	int   loop;


	status = readl_reg(OTGIntStt) & readl_reg(OTGIntMask);

	if(status & (B_AVBUSVLDCHGINT | B_ABSESSVLDCHGINT))
	{

		dbg_printf(" VBUS status changed\n");

		writel_reg(OTGIntStt, (B_AVBUSVLDCHG | B_ABSESSVLDCHG));

		usbctrl_vbus_changed();

		return;
	}
	else if(status & B_IDSELCHGINT)
	{

		dbg_printf(" Host/Periphral ID changed\n");

		writel_reg(OTGIntStt, B_IDSELCHG);

		usbctrl_id_changed();

		return;
	}
	else if(status & B_BSE0SRPDETSTINT)
	{

		dbg_printf(" Host/Periphral ID changed\n");

		writel_reg(OTGIntStt, B_BSE0SRPDETST);

		usbctrl_se0_det();

		return;
	}

	if(usbctrl_state == STATE_HOST_ACTV)
	{

		usbctrl_driver_table.usb_host_interrupt();
	}
	else if(usbctrl_state == STATE_PERI_ACTV)
	{
		
		usbctrl_driver_table.usb_peri_interrupt();
	}
	else
	{
		/*ビジー解除待ち*/
		loop=0;
		while(readl_reg(HostPeriSel) & B_OPERATION)
		{
			if(loop++>100) return;
		}
		writel_reg(RstClkCtl, B_XRUN);
		/*ペリフェラル、ホストリセット*/
		writel_reg(RstClkCtl, (B_PRST | B_HRST));
	}
}


/* End of File */
