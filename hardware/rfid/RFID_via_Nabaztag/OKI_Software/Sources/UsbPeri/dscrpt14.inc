/*******************************************************************************
    dscrpt14.inc
    JOB60842サンプルプログラム 
    ディスクリプタ定義(Bulk In/Out and Interrupt)

    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/

#if defined(OTG_ENABLE)
static OTG_Desc Otg_Desc = {
	3,
	OTG,
	(USBP_HNP_SUPPORT|USBP_SRP_SUPPORT)
};
#endif
#define	NUM_ENDPOINT	5
/* BULK In/Out and Interrupt */

/*	=======================================================
	1.	Endpoint Descriptor
	=======================================================
*/
static Endpoint_Desc EP_desc[NUM_ENDPOINT] = {
	{ /*EP1*/
		/*fix*/	7,			/* 1: bLength : ディスクリプタ長 */
		/*fix*/	ENDPOINT,	/* 2: bDescriptorType : ディスクリプタタイプ */
		EPA_WITH_DIR,		/* 3: bEndpointAddress:エンドポイントアドレスおよび転送方向 */
		BULK,				/* 4: bmAttributes : エンドポイント属性 */
		WordSet(EPA_PLD),	/* 5: wMaxPacketSize : 最大パケットサイズ */
		0,					/* 6: bInterval : ポーリング間隔 */
	},
	{ /*EP2*/
		/*fix*/	7,			/* 1: bLength : ディスクリプタ長 */
		/*fix*/	ENDPOINT,	/* 2: bDescriptorType : ディスクリプタタイプ */
		EPB_WITH_DIR,		/* 3: bEndpointAddress:エンドポイントアドレスおよび転送方向 */
		BULK,				/* 4: bmAttributes : エンドポイント属性 */
		WordSet(EPB_PLD),	/* 5: wMaxPacketSize : 最大パケットサイズ */
		0,					/* 6: bInterval : ポーリング間隔 */
	},
	{ /*EP3*/
		/*fix*/	7,			/* 1: bLength : ディスクリプタ長 */
		/*fix*/	ENDPOINT,	/* 2: bDescriptorType : ディスクリプタタイプ */
		EPINT_WITH_DIR,		/* 3: bEndpointAddress:エンドポイントアドレスおよび転送方向 */
#if defined(USBP_USB_CHECK)
		BULK,				/* 4: bmAttributes : エンドポイント属性 */
#else
		INTERRUPT,			/* 4: bmAttributes : エンドポイント属性 */
#endif
		WordSet(EPINT_PLD),	/* 5: wMaxPacketSize : 最大パケットサイズ */
		EP_INT_INTERVAL,	/* 6: bInterval : ポーリング間隔 */
	},
	{ /*EP4*/
		/*fix*/	7,			/* 1: bLength : ディスクリプタ長 */
		/*fix*/	ENDPOINT,	/* 2: bDescriptorType : ディスクリプタタイプ */
		EPC_WITH_DIR,		/* 3: bEndpointAddress:エンドポイントアドレスおよび転送方向 */
		BULK,				/* 4: bmAttributes : エンドポイント属性 */
		WordSet(EPC_PLD),	/* 5: wMaxPacketSize : 最大パケットサイズ */
		0,					/* 6: bInterval : ポーリング間隔 */
	},
	{ /*EP5*/
		/*fix*/	7,			/* 1: bLength : ディスクリプタ長 */
		/*fix*/	ENDPOINT,	/* 2: bDescriptorType : ディスクリプタタイプ */
		EPD_WITH_DIR,		/* 3: bEndpointAddress:エンドポイントアドレスおよび転送方向 */
		BULK,				/* 4: bmAttributes : エンドポイント属性 */
		WordSet(EPD_PLD),	/* 5: wMaxPacketSize : 最大パケットサイズ */
		0,					/* 6: bInterval : ポーリング間隔 */
	},
};

/*	=======================================================
	4.	Interface Descriptor
	=======================================================
*/
static Interface_Desc IF_desc0[1] = {
	{ /*Bulk In/Out, Interrupt In*/
		/*fix*/	9,			/* 1: bLength : ディスクリプタ長 */
		/*fix*/	INTERFACE,	/* 2: bDescriptor : ディスクリプタタイプ */
		0,					/* 3: bInterfacesNumber : InterfaceNumber */
		0,					/* 4: bAlternateSetting : 0からシリアルに付ける */
		NUM_ENDPOINT,		/* 5: bNumEndpoints : エンドポイント数 */
		0xFF,				/* 6: bInterfaceClass : クラスコード (by USB) */
		0xFF,				/* 7: bInterfaceSubClass : サブクラスコード (by USB) */
		0xFF,				/* 8: bInterfaceProtocol : プロトコルコード (by USB) */
		4,					/* 9: iInterface : StringDescriptorのインデックス */
		&EP_desc[0],		/* Endpoint Descriptorへのポインタ */
	},
};
#undef	NUM_ENDPOINT
/*	=======================================================
	5.	Config to Interface Bridge / Config_if
	=======================================================
*/
/*
	Configuration DescriptorがもつInterface Descriptorの種類
	同じbInterfaceNumberで違うbAlternateSetting値をもつ
	InterfaceDescriptorが設定できるため，この構造体で仲介する
*/
#define	NUM_INTERFACE	1

