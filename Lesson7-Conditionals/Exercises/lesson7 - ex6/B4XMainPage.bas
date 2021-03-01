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
	Private lblMessage As Label
	Private txtCost As TextField
	Private txtLocation As TextField
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub



Private Sub btnCalculate_Click
	Private fltShip, fltTotal As Float 
	
	If txtLocation.text = "US" Then 
		fltShip = 3
	else if txtLocation.text = "Europe" Then
		fltShip = 7
	else if txtLocation.text = "Canada" Then
		fltShip = 5
	End If
	fltTotal = fltShip + txtCost.Text 
	
	lblMessage.Text = " You have to pay " & fltTotal & "$, " & txtCost.Text & _
					  "$ for the product and " & fltShip & "$ for shipping cost"

End Sub