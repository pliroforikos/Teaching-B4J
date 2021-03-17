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

'5.	A water tank Is 5 meters height and has a base of 3x3 meters. Make a program that, 
' continues reads the level height in meters and displays a 
' bar represent the height. If water height  is 
' above 5 meters  show message "Danger Water Leak!"
' Also, If the level Is less than 0.5 meters display a message 
' "Warning there is not enough water in the tank. 
' Every time Show the total amount of water in cubic meters.


Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private AnotherProgressBar1 As AnotherProgressBar
	Private B4XFloatTextField1 As B4XFloatTextField
	Private lblCubics As B4XView
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	AnotherProgressBar1.Value = 0 
End Sub



Private Sub B4XFloatTextField1_EnterPressed
	'First you have to calculate the cubics from height
	lblCubics.Text = 3*3*B4XFloatTextField1.text ' Base is 3x3 meters
	
	AnotherProgressBar1.Value = B4XFloatTextField1.Text  / 5 * 100 ' Turn to % value
	
	If B4XFloatTextField1.Text < 0.5 Then 
		xui.MsgboxAsync("There is not enough water in the tank", "Warning")
	Else if B4XFloatTextField1.Text > 5 Then
		xui.MsgboxAsync("Water leak!!!", "Danger")
	End If
	
End Sub