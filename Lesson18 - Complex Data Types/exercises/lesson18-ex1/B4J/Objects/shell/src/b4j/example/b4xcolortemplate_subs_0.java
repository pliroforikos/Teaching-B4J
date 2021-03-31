package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xcolortemplate_subs_0 {


public static RemoteObject  _alpha_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("Alpha_Touch (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,263);
if (RapidSub.canDelegate("alpha_touch")) { return __ref.runUserSub(false, "b4xcolortemplate","alpha_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 263;BA.debugLine="Private Sub Alpha_Touch (Action As Int, X As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 264;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE_NOTOUCH")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 265;BA.debugLine="AlphaBarSelectedChange(x)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_alphabarselectedchange" /*RemoteObject*/ ,(Object)(_x));
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _alphabarselectedchange(RemoteObject __ref,RemoteObject _x) throws Exception{
try {
		Debug.PushSubsStack("AlphaBarSelectedChange (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("alphabarselectedchange")) { return __ref.runUserSub(false, "b4xcolortemplate","alphabarselectedchange", __ref, _x);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
Debug.locals.put("x", _x);
 BA.debugLineNum = 147;BA.debugLine="Private Sub AlphaBarSelectedChange(x As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 148;BA.debugLine="SelectedAlpha = 255 * Max(0, Min(1, x / AlphaBar.";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selectedalpha" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(255),b4xcolortemplate.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(b4xcolortemplate.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "/",0, 0)))))}, "*",0, 0)));
 BA.debugLineNum = 149;BA.debugLine="x = SelectedAlpha / 255 * AlphaBar.pnl.Width";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedalpha" /*RemoteObject*/ ),RemoteObject.createImmutable(255),__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "/*",0, 0));Debug.locals.put("x", _x);
 BA.debugLineNum = 150;BA.debugLine="AlphaBar.cvs.ClearRect(AlphaBar.cvs.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 151;BA.debugLine="Dim r As B4XRect";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("r", _r);
 BA.debugLineNum = 152;BA.debugLine="r.Initialize(x - 3dip, 1dip, x + 3dip, AlphaBar.c";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x,b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "-",1, 0))),(Object)(BA.numberCast(float.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x,b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getBottom"),b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 0))));
 BA.debugLineNum = 153;BA.debugLine="AlphaBar.cvs.DrawRect(r, xui.Color_Black, True, 2";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(_r),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black")),(Object)(b4xcolortemplate.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 154;BA.debugLine="AlphaBar.cvs.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 155;BA.debugLine="Update";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "b4xcolortemplate","base_resize", __ref, _width, _height);}
RemoteObject _r = RemoteObject.createImmutable(0);
RemoteObject _w = RemoteObject.createImmutable(0);
RemoteObject _cpp = RemoteObject.declareNull("b4j.example.b4xcolortemplate._colorpickerpart");
int _i = 0;
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 51;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 53;BA.debugLine="ColorScale = Max(1, Max(Width, Height) / 100 / De";
Debug.JustUpdateDeviceLine();
__ref.setField ("_colorscale" /*RemoteObject*/ ,BA.numberCast(float.class, b4xcolortemplate.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {b4xcolortemplate.__c.runMethod(true,"Max",(Object)(_width),(Object)(_height)),RemoteObject.createImmutable(100),__ref.getField(true,"_devicescale" /*RemoteObject*/ )}, "//",0, 0)))));
 BA.debugLineNum = 54;BA.debugLine="HueBar.pnl.SetLayoutAnimated(0, 1dip, 1dip, 30dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))))),(Object)(RemoteObject.solve(new RemoteObject[] {_height,b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 0)));
 BA.debugLineNum = 55;BA.debugLine="Dim r As Int = HueBar.pnl.Width + HueBar.pnl.Left";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getLeft"),b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "++",2, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 56;BA.debugLine="Dim w As Int = Width - r - 1dip";
Debug.JustUpdateDeviceLine();
_w = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,_r,b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "--",2, 0));Debug.locals.put("w", _w);Debug.locals.put("w", _w);
 BA.debugLineNum = 57;BA.debugLine="If xui.IsB4i Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 58;BA.debugLine="r = r - 1";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.solve(new RemoteObject[] {_r,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("r", _r);
 BA.debugLineNum = 59;BA.debugLine="w = w + 1";
Debug.JustUpdateDeviceLine();
_w = RemoteObject.solve(new RemoteObject[] {_w,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("w", _w);
 };
 BA.debugLineNum = 61;BA.debugLine="AlphaBar.pnl.SetLayoutAnimated(0, r, Height - 31d";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, _r)),(Object)(RemoteObject.solve(new RemoteObject[] {_height,b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 31)))}, "-",1, 0)),(Object)(BA.numberCast(double.class, _w)),(Object)(BA.numberCast(double.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))))));
 BA.debugLineNum = 62;BA.debugLine="ColorPicker.pnl.SetLayoutAnimated(0, r, 1dip, w,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, _r)),(Object)(BA.numberCast(double.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, _w)),(Object)(RemoteObject.solve(new RemoteObject[] {_height,b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))),__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "--",2, 0)));
 BA.debugLineNum = 63;BA.debugLine="bcColors.Initialize(ColorPicker.pnl.Width / Color";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bccolors" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_colorscale" /*RemoteObject*/ )}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_colorscale" /*RemoteObject*/ )}, "/",0, 0))));
 BA.debugLineNum = 64;BA.debugLine="For Each cpp As ColorPickerPart In Array(HueBar,";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group12 = RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(__ref.getField(false,"_huebar" /*RemoteObject*/ )),(__ref.getField(false,"_colorpicker" /*RemoteObject*/ )),(__ref.getField(false,"_alphabar" /*RemoteObject*/ ))});
final int groupLen12 = group12.getField(true,"length").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_cpp = (group12.getArrayElement(false,RemoteObject.createImmutable(index12)));Debug.locals.put("cpp", _cpp);
Debug.locals.put("cpp", _cpp);
 BA.debugLineNum = 65;BA.debugLine="For i = 0 To cpp.pnl.NumberOfViews - 1";
