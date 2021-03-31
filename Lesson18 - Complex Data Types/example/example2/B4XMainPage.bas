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
	Private lstItems As List 

	Private B4XComboBox1 As B4XComboBox
	Private CustomListView1 As CustomListView
	Private lblDate As Label
	Private lblCmbDate As Label
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	lstItems.Initialize
	lstItems.AddAll(Array As String("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"))

	B4XComboBox1.SetItems(lstItems) 
	For i = 0 To lstItems.Size-1 
		CustomListView1.AddTextItem(lstItems.Get(i), i)

	Next
End Sub


Private Sub Button1_Click
	xui.MsgboxAsync("Hello world!", "B4X")
End Sub


Private Sub CustomListView1_ItemClick (Index As Int, Value As Object)
		lblDate.Text = Value 
End Sub

Private Sub B4XComboBox1_SelectedIndexChanged (Index As Int)
	lblCmbDate.Text = Index 
End Sub