package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xfloattextfield_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "b4xfloattextfield","base_resize", __ref, _width, _height);}
RemoteObject _firstdistance = RemoteObject.createImmutable(0);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 196;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 197;BA.debugLine="mTextField.SetLayoutAnimated(0, 0, 0, Width, Heig";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mtextfield" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 198;BA.debugLine="Dim FirstDistance As Int = 2dip";
Debug.JustUpdateDeviceLine();
_firstdistance = b4xfloattextfield.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("FirstDistance", _firstdistance);Debug.locals.put("FirstDistance", _firstdistance);
 BA.debugLineNum = 199;BA.debugLine="If Multiline And xui.IsB4J Then FirstDistance = 2";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_multiline" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J"))) { 
_firstdistance = b4xfloattextfield.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 22)));Debug.locals.put("FirstDistance", _firstdistance);};
 BA.debugLineNum = 200;BA.debugLine="If lblV.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 201;BA.debugLine="lblV.SetLayoutAnimated(0, Width - lblV.Width - F";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblv" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_width,__ref.getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"getWidth"),_firstdistance}, "--",2, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_height));
 BA.debugLineNum = 202;BA.debugLine="FirstDistance = FirstDistance + lblV.Width + 2di";
Debug.JustUpdateDeviceLine();
_firstdistance = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_firstdistance,__ref.getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"getWidth"),b4xfloattextfield.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "++",2, 0));Debug.locals.put("FirstDistance", _firstdistance);
 };
 BA.debugLineNum = 204;BA.debugLine="If lblClear.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 205;BA.debugLine="lblClear.SetLayoutAnimated(0, Width - lblClear.W";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblclear" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_width,__ref.getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"getWidth"),_firstdistance}, "--",2, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_height));
 };
 BA.debugLineNum = 207;BA.debugLine="UpdateLabel(mTextField.Text, True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_updatelabel" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mtextfield" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(b4xfloattextfield.__c.getField(true,"True")));
 BA.debugLineNum = 208;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 16;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private mEventName As String 'ignore";
b4xfloattextfield._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4xfloattextfield._meventname);
 //BA.debugLineNum = 18;BA.debugLine="Private mCallBack As Object 'ignore";
b4xfloattextfield._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",b4xfloattextfield._mcallback);
 //BA.debugLineNum = 19;BA.debugLine="Public mBase As B4XView 'ignore";
b4xfloattextfield._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xfloattextfield._mbase);
 //BA.debugLineNum = 20;BA.debugLine="Private xui As XUI 'ignore";
b4xfloattextfield._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xfloattextfield._xui);
 //BA.debugLineNum = 21;BA.debugLine="Private mTextField As B4XView";
b4xfloattextfield._mtextfield = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mtextfield",b4xfloattextfield._mtextfield);
 //BA.debugLineNum = 22;BA.debugLine="Public AnimationDuration As Int = 200";
b4xfloattextfield._animationduration = BA.numberCast(int.class, 200);__ref.setField("_animationduration",b4xfloattextfield._animationduration);
 //BA.debugLineNum = 23;BA.debugLine="Public LargeLabelTextSize = 18, SmallLabelTextSiz";
b4xfloattextfield._largelabeltextsize = BA.numberCast(float.class, 18);__ref.setField("_largelabeltextsize",b4xfloattextfield._largelabeltextsize);
b4xfloattextfield._smalllabeltextsize = BA.numberCast(float.class, 14);__ref.setField("_smalllabeltextsize",b4xfloattextfield._smalllabeltextsize);
 //BA.debugLineNum = 24;BA.debugLine="Private LargeLabel As Boolean";
b4xfloattextfield._largelabel = RemoteObject.createImmutable(false);__ref.setField("_largelabel",b4xfloattextfield._largelabel);
 //BA.debugLineNum = 25;BA.debugLine="Private MeasuringCanvas As B4XCanvas";
b4xfloattextfield._measuringcanvas = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_measuringcanvas",b4xfloattextfield._measuringcanvas);
 //BA.debugLineNum = 26;BA.debugLine="Public HintColor As Int";
b4xfloattextfield._hintcolor = RemoteObject.createImmutable(0);__ref.setField("_hintcolor",b4xfloattextfield._hintcolor);
 //BA.debugLineNum = 27;BA.debugLine="Public NonFocusedHintColor As Int";
b4xfloattextfield._nonfocusedhintcolor = RemoteObject.createImmutable(0);__ref.setField("_nonfocusedhintcolor",b4xfloattextfield._nonfocusedhintcolor);
 //BA.debugLineNum = 28;BA.debugLine="Private HintImageView As B4XView";
b4xfloattextfield._hintimageview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_hintimageview",b4xfloattextfield._hintimageview);
 //BA.debugLineNum = 29;BA.debugLine="Public HintText As String";
b4xfloattextfield._hinttext = RemoteObject.createImmutable("");__ref.setField("_hinttext",b4xfloattextfield._hinttext);
 //BA.debugLineNum = 30;BA.debugLine="Public HintFont As B4XFont";
b4xfloattextfield._hintfont = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");__ref.setField("_hintfont",b4xfloattextfield._hintfont);
 //BA.debugLineNum = 31;BA.debugLine="Private LargeFocused, LargeNotFocused, SmallFocus";
b4xfloattextfield._largefocused = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");__ref.setField("_largefocused",b4xfloattextfield._largefocused);
b4xfloattextfield._largenotfocused = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");__ref.setField("_largenotfocused",b4xfloattextfield._largenotfocused);
b4xfloattextfield._smallfocused = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");__ref.setField("_smallfocused",b4xfloattextfield._smallfocused);
b4xfloattextfield._smallnotfocused = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");__ref.setField("_smallnotfocused",b4xfloattextfield._smallnotfocused);
 //BA.debugLineNum = 32;BA.debugLine="Public Focused As Boolean";
b4xfloattextfield._focused = RemoteObject.createImmutable(false);__ref.setField("_focused",b4xfloattextfield._focused);
 //BA.debugLineNum = 33;BA.debugLine="Public lblClear As B4XView";
b4xfloattextfield._lblclear = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblclear",b4xfloattextfield._lblclear);
 //BA.debugLineNum = 34;BA.debugLine="Public lblV As B4XView";
