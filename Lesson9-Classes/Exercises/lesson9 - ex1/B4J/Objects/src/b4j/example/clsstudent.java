package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class clsstudent extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.clsstudent", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.clsstudent.class).invoke(this, new Object[] {null});
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
public String _strregnum = "";
public String _strname = "";
public String _strsurname = "";
public String _strphone = "";
public String _stremail = "";
public String _strclass = "";
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _newstudent(b4j.example.clsstudent __ref,String _reg,String _name,String _surname,String _phone,String _email,String _class) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsstudent";
if (Debug.shouldDelegate(ba, "newstudent", false))
	 {return ((String) Debug.delegate(ba, "newstudent", new Object[] {_reg,_name,_surname,_phone,_email,_class}));}
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Public Sub newStudent(reg As String, Name As Strin";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="strRegNum = reg";
__ref._strregnum /*String*/  = _reg;
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="strName = Name";
__ref._strname /*String*/  = _name;
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="strSurname = Surname";
__ref._strsurname /*String*/  = _surname;
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="strPhone = Phone";
__ref._strphone /*String*/  = _phone;
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="strEmail = email";
__ref._stremail /*String*/  = _email;
RDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="strClass = class";
__ref._strclass /*String*/  = _class;
RDebugUtils.currentLine=9764871;
 //BA.debugLineNum = 9764871;BA.debugLine="End Sub";
return "";
}
public String  _showstudent(b4j.example.clsstudent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsstudent";
if (Debug.shouldDelegate(ba, "showstudent", false))
	 {return ((String) Debug.delegate(ba, "showstudent", null));}
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Public Sub showStudent				' Explain the string  in";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Log ($\" 								 	Registry Number : ${strRegNum}";
__c.Log((" 								\n"+"	Registry Number : "+__c.SmartStringFormatter("",(Object)(__ref._strregnum /*String*/ ))+" \n"+"	Name			: "+__c.SmartStringFormatter("",(Object)(__ref._strname /*String*/ ))+" \n"+"	Surname			: "+__c.SmartStringFormatter("",(Object)(__ref._strsurname /*String*/ ))+"\n"+"	Phone Number	: "+__c.SmartStringFormatter("",(Object)(__ref._strphone /*String*/ ))+"\n"+"	email			: "+__c.SmartStringFormatter("",(Object)(__ref._stremail /*String*/ ))+"\n"+"	Class			: "+__c.SmartStringFormatter("",(Object)(__ref._strclass /*String*/ ))+"\n"+"	"));
RDebugUtils.currentLine=10223625;
 //BA.debugLineNum = 10223625;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.clsstudent __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clsstudent";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="strRegNum = \"\"";
__ref._strregnum /*String*/  = "";
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="strName = \"\"";
__ref._strname /*String*/  = "";
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="strSurname = \"\"";
__ref._strsurname /*String*/  = "";
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="strPhone = \"\"";
__ref._strphone /*String*/  = "";
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="strEmail = \"\"";
__ref._stremail /*String*/  = "";
RDebugUtils.currentLine=8126470;
 //BA.debugLineNum = 8126470;BA.debugLine="strClass = \"\"";
__ref._strclass /*String*/  = "";
RDebugUtils.currentLine=8126471;
 //BA.debugLineNum = 8126471;BA.debugLine="End Sub";
return "";
}
public String  _changeclass(b4j.example.clsstudent __ref,String _class) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsstudent";
if (Debug.shouldDelegate(ba, "changeclass", false))
	 {return ((String) Debug.delegate(ba, "changeclass", new Object[] {_class}));}
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Public Sub changeClass(class As String)";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="strClass = class";
__ref._strclass /*String*/  = _class;
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="End Sub";
return "";
}
public String  _changephone(b4j.example.clsstudent __ref,String _phone) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsstudent";
if (Debug.shouldDelegate(ba, "changephone", false))
	 {return ((String) Debug.delegate(ba, "changephone", new Object[] {_phone}));}
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Public Sub changePhone(phone As String)";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="strPhone = phone";
__ref._strphone /*String*/  = _phone;
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.clsstudent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsstudent";
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=8060936;
 //BA.debugLineNum = 8060936;BA.debugLine="Private strRegNum, strName, strSurname, strPhone,";
_strregnum = "";
_strname = "";
_strsurname = "";
_strphone = "";
_stremail = "";
_strclass = "";
RDebugUtils.currentLine=8060937;
 //BA.debugLineNum = 8060937;BA.debugLine="End Sub";
return "";
}
}