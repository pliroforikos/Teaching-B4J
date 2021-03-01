B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private txtArInfos As TextArea
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
'load the layout to Root
	Root.LoadLayout("frmJack")
	txtArInfos.Text = $"
		Developed in England some 200 years ago To hunt foxes, the Jack Russell Terrier, also known As the Parson Russell Terrier, Is a lively, independent, And clever little dog. They’re charming And affectionate, but they’re also a handful To train And manage. For experienced dog parents only!
		Although these are purebred dogs, you may still find them in shelters And rescues. Remember To adopt! Don’t shop If this Is the breed For you.
		At first, this small, adorable, And affectionate dog may seem like a good choice For new pet parents And apartment dwellers. But you may find yourself surprised at this little pup’s energy And intensity. These dogs need plenty of exercise And firm, consistent training, Or Else they may act out with unwanted behaviors. That said, If you know how To handle a Bit of rowdiness And can keep up with an energetic pup, you’ll be rewarded with a loving And loyal friend For life.
		DogTime recommends with your small Jack Russell Terrier. You should also To help burn off your pup’s high energy!
	"$ 
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.