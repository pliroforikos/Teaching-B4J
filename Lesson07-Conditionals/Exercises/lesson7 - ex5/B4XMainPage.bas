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
	Private btnCalculate As Button
	Private lblMessage As Label
	Private txtHours As TextField
	Private txtMember As TextField
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub


Private Sub btnCalculate_Click
	Private fltTotal, fltFee, fltTax As Float
	Private strMember As String 
	
	If txtMember.Text = "Yes" Then
		fltTax = 10
		fltFee = 2
		strMember = "is a member"
	Else 
		fltTax = 20
		fltFee = 5
		strMember = "is not a member"
	End If
	
	fltTotal = fltFee * txtHours.Text + fltFee * txtHours.Text / fltTax
	lblMessage.Text = "The user " & strMember & " and stayed " & txtHours.text & " for " &  fltFee & "/hour plus " & _
		 fltTax  & "% the total amount is " & fltTotal
		
	
End Sub