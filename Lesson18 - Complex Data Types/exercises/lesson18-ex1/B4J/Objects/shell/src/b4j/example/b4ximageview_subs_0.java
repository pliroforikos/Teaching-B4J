package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4ximageview_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4ximageview) ","b4ximageview",18,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "b4ximageview","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 41;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 42;BA.debugLine="Update";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4ximageview.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private mEventName As String 'ignore";
b4ximageview._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4ximageview._meventname);
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object 'ignore";
b4ximageview._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",b4ximageview._mcallback);
 //BA.debugLineNum = 9;BA.debugLine="Public mBase As B4XView";
b4ximageview._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4ximageview._mbase);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI 'ignore";
b4ximageview._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4ximageview._xui);
 //BA.debugLineNum = 11;BA.debugLine="Public Tag As Object";
b4ximageview._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",b4ximageview._tag);
 //BA.debugLineNum = 12;BA.debugLine="Private iv As B4XView";
b4ximageview._iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_iv",b4ximageview._iv);
 //BA.debugLineNum = 13;BA.debugLine="Private mResizeMode As String";
b4ximageview._mresizemode = RemoteObject.createImmutable("");__ref.setField("_mresizemode",b4ximageview._mresizemode);
 //BA.debugLineNum = 14;BA.debugLine="Private mRound As Boolean";
b4ximageview._mround = RemoteObject.createImmutable(false);__ref.setField("_mround",b4ximageview._mround);
 //BA.debugLineNum = 15;BA.debugLine="Private mBitmap As B4XBitmap";
b4ximageview._mbitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");__ref.setField("_mbitmap",b4ximageview._mbitmap);
 //BA.debugLineNum = 16;BA.debugLine="Public mBackgroundColor As Int";
b4ximageview._mbackgroundcolor = RemoteObject.createImmutable(0);__ref.setField("_mbackgroundcolor",b4ximageview._mbackgroundcolor);
 //BA.debugLineNum = 17;BA.debugLine="Private mCornersRadius As Int";
