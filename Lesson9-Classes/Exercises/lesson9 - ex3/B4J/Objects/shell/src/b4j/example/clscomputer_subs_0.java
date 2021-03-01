package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clscomputer_subs_0 {


public static RemoteObject  _changecpu(RemoteObject __ref,RemoteObject _cpu) throws Exception{
try {
		Debug.PushSubsStack("changeCpu (clscomputer) ","clscomputer",2,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("changecpu")) { return __ref.runUserSub(false, "clscomputer","changecpu", __ref, _cpu);}
Debug.locals.put("cpu", _cpu);
 BA.debugLineNum = 31;BA.debugLine="public Sub changeCpu(cpu As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="strCpu = cpu";
Debug.ShouldStop(-2147483648);
__ref.setField ("_strcpu" /*RemoteObject*/ ,_cpu);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _changeprice(RemoteObject __ref,RemoteObject _price) throws Exception{
try {
		Debug.PushSubsStack("changePrice (clscomputer) ","clscomputer",2,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("changeprice")) { return __ref.runUserSub(false, "clscomputer","changeprice", __ref, _price);}
Debug.locals.put("price", _price);
 BA.debugLineNum = 35;BA.debugLine="public Sub changePrice(price As Float)";
Debug.ShouldStop(4);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
clscomputer._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",clscomputer._fx);
 //BA.debugLineNum = 3;BA.debugLine="Public strType, strModel, strCpu As String";
clscomputer._strtype = RemoteObject.createImmutable("");__ref.setField("_strtype",clscomputer._strtype);
clscomputer._strmodel = RemoteObject.createImmutable("");__ref.setField("_strmodel",clscomputer._strmodel);
clscomputer._strcpu = RemoteObject.createImmutable("");__ref.setField("_strcpu",clscomputer._strcpu);
 //BA.debugLineNum = 4;BA.debugLine="Public fltPrice As Float";
clscomputer._fltprice = RemoteObject.createImmutable(0f);__ref.setField("_fltprice",clscomputer._fltprice);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clscomputer) ","clscomputer",2,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clscomputer","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="strType = \"\"";
Debug.ShouldStop(256);
__ref.setField ("_strtype" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 10;BA.debugLine="strModel = \"\"";
Debug.ShouldStop(512);
__ref.setField ("_strmodel" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 11;BA.debugLine="strCpu = \"\"";
Debug.ShouldStop(1024);
__ref.setField ("_strcpu" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 12;BA.debugLine="fltPrice = 0";
Debug.ShouldStop(2048);
__ref.setField ("_fltprice" /*RemoteObject*/ ,BA.numberCast(float.class, 0));
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newcomputer(RemoteObject __ref,RemoteObject _tp,RemoteObject _model,RemoteObject _cpu,RemoteObject _price) throws Exception{
try {
		Debug.PushSubsStack("newComputer (clscomputer) ","clscomputer",2,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("newcomputer")) { return __ref.runUserSub(false, "clscomputer","newcomputer", __ref, _tp, _model, _cpu, _price);}
Debug.locals.put("tp", _tp);
Debug.locals.put("model", _model);
Debug.locals.put("cpu", _cpu);
Debug.locals.put("price", _price);
 BA.debugLineNum = 15;BA.debugLine="Public Sub newComputer(tp As String , model As Str";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="strType = tp";
Debug.ShouldStop(32768);
__ref.setField ("_strtype" /*RemoteObject*/ ,_tp);
 BA.debugLineNum = 17;BA.debugLine="strModel = model";
Debug.ShouldStop(65536);
__ref.setField ("_strmodel" /*RemoteObject*/ ,_model);
 BA.debugLineNum = 18;BA.debugLine="strCpu = cpu";
Debug.ShouldStop(131072);
__ref.setField ("_strcpu" /*RemoteObject*/ ,_cpu);
 BA.debugLineNum = 19;BA.debugLine="fltPrice = price";
Debug.ShouldStop(262144);
__ref.setField ("_fltprice" /*RemoteObject*/ ,_price);
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showcomputer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("showComputer (clscomputer) ","clscomputer",2,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("showcomputer")) { return __ref.runUserSub(false, "clscomputer","showcomputer", __ref);}
 BA.debugLineNum = 23;BA.debugLine="Public Sub showComputer";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Log(\"Type 		: \" & strType)";
Debug.ShouldStop(8388608);
clscomputer.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Type 		: "),__ref.getField(true,"_strtype" /*RemoteObject*/ ))));
 BA.debugLineNum = 25;BA.debugLine="Log(\"Model		: \" & strModel)";
Debug.ShouldStop(16777216);
clscomputer.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Model		: "),__ref.getField(true,"_strmodel" /*RemoteObject*/ ))));
 BA.debugLineNum = 26;BA.debugLine="Log(\"CPU		: \" & strCpu)";
Debug.ShouldStop(33554432);
clscomputer.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("CPU		: "),__ref.getField(true,"_strcpu" /*RemoteObject*/ ))));
 BA.debugLineNum = 27;BA.debugLine="Log(\"Price		: \" & fltPrice)";
Debug.ShouldStop(67108864);
clscomputer.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Price		: "),__ref.getField(true,"_fltprice" /*RemoteObject*/ ))));
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}