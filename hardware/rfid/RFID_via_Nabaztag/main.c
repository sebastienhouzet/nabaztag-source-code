/*************************************************************************************/
/*                                                                                   */
/*      Copyright (C) 2005 Oki Electric Industry Co., LTD.                           */
/*                                                                                   */
/*      System Name     :  ML674051/ML67Q4061                                        */
/*      Module Name     :  Demo code for AME-51 Board                                */
/*      File   Name     :  demo.c                                                    */
/*      Revision        :  1.00                                                      */
/*      Date            :  2005/05/18                                                */
/*                          Initial version                                          */
/*                                                                                   */
/*************************************************************************************/
#include "ML674061.h"
#include "common.h"
#include "irq.h"
#include "spi.h"
#include "led.h"
#include "mem.h"
#include "uart.h"
#include "debug.h"
#include "usbh.h"

#include "delay.h"
#include "audio.h"
#include "motor.h"
#include "usbctrl.h"
#include "ml60842.h"
#include "hcdmem.h"
#include "hcd.h"
#include "inarm.h"
#include "i2c.h"
#include "rt2501usb.h"
#include "rfid.h"
#include<stdio.h>
#include<string.h>

#include"vmem.h"
#include"vloader.h"
#include"vinterp.h"
#include"vnet.h"
#include"vaudio.h"
#include"vlog.h"


#define MHz      (1000000L)
#define TMRCYC   (10)             /* interval of timer interrupt (ms) */
//#define CCLK     (32*MHz)       /* CCLK (Hz) */
#define CLKGEAR  (1)              /* clock gear */
//#define CLKTMR   (CCLK/CLKGEAR) /* frequency of CLKTMR terminal (Hz) */
#define SYSCLK	(32)	          /* SYSCLK (MHz)*/
#define VALUE_OF_TMRLR            /* reload value of timer */\
                (65536 - (TMRCYC * SYSCLK * 1000) / 16)

#if ((VALUE_OF_TMRLR) < 0 || 0x10000 <= (VALUE_OF_TMRLR))
#error "Invalid value : VALUE_OF_TMRLR"
#endif

/*************/
/* Functions */
/*************/
int main(void);                     /* main routine */
static void reg_irq_handler(void);  /* registration of IRQ handler */
void FIQ_handler(void);
void init_io(void);
void push_button_interrupt(void);
void uart0_interrupt(void);
void timer_handler(void);

/* JOB */
void *okijob_open( void );
int okijob_close( void* );
int okijob_bulk( void*, unsigned char, void*, unsigned long );
int okijob_number(void*);

/********************/
/* Global variables */
/********************/
extern UBYTE dummy_buffer[100];
uchar UART_BUFFER[UART_BUFFER_SIZE];
volatile uchar uart_buffer_pointer;
uchar motor_state=0;

volatile int counter_timer;
volatile int counter_timer_s;
volatile int counter_timer_sbuf;


//USB variables
int old_state = 0;
int connect_request = 0;
int transfer_request = 0;

#ifndef DATABUFFER
  #define DATABUFFER		0
#endif

/* DATABUFFER==0 ML60841“à•”RAM‚ðƒoƒbƒtƒ@‚É‚·‚é */
/* DATABUFFER==1 ŠO•”RAM‚ðƒoƒbƒtƒ@‚É‚·‚é        */
#if (DATABUFFER==0)
  #define MALLOC(a)			usbh_malloc(a)
  #define FREE(a)			usbh_free(a)
#else
  #define MALLOC(a)			malloc(a)
  #define FREE(a)			free(a)
#endif

extern const unsigned char dumpbc[21204];












//const uchar TAB_32K[100000];

/****************************************************************************/
/*  Init clock system to have 32MHz with 8MHz external crystal              */
/*  Function : init_pll                                                     */
/*      Parameters                                                          */
/*          Input   :   Nothing                                             */
/*          Output  :   0                                                   */
/****************************************************************************/
void init_pll(void)
{
  //Configure PLLA and PLLB
  put_wvalue(PLL1, 0x31013110);
  put_wvalue(PLL2, 0x00030101);
    //PLLDIVA=0x01
    //DVCOA=0x10=0d16
    //DREFA=0x01
    //SVCOA=0x3
    //PLLDIVB=0x01
    //DVCOB=0x01
    //DREFB=0x01
    //SVCOB=0x3
    //PLLDIVC=0x03
  //setup of CLOCK register (CLKCNT@0xB700_0010)
  put_wvalue(CLKCNT, 0x000D0109);
     //APB Clock = CPU Clock
    //System Clock active
    //Ring oscillator active
    //PLLA active
    //PLLA inactive
    //Source = Ring oscillator
    //CLKDIVA = 1/4
    //CLKDIVB = 8/8
  clr_wbit(CLKCNT, 0x00000300);
    //Source = Sysclock
  clr_wbit(CLKCNT, 0x00040000);
    //Stop Ring oscillator
  set_wbit(PECLKCNT,0x18000000);
    //active GPIO11 and GPIO12 peripheral clock => XD16 to XD31
}

