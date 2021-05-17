package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class phone_subs_0 {


public static RemoteObject  _btnsell_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSell_Click (phone) ","phone",2,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("btnsell_click")) { return __ref.runUserSub(false, "phone","btnsell_click", __ref);}
 BA.debugLineNum = 48;BA.debugLine="Private Sub btnSell_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
phone._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",phone._fx);
 //BA.debugLineNum = 3;BA.debugLine="Public strName As String";
phone._strname = RemoteObject.createImmutable("");__ref.setField("_strname",phone._strname);
 //BA.debugLineNum = 4;BA.debugLine="Public strScreenSize As String";
phone._strscreensize = RemoteObject.createImmutable("");__ref.setField("_strscreensize",phone._strscreensize);
 //BA.debugLineNum = 5;BA.debugLine="Public intMemory As Int";
phone._intmemory = RemoteObject.createImmutable(0);__ref.setField("_intmemory",phone._intmemory);
 //BA.debugLineNum = 6;BA.debugLine="Public fltRAM As Int";
phone._fltram = RemoteObject.createImmutable(0);__ref.setField("_fltram",phone._fltram);
 //BA.debugLineNum = 7;BA.debugLine="Public strCPU As String";
phone._strcpu = RemoteObject.createImmutable("");__ref.setField("_strcpu",phone._strcpu);
 //BA.debugLineNum = 8;BA.debugLine="Public intAmount As Int";
phone._intamount = RemoteObject.createImmutable(0);__ref.setField("_intamount",phone._intamount);
 //BA.debugLineNum = 9;BA.debugLine="Public strOS As String";
phone._stros = RemoteObject.createImmutable("");__ref.setField("_stros",phone._stros);
 //BA.debugLineNum = 10;BA.debugLine="Public fltPrice As Float";
phone._fltprice = RemoteObject.createImmutable(0f);__ref.setField("_fltprice",phone._fltprice);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (phone) ","phone",2,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "phone","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="strName = \"\"";
Debug.ShouldStop(32768);
__ref.setField ("_strname" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 17;BA.debugLine="strScreenSize  = \"\"";
Debug.ShouldStop(65536);
__ref.setField ("_strscreensize" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 18;BA.debugLine="intMemory  = 0";
Debug.ShouldStop(131072);
__ref.setField ("_intmemory" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 19;BA.debugLine="fltRAM  = 0";
Debug.ShouldStop(262144);
__ref.setField ("_fltram" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 20;BA.debugLine="strCPU = \"\"";
Debug.ShouldStop(524288);
__ref.setField ("_strcpu" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 21;BA.debugLine="intAmount = 0";
Debug.ShouldStop(1048576);
__ref.setField ("_intamount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 22;BA.debugLine="strOS = \"\"";
Debug.ShouldStop(2097152);
__ref.setField ("_stros" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 23;BA.debugLine="fltPrice = 0";
Debug.ShouldStop(4194304);
__ref.setField ("_fltprice" /*RemoteObject*/ ,BA.numberCast(float.class, 0));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newphone(RemoteObject __ref,RemoteObject _name,RemoteObject _scrsize,RemoteObject _mem,RemoteObject _ram,RemoteObject _cpu,RemoteObject _amount,RemoteObject _os,RemoteObject _price) throws Exception{
try {
		Debug.PushSubsStack("newPhone (phone) ","phone",2,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("newphone")) { return __ref.runUserSub(false, "phone","newphone", __ref, _name, _scrsize, _mem, _ram, _cpu, _amount, _os, _price);}
Debug.locals.put("name", _name);
Debug.locals.put("scrSize", _scrsize);
Debug.locals.put("mem", _mem);
Debug.locals.put("ram", _ram);
Debug.locals.put("cpu", _cpu);
Debug.locals.put("amount", _amount);
Debug.locals.put("OS", _os);
Debug.locals.put("price", _price);
 BA.debugLineNum = 27;BA.debugLine="Public Sub newPhone(name As String, scrSize As Str";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="strName = name";
Debug.ShouldStop(268435456);
__ref.setField ("_strname" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 30;BA.debugLine="strScreenSize  = scrSize";
Debug.ShouldStop(536870912);
__ref.setField ("_strscreensize" /*RemoteObject*/ ,_scrsize);
 BA.debugLineNum = 31;BA.debugLine="intMemory  = mem";
Debug.ShouldStop(1073741824);
__ref.setField ("_intmemory" /*RemoteObject*/ ,_mem);
 BA.debugLineNum = 32;BA.debugLine="fltRAM  = ram";
Debug.ShouldStop(-2147483648);
__ref.setField ("_fltram" /*RemoteObject*/ ,_ram);
 BA.debugLineNum = 33;BA.debugLine="strCPU = cpu";
Debug.ShouldStop(1);
__ref.setField ("_strcpu" /*RemoteObject*/ ,_cpu);
 BA.debugLineNum = 34;BA.debugLine="intAmount = amount";
Debug.ShouldStop(2);
__ref.setField ("_intamount" /*RemoteObject*/ ,_amount);
 BA.debugLineNum = 35;BA.debugLine="strOS = OS";
Debug.ShouldStop(4);
__ref.setField ("_stros" /*RemoteObject*/ ,_os);
 BA.debugLineNum = 36;BA.debugLine="fltPrice = price";
Debug.ShouldStop(8);
__ref.setField ("_fltprice" /*RemoteObject*/ ,_price);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _storage(RemoteObject __ref,RemoteObject _amount) throws Exception{
try {
		Debug.PushSubsStack("storage (phone) ","phone",2,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("storage")) { return __ref.runUserSub(false, "phone","storage", __ref, _amount);}
Debug.locals.put("amount", _amount);
 BA.debugLineNum = 40;BA.debugLine="Public Sub storage(amount As Int)";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="intAmount = intAmount - amount";
Debug.ShouldStop(256);
__ref.setField ("_intamount" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_intamount" /*RemoteObject*/ ),_amount}, "-",1, 1));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtquantity_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("txtQuantity_TextChanged (phone) ","phone",2,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("txtquantity_textchanged")) { return __ref.runUserSub(false, "phone","txtquantity_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 44;BA.debugLine="Private Sub txtQuantity_TextChanged (Old As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}