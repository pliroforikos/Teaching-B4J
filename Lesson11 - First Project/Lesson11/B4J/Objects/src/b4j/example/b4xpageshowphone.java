package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpageshowphone extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xpageshowphone", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpageshowphone.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.LabelWrapper _lblcpu = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbllname = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblmemory = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblos = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblram = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblscreen = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblstorage = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltotal = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtquantity = null;
public b4j.example.b4xpagesell _pgsell = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public Object  _initialize(b4j.example.b4xpageshowphone __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpageshowphone";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_appear(b4j.example.b4xpageshowphone __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpageshowphone";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_appear", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub B4XPage_Appear";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="loadValues";
__ref._loadvalues /*String*/ (null);
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="End Sub";
return "";
}
public String  _loadvalues(b4j.example.b4xpageshowphone __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpageshowphone";
if (Debug.shouldDelegate(ba, "loadvalues", false))
	 {return ((String) Debug.delegate(ba, "loadvalues", null));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Private Sub loadValues";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="If B4XPages.MainPage.pgPhones.intPhoneClicked = 1";
if (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgphones /*b4j.example.b4xpagesphones*/ ._intphoneclicked /*int*/ ==1) { 
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="lblCPU.Text = B4XPages.MainPage.phone1.strCPU";
__ref._lblcpu /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone1 /*b4j.example.phone*/ ._strcpu /*String*/ );
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="lbllName.Text = B4XPages.MainPage.phone1.strNa";
__ref._lbllname /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone1 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="lblMemory.Text = B4XPages.MainPage.phone1.intM";
__ref._lblmemory /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone1 /*b4j.example.phone*/ ._intmemory /*int*/ ));
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="lblOS.Text = B4XPages.MainPage.phone1.strOS";
__ref._lblos /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone1 /*b4j.example.phone*/ ._stros /*String*/ );
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="lblRam.Text = B4XPages.MainPage.phone1.fltRAM";
__ref._lblram /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone1 /*b4j.example.phone*/ ._fltram /*int*/ ));
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="lblScreen.Text = B4XPages.MainPage.phone1.strScr";
__ref._lblscreen /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone1 /*b4j.example.phone*/ ._strscreensize /*String*/ );
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="lblStorage.Text = B4XPages.MainPage.phone1.intAm";
__ref._lblstorage /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone1 /*b4j.example.phone*/ ._intamount /*int*/ ));
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="lblTotal.Text = B4XPages.MainPage.phone1.fltPric";
__ref._lbltotal /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone1 /*b4j.example.phone*/ ._fltprice /*float*/ ));
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="txtQuantity.Text = 1";
__ref._txtquantity /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(1));
 }else 
{RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
if (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgphones /*b4j.example.b4xpagesphones*/ ._intphoneclicked /*int*/ ==2) { 
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="lblCPU.Text = B4XPages.MainPage.phone2.strCPU";
__ref._lblcpu /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone2 /*b4j.example.phone*/ ._strcpu /*String*/ );
RDebugUtils.currentLine=2424845;
 //BA.debugLineNum = 2424845;BA.debugLine="lbllName.Text = B4XPages.MainPage.phone2.strName";
__ref._lbllname /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone2 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="lblMemory.Text = B4XPages.MainPage.phone2.intMem";
__ref._lblmemory /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone2 /*b4j.example.phone*/ ._intmemory /*int*/ ));
RDebugUtils.currentLine=2424847;
 //BA.debugLineNum = 2424847;BA.debugLine="lblOS.Text = B4XPages.MainPage.phone2.strOS";
__ref._lblos /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone2 /*b4j.example.phone*/ ._stros /*String*/ );
RDebugUtils.currentLine=2424848;
 //BA.debugLineNum = 2424848;BA.debugLine="lblRam.Text = B4XPages.MainPage.phone2.fltRAM";
