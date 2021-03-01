B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
'	Registry Number
'	Name
'	Surname
'	Phone
'	Email
'	Class
	Private strRegNum, strName, strSurname, strPhone, strEmail, strClass As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	strRegNum = ""
	strName = "" 
	strSurname = "" 
	strPhone = "" 
	strEmail = "" 
	strClass = "" 
End Sub


'	New Student 
Public Sub newStudent(reg As String, Name As String, Surname As String, Phone As String, email As String, class As String)
	strRegNum = reg
	strName = Name
	strSurname = Surname
	strPhone = Phone
	strEmail = email 
	strClass = class
End Sub


'•	Show Student Information
Public Sub showStudent				' Explain the string  into $" "$
	Log ($" 								
	Registry Number : ${strRegNum} 
	Name			: ${strName } 
	Surname			: ${strSurname}
	Phone Number	: ${strPhone}
	email			: ${strEmail}
	Class			: ${strClass}
	"$)
End Sub


'	Change Class
Public Sub changeClass(class As String)
	strClass = class
End Sub


'	Change Phone
Public Sub changePhone(phone As String)  
	strPhone = phone
End Sub

