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
public anywheresoftware.b4j.objects.ButtonWrapper _btncalc = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcost = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtmeal = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtquantity = null;
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
public String  _btncalc_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btncalc_click", false))
	 {return ((String) Debug.delegate(ba, "btncalc_click", null));}
float _fltcost = 0f;
String _meal = "";
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Private Sub btnCalc_Click";
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="Private fltCost As Float";
_fltcost = 0f;
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="Private meal As String";
_meal = "";
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="If txtMeal.text = \"Hot Dog\" Then";
if ((__ref._txtmeal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("Hot Dog")) { 
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="fltCost = txtQuantity.Text * 1.5";
_fltcost = (float) ((double)(Double.parseDouble(__ref._txtquantity /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))*1.5);
RDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="meal = \"Hot Dog\"";
_meal = "Hot Dog";
 }else 
{RDebugUtils.currentLine=7864330;
 //BA.debugLineNum = 7864330;BA.debugLine="else if txtMeal.text = \"Pizza\" Then";
if ((__ref._txtmeal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("Pizza")) { 
RDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="fltCost = txtQuantity.Text * 3";
_fltcost = (float) ((double)(Double.parseDouble(__ref._txtquantity /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))*3);
RDebugUtils.currentLine=7864332;
 //BA.debugLineNum = 7864332;BA.debugLine="meal = \"Pizza\"";
_meal = "Pizza";
 }else 
{RDebugUtils.currentLine=7864333;
 //BA.debugLineNum = 7864333;BA.debugLine="else if txtMeal.text = \"Burger\" Then";
if ((__ref._txtmeal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("Burger")) { 
RDebugUtils.currentLine=7864334;
 //BA.debugLineNum = 7864334;BA.debugLine="fltCost = txtQuantity.Text * 5";
_fltcost = (float) ((double)(Double.parseDouble(__ref._txtquantity /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))*5);
RDebugUtils.currentLine=7864335;
 //BA.debugLineNum = 7864335;BA.debugLine="meal = \"Burger\"";
_meal = "Burger";
 }}}
;
RDebugUtils.currentLine=7864337;
 //BA.debugLineNum = 7864337;BA.debugLine="txtCost.Text = txtQuantity.Text & \" x \" & meal &";
__ref._txtcost /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._txtquantity /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()+" x "+_meal+" "+BA.NumberToString(_fltcost)+" $");
RDebugUtils.currentLine=7864340;
 //BA.debugLineNum = 7864340;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458755;BA.debugLine="Private btnCalc As Button";
_btncalc = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private txtCost As TextField";
_txtcost = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private txtMeal As TextField";
_txtmeal = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private txtQuantity As TextField";
_txtquantity = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="End Sub";
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