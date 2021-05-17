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
public anywheresoftware.b4j.objects.LabelWrapper _lblnumber = null;
public float _fltnumber1 = 0f;
public float _fltnumber2 = 0f;
public String _operation = "";
public boolean _done = false;
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
 //BA.debugLineNum = 589827;BA.debugLine="lblNumber.Text = \"\"";
__ref._lblnumber /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("");
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="done = False";
__ref._done /*boolean*/  = __c.False;
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="End Sub";
return "";
}
public String  _btnclear_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnclear_click", false))
	 {return ((String) Debug.delegate(ba, "btnclear_click", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub btnClear_Click";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="lblNumber.Text = 0";
__ref._lblnumber /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="fltNumber1 = 0";
__ref._fltnumber1 /*float*/  = (float) (0);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="fltNumber2 = 0";
__ref._fltnumber2 /*float*/  = (float) (0);
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="End Sub";
return "";
}
public String  _btneq_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btneq_click", false))
	 {return ((String) Debug.delegate(ba, "btneq_click", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub btnEq_Click";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="fltNumber2 =  lblNumber.Text";
__ref._fltnumber2 /*float*/  = (float)(Double.parseDouble(__ref._lblnumber /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()));
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="If operation = \"+\" Then";
if ((__ref._operation /*String*/ ).equals("+")) { 
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="lblNumber.Text = fltNumber1 + fltNumber2";
__ref._lblnumber /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(__ref._fltnumber1 /*float*/ +__ref._fltnumber2 /*float*/ ));
 }else 
{RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="else If operation = \"-\" Then";
if ((__ref._operation /*String*/ ).equals("-")) { 
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="lblNumber.Text = fltNumber1 - fltNumber2";
__ref._lblnumber /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(__ref._fltnumber1 /*float*/ -__ref._fltnumber2 /*float*/ ));
 }else 
{RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="else If operation = \"*\" Then";
if ((__ref._operation /*String*/ ).equals("*")) { 
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="lblNumber.Text = fltNumber1 * fltNumber2";
__ref._lblnumber /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(__ref._fltnumber1 /*float*/ *__ref._fltnumber2 /*float*/ ));
 }else 
{RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="else If operation = \"/\" Then";
if ((__ref._operation /*String*/ ).equals("/")) { 
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="lblNumber.Text = fltNumber1 / fltNumber2";
__ref._lblnumber /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(__ref._fltnumber1 /*float*/ /(double)__ref._fltnumber2 /*float*/ ));
 }}}}
;
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="fltNumber1 = lblNumber.Text";
__ref._fltnumber1 /*float*/  = (float)(Double.parseDouble(__ref._lblnumber /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()));
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="done = True";
__ref._done /*boolean*/  = __c.True;
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458755;BA.debugLine="Private lblNumber As Label";
_lblnumber = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private fltNumber1, fltNumber2 As Float";
_fltnumber1 = 0f;
_fltnumber2 = 0f;
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private operation As String";
_operation = "";
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private done As Boolean";
_done = false;
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
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="End Sub";
return "";
}
public String  _number_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "number_click", false))
	 {return ((String) Debug.delegate(ba, "number_click", null));}
anywheresoftware.b4j.objects.ButtonWrapper _b = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub Number_Click";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim b As Button";
_b = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="b = Sender";
_b = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="Log(b.Tag)";
__c.Log(BA.ObjectToString(_b.getTag()));
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="If done Then";
if (__ref._done /*boolean*/ ) { 
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="lblNumber.Text = 0";
__ref._lblnumber /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="done = False";
__ref._done /*boolean*/  = __c.False;
 };
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="lblNumber.Text = lblNumber.Text & b.Tag";
__ref._lblnumber /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(__ref._lblnumber /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()+BA.ObjectToString(_b.getTag()));
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="End Sub";
return "";
}
public String  _operation_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "operation_click", false))
	 {return ((String) Debug.delegate(ba, "operation_click", null));}
anywheresoftware.b4j.objects.ButtonWrapper _b = null;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub operation_Click";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Dim b As Button";
_b = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="b = Sender";
_b = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="operation = b.Tag";
__ref._operation /*String*/  = BA.ObjectToString(_b.getTag());
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="fltNumber1 = lblNumber.Text";
__ref._fltnumber1 /*float*/  = (float)(Double.parseDouble(__ref._lblnumber /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()));
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="lblNumber.Text = 0";
__ref._lblnumber /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="End Sub";
return "";
}
}