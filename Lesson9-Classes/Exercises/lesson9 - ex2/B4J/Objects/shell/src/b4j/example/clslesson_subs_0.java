package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clslesson_subs_0 {


public static RemoteObject  _changehours(RemoteObject __ref,RemoteObject _hours) throws Exception{
try {
		Debug.PushSubsStack("changeHours (clslesson) ","clslesson",3,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("changehours")) { return __ref.runUserSub(false, "clslesson","changehours", __ref, _hours);}
Debug.locals.put("hours", _hours);
 BA.debugLineNum = 28;BA.debugLine="Public Sub changeHours(hours As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="strHours = hours";
Debug.ShouldStop(268435456);
__ref.setField ("_strhours" /*RemoteObject*/ ,_hours);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _changeprofessor(RemoteObject __ref,RemoteObject _prof) throws Exception{
try {
		Debug.PushSubsStack("changeProfessor (clslesson) ","clslesson",3,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("changeprofessor")) { return __ref.runUserSub(false, "clslesson","changeprofessor", __ref, _prof);}
Debug.locals.put("prof", _prof);
 BA.debugLineNum = 33;BA.debugLine="Public Sub changeProfessor(prof As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="strProfessor = prof";
Debug.ShouldStop(2);
__ref.setField ("_strprofessor" /*RemoteObject*/ ,_prof);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
clslesson._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",clslesson._fx);
 //BA.debugLineNum = 7;BA.debugLine="Public strLesson, strClass, strHours, strProfesso";
clslesson._strlesson = RemoteObject.createImmutable("");__ref.setField("_strlesson",clslesson._strlesson);
clslesson._strclass = RemoteObject.createImmutable("");__ref.setField("_strclass",clslesson._strclass);
clslesson._strhours = RemoteObject.createImmutable("");__ref.setField("_strhours",clslesson._strhours);
clslesson._strprofessor = RemoteObject.createImmutable("");__ref.setField("_strprofessor",clslesson._strprofessor);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clslesson) ","clslesson",3,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clslesson","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="strLesson = \"\"";
Debug.ShouldStop(2048);
__ref.setField ("_strlesson" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 13;BA.debugLine="strClass = \"\"";
Debug.ShouldStop(4096);
__ref.setField ("_strclass" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 14;BA.debugLine="strHours = \"\"";
Debug.ShouldStop(8192);
__ref.setField ("_strhours" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 15;BA.debugLine="strProfessor = \"\"";
Debug.ShouldStop(16384);
__ref.setField ("_strprofessor" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newlesson(RemoteObject __ref,RemoteObject _name,RemoteObject _class,RemoteObject _hours,RemoteObject _prof) throws Exception{
try {
		Debug.PushSubsStack("newLesson (clslesson) ","clslesson",3,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("newlesson")) { return __ref.runUserSub(false, "clslesson","newlesson", __ref, _name, _class, _hours, _prof);}
Debug.locals.put("name", _name);
Debug.locals.put("class", _class);
Debug.locals.put("hours", _hours);
Debug.locals.put("prof", _prof);
 BA.debugLineNum = 19;BA.debugLine="Public Sub newLesson(name As String, class As Stri";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="strLesson = name";
Debug.ShouldStop(524288);
__ref.setField ("_strlesson" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 21;BA.debugLine="strClass = class";
Debug.ShouldStop(1048576);
__ref.setField ("_strclass" /*RemoteObject*/ ,_class);
 BA.debugLineNum = 22;BA.debugLine="strHours = hours";
Debug.ShouldStop(2097152);
__ref.setField ("_strhours" /*RemoteObject*/ ,_hours);
 BA.debugLineNum = 23;BA.debugLine="strProfessor = prof";
Debug.ShouldStop(4194304);
__ref.setField ("_strprofessor" /*RemoteObject*/ ,_prof);
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
public static RemoteObject  _showlesson(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("showLesson (clslesson) ","clslesson",3,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("showlesson")) { return __ref.runUserSub(false, "clslesson","showlesson", __ref);}
 BA.debugLineNum = 38;BA.debugLine="Public Sub showLesson";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Log ( $\" 	Lesson		: ${strLesson} 	Class		: ${strC";
Debug.ShouldStop(64);
clslesson.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	Lesson		: "),clslesson.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_strlesson" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	Class		: "),clslesson.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_strclass" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	Hours		: "),clslesson.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_strhours" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	Professor	: "),clslesson.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_strprofessor" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	")))));
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
}