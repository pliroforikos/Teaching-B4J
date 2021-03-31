package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xloadingindicator_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4xloadingindicator) ","b4xloadingindicator",21,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "b4xloadingindicator","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 37;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="cvs.Resize(Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Resize",(Object)(_width),(Object)(_height));
 BA.debugLineNum = 39;BA.debugLine="MainLoop";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xloadingindicator.class, "_mainloop" /*void*/ );
 BA.debugLineNum = 40;BA.debugLine="End Sub";
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
b4xloadingindicator._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4xloadingindicator._meventname);
 //BA.debugLineNum = 9;BA.debugLine="Private mCallBack As Object 'ignore";
b4xloadingindicator._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",b4xloadingindicator._mcallback);
 //BA.debugLineNum = 10;BA.debugLine="Public mBase As B4XView 'ignore";
b4xloadingindicator._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xloadingindicator._mbase);
 //BA.debugLineNum = 11;BA.debugLine="Private xui As XUI 'ignore";
b4xloadingindicator._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xloadingindicator._xui);
 //BA.debugLineNum = 12;BA.debugLine="Private clr As Int";
b4xloadingindicator._clr = RemoteObject.createImmutable(0);__ref.setField("_clr",b4xloadingindicator._clr);
 //BA.debugLineNum = 13;BA.debugLine="Private index As Int";
b4xloadingindicator._index = RemoteObject.createImmutable(0);__ref.setField("_index",b4xloadingindicator._index);
 //BA.debugLineNum = 14;BA.debugLine="Private cvs As B4XCanvas";
b4xloadingindicator._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvs",b4xloadingindicator._cvs);
 //BA.debugLineNum = 15;BA.debugLine="Private duration As Int";
b4xloadingindicator._duration = RemoteObject.createImmutable(0);__ref.setField("_duration",b4xloadingindicator._duration);
 //BA.debugLineNum = 16;BA.debugLine="Private DrawingSubName As String";
b4xloadingindicator._drawingsubname = RemoteObject.createImmutable("");__ref.setField("_drawingsubname",b4xloadingindicator._drawingsubname);
 //BA.debugLineNum = 17;BA.debugLine="Public Tag As Object";
