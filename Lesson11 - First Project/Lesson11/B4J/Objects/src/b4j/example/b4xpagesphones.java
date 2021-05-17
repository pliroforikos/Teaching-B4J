package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagesphones extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xpagesphones", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpagesphones.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.LabelWrapper _lblphone1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblphone2 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblphone3 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblphone4 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblphone5 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblphone6 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblphone7 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblphone8 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblprice1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblprice2 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblprice3 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblprice4 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblprice5 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblprice6 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblprice7 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblprice8 = null;
public int _intphoneclicked = 0;
public b4j.example.b4xpageshowphone _pgshowphone = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public Object  _initialize(b4j.example.b4xpagesphones __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpagesphones";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_appear(b4j.example.b4xpagesphones __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesphones";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_appear", null));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Private Sub B4XPage_Appear";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="insertValues";
__ref._insertvalues /*String*/ (null);
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return "";
}
public String  _insertvalues(b4j.example.b4xpagesphones __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesphones";
if (Debug.shouldDelegate(ba, "insertvalues", false))
	 {return ((String) Debug.delegate(ba, "insertvalues", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub insertValues";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="lblPhone1.Text = B4XPages.MainPage.phone1.strName";
__ref._lblphone1 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone1 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="lblPhone2.Text = B4XPages.MainPage.phone2.strName";
__ref._lblphone2 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone2 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="lblPhone3.Text = B4XPages.MainPage.phone3.strName";
__ref._lblphone3 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone3 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="lblPhone4.Text = B4XPages.MainPage.phone4.strName";
__ref._lblphone4 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone4 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="lblPhone5.Text = B4XPages.MainPage.phone5.strName";
__ref._lblphone5 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone5 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="lblPhone6.Text = B4XPages.MainPage.phone6.strName";
__ref._lblphone6 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone6 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="lblPhone7.Text = B4XPages.MainPage.phone7.strName";
__ref._lblphone7 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone7 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="lblPhone8.Text = B4XPages.MainPage.phone8.strName";
__ref._lblphone8 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone8 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="lblPrice1.Text = B4XPages.MainPage.phone1.fltPric";
__ref._lblprice1 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone1 /*b4j.example.phone*/ ._fltprice /*float*/ )+" $");
RDebugUtils.currentLine=1572874;
 //BA.debugLineNum = 1572874;BA.debugLine="lblPrice2.Text = B4XPages.MainPage.phone2.fltPric";
__ref._lblprice2 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone2 /*b4j.example.phone*/ ._fltprice /*float*/ )+" $");
RDebugUtils.currentLine=1572875;
 //BA.debugLineNum = 1572875;BA.debugLine="lblPrice3.Text = B4XPages.MainPage.phone3.fltPric";
__ref._lblprice3 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone3 /*b4j.example.phone*/ ._fltprice /*float*/ )+" $");
RDebugUtils.currentLine=1572876;
 //BA.debugLineNum = 1572876;BA.debugLine="lblPrice4.Text = B4XPages.MainPage.phone4.fltPric";
__ref._lblprice4 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone4 /*b4j.example.phone*/ ._fltprice /*float*/ )+" $");
RDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="lblPrice5.Text = B4XPages.MainPage.phone5.fltPric";
__ref._lblprice5 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone5 /*b4j.example.phone*/ ._fltprice /*float*/ )+" $");
RDebugUtils.currentLine=1572878;
 //BA.debugLineNum = 1572878;BA.debugLine="lblPrice6.Text = B4XPages.MainPage.phone6.fltPric";
__ref._lblprice6 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone6 /*b4j.example.phone*/ ._fltprice /*float*/ )+" $");
RDebugUtils.currentLine=1572879;
 //BA.debugLineNum = 1572879;BA.debugLine="lblPrice7.Text = B4XPages.MainPage.phone7.fltPric";
__ref._lblprice7 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone7 /*b4j.example.phone*/ ._fltprice /*float*/ )+" $");
RDebugUtils.currentLine=1572880;
 //BA.debugLineNum = 1572880;BA.debugLine="lblPrice8.Text = B4XPages.MainPage.phone8.fltPric";
__ref._lblprice8 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone8 /*b4j.example.phone*/ ._fltprice /*float*/ )+" $");
RDebugUtils.currentLine=1572881;
 //BA.debugLineNum = 1572881;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4j.example.b4xpagesphones __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesphones";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Root.LoadLayout(\"frmPhones\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("frmPhones",ba);
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="pgShowPhone.Initialize";
__ref._pgshowphone /*b4j.example.b4xpageshowphone*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="B4XPages.AddPage(\"pgShow\", pgShowPhone)";
_b4xpages._addpage /*String*/ ("pgShow",(Object)(__ref._pgshowphone /*b4j.example.b4xpageshowphone*/ ));
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xpagesphones __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesphones";
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="Private lblPhone1 As Label";
_lblphone1 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="Private lblPhone2 As Label";
_lblphone2 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="Private lblPhone3 As Label";
_lblphone3 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="Private lblPhone4 As Label";
_lblphone4 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="Private lblPhone5 As Label";
_lblphone5 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="Private lblPhone6 As Label";
_lblphone6 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="Private lblPhone7 As Label";
_lblphone7 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="Private lblPhone8 As Label";
_lblphone8 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="Private lblPrice1 As Label";
_lblprice1 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="Private lblPrice2 As Label";
_lblprice2 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="Private lblPrice3 As Label";
_lblprice3 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=1310735;
 //BA.debugLineNum = 1310735;BA.debugLine="Private lblPrice4 As Label";
