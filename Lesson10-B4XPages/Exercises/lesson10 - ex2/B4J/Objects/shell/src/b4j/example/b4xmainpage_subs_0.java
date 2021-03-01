package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 26;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Root = Root1";
Debug.ShouldStop(67108864);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 28;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 29;BA.debugLine="pg1.Initialize";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pg1" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpageprimary.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 30;BA.debugLine="B4XPages.AddPage(\"Primary\", pg1)";
Debug.ShouldStop(536870912);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Primary")),(Object)((__ref.getField(false,"_pg1" /*RemoteObject*/ ))));
 BA.debugLineNum = 31;BA.debugLine="pg2.Initialize";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pg2" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagesecondary.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="B4XPages.AddPage(\"Secondary\", pg2)";
Debug.ShouldStop(-2147483648);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Secondary")),(Object)((__ref.getField(false,"_pg2" /*RemoteObject*/ ))));
 BA.debugLineNum = 33;BA.debugLine="pg3.Initialize";
Debug.ShouldStop(1);
__ref.getField(false,"_pg3" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagetriangle.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 34;BA.debugLine="B4XPages.AddPage(\"Triangle\", pg3)";
Debug.ShouldStop(2);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Triangle")),(Object)((__ref.getField(false,"_pg3" /*RemoteObject*/ ))));
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
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="B4XPages.ShowPage(\"Primary\")";
Debug.ShouldStop(128);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Primary")));
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
public static RemoteObject  _button2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("button2_click")) { return __ref.runUserSub(false, "b4xmainpage","button2_click", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Private Sub Button2_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="B4XPages.ShowPage(\"Secondary\")";
Debug.ShouldStop(32768);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Secondary")));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button3_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("button3_click")) { return __ref.runUserSub(false, "b4xmainpage","button3_click", __ref);}
 BA.debugLineNum = 43;BA.debugLine="Private Sub Button3_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="B4XPages.ShowPage(\"Triangle\")";
Debug.ShouldStop(2048);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Triangle")));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 15;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 16;BA.debugLine="Private pg1 As B4XPagePrimary";
b4xmainpage._pg1 = RemoteObject.createNew ("b4j.example.b4xpageprimary");__ref.setField("_pg1",b4xmainpage._pg1);
 //BA.debugLineNum = 17;BA.debugLine="Private pg2 As B4XPageSecondary";
b4xmainpage._pg2 = RemoteObject.createNew ("b4j.example.b4xpagesecondary");__ref.setField("_pg2",b4xmainpage._pg2);
 //BA.debugLineNum = 18;BA.debugLine="Private pg3 As B4XPageTriangle";
b4xmainpage._pg3 = RemoteObject.createNew ("b4j.example.b4xpagetriangle");__ref.setField("_pg3",b4xmainpage._pg3);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1048576);
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