b4xfloattextfield._lblv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblv",b4xfloattextfield._lblv);
 //BA.debugLineNum = 35;BA.debugLine="Private mProps As Map";
b4xfloattextfield._mprops = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mprops",b4xfloattextfield._mprops);
 //BA.debugLineNum = 36;BA.debugLine="Public Tag As Object";
b4xfloattextfield._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",b4xfloattextfield._tag);
 //BA.debugLineNum = 37;BA.debugLine="Private KeyboardType As String 'ignore";
b4xfloattextfield._keyboardtype = RemoteObject.createImmutable("");__ref.setField("_keyboardtype",b4xfloattextfield._keyboardtype);
 //BA.debugLineNum = 38;BA.debugLine="Private Multiline As Boolean";
b4xfloattextfield._multiline = RemoteObject.createImmutable(false);__ref.setField("_multiline",b4xfloattextfield._multiline);
 //BA.debugLineNum = 39;BA.debugLine="Private mNextTextField As B4XFloatTextField";
b4xfloattextfield._mnexttextfield = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_mnexttextfield",b4xfloattextfield._mnexttextfield);
 //BA.debugLineNum = 44;BA.debugLine="Private ToolTip As String";
b4xfloattextfield._tooltip = RemoteObject.createImmutable("");__ref.setField("_tooltip",b4xfloattextfield._tooltip);
 //BA.debugLineNum = 46;BA.debugLine="Public HintLabelLargeOffsetX, HintLabelSmallOffse";
b4xfloattextfield._hintlabellargeoffsetx = RemoteObject.createImmutable(0);__ref.setField("_hintlabellargeoffsetx",b4xfloattextfield._hintlabellargeoffsetx);
b4xfloattextfield._hintlabelsmalloffsety = b4xfloattextfield.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)));__ref.setField("_hintlabelsmalloffsety",b4xfloattextfield._hintlabelsmalloffsety);
b4xfloattextfield._hintlabelsmalloffsetx = b4xfloattextfield.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)));__ref.setField("_hintlabelsmalloffsetx",b4xfloattextfield._hintlabelsmalloffsetx);
 //BA.debugLineNum = 47;BA.debugLine="Private LastSwitchTextFieldTime As Long";
b4xfloattextfield._lastswitchtextfieldtime = RemoteObject.createImmutable(0L);__ref.setField("_lastswitchtextfieldtime",b4xfloattextfield._lastswitchtextfieldtime);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createacceptbutton(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateAcceptButton (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("createacceptbutton")) { return __ref.runUserSub(false, "b4xfloattextfield","createacceptbutton", __ref);}
 BA.debugLineNum = 125;BA.debugLine="Private Sub CreateAcceptButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 126;BA.debugLine="If mProps.GetDefault(\"ShowAccept\", True) = False";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mprops" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ShowAccept"))),(Object)((b4xfloattextfield.__c.getField(true,"True")))),(b4xfloattextfield.__c.getField(true,"False")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 127;BA.debugLine="lblV = CreateButton(Chr(0xE5CA))";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lblv" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_createbutton" /*RemoteObject*/ ,(Object)(BA.ObjectToString(b4xfloattextfield.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe5ca)))))));
 BA.debugLineNum = 128;BA.debugLine="lblV.Tag = \"v\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblv" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("v")));
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
public static RemoteObject  _createbitmap(RemoteObject __ref,RemoteObject _r,RemoteObject _color,RemoteObject _fnt) throws Exception{
try {
		Debug.PushSubsStack("CreateBitmap (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,257);
if (RapidSub.canDelegate("createbitmap")) { return __ref.runUserSub(false, "b4xfloattextfield","createbitmap", __ref, _r, _color, _fnt);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _baseline = RemoteObject.createImmutable(0);
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
Debug.locals.put("r", _r);
Debug.locals.put("Color", _color);
Debug.locals.put("Fnt", _fnt);
 BA.debugLineNum = 257;BA.debugLine="Private Sub CreateBitmap(r As B4XRect, Color As In";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 258;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 259;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Max(1, r.Width + 2di";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(b4xfloattextfield.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),b4xfloattextfield.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 0)))),(Object)(b4xfloattextfield.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),b4xfloattextfield.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 0)))));
 BA.debugLineNum = 260;BA.debugLine="Dim c As B4XCanvas";
Debug.JustUpdateDeviceLine();
_c = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("c", _c);
 BA.debugLineNum = 261;BA.debugLine="c.Initialize(p)";
Debug.JustUpdateDeviceLine();
_c.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_p));
 BA.debugLineNum = 262;BA.debugLine="Dim BaseLine As Int = p.Height / 2 - r.Height / 2";
Debug.JustUpdateDeviceLine();
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_r.runMethod(true,"getTop")}, "/-/-",2, 0));Debug.locals.put("BaseLine", _baseline);Debug.locals.put("BaseLine", _baseline);
 BA.debugLineNum = 263;BA.debugLine="c.DrawText(HintText, p.Width / 2, BaseLine, Fnt,";
