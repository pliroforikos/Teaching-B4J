package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpagesell_subs_0 {


public static RemoteObject  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (b4xpagesell) ","b4xpagesell",5,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("b4xpage_appear")) { return __ref.runUserSub(false, "b4xpagesell","b4xpage_appear", __ref);}
 BA.debugLineNum = 27;BA.debugLine="Private Sub B4XPage_Appear";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="loadValues";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.b4xpagesell.class, "_loadvalues" /*RemoteObject*/ );
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
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xpagesell) ","b4xpagesell",5,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpagesell","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Root = Root1";
Debug.ShouldStop(1048576);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 23;BA.debugLine="Root.LoadLayout(\"frmSell\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("frmSell")),__ref.getField(false, "ba"));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("btnBack_Click (b4xpagesell) ","b4xpagesell",5,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("btnback_click")) { return __ref.runUserSub(false, "b4xpagesell","btnback_click", __ref);}
 BA.debugLineNum = 63;BA.debugLine="Private Sub btnBack_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(-2147483648);
b4xpagesell._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,(Object)(__ref));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("btnSell_Click (b4xpagesell) ","b4xpagesell",5,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("btnsell_click")) { return __ref.runUserSub(false, "b4xpagesell","btnsell_click", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Private Sub btnSell_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="If B4XPages.MainPage.pgPhones.intPhoneClicked = 1";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pgphones" /*RemoteObject*/ ).getField(true,"_intphoneclicked" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 41;BA.debugLine="B4XPages.MainPage.phone1.intAmount = B4XPages.Ma";
Debug.ShouldStop(256);
b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone1" /*RemoteObject*/ ).setField ("_intamount" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone1" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_lblquantity" /*RemoteObject*/ ).runMethod(true,"getText"))}, "-",1, 0)));
 }else 
{ BA.debugLineNum = 42;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pgphones" /*RemoteObject*/ ).getField(true,"_intphoneclicked" /*RemoteObject*/ ),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 43;BA.debugLine="B4XPages.MainPage.phone2.intAmount = B4XPages.Ma";
Debug.ShouldStop(1024);
b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone2" /*RemoteObject*/ ).setField ("_intamount" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone2" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_lblquantity" /*RemoteObject*/ ).runMethod(true,"getText"))}, "-",1, 0)));
 }else 
{ BA.debugLineNum = 44;BA.debugLine="else If B4XPages.MainPage.pgPhones.intPhoneClicke";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pgphones" /*RemoteObject*/ ).getField(true,"_intphoneclicked" /*RemoteObject*/ ),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 45;BA.debugLine="B4XPages.MainPage.phone3.intAmount = B4XPages.Ma";
Debug.ShouldStop(4096);
b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone3" /*RemoteObject*/ ).setField ("_intamount" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone3" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_lblquantity" /*RemoteObject*/ ).runMethod(true,"getText"))}, "-",1, 0)));
 }else 
{ BA.debugLineNum = 46;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pgphones" /*RemoteObject*/ ).getField(true,"_intphoneclicked" /*RemoteObject*/ ),BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 47;BA.debugLine="B4XPages.MainPage.phone4.intAmount = B4XPages.Ma";
Debug.ShouldStop(16384);
b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone4" /*RemoteObject*/ ).setField ("_intamount" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone4" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_lblquantity" /*RemoteObject*/ ).runMethod(true,"getText"))}, "-",1, 0)));
 }else 
{ BA.debugLineNum = 48;BA.debugLine="else If B4XPages.MainPage.pgPhones.intPhoneClicke";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pgphones" /*RemoteObject*/ ).getField(true,"_intphoneclicked" /*RemoteObject*/ ),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 49;BA.debugLine="B4XPages.MainPage.phone5.intAmount = B4XPages.Ma";
Debug.ShouldStop(65536);
b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone5" /*RemoteObject*/ ).setField ("_intamount" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone5" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_lblquantity" /*RemoteObject*/ ).runMethod(true,"getText"))}, "-",1, 0)));
 }else 
{ BA.debugLineNum = 50;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pgphones" /*RemoteObject*/ ).getField(true,"_intphoneclicked" /*RemoteObject*/ ),BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 51;BA.debugLine="B4XPages.MainPage.phone6.intAmount = B4XPages.Ma";
Debug.ShouldStop(262144);
b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone6" /*RemoteObject*/ ).setField ("_intamount" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone6" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_lblquantity" /*RemoteObject*/ ).runMethod(true,"getText"))}, "-",1, 0)));
 }else 
{ BA.debugLineNum = 52;BA.debugLine="else If B4XPages.MainPage.pgPhones.intPhoneClicke";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pgphones" /*RemoteObject*/ ).getField(true,"_intphoneclicked" /*RemoteObject*/ ),BA.numberCast(double.class, 7))) { 
 BA.debugLineNum = 53;BA.debugLine="B4XPages.MainPage.phone7.intAmount = B4XPages.Ma";
Debug.ShouldStop(1048576);
b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone7" /*RemoteObject*/ ).setField ("_intamount" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone7" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_lblquantity" /*RemoteObject*/ ).runMethod(true,"getText"))}, "-",1, 0)));
 }else 
{ BA.debugLineNum = 54;BA.debugLine="else if B4XPages.MainPage.pgPhones.intPhoneClicke";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pgphones" /*RemoteObject*/ ).getField(true,"_intphoneclicked" /*RemoteObject*/ ),BA.numberCast(double.class, 8))) { 
 BA.debugLineNum = 55;BA.debugLine="B4XPages.MainPage.phone8.intAmount = B4XPages.Ma";
Debug.ShouldStop(4194304);
b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone8" /*RemoteObject*/ ).setField ("_intamount" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone8" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_lblquantity" /*RemoteObject*/ ).runMethod(true,"getText"))}, "-",1, 0)));
 }}}}}}}}
