/*******************************************************************************
    usbp_req_clss.c
    JOB60842サンプルプログラム 
    クラスリクエスト処理
    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/
#include "usbp.h"
/*******************************************************************************
	Routine Name:	usbp_class_func
	Form:			void usbp_class_func(void)
	Parameters:		無し
	Return value:	無し
	Description:	クラスリクエスト処理関数
******************************************************************************/
void usbp_class_func(void)
{
	SET_STALL_EP0();
}

/* End of file */
