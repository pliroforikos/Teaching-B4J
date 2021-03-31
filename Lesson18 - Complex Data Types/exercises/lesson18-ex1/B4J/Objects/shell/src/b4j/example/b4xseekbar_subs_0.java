package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xseekbar_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4xseekbar) ","b4xseekbar",25,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "b4xseekbar","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 52;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 53;BA.debugLine="cvs.Resize(Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Resize",(Object)(_width),(Object)(_height));
 BA.debugLineNum = 54;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_touchpanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 55;BA.debugLine="Vertical = mBase.Height > mBase.Width";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vertical" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))));
 BA.debugLineNum = 56;BA.debugLine="size = Max(mBase.Height, mBase.Width) - 2 * Radiu";
Debug.JustUpdateDeviceLine();
__ref.setField ("_size" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4xseekbar.__c.runMethod(true,"Max",(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),RemoteObject.createImmutable(2),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-*",1, 0)));
 BA.debugLineNum = 57;BA.debugLine="Update";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xseekbar.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 58;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 11;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private mEventName As String 'ignore";
b4xseekbar._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4xseekbar._meventname);
 //BA.debugLineNum = 13;BA.debugLine="Private mCallBack As Object 'ignore";
b4xseekbar._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",b4xseekbar._mcallback);
 //BA.debugLineNum = 14;BA.debugLine="Public mBase As B4XView 'ignore";
b4xseekbar._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xseekbar._mbase);
 //BA.debugLineNum = 15;BA.debugLine="Private xui As XUI 'ignore";
b4xseekbar._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xseekbar._xui);
 //BA.debugLineNum = 16;BA.debugLine="Public Color1, Color2, ThumbColor As Int";
b4xseekbar._color1 = RemoteObject.createImmutable(0);__ref.setField("_color1",b4xseekbar._color1);
b4xseekbar._color2 = RemoteObject.createImmutable(0);__ref.setField("_color2",b4xseekbar._color2);
b4xseekbar._thumbcolor = RemoteObject.createImmutable(0);__ref.setField("_thumbcolor",b4xseekbar._thumbcolor);
 //BA.debugLineNum = 17;BA.debugLine="Private cvs As B4XCanvas";
b4xseekbar._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvs",b4xseekbar._cvs);
 //BA.debugLineNum = 18;BA.debugLine="Public Tag As Object";
b4xseekbar._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",b4xseekbar._tag);
 //BA.debugLineNum = 19;BA.debugLine="Private TouchPanel As B4XView";
b4xseekbar._touchpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_touchpanel",b4xseekbar._touchpanel);
 //BA.debugLineNum = 20;BA.debugLine="Private mValue As Int";
b4xseekbar._mvalue = RemoteObject.createImmutable(0);__ref.setField("_mvalue",b4xseekbar._mvalue);
 //BA.debugLineNum = 21;BA.debugLine="Public MinValue, MaxValue As Int";
b4xseekbar._minvalue = RemoteObject.createImmutable(0);__ref.setField("_minvalue",b4xseekbar._minvalue);
b4xseekbar._maxvalue = RemoteObject.createImmutable(0);__ref.setField("_maxvalue",b4xseekbar._maxvalue);
 //BA.debugLineNum = 22;BA.debugLine="Public Interval As Int = 1";
b4xseekbar._interval = BA.numberCast(int.class, 1);__ref.setField("_interval",b4xseekbar._interval);
 //BA.debugLineNum = 23;BA.debugLine="Private Vertical As Boolean";
b4xseekbar._vertical = RemoteObject.createImmutable(false);__ref.setField("_vertical",b4xseekbar._vertical);
 //BA.debugLineNum = 24;BA.debugLine="Public Size1 = 4dip, Size2 = 2dip, Radius1 = 6dip";
b4xseekbar._size1 = b4xseekbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)));__ref.setField("_size1",b4xseekbar._size1);
b4xseekbar._size2 = b4xseekbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)));__ref.setField("_size2",b4xseekbar._size2);
b4xseekbar._radius1 = b4xseekbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 6)));__ref.setField("_radius1",b4xseekbar._radius1);
b4xseekbar._radius2 = b4xseekbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)));__ref.setField("_radius2",b4xseekbar._radius2);
 //BA.debugLineNum = 25;BA.debugLine="Private Pressed As Boolean";
b4xseekbar._pressed = RemoteObject.createImmutable(false);__ref.setField("_pressed",b4xseekbar._pressed);
 //BA.debugLineNum = 26;BA.debugLine="Private size As Int";
