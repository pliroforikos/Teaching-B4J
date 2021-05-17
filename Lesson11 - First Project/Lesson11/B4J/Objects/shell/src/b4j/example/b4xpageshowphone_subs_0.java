package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpageshowphone_subs_0 {


public static RemoteObject  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (b4xpageshowphone) ","b4xpageshowphone",4,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("b4xpage_appear")) { return __ref.runUserSub(false, "b4xpageshowphone","b4xpage_appear", __ref);}
 BA.debugLineNum = 31;BA.debugLine="Private Sub B4XPage_Appear";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="loadValues";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.b4xpageshowphone.class, "_loadvalues" /*RemoteObject*/ );
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xpageshowphone) ","b4xpageshowphone",4,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpageshowphone","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 23;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Root = Root1";
Debug.ShouldStop(8388608);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 26;BA.debugLine="Root.LoadLayout(\"frmShowPhone\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("frmShowPhone")),__ref.getField(false, "ba"));
 BA.debugLineNum = 27;BA.debugLine="pgSell.Initialize";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pgsell" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagesell.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 28;BA.debugLine="B4XPages.AddPage(\"pgSell\", pgSell)";
Debug.ShouldStop(134217728);
b4xpageshowphone._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("pgSell")),(Object)((__ref.getField(false,"_pgsell" /*RemoteObject*/ ))));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnback_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnBack_Click (b4xpageshowphone) ","b4xpageshowphone",4,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("btnback_click")) { return __ref.runUserSub(false, "b4xpageshowphone","btnback_click", __ref);}
 BA.debugLineNum = 132;BA.debugLine="Private Sub btnBack_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(16);
b4xpageshowphone._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,(Object)(__ref));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsell_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSell_Click (b4xpageshowphone) ","b4xpageshowphone",4,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("btnsell_click")) { return __ref.runUserSub(false, "b4xpageshowphone","btnsell_click", __ref);}
 BA.debugLineNum = 124;BA.debugLine="Private Sub btnSell_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="If txtQuantity.Text <= lblStorage.Text Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtquantity" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, __ref.getField(false,"_lblstorage" /*RemoteObject*/ ).runMethod(true,"getText")))) { 
 BA.debugLineNum = 126;BA.debugLine="B4XPages.ShowPage(\"pgSell\")";
Debug.ShouldStop(536870912);
b4xpageshowphone._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pgSell")));
 }else {
 BA.debugLineNum = 128;BA.debugLine="xui.MsgboxAsync(\"Error not enough quantity\", \"\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error not enough quantity")),(Object)(RemoteObject.createImmutable("")));
 };
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
b4xpageshowphone._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpageshowphone._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpageshowphone._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpageshowphone._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private lblCPU As Label";
b4xpageshowphone._lblcpu = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblcpu",b4xpageshowphone._lblcpu);
 //BA.debugLineNum = 5;BA.debugLine="Public  lbllName As Label		' We need this informa";
b4xpageshowphone._lbllname = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbllname",b4xpageshowphone._lbllname);
 //BA.debugLineNum = 6;BA.debugLine="Private lblMemory As Label";
b4xpageshowphone._lblmemory = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblmemory",b4xpageshowphone._lblmemory);
 //BA.debugLineNum = 7;BA.debugLine="Private lblOS As Label";
b4xpageshowphone._lblos = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblos",b4xpageshowphone._lblos);
 //BA.debugLineNum = 8;BA.debugLine="Private lblRam As Label";
b4xpageshowphone._lblram = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblram",b4xpageshowphone._lblram);
 //BA.debugLineNum = 9;BA.debugLine="Private lblScreen As Label";
b4xpageshowphone._lblscreen = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblscreen",b4xpageshowphone._lblscreen);
 //BA.debugLineNum = 10;BA.debugLine="Private lblStorage As Label";
b4xpageshowphone._lblstorage = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblstorage",b4xpageshowphone._lblstorage);
 //BA.debugLineNum = 11;BA.debugLine="Public  lblTotal As Label		' We need this informa";