Debug.JustUpdateDeviceLine();
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {_cpp.getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 66;BA.debugLine="cpp.pnl.GetView(i).SetLayoutAnimated(0, 0, 0, c";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"pnl" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_cpp.getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_cpp.getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 68;BA.debugLine="cpp.cvs.Resize(cpp.pnl.Width, cpp.pnl.Height)";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("Resize",(Object)(_cpp.getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_cpp.getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 69;BA.debugLine="If cpp.DrawCheckers Then";
Debug.JustUpdateDeviceLine();
if (_cpp.getField(true,"DrawCheckers" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 70;BA.debugLine="DrawCheckers(cpp)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_drawcheckers" /*RemoteObject*/ ,(Object)(_cpp));
 };
 }
}Debug.locals.put("cpp", _cpp);
;
 BA.debugLineNum = 73;BA.debugLine="DrawHueBar";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_drawhuebar" /*RemoteObject*/ );
 BA.debugLineNum = 74;BA.debugLine="DrawAlphaBar";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_drawalphabar" /*RemoteObject*/ );
 BA.debugLineNum = 75;BA.debugLine="HueBarSelectedChanged (selectedH / 360 * HueBar.p";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_huebarselectedchanged" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedh" /*RemoteObject*/ ),RemoteObject.createImmutable(360),__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "/*",0, 0))));
 BA.debugLineNum = 76;BA.debugLine="AlphaBarSelectedChange (SelectedAlpha / 255 * Alp";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_alphabarselectedchange" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedalpha" /*RemoteObject*/ ),RemoteObject.createImmutable(255),__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "/*",0, 0))));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public mBase As B4XView 'ignore";
b4xcolortemplate._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xcolortemplate._mbase);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xcolortemplate._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xcolortemplate._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private SelectedAlpha As Int = 255";
b4xcolortemplate._selectedalpha = BA.numberCast(int.class, 255);__ref.setField("_selectedalpha",b4xcolortemplate._selectedalpha);
 //BA.debugLineNum = 5;BA.debugLine="Private bcColors As BitmapCreator";
b4xcolortemplate._bccolors = RemoteObject.createNew ("b4j.example.bitmapcreator");__ref.setField("_bccolors",b4xcolortemplate._bccolors);
 //BA.debugLineNum = 6;BA.debugLine="Private selectedH = 60, selectedS = 0.5, selected";
b4xcolortemplate._selectedh = BA.numberCast(float.class, 60);__ref.setField("_selectedh",b4xcolortemplate._selectedh);
b4xcolortemplate._selecteds = BA.numberCast(float.class, 0.5);__ref.setField("_selecteds",b4xcolortemplate._selecteds);
b4xcolortemplate._selectedv = BA.numberCast(float.class, 0.5);__ref.setField("_selectedv",b4xcolortemplate._selectedv);
 //BA.debugLineNum = 7;BA.debugLine="Private DeviceScale, ColorScale As Float";
b4xcolortemplate._devicescale = RemoteObject.createImmutable(0f);__ref.setField("_devicescale",b4xcolortemplate._devicescale);
b4xcolortemplate._colorscale = RemoteObject.createImmutable(0f);__ref.setField("_colorscale",b4xcolortemplate._colorscale);
 //BA.debugLineNum = 8;BA.debugLine="Private tempBC As BitmapCreator";
b4xcolortemplate._tempbc = RemoteObject.createNew ("b4j.example.bitmapcreator");__ref.setField("_tempbc",b4xcolortemplate._tempbc);
 //BA.debugLineNum = 9;BA.debugLine="Private const DONT_CHANGE As Int = -999999999";
b4xcolortemplate._dont_change = BA.numberCast(int.class, -(double) (0 + 999999999));__ref.setField("_dont_change",b4xcolortemplate._dont_change);
 //BA.debugLineNum = 10;BA.debugLine="Type ColorPickerPart (cvs As B4XCanvas, pnl As B4";
;
 //BA.debugLineNum = 11;BA.debugLine="Private HueBar, ColorPicker, AlphaBar As ColorPic";
b4xcolortemplate._huebar = RemoteObject.createNew ("b4j.example.b4xcolortemplate._colorpickerpart");__ref.setField("_huebar",b4xcolortemplate._huebar);
b4xcolortemplate._colorpicker = RemoteObject.createNew ("b4j.example.b4xcolortemplate._colorpickerpart");__ref.setField("_colorpicker",b4xcolortemplate._colorpicker);
b4xcolortemplate._alphabar = RemoteObject.createNew ("b4j.example.b4xcolortemplate._colorpickerpart");__ref.setField("_alphabar",b4xcolortemplate._alphabar);
 //BA.debugLineNum = 12;BA.debugLine="Private BordersColor As Int";
b4xcolortemplate._borderscolor = RemoteObject.createImmutable(0);__ref.setField("_borderscolor",b4xcolortemplate._borderscolor);
 //BA.debugLineNum = 13;BA.debugLine="Private xDialog As B4XDialog";
b4xcolortemplate._xdialog = RemoteObject.createNew ("b4j.example.b4xdialog");__ref.setField("_xdialog",b4xcolortemplate._xdialog);
 //BA.debugLineNum = 14;BA.debugLine="Private InitialColor() As Object";
