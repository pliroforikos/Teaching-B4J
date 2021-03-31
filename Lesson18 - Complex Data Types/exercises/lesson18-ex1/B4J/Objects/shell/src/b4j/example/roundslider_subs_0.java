package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class roundslider_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (roundslider) ","roundslider",31,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "roundslider","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 84;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 85;BA.debugLine="cvs.Resize(Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Resize",(Object)(_width),(Object)(_height));
 BA.debugLineNum = 86;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnl" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 87;BA.debugLine="If thumb.IsInitialized = False Then CreateThumb";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_thumb" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),roundslider.__c.getField(true,"False"))) { 
__ref.runClassMethod (b4j.example.roundslider.class, "_createthumb" /*RemoteObject*/ );};
 BA.debugLineNum = 88;BA.debugLine="CircleRect.Initialize(ThumbSize + stroke, ThumbSi";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_circlerect" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_thumbsize" /*RemoteObject*/ ),__ref.getField(true,"_stroke" /*RemoteObject*/ )}, "+",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_thumbsize" /*RemoteObject*/ ),__ref.getField(true,"_stroke" /*RemoteObject*/ )}, "+",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,__ref.getField(true,"_thumbsize" /*RemoteObject*/ ),__ref.getField(true,"_stroke" /*RemoteObject*/ )}, "--",2, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_height,__ref.getField(true,"_thumbsize" /*RemoteObject*/ ),__ref.getField(true,"_stroke" /*RemoteObject*/ )}, "--",2, 0))));
 BA.debugLineNum = 89;BA.debugLine="xlbl.SetLayoutAnimated(0, CircleRect.Left, Circle";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xlbl" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, __ref.getField(false,"_circlerect" /*RemoteObject*/ ).runMethod(true,"getLeft"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_circlerect" /*RemoteObject*/ ).runMethod(true,"getTop"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_circlerect" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_circlerect" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 90;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.roundslider.class, "_draw" /*RemoteObject*/ );
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private mEventName As String 'ignore";
roundslider._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",roundslider._meventname);
 //BA.debugLineNum = 7;BA.debugLine="Private mCallBack As Object 'ignore";
roundslider._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",roundslider._mcallback);
 //BA.debugLineNum = 8;BA.debugLine="Public mBase As B4XView 'ignore";
roundslider._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",roundslider._mbase);
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI 'ignore";
roundslider._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",roundslider._xui);
 //BA.debugLineNum = 10;BA.debugLine="Private cvs As B4XCanvas";
roundslider._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvs",roundslider._cvs);
 //BA.debugLineNum = 11;BA.debugLine="Private mValue As Int = 75";
roundslider._mvalue = BA.numberCast(int.class, 75);__ref.setField("_mvalue",roundslider._mvalue);
 //BA.debugLineNum = 12;BA.debugLine="Private mMin, mMax As Int";
roundslider._mmin = RemoteObject.createImmutable(0);__ref.setField("_mmin",roundslider._mmin);
roundslider._mmax = RemoteObject.createImmutable(0);__ref.setField("_mmax",roundslider._mmax);
 //BA.debugLineNum = 13;BA.debugLine="Private thumb As B4XBitmap";
roundslider._thumb = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");__ref.setField("_thumb",roundslider._thumb);
 //BA.debugLineNum = 14;BA.debugLine="Private pnl As B4XView";
roundslider._pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnl",roundslider._pnl);
 //BA.debugLineNum = 15;BA.debugLine="Private xlbl As B4XView";
roundslider._xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xlbl",roundslider._xlbl);
 //BA.debugLineNum = 16;BA.debugLine="Private CircleRect As B4XRect";
roundslider._circlerect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");__ref.setField("_circlerect",roundslider._circlerect);
 //BA.debugLineNum = 17;BA.debugLine="Private ValueColor As Int";
roundslider._valuecolor = RemoteObject.createImmutable(0);__ref.setField("_valuecolor",roundslider._valuecolor);
 //BA.debugLineNum = 18;BA.debugLine="Private stroke As Int";
roundslider._stroke = RemoteObject.createImmutable(0);__ref.setField("_stroke",roundslider._stroke);
 //BA.debugLineNum = 19;BA.debugLine="Private ThumbSize As Int";
roundslider._thumbsize = RemoteObject.createImmutable(0);__ref.setField("_thumbsize",roundslider._thumbsize);
 //BA.debugLineNum = 20;BA.debugLine="Public Tag As Object";
