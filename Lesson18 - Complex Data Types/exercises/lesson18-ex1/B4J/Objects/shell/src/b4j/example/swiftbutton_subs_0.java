package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class swiftbutton_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (swiftbutton) ","swiftbutton",33,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "swiftbutton","base_resize", __ref, _width, _height);}
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 53;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="cvs.Resize(Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Resize",(Object)(_width),(Object)(_height));
 BA.debugLineNum = 55;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group2 = __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetAllViewsRecursive");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group2.runMethod(false,"Get",index2));
Debug.locals.put("v", _v);
 BA.debugLineNum = 56;BA.debugLine="v.SetLayoutAnimated(0, 0, 0, Width, Height)";
Debug.JustUpdateDeviceLine();
_v.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_width),(Object)(_height));
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 58;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.swiftbutton.class, "_draw" /*RemoteObject*/ );
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 13;BA.debugLine="Private mEventName As String 'ignore";
swiftbutton._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",swiftbutton._meventname);
 //BA.debugLineNum = 14;BA.debugLine="Private mCallBack As Object 'ignore";
swiftbutton._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",swiftbutton._mcallback);
 //BA.debugLineNum = 15;BA.debugLine="Public mBase As B4XView 'ignore";
swiftbutton._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",swiftbutton._mbase);
 //BA.debugLineNum = 16;BA.debugLine="Private xui As XUI 'ignore";
swiftbutton._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",swiftbutton._xui);
 //BA.debugLineNum = 17;BA.debugLine="Private cvs As B4XCanvas";
swiftbutton._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvs",swiftbutton._cvs);
 //BA.debugLineNum = 18;BA.debugLine="Public xLBL As B4XView";
swiftbutton._xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xlbl",swiftbutton._xlbl);
 //BA.debugLineNum = 19;BA.debugLine="Public clr1, clr2, disabledColor As Int";
swiftbutton._clr1 = RemoteObject.createImmutable(0);__ref.setField("_clr1",swiftbutton._clr1);
swiftbutton._clr2 = RemoteObject.createImmutable(0);__ref.setField("_clr2",swiftbutton._clr2);
swiftbutton._disabledcolor = RemoteObject.createImmutable(0);__ref.setField("_disabledcolor",swiftbutton._disabledcolor);
 //BA.debugLineNum = 20;BA.debugLine="Private pressed As Boolean";
swiftbutton._pressed = RemoteObject.createImmutable(false);__ref.setField("_pressed",swiftbutton._pressed);
 //BA.debugLineNum = 21;BA.debugLine="Public Tag As Object";
swiftbutton._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",swiftbutton._tag);
 //BA.debugLineNum = 22;BA.debugLine="Private mDisabled As Boolean";
swiftbutton._mdisabled = RemoteObject.createImmutable(false);__ref.setField("_mdisabled",swiftbutton._mdisabled);
 //BA.debugLineNum = 23;BA.debugLine="Public CornersRadius, SideHeight As Int";
swiftbutton._cornersradius = RemoteObject.createImmutable(0);__ref.setField("_cornersradius",swiftbutton._cornersradius);
swiftbutton._sideheight = RemoteObject.createImmutable(0);__ref.setField("_sideheight",swiftbutton._sideheight);
 //BA.debugLineNum = 24;BA.debugLine="Public mHaptic As Boolean";
