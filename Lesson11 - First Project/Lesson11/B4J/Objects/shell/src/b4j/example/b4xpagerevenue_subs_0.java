package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpagerevenue_subs_0 {


public static RemoteObject  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (b4xpagerevenue) ","b4xpagerevenue",7,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("b4xpage_appear")) { return __ref.runUserSub(false, "b4xpagerevenue","b4xpage_appear", __ref);}
 BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Appear";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="loadData";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.b4xpagerevenue.class, "_loaddata" /*RemoteObject*/ );
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
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xpagerevenue) ","b4xpagerevenue",7,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpagerevenue","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 14;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Root = Root1";
Debug.ShouldStop(16384);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 17;BA.debugLine="Root.LoadLayout(\"frmRevenue\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("frmRevenue")),__ref.getField(false, "ba"));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
b4xpagerevenue._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpagerevenue._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpagerevenue._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpagerevenue._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private lblRevenue As Label";
b4xpagerevenue._lblrevenue = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblrevenue",b4xpagerevenue._lblrevenue);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xpagerevenue) ","b4xpagerevenue",7,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpagerevenue","initialize", __ref, _ba);}
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
public static RemoteObject  _loaddata(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loadData (b4xpagerevenue) ","b4xpagerevenue",7,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("loaddata")) { return __ref.runUserSub(false, "b4xpagerevenue","loaddata", __ref);}
 BA.debugLineNum = 24;BA.debugLine="Private Sub loadData";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="lblRevenue.Text =  B4XPages.MainPage.fltTotalInco";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblrevenue" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpagerevenue._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(true,"_flttotalincome" /*RemoteObject*/ )));
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
}