/*******************************************************************************
    sio.c
    JOB60842サンプルプログラム
    ML674000 SIO 制御ルーチン

    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/
#include <stdio.h>
#include <stdarg.h>

#include "config.h"
#include "fifo.h"


#define SIO_WRITE_IGNORE_OVERFLOW
#define SIO_READ_IGNORE_OVERFLOW

/*--------------------------------------------------------------------------*/
/*定数定義*/
#define CR (0x0d)
#define LF (0x0a)

#define	GPCTL_SIO	(0x0002ul)
#define D	(256 - SYSCLK * 1000000 / SIO_BAUDRATE / 16)	/* ボーレート設定 */


/*--------------------------------------------------------------------------*/
/*グローバル変数定義*/
int sio_error_state = 0;
static int sio_send_active = 0;

static FIFO sio_read_fifo;
static FIFO sio_write_fifo;


/*--------------------------------------------------------------------------*/
/*プロトタイプ宣言*/
static void sio_irq(void);
static int sio_write_fifo_pop(void);
static int sio_read_fifo_push(void);


/*******************************************************************************
    Routine Name    ：sio_init
    Form            ：int sio_init(void);
    Parameters      ：
    Return value    ：実行結果
    Description     ：SIOの初期化
*******************************************************************************/
int sio_init(void)
{
	static char sio_read_buf[SIO_READBUFSIZE];
	static char sio_write_buf[SIO_WRITEBUFSIZE];
	ULONG ret;

	/* ポートイネーブル */
	ret = (ULONG)readw_reg(GPCTL);
	ret |= GPCTL_SIO;
	writew_reg(GPCTL, (USHORT)ret);

	/* FIFOバッファの初期化 */
	fifo_init(&sio_read_fifo, sio_read_buf, SIO_READBUFSIZE);
	fifo_init(&sio_write_fifo, sio_write_buf, SIO_WRITEBUFSIZE);

	/* ボーレートの設定 */
	writew_reg(SIOBT, D);

	/* SIOコントロール
		bit2(TSTB)	= 0b;	// 0:2ストップビット	1:1ストップ
		bit4(PEN)	= 0b;	// 0:奇数パリティ		1:偶数
		bit4(PEN)	= 0b;	// 0:パリティ無効		1:有効
		bit1(LN)	= 0b;	// 0:データ長8ビット	1:7ビット
	*/
	writew_reg(SIOCON, 0x0000);
	
	/* エラーフラグのクリア */
	sio_send_active = 0;
	sio_error_state = 0;

	/* SIOステータスクリア */
	writew_reg(SIOSTA, 0x0037);

	/* SIOタイマーイネーブル */
	writew_reg(SIOBCN, 0x0010);

	/* ダミーリード */
	ret = read_reg(SIOBUF);

	/* 割り込みハンドラー設定 */
	IRQ_Install(SIOIRQ, IRQ_LV_SIO, sio_irq);

	return 0;
}


/*******************************************************************************
    Routine Name    ：sio_irq
    Form            ：static void sio_irq(void);
    Parameters      ：
    Return value    ：
    Description     ：SIOの割り込み処理
*******************************************************************************/
static void sio_irq(void)
{
	ULONG ret;

	ret = (ULONG)readw_reg(SIOSTA);
		
	if((ret & (SIOSTA_PERR | SIOSTA_OERR | SIOSTA_FERR)) != 0ul)
	{	/*エラー*/
		sio_error_state = 1;

		writew_reg(SIOSTA, (USHORT)ret);

		/* SIOタイマーディセーブル */
		writew_reg(SIOBCN, 0x0000);
	
	}
	
	else if((ret & SIOSTA_RVIRQ) != 0ul)
	{	/*受信完了データ有り*/
		writew_reg(SIOSTA, SIOSTA_RVIRQ);
		sio_read_fifo_push();
	}

	else if((ret & SIOSTA_TRIRQ) != 0ul)
	{	/*転送バッファエンプティ*/
		writew_reg(SIOSTA, SIOSTA_TRIRQ);

		if(fifo_status(&sio_write_fifo)>0)
		{
			sio_write_fifo_pop();
		}
		else
		{
			sio_send_active = 0;
		}
	}
	
	else
	{	/*エラー*/
		sio_error_state = 1;

		/* SIOタイマーディセーブル */
		writew_reg(SIOBCN, 0x0000);
	}
}


