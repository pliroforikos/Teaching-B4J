B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private btnCalculate As Button
	Private lblMessage As Label
	Private txtQuantity As TextField
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub



Private Sub btnCalculate_Click
	Private fltTotal As Float 
	
	If txtQuantity.text < 200 Then 
		fltTotal = txtQuantity.text * 0.70
		lblMessage.Text = "Total Cost = " & fltTotal
	Else
		fltTotal = txtQuantity.text * 0.50
		lblMessage.Text = "Total Cost = " & fltTotal
	End If
	
End Sub