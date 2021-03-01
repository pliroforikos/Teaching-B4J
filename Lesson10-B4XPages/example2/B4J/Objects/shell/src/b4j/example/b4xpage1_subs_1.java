package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpage1_subs_1 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xpage1) ","b4xpage1",2,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpage1","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 15;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Root = Root1";
Debug.ShouldStop(32768);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 18;BA.debugLine="Root.LoadLayout(\"page1\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("page1")),__ref.getField(false, "ba"));
 BA.debugLineNum = 19;BA.debugLine="lblGlobal1.Text = B4XPages.MainPage.txtGlobal.Tex";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblglobal1" /*RemoteObject*/ ).runMethod(true,"setText",b4xpage1._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_txtglobal" /*RemoteObject*/ ).runMethod(true,"getText"));
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
public static RemoteObject  _btnback_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnBack_Click (b4xpage1) ","b4xpage1",2,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("btnback_click")) { return __ref.runUserSub(false, "b4xpage1","btnback_click", __ref);}
 BA.debugLineNum = 30;BA.debugLine="Private Sub btnBack_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(1073741824);
b4xpage1._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,(Object)(__ref));
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
public static RemoteObject  _btnpage2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnPage2_Click (b4xpage1) ","b4xpage1",2,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("btnpage2_click")) { return __ref.runUserSub(false, "b4xpage1","btnpage2_click", __ref);}
 BA.debugLineNum = 26;BA.debugLine="Private Sub btnPage2_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="B4XPages.ShowPage(\"myPage2\")";
Debug.ShouldStop(67108864);
b4xpage1._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("myPage2")));
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
b4xpage1._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpage1._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpage1._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpage1._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private lblGlobal1 As Label";
b4xpage1._lblglobal1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblglobal1",b4xpage1._lblglobal1);
 //BA.debugLineNum = 5;BA.debugLine="Private lblGlobal2 As Label";
b4xpage1._lblglobal2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblglobal2",b4xpage1._lblglobal2);
 //BA.debugLineNum = 6;BA.debugLine="Public txtGlobal2 As TextField";
b4xpage1._txtglobal2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtglobal2",b4xpage1._txtglobal2);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xpage1) ","b4xpage1",2,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpage1","initialize", __ref, _ba);}
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