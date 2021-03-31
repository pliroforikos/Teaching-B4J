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
	Private lblNumber As Label
	Private fltNumber1, fltNumber2 As Float
	Private operation As String 
	Private done As Boolean 
End Sub

Public Sub Initialize
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	lblNumber.Text = ""
	done = False 
End Sub

Private Sub Number_Click
	Dim b As Button
	b = Sender
	Log(b.Tag)
	If done Then 
		lblNumber.Text = 0 
		done = False 
	End If
	lblNumber.Text = lblNumber.Text & b.Tag
End Sub

Private Sub btnClear_Click
	lblNumber.Text = 0 
	fltNumber1 = 0 
	fltNumber2 = 0
End Sub

Private Sub btnEq_Click
	fltNumber2 =  lblNumber.Text 
	If operation = "+" Then 
	lblNumber.Text = fltNumber1 + fltNumber2
	else If operation = "-" Then
		lblNumber.Text = fltNumber1 - fltNumber2
	else If operation = "*" Then
		lblNumber.Text = fltNumber1 * fltNumber2
	else If operation = "/" Then
		lblNumber.Text = fltNumber1 / fltNumber2
	End If 
	fltNumber1 = lblNumber.Text
	done = True 
End Sub

Private Sub operation_Click
	Dim b As Button
	b = Sender
	operation = b.Tag
	fltNumber1 = lblNumber.Text  
	lblNumber.Text = 0
End Sub