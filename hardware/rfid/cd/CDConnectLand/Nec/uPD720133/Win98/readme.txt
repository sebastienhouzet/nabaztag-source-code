------------------------------------------------------------------------------
 Release Note

 NEC Electronics uPD720130 USB2.0-ATA/ATAPI Bridge
 USB Mass Storage Class Driver kit for Windows 98 / 98Se

 Kit version 3.0.3.0 : Sep 22. 2003
 Copyright (C) NEC Electronics Corporation 2002-2003. All Rights Reserved.

-----------------------------------------------------------------------------
-------------------
Table of Contents
-------------------
1. Release Files
2. Improvement
3. Remark
4. History

-------------------
1. Release Files
-------------------
2003/08/25  09:12               10,756 necustpd.pdr
2003/09/04  10:11                1,995 Necustor.inf
2003/08/25  09:12               26,488 NECUSTOR.sys
2003/08/25  09:12                8,388 NECUSTFL.sys
2003/08/25  09:07               45,056 Necutray.exe

-------------------
2. Improvement
-------------------
  Improvement of an issue on version 3.0.2.0 that is described below has been made.

  - The issue on version 3.0.2.0 -
   Bluescreen error will happen when connecting the USB2.0 to IDE bridge (uPD720130) 
  with an IDE device to the Adaptec-made USB2.0 Interface board (AUA-200LP/LE) 
  via USB2.0 Hub and pulling out a line after removement operation by the Unplug utility.

    Note: Adaptec's EHCI driver (AUA-2000LP PCI to USB Enhanced Host Controller) is version 3.1.0.

-------------------
3. Remark
-------------------
  If unplugging a USB device after EHCI driver is disabled, a USB device will not be 
 shown below OHCI in the device manager window. This issue will be solved by reboot.

-------------------
4. History
-------------------
--------------------------------------------------
- version 3.0.3.0 : Sep 22. 2003
--------------------------------------------------
 (1) Improve the unplug utility for Adaptec EHCI Driver

--------------------------------------------------
- version 3.0.2.0 : Aug 11. 2003
--------------------------------------------------
 (1) Improve the problems of the unplug utility.

--------------------------------------------------
- version 2.0.0.0 : Jun 25. 2003
--------------------------------------------------
 (1) Change the construction of driver.
 (2) Solve a problem playing video CD. 

--------------------------------------------------
- version 1.3.50 : Jan 17. 2003
--------------------------------------------------
 (1) Update Documents
 (2) Update Inf files
 (3) Support for Installation program

--------------------------------------------------
- version 1.3.40 : Dec 5. 2001
--------------------------------------------------
 Official Release

