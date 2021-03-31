B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private clvBooks As CustomListView
	Private dialog As B4XDialog
	Private txtID As B4XFloatTextField
	Private txtPubl As B4XFloatTextField
	Private txtShelv As B4XFloatTextField
	Private txtTitle As B4XFloatTextField
	Private txtWriter As B4XFloatTextField
	Private txtYear As B4XFloatTextField
	Public selectedBook As Int 
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("frmBooks")
	
	loadList
End Sub

'Load clv list with Books formated in a way that will shown arranged
'Use monospaceed fonts and left allign in clv.
Private Sub loadList
	For Each tpBkt As Book In B4XPages.MainPage.mapBooks.Values
		Private s1, s2, s3, s4, s5, s6, str As String
		s1 = addSpaces(tpBkt.ID, 1)
		s2 = addSpaces(tpBkt.Title, 2)
		s3 = addSpaces(tpBkt.Writer, 3)
		s4 = addSpaces(tpBkt.Year, 4)
		s5 = addSpaces(tpBkt.Publisher, 5)
		s6 = addSpaces(tpBkt.Shelv, 6)
		
		str = $"${s1}${s2}${s3}${s4}${s5}${s6}"$
		clvBooks.AddTextItem(str, tpBkt.ID)
	Next
End Sub

'Sub adds more spaces to first three items of list
'ID gets spaces until it reach 5 lenght, 
'FirstName and LastName gets spaces until its length be 20 
'Class 3 spaces and Phone 12 spaces
Public Sub addSpaces(s1 As String, pos As Int) As String
	If pos = 1 Then
		Do While s1.Length <= 4 
			s1 = s1 & " "
		Loop
	else if pos = 2 Then
		Do While s1.Length <= 40 
			s1 = s1 & " "
		Loop
	else if pos = 3 Or pos = 5 Then
		Do While s1.Length <= 22 
			s1 = s1 & " "
		Loop
	else if pos = 4 Then
		Do While s1.Length <= 6 
			s1 = s1 & " "
		Loop
	else if pos = 6 Then
		Do While s1.Length <= 3 
			s1 = s1 & " "
		Loop
	End If
	Return s1
End Sub


'When a clicked a book change the color of the line to blue or white
'in order to selecte and deselect the line. Also set Public selectedBook 
'value to the clv index value
Private Sub clvBooks_ItemClick (Index As Int, Value As Object)
	If selectedBook = -1 Then
		Dim p As B4XView = clvBooks.GetPanel(Index)
		p.GetView(0).Color = xui.Color_Blue
		selectedBook = Index
	Else
		Dim p As B4XView = clvBooks.GetPanel(selectedBook)
		p.GetView(0).Color = xui.Color_White
		If selectedBook = Index  Then
			selectedBook = -1
		Else
			Dim p As B4XView = clvBooks.GetPanel(Index)
			p.GetView(0).Color = xui.Color_Blue
			selectedBook = Index
		End If
	End If
End Sub


'Deletes a Book selected from user
Private Sub btnDelete_Click
	If selectedBook <> - 1 Then
		B4XPages.MainPage.mapBooks.Remove(clvBooks.GetValue(selectedBook))
		clvBooks.RemoveAt(selectedBook)
		selectedBook = -1
		SaveBooksFile
	End If
End Sub


Private Sub btnInsert_Click
	InsertStudet
End Sub

'Creates a dialog box to insert new Book
Private Sub InsertStudet
	dialog.Initialize(Root)
	dialog.Title = "Insert Book"
	
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0,0,0, 350dip, 350dip)
	
	p.LoadLayout("dlgBooks")
	dialog.PutAtTop = True
	Wait For (dialog.ShowCustom(p, "OK", "", "Cancel")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		Private newBook As Book
		newBook.ID = txtID.Text
		newBook.Title = txtTitle.Text
		newBook.Writer = txtWriter.Text
		newBook.Year = txtYear.Text
		newBook.Publisher = txtPubl.Text
		newBook.Shelv = txtShelv.Text 
		B4XPages.MainPage.mapBooks.Put(newBook.ID, newBook)
		loadList
		SaveBooksFile
	End If
End Sub


Private Sub SaveBooksFile
	Private str As String
	For Each tpBk As Book In B4XPages.MainPage.mapBooks.Values
		str = str & $"${tpBk.ID};${tpBk.Title};${tpBk.Writer};${tpBk.Year};${tpBk.Publisher};${tpBk.Shelv}${CRLF}"$
	Next
		File.WriteString(File.DirTemp, "books.txt", str)
	Log("Saved to folder: " & File.DirTemp)
End Sub


