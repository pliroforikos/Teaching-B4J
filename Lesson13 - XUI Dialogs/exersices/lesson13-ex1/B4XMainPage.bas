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
	Private dialog As B4XDialog
	Private dateDialog As B4XDateTemplate 
	Private Label1 As Label
	Private Label2 As Label
	Private Label3 As Label
	Private date1, date2 As Long
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	dialog.Initialize(Root)
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Button1_Click
	dialog.Title = "1st Date"
	dateDialog.Initialize
	
	wait for (dialog.ShowTemplate(dateDialog, "", "", "Cancel")) Complete (result As Int)
	If result = xui.DialogResponse_Positive Then 
		Label1.Text = DateTime.Date(dateDialog.Date) 
		date1 = dateDialog.Date
	End If
End Sub


Private Sub Button2_Click
	If Label1.Text = "" Or Label1.Text = Null Then
		xui.MsgboxAsync("You must first choose 1st date", "")
	Else
		dialog.Title = "2nd Date"
		dateDialog.Initialize
		wait for (dialog.ShowTemplate(dateDialog, "", "", "Cancel")) Complete (result As Int)
		If result = xui.DialogResponse_Positive Then
			Label2.Text = DateTime.Date(dateDialog.Date)
			date2 = dateDialog.Date
			Label3.Text = DateUtils.PeriodBetween(date1, date2).Days & " Days " & _
							DateUtils.PeriodBetween(date1, date2).Months & " Months " & _
							DateUtils.PeriodBetween(date1, date2).Years & " Years"
		End If
	End If
	
End Sub