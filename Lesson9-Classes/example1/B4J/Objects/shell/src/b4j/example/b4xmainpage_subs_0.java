package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Root = Root1";
Debug.ShouldStop(1048576);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 24;BA.debugLine="book1.Initialize";
Debug.ShouldStop(8388608);
__ref.getField(false,"_book1" /*RemoteObject*/ ).runClassMethod (b4j.example.clsbook.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 25;BA.debugLine="Log(book2.IsInitialized)";
Debug.ShouldStop(16777216);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(__ref.getField(false,"_book2" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ))));
 BA.debugLineNum = 27;BA.debugLine="book1.insertBook(\"Neuromancer\", \"William Gibson\",";
Debug.ShouldStop(67108864);
__ref.getField(false,"_book1" /*RemoteObject*/ ).runClassMethod (b4j.example.clsbook.class, "_insertbook" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Neuromancer")),(Object)(BA.ObjectToString("William Gibson")),(Object)(BA.ObjectToString("1984")),(Object)(RemoteObject.createImmutable("Ace")));
 BA.debugLineNum = 30;BA.debugLine="book1.logBook";
Debug.ShouldStop(536870912);
__ref.getField(false,"_book1" /*RemoteObject*/ ).runClassMethod (b4j.example.clsbook.class, "_logbook" /*RemoteObject*/ );
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
 //BA.debugLineNum = 11;BA.debugLine="Private book1 As clsBook";
b4xmainpage._book1 = RemoteObject.createNew ("b4j.example.clsbook");__ref.setField("_book1",b4xmainpage._book1);
 //BA.debugLineNum = 12;BA.debugLine="Private book2 As clsBook";
b4xmainpage._book2 = RemoteObject.createNew ("b4j.example.clsbook");__ref.setField("_book2",b4xmainpage._book2);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16384);
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