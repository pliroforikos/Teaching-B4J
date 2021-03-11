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
	Private txtA As TextField
	Private txtB As TextField
	Private txtC As TextField
	Private txtD As TextField
	Private txtX1 As TextField
	Private txtX2 As TextField
End Sub

Public Sub Initialize
	
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	txtA.Text = ""
	txtB.Text = ""
	txtC.Text = ""
End Sub


Private Sub btnCalculate_Click
	Private D, a, b, c As Float 
	
	If txtA.Text <> "" And txtB.Text <> "" And txtC.Text <> "" Then 
		a = txtA.Text
		b = txtB.Text
		c = txtC.Text
		
		D = calcD(a, b, c)
		txtD.Text = D 
		
		If D < 0 Then 
			xui.MsgboxAsync("Equation can be solved Δ < 0", "")
		Else if D = 0 Then 
			txtX1.Text = -b/(2*a)
		Else
			txtX1.Text = (-b + Sqrt(D) ) / (2*a)
			txtX2.Text = (-b - Sqrt(D) ) / (2*a)
		End If
	Else
		xui.MsgboxAsync("You must fill a, b, c fields", "")
	End If 	
	
End Sub

Private Sub calcD(a As Float, b As Float, c  As Float) As Float
	Return (  b*b - 4 * a * c ) 
End Sub