void wdt_start(void)
{
  put_value(INTST,0x3c);  //release write protection
  put_value(INTST,0x00);  //Clear status bit

  put_value(TBGCON,0x5A);  //release write protection
  put_value(TBGCON,0x45);  //Watchdog clock = APB_CLK/1024 => 32us @32MHz => overflow each 2.09s
                           //generates reset when overflow ; Turn ON counter

  put_value(OVFAST,0x63);  //assert time to be ouput from the RSTOUT_N pin of 100us

  put_value(WDTCON,0x3C);  //Start watchdog

  //Clear watchdog
//  put_value(WDTCON,0xC3);
//  put_value(WDTCON,0x3C);

}

char dbg_buffer[256];
static struct rt2501_scan_result sresult;

char* scanssid;
void scantest(struct rt2501_scan_result *scan_result, void *userparam)
{
    if (!strcmp(scan_result->ssid,scanssid))
	memcpy(&sresult, scan_result, sizeof(struct rt2501_scan_result));
}

void dump(uchar *src,int len)
{
  int i,j;
  char buffer[64];
  putst_uart("\r\n");
  for(i=0;i<len;i+=16)
  {
    sprintf(buffer,"%04x ",i);
    putst_uart((UBYTE*)buffer);
    for(j=0;j<16;j++) if (i+j<len)
    {
      sprintf(buffer,"%02x ",src[i+j]); putst_uart((UBYTE*)buffer);
    }
    else putst_uart("   ");
    for(j=0;j<16;j++) if (i+j<len) putch_uart(((src[i+j]>=32)&&(src[i+j]<128))?src[i+j]:'.');
    putst_uart("\r\n");
//    DelayMs(100);
  }
}

void dumpbin(char* p,int n,int ln)
{
  int i;
  char buffer[6];
  for(i=0;i<n;i++)
  {
    sprintf(buffer,"%02x.",(p[i])&255);
    putst_uart((UBYTE*)buffer);
  }
  if (ln) putst_uart("\r\n");
}

uchar tstarp[]=
{
  0xaa,0xaa,0x03,0x00,0x00,0x00,0x08,0x06,

  0x00,0x01,0x08,0x00,
  0x06,0x04,0x00,0x01,
  0,0,0,0,0,0,
  0,0,0,0,
  0xff,0xff,0xff,0xff,0xff,0xff,
  0,0,0,0

//  0x00,0x0c,0xf6,0x1b,0xa8,0x06,
//  192,168,1,100,
//  0xff,0xff,0xff,0xff,0xff,0xff,
//  192,168,1,2
};

uchar myip[4]={  192,168,1,100 };
uchar targetip[4]={  192,168,100,1 };
uchar targetmac[6]={255,255,255,255,255,255};

extern unsigned char rt2501_mac[6];

void mkarp(uchar* ip)
{
DBG("1\r\n");
  memcpy(tstarp+16,rt2501_mac,6);
DBG("2\r\n");
  memcpy(tstarp+22,myip,4);
DBG("3\r\n");
  memcpy(tstarp+32,ip,4);
DBG("4\r\n");
}

BYTE checkflag,checklo,checkhi;

void init_checksum()
{
    checkflag = checkhi = checklo = 0;
}

/* Add byte to checksum value */
void check_byte(BYTE b)
{
    if (checkflag)
    {
        checklo += b;
        if (checklo < b)
        {
            if (++checkhi == 0)
                checklo++;
        }
    }
    else
    {
        checkhi += b;
        if (checkhi < b)
        {
            if (++checklo == 0)
                checkhi++;
        }
    }
    checkflag = !checkflag;
}

