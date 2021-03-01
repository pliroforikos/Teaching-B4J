package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagesecondary extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xpagesecondary", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpagesecondary.class).invoke(this, new Object[] {null});
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
public String  _initialize(b4j.example.b4xpagesecondary __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpagesecondary";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4j.example.b4xpagesecondary __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesecondary";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="Root.LoadLayout(\"frmSecondary\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("frmSecondary",ba);
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="txtA.Text = \"\"";
__ref._txta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="txtB.Text = \"\"";
__ref._txtb /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="txtC.Text = \"\"";
__ref._txtc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=8126470;
 //BA.debugLineNum = 8126470;BA.debugLine="End Sub";
return "";
}
public String  _btncalculate_click(b4j.example.b4xpagesecondary __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesecondary";
if (Debug.shouldDelegate(ba, "btncalculate_click", false))
	 {return ((String) Debug.delegate(ba, "btncalculate_click", null));}
float _d = 0f;
float _a = 0f;
float _b = 0f;
float _c = 0f;
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Private Sub btnCalculate_Click";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Private D, a, b, c As Float";
_d = 0f;
_a = 0f;
_b = 0f;
_c = 0f;
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="If txtA.Text <> \"\" And txtB.Text <> \"\" And txtC.T";
if ((__ref._txta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false && (__ref._txtb /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false && (__ref._txtc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false) { 
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="a = txtA.Text";
_a = (float)(Double.parseDouble(__ref._txta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="b = txtB.Text";
_b = (float)(Double.parseDouble(__ref._txtb /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="c = txtC.Text";
_c = (float)(Double.parseDouble(__ref._txtc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=8454152;
 //BA.debugLineNum = 8454152;BA.debugLine="D = calcD(a, b, c)";
_d = __ref._calcd /*float*/ (null,_a,_b,_c);
RDebugUtils.currentLine=8454153;
 //BA.debugLineNum = 8454153;BA.debugLine="txtD.Text = D";
__ref._txtd /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_d));
RDebugUtils.currentLine=8454155;
 //BA.debugLineNum = 8454155;BA.debugLine="If D < 0 Then";
if (_d<0) { 
RDebugUtils.currentLine=8454156;
 //BA.debugLineNum = 8454156;BA.debugLine="xui.MsgboxAsync(\"Equation can be solved Δ < 0\",";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Equation can be solved Δ < 0","");
 }else 
{RDebugUtils.currentLine=8454157;
 //BA.debugLineNum = 8454157;BA.debugLine="Else if D = 0 Then";
if (_d==0) { 
RDebugUtils.currentLine=8454158;
 //BA.debugLineNum = 8454158;BA.debugLine="txtX1.Text = -b/(2*a)";
__ref._txtx1 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(-_b/(double)(2*_a)));
 }else {
RDebugUtils.currentLine=8454160;
 //BA.debugLineNum = 8454160;BA.debugLine="txtX1.Text = (-b + Sqrt(D) ) / (2*a)";
__ref._txtx1 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString((-_b+__c.Sqrt(_d))/(double)(2*_a)));
RDebugUtils.currentLine=8454161;
 //BA.debugLineNum = 8454161;BA.debugLine="txtX2.Text = (-b - Sqrt(D) ) / (2*a)";
__ref._txtx2 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString((-_b-__c.Sqrt(_d))/(double)(2*_a)));
 }}
;
 }else {
RDebugUtils.currentLine=8454164;
 //BA.debugLineNum = 8454164;BA.debugLine="xui.MsgboxAsync(\"You must fill a, b, c fields\",";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"You must fill a, b, c fields","");
 };
RDebugUtils.currentLine=8454167;
 //BA.debugLineNum = 8454167;BA.debugLine="End Sub";
return "";
}
public float  _calcd(b4j.example.b4xpagesecondary __ref,float _a,float _b,float _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesecondary";
if (Debug.shouldDelegate(ba, "calcd", false))
	 {return ((Float) Debug.delegate(ba, "calcd", new Object[] {_a,_b,_c}));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Private Sub calcD(a As Float, b As Float, c  As Fl";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="Return (  b*b - 4 * a * c )";
if (true) return (float) ((_b*_b-4*_a*_c));
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="End Sub";
return 0f;
}
public String  _class_globals(b4j.example.b4xpagesecondary __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesecondary";
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="Private txtA As TextField";
_txta = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="Private txtB As TextField";
_txtb = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="Private txtC As TextField";
_txtc = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=7995398;
 //BA.debugLineNum = 7995398;BA.debugLine="Private txtD As TextField";
_txtd = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=7995399;
 //BA.debugLineNum = 7995399;BA.debugLine="Private txtX1 As TextField";
_txtx1 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=7995400;
 //BA.debugLineNum = 7995400;BA.debugLine="Private txtX2 As TextField";
_txtx2 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=7995401;
 //BA.debugLineNum = 7995401;BA.debugLine="End Sub";
return "";
}
}