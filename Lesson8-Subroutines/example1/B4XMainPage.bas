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
	Private intSum As Int
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	Private intA, intB As Int 
	intA = 10
	intB = 30
		
	showSum1(intA, intB)
	Log(intSum)
	
	Log(Sum(intA, intB))
End Sub

Private Sub showSum1(a As Int, b As Int)
	intSum = a + b
	Log(intSum)
End Sub

private Sub Sum(a As Int, b As Int) As Int
	Return(a+b)
End Sub