/*******************************************************************************
    fifo.c
    JOB60842サンプルプログラム
    ML674000 FIFOバッファ制御ルーチン

    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/
#include "fifo.h"


/*******************************************************************************
    Routine Name    ：fifo_init
    Form            ：int fifo_init(FIFO *fifo, char *buf, int size);
    Parameters      ：fifo          初期化するFIFOバッファへのポインタ
                      buf           データバッファへのポインタ
                      size          データバッファサイズ
    Return value    ：実行結果(常に0)
    Description     ：FIFOの初期化
*******************************************************************************/
int fifo_init(FIFO *fifo, char *buf, int size)
{
	int i;

	fifo->data = buf;
	fifo->size = size;	
	fifo->start = 0;
	fifo->next = 0;

	for(i=0; i<size; i++)
	{
		fifo->data[i] = 0;
	}

	return 0;
}


/*******************************************************************************
    Routine Name    ：fifo_pop
    Form            ：int fifo_pop(FIFO *fifo);
    Parameters      ：fifo          読み出すFIFOバッファへのポインタ
    Return value    ：入力文字がある場合には、その文字を返す
                      入力文字がない場合には、0を返す
    Description     ：FIFOバッファから1文字読み出し
*******************************************************************************/
int fifo_pop(FIFO *fifo)
{
	int ret;

	if(fifo->start != fifo->next)
	{
		ret = fifo->data[fifo->start];
		fifo->start++;
		if(fifo->start >= fifo->size)
		{
			fifo->start = 0;
		}
	}
	else
	{
		ret = 0;
	}

	return ret;
}


/*******************************************************************************
    Routine Name    ：fifo_push
    Form            ：int fifo_push(FIFO *fifo, char data);
    Parameters      ：fifo          書き込むFIFOバッファへのポインタ
                      data          書き込むデータ
    Return value    ：実行結果
    Description     ：FIFOバッファへの一文字書き込み
*******************************************************************************/
int fifo_push(FIFO *fifo, char data)
{
	int ret;
	int next;

	next = fifo->next + 1;

	if(next >= fifo->size)
	{
		next = 0;
	}

	if(next != fifo->start)
	{
		fifo->data[fifo->next] = data;
		fifo->next = next;
		ret = 0;
	}
	else
	{
		ret = -1;
	}

	return ret;
}


/*******************************************************************************
    Routine Name    ：fifo_status
    Form            ：int fifo_status(FIFO *fifo);
    Parameters      ：fifo          FIFOバッファへのポインタ
    Return value    ：実行結果
    Description     ：FIFOバッファへに溜まっている文字数
*******************************************************************************/
int fifo_status(FIFO *fifo)
{
	int ret;

	if(fifo->next >= fifo->start)
	{
		ret = fifo->next - fifo->start;
	}
	else
	{
		ret = fifo->size + fifo->next - fifo->start; 
	}

	return ret;
}


/* end of file */