b4xloadingindicator._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",b4xloadingindicator._tag);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (b4xloadingindicator) ","b4xloadingindicator",21,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "b4xloadingindicator","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _style = RemoteObject.createImmutable("");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 26;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 28;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 28;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 29;BA.debugLine="clr = xui.PaintOrColorToColor(Props.Get(\"Color\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_clr" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Color")))))));
 BA.debugLineNum = 30;BA.debugLine="Dim style As String= Props.Get(\"IndicatorStyle\")";
Debug.JustUpdateDeviceLine();
_style = BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IndicatorStyle")))));Debug.locals.put("style", _style);Debug.locals.put("style", _style);
 BA.debugLineNum = 31;BA.debugLine="Dim duration As Int = Props.Get(\"Duration\")";
Debug.JustUpdateDeviceLine();
b4xloadingindicator._duration = BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Duration")))));__ref.setField("_duration",b4xloadingindicator._duration);
 BA.debugLineNum = 32;BA.debugLine="DrawingSubName = \"Draw_\" & style.Replace(\" \", \"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_drawingsubname" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Draw_"),_style.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")))));
 BA.debugLineNum = 33;BA.debugLine="cvs.Initialize(mBase)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )));
 BA.debugLineNum = 34;BA.debugLine="MainLoop";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xloadingindicator.class, "_mainloop" /*void*/ );
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_arc1(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_Arc1 (b4xloadingindicator) ","b4xloadingindicator",21,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("draw_arc1")) { return __ref.runUserSub(false, "b4xloadingindicator","draw_arc1", __ref, _progress);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
RemoteObject _r = RemoteObject.createImmutable(0f);
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 105;BA.debugLine="Private Sub Draw_Arc1 (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 106;BA.debugLine="Dim p As B4XPath";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("p", _p);
 BA.debugLineNum = 107;BA.debugLine="Dim r As Float = cvs.TargetRect.CenterX - 5dip";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),b4xloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 108;BA.debugLine="If Progress < 0.5 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_progress,BA.numberCast(double.class, 0.5))) { 
 BA.debugLineNum = 109;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeArc",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(_r),(Object)(BA.numberCast(float.class, -(double) (0 + 90))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(2),RemoteObject.createImmutable(360)}, "**",0, 0))));
 }else {
 BA.debugLineNum = 111;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeArc",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(_r),(Object)(BA.numberCast(float.class, -(double) (0 + 90))),(Object)(BA.numberCast(float.class, -(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_progress}, "-",1, 0)).<Double>get().doubleValue()*(double) (0 + 2)*(double) (0 + 360))));
 };
 BA.debugLineNum = 113;BA.debugLine="cvs.ClipPath(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClipPath",(Object)(_p));
 BA.debugLineNum = 114;BA.debugLine="cvs.DrawRect(cvs.TargetRect, clr, True, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(b4xloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 115;BA.debugLine="cvs.RemoveClip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("RemoveClip");
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_arc2(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_Arc2 (b4xloadingindicator) ","b4xloadingindicator",21,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("draw_arc2")) { return __ref.runUserSub(false, "b4xloadingindicator","draw_arc2", __ref, _progress);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
RemoteObject _r = RemoteObject.createImmutable(0f);
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 118;BA.debugLine="Private Sub Draw_Arc2 (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="Dim p As B4XPath";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("p", _p);
 BA.debugLineNum = 120;BA.debugLine="Dim r As Float = cvs.TargetRect.CenterX - 5dip";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),b4xloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 121;BA.debugLine="If Progress < 0.5 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_progress,BA.numberCast(double.class, 0.5))) { 
 BA.debugLineNum = 122;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeArc",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(_r),(Object)(BA.numberCast(float.class, -(double) (0 + 90))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(2),RemoteObject.createImmutable(360)}, "**",0, 0))));
 }else {
 BA.debugLineNum = 124;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeArc",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(_r),(Object)(BA.numberCast(float.class, -(double) (0 + 90))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(0.5)}, "-",1, 0)),RemoteObject.createImmutable(2),RemoteObject.createImmutable(360)}, "-**",1, 0))));
 };
 BA.debugLineNum = 126;BA.debugLine="cvs.ClipPath(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClipPath",(Object)(_p));
 BA.debugLineNum = 127;BA.debugLine="cvs.DrawRect(cvs.TargetRect, clr, True, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(b4xloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 128;BA.debugLine="cvs.RemoveClip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("RemoveClip");
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
public static RemoteObject  _draw_fivelines1(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_FiveLines1 (b4xloadingindicator) ","b4xloadingindicator",21,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("draw_fivelines1")) { return __ref.runUserSub(false, "b4xloadingindicator","draw_fivelines1", __ref, _progress);}
RemoteObject _minr = RemoteObject.createImmutable(0);
RemoteObject _maxr = RemoteObject.createImmutable(0);
RemoteObject _dx = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _r = RemoteObject.createImmutable(0f);
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 95;BA.debugLine="Private Sub Draw_FiveLines1(Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="Dim MinR As Int = 10dip";
Debug.JustUpdateDeviceLine();
_minr = b4xloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)));Debug.locals.put("MinR", _minr);Debug.locals.put("MinR", _minr);
 BA.debugLineNum = 97;BA.debugLine="Dim MaxR As Int = cvs.TargetRect.Height / 2";
Debug.JustUpdateDeviceLine();
_maxr = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("MaxR", _maxr);Debug.locals.put("MaxR", _maxr);
 BA.debugLineNum = 98;BA.debugLine="Dim dx As Int = (cvs.TargetRect.Width - 2dip) / 5";
