B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
'	a.	Lesson
'	b.	Class
'	c.	Hours
'	d.	Professor
	Public strLesson, strClass, strHours, strProfessor As String 
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	strLesson = ""
	strClass = ""
	strHours = ""
	strProfessor = ""
End Sub

'New Lesson
Public Sub newLesson(name As String, class As String, hours As String, prof As String)
	strLesson = name
	strClass = class 
	strHours = hours
	strProfessor = prof
End Sub


'Change hours
Public Sub changeHours(hours As String)
	strHours = hours
End Sub

'Change Professor
Public Sub changeProfessor(prof As String)
	strProfessor = prof 
End Sub

'Show Lesson
Public Sub showLesson
	Log ( $"
	Lesson		: ${strLesson}
	Class		: ${strClass}
	Hours		: ${strHours}
	Professor	: ${strProfessor}
	"$)
End Sub
