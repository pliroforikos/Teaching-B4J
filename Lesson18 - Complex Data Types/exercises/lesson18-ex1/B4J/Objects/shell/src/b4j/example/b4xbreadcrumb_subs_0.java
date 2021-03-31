package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xbreadcrumb_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4xbreadcrumb) ","b4xbreadcrumb",12,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "b4xbreadcrumb","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 51;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="cvs.Resize(Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Resize",(Object)(_width),(Object)(_height));
 BA.debugLineNum = 53;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_touchpanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 54;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xbreadcrumb.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 55;BA.debugLine="End Sub";
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
b4xbreadcrumb._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4xbreadcrumb._meventname);
 //BA.debugLineNum = 7;BA.debugLine="Private mCallBack As Object 'ignore";
b4xbreadcrumb._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",b4xbreadcrumb._mcallback);
 //BA.debugLineNum = 8;BA.debugLine="Private mBase As B4XView 'ignore";
b4xbreadcrumb._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xbreadcrumb._mbase);
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI 'ignore";
b4xbreadcrumb._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xbreadcrumb._xui);
 //BA.debugLineNum = 10;BA.debugLine="Private cvs As B4XCanvas";
b4xbreadcrumb._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvs",b4xbreadcrumb._cvs);
 //BA.debugLineNum = 11;BA.debugLine="Private mItems As List";
b4xbreadcrumb._mitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_mitems",b4xbreadcrumb._mitems);
 //BA.debugLineNum = 12;BA.debugLine="Private RightPositions As List";
b4xbreadcrumb._rightpositions = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_rightpositions",b4xbreadcrumb._rightpositions);
 //BA.debugLineNum = 13;BA.debugLine="Public TextColor As Int";
b4xbreadcrumb._textcolor = RemoteObject.createImmutable(0);__ref.setField("_textcolor",b4xbreadcrumb._textcolor);
 //BA.debugLineNum = 14;BA.debugLine="Public fnt As B4XFont";
b4xbreadcrumb._fnt = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");__ref.setField("_fnt",b4xbreadcrumb._fnt);
 //BA.debugLineNum = 15;BA.debugLine="Private offset As Int = 10dip";
b4xbreadcrumb._offset = b4xbreadcrumb.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)));__ref.setField("_offset",b4xbreadcrumb._offset);
 //BA.debugLineNum = 16;BA.debugLine="Private bc As BitmapCreator";
b4xbreadcrumb._bc = RemoteObject.createNew ("b4j.example.bitmapcreator");__ref.setField("_bc",b4xbreadcrumb._bc);
 //BA.debugLineNum = 17;BA.debugLine="Public CrumbColor As Int";
b4xbreadcrumb._crumbcolor = RemoteObject.createImmutable(0);__ref.setField("_crumbcolor",b4xbreadcrumb._crumbcolor);
 //BA.debugLineNum = 18;BA.debugLine="Private TouchPanel As B4XView";
b4xbreadcrumb._touchpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_touchpanel",b4xbreadcrumb._touchpanel);
 //BA.debugLineNum = 19;BA.debugLine="Private PressedItem As Int = -1";
b4xbreadcrumb._presseditem = BA.numberCast(int.class, -(double) (0 + 1));__ref.setField("_presseditem",b4xbreadcrumb._presseditem);
 //BA.debugLineNum = 20;BA.debugLine="Public Tag As Object";
b4xbreadcrumb._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",b4xbreadcrumb._tag);
 //BA.debugLineNum = 21;BA.debugLine="Public mHaptic As Boolean";
b4xbreadcrumb._mhaptic = RemoteObject.createImmutable(false);__ref.setField("_mhaptic",b4xbreadcrumb._mhaptic);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (b4xbreadcrumb) ","b4xbreadcrumb",12,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "b4xbreadcrumb","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _items = RemoteObject.createImmutable("");
RemoteObject _s = RemoteObject.createImmutable("");
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
 BA.debugLineNum = 37;BA.debugLine="Dim xlbl As B4XView = Lbl";
