package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpageprimary_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xpageprimary) ","b4xpageprimary",2,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpageprimary","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 15;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Root = Root1";
Debug.ShouldStop(32768);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 18;BA.debugLine="Root.LoadLayout(\"frmPrimary\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("frmPrimary")),__ref.getField(false, "ba"));
 BA.debugLineNum = 19;BA.debugLine="txtA.Text = 0";
Debug.ShouldStop(262144);
__ref.getField(false,"_txta" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 20;BA.debugLine="txtB.Text = 0";
Debug.ShouldStop(524288);
__ref.getField(false,"_txtb" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
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
		Debug.PushSubsStack("btnCalculate_Click (b4xpageprimary) ","b4xpageprimary",2,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("btncalculate_click")) { return __ref.runUserSub(false, "b4xpageprimary","btncalculate_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0f);
RemoteObject _b = RemoteObject.createImmutable(0f);
RemoteObject _c = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 26;BA.debugLine="Private Sub btnCalculate_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Private a, b, c As Float";
Debug.ShouldStop(67108864);
_a = RemoteObject.createImmutable(0f);Debug.locals.put("a", _a);
_b = RemoteObject.createImmutable(0f);Debug.locals.put("b", _b);
_c = RemoteObject.createImmutable(0f);Debug.locals.put("c", _c);
 BA.debugLineNum = 28;BA.debugLine="a = txtA.Text";
Debug.ShouldStop(134217728);
_a = BA.numberCast(float.class, __ref.getField(false,"_txta" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("a", _a);
 BA.debugLineNum = 29;BA.debugLine="b = txtB.Text";
Debug.ShouldStop(268435456);
_b = BA.numberCast(float.class, __ref.getField(false,"_txtb" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("b", _b);
 BA.debugLineNum = 30;BA.debugLine="If a <> 0 And b <> 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("!",_a,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",_b,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 31;BA.debugLine="c = -b/a";
Debug.ShouldStop(1073741824);
_c = BA.numberCast(float.class, -(double) (0 + _b.<Float>get().floatValue())/(double)(double) (0 + _a.<Float>get().floatValue()));Debug.locals.put("c", _c);
 BA.debugLineNum = 32;BA.debugLine="lblMessage.text = c";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblmessage" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_c));
 };
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
b4xpageprimary._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpageprimary._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpageprimary._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpageprimary._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private lblMessage As Label";
b4xpageprimary._lblmessage = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblmessage",b4xpageprimary._lblmessage);
 //BA.debugLineNum = 5;BA.debugLine="Private txtA As TextField";
b4xpageprimary._txta = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txta",b4xpageprimary._txta);
 //BA.debugLineNum = 6;BA.debugLine="Private txtB As TextField";
b4xpageprimary._txtb = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtb",b4xpageprimary._txtb);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xpageprimary) ","b4xpageprimary",2,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpageprimary","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Return Me";
Debug.ShouldStop(1024);
if (true) return __ref;
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}