roundslider._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",roundslider._tag);
 //BA.debugLineNum = 21;BA.debugLine="Private mThumbBorderColor As Int = 0xFF5B5B5B";
roundslider._mthumbbordercolor = BA.numberCast(int.class, 0xff5b5b5b);__ref.setField("_mthumbbordercolor",roundslider._mthumbbordercolor);
 //BA.debugLineNum = 22;BA.debugLine="Private mThumbInnerColor As Int = xui.Color_White";
roundslider._mthumbinnercolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White");__ref.setField("_mthumbinnercolor",roundslider._mthumbinnercolor);
 //BA.debugLineNum = 23;BA.debugLine="Private mCircleFillColor As Int = xui.Color_White";
roundslider._mcirclefillcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White");__ref.setField("_mcirclefillcolor",roundslider._mcirclefillcolor);
 //BA.debugLineNum = 24;BA.debugLine="Private mCircleNonValueColor As Int = 0xFFB6B6B6";
roundslider._mcirclenonvaluecolor = BA.numberCast(int.class, 0xffb6b6b6);__ref.setField("_mcirclenonvaluecolor",roundslider._mcirclenonvaluecolor);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createthumb(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateThumb (roundslider) ","roundslider",31,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("createthumb")) { return __ref.runUserSub(false, "roundslider","createthumb", __ref);}
RemoteObject _p = RemoteObject.declareNull("b4j.example.bcpath");
RemoteObject _r = RemoteObject.createImmutable(0);
RemoteObject _g = RemoteObject.createImmutable(0);
RemoteObject _l = RemoteObject.createImmutable(0);
RemoteObject _bc = RemoteObject.declareNull("b4j.example.bitmapcreator");
 BA.debugLineNum = 65;BA.debugLine="Private Sub CreateThumb";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="Dim p As BCPath";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("b4j.example.bcpath");Debug.locals.put("p", _p);
 BA.debugLineNum = 67;BA.debugLine="Dim r As Int = 80dip";
Debug.JustUpdateDeviceLine();
_r = roundslider.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 68;BA.debugLine="Dim g As Int = 8dip";
Debug.JustUpdateDeviceLine();
_g = roundslider.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)));Debug.locals.put("g", _g);Debug.locals.put("g", _g);
 BA.debugLineNum = 69;BA.debugLine="Dim l As Int = 28dip";
