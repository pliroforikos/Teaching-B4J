package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xmainpage", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xmainpage.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _intsum = 0;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
int _inta = 0;
int _intb = 0;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Private intA, intB As Int";
_inta = 0;
_intb = 0;
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="intA = 10";
_inta = (int) (10);
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="intB = 30";
_intb = (int) (30);
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="showSum1(intA, intB)";
__ref._showsum1 /*String*/ (null,BA.NumberToString(_inta),_intb);
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Log(intSum)";
__c.Log(BA.NumberToString(__ref._intsum /*int*/ ));
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="Log(Sum(intA, intB))";
__c.Log(BA.NumberToString(__ref._sum /*int*/ (null,BA.NumberToString(_inta),_intb)));
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="End Sub";
return "";
}
public String  _showsum1(b4j.example.b4xmainpage __ref,String _a,int _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showsum1", false))
	 {return ((String) Debug.delegate(ba, "showsum1", new Object[] {_a,_b}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub showSum1(a, b As Int)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="intSum = a + b";
__ref._intsum /*int*/  = (int) ((double)(Double.parseDouble(_a))+_b);
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="Log(intSum)";
__c.Log(BA.NumberToString(__ref._intsum /*int*/ ));
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="End Sub";
return "";
}
public int  _sum(b4j.example.b4xmainpage __ref,String _a,int _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "sum", false))
	 {return ((Integer) Debug.delegate(ba, "sum", new Object[] {_a,_b}));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Private Sub Sum(a, b As Int) As Int";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Return a+b";
if (true) return (int) ((double)(Double.parseDouble(_a))+_b);
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Private intSum As Int";
_intsum = 0;
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
}