b4ximageview._mcornersradius = RemoteObject.createImmutable(0);__ref.setField("_mcornersradius",b4ximageview._mcornersradius);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (b4ximageview) ","b4ximageview",18,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "b4ximageview","clear", __ref);}
 BA.debugLineNum = 120;BA.debugLine="Public Sub Clear";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 121;BA.debugLine="mBitmap = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbitmap" /*RemoteObject*/ ).setObject (b4ximageview.__c.getField(false,"Null"));
 BA.debugLineNum = 122;BA.debugLine="iv.SetBitmap(Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_iv" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((b4ximageview.__c.getField(false,"Null"))));
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (b4ximageview) ","b4ximageview",18,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "b4ximageview","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _iiv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 26;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 28;BA.debugLine="Tag = mBase.Tag";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 29;BA.debugLine="mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 30;BA.debugLine="Dim iiv As ImageView";
Debug.JustUpdateDeviceLine();
_iiv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("iiv", _iiv);
 BA.debugLineNum = 31;BA.debugLine="iiv.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_iiv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 32;BA.debugLine="iv = iiv";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_iv" /*RemoteObject*/ ).setObject (_iiv.getObject());
 BA.debugLineNum = 33;BA.debugLine="mRound =Props.Get(\"Round\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mround" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Round"))))));
 BA.debugLineNum = 34;BA.debugLine="mResizeMode = Props.Get(\"ResizeMode\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mresizemode" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ResizeMode"))))));
 BA.debugLineNum = 35;BA.debugLine="mBackgroundColor = xui.PaintOrColorToColor(Props.";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mbackgroundcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BackgroundColor")))))));
 BA.debugLineNum = 36;BA.debugLine="mCornersRadius = DipToCurrent(Props.GetDefault(\"C";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcornersradius" /*RemoteObject*/ ,b4ximageview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("CornersRadius"))),(Object)(RemoteObject.createImmutable((0))))))));
 BA.debugLineNum = 37;BA.debugLine="mBase.AddView(iv, 0, 0, mBase.Width, mBase.Height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_iv" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 38;BA.debugLine="Update";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4ximageview.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 39;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("getBitmap (b4ximageview) ","b4ximageview",18,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("getbitmap")) { return __ref.runUserSub(false, "b4ximageview","getbitmap", __ref);}
 BA.debugLineNum = 131;BA.debugLine="Public Sub getBitmap As B4XBitmap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 132;BA.debugLine="Return mBitmap";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbitmap" /*RemoteObject*/ );
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcornersradius(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCornersRadius (b4ximageview) ","b4ximageview",18,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("getcornersradius")) { return __ref.runUserSub(false, "b4ximageview","getcornersradius", __ref);}
 BA.debugLineNum = 57;BA.debugLine="Public Sub getCornersRadius As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="Return mCornersRadius";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mcornersradius" /*RemoteObject*/ );
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getresizemode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getResizeMode (b4ximageview) ","b4ximageview",18,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("getresizemode")) { return __ref.runUserSub(false, "b4ximageview","getresizemode", __ref);}
 BA.debugLineNum = 68;BA.debugLine="Public Sub getResizeMode As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 69;BA.debugLine="Return mResizeMode";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mresizemode" /*RemoteObject*/ );
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getroundedimage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getRoundedImage (b4ximageview) ","b4ximageview",18,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("getroundedimage")) { return __ref.runUserSub(false, "b4ximageview","getroundedimage", __ref);}
 BA.debugLineNum = 46;BA.debugLine="Public Sub getRoundedImage As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 47;BA.debugLine="Return mRound";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mround" /*RemoteObject*/ );
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4ximageview) ","b4ximageview",18,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4ximageview","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 21;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 22;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("Load (b4ximageview) ","b4ximageview",18,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("load")) { return __ref.runUserSub(false, "b4ximageview","load", __ref, _dir, _filename);}
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 111;BA.debugLine="Public Sub Load (Dir As String, FileName As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="setBitmap(xui.LoadBitmap(Dir, FileName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4ximageview.class, "_setbitmap" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmap",(Object)(_dir),(Object)(_filename))));
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbitmap(RemoteObject __ref,RemoteObject _bmp) throws Exception{
try {
		Debug.PushSubsStack("setBitmap (b4ximageview) ","b4ximageview",18,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("setbitmap")) { return __ref.runUserSub(false, "b4ximageview","setbitmap", __ref, _bmp);}
Debug.locals.put("Bmp", _bmp);
 BA.debugLineNum = 125;BA.debugLine="Public Sub setBitmap(Bmp As B4XBitmap)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 126;BA.debugLine="mBitmap = Bmp";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mbitmap" /*RemoteObject*/ ,_bmp);
 BA.debugLineNum = 127;BA.debugLine="XUIViewsUtils.SetBitmapAndFill(iv, Bmp)";
Debug.JustUpdateDeviceLine();
b4ximageview._xuiviewsutils.runVoidMethod ("_setbitmapandfill" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_iv" /*RemoteObject*/ )),(Object)(_bmp));
 BA.debugLineNum = 128;BA.debugLine="Update";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4ximageview.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcornersradius(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("setCornersRadius (b4ximageview) ","b4ximageview",18,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setcornersradius")) { return __ref.runUserSub(false, "b4ximageview","setcornersradius", __ref, _i);}
Debug.locals.put("i", _i);
 BA.debugLineNum = 61;BA.debugLine="Public Sub setCornersRadius (i As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="mCornersRadius = i";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcornersradius" /*RemoteObject*/ ,_i);
 BA.debugLineNum = 63;BA.debugLine="UpdateClip";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4ximageview.class, "_updateclip" /*RemoteObject*/ );
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setresizemode(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("setResizeMode (b4ximageview) ","b4ximageview",18,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("setresizemode")) { return __ref.runUserSub(false, "b4ximageview","setresizemode", __ref, _s);}
Debug.locals.put("s", _s);
 BA.debugLineNum = 72;BA.debugLine="Public Sub setResizeMode(s As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="If s = mResizeMode Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_s,__ref.getField(true,"_mresizemode" /*RemoteObject*/ ))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 74;BA.debugLine="mResizeMode = s";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mresizemode" /*RemoteObject*/ ,_s);
 BA.debugLineNum = 75;BA.debugLine="Update";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4ximageview.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setroundedimage(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setRoundedImage (b4ximageview) ","b4ximageview",18,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("setroundedimage")) { return __ref.runUserSub(false, "b4ximageview","setroundedimage", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 50;BA.debugLine="Public Sub setRoundedImage (b As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 51;BA.debugLine="If b = mRound Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,__ref.getField(true,"_mround" /*RemoteObject*/ ))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 52;BA.debugLine="mRound = b";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mround" /*RemoteObject*/ ,_b);
 BA.debugLineNum = 53;BA.debugLine="UpdateClip";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4ximageview.class, "_updateclip" /*RemoteObject*/ );
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Update (b4ximageview) ","b4ximageview",18,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "b4ximageview","update", __ref);}
RemoteObject _imageviewwidth = RemoteObject.createImmutable(0f);
RemoteObject _imageviewheight = RemoteObject.createImmutable(0f);
RemoteObject _bmpratio = RemoteObject.createImmutable(0f);
RemoteObject _r = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 78;BA.debugLine="Public Sub Update";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 79;BA.debugLine="If mBitmap.IsInitialized = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mbitmap" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),b4ximageview.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 80;BA.debugLine="UpdateClip";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4ximageview.class, "_updateclip" /*RemoteObject*/ );
 BA.debugLineNum = 81;BA.debugLine="Dim ImageViewWidth, ImageViewHeight As Float";
Debug.JustUpdateDeviceLine();
_imageviewwidth = RemoteObject.createImmutable(0f);Debug.locals.put("ImageViewWidth", _imageviewwidth);
_imageviewheight = RemoteObject.createImmutable(0f);Debug.locals.put("ImageViewHeight", _imageviewheight);
 BA.debugLineNum = 82;BA.debugLine="Dim bmpRatio As Float = mBitmap.Width / mBitmap.H";
Debug.JustUpdateDeviceLine();
_bmpratio = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbitmap" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_mbitmap" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "/",0, 0));Debug.locals.put("bmpRatio", _bmpratio);Debug.locals.put("bmpRatio", _bmpratio);
 BA.debugLineNum = 83;BA.debugLine="Select mResizeMode";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(__ref.getField(true,"_mresizemode" /*RemoteObject*/ ),BA.ObjectToString("FILL"),BA.ObjectToString("FIT"),BA.ObjectToString("FILL_WIDTH"),BA.ObjectToString("FILL_HEIGHT"),BA.ObjectToString("FILL_NO_DISTORTIONS"),BA.ObjectToString("NONE"))) {
case 0: {
 BA.debugLineNum = 85;BA.debugLine="ImageViewWidth = mBase.Width";
Debug.JustUpdateDeviceLine();
_imageviewwidth = BA.numberCast(float.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));Debug.locals.put("ImageViewWidth", _imageviewwidth);
 BA.debugLineNum = 86;BA.debugLine="ImageViewHeight = mBase.Height";
Debug.JustUpdateDeviceLine();
_imageviewheight = BA.numberCast(float.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"));Debug.locals.put("ImageViewHeight", _imageviewheight);
 break; }
case 1: {
 BA.debugLineNum = 88;BA.debugLine="Dim r As Float = Min(mBase.Width / mBitmap.Widt";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, b4ximageview.__c.runMethod(true,"Min",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_mbitmap" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "/",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_mbitmap" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "/",0, 0))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 89;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
Debug.JustUpdateDeviceLine();
_imageviewwidth = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbitmap" /*RemoteObject*/ ).runMethod(true,"getWidth"),_r}, "*",0, 0));Debug.locals.put("ImageViewWidth", _imageviewwidth);
 BA.debugLineNum = 90;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
Debug.JustUpdateDeviceLine();
_imageviewheight = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbitmap" /*RemoteObject*/ ).runMethod(true,"getHeight"),_r}, "*",0, 0));Debug.locals.put("ImageViewHeight", _imageviewheight);
 break; }
