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
	Private lstTeams As List
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	lstTeams.Initialize
	loadTeams
End Sub

Private Sub loadTeams
	lstTeams.Add(Array As String ("Arsenal", "Led by Alfredo Di Stéfano and Ferenc Puskas, the Real Madrid team of the late '50s dominated world football. They won the European Cup (Champions League) five times in a row from 1956 to 1960. This culminated in the 1960 final when they beat Eintracht Frankfurt 7-3 in one of the greatest footballing displays of all time (see the video below)."))
	lstTeams.Add(Array As String ("Milan", "The treble-winning Manchester United team of 1998–99 won the Premier League, FA Cup, and Champions League in a single season. It included greats such as Paul Scholes, David Beckham, Ryan Giggs, Roy Keane, and Peter Schmeichal. Like many of Alex Ferguson's teams, they fought until the last whistle, and this was demonstrated in no greater way than the 1999 Champions League final. Against Bayern Munich, they came from behind to win with two late goals from Sheringham and Solskjær."))
	lstTeams.Add(Array As String ("Liverpool","Ten years after Manchester United's achievement, Barcelona won the first ever treble by a Spanish club. They beat United in the final of the Champions League 2-0, destroyed Real Madrid 6-2 to win La Liga, and also won the Copa Del Rey. This season saw the emergence of Lionel Messi as the best player in the world. Under the guidance of one of the world's best football managers, Pep Guardiola, Messi more than doubled his tally from the previous campaign. Barcelona's tiki-taka style of play ensured they also won the domestic and UEFA Super Cups and the FIFA Club World Cup in 2009, turning their treble into a 'sextuple'."))
	lstTeams.Add(Array As String ("Manchester United", "Boca has had some stellar teams over the years, particularly during the Diego Maradona era of the early 1980s. But few teams could match the success domestically or abroad of the 2003 squad. With a league title secured, Boca set its sights on the Copa Libertadores, the South American equivalent of the Champions League, ultimately winning the prize convincingly."))
	lstTeams.Add(Array As String ("Barcelona","Ten years after Manchester United's achievement, Barcelona won the first ever treble by a Spanish club. They beat United in the final of the Champions League 2-0, destroyed Real Madrid 6-2 to win La Liga, and also won the Copa Del Rey. This season saw the emergence of Lionel Messi as the best player in the world. Under the guidance of one of the world's best football managers, Pep Guardiola, Messi more than doubled his tally from the previous campaign. Barcelona's tiki-taka style of play ensured they also won the domestic and UEFA Super Cups and the FIFA Club World Cup in 2009, turning their treble into a 'sextuple'."))
	lstTeams.Add(Array As String ("Boca Juniors","Boca has had some stellar teams over the years, particularly during the Diego Maradona era of the early 1980s. But few teams could match the success domestically or abroad of the 2003 squad. With a league title secured, Boca set its sights on the Copa Libertadores, the South American equivalent of the Champions League, ultimately winning the prize convincingly. "))
	lstTeams.Add(Array As String ("Sao Paolo","Few teams in the world could match the success found by Brazilian giants Sao Paulo in the early 1990s. Under legendary head coach Tele Santana, Sao Paulo reached the pinnacle of their powers during the 1993 season. "))
	lstTeams.Add(Array As String ("Dynamo Kiev","Dynamo Kiev have long been the dominant force in Ukranian football, but in the 1970s and 80s, they were the dominant force in all of Soviet football, ruling the league."))
End Sub
'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Button1_Click
	xui.MsgboxAsync("Hello world!", "B4X")
End Sub

