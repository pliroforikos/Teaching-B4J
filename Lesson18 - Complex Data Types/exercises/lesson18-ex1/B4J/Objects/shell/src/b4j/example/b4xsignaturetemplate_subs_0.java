package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xsignaturetemplate_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
b4xsignaturetemplate._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xsignaturetemplate._xui);
 //BA.debugLineNum = 3;BA.debugLine="Public mBase As B4XView";
b4xsignaturetemplate._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xsignaturetemplate._mbase);
 //BA.debugLineNum = 4;BA.debugLine="Private cvs As B4XCanvas";
b4xsignaturetemplate._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvs",b4xsignaturetemplate._cvs);
 //BA.debugLineNum = 5;BA.debugLine="Private LastX, LastY As Float";
b4xsignaturetemplate._lastx = RemoteObject.createImmutable(0f);__ref.setField("_lastx",b4xsignaturetemplate._lastx);
b4xsignaturetemplate._lasty = RemoteObject.createImmutable(0f);__ref.setField("_lasty",b4xsignaturetemplate._lasty);
 //BA.debugLineNum = 6;BA.debugLine="Public StrokeWidth As Float = 2dip";
b4xsignaturetemplate._strokewidth = BA.numberCast(float.class, b4xsignaturetemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))));__ref.setField("_strokewidth",b4xsignaturetemplate._strokewidth);
 //BA.debugLineNum = 7;BA.debugLine="Public StrokeColor As Int = xui.Color_Black";
b4xsignaturetemplate._strokecolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black");__ref.setField("_strokecolor",b4xsignaturetemplate._strokecolor);
 //BA.debugLineNum = 8;BA.debugLine="Public TextColor As Int = 0xFFFF8800";
b4xsignaturetemplate._textcolor = BA.numberCast(int.class, 0xffff8800);__ref.setField("_textcolor",b4xsignaturetemplate._textcolor);
 //BA.debugLineNum = 9;BA.debugLine="Public BackgroundColor As Int = xui.Color_White";
b4xsignaturetemplate._backgroundcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White");__ref.setField("_backgroundcolor",b4xsignaturetemplate._backgroundcolor);
 //BA.debugLineNum = 10;BA.debugLine="Public AddDateAndTime As Boolean = True";
b4xsignaturetemplate._adddateandtime = b4xsignaturetemplate.__c.getField(true,"True");__ref.setField("_adddateandtime",b4xsignaturetemplate._adddateandtime);
 //BA.debugLineNum = 11;BA.debugLine="Public TextFont As B4XFont";
b4xsignaturetemplate._textfont = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");__ref.setField("_textfont",b4xsignaturetemplate._textfont);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dialogclosed(RemoteObject __ref,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("DialogClosed (b4xsignaturetemplate) ","b4xsignaturetemplate",26,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("dialogclosed")) { return __ref.runUserSub(false, "b4xsignaturetemplate","dialogclosed", __ref, _result);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _baseline = RemoteObject.createImmutable(0);
Debug.locals.put("Result", _result);
 BA.debugLineNum = 53;BA.debugLine="Private Sub DialogClosed (Result As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="If Result = xui.DialogResponse_Positive And AddDa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive"))) && RemoteObject.solveBoolean(".",__ref.getField(true,"_adddateandtime" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 55;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(\"M\", TextFont";
