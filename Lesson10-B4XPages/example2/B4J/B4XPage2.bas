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
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("page2")
	
	lblGlobal1.Text = B4XPages.MainPage.txtGlobal.Text
	lblGlobal2.Text = B4XPages.MainPage.page1.txtGlobal2.Text
End Sub


Private Sub btnBack_Click
	B4XPages.ClosePage(Me)
End Sub