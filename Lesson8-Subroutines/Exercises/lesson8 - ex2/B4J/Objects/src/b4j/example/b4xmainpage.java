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
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txta = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtb = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtc = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtd = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtx1 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtx2 = null;
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
 //BA.debugLineNum = 589827;BA.debugLine="txtA.Text = \"\"";
__ref._txta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="txtB.Text = \"\"";
__ref._txtb /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="txtC.Text = \"\"";
__ref._txtc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="End Sub";
return "";
}
public String  _btncalculate_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btncalculate_click", false))
	 {return ((String) Debug.delegate(ba, "btncalculate_click", null));}
float _d = 0f;
float _a = 0f;
float _b = 0f;
float _c = 0f;
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Private Sub btnCalculate_Click";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Private D, a, b, c As Float";
_d = 0f;
_a = 0f;
_b = 0f;
_c = 0f;
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="If txtA.Text <> \"\" And txtB.Text <> \"\" And txtC.T";
if ((__ref._txta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false && (__ref._txtb /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false && (__ref._txtc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false) { 
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="a = txtA.Text";
_a = (float)(Double.parseDouble(__ref._txta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="b = txtB.Text";
_b = (float)(Double.parseDouble(__ref._txtb /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="c = txtC.Text";
_c = (float)(Double.parseDouble(__ref._txtc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=7798792;
 //BA.debugLineNum = 7798792;BA.debugLine="D = calcD(a, b, c)";
_d = __ref._calcd /*float*/ (null,_a,_b,_c);
RDebugUtils.currentLine=7798793;
 //BA.debugLineNum = 7798793;BA.debugLine="txtD.Text = D";
__ref._txtd /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_d));
RDebugUtils.currentLine=7798795;
 //BA.debugLineNum = 7798795;BA.debugLine="If D < 0 Then";
if (_d<0) { 
RDebugUtils.currentLine=7798796;
 //BA.debugLineNum = 7798796;BA.debugLine="xui.MsgboxAsync(\"Equation can be solved Δ < 0\",";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Equation can be solved Δ < 0","");
 }else 
{RDebugUtils.currentLine=7798797;
 //BA.debugLineNum = 7798797;BA.debugLine="Else if D = 0 Then";
if (_d==0) { 
RDebugUtils.currentLine=7798798;
 //BA.debugLineNum = 7798798;BA.debugLine="txtX1.Text = -b/(2*a)";
__ref._txtx1 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(-_b/(double)(2*_a)));
 }else {
RDebugUtils.currentLine=7798800;
 //BA.debugLineNum = 7798800;BA.debugLine="txtX1.Text = (-b + Sqrt(D) ) / (2*a)";
__ref._txtx1 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString((-_b+__c.Sqrt(_d))/(double)(2*_a)));
RDebugUtils.currentLine=7798801;
 //BA.debugLineNum = 7798801;BA.debugLine="txtX2.Text = (-b - Sqrt(D) ) / (2*a)";
__ref._txtx2 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString((-_b-__c.Sqrt(_d))/(double)(2*_a)));
 }}
;
 }else {
RDebugUtils.currentLine=7798804;
 //BA.debugLineNum = 7798804;BA.debugLine="xui.MsgboxAsync(\"You must fill a, b, c fields\",";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"You must fill a, b, c fields","");
 };
RDebugUtils.currentLine=7798807;
 //BA.debugLineNum = 7798807;BA.debugLine="End Sub";
return "";
}
public float  _calcd(b4j.example.b4xmainpage __ref,float _a,float _b,float _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "calcd", false))
	 {return ((Float) Debug.delegate(ba, "calcd", new Object[] {_a,_b,_c}));}
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Private Sub calcD(a As Float, b As Float, c  As Fl";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Return (  b*b - 4 * a * c )";
if (true) return (float) ((_b*_b-4*_a*_c));
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="End Sub";
return 0f;
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
 //BA.debugLineNum = 458755;BA.debugLine="Private txtA As TextField";
_txta = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private txtB As TextField";
_txtb = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private txtC As TextField";
_txtc = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private txtD As TextField";
_txtd = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Private txtX1 As TextField";
_txtx1 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Private txtX2 As TextField";
_txtx2 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="End Sub";
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