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
	Private txtNumber1 As TextField
	Private txtNumber2 As TextField
	Private txtTotal As TextField
	Private btnClear As Button
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub

Private Sub btnClear_Click
	txtTotal.Text = ""
	txtNumber1.Text = ""
	txtNumber2.Text = ""
End Sub

Private Sub btnSub_Click
	txtTotal.Text = txtNumber1.Text - txtNumber2.Text
End Sub

Private Sub btnMult_Click
	txtTotal.Text = txtNumber1.Text * txtNumber2.Text
End Sub

Private Sub btnDiv_Click
	If txtNumber2.Text <> 0 Then 
		txtTotal.Text = txtNumber1.Text / txtNumber2.Text
	End If
End Sub

Private Sub btnSum_Click
	txtTotal.Text = txtNumber1.Text + txtNumber2.Text
End Sub