__ref._lblram /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone2 /*b4j.example.phone*/ ._fltram /*int*/ ));
RDebugUtils.currentLine=2424849;
 //BA.debugLineNum = 2424849;BA.debugLine="lblScreen.Text = B4XPages.MainPage.phone2.strScr";
__ref._lblscreen /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone2 /*b4j.example.phone*/ ._strscreensize /*String*/ );
RDebugUtils.currentLine=2424850;
 //BA.debugLineNum = 2424850;BA.debugLine="lblStorage.Text = B4XPages.MainPage.phone2.intAm";
__ref._lblstorage /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone2 /*b4j.example.phone*/ ._intamount /*int*/ ));
RDebugUtils.currentLine=2424851;
 //BA.debugLineNum = 2424851;BA.debugLine="lblTotal.Text = B4XPages.MainPage.phone2.fltPric";
__ref._lbltotal /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone2 /*b4j.example.phone*/ ._fltprice /*float*/ ));
RDebugUtils.currentLine=2424852;
 //BA.debugLineNum = 2424852;BA.debugLine="txtQuantity.Text = 1";
__ref._txtquantity /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(1));
 }else 
{RDebugUtils.currentLine=2424853;
 //BA.debugLineNum = 2424853;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
if (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgphones /*b4j.example.b4xpagesphones*/ ._intphoneclicked /*int*/ ==3) { 
RDebugUtils.currentLine=2424854;
 //BA.debugLineNum = 2424854;BA.debugLine="lblCPU.Text = B4XPages.MainPage.phone3.strCPU";
__ref._lblcpu /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone3 /*b4j.example.phone*/ ._strcpu /*String*/ );
RDebugUtils.currentLine=2424855;
 //BA.debugLineNum = 2424855;BA.debugLine="lbllName.Text = B4XPages.MainPage.phone3.strName";
__ref._lbllname /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone3 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=2424856;
 //BA.debugLineNum = 2424856;BA.debugLine="lblMemory.Text = B4XPages.MainPage.phone3.intMem";
__ref._lblmemory /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone3 /*b4j.example.phone*/ ._intmemory /*int*/ ));
RDebugUtils.currentLine=2424857;
 //BA.debugLineNum = 2424857;BA.debugLine="lblOS.Text = B4XPages.MainPage.phone3.strOS";
__ref._lblos /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone3 /*b4j.example.phone*/ ._stros /*String*/ );
RDebugUtils.currentLine=2424858;
 //BA.debugLineNum = 2424858;BA.debugLine="lblRam.Text = B4XPages.MainPage.phone3.fltRAM";
__ref._lblram /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone3 /*b4j.example.phone*/ ._fltram /*int*/ ));
RDebugUtils.currentLine=2424859;
 //BA.debugLineNum = 2424859;BA.debugLine="lblScreen.Text = B4XPages.MainPage.phone3.strScr";
__ref._lblscreen /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone3 /*b4j.example.phone*/ ._strscreensize /*String*/ );
RDebugUtils.currentLine=2424860;
 //BA.debugLineNum = 2424860;BA.debugLine="lblStorage.Text = B4XPages.MainPage.phone3.intAm";
__ref._lblstorage /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone3 /*b4j.example.phone*/ ._intamount /*int*/ ));
RDebugUtils.currentLine=2424861;
 //BA.debugLineNum = 2424861;BA.debugLine="lblTotal.Text = B4XPages.MainPage.phone3.fltPric";
__ref._lbltotal /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone3 /*b4j.example.phone*/ ._fltprice /*float*/ ));
RDebugUtils.currentLine=2424862;
 //BA.debugLineNum = 2424862;BA.debugLine="txtQuantity.Text = 1";