uchar tstudp[]=
{
  0xaa,0xaa,0x03,0x00,0x00,0x00,0x08,0x00,

  0x45,0,0,20+8+6,
  0,1,0,0,
  100,17,0,0,
  0,0,0,0,
  0,0,0,0,

  8,0,16,0,
  0,8+6,0,0,
  'f','o','o','b','a','r'
};

uchar tstfoo[]=
{
  192,168,1,2,
  192,168,1,6
};

char idudp;

void mkudp()
{
  int i;
  idudp=0;
  tstudp[8+5]=idudp++;
  memcpy(tstudp+8+12,myip,4);
  memcpy(tstudp+8+16,targetip,4);
  init_checksum();
  for(i=0;i<20;i++)check_byte(tstudp[8+i]);

  tstudp[8+10]=~checkhi;
  tstudp[8+11]=~checklo;

  init_checksum();
  for(i=0;i<8+6;i++)check_byte(tstudp[8+20+i]);

  for(i=12;i<20;i++)check_byte(tstudp[8+i]);
  check_byte(0);
  check_byte(17);
  check_byte(0);
  check_byte(8+6);

  tstudp[8+20+6]=~checkhi;
  tstudp[8+20+7]=~checklo;

  DBG("checksum :"); dumpbin((char*)(tstudp+8+10),2,1);
  DBG("checksum :"); dumpbin((char*)(tstudp+8+20+6),2,1);

}

void mypassword_to_pmk(const char *password, char *ssid, int ssidlength, unsigned char *pmk);

extern uchar buffer_temp[4096];

/****************************************************************************/
/*  Entry point                                                             */
/*  Function : main                                                         */
/*      Parameters                                                          */
/*          Input   :   Nothing                                             */
/*          Output  :   0                                                   */
/****************************************************************************/

int stacktest;
int* foo;//=&stacktest;//(int*)0xD000FFFC;












  // Les leds à allumer
  #define LED1 3
  #define LED2 2
  #define LED3 1
  
  // Adresses des lecteurs
  #define LECTEUR1 0xA0
  #define LECTEUR2 0xA2
  #define LECTEUR3 0xA4
  
  #define T 1
  #define F 0


// Passe les leds en blanc
void LedsON(UWORD masque, int pas) {
  int i;
  
  // Vers les leds Blanches
  for(i=0; i<0xFF; i = i + pas) {
    set_led(LED1, (i * 0x010000 + i * 0x0100 + i) & masque);
    set_led(LED2, (i * 0x010000 + i * 0x0100 + i) & masque);
    set_led(LED3, (i * 0x010000 + i * 0x0100 + i) & masque);
    DelayMs(14);
    CLR_WDT;
  }
}

int ResetRfids() {
  int i;
  int j;
  int retour;
  
  retour = 0;
  
  // On allume les leds vers le blanc
  LedsON(0xFFFFFF, 0x015);
  
  // On initilise les 3 lecteurs
  for(i=0; i<3; i++)
  {
    // On sélectionne le lecteur
    if(i==0) rfidsetdev(LECTEUR1);
    if(i==1) rfidsetdev(LECTEUR2);
    if(i==2) rfidsetdev(LECTEUR3);
    
    // On initialise le lecteur
    j = init_rfid();
    if(!j) retour = 1;
    
    // Si il n'y a pas d'erreur on éteint la led du lecteur
    if(i==0 && j)   set_led(LED1, 0x000000);
    if(i==1 && j)   set_led(LED2, 0x000000);
    if(i==2 && j)   set_led(LED3, 0x000000);
    
    // Si il y a une erreur on l'écrit
    if(i==0 && !j)  putst_uart("Init RFID1 : Error\n\r");
    if(i==1 && !j)  putst_uart("Init RFID2 : Error\n\r");
    if(i==2 && !j)  putst_uart("Init RFID3 : Error\n\r");
  }
  
  return retour;
}

// Attente si != 1
void WaitIfError(int Error) {
  if(Error != 0) {
    // Attente
    while(INT_SWITCH_READ&INT_SWITCH_BIT) {
      DelayMs(14);
      CLR_WDT; }
    putst_uart("Fin Erreur\n\r");
  }
}

// Lecture du bon RfidReader
char* ReadRfid(int Lecteur) {
  char* TagsRfid;
  
  rfidsetdev(Lecteur);
  TagsRfid = get_rfid_first_device();
  CLR_WDT;
  return TagsRfid;
}

