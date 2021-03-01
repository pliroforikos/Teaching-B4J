package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
RemoteObject _inta = RemoteObject.createImmutable(0);
RemoteObject _intb = RemoteObject.createImmutable(0);
RemoteObject _intc = RemoteObject.createImmutable(0);
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 14;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Root = Root1";
Debug.ShouldStop(16384);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 16;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 17;BA.debugLine="Private intA, intB, intC As Int";
Debug.ShouldStop(65536);
_inta = RemoteObject.createImmutable(0);Debug.locals.put("intA", _inta);
_intb = RemoteObject.createImmutable(0);Debug.locals.put("intB", _intb);
_intc = RemoteObject.createImmutable(0);Debug.locals.put("intC", _intc);
 BA.debugLineNum = 18;BA.debugLine="intA = 20";
Debug.ShouldStop(131072);
_inta = BA.numberCast(int.class, 20);Debug.locals.put("intA", _inta);
 BA.debugLineNum = 19;BA.debugLine="intB = 10";
Debug.ShouldStop(262144);
_intb = BA.numberCast(int.class, 10);Debug.locals.put("intB", _intb);
 BA.debugLineNum = 20;BA.debugLine="intC = 300";
Debug.ShouldStop(524288);
_intc = BA.numberCast(int.class, 300);Debug.locals.put("intC", _intc);
 BA.debugLineNum = 22;BA.debugLine="Log(sMax(intA, intB, intC))";
Debug.ShouldStop(2097152);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_smax" /*RemoteObject*/ ,(Object)(_inta),(Object)(_intb),(Object)(_intc)))));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _smax(RemoteObject __ref,RemoteObject _a,RemoteObject _b,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("sMax (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("smax")) { return __ref.runUserSub(false, "b4xmainpage","smax", __ref, _a, _b, _c);}
RemoteObject _intm = RemoteObject.createImmutable(0);
Debug.locals.put("a", _a);
Debug.locals.put("b", _b);
Debug.locals.put("c", _c);
 BA.debugLineNum = 25;BA.debugLine="Private Sub sMax(a As Int, b As Int, c As Int) As";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Private intM As Int";
Debug.ShouldStop(33554432);
_intm = RemoteObject.createImmutable(0);Debug.locals.put("intM", _intm);
 BA.debugLineNum = 27;BA.debugLine="intM = a";
Debug.ShouldStop(67108864);
_intm = _a;Debug.locals.put("intM", _intm);
 BA.debugLineNum = 28;BA.debugLine="If b > intM Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_b,BA.numberCast(double.class, _intm))) { 
 BA.debugLineNum = 29;BA.debugLine="intM = b";
Debug.ShouldStop(268435456);
_intm = _b;Debug.locals.put("intM", _intm);
 };
 BA.debugLineNum = 31;BA.debugLine="If c > intM Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_c,BA.numberCast(double.class, _intm))) { 
 BA.debugLineNum = 32;BA.debugLine="intM = c";
Debug.ShouldStop(-2147483648);
_intm = _c;Debug.locals.put("intM", _intm);
 };
 BA.debugLineNum = 35;BA.debugLine="Return(intM)";
Debug.ShouldStop(4);
if (true) return (_intm);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}