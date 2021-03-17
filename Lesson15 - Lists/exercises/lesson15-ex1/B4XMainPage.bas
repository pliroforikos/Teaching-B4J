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
	Private lblCapital As Label
	Private txtCountry As TextField
	Private Countries As List
	
	Private txtInsCap As B4XFloatTextField
	Private txtInsCountry As B4XFloatTextField
	Private dialog As B4XDialog
	
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	dialog.Initialize(Root)
	Countries.Initialize
	
	Countries.Add(Array As String("CUBA", "HAVANA"))
	Countries.Add(Array As String("CYPRUS", "NICOSIA"))
	Countries.Add(Array As String("CZECHIA", "PRAGUE"))
	Countries.Add(Array As String("EGYPT", "CAIRO"))
	Countries.Add(Array As String("KENYA", "NAIROBI"))
	Countries.Add(Array As String("MEXICO", "MEXICO CITY"))
	Countries.Add(Array As String("PERU", "LIMA"))
	Countries.Add(Array As String("VIETNAM", "HANOI"))
	Countries.Add(Array As String("PORTUGAL", "LISBON"))
	
	showList(Countries)
	
'	b
	For i = 0 To Countries.Size - 1
		Private cntr() As String
		cntr = Countries.Get(i)
		If cntr(0).StartsWith("P") Then
			Log	(cntr(0) & " " & cntr(1))
		End If
	Next
End Sub

'Show list 
Private Sub showList(A As List)
	For i = 0 To A.Size - 1
		Private cntr() As String
		cntr = A.Get(i)
		Log(cntr(0) & " " & cntr(1))
	Next
End Sub
	

'Find capital city
Private Sub Button1_Click
	For i = 0 To Countries.Size - 1
		Private cntr() As String
		cntr = Countries.Get(i)
		If cntr(0).CompareTo(txtCountry.Text) = 0 Then
			lblCapital.Text = cntr(1)
		End If
	Next
End Sub


Private Sub btnNewCountry_Click
	dialog.Title = "Insert Country"
	
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 300dip, 200dip)
	
	p.LoadLayout("frmNewCountry")
	dialog.PutAtTop = True 'put the dialog at the top of the screen
	
	Wait For (dialog.ShowCustom(p, "OK", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		Log(txtInsCountry.text & " " & txtInsCap.text)
		Countries.Add(Array As String(txtInsCountry.Text, txtInsCap.Text))
	End If
	showList(Countries)
End Sub

