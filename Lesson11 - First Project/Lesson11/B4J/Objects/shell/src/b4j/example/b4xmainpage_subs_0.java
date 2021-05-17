package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 24;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Root = Root1";
Debug.ShouldStop(16777216);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 26;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 27;BA.debugLine="fltTotalIncome = 0 		' First Total Income is 0";
Debug.ShouldStop(67108864);
__ref.setField ("_flttotalincome" /*RemoteObject*/ ,BA.numberCast(float.class, 0));
 BA.debugLineNum = 28;BA.debugLine="pgPhones.Initialize";
Debug.ShouldStop(134217728);
__ref.getField(false,"_pgphones" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagesphones.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 29;BA.debugLine="B4XPages.AddPage(\"pgPhones\", pgPhones)";
Debug.ShouldStop(268435456);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("pgPhones")),(Object)((__ref.getField(false,"_pgphones" /*RemoteObject*/ ))));
 BA.debugLineNum = 30;BA.debugLine="pgWarehouse.Initialize";
Debug.ShouldStop(536870912);
__ref.getField(false,"_pgwarehouse" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagewarehouse.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 31;BA.debugLine="B4XPages.AddPage(\"pgWarehouse\", pgWarehouse)";
Debug.ShouldStop(1073741824);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("pgWarehouse")),(Object)((__ref.getField(false,"_pgwarehouse" /*RemoteObject*/ ))));
 BA.debugLineNum = 32;BA.debugLine="pgRevenue.Initialize";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pgrevenue" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagerevenue.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 33;BA.debugLine="B4XPages.AddPage(\"pgRev\", pgRevenue)";
Debug.ShouldStop(1);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("pgRev")),(Object)((__ref.getField(false,"_pgrevenue" /*RemoteObject*/ ))));
 BA.debugLineNum = 35;BA.debugLine="insertItems";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_insertitems" /*RemoteObject*/ );
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
public static RemoteObject  _btnbuy_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnBuy_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("btnbuy_click")) { return __ref.runUserSub(false, "b4xmainpage","btnbuy_click", __ref);}
 BA.debugLineNum = 67;BA.debugLine="Private Sub btnBuy_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="B4XPages.ShowPage(\"pgPhones\")";
Debug.ShouldStop(8);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pgPhones")));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnrevenue_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnRevenue_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("btnrevenue_click")) { return __ref.runUserSub(false, "b4xmainpage","btnrevenue_click", __ref);}
 BA.debugLineNum = 63;BA.debugLine="Private Sub btnRevenue_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="B4XPages.ShowPage(\"pgRev\")";
Debug.ShouldStop(-2147483648);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pgRev")));
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
public static RemoteObject  _btnstorage_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnStorage_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("btnstorage_click")) { return __ref.runUserSub(false, "b4xmainpage","btnstorage_click", __ref);}
 BA.debugLineNum = 59;BA.debugLine="Private Sub btnStorage_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="B4XPages.ShowPage(\"pgWarehouse\")";
Debug.ShouldStop(134217728);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pgWarehouse")));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Public  phone1, phone2, phone3, phone4 As Phone";
b4xmainpage._phone1 = RemoteObject.createNew ("b4j.example.phone");__ref.setField("_phone1",b4xmainpage._phone1);
b4xmainpage._phone2 = RemoteObject.createNew ("b4j.example.phone");__ref.setField("_phone2",b4xmainpage._phone2);
b4xmainpage._phone3 = RemoteObject.createNew ("b4j.example.phone");__ref.setField("_phone3",b4xmainpage._phone3);
b4xmainpage._phone4 = RemoteObject.createNew ("b4j.example.phone");__ref.setField("_phone4",b4xmainpage._phone4);
 //BA.debugLineNum = 12;BA.debugLine="Public  phone5, phone6, phone7, phone8 As Phone";
b4xmainpage._phone5 = RemoteObject.createNew ("b4j.example.phone");__ref.setField("_phone5",b4xmainpage._phone5);
b4xmainpage._phone6 = RemoteObject.createNew ("b4j.example.phone");__ref.setField("_phone6",b4xmainpage._phone6);
b4xmainpage._phone7 = RemoteObject.createNew ("b4j.example.phone");__ref.setField("_phone7",b4xmainpage._phone7);
b4xmainpage._phone8 = RemoteObject.createNew ("b4j.example.phone");__ref.setField("_phone8",b4xmainpage._phone8);
 //BA.debugLineNum = 13;BA.debugLine="Public  pgPhones As B4XPagesPhones";
b4xmainpage._pgphones = RemoteObject.createNew ("b4j.example.b4xpagesphones");__ref.setField("_pgphones",b4xmainpage._pgphones);
 //BA.debugLineNum = 14;BA.debugLine="Private pgWarehouse As B4XPageWarehouse";
b4xmainpage._pgwarehouse = RemoteObject.createNew ("b4j.example.b4xpagewarehouse");__ref.setField("_pgwarehouse",b4xmainpage._pgwarehouse);
 //BA.debugLineNum = 15;BA.debugLine="Private pgRevenue As B4XPageRevenue";
b4xmainpage._pgrevenue = RemoteObject.createNew ("b4j.example.b4xpagerevenue");__ref.setField("_pgrevenue",b4xmainpage._pgrevenue);
 //BA.debugLineNum = 16;BA.debugLine="Public fltTotalIncome As Float 		'Variable to cou";
b4xmainpage._flttotalincome = RemoteObject.createImmutable(0f);__ref.setField("_flttotalincome",b4xmainpage._flttotalincome);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertitems(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("insertItems (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("insertitems")) { return __ref.runUserSub(false, "b4xmainpage","insertitems", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Private Sub insertItems";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="phone1.Initialize";
Debug.ShouldStop(128);
__ref.getField(false,"_phone1" /*RemoteObject*/ ).runClassMethod (b4j.example.phone.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 41;BA.debugLine="phone1.newPhone(\"Yallomi\", \"6.53\", 64, 4,  \"Media";
Debug.ShouldStop(256);
__ref.getField(false,"_phone1" /*RemoteObject*/ ).runClassMethod (b4j.example.phone.class, "_newphone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Yallomi")),(Object)(BA.ObjectToString("6.53")),(Object)(BA.numberCast(int.class, 64)),(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("Mediatek")),(Object)(BA.numberCast(int.class, 12)),(Object)(BA.ObjectToString("Android")),(Object)(BA.numberCast(float.class, 150)));
 BA.debugLineNum = 42;BA.debugLine="phone2.Initialize";
Debug.ShouldStop(512);
__ref.getField(false,"_phone2" /*RemoteObject*/ ).runClassMethod (b4j.example.phone.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 43;BA.debugLine="phone2.newPhone(\"Smith\", \"6.67\", 64, 4, \"Qualcomm";
Debug.ShouldStop(1024);
__ref.getField(false,"_phone2" /*RemoteObject*/ ).runClassMethod (b4j.example.phone.class, "_newphone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Smith")),(Object)(BA.ObjectToString("6.67")),(Object)(BA.numberCast(int.class, 64)),(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("Qualcomm")),(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("Android")),(Object)(BA.numberCast(float.class, 220)));
 BA.debugLineNum = 44;BA.debugLine="phone3.Initialize";
Debug.ShouldStop(2048);
__ref.getField(false,"_phone3" /*RemoteObject*/ ).runClassMethod (b4j.example.phone.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 45;BA.debugLine="phone3.newPhone(\"Taurus\", \"6.1\", 128, 4, \"Bionic\"";
Debug.ShouldStop(4096);
__ref.getField(false,"_phone3" /*RemoteObject*/ ).runClassMethod (b4j.example.phone.class, "_newphone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Taurus")),(Object)(BA.ObjectToString("6.1")),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("Bionic")),(Object)(BA.numberCast(int.class, 7)),(Object)(BA.ObjectToString("IOS")),(Object)(BA.numberCast(float.class, 780)));
 BA.debugLineNum = 46;BA.debugLine="phone4.Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_phone4" /*RemoteObject*/ ).runClassMethod (b4j.example.phone.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 47;BA.debugLine="phone4.newPhone(\"Talisman\", \"5.8\", 64, 4, \"Mediat";
Debug.ShouldStop(16384);
__ref.getField(false,"_phone4" /*RemoteObject*/ ).runClassMethod (b4j.example.phone.class, "_newphone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Talisman")),(Object)(BA.ObjectToString("5.8")),(Object)(BA.numberCast(int.class, 64)),(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("Mediatek")),(Object)(BA.numberCast(int.class, 12)),(Object)(BA.ObjectToString("Android")),(Object)(BA.numberCast(float.class, 150)));
 BA.debugLineNum = 48;BA.debugLine="phone5.Initialize";
