Release Note, PL-2303 Windows 64-bit Driver v2.0.1.8, Prolific Edition
==================================================
 
Requirement:
    . Windows XP x64-bit Edition
    . USB host controller
    . Device using PL-2303H/X/HX controller

Supported device ID:
    VID_067B&PID_2303

Driver Version: v2.0.1.8 (non-logo)
    SER2PL64.SYS 

Driver Remover/Uninstaller:
    DRemover_x64.exe


================================
Driver Installation Procedure:
------------------------------------------

1. Copy driver files to folder in computer.
2. Plug in PL-2303 and wait for Windows to prompt for driver.
3. Browse to the folder containing the driver files and let Windows install the driver.
4. Go to Control Panel-System-Device Manager and check if PL-2303 USB to Serial Port device is properly installed.
    

================================
Known Limitation:
---------------------------
Windows XP Professional x64 Edition HyperTerminal Issue

Symptom:
----------------
The data transfer rate of PL-2303 is very slow when using the new HyperTerminal (5.2.3790.1830) program in Microsoft Windows XP Professional x64 Edition Version 2003 Service Pack 1. 

Cause & Workaround:
---------------------------------
The PL-2303 uses software control to simulate Serial COM port, so the driver needs to send more data in each BulkOut command. However, it seems that the newer version of HyperTerminal (v5.2.3790.1830) in Windows XP Professional x64-Edition is using other method in sending data byte by byte that limits the PL-2303 driver to achieve the transmit rate set by users. 

When using an older version of HyperTerminal (v5.1.2600.0) from Windows XP SP2 (32-bit Version 2002), the data transfer is normal. Prolific is trying to feeback this issue to Microsoft if the HyperTerminal program in Windows x64-bit Edition could be updated. 

Prolific advices not to use the HyperTerminal program (v5.2.3790.1830) in Windows x64-Edition until this limitation is resolved. Prolific recommends to use an older version of HyperTerminal or use other software programs.

 
=================================
Prolific Technology Inc.
http://www.prolific.com.tw
 

