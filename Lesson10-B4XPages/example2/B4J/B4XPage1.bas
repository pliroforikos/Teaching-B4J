B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private lblGlobal1 As Label
	Private lblGlobal2 As Label
	Public txtGlobal2 As TextField
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("page1")
	lblGlobal1.Text = B4XPages.MainPage.txtGlobal.Text
End Sub

'Private Sub B4XPage_Appear 
'	lblGlobal1.Text = B4XPages.MainPage.txtGlobal.Text
'End Sub

Private Sub btnPage2_Click
	B4XPages.ShowPage("myPage2")
End Sub

Private Sub btnBack_Click
	B4XPages.ClosePage(Me)
End Sub

