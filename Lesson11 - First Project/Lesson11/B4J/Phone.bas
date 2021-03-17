B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Public strName As String
	Public strScreenSize As String
	Public intMemory As Int
	Public fltRAM As Int 
	Public strCPU As String
	Public intAmount As Int 
	Public strOS As String
	Public fltPrice As Float 

End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	 strName = ""
	 strScreenSize  = ""
	 intMemory  = 0
	 fltRAM  = 0
	 strCPU = "" 
	 intAmount = 0
	 strOS = ""
	 fltPrice = 0 	
End Sub


Public Sub newPhone(name As String, scrSize As String, mem As Int, ram As Int, _
					cpu As String, amount As Int, OS As String, price As Float) 
	strName = name
	strScreenSize  = scrSize
	intMemory  = mem
	fltRAM  = ram
	strCPU = cpu
	intAmount = amount
	strOS = OS
	fltPrice = price
End Sub 


Public Sub storage(amount As Int) 
	intAmount = intAmount - amount
End Sub

Private Sub txtQuantity_TextChanged (Old As String, New As String)
	
End Sub

Private Sub btnSell_Click
	
End Sub