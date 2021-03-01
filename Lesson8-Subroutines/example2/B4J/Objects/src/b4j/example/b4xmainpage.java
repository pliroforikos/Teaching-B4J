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
int _intc = 0;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Private intA, intB, intC As Int";
_inta = 0;
_intb = 0;
_intc = 0;
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="intA = 20";
_inta = (int) (20);
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="intB = 10";
_intb = (int) (10);
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="intC = 300";
_intc = (int) (300);
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Log(sMax(intA, intB, intC))";
__c.Log(BA.NumberToString(__ref._smax /*int*/ (null,_inta,_intb,_intc)));
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="End Sub";
return "";
}
public int  _smax(b4j.example.b4xmainpage __ref,int _a,int _b,int _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "smax", false))
	 {return ((Integer) Debug.delegate(ba, "smax", new Object[] {_a,_b,_c}));}
int _intm = 0;
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Private Sub sMax(a As Int, b As Int, c As Int) As";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Private intM As Int";
_intm = 0;
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="intM = a";
_intm = _a;
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="If b > intM Then";
if (_b>_intm) { 
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="intM = b";
_intm = _b;
 };
RDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="If c > intM Then";
if (_c>_intm) { 
RDebugUtils.currentLine=8454151;
 //BA.debugLineNum = 8454151;BA.debugLine="intM = c";
_intm = _c;
 };
RDebugUtils.currentLine=8454154;
 //BA.debugLineNum = 8454154;BA.debugLine="Return(intM)";
if (true) return (_intm);
RDebugUtils.currentLine=8454155;
 //BA.debugLineNum = 8454155;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458755;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="End Sub";
return "";
}
}