Debug.JustUpdateDeviceLine();
_r = __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(BA.ObjectToString("M")),(Object)(__ref.getField(false,"_textfont" /*RemoteObject*/ )));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 56;BA.debugLine="Dim Baseline As Int = cvs.TargetRect.Bottom - r.";
Debug.JustUpdateDeviceLine();
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getBottom"),_r.runMethod(true,"getHeight"),_r.runMethod(true,"getTop"),b4xsignaturetemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "---",3, 0));Debug.locals.put("Baseline", _baseline);Debug.locals.put("Baseline", _baseline);
 BA.debugLineNum = 57;BA.debugLine="cvs.DrawText($\"$DateTime{DateTime.Now}\"$, 2dip,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawText",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),b4xsignaturetemplate.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("datetime")),(Object)((b4xsignaturetemplate.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(double.class, b4xsignaturetemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(double.class, _baseline)),(Object)(__ref.getField(false,"_textfont" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_textcolor" /*RemoteObject*/ )),(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.text.TextAlignment"),RemoteObject.createImmutable("LEFT"))));
 };
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbitmap(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBitmap (b4xsignaturetemplate) ","b4xsignaturetemplate",26,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("getbitmap")) { return __ref.runUserSub(false, "b4xsignaturetemplate","getbitmap", __ref);}
 BA.debugLineNum = 49;BA.debugLine="Public Sub getBitmap As B4XBitmap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 50;BA.debugLine="Return cvs.CreateBitmap";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"CreateBitmap");
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref,RemoteObject _dialog) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (b4xsignaturetemplate) ","b4xsignaturetemplate",26,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "b4xsignaturetemplate","getpanel", __ref, _dialog);}
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 27;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 28;BA.debugLine="Return mBase";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xsignaturetemplate) ","b4xsignaturetemplate",26,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xsignaturetemplate","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 15;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mbase" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mBase"))));
 BA.debugLineNum = 16;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 200dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, b4xsignaturetemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))),(Object)(BA.numberCast(double.class, b4xsignaturetemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200))))));
 BA.debugLineNum = 17;BA.debugLine="cvs.Initialize(mBase)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )));
 BA.debugLineNum = 18;BA.debugLine="TextFont = xui.CreateDefaultFont(14)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_textfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14))));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mbase_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("mBase_Touch (b4xsignaturetemplate) ","b4xsignaturetemplate",26,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("mbase_touch")) { return __ref.runUserSub(false, "b4xsignaturetemplate","mbase_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 36;BA.debugLine="Private Sub mBase_Touch (Action As Int, X As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="Select Action";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_action,__ref.getField(false,"_mbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_DOWN"),__ref.getField(false,"_mbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE"))) {
case 0: {
 BA.debugLineNum = 39;BA.debugLine="LastX = X";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastx" /*RemoteObject*/ ,_x);
 BA.debugLineNum = 40;BA.debugLine="LastY = Y";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lasty" /*RemoteObject*/ ,_y);
 break; }
case 1: {
 BA.debugLineNum = 42;BA.debugLine="cvs.DrawLine(LastX, LastY, X, Y, StrokeColor, S";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(__ref.getField(true,"_lastx" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_lasty" /*RemoteObject*/ )),(Object)(_x),(Object)(_y),(Object)(__ref.getField(true,"_strokecolor" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_strokewidth" /*RemoteObject*/ )));
 BA.debugLineNum = 43;BA.debugLine="LastX = X";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastx" /*RemoteObject*/ ,_x);
 BA.debugLineNum = 44;BA.debugLine="LastY = Y";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lasty" /*RemoteObject*/ ,_y);
 BA.debugLineNum = 45;BA.debugLine="cvs.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 break; }
}
;
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Resize (b4xsignaturetemplate) ","b4xsignaturetemplate",26,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("resize")) { return __ref.runUserSub(false, "b4xsignaturetemplate","resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 21;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 22;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height)));
 BA.debugLineNum = 23;BA.debugLine="cvs.Resize(Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Resize",(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height)));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _dialog) throws Exception{
try {
		Debug.PushSubsStack("Show (b4xsignaturetemplate) ","b4xsignaturetemplate",26,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "b4xsignaturetemplate","show", __ref, _dialog);}
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 31;BA.debugLine="Private Sub Show (Dialog As B4XDialog) 'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="cvs.DrawRect(cvs.TargetRect, BackgroundColor, Tru";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")),(Object)(__ref.getField(true,"_backgroundcolor" /*RemoteObject*/ )),(Object)(b4xsignaturetemplate.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 33;BA.debugLine="cvs.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}