__ref._txtquantity /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(1));
 }else 
{RDebugUtils.currentLine=2424863;
 //BA.debugLineNum = 2424863;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
if (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgphones /*b4j.example.b4xpagesphones*/ ._intphoneclicked /*int*/ ==4) { 
RDebugUtils.currentLine=2424864;
 //BA.debugLineNum = 2424864;BA.debugLine="lblCPU.Text = B4XPages.MainPage.phone4.strCPU";
__ref._lblcpu /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone4 /*b4j.example.phone*/ ._strcpu /*String*/ );
RDebugUtils.currentLine=2424865;
 //BA.debugLineNum = 2424865;BA.debugLine="lbllName.Text = B4XPages.MainPage.phone4.strName";
__ref._lbllname /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone4 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=2424866;
 //BA.debugLineNum = 2424866;BA.debugLine="lblMemory.Text = B4XPages.MainPage.phone4.intMem";
__ref._lblmemory /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone4 /*b4j.example.phone*/ ._intmemory /*int*/ ));
RDebugUtils.currentLine=2424867;
 //BA.debugLineNum = 2424867;BA.debugLine="lblOS.Text = B4XPages.MainPage.phone4.strOS";
__ref._lblos /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone4 /*b4j.example.phone*/ ._stros /*String*/ );
RDebugUtils.currentLine=2424868;
 //BA.debugLineNum = 2424868;BA.debugLine="lblRam.Text = B4XPages.MainPage.phone4.fltRAM";
__ref._lblram /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone4 /*b4j.example.phone*/ ._fltram /*int*/ ));
RDebugUtils.currentLine=2424869;
 //BA.debugLineNum = 2424869;BA.debugLine="lblScreen.Text = B4XPages.MainPage.phone4.strScr";
__ref._lblscreen /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone4 /*b4j.example.phone*/ ._strscreensize /*String*/ );
RDebugUtils.currentLine=2424870;
 //BA.debugLineNum = 2424870;BA.debugLine="lblStorage.Text = B4XPages.MainPage.phone4.intAm";
__ref._lblstorage /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone4 /*b4j.example.phone*/ ._intamount /*int*/ ));
RDebugUtils.currentLine=2424871;
 //BA.debugLineNum = 2424871;BA.debugLine="lblTotal.Text = B4XPages.MainPage.phone4.fltPric";
__ref._lbltotal /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone4 /*b4j.example.phone*/ ._fltprice /*float*/ ));
RDebugUtils.currentLine=2424872;
 //BA.debugLineNum = 2424872;BA.debugLine="txtQuantity.Text = 1";
__ref._txtquantity /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(1));
 }else 
{RDebugUtils.currentLine=2424873;
 //BA.debugLineNum = 2424873;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
if (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgphones /*b4j.example.b4xpagesphones*/ ._intphoneclicked /*int*/ ==5) { 
RDebugUtils.currentLine=2424874;
 //BA.debugLineNum = 2424874;BA.debugLine="lblCPU.Text = B4XPages.MainPage.phone5.strCPU";
__ref._lblcpu /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone5 /*b4j.example.phone*/ ._strcpu /*String*/ );
RDebugUtils.currentLine=2424875;
 //BA.debugLineNum = 2424875;BA.debugLine="lbllName.Text = B4XPages.MainPage.phone5.strName";
__ref._lbllname /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone5 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=2424876;
 //BA.debugLineNum = 2424876;BA.debugLine="lblMemory.Text = B4XPages.MainPage.phone5.intMem";
__ref._lblmemory /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone5 /*b4j.example.phone*/ ._intmemory /*int*/ ));
RDebugUtils.currentLine=2424877;
 //BA.debugLineNum = 2424877;BA.debugLine="lblOS.Text = B4XPages.MainPage.phone5.strOS";
__ref._lblos /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone5 /*b4j.example.phone*/ ._stros /*String*/ );
RDebugUtils.currentLine=2424878;
 //BA.debugLineNum = 2424878;BA.debugLine="lblRam.Text = B4XPages.MainPage.phone5.fltRAM";
__ref._lblram /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone5 /*b4j.example.phone*/ ._fltram /*int*/ ));
RDebugUtils.currentLine=2424879;
 //BA.debugLineNum = 2424879;BA.debugLine="lblScreen.Text = B4XPages.MainPage.phone5.strScr";
