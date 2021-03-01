package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpagetriangle_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xpagetriangle) ","b4xpagetriangle",4,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpagetriangle","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 15;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Root = Root1";
Debug.ShouldStop(32768);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 18;BA.debugLine="Root.LoadLayout(\"frmTriangle\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("frmTriangle")),__ref.getField(false, "ba"));
 BA.debugLineNum = 19;BA.debugLine="txtA.Text = 0";
Debug.ShouldStop(262144);
__ref.getField(false,"_txta" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 20;BA.debugLine="txtB.Text = 0";
Debug.ShouldStop(524288);
__ref.getField(false,"_txtb" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 21;BA.debugLine="txtC.Text = 0";
Debug.ShouldStop(1048576);
__ref.getField(false,"_txtc" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
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
		Debug.PushSubsStack("btnCalculate_Click (b4xpagetriangle) ","b4xpagetriangle",4,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("btncalculate_click")) { return __ref.runUserSub(false, "b4xpagetriangle","btncalculate_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable("");
RemoteObject _b = RemoteObject.createImmutable("");
RemoteObject _c = RemoteObject.createImmutable("");
 BA.debugLineNum = 26;BA.debugLine="Private Sub btnCalculate_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Private a, b, c";
Debug.ShouldStop(67108864);
_a = RemoteObject.createImmutable("");Debug.locals.put("a", _a);
_b = RemoteObject.createImmutable("");Debug.locals.put("b", _b);
_c = RemoteObject.createImmutable("");Debug.locals.put("c", _c);
 BA.debugLineNum = 28;BA.debugLine="a = txtA.Text";
Debug.ShouldStop(134217728);
_a = __ref.getField(false,"_txta" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("a", _a);
 BA.debugLineNum = 29;BA.debugLine="b = txtB.Text";
Debug.ShouldStop(268435456);
_b = __ref.getField(false,"_txtb" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("b", _b);
 BA.debugLineNum = 30;BA.debugLine="If a <> 0 And b <> 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("!",_a,BA.NumberToString(0)) && RemoteObject.solveBoolean("!",_b,BA.NumberToString(0))) { 
 BA.debugLineNum = 31;BA.debugLine="c = Sqrt( a*a + b*b)";
Debug.ShouldStop(1073741824);
_c = BA.NumberToString(b4xpagetriangle.__c.runMethod(true,"Sqrt",(Object)(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _a),BA.numberCast(double.class, _a),BA.numberCast(double.class, _b),BA.numberCast(double.class, _b)}, "*+*",1, 0))));Debug.locals.put("c", _c);
 BA.debugLineNum = 32;BA.debugLine="txtC.Text = c";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtc" /*RemoteObject*/ ).runMethod(true,"setText",_c);
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
b4xpagetriangle._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpagetriangle._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpagetriangle._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpagetriangle._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private txtA As TextField";
b4xpagetriangle._txta = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txta",b4xpagetriangle._txta);
 //BA.debugLineNum = 5;BA.debugLine="Private txtB As TextField";
b4xpagetriangle._txtb = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtb",b4xpagetriangle._txtb);
 //BA.debugLineNum = 6;BA.debugLine="Private txtC As TextField";
b4xpagetriangle._txtc = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtc",b4xpagetriangle._txtc);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xpagetriangle) ","b4xpagetriangle",4,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpagetriangle","initialize", __ref, _ba);}
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