b4xcolortemplate._initialcolor = RemoteObject.createNewArray ("Object", new int[] {0}, new Object[]{});__ref.setField("_initialcolor",b4xcolortemplate._initialcolor);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _colors_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("Colors_Touch (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,253);
if (RapidSub.canDelegate("colors_touch")) { return __ref.runUserSub(false, "b4xcolortemplate","colors_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 253;BA.debugLine="Private Sub Colors_Touch (Action As Int, X As Floa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 254;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE_NOTOUCH")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 255;BA.debugLine="HandleSelectedColorChanged(X, Y)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_handleselectedcolorchanged" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)));
 BA.debugLineNum = 256;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _colortohsv(RemoteObject __ref,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("ColorToHSV (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,199);
if (RapidSub.canDelegate("colortohsv")) { return __ref.runUserSub(false, "b4xcolortemplate","colortohsv", __ref, _clr);}
RemoteObject _a = RemoteObject.createImmutable(0);
RemoteObject _r = RemoteObject.createImmutable(0);
RemoteObject _g = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.createImmutable(0);
RemoteObject _h = RemoteObject.createImmutable(0f);
RemoteObject _s = RemoteObject.createImmutable(0f);
RemoteObject _v = RemoteObject.createImmutable(0f);
RemoteObject _cmax = RemoteObject.createImmutable(0);
RemoteObject _cmin = RemoteObject.createImmutable(0);
RemoteObject _rc = RemoteObject.createImmutable(0f);
RemoteObject _gc = RemoteObject.createImmutable(0f);
RemoteObject _bc = RemoteObject.createImmutable(0f);
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 199;BA.debugLine="Public Sub ColorToHSV(clr As Int) As Object()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 200;BA.debugLine="Dim a As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
Debug.JustUpdateDeviceLine();
_a = b4xcolortemplate.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, 0xff)),(Object)(b4xcolortemplate.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(_clr),(Object)(BA.numberCast(int.class, 24)))));Debug.locals.put("a", _a);Debug.locals.put("a", _a);
 BA.debugLineNum = 201;BA.debugLine="Dim r As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
Debug.JustUpdateDeviceLine();
_r = b4xcolortemplate.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, 0xff)),(Object)(b4xcolortemplate.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(_clr),(Object)(BA.numberCast(int.class, 16)))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 202;BA.debugLine="Dim g As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
Debug.JustUpdateDeviceLine();
_g = b4xcolortemplate.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, 0xff)),(Object)(b4xcolortemplate.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(_clr),(Object)(BA.numberCast(int.class, 8)))));Debug.locals.put("g", _g);Debug.locals.put("g", _g);
 BA.debugLineNum = 203;BA.debugLine="Dim b As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
Debug.JustUpdateDeviceLine();
_b = b4xcolortemplate.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, 0xff)),(Object)(b4xcolortemplate.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(_clr),(Object)(BA.numberCast(int.class, 0)))));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 204;BA.debugLine="Dim h, s, v As Float";
Debug.JustUpdateDeviceLine();
_h = RemoteObject.createImmutable(0f);Debug.locals.put("h", _h);
_s = RemoteObject.createImmutable(0f);Debug.locals.put("s", _s);
_v = RemoteObject.createImmutable(0f);Debug.locals.put("v", _v);
 BA.debugLineNum = 205;BA.debugLine="Dim cmax As Int = Max(Max(r, g), b)";
Debug.JustUpdateDeviceLine();
_cmax = BA.numberCast(int.class, b4xcolortemplate.__c.runMethod(true,"Max",(Object)(b4xcolortemplate.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _r)),(Object)(BA.numberCast(double.class, _g)))),(Object)(BA.numberCast(double.class, _b))));Debug.locals.put("cmax", _cmax);Debug.locals.put("cmax", _cmax);
 BA.debugLineNum = 206;BA.debugLine="Dim cmin As Int = Min(Min(r, g), b)";
Debug.JustUpdateDeviceLine();
_cmin = BA.numberCast(int.class, b4xcolortemplate.__c.runMethod(true,"Min",(Object)(b4xcolortemplate.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _r)),(Object)(BA.numberCast(double.class, _g)))),(Object)(BA.numberCast(double.class, _b))));Debug.locals.put("cmin", _cmin);Debug.locals.put("cmin", _cmin);
 BA.debugLineNum = 207;BA.debugLine="v = cmax / 255";
Debug.JustUpdateDeviceLine();
_v = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cmax,RemoteObject.createImmutable(255)}, "/",0, 0));Debug.locals.put("v", _v);
 BA.debugLineNum = 208;BA.debugLine="If cmax <> 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_cmax,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 209;BA.debugLine="s = (cmax - cmin) / cmax";
Debug.JustUpdateDeviceLine();
_s = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_cmax,_cmin}, "-",1, 1)),_cmax}, "/",0, 0));Debug.locals.put("s", _s);
 };
 BA.debugLineNum = 211;BA.debugLine="If s = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_s,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 212;BA.debugLine="h = 0";
Debug.JustUpdateDeviceLine();
_h = BA.numberCast(float.class, 0);Debug.locals.put("h", _h);
 }else {
 BA.debugLineNum = 214;BA.debugLine="Dim rc As Float = (cmax - r) / (cmax - cmin)";
Debug.JustUpdateDeviceLine();
_rc = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_cmax,_r}, "-",1, 1)),(RemoteObject.solve(new RemoteObject[] {_cmax,_cmin}, "-",1, 1))}, "/",0, 0));Debug.locals.put("rc", _rc);Debug.locals.put("rc", _rc);
 BA.debugLineNum = 215;BA.debugLine="Dim gc As Float = (cmax - g) / (cmax - cmin)";
Debug.JustUpdateDeviceLine();
_gc = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_cmax,_g}, "-",1, 1)),(RemoteObject.solve(new RemoteObject[] {_cmax,_cmin}, "-",1, 1))}, "/",0, 0));Debug.locals.put("gc", _gc);Debug.locals.put("gc", _gc);
 BA.debugLineNum = 216;BA.debugLine="Dim bc As Float = (cmax - b) / (cmax - cmin)";
Debug.JustUpdateDeviceLine();
_bc = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_cmax,_b}, "-",1, 1)),(RemoteObject.solve(new RemoteObject[] {_cmax,_cmin}, "-",1, 1))}, "/",0, 0));Debug.locals.put("bc", _bc);Debug.locals.put("bc", _bc);
 BA.debugLineNum = 217;BA.debugLine="If r = cmax Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_r,BA.numberCast(double.class, _cmax))) { 
 BA.debugLineNum = 218;BA.debugLine="h = bc - gc";
