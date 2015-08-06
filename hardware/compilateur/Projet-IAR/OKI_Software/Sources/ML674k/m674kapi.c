/*******************************************************************************
    m674kapi.c
    JOB60842サンプルプログラム
    ML674000 共通ルーチン

    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/
#include <stdio.h>
#include "config.h"


/*----------------------------------------------------------------------------*/
/*グローバル変数定義*/
#define IRQ_NUM (32)
static struct _IRQ_Table{ 
	void (*Vector)(void);
}IRQ_Table[IRQ_NUM];				/*IRQ割り込みベクターテーブル*/

/*----------------------------------------------------------------------------*/
/*プロトタイプ宣言*/
static int peri_init(void);			/*周辺I/Oの初期化*/
static int IRQ_init(void);			/*IRQ割り込みコントローラ初期化*/


/*----------------------------------------------------------------------------*/
/*定数*/
#define BWC_VALUE	(0x000000A8)	/* バス幅設定 */
#define ROMAC_VALUE	(0x00000003)	/* 外部ROM設定 */
#define RAMAC_VALUE	(0x00000001)	/* 外部RAM設定 */
#define IO0AC_VALUE	(0x00000001)	/* 外部IOバンク0設定 */

									/* 汎用ポートの設定 */
#define GPCTL_VALUE (0x0004u |      /* 外部バスアドレス */           \
                     0x0008u | 		/* DMA0イネーブル */				\
					 0x0010u | 		/* DMA1イネーブル */				\
					 0x0040u | 		/* 外部ウェイト信号イネーブル */	\
					 0x0080u )		/* XWR信号イネーブル */

#define DBWC_VALUE	(0x00000002)	/* DRAMバス幅設定 16bit */
#define DRMC_VALUE	(0x00000080)	/* DRAMコントロール設定 */ 
#define DRPC_VALUE	(0x00000000)	/* DRAM特性パラメータ設定 */ 
#define SDMD_VALUE	(0x00000081)	/* SDRAMモード設定 CL=2 */
#define RDWC_VALUE	(0x00000003)	/* SDRAMパワーダウンコントロール */
#define RFSH0_VALUE	(0x00000000)	/* SDRAMリフレッシュサイクル0 x2 */
#define RFSH1_VALUE	(500)			/* SDRAMリフレッシュサイクル1 64KHz @32MHx*/

#define DCMD_PALL	(0x00000004)	/* SDRAM全バンクプリチャージ */
#define DCMD_REF	(0x00000004)	/* SDRAM CBRリフレッシュ */
#define DCMD_SELF	(0x00000006)	/* SDRAMセルフリフレッシュ開始 */
#define DCMD_SREX	(0x00000007)	/* SDRAMセルフリフレッシュ停止 */


/*******************************************************************************
    Routine Name    ：cpu_init
    Form            ：int cpu_init(void);
    Parameters      ：
    Return value    ：実行結果
    Description     ：CPUの初期化
*******************************************************************************/
int cpu_init(void)
{
	int ret;

	ret = peri_init();

	if(ret>=0)
	{
		ret = IRQ_init();
	}
	
	if(ret>=0)
	{
		ret = timera_init();
	}

	if(ret>=0)
	{
		ret = sio_init();
	}
	
#ifdef USE_SDRAM
	if(ret>=0)
	{
		sdram_init();
	}
#endif

	return ret;
}


/*******************************************************************************
    Routine Name    ：peri_init
    Form            ：static int peri_init(void);
    Parameters      ：
    Return value    ：実行結果(常に0を返す)
    Description     ：周辺I/Oの初期化
*******************************************************************************/
static int peri_init(void)
{
	/* バス幅設定 */
	writel_reg(BWC, BWC_VALUE);
	
	/* 外部ROM設定 */
	writel_reg(ROMAC, ROMAC_VALUE);

	/* 外部SRAM設定 */
	writel_reg(RAMAC, RAMAC_VALUE);

	/* 外部IOバンク0設定 */
	writel_reg(IO0AC, IO0AC_VALUE);

	/* 汎用ポートの設定 */
	writew_reg(GPCTL, GPCTL_VALUE);

	return 0;
}


/*******************************************************************************
    Routine Name    ：sdram_init
    Form            ：static int sdram_init(void);
    Parameters      ：
    Return value    ：実行結果(常に0を返す)
    Description     ：DRAMコントローラの初期化
*******************************************************************************/
int sdram_init(void)
{
	int i;

	/* DRAMコントローラの設定 */
	writel_reg(DBWC, DBWC_VALUE);
	writel_reg(DRPC, DRPC_VALUE);

	writel_reg(DCMD, DCMD_PALL);

	for(i = 0; i < 8; i++)
	{
		writel_reg(DCMD, DCMD_REF);
	}

	writel_reg(DRMC, DRMC_VALUE);
	writel_reg(SDMD, SDMD_VALUE);
	writel_reg(RFSH0, RFSH0_VALUE);
	writel_reg(RFSH1, RFSH1_VALUE);
	writel_reg(RDWC, RDWC_VALUE);
	writel_reg(DCMD, DCMD_SREX);

	return 0;
}


