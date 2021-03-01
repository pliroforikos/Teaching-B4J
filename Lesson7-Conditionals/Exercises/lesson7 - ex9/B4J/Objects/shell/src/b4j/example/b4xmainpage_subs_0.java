package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 25;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Root = Root1";
Debug.ShouldStop(33554432);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 27;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 28;BA.debugLine="txt4rthTry.Visible = False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txt4rthtry" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 29;BA.debugLine="txt5thTry.Visible = False";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txt5thtry" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 30;BA.debugLine="txt6thTry.Visible = False";
Debug.ShouldStop(536870912);
__ref.getField(false,"_txt6thtry" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 31;BA.debugLine="btnMax.Visible = False";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_btnmax" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncheck_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCheck_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("btncheck_click")) { return __ref.runUserSub(false, "b4xmainpage","btncheck_click", __ref);}
 BA.debugLineNum = 34;BA.debugLine="Private Sub btnCheck_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="If txt1stTry.Text > 7.5 Or txt2ndTry.Text > 7.5 O";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_txt1sttry" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 7.5)) || RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_txt2ndtry" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 7.5)) || RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_txt3rdtry" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 7.5))) { 
 BA.debugLineNum = 36;BA.debugLine="txt4rthTry.Visible = True";
Debug.ShouldStop(8);
__ref.getField(false,"_txt4rthtry" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 37;BA.debugLine="txt5thTry.Visible = True";
Debug.ShouldStop(16);
__ref.getField(false,"_txt5thtry" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 38;BA.debugLine="txt6thTry.Visible = True";
Debug.ShouldStop(32);
__ref.getField(false,"_txt6thtry" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 39;BA.debugLine="btnMax.Visible = True";
Debug.ShouldStop(64);
__ref.getField(false,"_btnmax" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 41;BA.debugLine="lblMessage.Text = \"Disqualified\"";
Debug.ShouldStop(256);
__ref.getField(false,"_lblmessage" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Disqualified"));
 };
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnmax_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnMax_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("btnmax_click")) { return __ref.runUserSub(false, "b4xmainpage","btnmax_click", __ref);}
RemoteObject _max1 = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 47;BA.debugLine="Private Sub btnMax_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Private MAX1 As Float";
Debug.ShouldStop(32768);
_max1 = RemoteObject.createImmutable(0f);Debug.locals.put("MAX1", _max1);
 BA.debugLineNum = 50;BA.debugLine="MAX1 = txt1stTry.Text";
Debug.ShouldStop(131072);
_max1 = BA.numberCast(float.class, __ref.getField(false,"_txt1sttry" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("MAX1", _max1);
 BA.debugLineNum = 51;BA.debugLine="If MAX1 < txt2ndTry.Text Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("<",_max1,BA.numberCast(double.class, __ref.getField(false,"_txt2ndtry" /*RemoteObject*/ ).runMethod(true,"getText")))) { 
 BA.debugLineNum = 52;BA.debugLine="MAX1 = txt2ndTry.text";
Debug.ShouldStop(524288);
_max1 = BA.numberCast(float.class, __ref.getField(false,"_txt2ndtry" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("MAX1", _max1);
 };
 BA.debugLineNum = 54;BA.debugLine="If MAX1 < txt3rdTry.Text Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("<",_max1,BA.numberCast(double.class, __ref.getField(false,"_txt3rdtry" /*RemoteObject*/ ).runMethod(true,"getText")))) { 
 BA.debugLineNum = 55;BA.debugLine="MAX1 = txt3rdTry.text";
Debug.ShouldStop(4194304);
_max1 = BA.numberCast(float.class, __ref.getField(false,"_txt3rdtry" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("MAX1", _max1);
 };
 BA.debugLineNum = 57;BA.debugLine="If MAX1 < txt4rthTry.Text Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("<",_max1,BA.numberCast(double.class, __ref.getField(false,"_txt4rthtry" /*RemoteObject*/ ).runMethod(true,"getText")))) { 
 BA.debugLineNum = 58;BA.debugLine="MAX1 = txt4rthTry.text";
Debug.ShouldStop(33554432);
_max1 = BA.numberCast(float.class, __ref.getField(false,"_txt4rthtry" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("MAX1", _max1);
 };
 BA.debugLineNum = 60;BA.debugLine="If MAX1 < txt5thTry.Text Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("<",_max1,BA.numberCast(double.class, __ref.getField(false,"_txt5thtry" /*RemoteObject*/ ).runMethod(true,"getText")))) { 
 BA.debugLineNum = 61;BA.debugLine="MAX1 = txt5thTry.text";
Debug.ShouldStop(268435456);
_max1 = BA.numberCast(float.class, __ref.getField(false,"_txt5thtry" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("MAX1", _max1);
 };
 BA.debugLineNum = 63;BA.debugLine="If MAX1 < txt6thTry.Text Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("<",_max1,BA.numberCast(double.class, __ref.getField(false,"_txt6thtry" /*RemoteObject*/ ).runMethod(true,"getText")))) { 
 BA.debugLineNum = 64;BA.debugLine="MAX1 = txt6thTry.text";
Debug.ShouldStop(-2147483648);
_max1 = BA.numberCast(float.class, __ref.getField(false,"_txt6thtry" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("MAX1", _max1);
 };
 BA.debugLineNum = 67;BA.debugLine="lblMessage.Text = \"Best effort = \" & MAX1";
Debug.ShouldStop(4);
__ref.getField(false,"_lblmessage" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Best effort = "),_max1));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private btnCheck As Button";
b4xmainpage._btncheck = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btncheck",b4xmainpage._btncheck);
 //BA.debugLineNum = 12;BA.debugLine="Private btnMax As Button";
b4xmainpage._btnmax = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnmax",b4xmainpage._btnmax);
 //BA.debugLineNum = 13;BA.debugLine="Private lblMessage As Label";
b4xmainpage._lblmessage = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblmessage",b4xmainpage._lblmessage);
 //BA.debugLineNum = 14;BA.debugLine="Private txt1stTry As TextField";
b4xmainpage._txt1sttry = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txt1sttry",b4xmainpage._txt1sttry);
 //BA.debugLineNum = 15;BA.debugLine="Private txt2ndTry As TextField";
b4xmainpage._txt2ndtry = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txt2ndtry",b4xmainpage._txt2ndtry);
 //BA.debugLineNum = 16;BA.debugLine="Private txt3rdTry As TextField";
b4xmainpage._txt3rdtry = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txt3rdtry",b4xmainpage._txt3rdtry);
 //BA.debugLineNum = 17;BA.debugLine="Private txt4rthTry As TextField";
b4xmainpage._txt4rthtry = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txt4rthtry",b4xmainpage._txt4rthtry);
 //BA.debugLineNum = 18;BA.debugLine="Private txt5thTry As TextField";
b4xmainpage._txt5thtry = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txt5thtry",b4xmainpage._txt5thtry);
 //BA.debugLineNum = 19;BA.debugLine="Private txt6thTry As TextField";
b4xmainpage._txt6thtry = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txt6thtry",b4xmainpage._txt6thtry);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(2097152);
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
}