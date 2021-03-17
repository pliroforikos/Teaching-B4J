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
	Public  phone1, phone2, phone3, phone4 As Phone
	Public  phone5, phone6, phone7, phone8 As Phone
	Public  pgPhones As B4XPagesPhones
	Private pgWarehouse As B4XPageWarehouse
	Private pgRevenue As B4XPageRevenue
	Public fltTotalIncome As Float 		'Variable to count Total Income
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	fltTotalIncome = 0 		' First Total Income is 0
	pgPhones.Initialize
	B4XPages.AddPage("pgPhones", pgPhones)
	pgWarehouse.Initialize
	B4XPages.AddPage("pgWarehouse", pgWarehouse)
	pgRevenue.Initialize
	B4XPages.AddPage("pgRev", pgRevenue)

	insertItems
End Sub

'The subprogram creates 8 objects of phones
Private Sub insertItems 
	phone1.Initialize
	phone1.newPhone("Yallomi", "6.53", 64, 4,  "Mediatek", 12, "Android", 150)
	phone2.Initialize
	phone2.newPhone("Smith", "6.67", 64, 4, "Qualcomm", 4, "Android", 220)
	phone3.Initialize
	phone3.newPhone("Taurus", "6.1", 128, 4, "Bionic", 7, "IOS", 780)
	phone4.Initialize
	phone4.newPhone("Talisman", "5.8", 64, 4, "Mediatek", 12, "Android", 150)
	phone5.Initialize
	phone5.newPhone("Cranberry", "5.8", 32, 3, "Mediatek", 16, "Android", 130)
	phone6.Initialize
	phone6.newPhone("OzOn", "5.8", 32, 2, "Mediatek", 16, "Android", 90)
	phone7.Initialize
	phone7.newPhone("H2O", "5.8", 64, 3, "Qualcomm", 2, "Android", 170)
	phone8.Initialize
	phone8.newPhone("Zeus", "6.67", 128, 6, "Qualcomm", 4, "Android", 650)
End Sub


Private Sub btnStorage_Click
	B4XPages.ShowPage("pgWarehouse")
End Sub

Private Sub btnRevenue_Click
	B4XPages.ShowPage("pgRev")
End Sub

Private Sub btnBuy_Click
 	B4XPages.ShowPage("pgPhones") 
End Sub