Debug.JustUpdateDeviceLine();
_l = roundslider.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 28)));Debug.locals.put("l", _l);Debug.locals.put("l", _l);
 BA.debugLineNum = 70;BA.debugLine="Dim bc As BitmapCreator";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("b4j.example.bitmapcreator");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 71;BA.debugLine="bc.Initialize(2 * r + g + 3dip, 2 * r + l + g)";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_r,_g,roundslider.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "*++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_r,_l,_g}, "*++",2, 1)));
 BA.debugLineNum = 72;BA.debugLine="p.Initialize(r - l + g, 2 * r - 2dip + g)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r,_l,_g}, "-+",2, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_r,roundslider.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))),_g}, "*-+",2, 1))));
 BA.debugLineNum = 73;BA.debugLine="p.LineTo(r + l + g, 2 * r - 2dip + g)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("_lineto",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r,_l,_g}, "++",2, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_r,roundslider.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))),_g}, "*-+",2, 1))));
 BA.debugLineNum = 74;BA.debugLine="p.LineTo(r + g, 2 * r + l + g)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("_lineto",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r,_g}, "+",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_r,_l,_g}, "*++",2, 1))));
 BA.debugLineNum = 75;BA.debugLine="p.LineTo(r - l + g, 2 * r - 2dip + g)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("_lineto",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r,_l,_g}, "-+",2, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_r,roundslider.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))),_g}, "*-+",2, 1))));
 BA.debugLineNum = 76;BA.debugLine="bc.DrawPath(p, mThumbBorderColor, True, 0)";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_drawpath",(Object)(_p),(Object)(__ref.getField(true,"_mthumbbordercolor" /*RemoteObject*/ )),(Object)(roundslider.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 77;BA.debugLine="bc.DrawCircle(r + g, r + g, r, mThumbInnerColor,";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_drawcircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r,_g}, "+",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r,_g}, "+",1, 1))),(Object)(BA.numberCast(float.class, _r)),(Object)(__ref.getField(true,"_mthumbinnercolor" /*RemoteObject*/ )),(Object)(roundslider.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 78;BA.debugLine="bc.DrawCircle(r + g, r + g, r, mThumbBorderColor,";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_drawcircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r,_g}, "+",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r,_g}, "+",1, 1))),(Object)(BA.numberCast(float.class, _r)),(Object)(__ref.getField(true,"_mthumbbordercolor" /*RemoteObject*/ )),(Object)(roundslider.__c.getField(true,"False")),(Object)(roundslider.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 79;BA.debugLine="thumb = bc.Bitmap";
Debug.JustUpdateDeviceLine();
__ref.setField ("_thumb" /*RemoteObject*/ ,_bc.runMethod(false,"_getbitmap"));
 BA.debugLineNum = 80;BA.debugLine="ThumbSize = thumb.Height / 4";
Debug.JustUpdateDeviceLine();
__ref.setField ("_thumbsize" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_thumb" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(4)}, "/",0, 0)));
 BA.debugLineNum = 81;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xlbl" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("DesignerCreateView (roundslider) ","roundslider",31,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "roundslider","designercreateview", __ref, _base, _lbl, _props);}
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
 BA.debugLineNum = 36;BA.debugLine="cvs.Initialize(mBase)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )));
 BA.debugLineNum = 37;BA.debugLine="mMin = Props.Get(\"Min\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mmin" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Min"))))));
 BA.debugLineNum = 38;BA.debugLine="mMax = Props.Get(\"Max\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mmax" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Max"))))));
 BA.debugLineNum = 39;BA.debugLine="pnl = xui.CreatePanel(\"pnl\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pnl" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnl"))));
 BA.debugLineNum = 40;BA.debugLine="xlbl = Lbl";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xlbl" /*RemoteObject*/ ).setObject (_lbl.getObject());
 BA.debugLineNum = 41;BA.debugLine="mBase.AddView(xlbl, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xlbl" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 42;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 43;BA.debugLine="ValueColor = xui.PaintOrColorToColor(Props.Get(\"V";
Debug.JustUpdateDeviceLine();
__ref.setField ("_valuecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ValueColor")))))));
 BA.debugLineNum = 44;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A")) || RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i"))) { 
 BA.debugLineNum = 45;BA.debugLine="stroke = 8dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_stroke" /*RemoteObject*/ ,roundslider.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8))));
 }else 
{ BA.debugLineNum = 46;BA.debugLine="Else If xui.IsB4J Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 47;BA.debugLine="stroke = 6dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_stroke" /*RemoteObject*/ ,roundslider.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 6))));
 }}
;
 BA.debugLineNum = 49;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.roundslider.class, "_base_resize" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
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
public static RemoteObject  _draw(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Draw (roundslider) ","roundslider",31,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("draw")) { return __ref.runUserSub(false, "roundslider","draw", __ref);}
RemoteObject _radius = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
RemoteObject _angle = RemoteObject.createImmutable(0);
RemoteObject _b4jstrokeoffset = RemoteObject.createImmutable(0);
RemoteObject _dest = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _r = RemoteObject.createImmutable(0);
RemoteObject _cx = RemoteObject.createImmutable(0);
RemoteObject _cy = RemoteObject.createImmutable(0);
 BA.debugLineNum = 93;BA.debugLine="Public Sub Draw";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 94;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 95;BA.debugLine="Dim radius As Int = CircleRect.Width / 2";
Debug.JustUpdateDeviceLine();
_radius = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_circlerect" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("radius", _radius);Debug.locals.put("radius", _radius);
 BA.debugLineNum = 96;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(__ref.getField(false,"_circlerect" /*RemoteObject*/ ).runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_circlerect" /*RemoteObject*/ ).runMethod(true,"getCenterY")),(Object)(BA.numberCast(float.class, _radius)),(Object)(__ref.getField(true,"_mcirclenonvaluecolor" /*RemoteObject*/ )),(Object)(roundslider.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, __ref.getField(true,"_stroke" /*RemoteObject*/ ))));
 BA.debugLineNum = 97;BA.debugLine="Dim p As B4XPath";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("p", _p);
 BA.debugLineNum = 98;BA.debugLine="Dim angle As Int = (mValue - mMin) / (mMax - mMin";
Debug.JustUpdateDeviceLine();
_angle = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mvalue" /*RemoteObject*/ ),__ref.getField(true,"_mmin" /*RemoteObject*/ )}, "-",1, 1)),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mmax" /*RemoteObject*/ ),__ref.getField(true,"_mmin" /*RemoteObject*/ )}, "-",1, 1)),RemoteObject.createImmutable(360)}, "/*",0, 0));Debug.locals.put("angle", _angle);Debug.locals.put("angle", _angle);
 BA.debugLineNum = 99;BA.debugLine="Dim B4JStrokeOffset As Int";
