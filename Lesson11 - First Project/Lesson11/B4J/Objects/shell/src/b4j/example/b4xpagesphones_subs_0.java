package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpagesphones_subs_0 {


public static RemoteObject  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (b4xpagesphones) ","b4xpagesphones",3,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("b4xpage_appear")) { return __ref.runUserSub(false, "b4xpagesphones","b4xpage_appear", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Private Sub B4XPage_Appear";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="insertValues";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.b4xpagesphones.class, "_insertvalues" /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("B4XPage_Created (b4xpagesphones) ","b4xpagesphones",3,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpagesphones","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 31;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Root = Root1";
Debug.ShouldStop(-2147483648);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 34;BA.debugLine="Root.LoadLayout(\"frmPhones\")";
Debug.ShouldStop(2);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("frmPhones")),__ref.getField(false, "ba"));
 BA.debugLineNum = 35;BA.debugLine="pgShowPhone.Initialize";
Debug.ShouldStop(4);
__ref.getField(false,"_pgshowphone" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpageshowphone.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 36;BA.debugLine="B4XPages.AddPage(\"pgShow\", pgShowPhone)";
Debug.ShouldStop(8);
b4xpagesphones._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("pgShow")),(Object)((__ref.getField(false,"_pgshowphone" /*RemoteObject*/ ))));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
b4xpagesphones._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpagesphones._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpagesphones._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpagesphones._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private lblPhone1 As Label";
b4xpagesphones._lblphone1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblphone1",b4xpagesphones._lblphone1);
 //BA.debugLineNum = 6;BA.debugLine="Private lblPhone2 As Label";
b4xpagesphones._lblphone2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblphone2",b4xpagesphones._lblphone2);
 //BA.debugLineNum = 7;BA.debugLine="Private lblPhone3 As Label";
b4xpagesphones._lblphone3 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblphone3",b4xpagesphones._lblphone3);
 //BA.debugLineNum = 8;BA.debugLine="Private lblPhone4 As Label";
b4xpagesphones._lblphone4 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblphone4",b4xpagesphones._lblphone4);
 //BA.debugLineNum = 9;BA.debugLine="Private lblPhone5 As Label";
b4xpagesphones._lblphone5 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblphone5",b4xpagesphones._lblphone5);
 //BA.debugLineNum = 10;BA.debugLine="Private lblPhone6 As Label";
b4xpagesphones._lblphone6 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblphone6",b4xpagesphones._lblphone6);
 //BA.debugLineNum = 11;BA.debugLine="Private lblPhone7 As Label";
b4xpagesphones._lblphone7 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblphone7",b4xpagesphones._lblphone7);
 //BA.debugLineNum = 12;BA.debugLine="Private lblPhone8 As Label";
b4xpagesphones._lblphone8 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblphone8",b4xpagesphones._lblphone8);
 //BA.debugLineNum = 13;BA.debugLine="Private lblPrice1 As Label";
b4xpagesphones._lblprice1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblprice1",b4xpagesphones._lblprice1);
 //BA.debugLineNum = 14;BA.debugLine="Private lblPrice2 As Label";
b4xpagesphones._lblprice2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblprice2",b4xpagesphones._lblprice2);
 //BA.debugLineNum = 15;BA.debugLine="Private lblPrice3 As Label";
b4xpagesphones._lblprice3 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblprice3",b4xpagesphones._lblprice3);
 //BA.debugLineNum = 16;BA.debugLine="Private lblPrice4 As Label";
b4xpagesphones._lblprice4 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblprice4",b4xpagesphones._lblprice4);
 //BA.debugLineNum = 17;BA.debugLine="Private lblPrice5 As Label";
b4xpagesphones._lblprice5 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblprice5",b4xpagesphones._lblprice5);
 //BA.debugLineNum = 18;BA.debugLine="Private lblPrice6 As Label";
b4xpagesphones._lblprice6 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblprice6",b4xpagesphones._lblprice6);
 //BA.debugLineNum = 19;BA.debugLine="Private lblPrice7 As Label";
b4xpagesphones._lblprice7 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblprice7",b4xpagesphones._lblprice7);
 //BA.debugLineNum = 20;BA.debugLine="Private lblPrice8 As Label";
b4xpagesphones._lblprice8 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblprice8",b4xpagesphones._lblprice8);
 //BA.debugLineNum = 22;BA.debugLine="Public intPhoneClicked As Int";
b4xpagesphones._intphoneclicked = RemoteObject.createImmutable(0);__ref.setField("_intphoneclicked",b4xpagesphones._intphoneclicked);
 //BA.debugLineNum = 23;BA.debugLine="Public pgShowPhone As B4XPageShowPhone";
