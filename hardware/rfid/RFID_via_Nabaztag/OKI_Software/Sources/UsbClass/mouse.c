/*******************************************************************************
    mouse.c
    JOB60842サンプルプログラム
    ホストマウスクラスドライバルーチン (EASY版)

    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/
#define DEBUG

#include <string.h>
#include "config.h"
#include "bitctrl.h"
#include "usbh.h"

#define USB_MOUSE_MAX	1

struct usb_mouse {
	int number;
	PDEVINFO dev;
	signed char *data;
	int dx, dy, dz;
	ulong buttons;
    ulong detect_flag;
	URB urb;
} *usb_mouse_table[USB_MOUSE_MAX];


#define buttons(s, idx, btn) (((s) & (1 << (idx))) ? set_bit((idx), (btn)) : \
												   clear_bit((idx), (btn)))


/*******************************************************************************
    Routine Name    ：mouse_status
    Form            ：int mouse_status(int *mouse_status);
    Parameters      ：mouse_status      マウス情報へのポインタ
    Return value    ：実行結果
    Description     ：USBマウス 状態取得
*******************************************************************************/
int mouse_status(int *mouse_status)
{

    /* マウス接続状態判定 */
    if( (usb_mouse_table[0] == NULL) || (usb_mouse_table[0]->detect_flag == 0) ){
        return NG;
    }

    /* マウス状態取得 */
    mouse_status[0] = usb_mouse_table[0]->dx;
    mouse_status[1] = usb_mouse_table[0]->dy;
    mouse_status[2] = usb_mouse_table[0]->dz;
    mouse_status[3] = (usb_mouse_table[0]->buttons & 0x00000001);
    mouse_status[4] = ((usb_mouse_table[0]->buttons >> 0x1) & 0x00000001);
    mouse_status[5] = ((usb_mouse_table[0]->buttons >> 0x2) & 0x00000001);

    usb_mouse_table[0]->detect_flag = 0;

    return OK;
}


/*******************************************************************************
    Routine Name    ：usb_mouse_event
    Form            ：static void usb_mouse_event(struct usb_mouse *mouse);
    Parameters      ：mouse         マウス情報へのポインタ
    Return value    ：
    Description     ：USBマウス データ処理
*******************************************************************************/
static void usb_mouse_event(struct usb_mouse *mouse)
{

	mouse->dx += mouse->data[1];					/* X */
	mouse->dy += mouse->data[2];					/* Y */
	mouse->dz += mouse->data[3];					/* Z */
	buttons(mouse->data[0], 0, &mouse->buttons);	/* LEFT */
	buttons(mouse->data[0], 1, &mouse->buttons);	/* RIGHT */
	buttons(mouse->data[0], 2, &mouse->buttons);	/* MIDDLE */

}


/*******************************************************************************
    Routine Name    ：usb_mouse_callback
    Form            ：static void usb_mouse_callback(PURB urb);
    Parameters      ：urb           URBへのポインタ
    Return value    ：
    Description     ：USBマウス コールバック
*******************************************************************************/
static void usb_mouse_callback(PURB urb)
{
	struct usb_mouse *mouse;

	if (urb->status<0){
		/* エラー発生後は無応答になる。必要ならばエラー復旧処理を入れる */
		return;
	}

	mouse = (struct usb_mouse *)(urb->dev->driver_data);

	usb_mouse_table[0]->detect_flag = 1;
	usb_mouse_event(mouse);

	usbh_transfer_request(urb);
}


/*******************************************************************************
    Routine Name    ：usbh_set_idle
    Form            ：int usbh_set_idle(PDEVINFO dev);
    Parameters      ：dev           デバイス情報へのポインタ
    Return value    ：実行結果
    Description     ：クラスリクエスト Set Idle
*******************************************************************************/
int usbh_set_idle(PDEVINFO dev)
{
	return usbh_control_transfer(dev, 0, USB_SET_IDLE, 
		USB_TYPE_CLASS | USB_RECIP_INTERFACE, 0, 0, 0, NULL);
}


