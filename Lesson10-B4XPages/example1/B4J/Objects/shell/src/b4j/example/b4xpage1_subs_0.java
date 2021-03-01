package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpage1_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xpage1) ","b4xpage1",2,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpage1","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 13;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="Root = Root1";
Debug.ShouldStop(8192);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 16;BA.debugLine="Root.LoadLayout(\"frmPage1\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("frmPage1")),__ref.getField(false, "ba"));
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
public static RemoteObject  _btnclose_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnClose_Click (b4xpage1) ","b4xpage1",2,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("btnclose_click")) { return __ref.runUserSub(false, "b4xpage1","btnclose_click", __ref);}
 BA.debugLineNum = 19;BA.debugLine="Private Sub btnClose_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(524288);
b4xpage1._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,(Object)(__ref));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
b4xpage1._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpage1._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpage1._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpage1._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private btnClose As Button";
b4xpage1._btnclose = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnclose",b4xpage1._btnclose);
 //BA.debugLineNum = 5;BA.debugLine="Private lblTitle As Label";
b4xpage1._lbltitle = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitle",b4xpage1._lbltitle);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xpage1) ","b4xpage1",2,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpage1","initialize", __ref, _ba);}
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