// Vérification du nombre de tag
int TagsLen(char* TagsRfid) {
  int i = 0;
  if(TagsRfid) {
    while(TagsRfid[i] != 0) {
      i++;
      CLR_WDT;
    }
  }
  return i;
}

















int main(void)
{
  // Variables
  
  UBYTE *address;
  
  __disable_interrupt();
#if (PCB_RELEASE == LLC2_3) || (PCB_RELEASE == LLC2_4c)
  init_pll();
#elif PCB_RELEASE == LLC2_2
  put_wvalue(CLKCNT, 0x00080000);
#endif
  
  set_bit(PECLKCNT, 0x08000000);
  
  //Init I/O directions and default values
  init_io();
  
  //initialize IRQ
  init_irq();
  
  //Setup external SRAM/ROM
  setup_ext_sram_rom();
  
  //Flash ROM programming is permitted
  init_uc_flash();
  
  //Watch dog
  wdt_start();
  
  //Init System timer
  // set TMRLR for 1ms @ 32MHz
  put_hvalue(TMRLR, 0xF830);
  //Run timer
  put_value(TMEN, 0x01);
  
  // Initialisation
  counter_timer=0;
  counter_timer_s=0;
  counter_timer_sbuf=0;
  
  //registration of IRQ handler
  reg_irq_handler();

  setup_malloc();

  //Enable interrupts
  __enable_interrupt();
  
  //Init ADC
  put_hvalue(ADCON0, 0x0000);
  put_hvalue(ADCON1, ADCON1_CH2);   //Set Channel
  put_hvalue(ADCON2, ADCON2_CLK32);   //Set conversion time, minimum 800ns, so 33MHz/32 => 100

  //Configure SPI0
  init_spi();
  //Init LED driver
  init_led_rgb_driver();
  //Configure I2C
  init_i2c();
  
  //Init RAM of USB host
  for(address=(UBYTE*)ComRAMAddr; address<(UBYTE*)(ComRAMAddr+ComRAMSize); address++)
    put_value(address, 0x00);
  
  //Init Uart
  uart_buffer_pointer=0;
  init_uart();
  
  CLR_WDT;
  
  
  
  
  
  
  
  /************************************ FIN INITIALISATION
  ************************************* SYSTEME PRET
  ************************************* */
  
  
  
  
  putst_uart("\n\rStart\n\r");
  
  char* TagsRfid;   // Retour des tags RFID
  int i = 0;        // Variable temporaire
  int j = 0;        // Variable temporaire
  int k = 0;        // Variable temporaire
  int l = 0;        // Variable temporaire
  int L, R;         // L : led actuel, R : Reader actuel
  uchar x,y;        //
  char reset = T;   // Variable pour réinitialiser les lecteurs
  char error = F;   // Variable pour une erreur
  UWORD couleur = 0;// Couleur de la lumière
  
  // Les tags
  uchar Tag1[9];
  uchar Tag2[9];
  uchar Tag3[9];

  // On allume les leds lentement vers le blanc
  LedsON(0xFFFFFF, 0x02);
  
  WaitIfError(ResetRfids());
  
  while(1) {
    
    CLR_WDT;
    
    k = 0;
    
    for(j=0; j<3; j++) {
      if(j==0) { L = LED1; R = LECTEUR1; }
      if(j==1) { L = LED2; R = LECTEUR2; }
      if(j==2) { L = LED3; R = LECTEUR3; }
      
      // Lecture des tags
      TagsRfid = ReadRfid(R);
      
      // On vérifie le nombre de tag
      i = TagsLen(TagsRfid) / 8;
      
      // Si il n'y a pas de tag > lumière rouge
      if(i==0) set_led(L, 0xFF0000);
      
      // Si il y a un tag > lumière verte
      if(i==1) {
        set_led(L, 0x00FF00);
        if(j == 0) {
          for(l=0; l<8; l++)
            Tag1[l] = TagsRfid[l];
          Tag1[l] = 0; // caractere de fin
        }
        if(j == 1) {
          for(l=0; l<8; l++)
            Tag2[l] = TagsRfid[l];
          Tag2[l] = 0; // caractere de fin
        }
        if(j == 2) {
          for(l=0; l<8; l++)
            Tag3[l] = TagsRfid[l];
          Tag3[l] = 0; // caractere de fin
        }
        k++;
      }
      
      // Si il y a plus d'un tag > lumière clair
      if(i>1) { set_led(L, 0x00AAFF); }
    }
    
    if(k==3 && !(INT_SWITCH_READ&INT_SWITCH_BIT)) {
      // Si les tags sont différents
      j=0;
      k=0;
      l=0;
      for(i=0; i<8; i++) {
        if(Tag1[i] != Tag2[i]) j++;
        if(Tag2[i] != Tag3[i]) k++;
        if(Tag3[i] != Tag1[i]) l++;
      }
      
      if(j != 0 && k != 0 && l != 0) {
      
        putst_uart("L1:");
        for(j=0; j<8; j++) {
          x = (int)Tag1[j]>>4;
          y = (int)Tag1[j]&0x0F;
          puthx_uart(x);
          puthx_uart(y);
        }
        putst_uart("\n\r");
        
        putst_uart("L2:");
        for(j=0; j<8; j++) {
          x = (int)Tag2[j]>>4;
          y = (int)Tag2[j]&0x0F;
          puthx_uart(x);
          puthx_uart(y);
        }
        putst_uart("\n\r");
        
        putst_uart("L3:");
        for(j=0; j<8; j++) {
          x = (int)Tag3[j]>>4;
          y = (int)Tag3[j]&0x0F;
          puthx_uart(x);
          puthx_uart(y);
        }
        putst_uart("\n\r");
        CLR_WDT;
      }
      else
        LedsON(0x0000FF, 0x07);
    }
  }

}

























































