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
End Sub

Public Sub Initialize
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	Private intA, intB, intC As Int
	intA = 20
	intB = 10
	intC = 300
	
	Log(sMax(intA, intB, intC))	' Shows 300
End Sub

Private Sub sMax(a As Int, b As Int, c As Int) As Int
	Private intM As Int
	intM = a
	If b > intM Then
		intM = b
	End If
	If c > intM Then
		intM = c
	End If
	
	Return(intM)
End Sub