/*******************************************************************************
    Routine Name    ：usb_mouse_connect
    Form            ：static void *usb_mouse_connect(PDEVINFO dev);
    Parameters      ：dev           デバイス情報へのポインタ
    Return value    ：マウス情報へのポインタ
    Description     ：USBマウス 接続処理
*******************************************************************************/
static void *usb_mouse_connect(PDEVINFO dev)
{
	struct usb_interface_descriptor *interface;
	struct usb_endpoint_descriptor *endpoint;
	int i;
	struct usb_mouse *mouse;
    int ret;

	if(!dev) return NULL;
	if(!dev->descriptor) return NULL;
 	if(!dev->descriptor->configuration) return NULL;
	if(dev->descriptor->bNumConfigurations != 1) return NULL;

	interface = dev->descriptor->configuration->interface;
	if(interface->bInterfaceClass != 3) return NULL;
	if(interface->bInterfaceSubClass != 1) return NULL;
	if(interface->bInterfaceProtocol != 2) return NULL;
	if(interface->bNumEndpoints != 1) return NULL;

	endpoint = interface->endpoint;
	if( (endpoint->bEndpointAddress & 0x80) == 0 ) return NULL;
	if(endpoint->bmAttributes != 3) return NULL;
	if(endpoint->wMaxPacketSize > 8) return NULL;

	ret = usbh_set_configuration(dev, 1);
	if(ret<0){
		return NULL;
	}

	dev->pipe[1] = usbh_create_pipe(dev, endpoint->bmAttributes, endpoint->bEndpointAddress, 
		endpoint->wMaxPacketSize, endpoint->bInterval);
	if(!dev->pipe[1]) return NULL;

	for(i=0; i<USB_MOUSE_MAX; i++){
		if(!usb_mouse_table[i]) break;
	}
	if(i == USB_MOUSE_MAX) return NULL;

	mouse = (struct usb_mouse *)malloc(sizeof(struct usb_mouse));
	if(!mouse) return NULL;
	memset(mouse, 0, sizeof(struct usb_mouse));
  	usb_mouse_table[i] = mouse;
	mouse->number = i;
	mouse->dev = dev;
	dev->driver_data = mouse;
	
	mouse->data = (signed char *)usbh_malloc(8);
	if (!mouse->data){
		free(mouse);
	  	usb_mouse_table[mouse->number] = NULL;
		return NULL;
	}

	dbg_printf("USB mouse\n");

	usbh_set_interrupt_urb(&mouse->urb, dev, 1, mouse->data, endpoint->wMaxPacketSize, usb_mouse_callback);
	if(usbh_transfer_request(&mouse->urb)){
		usbh_free(mouse->data);
		return NULL;
	}

	return mouse;
}


/*******************************************************************************
    Routine Name    ：usb_mouse_disconnect
    Form            ：static void usb_mouse_disconnect(PDEVINFO dev);
    Parameters      ：dev           デバイス情報へのポインタ
    Return value    ：
    Description     ：USBマウス 切断処理
*******************************************************************************/
static void usb_mouse_disconnect(PDEVINFO dev)
{
	struct usb_mouse *mouse = (struct usb_mouse *)dev->driver_data;

	usbh_transfer_cancel(&mouse->urb);
	usbh_free(mouse->data);
	free(mouse);
	usb_mouse_table[mouse->number] = NULL;
	dev->driver_data = NULL;
	dev->driver = NULL;
}


/****************************************************************************/
/* USBマウスドライバ情報 */
static struct usbh_driver usb_mouse_driver = {
	"mouse",
	usb_mouse_connect,
	usb_mouse_disconnect,
};


/*******************************************************************************
    Routine Name    ：usb_mouse_init
    Form            ：int usb_mouse_init(void);
    Parameters      ：
    Return value    ：実行結果
    Description     ：USBマウスドライバ初期処理
*******************************************************************************/
int usb_mouse_init(void)
{
	int i;

	for(i=0; i<USB_MOUSE_MAX; i++){
		usb_mouse_table[i] = NULL;
	}
	usbh_driver_install(&usb_mouse_driver);
	return OK;
}


/*******************************************************************************
    Routine Name    ：usb_mouse_exit
    Form            ：void usb_mouse_exit(void);
    Parameters      ：
    Return value    ：
    Description     ：USBマウスドライバ終了処理
*******************************************************************************/
void usb_mouse_exit(void)
{
	int i;

	for(i=0; i<USB_MOUSE_MAX; i++){
		if(usb_mouse_table[i]){
			if(usb_mouse_table[i]->dev){
				usbh_disconnect(&usb_mouse_table[i]->dev);
			}
		}
	}
	usbh_driver_uninstall(&usb_mouse_driver);
}

/* End of file */
