// Test_LPT.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

int _tmain(int argc, TCHAR *argv[], TCHAR *envp[])
{
	HANDLE hFile; 
	char lpBuf[]="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890\n\r";
	DWORD err,dwWritten,dwToWrite=sizeof(lpBuf);
	OVERLAPPED osWrite = {0};

	hFile = CreateFile(_T("LPT2:"),				// file to open 
					GENERIC_READ|GENERIC_WRITE,	// open for reading 
					0,							// share for reading 
					NULL,						// default security 
					OPEN_EXISTING,				// existing file only 
					0,     // normal file 
					NULL);                     // no attr. template 
 
	if (hFile == INVALID_HANDLE_VALUE) 
	{ 
		//printf("Could not open file (error %d)\n", GetLastError());
		return 0;
	}
	else
	{
		//printf("Com Port opened success\n\n");
	}
	
    
	
	for(int ii=0; ii<60; ii++)
	{
	
		dwWritten = 0;
		if(!WriteFile(hFile, lpBuf, dwToWrite, &dwWritten,NULL))
		{
			err=GetLastError();
			printf("err=%d\n",err);
		}
		else
		{
			//printf("write call successful & data send to printer port:\n");
		}
	}

	Sleep(1000 * 30 * 1);

	CloseHandle(hFile);
	return 0;
}

