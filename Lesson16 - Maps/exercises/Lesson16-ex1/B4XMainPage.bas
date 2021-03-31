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
	Private Countries As Map 
	Private Capitals As Map
	Private lblCountry As Label
	Private txtCapital As B4XFloatTextField
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	Countries.Initialize
	'1
	Countries.Put("CUBA", "HAVANA")
	Countries.Put("CYPRUS", "NICOSIA")
	Countries.Put("CZECHIA", "PRAGUE")
	Countries.Put("EGYPT", "CAIRO")
	Countries.Put("KENYA", "NAIROBI")
	Countries.Put("MEXICO", "MEXICO CITY")
	Countries.Put("PERU", "LIMA")
	Countries.Put("VIETNAM", "HANOI")
	Countries.Put("PORTUGAL ", "LISBON")
	
	
	'2
	Countries.Put("JAPAN", "TOKYO")
	Countries.Put("BARBADOS", "BRIDGETOWN")
	Countries.Put("FIJI ", "SUVA")
	
	
	'3
	Log("Showing Countries and their Capitals")
	For Each country As String In Countries.Keys
		Log(country & " " & Countries.Get(country))
	Next
	
	
	'4
	Capitals.Initialize
	For Each country As String In Countries.Keys
		Capitals.Put(Countries.Get(country), country)
	Next
	Log("Showing Capitals and Countries") 
	For Each Capital As String In Capitals.Keys
		Log(Capital & " " & Capitals.Get(Capital))
	Next

End Sub


'5 
Private Sub btnShow_Click
	If Capitals.ContainsKey(txtCapital.Text) Then
		lblCountry.Text = Capitals.Get(txtCapital.Text) 
	Else
		lblCountry.Text = "I dont know " & txtCapital.text
	End If
End Sub