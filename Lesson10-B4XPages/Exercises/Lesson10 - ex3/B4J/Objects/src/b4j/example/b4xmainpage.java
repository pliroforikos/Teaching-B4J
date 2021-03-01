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
public anywheresoftware.b4j.objects.LabelWrapper _lblpc1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblpc2 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblpc3 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblpc4 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtpc1 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtpc2 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtpc3 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtpc4 = null;
public b4j.example.b4xpagetotal _pgtotal = null;
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
 //BA.debugLineNum = 589827;BA.debugLine="pgTotal.Initialize";
__ref._pgtotal /*b4j.example.b4xpagetotal*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="B4XPages.AddPage(\"pgTotal\", pgTotal)";
_b4xpages._addpage /*String*/ ("pgTotal",(Object)(__ref._pgtotal /*b4j.example.b4xpagetotal*/ ));
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="lblPc1.Text = 799";
__ref._lblpc1 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(799));
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="lblPc2.Text = 599";
__ref._lblpc2 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(599));
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="lblPc3.Text = 499";
__ref._lblpc3 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(499));
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="lblPc4.Text = 569";
__ref._lblpc4 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(569));
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="txtPC1.Text = 0";
__ref._txtpc1 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="txtPc2.Text = 0";
__ref._txtpc2 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="txtPc3.Text = 0";
__ref._txtpc3 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="txtPc4.Text = 0";
__ref._txtpc4 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 655361;BA.debugLine="B4XPages.ShowPage(\"pgTotal\")";
_b4xpages._showpage /*String*/ ("pgTotal");
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458755;BA.debugLine="Public lblPc1 As Label";
_lblpc1 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Public lblPc2 As Label";
_lblpc2 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Public lblPc3 As Label";
_lblpc3 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Public lblPc4 As Label";
_lblpc4 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Public txtPC1 As TextField";
_txtpc1 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Public txtPc2 As TextField";
_txtpc2 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="Public txtPc3 As TextField";
_txtpc3 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="Public txtPc4 As TextField";
_txtpc4 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="Private pgTotal As B4XPageTotal";
_pgtotal = new b4j.example.b4xpagetotal();
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="End Sub";
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