case 2: {
 BA.debugLineNum = 92;BA.debugLine="ImageViewWidth = mBase.Width";
Debug.JustUpdateDeviceLine();
_imageviewwidth = BA.numberCast(float.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));Debug.locals.put("ImageViewWidth", _imageviewwidth);
 BA.debugLineNum = 93;BA.debugLine="ImageViewHeight = ImageViewWidth / bmpRatio";
Debug.JustUpdateDeviceLine();
_imageviewheight = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_imageviewwidth,_bmpratio}, "/",0, 0));Debug.locals.put("ImageViewHeight", _imageviewheight);
 break; }
case 3: {
 BA.debugLineNum = 95;BA.debugLine="ImageViewHeight = mBase.Height";
Debug.JustUpdateDeviceLine();
_imageviewheight = BA.numberCast(float.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"));Debug.locals.put("ImageViewHeight", _imageviewheight);
 BA.debugLineNum = 96;BA.debugLine="ImageViewWidth = ImageViewHeight * bmpRatio";
Debug.JustUpdateDeviceLine();
_imageviewwidth = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_imageviewheight,_bmpratio}, "*",0, 0));Debug.locals.put("ImageViewWidth", _imageviewwidth);
 break; }
case 4: {
 BA.debugLineNum = 98;BA.debugLine="Dim r As Float = Max(mBase.Width / mBitmap.Widt";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, b4ximageview.__c.runMethod(true,"Max",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_mbitmap" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "/",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_mbitmap" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "/",0, 0))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 99;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