/*******************************************************************************
    Routine Name    ：sio_write_fifo_pop
    Form            ：int sio_write_fifo_pop(void);
    Parameters      ：
    Return value    ：実行結果（常に0）
    Description     ：FIFOからSIOへの文字列出力(割り込み時処理用)
*******************************************************************************/
int sio_write_fifo_pop(void)
{
	int data;

	data = fifo_pop(&sio_write_fifo);
	
	if(data!=0)
	{
		write_reg(SIOBUF, (UCHAR)data);
	}

	return 0;
}


/*******************************************************************************
    Routine Name    ：sio_read_fifo_push
    Form            ：static int sio_read_fifo_push(void);
    Parameters      ：
    Return value    ：実行結果
    Description     ：SIOからの読み出し(割り込み時処理用)
*******************************************************************************/
static int sio_read_fifo_push(void)
{
	int  ret;
	char data;

	data = (char)read_reg(SIOBUF);

	ret = fifo_push(&sio_read_fifo, data);

#ifndef SIO_READ_IGNORE_OVERFLOW
	if(ret<0)
	{
		sio_error_state = 1;
	}
#endif

	return ret;
}


/*******************************************************************************
    Routine Name    ：sio_write
    Form            ：int sio_write(const char *buf);
    Parameters      ：buf           文字列
    Return value    ：実行結果
    Description     ：SIOへ出力する文字列をFIFOに書き込み
*******************************************************************************/
int sio_write(const char *buf)
{
	int  ret = 0;
	char data;

	while((*buf!=NULL) && (ret>=0) && (sio_error_state==0))
	{

		if(*buf=='\n')
		{
			data = CR;
			buf++;
		}
		else
		{
			data = *buf;
			buf++;
		}

		ret = fifo_push(&sio_write_fifo, data);
#ifndef SIO_WRITE_IGNORE_OVERFLOW
		if(ret<0)
		{
			sio_error_state = 1;
		}
#endif		
	}

	if((sio_send_active == 0) && (sio_error_state == 0))
	{
		if(fifo_status(&sio_write_fifo) > 0)
		{
			sio_send_active = 1;
			sio_write_fifo_pop();
		}
	}

	return ret;
}


/*******************************************************************************
    Routine Name    ：sio_getc
    Form            ：int sio_getc(void);
    Parameters      ：
    Return value    ：入力文字がある場合には、その文字を返す
                      入力文字がない場合には、0を返す
    Description     ：SIOのFIFOから1文字読み出し
*******************************************************************************/
int sio_getc(void)
{
	int ret;

	ret = fifo_pop(&sio_read_fifo);
	
	return ret;
}




/*******************************************************************************
    Routine Name    ：sio_read
    Form            ：int sio_read(char *buf, int size);
    Parameters      ：buf           入力する文字列バッファ
                      size          バッファサイズ
    Return value    ：正常時は入力された文字数を返す
                      エラー時は-1を返す
    Description     ：SIOのFIFOから文字列読み出し
*******************************************************************************/
int sio_read(char *buf, int size)
{
	int ret;
	int len;

	if(size>0)
	{
		
		len = 1;
		ret = 0;
	
		while((ret>=0) && (ret!=CR) && (len < size) && (sio_error_state==0))
		{

			ret = fifo_pop(&sio_read_fifo);

			if((ret>=0) && (ret!=CR))
			{
				*buf++ = (char)ret;
				len++;
			}
		}
	}
	else
	{
		len = 0;
	}
	
	*buf = '\0';

	return len;
}


/*******************************************************************************
    Routine Name    ：sio_printf
    Form            ：void sio_printf(char * fmt, ...);
    Parameters      ：printfと同じフォーマット
    Return value    ：
    Description     ：SIOへ出力
*******************************************************************************/
void sio_printf(char * fmt, ...)
{
	char    TextLine[LINEBUFSIZE];
	va_list args;

	va_start(args, fmt);
	vsprintf(TextLine, fmt, args);
	sio_write(TextLine);
}

