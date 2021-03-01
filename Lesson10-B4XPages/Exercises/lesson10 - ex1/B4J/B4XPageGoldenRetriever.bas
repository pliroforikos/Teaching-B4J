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
	Private imgPic1 As ImageView
	Private imgPic2 As ImageView
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
'load the layout to Root
	Root.LoadLayout("frmGolden")
	
	txtArInfos.Text = $"
	The Golden Retriever is one of the most popular dog breeds in the United States. The breed’s friendly, tolerant attitude makes them great family pets, and their intelligence makes them highly capable working dogs.
	Golden Retrievers excel at retrieving game For hunters, tracking, sniffing out contraband For law enforcement, And As therapy And service dogs. They’re also natural athletes And Do well in dog sports such As agility And competitive obedience.
	These dogs are fairly easy To train And get along in just about any home Or family. They’re great with kids And very protective of their humans. If you want a loyal, loving, And smart companion, consider adopting one of these pups into your pack.
	DogTime recommends To your medium-sized Golden. You should also For your high shedding pup!
	"$
	
	
End Sub



'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.