Debug.JustUpdateDeviceLine();
_b4jstrokeoffset = RemoteObject.createImmutable(0);Debug.locals.put("B4JStrokeOffset", _b4jstrokeoffset);
 BA.debugLineNum = 100;BA.debugLine="If xui.IsB4J Then B4JStrokeOffset = stroke / 2";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J").<Boolean>get().booleanValue()) { 
_b4jstrokeoffset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_stroke" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("B4JStrokeOffset", _b4jstrokeoffset);};
 BA.debugLineNum = 101;BA.debugLine="p.InitializeArc(CircleRect.CenterX, CircleRect.Ce";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeArc",(Object)(__ref.getField(false,"_circlerect" /*RemoteObject*/ ).runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_circlerect" /*RemoteObject*/ ).runMethod(true,"getCenterY")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_radius,_b4jstrokeoffset}, "+",1, 1))),(Object)(BA.numberCast(float.class, -(double) (0 + 90))),(Object)(BA.numberCast(float.class, _angle)));
 BA.debugLineNum = 102;BA.debugLine="cvs.DrawPath(p, ValueColor, False, stroke)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_p),(Object)(__ref.getField(true,"_valuecolor" /*RemoteObject*/ )),(Object)(roundslider.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, __ref.getField(true,"_stroke" /*RemoteObject*/ ))));
 BA.debugLineNum = 103;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(__ref.getField(false,"_circlerect" /*RemoteObject*/ ).runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_circlerect" /*RemoteObject*/ ).runMethod(true,"getCenterY")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_radius,_b4jstrokeoffset}, "-",1, 1))),(Object)(__ref.getField(true,"_mcirclefillcolor" /*RemoteObject*/ )),(Object)(roundslider.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 104;BA.debugLine="Dim dest As B4XRect";
Debug.JustUpdateDeviceLine();
_dest = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("dest", _dest);
 BA.debugLineNum = 105;BA.debugLine="Dim r As Int = radius + ThumbSize / 2 + stroke /";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_radius,__ref.getField(true,"_thumbsize" /*RemoteObject*/ ),RemoteObject.createImmutable(2),__ref.getField(true,"_stroke" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "+/+/",2, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 106;BA.debugLine="Dim cx As Int = CircleRect.CenterX + r * CosD(ang";
Debug.JustUpdateDeviceLine();
_cx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_circlerect" /*RemoteObject*/ ).runMethod(true,"getCenterX"),_r,roundslider.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_angle,RemoteObject.createImmutable(90)}, "-",1, 1))))}, "+*",1, 0));Debug.locals.put("cx", _cx);Debug.locals.put("cx", _cx);
 BA.debugLineNum = 107;BA.debugLine="Dim cy As Int = CircleRect.CenterY + r * SinD(ang";
Debug.JustUpdateDeviceLine();
_cy = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_circlerect" /*RemoteObject*/ ).runMethod(true,"getCenterY"),_r,roundslider.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_angle,RemoteObject.createImmutable(90)}, "-",1, 1))))}, "+*",1, 0));Debug.locals.put("cy", _cy);Debug.locals.put("cy", _cy);
 BA.debugLineNum = 108;BA.debugLine="dest.Initialize(cx - thumb.Width / 8, cy - ThumbS";
Debug.JustUpdateDeviceLine();
_dest.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cx,__ref.getField(false,"_thumb" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(8)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cy,__ref.getField(true,"_thumbsize" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cx,__ref.getField(false,"_thumb" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(8)}, "+/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cy,__ref.getField(true,"_thumbsize" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "+/",1, 0))));
 BA.debugLineNum = 109;BA.debugLine="cvs.DrawBitmapRotated(thumb, dest, angle)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawBitmapRotated",(Object)((__ref.getField(false,"_thumb" /*RemoteObject*/ ).getObject())),(Object)(_dest),(Object)(BA.numberCast(float.class, _angle)));
 BA.debugLineNum = 110;BA.debugLine="cvs.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 111;BA.debugLine="xlbl.Text = mValue";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(__ref.getField(true,"_mvalue" /*RemoteObject*/ )));
 BA.debugLineNum = 112;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("getValue (roundslider) ","roundslider",31,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "roundslider","getvalue", __ref);}
 BA.debugLineNum = 152;BA.debugLine="Public Sub getValue As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 153;BA.debugLine="Return mValue";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mvalue" /*RemoteObject*/ );
 BA.debugLineNum = 154;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (roundslider) ","roundslider",31,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "roundslider","initialize", __ref, _ba, _callback, _eventname);}
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
		Debug.PushSubsStack("pnl_MouseClicked (roundslider) ","roundslider",31,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("pnl_mouseclicked")) { return __ref.runUserSub(false, "roundslider","pnl_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 138;BA.debugLine="Private Sub pnl_MouseClicked(EventData As MouseEve";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 139;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("pnl_MousePressed (roundslider) ","roundslider",31,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("pnl_mousepressed")) { return __ref.runUserSub(false, "roundslider","pnl_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 134;BA.debugLine="Private Sub pnl_MousePressed (EventData As MouseEv";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 135;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_mousereleased(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("pnl_MouseReleased (roundslider) ","roundslider",31,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("pnl_mousereleased")) { return __ref.runUserSub(false, "roundslider","pnl_mousereleased", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 142;BA.debugLine="Private Sub pnl_MouseReleased(EventData As MouseEv";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 143;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("pnl_Touch (roundslider) ","roundslider",31,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("pnl_touch")) { return __ref.runUserSub(false, "roundslider","pnl_touch", __ref, _action, _x, _y);}
RemoteObject _dx = RemoteObject.createImmutable(0);
RemoteObject _dy = RemoteObject.createImmutable(0);
RemoteObject _dist = RemoteObject.createImmutable(0f);
RemoteObject _angle = RemoteObject.createImmutable(0);
RemoteObject _newvalue = RemoteObject.createImmutable(0);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 114;BA.debugLine="Private Sub pnl_Touch (Action As Int, X As Float,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="If Action = pnl.TOUCH_ACTION_MOVE_NOTOUCH Then Re";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_pnl" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE_NOTOUCH")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 116;BA.debugLine="Dim dx As Int = x - CircleRect.CenterX";
Debug.JustUpdateDeviceLine();
_dx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(false,"_circlerect" /*RemoteObject*/ ).runMethod(true,"getCenterX")}, "-",1, 0));Debug.locals.put("dx", _dx);Debug.locals.put("dx", _dx);
 BA.debugLineNum = 117;BA.debugLine="Dim dy As Int = y - CircleRect.CenterY";
Debug.JustUpdateDeviceLine();
_dy = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(false,"_circlerect" /*RemoteObject*/ ).runMethod(true,"getCenterY")}, "-",1, 0));Debug.locals.put("dy", _dy);Debug.locals.put("dy", _dy);
 BA.debugLineNum = 118;BA.debugLine="Dim dist As Float = Sqrt(Power(dx, 2) + Power(dy,";
Debug.JustUpdateDeviceLine();
_dist = BA.numberCast(float.class, roundslider.__c.runMethod(true,"Sqrt",(Object)(RemoteObject.solve(new RemoteObject[] {roundslider.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, _dx)),(Object)(BA.numberCast(double.class, 2))),roundslider.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, _dy)),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0))));Debug.locals.put("dist", _dist);Debug.locals.put("dist", _dist);
 BA.debugLineNum = 119;BA.debugLine="If dist > CircleRect.Width / 2 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_dist,RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_circlerect" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))) { 
 BA.debugLineNum = 120;BA.debugLine="Dim angle As Int = Round(ATan2D(dy, dx))";
Debug.JustUpdateDeviceLine();
_angle = BA.numberCast(int.class, roundslider.__c.runMethod(true,"Round",(Object)(roundslider.__c.runMethod(true,"ATan2D",(Object)(BA.numberCast(double.class, _dy)),(Object)(BA.numberCast(double.class, _dx))))));Debug.locals.put("angle", _angle);Debug.locals.put("angle", _angle);
 BA.debugLineNum = 121;BA.debugLine="angle = angle + 90";
Debug.JustUpdateDeviceLine();
_angle = RemoteObject.solve(new RemoteObject[] {_angle,RemoteObject.createImmutable(90)}, "+",1, 1);Debug.locals.put("angle", _angle);
 BA.debugLineNum = 122;BA.debugLine="angle = (angle + 360) Mod 360";
Debug.JustUpdateDeviceLine();
_angle = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_angle,RemoteObject.createImmutable(360)}, "+",1, 1)),RemoteObject.createImmutable(360)}, "%",0, 1);Debug.locals.put("angle", _angle);
 BA.debugLineNum = 123;BA.debugLine="Dim NewValue As Int = mMin + angle / 360 * (mMax";