Debug.JustUpdateDeviceLine();
_c.runVoidMethod ("DrawText",(Object)(__ref.getField(true,"_hinttext" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),(Object)(BA.numberCast(double.class, _baseline)),(Object)(_fnt),(Object)(_color),(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.text.TextAlignment"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 264;BA.debugLine="Dim bmp As B4XBitmap = c.CreateBitmap";
Debug.JustUpdateDeviceLine();
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp = _c.runMethod(false,"CreateBitmap");Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 265;BA.debugLine="c.Release";
Debug.JustUpdateDeviceLine();
_c.runVoidMethod ("Release");
 BA.debugLineNum = 266;BA.debugLine="Return bmp";
Debug.JustUpdateDeviceLine();
if (true) return _bmp;
 BA.debugLineNum = 267;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createbutton(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("CreateButton (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("createbutton")) { return __ref.runUserSub(false, "b4xfloattextfield","createbutton", __ref, _text);}
RemoteObject _lc = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _x = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Text", _text);
 BA.debugLineNum = 182;BA.debugLine="Private Sub CreateButton (Text As String) As B4XVi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 183;BA.debugLine="Dim lc As Label";
Debug.JustUpdateDeviceLine();
_lc = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lc", _lc);
 BA.debugLineNum = 184;BA.debugLine="lc.Initialize(\"lc\")";
Debug.JustUpdateDeviceLine();
_lc.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lc")));
 BA.debugLineNum = 185;BA.debugLine="Dim x As B4XView = lc";
Debug.JustUpdateDeviceLine();
_x = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_x = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lc.getObject());Debug.locals.put("x", _x);
 BA.debugLineNum = 186;BA.debugLine="x = lc";
Debug.JustUpdateDeviceLine();
_x = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lc.getObject());
 BA.debugLineNum = 187;BA.debugLine="x.Font = xui.CreateMaterialIcons(20)";
Debug.JustUpdateDeviceLine();
_x.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 188;BA.debugLine="x.Text = Text";
Debug.JustUpdateDeviceLine();
_x.runMethod(true,"setText",_text);
 BA.debugLineNum = 189;BA.debugLine="x.TextColor = mTextField.TextColor";
Debug.JustUpdateDeviceLine();
_x.runMethod(true,"setTextColor",__ref.getField(false,"_mtextfield" /*RemoteObject*/ ).runMethod(true,"getTextColor"));
 BA.debugLineNum = 190;BA.debugLine="x.Visible = False";
Debug.JustUpdateDeviceLine();
_x.runMethod(true,"setVisible",b4xfloattextfield.__c.getField(true,"False"));
 BA.debugLineNum = 191;BA.debugLine="x.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.JustUpdateDeviceLine();
_x.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 192;BA.debugLine="mBase.AddView(x, 0, 0, 30dip, 30dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_x.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, b4xfloattextfield.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))))),(Object)(BA.numberCast(double.class, b4xfloattextfield.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))))));
 BA.debugLineNum = 193;BA.debugLine="Return x";
Debug.JustUpdateDeviceLine();
if (true) return _x;
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createclearbutton(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateClearButton (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("createclearbutton")) { return __ref.runUserSub(false, "b4xfloattextfield","createclearbutton", __ref);}
 BA.debugLineNum = 117;BA.debugLine="Private Sub CreateClearButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 118;BA.debugLine="If mProps.GetDefault(\"ShowClear\", True) = False T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mprops" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ShowClear"))),(Object)((b4xfloattextfield.__c.getField(true,"True")))),(b4xfloattextfield.__c.getField(true,"False")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 119;BA.debugLine="If lblClear.IsInitialized And lblClear.Parent.IsI";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(true,"IsInitialized"))) { 
__ref.getField(false,"_lblclear" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");};
 BA.debugLineNum = 120;BA.debugLine="lblClear = CreateButton(Chr(0xE14C))";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lblclear" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_createbutton" /*RemoteObject*/ ,(Object)(BA.ObjectToString(b4xfloattextfield.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe14c)))))));
 BA.debugLineNum = 121;BA.debugLine="lblClear.Tag = \"clear\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("clear")));
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
public static RemoteObject  _createrevealbutton(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateRevealButton (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("createrevealbutton")) { return __ref.runUserSub(false, "b4xfloattextfield","createrevealbutton", __ref);}
 BA.debugLineNum = 132;BA.debugLine="Private Sub CreateRevealButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 133;BA.debugLine="lblClear = CreateButton(Chr(0xE8F4))";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lblclear" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_createbutton" /*RemoteObject*/ ,(Object)(BA.ObjectToString(b4xfloattextfield.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe8f4)))))));
 BA.debugLineNum = 134;BA.debugLine="lblClear.Tag = \"reveal\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("reveal")));
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtextfield(RemoteObject __ref,RemoteObject _password) throws Exception{
try {
		Debug.PushSubsStack("CreateTextField (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("createtextfield")) { return __ref.runUserSub(false, "b4xfloattextfield","createtextfield", __ref, _password);}
RemoteObject _tf = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
RemoteObject _ta = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");
Debug.locals.put("Password", _password);
 BA.debugLineNum = 328;BA.debugLine="Private Sub CreateTextField (Password As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 331;BA.debugLine="If Multiline = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_multiline" /*RemoteObject*/ ),b4xfloattextfield.__c.getField(true,"False"))) { 
 BA.debugLineNum = 332;BA.debugLine="Dim tf As TextField";
Debug.JustUpdateDeviceLine();
_tf = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");Debug.locals.put("tf", _tf);
 BA.debugLineNum = 333;BA.debugLine="If Password Then tf.InitializePassword(\"tf\") Els";
Debug.JustUpdateDeviceLine();
if (_password.<Boolean>get().booleanValue()) { 
_tf.runVoidMethod ("InitializePassword",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("tf")));}
else {
_tf.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("tf")));};
 BA.debugLineNum = 334;BA.debugLine="If ToolTip <> \"\" Then tf.TooltipText = ToolTip";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_tooltip" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
_tf.runMethod(true,"setTooltipText",__ref.getField(true,"_tooltip" /*RemoteObject*/ ));};
 BA.debugLineNum = 335;BA.debugLine="Return tf";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _tf.getObject());
 }else {
 BA.debugLineNum = 337;BA.debugLine="Dim ta As TextArea";
Debug.JustUpdateDeviceLine();
_ta = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");Debug.locals.put("ta", _ta);
 BA.debugLineNum = 338;BA.debugLine="ta.Initialize(\"tf\")";
Debug.JustUpdateDeviceLine();
_ta.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("tf")));
 BA.debugLineNum = 339;BA.debugLine="ta.WrapText = True";
Debug.JustUpdateDeviceLine();
_ta.runMethod(true,"setWrapText",b4xfloattextfield.__c.getField(true,"True"));
 BA.debugLineNum = 340;BA.debugLine="If ToolTip <> \"\" Then ta.TooltipText = ToolTip";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_tooltip" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