Debug.JustUpdateDeviceLine();
_dx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"),b4xloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 0)),RemoteObject.createImmutable(5)}, "/",0, 0));Debug.locals.put("dx", _dx);Debug.locals.put("dx", _dx);
 BA.debugLineNum = 99;BA.debugLine="For i = 0 To 4";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = 4;
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 100;BA.debugLine="Dim r As Float = MinR + MaxR / 2 + MaxR / 2 * Si";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_minr,_maxr,RemoteObject.createImmutable(2),_maxr,RemoteObject.createImmutable(2),b4xloadingindicator.__c.runMethod(true,"SinD",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360),RemoteObject.createImmutable(30),RemoteObject.createImmutable(_i)}, "*-*",1, 0)))}, "+/+/*",2, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 101;BA.debugLine="cvs.DrawLine(2dip + i * dx, cvs.TargetRect.Cente";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4xloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable(_i),_dx}, "+*",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4xloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable(_i),_dx}, "+*",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r}, "+",1, 0))),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, b4xloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_pacman(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_PacMan (b4xloadingindicator) ","b4xloadingindicator",21,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("draw_pacman")) { return __ref.runUserSub(false, "b4xloadingindicator","draw_pacman", __ref, _progress);}
RemoteObject _dotr = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
RemoteObject _angle = RemoteObject.createImmutable(0);
RemoteObject _cx = RemoteObject.createImmutable(0);
RemoteObject _cy = RemoteObject.createImmutable(0);
RemoteObject _r = RemoteObject.createImmutable(0);
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 131;BA.debugLine="Private Sub Draw_PacMan(Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 132;BA.debugLine="Dim DotR As Int = 5dip";
Debug.JustUpdateDeviceLine();
_dotr = b4xloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DotR", _dotr);Debug.locals.put("DotR", _dotr);
 BA.debugLineNum = 133;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.Width - DotR - Prog";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"),_dotr,_progress,(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),b4xloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 0))}, "--*",2, 0))),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(BA.numberCast(float.class, _dotr)),(Object)(__ref.runClassMethod (b4j.example.b4xloadingindicator.class, "_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(255),RemoteObject.createImmutable(200),_progress}, "-*",1, 0))))),(Object)(b4xloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 134;BA.debugLine="Dim p As B4XPath";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("p", _p);
 BA.debugLineNum = 135;BA.debugLine="Dim angle As Int = 70 * SinD(Progress * 180)";
Debug.JustUpdateDeviceLine();
_angle = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(70),b4xloadingindicator.__c.runMethod(true,"SinD",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(180)}, "*",0, 0)))}, "*",0, 0));Debug.locals.put("angle", _angle);Debug.locals.put("angle", _angle);
 BA.debugLineNum = 136;BA.debugLine="Dim cx As Int = cvs.TargetRect.CenterX - 5dip";
Debug.JustUpdateDeviceLine();
_cx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),b4xloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0));Debug.locals.put("cx", _cx);Debug.locals.put("cx", _cx);
 BA.debugLineNum = 137;BA.debugLine="Dim cy As Int = cvs.TargetRect.CenterY";