Debug.ShouldStop(32768);
__ref.getField(false,"_phone5" /*RemoteObject*/ ).runClassMethod (b4j.example.phone.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 49;BA.debugLine="phone5.newPhone(\"Cranberry\", \"5.8\", 32, 3, \"Media";
Debug.ShouldStop(65536);
__ref.getField(false,"_phone5" /*RemoteObject*/ ).runClassMethod (b4j.example.phone.class, "_newphone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Cranberry")),(Object)(BA.ObjectToString("5.8")),(Object)(BA.numberCast(int.class, 32)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.ObjectToString("Mediatek")),(Object)(BA.numberCast(int.class, 16)),(Object)(BA.ObjectToString("Android")),(Object)(BA.numberCast(float.class, 130)));
 BA.debugLineNum = 50;BA.debugLine="phone6.Initialize";
Debug.ShouldStop(131072);
__ref.getField(false,"_phone6" /*RemoteObject*/ ).runClassMethod (b4j.example.phone.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 51;BA.debugLine="phone6.newPhone(\"OzOn\", \"5.8\", 32, 2, \"Mediatek\",";
Debug.ShouldStop(262144);
__ref.getField(false,"_phone6" /*RemoteObject*/ ).runClassMethod (b4j.example.phone.class, "_newphone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("OzOn")),(Object)(BA.ObjectToString("5.8")),(Object)(BA.numberCast(int.class, 32)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.ObjectToString("Mediatek")),(Object)(BA.numberCast(int.class, 16)),(Object)(BA.ObjectToString("Android")),(Object)(BA.numberCast(float.class, 90)));
 BA.debugLineNum = 52;BA.debugLine="phone7.Initialize";
Debug.ShouldStop(524288);
__ref.getField(false,"_phone7" /*RemoteObject*/ ).runClassMethod (b4j.example.phone.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 53;BA.debugLine="phone7.newPhone(\"H2O\", \"5.8\", 64, 3, \"Qualcomm\",";
Debug.ShouldStop(1048576);
__ref.getField(false,"_phone7" /*RemoteObject*/ ).runClassMethod (b4j.example.phone.class, "_newphone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("H2O")),(Object)(BA.ObjectToString("5.8")),(Object)(BA.numberCast(int.class, 64)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.ObjectToString("Qualcomm")),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.ObjectToString("Android")),(Object)(BA.numberCast(float.class, 170)));
 BA.debugLineNum = 54;BA.debugLine="phone8.Initialize";
Debug.ShouldStop(2097152);
__ref.getField(false,"_phone8" /*RemoteObject*/ ).runClassMethod (b4j.example.phone.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 55;BA.debugLine="phone8.newPhone(\"Zeus\", \"6.67\", 128, 6, \"Qualcomm";
Debug.ShouldStop(4194304);
__ref.getField(false,"_phone8" /*RemoteObject*/ ).runClassMethod (b4j.example.phone.class, "_newphone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Zeus")),(Object)(BA.ObjectToString("6.67")),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 6)),(Object)(BA.ObjectToString("Qualcomm")),(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("Android")),(Object)(BA.numberCast(float.class, 650)));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}