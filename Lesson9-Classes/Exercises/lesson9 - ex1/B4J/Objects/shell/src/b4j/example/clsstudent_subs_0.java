package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clsstudent_subs_0 {


public static RemoteObject  _changeclass(RemoteObject __ref,RemoteObject _class) throws Exception{
try {
		Debug.PushSubsStack("changeClass (clsstudent) ","clsstudent",2,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("changeclass")) { return __ref.runUserSub(false, "clsstudent","changeclass", __ref, _class);}
Debug.locals.put("class", _class);
 BA.debugLineNum = 48;BA.debugLine="Public Sub changeClass(class As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="strClass = class";
Debug.ShouldStop(65536);
__ref.setField ("_strclass" /*RemoteObject*/ ,_class);
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
public static RemoteObject  _changephone(RemoteObject __ref,RemoteObject _phone) throws Exception{
try {
		Debug.PushSubsStack("changePhone (clsstudent) ","clsstudent",2,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("changephone")) { return __ref.runUserSub(false, "clsstudent","changephone", __ref, _phone);}
Debug.locals.put("phone", _phone);
 BA.debugLineNum = 54;BA.debugLine="Public Sub changePhone(phone As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="strPhone = phone";
Debug.ShouldStop(4194304);
__ref.setField ("_strphone" /*RemoteObject*/ ,_phone);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
clsstudent._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",clsstudent._fx);
 //BA.debugLineNum = 9;BA.debugLine="Private strRegNum, strName, strSurname, strPhone,";
clsstudent._strregnum = RemoteObject.createImmutable("");__ref.setField("_strregnum",clsstudent._strregnum);
clsstudent._strname = RemoteObject.createImmutable("");__ref.setField("_strname",clsstudent._strname);
clsstudent._strsurname = RemoteObject.createImmutable("");__ref.setField("_strsurname",clsstudent._strsurname);
clsstudent._strphone = RemoteObject.createImmutable("");__ref.setField("_strphone",clsstudent._strphone);
clsstudent._stremail = RemoteObject.createImmutable("");__ref.setField("_stremail",clsstudent._stremail);
clsstudent._strclass = RemoteObject.createImmutable("");__ref.setField("_strclass",clsstudent._strclass);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clsstudent) ","clsstudent",2,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clsstudent","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="strRegNum = \"\"";
Debug.ShouldStop(8192);
__ref.setField ("_strregnum" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 15;BA.debugLine="strName = \"\"";
Debug.ShouldStop(16384);
__ref.setField ("_strname" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 16;BA.debugLine="strSurname = \"\"";
Debug.ShouldStop(32768);
__ref.setField ("_strsurname" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 17;BA.debugLine="strPhone = \"\"";
Debug.ShouldStop(65536);
__ref.setField ("_strphone" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 18;BA.debugLine="strEmail = \"\"";
Debug.ShouldStop(131072);
__ref.setField ("_stremail" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 19;BA.debugLine="strClass = \"\"";
Debug.ShouldStop(262144);
__ref.setField ("_strclass" /*RemoteObject*/ ,BA.ObjectToString(""));
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
public static RemoteObject  _newstudent(RemoteObject __ref,RemoteObject _reg,RemoteObject _name,RemoteObject _surname,RemoteObject _phone,RemoteObject _email,RemoteObject _class) throws Exception{
try {
		Debug.PushSubsStack("newStudent (clsstudent) ","clsstudent",2,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("newstudent")) { return __ref.runUserSub(false, "clsstudent","newstudent", __ref, _reg, _name, _surname, _phone, _email, _class);}
Debug.locals.put("reg", _reg);
Debug.locals.put("Name", _name);
Debug.locals.put("Surname", _surname);
Debug.locals.put("Phone", _phone);
Debug.locals.put("email", _email);
Debug.locals.put("class", _class);
 BA.debugLineNum = 24;BA.debugLine="Public Sub newStudent(reg As String, Name As Strin";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="strRegNum = reg";
Debug.ShouldStop(16777216);
__ref.setField ("_strregnum" /*RemoteObject*/ ,_reg);
 BA.debugLineNum = 26;BA.debugLine="strName = Name";
Debug.ShouldStop(33554432);
__ref.setField ("_strname" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 27;BA.debugLine="strSurname = Surname";
Debug.ShouldStop(67108864);
__ref.setField ("_strsurname" /*RemoteObject*/ ,_surname);
 BA.debugLineNum = 28;BA.debugLine="strPhone = Phone";
Debug.ShouldStop(134217728);
__ref.setField ("_strphone" /*RemoteObject*/ ,_phone);
 BA.debugLineNum = 29;BA.debugLine="strEmail = email";
Debug.ShouldStop(268435456);
__ref.setField ("_stremail" /*RemoteObject*/ ,_email);
 BA.debugLineNum = 30;BA.debugLine="strClass = class";
Debug.ShouldStop(536870912);
__ref.setField ("_strclass" /*RemoteObject*/ ,_class);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showstudent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("showStudent (clsstudent) ","clsstudent",2,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("showstudent")) { return __ref.runUserSub(false, "clsstudent","showstudent", __ref);}
 BA.debugLineNum = 35;BA.debugLine="Public Sub showStudent				' Explain the string  in";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Log ($\" 								 	Registry Number : ${strRegNum}";
Debug.ShouldStop(8);
clsstudent.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" 								\n"),RemoteObject.createImmutable("	Registry Number : "),clsstudent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_strregnum" /*RemoteObject*/ )))),RemoteObject.createImmutable(" \n"),RemoteObject.createImmutable("	Name			: "),clsstudent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_strname" /*RemoteObject*/ )))),RemoteObject.createImmutable(" \n"),RemoteObject.createImmutable("	Surname			: "),clsstudent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_strsurname" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	Phone Number	: "),clsstudent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_strphone" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	email			: "),clsstudent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_stremail" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	Class			: "),clsstudent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_strclass" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	")))));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}