__ref._lblscreen /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone5 /*b4j.example.phone*/ ._strscreensize /*String*/ );
RDebugUtils.currentLine=2424880;
 //BA.debugLineNum = 2424880;BA.debugLine="lblStorage.Text = B4XPages.MainPage.phone5.intAm";
__ref._lblstorage /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone5 /*b4j.example.phone*/ ._intamount /*int*/ ));
RDebugUtils.currentLine=2424881;
 //BA.debugLineNum = 2424881;BA.debugLine="lblTotal.Text = B4XPages.MainPage.phone5.fltPric";
__ref._lbltotal /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone5 /*b4j.example.phone*/ ._fltprice /*float*/ ));
RDebugUtils.currentLine=2424882;
 //BA.debugLineNum = 2424882;BA.debugLine="txtQuantity.Text = 1";
__ref._txtquantity /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(1));
 }else 
{RDebugUtils.currentLine=2424883;
 //BA.debugLineNum = 2424883;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
if (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgphones /*b4j.example.b4xpagesphones*/ ._intphoneclicked /*int*/ ==6) { 
RDebugUtils.currentLine=2424884;
 //BA.debugLineNum = 2424884;BA.debugLine="lblCPU.Text = B4XPages.MainPage.phone6.strCPU";
__ref._lblcpu /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone6 /*b4j.example.phone*/ ._strcpu /*String*/ );
RDebugUtils.currentLine=2424885;
 //BA.debugLineNum = 2424885;BA.debugLine="lbllName.Text = B4XPages.MainPage.phone6.strName";
__ref._lbllname /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone6 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=2424886;
 //BA.debugLineNum = 2424886;BA.debugLine="lblMemory.Text = B4XPages.MainPage.phone6.intMem";
__ref._lblmemory /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone6 /*b4j.example.phone*/ ._intmemory /*int*/ ));
RDebugUtils.currentLine=2424887;
 //BA.debugLineNum = 2424887;BA.debugLine="lblOS.Text = B4XPages.MainPage.phone6.strOS";
__ref._lblos /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone6 /*b4j.example.phone*/ ._stros /*String*/ );
RDebugUtils.currentLine=2424888;
 //BA.debugLineNum = 2424888;BA.debugLine="lblRam.Text = B4XPages.MainPage.phone6.fltRAM";
__ref._lblram /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone6 /*b4j.example.phone*/ ._fltram /*int*/ ));
RDebugUtils.currentLine=2424889;
 //BA.debugLineNum = 2424889;BA.debugLine="lblScreen.Text = B4XPages.MainPage.phone6.strScr";
__ref._lblscreen /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone6 /*b4j.example.phone*/ ._strscreensize /*String*/ );
RDebugUtils.currentLine=2424890;
 //BA.debugLineNum = 2424890;BA.debugLine="lblStorage.Text = B4XPages.MainPage.phone6.intAm";
__ref._lblstorage /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone6 /*b4j.example.phone*/ ._intamount /*int*/ ));
RDebugUtils.currentLine=2424891;
 //BA.debugLineNum = 2424891;BA.debugLine="lblTotal.Text = B4XPages.MainPage.phone6.fltPric";
__ref._lbltotal /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone6 /*b4j.example.phone*/ ._fltprice /*float*/ ));
RDebugUtils.currentLine=2424892;
 //BA.debugLineNum = 2424892;BA.debugLine="txtQuantity.Text = 1";
