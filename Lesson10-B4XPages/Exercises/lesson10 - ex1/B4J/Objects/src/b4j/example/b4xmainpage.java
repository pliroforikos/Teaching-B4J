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
public b4j.example.b4xpagegoldenretriever _pggolden = null;
public b4j.example.b4xpagebeagle _pgbeagle = null;
public b4j.example.b4xpagejackrussell _pgjack = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="pgGolden.Initialize";
__ref._pggolden /*b4j.example.b4xpagegoldenretriever*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="B4XPages.AddPage(\"pg1\", pgGolden)";
_b4xpages._addpage /*String*/ ("pg1",(Object)(__ref._pggolden /*b4j.example.b4xpagegoldenretriever*/ ));
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="pgBeagle.Initialize";
__ref._pgbeagle /*b4j.example.b4xpagebeagle*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="B4XPages.AddPage(\"pg2\", pgBeagle)";
_b4xpages._addpage /*String*/ ("pg2",(Object)(__ref._pgbeagle /*b4j.example.b4xpagebeagle*/ ));
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="pgJack.Initialize";
__ref._pgjack /*b4j.example.b4xpagejackrussell*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="B4XPages.AddPage(\"pg3\", pgJack)";
_b4xpages._addpage /*String*/ ("pg3",(Object)(__ref._pgjack /*b4j.example.b4xpagejackrussell*/ ));
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="End Sub";
return "";
}
public String  _button1_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="B4XPages.ShowPage(\"pg1\")";
_b4xpages._showpage /*String*/ ("pg1");
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public String  _button2_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button2_click", false))
	 {return ((String) Debug.delegate(ba, "button2_click", null));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Private Sub Button2_Click";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="B4XPages.ShowPage(\"pg2\")";
_b4xpages._showpage /*String*/ ("pg2");
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="End Sub";
return "";
}
public String  _button3_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button3_click", false))
	 {return ((String) Debug.delegate(ba, "button3_click", null));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Private Sub Button3_Click";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="B4XPages.ShowPage(\"pg3\")";
_b4xpages._showpage /*String*/ ("pg3");
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="End Sub";
return "";
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
 //BA.debugLineNum = 458755;BA.debugLine="Private pgGolden As B4XPageGoldenRetriever";
_pggolden = new b4j.example.b4xpagegoldenretriever();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private pgBeagle As B4XPageBeagle";
_pgbeagle = new b4j.example.b4xpagebeagle();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private pgJack As B4XPageJackRussell";
_pgjack = new b4j.example.b4xpagejackrussell();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="End Sub";
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