/*******************************************************************************
    Routine Name    ：IRQ_init
    Form            ：static int IRQ_init(void);
    Parameters      ：
    Return value    ：実行結果
    Description     ：IRQ割り込みコントローラ初期化
*******************************************************************************/
static int IRQ_init(void)
{
	int i;
	
	writel_reg(ILC0, 0x00000000);
	writel_reg(ILC1, 0x00000000);
	writel_reg(ILC, 0x00000000);
	
	write_reg(CILCL, 0xFE);

	for(i=0 ; i<IRQ_NUM; i++)
	{
		IRQ_Table[i].Vector = NULL;
	}

	return 0;
}


/*******************************************************************************
    Routine Name    ：IRQ_Handler
    Form            ：void __irq IRQ_Handler(void);
    Parameters      ：
    Return value    ：
    Description     ：IRQ割り込みハンドラー
*******************************************************************************/
void __irq IRQ_Handler(void)
{
	int   level;
	int   request;

	request = readl_reg(IRN) & IRN_MASK;
	level = readl_reg(CILE) & ILR_MASK;
	
	if(IRQ_Table[request].Vector != NULL)
	{
		IRQ_Table[request].Vector();
	}
	else
	{
		/* デバッグのリロード時の異常割り込み対策 */
		IRQ_Install(request, 0, NULL);
	}
	
	if(level>0)
	{
		writel_reg(CIL, (0xFFul<<level) & 0xFEul);
	}

}


/*******************************************************************************
    Routine Name    ：IRQ_Install
    Form            ：int IRQ_Install(int number, int level, void (*vector)(void));
    Parameters      ：number            割り込み番号
                      level             割り込みレベル
                      (*vector)(void)   割り込みベクタ
    Return value    ：実行結果
    Description     ：IRQ割り込みの設定
*******************************************************************************/
int IRQ_Install(int number, int level, void (*vector)(void))
{
	int   ret;
	ULONG reg;
	ULONG bit;
	ULONG mask;
	ULONG work;

	switch(number)
	{
	case STMIRQ:
		reg = ILC0; 
		bit = ILR0; 
		break;
	case WDTIRQ:
	case WDTITVIRQ:
		reg = ILC0; 
		bit = ILR1; 
		break;
	case GPIOAIRQ:
	case GPIOBIRQ:
		reg = ILC0; 
		bit = ILR4; 
		break;
	case SOFTIRQ:
		reg = ILC1; 
		bit = ILR8; 
		break;
	case UARTIRQ:
		reg = ILC1; 
		bit = ILR9; 
		break;
	case SIOIRQ:
		reg = ILC1; 
		bit = ILR10; 
		break;
	case ADIRQ:
		reg = ILC1; 
		bit = ILR11; 
		break;
	case PWM0IRQ:
		reg = ILC1; 
		bit = ILR12; 
		break;
	case PWM1IRQ:
		reg = ILC1; 
		bit = ILR13; 
		break;
	case TMRIRQ0:
	case TMRIRQ1:
		reg = ILC;  
		bit = ILR16; 
		break;
	case TMRIRQ2:
	case TMRIRQ3:
		reg = ILC;  
		bit = ILR18; 
		break;
	case TMRIRQ4:
	case TMRIRQ5:
		reg = ILC;  
		bit = ILR20; 
		break;
	case DMAIRQ0:
	case DMAIRQ1:
		reg = ILC;  
		bit = ILR24; 
		break;
	case EIRQ0:
	case EIRQ1:
		reg = ILC;  
		bit = ILR28; 
		break;
	case EIRQ2:
	case EIRQ3:
		reg = ILC;  
		bit = ILR30; 
		break;
	default:
		reg = 0;
		bit = 0;
	}

	if((level>=0) && (level<=IRQLEVELMAX) && (reg>0ul))
	{
		IRQ_Table[number].Vector = vector;
		
		work = readl_reg(reg);
		mask = bit * ILR_MASK;
		work = work & ~mask ;
		mask = bit * (ULONG)level;
		work = work | mask;
		writel_reg(reg, work);
		ret = 0;
	}
	else
	{
		ret = -1;
	}

	return ret;
}	