_ta.runMethod(true,"setTooltipText",__ref.getField(true,"_tooltip" /*RemoteObject*/ ));};
 BA.debugLineNum = 341;BA.debugLine="Return ta";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _ta.getObject());
 };
 BA.debugLineNum = 386;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtextfieldall(RemoteObject __ref,RemoteObject _passwordmode,RemoteObject _font1,RemoteObject _textcolor) throws Exception{
try {
		Debug.PushSubsStack("CreateTextFieldAll (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("createtextfieldall")) { return __ref.runUserSub(false, "b4xfloattextfield","createtextfieldall", __ref, _passwordmode, _font1, _textcolor);}
Debug.locals.put("PasswordMode", _passwordmode);
Debug.locals.put("Font1", _font1);
Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 109;BA.debugLine="Private Sub CreateTextFieldAll (PasswordMode As Bo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 110;BA.debugLine="mTextField = CreateTextField (PasswordMode)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextfield" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_createtextfield" /*RemoteObject*/ ,(Object)(_passwordmode)));
 BA.debugLineNum = 111;BA.debugLine="mTextField.Font = Font1";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mtextfield" /*RemoteObject*/ ).runMethod(false,"setFont",_font1);
 BA.debugLineNum = 112;BA.debugLine="mTextField.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mtextfield" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 113;BA.debugLine="setNextField(mNextTextField)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_setnextfield" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mnexttextfield" /*RemoteObject*/ )));
 BA.debugLineNum = 114;BA.debugLine="mBase.AddView(mTextField, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mtextfield" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 115;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("DesignerCreateView (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "b4xfloattextfield","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _passedlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _passwordmode = RemoteObject.createImmutable(false);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 67;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 69;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 69;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 70;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 71;BA.debugLine="mProps = Props";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mprops" /*RemoteObject*/ ,_props);
 BA.debugLineNum = 72;BA.debugLine="Dim PassedLabel As B4XView = lbl";
Debug.JustUpdateDeviceLine();
_passedlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_passedlabel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("PassedLabel", _passedlabel);
 BA.debugLineNum = 73;BA.debugLine="Dim iv As ImageView";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 74;BA.debugLine="iv.Initialize(\"HintImageView\")";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("HintImageView")));
 BA.debugLineNum = 75;BA.debugLine="HintImageView = iv";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_hintimageview" /*RemoteObject*/ ).setObject (_iv.getObject());
 BA.debugLineNum = 76;BA.debugLine="KeyboardType = Props.GetDefault(\"KeyboardType\", \"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_keyboardtype" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("KeyboardType"))),(Object)((RemoteObject.createImmutable("Text"))))));
 BA.debugLineNum = 78;BA.debugLine="ToolTip = lbl.TooltipText";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tooltip" /*RemoteObject*/ ,_lbl.runMethod(true,"getTooltipText"));
 BA.debugLineNum = 79;BA.debugLine="Dim jo As JavaObject = HintImageView";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_hintimageview" /*RemoteObject*/ ).getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 80;BA.debugLine="jo.RunMethod(\"setMouseTransparent\", Array(True))";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMouseTransparent")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(b4xfloattextfield.__c.getField(true,"True"))})));
 BA.debugLineNum = 82;BA.debugLine="HintColor = xui.PaintOrColorToColor(Props.Get(\"Hi";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hintcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("HintColor")))))));
 BA.debugLineNum = 83;BA.debugLine="NonFocusedHintColor = xui.PaintOrColorToColor(Pro";
Debug.JustUpdateDeviceLine();
__ref.setField ("_nonfocusedhintcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NonFocusedHintColor")))))));
 BA.debugLineNum = 85;BA.debugLine="HintText = Props.Get(\"Hint\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hinttext" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Hint"))))));
 BA.debugLineNum = 86;BA.debugLine="HintFont = PassedLabel.Font";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hintfont" /*RemoteObject*/ ,_passedlabel.runMethod(false,"getFont"));
 BA.debugLineNum = 87;BA.debugLine="Dim PasswordMode As Boolean = Props.GetDefault(\"P";
Debug.JustUpdateDeviceLine();
_passwordmode = BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("PasswordField"))),(Object)((b4xfloattextfield.__c.getField(true,"False")))));Debug.locals.put("PasswordMode", _passwordmode);Debug.locals.put("PasswordMode", _passwordmode);
 BA.debugLineNum = 88;BA.debugLine="Multiline = Props.GetDefault(\"Multiline\", False)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_multiline" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Multiline"))),(Object)((b4xfloattextfield.__c.getField(true,"False"))))));
 BA.debugLineNum = 89;BA.debugLine="If PasswordMode And Multiline Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_passwordmode) && RemoteObject.solveBoolean(".",__ref.getField(true,"_multiline" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 90;BA.debugLine="Multiline = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_multiline" /*RemoteObject*/ ,b4xfloattextfield.__c.getField(true,"False"));
 BA.debugLineNum = 91;BA.debugLine="Log(\"Multiline not supported with password mode.";
Debug.JustUpdateDeviceLine();
b4xfloattextfield.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Multiline not supported with password mode.")));
 };
 BA.debugLineNum = 93;BA.debugLine="CreateTextFieldAll(PasswordMode, PassedLabel.Font";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_createtextfieldall" /*RemoteObject*/ ,(Object)(_passwordmode),(Object)(_passedlabel.runMethod(false,"getFont")),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)((_lbl.runMethod(false,"getTextColor"))))));
 BA.debugLineNum = 95;BA.debugLine="mBase.AddView(HintImageView, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_hintimageview" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 96;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 97;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, b4xfloattextfield.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(double.class, b4xfloattextfield.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 98;BA.debugLine="MeasuringCanvas.Initialize(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_measuringcanvas" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_p));
 BA.debugLineNum = 99;BA.debugLine="Update";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 100;BA.debugLine="If PasswordMode And Props.GetDefault(\"ShowRevealB";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_passwordmode) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ShowRevealButton"))),(Object)((b4xfloattextfield.__c.getField(true,"False"))))))) { 
 BA.debugLineNum = 101;BA.debugLine="CreateRevealButton";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_createrevealbutton" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 103;BA.debugLine="CreateClearButton";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_createclearbutton" /*RemoteObject*/ );
 };
 BA.debugLineNum = 105;BA.debugLine="CreateAcceptButton";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_createacceptbutton" /*RemoteObject*/ );
 BA.debugLineNum = 106;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_base_resize" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnextfield(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getNextField (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,295);
