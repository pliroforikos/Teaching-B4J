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
public b4j.example.phone _phone1 = null;
public b4j.example.phone _phone2 = null;
public b4j.example.phone _phone3 = null;
public b4j.example.phone _phone4 = null;
public b4j.example.phone _phone5 = null;
public b4j.example.phone _phone6 = null;
public b4j.example.phone _phone7 = null;
public b4j.example.phone _phone8 = null;
public b4j.example.b4xpagesphones _pgphones = null;
public b4j.example.b4xpagewarehouse _pgwarehouse = null;
public b4j.example.b4xpagerevenue _pgrevenue = null;
public float _flttotalincome = 0f;
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
 //BA.debugLineNum = 589827;BA.debugLine="fltTotalIncome = 0 		' First Total Income is 0";
__ref._flttotalincome /*float*/  = (float) (0);
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="pgPhones.Initialize";
__ref._pgphones /*b4j.example.b4xpagesphones*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="B4XPages.AddPage(\"pgPhones\", pgPhones)";
_b4xpages._addpage /*String*/ ("pgPhones",(Object)(__ref._pgphones /*b4j.example.b4xpagesphones*/ ));
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="pgWarehouse.Initialize";
__ref._pgwarehouse /*b4j.example.b4xpagewarehouse*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="B4XPages.AddPage(\"pgWarehouse\", pgWarehouse)";
_b4xpages._addpage /*String*/ ("pgWarehouse",(Object)(__ref._pgwarehouse /*b4j.example.b4xpagewarehouse*/ ));
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="pgRevenue.Initialize";
__ref._pgrevenue /*b4j.example.b4xpagerevenue*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="B4XPages.AddPage(\"pgRev\", pgRevenue)";
_b4xpages._addpage /*String*/ ("pgRev",(Object)(__ref._pgrevenue /*b4j.example.b4xpagerevenue*/ ));
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="insertItems";
__ref._insertitems /*String*/ (null);
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="End Sub";
return "";
}
public String  _insertitems(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "insertitems", false))
	 {return ((String) Debug.delegate(ba, "insertitems", null));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub insertItems";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="phone1.Initialize";
__ref._phone1 /*b4j.example.phone*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="phone1.newPhone(\"Yallomi\", \"6.53\", 64, 4,  \"Media";
__ref._phone1 /*b4j.example.phone*/ ._newphone /*String*/ (null,"Yallomi","6.53",(int) (64),(int) (4),"Mediatek",(int) (12),"Android",(float) (150));
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="phone2.Initialize";
__ref._phone2 /*b4j.example.phone*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="phone2.newPhone(\"Smith\", \"6.67\", 64, 4, \"Qualcomm";
__ref._phone2 /*b4j.example.phone*/ ._newphone /*String*/ (null,"Smith","6.67",(int) (64),(int) (4),"Qualcomm",(int) (4),"Android",(float) (220));
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="phone3.Initialize";
__ref._phone3 /*b4j.example.phone*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="phone3.newPhone(\"Taurus\", \"6.1\", 128, 4, \"Bionic\"";
__ref._phone3 /*b4j.example.phone*/ ._newphone /*String*/ (null,"Taurus","6.1",(int) (128),(int) (4),"Bionic",(int) (7),"IOS",(float) (780));
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="phone4.Initialize";
__ref._phone4 /*b4j.example.phone*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="phone4.newPhone(\"Talisman\", \"5.8\", 64, 4, \"Mediat";
__ref._phone4 /*b4j.example.phone*/ ._newphone /*String*/ (null,"Talisman","5.8",(int) (64),(int) (4),"Mediatek",(int) (12),"Android",(float) (150));
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="phone5.Initialize";
__ref._phone5 /*b4j.example.phone*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="phone5.newPhone(\"Cranberry\", \"5.8\", 32, 3, \"Media";
__ref._phone5 /*b4j.example.phone*/ ._newphone /*String*/ (null,"Cranberry","5.8",(int) (32),(int) (3),"Mediatek",(int) (16),"Android",(float) (130));
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="phone6.Initialize";
__ref._phone6 /*b4j.example.phone*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="phone6.newPhone(\"OzOn\", \"5.8\", 32, 2, \"Mediatek\",";
__ref._phone6 /*b4j.example.phone*/ ._newphone /*String*/ (null,"OzOn","5.8",(int) (32),(int) (2),"Mediatek",(int) (16),"Android",(float) (90));
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="phone7.Initialize";
__ref._phone7 /*b4j.example.phone*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=655374;
 //BA.debugLineNum = 655374;BA.debugLine="phone7.newPhone(\"H2O\", \"5.8\", 64, 3, \"Qualcomm\",";
__ref._phone7 /*b4j.example.phone*/ ._newphone /*String*/ (null,"H2O","5.8",(int) (64),(int) (3),"Qualcomm",(int) (2),"Android",(float) (170));
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="phone8.Initialize";
__ref._phone8 /*b4j.example.phone*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="phone8.newPhone(\"Zeus\", \"6.67\", 128, 6, \"Qualcomm";
__ref._phone8 /*b4j.example.phone*/ ._newphone /*String*/ (null,"Zeus","6.67",(int) (128),(int) (6),"Qualcomm",(int) (4),"Android",(float) (650));
RDebugUtils.currentLine=655377;
 //BA.debugLineNum = 655377;BA.debugLine="End Sub";
return "";
}
public String  _btnbuy_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnbuy_click", false))
	 {return ((String) Debug.delegate(ba, "btnbuy_click", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub btnBuy_Click";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="B4XPages.ShowPage(\"pgPhones\")";
_b4xpages._showpage /*String*/ ("pgPhones");
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="End Sub";
return "";
}
public String  _btnrevenue_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnrevenue_click", false))
	 {return ((String) Debug.delegate(ba, "btnrevenue_click", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub btnRevenue_Click";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="B4XPages.ShowPage(\"pgRev\")";
_b4xpages._showpage /*String*/ ("pgRev");
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
public String  _btnstorage_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnstorage_click", false))
	 {return ((String) Debug.delegate(ba, "btnstorage_click", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub btnStorage_Click";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="B4XPages.ShowPage(\"pgWarehouse\")";
_b4xpages._showpage /*String*/ ("pgWarehouse");
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458755;BA.debugLine="Public  phone1, phone2, phone3, phone4 As Phone";
_phone1 = new b4j.example.phone();
_phone2 = new b4j.example.phone();
_phone3 = new b4j.example.phone();
_phone4 = new b4j.example.phone();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Public  phone5, phone6, phone7, phone8 As Phone";
_phone5 = new b4j.example.phone();
_phone6 = new b4j.example.phone();
_phone7 = new b4j.example.phone();
_phone8 = new b4j.example.phone();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Public  pgPhones As B4XPagesPhones";
_pgphones = new b4j.example.b4xpagesphones();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private pgWarehouse As B4XPageWarehouse";
_pgwarehouse = new b4j.example.b4xpagewarehouse();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Private pgRevenue As B4XPageRevenue";
_pgrevenue = new b4j.example.b4xpagerevenue();
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Public fltTotalIncome As Float 		'Variable to cou";
_flttotalincome = 0f;
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