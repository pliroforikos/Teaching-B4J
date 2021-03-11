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
'	1-500	0.01
'	501-800	0.008
'	801+	0.005
	Private fltCost As Float 
	
	If txtDuration.Text >= 1 And txtDuration.Text < 501 Then
		fltCost = txtDuration.Text * 0.01	
	else if txtDuration.Text >= 501 And txtDuration.Text <= 800 Then
		fltCost = 500 * 0.01 + (txtDuration.Text - 500) * 0.008 
	Else 
		fltCost = 500 * 0.01 + 300 * 0.008 + (txtDuration.Text - 800) * 0.005 
	End If
	
	lblMessage.Text = "Total Cost = " & fltCost & "$" 
	
End Sub