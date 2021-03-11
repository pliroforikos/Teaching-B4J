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
		Debug.PushSubsStack("btnCalculate_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("btncalculate_click")) { return __ref.runUserSub(false, "b4xmainpage","btncalculate_click", __ref);}
 BA.debugLineNum = 26;BA.debugLine="Private Sub btnCalculate_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="If txtMeal.Text = \"Burger\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtmeal" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("Burger"))) { 
 BA.debugLineNum = 28;BA.debugLine="lblShow.Text = \"Burger 5$\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblshow" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Burger 5$"));
 }else 
{ BA.debugLineNum = 29;BA.debugLine="else if txtMeal.Text = \"Pizza\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtmeal" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("Pizza"))) { 
 BA.debugLineNum = 30;BA.debugLine="lblShow.Text = \"Pizza 3$\"";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblshow" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Pizza 3$"));
 }else 
{ BA.debugLineNum = 31;BA.debugLine="else if txtMeal.Text = \"Hot Dog\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtmeal" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("Hot Dog"))) { 
 BA.debugLineNum = 32;BA.debugLine="lblShow.Text = \"Hot Dog 1.5$\"";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblshow" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Hot Dog 1.5$"));
 }else {
 BA.debugLineNum = 34;BA.debugLine="lblShow.Text = \"Wrong Entry. Please try again\"";
Debug.ShouldStop(2);
__ref.getField(false,"_lblshow" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Wrong Entry. Please try again"));
 }}}
;
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
 //BA.debugLineNum = 12;BA.debugLine="Private lblShow As Label";
b4xmainpage._lblshow = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblshow",b4xmainpage._lblshow);
 //BA.debugLineNum = 13;BA.debugLine="Private txtMeal As TextField";
b4xmainpage._txtmeal = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtmeal",b4xmainpage._txtmeal);
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