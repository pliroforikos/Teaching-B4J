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
	Type Customer(ID As String, FirstName As String, LastName As String, Phone As String) 
	Private Customers As List 
	Private CustomListView1 As CustomListView
	Private txtFirstName As B4XFloatTextField
	Private txtID As B4XFloatTextField
	Private txtLastName As B4XFloatTextField
	Private txtPhone As B4XFloatTextField
	Private dialog As B4XDialog
	
	Private kvsFile  As KeyValueStore
	Private btnLoadFIle As Button
End Sub

Public Sub Initialize
	
End Sub


Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	Customers.Initialize
	createList
	
	'Log Customers 
	For i = 0 To Customers.Size-1
		Private c As Customer
		c = Customers.Get(i)
		LogCustomer(c) 	
		Log("---------------------------")
	Next

End Sub


'It loads CLV with Customers list
Private Sub btnLoad_Click
	If CustomListView1.IsInitialized Then 
		CustomListView1.Clear
	End If 
	For i = 0 To Customers.Size-1
		Private c As Customer
		Private str As String
		c = Customers.Get(i)
		Private s1, s2, s3, s4 As String 
		s1 = addSpaces(c.ID, 1)  
		s2 = addSpaces(c.FirstName, 2) 
		s3 = addSpaces(c.LastName, 3) 
		s4 = c.Phone
		
		str = $"${s1}${s2}${s3}${s4}"$
		CustomListView1.AddTextItem(str, c.ID)
	Next
End Sub

'Sub adds more spaces to first three items of list
'ID gets spaces until it reach 8 lenght, 
'FirstName and LastName gets spaces until its length be 20 
Private Sub addSpaces(s1 As String, pos As Int) As String 
	If pos = 1 Then 
		Do While s1.Length <= 8 Then
			s1 = s1 & " "
		Loop
	else if pos = 2 Or pos = 3 Then 
		Do While s1.Length <= 20 Then
			s1 = s1 & " "
		Loop
	End If
	Return s1
End Sub

'Gets a Customer type and log its Values
Private Sub LogCustomer(cust As Customer)
	Log(cust.ID)
	Log(cust.FirstName)
	Log(cust.LastName)
	Log(cust.Phone)
End Sub

'When clicked on item list
Private Sub CustomListView1_ItemClick (Index As Int, Value As Object)
	deleteRecord(Index, Value)
	Log(Index & " " & Value)
End Sub


'Deleting Record from CLV and also from list and kvsFile
Private Sub deleteRecord(index As Int, value As Object) 
	Dim dlg As Object 
	dlg = xui.Msgbox2Async("Do you want to delete Customer?", "Warning", "Yes", "", "No", Null)
	Wait for (dlg) Msgbox_Result (Result As Int)
	If Result = xui.DialogResponse_Positive Then 
		CustomListView1.RemoveAt(index)
		Customers.RemoveAt(index)  
		kvsFile.Remove(value)
	End If 
	btnLoad_Click
End Sub 

'Creates a dialog box to fet new Customer
Private Sub btnInsert_Click
	dialog.Initialize(Root)
	dialog.Title = "Insert Customer"
	
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0,0,0, 350dip, 250dip)
	
	p.LoadLayout("dlgInsertCustomer")
	dialog.PutAtTop = True
	Wait For (dialog.ShowCustom(p, "OK", "", "Cancel")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		Private newCustomer As Customer
		newCustomer.ID = txtID.Text
		newCustomer.FirstName = txtFirstName.Text
		newCustomer.LastName = txtLastName.Text
		newCustomer.Phone = txtPhone.Text 
		Customers.Add(newCustomer) 
		btnLoad_Click
	End If
End Sub

' Loads ready made Customers 
Private Sub createList
	Private cust As Customer 
	cust.Initialize
	cust.ID = "A3473"
	cust.FirstName = "John"
	cust.LastName = "Smith"
	cust.Phone = "4563454" 
	Customers.Add(cust)
	
	Private cust As Customer
	cust.Initialize
	cust.ID = "X51462"
	cust.FirstName = "Paraskevas"
	cust.LastName = "Xatjixaralampos"
	cust.Phone = "612978323"
	Customers.Add(cust)


	Private cust As Customer
	cust.Initialize
	cust.ID = "B1753"
	cust.FirstName = "Selim"
	cust.LastName = "Al Huarizmi"
	cust.Phone = "6532578"
	Customers.Add(cust)
	
	Private cust As Customer
	cust.Initialize
	cust.ID = "C6544"
	cust.FirstName = "Mateo"
	cust.LastName = "Sandor"
	cust.Phone = "7345346"
	Customers.Add(cust)
	
	Private cust As Customer
	cust.Initialize
	cust.ID = "C6323"
	cust.FirstName = "Lucía"
	cust.LastName = "Graham"
	cust.Phone = "1231345"
	Customers.Add(cust)
	
	Private cust As Customer
	cust.Initialize
	cust.ID = "F1462"
	cust.FirstName = "Noam"
	cust.LastName = "Bell"
	cust.Phone = "6978323"
	Customers.Add(cust)
End Sub

'When Save Button clicked
Private Sub btnSaveFile_Click
	saveFile 
End Sub

'Save List to kvsFile
Private Sub saveFile
	File.MakeDir(File.DirTemp, "lesson18")
	kvsFile.Initialize(File.DirTemp & "lesson18", "ex1.dat")
	Log(File. DirTemp  & "lesson18")
	For i = 0 To Customers.Size - 1
		Private savingCustomer As Customer
		savingCustomer = Customers.Get(i)
		kvsFile.Put(savingCustomer.ID, savingCustomer)
	Next
End Sub

'When LoadFile clicked
Private Sub btnLoadFIle_Click
	loadFile
End Sub

'Loads kvsFile into List and call load
Private Sub loadFile
	kvsFile.Initialize(File.DirTemp & "lesson18", "ex1.dat")
	Private lstKeys As List = kvsFile.ListKeys
	Customers.Initialize
	For i = 0 To lstKeys.Size-1
		Private cust As Customer
		cust = kvsFile.Get(lstKeys.Get(i))
		Customers.Add(cust)
	Next
	btnLoad_Click
End Sub
	