/****************************************************************************/
/*  Registration of IRQ Handler                                             */
/*  Function : reg_irq_handler                                              */
/*      Parameters                                                          */
/*          Input   :   Nothing                                             */
/*          Output  :   Nothing                                             */
/*  Note : Initialize of IRQ needs to be performed before this process.     */
/****************************************************************************/
void reg_irq_handler(void)
{
    /* register IRQ handlers into handler table */
    IRQ_HANDLER_TABLE[INT_EXINT2] = usbctrl_interrupt;
    IRQ_HANDLER_TABLE[INT_EXINT3] = push_button_interrupt;
    IRQ_HANDLER_TABLE[INT_UART0] = uart0_interrupt;
    IRQ_HANDLER_TABLE[INT_SYSTEM_TIMER] = timer_handler;

    /* setup interrupt level */
    //Configure EXINT2 for USB interrupt
    clr_hbit(EXIDM,IDM_IDM36 & IDM_IDMP36); //set Low level for IRQ
    //Clear EXINT2 interrupt
    set_hbit(EXIRQB,IRQB_IRQ36);
    //Enable EXINT2 interrupts
    set_wbit(EXILCB,ILC_ILC36 & ILC_INT_LV7);

    /* setup interrupt level */
/*
    //Configure EXINT3 for Push Button interrupt
    clr_hbit(EXIDM,IDM_IDM38 & IDM_IDMP38); //set Low level for IRQ
    //Clear EXINT3 interrupt
    set_hbit(EXIRQB,IRQB_IRQ38);
    //Enable EXINT3 interrupts
    set_wbit(EXILCB,ILC_ILC38 & ILC_INT_LV6);
*/
    /* setup interrupt level */
    //Enable UART0 interrupts
    set_wbit(ILC1, ILC1_ILR9 & ILC1_INT_LV7 );

    /* setup interrupt level */
    //Enable System Timer interrupt
    set_wbit(ILC0, ILC0_ILR0 & ILC0_INT_LV7);

    return;
}

/****************************************************************************/
/*  Process of the System Timer interrupt                                   */
/*  Function : timer_handler                                                */
/*      Parameters                                                          */
/*          Input   :   Nothing                                             */
/*          Output  :   Nothing                                             */
/****************************************************************************/
void timer_handler(void)
{
    counter_timer++;            //increment 1ms, 10ms or 100ms cycle counter
    counter_timer_sbuf++;
    if (counter_timer_sbuf>=1000)
    {
      counter_timer_s++;
      counter_timer_sbuf=0;
    }
    put_value(TMOVF,0x01);      //clear overflow register (write '1' in TMOVF[0])
    return;
}

/****************************************************************************/
/*  Process of the FIQ interrupt                                            */
/*  Function : FIQ_handler                                                  */
/*      Parameters                                                          */
/*          Input   :   Nothing                                             */
/*          Output  :   Nothing                                             */
/****************************************************************************/
void FIQ_handler(void)
{
    /* Clear FIQ flag*/
     put_value(EXFIQ, 0x01 );
     __no_operation();
    return;
}