b4xpageshowphone._lbltotal = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltotal",b4xpageshowphone._lbltotal);
 //BA.debugLineNum = 12;BA.debugLine="Public  txtQuantity As TextField ' We need this i";
b4xpageshowphone._txtquantity = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtquantity",b4xpageshowphone._txtquantity);
 //BA.debugLineNum = 14;BA.debugLine="Public pgSell As B4XPageSell";
b4xpageshowphone._pgsell = RemoteObject.createNew ("b4j.example.b4xpagesell");__ref.setField("_pgsell",b4xpageshowphone._pgsell);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xpageshowphone) ","b4xpageshowphone",4,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpageshowphone","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Return Me";
Debug.ShouldStop(262144);
if (true) return __ref;
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadvalues(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loadValues (b4xpageshowphone) ","b4xpageshowphone",4,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("loadvalues")) { return __ref.runUserSub(false, "b4xpageshowphone","loadvalues", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Private Sub loadValues";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="If B4XPages.MainPage.pgPhones.intPhoneClicked = 1";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pgphones" /*RemoteObject*/ ).getField(true,"_intphoneclicked" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 41;BA.debugLine="lblCPU.Text = B4XPages.MainPage.phone1.strCPU";
Debug.ShouldStop(256);
__ref.getField(false,"_lblcpu" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone1" /*RemoteObject*/ ).getField(true,"_strcpu" /*RemoteObject*/ ));
 BA.debugLineNum = 42;BA.debugLine="lbllName.Text = B4XPages.MainPage.phone1.strNa";
Debug.ShouldStop(512);
__ref.getField(false,"_lbllname" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone1" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 43;BA.debugLine="lblMemory.Text = B4XPages.MainPage.phone1.intM";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblmemory" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone1" /*RemoteObject*/ ).getField(true,"_intmemory" /*RemoteObject*/ )));
 BA.debugLineNum = 44;BA.debugLine="lblOS.Text = B4XPages.MainPage.phone1.strOS";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblos" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone1" /*RemoteObject*/ ).getField(true,"_stros" /*RemoteObject*/ ));
 BA.debugLineNum = 45;BA.debugLine="lblRam.Text = B4XPages.MainPage.phone1.fltRAM";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblram" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone1" /*RemoteObject*/ ).getField(true,"_fltram" /*RemoteObject*/ )));
 BA.debugLineNum = 46;BA.debugLine="lblScreen.Text = B4XPages.MainPage.phone1.strScr";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblscreen" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone1" /*RemoteObject*/ ).getField(true,"_strscreensize" /*RemoteObject*/ ));
 BA.debugLineNum = 47;BA.debugLine="lblStorage.Text = B4XPages.MainPage.phone1.intAm";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblstorage" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone1" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ )));
 BA.debugLineNum = 48;BA.debugLine="lblTotal.Text = B4XPages.MainPage.phone1.fltPric";
