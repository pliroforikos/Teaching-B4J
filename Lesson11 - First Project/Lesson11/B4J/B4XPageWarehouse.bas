B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private lblPhone1 As Label
	Private lblPhone2 As Label
	Private lblPhone3 As Label
	Private lblPhone4 As Label
	Private lblPhone5 As Label
	Private lblPhone6 As Label
	Private lblPhone7 As Label
	Private lblPhone8 As Label
	Private lblQ1 As Label
	Private lblQ2 As Label
	Private lblQ3 As Label
	Private lblQ4 As Label
	Private lblQ5 As Label
	Private lblQ6 As Label
	Private lblQ7 As Label
	Private lblQ8 As Label
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("frmWarehouse")
End Sub

Private Sub B4XPage_Appear 
	loadData	
End Sub

Private Sub loadData
	lblPhone1.Text = B4XPages.MainPage.phone1.strName
	lblPhone2.Text = B4XPages.MainPage.phone2.strName
	lblPhone3.Text = B4XPages.MainPage.phone3.strName
	lblPhone4.Text = B4XPages.MainPage.phone4.strName
	lblPhone5.Text = B4XPages.MainPage.phone5.strName
	lblPhone6.Text = B4XPages.MainPage.phone6.strName
	lblPhone7.Text = B4XPages.MainPage.phone7.strName
	lblPhone8.Text = B4XPages.MainPage.phone8.strName
	lblQ1.Text = B4XPages.MainPage.phone1.intAmount
	lblQ2.Text = B4XPages.MainPage.phone2.intAmount
	lblQ3.Text = B4XPages.MainPage.phone3.intAmount
	lblQ4.Text = B4XPages.MainPage.phone4.intAmount
	lblQ5.Text = B4XPages.MainPage.phone5.intAmount
	lblQ6.Text = B4XPages.MainPage.phone6.intAmount
	lblQ7.Text = B4XPages.MainPage.phone7.intAmount
	lblQ8.Text = B4XPages.MainPage.phone8.intAmount
End Sub


