B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Public ID As Int
	Public FirstName As String
	Public LastName As String
	Public stClass As String
	Public Phone As String 
	Public StudentFile As KeyValueStore
	Public books As List 
	Public stdFileName As String
End Sub


Public Sub Initialize
	ID = ""
	FirstName = ""
	LastName = ""
	stClass = ""
	Phone = ""
End Sub


Public Sub insertStudent(nID As Int, FName As String, LName As String, cl As String, Ph As String) 
	ID = nID
	FirstName = FName
	LastName = LName
	stClass = cl
	Phone = Ph
	stdFileName = ID & ".dat"
End Sub 

