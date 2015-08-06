/*******************************************************************************
	usbp.h
	JOB60842サンプルプログラム
	ペリフェラルドライバヘッダ

	Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
	  All rights reserved.

	更新履歴
	Mar.31,2003 rev1.00:新規作成
*******************************************************************************/
#ifndef _USBP_H_
#define	_USBP_H_

#include "typedef.h"
#include "usbp_common.h"

/*****************************************************************************
    Standard Request Codes  ( bRequest )    
*******************************************/
#define	GET_STATUS			0
#define	CLEAR_FEATURE		1
#define	SET_FEATURE			3
#define	SET_ADDRESS			5
#define	GET_DESCRIPTOR		6
#define	SET_DESCRIPTOR		7
#define	GET_CONFIGURATION	8
#define	SET_CONFIGURATION	9
#define	GET_INTERFACE		10
#define	SET_INTERFACE		11
#define	SYNCH_FRAME			12

/*****************************************************************************
    Descriptor Types    
***********************/
#define	DEVICE				1
#define	CONFIGURATION		2
#define	STRING				3
#define	INTERFACE			4
#define	ENDPOINT			5
#if defined(OTG_ENABLE)
#define OTG					9
#endif /* OTG_ENABLE */
/*****************************************************************************
    Feature Selector    
***********************/
#define	DEVICE_REMOTE_WAKEUP	1
#define	ENDPOINT_STALL			0

/* On The Go */
#if defined(OTG_ENABLE)
/* Set Feature Feature Selector */
#define	B_HNP_ENABLE			3
#define	A_HNP_SUPPORT			4
#define	A_ALT_HNP_ENABLE		5
/* OTG Descriptor */
#define	USBP_HNP_SUPPORT				2
#define	USBP_SRP_SUPPORT				1
#endif /* OTG_ENABLE */


/*****************************************************************************
    Transfer Types    
***********************/
#define	CONTROL				0				/* bit 0-1 : 00 */
#define	ISOCHRONOUS			1				/* bit 0-1 : 01 */
#define	BULK				2				/* bit 0-1 : 10 */
#define	INTERRUPT			3				/* bit 0-1 : 11 */

#define	M_EP_NUM			0x0F

/* Device Requests */
typedef	uchar	bmRequestType;
typedef	uchar	bRequest;
typedef	ushort	wValue;
typedef	ushort	wIndex;
typedef	ushort	wLength;

/* Descriptor's common */
typedef	uchar	bLength;
typedef	uchar	bDescriptorType;

/* Device Descriptor */
typedef	ushort	bcdUSB;
typedef	uchar	bDeviceClass;
typedef	uchar	bDeviceSubClass;
typedef	uchar	bDeviceProtocol;
typedef	uchar	bMaxPacketSize0;
typedef	ushort	idVendor;
typedef	ushort	idProduct;
typedef	ushort	bcdDevice;
typedef	uchar	iManufacturer;
typedef	uchar	iProduct;
typedef	uchar	iSerialNumber;
typedef	uchar	bNumConfigurations;

/* Configuration Descriptor */
typedef	ushort	wTotalLength;
typedef	uchar	bNumInterfaces;
typedef	uchar	bConfigurationValue;
typedef	uchar	iConfiguration;
typedef	uchar	bmAttributes;
typedef	uchar	MaxPower;

/* Interface Descriptor */
typedef	uchar	bInterfaceNumber;
typedef	uchar	bAlternateSetting;
typedef	uchar	bNumEndpoints;
typedef	uchar	bInterfaceClass;
typedef	uchar	bInterfaceSubClass;
typedef	uchar	bInterfaceProtocol;
typedef	uchar	iInterface;

#if defined(HID_CLASS) || defined(AUDIO_DEVICE_CLASS)

/* HID Descriptor */
typedef	ushort	bcdHID;			/* HIDクラス仕様リリース番号  */
typedef	uchar	bCountryCode;		/* ハードウェアの対象国コード */
typedef	uchar	bNumDescriptors;	/* 続くHIDディスクリプタの数  */
typedef	uchar	wItemLengthL;		/* ディスクリプタ長LOW  */
typedef	uchar	wItemLengthH;		/* ディスクリプタ長HIGH  */

#endif /* HID_CLASS */

/* Endpoint Descriptor */
typedef	uchar	bEndpointAddress;
/* typedef	uchar	bmAttributes; *//* defined at Config.. */
typedef	ushort	wMaxPacketSize;
typedef	uchar	bInterval;

/* String Descriptor */


