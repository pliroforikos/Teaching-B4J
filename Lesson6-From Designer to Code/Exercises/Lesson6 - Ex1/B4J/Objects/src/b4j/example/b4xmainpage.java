package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xmainpage", this);
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btncalculate = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnumber1 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnumber2 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txttotal = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnclear = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 24;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 25;BA.debugLine="Root.LoadLayout(\"MainPage\")";
_root.LoadLayout("MainPage",ba);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _btnclear_click() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Private Sub btnClear_Click";
 //BA.debugLineNum = 29;BA.debugLine="txtTotal.Text = \"\"";
_txttotal.setText("");
 //BA.debugLineNum = 30;BA.debugLine="txtNumber1.Text = \"\"";
_txtnumber1.setText("");
 //BA.debugLineNum = 31;BA.debugLine="txtNumber2.Text = \"\"";
_txtnumber2.setText("");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public String  _btndiv_click() throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Private Sub btnDiv_Click";
 //BA.debugLineNum = 43;BA.debugLine="If txtNumber2.Text <> 0 Then";
if ((_txtnumber2.getText()).equals(BA.NumberToString(0)) == false) { 
 //BA.debugLineNum = 44;BA.debugLine="txtTotal.Text = txtNumber1.Text / txtNumber2.Tex";
_txttotal.setText(BA.NumberToString((double)(Double.parseDouble(_txtnumber1.getText()))/(double)(double)(Double.parseDouble(_txtnumber2.getText()))));
 };
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public String  _btnmult_click() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Private Sub btnMult_Click";
 //BA.debugLineNum = 39;BA.debugLine="txtTotal.Text = txtNumber1.Text * txtNumber2.Text";
_txttotal.setText(BA.NumberToString((double)(Double.parseDouble(_txtnumber1.getText()))*(double)(Double.parseDouble(_txtnumber2.getText()))));
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public String  _btnsub_click() throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Private Sub btnSub_Click";
 //BA.debugLineNum = 35;BA.debugLine="txtTotal.Text = txtNumber1.Text - txtNumber2.Text";
_txttotal.setText(BA.NumberToString((double)(Double.parseDouble(_txtnumber1.getText()))-(double)(Double.parseDouble(_txtnumber2.getText()))));
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _btnsum_click() throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Private Sub btnSum_Click";
 //BA.debugLineNum = 49;BA.debugLine="txtTotal.Text = txtNumber1.Text + txtNumber2.Text";
_txttotal.setText(BA.NumberToString((double)(Double.parseDouble(_txtnumber1.getText()))+(double)(Double.parseDouble(_txtnumber2.getText()))));
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Private btnCalculate As Button";
_btncalculate = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private txtNumber1 As TextField";
_txtnumber1 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private txtNumber2 As TextField";
_txtnumber2 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private txtTotal As TextField";
_txttotal = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private btnClear As Button";
_btnclear = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