__ref._txtquantity /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(1));
 }else 
{RDebugUtils.currentLine=2424893;
 //BA.debugLineNum = 2424893;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
if (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgphones /*b4j.example.b4xpagesphones*/ ._intphoneclicked /*int*/ ==7) { 
RDebugUtils.currentLine=2424894;
 //BA.debugLineNum = 2424894;BA.debugLine="lblCPU.Text = B4XPages.MainPage.phone7.strCPU";
__ref._lblcpu /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone7 /*b4j.example.phone*/ ._strcpu /*String*/ );
RDebugUtils.currentLine=2424895;
 //BA.debugLineNum = 2424895;BA.debugLine="lbllName.Text = B4XPages.MainPage.phone7.strName";
__ref._lbllname /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone7 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=2424896;
 //BA.debugLineNum = 2424896;BA.debugLine="lblMemory.Text = B4XPages.MainPage.phone7.intMem";
__ref._lblmemory /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone7 /*b4j.example.phone*/ ._intmemory /*int*/ ));
RDebugUtils.currentLine=2424897;
 //BA.debugLineNum = 2424897;BA.debugLine="lblOS.Text = B4XPages.MainPage.phone7.strOS";
__ref._lblos /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone7 /*b4j.example.phone*/ ._stros /*String*/ );
RDebugUtils.currentLine=2424898;
 //BA.debugLineNum = 2424898;BA.debugLine="lblRam.Text = B4XPages.MainPage.phone7.fltRAM";
__ref._lblram /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone7 /*b4j.example.phone*/ ._fltram /*int*/ ));
RDebugUtils.currentLine=2424899;
 //BA.debugLineNum = 2424899;BA.debugLine="lblScreen.Text = B4XPages.MainPage.phone7.strScr";
__ref._lblscreen /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone7 /*b4j.example.phone*/ ._strscreensize /*String*/ );
RDebugUtils.currentLine=2424900;
 //BA.debugLineNum = 2424900;BA.debugLine="lblStorage.Text = B4XPages.MainPage.phone7.intAm";
__ref._lblstorage /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone7 /*b4j.example.phone*/ ._intamount /*int*/ ));
RDebugUtils.currentLine=2424901;
 //BA.debugLineNum = 2424901;BA.debugLine="lblTotal.Text = B4XPages.MainPage.phone7.fltPric";
__ref._lbltotal /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone7 /*b4j.example.phone*/ ._fltprice /*float*/ ));
RDebugUtils.currentLine=2424902;
 //BA.debugLineNum = 2424902;BA.debugLine="txtQuantity.Text = 1";
__ref._txtquantity /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(1));
 }else 
{RDebugUtils.currentLine=2424903;
 //BA.debugLineNum = 2424903;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
if (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgphones /*b4j.example.b4xpagesphones*/ ._intphoneclicked /*int*/ ==8) { 
RDebugUtils.currentLine=2424904;
 //BA.debugLineNum = 2424904;BA.debugLine="lblCPU.Text = B4XPages.MainPage.phone8.strCPU";
__ref._lblcpu /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone8 /*b4j.example.phone*/ ._strcpu /*String*/ );
RDebugUtils.currentLine=2424905;
 //BA.debugLineNum = 2424905;BA.debugLine="lbllName.Text = B4XPages.MainPage.phone8.strName";
__ref._lbllname /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone8 /*b4j.example.phone*/ ._strname /*String*/ );
RDebugUtils.currentLine=2424906;
 //BA.debugLineNum = 2424906;BA.debugLine="lblMemory.Text = B4XPages.MainPage.phone8.intMem";
__ref._lblmemory /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone8 /*b4j.example.phone*/ ._intmemory /*int*/ ));
RDebugUtils.currentLine=2424907;
 //BA.debugLineNum = 2424907;BA.debugLine="lblOS.Text = B4XPages.MainPage.phone8.strOS";
__ref._lblos /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone8 /*b4j.example.phone*/ ._stros /*String*/ );
RDebugUtils.currentLine=2424908;
 //BA.debugLineNum = 2424908;BA.debugLine="lblRam.Text = B4XPages.MainPage.phone8.fltRAM";
__ref._lblram /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone8 /*b4j.example.phone*/ ._fltram /*int*/ ));
RDebugUtils.currentLine=2424909;
 //BA.debugLineNum = 2424909;BA.debugLine="lblScreen.Text = B4XPages.MainPage.phone8.strScr";
