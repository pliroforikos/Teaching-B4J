B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private btnClose As Button
	Private lblTitle As Label
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("frmPage1")
End Sub

Private Sub btnClose_Click
	B4XPages.ClosePage(Me)
End Sub

