B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private lblQuantity As Label
	Private lblTotal As Label
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("frmTotal")
End Sub

Private Sub B4XPage_Appear 
	Private total As Float 
	total =  B4XPages.MainPage.txtPC1.text * B4XPages.MainPage.lblPC1.text + B4XPages.MainPage.txtPC2.text * B4XPages.MainPage.lblPC2.text + _
			 B4XPages.MainPage.txtPC3.text * B4XPages.MainPage.lblPC3.text + B4XPages.MainPage.txtPC4.text * B4XPages.MainPage.lblPC4.text
	lblQuantity.Text = B4XPages.MainPage.txtPC1.text + B4XPages.MainPage.txtPC2.text + _
					   B4XPages.MainPage.txtPC3.text + B4XPages.MainPage.txtPC4.text
	lblTotal.Text = total
End Sub
