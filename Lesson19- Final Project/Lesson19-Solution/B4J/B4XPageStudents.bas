B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private clvStudents As CustomListView
	Private dialog As B4XDialog
	Private txtClass As B4XFloatTextField
	Private txtFirstName As B4XFloatTextField
	Private txtID As B4XFloatTextField
	Private txtLastName As B4XFloatTextField
	Private txtPhone As B4XFloatTextField
	Public selectedStudent As Int  = -1
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("fmrStudents") 
	loadList
End Sub

'Load clv list with Students formated in a way that will shown arranged
'Use monospaceed fonts and left allign in clv.
Private Sub loadList
	For Each tpSt As Student In B4XPages.MainPage.mapStudents.Values
		Private s1, s2, s3, s4, s5, str As String
		s1 = addSpaces(tpSt.ID, 1)
		s2 = addSpaces(tpSt.FirstName, 2)
		s3 = addSpaces(tpSt.LastName, 3)
		s4 = addSpaces(tpSt.Cls, 4)
		s5 = addSpaces(tpSt.Phone, 5)
		
		str = $"${s1}${s2}${s3}${s4}${s5}"$
		clvStudents.AddTextItem(str, tpSt.ID)
	Next
End Sub 

'Sub adds more spaces to first three items of list
'ID gets spaces until it reach 5 lenght, 
'FirstName and LastName gets spaces until its length be 20 
'Class 3 spaces and Phone 12 spaces
Private Sub addSpaces(s1 As String, pos As Int) As String
	If pos = 1 Then
		Do While s1.Length <= 5 
			s1 = s1 & " "
		Loop
	else if pos = 2 Or pos = 3 Then
		Do While s1.Length <= 20 
			s1 = s1 & " "
		Loop
	else if pos = 4 Then
		Do While s1.Length <= 3 
			s1 = s1 & " "
		Loop
	else if pos = 5 Then
		Do While s1.Length <= 12 
			s1 = s1 & " "
		Loop
	End If
	Return s1
End Sub


'When a clicked a student change the color of the line to blue or white
'in order to selecte and deselect the line. Also set Public selectedStudent 
'value to the clv index value
Private Sub clvStudents_ItemClick (Index As Int, Value As Object)
	If selectedStudent = -1 Then
		Dim p As B4XView = clvStudents.GetPanel(Index)
		p.GetView(0).Color = xui.Color_Blue
		selectedStudent = Index
	Else 
		Dim p As B4XView = clvStudents.GetPanel(selectedStudent)
		p.GetView(0).Color = xui.Color_White 
		If selectedStudent = Index  Then 
			selectedStudent = -1
		Else
			Dim p As B4XView = clvStudents.GetPanel(Index)
			p.GetView(0).Color = xui.Color_Blue 
			selectedStudent = Index 
		End If 
	End If
End Sub


Private Sub btnInsert_Click
	InsertStudet
End Sub


'Deletes a Student selected from user
Private Sub btnDelete_Click
	If selectedStudent <> - 1 Then 
		B4XPages.MainPage.mapStudents.Remove(clvStudents.GetValue(selectedStudent))
		clvStudents.RemoveAt(selectedStudent)
		selectedStudent = -1
		SaveStudentsFile
	End If 
End Sub


'Creates a dialog box to insert new Student
Private Sub InsertStudet
	dialog.Initialize(Root)
	dialog.Title = "Insert Student"
	
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0,0,0, 350dip, 350dip)
	
	p.LoadLayout("dlgStudents")
	dialog.PutAtTop = True
	Wait For (dialog.ShowCustom(p, "OK", "", "Cancel")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		Private newStudent As Student
		newStudent.ID = txtID.Text
		newStudent.FirstName = txtFirstName.Text
		newStudent.LastName = txtLastName.Text
		newStudent.Phone = txtPhone.Text
		newStudent.Cls = txtClass.Text 
		B4XPages.MainPage.mapStudents.Put(newStudent.ID, newStudent) 
		loadList
		SaveStudentsFile
	End If
End Sub


Private Sub SaveStudentsFile
	Private str As String
	For Each tpSt As Student In B4XPages.MainPage.mapStudents.Values
		str = str & $"${tpSt.ID};${tpSt.FirstName};${tpSt.LastName};${tpSt.Cls};${tpSt.Phone}${CRLF}"$
		File.WriteString(File.DirTemp, "students.txt", str)
	Next 
	Log("Saved to folder: " & File.DirTemp)
End Sub

