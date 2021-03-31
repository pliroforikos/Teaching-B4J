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
	Private mTeams As Map 
	Private fn  As String = "mydata.txt"
	Private strFolder  As String 
End Sub

Public Sub Initialize
	
End Sub


'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	strFolder =  File.DirTemp  & "lesson17\"
	Log(strFolder)
	lstTeams.Initialize
	loadTeams
	
	'For every item in list copy it in a table and then
	'put items in map
	mTeams.Initialize
	For i = 0 To lstTeams.Size - 1
		Private arr() As String
		arr = lstTeams.Get(i)
		mTeams.Put(arr(0), arr(1))
	Next
	
	File.WriteMap(strFolder, fn, mTeams)
	
	'Copy all map into one string
	Private strTeams As String
	For Each key  As  String In  mTeams.Keys
		strTeams = strTeams & key  & " " & mTeams.Get(key) & CRLF
	Next
	
	'Write string to file
	File.WriteString(strFolder, "teams2.txt", strTeams) 
	
End Sub


Private Sub loadTeams
	lstTeams.Add(Array As String ("Arsenal", "Led by Alfredo Di Stéfano and Ferenc Puskas, the Real Madrid team of the late '50s dominated world football. They won the European Cup (Champions League) five times in a row from 1956 to 1960. This culminated in the 1960 final when they beat Eintracht Frankfurt 7-3 in one of the greatest footballing displays of all time (see the video below)."))
	lstTeams.Add(Array As String ("Milan", "Associazione Calcio Milan is an Italian football club based in Milan, Lombardy. The club was founded in 1899 as Milan Foot-Ball and Cricket Club, and has competed in the Italian football league system since 1900."))
	lstTeams.Add(Array As String ("Liverpool","The club was founded in 1892 following a split from Everton F.C. and joined the Football League in 1893. The appointment of Tom Watson as manager resulted in the club's first successful period, in which they won two League Championships."))
	lstTeams.Add(Array As String ("Manchester United", " the club was founded as Newton Heath LYR Football Club in 1878, changed its name to Manchester United in 1902 and moved to its current stadium, Old Trafford, in 1910. "))
	lstTeams.Add(Array As String ("Barcelona","Barcelona won the first ever treble by a Spanish club. They beat United in the final of the Champions League 2-0, destroyed Real Madrid 6-2 to win La Liga, and also won the Copa Del Rey. This season saw the emergence of Lionel Messi as the best player in the world. Under the guidance of one of the world's best football managers, Pep Guardiola, Messi more than doubled his tally from the previous campaign. Barcelona's tiki-taka style of play ensured they also won the domestic and UEFA Super Cups and the FIFA Club World Cup in 2009, turning their treble into a 'sextuple'."))
	lstTeams.Add(Array As String ("Boca Juniors","Boca has had some stellar teams over the years, particularly during the Diego Maradona era of the early 1980s. But few teams could match the success domestically or abroad of the 2003 squad. With a league title secured, Boca set its sights on the Copa Libertadores, the South American equivalent of the Champions League, ultimately winning the prize convincingly. "))
	lstTeams.Add(Array As String ("Sao Paolo","Few teams in the world could match the success found by Brazilian giants Sao Paulo in the early 1990s. Under legendary head coach Tele Santana, Sao Paulo reached the pinnacle of their powers during the 1993 season. "))
	lstTeams.Add(Array As String ("Dynamo Kiev","Dynamo Kiev have long been the dominant force in Ukranian football, but in the 1970s and 80s, they were the dominant force in all of Soviet football, ruling the league."))
End Sub
'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Button1_Click
	xui.MsgboxAsync("Hello world!", "B4X")
End Sub