b4xpagesphones._pgshowphone = RemoteObject.createNew ("b4j.example.b4xpageshowphone");__ref.setField("_pgshowphone",b4xpagesphones._pgshowphone);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xpagesphones) ","b4xpagesphones",3,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpagesphones","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Return Me";
Debug.ShouldStop(134217728);
if (true) return __ref;
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertvalues(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("insertValues (b4xpagesphones) ","b4xpagesphones",3,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("insertvalues")) { return __ref.runUserSub(false, "b4xpagesphones","insertvalues", __ref);}
 BA.debugLineNum = 43;BA.debugLine="Private Sub insertValues";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="lblPhone1.Text = B4XPages.MainPage.phone1.strName";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblphone1" /*RemoteObject*/ ).runMethod(true,"setText",b4xpagesphones._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone1" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 45;BA.debugLine="lblPhone2.Text = B4XPages.MainPage.phone2.strName";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblphone2" /*RemoteObject*/ ).runMethod(true,"setText",b4xpagesphones._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone2" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 46;BA.debugLine="lblPhone3.Text = B4XPages.MainPage.phone3.strName";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblphone3" /*RemoteObject*/ ).runMethod(true,"setText",b4xpagesphones._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone3" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 47;BA.debugLine="lblPhone4.Text = B4XPages.MainPage.phone4.strName";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblphone4" /*RemoteObject*/ ).runMethod(true,"setText",b4xpagesphones._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone4" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 48;BA.debugLine="lblPhone5.Text = B4XPages.MainPage.phone5.strName";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblphone5" /*RemoteObject*/ ).runMethod(true,"setText",b4xpagesphones._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone5" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 49;BA.debugLine="lblPhone6.Text = B4XPages.MainPage.phone6.strName";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblphone6" /*RemoteObject*/ ).runMethod(true,"setText",b4xpagesphones._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone6" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 50;BA.debugLine="lblPhone7.Text = B4XPages.MainPage.phone7.strName";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblphone7" /*RemoteObject*/ ).runMethod(true,"setText",b4xpagesphones._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone7" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 51;BA.debugLine="lblPhone8.Text = B4XPages.MainPage.phone8.strName";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblphone8" /*RemoteObject*/ ).runMethod(true,"setText",b4xpagesphones._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone8" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 52;BA.debugLine="lblPrice1.Text = B4XPages.MainPage.phone1.fltPric";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblprice1" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(b4xpagesphones._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone1" /*RemoteObject*/ ).getField(true,"_fltprice" /*RemoteObject*/ ),RemoteObject.createImmutable(" $")));
 BA.debugLineNum = 53;BA.debugLine="lblPrice2.Text = B4XPages.MainPage.phone2.fltPric";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblprice2" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(b4xpagesphones._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone2" /*RemoteObject*/ ).getField(true,"_fltprice" /*RemoteObject*/ ),RemoteObject.createImmutable(" $")));
 BA.debugLineNum = 54;BA.debugLine="lblPrice3.Text = B4XPages.MainPage.phone3.fltPric";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblprice3" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(b4xpagesphones._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone3" /*RemoteObject*/ ).getField(true,"_fltprice" /*RemoteObject*/ ),RemoteObject.createImmutable(" $")));
 BA.debugLineNum = 55;BA.debugLine="lblPrice4.Text = B4XPages.MainPage.phone4.fltPric";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblprice4" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(b4xpagesphones._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone4" /*RemoteObject*/ ).getField(true,"_fltprice" /*RemoteObject*/ ),RemoteObject.createImmutable(" $")));
 BA.debugLineNum = 56;BA.debugLine="lblPrice5.Text = B4XPages.MainPage.phone5.fltPric";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lblprice5" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(b4xpagesphones._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone5" /*RemoteObject*/ ).getField(true,"_fltprice" /*RemoteObject*/ ),RemoteObject.createImmutable(" $")));
 BA.debugLineNum = 57;BA.debugLine="lblPrice6.Text = B4XPages.MainPage.phone6.fltPric";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblprice6" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(b4xpagesphones._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone6" /*RemoteObject*/ ).getField(true,"_fltprice" /*RemoteObject*/ ),RemoteObject.createImmutable(" $")));
 BA.debugLineNum = 58;BA.debugLine="lblPrice7.Text = B4XPages.MainPage.phone7.fltPric";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblprice7" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(b4xpagesphones._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone7" /*RemoteObject*/ ).getField(true,"_fltprice" /*RemoteObject*/ ),RemoteObject.createImmutable(" $")));
 BA.debugLineNum = 59;BA.debugLine="lblPrice8.Text = B4XPages.MainPage.phone8.fltPric";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblprice8" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(b4xpagesphones._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone8" /*RemoteObject*/ ).getField(true,"_fltprice" /*RemoteObject*/ ),RemoteObject.createImmutable(" $")));
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
public static RemoteObject  _lblphone1_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblPhone1_MouseClicked (b4xpagesphones) ","b4xpagesphones",3,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("lblphone1_mouseclicked")) { return __ref.runUserSub(false, "b4xpagesphones","lblphone1_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 62;BA.debugLine="Private Sub lblPhone1_MouseClicked (EventData As M";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="intPhoneClicked = 1";
Debug.ShouldStop(1073741824);
__ref.setField ("_intphoneclicked" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 64;BA.debugLine="B4XPages.ShowPage(\"pgShow\")";
Debug.ShouldStop(-2147483648);
b4xpagesphones._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pgShow")));
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
public static RemoteObject  _lblphone2_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblPhone2_MouseClicked (b4xpagesphones) ","b4xpagesphones",3,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("lblphone2_mouseclicked")) { return __ref.runUserSub(false, "b4xpagesphones","lblphone2_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 67;BA.debugLine="Private Sub lblPhone2_MouseClicked (EventData As M";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="intPhoneClicked = 2";
Debug.ShouldStop(8);
__ref.setField ("_intphoneclicked" /*RemoteObject*/ ,BA.numberCast(int.class, 2));
 BA.debugLineNum = 69;BA.debugLine="B4XPages.ShowPage(\"pgShow\")";
Debug.ShouldStop(16);
b4xpagesphones._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pgShow")));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblphone3_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblPhone3_MouseClicked (b4xpagesphones) ","b4xpagesphones",3,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("lblphone3_mouseclicked")) { return __ref.runUserSub(false, "b4xpagesphones","lblphone3_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 72;BA.debugLine="Private Sub lblPhone3_MouseClicked (EventData As M";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="intPhoneClicked = 3";
Debug.ShouldStop(256);
__ref.setField ("_intphoneclicked" /*RemoteObject*/ ,BA.numberCast(int.class, 3));
 BA.debugLineNum = 74;BA.debugLine="B4XPages.ShowPage(\"pgShow\")";
Debug.ShouldStop(512);
b4xpagesphones._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pgShow")));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblphone4_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblPhone4_MouseClicked (b4xpagesphones) ","b4xpagesphones",3,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("lblphone4_mouseclicked")) { return __ref.runUserSub(false, "b4xpagesphones","lblphone4_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 77;BA.debugLine="Private Sub lblPhone4_MouseClicked (EventData As M";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="intPhoneClicked = 4";
Debug.ShouldStop(8192);
__ref.setField ("_intphoneclicked" /*RemoteObject*/ ,BA.numberCast(int.class, 4));
 BA.debugLineNum = 79;BA.debugLine="B4XPages.ShowPage(\"pgShow\")";
Debug.ShouldStop(16384);
b4xpagesphones._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pgShow")));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblphone5_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblPhone5_MouseClicked (b4xpagesphones) ","b4xpagesphones",3,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("lblphone5_mouseclicked")) { return __ref.runUserSub(false, "b4xpagesphones","lblphone5_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 82;BA.debugLine="Private Sub lblPhone5_MouseClicked (EventData As M";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="intPhoneClicked = 5";
Debug.ShouldStop(262144);
__ref.setField ("_intphoneclicked" /*RemoteObject*/ ,BA.numberCast(int.class, 5));
 BA.debugLineNum = 84;BA.debugLine="B4XPages.ShowPage(\"pgShow\")";
Debug.ShouldStop(524288);
b4xpagesphones._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pgShow")));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblphone6_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblPhone6_MouseClicked (b4xpagesphones) ","b4xpagesphones",3,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("lblphone6_mouseclicked")) { return __ref.runUserSub(false, "b4xpagesphones","lblphone6_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 87;BA.debugLine="Private Sub lblPhone6_MouseClicked (EventData As M";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="intPhoneClicked = 6";
Debug.ShouldStop(8388608);
__ref.setField ("_intphoneclicked" /*RemoteObject*/ ,BA.numberCast(int.class, 6));
 BA.debugLineNum = 89;BA.debugLine="B4XPages.ShowPage(\"pgShow\")";
Debug.ShouldStop(16777216);
b4xpagesphones._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pgShow")));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblphone7_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblPhone7_MouseClicked (b4xpagesphones) ","b4xpagesphones",3,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("lblphone7_mouseclicked")) { return __ref.runUserSub(false, "b4xpagesphones","lblphone7_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 92;BA.debugLine="Private Sub lblPhone7_MouseClicked (EventData As M";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="intPhoneClicked = 7";
Debug.ShouldStop(268435456);
__ref.setField ("_intphoneclicked" /*RemoteObject*/ ,BA.numberCast(int.class, 7));
 BA.debugLineNum = 94;BA.debugLine="B4XPages.ShowPage(\"pgShow\")";
Debug.ShouldStop(536870912);
b4xpagesphones._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pgShow")));
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblphone8_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblPhone8_MouseClicked (b4xpagesphones) ","b4xpagesphones",3,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("lblphone8_mouseclicked")) { return __ref.runUserSub(false, "b4xpagesphones","lblphone8_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 97;BA.debugLine="Private Sub lblPhone8_MouseClicked (EventData As M";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="intPhoneClicked = 8";
Debug.ShouldStop(2);
__ref.setField ("_intphoneclicked" /*RemoteObject*/ ,BA.numberCast(int.class, 8));
 BA.debugLineNum = 99;BA.debugLine="B4XPages.ShowPage(\"pgShow\")";
Debug.ShouldStop(4);
b4xpagesphones._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pgShow")));
 BA.debugLineNum = 100;BA.debugLine="End Sub";
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