Debug.ShouldStop(32768);
__ref.getField(false,"_lbltotal" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone1" /*RemoteObject*/ ).getField(true,"_fltprice" /*RemoteObject*/ )));
 BA.debugLineNum = 49;BA.debugLine="txtQuantity.Text = 1";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtquantity" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(1));
 }else 
{ BA.debugLineNum = 50;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pgphones" /*RemoteObject*/ ).getField(true,"_intphoneclicked" /*RemoteObject*/ ),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 51;BA.debugLine="lblCPU.Text = B4XPages.MainPage.phone2.strCPU";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblcpu" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone2" /*RemoteObject*/ ).getField(true,"_strcpu" /*RemoteObject*/ ));
 BA.debugLineNum = 52;BA.debugLine="lbllName.Text = B4XPages.MainPage.phone2.strName";
Debug.ShouldStop(524288);
__ref.getField(false,"_lbllname" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone2" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 53;BA.debugLine="lblMemory.Text = B4XPages.MainPage.phone2.intMem";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblmemory" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone2" /*RemoteObject*/ ).getField(true,"_intmemory" /*RemoteObject*/ )));
 BA.debugLineNum = 54;BA.debugLine="lblOS.Text = B4XPages.MainPage.phone2.strOS";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblos" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone2" /*RemoteObject*/ ).getField(true,"_stros" /*RemoteObject*/ ));
 BA.debugLineNum = 55;BA.debugLine="lblRam.Text = B4XPages.MainPage.phone2.fltRAM";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblram" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone2" /*RemoteObject*/ ).getField(true,"_fltram" /*RemoteObject*/ )));
 BA.debugLineNum = 56;BA.debugLine="lblScreen.Text = B4XPages.MainPage.phone2.strScr";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lblscreen" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone2" /*RemoteObject*/ ).getField(true,"_strscreensize" /*RemoteObject*/ ));
 BA.debugLineNum = 57;BA.debugLine="lblStorage.Text = B4XPages.MainPage.phone2.intAm";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblstorage" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone2" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ )));
 BA.debugLineNum = 58;BA.debugLine="lblTotal.Text = B4XPages.MainPage.phone2.fltPric";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lbltotal" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone2" /*RemoteObject*/ ).getField(true,"_fltprice" /*RemoteObject*/ )));
 BA.debugLineNum = 59;BA.debugLine="txtQuantity.Text = 1";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txtquantity" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(1));
 }else 
{ BA.debugLineNum = 60;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pgphones" /*RemoteObject*/ ).getField(true,"_intphoneclicked" /*RemoteObject*/ ),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 61;BA.debugLine="lblCPU.Text = B4XPages.MainPage.phone3.strCPU";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblcpu" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone3" /*RemoteObject*/ ).getField(true,"_strcpu" /*RemoteObject*/ ));
 BA.debugLineNum = 62;BA.debugLine="lbllName.Text = B4XPages.MainPage.phone3.strName";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lbllname" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone3" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 63;BA.debugLine="lblMemory.Text = B4XPages.MainPage.phone3.intMem";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblmemory" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone3" /*RemoteObject*/ ).getField(true,"_intmemory" /*RemoteObject*/ )));
 BA.debugLineNum = 64;BA.debugLine="lblOS.Text = B4XPages.MainPage.phone3.strOS";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblos" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone3" /*RemoteObject*/ ).getField(true,"_stros" /*RemoteObject*/ ));
 BA.debugLineNum = 65;BA.debugLine="lblRam.Text = B4XPages.MainPage.phone3.fltRAM";
Debug.ShouldStop(1);
__ref.getField(false,"_lblram" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone3" /*RemoteObject*/ ).getField(true,"_fltram" /*RemoteObject*/ )));
 BA.debugLineNum = 66;BA.debugLine="lblScreen.Text = B4XPages.MainPage.phone3.strScr";
Debug.ShouldStop(2);
__ref.getField(false,"_lblscreen" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone3" /*RemoteObject*/ ).getField(true,"_strscreensize" /*RemoteObject*/ ));
 BA.debugLineNum = 67;BA.debugLine="lblStorage.Text = B4XPages.MainPage.phone3.intAm";
Debug.ShouldStop(4);
__ref.getField(false,"_lblstorage" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone3" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ )));
 BA.debugLineNum = 68;BA.debugLine="lblTotal.Text = B4XPages.MainPage.phone3.fltPric";
Debug.ShouldStop(8);
__ref.getField(false,"_lbltotal" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone3" /*RemoteObject*/ ).getField(true,"_fltprice" /*RemoteObject*/ )));
 BA.debugLineNum = 69;BA.debugLine="txtQuantity.Text = 1";
Debug.ShouldStop(16);
__ref.getField(false,"_txtquantity" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(1));
 }else 
{ BA.debugLineNum = 70;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pgphones" /*RemoteObject*/ ).getField(true,"_intphoneclicked" /*RemoteObject*/ ),BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 71;BA.debugLine="lblCPU.Text = B4XPages.MainPage.phone4.strCPU";
Debug.ShouldStop(64);
__ref.getField(false,"_lblcpu" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone4" /*RemoteObject*/ ).getField(true,"_strcpu" /*RemoteObject*/ ));
 BA.debugLineNum = 72;BA.debugLine="lbllName.Text = B4XPages.MainPage.phone4.strName";
Debug.ShouldStop(128);
__ref.getField(false,"_lbllname" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone4" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 73;BA.debugLine="lblMemory.Text = B4XPages.MainPage.phone4.intMem";
Debug.ShouldStop(256);
__ref.getField(false,"_lblmemory" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone4" /*RemoteObject*/ ).getField(true,"_intmemory" /*RemoteObject*/ )));
 BA.debugLineNum = 74;BA.debugLine="lblOS.Text = B4XPages.MainPage.phone4.strOS";
Debug.ShouldStop(512);
__ref.getField(false,"_lblos" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone4" /*RemoteObject*/ ).getField(true,"_stros" /*RemoteObject*/ ));
 BA.debugLineNum = 75;BA.debugLine="lblRam.Text = B4XPages.MainPage.phone4.fltRAM";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblram" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone4" /*RemoteObject*/ ).getField(true,"_fltram" /*RemoteObject*/ )));
 BA.debugLineNum = 76;BA.debugLine="lblScreen.Text = B4XPages.MainPage.phone4.strScr";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblscreen" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone4" /*RemoteObject*/ ).getField(true,"_strscreensize" /*RemoteObject*/ ));
 BA.debugLineNum = 77;BA.debugLine="lblStorage.Text = B4XPages.MainPage.phone4.intAm";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblstorage" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone4" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ )));
 BA.debugLineNum = 78;BA.debugLine="lblTotal.Text = B4XPages.MainPage.phone4.fltPric";
