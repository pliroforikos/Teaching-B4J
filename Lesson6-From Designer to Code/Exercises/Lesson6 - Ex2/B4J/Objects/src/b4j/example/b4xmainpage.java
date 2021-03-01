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
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtaverage = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtchem = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtgymn = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtit = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtliterature = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtmaths = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtmusic = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtphil = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtphysics = null;
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
 //BA.debugLineNum = 589827;BA.debugLine="txtAverage.Text = 0";
__ref._txtaverage /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="txtChem.Text = 0";
__ref._txtchem /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="txtGymn.Text = 0";
__ref._txtgymn /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="txtIT.Text = 0";
__ref._txtit /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="txtLiterature.text = 0";
__ref._txtliterature /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="txtMaths.Text = 0";
__ref._txtmaths /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="txtMusic.Text = 0";
__ref._txtmusic /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="txtPhil.Text = 0";
__ref._txtphil /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="txtPhysics.Text = 0";
__ref._txtphysics /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="End Sub";
return "";
}
public String  _btncalculate_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btncalculate_click", false))
	 {return ((String) Debug.delegate(ba, "btncalculate_click", null));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Private Sub btnCalculate_Click";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="If (txtChem.Text >= 0 And txtChem.Text <= 100 ) T";
if (((double)(Double.parseDouble(__ref._txtchem /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>=0 && (double)(Double.parseDouble(__ref._txtchem /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=100)) { 
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="If ( txtGymn.Text >= 0 And txtGymn.Text <=100 )";
if (((double)(Double.parseDouble(__ref._txtgymn /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>=0 && (double)(Double.parseDouble(__ref._txtgymn /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=100)) { 
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="If ( txtIT.text >= 0 And txtIT.Text <= 100 ) Th";
if (((double)(Double.parseDouble(__ref._txtit /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>=0 && (double)(Double.parseDouble(__ref._txtit /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=100)) { 
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="If ( txtLiterature.text >= 0 And txtLiterature";
if (((double)(Double.parseDouble(__ref._txtliterature /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>=0 && (double)(Double.parseDouble(__ref._txtliterature /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=100)) { 
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="If (txtMaths.text >= 0 And txtMaths.text <= 1";
if (((double)(Double.parseDouble(__ref._txtmaths /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>=0 && (double)(Double.parseDouble(__ref._txtmaths /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=100)) { 
RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="If (txtMusic.text >= 0 And txtMusic.Text <=";
if (((double)(Double.parseDouble(__ref._txtmusic /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>=0 && (double)(Double.parseDouble(__ref._txtmusic /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=100)) { 
RDebugUtils.currentLine=7798791;
 //BA.debugLineNum = 7798791;BA.debugLine="If  (txtPhil.text >= 0 And txtPhil.text <=";
if (((double)(Double.parseDouble(__ref._txtphil /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>=0 && (double)(Double.parseDouble(__ref._txtphil /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=100)) { 
RDebugUtils.currentLine=7798792;
 //BA.debugLineNum = 7798792;BA.debugLine="If (txtPhysics.text >= 0 And txtPhysics.Te";
if (((double)(Double.parseDouble(__ref._txtphysics /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>=0 && (double)(Double.parseDouble(__ref._txtphysics /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=100)) { 
RDebugUtils.currentLine=7798793;
 //BA.debugLineNum = 7798793;BA.debugLine="txtAverage.Text = (txtChem.Text + txtGymn";
__ref._txtaverage /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(((double)(Double.parseDouble(__ref._txtchem /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+(double)(Double.parseDouble(__ref._txtgymn /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+(double)(Double.parseDouble(__ref._txtit /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+(double)(Double.parseDouble(__ref._txtliterature /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+(double)(Double.parseDouble(__ref._txtmaths /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+(double)(Double.parseDouble(__ref._txtmusic /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+(double)(Double.parseDouble(__ref._txtphil /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+(double)(Double.parseDouble(__ref._txtphysics /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())))/(double)8));
 }else {
RDebugUtils.currentLine=7798796;
 //BA.debugLineNum = 7798796;BA.debugLine="xui.MsgboxAsync(\"Physics should be betwee";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Physics should be between 0 and 100","");
 };
 }else {
RDebugUtils.currentLine=7798799;
 //BA.debugLineNum = 7798799;BA.debugLine="xui.MsgboxAsync(\"Philosophy should be betw";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Philosophy should be between 0 and 100","");
 };
 }else {
RDebugUtils.currentLine=7798802;
 //BA.debugLineNum = 7798802;BA.debugLine="xui.MsgboxAsync(\"Music should be between 0";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Music should be between 0 and 100","");
 };
 }else {
RDebugUtils.currentLine=7798805;
 //BA.debugLineNum = 7798805;BA.debugLine="xui.MsgboxAsync(\"Maths should be between 0 a";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Maths should be between 0 and 100","");
 };
 }else {
RDebugUtils.currentLine=7798808;
 //BA.debugLineNum = 7798808;BA.debugLine="xui.MsgboxAsync(\"Lterature should be between";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Lterature should be between 0 and 100","");
 };
 }else {
RDebugUtils.currentLine=7798811;
 //BA.debugLineNum = 7798811;BA.debugLine="xui.MsgboxAsync(\"IT should be between 0 and 10";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"IT should be between 0 and 100","");
 };
 }else {
RDebugUtils.currentLine=7798814;
 //BA.debugLineNum = 7798814;BA.debugLine="xui.MsgboxAsync(\"Gymnastics should be between 0";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Gymnastics should be between 0 and 100","");
 };
 }else {
RDebugUtils.currentLine=7798817;
 //BA.debugLineNum = 7798817;BA.debugLine="xui.MsgboxAsync(\"Chemistry should be between 0 a";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Chemistry should be between 0 and 100","");
 };
RDebugUtils.currentLine=7798819;
 //BA.debugLineNum = 7798819;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458755;BA.debugLine="Private txtAverage As TextField";
_txtaverage = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private txtChem As TextField";
_txtchem = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private txtGymn As TextField";
_txtgymn = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private txtIT As TextField";
_txtit = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Private txtLiterature As TextField";
_txtliterature = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Private txtMaths As TextField";
_txtmaths = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="Private txtMusic As TextField";
_txtmusic = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="Private txtPhil As TextField";
_txtphil = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="Private txtPhysics As TextField";
_txtphysics = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
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