# Microsoft Developer Studio Project File - Name="vlispemu" - Package Owner=<4>
# Microsoft Developer Studio Generated Build File, Format Version 6.00
# ** DO NOT EDIT **

# TARGTYPE "Win32 (x86) Console Application" 0x0103

CFG=vlispemu - Win32 Debug
!MESSAGE This is not a valid makefile. To build this project using NMAKE,
!MESSAGE use the Export Makefile command and run
!MESSAGE 
!MESSAGE NMAKE /f "vlispemu.mak".
!MESSAGE 
!MESSAGE You can specify a configuration when running NMAKE
!MESSAGE by defining the macro CFG on the command line. For example:
!MESSAGE 
!MESSAGE NMAKE /f "vlispemu.mak" CFG="vlispemu - Win32 Debug"
!MESSAGE 
!MESSAGE Possible choices for configuration are:
!MESSAGE 
!MESSAGE "vlispemu - Win32 Release" (based on "Win32 (x86) Console Application")
!MESSAGE "vlispemu - Win32 Debug" (based on "Win32 (x86) Console Application")
!MESSAGE 

# Begin Project
# PROP AllowPerConfigDependencies 0
# PROP Scc_ProjName ""
# PROP Scc_LocalPath ""
CPP=cl.exe
RSC=rc.exe

!IF  "$(CFG)" == "vlispemu - Win32 Release"

# PROP BASE Use_MFC 0
# PROP BASE Use_Debug_Libraries 0
# PROP BASE Output_Dir "Release"
# PROP BASE Intermediate_Dir "Release"
# PROP BASE Target_Dir ""
# PROP Use_MFC 0
# PROP Use_Debug_Libraries 0
# PROP Output_Dir "Release"
# PROP Intermediate_Dir "Release"
# PROP Ignore_Export_Lib 0
# PROP Target_Dir ""
# ADD BASE CPP /nologo /W3 /GX /O2 /D "WIN32" /D "NDEBUG" /D "_CONSOLE" /D "_MBCS" /YX /FD /c
# ADD CPP /nologo /W3 /GX /O2 /D "WIN32" /D "NDEBUG" /D "_CONSOLE" /D "_MBCS" /YX /FD /c
# ADD BASE RSC /l 0x40c /d "NDEBUG"
# ADD RSC /l 0x40c /d "NDEBUG"
BSC32=bscmake.exe
# ADD BASE BSC32 /nologo
# ADD BSC32 /nologo
LINK32=link.exe
# ADD BASE LINK32 kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib /nologo /subsystem:console /machine:I386
# ADD LINK32 kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib winmm.lib wsock32.lib /nologo /subsystem:console /machine:I386

!ELSEIF  "$(CFG)" == "vlispemu - Win32 Debug"

# PROP BASE Use_MFC 0
# PROP BASE Use_Debug_Libraries 1
# PROP BASE Output_Dir "Debug"
# PROP BASE Intermediate_Dir "Debug"
# PROP BASE Target_Dir ""
# PROP Use_MFC 0
# PROP Use_Debug_Libraries 1
# PROP Output_Dir "Debug"
# PROP Intermediate_Dir "Debug"
# PROP Ignore_Export_Lib 0
# PROP Target_Dir ""
# ADD BASE CPP /nologo /W3 /Gm /GX /ZI /Od /D "WIN32" /D "_DEBUG" /D "_CONSOLE" /D "_MBCS" /YX /FD /GZ /c
# ADD CPP /nologo /W3 /Gm /GX /ZI /Od /D "WIN32" /D "_DEBUG" /D "_CONSOLE" /D "_MBCS" /YX /FD /GZ /c
# ADD BASE RSC /l 0x40c /d "_DEBUG"
# ADD RSC /l 0x40c /d "_DEBUG"
BSC32=bscmake.exe
# ADD BASE BSC32 /nologo
# ADD BSC32 /nologo
LINK32=link.exe
# ADD BASE LINK32 kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib /nologo /subsystem:console /debug /machine:I386 /pdbtype:sept
# ADD LINK32 kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib winmm.lib wsock32.lib /nologo /subsystem:console /debug /machine:I386 /pdbtype:sept

!ENDIF 

# Begin Target

