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

'2.	Create a program that reads the following customer information:
'a.	Name
'b.	Surname
'c.	Phone
'd.	Phone Bill (in € )
'Then create a button on the form that says payment And If pressed 
'display the message "Do you want to pay?" If answered yes set 0 To the 
'variable corresponding To the Phone Account.


Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private B4XFloatTextField1 As B4XFloatTextField
	Private B4XFloatTextField2 As B4XFloatTextField
	Private B4XFloatTextField3 As B4XFloatTextField
	Private ftxtBill As B4XFloatTextField
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Button1_Click
	Private dlg As Object = xui.Msgbox2Async("Do you want to pay?", "", "Yes", "", "Cancel", Null)
	Wait for (dlg) Msgbox_Result (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		ftxtBill.Text = 0 
	End If
End Sub