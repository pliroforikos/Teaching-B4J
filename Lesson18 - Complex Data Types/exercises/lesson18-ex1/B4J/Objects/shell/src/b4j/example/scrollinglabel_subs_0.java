package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class scrollinglabel_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (scrollinglabel) ","scrollinglabel",32,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "scrollinglabel","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 38;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 40;BA.debugLine="setText(mText)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.scrollinglabel.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mtext" /*RemoteObject*/ )));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private mEventName As String 'ignore";
scrollinglabel._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",scrollinglabel._meventname);
 //BA.debugLineNum = 4;BA.debugLine="Private mCallBack As Object 'ignore";
scrollinglabel._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",scrollinglabel._mcallback);
 //BA.debugLineNum = 5;BA.debugLine="Public mBase As B4XView";
scrollinglabel._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",scrollinglabel._mbase);
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI 'ignore";
scrollinglabel._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",scrollinglabel._xui);
 //BA.debugLineNum = 7;BA.debugLine="Private mText As String";
scrollinglabel._mtext = RemoteObject.createImmutable("");__ref.setField("_mtext",scrollinglabel._mtext);
 //BA.debugLineNum = 8;BA.debugLine="Private taskIndex As Int";
scrollinglabel._taskindex = RemoteObject.createImmutable(0);__ref.setField("_taskindex",scrollinglabel._taskindex);
 //BA.debugLineNum = 9;BA.debugLine="Private fnt As B4XFont";
scrollinglabel._fnt = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");__ref.setField("_fnt",scrollinglabel._fnt);
 //BA.debugLineNum = 10;BA.debugLine="Private cvs As B4XCanvas";
scrollinglabel._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvs",scrollinglabel._cvs);
 //BA.debugLineNum = 11;BA.debugLine="Public Tag As Object";
scrollinglabel._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",scrollinglabel._tag);
 //BA.debugLineNum = 12;BA.debugLine="Public WidthPerSecond As Int = 100dip";
scrollinglabel._widthpersecond = scrollinglabel.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)));__ref.setField("_widthpersecond",scrollinglabel._widthpersecond);
 //BA.debugLineNum = 13;BA.debugLine="Public StartPositionDelay As Int = 1000";
scrollinglabel._startpositiondelay = BA.numberCast(int.class, 1000);__ref.setField("_startpositiondelay",scrollinglabel._startpositiondelay);
 //BA.debugLineNum = 14;BA.debugLine="Private mTextColor As Int = xui.Color_Black";
