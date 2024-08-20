How To Run:
- Open powershell in administrator mode and run "Set-ExecutionPolicy -ExecutionPolicy RemoteSigned".
	- This will allow you to run locally generated unsigned scripts, and prevents running unsigned scripts downloaded from the internet.
	- Read more here https://learn.microsoft.com/en-us/powershell/module/microsoft.powershell.core/about/about_execution_policies?view=powershell-7.4
- Right click test_runner.ps1, open properties, and click the checkbox at the bottom to unblock the script, and click apply. 
- Run launch.bat to launch the UI.

