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
	Root.LoadLayout("frmBeagle") 
	txtArInfos.Text = $"
		Small, compact, And hardy, Beagles are active companions For kids And adults alike. Canines of this dog breed are merry And fun loving, but being hounds, they can also be stubborn And require patient, creative training techniques.
		Their noses guide them through life, And they’re never happier than when following an interesting scent. Beagles originally were bred As scenthounds To track small game, mostly rabbits And hare. They’re still used For this purpose in many countries today, including the United States. But you’ll find plenty of these pups living As companion dogs And loving, furry family members.
		DogTime recommends with your small Beagle. You should also For any outdoor adventures you have with your pup!
	"$
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.