Debug.JustUpdateDeviceLine();
_h = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bc,_gc}, "-",1, 0));Debug.locals.put("h", _h);
 }else 
{ BA.debugLineNum = 219;BA.debugLine="Else If g = cmax Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_g,BA.numberCast(double.class, _cmax))) { 
 BA.debugLineNum = 220;BA.debugLine="h = 2 + rc - bc";
Debug.JustUpdateDeviceLine();
_h = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_rc,_bc}, "+-",2, 0));Debug.locals.put("h", _h);
 }else {
 BA.debugLineNum = 222;BA.debugLine="h = 4 + gc - rc";
Debug.JustUpdateDeviceLine();
_h = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(4),_gc,_rc}, "+-",2, 0));Debug.locals.put("h", _h);
 }}
;
 BA.debugLineNum = 224;BA.debugLine="h = h / 6";
Debug.JustUpdateDeviceLine();
_h = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_h,RemoteObject.createImmutable(6)}, "/",0, 0));Debug.locals.put("h", _h);
 BA.debugLineNum = 225;BA.debugLine="If h < 0 Then h = h + 1";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_h,BA.numberCast(double.class, 0))) { 
_h = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_h,RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("h", _h);};
 };
 BA.debugLineNum = 227;BA.debugLine="Return Array (h * 360, s, v, a)";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(RemoteObject.solve(new RemoteObject[] {_h,RemoteObject.createImmutable(360)}, "*",0, 0)),(_s),(_v),(_a)});
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpanelforbitmapcreator(RemoteObject __ref,RemoteObject _eventname,RemoteObject _withcheckers) throws Exception{
try {
		Debug.PushSubsStack("CreatePanelForBitmapCreator (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("createpanelforbitmapcreator")) { return __ref.runUserSub(false, "b4xcolortemplate","createpanelforbitmapcreator", __ref, _eventname, _withcheckers);}
RemoteObject _cpp = RemoteObject.declareNull("b4j.example.b4xcolortemplate._colorpickerpart");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
RemoteObject _overlay = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("EventName", _eventname);
Debug.locals.put("WithCheckers", _withcheckers);
 BA.debugLineNum = 30;BA.debugLine="Private Sub CreatePanelForBitmapCreator (EventName";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 31;BA.debugLine="Dim cpp As ColorPickerPart";
Debug.JustUpdateDeviceLine();
_cpp = RemoteObject.createNew ("b4j.example.b4xcolortemplate._colorpickerpart");Debug.locals.put("cpp", _cpp);
 BA.debugLineNum = 32;BA.debugLine="cpp.Initialize";
Debug.JustUpdateDeviceLine();
_cpp.runVoidMethod ("Initialize");
 BA.debugLineNum = 33;BA.debugLine="cpp.pnl = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_cpp.setField ("pnl" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 34;BA.debugLine="cpp.pnl.SetColorAndBorder(BordersColor, 1dip, Bor";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"pnl" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_borderscolor" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(__ref.getField(true,"_borderscolor" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 35;BA.debugLine="cpp.pnl.SetLayoutAnimated(0, 1dip, 1dip, 1dip, 1d";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"pnl" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 36;BA.debugLine="If WithCheckers Then";
Debug.JustUpdateDeviceLine();
if (_withcheckers.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 37;BA.debugLine="cpp.checkersCanvas.Initialize(cpp.pnl)";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"checkersCanvas" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_cpp.getField(false,"pnl" /*RemoteObject*/ )));
 BA.debugLineNum = 38;BA.debugLine="cpp.DrawCheckers = True";
Debug.JustUpdateDeviceLine();
_cpp.setField ("DrawCheckers" /*RemoteObject*/ ,b4xcolortemplate.__c.getField(true,"True"));
 };
 BA.debugLineNum = 40;BA.debugLine="Dim iv As ImageView";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 41;BA.debugLine="iv.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 42;BA.debugLine="cpp.iv = iv";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"iv" /*RemoteObject*/ ).setObject (_iv.getObject());
 BA.debugLineNum = 43;BA.debugLine="Dim overlay As B4XView = xui.CreatePanel(EventNam";
Debug.JustUpdateDeviceLine();
_overlay = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_overlay = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(_eventname));Debug.locals.put("overlay", _overlay);Debug.locals.put("overlay", _overlay);
 BA.debugLineNum = 44;BA.debugLine="cpp.pnl.AddView(iv, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"pnl" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_iv.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 45;BA.debugLine="cpp.pnl.AddView(overlay, 1dip, 1dip, 1dip, 1dip)";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"pnl" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_overlay.getObject())),(Object)(BA.numberCast(double.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 46;BA.debugLine="cpp.cvs.Initialize(overlay)";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_overlay));
 BA.debugLineNum = 47;BA.debugLine="mBase.AddView(cpp.pnl, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_cpp.getField(false,"pnl" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 48;BA.debugLine="Return cpp";
Debug.JustUpdateDeviceLine();
if (true) return _cpp;
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dialogclosed(RemoteObject __ref,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("DialogClosed (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,241);
if (RapidSub.canDelegate("dialogclosed")) { return __ref.runUserSub(false, "b4xcolortemplate","dialogclosed", __ref, _result);}
Debug.locals.put("Result", _result);
 BA.debugLineNum = 241;BA.debugLine="Private Sub DialogClosed(Result As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 242;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
 BA.debugLineNum = 243;BA.debugLine="setSelectedHSVColor(InitialColor)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_setselectedhsvcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_initialcolor" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawalphabar(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawAlphaBar (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("drawalphabar")) { return __ref.runUserSub(false, "b4xcolortemplate","drawalphabar", __ref);}
RemoteObject _bc = RemoteObject.declareNull("b4j.example.bitmapcreator");
RemoteObject _argb = RemoteObject.declareNull("b4j.example.bitmapcreator._argbcolor");
int _y = 0;
int _x = 0;
 BA.debugLineNum = 109;BA.debugLine="Private Sub DrawAlphaBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 110;BA.debugLine="Dim bc As BitmapCreator";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("b4j.example.bitmapcreator");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 111;BA.debugLine="bc.Initialize(AlphaBar.pnl.Width / DeviceScale, A";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_devicescale" /*RemoteObject*/ )}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_devicescale" /*RemoteObject*/ )}, "/",0, 0))));
 BA.debugLineNum = 112;BA.debugLine="Dim argb As ARGBColor";
Debug.JustUpdateDeviceLine();
_argb = RemoteObject.createNew ("b4j.example.bitmapcreator._argbcolor");Debug.locals.put("argb", _argb);
 BA.debugLineNum = 113;BA.debugLine="argb.r = 0xcc";
Debug.JustUpdateDeviceLine();
_argb.setField ("r",BA.numberCast(int.class, 0xcc));
 BA.debugLineNum = 114;BA.debugLine="argb.g = 0xcc";
Debug.JustUpdateDeviceLine();
_argb.setField ("g",BA.numberCast(int.class, 0xcc));
 BA.debugLineNum = 115;BA.debugLine="argb.b = 0xcc";
Debug.JustUpdateDeviceLine();
_argb.setField ("b",BA.numberCast(int.class, 0xcc));
 BA.debugLineNum = 117;BA.debugLine="For y = 0 To bc.mHeight - 1";
Debug.JustUpdateDeviceLine();
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mheight"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_y = 0 ;
for (;(step7 > 0 && _y <= limit7) || (step7 < 0 && _y >= limit7) ;_y = ((int)(0 + _y + step7))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 118;BA.debugLine="For x = 0 To bc.mWidth - 1";
Debug.JustUpdateDeviceLine();
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mwidth"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
for (;(step8 > 0 && _x <= limit8) || (step8 < 0 && _x >= limit8) ;_x = ((int)(0 + _x + step8))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 119;BA.debugLine="argb.a = x / bc.mWidth * 255";
Debug.JustUpdateDeviceLine();
_argb.setField ("a",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),_bc.getField(true,"_mwidth"),RemoteObject.createImmutable(255)}, "/*",0, 0)));
 BA.debugLineNum = 120;BA.debugLine="bc.SetARGB(x, y, argb)";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_setargb",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_argb));
 }
}Debug.locals.put("x", _x);
;
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 123;BA.debugLine="AlphaBar.iv.SetBitmap(bc.Bitmap)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"iv" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_bc.runMethod(false,"_getbitmap").getObject())));
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawcheckers(RemoteObject __ref,RemoteObject _cpp) throws Exception{
try {
		Debug.PushSubsStack("DrawCheckers (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("drawcheckers")) { return __ref.runUserSub(false, "b4xcolortemplate","drawcheckers", __ref, _cpp);}
RemoteObject _size = RemoteObject.createImmutable(0);
RemoteObject _clrs = null;
RemoteObject _clr = RemoteObject.createImmutable(0);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
int _x = 0;
RemoteObject _xx = RemoteObject.createImmutable(0);
int _y = 0;
Debug.locals.put("cpp", _cpp);
 BA.debugLineNum = 79;BA.debugLine="Private Sub DrawCheckers (cpp As ColorPickerPart)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="cpp.checkersCanvas.Resize(cpp.pnl.Width, cpp.pnl.";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"checkersCanvas" /*RemoteObject*/ ).runVoidMethod ("Resize",(Object)(_cpp.getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_cpp.getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 81;BA.debugLine="cpp.checkersCanvas.ClearRect(cpp.checkersCanvas.T";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"checkersCanvas" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(_cpp.getField(false,"checkersCanvas" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 82;BA.debugLine="Dim size As Int = 10dip";
Debug.JustUpdateDeviceLine();
_size = b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)));Debug.locals.put("size", _size);Debug.locals.put("size", _size);
 BA.debugLineNum = 83;BA.debugLine="Dim clrs() As Int = Array As Int(0xFFC0C0C0, 0xFF";
Debug.JustUpdateDeviceLine();
_clrs = RemoteObject.createNewArray("int",new int[] {2},new Object[] {BA.numberCast(int.class, 0xffc0c0c0),BA.numberCast(int.class, 0xff757575)});Debug.locals.put("clrs", _clrs);Debug.locals.put("clrs", _clrs);
 BA.debugLineNum = 84;BA.debugLine="Dim clr As Int = 0";
Debug.JustUpdateDeviceLine();
_clr = BA.numberCast(int.class, 0);Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 85;BA.debugLine="Dim r As B4XRect";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("r", _r);
 BA.debugLineNum = 86;BA.debugLine="For x = 0 To cpp.checkersCanvas.TargetRect.Right";
Debug.JustUpdateDeviceLine();
{
final int step7 = _size.<Integer>get().intValue();
final int limit7 = (int) (0 + RemoteObject.solve(new RemoteObject[] {_cpp.getField(false,"checkersCanvas" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getRight"),b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 0).<Double>get().doubleValue());
_x = 0 ;
for (;(step7 > 0 && _x <= limit7) || (step7 < 0 && _x >= limit7) ;_x = ((int)(0 + _x + step7))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 87;BA.debugLine="Dim xx As Int = x / size";
Debug.JustUpdateDeviceLine();
_xx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),_size}, "/",0, 0));Debug.locals.put("xx", _xx);Debug.locals.put("xx", _xx);
 BA.debugLineNum = 88;BA.debugLine="clr = xx Mod 2";
Debug.JustUpdateDeviceLine();
_clr = RemoteObject.solve(new RemoteObject[] {_xx,RemoteObject.createImmutable(2)}, "%",0, 1);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 89;BA.debugLine="For y = 0 To cpp.checkersCanvas.TargetRect.Botto";
Debug.JustUpdateDeviceLine();
{
final int step10 = _size.<Integer>get().intValue();
final int limit10 = (int) (0 + RemoteObject.solve(new RemoteObject[] {_cpp.getField(false,"checkersCanvas" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getBottom"),b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 0).<Double>get().doubleValue());
_y = 0 ;
for (;(step10 > 0 && _y <= limit10) || (step10 < 0 && _y >= limit10) ;_y = ((int)(0 + _y + step10))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 90;BA.debugLine="clr = (clr + 1) Mod 2";
Debug.JustUpdateDeviceLine();
_clr = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_clr,RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(2)}, "%",0, 1);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 91;BA.debugLine="r.Initialize(x, y, x + size, y + size)";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, _y)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),_size}, "+",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_y),_size}, "+",1, 1))));
 BA.debugLineNum = 92;BA.debugLine="cpp.checkersCanvas.DrawRect(r, clrs(clr), True,";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"checkersCanvas" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(_r),(Object)(_clrs.getArrayElement(true,_clr)),(Object)(b4xcolortemplate.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 }
}Debug.locals.put("y", _y);
;
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 95;BA.debugLine="cpp.checkersCanvas.Invalidate";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"checkersCanvas" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawcolors(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawColors (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("drawcolors")) { return __ref.runUserSub(false, "b4xcolortemplate","drawcolors", __ref);}
int _x = 0;
int _y = 0;
 BA.debugLineNum = 126;BA.debugLine="Private Sub DrawColors";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 127;BA.debugLine="For x = 0 To bcColors.mWidth - 1";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_bccolors" /*RemoteObject*/ ).getField(true,"_mwidth"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
for (;(step1 > 0 && _x <= limit1) || (step1 < 0 && _x >= limit1) ;_x = ((int)(0 + _x + step1))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 128;BA.debugLine="For y = 0 To bcColors.mHeight - 1";
Debug.JustUpdateDeviceLine();
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_bccolors" /*RemoteObject*/ ).getField(true,"_mheight"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_y = 0 ;
for (;(step2 > 0 && _y <= limit2) || (step2 < 0 && _y >= limit2) ;_y = ((int)(0 + _y + step2))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 129;BA.debugLine="bcColors.SetHSV(x, y, SelectedAlpha, selectedH,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bccolors" /*RemoteObject*/ ).runVoidMethod ("_sethsv",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(__ref.getField(true,"_selectedalpha" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, __ref.getField(true,"_selectedh" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),__ref.getField(false,"_bccolors" /*RemoteObject*/ ).getField(true,"_mwidth")}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_bccolors" /*RemoteObject*/ ).getField(true,"_mheight"),RemoteObject.createImmutable(_y)}, "-",1, 1)),__ref.getField(false,"_bccolors" /*RemoteObject*/ ).getField(true,"_mheight")}, "/",0, 0))));
 }
}Debug.locals.put("y", _y);
;
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 133;BA.debugLine="ColorPicker.iv.SetBitmap(bcColors.Bitmap.Resize(C";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"iv" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((__ref.getField(false,"_bccolors" /*RemoteObject*/ ).runMethod(false,"_getbitmap").runMethod(false,"Resize",(Object)(BA.numberCast(int.class, __ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"iv" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"iv" /*RemoteObject*/ ).runMethod(true,"getHeight"))),(Object)(b4xcolortemplate.__c.getField(true,"False"))).getObject())));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawhuebar(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawHueBar (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("drawhuebar")) { return __ref.runUserSub(false, "b4xcolortemplate","drawhuebar", __ref);}
RemoteObject _bchue = RemoteObject.declareNull("b4j.example.bitmapcreator");
int _y = 0;
int _x = 0;
 BA.debugLineNum = 98;BA.debugLine="Private Sub DrawHueBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="Dim bcHue As BitmapCreator";
Debug.JustUpdateDeviceLine();
_bchue = RemoteObject.createNew ("b4j.example.bitmapcreator");Debug.locals.put("bcHue", _bchue);
 BA.debugLineNum = 100;BA.debugLine="bcHue.Initialize(HueBar.pnl.Width / DeviceScale,";
Debug.JustUpdateDeviceLine();
_bchue.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_devicescale" /*RemoteObject*/ )}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_devicescale" /*RemoteObject*/ )}, "/",0, 0))));
 BA.debugLineNum = 101;BA.debugLine="For y = 0 To bcHue.mHeight - 1";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_bchue.getField(true,"_mheight"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_y = 0 ;
for (;(step3 > 0 && _y <= limit3) || (step3 < 0 && _y >= limit3) ;_y = ((int)(0 + _y + step3))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 102;BA.debugLine="For x = 0 To bcHue.mWidth - 1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_bchue.getField(true,"_mwidth"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
for (;(step4 > 0 && _x <= limit4) || (step4 < 0 && _x >= limit4) ;_x = ((int)(0 + _x + step4))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 103;BA.debugLine="bcHue.SetHSV(x, y, 255, 360 / bcHue.mHeight * y";
Debug.JustUpdateDeviceLine();
_bchue.runVoidMethod ("_sethsv",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_bchue.getField(true,"_mheight"),RemoteObject.createImmutable(_y)}, "/*",0, 0))),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 1)));
 }
}Debug.locals.put("x", _x);
;
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 106;BA.debugLine="HueBar.iv.SetBitmap(bcHue.Bitmap)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"iv" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_bchue.runMethod(false,"_getbitmap").getObject())));
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
public static RemoteObject  _getpanel(RemoteObject __ref,RemoteObject _dialog) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,230);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "b4xcolortemplate","getpanel", __ref, _dialog);}
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 230;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 231;BA.debugLine="Return mBase";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedColor (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,175);
if (RapidSub.canDelegate("getselectedcolor")) { return __ref.runUserSub(false, "b4xcolortemplate","getselectedcolor", __ref);}
RemoteObject _hsv = null;
 BA.debugLineNum = 175;BA.debugLine="Public Sub getSelectedColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 176;BA.debugLine="Dim hsv() As Object = getSelectedHSVColor";
