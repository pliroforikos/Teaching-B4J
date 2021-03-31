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
	Public pgStudents As B4XPageStudents
	Public pgBooks As B4XPageBooks
	Public pgBorrow As B4XPageBorrow
	Public pgReturn As B4XPageReturn
	Public lstStudents, lstBooks As List
	Public mapStudents As Map
	Public mapBooks As Map 
	Type Book(ID As String, Title As String, Writer As String, _
			  Year As String, Publisher As String,	Shelv As Int)
	Type Student(ID As String, FirstName As String, LastName As String, _
				 Cls As String, Phone As String, Borrowed As Int)
	Public stFile As String 
	Public bkFile As String
End Sub


Public Sub Initialize
	stFile  = File.ReadString(File.DirAssets, "students.txt")
	bkFile  = File.ReadString(File.DirAssets, "books.txt")
End Sub


Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	pgStudents.Initialize
	B4XPages.AddPage("pgStudents", pgStudents) 
	pgBooks.Initialize
	B4XPages.AddPage("pgBooks", pgBooks)
	pgBorrow.Initialize
	B4XPages.AddPage("pgBorrow", pgBorrow)
	pgReturn.Initialize
	B4XPages.AddPage("pgReturn", pgReturn) 
	
	'Load Students to public map
	lstStudents = LoadRawStudents
	mapStudents = lstStudentsToMap(lstStudents)
	'load Books to public map
	lstBooks = LoadRawBooks
	mapBooks = lstBooksToMap(lstBooks)
End Sub

'Get all file in one string and check ono by one each character of string
'Seperate items based on ; charachter
Private Sub LoadRawStudents As List 
	Private retList As List 
	retList.Initialize
	Private stud(5) As String
	
	Private i As Int = 0
	For j = 0 To stFile.Length-1
		If stFile.CharAt(j) <> ";" And stFile.CharAt(j) <> CRLF Then
			stud(i) = stud(i) & stFile.CharAt(j)
		Else if stFile.CharAt(j) = ";" Then
			i = i + 1
		else if stFile.CharAt(j) = CRLF Then
			i = 0 
			retList.Add(stud) 
			Dim stud(5) As String
		End If 
	Next 	
	Return retList
End Sub

'Get a list of Students and return a map with Key the Student ID
'and values all values from Student type
Private Sub lstStudentsToMap(lst As List) As Map 
	Log("================" & lst.Size & " ==================")
	Private mStudent As Map
	mStudent.initialize
	For i = 0 To lst.Size-1
		Private stud(5) As String
		stud = lst.Get(i)
		Private st As Student
		st.Initialize
		st.ID = stud(0)
		st.FirstName = stud(1)
		st.LastName = stud(2)
		st.Cls = stud(3)
		st.Phone = stud(4)
		st.Borrowed = 0
		mStudent.Put(stud(0), st)
	Next
	Return mStudent
End Sub


Public Sub LogStudentsMaps 
	For Each key As String In mapStudents.Keys
		Dim tp As Student
		tp = mapStudents.Get(key) 
		Log($"${key} ${tp.FirstName} ${tp.LastName} ${tp.Cls} ${tp.Phone} ${tp.Borrowed}"$ )
	Next
End Sub


Private Sub LogRawStudents(lst As List)
	Log("================" & lst.Size & " ==================")
	For i = 0 To lst.Size-1
		Dim stud(5) As String
		stud = lst.Get(i)
		Log("--------------------------------------------------------")
		Log($"${stud(0)} ${stud(1)} ${stud(2)} ${stud(3)} ${stud(4)}"$)
	Next
	Log("====================================================")
End Sub

'Get all file in one string and check ono by one each character of string
'Seperate items based on ; charachter
Private Sub LoadRawBooks As List 
	Private retList As List 
	retList.Initialize
	Dim book(6) As String
	
	Dim i As Int = 0
	For j = 0 To bkFile.Length-1
		If bkFile.CharAt(j) <> ";" And bkFile.CharAt(j) <> CRLF Then
			book(i) = book(i) & bkFile.CharAt(j)
		Else if bkFile.CharAt(j) = ";" Then
			i = i + 1
		else if bkFile.CharAt(j) = CRLF Then
			i = 0
			retList.Add(book)
			Dim book(6) As String
		End If
	Next
	Return retList
End Sub

'Get a list of Books and return a map with Key the Book ID
'and values all values from Book type
Private Sub lstBooksToMap(lst As List) As Map
	Private mBook As Map
	mBook.initialize
	For i = 0 To lst.Size-1
		Private arBk(6) As String
		arBk = lst.Get(i)
		Private  bk As Book
		bk.Initialize
		bk.ID = arBk(0)
		bk.Title = arBk(1)
		bk.Writer = arBk(2)
		bk.Year = arBk(3)
		bk.Publisher = arBk(4)
		bk.Shelv = arBk(5)
		mBook.Put(arBk(0), bk)
	Next
	Return mBook
End Sub


Public Sub LogBooksMaps 
	For Each key As String In mapBooks.Keys
		Dim bk As Book
		bk = mapBooks.Get(key)
		Log($"${key} ${bk.Title} ${bk.Writer} ${bk.Year} ${bk.Publisher} ${bk.Shelv}"$ )
	Next
End Sub


Private Sub LogRawBooks(lst As List)
	Log("================" & lst.Size & " ==================")
	For i = 0 To lst.Size-1
		Dim bk(6) As String
		bk = lst.Get(i)
		Log("--------------------------------------------------------")
		Log($"${bk(0)} ${bk(1)} ${bk(2)} ${bk(3)} ${bk(4)} ${bk(5)}"$)
	Next
	Log("====================================================")
End Sub


Private Sub btnStudents_Click
	B4XPages.ShowPage("pgStudents")
End Sub


Private Sub btnBorrow_Click
	B4XPages.ShowPage("pgBorrow")
End Sub


Private Sub btnBooks_Click
	B4XPages.ShowPage("pgBooks")
End Sub


Private Sub btnReturn_Click
	B4XPages.ShowPage("pgReturn")
End Sub
