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
'4.	Create a form that contains the following items: 
'a.	Name
'b.	Surname
'c.	Phone
'It also includes a switch that when the form Is open 
'has a white back-ground color with letters black in the above 
'elements While when closed it has dark gray with white letters.

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private fx As JFX
	Private B4XSwitch1 As B4XSwitch
	Private lblDayNight As Label
	Private txtName As B4XFloatTextField
	Private txtPhone As B4XFloatTextField
	Private txtSurname As B4XFloatTextField
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")

	B4XSwitch1.Value = True 
	lblDayNight.Text = "Day"
End Sub

Private Sub B4XSwitch1_ValueChanged (Value As Boolean)
	If Value Then
		lblDayNight.Text = "Day"
		lblDayNight.TextColor = fx.Colors.Black
		Root.Color = xui.Color_LightGray
		txtName.TextField.Color = xui.Color_White
		txtSurname.TextField.Color = xui.Color_White
		txtPhone.TextField.Color = xui.Color_White
	Else
		lblDayNight.Text = "Night"
		lblDayNight.TextColor = fx.Colors.LightGray 
		Root.Color = xui.Color_DarkGray
		txtName.TextField.Color = xui.Color_LightGray
		txtSurname.TextField.Color = xui.Color_LightGray
		txtPhone.TextField.Color = xui.Color_LightGray
	End If
	
End Sub