Debug.JustUpdateDeviceLine();
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 38;BA.debugLine="fnt = xlbl.Font";
Debug.JustUpdateDeviceLine();
__ref.setField ("_fnt" /*RemoteObject*/ ,_xlbl.runMethod(false,"getFont"));
 BA.debugLineNum = 39;BA.debugLine="TextColor = xlbl.TextColor";
Debug.JustUpdateDeviceLine();
__ref.setField ("_textcolor" /*RemoteObject*/ ,_xlbl.runMethod(true,"getTextColor"));
 BA.debugLineNum = 40;BA.debugLine="CrumbColor = xui.PaintOrColorToColor(Props.Get(\"C";
Debug.JustUpdateDeviceLine();
__ref.setField ("_crumbcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CrumbColor")))))));
 BA.debugLineNum = 41;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mhaptic" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("HapticFeedback"))),(Object)((b4xbreadcrumb.__c.getField(true,"False"))))));
 BA.debugLineNum = 42;BA.debugLine="TouchPanel = xui.CreatePanel(\"Touch\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_touchpanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Touch"))));
 BA.debugLineNum = 43;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_touchpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 44;BA.debugLine="Dim items As String = Props.Get(\"Items\")";
Debug.JustUpdateDeviceLine();
_items = BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Items")))));Debug.locals.put("items", _items);Debug.locals.put("items", _items);
 BA.debugLineNum = 45;BA.debugLine="For Each s As String In Regex.Split(\"\\|\", items)";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group13 = b4xbreadcrumb.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_items));
final int groupLen13 = group13.getField(true,"length").<Integer>get()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_s = group13.getArrayElement(true,RemoteObject.createImmutable(index13));Debug.locals.put("s", _s);
Debug.locals.put("s", _s);
 BA.debugLineNum = 46;BA.debugLine="mItems.Add(s)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mitems" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_s)));
 }
}Debug.locals.put("s", _s);
;
 BA.debugLineNum = 48;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xbreadcrumb.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 49;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Draw (b4xbreadcrumb) ","b4xbreadcrumb",12,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("draw")) { return __ref.runUserSub(false, "b4xbreadcrumb","draw", __ref);}
RemoteObject _bcolor = RemoteObject.declareNull("b4j.example.bitmapcreator._argbcolor");
RemoteObject _strokecolor = RemoteObject.createImmutable(0);
RemoteObject _clrs = null;
RemoteObject _left = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _sc = RemoteObject.createImmutable(0);
RemoteObject _width = RemoteObject.createImmutable(0);
 BA.debugLineNum = 57;BA.debugLine="Private Sub Draw";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 59;BA.debugLine="Dim bcolor As ARGBColor";
Debug.JustUpdateDeviceLine();
_bcolor = RemoteObject.createNew ("b4j.example.bitmapcreator._argbcolor");Debug.locals.put("bcolor", _bcolor);
 BA.debugLineNum = 60;BA.debugLine="bc.ColorToARGB(CrumbColor, bcolor)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_colortoargb",(Object)(__ref.getField(true,"_crumbcolor" /*RemoteObject*/ )),(Object)(_bcolor));
 BA.debugLineNum = 61;BA.debugLine="bcolor.r = Min(255, bcolor.r * 2)";
Debug.JustUpdateDeviceLine();
_bcolor.setField ("r",BA.numberCast(int.class, b4xbreadcrumb.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 255)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_bcolor.getField(true,"r"),RemoteObject.createImmutable(2)}, "*",0, 1))))));
 BA.debugLineNum = 62;BA.debugLine="bcolor.g = Min(255, bcolor.g * 2)";
Debug.JustUpdateDeviceLine();
_bcolor.setField ("g",BA.numberCast(int.class, b4xbreadcrumb.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 255)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_bcolor.getField(true,"g"),RemoteObject.createImmutable(2)}, "*",0, 1))))));
 BA.debugLineNum = 63;BA.debugLine="bcolor.b = Min(255, bcolor.b * 2)";
