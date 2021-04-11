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
	Type Student(ID As String, LastName As String, FirstName As String, Address As String, PhoneNumber As String)
	Public Student1 As Student
	Public Student2 As Student
	Private listStudents As List 
	Private mapStudents As Map 
	Private kvsFile As KeyValueStore
End Sub

Public Sub Initialize
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	Student1.ID = "FS23534X21"
	Student1.LastName = "Ioannidis"
	Student1.FirstName = "Alkinoos"
	Student1.Address = "Athens, Greece"
	Student1.PhoneNumber = "+303465854234"

	Log(Student1) 
	
	listStudents.Initialize
	listStudents.Add(Student1)
	
	For i = 0 To listStudents.Size-1
		Private st As Student
		st = listStudents.Get(i)
		LogStudent(st) 
	Next
	
	mapStudents.Initialize
	mapStudents.Put(Student1.ID, Student1) 
	
	File.MakeDir(File.DirTemp, "lesson18")
	kvsFile.Initialize(File.DirTemp & "lesson18", "kvsData.dat")
	Log(File.DirTemp & "lesson18")
	
	'kvsFile.Put(Student1.ID, Student1)
	kvsFile.PutMapAsync(mapStudents) 
'	kvsFile.
	Private Student3 As Student
	If kvsFile.ContainsKey("FS23534X21") Then 
		Student3 = kvsFile.Get("FS23534X21") 
	Else
		Log("Wrong id key") 
	End If 
	
	Log("Show keys") 
	Private keys As List = kvsFile.ListKeys
	For i = 0 To keys.Size-1
		Log(keys.Get(i)) 
	Next
	
	'Log(newMap.Get("FS23534X21")) 
	LogStudent(Student3) 
	
End Sub

Private Sub LogStudent(st As Student)
	Log(st.FirstName)
	Log(st.LastName)
	Log(st.Address)
	Log(st.PhoneNumber)
End Sub

