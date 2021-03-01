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
public static RemoteObject  _btncalc_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCalc_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("btncalc_click")) { return __ref.runUserSub(false, "b4xmainpage","btncalc_click", __ref);}
RemoteObject _fltcost = RemoteObject.createImmutable(0f);
RemoteObject _meal = RemoteObject.createImmutable("");
 BA.debugLineNum = 31;BA.debugLine="Private Sub btnCalc_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 35;BA.debugLine="Private fltCost As Float";
Debug.ShouldStop(4);
_fltcost = RemoteObject.createImmutable(0f);Debug.locals.put("fltCost", _fltcost);
 BA.debugLineNum = 36;BA.debugLine="Private meal As String";
Debug.ShouldStop(8);
_meal = RemoteObject.createImmutable("");Debug.locals.put("meal", _meal);
 BA.debugLineNum = 38;BA.debugLine="If txtMeal.text = \"Hot Dog\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtmeal" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("Hot Dog"))) { 
 BA.debugLineNum = 39;BA.debugLine="fltCost = txtQuantity.Text * 1.5";
Debug.ShouldStop(64);
_fltcost = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtquantity" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(1.5)}, "*",0, 0));Debug.locals.put("fltCost", _fltcost);
 BA.debugLineNum = 40;BA.debugLine="meal = \"Hot Dog\"";
Debug.ShouldStop(128);
_meal = BA.ObjectToString("Hot Dog");Debug.locals.put("meal", _meal);
 }else 
{ BA.debugLineNum = 41;BA.debugLine="else if txtMeal.text = \"Pizza\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtmeal" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("Pizza"))) { 
 BA.debugLineNum = 42;BA.debugLine="fltCost = txtQuantity.Text * 3";
Debug.ShouldStop(512);
_fltcost = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtquantity" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(3)}, "*",0, 0));Debug.locals.put("fltCost", _fltcost);
 BA.debugLineNum = 43;BA.debugLine="meal = \"Pizza\"";
Debug.ShouldStop(1024);
_meal = BA.ObjectToString("Pizza");Debug.locals.put("meal", _meal);
 }else 
{ BA.debugLineNum = 44;BA.debugLine="else if txtMeal.text = \"Burger\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtmeal" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("Burger"))) { 
 BA.debugLineNum = 45;BA.debugLine="fltCost = txtQuantity.Text * 5";
Debug.ShouldStop(4096);
_fltcost = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtquantity" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(5)}, "*",0, 0));Debug.locals.put("fltCost", _fltcost);
 BA.debugLineNum = 46;BA.debugLine="meal = \"Burger\"";
Debug.ShouldStop(8192);
_meal = BA.ObjectToString("Burger");Debug.locals.put("meal", _meal);
 }}}
;
 BA.debugLineNum = 48;BA.debugLine="txtCost.Text = txtQuantity.Text & \" x \" & meal &";
Debug.ShouldStop(32768);
__ref.getField(false,"_txtcost" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(__ref.getField(false,"_txtquantity" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" x "),_meal,RemoteObject.createImmutable(" "),_fltcost,RemoteObject.createImmutable(" $")));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
 //BA.debugLineNum = 11;BA.debugLine="Private btnCalc As Button";
b4xmainpage._btncalc = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btncalc",b4xmainpage._btncalc);
 //BA.debugLineNum = 12;BA.debugLine="Private txtCost As TextField";
b4xmainpage._txtcost = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcost",b4xmainpage._txtcost);
 //BA.debugLineNum = 13;BA.debugLine="Private txtMeal As TextField";
b4xmainpage._txtmeal = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtmeal",b4xmainpage._txtmeal);
 //BA.debugLineNum = 14;BA.debugLine="Private txtQuantity As TextField";
b4xmainpage._txtquantity = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtquantity",b4xmainpage._txtquantity);
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