scrollinglabel._mtextcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black");__ref.setField("_mtextcolor",scrollinglabel._mtextcolor);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (scrollinglabel) ","scrollinglabel",32,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "scrollinglabel","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 23;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 24;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 25;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 25;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 27;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 28;BA.debugLine="mBase.AddView(p, 0, 0, mBase.Width, mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 29;BA.debugLine="mText = Lbl.Text";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtext" /*RemoteObject*/ ,_lbl.runMethod(true,"getText"));
 BA.debugLineNum = 30;BA.debugLine="Dim l As B4XView = Lbl";
Debug.JustUpdateDeviceLine();
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("l", _l);
 BA.debugLineNum = 31;BA.debugLine="fnt = l.Font";
Debug.JustUpdateDeviceLine();
__ref.setField ("_fnt" /*RemoteObject*/ ,_l.runMethod(false,"getFont"));
 BA.debugLineNum = 32;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 33;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, scrollinglabel.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(double.class, scrollinglabel.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 34;BA.debugLine="cvs.Initialize(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_p));
 BA.debugLineNum = 35;BA.debugLine="setText(mText)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.scrollinglabel.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mtext" /*RemoteObject*/ )));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getText (scrollinglabel) ","scrollinglabel",32,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("gettext")) { return __ref.runUserSub(false, "scrollinglabel","gettext", __ref);}
 BA.debugLineNum = 91;BA.debugLine="Public Sub getText As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="Return mText";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mtext" /*RemoteObject*/ );
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettextcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTextColor (scrollinglabel) ","scrollinglabel",32,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("gettextcolor")) { return __ref.runUserSub(false, "scrollinglabel","gettextcolor", __ref);}
 BA.debugLineNum = 124;BA.debugLine="Public Sub getTextColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 125;BA.debugLine="Return mTextColor";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mtextcolor" /*RemoteObject*/ );
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (scrollinglabel) ","scrollinglabel",32,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "scrollinglabel","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 19;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 20;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _measuretextwidth(RemoteObject __ref,RemoteObject _s,RemoteObject _font1) throws Exception{
try {
		Debug.PushSubsStack("MeasureTextWidth (scrollinglabel) ","scrollinglabel",32,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("measuretextwidth")) { return __ref.runUserSub(false, "scrollinglabel","measuretextwidth", __ref, _s, _font1);}
Debug.locals.put("s", _s);
Debug.locals.put("font1", _font1);
 BA.debugLineNum = 115;BA.debugLine="Private Sub MeasureTextWidth(s As String, font1 As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 116;BA.debugLine="Return cvs.MeasureText(s, font1).Width";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(_s),(Object)(_font1)).runMethod(true,"getWidth");
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("setText (scrollinglabel) ","scrollinglabel",32,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "scrollinglabel","settext", __ref, _t);}
RemoteObject _needtocreatenewlabel = RemoteObject.createImmutable(false);
RemoteObject _parent = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _originaltextwidth = RemoteObject.createImmutable(0f);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _duplicatetext = RemoteObject.createImmutable("");
RemoteObject _width = RemoteObject.createImmutable(0f);
Debug.locals.put("t", _t);
 BA.debugLineNum = 43;BA.debugLine="Public Sub setText(t As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="Dim NeedToCreateNewLabel As Boolean = True";
Debug.JustUpdateDeviceLine();
_needtocreatenewlabel = scrollinglabel.__c.getField(true,"True");Debug.locals.put("NeedToCreateNewLabel", _needtocreatenewlabel);Debug.locals.put("NeedToCreateNewLabel", _needtocreatenewlabel);
 BA.debugLineNum = 45;BA.debugLine="Dim parent As B4XView = mBase.GetView(0)";
Debug.JustUpdateDeviceLine();
_parent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_parent = __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
 BA.debugLineNum = 46;BA.debugLine="If parent.NumberOfViews > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_parent.runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 48;BA.debugLine="Dim p As B4XView = parent.GetView(0)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = _parent.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 49;BA.debugLine="If p.Tag = \"static\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_p.runMethod(false,"getTag"),RemoteObject.createImmutable(("static")))) { 
 BA.debugLineNum = 50;BA.debugLine="NeedToCreateNewLabel = False";
Debug.JustUpdateDeviceLine();
_needtocreatenewlabel = scrollinglabel.__c.getField(true,"False");Debug.locals.put("NeedToCreateNewLabel", _needtocreatenewlabel);
 BA.debugLineNum = 51;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, parent.Width, pare";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_parent.runMethod(true,"getWidth")),(Object)(_parent.runMethod(true,"getHeight")));
 BA.debugLineNum = 52;BA.debugLine="Dim xlbl As B4XView = p.GetView(0)";
Debug.JustUpdateDeviceLine();
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("xlbl", _xlbl);Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 53;BA.debugLine="xlbl.SetLayoutAnimated(0, 0, 0, parent.Width, p";
Debug.JustUpdateDeviceLine();
_xlbl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_parent.runMethod(true,"getWidth")),(Object)(_parent.runMethod(true,"getHeight")));
 };
 };
 BA.debugLineNum = 57;BA.debugLine="Dim originalTextWidth As Float = MeasureTextWidth";
Debug.JustUpdateDeviceLine();
_originaltextwidth = __ref.runClassMethod (b4j.example.scrollinglabel.class, "_measuretextwidth" /*RemoteObject*/ ,(Object)(_t),(Object)(__ref.getField(false,"_fnt" /*RemoteObject*/ )));Debug.locals.put("originalTextWidth", _originaltextwidth);Debug.locals.put("originalTextWidth", _originaltextwidth);
 BA.debugLineNum = 58;BA.debugLine="mText = t";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtext" /*RemoteObject*/ ,_t);
 BA.debugLineNum = 59;BA.debugLine="If NeedToCreateNewLabel Then";
