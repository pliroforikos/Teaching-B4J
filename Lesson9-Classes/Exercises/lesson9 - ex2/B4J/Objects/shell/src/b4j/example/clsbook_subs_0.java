package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clsbook_subs_0 {


public static RemoteObject  _changebook(RemoteObject __ref,RemoteObject _str1,RemoteObject _str2,RemoteObject _str3,RemoteObject _str4) throws Exception{
try {
		Debug.PushSubsStack("changeBook (clsbook) ","clsbook",2,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("changebook")) { return __ref.runUserSub(false, "clsbook","changebook", __ref, _str1, _str2, _str3, _str4);}
Debug.locals.put("str1", _str1);
Debug.locals.put("str2", _str2);
Debug.locals.put("str3", _str3);
Debug.locals.put("str4", _str4);
 BA.debugLineNum = 28;BA.debugLine="Public Sub changeBook(str1, str2, str3, str4 As St";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="strTitle = str1";
Debug.ShouldStop(268435456);
__ref.setField ("_strtitle" /*RemoteObject*/ ,_str1);
 BA.debugLineNum = 30;BA.debugLine="strWriter = str2";
Debug.ShouldStop(536870912);
__ref.setField ("_strwriter" /*RemoteObject*/ ,_str2);
 BA.debugLineNum = 31;BA.debugLine="strYear = str3";
Debug.ShouldStop(1073741824);
__ref.setField ("_stryear" /*RemoteObject*/ ,_str3);
 BA.debugLineNum = 32;BA.debugLine="strPublisher = str4";
Debug.ShouldStop(-2147483648);
__ref.setField ("_strpublisher" /*RemoteObject*/ ,_str4);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
clsbook._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",clsbook._fx);
 //BA.debugLineNum = 3;BA.debugLine="Public strWriter, strTitle, strYear, strPublisher";
clsbook._strwriter = RemoteObject.createImmutable("");__ref.setField("_strwriter",clsbook._strwriter);
clsbook._strtitle = RemoteObject.createImmutable("");__ref.setField("_strtitle",clsbook._strtitle);
clsbook._stryear = RemoteObject.createImmutable("");__ref.setField("_stryear",clsbook._stryear);
clsbook._strpublisher = RemoteObject.createImmutable("");__ref.setField("_strpublisher",clsbook._strpublisher);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clsbook) ","clsbook",2,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clsbook","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="strTitle = \"\"";
Debug.ShouldStop(128);
__ref.setField ("_strtitle" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 9;BA.debugLine="strWriter = \"\"";
Debug.ShouldStop(256);
__ref.setField ("_strwriter" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 10;BA.debugLine="strYear = \"\"";
Debug.ShouldStop(512);
__ref.setField ("_stryear" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 11;BA.debugLine="strPublisher = \"\"";
Debug.ShouldStop(1024);
__ref.setField ("_strpublisher" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertbook(RemoteObject __ref,RemoteObject _str1,RemoteObject _str2,RemoteObject _str3,RemoteObject _str4) throws Exception{
try {
		Debug.PushSubsStack("insertBook (clsbook) ","clsbook",2,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("insertbook")) { return __ref.runUserSub(false, "clsbook","insertbook", __ref, _str1, _str2, _str3, _str4);}
Debug.locals.put("str1", _str1);
Debug.locals.put("str2", _str2);
Debug.locals.put("str3", _str3);
Debug.locals.put("str4", _str4);
 BA.debugLineNum = 14;BA.debugLine="Public Sub insertBook(str1, str2, str3, str4 As St";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="strTitle = str1";
Debug.ShouldStop(16384);
__ref.setField ("_strtitle" /*RemoteObject*/ ,_str1);
 BA.debugLineNum = 16;BA.debugLine="strWriter = str2";
Debug.ShouldStop(32768);
__ref.setField ("_strwriter" /*RemoteObject*/ ,_str2);
 BA.debugLineNum = 17;BA.debugLine="strYear = str3";
Debug.ShouldStop(65536);
__ref.setField ("_stryear" /*RemoteObject*/ ,_str3);
 BA.debugLineNum = 18;BA.debugLine="strPublisher = str4";
Debug.ShouldStop(131072);
__ref.setField ("_strpublisher" /*RemoteObject*/ ,_str4);
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logbook(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("logBook (clsbook) ","clsbook",2,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("logbook")) { return __ref.runUserSub(false, "clsbook","logbook", __ref);}
 BA.debugLineNum = 21;BA.debugLine="Public Sub logBook";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Log(\"Title : \" & strTitle)";
Debug.ShouldStop(2097152);
clsbook.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Title : "),__ref.getField(true,"_strtitle" /*RemoteObject*/ ))));
 BA.debugLineNum = 23;BA.debugLine="Log(\"Writer: \" & strWriter)";
Debug.ShouldStop(4194304);
clsbook.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Writer: "),__ref.getField(true,"_strwriter" /*RemoteObject*/ ))));
 BA.debugLineNum = 24;BA.debugLine="Log(\"Year  : \" & strYear)";
Debug.ShouldStop(8388608);
clsbook.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Year  : "),__ref.getField(true,"_stryear" /*RemoteObject*/ ))));
 BA.debugLineNum = 25;BA.debugLine="Log(\"Publisher: \" & strPublisher)";
Debug.ShouldStop(16777216);
clsbook.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Publisher: "),__ref.getField(true,"_strpublisher" /*RemoteObject*/ ))));
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