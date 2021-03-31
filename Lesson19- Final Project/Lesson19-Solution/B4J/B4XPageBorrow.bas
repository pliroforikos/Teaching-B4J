B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private btnBorrow As Button
	Private cmbStudent As B4XComboBox
	Private clvBooks As CustomListView
	Private selectedBook As Int = -1
	Private selectedStudentID As String =  "" 
	Private selectedBookID As String  =  ""  
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("frmBorrow") 
	cmbStudent.SetItems(showcmbStudent)
	loadBookList
End Sub

'Load clv list with Books formated in a way that will shown arranged
'Use monospaceed fonts and left allign in clv.
Private Sub loadBookList
	For Each tpBkt As Book In B4XPages.MainPage.mapBooks.Values
		Private s1, s2, s3, s4, s5, s6, str As String
		s1 = B4XPages.MainPage.pgBooks.addSpaces(tpBkt.ID, 1)
		s2 = B4XPages.MainPage.pgBooks.addSpaces(tpBkt.Title, 2)
		s3 = B4XPages.MainPage.pgBooks.addSpaces(tpBkt.Writer, 3)
		s4 = B4XPages.MainPage.pgBooks.addSpaces(tpBkt.Year, 4)
		s5 = B4XPages.MainPage.pgBooks.addSpaces(tpBkt.Publisher, 5)
		s6 = B4XPages.MainPage.pgBooks.addSpaces(tpBkt.Shelv, 6)
		
		str = $"${s1}${s2}${s3}${s4}${s5}${s6}"$
		clvBooks.AddTextItem(str, tpBkt.ID)
	Next
End Sub

'Returns a list with alla studentswith idm First LastName and Class
Private Sub showcmbStudent As List 
	Private newList As List 
	newList.Initialize
	For Each key As String In B4XPages.MainPage.mapStudents.Keys
		Dim tp As Student
		tp = B4XPages.MainPage.mapStudents.Get(key)
		newList.Add($"${key} ${tp.FirstName} ${tp.LastName} ${tp.Cls}"$)
		Log($"${key} ${tp.FirstName} ${tp.LastName} ${tp.Cls}"$ )
	Next
	Return newList
End Sub

'When combo box changed set Publc selectedStudentID into selected Student ID
Private Sub cmbStudent_SelectedIndexChanged (Index As Int)
	selectedStudentID = ""
	Private str As String = cmbStudent.GetItem(Index) 
	Private i As Int = 0 
	Do While str.CharAt(i) <> " " 	
		selectedStudentID = selectedStudentID & str.CharAt(i)
		i = i + 1
	Loop
	Log(selectedStudentID)
End Sub


'When a clicked a book change the color of the line to blue or white
'in order to selecte and deselect the line. Also set Public selectedBook 
'value to the clv index value and selectedBookID into selected Book ID
Private Sub clvBooks_ItemClick (Index As Int, Value As Object)
	If selectedBook = -1 Then
		Dim p As B4XView = clvBooks.GetPanel(Index)
		p.GetView(0).Color = xui.Color_Blue
		selectedBook = Index
		selectedBookID = clvBooks.GetValue(selectedBook)
	Else
		Dim p As B4XView = clvBooks.GetPanel(selectedBook)
		p.GetView(0).Color = xui.Color_White
		If selectedBook = Index  Then
			selectedBook = -1
			selectedBookID = "" 
		Else
			Dim p As B4XView = clvBooks.GetPanel(Index)
			p.GetView(0).Color = xui.Color_Blue
			selectedBook = Index
			selectedBookID = clvBooks.GetValue(selectedBook)
		End If
	End If

	Log(selectedBook)
End Sub


Private Sub btnBorrow_Click
	If selectedBookID <> "" And selectedStudentID <> "" Then 
		borrowBook
	End If 
End Sub


'Create a kvs file for student to store borrowed books ids
Public Sub borrowBook()
	'if student file is not exists then create it and create a map to store book ID and Date
	Private mapSt As Map
	mapSt.Initialize
	
	Private stdFileName As String = selectedStudentID & ".dat"
	Log("File name: " & stdFileName) 
	Private StudentFIle As KeyValueStore

	If File.Exists(File.DirTemp, stdFileName) Then
		StudentFIle.Initialize(File.DirTemp, stdFileName)
		'If file exists then get all values into mapSt
		Wait For (StudentFIle.GetMapAsync(StudentFIle.ListKeys)) Complete (mapSt As Map)
	Else
		StudentFIle.Initialize(File.DirTemp, stdFileName)
	End If
	
	'Add new value to map
	mapSt.Put(selectedBookID, DateTime.Date(DateTime.Now))
	For Each key As String In mapSt.Keys
		Log (key & " " & mapSt.Get(key))
	Next
	'Store map to student File
	Wait For (StudentFIle.PutMapAsync(mapSt)) Complete (Succes As Boolean)
	StudentFIle.Close
End Sub


