package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
RemoteObject _inta = RemoteObject.createImmutable(0);
RemoteObject _intb = RemoteObject.createImmutable(0);
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 19;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Root = Root1";
Debug.ShouldStop(524288);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 21;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 22;BA.debugLine="Private intA, intB As Int";
Debug.ShouldStop(2097152);
_inta = RemoteObject.createImmutable(0);Debug.locals.put("intA", _inta);
_intb = RemoteObject.createImmutable(0);Debug.locals.put("intB", _intb);
 BA.debugLineNum = 23;BA.debugLine="intA = 10";
Debug.ShouldStop(4194304);
_inta = BA.numberCast(int.class, 10);Debug.locals.put("intA", _inta);
 BA.debugLineNum = 24;BA.debugLine="intB = 30";
Debug.ShouldStop(8388608);
_intb = BA.numberCast(int.class, 30);Debug.locals.put("intB", _intb);
 BA.debugLineNum = 26;BA.debugLine="showSum1(intA, intB)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showsum1" /*RemoteObject*/ ,(Object)(BA.NumberToString(_inta)),(Object)(_intb));
 BA.debugLineNum = 27;BA.debugLine="Log(intSum)";
Debug.ShouldStop(67108864);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(__ref.getField(true,"_intsum" /*RemoteObject*/ ))));
 BA.debugLineNum = 29;BA.debugLine="Log(Sum(intA, intB))";
Debug.ShouldStop(268435456);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_sum" /*RemoteObject*/ ,(Object)(BA.NumberToString(_inta)),(Object)(_intb)))));
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private intSum As Int";
b4xmainpage._intsum = RemoteObject.createImmutable(0);__ref.setField("_intsum",b4xmainpage._intsum);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(8192);
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showsum1(RemoteObject __ref,RemoteObject _a,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("showSum1 (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("showsum1")) { return __ref.runUserSub(false, "b4xmainpage","showsum1", __ref, _a, _b);}
Debug.locals.put("a", _a);
Debug.locals.put("b", _b);
 BA.debugLineNum = 32;BA.debugLine="Private Sub showSum1(a, b As Int)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="intSum = a + b";
Debug.ShouldStop(1);
__ref.setField ("_intsum" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _a),_b}, "+",1, 0)));
 BA.debugLineNum = 34;BA.debugLine="Log(intSum)";
Debug.ShouldStop(2);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(__ref.getField(true,"_intsum" /*RemoteObject*/ ))));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sum(RemoteObject __ref,RemoteObject _a,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("Sum (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("sum")) { return __ref.runUserSub(false, "b4xmainpage","sum", __ref, _a, _b);}
Debug.locals.put("a", _a);
Debug.locals.put("b", _b);
 BA.debugLineNum = 38;BA.debugLine="Private Sub Sum(a, b As Int) As Int";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Return a+b";
Debug.ShouldStop(64);
if (true) return BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _a),_b}, "+",1, 0));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}