b4xseekbar._size = RemoteObject.createImmutable(0);__ref.setField("_size",b4xseekbar._size);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (b4xseekbar) ","b4xseekbar",25,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "b4xseekbar","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 35;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 36;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 37;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 37;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 38;BA.debugLine="Color1 = xui.PaintOrColorToColor(Props.Get(\"Color";
Debug.JustUpdateDeviceLine();
__ref.setField ("_color1" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Color1")))))));
 BA.debugLineNum = 39;BA.debugLine="Color2 = xui.PaintOrColorToColor(Props.Get(\"Color";
Debug.JustUpdateDeviceLine();
__ref.setField ("_color2" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Color2")))))));
 BA.debugLineNum = 40;BA.debugLine="ThumbColor = xui.PaintOrColorToColor(Props.Get(\"T";
Debug.JustUpdateDeviceLine();
__ref.setField ("_thumbcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ThumbColor")))))));
 BA.debugLineNum = 41;BA.debugLine="Interval = Max(1, Props.GetDefault(\"Interval\", 1)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_interval" /*RemoteObject*/ ,BA.numberCast(int.class, b4xseekbar.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 1)),(Object)(BA.numberCast(double.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Interval"))),(Object)(RemoteObject.createImmutable((1)))))))));
 BA.debugLineNum = 42;BA.debugLine="MinValue = Props.Get(\"Min\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_minvalue" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Min"))))));
 BA.debugLineNum = 43;BA.debugLine="MaxValue = Props.Get(\"Max\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_maxvalue" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Max"))))));
 BA.debugLineNum = 44;BA.debugLine="mValue = Max(MinValue, Min(MaxValue, Props.Get(\"V";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mvalue" /*RemoteObject*/ ,BA.numberCast(int.class, b4xseekbar.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(true,"_minvalue" /*RemoteObject*/ ))),(Object)(b4xseekbar.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(true,"_maxvalue" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))))))))));
 BA.debugLineNum = 45;BA.debugLine="cvs.Initialize(mBase)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )));
 BA.debugLineNum = 46;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_touchpanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("TouchPanel"))));
 BA.debugLineNum = 47;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_touchpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 48;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then Radius2 = 20dip";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A")) || RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i"))) { 
__ref.setField ("_radius2" /*RemoteObject*/ ,b4xseekbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))));};
 BA.debugLineNum = 49;BA.debugLine="If xui.IsB4A Then Base_Resize(mBase.Width, mBase.";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A").<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.b4xseekbar.class, "_base_resize" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));};
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getValue (b4xseekbar) ","b4xseekbar",25,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "b4xseekbar","getvalue", __ref);}
 BA.debugLineNum = 130;BA.debugLine="Public Sub getValue As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 131;BA.debugLine="Return mValue";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mvalue" /*RemoteObject*/ );
 BA.debugLineNum = 132;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (b4xseekbar) ","b4xseekbar",25,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xseekbar","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 29;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 30;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 31;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _raisetouchstateevent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RaiseTouchStateEvent (b4xseekbar) ","b4xseekbar",25,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("raisetouchstateevent")) { return __ref.runUserSub(false, "b4xseekbar","raisetouchstateevent", __ref);}
 BA.debugLineNum = 102;BA.debugLine="Private Sub RaiseTouchStateEvent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 103;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchS";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TouchStateChanged"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 104;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_TouchS";
Debug.JustUpdateDeviceLine();
b4xseekbar.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TouchStateChanged"))),(Object)((__ref.getField(true,"_pressed" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("setValue (b4xseekbar) ","b4xseekbar",25,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "b4xseekbar","setvalue", __ref, _v);}
Debug.locals.put("v", _v);
 BA.debugLineNum = 125;BA.debugLine="Public Sub setValue(v As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 126;BA.debugLine="mValue = Max(MinValue, Min(MaxValue, v))";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mvalue" /*RemoteObject*/ ,BA.numberCast(int.class, b4xseekbar.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(true,"_minvalue" /*RemoteObject*/ ))),(Object)(b4xseekbar.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(true,"_maxvalue" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _v)))))));
 BA.debugLineNum = 127;BA.debugLine="Update";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xseekbar.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvaluebasedontouch(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("SetValueBasedOnTouch (b4xseekbar) ","b4xseekbar",25,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("setvaluebasedontouch")) { return __ref.runUserSub(false, "b4xseekbar","setvaluebasedontouch", __ref, _x, _y);}
RemoteObject _v = RemoteObject.createImmutable(0);
RemoteObject _newvalue = RemoteObject.createImmutable(0);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 108;BA.debugLine="Private Sub SetValueBasedOnTouch(x As Int, y As In";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="Dim v As Int";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createImmutable(0);Debug.locals.put("v", _v);
 BA.debugLineNum = 110;BA.debugLine="If Vertical Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_vertical" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 111;BA.debugLine="v = (mBase.Height - Radius2 - y) / size * (MaxVa";
Debug.JustUpdateDeviceLine();
_v = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_radius2" /*RemoteObject*/ ),_y}, "--",2, 0)),__ref.getField(true,"_size" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxvalue" /*RemoteObject*/ ),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "-",1, 1)),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "/*+",1, 0));Debug.locals.put("v", _v);
 }else {
 BA.debugLineNum = 113;BA.debugLine="v = (x - Radius2) / size * (MaxValue - MinValue)";
Debug.JustUpdateDeviceLine();
_v = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-",1, 1)),__ref.getField(true,"_size" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxvalue" /*RemoteObject*/ ),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "-",1, 1)),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "/*+",1, 0));Debug.locals.put("v", _v);
 };
 BA.debugLineNum = 115;BA.debugLine="v = Round (v / Interval) * Interval";