Debug.JustUpdateDeviceLine();
if (_needtocreatenewlabel.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 60;BA.debugLine="parent.RemoveAllViews";
Debug.JustUpdateDeviceLine();
_parent.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 61;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 62;BA.debugLine="parent.AddView(p, 0, 0, parent.Width, parent.Hei";
Debug.JustUpdateDeviceLine();
_parent.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_parent.runMethod(true,"getWidth")),(Object)(_parent.runMethod(true,"getHeight")));
 BA.debugLineNum = 63;BA.debugLine="Dim lbl As Label";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 64;BA.debugLine="lbl.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 69;BA.debugLine="Dim xlbl As B4XView = lbl";
Debug.JustUpdateDeviceLine();
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 70;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"LEFT\")";
Debug.JustUpdateDeviceLine();
_xlbl.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 71;BA.debugLine="xlbl.Font = fnt";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(false,"setFont",__ref.getField(false,"_fnt" /*RemoteObject*/ ));
 BA.debugLineNum = 73;BA.debugLine="p.AddView(xlbl, 0, 0, mBase.Width, mBase.Height)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("AddView",(Object)((_xlbl.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 };
 BA.debugLineNum = 75;BA.debugLine="xlbl.TextColor = mTextColor";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setTextColor",__ref.getField(true,"_mtextcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 76;BA.debugLine="If originalTextWidth <= mBase.Width Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_originaltextwidth,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))) { 
 BA.debugLineNum = 77;BA.debugLine="xlbl.Text = t";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setText",_t);
 BA.debugLineNum = 78;BA.debugLine="p.Tag = \"static\"";
Debug.JustUpdateDeviceLine();
_p.runMethod(false,"setTag",RemoteObject.createImmutable(("static")));
 BA.debugLineNum = 79;BA.debugLine="StopScrolling";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.scrollinglabel.class, "_stopscrolling" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 81;BA.debugLine="p.Tag = \"\"";
