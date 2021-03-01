package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 27;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Root = Root1";
Debug.ShouldStop(134217728);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 29;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 30;BA.debugLine="pgTotal.Initialize";
Debug.ShouldStop(536870912);
__ref.getField(false,"_pgtotal" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagetotal.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 31;BA.debugLine="B4XPages.AddPage(\"pgTotal\", pgTotal)";
Debug.ShouldStop(1073741824);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("pgTotal")),(Object)((__ref.getField(false,"_pgtotal" /*RemoteObject*/ ))));
 BA.debugLineNum = 33;BA.debugLine="lblPc1.Text = 799";
Debug.ShouldStop(1);
__ref.getField(false,"_lblpc1" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(799));
 BA.debugLineNum = 34;BA.debugLine="lblPc2.Text = 599";
Debug.ShouldStop(2);
__ref.getField(false,"_lblpc2" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(599));
 BA.debugLineNum = 35;BA.debugLine="lblPc3.Text = 499";
Debug.ShouldStop(4);
__ref.getField(false,"_lblpc3" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(499));
 BA.debugLineNum = 36;BA.debugLine="lblPc4.Text = 569";
Debug.ShouldStop(8);
__ref.getField(false,"_lblpc4" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(569));
 BA.debugLineNum = 37;BA.debugLine="txtPC1.Text = 0";
Debug.ShouldStop(16);
__ref.getField(false,"_txtpc1" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 38;BA.debugLine="txtPc2.Text = 0";
Debug.ShouldStop(32);
__ref.getField(false,"_txtpc2" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 39;BA.debugLine="txtPc3.Text = 0";
Debug.ShouldStop(64);
__ref.getField(false,"_txtpc3" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 40;BA.debugLine="txtPc4.Text = 0";
Debug.ShouldStop(128);
__ref.getField(false,"_txtpc4" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
 BA.debugLineNum = 45;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="B4XPages.ShowPage(\"pgTotal\")";
Debug.ShouldStop(8192);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pgTotal")));
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
 //BA.debugLineNum = 11;BA.debugLine="Public lblPc1 As Label";
b4xmainpage._lblpc1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblpc1",b4xmainpage._lblpc1);
 //BA.debugLineNum = 12;BA.debugLine="Public lblPc2 As Label";
b4xmainpage._lblpc2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblpc2",b4xmainpage._lblpc2);
 //BA.debugLineNum = 13;BA.debugLine="Public lblPc3 As Label";
b4xmainpage._lblpc3 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblpc3",b4xmainpage._lblpc3);
 //BA.debugLineNum = 14;BA.debugLine="Public lblPc4 As Label";
b4xmainpage._lblpc4 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblpc4",b4xmainpage._lblpc4);
 //BA.debugLineNum = 15;BA.debugLine="Public txtPC1 As TextField";
b4xmainpage._txtpc1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtpc1",b4xmainpage._txtpc1);
 //BA.debugLineNum = 16;BA.debugLine="Public txtPc2 As TextField";
b4xmainpage._txtpc2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtpc2",b4xmainpage._txtpc2);
 //BA.debugLineNum = 17;BA.debugLine="Public txtPc3 As TextField";
b4xmainpage._txtpc3 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtpc3",b4xmainpage._txtpc3);
 //BA.debugLineNum = 18;BA.debugLine="Public txtPc4 As TextField";
b4xmainpage._txtpc4 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtpc4",b4xmainpage._txtpc4);
 //BA.debugLineNum = 19;BA.debugLine="Private pgTotal As B4XPageTotal";
b4xmainpage._pgtotal = RemoteObject.createNew ("b4j.example.b4xpagetotal");__ref.setField("_pgtotal",b4xmainpage._pgtotal);
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
}