Debug.JustUpdateDeviceLine();
_cy = BA.numberCast(int.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"));Debug.locals.put("cy", _cy);Debug.locals.put("cy", _cy);
 BA.debugLineNum = 138;BA.debugLine="Dim r As Int = cvs.TargetRect.CenterY - 5dip";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),b4xloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 139;BA.debugLine="If angle = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_angle,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 140;BA.debugLine="cvs.DrawCircle(cx, cy, r, clr, True, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, _cx)),(Object)(BA.numberCast(float.class, _cy)),(Object)(BA.numberCast(float.class, _r)),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(b4xloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 }else {
 BA.debugLineNum = 142;BA.debugLine="p.InitializeArc(cx, cy , r, -angle / 2, -(360-an";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeArc",(Object)(BA.numberCast(float.class, _cx)),(Object)(BA.numberCast(float.class, _cy)),(Object)(BA.numberCast(float.class, _r)),(Object)(BA.numberCast(float.class, -(double) (0 + _angle.<Integer>get().intValue())/(double)(double) (0 + 2))),(Object)(BA.numberCast(float.class, -(double) (0 + (RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_angle}, "-",1, 1)).<Integer>get().intValue()))));
 BA.debugLineNum = 143;BA.debugLine="cvs.ClipPath(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClipPath",(Object)(_p));
 BA.debugLineNum = 144;BA.debugLine="cvs.DrawRect(cvs.TargetRect, clr, True, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(b4xloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 145;BA.debugLine="cvs.RemoveClip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("RemoveClip");
 };
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_singlecircle(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_SingleCircle (b4xloadingindicator) ","b4xloadingindicator",21,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("draw_singlecircle")) { return __ref.runUserSub(false, "b4xloadingindicator","draw_singlecircle", __ref, _progress);}
int _i = 0;
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 85;BA.debugLine="Private Sub Draw_SingleCircle(Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="For i = 0 To 2";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = 2;
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 87;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX, cvs.Targe";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_progress}, "*",0, 0))),(Object)(__ref.runClassMethod (b4j.example.b4xloadingindicator.class, "_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(255),RemoteObject.createImmutable(255),_progress}, "-*",1, 0))))),(Object)(b4xloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 }
}Debug.locals.put("i", _i);
;
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
public static RemoteObject  _draw_threecircles1(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_ThreeCircles1 (b4xloadingindicator) ","b4xloadingindicator",21,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("draw_threecircles1")) { return __ref.runUserSub(false, "b4xloadingindicator","draw_threecircles1", __ref, _progress);}
RemoteObject _maxr = RemoteObject.createImmutable(0f);
RemoteObject _r = RemoteObject.createImmutable(0f);
int _i = 0;
RemoteObject _alpha = RemoteObject.createImmutable(0);
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 66;BA.debugLine="Private Sub Draw_ThreeCircles1 (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 67;BA.debugLine="Dim MaxR As Float = (cvs.TargetRect.Width / 2 - 2";
Debug.JustUpdateDeviceLine();
_maxr = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"),RemoteObject.createImmutable(2),b4xloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "/-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("MaxR", _maxr);Debug.locals.put("MaxR", _maxr);
 BA.debugLineNum = 68;BA.debugLine="Dim r As Float = 10dip + MaxR + MaxR * Sin(Progre";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4xloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))),_maxr,_maxr,b4xloadingindicator.__c.runMethod(true,"Sin",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(2),b4xloadingindicator.__c.getField(true,"cPI")}, "**",0, 0)))}, "++*",2, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 69;BA.debugLine="For i = 0 To 2";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = 2;
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 70;BA.debugLine="Dim alpha As Int = i * 120 + Progress * 360";
Debug.JustUpdateDeviceLine();
_alpha = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(120),_progress,RemoteObject.createImmutable(360)}, "*+*",1, 0));Debug.locals.put("alpha", _alpha);Debug.locals.put("alpha", _alpha);
 BA.debugLineNum = 72;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * SinD";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_r,b4xloadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r,b4xloadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, b4xloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))))),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(b4xloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, b4xloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_threecircles2(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_ThreeCircles2 (b4xloadingindicator) ","b4xloadingindicator",21,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("draw_threecircles2")) { return __ref.runUserSub(false, "b4xloadingindicator","draw_threecircles2", __ref, _progress);}
RemoteObject _minr = RemoteObject.createImmutable(0);
RemoteObject _maxr = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _r = RemoteObject.createImmutable(0f);
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 76;BA.debugLine="Private Sub Draw_ThreeCircles2 (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 77;BA.debugLine="Dim MinR As Int = 5dip";
Debug.JustUpdateDeviceLine();
_minr = b4xloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("MinR", _minr);Debug.locals.put("MinR", _minr);
 BA.debugLineNum = 78;BA.debugLine="Dim MaxR As Int = cvs.TargetRect.Width / 2 / 3 -";