/****************************************************************************/
/*  Process of the UART0 interrupt                                          */
/*  Function : uart0_interrupt                                              */
/*      Parameters                                                          */
/*          Input   :   Nothing                                             */
/*          Output  :   Nothing                                             */
/****************************************************************************/
void uart0_interrupt(void)
{
    //Save received byte in the UART buffer
    uchar c=get_value(UARTRBR0);
    UART_BUFFER[uart_buffer_pointer] = c;

    // update write pointer
    uart_buffer_pointer++;
    if(uart_buffer_pointer >= UART_BUFFER_SIZE)
        uart_buffer_pointer = 0;
}

/****************************************************************************/
/*  Process of the Push button interrupt                                    */
/*  Function : push_button_interrupt                                        */
/*      Parameters                                                          */
/*          Input   :   Nothing                                             */
/*          Output  :   Nothing                                             */
/****************************************************************************/
void push_button_interrupt(void)
{
  //delay to avoid multiple interrupts
    DelayMs(250);

    //Run USB transmit
    transfer_request=1;

    //Update motor state
    if(motor_state++==6)
      motor_state=0;

    //Clear EXINT3 interrupt
    set_hbit(EXIRQB,IRQB_IRQ38);
}

int push_button_value()
{
  if (INT_SWITCH_READ&INT_SWITCH_BIT) return 0;
  return 1;
}