if (RapidSub.canDelegate("getnextfield")) { return __ref.runUserSub(false, "b4xfloattextfield","getnextfield", __ref);}
 BA.debugLineNum = 295;BA.debugLine="Public Sub getNextField As B4XFloatTextField";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 296;BA.debugLine="Return mNextTextField";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mnexttextfield" /*RemoteObject*/ );
 BA.debugLineNum = 297;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getText (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,388);
if (RapidSub.canDelegate("gettext")) { return __ref.runUserSub(false, "b4xfloattextfield","gettext", __ref);}
 BA.debugLineNum = 388;BA.debugLine="Public Sub getText As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 389;BA.debugLine="Return mTextField.Text";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mtextfield" /*RemoteObject*/ ).runMethod(true,"getText");
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettextfield(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTextField (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,445);
if (RapidSub.canDelegate("gettextfield")) { return __ref.runUserSub(false, "b4xfloattextfield","gettextfield", __ref);}
 BA.debugLineNum = 445;BA.debugLine="Public Sub getTextField As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 446;BA.debugLine="Return mTextField";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mtextfield" /*RemoteObject*/ );
 BA.debugLineNum = 447;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ime_handleaction(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ime_HandleAction (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,314);
if (RapidSub.canDelegate("ime_handleaction")) { return __ref.runUserSub(false, "b4xfloattextfield","ime_handleaction", __ref);}
 BA.debugLineNum = 314;BA.debugLine="Private Sub ime_HandleAction As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 315;BA.debugLine="tf_EnterPressed";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_tf_enterpressed" /*RemoteObject*/ );
 BA.debugLineNum = 316;BA.debugLine="If mNextTextField.IsInitialized Then Return True";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_mnexttextfield" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return b4xfloattextfield.__c.getField(true,"True");};
 BA.debugLineNum = 317;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return b4xfloattextfield.__c.getField(true,"False");
 BA.debugLineNum = 318;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xfloattextfield","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 50;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 51;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 52;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 53;BA.debugLine="If xui.IsB4A Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 54;BA.debugLine="HintLabelLargeOffsetX = 6dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hintlabellargeoffsetx" /*RemoteObject*/ ,b4xfloattextfield.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 6))));
 }else {
 BA.debugLineNum = 56;BA.debugLine="HintLabelLargeOffsetX = 12dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hintlabellargeoffsetx" /*RemoteObject*/ ,b4xfloattextfield.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12))));
 };
 BA.debugLineNum = 62;BA.debugLine="Dim jo As JavaObject = Me";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 63;BA.debugLine="jo.RunMethod(\"RemoveWarning\", Null)";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("RemoveWarning")),(Object)((b4xfloattextfield.__c.getField(false,"Null"))));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lc_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lc_Click (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,403);
if (RapidSub.canDelegate("lc_click")) { return __ref.runUserSub(false, "b4xfloattextfield","lc_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 403;BA.debugLine="Private Sub lc_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 404;BA.debugLine="Dim btn As B4XView = Sender";
Debug.JustUpdateDeviceLine();
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), b4xfloattextfield.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);
 BA.debugLineNum = 405;BA.debugLine="Select btn.Tag";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_btn.runMethod(false,"getTag"),RemoteObject.createImmutable(("clear")),RemoteObject.createImmutable(("reveal")),RemoteObject.createImmutable(("hide")),RemoteObject.createImmutable(("v")))) {
case 0: {
 BA.debugLineNum = 407;BA.debugLine="setText(\"\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_settext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 break; }
case 1: {
 BA.debugLineNum = 409;BA.debugLine="SwitchFromPasswordToRegular (True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_switchfrompasswordtoregular" /*RemoteObject*/ ,(Object)(b4xfloattextfield.__c.getField(true,"True")));
 break; }
case 2: {
 BA.debugLineNum = 411;BA.debugLine="SwitchFromPasswordToRegular(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_switchfrompasswordtoregular" /*RemoteObject*/ ,(Object)(b4xfloattextfield.__c.getField(true,"False")));
 break; }
case 3: {
 BA.debugLineNum = 413;BA.debugLine="tf_EnterPressed";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_tf_enterpressed" /*RemoteObject*/ );
 BA.debugLineNum = 414;BA.debugLine="If mNextTextField.IsInitialized = False Or mNex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mnexttextfield" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ),b4xfloattextfield.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_mnexttextfield" /*RemoteObject*/ ),(__ref))) { 
 BA.debugLineNum = 418;BA.debugLine="mTextField.Parent.RequestFocus";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mtextfield" /*RemoteObject*/ ).runMethod(false,"getParent").runVoidMethod ("RequestFocus");
 };
 break; }
}
;
 BA.debugLineNum = 422;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lc_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lc_MouseClicked (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,435);
