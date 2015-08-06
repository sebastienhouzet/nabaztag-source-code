@REM
@REM Copyright (c) Microsoft Corporation.  All rights reserved.
@REM
@REM
@REM Use of this source code is subject to the terms of the Microsoft end-user
@REM license agreement (EULA) under which you licensed this SOFTWARE PRODUCT.
@REM If you did not accept the terms of the EULA, you are not authorized to use
@REM this source code. For a copy of the EULA, please see the LICENSE.RTF on your
@REM install media.
@REM
if /i not "%1"=="preproc" goto :Not_Preproc
    goto :EOF
:Not_Preproc
if /i not "%1"=="pass1" goto :Not_Pass1
    goto :EOF
:Not_Pass1
if /i not "%1"=="pass2" goto :Not_Pass2
    goto :EOF
:Not_Pass2
if /i not "%1"=="report" goto :Not_Report
    goto :EOF
:Not_Report
echo %0 Invalid parameter %1