/****************************************************************************/
/*  Init GPIO initial directions and values ; define the function of pins   */
/*  Function : init_io                                                      */
/*      Parameters                                                          */
/*          Input   :   Nothing                                             */
/*          Output  :   Nothing                                             */
/****************************************************************************/
void init_io(void)
{
  //Set primary functions of ports
  put_wvalue(PORTSEL1,0x00000000);
  put_wvalue(PORTSEL2,0x00000000);
  put_wvalue(PORTSEL3,0x00000000);
  put_wvalue(PORTSEL4,0x00000000);
  put_wvalue(PORTSEL5,0x00000000);
  //Set all pins as inputs
  put_value(PM0,0x00);
  put_value(PM1,0x00);
  put_value(PM2,0x00);
  put_value(PM3,0x00);
  put_value(PM4,0x00);
  put_value(PM5,0x00);
  put_value(PM6,0x00);
  put_value(PM7,0x00);
  put_value(PM8,0x00);
  put_value(PM9,0x00);
  put_value(PM10,0x00);
  put_value(PM11,0x00);
  put_value(PM12,0x00);
  put_value(PM13,0x00);
  put_value(PM14,0x00);

  //Set secondary function for XD16 to XD31 => GPIO
  set_wbit(PORTSEL4,0x00000040);
#if (PCB_RELEASE == LLC2_3) || (PCB_RELEASE == LLC2_4c)
#ifdef MOTOR_SPEED_CONTROL
  //Set secondary function for PF0 to PF3  => Timer0 to Timer 5
  set_wbit(PORTSEL3,0x05550000);
#else
  //Set secondary function for PF0 to PF1  => Timer0 to Timer 1
  set_wbit(PORTSEL3,0x00050000);
#endif
#elif PCB_RELEASE == LLC2_2
  //Set secondary function for PF0 to PF5  => Timer0 to Timer 5
  set_wbit(PORTSEL3,0x05550000);
#endif
  //Set secondary function for PB0 and PB1  => TX_RS232 and RX_RS232
  set_wbit(PORTSEL1,0x00050000);
  //Set tertiary function for PD0 => EXINT2, secondary funtion for PD2 => ADC2
  //tertiary funtion for PD1 => EXINT3
  set_wbit(PORTSEL2,0x001A0000);
  //Set secondary function for PB4 and PB5  => I2C bus : SCL + SDA
  set_wbit(PORTSEL1,0x05000000);

#if PCB_RELEASE == LLC2_4c

  //Set I/O directions
  CS_AUDIO_AMP_AS_OUTPUT;
  CS_LED_AS_OUTPUT;
  MODE_LED_AS_OUTPUT;
  CS_AUDIO_SCI_AS_OUTPUT;
  INT_AUDIO_AS_INPUT;
  WAIT_USB_AS_INPUT;
  RST_AUDIO_AS_OUTPUT;
  INT_USB_AS_INPUT;
  INT_SWITCH_AS_INPUT;
  CS_AUDIO_SDI_AS_OUTPUT;
  PWM_MCC1_AS_OUTPUT;
  PWM_MCC2_AS_OUTPUT;
  PWM_MCC3_AS_OUTPUT;
  PWM_MCC4_AS_OUTPUT;

  //Set I/O initial values
  CS_AUDIO_AMP_CLEAR;
  CS_LED_SET;
  MODE_LED_CLEAR;
  CS_AUDIO_SCI_SET;
  RST_AUDIO_CLEAR;
  CS_AUDIO_SDI_SET;
  PWM_MCC1_CLEAR;
  PWM_MCC2_CLEAR;
  PWM_MCC3_CLEAR;
  PWM_MCC4_CLEAR;

#elif PCB_RELEASE == LLC2_3

  //Set I/O directions
  CS_AUDIO_AMP_AS_OUTPUT;
  CS_LED_AS_OUTPUT;
  MODE_LED_AS_OUTPUT;
  CS_AUDIO_SCI_AS_OUTPUT;
  INT_AUDIO_AS_INPUT;
  WAIT_USB_AS_INPUT;
  RST_AUDIO_AS_OUTPUT;
  CS_FLASH_AS_OUTPUT;
  INT_USB_AS_INPUT;
  INT_SWITCH_AS_INPUT;
  CS_AUDIO_SDI_AS_OUTPUT;
  PWM_MCC1_AS_OUTPUT;
  PWM_MCC2_AS_OUTPUT;
  PHASE_MCC1_AS_OUTPUT;
  PHASE_MCC2_AS_OUTPUT;

  //Set I/O initial values
  CS_AUDIO_AMP_CLEAR;
  CS_LED_SET;
  MODE_LED_CLEAR;
  CS_AUDIO_SCI_SET;
  RST_AUDIO_CLEAR;
  CS_FLASH_SET;
  CS_AUDIO_SDI_SET;
  PWM_MCC1_CLEAR;
  PWM_MCC2_CLEAR;
  PWM_MCC3_CLEAR;
  PWM_MCC4_CLEAR;
  PHASE_MCC1_CLEAR;
  PHASE_MCC2_CLEAR;

#elif PCB_RELEASE == LLC2_2
  //Set I/O directions
  CS_LED_AS_OUTPUT;
  MODE_LED_AS_OUTPUT;
  CS_AUDIO_AMP_AS_OUTPUT;
  RST_AUDIO_AS_OUTPUT;
  CS_AUDIO_SDI_AS_OUTPUT;
  CS_AUDIO_SCI_AS_OUTPUT;
  CMD_MCC0_AS_OUTPUT;
  CMD_MCC1_AS_OUTPUT;
  CMD_MCC2_AS_OUTPUT;
  CMD_MCC3_AS_OUTPUT;
  WAIT_USB_AS_INPUT;
  INT_USB_AS_INPUT;
  INT_AUDIO_AS_INPUT;
  INT_SWITCH_AS_INPUT;

  //Set I/O initial values
  CS_LED_SET;
  MODE_LED_CLEAR;
  CS_AUDIO_AMP_CLEAR;
  RST_AUDIO_CLEAR;
  CS_AUDIO_SDI_SET;
  CS_AUDIO_SCI_SET;
  CMD_MCC0_CLEAR;
  CMD_MCC1_CLEAR;
  CMD_MCC2_CLEAR;
  CMD_MCC3_CLEAR;
#endif
}

void reset_uc(void)
{
  put_value(INTST,0x3c);  //release write protection
  put_value(INTST,0x00);  //Clear status bit

  put_value(TBGCON,0x5A);  //release write protection
  put_value(TBGCON,0x40);  //Watchdog clock = APB_CLK/32 => 1us @32MHz => overflow each 65536us
                           //generates reset when overflow ; Turn ON counter

  put_value(OVFAST,0x63);  //assert time to be ouput from the RSTOUT_N pin of 100us

  put_value(WDTCON,0x3C);  //Start watchdog

  //Clear watchdog
//  put_value(WDTCON,0xC3);
//  put_value(WDTCON,0x3C);

  put_hvalue(WDTCNT,0x5A5A);  //release write protection
  put_hvalue(WDTCNT,0xFF00);  //rewrite counter register to overflow => overflow in 256us
  while(1);
}

