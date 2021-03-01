package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 27;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Root = Root1";
Debug.ShouldStop(134217728);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 29;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 30;BA.debugLine="txtAverage.Text = 0";
Debug.ShouldStop(536870912);
__ref.getField(false,"_txtaverage" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 31;BA.debugLine="txtChem.Text = 0";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtchem" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 32;BA.debugLine="txtGymn.Text = 0";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtgymn" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 33;BA.debugLine="txtIT.Text = 0";
Debug.ShouldStop(1);
__ref.getField(false,"_txtit" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 34;BA.debugLine="txtLiterature.text = 0";
Debug.ShouldStop(2);
__ref.getField(false,"_txtliterature" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 35;BA.debugLine="txtMaths.Text = 0";
Debug.ShouldStop(4);
__ref.getField(false,"_txtmaths" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 36;BA.debugLine="txtMusic.Text = 0";
Debug.ShouldStop(8);
__ref.getField(false,"_txtmusic" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 37;BA.debugLine="txtPhil.Text = 0";
Debug.ShouldStop(16);
__ref.getField(false,"_txtphil" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 38;BA.debugLine="txtPhysics.Text = 0";
Debug.ShouldStop(32);
__ref.getField(false,"_txtphysics" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncalculate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCalculate_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("btncalculate_click")) { return __ref.runUserSub(false, "b4xmainpage","btncalculate_click", __ref);}
 BA.debugLineNum = 42;BA.debugLine="Private Sub btnCalculate_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="If (txtChem.Text >= 0 And txtChem.Text <= 100 ) T";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_txtchem" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtchem" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 100)))) { 
 BA.debugLineNum = 44;BA.debugLine="If ( txtGymn.Text >= 0 And txtGymn.Text <=100 )";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_txtgymn" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtgymn" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 100)))) { 
 BA.debugLineNum = 45;BA.debugLine="If ( txtIT.text >= 0 And txtIT.Text <= 100 ) Th";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_txtit" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtit" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 100)))) { 
 BA.debugLineNum = 46;BA.debugLine="If ( txtLiterature.text >= 0 And txtLiterature";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_txtliterature" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtliterature" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 100)))) { 
 BA.debugLineNum = 47;BA.debugLine="If (txtMaths.text >= 0 And txtMaths.text <= 1";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_txtmaths" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtmaths" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 100)))) { 
 BA.debugLineNum = 48;BA.debugLine="If (txtMusic.text >= 0 And txtMusic.Text <=";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_txtmusic" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtmusic" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 100)))) { 
 BA.debugLineNum = 49;BA.debugLine="If  (txtPhil.text >= 0 And txtPhil.text <=";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_txtphil" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtphil" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 100)))) { 
 BA.debugLineNum = 50;BA.debugLine="If (txtPhysics.text >= 0 And txtPhysics.Te";
Debug.ShouldStop(131072);
if ((RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_txtphysics" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtphysics" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 100)))) { 
 BA.debugLineNum = 51;BA.debugLine="txtAverage.Text = (txtChem.Text + txtGymn";
Debug.ShouldStop(262144);
__ref.getField(false,"_txtaverage" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtchem" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, __ref.getField(false,"_txtgymn" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, __ref.getField(false,"_txtit" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, __ref.getField(false,"_txtliterature" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, __ref.getField(false,"_txtmaths" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, __ref.getField(false,"_txtmusic" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, __ref.getField(false,"_txtphil" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, __ref.getField(false,"_txtphysics" /*RemoteObject*/ ).runMethod(true,"getText"))}, "+++++++",7, 0)),RemoteObject.createImmutable(8)}, "/",0, 0)));
 }else {
 BA.debugLineNum = 54;BA.debugLine="xui.MsgboxAsync(\"Physics should be betwee";
Debug.ShouldStop(2097152);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Physics should be between 0 and 100")),(Object)(RemoteObject.createImmutable("")));
 };
 }else {
 BA.debugLineNum = 57;BA.debugLine="xui.MsgboxAsync(\"Philosophy should be betw";
Debug.ShouldStop(16777216);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Philosophy should be between 0 and 100")),(Object)(RemoteObject.createImmutable("")));
 };
 }else {
 BA.debugLineNum = 60;BA.debugLine="xui.MsgboxAsync(\"Music should be between 0";
Debug.ShouldStop(134217728);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Music should be between 0 and 100")),(Object)(RemoteObject.createImmutable("")));
 };
 }else {
 BA.debugLineNum = 63;BA.debugLine="xui.MsgboxAsync(\"Maths should be between 0 a";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Maths should be between 0 and 100")),(Object)(RemoteObject.createImmutable("")));
 };
 }else {
 BA.debugLineNum = 66;BA.debugLine="xui.MsgboxAsync(\"Lterature should be between";
Debug.ShouldStop(2);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Lterature should be between 0 and 100")),(Object)(RemoteObject.createImmutable("")));
 };
 }else {
 BA.debugLineNum = 69;BA.debugLine="xui.MsgboxAsync(\"IT should be between 0 and 10";
Debug.ShouldStop(16);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("IT should be between 0 and 100")),(Object)(RemoteObject.createImmutable("")));
 };
 }else {
 BA.debugLineNum = 72;BA.debugLine="xui.MsgboxAsync(\"Gymnastics should be between 0";
Debug.ShouldStop(128);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Gymnastics should be between 0 and 100")),(Object)(RemoteObject.createImmutable("")));
 };
 }else {
 BA.debugLineNum = 75;BA.debugLine="xui.MsgboxAsync(\"Chemistry should be between 0 a";
Debug.ShouldStop(1024);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Chemistry should be between 0 and 100")),(Object)(RemoteObject.createImmutable("")));
 };
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
 //BA.debugLineNum = 11;BA.debugLine="Private txtAverage As TextField";
b4xmainpage._txtaverage = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtaverage",b4xmainpage._txtaverage);
 //BA.debugLineNum = 12;BA.debugLine="Private txtChem As TextField";
b4xmainpage._txtchem = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtchem",b4xmainpage._txtchem);
 //BA.debugLineNum = 13;BA.debugLine="Private txtGymn As TextField";
b4xmainpage._txtgymn = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtgymn",b4xmainpage._txtgymn);
 //BA.debugLineNum = 14;BA.debugLine="Private txtIT As TextField";
b4xmainpage._txtit = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtit",b4xmainpage._txtit);
 //BA.debugLineNum = 15;BA.debugLine="Private txtLiterature As TextField";
b4xmainpage._txtliterature = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtliterature",b4xmainpage._txtliterature);
 //BA.debugLineNum = 16;BA.debugLine="Private txtMaths As TextField";
b4xmainpage._txtmaths = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtmaths",b4xmainpage._txtmaths);
 //BA.debugLineNum = 17;BA.debugLine="Private txtMusic As TextField";
b4xmainpage._txtmusic = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtmusic",b4xmainpage._txtmusic);
 //BA.debugLineNum = 18;BA.debugLine="Private txtPhil As TextField";
b4xmainpage._txtphil = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtphil",b4xmainpage._txtphil);
 //BA.debugLineNum = 19;BA.debugLine="Private txtPhysics As TextField";
b4xmainpage._txtphysics = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtphysics",b4xmainpage._txtphysics);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(2097152);
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
}