# Name "vlispemu - Win32 Release"
# Name "vlispemu - Win32 Debug"
# Begin Group "Source Files"

# PROP Default_Filter "cpp;c;cxx;rc;def;r;odl;idl;hpj;bat"
# Begin Group "vcomp"

# PROP Default_Filter ""
# Begin Source File

SOURCE=.\vcomp\bootstrap.cpp
# End Source File
# Begin Source File

SOURCE=.\vcomp\compiler.cpp
# End Source File
# Begin Source File

SOURCE=.\vcomp\compiler_file.cpp
# End Source File
# Begin Source File

SOURCE=.\vcomp\compiler_prog.cpp
# End Source File
# Begin Source File

SOURCE=.\vcomp\compiler_term.cpp
# End Source File
# Begin Source File

SOURCE=.\vcomp\compiler_type.cpp
# End Source File
# Begin Source File

SOURCE=.\vcomp\compiler_var.cpp
# End Source File
# Begin Source File

SOURCE=.\vcomp\file.cpp
# End Source File
# Begin Source File

SOURCE=.\vcomp\interpreter.cpp
# End Source File
# Begin Source File

SOURCE=.\vcomp\memory.cpp
# End Source File
# Begin Source File

SOURCE=.\vcomp\parser.cpp
# End Source File
# Begin Source File

SOURCE=.\vcomp\parser_xml.cpp
# End Source File
# Begin Source File

SOURCE=.\vcomp\prodbuffer.cpp
# End Source File
# Begin Source File

SOURCE=.\vcomp\stdlib_core.cpp
# End Source File
# Begin Source File

SOURCE=.\vcomp\terminal.cpp
# End Source File
# Begin Source File

SOURCE=.\vcomp\util.cpp
# End Source File
# End Group
# Begin Group "simu"

# PROP Default_Filter ""
# Begin Group "mp3"

# PROP Default_Filter ""
# Begin Source File

SOURCE=.\mp3\COMMON.C
# End Source File
# Begin Source File

SOURCE=.\mp3\dct64_i386.c
# End Source File
# Begin Source File

SOURCE=.\mp3\decode_i386.c
# End Source File
# Begin Source File

SOURCE=.\mp3\interface.c
# End Source File
# Begin Source File

SOURCE=.\mp3\LAYER3.C
# End Source File
# Begin Source File

SOURCE=.\mp3\TABINIT.C
# End Source File
# End Group
# Begin Source File

SOURCE=.\bc.cpp
# End Source File
# Begin Source File

SOURCE=.\main.cpp
# End Source File
# Begin Source File

SOURCE=.\properties.c
# End Source File
# Begin Source File

SOURCE=.\simu.c
# End Source File
# Begin Source File

SOURCE=.\simuaudio.c
# End Source File
# Begin Source File

SOURCE=.\simunet.c
# End Source File
# End Group
# Begin Group "vm"

# PROP Default_Filter ""
# Begin Source File

SOURCE=.\vaudio.c
# End Source File
# Begin Source File

SOURCE=.\vinterp.c
# End Source File
# Begin Source File

SOURCE=.\vloader.c
# End Source File
# Begin Source File

SOURCE=.\vlog.c
# End Source File
# Begin Source File

SOURCE=.\vmem.c
# End Source File
# Begin Source File

SOURCE=.\vnet.c
# End Source File
# End Group
# End Group
# Begin Group "Header Files"

# PROP Default_Filter "h;hpp;hxx;hm;inl"
# Begin Source File

SOURCE=.\vaudio.h
# End Source File
# Begin Source File

SOURCE=.\vbc.h
# End Source File
# Begin Source File

SOURCE=.\vbc_str.h
# End Source File
# Begin Source File

SOURCE=.\vinterp.h
# End Source File
# Begin Source File

SOURCE=.\vloader.h
# End Source File
# Begin Source File

SOURCE=.\vlog.h
# End Source File
# Begin Source File

SOURCE=.\vmem.h
# End Source File
# Begin Source File

SOURCE=.\vnet.h
# End Source File
# End Group
# Begin Group "Resource Files"

# PROP Default_Filter "ico;cur;bmp;dlg;rc2;rct;bin;rgs;gif;jpg;jpeg;jpe"
# End Group
# End Target
# End Project
