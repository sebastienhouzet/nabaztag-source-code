//-------------------
// MV
// version WIN32 et POCKETPC
// Sylvain Huet
// Derniere mise a jour : 07/01/2003
//


//#include <windows.h>
//#include <windowsx.h>
//#include <wingdi.h>
//#include <commctrl.h>
//#include <commdlg.h>
//#include <string.h>
#include "param.h"

#include <stdio.h>
#include <direct.h>
#include <io.h>

#include "param.h"
#include "prodbuffer.h"
#include "filesystem.h"
#include "file.h"
#include "terminal.h"

#include "memory.h"
#include "util.h"
#include "parser.h"
#include "compiler.h"
#include "interpreter.h"



void AbortMetal(Memory* m,int donotstop)
{
	if (m->abort) return;
	PRINTF(m)(LOG_RUNTIME,"\n---------- end of execution\n");
	m->stop();
}



int StartMetal(HINSTANCE this_inst,int argc,char **argv,char *starter)
{
	int k;

//  passe dans le répertoire de l'executable, en retenant le répertoire courant

	Terminal* t=new Terminal(this_inst);
	Memory* m=new Memory(32*1024,t,NULL);
	t->m=m;

	if (k=m->start())
	{
		t->printf(LOG_RUNTIME,"Launcher : erreur d'initialisation Memory\n");
		return NULL;
	}
	STRPUSH(m,starter);
	if (!(k=m->util->compiler->gocompile(COMPILE_FROMFILE)))
	{
		t->printf(LOG_RUNTIME,"\nCompiler : done !\n");
		File* f=new File(NULL);
		f->openwrite("foo.bin");
		f->write(m->util->compiler->brelease->getstart(),m->util->compiler->brelease->getsize());
		f->close();
		return 0;
	}
	else
	{
		t->printf(LOG_RUNTIME,"Launcher : %s\n\n",m->errorname(k));
		return -1;
	}
}

int vcompDoit(char *starter)
{
	int k=StartMetal(NULL,0,NULL,starter);
	getchar();
	return k;
}
