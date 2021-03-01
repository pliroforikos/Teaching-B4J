package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 22;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Root = Root1";
Debug.ShouldStop(4194304);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 24;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
RemoteObject _flttotal = RemoteObject.createImmutable(0f);
RemoteObject _fltfee = RemoteObject.createImmutable(0f);
RemoteObject _flttax = RemoteObject.createImmutable(0f);
RemoteObject _strmember = RemoteObject.createImmutable("");
 BA.debugLineNum = 28;BA.debugLine="Private Sub btnCalculate_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Private fltTotal, fltFee, fltTax As Float";
Debug.ShouldStop(268435456);
_flttotal = RemoteObject.createImmutable(0f);Debug.locals.put("fltTotal", _flttotal);
_fltfee = RemoteObject.createImmutable(0f);Debug.locals.put("fltFee", _fltfee);
_flttax = RemoteObject.createImmutable(0f);Debug.locals.put("fltTax", _flttax);
 BA.debugLineNum = 30;BA.debugLine="Private strMember As String";
Debug.ShouldStop(536870912);
_strmember = RemoteObject.createImmutable("");Debug.locals.put("strMember", _strmember);
 BA.debugLineNum = 32;BA.debugLine="If txtMember.Text = \"Yes\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtmember" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("Yes"))) { 
 BA.debugLineNum = 33;BA.debugLine="fltTax = 10";
Debug.ShouldStop(1);
_flttax = BA.numberCast(float.class, 10);Debug.locals.put("fltTax", _flttax);
 BA.debugLineNum = 34;BA.debugLine="fltFee = 2";
Debug.ShouldStop(2);
_fltfee = BA.numberCast(float.class, 2);Debug.locals.put("fltFee", _fltfee);
 BA.debugLineNum = 35;BA.debugLine="strMember = \"is a member\"";
Debug.ShouldStop(4);
_strmember = BA.ObjectToString("is a member");Debug.locals.put("strMember", _strmember);
 }else {
 BA.debugLineNum = 37;BA.debugLine="fltTax = 20";
Debug.ShouldStop(16);
_flttax = BA.numberCast(float.class, 20);Debug.locals.put("fltTax", _flttax);
 BA.debugLineNum = 38;BA.debugLine="fltFee = 5";
Debug.ShouldStop(32);
_fltfee = BA.numberCast(float.class, 5);Debug.locals.put("fltFee", _fltfee);
 BA.debugLineNum = 39;BA.debugLine="strMember = \"is not a member\"";
Debug.ShouldStop(64);
_strmember = BA.ObjectToString("is not a member");Debug.locals.put("strMember", _strmember);
 };
 BA.debugLineNum = 42;BA.debugLine="fltTotal = fltFee * txtHours.Text + fltFee * txtH";
Debug.ShouldStop(512);
_flttotal = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_fltfee,BA.numberCast(double.class, __ref.getField(false,"_txthours" /*RemoteObject*/ ).runMethod(true,"getText")),_fltfee,BA.numberCast(double.class, __ref.getField(false,"_txthours" /*RemoteObject*/ ).runMethod(true,"getText")),_flttax}, "*+*/",1, 0));Debug.locals.put("fltTotal", _flttotal);
 BA.debugLineNum = 43;BA.debugLine="lblMessage.Text = \"The user \" & strMember & \" and";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblmessage" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("The user "),_strmember,RemoteObject.createImmutable(" and stayed "),__ref.getField(false,"_txthours" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" for "),_fltfee,RemoteObject.createImmutable("/hour plus "),_flttax,RemoteObject.createImmutable("% the total amount is "),_flttotal));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
 //BA.debugLineNum = 11;BA.debugLine="Private btnCalculate As Button";
b4xmainpage._btncalculate = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btncalculate",b4xmainpage._btncalculate);
 //BA.debugLineNum = 12;BA.debugLine="Private lblMessage As Label";
b4xmainpage._lblmessage = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblmessage",b4xmainpage._lblmessage);
 //BA.debugLineNum = 13;BA.debugLine="Private txtHours As TextField";
b4xmainpage._txthours = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txthours",b4xmainpage._txthours);
 //BA.debugLineNum = 14;BA.debugLine="Private txtMember As TextField";
b4xmainpage._txtmember = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtmember",b4xmainpage._txtmember);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(65536);
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}