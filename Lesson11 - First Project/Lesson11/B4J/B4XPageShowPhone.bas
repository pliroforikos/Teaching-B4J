B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private lblCPU As Label
	Public  lbllName As Label		' We need this information in Sell Screen
	Private lblMemory As Label
	Private lblOS As Label
	Private lblRam As Label
	Private lblScreen As Label
	Private lblStorage As Label
	Public  lblTotal As Label		' We need this information in Sell Screen
	Public  txtQuantity As TextField ' We need this information in Sell Screen
	
	Public pgSell As B4XPageSell
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("frmShowPhone")
	pgSell.Initialize
	B4XPages.AddPage("pgSell", pgSell)
End Sub

Private Sub B4XPage_Appear
	loadValues
End Sub


'Check public Value intPhoneClicked from B4XPagesPhone and load values from object
'For teachers: This is a very hard way to load values but its the only way
'for students until now.
Private Sub loadValues
	If B4XPages.MainPage.pgPhones.intPhoneClicked = 1 Then 
		lblCPU.Text = B4XPages.MainPage.phone1.strCPU
	  	lbllName.Text = B4XPages.MainPage.phone1.strName
	  	lblMemory.Text = B4XPages.MainPage.phone1.intMemory
	 	lblOS.Text = B4XPages.MainPage.phone1.strOS
		lblRam.Text = B4XPages.MainPage.phone1.fltRAM
		lblScreen.Text = B4XPages.MainPage.phone1.strScreenSize
		lblStorage.Text = B4XPages.MainPage.phone1.intAmount
		lblTotal.Text = B4XPages.MainPage.phone1.fltPrice
		txtQuantity.Text = 1
	else if B4XPages.MainPage.pgPhones.intPhoneClicked = 2 Then
		lblCPU.Text = B4XPages.MainPage.phone2.strCPU
		lbllName.Text = B4XPages.MainPage.phone2.strName
		lblMemory.Text = B4XPages.MainPage.phone2.intMemory
		lblOS.Text = B4XPages.MainPage.phone2.strOS
		lblRam.Text = B4XPages.MainPage.phone2.fltRAM
		lblScreen.Text = B4XPages.MainPage.phone2.strScreenSize
		lblStorage.Text = B4XPages.MainPage.phone2.intAmount
		lblTotal.Text = B4XPages.MainPage.phone2.fltPrice
		txtQuantity.Text = 1
	else if B4XPages.MainPage.pgPhones.intPhoneClicked = 3 Then
		lblCPU.Text = B4XPages.MainPage.phone3.strCPU
		lbllName.Text = B4XPages.MainPage.phone3.strName
		lblMemory.Text = B4XPages.MainPage.phone3.intMemory
		lblOS.Text = B4XPages.MainPage.phone3.strOS
		lblRam.Text = B4XPages.MainPage.phone3.fltRAM
		lblScreen.Text = B4XPages.MainPage.phone3.strScreenSize
		lblStorage.Text = B4XPages.MainPage.phone3.intAmount
		lblTotal.Text = B4XPages.MainPage.phone3.fltPrice
		txtQuantity.Text = 1	
	else if B4XPages.MainPage.pgPhones.intPhoneClicked = 4 Then
		lblCPU.Text = B4XPages.MainPage.phone4.strCPU
		lbllName.Text = B4XPages.MainPage.phone4.strName
		lblMemory.Text = B4XPages.MainPage.phone4.intMemory
		lblOS.Text = B4XPages.MainPage.phone4.strOS
		lblRam.Text = B4XPages.MainPage.phone4.fltRAM
		lblScreen.Text = B4XPages.MainPage.phone4.strScreenSize
		lblStorage.Text = B4XPages.MainPage.phone4.intAmount
		lblTotal.Text = B4XPages.MainPage.phone4.fltPrice
		txtQuantity.Text = 1
	else if B4XPages.MainPage.pgPhones.intPhoneClicked = 5 Then
		lblCPU.Text = B4XPages.MainPage.phone5.strCPU
		lbllName.Text = B4XPages.MainPage.phone5.strName
		lblMemory.Text = B4XPages.MainPage.phone5.intMemory
		lblOS.Text = B4XPages.MainPage.phone5.strOS
		lblRam.Text = B4XPages.MainPage.phone5.fltRAM
		lblScreen.Text = B4XPages.MainPage.phone5.strScreenSize
		lblStorage.Text = B4XPages.MainPage.phone5.intAmount
		lblTotal.Text = B4XPages.MainPage.phone5.fltPrice
		txtQuantity.Text = 1			
	else if B4XPages.MainPage.pgPhones.intPhoneClicked = 6 Then
		lblCPU.Text = B4XPages.MainPage.phone6.strCPU
		lbllName.Text = B4XPages.MainPage.phone6.strName
		lblMemory.Text = B4XPages.MainPage.phone6.intMemory
		lblOS.Text = B4XPages.MainPage.phone6.strOS
		lblRam.Text = B4XPages.MainPage.phone6.fltRAM
		lblScreen.Text = B4XPages.MainPage.phone6.strScreenSize
		lblStorage.Text = B4XPages.MainPage.phone6.intAmount
		lblTotal.Text = B4XPages.MainPage.phone6.fltPrice
		txtQuantity.Text = 1
	else if B4XPages.MainPage.pgPhones.intPhoneClicked = 7 Then
		lblCPU.Text = B4XPages.MainPage.phone7.strCPU
		lbllName.Text = B4XPages.MainPage.phone7.strName
		lblMemory.Text = B4XPages.MainPage.phone7.intMemory
		lblOS.Text = B4XPages.MainPage.phone7.strOS
		lblRam.Text = B4XPages.MainPage.phone7.fltRAM
		lblScreen.Text = B4XPages.MainPage.phone7.strScreenSize
		lblStorage.Text = B4XPages.MainPage.phone7.intAmount
		lblTotal.Text = B4XPages.MainPage.phone7.fltPrice
		txtQuantity.Text = 1	
	else if B4XPages.MainPage.pgPhones.intPhoneClicked = 8 Then
		lblCPU.Text = B4XPages.MainPage.phone8.strCPU
		lbllName.Text = B4XPages.MainPage.phone8.strName
		lblMemory.Text = B4XPages.MainPage.phone8.intMemory
		lblOS.Text = B4XPages.MainPage.phone8.strOS
		lblRam.Text = B4XPages.MainPage.phone8.fltRAM
		lblScreen.Text = B4XPages.MainPage.phone8.strScreenSize
		lblStorage.Text = B4XPages.MainPage.phone8.intAmount
		lblTotal.Text = B4XPages.MainPage.phone8.fltPrice
		txtQuantity.Text = 1	
	End If 		
End Sub 


Private Sub btnSell_Click
	If txtQuantity.Text <= lblStorage.Text Then 
		B4XPages.ShowPage("pgSell") 
	Else
		xui.MsgboxAsync("Error not enough quantity", "")
	End If 
End Sub

Private Sub btnBack_Click
	B4XPages.ClosePage(Me) 
End Sub

Private Sub txtQuantity_TextChanged (Old As String, New As String)
	If New <> "" Then 
		lblTotal.Text = B4XPages.MainPage.phone8.fltPrice * New 
	Else
		lblTotal.Text = 0
	End If 
End Sub