__ref._lblscreen /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone8 /*b4j.example.phone*/ ._strscreensize /*String*/ );
RDebugUtils.currentLine=2424910;
 //BA.debugLineNum = 2424910;BA.debugLine="lblStorage.Text = B4XPages.MainPage.phone8.intAm";
__ref._lblstorage /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone8 /*b4j.example.phone*/ ._intamount /*int*/ ));
RDebugUtils.currentLine=2424911;
 //BA.debugLineNum = 2424911;BA.debugLine="lblTotal.Text = B4XPages.MainPage.phone8.fltPric";
__ref._lbltotal /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone8 /*b4j.example.phone*/ ._fltprice /*float*/ ));
RDebugUtils.currentLine=2424912;
 //BA.debugLineNum = 2424912;BA.debugLine="txtQuantity.Text = 1";
__ref._txtquantity /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(1));
 }}}}}}}}
;
RDebugUtils.currentLine=2424914;
 //BA.debugLineNum = 2424914;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4j.example.b4xpageshowphone __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpageshowphone";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Root.LoadLayout(\"frmShowPhone\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("frmShowPhone",ba);
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="pgSell.Initialize";
__ref._pgsell /*b4j.example.b4xpagesell*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="B4XPages.AddPage(\"pgSell\", pgSell)";
_b4xpages._addpage /*String*/ ("pgSell",(Object)(__ref._pgsell /*b4j.example.b4xpagesell*/ ));
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="End Sub";
return "";
}
public String  _btnback_click(b4j.example.b4xpageshowphone __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpageshowphone";
if (Debug.shouldDelegate(ba, "btnback_click", false))
	 {return ((String) Debug.delegate(ba, "btnback_click", null));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub btnBack_Click";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (this);
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return "";
}
public String  _btnsell_click(b4j.example.b4xpageshowphone __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpageshowphone";
if (Debug.shouldDelegate(ba, "btnsell_click", false))
	 {return ((String) Debug.delegate(ba, "btnsell_click", null));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub btnSell_Click";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="If txtQuantity.Text <= lblStorage.Text Then";
if ((double)(Double.parseDouble(__ref._txtquantity /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=(double)(Double.parseDouble(__ref._lblstorage /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()))) { 
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="B4XPages.ShowPage(\"pgSell\")";
_b4xpages._showpage /*String*/ ("pgSell");
 }else {
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="xui.MsgboxAsync(\"Error not enough quantity\", \"\")";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error not enough quantity","");
 };
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xpageshowphone __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpageshowphone";
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="Private lblCPU As Label";
_lblcpu = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="Public  lbllName As Label		' We need this informa";
_lbllname = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="Private lblMemory As Label";
_lblmemory = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="Private lblOS As Label";
_lblos = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="Private lblRam As Label";
_lblram = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="Private lblScreen As Label";
_lblscreen = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="Private lblStorage As Label";
_lblstorage = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="Public  lblTotal As Label		' We need this informa";
_lbltotal = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="Public  txtQuantity As TextField ' We need this i";
_txtquantity = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="Public pgSell As B4XPageSell";
_pgsell = new b4j.example.b4xpagesell();
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="End Sub";
return "";
}
public String  _txtquantity_textchanged(b4j.example.b4xpageshowphone __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpageshowphone";
if (Debug.shouldDelegate(ba, "txtquantity_textchanged", false))
	 {return ((String) Debug.delegate(ba, "txtquantity_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub txtQuantity_TextChanged (Old As String";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="If New <> \"\" Then";
if ((_new).equals("") == false) { 
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="lblTotal.Text = B4XPages.MainPage.phone8.fltPric";
__ref._lbltotal /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._phone8 /*b4j.example.phone*/ ._fltprice /*float*/ *(double)(Double.parseDouble(_new))));
 }else {
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="lblTotal.Text = 0";
__ref._lbltotal /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(0));
 };
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="End Sub";
return "";
}
}