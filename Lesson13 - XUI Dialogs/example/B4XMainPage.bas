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
	Private scrLblOdys As ScrollingLabel
	Private RoundSlider1 As RoundSlider
	Private AnotherProgressBar1 As AnotherProgressBar
	Private Label1 As Label
	Private B4XImageView1 As B4XImageView
	
	Private dialog As B4XDialog
	Private txtAddress As B4XFloatTextField
	Private txtName As B4XFloatTextField
	Private txtSurname As B4XFloatTextField

	Private DateTemplate As B4XDateTemplate
	Private btnDate As B4XView
	
	Private ColorTemplate As B4XColorTemplate
	Private LongTextTemplate As B4XLongTextTemplate
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	B4XImageView1.Load(File.DirAssets, "logo.png")
	B4XImageView1.mBackgroundColor = xui.Color_Transparent
	B4XImageView1.ResizeMode = "FILL_NO_DISTORTIONS"
	B4XImageView1.RoundedImage = True
	dialog.Initialize (Root)
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.


Private Sub btnShowPoem_Click
	scrLblOdys.Text = "Tell me, O Muse, of that many-sided hero who " & _
					  "traveled far and wide after he had sacked the "& _
					  "famous town of Troy. Many cities did he visit, "& _
					  "And many were the people with whose customs And "& _
					  "thinking he was acquainted; many things "& _
					  "he suffered at sea While seeking To save his "& _
					  "own life And To achieve the safe homecoming "& _
					  "of his companions; but Do what he might he could Not "& _
					  "save his men, For they perished through their own sheer "& _
					  "recklessness in eating the cattle of the Sun-god Helios; "& _
					  "so the god prevented them from ever reaching home. Tell "& _
					  " Me, As you have told those who came before Me, about "& _
					  "all these things, O daughter of Zeus, starting from "& _
					  "whatsoever point you choose."
End Sub



Private Sub RoundSlider1_ValueChanged (Value As Int)
	AnotherProgressBar1.Value = Value
End Sub


Private Sub B4XSwitch1_ValueChanged (Value As Boolean)
	If Value Then 
		Label1.Text = "On"
	Else
		Label1.Text = "Off" 
	End If 
End Sub


Private Sub Button1_Click
	xui.MsgboxAsync("The quick brown fox jumps over the lazy dog", "Simple message Box")
End Sub


Private Sub Button2_Click
	Dim sf As Object = xui.Msgbox2Async("Delete file?", "Title", "Yes", "Cancel", "No", Null)
	Wait For (sf) Msgbox_Result (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		Log("Deleted!!!")
	End If
End Sub


Private Sub Button3_Click

	dialog.Title = "My Custom Dialog"
	
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 350dip, 250dip)
	
	p.LoadLayout("frmInsStudent")
	dialog.PutAtTop = True 'put the dialog at the top of the screen
	
	Wait For (dialog.ShowCustom(p, "OK", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		Log(txtName.text & " " & txtSurname.text & " " & txtAddress.text)
	End If
End Sub


Private Sub btnDate_Click
	dialog.Title = "Get Date"
	DateTemplate.Initialize
	DateTemplate.MinYear = 2010
	DateTemplate.MaxYear = 2030
	'only CANCEL needed
	Wait For (dialog.ShowTemplate(DateTemplate, "", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		btnDate.Text = DateTime.Date(DateTemplate.Date)
	End If
End Sub


Private Sub btnColor_Click
	dialog.Title = "Get Color"
	ColorTemplate.Initialize
	Wait For (dialog.ShowTemplate(ColorTemplate, "OK", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		Root.Color = ColorTemplate.SelectedColor
	End If
End Sub


Private Sub btnReadPoem_Click
	LongTextTemplate.Initialize
	LongTextTemplate.Resize(500, 500)
	LongTextTemplate.Text = $"
	Tell Me, Muse, of that man of many resources, 
	who wandered far And wide, after sacking the holy 
	citadel of Troy. Many the men whose cities he saw, 
	whose ways he learned. Many the sorrows he suffered 
	at sea, While trying To bring himself And his 
	friends back alive. Yet despite his wishes he failed 
	To save them, because of their own un-wisdom, 
	foolishly eating the cattle of Helios, the Sun, 
	so the god denied them their Return. Tell us of 
	these things, beginning where you will, 
	Goddess, Daughter of Zeus.
	
	So now all who escaped death in battle or by shipwreck 
	had got safely home except Ulysses, and he, though 
	he was longing to return to his wife and country, 
	was detained by the goddess Calypso, who had got 
	him into a large cave and wanted to marry him. 
	But as years went by, there came a time when the
	gods settled that he should go back to Ithaca; 
	even then, however, when he was among his own people, 
	his troubles were not yet over; nevertheless all the 
	gods had now begun to pity him except Neptune, who 
	still persecuted him without ceasing and would 
	not let him get home.

	Now Neptune had gone off to the Ethiopians, who are 
	at the world's end, and lie in two halves, the 
	one looking West and the other East. He had gone 
	there to accept a hecatomb of sheep and oxen, and 
	was enjoying himself at his festival; but the other 
	gods met in the house of Olympian Jove, and the 
	sire of gods and men spoke first. At that moment he 
	was thinking of Aegisthus, who had been killed by 
	Agamemnon's son Orestes; so he said to the other gods:

	"See now, how men lay blame upon us gods for what is 
	after all nothing but their own folly. Look at 
	Aegisthus; he must needs make love to Agamemnon's 
	wife unrighteously and then kill Agamemnon, though 
	he knew it would be the death of him; for I sent 
	Mercury to warn him not to do 	either of these 
	things, inasmuch as Orestes would be 
	sure to take his revenge when he grew up and wanted 
	to return home. Mercury told him this in all good 
	will but he would not listen, and now he has paid 
	for everything in full." 	
	
"$
	dialog.ShowTemplate(LongTextTemplate, "OK", "", "")
End Sub