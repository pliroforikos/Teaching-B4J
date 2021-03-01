package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpagetotal_subs_0 {


public static RemoteObject  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (b4xpagetotal) ","b4xpagetotal",2,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("b4xpage_appear")) { return __ref.runUserSub(false, "b4xpagetotal","b4xpage_appear", __ref);}
RemoteObject _total = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Appear";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Private total As Float";
Debug.ShouldStop(1048576);
_total = RemoteObject.createImmutable(0f);Debug.locals.put("total", _total);
 BA.debugLineNum = 22;BA.debugLine="total =  B4XPages.MainPage.txtPC1.text * B4XPages";
Debug.ShouldStop(2097152);
_total = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, b4xpagetotal._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_txtpc1" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, b4xpagetotal._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_lblpc1" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, b4xpagetotal._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_txtpc2" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, b4xpagetotal._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_lblpc2" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, b4xpagetotal._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_txtpc3" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, b4xpagetotal._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_lblpc3" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, b4xpagetotal._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_txtpc4" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, b4xpagetotal._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_lblpc4" /*RemoteObject*/ ).runMethod(true,"getText"))}, "*+*+*+*",3, 0));Debug.locals.put("total", _total);
 BA.debugLineNum = 24;BA.debugLine="lblQuantity.Text = B4XPages.MainPage.txtPC1.text";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lblquantity" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, b4xpagetotal._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_txtpc1" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, b4xpagetotal._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_txtpc2" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, b4xpagetotal._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_txtpc3" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, b4xpagetotal._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_txtpc4" /*RemoteObject*/ ).runMethod(true,"getText"))}, "+++",3, 0)));
 BA.debugLineNum = 26;BA.debugLine="lblTotal.Text = total";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lbltotal" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_total));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("B4XPage_Created (b4xpagetotal) ","b4xpagetotal",2,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpagetotal","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 14;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Root = Root1";
Debug.ShouldStop(16384);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 17;BA.debugLine="Root.LoadLayout(\"frmTotal\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("frmTotal")),__ref.getField(false, "ba"));
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
b4xpagetotal._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpagetotal._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpagetotal._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpagetotal._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private lblQuantity As Label";
b4xpagetotal._lblquantity = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblquantity",b4xpagetotal._lblquantity);
 //BA.debugLineNum = 5;BA.debugLine="Private lblTotal As Label";
b4xpagetotal._lbltotal = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltotal",b4xpagetotal._lbltotal);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xpagetotal) ","b4xpagetotal",2,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpagetotal","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="Return Me";
Debug.ShouldStop(512);
if (true) return __ref;
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}