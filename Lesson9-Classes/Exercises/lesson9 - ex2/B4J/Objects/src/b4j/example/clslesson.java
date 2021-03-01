package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class clslesson extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.clslesson", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.clslesson.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _strlesson = "";
public String _strclass = "";
public String _strhours = "";
public String _strprofessor = "";
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _newlesson(b4j.example.clslesson __ref,String _name,String _class,String _hours,String _prof) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslesson";
if (Debug.shouldDelegate(ba, "newlesson", false))
	 {return ((String) Debug.delegate(ba, "newlesson", new Object[] {_name,_class,_hours,_prof}));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub newLesson(name As String, class As Stri";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="strLesson = name";
__ref._strlesson /*String*/  = _name;
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="strClass = class";
__ref._strclass /*String*/  = _class;
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="strHours = hours";
__ref._strhours /*String*/  = _hours;
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="strProfessor = prof";
__ref._strprofessor /*String*/  = _prof;
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="End Sub";
return "";
}
public String  _showlesson(b4j.example.clslesson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslesson";
if (Debug.shouldDelegate(ba, "showlesson", false))
	 {return ((String) Debug.delegate(ba, "showlesson", null));}
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Public Sub showLesson";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="Log ( $\" 	Lesson		: ${strLesson} 	Class		: ${strC";
__c.Log(("\n"+"	Lesson		: "+__c.SmartStringFormatter("",(Object)(__ref._strlesson /*String*/ ))+"\n"+"	Class		: "+__c.SmartStringFormatter("",(Object)(__ref._strclass /*String*/ ))+"\n"+"	Hours		: "+__c.SmartStringFormatter("",(Object)(__ref._strhours /*String*/ ))+"\n"+"	Professor	: "+__c.SmartStringFormatter("",(Object)(__ref._strprofessor /*String*/ ))+"\n"+"	"));
RDebugUtils.currentLine=10551303;
 //BA.debugLineNum = 10551303;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.clslesson __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clslesson";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="strLesson = \"\"";
__ref._strlesson /*String*/  = "";
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="strClass = \"\"";
__ref._strclass /*String*/  = "";
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="strHours = \"\"";
__ref._strhours /*String*/  = "";
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="strProfessor = \"\"";
__ref._strprofessor /*String*/  = "";
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="End Sub";
return "";
}
public String  _changehours(b4j.example.clslesson __ref,String _hours) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslesson";
if (Debug.shouldDelegate(ba, "changehours", false))
	 {return ((String) Debug.delegate(ba, "changehours", new Object[] {_hours}));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Public Sub changeHours(hours As String)";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="strHours = hours";
__ref._strhours /*String*/  = _hours;
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="End Sub";
return "";
}
public String  _changeprofessor(b4j.example.clslesson __ref,String _prof) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslesson";
if (Debug.shouldDelegate(ba, "changeprofessor", false))
	 {return ((String) Debug.delegate(ba, "changeprofessor", new Object[] {_prof}));}
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Public Sub changeProfessor(prof As String)";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="strProfessor = prof";
__ref._strprofessor /*String*/  = _prof;
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.clslesson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslesson";
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=8060934;
 //BA.debugLineNum = 8060934;BA.debugLine="Public strLesson, strClass, strHours, strProfesso";
_strlesson = "";
_strclass = "";
_strhours = "";
_strprofessor = "";
RDebugUtils.currentLine=8060935;
 //BA.debugLineNum = 8060935;BA.debugLine="End Sub";
return "";
}
}