Debug.JustUpdateDeviceLine();
_bcolor.setField ("b",BA.numberCast(int.class, b4xbreadcrumb.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 255)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_bcolor.getField(true,"b"),RemoteObject.createImmutable(2)}, "*",0, 1))))));
 BA.debugLineNum = 64;BA.debugLine="Dim strokeColor As Int = bc.ARGBToColor(bcolor)";
Debug.JustUpdateDeviceLine();
_strokecolor = __ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(true,"_argbtocolor",(Object)(_bcolor));Debug.locals.put("strokeColor", _strokecolor);Debug.locals.put("strokeColor", _strokecolor);
 BA.debugLineNum = 66;BA.debugLine="bc.ColorToARGB(CrumbColor, bcolor)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_colortoargb",(Object)(__ref.getField(true,"_crumbcolor" /*RemoteObject*/ )),(Object)(_bcolor));
 BA.debugLineNum = 67;BA.debugLine="bcolor.r = bcolor.r * 0.8";
Debug.JustUpdateDeviceLine();
_bcolor.setField ("r",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bcolor.getField(true,"r"),RemoteObject.createImmutable(0.8)}, "*",0, 0)));
 BA.debugLineNum = 68;BA.debugLine="bcolor.g = bcolor.g * 0.8";
Debug.JustUpdateDeviceLine();
_bcolor.setField ("g",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bcolor.getField(true,"g"),RemoteObject.createImmutable(0.8)}, "*",0, 0)));
 BA.debugLineNum = 69;BA.debugLine="bcolor.b = bcolor.b * 0.8";
Debug.JustUpdateDeviceLine();
_bcolor.setField ("b",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bcolor.getField(true,"b"),RemoteObject.createImmutable(0.8)}, "*",0, 0)));
 BA.debugLineNum = 70;BA.debugLine="Dim Clrs() As Int = Array As Int(CrumbColor, bc.A";
Debug.JustUpdateDeviceLine();
_clrs = RemoteObject.createNewArray("int",new int[] {2},new Object[] {__ref.getField(true,"_crumbcolor" /*RemoteObject*/ ),__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(true,"_argbtocolor",(Object)(_bcolor))});Debug.locals.put("Clrs", _clrs);Debug.locals.put("Clrs", _clrs);
 BA.debugLineNum = 72;BA.debugLine="RightPositions.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rightpositions" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 73;BA.debugLine="If mItems.Size = 0 Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mitems" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 74;BA.debugLine="Dim Left As Int = 0";
Debug.JustUpdateDeviceLine();
_left = BA.numberCast(int.class, 0);Debug.locals.put("Left", _left);Debug.locals.put("Left", _left);
 BA.debugLineNum = 75;BA.debugLine="For i = 0 To mItems.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mitems" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16) ;_i = ((int)(0 + _i + step16))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 76;BA.debugLine="Dim sc As Int";
Debug.JustUpdateDeviceLine();
_sc = RemoteObject.createImmutable(0);Debug.locals.put("sc", _sc);
 BA.debugLineNum = 77;BA.debugLine="If PressedItem = i Then sc = strokeColor Else sc";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_presseditem" /*RemoteObject*/ ),BA.numberCast(double.class, _i))) { 
_sc = _strokecolor;Debug.locals.put("sc", _sc);}
else {
_sc = BA.numberCast(int.class, 0);Debug.locals.put("sc", _sc);};
 BA.debugLineNum = 78;BA.debugLine="Dim width As Int = DrawItem(Left, mItems.Get(i),";
