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
	Private btnCalc As Button
	Private txtCost As TextField
	Private txtMeal As TextField
	Private txtQuantity As TextField
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub


Private Sub btnCalc_Click
'	Burger	5$
'	Pizza	3$
'	Hot Dog	1,5$
	Private fltCost As Float
	Private meal As String 
	
	If txtMeal.text = "Hot Dog" Then 
		 fltCost = txtQuantity.Text * 1.5
		 meal = "Hot Dog"
	else if txtMeal.text = "Pizza" Then
		fltCost = txtQuantity.Text * 3
		meal = "Pizza"
	else if txtMeal.text = "Burger" Then
		fltCost = txtQuantity.Text * 5
		meal = "Burger"
	End If
	txtCost.Text = txtQuantity.Text & " x " & meal & " " & fltCost & " $"
End Sub

