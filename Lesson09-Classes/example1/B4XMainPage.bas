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
	Private book1 As clsBook
	Private book2 As clsBook
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	
	book1.Initialize
	book2.Initialize
	
	book1.insertBook("Neuromancer", "William Gibson", "1984", "Ace")
	book2.insertBook("2001: A Space Odyssey", "Arthur C. Clarke", "1968", "Ace")
	
	book1.logBook
	book2.logBook
	
	book1.Writer = "Wil. Gibson" 
	
	Log(book1.Writer) 
	
	
End Sub