Debug.JustUpdateDeviceLine();
_width = __ref.runClassMethod (b4j.example.b4xbreadcrumb.class, "_drawitem" /*RemoteObject*/ ,(Object)(_left),(Object)(BA.ObjectToString(__ref.getField(false,"_mitems" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0)))),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mitems" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))),(Object)(_clrs.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_clrs.getField(true,"length")}, "%",0, 1))),(Object)(_sc));Debug.locals.put("width", _width);Debug.locals.put("width", _width);
 BA.debugLineNum = 79;BA.debugLine="Left = Left + width + offset + 2dip";
Debug.JustUpdateDeviceLine();
_left = RemoteObject.solve(new RemoteObject[] {_left,_width,__ref.getField(true,"_offset" /*RemoteObject*/ ),b4xbreadcrumb.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+++",3, 1);Debug.locals.put("Left", _left);
 BA.debugLineNum = 80;BA.debugLine="RightPositions.Add(Left)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rightpositions" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_left)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 82;BA.debugLine="cvs.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawitem(RemoteObject __ref,RemoteObject _left,RemoteObject _text,RemoteObject _first,RemoteObject _last,RemoteObject _clr,RemoteObject _strokecolor) throws Exception{
try {
		Debug.PushSubsStack("DrawItem (b4xbreadcrumb) ","b4xbreadcrumb",12,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("drawitem")) { return __ref.runUserSub(false, "b4xbreadcrumb","drawitem", __ref, _left, _text, _first, _last, _clr, _strokecolor);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _itemwidth = RemoteObject.createImmutable(0);
RemoteObject _itemheight = RemoteObject.createImmutable(0);
RemoteObject _baseline = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
Debug.locals.put("Left", _left);
Debug.locals.put("Text", _text);
Debug.locals.put("First", _first);
Debug.locals.put("Last", _last);
Debug.locals.put("clr", _clr);
Debug.locals.put("strokeColor", _strokecolor);
 BA.debugLineNum = 85;BA.debugLine="Private Sub DrawItem(Left As Int, Text As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(Text, fnt)";
Debug.JustUpdateDeviceLine();
_r = __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(_text),(Object)(__ref.getField(false,"_fnt" /*RemoteObject*/ )));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 87;BA.debugLine="Dim ItemWidth As Int = r.Width + 30dip";
Debug.JustUpdateDeviceLine();
_itemwidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),b4xbreadcrumb.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));Debug.locals.put("ItemWidth", _itemwidth);Debug.locals.put("ItemWidth", _itemwidth);
 BA.debugLineNum = 88;BA.debugLine="Dim ItemHeight As Int = cvs.TargetRect.Height";