Debug.JustUpdateDeviceLine();
_v = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4xseekbar.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_v,__ref.getField(true,"_interval" /*RemoteObject*/ )}, "/",0, 0))),__ref.getField(true,"_interval" /*RemoteObject*/ )}, "*",0, 2));Debug.locals.put("v", _v);
 BA.debugLineNum = 116;BA.debugLine="Dim NewValue As Int = Max(MinValue, Min(MaxValue,";
Debug.JustUpdateDeviceLine();
_newvalue = BA.numberCast(int.class, b4xseekbar.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(true,"_minvalue" /*RemoteObject*/ ))),(Object)(b4xseekbar.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(true,"_maxvalue" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _v))))));Debug.locals.put("NewValue", _newvalue);Debug.locals.put("NewValue", _newvalue);
 BA.debugLineNum = 117;BA.debugLine="If NewValue <> mValue Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_newvalue,BA.numberCast(double.class, __ref.getField(true,"_mvalue" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 118;BA.debugLine="mValue = NewValue";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mvalue" /*RemoteObject*/ ,_newvalue);
 BA.debugLineNum = 119;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Value";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ValueChanged"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 120;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Value";
Debug.JustUpdateDeviceLine();
b4xseekbar.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ValueChanged"))),(Object)((__ref.getField(true,"_mvalue" /*RemoteObject*/ ))));
 };
 };
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
public static RemoteObject  _touchpanel_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("TouchPanel_Touch (b4xseekbar) ","b4xseekbar",25,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("touchpanel_touch")) { return __ref.runUserSub(false, "b4xseekbar","touchpanel_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 88;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 89;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_DOWN Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_touchpanel" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_DOWN")))) { 
 BA.debugLineNum = 90;BA.debugLine="Pressed = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pressed" /*RemoteObject*/ ,b4xseekbar.__c.getField(true,"True"));
 BA.debugLineNum = 91;BA.debugLine="RaiseTouchStateEvent";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xseekbar.class, "_raisetouchstateevent" /*RemoteObject*/ );
 BA.debugLineNum = 92;BA.debugLine="SetValueBasedOnTouch(X, Y)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xseekbar.class, "_setvaluebasedontouch" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)));
 }else 
{ BA.debugLineNum = 93;BA.debugLine="Else If Action = TouchPanel.TOUCH_ACTION_MOVE The";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_touchpanel" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE")))) { 
 BA.debugLineNum = 94;BA.debugLine="SetValueBasedOnTouch(X, Y)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xseekbar.class, "_setvaluebasedontouch" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)));
 }else 
{ BA.debugLineNum = 95;BA.debugLine="Else If Action = TouchPanel.TOUCH_ACTION_UP Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_touchpanel" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_UP")))) { 
 BA.debugLineNum = 96;BA.debugLine="Pressed = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pressed" /*RemoteObject*/ ,b4xseekbar.__c.getField(true,"False"));
 BA.debugLineNum = 97;BA.debugLine="RaiseTouchStateEvent";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xseekbar.class, "_raisetouchstateevent" /*RemoteObject*/ );
 }}}
;
 BA.debugLineNum = 99;BA.debugLine="Update";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xseekbar.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 100;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Update (b4xseekbar) ","b4xseekbar",25,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "b4xseekbar","update", __ref);}
