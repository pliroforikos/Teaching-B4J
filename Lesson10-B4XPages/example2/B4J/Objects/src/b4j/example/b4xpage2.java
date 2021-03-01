package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpage2 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xpage2", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpage2.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.LabelWrapper _lblglobal1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblglobal2 = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public Object  _initialize(b4j.example.b4xpage2 __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpage2";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4j.example.b4xpage2 __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpage2";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="Root.LoadLayout(\"page2\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("page2",ba);
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="lblGlobal1.Text = B4XPages.MainPage.txtGlobal.Tex";
__ref._lblglobal1 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._txtglobal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="lblGlobal2.Text = B4XPages.MainPage.page1.txtGlob";
__ref._lblglobal2 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._page1 /*b4j.example.b4xpage1*/ ._txtglobal2 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=8323079;
 //BA.debugLineNum = 8323079;BA.debugLine="End Sub";
return "";
}
public String  _btnback_click(b4j.example.b4xpage2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpage2";
if (Debug.shouldDelegate(ba, "btnback_click", false))
	 {return ((String) Debug.delegate(ba, "btnback_click", null));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Private Sub btnBack_Click";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (this);
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xpage2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpage2";
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="Private lblGlobal1 As Label";
_lblglobal1 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="Private lblGlobal2 As Label";
_lblglobal2 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="End Sub";
return "";
}
}