Debug.JustUpdateDeviceLine();
_imageviewwidth = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbitmap" /*RemoteObject*/ ).runMethod(true,"getWidth"),_r}, "*",0, 0));Debug.locals.put("ImageViewWidth", _imageviewwidth);
 BA.debugLineNum = 100;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
Debug.JustUpdateDeviceLine();
_imageviewheight = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbitmap" /*RemoteObject*/ ).runMethod(true,"getHeight"),_r}, "*",0, 0));Debug.locals.put("ImageViewHeight", _imageviewheight);
 break; }
case 5: {
 BA.debugLineNum = 102;BA.debugLine="ImageViewWidth = mBitmap.Width";
Debug.JustUpdateDeviceLine();
_imageviewwidth = BA.numberCast(float.class, __ref.getField(false,"_mbitmap" /*RemoteObject*/ ).runMethod(true,"getWidth"));Debug.locals.put("ImageViewWidth", _imageviewwidth);
 BA.debugLineNum = 103;BA.debugLine="ImageViewHeight = mBitmap.Height";
Debug.JustUpdateDeviceLine();
_imageviewheight = BA.numberCast(float.class, __ref.getField(false,"_mbitmap" /*RemoteObject*/ ).runMethod(true,"getHeight"));Debug.locals.put("ImageViewHeight", _imageviewheight);
 break; }