RemoteObject _s1 = RemoteObject.createImmutable(0);
RemoteObject _y = RemoteObject.createImmutable(0);
RemoteObject _x = RemoteObject.createImmutable(0);
 BA.debugLineNum = 61;BA.debugLine="Public Sub Update";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 64;BA.debugLine="If size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_size" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 65;BA.debugLine="If Vertical = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_vertical" /*RemoteObject*/ ),b4xseekbar.__c.getField(true,"False"))) { 
 BA.debugLineNum = 66;BA.debugLine="Dim s1 As Int = Radius2 + (mValue - MinValue) /";
Debug.JustUpdateDeviceLine();
_s1 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius2" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mvalue" /*RemoteObject*/ ),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "-",1, 1)),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxvalue" /*RemoteObject*/ ),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "-",1, 1)),__ref.getField(true,"_size" /*RemoteObject*/ )}, "+/*",1, 0));Debug.locals.put("s1", _s1);Debug.locals.put("s1", _s1);
 BA.debugLineNum = 67;BA.debugLine="Dim y As Int = mBase.Height / 2";
Debug.JustUpdateDeviceLine();
_y = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("y", _y);Debug.locals.put("y", _y);
 BA.debugLineNum = 68;BA.debugLine="cvs.DrawLine(Radius2, y, s1, y, Color1, Size1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, __ref.getField(true,"_radius2" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, _y)),(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, _y)),(Object)(__ref.getField(true,"_color1" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, __ref.getField(true,"_size1" /*RemoteObject*/ ))));
 BA.debugLineNum = 69;BA.debugLine="cvs.DrawLine(s1, y, mBase.Width - Radius2, y, C";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, _y)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-",1, 0))),(Object)(BA.numberCast(float.class, _y)),(Object)(__ref.getField(true,"_color2" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, __ref.getField(true,"_size2" /*RemoteObject*/ ))));
 BA.debugLineNum = 70;BA.debugLine="cvs.DrawCircle(s1, y, Radius1, Color1, True, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, _y)),(Object)(BA.numberCast(float.class, __ref.getField(true,"_radius1" /*RemoteObject*/ ))),(Object)(__ref.getField(true,"_color1" /*RemoteObject*/ )),(Object)(b4xseekbar.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 71;BA.debugLine="If Pressed Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_pressed" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 72;BA.debugLine="cvs.DrawCircle(s1, y, Radius2, ThumbColor, Tru";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, _y)),(Object)(BA.numberCast(float.class, __ref.getField(true,"_radius2" /*RemoteObject*/ ))),(Object)(__ref.getField(true,"_thumbcolor" /*RemoteObject*/ )),(Object)(b4xseekbar.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 };
 }else {
 BA.debugLineNum = 75;BA.debugLine="Dim s1 As Int = Radius2 + (MaxValue - mValue -";
Debug.JustUpdateDeviceLine();
_s1 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius2" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxvalue" /*RemoteObject*/ ),__ref.getField(true,"_mvalue" /*RemoteObject*/ ),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "--",2, 1)),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxvalue" /*RemoteObject*/ ),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "-",1, 1)),__ref.getField(true,"_size" /*RemoteObject*/ )}, "+/*",1, 0));Debug.locals.put("s1", _s1);Debug.locals.put("s1", _s1);
 BA.debugLineNum = 76;BA.debugLine="Dim x As Int = mBase.Width / 2";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 77;BA.debugLine="cvs.DrawLine(x, Radius2, x, s1, Color2, Size2)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, __ref.getField(true,"_radius2" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, _s1)),(Object)(__ref.getField(true,"_color2" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, __ref.getField(true,"_size2" /*RemoteObject*/ ))));
 BA.debugLineNum = 78;BA.debugLine="cvs.DrawLine(x, s1, x, mBase.Height - Radius2,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-",1, 0))),(Object)(__ref.getField(true,"_color1" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, __ref.getField(true,"_size1" /*RemoteObject*/ ))));
 BA.debugLineNum = 79;BA.debugLine="cvs.DrawCircle(x, s1, Radius1, Color1, True, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, __ref.getField(true,"_radius1" /*RemoteObject*/ ))),(Object)(__ref.getField(true,"_color1" /*RemoteObject*/ )),(Object)(b4xseekbar.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 80;BA.debugLine="If Pressed Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_pressed" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 81;BA.debugLine="cvs.DrawCircle(x, s1, Radius2, ThumbColor, Tru";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, __ref.getField(true,"_radius2" /*RemoteObject*/ ))),(Object)(__ref.getField(true,"_thumbcolor" /*RemoteObject*/ )),(Object)(b4xseekbar.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 };
 };
 };
 BA.debugLineNum = 85;BA.debugLine="cvs.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 86;BA.debugLine="End Sub";
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