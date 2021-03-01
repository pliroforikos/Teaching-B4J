package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 19;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Root = Root1";
Debug.ShouldStop(524288);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 21;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncalculate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCalculate_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("btncalculate_click")) { return __ref.runUserSub(false, "b4xmainpage","btncalculate_click", __ref);}
RemoteObject _fltradious = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 26;BA.debugLine="Private Sub btnCalculate_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Private fltRadious As Float = txtRadious.Text   '";
Debug.ShouldStop(67108864);
_fltradious = BA.numberCast(float.class, __ref.getField(false,"_txtradious" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("fltRadious", _fltradious);Debug.locals.put("fltRadious", _fltradious);
 BA.debugLineNum = 28;BA.debugLine="lblMessage.Text = calculateArea(fltRadious)		'in";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblmessage" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_calculatearea" /*RemoteObject*/ ,(Object)(_fltradious))));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calculatearea(RemoteObject __ref,RemoteObject _r) throws Exception{
try {
		Debug.PushSubsStack("calculateArea (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("calculatearea")) { return __ref.runUserSub(false, "b4xmainpage","calculatearea", __ref, _r);}
Debug.locals.put("r", _r);
 BA.debugLineNum = 31;BA.debugLine="Private Sub calculateArea(r As Float) As Float";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Return (3.14 * r * r)";
Debug.ShouldStop(-2147483648);
if (true) return BA.numberCast(float.class, (RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(3.14),_r,_r}, "**",0, 0)));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(0f);
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
 //BA.debugLineNum = 11;BA.debugLine="Private lblMessage As Label";
b4xmainpage._lblmessage = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblmessage",b4xmainpage._lblmessage);
 //BA.debugLineNum = 12;BA.debugLine="Private txtRadious As TextField";
b4xmainpage._txtradious = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtradious",b4xmainpage._txtradious);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16384);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}