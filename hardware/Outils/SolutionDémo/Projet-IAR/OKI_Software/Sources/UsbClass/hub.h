/*******************************************************************************
    hub.h
    JOB60842サンプルプログラム
    USBホスト ハブクラスドライバヘッダ

    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/
#ifndef _HUB_H_
#define _HUB_H_

#include "usbh.h"

/*
 * Hub request types
 */
#define USB_CLASS_HUB			9
#define USB_RT_HUB				(USB_TYPE_CLASS | USB_RECIP_DEVICE)
#define USB_RT_PORT				(USB_TYPE_CLASS | USB_RECIP_OTHER)

/*
 * Hub Class feature numbers
 */
#define C_HUB_LOCAL_POWER		0
#define C_HUB_OVER_CURRENT		1

/*
 *Hub Status & Hub Change bit masks
 */
#define HUB_STATUS_LOCAL_POWER	0x0001
#define HUB_STATUS_OVERCURRENT	0x0002

#define HUB_CHANGE_LOCAL_POWER	0x0001
#define HUB_CHANGE_OVERCURRENT	0x0002

struct usb_hub_status {
	ushort 	wHubStatus;
	ushort	wHubChange;
};

/*
 * Port feature numbers
 */
#define PORT_CONNECTION			0
#define PORT_ENABLE				1
#define PORT_FEAT_SUSPEND		2
#define PORT_OVER_CURRENT		3
#define PORT_RESET				4
#define PORT_POWER				8
#define PORT_LOW_SPEED			9
#define C_PORT_CONNECTION		16
#define C_PORT_ENABLE			17
#define C_PORT_SUSPEND			18
#define C_PORT_OVER_CURRENT		19
#define C_PORT_RESET			20

/* wPortStatus bits */
#define HUB_PORT_CONNECTION		0x0001
#define HUB_PORT_ENABLE			0x0002
#define HUB_PORT_SUSPEND		0x0004
#define HUB_PORT_OVER_CURRENT	0x0008
#define HUB_PORT_RESET			0x0010
#define HUB_PORT_POWER			0x0100
#define HUB_PORT_LOW_SPEED		0x0200

/* wPortChange bits */
#define HUB_C_PORT_CONNECTION	0x0001
#define HUB_C_PORT_ENABLE		0x0002
#define HUB_C_PORT_SUSPEND		0x0004
#define HUB_C_PORT_OVER_CURRENT	0x0008
#define HUB_C_PORT_RESET		0x0010

struct usb_port_status {
	ushort	wPortStatus;
	ushort 	wPortChange;	
};

/* Hub descriptor */
struct usb_hub_descriptor {
	uchar  bLength;
	uchar  bDescriptorType;
	uchar  bNbrPorts;
	uchar  wHubCharacteristics_l;
	uchar  wHubCharacteristics_h;
	uchar  bPwrOn2PwrGood;
	uchar  bHubContrCurrent;
	uchar  bitmap[5];
};

#define MAXCHILDREN		8

struct usb_hub {
	struct usbh_device_info	*dev;
	struct usb_hub_descriptor *descriptor;
	char	*buffer;
	URB		urb;
	LIST_ENTRY list;
	int		ports;
	PDEVINFO children[MAXCHILDREN];
};

#define USB_HUB_IDLE    0
#define USB_HUB_CONNECT 1

#endif /* _HUB_H_ */
