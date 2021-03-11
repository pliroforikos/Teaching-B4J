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
	Private txtMeme As TextArea
	Private txtWikipedia As TextArea
	Private lblTotal As Label
	Private lblMessage2 As Label
End Sub

Public Sub Initialize
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub


Private Sub btnCalculate_Click
	lblTotal.Text = txtMeme.Text * 0.05 + txtWikipedia.Text * 0.1 
	If lblTotal.Text > 100 Then 
		lblMessage.Text = "Too much consumption"
	End If
	If txtMeme.Text * 0.05 > txtWikipedia.Text * 0.1 Then
		lblMessage2.Text = "WOW MANY MEMES, SUCH LOL"
	End If
End Sub