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

'1.	The little encyclopedia of dogs. Create an application where 
'four different breeds of dogs are displayed on a home page and 
'after the user clicks on the corresponding name display information 
'about the breed along with two photos.

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private pgGolden As B4XPageGoldenRetriever
	Private pgBeagle As B4XPageBeagle
	Private pgJack As B4XPageJackRussell
End Sub

Public Sub Initialize
	
End Sub
' The purpose of this exercise is to practice in creating B4XPages
' You can also tell pupils to create only 1 B4XPage and send data 
' from mainPage as in classes

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	pgGolden.Initialize
	B4XPages.AddPage("pg1", pgGolden)
	pgBeagle.Initialize
	B4XPages.AddPage("pg2", pgBeagle)
	pgJack.Initialize
	B4XPages.AddPage("pg3", pgJack)
End Sub

Private Sub Button1_Click
	B4XPages.ShowPage("pg1") 
End Sub

Private Sub Button2_Click
	B4XPages.ShowPage("pg2") 
End Sub

Private Sub Button3_Click
	B4XPages.ShowPage("pg3") 
End Sub
