package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xswitch_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width1,RemoteObject _height1) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4xswitch) ","b4xswitch",27,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "b4xswitch","base_resize", __ref, _width1, _height1);}
Debug.locals.put("Width1", _width1);
Debug.locals.put("Height1", _height1);
 BA.debugLineNum = 141;BA.debugLine="Private Sub Base_Resize (Width1 As Double, Height1";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 143;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private mEventName As String 'ignore";
b4xswitch._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4xswitch._meventname);
 //BA.debugLineNum = 9;BA.debugLine="Private mCallBack As Object 'ignore";
b4xswitch._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",b4xswitch._mcallback);
 //BA.debugLineNum = 10;BA.debugLine="Public mBase As B4XView 'ignore";
b4xswitch._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xswitch._mbase);
 //BA.debugLineNum = 11;BA.debugLine="Private xui As XUI 'ignore";
b4xswitch._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xswitch._xui);
 //BA.debugLineNum = 12;BA.debugLine="Private OnColor, OffColor As BCBrush";
b4xswitch._oncolor = RemoteObject.createNew ("b4j.example.bcpath._bcbrush");__ref.setField("_oncolor",b4xswitch._oncolor);
b4xswitch._offcolor = RemoteObject.createNew ("b4j.example.bcpath._bcbrush");__ref.setField("_offcolor",b4xswitch._offcolor);
 //BA.debugLineNum = 13;BA.debugLine="Private bc As BitmapCreator";
b4xswitch._bc = RemoteObject.createNew ("b4j.example.bitmapcreator");__ref.setField("_bc",b4xswitch._bc);
 //BA.debugLineNum = 14;BA.debugLine="Private Width As Int = 55dip";
b4xswitch._width = b4xswitch.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)));__ref.setField("_width",b4xswitch._width);
 //BA.debugLineNum = 15;BA.debugLine="Private Height As Int = 31dip";
b4xswitch._height = b4xswitch.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 31)));__ref.setField("_height",b4xswitch._height);
 //BA.debugLineNum = 16;BA.debugLine="Private ThumbColor As BCBrush";
b4xswitch._thumbcolor = RemoteObject.createNew ("b4j.example.bcpath._bcbrush");__ref.setField("_thumbcolor",b4xswitch._thumbcolor);
 //BA.debugLineNum = 17;BA.debugLine="Private iv As ImageView";
b4xswitch._iv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");__ref.setField("_iv",b4xswitch._iv);
 //BA.debugLineNum = 18;BA.debugLine="Private mValue As Boolean";
b4xswitch._mvalue = RemoteObject.createImmutable(false);__ref.setField("_mvalue",b4xswitch._mvalue);
 //BA.debugLineNum = 19;BA.debugLine="Private transparent As BCBrush";
b4xswitch._transparent = RemoteObject.createNew ("b4j.example.bcpath._bcbrush");__ref.setField("_transparent",b4xswitch._transparent);
 //BA.debugLineNum = 20;BA.debugLine="Private LoopIndex As Int";
b4xswitch._loopindex = RemoteObject.createImmutable(0);__ref.setField("_loopindex",b4xswitch._loopindex);
 //BA.debugLineNum = 21;BA.debugLine="Public Tag As Object";
b4xswitch._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",b4xswitch._tag);
 //BA.debugLineNum = 22;BA.debugLine="Private Scale As Float";
b4xswitch._scale = RemoteObject.createImmutable(0f);__ref.setField("_scale",b4xswitch._scale);
 //BA.debugLineNum = 23;BA.debugLine="Private mEnabled As Boolean = True";
b4xswitch._menabled = b4xswitch.__c.getField(true,"True");__ref.setField("_menabled",b4xswitch._menabled);
 //BA.debugLineNum = 24;BA.debugLine="Public mHaptic As Boolean";
b4xswitch._mhaptic = RemoteObject.createImmutable(false);__ref.setField("_mhaptic",b4xswitch._mhaptic);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (b4xswitch) ","b4xswitch",27,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "b4xswitch","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 33;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 35;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 35;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 36;BA.debugLine="mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(BA.numberCast(double.class, __ref.getField(true,"_width" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_height" /*RemoteObject*/ ))));
 BA.debugLineNum = 37;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 38;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"pnl\")";
