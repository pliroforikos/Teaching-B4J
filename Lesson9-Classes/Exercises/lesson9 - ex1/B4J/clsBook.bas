B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Public strWriter, strTitle, strYear, strPublisher As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	strTitle = ""
	strWriter = ""
	strYear = ""
	strPublisher = ""
End Sub

Public Sub insertBook(str1, str2, str3, str4 As String)
	strTitle = str1
	strWriter = str2
	strYear = str3
	strPublisher = str4
End Sub

Public Sub logBook
	Log("Title : " & strTitle)
	Log("Writer: " & strWriter)
	Log("Year  : " & strYear)
	Log("Publisher: " & strPublisher) 
End Sub

Public Sub changeBook(str1, str2, str3, str4 As String)
	strTitle = str1
	strWriter = str2
	strYear = str3
	strPublisher = str4	
End Sub