/*******************************************************************************
    Routine Name    ：dmemcpy
    Form            ：int dmemcpy(void *dest, void *src, int size);
    Parameters      ：dest              デスティネーションアドレス
                      src               ソースアドレス
                      size              コピーサイズ
    Return value    ：実行結果
    Description     ：DMAを使用したメモリ間のデータコピー
*******************************************************************************/
int dmemcpy(void *dest, void *src, int size)
{
	int   ret;
	ULONG status;

	/*DMA停止*/
	write_reg(DMACMSK1, 1);

	/*ステータスクリア*/
	writel_reg(DMACCINT1, 0);

	/*転送モード*/
	writel_reg(DMACTMOD1, TRM_AUTO	/*オートリクエスト*/
						| TSIZ_16  	/*転送サイズ16b*/
						| SDP_INC	/*ソースアドレスインクリメント*/
						| DDP_INC	/*ディステネーションアドレスインクリメント*/
						| BRQ_BURST	/*バースト*/
						| IMK_ENA	/*割り込みマスク設定*/
	);

	/*ソースアドレス*/
	writel_reg(DMACSAD1, (ULONG)src);

	/*ディステネーションアドレス*/
	writel_reg(DMACDAD1, (ULONG)dest);

	if((ULONG)size <= (DMACSIZ_MAX * sizeof(short)))
	{

		/*転送回数*/
		writel_reg(DMACSIZ1, ((ULONG)size /sizeof(short)));

		/*DMA開始*/
		writel_reg(DMACMSK1, 0);

		/*ステータスチェック*/
		do
		{
			status = readl_reg(DMASTA);
		}while((status & DMASTA_STA1) != 0ul);

		/*DMA停止*/
		write_reg(DMACMSK1, 1);

		status = readl_reg(DMAINT);
		if((status & DMAINT_ISTX1) == 0ul)
		{
			ret = 0;
		}
		else
		{
			dbg_printf(" DMA: src=%08X dest=%08X count=%08X status=%08X\n",
				readl_reg(DMACSAD1), readl_reg(DMACDAD1), readl_reg(DMACSIZ1), status);
			dbg_printf(" DMA: erorr!!\n");
			ret = -1;
		}
	}
	else
	{
		ret = -1;
	}

	return ret;
}


/*******************************************************************************
    Routine Name    ：dma_start
    Form            ：int dma_start(int dir, void *device, void *memory, int size);
    Parameters      ：dir               転送方向
                                        1: デバイス→メモリ
                                        0: メモリ→デバイス
                      device            デバイスアドレス（DREQあり）
                      memory            メモリアドレス
                      size              セットサイズ
    Return value    ：実行結果
    Description     ：DMAを使用したメモリ間のデータコピー
*******************************************************************************/
int dma_start(int dir, void *device, void *memory, int size)
{
	ULONG dma_dir;


	/*DMA停止*/
	writel_reg(DMACMSK0, 1);

	/*ステータスクリア*/
	writel_reg(DMACCINT0, 0);

	if(dir==1)
	{
		/* メモリ → 外部デバイス */
		dma_dir = SDP_INC	/*ソースアドレスインクリメント*/
				| DDP_CONT;	/*ディステネーションアドレス固定*/

		/*ソースアドレス*/
		writel_reg(DMACSAD0, (ULONG)memory);

		/*ディステネーションアドレス*/
		writel_reg(DMACDAD0, (ULONG)device);

	}
	else
	{
		/* 外部デバイス → メモリ */
		dma_dir = SDP_CONT	/*ソースアドレス固定*/
				| DDP_INC;	/*ディステネーションアドレスインクリメント*/

		/*ソースアドレス*/
		writel_reg(DMACSAD0, (ULONG)device);

		/*ディステネーションアドレス*/
		writel_reg(DMACDAD0, (ULONG)memory);

	}

	/*転送モード*/
	writel_reg(DMACTMOD0, TSIZ_16  	/*転送サイズ16b*/
						| dma_dir	/*転送方向*/
						| BRQ_CYCLE	/*サイクルスチール*/
						| IMK_ENA	/*割り込みマスク設定*/
	);


	/*転送回数*/
	if((ULONG)size > (DMACSIZ_MAX * sizeof(short)))
	{
		writel_reg(DMACSIZ0, DMACSIZ_MAX);
	}
	else
	{
		writel_reg(DMACSIZ0, ((ULONG)size / sizeof(short)));
	}

	/*DMA開始*/
	writel_reg(DMACMSK0, 0);

	return 0;
}


/*******************************************************************************
    Routine Name    ：dma_stop
    Form            ：int dma_stop(int mode);
    Parameters      ：mode              停止モード
                                        1: 転送完了待ち
                                        0: 強制停止
    Return value    ：実行結果
    Description     ：DMA転送の停止
*******************************************************************************/
int dma_stop(int mode)
{
	int   ret = 0;
	ULONG status;

	/* 転送完了待ち */
	if( mode == 1 )
	{
		do
		{
			status = readl_reg(DMASTA);
		}while((status & DMASTA_STA0) != 0ul);
	}

	/*DMA停止*/
	write_reg(DMACMSK0, 1);

	/* 転送完了待ち時、実行結果確認 */
	if( mode == 1 )
	{
		status = readl_reg(DMAINT);
		if((status & DMAINT_ISTX0) == 0ul)
		{
			ret = 0;
		}
		else
		{
			dbg_printf(" DMA: src=%08X dest=%08X count=%08X status=%08X\n",
				readl_reg(DMACSAD0), readl_reg(DMACDAD0), readl_reg(DMACSIZ0), status);
			dbg_printf(" DMA: erorr!!\n");
			ret = -1;
		}
	}

	return ret;
}


/* end of file */