Debug.JustUpdateDeviceLine();
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnl")));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 39;BA.debugLine="pnl.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
_pnl.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 40;BA.debugLine="iv.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_iv" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 41;BA.debugLine="mBase.AddView(iv, 0, 0, Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_iv" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, __ref.getField(true,"_width" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_height" /*RemoteObject*/ ))));
 BA.debugLineNum = 42;BA.debugLine="mBase.AddView(pnl, 0, 0, Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_pnl.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, __ref.getField(true,"_width" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_height" /*RemoteObject*/ ))));
 BA.debugLineNum = 44;BA.debugLine="bc.Initialize(Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_width" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_height" /*RemoteObject*/ )));
 BA.debugLineNum = 45;BA.debugLine="Scale = xui.Scale";
Debug.JustUpdateDeviceLine();
__ref.setField ("_scale" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getScale"));
 BA.debugLineNum = 50;BA.debugLine="OnColor = bc.CreateBrushFromColor(xui.PaintOrColo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_oncolor" /*RemoteObject*/ ,__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_createbrushfromcolor",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OnColor")))))))));
 BA.debugLineNum = 51;BA.debugLine="OffColor = bc.CreateBrushFromColor(xui.PaintOrCol";
Debug.JustUpdateDeviceLine();
__ref.setField ("_offcolor" /*RemoteObject*/ ,__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_createbrushfromcolor",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OffColor")))))))));
 BA.debugLineNum = 52;BA.debugLine="ThumbColor = bc.CreateBrushFromColor(xui.PaintOrC";
Debug.JustUpdateDeviceLine();
__ref.setField ("_thumbcolor" /*RemoteObject*/ ,__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_createbrushfromcolor",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ThumbColor")))))))));
 BA.debugLineNum = 53;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mhaptic" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("HapticFeedback"))),(Object)((b4xswitch.__c.getField(true,"False"))))));
 BA.debugLineNum = 54;BA.debugLine="transparent = bc.CreateBrushFromColor(xui.Color_T";
Debug.JustUpdateDeviceLine();
__ref.setField ("_transparent" /*RemoteObject*/ ,__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_createbrushfromcolor",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"))));
 BA.debugLineNum = 55;BA.debugLine="mEnabled = mBase.Enabled";
Debug.JustUpdateDeviceLine();
__ref.setField ("_menabled" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getEnabled"));
 BA.debugLineNum = 56;BA.debugLine="mBase.Enabled = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xswitch.__c.getField(true,"True"));
 BA.debugLineNum = 57;BA.debugLine="SetValueImpl(Props.Get(\"Value\"), True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xswitch.class, "_setvalueimpl" /*void*/ ,(Object)(BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))))),(Object)(b4xswitch.__c.getField(true,"True")));
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
public static RemoteObject  _draw(RemoteObject __ref,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("Draw (b4xswitch) ","b4xswitch",27,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("draw")) { return __ref.runUserSub(false, "b4xswitch","draw", __ref, _state);}
RemoteObject _r = RemoteObject.createImmutable(0f);
RemoteObject _cx = RemoteObject.createImmutable(0f);
RemoteObject _cy = RemoteObject.createImmutable(0);
RemoteObject _smallrect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _w = RemoteObject.createImmutable(0f);
RemoteObject _h = RemoteObject.createImmutable(0f);
Debug.locals.put("State", _state);
 BA.debugLineNum = 119;BA.debugLine="Private Sub Draw (State As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 120;BA.debugLine="bc.DrawRect2(bc.TargetRect, transparent, True, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawrect2",(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(false,"_targetrect")),(Object)(__ref.getField(false,"_transparent" /*RemoteObject*/ )),(Object)(b4xswitch.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 121;BA.debugLine="Dim r As Float = Round(bc.mHeight / 2)";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, b4xswitch.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mheight"),RemoteObject.createImmutable(2)}, "/",0, 0))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 122;BA.debugLine="Dim cx As Float = r - 1 * Scale + (bc.mWidth - 2";
