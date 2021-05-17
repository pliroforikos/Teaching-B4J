package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagewarehouse extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xpagewarehouse", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpagewarehouse.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.LabelWrapper _lblq1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblq2 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblq3 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblq4 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblq5 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblq6 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblq7 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblq8 = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public Object  _initialize(b4j.example.b4xpagewarehouse __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpagewarehouse";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_appear(b4j.example.b4xpagewarehouse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagewarehouse";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_appear", null));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub B4XPage_Appear";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="loadData";
__ref._loaddata /*String*/ (null);
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="End Sub";
return "";
}
public String  _loaddata(b4j.example.b4xpagewarehouse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagewarehouse";
if (Debug.shouldDelegate(ba, "loaddata", false))
	 {return ((String) Debug.delegate(ba, "loaddata", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub loadData";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="lblPhone1.Text = B4XPages.MainPage.phone1.strName";
__ref._lblphone1 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone1 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="lblPhone2.Text = B4XPages.MainPage.phone2.strName";
__ref._lblphone2 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone2 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="lblPhone3.Text = B4XPages.MainPage.phone3.strName";
__ref._lblphone3 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone3 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="lblPhone4.Text = B4XPages.MainPage.phone4.strName";
__ref._lblphone4 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone4 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="lblPhone5.Text = B4XPages.MainPage.phone5.strName";
__ref._lblphone5 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone5 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="lblPhone6.Text = B4XPages.MainPage.phone6.strName";
__ref._lblphone6 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone6 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="lblPhone7.Text = B4XPages.MainPage.phone7.strName";
__ref._lblphone7 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone7 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="lblPhone8.Text = B4XPages.MainPage.phone8.strName";
__ref._lblphone8 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone8 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="lblQ1.Text = B4XPages.MainPage.phone1.intAmount";
__ref._lblq1 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone1 /*b4j.example.phone*/ ._intamount /*int*/ ));
RDebugUtils.currentLine=3407882;
 //BA.debugLineNum = 3407882;BA.debugLine="lblQ2.Text = B4XPages.MainPage.phone2.intAmount";
__ref._lblq2 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone2 /*b4j.example.phone*/ ._intamount /*int*/ ));
RDebugUtils.currentLine=3407883;
 //BA.debugLineNum = 3407883;BA.debugLine="lblQ3.Text = B4XPages.MainPage.phone3.intAmount";
__ref._lblq3 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone3 /*b4j.example.phone*/ ._intamount /*int*/ ));
RDebugUtils.currentLine=3407884;
 //BA.debugLineNum = 3407884;BA.debugLine="lblQ4.Text = B4XPages.MainPage.phone4.intAmount";
__ref._lblq4 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone4 /*b4j.example.phone*/ ._intamount /*int*/ ));
RDebugUtils.currentLine=3407885;
 //BA.debugLineNum = 3407885;BA.debugLine="lblQ5.Text = B4XPages.MainPage.phone5.intAmount";
__ref._lblq5 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone5 /*b4j.example.phone*/ ._intamount /*int*/ ));
RDebugUtils.currentLine=3407886;
 //BA.debugLineNum = 3407886;BA.debugLine="lblQ6.Text = B4XPages.MainPage.phone6.intAmount";
__ref._lblq6 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone6 /*b4j.example.phone*/ ._intamount /*int*/ ));
RDebugUtils.currentLine=3407887;
 //BA.debugLineNum = 3407887;BA.debugLine="lblQ7.Text = B4XPages.MainPage.phone7.intAmount";
__ref._lblq7 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone7 /*b4j.example.phone*/ ._intamount /*int*/ ));
RDebugUtils.currentLine=3407888;
 //BA.debugLineNum = 3407888;BA.debugLine="lblQ8.Text = B4XPages.MainPage.phone8.intAmount";
__ref._lblq8 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone8 /*b4j.example.phone*/ ._intamount /*int*/ ));
RDebugUtils.currentLine=3407889;
 //BA.debugLineNum = 3407889;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4j.example.b4xpagewarehouse __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagewarehouse";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="Root.LoadLayout(\"frmWarehouse\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("frmWarehouse",ba);
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xpagewarehouse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagewarehouse";
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="Private lblPhone1 As Label";
_lblphone1 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="Private lblPhone2 As Label";
_lblphone2 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="Private lblPhone3 As Label";
_lblphone3 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="Private lblPhone4 As Label";
_lblphone4 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="Private lblPhone5 As Label";
_lblphone5 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="Private lblPhone6 As Label";
_lblphone6 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="Private lblPhone7 As Label";
_lblphone7 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="Private lblPhone8 As Label";
_lblphone8 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="Private lblQ1 As Label";
_lblq1 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="Private lblQ2 As Label";
_lblq2 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="Private lblQ3 As Label";
_lblq3 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="Private lblQ4 As Label";
_lblq4 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=3145743;
 //BA.debugLineNum = 3145743;BA.debugLine="Private lblQ5 As Label";
_lblq5 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=3145744;
 //BA.debugLineNum = 3145744;BA.debugLine="Private lblQ6 As Label";
_lblq6 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=3145745;
 //BA.debugLineNum = 3145745;BA.debugLine="Private lblQ7 As Label";
_lblq7 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=3145746;
 //BA.debugLineNum = 3145746;BA.debugLine="Private lblQ8 As Label";
_lblq8 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=3145747;
 //BA.debugLineNum = 3145747;BA.debugLine="End Sub";
return "";
}
}