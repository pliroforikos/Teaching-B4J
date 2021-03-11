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
	Private txtAverage As TextField 
	Private txtChem As TextField
	Private txtGymn As TextField
	Private txtIT As TextField
	Private txtLiterature As TextField
	Private txtMaths As TextField
	Private txtMusic As TextField
	Private txtPhil As TextField
	Private txtPhysics As TextField
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	txtAverage.Text = 0
	txtChem.Text = 0
	txtGymn.Text = 0
	txtIT.Text = 0
	txtLiterature.text = 0
	txtMaths.Text = 0
	txtMusic.Text = 0
	txtPhil.Text = 0
	txtPhysics.Text = 0 
End Sub


Private Sub btnCalculate_Click
	If (txtChem.Text >= 0 And txtChem.Text <= 100 ) Then
		If ( txtGymn.Text >= 0 And txtGymn.Text <=100 ) Then 
			If ( txtIT.text >= 0 And txtIT.Text <= 100 ) Then 
				If ( txtLiterature.text >= 0 And txtLiterature.text <= 100 ) Then 
					If (txtMaths.text >= 0 And txtMaths.text <= 100 ) Then 
				 		If (txtMusic.text >= 0 And txtMusic.Text <= 100 ) Then 
							If  (txtPhil.text >= 0 And txtPhil.text <= 100 ) Then 
								If (txtPhysics.text >= 0 And txtPhysics.Text <= 100 ) Then
									txtAverage.Text = (txtChem.Text + txtGymn.Text+txtIT.text+txtLiterature.text+ _
									txtMaths.text+txtMusic.text+txtPhil.text+txtPhysics.text)/8
								Else 
									xui.MsgboxAsync("Physics should be between 0 and 100", "")
								End If 
							Else
								xui.MsgboxAsync("Philosophy should be between 0 and 100", "")
							End If 
						Else
							xui.MsgboxAsync("Music should be between 0 and 100", "")
						End If
					Else
						xui.MsgboxAsync("Maths should be between 0 and 100", "")
					End If
				Else
						xui.MsgboxAsync("Lterature should be between 0 and 100", "")
				End If
			Else
				xui.MsgboxAsync("IT should be between 0 and 100", "")
			End If
		Else
			xui.MsgboxAsync("Gymnastics should be between 0 and 100", "")
		End If 
	Else
		xui.MsgboxAsync("Chemistry should be between 0 and 100", "")
	End If
End Sub