static Config_if CFG_if[NUM_INTERFACE] = {
	{ /*Interface#0*/
		0,					/* 1: bInterfaceNumber */
		1,					/* 2: AlternateSetting数 */
		0,					/* 3: 現在の代替設定値（変数） */
		&IF_desc0[0],		/* InteraceDescriptorへのポインタ */
#if defined(OTG_ENABLE)
		&Otg_Desc,
#endif
	},
};

/*	=======================================================
	6.	Configuration Descrptor
	=======================================================
*/
#define	NUM_CONFIG	1

static Config_Desc CFG_desc[NUM_CONFIG] = {
	{
		/*fix*/	9,				/* 1: bLength : ディスクリプタ長 */
		/*fix*/	CONFIGURATION,	/* 2: bDescriptor : ディスクリプタタイプ */
		WordSet(39+3+14),		/* 3: wTotalLength:全Descriptor長(Config+Interface+Endpoint)*/
		NUM_INTERFACE,			/* 4: bNumInterfaces : Interface数 */
		1,						/* 5: bConfigurationValue :設定選択値(1からシリアルにつける)*/
		3,						/* 6: iConfiguration : StringDescriptorのインデックス */
		0xc0,					/* 7: bmAttributes : 構成の特性 */
		50, /*100mA*/			/* 8: MaxPower : 電力消費量 */
		&CFG_if[0],				/* Configuration to Interface Bridgeへのポインタ */
	},
};

#undef	NUM_INTERFACE

/*	=======================================================
	7.	Device Descrptor
	=======================================================
*/
Device_Desc device_descriptor1 = {
		/*fix*/	18,			/* 1:  bLength : ディスクリプタ長 */
		/*fix*/	DEVICE,		/* 2:  bDescriptor : ディスクリプタタイプ */
#if defined(USBP_USB_CHECK)
		WordSet(0x110),		/* 3:  bcdUSB : USB仕様リリース番号 */
#else
		WordSet(0x200),		/* 3:  bcdUSB : USB仕様リリース番号 */
#endif
		0,					/* 4:  bDeviceClass : クラスコード (by USB) */
		0,					/* 5:  bDeviceSubClass : サブクラスコード (by USB) */
		0,					/* 6:  bDeviceProtocol : プロトコルコード (by USB) */
		32,					/* 7:  bMaxPacketSize0 : EP0のMaxPacketSize*/
		WordSet(VID),		/* 8:  idVender : ベンダID (by USB) */
		WordSet(PID),		/* 9:  idProduct : プロダクトID (by 製造元) */
		WordSet(0x100),		/* 10: bcdDevice : デバイス・リリース番号 */
		1,					/* 11: iManufacturer:製造者を表すStringDescriptorIndex*/
		2,					/* 12: iProduct : 製品を表すSrtingDescriptorのインデックス */
		0,					/* 13: iSerialNumber : デバイス製品番号を表すStringDescriptorIndex */
		NUM_CONFIG,			/* 14: bNumConfiguration : ConfigurationDescriptor数 */
		&CFG_desc[0],		/* Configuration Descriptorへのポインタ */
};

#undef	NUM_CONFIG

const ushort	Language_ID[1] = {0x409};
const ushort	Manufacturer_String[4] = {'O','K','I',' '};
const ushort	Product_String[9] = {'J','O','B','-','6','0','8','4','2'};
const ushort	Config_String[14] = {'B','u','l','k','&','I','n','t','e','r','r','u','p','t'};
const ushort	If_String[13] = {'B','u','l','k','-','L','o','o','p','B','a','c','k'};

String_Desc string_desc[5]=
{
	{
		4,
		STRING,
		(ushort *)Language_ID
	},
	{
		10,
		STRING,
		(ushort *)Manufacturer_String
	},
	{
		20,
		STRING,
		(ushort *)Product_String
	},
	{
		30,
		STRING,
		(ushort *)Config_String
	},
	{
		28,
		STRING,
		(ushort *)If_String
	},

};

/* end of descriptor include file */