/*****************************************************************************
    USB Device Requests     
*****************************************************************************/
typedef struct Device_Request {
	bmRequestType		bmRequestType;		/*  */
	bRequest			bRequest;			/*  */
	wValue				wValue;				/*  */
	wIndex				wIndex;				/*  */
	wLength				wLength;			/*  */
} Device_Request;

/* bmRequestType D7     Data xfer direction */
#define	REQUEST_XFER		0x80
#define	HOST_to_DEVICE		0x00
#define	DEVICE_to_HOST		0x80

/* bmRequestType D6..5  Type */
#define	REQUEST_TYPE		0x60
#define	STANDARD_TYPE		0x00
#define	CLASS_TYPE			0x20
#define	VENDOR_TYPE			0x40

/* bmRequestType D4..0  Recipient */
#define	REQUEST_RECIPIENT	0x1F
#define	DEVICE_RECIPIENT	0x00
#define	INTERFACE_RECIPIENT	0x01
#define	ENDPOINT_RECIPIENT	0x02

/*****************************************************************************
    Standard USB Descriptor Definitions    
******************************************************************************/
typedef const struct String_Descriptor {
	bLength			bLength;
	bDescriptorType		bDescriptorType;
	ushort			*string;
} String_Desc;

typedef const struct Endpoint_Descriptor {
	bLength			bLength;
	bDescriptorType		bDescriptorType;
	bEndpointAddress	bEndpointAddress;
	bmAttributes		bmAttributes;
	wMaxPacketSize		wMaxPacketSize;
	bInterval		bInterval;
#ifdef AUDIO_DEVICE_CLASS			/* S000623 */
	uchar			append_1;
	uchar			append_2;
	uchar			*Class_Spec_Desc;
#endif /* AUDIO_DEVICE_CLASS */
} Endpoint_Desc;

#if defined( HID_CLASS)

/* アライメントが合わないので、wItemLengthはバイト単位に分割した */
typedef const struct HID_Descriptor {
	bLength				bLength;	/* ディスクリプタ長*/
	bDescriptorType		bDesciptorType;	/* ディスクリプタタイプ			*/
	bcdHID				bcdHID;		/* HIDクラス仕様リリース番号	*/
	bCountryCode		bCountryCode;	/* ハードウェアの対象国コード	*/
	bNumDescriptors		bNumDescriptors;/* 続くHIDディスクリプタの数	*/
	bDescriptorType		bDescriptorType;/* ディスクリプタタイプ			*/
	wItemLengthL		wItemLengthL;	/* ディスクリプタ長LOW			*/
	wItemLengthH		wItemLengthH;	/* ディスクリプタ長HIGH			*/
} HID_Desc;

#endif /* HID_CLASS */

typedef const struct Interface_Descriptor {
	bLength				bLength;
	bDescriptorType		bDescriptorType;
	bInterfaceNumber	bInterfaceNumber;
	bAlternateSetting	bAlternateSetting;
	bNumEndpoints		bNumEndpoints;
	bInterfaceClass		bInterfaceClass;
	bInterfaceSubClass	bInterfaceSubClass;
	bInterfaceProtocol	bInterfaceProtocol;
	iInterface			iInterface;
	Endpoint_Desc		*p_EP_desc;	/* Endpoint Descriptorを指すポインタ */
#ifdef HID_CLASS
	HID_Desc		*p_HID_desc;	/* HID Descriptorを指すポインタ */
	const uchar		*p_HID_report_desc;	/*必須の１レポートディスクリプタへのポインタ*/
#endif /* HID_CLASS */
#ifdef AUDIO_DEVICE_CLASS
	uchar			num_audio_desc;
	const 			void **Audio_interface_desc;
#endif /* AUDIO_DEVICE_CLASS */
#ifdef CDC
	uchar			num_functional_desc;
	const 			void **CDC_functional_desc;
#endif /* CDC */
} Interface_Desc;

/*
 * OTG Descriptor
 */
#if defined(OTG_ENABLE)
typedef const struct OTG_Descriptor {
	bLength				bLength;
	bDescriptorType		bDescriptorType;
	bmAttributes		bmAttributes;
}	OTG_Desc;
#endif /* OTG_ENABLE */

/*
 * 同じbInterfaceNumberで違うbAlternateSettingをもつ Descriptorが
 * 設定できるため Configuration と Interface をこの構造体で仲介する
 */
typedef struct Configuration_Interface {
	bInterfaceNumber	bInterfaceNumber;/* p_IF_descが指すDescriptorのbInterfaceNumber */
	bAlternateSetting	bAlternateSetting;/* p_IF_descが指すDescriptorのAlternateSetting数 */
	bAlternateSetting	currentAlternateSetting;/* 現在設定されているAlternateSetting */
	Interface_Desc		*p_IF_desc;	/* Interface Descriptorを指すポインタ */
#if defined(OTG_ENABLE)
	OTG_Desc			*p_OTG_desc;
#endif
#ifdef HID_CLASS
	HID_Desc			*p_HID_desc;	/* HID Descriptorを指すポインタ */
	const uchar			*p_HID_report_desc;/* 必須の１レポートディスクリプタへのポインタ */
#endif /* HID_CLASS */
} Config_if;