Debug.JustUpdateDeviceLine();
_hsv = __ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_getselectedhsvcolor" /*RemoteObject*/ );Debug.locals.put("hsv", _hsv);Debug.locals.put("hsv", _hsv);
 BA.debugLineNum = 177;BA.debugLine="tempBC.SetHSV(0, 0, SelectedAlpha, hsv(0), hsv(1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tempbc" /*RemoteObject*/ ).runVoidMethod ("_sethsv",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_selectedalpha" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, _hsv.getArrayElement(false,BA.numberCast(int.class, 0)))),(Object)(BA.numberCast(float.class, _hsv.getArrayElement(false,BA.numberCast(int.class, 1)))),(Object)(BA.numberCast(float.class, _hsv.getArrayElement(false,BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 178;BA.debugLine="Return tempBC.GetColor(0, 0)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_tempbc" /*RemoteObject*/ ).runMethod(true,"_getcolor",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedhsvcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedHSVColor (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("getselectedhsvcolor")) { return __ref.runUserSub(false, "b4xcolortemplate","getselectedhsvcolor", __ref);}
 BA.debugLineNum = 186;BA.debugLine="Public Sub getSelectedHSVColor As Object()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 187;BA.debugLine="Return Array (selectedH, selectedS, selectedV, Se";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(__ref.getField(true,"_selectedh" /*RemoteObject*/ )),(__ref.getField(true,"_selecteds" /*RemoteObject*/ )),(__ref.getField(true,"_selectedv" /*RemoteObject*/ )),(__ref.getField(true,"_selectedalpha" /*RemoteObject*/ ))});
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handleselectedcolorchanged(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("HandleSelectedColorChanged (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("handleselectedcolorchanged")) { return __ref.runUserSub(false, "b4xcolortemplate","handleselectedcolorchanged", __ref, _x, _y);}
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 163;BA.debugLine="Private Sub HandleSelectedColorChanged (x As Int,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 164;BA.debugLine="If x <> DONT_CHANGE Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_x,BA.numberCast(double.class, __ref.getField(true,"_dont_change" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 165;BA.debugLine="selectedS = Max(0, Min(1, x / ColorPicker.pnl.Wi";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selecteds" /*RemoteObject*/ ,BA.numberCast(float.class, b4xcolortemplate.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(b4xcolortemplate.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "/",0, 0)))))));
 BA.debugLineNum = 166;BA.debugLine="selectedV = Max(0, Min(1, (ColorPicker.pnl.Heigh";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selectedv" /*RemoteObject*/ ,BA.numberCast(float.class, b4xcolortemplate.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(b4xcolortemplate.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight"),_y}, "-",1, 0)),__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "/",0, 0)))))));
 };
 BA.debugLineNum = 168;BA.debugLine="ColorPicker.cvs.ClearRect(ColorPicker.cvs.TargetR";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 169;BA.debugLine="ColorPicker.cvs.DrawCircle(selectedS * ColorPicke";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selecteds" /*RemoteObject*/ ),__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_selectedv" /*RemoteObject*/ ),__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-*",1, 0))),(Object)(BA.numberCast(float.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White")),(Object)(b4xcolortemplate.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 171;BA.debugLine="ColorPicker.cvs.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 172;BA.debugLine="UpdateBarColor";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_updatebarcolor" /*RemoteObject*/ );
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _huebar_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("HueBar_Touch (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,258);
if (RapidSub.canDelegate("huebar_touch")) { return __ref.runUserSub(false, "b4xcolortemplate","huebar_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 258;BA.debugLine="Private Sub HueBar_Touch (Action As Int, X As Floa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 259;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE_NOTOUCH")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 260;BA.debugLine="HueBarSelectedChanged(Y)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_huebarselectedchanged" /*RemoteObject*/ ,(Object)(_y));
 BA.debugLineNum = 261;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _huebarselectedchanged(RemoteObject __ref,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("HueBarSelectedChanged (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("huebarselectedchanged")) { return __ref.runUserSub(false, "b4xcolortemplate","huebarselectedchanged", __ref, _y);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
Debug.locals.put("y", _y);
 BA.debugLineNum = 136;BA.debugLine="Private Sub HueBarSelectedChanged (y As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 137;BA.debugLine="selectedH = Max(0, Min(360, 360 * y / HueBar.pnl.";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selectedh" /*RemoteObject*/ ,BA.numberCast(float.class, b4xcolortemplate.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(b4xcolortemplate.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 360)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_y,__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*/",0, 0)))))));
 BA.debugLineNum = 138;BA.debugLine="y = selectedH * HueBar.pnl.Height / 360";
Debug.JustUpdateDeviceLine();
_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedh" /*RemoteObject*/ ),__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(360)}, "*/",0, 0));Debug.locals.put("y", _y);
 BA.debugLineNum = 139;BA.debugLine="HueBar.cvs.ClearRect(HueBar.cvs.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 140;BA.debugLine="Dim r As B4XRect";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("r", _r);
 BA.debugLineNum = 141;BA.debugLine="r.Initialize(0, y - 3dip, HueBar.cvs.TargetRect.R";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_y,b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "-",1, 0))),(Object)(__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getRight")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_y,b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "+",1, 0))));
 BA.debugLineNum = 142;BA.debugLine="HueBar.cvs.DrawRect(r, xui.Color_White, False, 2d";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(_r),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White")),(Object)(b4xcolortemplate.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 143;BA.debugLine="HueBar.cvs.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 144;BA.debugLine="Update";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xcolortemplate","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 18;BA.debugLine="tempBC.Initialize(1, 1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tempbc" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 19;BA.debugLine="DeviceScale = 100dip / 100";
Debug.JustUpdateDeviceLine();
__ref.setField ("_devicescale" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))),RemoteObject.createImmutable(100)}, "/",0, 0)));
 BA.debugLineNum = 20;BA.debugLine="mBase = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mbase" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 21;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 250dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))),(Object)(BA.numberCast(double.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 250))))));
 BA.debugLineNum = 22;BA.debugLine="BordersColor = xui.Color_Black";