Debug.ShouldStop(8192);
__ref.getField(false,"_lbltotal" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone4" /*RemoteObject*/ ).getField(true,"_fltprice" /*RemoteObject*/ )));
 BA.debugLineNum = 79;BA.debugLine="txtQuantity.Text = 1";
Debug.ShouldStop(16384);
__ref.getField(false,"_txtquantity" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(1));
 }else 
{ BA.debugLineNum = 80;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pgphones" /*RemoteObject*/ ).getField(true,"_intphoneclicked" /*RemoteObject*/ ),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 81;BA.debugLine="lblCPU.Text = B4XPages.MainPage.phone5.strCPU";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblcpu" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone5" /*RemoteObject*/ ).getField(true,"_strcpu" /*RemoteObject*/ ));
 BA.debugLineNum = 82;BA.debugLine="lbllName.Text = B4XPages.MainPage.phone5.strName";
Debug.ShouldStop(131072);
__ref.getField(false,"_lbllname" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone5" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 83;BA.debugLine="lblMemory.Text = B4XPages.MainPage.phone5.intMem";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblmemory" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone5" /*RemoteObject*/ ).getField(true,"_intmemory" /*RemoteObject*/ )));
 BA.debugLineNum = 84;BA.debugLine="lblOS.Text = B4XPages.MainPage.phone5.strOS";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblos" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone5" /*RemoteObject*/ ).getField(true,"_stros" /*RemoteObject*/ ));
 BA.debugLineNum = 85;BA.debugLine="lblRam.Text = B4XPages.MainPage.phone5.fltRAM";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblram" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone5" /*RemoteObject*/ ).getField(true,"_fltram" /*RemoteObject*/ )));
 BA.debugLineNum = 86;BA.debugLine="lblScreen.Text = B4XPages.MainPage.phone5.strScr";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblscreen" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone5" /*RemoteObject*/ ).getField(true,"_strscreensize" /*RemoteObject*/ ));
 BA.debugLineNum = 87;BA.debugLine="lblStorage.Text = B4XPages.MainPage.phone5.intAm";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblstorage" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone5" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ )));
 BA.debugLineNum = 88;BA.debugLine="lblTotal.Text = B4XPages.MainPage.phone5.fltPric";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lbltotal" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone5" /*RemoteObject*/ ).getField(true,"_fltprice" /*RemoteObject*/ )));
 BA.debugLineNum = 89;BA.debugLine="txtQuantity.Text = 1";
