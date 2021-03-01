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
	Private btnCheck As Button
	Private btnMax As Button
	Private lblMessage As Label
	Private txt1stTry As TextField
	Private txt2ndTry As TextField
	Private txt3rdTry As TextField
	Private txt4rthTry As TextField
	Private txt5thTry As TextField
	Private txt6thTry As TextField
End Sub

Public Sub Initialize
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	txt4rthTry.Visible = False
	txt5thTry.Visible = False
	txt6thTry.Visible = False
	btnMax.Visible = False 
End Sub

Private Sub btnCheck_Click
	If txt1stTry.Text > 7.5 Or txt2ndTry.Text > 7.5 Or txt3rdTry.Text > 7.5 Then 
		txt4rthTry.Visible = True
		txt5thTry.Visible = True
		txt6thTry.Visible = True
		btnMax.Visible = True 
	Else
		lblMessage.Text = "Disqualified" 
	End If
	
End Sub


Private Sub btnMax_Click
	Private MAX1 As Float
	
	MAX1 = txt1stTry.Text 
	If MAX1 < txt2ndTry.Text Then 
		MAX1 = txt2ndTry.text
	End If
	If MAX1 < txt3rdTry.Text Then
		MAX1 = txt3rdTry.text
	End If
	If MAX1 < txt4rthTry.Text Then
		MAX1 = txt4rthTry.text
	End If
	If MAX1 < txt5thTry.Text Then
		MAX1 = txt5thTry.text
	End If
	If MAX1 < txt6thTry.Text Then
		MAX1 = txt6thTry.text
	End If
	
	lblMessage.Text = "Best effort = " & MAX1 
	
End Sub