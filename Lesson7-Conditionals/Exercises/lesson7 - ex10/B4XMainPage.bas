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
	Private txtDuration As TextField
End Sub

Public Sub Initialize
	
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub

Private Sub btnCalculate_Click
	Private fltFee As Float 
	If txtDuration.Text <= 1 Then
		fltFee = 3.5
	else if txtDuration.Text <= 3 Then
		fltFee = 3.5 + (txtDuration.Text - 1) * 8
	Else if txtDuration.Text <= 5 Then
		fltFee = 3.5 + 16 + (txtDuration.Text - 3) * 12
	Else 
		fltFee = 3.5 + 16 + 24 + (txtDuration.Text - 5) * 15
	End If
	lblMessage.Text = "Total Fee = " & fltFee
End Sub