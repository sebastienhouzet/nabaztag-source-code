/*******************************************************************************
    sio.h
    JOB60842サンプルプログラム
    ML674000 SIO 制御ヘッダ

    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/
#ifndef SIO_H
#define SIO_H

/*----------------------------------------------------------------------------
  定数定義
----------------------------------------------------------------------------*/
/*バッファサイズ*/
#ifndef SIO_WRITEBUFSIZE
#define SIO_WRITEBUFSIZE 1024
#endif

#ifndef SIO_READBUFSIZE
#define SIO_READBUFSIZE 16
#endif

/*通信速度*/
#ifndef SIO_BAUDRATE
  #ifdef DEBUG_BAUDRATE
  #define SIO_BAUDRATE DEBUG_BAUDRATE
  #else
  #define SIO_BAUDRATE 19200
  #endif
#endif

#define SIOSTA_TRIRQ	0x20ul	/* SIO 送信レディ */
#define SIOSTA_RVIRQ	0x10ul	/* SIO 受信レディ */
#define SIOSTA_PERR		0x04ul	/* SIO パリティエラー */
#define SIOSTA_OERR		0x02ul	/* SIO オーバーランエラー */
#define SIOSTA_FERR		0x01ul	/* SIO フレーミングエラー */

/*----------------------------------------------------------------------------
  グローバル変数
----------------------------------------------------------------------------*/
extern int sio_error_state;

/*----------------------------------------------------------------------------
  プロトタイプ宣言
----------------------------------------------------------------------------*/
int sio_init(void);
int sio_write(const char *);
int sio_read(char *, int);
int sio_getc(void);
void sio_printf(char *, ...);

#endif /* SIO_H */
