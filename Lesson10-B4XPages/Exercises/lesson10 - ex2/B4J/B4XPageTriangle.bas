B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private txtA As TextField
	Private txtB As TextField
	Private txtC As TextField
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("frmTriangle")
	txtA.Text = 0
	txtB.Text = 0
	txtC.Text = 0
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub btnCalculate_Click
	Private a, b, c
	a = txtA.Text
	b = txtB.Text
	If a <> 0 And b <> 0 Then
		c = Sqrt( a*a + b*b)
		txtC.Text = c
	End If

End Sub