Debug.ShouldStop(16777216);
__ref.getField(false,"_txtquantity" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(1));
 }else 
{ BA.debugLineNum = 90;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pgphones" /*RemoteObject*/ ).getField(true,"_intphoneclicked" /*RemoteObject*/ ),BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 91;BA.debugLine="lblCPU.Text = B4XPages.MainPage.phone6.strCPU";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblcpu" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone6" /*RemoteObject*/ ).getField(true,"_strcpu" /*RemoteObject*/ ));
 BA.debugLineNum = 92;BA.debugLine="lbllName.Text = B4XPages.MainPage.phone6.strName";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lbllname" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone6" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 93;BA.debugLine="lblMemory.Text = B4XPages.MainPage.phone6.intMem";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblmemory" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone6" /*RemoteObject*/ ).getField(true,"_intmemory" /*RemoteObject*/ )));
 BA.debugLineNum = 94;BA.debugLine="lblOS.Text = B4XPages.MainPage.phone6.strOS";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblos" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone6" /*RemoteObject*/ ).getField(true,"_stros" /*RemoteObject*/ ));
 BA.debugLineNum = 95;BA.debugLine="lblRam.Text = B4XPages.MainPage.phone6.fltRAM";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblram" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone6" /*RemoteObject*/ ).getField(true,"_fltram" /*RemoteObject*/ )));
 BA.debugLineNum = 96;BA.debugLine="lblScreen.Text = B4XPages.MainPage.phone6.strScr";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblscreen" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone6" /*RemoteObject*/ ).getField(true,"_strscreensize" /*RemoteObject*/ ));
 BA.debugLineNum = 97;BA.debugLine="lblStorage.Text = B4XPages.MainPage.phone6.intAm";