Debug.JustUpdateDeviceLine();
_maxr = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"),RemoteObject.createImmutable(2),RemoteObject.createImmutable(3),_minr,b4xloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "//--",2, 0));Debug.locals.put("MaxR", _maxr);Debug.locals.put("MaxR", _maxr);
 BA.debugLineNum = 79;BA.debugLine="For i = 0 To 2";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = 2;
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 80;BA.debugLine="Dim r As Float = MinR + MaxR / 2 + MaxR / 2 * Si";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_minr,_maxr,RemoteObject.createImmutable(2),_maxr,RemoteObject.createImmutable(2),b4xloadingindicator.__c.runMethod(true,"SinD",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360),RemoteObject.createImmutable(60),RemoteObject.createImmutable(_i)}, "*-*",1, 0)))}, "+/+/*",2, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 81;BA.debugLine="cvs.DrawCircle(MaxR + MinR + (MinR + MaxR + 2dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_maxr,_minr,(RemoteObject.solve(new RemoteObject[] {_minr,_maxr,b4xloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "++",2, 1)),RemoteObject.createImmutable(2),RemoteObject.createImmutable(_i)}, "++**",2, 1))),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(_r),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(b4xloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 }
}Debug.locals.put("i", _i);
;
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
public static RemoteObject  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (b4xloadingindicator) ","b4xloadingindicator",21,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "b4xloadingindicator","hide", __ref);}
 BA.debugLineNum = 61;BA.debugLine="Public Sub Hide";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="mBase.Visible = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xloadingindicator.__c.getField(true,"False"));
 BA.debugLineNum = 63;BA.debugLine="index = index + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_index" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_index" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xloadingindicator) ","b4xloadingindicator",21,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xloadingindicator","initialize", __ref, _ba, _callback, _eventname);}
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
public static void  _mainloop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MainLoop (b4xloadingindicator) ","b4xloadingindicator",21,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("mainloop")) { __ref.runUserSub(false, "b4xloadingindicator","mainloop", __ref); return;}
ResumableSub_MainLoop rsub = new ResumableSub_MainLoop(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MainLoop extends BA.ResumableSub {
public ResumableSub_MainLoop(b4j.example.b4xloadingindicator parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xloadingindicator parent;
RemoteObject _myindex = RemoteObject.createImmutable(0);
RemoteObject _n = RemoteObject.createImmutable(0L);
RemoteObject _progress = RemoteObject.createImmutable(0f);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MainLoop (b4xloadingindicator) ","b4xloadingindicator",21,__ref.getField(false, "ba"),__ref,42);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 43;BA.debugLine="index = index + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_index" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_index" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 44;BA.debugLine="Dim MyIndex As Int = index";
Debug.JustUpdateDeviceLine();
_myindex = __ref.getField(true,"_index" /*RemoteObject*/ );Debug.locals.put("MyIndex", _myindex);Debug.locals.put("MyIndex", _myindex);
 BA.debugLineNum = 45;BA.debugLine="Dim n As Long = DateTime.Now";
Debug.JustUpdateDeviceLine();
_n = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 46;BA.debugLine="Do While MyIndex = index";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//do while
this.state = 4;
while (RemoteObject.solveBoolean("=",_myindex,BA.numberCast(double.class, __ref.getField(true,"_index" /*RemoteObject*/ )))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
 BA.debugLineNum = 47;BA.debugLine="Dim progress As Float = (DateTime.Now - n) / dur";
Debug.JustUpdateDeviceLine();
_progress = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),_n}, "-",1, 2)),__ref.getField(true,"_duration" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("progress", _progress);Debug.locals.put("progress", _progress);
 BA.debugLineNum = 48;BA.debugLine="progress = progress - Floor(progress)";
Debug.JustUpdateDeviceLine();
_progress = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_progress,parent.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, _progress)))}, "-",1, 0));Debug.locals.put("progress", _progress);
 BA.debugLineNum = 49;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 50;BA.debugLine="CallSub2(Me, DrawingSubName, progress)";
Debug.JustUpdateDeviceLine();
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref),(Object)(__ref.getField(true,"_drawingsubname" /*RemoteObject*/ )),(Object)((_progress)));
 BA.debugLineNum = 51;BA.debugLine="cvs.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 52;BA.debugLine="Sleep(10)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xloadingindicator", "mainloop"),BA.numberCast(int.class, 10));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 54;BA.debugLine="End Sub";
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
public static RemoteObject  _setalpha(RemoteObject __ref,RemoteObject _c,RemoteObject _alpha) throws Exception{
try {
		Debug.PushSubsStack("SetAlpha (b4xloadingindicator) ","b4xloadingindicator",21,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("setalpha")) { return __ref.runUserSub(false, "b4xloadingindicator","setalpha", __ref, _c, _alpha);}
Debug.locals.put("c", _c);
Debug.locals.put("alpha", _alpha);
 BA.debugLineNum = 91;BA.debugLine="Private Sub SetAlpha (c As Int, alpha As Int) As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="Return Bit.And(0xffffff, c) + Bit.ShiftLeft(alpha";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.solve(new RemoteObject[] {b4xloadingindicator.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, 0xffffff)),(Object)(_c)),b4xloadingindicator.__c.getField(false,"Bit").runMethod(true,"ShiftLeft",(Object)(_alpha),(Object)(BA.numberCast(int.class, 24)))}, "+",1, 1);
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (b4xloadingindicator) ","b4xloadingindicator",21,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "b4xloadingindicator","show", __ref);}
 BA.debugLineNum = 56;BA.debugLine="Public Sub Show";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 57;BA.debugLine="mBase.Visible = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xloadingindicator.__c.getField(true,"True"));
 BA.debugLineNum = 58;BA.debugLine="MainLoop";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xloadingindicator.class, "_mainloop" /*void*/ );
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
}