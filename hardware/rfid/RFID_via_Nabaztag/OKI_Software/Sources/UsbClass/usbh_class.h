/*******************************************************************************
    usbh_class.h
    JOB60842サンプルプログラム
    USBホスト クラスドライバヘッダ

    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/
#ifndef _USBH_CLASS_H_
#define _USBH_CLASS_H_

/* プロトタイプ宣言 */
/* mouse */
int mouse_status( int* );

/* JOB */
void *okijob_open( void );
int okijob_close( void* );
int okijob_bulk( void*, unsigned char, void*, unsigned long );
int okijob_number(void*);

#endif /* _USBH_CLASS_H_ */