;
 BA.debugLineNum = 58;BA.debugLine="B4XPages.MainPage.fltTotalIncome = B4XPages.MainP";
Debug.ShouldStop(33554432);
b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).setField ("_flttotalincome" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(true,"_flttotalincome" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_lbltotal" /*RemoteObject*/ ).runMethod(true,"getText"))}, "+",1, 0)));
 BA.debugLineNum = 59;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"MainPage";
Debug.ShouldStop(67108864);
b4xpagesell._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("MainPage")));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
b4xpagesell._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpagesell._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpagesell._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpagesell._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private lbllName As Label";
b4xpagesell._lbllname = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbllname",b4xpagesell._lbllname);
 //BA.debugLineNum = 5;BA.debugLine="Private lblQuantity As Label";
b4xpagesell._lblquantity = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblquantity",b4xpagesell._lblquantity);
 //BA.debugLineNum = 6;BA.debugLine="Private lblTotal As Label";
b4xpagesell._lbltotal = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltotal",b4xpagesell._lbltotal);
 //BA.debugLineNum = 7;BA.debugLine="Private txtAddress As TextField";
b4xpagesell._txtaddress = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtaddress",b4xpagesell._txtaddress);
 //BA.debugLineNum = 8;BA.debugLine="Private txtName As TextField";
b4xpagesell._txtname = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtname",b4xpagesell._txtname);
 //BA.debugLineNum = 9;BA.debugLine="Private txtSurname As TextField";
b4xpagesell._txtsurname = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtsurname",b4xpagesell._txtsurname);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xpagesell) ","b4xpagesell",5,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpagesell","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Return Me";
Debug.ShouldStop(16384);
if (true) return __ref;
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("loadValues (b4xpagesell) ","b4xpagesell",5,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("loadvalues")) { return __ref.runUserSub(false, "b4xpagesell","loadvalues", __ref);}
 BA.debugLineNum = 32;BA.debugLine="Private Sub loadValues";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="lbllName.Text = B4XPages.MainPage.pgPhones.pgShow";
Debug.ShouldStop(1);
__ref.getField(false,"_lbllname" /*RemoteObject*/ ).runMethod(true,"setText",b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pgphones" /*RemoteObject*/ ).getField(false,"_pgshowphone" /*RemoteObject*/ ).getField(false,"_lbllname" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 34;BA.debugLine="lblQuantity.Text = B4XPages.MainPage.pgPhones.pgS";
Debug.ShouldStop(2);
__ref.getField(false,"_lblquantity" /*RemoteObject*/ ).runMethod(true,"setText",b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pgphones" /*RemoteObject*/ ).getField(false,"_pgshowphone" /*RemoteObject*/ ).getField(false,"_txtquantity" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 35;BA.debugLine="lblTotal.Text = B4XPages.MainPage.pgPhones.pgShow";
Debug.ShouldStop(4);
__ref.getField(false,"_lbltotal" /*RemoteObject*/ ).runMethod(true,"setText",b4xpagesell._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pgphones" /*RemoteObject*/ ).getField(false,"_pgshowphone" /*RemoteObject*/ ).getField(false,"_lbltotal" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}