Debug.JustUpdateDeviceLine();
_newvalue = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mmin" /*RemoteObject*/ ),_angle,RemoteObject.createImmutable(360),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mmax" /*RemoteObject*/ ),__ref.getField(true,"_mmin" /*RemoteObject*/ )}, "-",1, 1))}, "+/*",1, 0));Debug.locals.put("NewValue", _newvalue);Debug.locals.put("NewValue", _newvalue);
 BA.debugLineNum = 124;BA.debugLine="NewValue = Max(mMin, Min(mMax, NewValue))";
Debug.JustUpdateDeviceLine();
_newvalue = BA.numberCast(int.class, roundslider.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(true,"_mmin" /*RemoteObject*/ ))),(Object)(roundslider.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(true,"_mmax" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _newvalue))))));Debug.locals.put("NewValue", _newvalue);
 BA.debugLineNum = 125;BA.debugLine="If NewValue <> mValue Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_newvalue,BA.numberCast(double.class, __ref.getField(true,"_mvalue" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 126;BA.debugLine="mValue = NewValue";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mvalue" /*RemoteObject*/ ,_newvalue);
 BA.debugLineNum = 127;BA.debugLine="CallSub2(mCallBack, mEventName & \"_ValueChanged";
Debug.JustUpdateDeviceLine();
roundslider.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ValueChanged"))),(Object)((__ref.getField(true,"_mvalue" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 129;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.roundslider.class, "_draw" /*RemoteObject*/ );
 };
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcirclecolor(RemoteObject __ref,RemoteObject _nonvaluecolor,RemoteObject _innercolor) throws Exception{
try {
		Debug.PushSubsStack("SetCircleColor (roundslider) ","roundslider",31,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("setcirclecolor")) { return __ref.runUserSub(false, "roundslider","setcirclecolor", __ref, _nonvaluecolor, _innercolor);}
Debug.locals.put("NonValueColor", _nonvaluecolor);
Debug.locals.put("InnerColor", _innercolor);
 BA.debugLineNum = 59;BA.debugLine="Public Sub SetCircleColor (NonValueColor As Int, I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="mCircleNonValueColor = NonValueColor";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcirclenonvaluecolor" /*RemoteObject*/ ,_nonvaluecolor);
 BA.debugLineNum = 61;BA.debugLine="mCircleFillColor = InnerColor";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcirclefillcolor" /*RemoteObject*/ ,_innercolor);
 BA.debugLineNum = 62;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.roundslider.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setthumbcolor(RemoteObject __ref,RemoteObject _bordercolor,RemoteObject _innercolor) throws Exception{
try {
		Debug.PushSubsStack("SetThumbColor (roundslider) ","roundslider",31,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("setthumbcolor")) { return __ref.runUserSub(false, "roundslider","setthumbcolor", __ref, _bordercolor, _innercolor);}
Debug.locals.put("BorderColor", _bordercolor);
Debug.locals.put("InnerColor", _innercolor);
 BA.debugLineNum = 52;BA.debugLine="Public Sub SetThumbColor(BorderColor As Int, Inner";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 53;BA.debugLine="mThumbBorderColor = BorderColor";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mthumbbordercolor" /*RemoteObject*/ ,_bordercolor);
 BA.debugLineNum = 54;BA.debugLine="mThumbInnerColor = InnerColor";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mthumbinnercolor" /*RemoteObject*/ ,_innercolor);
 BA.debugLineNum = 55;BA.debugLine="CreateThumb";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.roundslider.class, "_createthumb" /*RemoteObject*/ );
 BA.debugLineNum = 56;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.roundslider.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 57;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setValue (roundslider) ","roundslider",31,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "roundslider","setvalue", __ref, _v);}
Debug.locals.put("v", _v);
 BA.debugLineNum = 147;BA.debugLine="Public Sub setValue (v As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 148;BA.debugLine="mValue = Max(mMin, Min(mMax, v))";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mvalue" /*RemoteObject*/ ,BA.numberCast(int.class, roundslider.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(true,"_mmin" /*RemoteObject*/ ))),(Object)(roundslider.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(true,"_mmax" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _v)))))));
 BA.debugLineNum = 149;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.roundslider.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 150;BA.debugLine="End Sub";
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