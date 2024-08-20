How To Run:
- Open powershell in administrator mode and run "Set-ExecutionPolicy -ExecutionPolicy RemoteSigned".
	- This will allow you to run locally generated unsigned scripts, and prevents running unsigned scripts downloaded from the internet.
	- Read more here https://learn.microsoft.com/en-us/powershell/module/microsoft.powershell.core/about/about_execution_policies?view=powershell-7.4
- Right click test_runner.ps1, open properties, and click the checkbox at the bottom to unblock the script, and click apply. 
- Create a shortcut of the script to add to your taskbar or desktop, and to remove the background powershell window when running. 
	- Right click on your desktop, select new > shortcut
		- In the location field, enter "pwsh.exe -noprofile -windowstyle hidden" followed by the FULL path of test_runner.ps1 in quotes.
		- Example: pwsh.exe -noprofile -windowstyle hidden "C:\azure-sdk-for-java\sdk\storage\scripts\testRunner\test_runner.ps1"
	- Click next, give the shortcut a name, and click finish. Then, you can drag it onto your taskbar if you want.

I also included a little icon if you want to use that in case you have other scripts in your task bar and you need to differentiate them: 
- Right click your shortcut, select properties, select change icon, select browse, and find testRunnerIcon.ico in the testRunner folder.