default: {
 BA.debugLineNum = 105;BA.debugLine="Log(\"Invalid resize mode: \"  & mResizeMode)";
Debug.JustUpdateDeviceLine();
b4ximageview.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Invalid resize mode: "),__ref.getField(true,"_mresizemode" /*RemoteObject*/ ))));
 break; }
}
;
 BA.debugLineNum = 107;BA.debugLine="iv.SetLayoutAnimated(0, Round(mBase.Width / 2 - I";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_iv" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, b4ximageview.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2),_imageviewwidth,RemoteObject.createImmutable(2)}, "/-/",1, 0))))),(Object)(BA.numberCast(double.class, b4ximageview.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_imageviewheight,RemoteObject.createImmutable(2)}, "/-/",1, 0))))),(Object)(BA.numberCast(double.class, b4ximageview.__c.runMethod(true,"Round",(Object)(BA.numberCast(double.class, _imageviewwidth))))),(Object)(BA.numberCast(double.class, b4ximageview.__c.runMethod(true,"Round",(Object)(BA.numberCast(double.class, _imageviewheight))))));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateclip(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateClip (b4ximageview) ","b4ximageview",18,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("updateclip")) { return __ref.runUserSub(false, "b4ximageview","updateclip", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _shape = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _radius = RemoteObject.createImmutable(0);
RemoteObject _cx = RemoteObject.createImmutable(0);
RemoteObject _cy = RemoteObject.createImmutable(0);
RemoteObject _d = RemoteObject.createImmutable(0);
 BA.debugLineNum = 136;BA.debugLine="Private Sub UpdateClip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 137;BA.debugLine="If mRound Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_mround" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 138;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_mbackgroundcolor" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4ximageview.__c.runMethod(true,"Min",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)))));
 }else {
 BA.debugLineNum = 140;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_mbackgroundcolor" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, __ref.getField(true,"_mcornersradius" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 143;BA.debugLine="Dim jo As JavaObject = mBase";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_mbase" /*RemoteObject*/ ).getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 144;BA.debugLine="Dim shape As JavaObject";
Debug.JustUpdateDeviceLine();
_shape = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("shape", _shape);
 BA.debugLineNum = 145;BA.debugLine="If mRound Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_mround" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 146;BA.debugLine="Dim radius As Double = Min(mBase.Width / 2, mBas";
Debug.JustUpdateDeviceLine();
_radius = b4ximageview.__c.runMethod(true,"Min",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)));Debug.locals.put("radius", _radius);Debug.locals.put("radius", _radius);
 BA.debugLineNum = 147;BA.debugLine="Dim cx As Double = mBase.Width / 2";
Debug.JustUpdateDeviceLine();
_cx = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0);Debug.locals.put("cx", _cx);Debug.locals.put("cx", _cx);
 BA.debugLineNum = 148;BA.debugLine="Dim cy As Double = mBase.Height / 2";
Debug.JustUpdateDeviceLine();
_cy = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0);Debug.locals.put("cy", _cy);Debug.locals.put("cy", _cy);
 BA.debugLineNum = 149;BA.debugLine="shape.InitializeNewInstance(\"javafx.scene.shape.";
Debug.JustUpdateDeviceLine();
_shape.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.shape.Circle")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_cx),(_cy),(_radius)})));
 }else {
 BA.debugLineNum = 151;BA.debugLine="Dim cx As Double = mBase.Width";
Debug.JustUpdateDeviceLine();
_cx = __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth");Debug.locals.put("cx", _cx);Debug.locals.put("cx", _cx);
 BA.debugLineNum = 152;BA.debugLine="Dim cy As Double = mBase.Height";
Debug.JustUpdateDeviceLine();
_cy = __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight");Debug.locals.put("cy", _cy);Debug.locals.put("cy", _cy);
 BA.debugLineNum = 153;BA.debugLine="shape.InitializeNewInstance(\"javafx.scene.shape.";
Debug.JustUpdateDeviceLine();
_shape.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.shape.Rectangle")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_cx),(_cy)})));
 BA.debugLineNum = 154;BA.debugLine="If mCornersRadius > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_mcornersradius" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 155;BA.debugLine="Dim d As Double = mCornersRadius";
Debug.JustUpdateDeviceLine();
_d = BA.numberCast(double.class, __ref.getField(true,"_mcornersradius" /*RemoteObject*/ ));Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 156;BA.debugLine="shape.RunMethod(\"setArcHeight\", Array(d))";
Debug.JustUpdateDeviceLine();
_shape.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setArcHeight")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_d)})));
 BA.debugLineNum = 157;BA.debugLine="shape.RunMethod(\"setArcWidth\", Array(d))";
Debug.JustUpdateDeviceLine();
_shape.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setArcWidth")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_d)})));
 };
 };
 BA.debugLineNum = 160;BA.debugLine="jo.RunMethod(\"setClip\", Array(shape))";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setClip")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_shape.getObject())})));
 BA.debugLineNum = 165;BA.debugLine="End Sub";
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