swiftbutton._mhaptic = RemoteObject.createImmutable(false);__ref.setField("_mhaptic",swiftbutton._mhaptic);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (swiftbutton) ","swiftbutton",33,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "swiftbutton","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 32;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 33;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 35;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"p\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("p")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 36;BA.debugLine="p.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 37;BA.debugLine="clr1 = xui.PaintOrColorToColor(Props.Get(\"Primary";
Debug.JustUpdateDeviceLine();
__ref.setField ("_clr1" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PrimaryColor")))))));
 BA.debugLineNum = 38;BA.debugLine="clr2 = xui.PaintOrColorToColor(Props.Get(\"Seconda";
Debug.JustUpdateDeviceLine();
__ref.setField ("_clr2" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SecondaryColor")))))));
 BA.debugLineNum = 39;BA.debugLine="disabledColor = xui.PaintOrColorToColor(Props.Get";
Debug.JustUpdateDeviceLine();
__ref.setField ("_disabledcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("DisabledColor"))),(Object)(RemoteObject.createImmutable((0xff999999)))))));
 BA.debugLineNum = 40;BA.debugLine="CornersRadius = DipToCurrent(Props.GetDefault(\"Co";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cornersradius" /*RemoteObject*/ ,swiftbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("CornersRadius"))),(Object)(RemoteObject.createImmutable((15))))))));
 BA.debugLineNum = 41;BA.debugLine="SideHeight = DipToCurrent(Props.GetDefault(\"SideH";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sideheight" /*RemoteObject*/ ,swiftbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("SideHeight"))),(Object)(RemoteObject.createImmutable((5))))))));
 BA.debugLineNum = 42;BA.debugLine="mDisabled = Not(Props.GetDefault(\"ButtonEnabled\",";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mdisabled" /*RemoteObject*/ ,swiftbutton.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ButtonEnabled"))),(Object)((swiftbutton.__c.getField(true,"True"))))))));
 BA.debugLineNum = 43;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mhaptic" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("HapticFeedback"))),(Object)((swiftbutton.__c.getField(true,"False"))))));
 BA.debugLineNum = 44;BA.debugLine="pressed = mDisabled";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pressed" /*RemoteObject*/ ,__ref.getField(true,"_mdisabled" /*RemoteObject*/ ));
 BA.debugLineNum = 45;BA.debugLine="xLBL = Lbl";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xlbl" /*RemoteObject*/ ).setObject (_lbl.getObject());
 BA.debugLineNum = 46;BA.debugLine="mBase.AddView(xLBL, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xlbl" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 47;BA.debugLine="mBase.AddView(p, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 48;BA.debugLine="xLBL.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xlbl" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 49;BA.debugLine="cvs.Initialize(mBase)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )));
 BA.debugLineNum = 50;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.swiftbutton.class, "_base_resize" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Draw (swiftbutton) ","swiftbutton",33,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("draw")) { return __ref.runUserSub(false, "swiftbutton","draw", __ref);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
RemoteObject _c = RemoteObject.createImmutable(0);
 BA.debugLineNum = 120;BA.debugLine="Private Sub Draw";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 121;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 122;BA.debugLine="Dim r As B4XRect";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("r", _r);
 BA.debugLineNum = 123;BA.debugLine="Dim p As B4XPath";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("p", _p);
 BA.debugLineNum = 124;BA.debugLine="r.Initialize(0, SideHeight, mBase.Width, mBase.He";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, __ref.getField(true,"_sideheight" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 125;BA.debugLine="If pressed = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_pressed" /*RemoteObject*/ ),swiftbutton.__c.getField(true,"False"))) { 
 BA.debugLineNum = 126;BA.debugLine="xLBL.Top = 0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(double.class, 0));
 BA.debugLineNum = 127;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeRoundedRect",(Object)(_r),(Object)(BA.numberCast(float.class, __ref.getField(true,"_cornersradius" /*RemoteObject*/ ))));
 BA.debugLineNum = 128;BA.debugLine="cvs.DrawPath(p, clr2, True, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_p),(Object)(__ref.getField(true,"_clr2" /*RemoteObject*/ )),(Object)(swiftbutton.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 129;BA.debugLine="r.Initialize(0, 0, mBase.Width, mBase.Height - S";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_sideheight" /*RemoteObject*/ )}, "-",1, 0))));
 BA.debugLineNum = 130;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeRoundedRect",(Object)(_r),(Object)(BA.numberCast(float.class, __ref.getField(true,"_cornersradius" /*RemoteObject*/ ))));
 BA.debugLineNum = 131;BA.debugLine="cvs.DrawPath(p, clr1, True, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_p),(Object)(__ref.getField(true,"_clr1" /*RemoteObject*/ )),(Object)(swiftbutton.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 }else {
 BA.debugLineNum = 133;BA.debugLine="xLBL.Top = SideHeight";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(double.class, __ref.getField(true,"_sideheight" /*RemoteObject*/ )));
 BA.debugLineNum = 134;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeRoundedRect",(Object)(_r),(Object)(BA.numberCast(float.class, __ref.getField(true,"_cornersradius" /*RemoteObject*/ ))));
 BA.debugLineNum = 135;BA.debugLine="Dim c As Int";
