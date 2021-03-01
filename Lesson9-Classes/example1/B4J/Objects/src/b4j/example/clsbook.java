package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class clsbook extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.clsbook", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.clsbook.class).invoke(this, new Object[] {null});
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
public String _strwriter = "";
public String _strtitle = "";
public String _stryear = "";
public String _strpublisher = "";
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _initialize(b4j.example.clsbook __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clsbook";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="strTitle = \"\"";
__ref._strtitle /*String*/  = "";
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="strWriter = \"\"";
__ref._strwriter /*String*/  = "";
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="strYear = \"\"";
__ref._stryear /*String*/  = "";
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="strPublisher = \"\"";
__ref._strpublisher /*String*/  = "";
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="End Sub";
return "";
}
public String  _insertbook(b4j.example.clsbook __ref,String _str1,String _str2,String _str3,String _str4) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsbook";
if (Debug.shouldDelegate(ba, "insertbook", false))
	 {return ((String) Debug.delegate(ba, "insertbook", new Object[] {_str1,_str2,_str3,_str4}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub insertBook(str1, str2, str3, str4 As St";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="strTitle = str1";
__ref._strtitle /*String*/  = _str1;
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="strWriter = str2";
__ref._strwriter /*String*/  = _str2;
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="strYear = str3";
__ref._stryear /*String*/  = _str3;
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="strPublisher = str4";
__ref._strpublisher /*String*/  = _str4;
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="End Sub";
return "";
}
public String  _logbook(b4j.example.clsbook __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsbook";
if (Debug.shouldDelegate(ba, "logbook", false))
	 {return ((String) Debug.delegate(ba, "logbook", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub logBook";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Log(\"Title : \" & strTitle)";
__c.Log("Title : "+__ref._strtitle /*String*/ );
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Log(\"Writer: \" & strWriter)";
__c.Log("Writer: "+__ref._strwriter /*String*/ );
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Log(\"Year  : \" & strYear)";
__c.Log("Year  : "+__ref._stryear /*String*/ );
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Log(\"Publisher: \" & strPublisher)";
__c.Log("Publisher: "+__ref._strpublisher /*String*/ );
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="End Sub";
return "";
}
public String  _changebook(b4j.example.clsbook __ref,String _str1,String _str2,String _str3,String _str4) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsbook";
if (Debug.shouldDelegate(ba, "changebook", false))
	 {return ((String) Debug.delegate(ba, "changebook", new Object[] {_str1,_str2,_str3,_str4}));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Public Sub changeBook(str1, str2, str3, str4 As St";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="strTitle = str1";
__ref._strtitle /*String*/  = _str1;
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="strWriter = str2";
__ref._strwriter /*String*/  = _str2;
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="strYear = str3";
__ref._stryear /*String*/  = _str3;
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="strPublisher = str4";
__ref._strpublisher /*String*/  = _str4;
RDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.clsbook __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsbook";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="Public strWriter, strTitle, strYear, strPublisher";
_strwriter = "";
_strtitle = "";
_stryear = "";
_strpublisher = "";
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="End Sub";
return "";
}
}