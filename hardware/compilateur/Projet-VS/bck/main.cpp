// VLISP Virtual Machine - 2006 - by Sylvain Huet
// Lowcost IS Powerfull


#define DUMPBC

#include<stdio.h>
extern "C" {
#include"vmem.h"
#include"vloader.h"
#include"vinterp.h"
#include"properties.h"
int simuInit();

// fonction à appeler régulièrement, pour traiter les messages de la fenêtre du simulateur
int simuDoLoop();

// réglagle d'une led
void simuSetLed(int i,int val);

// réglagle d'un moteur
void simuSetMotor(int i,int val);

}

char srcbytecode[65536];


void dump(uchar *src,int len)
{
  int i,j;
  char buffer[64];
  printf("\n");
  for(i=0;i<len;i+=16)
  {
    printf("%04x ",i);
    for(j=0;j<16;j++) if (i+j<len)
    {
      printf(buffer,"%02x ",src[i+j]);
    }
    else printf("   ");
    for(j=0;j<16;j++) if (i+j<len) printf("%c",(((src[i+j]>=32)&&(src[i+j]<128))?src[i+j]:'.'));
    printf("\n");
//    DelayMs(100);
  }
}


void loadbytecode(char *src)
{
	FILE *f;
	int i,n;
	f=fopen(src,"rb");
	if (!f)
	{
		printf("file %s not found\n",src);
		return;
	}
	n=fread(srcbytecode,1,65536,f);
	fclose(f);

#ifdef DUMPBC
	f=fopen("dumpbc.c","wb");
	if (f)
	{
		fprintf(f,"const unsigned char dumpbc[%d]={\n",n);
		for(i=0;i<n;i++)
		{
			fprintf(f,"0x%02x",srcbytecode[i]&255);
			if (i+1<n) fprintf(f,",");
			if (!((i+1)&0xf)) fprintf(f,"\n");
		}
		fprintf(f,"\n};\n");
		fclose(f);
	}
#endif
}


int vcompDoit(char *starter);

extern unsigned char dumpbc[];

int main(int argc,char **argv)

{
	PropLoad("config.txt");
	if (!vcompDoit(PropGet("SOURCE")))
	{
		loadbytecode("foo.bin");

		vmemInit(0);
		if (!strcmp(PropGet("BOOT"),"firmware"))
		{
			loaderInit((char*)dumpbc);
		}
		else
		{
			loaderInit(srcbytecode);
		}
		vmemDumpShort();
		getchar();

		simuInit();

		VPUSH(INTTOVAL(0));
		interpGo();
		VPULL();
		while(1)
		{
			simuDoLoop();
			VPUSH(VCALLSTACKGET(sys_start,SYS_CBLOOP));
			if (VSTACKGET(0)!=NIL) interpGo();
			VPULL();
			Sleep(50);
		}
		getchar();
	}
	return 0;
}