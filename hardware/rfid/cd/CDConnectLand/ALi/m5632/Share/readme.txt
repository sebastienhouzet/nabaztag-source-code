------------------------------------------------------------------
 ALi USB HostLink Controller VirtualNetwork/SuperLink Installation 
               for Windows 98/Me/2000/XP Platform
                          Jan 2003
------------------------------------------------------------------
 (c) Copyright ALi Corporation 2002. All Rights Reserved
------------------------------------------------------------------

--------
CONTENTS
--------
1. Introduction 
2. Installation
3. Install VirtualNetwork solution
4. Install uperLink solution

1. Introduction
==============================
ALi USB Host Link controller solution provides two software solutions in one 
installation package, i.e., "USB Super Link" and "USB Virtual Network" to be 
optionally installed. However, these two solutions should NOT co-exist in one 
computer system due to operating system support and hardware limitation.

The "USB Super Link" software package provides a software tool SuperLink.exe to 
enable end-user being capable of accessing remote file data in remote computer's 
storage device(s) through a simple drag&drop procedure. While the "USB Virtual 
Network" software package is developed to be an NDIS-compliant solution by 
emulating a virtual LAN interoperability among peer-to-peer end-users' computers. 

2. Installation									
================================================================================
This package provides setup utility to automatically install/uninstall/upgrade the driver. 
User also can use Windows' installation wizard to install/uninstall/upgrade driver.
But, we recommend to use the Setup utility.
The following steps teach user how to use the setup utility.

Run setup utility from the sub-directory.

The setup utility is developed to be able to install/uninstall/upgrade and switch 
between ALi's VirtualNetwork or SuperLink drivers support. ALi's VirtualNetwork and SuperLink
software packages are different types of driver solutions to support ALi's USB Host 
link controller product.  To prevent any unnecessary system confusion and mis-operation, 
the setup utility will automatically detect whether any prior version of VirtualNetwork 
or SuperLink drivers has been installed, and ask end-user to select his target application 
usage from beginning. 

3. Install VirtualNetwork solution						
================================================================================
1) Run setup.exe
   a) Select "USB Virtual Network Adapter"
   b) If it is the first time to install VirtualNetwork, the default option is just 
      to install VirtualNetwork.
   c) If VirtualNetwork has been installed, there will be an option item prompting up to ask 
      end-user whether to reinstall or to remove(uninstall) VirtualNetwork. Please choose one
      option.
   d) If SuperLink has been installed, there will be an option item prompting up to ask 
      end-user whether to only remove SuperLink, or to remove SuperLink and install VirtualNetwork . 
      Please choose one option as needed.
2) Click button "Next".
3) Click button "Finish" to complete the installation.
4) If end-user chooses to install VirtualNetwork in step 1), then plugging ALi's USB Host Link 
   Controller module into the USB port of both PCs. 

   For Windows 2000 and Windows XP, it is to be noted that user should click "Next" 
   directly, when the O.S. reminds user that the provided drivers doesn't have a digital signature.

5) Wait for system to generate IP address. This action will usually take around 30 
   seconds, depending on overall system configuration applied.
   Under Windows 98 during System generating IP address,System will be busy about 30 seconds,please 
   be patient.
   Under Windows Me/2000/XP during System generating IP address,the IP address is 0.0.0.0,please be
   patient until the real IP address is generated.

4. Install SuperLink solution							
================================================================================
1) Run setup.exe
   a) Select "USB Super Link Adapter"
   b) If it is the first time to install SuperLink, the default option is just 
      to install Super Link.
   c) If SuperLink has been installed, there will be an option item prompting up to ask
      uers whether to reinstall or to remove(uninstall) SuperLink. Please choose one 
      option.
   d) If VirtualNetwork has been installed, there will be an option item prompting up to ask
      user whether to only remove VirtualNetwork or to remove VirtualNetwork and install 
      SuperLink. Please choose one option.
2) Choose the SuperLink application executable file (with path).
3) Click button "Next".
4) Click button "Finish" to complete installation.
5) If end-user chooses to install SuperLink in step 1), then plugging ALi USB Host Link 
   Controller device into the USB port of both PCs. 

   For Windows XP, it is to be noted that user should click "Next" 
   directly, when the system O.S. reminds user that the provided drivers doesn't 
   have a digital signature.
