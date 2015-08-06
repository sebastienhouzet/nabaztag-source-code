/*******************************************************************************
    m674kapi.h
    JOB60842サンプルプログラム
    ML674000 共通ヘッダ

    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/
#ifndef	_M674KAPI_H
#define	_M674KAPI_H

/*----------------------------------------------------------------------------
  システム設定定数定義
----------------------------------------------------------------------------*/
/* JOB60842設定値 (固定値) */
#define CPURAMBase		0x10000000l			/*内部RAM*/
#define CPURAMSize		(1024*8)			/*8KBytes*/

#define ExtRAM1Base		0x00C00000l			/*外部メモリ1*/
#define ExtRAM1Size		(1024*512)			/*512KBytes*/

#define ExtRAM2Base		0xD0000000l			/*外部メモリ2*/
#define ExtRAM2Size		(1024*512)			/*512Bytes*/

#define ExtRAM3Base		0xC0000000l			/*外部メモリ3*/
#define ExtRAM3Size		(1024*2048)			/*2MBytes*/

#define ExtFlashBase	0x00800000l			/*搭載Flashメモリ*/
#define ExtFlashSize	(1024*512)			/*512KByte*/

#define SYSCLK			32					/*動作クロック周波数(MHz)*/

/* 割り込みレベル指定 */
#ifndef IRQ_LV_UART
#define IRQ_LV_UART		0					/*割り込みレベル UART*/
#endif

#ifndef IRQ_LV_SIO
#define IRQ_LV_SIO		0					/*割り込みレベル SIO*/
#endif

#ifndef IRQ_LV_TIMERA
#define IRQ_LV_TIMERA	0					/*割り込みレベル 汎用タイマー*/
#endif

#ifndef IRQ_LV_EIR0
#define IRQ_LV_EIR0		0					/*割り込みレベル 外部0*/
#endif

#ifndef IRQ_LV_EIR1
#define IRQ_LV_EIR1		0					/*割り込みレベル 外部1*/
#endif

#ifndef IRQ_LV_EIR2
#define IRQ_LV_EIR2		0					/*割り込みレベル 外部2*/
#endif

#ifndef IRQ_LV_EIR3
#define IRQ_LV_EIR3		0					/*割り込みレベル 外部3*/
#endif

#ifndef LINEBUFSIZE
#define LINEBUFSIZE		128					/*print文の最大文字列長*/
#endif

/*----------------------------------------------------------------------------
  定数定義
----------------------------------------------------------------------------*/
#ifndef NULL
#define	NULL		0
#endif

/* IRQレベル制御レジスタ フィールド */
#define IRQLEVELMAX	7
#define IRN_MASK	0x1Ful
#define ILR_MASK	0x7ul
#define ILR0		0x00000001ul
#define ILR1		0x00000010ul
#define ILR4		0x00010000ul
#define ILR6		0x01000000ul
#define ILR8		0x00000001ul
#define ILR9		0x00000010ul
#define ILR10		0x00000100ul
#define ILR11		0x00001000ul
#define ILR12		0x00010000ul
#define ILR13		0x00100000ul
#define ILR14		0x01000000ul
#define ILR15		0x10000000ul
#define ILR16		0x00000001ul
#define ILR18		0x00000010ul
#define ILR20		0x00000100ul
#define ILR22		0x00001000ul
#define ILR24		0x00010000ul
#define ILR26		0x00100000ul
#define ILR28		0x01000000ul
#define ILR30		0x10000000ul

/* DMA転送 */
#define TRM_DREQ	0x00ul	/* DMA転送 DREQあり */
#define TRM_AUTO	0x01ul	/* DMA転送 オートリクエスト */

#define TSIZ_8		0x00ul	/* DMA転送 データサイズ 8ビット */
#define TSIZ_16		0x02ul	/* DMA転送 データサイズ 16ビット */
#define TSIZ_32		0x04ul	/* DMA転送 データサイズ 32ビット */

#define SDP_CONT	0x00ul	/* DMA転送 ソースアドレス 固定 */
#define SDP_INC		0x08ul	/* DMA転送 ソースアドレス インクリメント */