Debug.JustUpdateDeviceLine();
_p.runMethod(false,"setTag",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 82;BA.debugLine="Dim duplicateText As String = t & \"   \" & t";
Debug.JustUpdateDeviceLine();
_duplicatetext = RemoteObject.concat(_t,RemoteObject.createImmutable("   "),_t);Debug.locals.put("duplicateText", _duplicatetext);Debug.locals.put("duplicateText", _duplicatetext);
 BA.debugLineNum = 83;BA.debugLine="Dim Width As Float = MeasureTextWidth(duplicateT";
Debug.JustUpdateDeviceLine();
_width = __ref.runClassMethod (b4j.example.scrollinglabel.class, "_measuretextwidth" /*RemoteObject*/ ,(Object)(_duplicatetext),(Object)(__ref.getField(false,"_fnt" /*RemoteObject*/ )));Debug.locals.put("Width", _width);Debug.locals.put("Width", _width);
 BA.debugLineNum = 84;BA.debugLine="p.Width = Width";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setWidth",BA.numberCast(double.class, _width));
 BA.debugLineNum = 85;BA.debugLine="xlbl.Width = Width";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setWidth",BA.numberCast(double.class, _width));
 BA.debugLineNum = 86;BA.debugLine="xlbl.Text = duplicateText";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setText",_duplicatetext);
 BA.debugLineNum = 87;BA.debugLine="StartScrolling (p, originalTextWidth)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.scrollinglabel.class, "_startscrolling" /*void*/ ,(Object)(_p),(Object)(_originaltextwidth));
 };
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextcolor(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("setTextColor (scrollinglabel) ","scrollinglabel",32,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("settextcolor")) { return __ref.runUserSub(false, "scrollinglabel","settextcolor", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 119;BA.debugLine="Public Sub setTextColor(c As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 120;BA.debugLine="mTextColor = c";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextcolor" /*RemoteObject*/ ,_c);
 BA.debugLineNum = 121;BA.debugLine="setText(mText)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.scrollinglabel.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mtext" /*RemoteObject*/ )));
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _startscrolling(RemoteObject __ref,RemoteObject _p,RemoteObject _originalwidth) throws Exception{
try {
		Debug.PushSubsStack("StartScrolling (scrollinglabel) ","scrollinglabel",32,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("startscrolling")) { __ref.runUserSub(false, "scrollinglabel","startscrolling", __ref, _p, _originalwidth); return;}
ResumableSub_StartScrolling rsub = new ResumableSub_StartScrolling(null,__ref,_p,_originalwidth);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_StartScrolling extends BA.ResumableSub {
public ResumableSub_StartScrolling(b4j.example.scrollinglabel parent,RemoteObject __ref,RemoteObject _p,RemoteObject _originalwidth) {
this.parent = parent;
this.__ref = __ref;
this._p = _p;
this._originalwidth = _originalwidth;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.scrollinglabel parent;
RemoteObject _p;
RemoteObject _originalwidth;
RemoteObject _myindex = RemoteObject.createImmutable(0);
RemoteObject _duration = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("StartScrolling (scrollinglabel) ","scrollinglabel",32,__ref.getField(false, "ba"),__ref,99);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("p", _p);
Debug.locals.put("OriginalWidth", _originalwidth);
 BA.debugLineNum = 100;BA.debugLine="taskIndex = taskIndex + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_taskindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_taskindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 101;BA.debugLine="Dim myIndex As Int = taskIndex";
Debug.JustUpdateDeviceLine();
_myindex = __ref.getField(true,"_taskindex" /*RemoteObject*/ );Debug.locals.put("myIndex", _myindex);Debug.locals.put("myIndex", _myindex);
 BA.debugLineNum = 102;BA.debugLine="Dim duration As Int = p.Width / WidthPerSecond *";
Debug.JustUpdateDeviceLine();
_duration = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getWidth"),__ref.getField(true,"_widthpersecond" /*RemoteObject*/ ),RemoteObject.createImmutable(1000)}, "/*",0, 0));Debug.locals.put("duration", _duration);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 103;BA.debugLine="Sleep(StartPositionDelay)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "scrollinglabel", "startscrolling"),__ref.getField(true,"_startpositiondelay" /*RemoteObject*/ ));
this.state = 23;
return;
case 23:
//C
this.state = 1;
;
 BA.debugLineNum = 104;BA.debugLine="If myIndex <> taskIndex Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_myindex,BA.numberCast(double.class, __ref.getField(true,"_taskindex" /*RemoteObject*/ )))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 105;BA.debugLine="Do While True";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//do while
this.state = 22;
while (parent.__c.getField(true,"True").<Boolean>get().booleanValue()) {
this.state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 106;BA.debugLine="p.SetLayoutAnimated(duration, -(p.Width - Origin";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(_duration),(Object)(BA.numberCast(double.class, -(RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getWidth"),_originalwidth}, "-",1, 0)).<Double>get().doubleValue())),(Object)(_p.runMethod(true,"getTop")),(Object)(_p.runMethod(true,"getWidth")),(Object)(_p.runMethod(true,"getHeight")));
 BA.debugLineNum = 107;BA.debugLine="Sleep(duration)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "scrollinglabel", "startscrolling"),_duration);
this.state = 24;
return;
case 24:
//C
this.state = 10;
;
 BA.debugLineNum = 108;BA.debugLine="If myIndex <> taskIndex Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_myindex,BA.numberCast(double.class, __ref.getField(true,"_taskindex" /*RemoteObject*/ )))) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 109;BA.debugLine="Sleep(StartPositionDelay)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "scrollinglabel", "startscrolling"),__ref.getField(true,"_startpositiondelay" /*RemoteObject*/ ));
this.state = 25;
return;
case 25:
//C
this.state = 16;
;
 BA.debugLineNum = 110;BA.debugLine="If myIndex <> taskIndex Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 16:
//if
this.state = 21;
if (RemoteObject.solveBoolean("!",_myindex,BA.numberCast(double.class, __ref.getField(true,"_taskindex" /*RemoteObject*/ )))) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
if (true) return ;
if (true) break;

case 21:
//C
this.state = 7;
;
 BA.debugLineNum = 111;BA.debugLine="p.SetLayoutAnimated(0, 0, p.Top, p.Width, p.Heig";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_p.runMethod(true,"getTop")),(Object)(_p.runMethod(true,"getWidth")),(Object)(_p.runMethod(true,"getHeight")));
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _stopscrolling(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StopScrolling (scrollinglabel) ","scrollinglabel",32,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("stopscrolling")) { return __ref.runUserSub(false, "scrollinglabel","stopscrolling", __ref);}
 BA.debugLineNum = 95;BA.debugLine="Private Sub StopScrolling";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="taskIndex = taskIndex + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_taskindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_taskindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
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