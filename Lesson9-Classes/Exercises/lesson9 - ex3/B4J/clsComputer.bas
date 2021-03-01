B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Public strType, strModel, strCpu As String 
	Public fltPrice As Float 
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	strType = ""
	strModel = ""
	strCpu = ""
	fltPrice = 0 
End Sub

Public Sub newComputer(tp As String , model As String , cpu As String , price As Float)
	strType = tp 
	strModel = model 
	strCpu = cpu 
	fltPrice = price 
End Sub 


Public Sub showComputer
	Log("Type 		: " & strType) 
	Log("Model		: " & strModel)
	Log("CPU		: " & strCpu)
	Log("Price		: " & fltPrice) 
End Sub


public Sub changeCpu(cpu As String)
	strCpu = cpu
End Sub

public Sub changePrice(price As Float)
	fltPrice = price 	
End Sub