Debug.JustUpdateDeviceLine();
_cx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r,RemoteObject.createImmutable(1),__ref.getField(true,"_scale" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mwidth"),RemoteObject.createImmutable(2),_r}, "-*",1, 0)),_state}, "-*+*",2, 0));Debug.locals.put("cx", _cx);Debug.locals.put("cx", _cx);
 BA.debugLineNum = 123;BA.debugLine="If State = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_state,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 124;BA.debugLine="cx = r";
Debug.JustUpdateDeviceLine();
_cx = _r;Debug.locals.put("cx", _cx);
 }else 
{ BA.debugLineNum = 125;BA.debugLine="Else If State = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_state,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 126;BA.debugLine="cx = Round(bc.mWidth - 1 * Scale - r)";
Debug.JustUpdateDeviceLine();
_cx = BA.numberCast(float.class, b4xswitch.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mwidth"),RemoteObject.createImmutable(1),__ref.getField(true,"_scale" /*RemoteObject*/ ),_r}, "-*-",2, 0))));Debug.locals.put("cx", _cx);
 }}
;
 BA.debugLineNum = 128;BA.debugLine="Dim cy As Int = bc.mHeight / 2";
Debug.JustUpdateDeviceLine();
_cy = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mheight"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("cy", _cy);Debug.locals.put("cy", _cy);
 BA.debugLineNum = 129;BA.debugLine="Dim smallrect As B4XRect";
Debug.JustUpdateDeviceLine();
_smallrect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("smallrect", _smallrect);
 BA.debugLineNum = 130;BA.debugLine="Dim w As Float = State * bc.mWidth";
Debug.JustUpdateDeviceLine();
_w = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_state,__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mwidth")}, "*",0, 0));Debug.locals.put("w", _w);Debug.locals.put("w", _w);
 BA.debugLineNum = 131;BA.debugLine="Dim h As Float = State * bc.mHeight";
Debug.JustUpdateDeviceLine();
_h = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_state,__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mheight")}, "*",0, 0));Debug.locals.put("h", _h);Debug.locals.put("h", _h);
 BA.debugLineNum = 132;BA.debugLine="If State < 1 Then bc.DrawRectRounded2(bc.TargetRe";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_state,BA.numberCast(double.class, 1))) { 
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawrectrounded2",(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(false,"_targetrect")),(Object)(__ref.getField(false,"_offcolor" /*RemoteObject*/ )),(Object)(b4xswitch.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),__ref.getField(true,"_scale" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(int.class, _r)));};
 BA.debugLineNum = 133;BA.debugLine="smallrect.Initialize(bc.mWidth / 2 - w / 2, cy -";
Debug.JustUpdateDeviceLine();
_smallrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mwidth"),RemoteObject.createImmutable(2),_w,RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cy,_h,RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mwidth"),RemoteObject.createImmutable(2),_w,RemoteObject.createImmutable(2)}, "/+/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cy,_h,RemoteObject.createImmutable(2)}, "+/",1, 0))));
 BA.debugLineNum = 134;BA.debugLine="If State > 0 Then bc.DrawRectRounded2(smallrect,";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_state,BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawrectrounded2",(Object)(_smallrect),(Object)(__ref.getField(false,"_oncolor" /*RemoteObject*/ )),(Object)(b4xswitch.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),__ref.getField(true,"_scale" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_smallrect.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));};
 BA.debugLineNum = 135;BA.debugLine="If mEnabled Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_menabled" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 136;BA.debugLine="bc.DrawCircle2(cx, cy, r - 2 * Scale, ThumbColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawcircle2",(Object)(_cx),(Object)(BA.numberCast(float.class, _cy)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r,RemoteObject.createImmutable(2),__ref.getField(true,"_scale" /*RemoteObject*/ )}, "-*",1, 0))),(Object)(__ref.getField(false,"_thumbcolor" /*RemoteObject*/ )),(Object)(b4xswitch.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 138;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, iv)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_setbitmaptoimageview",(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_getbitmap")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_iv" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 139;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("getEnabled (b4xswitch) ","b4xswitch",27,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("getenabled")) { return __ref.runUserSub(false, "b4xswitch","getenabled", __ref);}
 BA.debugLineNum = 115;BA.debugLine="Public Sub getEnabled As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 116;BA.debugLine="Return mEnabled";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_menabled" /*RemoteObject*/ );
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getValue (b4xswitch) ","b4xswitch",27,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "b4xswitch","getvalue", __ref);}
 BA.debugLineNum = 106;BA.debugLine="Public Sub getValue As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 107;BA.debugLine="Return mValue";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mvalue" /*RemoteObject*/ );
 BA.debugLineNum = 108;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (b4xswitch) ","b4xswitch",27,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xswitch","initialize", __ref, _ba, _callback, _eventname);}
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
public static RemoteObject  _pnl_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("Pnl_MouseClicked (b4xswitch) ","b4xswitch",27,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("pnl_mouseclicked")) { return __ref.runUserSub(false, "b4xswitch","pnl_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 67;BA.debugLine="Private Sub Pnl_MouseClicked (EventData As MouseEv";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 72;BA.debugLine="If mEnabled Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_menabled" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 73;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFeedb";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_mhaptic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
b4xswitch._xuiviewsutils.runVoidMethod ("_performhapticfeedback" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )));};
 BA.debugLineNum = 74;BA.debugLine="SetValueImpl(Not(mValue), False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xswitch.class, "_setvalueimpl" /*void*/ ,(Object)(b4xswitch.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_mvalue" /*RemoteObject*/ )))),(Object)(b4xswitch.__c.getField(true,"False")));
 BA.debugLineNum = 75;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ValueC";
