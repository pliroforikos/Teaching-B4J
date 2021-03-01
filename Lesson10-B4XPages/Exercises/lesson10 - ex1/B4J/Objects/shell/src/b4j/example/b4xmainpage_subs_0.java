package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 29;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Root = Root1";
Debug.ShouldStop(536870912);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 31;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="pgGolden.Initialize";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pggolden" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagegoldenretriever.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 33;BA.debugLine="B4XPages.AddPage(\"pg1\", pgGolden)";
Debug.ShouldStop(1);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("pg1")),(Object)((__ref.getField(false,"_pggolden" /*RemoteObject*/ ))));
 BA.debugLineNum = 34;BA.debugLine="pgBeagle.Initialize";
Debug.ShouldStop(2);
__ref.getField(false,"_pgbeagle" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagebeagle.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 35;BA.debugLine="B4XPages.AddPage(\"pg2\", pgBeagle)";
Debug.ShouldStop(4);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("pg2")),(Object)((__ref.getField(false,"_pgbeagle" /*RemoteObject*/ ))));
 BA.debugLineNum = 36;BA.debugLine="pgJack.Initialize";
Debug.ShouldStop(8);
__ref.getField(false,"_pgjack" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagejackrussell.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 37;BA.debugLine="B4XPages.AddPage(\"pg3\", pgJack)";
Debug.ShouldStop(16);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("pg3")),(Object)((__ref.getField(false,"_pgjack" /*RemoteObject*/ ))));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
 BA.debugLineNum = 40;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="B4XPages.ShowPage(\"pg1\")";
Debug.ShouldStop(256);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pg1")));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Button2_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("button2_click")) { return __ref.runUserSub(false, "b4xmainpage","button2_click", __ref);}
 BA.debugLineNum = 44;BA.debugLine="Private Sub Button2_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="B4XPages.ShowPage(\"pg2\")";
Debug.ShouldStop(4096);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pg2")));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Button3_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("button3_click")) { return __ref.runUserSub(false, "b4xmainpage","button3_click", __ref);}
 BA.debugLineNum = 48;BA.debugLine="Private Sub Button3_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="B4XPages.ShowPage(\"pg3\")";
Debug.ShouldStop(65536);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pg3")));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 13;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 15;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 16;BA.debugLine="Private pgGolden As B4XPageGoldenRetriever";
b4xmainpage._pggolden = RemoteObject.createNew ("b4j.example.b4xpagegoldenretriever");__ref.setField("_pggolden",b4xmainpage._pggolden);
 //BA.debugLineNum = 17;BA.debugLine="Private pgBeagle As B4XPageBeagle";
b4xmainpage._pgbeagle = RemoteObject.createNew ("b4j.example.b4xpagebeagle");__ref.setField("_pgbeagle",b4xmainpage._pgbeagle);
 //BA.debugLineNum = 18;BA.debugLine="Private pgJack As B4XPageJackRussell";
b4xmainpage._pgjack = RemoteObject.createNew ("b4j.example.b4xpagejackrussell");__ref.setField("_pgjack",b4xmainpage._pgjack);
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