Debug.JustUpdateDeviceLine();
_c = RemoteObject.createImmutable(0);Debug.locals.put("c", _c);
 BA.debugLineNum = 136;BA.debugLine="If mDisabled Then c = disabledColor Else c = clr";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_mdisabled" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_c = __ref.getField(true,"_disabledcolor" /*RemoteObject*/ );Debug.locals.put("c", _c);}
else {
_c = __ref.getField(true,"_clr1" /*RemoteObject*/ );Debug.locals.put("c", _c);};
 BA.debugLineNum = 137;BA.debugLine="cvs.DrawPath(p, c, True, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_p),(Object)(_c),(Object)(swiftbutton.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 };
 BA.debugLineNum = 140;BA.debugLine="cvs.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getenabled(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getEnabled (swiftbutton) ","swiftbutton",33,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("getenabled")) { return __ref.runUserSub(false, "swiftbutton","getenabled", __ref);}
 BA.debugLineNum = 61;BA.debugLine="Public Sub getEnabled As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="Return Not(mDisabled)";
Debug.JustUpdateDeviceLine();
if (true) return swiftbutton.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_mdisabled" /*RemoteObject*/ )));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (swiftbutton) ","swiftbutton",33,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "swiftbutton","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 28;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 29;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _p_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("p_MouseClicked (swiftbutton) ","swiftbutton",33,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("p_mouseclicked")) { return __ref.runUserSub(false, "swiftbutton","p_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 105;BA.debugLine="Private Sub p_MouseClicked (EventData As MouseEven";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 106;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
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
public static RemoteObject  _p_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("p_Touch (swiftbutton) ","swiftbutton",33,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("p_touch")) { return __ref.runUserSub(false, "swiftbutton","p_touch", __ref, _action, _x, _y);}
RemoteObject _inside = RemoteObject.createImmutable(false);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 71;BA.debugLine="Private Sub p_Touch (Action As Int, X As Float, Y";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 72;BA.debugLine="If mDisabled Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_mdisabled" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 73;BA.debugLine="Dim Inside As Boolean = x > 0 And x < mBase.Width";
Debug.JustUpdateDeviceLine();
_inside = BA.ObjectToBoolean(RemoteObject.solveBoolean(">",_x,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("<",_x,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")) && RemoteObject.solveBoolean(">",_y,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("<",_y,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));Debug.locals.put("Inside", _inside);Debug.locals.put("Inside", _inside);
 BA.debugLineNum = 74;BA.debugLine="Select Action";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_action,__ref.getField(false,"_mbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_DOWN"),__ref.getField(false,"_mbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE"),__ref.getField(false,"_mbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_UP"))) {
case 0: {
 BA.debugLineNum = 76;BA.debugLine="SetPressedState(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.swiftbutton.class, "_setpressedstate" /*RemoteObject*/ ,(Object)(swiftbutton.__c.getField(true,"True")));
 BA.debugLineNum = 77;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.swiftbutton.class, "_draw" /*RemoteObject*/ );
 break; }
case 1: {
 BA.debugLineNum = 79;BA.debugLine="If pressed <> Inside Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_pressed" /*RemoteObject*/ ),_inside)) { 
 BA.debugLineNum = 80;BA.debugLine="SetPressedState(Inside)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.swiftbutton.class, "_setpressedstate" /*RemoteObject*/ ,(Object)(_inside));
 BA.debugLineNum = 81;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.swiftbutton.class, "_draw" /*RemoteObject*/ );
 };
 break; }
