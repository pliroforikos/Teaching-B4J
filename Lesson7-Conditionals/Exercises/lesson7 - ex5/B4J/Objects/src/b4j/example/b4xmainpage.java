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
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txthours = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtmember = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="End Sub";
return "";
}
public String  _btncalculate_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btncalculate_click", false))
	 {return ((String) Debug.delegate(ba, "btncalculate_click", null));}
float _flttotal = 0f;
float _fltfee = 0f;
float _flttax = 0f;
String _strmember = "";
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Private Sub btnCalculate_Click";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Private fltTotal, fltFee, fltTax As Float";
_flttotal = 0f;
_fltfee = 0f;
_flttax = 0f;
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="Private strMember As String";
_strmember = "";
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="If txtMember.Text = \"Yes\" Then";
if ((__ref._txtmember /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("Yes")) { 
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="fltTax = 10";
_flttax = (float) (10);
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="fltFee = 2";
_fltfee = (float) (2);
RDebugUtils.currentLine=7929863;
 //BA.debugLineNum = 7929863;BA.debugLine="strMember = \"is a member\"";
_strmember = "is a member";
 }else {
RDebugUtils.currentLine=7929865;
 //BA.debugLineNum = 7929865;BA.debugLine="fltTax = 20";
_flttax = (float) (20);
RDebugUtils.currentLine=7929866;
 //BA.debugLineNum = 7929866;BA.debugLine="fltFee = 5";
_fltfee = (float) (5);
RDebugUtils.currentLine=7929867;
 //BA.debugLineNum = 7929867;BA.debugLine="strMember = \"is not a member\"";
_strmember = "is not a member";
 };
RDebugUtils.currentLine=7929870;
 //BA.debugLineNum = 7929870;BA.debugLine="fltTotal = fltFee * txtHours.Text + fltFee * txtH";
_flttotal = (float) (_fltfee*(double)(Double.parseDouble(__ref._txthours /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+_fltfee*(double)(Double.parseDouble(__ref._txthours /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))/(double)_flttax);
RDebugUtils.currentLine=7929871;
 //BA.debugLineNum = 7929871;BA.debugLine="lblMessage.Text = \"The user \" & strMember & \" and";
__ref._lblmessage /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("The user "+_strmember+" and stayed "+__ref._txthours /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()+" for "+BA.NumberToString(_fltfee)+"/hour plus "+BA.NumberToString(_flttax)+"% the total amount is "+BA.NumberToString(_flttotal));
RDebugUtils.currentLine=7929875;
 //BA.debugLineNum = 7929875;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="Private btnCalculate As Button";
_btncalculate = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="Private lblMessage As Label";
_lblmessage = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=7602181;
 //BA.debugLineNum = 7602181;BA.debugLine="Private txtHours As TextField";
_txthours = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="Private txtMember As TextField";
_txtmember = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=7602183;
 //BA.debugLineNum = 7602183;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="End Sub";
return "";
}
}