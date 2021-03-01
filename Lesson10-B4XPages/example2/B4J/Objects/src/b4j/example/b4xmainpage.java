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
public b4j.example.b4xpage1 _page1 = null;
public b4j.example.b4xpage2 _page2 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtglobal = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="page1.Initialize";
__ref._page1 /*b4j.example.b4xpage1*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="B4XPages.AddPage(\"myPage1\", page1)";
_b4xpages._addpage /*String*/ ("myPage1",(Object)(__ref._page1 /*b4j.example.b4xpage1*/ ));
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="page2.Initialize";
__ref._page2 /*b4j.example.b4xpage2*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="B4XPages.AddPage(\"myPage2\", page2)";
_b4xpages._addpage /*String*/ ("myPage2",(Object)(__ref._page2 /*b4j.example.b4xpage2*/ ));
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="End Sub";
return "";
}
public String  _btnpage1_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnpage1_click", false))
	 {return ((String) Debug.delegate(ba, "btnpage1_click", null));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Private Sub btnPage1_Click";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="B4XPages.ShowPage(\"myPage1\")";
_b4xpages._showpage /*String*/ ("myPage1");
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="Public page1 As B4XPage1";
_page1 = new b4j.example.b4xpage1();
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="Public page2 As B4XPage2";
_page2 = new b4j.example.b4xpage2();
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="Public txtGlobal As TextField";
_txtglobal = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="End Sub";
return "";
}
}