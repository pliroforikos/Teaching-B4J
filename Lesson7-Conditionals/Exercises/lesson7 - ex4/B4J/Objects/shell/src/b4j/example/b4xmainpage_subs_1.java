package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_1 {


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
 BA.debugLineNum = 28;BA.debugLine="Private Sub btnCalculate_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="lblTotal.Text = txtMeme.Text * 0.05 + txtWikipedi";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lbltotal" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtmeme" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(0.05),BA.numberCast(double.class, __ref.getField(false,"_txtwikipedia" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(0.1)}, "*+*",1, 0)));
 BA.debugLineNum = 30;BA.debugLine="If lblTotal.Text > 100 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_lbltotal" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 31;BA.debugLine="lblMessage.Text = \"Too much consumption\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblmessage" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Too much consumption"));
 };
 BA.debugLineNum = 33;BA.debugLine="If txtMeme.Text * 0.05 > txtWikipedia.Text * 0.1";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtmeme" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(0.05)}, "*",0, 0),RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtwikipedia" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(0.1)}, "*",0, 0))) { 
 BA.debugLineNum = 34;BA.debugLine="lblMessage2.Text = \"WOW MANY MEMES, SUCH LOL\"";
Debug.ShouldStop(2);
__ref.getField(false,"_lblmessage2" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("WOW MANY MEMES, SUCH LOL"));
 };
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
 //BA.debugLineNum = 12;BA.debugLine="Private lblMessage As Label";
b4xmainpage._lblmessage = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblmessage",b4xmainpage._lblmessage);
 //BA.debugLineNum = 13;BA.debugLine="Private txtMeme As TextArea";
b4xmainpage._txtmeme = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");__ref.setField("_txtmeme",b4xmainpage._txtmeme);
 //BA.debugLineNum = 14;BA.debugLine="Private txtWikipedia As TextArea";
b4xmainpage._txtwikipedia = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");__ref.setField("_txtwikipedia",b4xmainpage._txtwikipedia);
 //BA.debugLineNum = 15;BA.debugLine="Private lblTotal As Label";
b4xmainpage._lbltotal = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltotal",b4xmainpage._lbltotal);
 //BA.debugLineNum = 16;BA.debugLine="Private lblMessage2 As Label";
b4xmainpage._lblmessage2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblmessage2",b4xmainpage._lblmessage2);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}