#define DDP_CONT	0x00ul	/* DMA転送 ディステネーションアドレス 固定 */
#define DDP_INC		0x10ul	/* DMA転送 ディステネーションアドレス インクリメント */

#define BRQ_BURST	0x00ul	/* DMA転送 バーストモード */
#define BRQ_CYCLE	0x20ul	/* DMA転送 サイクルスチールモード */

#define IMK_DIS		0x00ul	/* DMA転送 割り込みマスク解除 */
#define IMK_ENA		0x40ul	/* DMA転送 割り込みマスク設定 */

#define DMACSIZ_MAX	0x10000ul	/* DMA転送 最大回転数 */

#define DMASTA_STA0 	0x0000001ul	/* DMA転送 ステータス CH0 */
#define DMASTA_STA1 	0x0000002ul	/* DMA転送 ステータス CH1 */

#define DMAINT_ISTX0	0x00010100ul	/* DMA転送 終了ステータス CH0 */
#define DMAINT_ISTX1	0x00020200ul	/* DMA転送 終了ステータス CH1 */

/*----------------------------------------------------------------------------
  グローバル変数定義
----------------------------------------------------------------------------*/


/*----------------------------------------------------------------------------
  レジスタアクセスマクロ定義
----------------------------------------------------------------------------*/
typedef	unsigned char				UCHAR;
typedef	unsigned short				USHORT;
typedef	unsigned long				ULONG;
typedef	volatile unsigned char		VUCHAR;
typedef	volatile unsigned short		VUSHORT;
typedef	volatile unsigned long		VULONG;

#define	read_reg(n)		_read_reg(n)			/* 1Byte read  */
#define	write_reg(n,c)	_write_reg((n),(c))		/* 1Byte write */
#define	readw_reg(n)	_readw_reg(n)			/* 2Byte read  */
#define	writew_reg(n,c)	_writew_reg((n),(c))	/* 2Byte write */
#define	readl_reg(n)	_readl_reg(n)			/* 4Byte read  */
#define	writel_reg(n,c)	_writel_reg((n),(c))	/* 4Byte write */


/* 1Byte Read */
__inline UCHAR _read_reg(ULONG addr)
{
	UCHAR data = *(VUCHAR *)(addr);
	return data;
}

/* 2Byte Read */
__inline USHORT _readw_reg(ULONG addr)
{
	USHORT data = *(VUSHORT *)(addr);
	return data;
}

/* 4Byte Read */
__inline ULONG _readl_reg(ULONG addr)
{
	ULONG data = *(VULONG *)(addr);
	return data;
}

/* 1Byte write */
__inline void _write_reg(ULONG addr, UCHAR data)
{
	*(VUCHAR *)(addr) = (UCHAR)(data);
}

/* 2Byte write */
__inline void _writew_reg(ULONG addr, USHORT data)
{
	*(VUSHORT *)(addr) = (USHORT)(data);
}
/* 4Byte write */
__inline void _writel_reg(ULONG addr, ULONG data)
{
	*(VULONG *)(addr) = (ULONG)(data);
}


/*----------------------------------------------------------------------------
  プロトタイプ宣言
----------------------------------------------------------------------------*/
int cpu_init(void);							/*CPUの初期化*/
int sdram_init(void);						/*DRAMコントローラの初期化*/

int IRQ_Install(int, int, void (*)(void));	/*IRQ割り込みベクターの設定*/
void IRQ_Handler(void);						/*IRQ割り込みハンドラー*/

int dmemcpy(void *, void *, int);           /*DMAxメモリコピー*/
int dma_start(int ,void *, void *, int);	/*DMAスタート*/
int dma_stop(int);                          /*DMAストップ */


/*----------------------------------------------------------------------------
  コンソール入出力
----------------------------------------------------------------------------*/
/* print文 */
#define con_printf  sio_printf
#define con_getc    sio_getc

/* デバッグ出力 print文 */
#ifdef DEBUG
  #define dbg_printf sio_printf
#else
  __inline void dbg_printf(char * fmt, ...) { ; }	/* 無効文 */
#endif

#endif	/* _M671KAPI_H */