Debug.JustUpdateDeviceLine();
b4xswitch.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ValueChanged"))),(Object)((__ref.getField(true,"_mvalue" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 77;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setEnabled (b4xswitch) ","b4xswitch",27,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("setenabled")) { return __ref.runUserSub(false, "b4xswitch","setenabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 110;BA.debugLine="Public Sub setEnabled (b As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 111;BA.debugLine="mEnabled = b";
Debug.JustUpdateDeviceLine();
__ref.setField ("_menabled" /*RemoteObject*/ ,_b);
 BA.debugLineNum = 112;BA.debugLine="SetValueImpl(mValue, True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xswitch.class, "_setvalueimpl" /*void*/ ,(Object)(__ref.getField(true,"_mvalue" /*RemoteObject*/ )),(Object)(b4xswitch.__c.getField(true,"True")));
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setValue (b4xswitch) ","b4xswitch",27,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "b4xswitch","setvalue", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 101;BA.debugLine="Public Sub setValue(b As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 102;BA.debugLine="If b = mValue Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,__ref.getField(true,"_mvalue" /*RemoteObject*/ ))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 103;BA.debugLine="SetValueImpl(b, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xswitch.class, "_setvalueimpl" /*void*/ ,(Object)(_b),(Object)(b4xswitch.__c.getField(true,"False")));
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _setvalueimpl(RemoteObject __ref,RemoteObject _b,RemoteObject _immediate) throws Exception{
try {
		Debug.PushSubsStack("SetValueImpl (b4xswitch) ","b4xswitch",27,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("setvalueimpl")) { __ref.runUserSub(false, "b4xswitch","setvalueimpl", __ref, _b, _immediate); return;}
ResumableSub_SetValueImpl rsub = new ResumableSub_SetValueImpl(null,__ref,_b,_immediate);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SetValueImpl extends BA.ResumableSub {
public ResumableSub_SetValueImpl(b4j.example.b4xswitch parent,RemoteObject __ref,RemoteObject _b,RemoteObject _immediate) {
this.parent = parent;
this.__ref = __ref;
this._b = _b;
this._immediate = _immediate;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xswitch parent;
RemoteObject _b;
RemoteObject _immediate;
RemoteObject _myindex = RemoteObject.createImmutable(0);
RemoteObject _start = RemoteObject.createImmutable(0L);
RemoteObject _duration = RemoteObject.createImmutable(0);
RemoteObject _state1 = RemoteObject.createImmutable(0f);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SetValueImpl (b4xswitch) ","b4xswitch",27,__ref.getField(false, "ba"),__ref,79);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("b", _b);
Debug.locals.put("Immediate", _immediate);
 BA.debugLineNum = 80;BA.debugLine="mValue = b";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mvalue" /*RemoteObject*/ ,_b);
 BA.debugLineNum = 81;BA.debugLine="LoopIndex = LoopIndex + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_loopindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_loopindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 82;BA.debugLine="If Immediate Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 41;
if (_immediate.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 83;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 11;
if (__ref.getField(true,"_mvalue" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
;}
else {
this.state = 8;
;}if (true) break;

case 6:
//C
this.state = 11;
__ref.runClassMethod (b4j.example.b4xswitch.class, "_draw" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 1)));
if (true) break;

case 8:
//C
this.state = 11;
__ref.runClassMethod (b4j.example.b4xswitch.class, "_draw" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 0)));
if (true) break;

case 11:
//C
this.state = 41;
;
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 85;BA.debugLine="Dim MyIndex As Int = LoopIndex";
Debug.JustUpdateDeviceLine();
_myindex = __ref.getField(true,"_loopindex" /*RemoteObject*/ );Debug.locals.put("MyIndex", _myindex);Debug.locals.put("MyIndex", _myindex);
 BA.debugLineNum = 86;BA.debugLine="Dim start As Long = DateTime.Now";
Debug.JustUpdateDeviceLine();
_start = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("start", _start);Debug.locals.put("start", _start);
 BA.debugLineNum = 87;BA.debugLine="Dim duration As Int = 200";
Debug.JustUpdateDeviceLine();
_duration = BA.numberCast(int.class, 200);Debug.locals.put("duration", _duration);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 88;BA.debugLine="Do While DateTime.Now < start + duration";
Debug.JustUpdateDeviceLine();
if (true) break;

case 14:
//do while
this.state = 29;
while (RemoteObject.solveBoolean("<",parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.solve(new RemoteObject[] {_start,_duration}, "+",1, 2))) {
this.state = 16;
if (true) break;
}
if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 89;BA.debugLine="Dim state1 As Float = (DateTime.Now - start) /";
Debug.JustUpdateDeviceLine();
_state1 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),_start}, "-",1, 2)),_duration}, "/",0, 0));Debug.locals.put("state1", _state1);Debug.locals.put("state1", _state1);
 BA.debugLineNum = 90;BA.debugLine="If mValue = False Then state1 = 1 - state1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 17:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mvalue" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 19;