Debug.JustUpdateDeviceLine();
__ref.setField ("_borderscolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 23;BA.debugLine="mBase.SetColorAndBorder(BordersColor, 1dip, Borde";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_borderscolor" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(__ref.getField(true,"_borderscolor" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, b4xcolortemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 24;BA.debugLine="HueBar = CreatePanelForBitmapCreator(\"hueBar\", Fa";
Debug.JustUpdateDeviceLine();
__ref.setField ("_huebar" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_createpanelforbitmapcreator" /*RemoteObject*/ ,(Object)(BA.ObjectToString("hueBar")),(Object)(b4xcolortemplate.__c.getField(true,"False"))));
 BA.debugLineNum = 25;BA.debugLine="ColorPicker = CreatePanelForBitmapCreator(\"colors";
Debug.JustUpdateDeviceLine();
__ref.setField ("_colorpicker" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_createpanelforbitmapcreator" /*RemoteObject*/ ,(Object)(BA.ObjectToString("colors")),(Object)(b4xcolortemplate.__c.getField(true,"True"))));
 BA.debugLineNum = 26;BA.debugLine="AlphaBar = CreatePanelForBitmapCreator(\"alpha\", T";
Debug.JustUpdateDeviceLine();
__ref.setField ("_alphabar" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_createpanelforbitmapcreator" /*RemoteObject*/ ,(Object)(BA.ObjectToString("alpha")),(Object)(b4xcolortemplate.__c.getField(true,"True"))));
 BA.debugLineNum = 27;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_base_resize" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectedcolor(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("setSelectedColor (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("setselectedcolor")) { return __ref.runUserSub(false, "b4xcolortemplate","setselectedcolor", __ref, _i);}
Debug.locals.put("i", _i);
 BA.debugLineNum = 181;BA.debugLine="Public Sub setSelectedColor(i As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 182;BA.debugLine="setSelectedHSVColor(ColorToHSV(i))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_setselectedhsvcolor" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_colortohsv" /*RemoteObject*/ ,(Object)(_i))));
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectedhsvcolor(RemoteObject __ref,RemoteObject _hsv) throws Exception{
try {
		Debug.PushSubsStack("setSelectedHSVColor (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("setselectedhsvcolor")) { return __ref.runUserSub(false, "b4xcolortemplate","setselectedhsvcolor", __ref, _hsv);}
Debug.locals.put("HSV", _hsv);
 BA.debugLineNum = 190;BA.debugLine="Public Sub setSelectedHSVColor (HSV() As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 191;BA.debugLine="selectedH = HSV(0)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selectedh" /*RemoteObject*/ ,BA.numberCast(float.class, _hsv.getArrayElement(false,BA.numberCast(int.class, 0))));
 BA.debugLineNum = 192;BA.debugLine="selectedS = HSV(1)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selecteds" /*RemoteObject*/ ,BA.numberCast(float.class, _hsv.getArrayElement(false,BA.numberCast(int.class, 1))));
 BA.debugLineNum = 193;BA.debugLine="selectedV = HSV(2)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selectedv" /*RemoteObject*/ ,BA.numberCast(float.class, _hsv.getArrayElement(false,BA.numberCast(int.class, 2))));
 BA.debugLineNum = 194;BA.debugLine="SelectedAlpha = HSV(3)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selectedalpha" /*RemoteObject*/ ,BA.numberCast(int.class, _hsv.getArrayElement(false,BA.numberCast(int.class, 3))));
 BA.debugLineNum = 195;BA.debugLine="HueBarSelectedChanged(selectedH / 360 * HueBar.pn";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_huebarselectedchanged" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedh" /*RemoteObject*/ ),RemoteObject.createImmutable(360),__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "/*",0, 0))));
 BA.debugLineNum = 196;BA.debugLine="AlphaBarSelectedChange(SelectedAlpha / 255 * Alph";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_alphabarselectedchange" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedalpha" /*RemoteObject*/ ),RemoteObject.createImmutable(255),__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "/*",0, 0))));
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _show(RemoteObject __ref,RemoteObject _dialog) throws Exception{
try {
		Debug.PushSubsStack("Show (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "b4xcolortemplate","show", __ref, _dialog); return;}
ResumableSub_Show rsub = new ResumableSub_Show(null,__ref,_dialog);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.example.b4xcolortemplate parent,RemoteObject __ref,RemoteObject _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xcolortemplate parent;
RemoteObject _dialog;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,234);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 235;BA.debugLine="InitialColor = getSelectedHSVColor";
Debug.JustUpdateDeviceLine();
__ref.setField ("_initialcolor" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_getselectedhsvcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 236;BA.debugLine="xDialog = Dialog";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xdialog" /*RemoteObject*/ ,_dialog);
 BA.debugLineNum = 237;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xcolortemplate", "show"),BA.numberCast(int.class, 0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 238;BA.debugLine="UpdateBarColor";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_updatebarcolor" /*RemoteObject*/ );
 BA.debugLineNum = 239;BA.debugLine="End Sub";
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
public static RemoteObject  _update(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Update (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "b4xcolortemplate","update", __ref);}
 BA.debugLineNum = 158;BA.debugLine="Private Sub Update";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 159;BA.debugLine="DrawColors";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_drawcolors" /*RemoteObject*/ );
 BA.debugLineNum = 160;BA.debugLine="HandleSelectedColorChanged(DONT_CHANGE, DONT_CHAN";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_handleselectedcolorchanged" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_dont_change" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dont_change" /*RemoteObject*/ )));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatebarcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateBarColor (b4xcolortemplate) ","b4xcolortemplate",13,__ref.getField(false, "ba"),__ref,247);
if (RapidSub.canDelegate("updatebarcolor")) { return __ref.runUserSub(false, "b4xcolortemplate","updatebarcolor", __ref);}
 BA.debugLineNum = 247;BA.debugLine="Private Sub UpdateBarColor";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 248;BA.debugLine="If xDialog.IsInitialized And xDialog.TitleBar.IsI";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_xdialog" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",__ref.getField(false,"_xdialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 249;BA.debugLine="xDialog.TitleBar.Color = getSelectedColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xdialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.runClassMethod (b4j.example.b4xcolortemplate.class, "_getselectedcolor" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 251;BA.debugLine="End Sub";
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