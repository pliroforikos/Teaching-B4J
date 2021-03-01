package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 21;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Root = Root1";
Debug.ShouldStop(2097152);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 23;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
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
public static RemoteObject  _btncalculate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCalculate_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("btncalculate_click")) { return __ref.runUserSub(false, "b4xmainpage","btncalculate_click", __ref);}
RemoteObject _fltship = RemoteObject.createImmutable(0f);
RemoteObject _flttotal = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 28;BA.debugLine="Private Sub btnCalculate_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Private fltShip, fltTotal As Float";
Debug.ShouldStop(268435456);
_fltship = RemoteObject.createImmutable(0f);Debug.locals.put("fltShip", _fltship);
_flttotal = RemoteObject.createImmutable(0f);Debug.locals.put("fltTotal", _flttotal);
 BA.debugLineNum = 31;BA.debugLine="If txtLocation.text = \"US\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtlocation" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("US"))) { 
 BA.debugLineNum = 32;BA.debugLine="fltShip = 3";
Debug.ShouldStop(-2147483648);
_fltship = BA.numberCast(float.class, 3);Debug.locals.put("fltShip", _fltship);
 }else 
{ BA.debugLineNum = 33;BA.debugLine="else if txtLocation.text = \"Europe\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtlocation" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("Europe"))) { 
 BA.debugLineNum = 34;BA.debugLine="fltShip = 7";
Debug.ShouldStop(2);
_fltship = BA.numberCast(float.class, 7);Debug.locals.put("fltShip", _fltship);
 }else 
{ BA.debugLineNum = 35;BA.debugLine="else if txtLocation.text = \"Canada\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtlocation" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("Canada"))) { 
 BA.debugLineNum = 36;BA.debugLine="fltShip = 5";
Debug.ShouldStop(8);
_fltship = BA.numberCast(float.class, 5);Debug.locals.put("fltShip", _fltship);
 }}}
;
 BA.debugLineNum = 38;BA.debugLine="fltTotal = fltShip + txtCost.Text";
Debug.ShouldStop(32);
_flttotal = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_fltship,BA.numberCast(double.class, __ref.getField(false,"_txtcost" /*RemoteObject*/ ).runMethod(true,"getText"))}, "+",1, 0));Debug.locals.put("fltTotal", _flttotal);
 BA.debugLineNum = 40;BA.debugLine="lblMessage.Text = \" You have to pay \" & fltTotal";
Debug.ShouldStop(128);
__ref.getField(false,"_lblmessage" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable(" You have to pay "),_flttotal,RemoteObject.createImmutable("$, "),__ref.getField(false,"_txtcost" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable("$ for the product and "),_fltship,RemoteObject.createImmutable("$ for shipping cost")));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
 //BA.debugLineNum = 11;BA.debugLine="Private lblMessage As Label";
b4xmainpage._lblmessage = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblmessage",b4xmainpage._lblmessage);
 //BA.debugLineNum = 12;BA.debugLine="Private txtCost As TextField";
b4xmainpage._txtcost = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcost",b4xmainpage._txtcost);
 //BA.debugLineNum = 13;BA.debugLine="Private txtLocation As TextField";
b4xmainpage._txtlocation = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtlocation",b4xmainpage._txtlocation);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32768);
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}