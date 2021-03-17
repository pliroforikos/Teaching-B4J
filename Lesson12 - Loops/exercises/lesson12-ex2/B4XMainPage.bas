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
	Private lblAverage As Label
	Private txtNumber As TextField
	Private intSum, intCount As Int 
	Private fltAvr As Float
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	intCount = 0
	intSum = 0
End Sub

Private Sub Button1_Click
	If txtNumber.text <> 0 And txtNumber.Text <> "" Then
		intCount = intCount + 1
		intSum = intSum + txtNumber.text
		fltAvr = intSum / intCount
		lblAverage.Text = fltAvr
	Else
		intCount = 0
		intSum = 0
		lblAverage.Text = 0
	End If
End Sub