;}if (true) break;

case 19:
//C
this.state = 22;
_state1 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_state1}, "-",1, 0));Debug.locals.put("state1", _state1);
if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 91;BA.debugLine="Draw(state1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xswitch.class, "_draw" /*RemoteObject*/ ,(Object)(_state1));
 BA.debugLineNum = 92;BA.debugLine="Sleep(16)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xswitch", "setvalueimpl"),BA.numberCast(int.class, 16));
this.state = 42;
return;
case 42:
//C
this.state = 23;
;
 BA.debugLineNum = 93;BA.debugLine="If MyIndex <> LoopIndex Then Exit";
Debug.JustUpdateDeviceLine();
if (true) break;

case 23:
//if
this.state = 28;
if (RemoteObject.solveBoolean("!",_myindex,BA.numberCast(double.class, __ref.getField(true,"_loopindex" /*RemoteObject*/ )))) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
this.state = 29;
if (true) break;
if (true) break;

case 28:
//C
this.state = 14;
;
 if (true) break;
;
 BA.debugLineNum = 95;BA.debugLine="If MyIndex = LoopIndex Then";
Debug.JustUpdateDeviceLine();

case 29:
//if
this.state = 40;
if (RemoteObject.solveBoolean("=",_myindex,BA.numberCast(double.class, __ref.getField(true,"_loopindex" /*RemoteObject*/ )))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 96;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
Debug.JustUpdateDeviceLine();
if (true) break;

case 32:
//if
this.state = 39;
if (__ref.getField(true,"_mvalue" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 34;
;}
else {
this.state = 36;
;}if (true) break;

case 34:
//C
this.state = 39;
__ref.runClassMethod (b4j.example.b4xswitch.class, "_draw" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 1)));
if (true) break;

case 36:
//C
this.state = 39;
__ref.runClassMethod (b4j.example.b4xswitch.class, "_draw" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 0)));
if (true) break;

case 39:
//C
this.state = 40;
;
 if (true) break;

case 40:
//C
this.state = 41;
;
 if (true) break;

case 41:
//C
this.state = -1;
;
 BA.debugLineNum = 99;BA.debugLine="End Sub";
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
}