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
public anywheresoftware.b4j.objects.ButtonWrapper _btncheck = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnmax = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblmessage = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txt1sttry = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txt2ndtry = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txt3rdtry = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txt4rthtry = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txt5thtry = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txt6thtry = null;
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
 //BA.debugLineNum = 589827;BA.debugLine="txt4rthTry.Visible = False";
__ref._txt4rthtry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="txt5thTry.Visible = False";
__ref._txt5thtry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="txt6thTry.Visible = False";
__ref._txt6thtry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="btnMax.Visible = False";
__ref._btnmax /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="End Sub";
return "";
}
public String  _btncheck_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btncheck_click", false))
	 {return ((String) Debug.delegate(ba, "btncheck_click", null));}
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Private Sub btnCheck_Click";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="If txt1stTry.Text > 7.5 Or txt2ndTry.Text > 7.5 O";
if ((double)(Double.parseDouble(__ref._txt1sttry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>7.5 || (double)(Double.parseDouble(__ref._txt2ndtry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>7.5 || (double)(Double.parseDouble(__ref._txt3rdtry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>7.5) { 
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="txt4rthTry.Visible = True";
__ref._txt4rthtry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="txt5thTry.Visible = True";
__ref._txt5thtry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="txt6thTry.Visible = True";
__ref._txt6thtry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="btnMax.Visible = True";
__ref._btnmax /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="lblMessage.Text = \"Disqualified\"";
__ref._lblmessage /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("Disqualified");
 };
RDebugUtils.currentLine=7864330;
 //BA.debugLineNum = 7864330;BA.debugLine="End Sub";
return "";
}
public String  _btnmax_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnmax_click", false))
	 {return ((String) Debug.delegate(ba, "btnmax_click", null));}
float _max1 = 0f;
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Private Sub btnMax_Click";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Private MAX1 As Float";
_max1 = 0f;
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="MAX1 = txt1stTry.Text";
_max1 = (float)(Double.parseDouble(__ref._txt1sttry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="If MAX1 < txt2ndTry.Text Then";
if (_max1<(double)(Double.parseDouble(__ref._txt2ndtry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))) { 
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="MAX1 = txt2ndTry.text";
_max1 = (float)(Double.parseDouble(__ref._txt2ndtry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 };
RDebugUtils.currentLine=7798791;
 //BA.debugLineNum = 7798791;BA.debugLine="If MAX1 < txt3rdTry.Text Then";
if (_max1<(double)(Double.parseDouble(__ref._txt3rdtry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))) { 
RDebugUtils.currentLine=7798792;
 //BA.debugLineNum = 7798792;BA.debugLine="MAX1 = txt3rdTry.text";
_max1 = (float)(Double.parseDouble(__ref._txt3rdtry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 };
RDebugUtils.currentLine=7798794;
 //BA.debugLineNum = 7798794;BA.debugLine="If MAX1 < txt4rthTry.Text Then";
if (_max1<(double)(Double.parseDouble(__ref._txt4rthtry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))) { 
RDebugUtils.currentLine=7798795;
 //BA.debugLineNum = 7798795;BA.debugLine="MAX1 = txt4rthTry.text";
_max1 = (float)(Double.parseDouble(__ref._txt4rthtry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 };
RDebugUtils.currentLine=7798797;
 //BA.debugLineNum = 7798797;BA.debugLine="If MAX1 < txt5thTry.Text Then";
if (_max1<(double)(Double.parseDouble(__ref._txt5thtry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))) { 
RDebugUtils.currentLine=7798798;
 //BA.debugLineNum = 7798798;BA.debugLine="MAX1 = txt5thTry.text";
_max1 = (float)(Double.parseDouble(__ref._txt5thtry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 };
RDebugUtils.currentLine=7798800;
 //BA.debugLineNum = 7798800;BA.debugLine="If MAX1 < txt6thTry.Text Then";
if (_max1<(double)(Double.parseDouble(__ref._txt6thtry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))) { 
RDebugUtils.currentLine=7798801;
 //BA.debugLineNum = 7798801;BA.debugLine="MAX1 = txt6thTry.text";
_max1 = (float)(Double.parseDouble(__ref._txt6thtry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 };
RDebugUtils.currentLine=7798804;
 //BA.debugLineNum = 7798804;BA.debugLine="lblMessage.Text = \"Best effort = \" & MAX1";
__ref._lblmessage /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("Best effort = "+BA.NumberToString(_max1));
RDebugUtils.currentLine=7798806;
 //BA.debugLineNum = 7798806;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458755;BA.debugLine="Private btnCheck As Button";
_btncheck = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private btnMax As Button";
_btnmax = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private lblMessage As Label";
_lblmessage = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private txt1stTry As TextField";
_txt1sttry = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Private txt2ndTry As TextField";
_txt2ndtry = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Private txt3rdTry As TextField";
_txt3rdtry = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="Private txt4rthTry As TextField";
_txt4rthtry = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="Private txt5thTry As TextField";
_txt5thtry = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="Private txt6thTry As TextField";
_txt6thtry = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
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
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="End Sub";
return "";
}
}