case 2: {
 BA.debugLineNum = 84;BA.debugLine="SetPressedState(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.swiftbutton.class, "_setpressedstate" /*RemoteObject*/ ,(Object)(swiftbutton.__c.getField(true,"False")));
 BA.debugLineNum = 85;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.swiftbutton.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 86;BA.debugLine="If Inside Then";
Debug.JustUpdateDeviceLine();
if (_inside.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 87;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFee";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_mhaptic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
swiftbutton._xuiviewsutils.runVoidMethod ("_performhapticfeedback" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )));};
 BA.debugLineNum = 88;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Click";
Debug.JustUpdateDeviceLine();
swiftbutton.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Click"))));
 };
 break; }
}
;
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolors(RemoteObject __ref,RemoteObject _primary,RemoteObject _secondary) throws Exception{
try {
		Debug.PushSubsStack("SetColors (swiftbutton) ","swiftbutton",33,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("setcolors")) { return __ref.runUserSub(false, "swiftbutton","setcolors", __ref, _primary, _secondary);}
Debug.locals.put("Primary", _primary);
Debug.locals.put("Secondary", _secondary);
 BA.debugLineNum = 110;BA.debugLine="Public Sub SetColors(Primary As Int, Secondary As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 111;BA.debugLine="clr1 = Primary";
Debug.JustUpdateDeviceLine();
__ref.setField ("_clr1" /*RemoteObject*/ ,_primary);
 BA.debugLineNum = 112;BA.debugLine="clr2 = Secondary";
Debug.JustUpdateDeviceLine();
__ref.setField ("_clr2" /*RemoteObject*/ ,_secondary);
 BA.debugLineNum = 113;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.swiftbutton.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setenabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setEnabled (swiftbutton) ","swiftbutton",33,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("setenabled")) { return __ref.runUserSub(false, "swiftbutton","setenabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 65;BA.debugLine="Public Sub setEnabled(b As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="mDisabled = Not(b)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mdisabled" /*RemoteObject*/ ,swiftbutton.__c.runMethod(true,"Not",(Object)(_b)));
 BA.debugLineNum = 67;BA.debugLine="pressed = mDisabled";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pressed" /*RemoteObject*/ ,__ref.getField(true,"_mdisabled" /*RemoteObject*/ ));
 BA.debugLineNum = 68;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.swiftbutton.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpressedstate(RemoteObject __ref,RemoteObject _newstate) throws Exception{
try {
		Debug.PushSubsStack("SetPressedState (swiftbutton) ","swiftbutton",33,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("setpressedstate")) { return __ref.runUserSub(false, "swiftbutton","setpressedstate", __ref, _newstate);}
Debug.locals.put("NewState", _newstate);
 BA.debugLineNum = 93;BA.debugLine="Private Sub SetPressedState(NewState As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 94;BA.debugLine="If pressed = NewState Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_pressed" /*RemoteObject*/ ),_newstate)) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 95;BA.debugLine="If NewState And xui.SubExists(mCallBack, mEventNa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_newstate) && RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ButtonDown"))),(Object)(BA.numberCast(int.class, 0))))) { 
 BA.debugLineNum = 96;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_ButtonD";
Debug.JustUpdateDeviceLine();
swiftbutton.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ButtonDown"))));
 };
 BA.debugLineNum = 98;BA.debugLine="If NewState = False And xui.SubExists(mCallBack,";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_newstate,swiftbutton.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ButtonUp"))),(Object)(BA.numberCast(int.class, 0))))) { 
 BA.debugLineNum = 99;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_ButtonU";
Debug.JustUpdateDeviceLine();
swiftbutton.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ButtonUp"))));
 };
 BA.debugLineNum = 101;BA.debugLine="pressed= NewState";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pressed" /*RemoteObject*/ ,_newstate);
 BA.debugLineNum = 102;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Update (swiftbutton) ","swiftbutton",33,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "swiftbutton","update", __ref);}
 BA.debugLineNum = 116;BA.debugLine="Public Sub Update";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 117;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.swiftbutton.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 118;BA.debugLine="End Sub";
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