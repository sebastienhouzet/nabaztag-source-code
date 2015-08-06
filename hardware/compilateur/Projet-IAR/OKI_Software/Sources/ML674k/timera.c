/*******************************************************************************
    timera.c
    JOB60842サンプルプログラム
    ML674000 タイマー制御ルーチン (For 汎用タイマー)

    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/
#include "config.h"

/*--------------------------------------------------------------------------*/
static struct _timer{
	int (*vector)(int);
	int count;
	int used;
} timer[MAXTMCH+1];


/*--------------------------------------------------------------------------*/
static void error(void);


/*******************************************************************************
    Routine Name    ：timera_irq
    Form            ：static void timera_irq(int ch);
    Parameters      ：ch            タイマチャネル番号
    Return value    ：
    Description     ：タイマー割り込み処理
            各タイマの割り込みtimer?_irq()を処理する
            ?はタイマー番号(0～MAXTMCH)になる
            グローバル変数 timer[ch].count は割り込みが発生した回数を示す
            グローバル変数 timer[ch].count をインクリメントする
            割り込み時の処理を追加する場合は、timera_set()にて処理ルーチンを
            追加する
*******************************************************************************/
static void timera_irq(int ch)
{
	ULONG status;

	status = (ULONG)readw_reg(GET_TIMER_ADDR(TIMESTAT0,ch));
	if((status & 0x0001ul) != 0ul)
	{
		writew_reg(GET_TIMER_ADDR(TIMESTAT0,ch), 0x0001);
		timer[ch].count++;
		if(timer[ch].vector != NULL)
		{
			timer[ch].vector(ch);
		}
	}
}

static void timer0_irq(void)
{
	timera_irq(CH0);
}

static void timer1_irq(void)
{
	timera_irq(CH1);
}

static void timer2_irq(void)
{
	timera_irq(CH2);
}

static void timer3_irq(void)
{
	timera_irq(CH3);
}

static void timer4_irq(void)
{
	timera_irq(CH4);
}

static void timer5_irq(void)
{
	timera_irq(CH5);
}




/*******************************************************************************
    Routine Name    ：timera_init
    Form            ：int timera_init(void);
    Parameters      ：
    Return value    ：実行結果（常に0）
    Description     ：タイマーの初期化
*******************************************************************************/
int timera_init(void)
{
	int i;
	
	for(i=0; i<=MAXTMCH; i++)
	{
		timer[i].used = 0;
		timer[i].vector = 0;
	}

	writew_reg(TIMECNTL0, 0);
	writew_reg(TIMECNTL1, 0);
	writew_reg(TIMECNTL2, 0);
	writew_reg(TIMECNTL3, 0);
	writew_reg(TIMECNTL4, 0);
	writew_reg(TIMECNTL5, 0);

	IRQ_Install(TMRIRQ0, IRQ_LV_TIMERA, timer0_irq);
	IRQ_Install(TMRIRQ1, IRQ_LV_TIMERA, timer1_irq);
	IRQ_Install(TMRIRQ2, IRQ_LV_TIMERA, timer2_irq);
	IRQ_Install(TMRIRQ3, IRQ_LV_TIMERA, timer3_irq);
	IRQ_Install(TMRIRQ4, IRQ_LV_TIMERA, timer4_irq);
	IRQ_Install(TMRIRQ5, IRQ_LV_TIMERA, timer5_irq);

	return 0;
}


/*******************************************************************************
    Routine Name    ：timera_set
    Form            ：int timera_set(int ch, int us, int (*vector)(int));
    Parameters      ：ch                使用するタイマー番号 (0～MAXTMCH)
                      us                割り込み時間 (μＳ)
                      (*vector)(int)    割り込み発生時処理ルーチン
    Return value    ：実行結果（常に0）
    Description     ：タイマー設定＆カウント開始
*******************************************************************************/
int timera_set(int ch, int us, int (*vector)(int))
{
	int   ret;
	int   divd;
	int   count;
	ULONG base;
	ULONG ctrl;

	if((ch>=0) && (ch<=MAXTMCH) && (timer[ch].used == 0) && (us >= 0))
	{
		count = us * SYSCLK;
		base = (ULONG)count;

		for(divd=0; (divd <= MAXTMDIVD) && (base >= MAXTMCOUNT); divd++)
		{
			base = base >> 1;
		}

		if((divd<=MAXTMDIVD) && (base<MAXTMCOUNT))
		{
			base = (MAXTMCOUNT - 1ul) - base;
			ctrl = (ULONG)divd << TIMECNTL_CLKSEL;
			ctrl |= TIMECNTL_EN;
	
			timer[ch].vector = vector;
			timer[ch].count = 0;
			timer[ch].used = 1;

			writew_reg(GET_TIMER_ADDR(TIMEBASE0,ch), (USHORT)base);
			writew_reg(GET_TIMER_ADDR(TIMESTAT0,ch), 0x0001);
			writew_reg(GET_TIMER_ADDR(TIMECNTL0,ch), (USHORT)ctrl);

			ret = 0;
		}
		else
		{
			ret = -1;
			error();	/* Debug!! */
		}
	}
	else
	{
		ret = -1;
		error();	/* Debug!! */
	}
	
	return ret;
}