_lblprice4 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="Private lblPrice5 As Label";
_lblprice5 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=1310737;
 //BA.debugLineNum = 1310737;BA.debugLine="Private lblPrice6 As Label";
_lblprice6 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=1310738;
 //BA.debugLineNum = 1310738;BA.debugLine="Private lblPrice7 As Label";
_lblprice7 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=1310739;
 //BA.debugLineNum = 1310739;BA.debugLine="Private lblPrice8 As Label";
_lblprice8 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=1310741;
 //BA.debugLineNum = 1310741;BA.debugLine="Public intPhoneClicked As Int";
_intphoneclicked = 0;
RDebugUtils.currentLine=1310742;
 //BA.debugLineNum = 1310742;BA.debugLine="Public pgShowPhone As B4XPageShowPhone";
_pgshowphone = new b4j.example.b4xpageshowphone();
RDebugUtils.currentLine=1310743;
 //BA.debugLineNum = 1310743;BA.debugLine="End Sub";
return "";
}
public String  _lblphone1_mouseclicked(b4j.example.b4xpagesphones __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesphones";
if (Debug.shouldDelegate(ba, "lblphone1_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "lblphone1_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub lblPhone1_MouseClicked (EventData As M";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="intPhoneClicked = 1";
__ref._intphoneclicked /*int*/  = (int) (1);
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="B4XPages.ShowPage(\"pgShow\")";
_b4xpages._showpage /*String*/ ("pgShow");
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="End Sub";
return "";
}
public String  _lblphone2_mouseclicked(b4j.example.b4xpagesphones __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesphones";
if (Debug.shouldDelegate(ba, "lblphone2_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "lblphone2_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Private Sub lblPhone2_MouseClicked (EventData As M";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="intPhoneClicked = 2";
__ref._intphoneclicked /*int*/  = (int) (2);
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="B4XPages.ShowPage(\"pgShow\")";
_b4xpages._showpage /*String*/ ("pgShow");
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="End Sub";
return "";
}
public String  _lblphone3_mouseclicked(b4j.example.b4xpagesphones __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesphones";
if (Debug.shouldDelegate(ba, "lblphone3_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "lblphone3_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub lblPhone3_MouseClicked (EventData As M";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="intPhoneClicked = 3";
__ref._intphoneclicked /*int*/  = (int) (3);
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="B4XPages.ShowPage(\"pgShow\")";
_b4xpages._showpage /*String*/ ("pgShow");
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="End Sub";
return "";
}
public String  _lblphone4_mouseclicked(b4j.example.b4xpagesphones __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesphones";
if (Debug.shouldDelegate(ba, "lblphone4_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "lblphone4_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub lblPhone4_MouseClicked (EventData As M";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="intPhoneClicked = 4";
__ref._intphoneclicked /*int*/  = (int) (4);
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="B4XPages.ShowPage(\"pgShow\")";
_b4xpages._showpage /*String*/ ("pgShow");
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="End Sub";
return "";
}
public String  _lblphone5_mouseclicked(b4j.example.b4xpagesphones __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesphones";
if (Debug.shouldDelegate(ba, "lblphone5_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "lblphone5_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub lblPhone5_MouseClicked (EventData As M";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="intPhoneClicked = 5";
__ref._intphoneclicked /*int*/  = (int) (5);
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="B4XPages.ShowPage(\"pgShow\")";
_b4xpages._showpage /*String*/ ("pgShow");
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="End Sub";
return "";
}
public String  _lblphone6_mouseclicked(b4j.example.b4xpagesphones __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesphones";
if (Debug.shouldDelegate(ba, "lblphone6_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "lblphone6_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub lblPhone6_MouseClicked (EventData As M";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="intPhoneClicked = 6";
__ref._intphoneclicked /*int*/  = (int) (6);
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="B4XPages.ShowPage(\"pgShow\")";
_b4xpages._showpage /*String*/ ("pgShow");
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="End Sub";
return "";
}
public String  _lblphone7_mouseclicked(b4j.example.b4xpagesphones __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesphones";
if (Debug.shouldDelegate(ba, "lblphone7_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "lblphone7_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub lblPhone7_MouseClicked (EventData As M";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="intPhoneClicked = 7";
__ref._intphoneclicked /*int*/  = (int) (7);
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="B4XPages.ShowPage(\"pgShow\")";
_b4xpages._showpage /*String*/ ("pgShow");
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="End Sub";
return "";
}
public String  _lblphone8_mouseclicked(b4j.example.b4xpagesphones __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesphones";
if (Debug.shouldDelegate(ba, "lblphone8_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "lblphone8_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub lblPhone8_MouseClicked (EventData As M";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="intPhoneClicked = 8";
__ref._intphoneclicked /*int*/  = (int) (8);
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="B4XPages.ShowPage(\"pgShow\")";
_b4xpages._showpage /*String*/ ("pgShow");
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="End Sub";
return "";
}
}