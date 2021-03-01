package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 19;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Root = Root1";
Debug.ShouldStop(524288);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 21;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 22;BA.debugLine="page1.Initialize";
Debug.ShouldStop(2097152);
__ref.getField(false,"_page1" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpage1.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 23;BA.debugLine="B4XPages.AddPage(\"myPage1\", page1)";
Debug.ShouldStop(4194304);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("myPage1")),(Object)((__ref.getField(false,"_page1" /*RemoteObject*/ ))));
 BA.debugLineNum = 25;BA.debugLine="page2.Initialize";
Debug.ShouldStop(16777216);
__ref.getField(false,"_page2" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpage2.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 26;BA.debugLine="B4XPages.AddPage(\"myPage2\", page2)";
Debug.ShouldStop(33554432);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("myPage2")),(Object)((__ref.getField(false,"_page2" /*RemoteObject*/ ))));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnpage1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnPage1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("btnpage1_click")) { return __ref.runUserSub(false, "b4xmainpage","btnpage1_click", __ref);}
 BA.debugLineNum = 30;BA.debugLine="Private Sub btnPage1_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="B4XPages.ShowPage(\"myPage1\")";
Debug.ShouldStop(1073741824);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("myPage1")));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Public page1 As B4XPage1";
b4xmainpage._page1 = RemoteObject.createNew ("b4j.example.b4xpage1");__ref.setField("_page1",b4xmainpage._page1);
 //BA.debugLineNum = 12;BA.debugLine="Public page2 As B4XPage2";
b4xmainpage._page2 = RemoteObject.createNew ("b4j.example.b4xpage2");__ref.setField("_page2",b4xmainpage._page2);
 //BA.debugLineNum = 13;BA.debugLine="Public txtGlobal As TextField";
b4xmainpage._txtglobal = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtglobal",b4xmainpage._txtglobal);
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
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}