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

'2.	Build an application that solves: 
'a.	the primary equation ax+b=0, 
'b.	the secondary equation ax a2+bx+c=0 And 
'c.	calculates the hypotenuse of a triangle given the dimensions of the two vertical sides.
'It Is given that the square Root of an x number Is calculated by Sqrt(x).

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private pg1 As B4XPagePrimary
	Private pg2 As B4XPageSecondary
	Private pg3 As B4XPageTriangle
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	pg1.Initialize
	B4XPages.AddPage("Primary", pg1)
	pg2.Initialize
	B4XPages.AddPage("Secondary", pg2)
	pg3.Initialize
	B4XPages.AddPage("Triangle", pg3)
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Button1_Click
	B4XPages.ShowPage("Primary")	
End Sub

Private Sub Button3_Click
	B4XPages.ShowPage("Triangle") 
End Sub

Private Sub Button2_Click
	B4XPages.ShowPage("Secondary")
End Sub