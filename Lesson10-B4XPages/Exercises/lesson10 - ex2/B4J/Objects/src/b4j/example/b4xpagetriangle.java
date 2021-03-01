package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagetriangle extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xpagetriangle", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpagetriangle.class).invoke(this, new Object[] {null});
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
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public Object  _initialize(b4j.example.b4xpagetriangle __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpagetriangle";
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
public String  _b4xpage_created(b4j.example.b4xpagetriangle __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagetriangle";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="Root.LoadLayout(\"frmTriangle\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("frmTriangle",ba);
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="txtA.Text = 0";
__ref._txta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="txtB.Text = 0";
__ref._txtb /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="txtC.Text = 0";
__ref._txtc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=8323079;
 //BA.debugLineNum = 8323079;BA.debugLine="End Sub";
return "";
}
public String  _btncalculate_click(b4j.example.b4xpagetriangle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagetriangle";
if (Debug.shouldDelegate(ba, "btncalculate_click", false))
	 {return ((String) Debug.delegate(ba, "btncalculate_click", null));}
String _a = "";
String _b = "";
String _c = "";
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Private Sub btnCalculate_Click";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Private a, b, c";
_a = "";
_b = "";
_c = "";
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="a = txtA.Text";
_a = __ref._txta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText();
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="b = txtB.Text";
_b = __ref._txtb /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText();
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="If a <> 0 And b <> 0 Then";
if ((_a).equals(BA.NumberToString(0)) == false && (_b).equals(BA.NumberToString(0)) == false) { 
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="c = Sqrt( a*a + b*b)";
_c = BA.NumberToString(__c.Sqrt((double)(Double.parseDouble(_a))*(double)(Double.parseDouble(_a))+(double)(Double.parseDouble(_b))*(double)(Double.parseDouble(_b))));
RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="txtC.Text = c";
__ref._txtc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_c);
 };
RDebugUtils.currentLine=8781833;
 //BA.debugLineNum = 8781833;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xpagetriangle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagetriangle";
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="Private txtA As TextField";
_txta = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="Private txtB As TextField";
_txtb = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="Private txtC As TextField";
_txtc = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=8192006;
 //BA.debugLineNum = 8192006;BA.debugLine="End Sub";
return "";
}
}