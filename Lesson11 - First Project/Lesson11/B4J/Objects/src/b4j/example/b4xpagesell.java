package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagesell extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xpagesell", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpagesell.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.LabelWrapper _lbllname = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblquantity = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltotal = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtaddress = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtname = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtsurname = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public Object  _initialize(b4j.example.b4xpagesell __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpagesell";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_appear(b4j.example.b4xpagesell __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesell";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_appear", null));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Private Sub B4XPage_Appear";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="loadValues";
__ref._loadvalues /*String*/ (null);
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return "";
}
public String  _loadvalues(b4j.example.b4xpagesell __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesell";
if (Debug.shouldDelegate(ba, "loadvalues", false))
	 {return ((String) Debug.delegate(ba, "loadvalues", null));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub loadValues";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="lbllName.Text = B4XPages.MainPage.pgPhones.pgShow";
__ref._lbllname /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgphones /*b4j.example.b4xpagesphones*/ ._pgshowphone /*b4j.example.b4xpageshowphone*/ ._lbllname /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText());
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="lblQuantity.Text = B4XPages.MainPage.pgPhones.pgS";
__ref._lblquantity /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgphones /*b4j.example.b4xpagesphones*/ ._pgshowphone /*b4j.example.b4xpageshowphone*/ ._txtquantity /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="lblTotal.Text = B4XPages.MainPage.pgPhones.pgShow";
__ref._lbltotal /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgphones /*b4j.example.b4xpagesphones*/ ._pgshowphone /*b4j.example.b4xpageshowphone*/ ._lbltotal /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText());
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4j.example.b4xpagesell __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesell";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="Root.LoadLayout(\"frmSell\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("frmSell",ba);
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="End Sub";
return "";
}
public String  _btnback_click(b4j.example.b4xpagesell __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesell";
if (Debug.shouldDelegate(ba, "btnback_click", false))
	 {return ((String) Debug.delegate(ba, "btnback_click", null));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub btnBack_Click";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (this);
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="End Sub";
return "";
}
public String  _btnsell_click(b4j.example.b4xpagesell __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesell";
if (Debug.shouldDelegate(ba, "btnsell_click", false))
	 {return ((String) Debug.delegate(ba, "btnsell_click", null));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Private Sub btnSell_Click";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="If B4XPages.MainPage.pgPhones.intPhoneClicked = 1";
if (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgphones /*b4j.example.b4xpagesphones*/ ._intphoneclicked /*int*/ ==1) { 
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="B4XPages.MainPage.phone1.intAmount = B4XPages.Ma";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone1 /*b4j.example.phone*/ ._intamount /*int*/  = (int) (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone1 /*b4j.example.phone*/ ._intamount /*int*/ -(double)(Double.parseDouble(__ref._lblquantity /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText())));
 }else 
{RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
if (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgphones /*b4j.example.b4xpagesphones*/ ._intphoneclicked /*int*/ ==2) { 
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="B4XPages.MainPage.phone2.intAmount = B4XPages.Ma";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone2 /*b4j.example.phone*/ ._intamount /*int*/  = (int) (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone2 /*b4j.example.phone*/ ._intamount /*int*/ -(double)(Double.parseDouble(__ref._lblquantity /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText())));
 }else 
{RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="else If B4XPages.MainPage.pgPhones.intPhoneClicke";
if (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgphones /*b4j.example.b4xpagesphones*/ ._intphoneclicked /*int*/ ==3) { 
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="B4XPages.MainPage.phone3.intAmount = B4XPages.Ma";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone3 /*b4j.example.phone*/ ._intamount /*int*/  = (int) (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone3 /*b4j.example.phone*/ ._intamount /*int*/ -(double)(Double.parseDouble(__ref._lblquantity /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText())));
 }else 
{RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
if (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgphones /*b4j.example.b4xpagesphones*/ ._intphoneclicked /*int*/ ==4) { 
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="B4XPages.MainPage.phone4.intAmount = B4XPages.Ma";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone4 /*b4j.example.phone*/ ._intamount /*int*/  = (int) (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone4 /*b4j.example.phone*/ ._intamount /*int*/ -(double)(Double.parseDouble(__ref._lblquantity /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText())));
 }else 
{RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="else If B4XPages.MainPage.pgPhones.intPhoneClicke";
if (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgphones /*b4j.example.b4xpagesphones*/ ._intphoneclicked /*int*/ ==5) { 
RDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="B4XPages.MainPage.phone5.intAmount = B4XPages.Ma";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone5 /*b4j.example.phone*/ ._intamount /*int*/  = (int) (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone5 /*b4j.example.phone*/ ._intamount /*int*/ -(double)(Double.parseDouble(__ref._lblquantity /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText())));
 }else 
{RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
if (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgphones /*b4j.example.b4xpagesphones*/ ._intphoneclicked /*int*/ ==6) { 
RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="B4XPages.MainPage.phone6.intAmount = B4XPages.Ma";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone6 /*b4j.example.phone*/ ._intamount /*int*/  = (int) (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone6 /*b4j.example.phone*/ ._intamount /*int*/ -(double)(Double.parseDouble(__ref._lblquantity /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText())));
 }else 
{RDebugUtils.currentLine=3014669;
 //BA.debugLineNum = 3014669;BA.debugLine="else If B4XPages.MainPage.pgPhones.intPhoneClicke";
if (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgphones /*b4j.example.b4xpagesphones*/ ._intphoneclicked /*int*/ ==7) { 
RDebugUtils.currentLine=3014670;
 //BA.debugLineNum = 3014670;BA.debugLine="B4XPages.MainPage.phone7.intAmount = B4XPages.Ma";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone7 /*b4j.example.phone*/ ._intamount /*int*/  = (int) (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone7 /*b4j.example.phone*/ ._intamount /*int*/ -(double)(Double.parseDouble(__ref._lblquantity /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText())));
 }else 
{RDebugUtils.currentLine=3014671;
 //BA.debugLineNum = 3014671;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
if (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgphones /*b4j.example.b4xpagesphones*/ ._intphoneclicked /*int*/ ==8) { 
RDebugUtils.currentLine=3014672;
 //BA.debugLineNum = 3014672;BA.debugLine="B4XPages.MainPage.phone8.intAmount = B4XPages.Ma";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone8 /*b4j.example.phone*/ ._intamount /*int*/  = (int) (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone8 /*b4j.example.phone*/ ._intamount /*int*/ -(double)(Double.parseDouble(__ref._lblquantity /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText())));
 }}}}}}}}
;
RDebugUtils.currentLine=3014675;
 //BA.debugLineNum = 3014675;BA.debugLine="B4XPages.MainPage.fltTotalIncome = B4XPages.MainP";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._flttotalincome /*float*/  = (float) (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._flttotalincome /*float*/ +(double)(Double.parseDouble(__ref._lbltotal /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText())));
RDebugUtils.currentLine=3014676;
 //BA.debugLineNum = 3014676;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"MainPage";
_b4xpages._showpageandremovepreviouspages /*String*/ ("MainPage");
RDebugUtils.currentLine=3014677;
 //BA.debugLineNum = 3014677;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xpagesell __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesell";
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Private lbllName As Label";
_lbllname = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="Private lblQuantity As Label";
_lblquantity = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="Private lblTotal As Label";
_lbltotal = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="Private txtAddress As TextField";
_txtaddress = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="Private txtName As TextField";
_txtname = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="Private txtSurname As TextField";
_txtsurname = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="End Sub";
return "";
}
}