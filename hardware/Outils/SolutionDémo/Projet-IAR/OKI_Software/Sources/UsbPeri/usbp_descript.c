/*******************************************************************************
    usbp_descript.c
    JOB60842サンプルプログラム 
    ディスクリプタの定義

    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/

#include "typedef.h"
#include "usbp_common.h"
#include "usbp_class.h"
#include "usbp.h"

/*	=======================================================
	1.	Descriptorの初期化で用いるマクロ
	=======================================================
*/
/*
	Set_L_H()
	---------
	Low byte, High Byteの順に独立した2byteを定義する
	アライメントに沿わないワードの初期化を行う
*/
#define	Set_L_H(_val)	(((_val) & 0xff), (((_val) >> 8) & 0xff))

/*
	WordSet()
	---------
	Endianの影響をワード型初期化を行う
	規格上のDescriptorの定義はLittleEndian形式
	したがってBigEndianマシンでは、バイト順を反転させる
*/

#ifdef BIG_ENDIAN
	#define	WordSet(_val)	((((_val) & 0xff) << 8) | (((_val) >> 8) & 0xff))
#else
	#define	WordSet(_val)	(_val)
#endif /* BIG_ENDIAN */


/*	=======================================================
	3.	Descriptor定義ファイル（dscrptXX.inc）の取込み
		および Vendor ID & Product ID の定義

		Vendor IDは、0x70A = Oki Electric Industry Co., Ltd
		Product IDは、0x4012

		これらは、ML60841の評価をする限りで
		使用できるものです。実際のユーザシステムにお
		いては、お客様が取得されたVendorIDおよびお客様
		が管理されるProductIDを用いる必要があります。
	=======================================================
*/

#define	VID		0x70A		/* Vendor ID */

#if defined(BULK_IN_OUT_AND_INT)

	#define	PID	0x4012		/* Product ID *//* 0x4012 */
	#include "dscrpt14.inc"	
/*
	dscrpt14.inc(1)	bulk In/Out + Interrupt
*/
#else

#error never come here

#endif

/* End of file */