Debug.ShouldStop(1);
__ref.getField(false,"_lblstorage" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone6" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ )));
 BA.debugLineNum = 98;BA.debugLine="lblTotal.Text = B4XPages.MainPage.phone6.fltPric";
Debug.ShouldStop(2);
__ref.getField(false,"_lbltotal" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone6" /*RemoteObject*/ ).getField(true,"_fltprice" /*RemoteObject*/ )));
 BA.debugLineNum = 99;BA.debugLine="txtQuantity.Text = 1";
Debug.ShouldStop(4);
__ref.getField(false,"_txtquantity" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(1));
 }else 
{ BA.debugLineNum = 100;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pgphones" /*RemoteObject*/ ).getField(true,"_intphoneclicked" /*RemoteObject*/ ),BA.numberCast(double.class, 7))) { 
 BA.debugLineNum = 101;BA.debugLine="lblCPU.Text = B4XPages.MainPage.phone7.strCPU";
Debug.ShouldStop(16);
__ref.getField(false,"_lblcpu" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone7" /*RemoteObject*/ ).getField(true,"_strcpu" /*RemoteObject*/ ));
 BA.debugLineNum = 102;BA.debugLine="lbllName.Text = B4XPages.MainPage.phone7.strName";
Debug.ShouldStop(32);
__ref.getField(false,"_lbllname" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone7" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 103;BA.debugLine="lblMemory.Text = B4XPages.MainPage.phone7.intMem";
Debug.ShouldStop(64);
__ref.getField(false,"_lblmemory" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone7" /*RemoteObject*/ ).getField(true,"_intmemory" /*RemoteObject*/ )));
 BA.debugLineNum = 104;BA.debugLine="lblOS.Text = B4XPages.MainPage.phone7.strOS";
Debug.ShouldStop(128);
__ref.getField(false,"_lblos" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone7" /*RemoteObject*/ ).getField(true,"_stros" /*RemoteObject*/ ));
 BA.debugLineNum = 105;BA.debugLine="lblRam.Text = B4XPages.MainPage.phone7.fltRAM";
Debug.ShouldStop(256);
__ref.getField(false,"_lblram" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone7" /*RemoteObject*/ ).getField(true,"_fltram" /*RemoteObject*/ )));
 BA.debugLineNum = 106;BA.debugLine="lblScreen.Text = B4XPages.MainPage.phone7.strScr";
Debug.ShouldStop(512);
__ref.getField(false,"_lblscreen" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone7" /*RemoteObject*/ ).getField(true,"_strscreensize" /*RemoteObject*/ ));
 BA.debugLineNum = 107;BA.debugLine="lblStorage.Text = B4XPages.MainPage.phone7.intAm";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblstorage" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone7" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ )));
 BA.debugLineNum = 108;BA.debugLine="lblTotal.Text = B4XPages.MainPage.phone7.fltPric";
Debug.ShouldStop(2048);
__ref.getField(false,"_lbltotal" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone7" /*RemoteObject*/ ).getField(true,"_fltprice" /*RemoteObject*/ )));
 BA.debugLineNum = 109;BA.debugLine="txtQuantity.Text = 1";
Debug.ShouldStop(4096);
__ref.getField(false,"_txtquantity" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(1));
 }else 
{ BA.debugLineNum = 110;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pgphones" /*RemoteObject*/ ).getField(true,"_intphoneclicked" /*RemoteObject*/ ),BA.numberCast(double.class, 8))) { 
 BA.debugLineNum = 111;BA.debugLine="lblCPU.Text = B4XPages.MainPage.phone8.strCPU";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblcpu" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone8" /*RemoteObject*/ ).getField(true,"_strcpu" /*RemoteObject*/ ));
 BA.debugLineNum = 112;BA.debugLine="lbllName.Text = B4XPages.MainPage.phone8.strName";
Debug.ShouldStop(32768);
__ref.getField(false,"_lbllname" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone8" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 113;BA.debugLine="lblMemory.Text = B4XPages.MainPage.phone8.intMem";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblmemory" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone8" /*RemoteObject*/ ).getField(true,"_intmemory" /*RemoteObject*/ )));
 BA.debugLineNum = 114;BA.debugLine="lblOS.Text = B4XPages.MainPage.phone8.strOS";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblos" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone8" /*RemoteObject*/ ).getField(true,"_stros" /*RemoteObject*/ ));
 BA.debugLineNum = 115;BA.debugLine="lblRam.Text = B4XPages.MainPage.phone8.fltRAM";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblram" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone8" /*RemoteObject*/ ).getField(true,"_fltram" /*RemoteObject*/ )));
 BA.debugLineNum = 116;BA.debugLine="lblScreen.Text = B4XPages.MainPage.phone8.strScr";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblscreen" /*RemoteObject*/ ).runMethod(true,"setText",b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone8" /*RemoteObject*/ ).getField(true,"_strscreensize" /*RemoteObject*/ ));
 BA.debugLineNum = 117;BA.debugLine="lblStorage.Text = B4XPages.MainPage.phone8.intAm";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblstorage" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone8" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ )));
 BA.debugLineNum = 118;BA.debugLine="lblTotal.Text = B4XPages.MainPage.phone8.fltPric";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lbltotal" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone8" /*RemoteObject*/ ).getField(true,"_fltprice" /*RemoteObject*/ )));
 BA.debugLineNum = 119;BA.debugLine="txtQuantity.Text = 1";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txtquantity" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(1));
 }}}}}}}}
;
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtquantity_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("txtQuantity_TextChanged (b4xpageshowphone) ","b4xpageshowphone",4,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("txtquantity_textchanged")) { return __ref.runUserSub(false, "b4xpageshowphone","txtquantity_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 136;BA.debugLine="Private Sub txtQuantity_TextChanged (Old As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="If New <> \"\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("!",_new,BA.ObjectToString(""))) { 
 BA.debugLineNum = 138;BA.debugLine="lblTotal.Text = B4XPages.MainPage.phone8.fltPric";
Debug.ShouldStop(512);
__ref.getField(false,"_lbltotal" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {b4xpageshowphone._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone8" /*RemoteObject*/ ).getField(true,"_fltprice" /*RemoteObject*/ ),BA.numberCast(double.class, _new)}, "*",0, 0)));
 }else {
 BA.debugLineNum = 140;BA.debugLine="lblTotal.Text = 0";
Debug.ShouldStop(2048);
__ref.getField(false,"_lbltotal" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 };
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}