typedef const struct Configuration_Descriptor {
	bLength					bLength;
	bDescriptorType			bDescriptorType;
	wTotalLength			wTotalLength;
	bNumInterfaces			bNumInterfaces;
	bConfigurationValue		bConfigurationValue;
	iConfiguration			iConfiguration;
	bmAttributes			bmAttributes;
	MaxPower				MaxPower;
	Config_if				*p_CFG_if;	/* 仲介用構造体を指すポインタ */
} Config_Desc;

typedef const struct Device_Descriptor {
	bLength				bLength;
	bDescriptorType		bDescriptorType;
	bcdUSB				bcdUSB;
	bDeviceClass		bDeviceClass;
	bDeviceSubClass		bDeviceSubClass;
	bDeviceProtocol		bDeviceProtocol;
	bMaxPacketSize0		bMaxPacketSize0;
	idVendor			idVendor;
	idProduct			idProduct;
	bcdDevice			bcdDevice;
	iManufacturer		iManufacturer;
	iProduct			iProduct;
	iSerialNumber		iSerialNumber;
	bNumConfigurations	bNumConfigurations;
	Config_Desc			*p_CFG_desc;	/* Configuration Descriptorを指すポインタ */
} Device_Desc;



/*****************************************************************************
*	エンドポイント用構造体
******************************************************************************/
/*
Endpoint 制御用構造体
*/
typedef const struct EP_List_C {
	uchar	*recv_byte_cnt;				/* 受信バイトカウントレジスタ */
	uchar	*epnconfig;				/* コンフィグレーションレジスタ */
	uchar	*epncontrol;			/* 制御レジスタ */
	uchar	*epnstat;				/* ステータスレジスタ */
	uchar	*epnpayload;			/* ペイロードレジスタ */
	uchar	*epntxcnt;				/* 送信データバイト数レジスタ */
	uint	*fifo_R;				/* 受信FIFOアドレス */
	uint	*fifo_W;				/* 送信FIFOアドレス */
	ushort	b_pktrdy_int;			/* パケットレディ割込み ビット */
	ushort	dummyA;			/*  */
} EP_LIST_C;


typedef struct EP_List_V {
	uint		transferred_size;	/* 送受信データ総数 */
	uint		demand_size;		/* 送受信データ数 */
	uchar		*buf;				/* データ用バッファ */
	void	(*callback)(uchar *buf, uint transferred_size);	/* CallBack関数 */
	uchar		demand_null;		/* ペイロードサイズの倍数のデータ送信後NULLを出すか。*/
	uchar		dummyA;		/* */
	uchar		dummyB;		/* */
	uchar		dummyC;		/* */
} EP_LIST_V;

/* 
	USB Device ステータス
*/
typedef struct USB_Status {
	Config_Desc	*configuration;
	void	(*reset_assert_callback)(void);	/* Reset CallBack関数 */
	void	(*reset_deassert_callback)(void);	/* Reset CallBack関数 */
	void	(*set_interface_callback)(uchar conf, uchar ifnum);	
					/* SetInterface CallBack関数 */
	uchar		remote_wakeup;
	uchar		address;
	uchar		dvcstate;		/* 現在のデバイス・ステート */	
	uchar		stall_req;		/* STALL要求情報 */
} USB_STATUS;

	#define REQ_STALL			0x80		/* STALL要求ビット */
	#define DEFAULT_STATE		0
	#define ADDRESS_STATE		1
	#define CONFIGURED_STATE	2


/******************************************************************************/
/* Function Prototype */

void usbp_class_func(void);
void usbp_vendor_func(void);

void usbp_func_Clear_Feature(Device_Request *device_request_pointer, uchar *buf);
void usbp_func_Get_Configuration(Device_Request *device_request_pointer, uchar *buf);
void usbp_func_Get_Descriptor(Device_Request *device_request_pointer, uchar *buf);
void usbp_func_Get_Interface(Device_Request *device_request_pointer, uchar *buf);
void usbp_func_Get_Status(Device_Request *device_request_pointer, uchar *buf);
void usbp_func_Set_Address(Device_Request *device_request_pointer, uchar *buf);
void usbp_func_Set_Configuration(Device_Request *device_request_pointer, uchar *buf);
void usbp_func_Set_Descriptor(Device_Request *device_request_pointer, uchar *buf);
void usbp_func_Set_Feature(Device_Request *device_request_pointer, uchar *buf);
void usbp_func_Set_Interface(Device_Request *device_request_pointer, uchar *buf);
void usbp_func_Synch_Frame(Device_Request *device_request_pointer, uchar *buf);
void usbp_func_stall(void);