Debug.JustUpdateDeviceLine();
_itemheight = BA.numberCast(int.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getHeight"));Debug.locals.put("ItemHeight", _itemheight);Debug.locals.put("ItemHeight", _itemheight);
 BA.debugLineNum = 89;BA.debugLine="Dim BaseLine As Int = cvs.TargetRect.CenterY - r.";
Debug.JustUpdateDeviceLine();
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_r.runMethod(true,"getTop")}, "-/-",2, 0));Debug.locals.put("BaseLine", _baseline);Debug.locals.put("BaseLine", _baseline);
 BA.debugLineNum = 90;BA.debugLine="Dim p As B4XPath";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("p", _p);
 BA.debugLineNum = 91;BA.debugLine="p.Initialize(Left, 0)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 92;BA.debugLine="p.LineTo(Left + ItemWidth, 0)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,_itemwidth}, "+",1, 1))),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 93;BA.debugLine="If Last = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_last,b4xbreadcrumb.__c.getField(true,"False"))) { 
 BA.debugLineNum = 94;BA.debugLine="p.LineTo(Left + ItemWidth + offset, ItemHeight /";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,_itemwidth,__ref.getField(true,"_offset" /*RemoteObject*/ )}, "++",2, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_itemheight,RemoteObject.createImmutable(2)}, "/",0, 0))));
 };
 BA.debugLineNum = 96;BA.debugLine="p.LineTo(Left + ItemWidth, ItemHeight)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,_itemwidth}, "+",1, 1))),(Object)(BA.numberCast(float.class, _itemheight)));
 BA.debugLineNum = 97;BA.debugLine="If First = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_first,b4xbreadcrumb.__c.getField(true,"False"))) { 
 BA.debugLineNum = 98;BA.debugLine="p.LineTo(Left - offset, ItemHeight)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,__ref.getField(true,"_offset" /*RemoteObject*/ )}, "-",1, 1))),(Object)(BA.numberCast(float.class, _itemheight)));
 BA.debugLineNum = 99;BA.debugLine="p.LineTo(Left, ItemHeight / 2)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_itemheight,RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 100;BA.debugLine="p.LineTo(Left - offset, 0)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,__ref.getField(true,"_offset" /*RemoteObject*/ )}, "-",1, 1))),(Object)(BA.numberCast(float.class, 0)));
 }else {
 BA.debugLineNum = 102;BA.debugLine="p.LineTo(Left, ItemHeight)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, _itemheight)));
 };
 BA.debugLineNum = 104;BA.debugLine="p.LineTo(Left, 0)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 105;BA.debugLine="cvs.DrawPath(p, clr, True, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_p),(Object)(_clr),(Object)(b4xbreadcrumb.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 106;BA.debugLine="If strokeColor <> 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_strokecolor,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 107;BA.debugLine="cvs.DrawPath(p, strokeColor, False, 3dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_p),(Object)(_strokecolor),(Object)(b4xbreadcrumb.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, b4xbreadcrumb.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))))));
 };
 BA.debugLineNum = 110;BA.debugLine="cvs.DrawText(Text, Left + ItemWidth / 2, BaseLine";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawText",(Object)(_text),(Object)(RemoteObject.solve(new RemoteObject[] {_left,_itemwidth,RemoteObject.createImmutable(2)}, "+/",1, 0)),(Object)(BA.numberCast(double.class, _baseline)),(Object)(__ref.getField(false,"_fnt" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_textcolor" /*RemoteObject*/ )),(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.text.TextAlignment"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 111;BA.debugLine="Return ItemWidth";
Debug.JustUpdateDeviceLine();
if (true) return _itemwidth;
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _finditem(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("FindItem (b4xbreadcrumb) ","b4xbreadcrumb",12,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("finditem")) { return __ref.runUserSub(false, "b4xbreadcrumb","finditem", __ref, _x, _y);}
RemoteObject _r = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 136;BA.debugLine="Private Sub FindItem (x As Int, y As Int) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 137;BA.debugLine="If RightPositions.Size = 0 Then Return -1";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_rightpositions" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 138;BA.debugLine="If y < 0 Or y > cvs.TargetRect.Height Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_y,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_y,BA.numberCast(double.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getHeight")))) { 
if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 139;BA.debugLine="Dim r As Int = RightPositions.Get(RightPositions.";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(int.class, __ref.getField(false,"_rightpositions" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_rightpositions" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 140;BA.debugLine="If x > r Then Return -1";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_x,BA.numberCast(double.class, _r))) { 
if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 141;BA.debugLine="For i = RightPositions.Size - 2 To 0 Step -1";
Debug.JustUpdateDeviceLine();
{
final int step5 = -1;
final int limit5 = 0;
_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_rightpositions" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 142;BA.debugLine="Dim r As Int = RightPositions.Get(i)";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(int.class, __ref.getField(false,"_rightpositions" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 143;BA.debugLine="If x > r Then Return i + 1";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_x,BA.numberCast(double.class, _r))) { 
if (true) return RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1);};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 145;BA.debugLine="Return 0";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, 0);
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getitems(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getItems (b4xbreadcrumb) ","b4xbreadcrumb",12,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("getitems")) { return __ref.runUserSub(false, "b4xbreadcrumb","getitems", __ref);}
 BA.debugLineNum = 153;BA.debugLine="Public Sub getItems As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 154;BA.debugLine="Return mItems";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mitems" /*RemoteObject*/ );
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xbreadcrumb) ","b4xbreadcrumb",12,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xbreadcrumb","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 25;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 26;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 27;BA.debugLine="mItems.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mitems" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 28;BA.debugLine="RightPositions.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rightpositions" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 29;BA.debugLine="bc.Initialize(1, 1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)));
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
public static RemoteObject  _setitems(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("setItems (b4xbreadcrumb) ","b4xbreadcrumb",12,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("setitems")) { return __ref.runUserSub(false, "b4xbreadcrumb","setitems", __ref, _i);}
Debug.locals.put("i", _i);
 BA.debugLineNum = 148;BA.debugLine="Public Sub setItems (i As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 149;BA.debugLine="mItems = i";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mitems" /*RemoteObject*/ ,_i);
 BA.debugLineNum = 150;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xbreadcrumb.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _touch_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("Touch_Touch (b4xbreadcrumb) ","b4xbreadcrumb",12,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("touch_touch")) { return __ref.runUserSub(false, "b4xbreadcrumb","touch_touch", __ref, _action, _x, _y);}
