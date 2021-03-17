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
	Private longtxt As B4XLongTextTemplate
	Private dialog As B4XDialog
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	dialog.Initialize(Root)
End Sub


Private Sub btnTime_Click
	longtxt.Initialize
	longtxt.Resize(600, 500)
	longtxt.Text = $"
	A Brief History Of Time : From Big Bang To Black Holes

	By (author)  Stephen Hawking

	Was there a beginning of time? Could time run backwards? 
	Is the universe infinite or does it have boundaries?

	These are just some of the questions considered in the 
	internationally acclaimed masterpiece by the world renowned 
	physicist - generally considered to have been one of the 
	world's greatest thinkers. It begins by reviewing the great 
	theories of the cosmos from Newton to Einstein, before delving 
	into the secrets which still lie at the heart of space and 
	time, from the Big Bang to black holes, via spiral galaxies 
	and strong theory. To this day A Brief History of Time 
	remains a staple of the scientific canon, and its succinct 
	and clear language continues to introduce millions to the 
	universe and its wonders.
"$
	dialog.ShowTemplate(longtxt, "OK", "", "")
End Sub

Private Sub btnSapiens_Click
	longtxt.Initialize
	longtxt.Resize(600, 500)
	longtxt.Text = $"
Sapiens : A Brief History of Humankind

By (author)  Yuval Noah Harari

'Interesting and provocative... It gives you a sense of 
how briefly we've been on this Earth' Barack Obama

What makes us brilliant? What makes us deadly? What makes us 
Sapiens? Yuval Noah Harari challenges everything we know about being 
human in the perfect read for these unprecedented times.

Earth is 4.5 billion years old. In just a fraction of that time, 
one species among countless others has conquered it: us.

In this bold and provocative book, Yuval Noah Harari explores 
who we are, how we got here and where we're going.
"$
	dialog.ShowTemplate(longtxt, "OK", "", "")
End Sub

Private Sub btniRobot_Click
	longtxt.Initialize
	longtxt.Resize(600, 500)
	longtxt.Text = $"
I, Robot
By (author)  Isaac Asimov

Isaac Asimov's ROBOT series - from the iconic collection I, ROBOT 
to four classic novels - contains some of the most influential works 
in the history of science fiction. Establishing and testing the 
THREE LAWS OF ROBOTICS, they continue to shape the understanding 
and design of artificial intelligence to this day.

What happens when a robot begins to question its creators? What 
would be the consequences of creating a robot with a sense of humour? 
Or the ability to lie? How do we truly tell the difference between 
man and machine?

In I, Robot, Asimov sets out the Three Laws of Robotics - designed 
to protect humans from their robotic creations - and pushes them 
to their limits and beyond.

Following genius robopsychologist Dr. Susan Calvin and engineers 
Powell and Donovan, these short stories helped to transform artificial 
intelligence from a dream into a science and changed perceptions of 
robots for ever.
"$
	dialog.ShowTemplate(longtxt, "OK", "", "")
End Sub

Private Sub btn2001_Click
	longtxt.Initialize
	longtxt.Resize(600, 500)
	longtxt.Text = $"
2001 a Space Odyssey 

The classic science fiction novel that captures and expands on 
the vision of Stanley Kubrick's immortal film--and changed the 
way we look at the stars and ourselves. From the savannas of 
Africa at the dawn of mankind to the rings of Saturn as man ventures 
to the outer rim of our solar system, 2001: A Space Odyssey is a 
journey unlike any other.

This allegory about humanity's exploration of the universe--and the 
universe's reaction to humanity--is a hallmark achievement in 
storytelling that follows the crew of the spacecraft Discovery as 
they embark on a mission to Saturn. Their vessel is controlled by 
HAL 9000, an artificially intelligent supercomputer capable of the 
highest level of cognitive functioning that rivals--and perhaps 
threatens--the human mind.

Grappling with space exploration, the perils of technology, and 
the limits of human power, 2001: A Space Odyssey continues to 
be an enduring classic of cinematic scope.
	
"$
	dialog.ShowTemplate(longtxt, "OK", "", "")
End Sub

Private Sub btn1984_Click
	longtxt.Initialize
	longtxt.Resize(500, 500)
	longtxt.Text = $"
1984
By (author)  George Orwell

Renowned urban artist Shepard Fairey's new look for 
Orwell's dystopian masterpiece

Winston Smith works for the Ministry of Truth in London, 
chief city of Airstrip One. Big Brother stares out from 
every poster, the Thought Police uncover every act of betrayal. 
When Winston finds love with Julia, he discovers that life 
does not have to be dull and deadening, and awakens to new 
possibilities. Despite the police helicopters that hover 
and circle overhead, Winston and Julia begin to question 
the Party; they are drawn towards conspiracy. Yet Big Brother 
will not tolerate dissent - even in the mind. For those 
with original thoughts they invented Room 101. . .

"$
	dialog.ShowTemplate(longtxt, "OK", "", "")
End Sub