void write_FIFO(char ep);
void read_FIFO(char ep);
void usbp_Decode_Request(void);

void usbp_interrupt(void);
int usbperi_init(void);

/******************************************************************************/

#include "ml60842.h"
#include "60842mac.h"

/******************************************************************************/
/* Variable Definition */

#if defined(USBPMAIN)
#define EXTERN 
#else
#define EXTERN extern
#endif

#if defined(USBPMAIN)
EP_LIST_C	epC[EP_MAX+1]
=
{
	{
		(void *)EP0RXCNTSTAT,
		(void *)EP0PLDCONF,
		(void *)EP0CONT,
		(void *)EP0RXCNTSTAT,
		(void *)EP0PLDCONF,
		(void *)EP0TXCNT,
		(void *)EP0RXFIFO,
		(void *)EP0TXFIFO,
		B_EP0RXPKTRDY_INT,
		NULL
	},
	{
		(void *)EP1RXCNTSTAT,
		(void *)EP1PLDCONF,
		(void *)EP1CONT,
		(void *)EP1RXCNTSTAT,
		(void *)EP1PLDCONF,
		(void *)EP1TXCNT,
		(void *)EP1FIFO,
		(void *)EP1FIFO,
		B_EP1PKTRDY_INT,
		NULL
	},
	{
		(void *)EP2RXCNTSTAT,
		(void *)EP2PLDCONF,
		(void *)EP2CONT,
		(void *)EP2RXCNTSTAT,
		(void *)EP2PLDCONF,
		(void *)EP2TXCNT,
		(void *)EP2FIFO,
		(void *)EP2FIFO,
		B_EP2PKTRDY_INT,
		NULL
	},
	{
		(void *)EP3RXCNTSTAT,
		(void *)EP3PLDCONF,
		(void *)EP3CONT,
		(void *)EP3RXCNTSTAT,
		(void *)EP3PLDCONF,
		(void *)EP3TXCNT,
		(void *)EP3FIFO,
		(void *)EP3FIFO,
		B_EP3PKTRDY_INT,
		NULL
	},
	{
		(void *)EP4RXCNT,
		(void *)EP4CONF,
		(void *)EP4CONT,
		(void *)EP4STAT,
		(void *)EP4PLD,
		(void *)EP4TXCNT,
		(void *)EP4FIFO,
		(void *)EP4FIFO,
		B_EP4PKTRDY_INT,
		NULL
	},
	{
		(void *)EP5RXCNT,
		(void *)EP5CONF,
		(void *)EP5CONT,
		(void *)EP5STAT,
		(void *)EP5PLD,
		(void *)EP5TXCNT,
		(void *)EP5FIFO,
		(void *)EP5FIFO,
		B_EP5PKTRDY_INT,
		NULL
	},
	{
		(void *)EP0RXCNTSTAT,
		(void *)EP0PLDCONF,
		(void *)EP0CONT,
		(void *)EP0RXCNTSTAT,
		(void *)EP0PLDCONF,
		(void *)EP0TXCNT,
		(void *)EP0RXFIFO,
		(void *)EP0TXFIFO,
		B_EP0TXPKTRDY_INT,
		NULL
	},
};	
#else
EXTERN	EP_LIST_C	epC[EP_MAX+1];
#endif

EXTERN	Device_Request		device_request;		/* Device Request */
EXTERN	USB_STATUS			usb_status;			/* Device Current Status */
EXTERN	uchar				ep_stat[EP_MAX];	/* エンドポイント有効/無効状態 0:invalid 1:valid */	


EXTERN	EP_LIST_V	epV[EP_MAX+1];
EXTERN	USB_STATUS	usb_status;
EXTERN uchar cont_buf[256];

EXTERN	Device_Desc			*device_descriptor;	/* Device Descriptor */
/* 4つのディスクリプタを宣言しておく。随時変更すること。 */
extern	Device_Desc			device_descriptor1;	/* Device Descriptor */
#if defined(PERI_TEST)
extern	Device_Desc			device_descriptor2;	/* Device Descriptor */
extern	Device_Desc			device_descriptor3;	/* Device Descriptor */
extern	Device_Desc			device_descriptor4;	/* Device Descriptor */
#endif
extern String_Desc string_desc[];

#endif /*_USBP_H_*/

/* End of file */