RemoteObject _prev = RemoteObject.createImmutable(0);
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 114;BA.debugLine="Private Sub Touch_Touch (Action As Int, X As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="Select Action";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_action,__ref.getField(false,"_touchpanel" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_DOWN"),__ref.getField(false,"_touchpanel" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE"),__ref.getField(false,"_touchpanel" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_UP"))) {
case 0: 
case 1: {
 BA.debugLineNum = 117;BA.debugLine="Dim prev As Int = PressedItem";
Debug.JustUpdateDeviceLine();
_prev = __ref.getField(true,"_presseditem" /*RemoteObject*/ );Debug.locals.put("prev", _prev);Debug.locals.put("prev", _prev);
 BA.debugLineNum = 118;BA.debugLine="PressedItem = FindItem(X, Y)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_presseditem" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xbreadcrumb.class, "_finditem" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y))));
 BA.debugLineNum = 119;BA.debugLine="If prev <> PressedItem Then Draw";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_prev,BA.numberCast(double.class, __ref.getField(true,"_presseditem" /*RemoteObject*/ )))) { 
__ref.runClassMethod (b4j.example.b4xbreadcrumb.class, "_draw" /*RemoteObject*/ );};
 break; }
case 2: {
 BA.debugLineNum = 121;BA.debugLine="Dim index As Int = FindItem(X, Y)";
Debug.JustUpdateDeviceLine();
_index = __ref.runClassMethod (b4j.example.b4xbreadcrumb.class, "_finditem" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 122;BA.debugLine="If index = PressedItem And index > -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, __ref.getField(true,"_presseditem" /*RemoteObject*/ ))) && RemoteObject.solveBoolean(">",_index,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 123;BA.debugLine="Dim Items As List";
Debug.JustUpdateDeviceLine();
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Items", _items);
 BA.debugLineNum = 124;BA.debugLine="Items.Initialize";
Debug.JustUpdateDeviceLine();
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 125;BA.debugLine="For i = 0 To index";
Debug.JustUpdateDeviceLine();
{
final int step11 = 1;
final int limit11 = _index.<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 126;BA.debugLine="Items.Add(mItems.Get(i))";
Debug.JustUpdateDeviceLine();
_items.runVoidMethod ("Add",(Object)(__ref.getField(false,"_mitems" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 128;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFee";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_mhaptic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
b4xbreadcrumb._xuiviewsutils.runVoidMethod ("_performhapticfeedback" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )));};
 BA.debugLineNum = 129;BA.debugLine="CallSub2(mCallBack, mEventName & \"_CrumbClick\"";
Debug.JustUpdateDeviceLine();
b4xbreadcrumb.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_CrumbClick"))),(Object)((_items)));
 };
 BA.debugLineNum = 131;BA.debugLine="PressedItem = -1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_presseditem" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 132;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xbreadcrumb.class, "_draw" /*RemoteObject*/ );
 break; }
}
;
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
}