if (RapidSub.canDelegate("lc_mouseclicked")) { return __ref.runUserSub(false, "b4xfloattextfield","lc_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 435;BA.debugLine="Private Sub lc_MouseClicked(EventData As MouseEven";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 436;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 437;BA.debugLine="lc_Click";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_lc_click" /*RemoteObject*/ );
 BA.debugLineNum = 438;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lc_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lc_MousePressed (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,431);
if (RapidSub.canDelegate("lc_mousepressed")) { return __ref.runUserSub(false, "b4xfloattextfield","lc_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 431;BA.debugLine="Private Sub lc_MousePressed (EventData As MouseEve";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 432;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 433;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lc_mousereleased(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lc_MouseReleased (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,440);
if (RapidSub.canDelegate("lc_mousereleased")) { return __ref.runUserSub(false, "b4xfloattextfield","lc_mousereleased", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 440;BA.debugLine="Private Sub lc_MouseReleased(EventData As MouseEve";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 441;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 442;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _requestfocusandshowkeyboard(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RequestFocusAndShowKeyboard (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,450);
if (RapidSub.canDelegate("requestfocusandshowkeyboard")) { return __ref.runUserSub(false, "b4xfloattextfield","requestfocusandshowkeyboard", __ref);}
 BA.debugLineNum = 450;BA.debugLine="Public Sub RequestFocusAndShowKeyboard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 451;BA.debugLine="mTextField.RequestFocus";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mtextfield" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 BA.debugLineNum = 455;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnextfield(RemoteObject __ref,RemoteObject _field) throws Exception{
try {
		Debug.PushSubsStack("setNextField (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,299);
if (RapidSub.canDelegate("setnextfield")) { return __ref.runUserSub(false, "b4xfloattextfield","setnextfield", __ref, _field);}
RemoteObject _o = RemoteObject.declareNull("Object");
Debug.locals.put("Field", _field);
 BA.debugLineNum = 299;BA.debugLine="Public Sub setNextField (Field As B4XFloatTextFiel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 300;BA.debugLine="If Field.IsInitialized = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_field.runMethod(true,"IsInitialized" /*RemoteObject*/ ),b4xfloattextfield.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 310;BA.debugLine="Dim o As Object = Field";
Debug.JustUpdateDeviceLine();
_o = (_field);Debug.locals.put("o", _o);Debug.locals.put("o", _o);
 BA.debugLineNum = 311;BA.debugLine="mNextTextField = o";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mnexttextfield" /*RemoteObject*/ ,(_o));
 BA.debugLineNum = 312;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("setText (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,392);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "b4xfloattextfield","settext", __ref, _s);}
RemoteObject _old = RemoteObject.createImmutable("");
Debug.locals.put("s", _s);
 BA.debugLineNum = 392;BA.debugLine="Public Sub setText(s As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 393;BA.debugLine="Dim old As String = mTextField.Text 'ignore";
Debug.JustUpdateDeviceLine();
_old = __ref.getField(false,"_mtextfield" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("old", _old);Debug.locals.put("old", _old);
 BA.debugLineNum = 394;BA.debugLine="mTextField.Text = s";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mtextfield" /*RemoteObject*/ ).runMethod(true,"setText",_s);
 BA.debugLineNum = 400;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _switchfrompasswordtoregular(RemoteObject __ref,RemoteObject _toregular) throws Exception{
try {
		Debug.PushSubsStack("SwitchFromPasswordToRegular (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("switchfrompasswordtoregular")) { return __ref.runUserSub(false, "b4xfloattextfield","switchfrompasswordtoregular", __ref, _toregular);}
RemoteObject _text = RemoteObject.createImmutable("");
RemoteObject _textcolor = RemoteObject.createImmutable(0);
RemoteObject _font1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _oldfield = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _tf = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
Debug.locals.put("ToRegular", _toregular);
 BA.debugLineNum = 137;BA.debugLine="Private Sub SwitchFromPasswordToRegular (ToRegular";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 138;BA.debugLine="Dim text As String = mTextField.Text";
Debug.JustUpdateDeviceLine();
_text = __ref.getField(false,"_mtextfield" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("text", _text);Debug.locals.put("text", _text);
 BA.debugLineNum = 139;BA.debugLine="Dim textcolor As Int = mTextField.TextColor";
Debug.JustUpdateDeviceLine();
_textcolor = __ref.getField(false,"_mtextfield" /*RemoteObject*/ ).runMethod(true,"getTextColor");Debug.locals.put("textcolor", _textcolor);Debug.locals.put("textcolor", _textcolor);
 BA.debugLineNum = 140;BA.debugLine="Dim Font1 As B4XFont = mTextField.Font";
Debug.JustUpdateDeviceLine();
_font1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
_font1 = __ref.getField(false,"_mtextfield" /*RemoteObject*/ ).runMethod(false,"getFont");Debug.locals.put("Font1", _font1);Debug.locals.put("Font1", _font1);
 BA.debugLineNum = 141;BA.debugLine="Dim oldfield As B4XView = mTextField";
Debug.JustUpdateDeviceLine();
_oldfield = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_oldfield = __ref.getField(false,"_mtextfield" /*RemoteObject*/ );Debug.locals.put("oldfield", _oldfield);Debug.locals.put("oldfield", _oldfield);
 BA.debugLineNum = 143;BA.debugLine="CreateTextFieldAll(Not(ToRegular), Font1, textcol";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_createtextfieldall" /*RemoteObject*/ ,(Object)(b4xfloattextfield.__c.runMethod(true,"Not",(Object)(_toregular))),(Object)(_font1),(Object)(_textcolor));
 BA.debugLineNum = 144;BA.debugLine="mTextField.Text = text";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mtextfield" /*RemoteObject*/ ).runMethod(true,"setText",_text);
 BA.debugLineNum = 145;BA.debugLine="If lblClear.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 146;BA.debugLine="If ToRegular = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_toregular,b4xfloattextfield.__c.getField(true,"False"))) { 
 BA.debugLineNum = 147;BA.debugLine="lblClear.Text = Chr(0xE8F4)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(b4xfloattextfield.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe8f4)))));
 BA.debugLineNum = 148;BA.debugLine="lblClear.Tag = \"reveal\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("reveal")));
 }else {
 BA.debugLineNum = 150;BA.debugLine="lblClear.Tag = \"hide\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("hide")));
 BA.debugLineNum = 151;BA.debugLine="lblClear.Text = Chr(0xE8F5)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(b4xfloattextfield.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe8f5)))));
 };
 BA.debugLineNum = 153;BA.debugLine="lblClear.BringToFront";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblclear" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 };
 BA.debugLineNum = 155;BA.debugLine="If lblV.IsInitialized Then lblV.BringToFront";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
__ref.getField(false,"_lblv" /*RemoteObject*/ ).runVoidMethod ("BringToFront");};
 BA.debugLineNum = 156;BA.debugLine="HintImageView.BringToFront";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_hintimageview" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 BA.debugLineNum = 157;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_base_resize" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 159;BA.debugLine="Dim tf As TextField = mTextField";
Debug.JustUpdateDeviceLine();
_tf = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
_tf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper"), __ref.getField(false,"_mtextfield" /*RemoteObject*/ ).getObject());Debug.locals.put("tf", _tf);
 BA.debugLineNum = 160;BA.debugLine="tf.SetSelection(mTextField.Text.Length, mTextFiel";
Debug.JustUpdateDeviceLine();
_tf.runVoidMethod ("SetSelection",(Object)(__ref.getField(false,"_mtextfield" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length")),(Object)(__ref.getField(false,"_mtextfield" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length")));
 BA.debugLineNum = 165;BA.debugLine="LastSwitchTextFieldTime = DateTime.Now";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastswitchtextfieldtime" /*RemoteObject*/ ,b4xfloattextfield.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 166;BA.debugLine="mTextField.RequestFocus";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mtextfield" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 BA.debugLineNum = 167;BA.debugLine="oldfield.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_oldfield.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 177;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Passwo";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_PasswordRevealChanged"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 178;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Passwo";
Debug.JustUpdateDeviceLine();
b4xfloattextfield.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_PasswordRevealChanged"))),(Object)((_toregular)));
 };
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tf_action(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("tf_Action (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,277);
if (RapidSub.canDelegate("tf_action")) { return __ref.runUserSub(false, "b4xfloattextfield","tf_action", __ref);}
 BA.debugLineNum = 277;BA.debugLine="Private Sub tf_Action";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 278;BA.debugLine="If mNextTextField.IsInitialized And mNextTextFiel";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_mnexttextfield" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ )) && RemoteObject.solveBoolean("!",__ref.getField(false,"_mnexttextfield" /*RemoteObject*/ ),(__ref))) { 
 BA.debugLineNum = 279;BA.debugLine="mNextTextField.TextField.RequestFocus";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mnexttextfield" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettextfield" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 };
 BA.debugLineNum = 281;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_EnterP";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_EnterPressed"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 282;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_EnterPr";
Debug.JustUpdateDeviceLine();
b4xfloattextfield.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_EnterPressed"))));
 };
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tf_beginedit(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("tf_BeginEdit (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,269);
if (RapidSub.canDelegate("tf_beginedit")) { return __ref.runUserSub(false, "b4xfloattextfield","tf_beginedit", __ref);}
 BA.debugLineNum = 269;BA.debugLine="Private Sub tf_BeginEdit";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 270;BA.debugLine="tf_FocusChanged(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_tf_focuschanged" /*RemoteObject*/ ,(Object)(b4xfloattextfield.__c.getField(true,"True")));
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tf_endedit(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("tf_EndEdit (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,273);
if (RapidSub.canDelegate("tf_endedit")) { return __ref.runUserSub(false, "b4xfloattextfield","tf_endedit", __ref);}
 BA.debugLineNum = 273;BA.debugLine="Private Sub tf_EndEdit";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 274;BA.debugLine="tf_FocusChanged(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_tf_focuschanged" /*RemoteObject*/ ,(Object)(b4xfloattextfield.__c.getField(true,"False")));
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tf_enterpressed(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("tf_EnterPressed (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,320);
if (RapidSub.canDelegate("tf_enterpressed")) { return __ref.runUserSub(false, "b4xfloattextfield","tf_enterpressed", __ref);}
 BA.debugLineNum = 320;BA.debugLine="Private Sub tf_EnterPressed";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 321;BA.debugLine="tf_Action";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_tf_action" /*RemoteObject*/ );
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tf_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("tf_FocusChanged (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("tf_focuschanged")) { return __ref.runUserSub(false, "b4xfloattextfield","tf_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 234;BA.debugLine="Private Sub tf_FocusChanged (HasFocus As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 235;BA.debugLine="Focused = HasFocus";
Debug.JustUpdateDeviceLine();
__ref.setField ("_focused" /*RemoteObject*/ ,_hasfocus);
 BA.debugLineNum = 236;BA.debugLine="UpdateLabel(mTextField.Text, True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_updatelabel" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mtextfield" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(b4xfloattextfield.__c.getField(true,"True")));
 BA.debugLineNum = 237;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_FocusC";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_FocusChanged"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 238;BA.debugLine="If LastSwitchTextFieldTime + 100 < DateTime.Now";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_lastswitchtextfieldtime" /*RemoteObject*/ ),RemoteObject.createImmutable(100)}, "+",1, 2),b4xfloattextfield.__c.getField(false,"DateTime").runMethod(true,"getNow"))) { 
 BA.debugLineNum = 239;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Focus";
Debug.JustUpdateDeviceLine();
b4xfloattextfield.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_FocusChanged"))),(Object)((__ref.getField(true,"_focused" /*RemoteObject*/ ))));
 };
 };
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tf_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("tf_TextChanged (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,287);
if (RapidSub.canDelegate("tf_textchanged")) { return __ref.runUserSub(false, "b4xfloattextfield","tf_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 287;BA.debugLine="Private Sub tf_TextChanged (Old As String, New As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 288;BA.debugLine="UpdateLabel(New, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_updatelabel" /*RemoteObject*/ ,(Object)(_new),(Object)(b4xfloattextfield.__c.getField(true,"False")));
 BA.debugLineNum = 289;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TextCh";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TextChanged"))),(Object)(BA.numberCast(int.class, 2))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 290;BA.debugLine="CallSub3(mCallBack, mEventName & \"_TextChanged\",";
Debug.JustUpdateDeviceLine();
b4xfloattextfield.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TextChanged"))),(Object)((_old)),(Object)((_new)));
 };
 BA.debugLineNum = 292;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Update (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,245);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "b4xfloattextfield","update", __ref);}
RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
 BA.debugLineNum = 245;BA.debugLine="Public Sub Update";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 246;BA.debugLine="Dim f As B4XFont =  xui.CreateFont2(HintFont, Lar";
Debug.JustUpdateDeviceLine();
_f = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
_f = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFont2",(Object)(__ref.getField(false,"_hintfont" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_largelabeltextsize" /*RemoteObject*/ )));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 247;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
Debug.JustUpdateDeviceLine();
_r = __ref.getField(false,"_measuringcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(__ref.getField(true,"_hinttext" /*RemoteObject*/ )),(Object)(_f));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 248;BA.debugLine="LargeFocused = CreateBitmap(r, HintColor, f)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_largefocused" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_createbitmap" /*RemoteObject*/ ,(Object)(_r),(Object)(__ref.getField(true,"_hintcolor" /*RemoteObject*/ )),(Object)(_f)));
 BA.debugLineNum = 249;BA.debugLine="LargeNotFocused = CreateBitmap(r, NonFocusedHintC";
Debug.JustUpdateDeviceLine();
__ref.setField ("_largenotfocused" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_createbitmap" /*RemoteObject*/ ,(Object)(_r),(Object)(__ref.getField(true,"_nonfocusedhintcolor" /*RemoteObject*/ )),(Object)(_f)));
 BA.debugLineNum = 250;BA.debugLine="f = xui.CreateFont2(HintFont, SmallLabelTextSize)";
Debug.JustUpdateDeviceLine();
_f = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFont2",(Object)(__ref.getField(false,"_hintfont" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_smalllabeltextsize" /*RemoteObject*/ )));Debug.locals.put("f", _f);
 BA.debugLineNum = 251;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
Debug.JustUpdateDeviceLine();
_r = __ref.getField(false,"_measuringcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(__ref.getField(true,"_hinttext" /*RemoteObject*/ )),(Object)(_f));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 252;BA.debugLine="SmallFocused = CreateBitmap(r, HintColor, f)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_smallfocused" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_createbitmap" /*RemoteObject*/ ,(Object)(_r),(Object)(__ref.getField(true,"_hintcolor" /*RemoteObject*/ )),(Object)(_f)));
 BA.debugLineNum = 253;BA.debugLine="SmallNotFocused = CreateBitmap(r, NonFocusedHintC";
Debug.JustUpdateDeviceLine();
__ref.setField ("_smallnotfocused" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_createbitmap" /*RemoteObject*/ ,(Object)(_r),(Object)(__ref.getField(true,"_nonfocusedhintcolor" /*RemoteObject*/ )),(Object)(_f)));
 BA.debugLineNum = 254;BA.debugLine="UpdateLabel(mTextField.Text, True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xfloattextfield.class, "_updatelabel" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mtextfield" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(b4xfloattextfield.__c.getField(true,"True")));
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatelabel(RemoteObject __ref,RemoteObject _txt,RemoteObject _force) throws Exception{
try {
		Debug.PushSubsStack("UpdateLabel (b4xfloattextfield) ","b4xfloattextfield",17,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("updatelabel")) { return __ref.runUserSub(false, "b4xfloattextfield","updatelabel", __ref, _txt, _force);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _goingtolarge = RemoteObject.createImmutable(false);
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
Debug.locals.put("txt", _txt);
Debug.locals.put("force", _force);
 BA.debugLineNum = 210;BA.debugLine="Private Sub UpdateLabel (txt As String, force As B";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 211;BA.debugLine="For Each lbl As B4XView In Array As B4XView(lblCl";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = RemoteObject.createNewArray("anywheresoftware.b4a.objects.B4XViewWrapper",new int[] {2},new Object[] {__ref.getField(false,"_lblclear" /*RemoteObject*/ ),__ref.getField(false,"_lblv" /*RemoteObject*/ )});
final int groupLen1 = group1.getField(true,"length").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lbl = group1.getArrayElement(false,RemoteObject.createImmutable(index1));Debug.locals.put("lbl", _lbl);
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 212;BA.debugLine="If lbl.IsInitialized Then lbl.Visible = Focused";
Debug.JustUpdateDeviceLine();
if (_lbl.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_lbl.runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean(".",__ref.getField(true,"_focused" /*RemoteObject*/ )) && RemoteObject.solveBoolean(">",_txt.runMethod(true,"length"),BA.numberCast(double.class, 0))));};
 }
}Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 215;BA.debugLine="Dim GoingToLarge As Boolean = txt.Length = 0";
Debug.JustUpdateDeviceLine();
_goingtolarge = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_txt.runMethod(true,"length"),BA.numberCast(double.class, 0)));Debug.locals.put("GoingToLarge", _goingtolarge);Debug.locals.put("GoingToLarge", _goingtolarge);
 BA.debugLineNum = 216;BA.debugLine="If GoingToLarge = LargeLabel And force = False Th";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_goingtolarge,__ref.getField(true,"_largelabel" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",_force,b4xfloattextfield.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 217;BA.debugLine="Dim b As B4XBitmap";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 218;BA.debugLine="If Focused Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_focused" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 219;BA.debugLine="If GoingToLarge Then b = LargeFocused Else b = S";
Debug.JustUpdateDeviceLine();
if (_goingtolarge.<Boolean>get().booleanValue()) { 
_b = __ref.getField(false,"_largefocused" /*RemoteObject*/ );Debug.locals.put("b", _b);}
else {
_b = __ref.getField(false,"_smallfocused" /*RemoteObject*/ );Debug.locals.put("b", _b);};
 }else {
 BA.debugLineNum = 221;BA.debugLine="If GoingToLarge Then b = LargeNotFocused Else b";
Debug.JustUpdateDeviceLine();
if (_goingtolarge.<Boolean>get().booleanValue()) { 
_b = __ref.getField(false,"_largenotfocused" /*RemoteObject*/ );Debug.locals.put("b", _b);}
else {
_b = __ref.getField(false,"_smallnotfocused" /*RemoteObject*/ );Debug.locals.put("b", _b);};
 };
 BA.debugLineNum = 223;BA.debugLine="If b.IsInitialized = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b.runMethod(true,"IsInitialized"),b4xfloattextfield.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 224;BA.debugLine="HintImageView.SetBitmap(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_hintimageview" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_b.getObject())));
 BA.debugLineNum = 225;BA.debugLine="If GoingToLarge Then";
Debug.JustUpdateDeviceLine();
if (_goingtolarge.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 226;BA.debugLine="HintImageView.SetLayoutAnimated (AnimationDurati";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_hintimageview" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_animationduration" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, __ref.getField(true,"_hintlabellargeoffsetx" /*RemoteObject*/ ))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_b.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/-/",1, 0)),(Object)(_b.runMethod(true,"getWidth")),(Object)(_b.runMethod(true,"getHeight")));
 BA.debugLineNum = 227;BA.debugLine="LargeLabel = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_largelabel" /*RemoteObject*/ ,b4xfloattextfield.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 229;BA.debugLine="HintImageView.SetLayoutAnimated(AnimationDuratio";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_hintimageview" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_animationduration" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, __ref.getField(true,"_hintlabelsmalloffsetx" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_hintlabelsmalloffsety" /*RemoteObject*/ ))),(Object)(_b.runMethod(true,"getWidth")),(Object)(_b.runMethod(true,"getHeight")));
 BA.debugLineNum = 230;BA.debugLine="LargeLabel = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_largelabel" /*RemoteObject*/ ,b4xfloattextfield.__c.getField(true,"False"));
 };
 BA.debugLineNum = 232;BA.debugLine="End Sub";
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