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
	Public lblPc1 As Label
	Public lblPc2 As Label
	Public lblPc3 As Label
	Public lblPc4 As Label
	Public txtPC1 As TextField
	Public txtPc2 As TextField
	Public txtPc3 As TextField
	Public txtPc4 As TextField
	Private pgTotal As B4XPageTotal
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	pgTotal.Initialize
	B4XPages.AddPage("pgTotal", pgTotal)
	
	lblPc1.Text = 799
	lblPc2.Text = 599
	lblPc3.Text = 499
	lblPc4.Text = 569
	txtPC1.Text = 0
	txtPc2.Text = 0
	txtPc3.Text = 0
	txtPc4.Text = 0
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Button1_Click
	B4XPages.ShowPage("pgTotal") 
End Sub

