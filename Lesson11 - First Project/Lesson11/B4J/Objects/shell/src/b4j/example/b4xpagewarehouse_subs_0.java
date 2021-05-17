package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpagewarehouse_subs_0 {


public static RemoteObject  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (b4xpagewarehouse) ","b4xpagewarehouse",6,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("b4xpage_appear")) { return __ref.runUserSub(false, "b4xpagewarehouse","b4xpage_appear", __ref);}
 BA.debugLineNum = 34;BA.debugLine="Private Sub B4XPage_Appear";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="loadData";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.b4xpagewarehouse.class, "_loaddata" /*RemoteObject*/ );
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
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xpagewarehouse) ","b4xpagewarehouse",6,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpagewarehouse","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 28;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Root = Root1";
Debug.ShouldStop(268435456);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 31;BA.debugLine="Root.LoadLayout(\"frmWarehouse\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("frmWarehouse")),__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
b4xpagewarehouse._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpagewarehouse._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpagewarehouse._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpagewarehouse._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private lblPhone1 As Label";
b4xpagewarehouse._lblphone1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblphone1",b4xpagewarehouse._lblphone1);
 //BA.debugLineNum = 5;BA.debugLine="Private lblPhone2 As Label";
b4xpagewarehouse._lblphone2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblphone2",b4xpagewarehouse._lblphone2);
 //BA.debugLineNum = 6;BA.debugLine="Private lblPhone3 As Label";
b4xpagewarehouse._lblphone3 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblphone3",b4xpagewarehouse._lblphone3);
 //BA.debugLineNum = 7;BA.debugLine="Private lblPhone4 As Label";
b4xpagewarehouse._lblphone4 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblphone4",b4xpagewarehouse._lblphone4);
 //BA.debugLineNum = 8;BA.debugLine="Private lblPhone5 As Label";
b4xpagewarehouse._lblphone5 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblphone5",b4xpagewarehouse._lblphone5);
 //BA.debugLineNum = 9;BA.debugLine="Private lblPhone6 As Label";
b4xpagewarehouse._lblphone6 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblphone6",b4xpagewarehouse._lblphone6);
 //BA.debugLineNum = 10;BA.debugLine="Private lblPhone7 As Label";
b4xpagewarehouse._lblphone7 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblphone7",b4xpagewarehouse._lblphone7);
 //BA.debugLineNum = 11;BA.debugLine="Private lblPhone8 As Label";
b4xpagewarehouse._lblphone8 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblphone8",b4xpagewarehouse._lblphone8);
 //BA.debugLineNum = 12;BA.debugLine="Private lblQ1 As Label";
b4xpagewarehouse._lblq1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblq1",b4xpagewarehouse._lblq1);
 //BA.debugLineNum = 13;BA.debugLine="Private lblQ2 As Label";
b4xpagewarehouse._lblq2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblq2",b4xpagewarehouse._lblq2);
 //BA.debugLineNum = 14;BA.debugLine="Private lblQ3 As Label";
b4xpagewarehouse._lblq3 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblq3",b4xpagewarehouse._lblq3);
 //BA.debugLineNum = 15;BA.debugLine="Private lblQ4 As Label";
b4xpagewarehouse._lblq4 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblq4",b4xpagewarehouse._lblq4);
 //BA.debugLineNum = 16;BA.debugLine="Private lblQ5 As Label";
b4xpagewarehouse._lblq5 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblq5",b4xpagewarehouse._lblq5);
 //BA.debugLineNum = 17;BA.debugLine="Private lblQ6 As Label";
b4xpagewarehouse._lblq6 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblq6",b4xpagewarehouse._lblq6);
 //BA.debugLineNum = 18;BA.debugLine="Private lblQ7 As Label";
b4xpagewarehouse._lblq7 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblq7",b4xpagewarehouse._lblq7);
 //BA.debugLineNum = 19;BA.debugLine="Private lblQ8 As Label";
