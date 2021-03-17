B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	'Form Labels
	Private lblPhone1 As Label
	Private lblPhone2 As Label
	Private lblPhone3 As Label
	Private lblPhone4 As Label
	Private lblPhone5 As Label
	Private lblPhone6 As Label
	Private lblPhone7 As Label
	Private lblPhone8 As Label
	Private lblPrice1 As Label
	Private lblPrice2 As Label
	Private lblPrice3 As Label
	Private lblPrice4 As Label
	Private lblPrice5 As Label
	Private lblPrice6 As Label
	Private lblPrice7 As Label
	Private lblPrice8 As Label
	
	Public intPhoneClicked As Int 		
	Public pgShowPhone As B4XPageShowPhone
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("frmPhones")
	pgShowPhone.Initialize
	B4XPages.AddPage("pgShow", pgShowPhone)
End Sub

Private Sub B4XPage_Appear 
	insertValues
End Sub

Private Sub insertValues
	lblPhone1.Text = B4XPages.MainPage.phone1.strName
	lblPhone2.Text = B4XPages.MainPage.phone2.strName
	lblPhone3.Text = B4XPages.MainPage.phone3.strName
	lblPhone4.Text = B4XPages.MainPage.phone4.strName
	lblPhone5.Text = B4XPages.MainPage.phone5.strName
	lblPhone6.Text = B4XPages.MainPage.phone6.strName
	lblPhone7.Text = B4XPages.MainPage.phone7.strName
	lblPhone8.Text = B4XPages.MainPage.phone8.strName
	lblPrice1.Text = B4XPages.MainPage.phone1.fltPrice & " $"
	lblPrice2.Text = B4XPages.MainPage.phone2.fltPrice & " $"
	lblPrice3.Text = B4XPages.MainPage.phone3.fltPrice & " $"
	lblPrice4.Text = B4XPages.MainPage.phone4.fltPrice & " $"
	lblPrice5.Text = B4XPages.MainPage.phone5.fltPrice & " $"
	lblPrice6.Text = B4XPages.MainPage.phone6.fltPrice & " $"
	lblPrice7.Text = B4XPages.MainPage.phone7.fltPrice & " $"
	lblPrice8.Text = B4XPages.MainPage.phone8.fltPrice & " $"
End Sub

Private Sub lblPhone1_MouseClicked (EventData As MouseEvent)
	intPhoneClicked = 1
	B4XPages.ShowPage("pgShow") 
End Sub

Private Sub lblPhone2_MouseClicked (EventData As MouseEvent)
	intPhoneClicked = 2
	B4XPages.ShowPage("pgShow")
End Sub

Private Sub lblPhone3_MouseClicked (EventData As MouseEvent)
	intPhoneClicked = 3
	B4XPages.ShowPage("pgShow")
End Sub

Private Sub lblPhone4_MouseClicked (EventData As MouseEvent)
	intPhoneClicked = 4
	B4XPages.ShowPage("pgShow")
End Sub

Private Sub lblPhone5_MouseClicked (EventData As MouseEvent)
	intPhoneClicked = 5
	B4XPages.ShowPage("pgShow")
End Sub

Private Sub lblPhone6_MouseClicked (EventData As MouseEvent)
	intPhoneClicked = 6
	B4XPages.ShowPage("pgShow")
End Sub

Private Sub lblPhone7_MouseClicked (EventData As MouseEvent)
	intPhoneClicked = 7
	B4XPages.ShowPage("pgShow")
End Sub

Private Sub lblPhone8_MouseClicked (EventData As MouseEvent)
	intPhoneClicked = 8
	B4XPages.ShowPage("pgShow")
End Sub