/*******************************************************************************
    Routine Name    ：auto_timera_set
    Form            ：int auto_timera_set(int us, int (*vector)(int));
    Parameters      ：us                割り込み時間 (μＳ)
                      (*vector)(int)    割り込み発生時処理ルーチン
    Return value    ：使用したタイマー番号(0～MAXTMCH)
    Description     ：タイマー設定＆カウント開始
*******************************************************************************/
int auto_timera_set(int us, int (*vector)(int))
{
	int ch = MAXTMCH;
	int ret;

	while((timer[ch].used != 0) && (ch >= 0))
	{
		ch--;
	}

	if(ch>=0)
	{
		ret = timera_set(ch, us, vector);
		if(ret<0)
		{
			ch = -1;
			error();	/*Debug!!!*/
		}
	}
	else
	{
		ch = -1;
		error();	/*Debug!!!*/
	}
	
	return ch;
}


/*******************************************************************************
    Routine Name    ：timera_over
    Form            ：int timera_over(int ch, int count);
    Parameters      ：ch                使用するタイマー番号 (0～MAXTMCH)
                      count             比較回数
    Return value    ：割り込み発生回数が比較回数未満の場合0を返す
                      比較回数以上の場合1を返す
    Description     ：タイマー割り込み回数チェック
*******************************************************************************/
int timera_over(int ch, int count)
{
	int status;


	
	if((ch>=0) && (ch<=MAXTMCH) && (timer[ch].used==1) && (count>=0))
	{
		if(timer[ch].count < count)
		{
			status = 0;
		}
		else
		{
			status = 1;
		}
	}
	else
	{
		status = -1;
		error();	/*Debug!!!*/
	}

	return status;
}


/*******************************************************************************
    Routine Name    ：timera_stop
    Form            ：int timera_stop(int ch);
    Parameters      ：ch                使用するタイマー番号 (0～MAXTMCH)
    Return value    ：実行結果（常に0）
    Description     ：タイマー停止
*******************************************************************************/
int timera_stop(int ch)
{
	int ret = 0;
	
	if((ch>=0) && (ch<=MAXTMCH) && (timer[ch].used==1))
	{
		writew_reg(GET_TIMER_ADDR(TIMECNTL0,ch), 0x0000);
		writew_reg(GET_TIMER_ADDR(TIMESTAT0,ch), 0x0001);

		timer[ch].vector = 0;
		timer[ch].used = 0;
	}
	else
	{
		ret = -1;
		error();	/*Debug!!!*/
	}

	return ret;
}


/*******************************************************************************
    Routine Name    ：mdelay
    Form            ：void mdelay(int ms);
    Parameters      ：ms                ディレイ時間(ｍ秒)
    Return value    ：
    Description     ：ｍ秒単位のディレイ
*******************************************************************************/
void mdelay(int ms)
{
	int ch;

	ch = auto_timera_set(TM1MS, NULL);

	while(!timera_over(ch, ms))
	{
		/* */
	}

	timera_stop(ch);
}


/*******************************************************************************
    Routine Name    ：udelay
    Form            ：void udelay(int us);
    Parameters      ：us                ディレイ時間(μ秒)
    Return value    ：
    Description     ：μ秒単位のディレイ
*******************************************************************************/
void udelay(int us)
{
	int ch;


	ch = auto_timera_set(us, timera_stop);

	while(!timera_over(ch, 1))
	{
		/* */
	}
}


/****************************************************************************/
static void error(void)
{
	dbg_printf("Error!! Setting of timer...\n");

#ifndef NOT_FAIL_STOP
	for(;;)	/*Dead loop!!*/
	{
		/* */
	}
	/*
	** 本ソースではタイマの設定の誤りがあるとこのルーチン内で無限ループ状態
	** となります
	*/
#endif
}


/*****************************************************************************
// 割り込み処理ルーチン記述例

	割り込み処理ルーチンは必ず void FUNCTION(int); で定義する
	この例ではタイマー割り込みを1msごと発生させ、10秒になったらUARTをブレーク
	状態にし、タイマーを停止する
	
	・・・メインルーチン内
	timera_set(3, 1000, set_uart_break);

	・・・
	void set_uart_break(int ch)
	{
		if(timera_over(ch, 10000)
		{
			uart_break_state = 1;
			timera_stop(ch);
		}
	}

*****************************************************************************/

