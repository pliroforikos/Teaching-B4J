package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpage2_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xpage2) ","b4xpage2",3,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpage2","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 14;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Root = Root1";
Debug.ShouldStop(16384);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 17;BA.debugLine="Root.LoadLayout(\"page2\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("page2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 19;BA.debugLine="lblGlobal1.Text = B4XPages.MainPage.txtGlobal.Tex";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblglobal1" /*RemoteObject*/ ).runMethod(true,"setText",b4xpage2._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_txtglobal" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 20;BA.debugLine="lblGlobal2.Text = B4XPages.MainPage.page1.txtGlob";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblglobal2" /*RemoteObject*/ ).runMethod(true,"setText",b4xpage2._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_page1" /*RemoteObject*/ ).getField(false,"_txtglobal2" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnback_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnBack_Click (b4xpage2) ","b4xpage2",3,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("btnback_click")) { return __ref.runUserSub(false, "b4xpage2","btnback_click", __ref);}
 BA.debugLineNum = 24;BA.debugLine="Private Sub btnBack_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(16777216);
b4xpage2._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,(Object)(__ref));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
b4xpage2._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpage2._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpage2._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpage2._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private lblGlobal1 As Label";
b4xpage2._lblglobal1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblglobal1",b4xpage2._lblglobal1);
 //BA.debugLineNum = 5;BA.debugLine="Private lblGlobal2 As Label";
b4xpage2._lblglobal2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblglobal2",b4xpage2._lblglobal2);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xpage2) ","b4xpage2",3,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpage2","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="Return Me";
Debug.ShouldStop(512);
if (true) return __ref;
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}