b4xpagewarehouse._lblq8 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblq8",b4xpagewarehouse._lblq8);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xpagewarehouse) ","b4xpagewarehouse",6,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpagewarehouse","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Return Me";
Debug.ShouldStop(8388608);
if (true) return __ref;
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loaddata(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loadData (b4xpagewarehouse) ","b4xpagewarehouse",6,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("loaddata")) { return __ref.runUserSub(false, "b4xpagewarehouse","loaddata", __ref);}
 BA.debugLineNum = 38;BA.debugLine="Private Sub loadData";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="lblPhone1.Text = B4XPages.MainPage.phone1.strName";
Debug.ShouldStop(64);
__ref.getField(false,"_lblphone1" /*RemoteObject*/ ).runMethod(true,"setText",b4xpagewarehouse._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone1" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 40;BA.debugLine="lblPhone2.Text = B4XPages.MainPage.phone2.strName";
Debug.ShouldStop(128);
__ref.getField(false,"_lblphone2" /*RemoteObject*/ ).runMethod(true,"setText",b4xpagewarehouse._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone2" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 41;BA.debugLine="lblPhone3.Text = B4XPages.MainPage.phone3.strName";
Debug.ShouldStop(256);
__ref.getField(false,"_lblphone3" /*RemoteObject*/ ).runMethod(true,"setText",b4xpagewarehouse._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone3" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 42;BA.debugLine="lblPhone4.Text = B4XPages.MainPage.phone4.strName";
Debug.ShouldStop(512);
__ref.getField(false,"_lblphone4" /*RemoteObject*/ ).runMethod(true,"setText",b4xpagewarehouse._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone4" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 43;BA.debugLine="lblPhone5.Text = B4XPages.MainPage.phone5.strName";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblphone5" /*RemoteObject*/ ).runMethod(true,"setText",b4xpagewarehouse._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone5" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 44;BA.debugLine="lblPhone6.Text = B4XPages.MainPage.phone6.strName";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblphone6" /*RemoteObject*/ ).runMethod(true,"setText",b4xpagewarehouse._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone6" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 45;BA.debugLine="lblPhone7.Text = B4XPages.MainPage.phone7.strName";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblphone7" /*RemoteObject*/ ).runMethod(true,"setText",b4xpagewarehouse._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone7" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 46;BA.debugLine="lblPhone8.Text = B4XPages.MainPage.phone8.strName";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblphone8" /*RemoteObject*/ ).runMethod(true,"setText",b4xpagewarehouse._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone8" /*RemoteObject*/ ).getField(true,"_strname" /*RemoteObject*/ ));
 BA.debugLineNum = 47;BA.debugLine="lblQ1.Text = B4XPages.MainPage.phone1.intAmount";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblq1" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpagewarehouse._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone1" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ )));
 BA.debugLineNum = 48;BA.debugLine="lblQ2.Text = B4XPages.MainPage.phone2.intAmount";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblq2" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpagewarehouse._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone2" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ )));
 BA.debugLineNum = 49;BA.debugLine="lblQ3.Text = B4XPages.MainPage.phone3.intAmount";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblq3" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpagewarehouse._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone3" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ )));
 BA.debugLineNum = 50;BA.debugLine="lblQ4.Text = B4XPages.MainPage.phone4.intAmount";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblq4" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpagewarehouse._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone4" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ )));
 BA.debugLineNum = 51;BA.debugLine="lblQ5.Text = B4XPages.MainPage.phone5.intAmount";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblq5" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpagewarehouse._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone5" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ )));
 BA.debugLineNum = 52;BA.debugLine="lblQ6.Text = B4XPages.MainPage.phone6.intAmount";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblq6" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpagewarehouse._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone6" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ )));
 BA.debugLineNum = 53;BA.debugLine="lblQ7.Text = B4XPages.MainPage.phone7.intAmount";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblq7" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpagewarehouse._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone7" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ )));
 BA.debugLineNum = 54;BA.debugLine="lblQ8.Text = B4XPages.MainPage.phone8.intAmount";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblq8" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(b4xpagewarehouse._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_phone8" /*RemoteObject*/ ).getField(true,"_intamount" /*RemoteObject*/ )));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}