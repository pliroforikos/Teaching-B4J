B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private lbllName As Label
	Private lblQuantity As Label
	Private lblTotal As Label
	Private txtAddress As TextField
	Private txtName As TextField
	Private txtSurname As TextField
End Sub


'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub


'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("frmSell")
End Sub


Private Sub B4XPage_Appear
	loadValues
End Sub


Private Sub loadValues
	lbllName.Text = B4XPages.MainPage.pgPhones.pgShowPhone.lbllName.Text
	lblQuantity.Text = B4XPages.MainPage.pgPhones.pgShowPhone.txtQuantity.Text
	lblTotal.Text = B4XPages.MainPage.pgPhones.pgShowPhone.lblTotal.Text
End Sub


Private Sub btnSell_Click
	If B4XPages.MainPage.pgPhones.intPhoneClicked = 1 Then
		B4XPages.MainPage.phone1.intAmount = B4XPages.MainPage.phone1.intAmount - lblQuantity.Text
	else if B4XPages.MainPage.pgPhones.intPhoneClicked = 2 Then
		B4XPages.MainPage.phone2.intAmount = B4XPages.MainPage.phone2.intAmount - lblQuantity.Text
	else If B4XPages.MainPage.pgPhones.intPhoneClicked = 3 Then
		B4XPages.MainPage.phone3.intAmount = B4XPages.MainPage.phone3.intAmount - lblQuantity.Text
	else if B4XPages.MainPage.pgPhones.intPhoneClicked = 4 Then
		B4XPages.MainPage.phone4.intAmount = B4XPages.MainPage.phone4.intAmount - lblQuantity.Text
	else If B4XPages.MainPage.pgPhones.intPhoneClicked = 5 Then
		B4XPages.MainPage.phone5.intAmount = B4XPages.MainPage.phone5.intAmount - lblQuantity.Text
	else if B4XPages.MainPage.pgPhones.intPhoneClicked = 6 Then
		B4XPages.MainPage.phone6.intAmount = B4XPages.MainPage.phone6.intAmount - lblQuantity.Text
	else If B4XPages.MainPage.pgPhones.intPhoneClicked = 7 Then
		B4XPages.MainPage.phone7.intAmount = B4XPages.MainPage.phone7.intAmount - lblQuantity.Text
	else if B4XPages.MainPage.pgPhones.intPhoneClicked = 8 Then
		B4XPages.MainPage.phone8.intAmount = B4XPages.MainPage.phone8.intAmount - lblQuantity.Text
	End If 
	
	B4XPages.MainPage.fltTotalIncome = B4XPages.MainPage.fltTotalIncome + lblTotal.Text
	B4XPages.ShowPageAndRemovePreviousPages("MainPage")
End Sub


Private Sub btnBack_Click
	B4XPages.ClosePage(Me)
End Sub

