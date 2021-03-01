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
public anywheresoftware.b4j.objects.ButtonWrapper _btncalculate = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblmessage = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtduration = null;
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
 //BA.debugLineNum = 589827;BA.debugLine="End Sub";
return "";
}
public String  _btncalculate_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btncalculate_click", false))
	 {return ((String) Debug.delegate(ba, "btncalculate_click", null));}
float _fltfee = 0f;
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Private Sub btnCalculate_Click";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Private fltFee As Float";
_fltfee = 0f;
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="If txtDuration.Text <= 1 Then";
if ((double)(Double.parseDouble(__ref._txtduration /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=1) { 
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="fltFee = 3.5";
_fltfee = (float) (3.5);
 }else 
{RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="else if txtDuration.Text <= 3 Then";
if ((double)(Double.parseDouble(__ref._txtduration /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=3) { 
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="fltFee = 3.5 + (txtDuration.Text - 1) * 8";
_fltfee = (float) (3.5+((double)(Double.parseDouble(__ref._txtduration /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))-1)*8);
 }else 
{RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="Else if txtDuration.Text <= 5 Then";
if ((double)(Double.parseDouble(__ref._txtduration /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=5) { 
RDebugUtils.currentLine=7798791;
 //BA.debugLineNum = 7798791;BA.debugLine="fltFee = 3.5 + 16 + (txtDuration.Text - 3) * 12";
_fltfee = (float) (3.5+16+((double)(Double.parseDouble(__ref._txtduration /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))-3)*12);
 }else {
RDebugUtils.currentLine=7798793;
 //BA.debugLineNum = 7798793;BA.debugLine="fltFee = 3.5 + 16 + 24 + (txtDuration.Text - 5)";
_fltfee = (float) (3.5+16+24+((double)(Double.parseDouble(__ref._txtduration /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))-5)*15);
 }}}
;
RDebugUtils.currentLine=7798795;
 //BA.debugLineNum = 7798795;BA.debugLine="lblMessage.Text = \"Total Fee = \" & fltFee";
__ref._lblmessage /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("Total Fee = "+BA.NumberToString(_fltfee));
RDebugUtils.currentLine=7798796;
 //BA.debugLineNum = 7798796;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458755;BA.debugLine="Private btnCalculate As Button";
_btncalculate = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private lblMessage As Label";
_lblmessage = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private txtDuration As TextField";
_txtduration = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
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