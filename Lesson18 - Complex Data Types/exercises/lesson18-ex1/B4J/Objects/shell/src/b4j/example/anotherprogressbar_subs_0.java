package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class anotherprogressbar_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (anotherprogressbar) ","anotherprogressbar",11,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "anotherprogressbar","base_resize", __ref, _width, _height);}
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 49;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 50;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group1 = __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetAllViewsRecursive");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group1.runMethod(false,"Get",index1));
Debug.locals.put("v", _v);
 BA.debugLineNum = 51;BA.debugLine="v.SetLayoutAnimated(0, 0, 0, Width, Height)";
Debug.JustUpdateDeviceLine();
_v.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_width),(Object)(_height));
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 53;BA.debugLine="bc.Initialize(mBase.Width / xui.Scale, mBase.Heig";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getScale")}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getScale")}, "/",0, 0))));
 BA.debugLineNum = 54;BA.debugLine="Vertical = mBase.Height > mBase.Width";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vertical" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))));
 BA.debugLineNum = 55;BA.debugLine="UpdateGraphics";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.anotherprogressbar.class, "_updategraphics" /*RemoteObject*/ );
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
public static void  _busyloop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BusyLoop (anotherprogressbar) ","anotherprogressbar",11,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("busyloop")) { __ref.runUserSub(false, "anotherprogressbar","busyloop", __ref); return;}
ResumableSub_BusyLoop rsub = new ResumableSub_BusyLoop(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_BusyLoop extends BA.ResumableSub {
public ResumableSub_BusyLoop(b4j.example.anotherprogressbar parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.anotherprogressbar parent;
RemoteObject _myindex = RemoteObject.createImmutable(0);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _lasttime = RemoteObject.createImmutable(0L);
RemoteObject _tasks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _delta = RemoteObject.createImmutable(0f);
RemoteObject _change = RemoteObject.createImmutable(0f);
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BusyLoop (anotherprogressbar) ","anotherprogressbar",11,__ref.getField(false, "ba"),__ref,59);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 60;BA.debugLine="Dim MyIndex As Int = BusyIndex";
Debug.JustUpdateDeviceLine();
_myindex = __ref.getField(true,"_busyindex" /*RemoteObject*/ );Debug.locals.put("MyIndex", _myindex);Debug.locals.put("MyIndex", _myindex);
 BA.debugLineNum = 61;BA.debugLine="Dim r As B4XRect";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("r", _r);
 BA.debugLineNum = 62;BA.debugLine="r.Initialize(0, 0, bc.mWidth, bc.mHeight)";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, __ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mwidth"))),(Object)(BA.numberCast(float.class, __ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mheight"))));
 BA.debugLineNum = 63;BA.debugLine="Dim LastTime As Long = DateTime.Now";
Debug.JustUpdateDeviceLine();
_lasttime = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("LastTime", _lasttime);Debug.locals.put("LastTime", _lasttime);
 BA.debugLineNum = 64;BA.debugLine="Do While MyIndex = BusyIndex";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//do while
this.state = 37;
while (RemoteObject.solveBoolean("=",_myindex,BA.numberCast(double.class, __ref.getField(true,"_busyindex" /*RemoteObject*/ )))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 65;BA.debugLine="If Vertical Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 9;
if (__ref.getField(true,"_vertical" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 66;BA.debugLine="BusyBrush.SrcOffsetY = BusyBrush.SrcOffsetY + B";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_busybrush" /*RemoteObject*/ ).setField ("SrcOffsetY",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_busybrush" /*RemoteObject*/ ).getField(true,"SrcOffsetY"),__ref.getField(true,"_brushoffsetdelta" /*RemoteObject*/ )}, "+",1, 1));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 68;BA.debugLine="BusyBrush.SrcOffsetX = BusyBrush.SrcOffsetX + B";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_busybrush" /*RemoteObject*/ ).setField ("SrcOffsetX",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_busybrush" /*RemoteObject*/ ).getField(true,"SrcOffsetX"),__ref.getField(true,"_brushoffsetdelta" /*RemoteObject*/ )}, "+",1, 1));
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 70;BA.debugLine="Dim tasks As List";
Debug.JustUpdateDeviceLine();
_tasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("tasks", _tasks);
 BA.debugLineNum = 71;BA.debugLine="tasks.Initialize";
Debug.JustUpdateDeviceLine();
_tasks.runVoidMethod ("Initialize");
 BA.debugLineNum = 72;BA.debugLine="tasks.Add(bc.AsyncDrawRect(bc.TargetRect, Transp";
Debug.JustUpdateDeviceLine();
_tasks.runVoidMethod ("Add",(Object)((__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_asyncdrawrect",(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(false,"_targetrect")),(Object)(__ref.getField(false,"_transparentbrush" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 73;BA.debugLine="Dim delta As Float = mValue - CurrentValue";
Debug.JustUpdateDeviceLine();
_delta = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mvalue" /*RemoteObject*/ ),__ref.getField(true,"_currentvalue" /*RemoteObject*/ )}, "-",1, 0));Debug.locals.put("delta", _delta);Debug.locals.put("delta", _delta);
 BA.debugLineNum = 74;BA.debugLine="If Abs(delta) <= 1 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 21;
if (RemoteObject.solveBoolean("k",parent.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _delta))),BA.numberCast(double.class, 1))) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 21;
 BA.debugLineNum = 75;BA.debugLine="CurrentValue = mValue";
Debug.JustUpdateDeviceLine();
__ref.setField ("_currentvalue" /*RemoteObject*/ ,BA.numberCast(float.class, __ref.getField(true,"_mvalue" /*RemoteObject*/ )));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 77;BA.debugLine="Dim change As Float = (DateTime.Now - LastTime)";
Debug.JustUpdateDeviceLine();
_change = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),_lasttime}, "-",1, 2)),RemoteObject.createImmutable(1000),__ref.getField(true,"_valuechangepersecond" /*RemoteObject*/ )}, "/*",0, 0));Debug.locals.put("change", _change);Debug.locals.put("change", _change);
 BA.debugLineNum = 78;BA.debugLine="If delta > 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 15:
//if
this.state = 20;
if (RemoteObject.solveBoolean(">",_delta,BA.numberCast(double.class, 0))) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
 BA.debugLineNum = 79;BA.debugLine="CurrentValue = CurrentValue + Min(change, mVal";
Debug.JustUpdateDeviceLine();
__ref.setField ("_currentvalue" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentvalue" /*RemoteObject*/ ),parent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _change)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mvalue" /*RemoteObject*/ ),__ref.getField(true,"_currentvalue" /*RemoteObject*/ )}, "-",1, 0)))}, "+",1, 0)));
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 81;BA.debugLine="CurrentValue = CurrentValue - Min(change, Curr";
Debug.JustUpdateDeviceLine();
__ref.setField ("_currentvalue" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentvalue" /*RemoteObject*/ ),parent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _change)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentvalue" /*RemoteObject*/ ),__ref.getField(true,"_mvalue" /*RemoteObject*/ )}, "-",1, 0)))}, "-",1, 0)));
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 84;BA.debugLine="LastTime = DateTime.Now";
Debug.JustUpdateDeviceLine();
_lasttime = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("LastTime", _lasttime);
 BA.debugLineNum = 85;BA.debugLine="If CurrentValue < 100 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 22:
//if
this.state = 25;
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_currentvalue" /*RemoteObject*/ ),BA.numberCast(double.class, 100))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 86;BA.debugLine="tasks.Add(bc.AsyncDrawRectRounded(bc.TargetRect";
Debug.JustUpdateDeviceLine();
_tasks.runVoidMethod ("Add",(Object)((__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_asyncdrawrectrounded",(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(false,"_targetrect")),(Object)(__ref.getField(false,"_emptybrush" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_cornerradius" /*RemoteObject*/ ))))));
 if (true) break;
;
 BA.debugLineNum = 88;BA.debugLine="If Vertical Then";
Debug.JustUpdateDeviceLine();

case 25:
//if
this.state = 30;
if (__ref.getField(true,"_vertical" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 27;
}else {
this.state = 29;
}if (true) break;

case 27:
//C
this.state = 30;
 BA.debugLineNum = 89;BA.debugLine="r.Bottom = Round(CurrentValue / 100 * bc.mHeigh";
Debug.JustUpdateDeviceLine();
_r.runMethod(true,"setBottom",BA.numberCast(float.class, parent.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentvalue" /*RemoteObject*/ ),RemoteObject.createImmutable(100),__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mheight")}, "/*",0, 0)))));
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 91;BA.debugLine="r.Right = Round(CurrentValue / 100 * bc.mWidth)";
Debug.JustUpdateDeviceLine();
_r.runMethod(true,"setRight",BA.numberCast(float.class, parent.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentvalue" /*RemoteObject*/ ),RemoteObject.createImmutable(100),__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mwidth")}, "/*",0, 0)))));
 if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 94;BA.debugLine="tasks.Add(bc.AsyncDrawRectRounded(r, BusyBrush,";
Debug.JustUpdateDeviceLine();
_tasks.runVoidMethod ("Add",(Object)((__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_asyncdrawrectrounded",(Object)(_r),(Object)(__ref.getField(false,"_busybrush" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_cornerradius" /*RemoteObject*/ ))))));
 BA.debugLineNum = 95;BA.debugLine="bc.DrawBitmapCreatorsAsync(Me, \"BC\", tasks)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawbitmapcreatorsasync",(Object)(__ref),(Object)(BA.ObjectToString("BC")),(Object)(_tasks));
 BA.debugLineNum = 96;BA.debugLine="Wait For BC_BitmapReady (bmp As B4XBitmap)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","bc_bitmapready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "anotherprogressbar", "busyloop"), null);
this.state = 38;
return;
case 38:
//C
this.state = 31;
_bmp = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("bmp", _bmp);
;
 BA.debugLineNum = 97;BA.debugLine="If xui.IsB4J Then bmp = bc.Bitmap";
Debug.JustUpdateDeviceLine();
if (true) break;

case 31:
//if
this.state = 36;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J").<Boolean>get().booleanValue()) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
_bmp = __ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_getbitmap");Debug.locals.put("bmp", _bmp);
if (true) break;

case 36:
//C
this.state = 1;
;
 BA.debugLineNum = 98;BA.debugLine="bc.SetBitmapToImageView(bmp, mIV)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_setbitmaptoimageview",(Object)(_bmp),(Object)(__ref.getField(false,"_miv" /*RemoteObject*/ )));
 BA.debugLineNum = 99;BA.debugLine="Sleep(30)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "anotherprogressbar", "busyloop"),BA.numberCast(int.class, 30));
this.state = 39;
return;
case 39:
//C
this.state = 1;
;
 if (true) break;

case 37:
//C
this.state = -1;
;
 BA.debugLineNum = 101;BA.debugLine="End Sub";
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
public static void  _bc_bitmapready(RemoteObject __ref,RemoteObject _bmp) throws Exception{
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private mEventName As String 'ignore";
anotherprogressbar._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",anotherprogressbar._meventname);
 //BA.debugLineNum = 6;BA.debugLine="Private mCallBack As Object 'ignore";
anotherprogressbar._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",anotherprogressbar._mcallback);
 //BA.debugLineNum = 7;BA.debugLine="Public mBase As B4XView 'ignore";
anotherprogressbar._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",anotherprogressbar._mbase);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI 'ignore";
anotherprogressbar._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",anotherprogressbar._xui);
 //BA.debugLineNum = 9;BA.debugLine="Private BusyBrush As BCBrush";
anotherprogressbar._busybrush = RemoteObject.createNew ("b4j.example.bcpath._bcbrush");__ref.setField("_busybrush",anotherprogressbar._busybrush);
 //BA.debugLineNum = 10;BA.debugLine="Private BackgroundColor As Int";
anotherprogressbar._backgroundcolor = RemoteObject.createImmutable(0);__ref.setField("_backgroundcolor",anotherprogressbar._backgroundcolor);
 //BA.debugLineNum = 11;BA.debugLine="Private BusyIndex As Int";
anotherprogressbar._busyindex = RemoteObject.createImmutable(0);__ref.setField("_busyindex",anotherprogressbar._busyindex);
 //BA.debugLineNum = 12;BA.debugLine="Private bc As BitmapCreator";
anotherprogressbar._bc = RemoteObject.createNew ("b4j.example.bitmapcreator");__ref.setField("_bc",anotherprogressbar._bc);
 //BA.debugLineNum = 13;BA.debugLine="Private mIV As B4XView";
anotherprogressbar._miv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_miv",anotherprogressbar._miv);
 //BA.debugLineNum = 14;BA.debugLine="Private TransparentBrush As BCBrush";
anotherprogressbar._transparentbrush = RemoteObject.createNew ("b4j.example.bcpath._bcbrush");__ref.setField("_transparentbrush",anotherprogressbar._transparentbrush);
 //BA.debugLineNum = 15;BA.debugLine="Private Vertical As Boolean";
anotherprogressbar._vertical = RemoteObject.createImmutable(false);__ref.setField("_vertical",anotherprogressbar._vertical);
 //BA.debugLineNum = 16;BA.debugLine="Private CurrentValue As Float";
anotherprogressbar._currentvalue = RemoteObject.createImmutable(0f);__ref.setField("_currentvalue",anotherprogressbar._currentvalue);
 //BA.debugLineNum = 17;BA.debugLine="Public EmptyColor As Int = xui.Color_White";
anotherprogressbar._emptycolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White");__ref.setField("_emptycolor",anotherprogressbar._emptycolor);
 //BA.debugLineNum = 18;BA.debugLine="Private EmptyBrush As BCBrush";
anotherprogressbar._emptybrush = RemoteObject.createNew ("b4j.example.bcpath._bcbrush");__ref.setField("_emptybrush",anotherprogressbar._emptybrush);
 //BA.debugLineNum = 19;BA.debugLine="Private mValue As Int";
anotherprogressbar._mvalue = RemoteObject.createImmutable(0);__ref.setField("_mvalue",anotherprogressbar._mvalue);
 //BA.debugLineNum = 20;BA.debugLine="Public Tag As Object";
anotherprogressbar._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",anotherprogressbar._tag);
 //BA.debugLineNum = 21;BA.debugLine="Public ValueChangePerSecond As Float = 60";
anotherprogressbar._valuechangepersecond = BA.numberCast(float.class, 60);__ref.setField("_valuechangepersecond",anotherprogressbar._valuechangepersecond);
 //BA.debugLineNum = 22;BA.debugLine="Public CornerRadius As Int";
anotherprogressbar._cornerradius = RemoteObject.createImmutable(0);__ref.setField("_cornerradius",anotherprogressbar._cornerradius);
 //BA.debugLineNum = 23;BA.debugLine="Public BrushOffsetDelta As Int = 3";
anotherprogressbar._brushoffsetdelta = BA.numberCast(int.class, 3);__ref.setField("_brushoffsetdelta",anotherprogressbar._brushoffsetdelta);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (anotherprogressbar) ","anotherprogressbar",11,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "anotherprogressbar","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 32;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
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
 BA.debugLineNum = 35;BA.debugLine="Dim iv As ImageView";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 36;BA.debugLine="iv.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 37;BA.debugLine="mIV = iv";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_miv" /*RemoteObject*/ ).setObject (_iv.getObject());
 BA.debugLineNum = 38;BA.debugLine="mIV.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_miv" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 39;BA.debugLine="setValue(Props.GetDefault(\"Value\", 100))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.anotherprogressbar.class, "_setvalue" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Value"))),(Object)(RemoteObject.createImmutable((100)))))));
 BA.debugLineNum = 40;BA.debugLine="CurrentValue = mValue";
Debug.JustUpdateDeviceLine();
__ref.setField ("_currentvalue" /*RemoteObject*/ ,BA.numberCast(float.class, __ref.getField(true,"_mvalue" /*RemoteObject*/ )));
 BA.debugLineNum = 41;BA.debugLine="mBase.AddView(mIV, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_miv" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 42;BA.debugLine="mBase.AddView(lbl, 0, 0, mBase.Width, mBase.Heigh";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 43;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 44;BA.debugLine="BackgroundColor = xui.PaintOrColorToColor(Props.G";
Debug.JustUpdateDeviceLine();
__ref.setField ("_backgroundcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ProgressColor")))))));
 BA.debugLineNum = 45;BA.debugLine="CornerRadius = Props.GetDefault(\"CornerRadius\", 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cornerradius" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("CornerRadius"))),(Object)(RemoteObject.createImmutable((15))))));
 BA.debugLineNum = 46;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.anotherprogressbar.class, "_base_resize" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("getValue (anotherprogressbar) ","anotherprogressbar",11,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "anotherprogressbar","getvalue", __ref);}
 BA.debugLineNum = 148;BA.debugLine="Public Sub getValue As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 149;BA.debugLine="Return mValue";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mvalue" /*RemoteObject*/ );
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvisible(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getVisible (anotherprogressbar) ","anotherprogressbar",11,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("getvisible")) { return __ref.runUserSub(false, "anotherprogressbar","getvisible", __ref);}
 BA.debugLineNum = 144;BA.debugLine="Public Sub getVisible As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 145;BA.debugLine="Return mBase.Visible";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getVisible");
 BA.debugLineNum = 146;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (anotherprogressbar) ","anotherprogressbar",11,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "anotherprogressbar","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 28;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setValue (anotherprogressbar) ","anotherprogressbar",11,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "anotherprogressbar","setvalue", __ref, _v);}
Debug.locals.put("v", _v);
 BA.debugLineNum = 152;BA.debugLine="Public Sub setValue (v As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 153;BA.debugLine="mValue = Max(0, Min(100, v))";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mvalue" /*RemoteObject*/ ,BA.numberCast(int.class, anotherprogressbar.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(anotherprogressbar.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 100)),(Object)(BA.numberCast(double.class, _v)))))));
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvaluenoanimation(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("SetValueNoAnimation (anotherprogressbar) ","anotherprogressbar",11,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("setvaluenoanimation")) { return __ref.runUserSub(false, "anotherprogressbar","setvaluenoanimation", __ref, _v);}
Debug.locals.put("v", _v);
 BA.debugLineNum = 156;BA.debugLine="Public Sub SetValueNoAnimation (v As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 157;BA.debugLine="setValue(v)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.anotherprogressbar.class, "_setvalue" /*RemoteObject*/ ,(Object)(_v));
 BA.debugLineNum = 158;BA.debugLine="CurrentValue = mValue";
Debug.JustUpdateDeviceLine();
__ref.setField ("_currentvalue" /*RemoteObject*/ ,BA.numberCast(float.class, __ref.getField(true,"_mvalue" /*RemoteObject*/ )));
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvisible(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setVisible (anotherprogressbar) ","anotherprogressbar",11,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("setvisible")) { return __ref.runUserSub(false, "anotherprogressbar","setvisible", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 136;BA.debugLine="Public Sub setVisible(b As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 137;BA.debugLine="BusyIndex = BusyIndex + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_busyindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_busyindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 138;BA.debugLine="If b Then";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 139;BA.debugLine="BusyLoop";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.anotherprogressbar.class, "_busyloop" /*void*/ );
 };
 BA.debugLineNum = 141;BA.debugLine="mBase.Visible = b";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",_b);
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updategraphics(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateGraphics (anotherprogressbar) ","anotherprogressbar",11,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("updategraphics")) { return __ref.runUserSub(false, "anotherprogressbar","updategraphics", __ref);}
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _template = RemoteObject.declareNull("b4j.example.bitmapcreator");
RemoteObject _bcolor = RemoteObject.declareNull("b4j.example.bitmapcreator._argbcolor");
 BA.debugLineNum = 103;BA.debugLine="Public Sub UpdateGraphics";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 104;BA.debugLine="EmptyBrush = bc.CreateBrushFromColor(EmptyColor)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_emptybrush" /*RemoteObject*/ ,__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_createbrushfromcolor",(Object)(__ref.getField(true,"_emptycolor" /*RemoteObject*/ ))));
 BA.debugLineNum = 105;BA.debugLine="TransparentBrush = bc.CreateBrushFromColor(xui.Co";
Debug.JustUpdateDeviceLine();
__ref.setField ("_transparentbrush" /*RemoteObject*/ ,__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_createbrushfromcolor",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"))));
 BA.debugLineNum = 106;BA.debugLine="Dim Width As Int = 40";
Debug.JustUpdateDeviceLine();
_width = BA.numberCast(int.class, 40);Debug.locals.put("Width", _width);Debug.locals.put("Width", _width);
 BA.debugLineNum = 107;BA.debugLine="Dim Template As BitmapCreator";
Debug.JustUpdateDeviceLine();
_template = RemoteObject.createNew ("b4j.example.bitmapcreator");Debug.locals.put("Template", _template);
 BA.debugLineNum = 108;BA.debugLine="Dim bcolor As ARGBColor";
Debug.JustUpdateDeviceLine();
_bcolor = RemoteObject.createNew ("b4j.example.bitmapcreator._argbcolor");Debug.locals.put("bcolor", _bcolor);
 BA.debugLineNum = 109;BA.debugLine="bc.ColorToARGB(BackgroundColor, bcolor)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_colortoargb",(Object)(__ref.getField(true,"_backgroundcolor" /*RemoteObject*/ )),(Object)(_bcolor));
 BA.debugLineNum = 110;BA.debugLine="bcolor.r = Min(255, bcolor.r * 1.5)";
Debug.JustUpdateDeviceLine();
_bcolor.setField ("r",BA.numberCast(int.class, anotherprogressbar.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 255)),(Object)(RemoteObject.solve(new RemoteObject[] {_bcolor.getField(true,"r"),RemoteObject.createImmutable(1.5)}, "*",0, 0)))));
 BA.debugLineNum = 111;BA.debugLine="bcolor.g = Min(255, bcolor.g * 1.5)";
Debug.JustUpdateDeviceLine();
_bcolor.setField ("g",BA.numberCast(int.class, anotherprogressbar.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 255)),(Object)(RemoteObject.solve(new RemoteObject[] {_bcolor.getField(true,"g"),RemoteObject.createImmutable(1.5)}, "*",0, 0)))));
 BA.debugLineNum = 112;BA.debugLine="bcolor.b = Min(255, bcolor.b * 1.5)";
Debug.JustUpdateDeviceLine();
_bcolor.setField ("b",BA.numberCast(int.class, anotherprogressbar.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 255)),(Object)(RemoteObject.solve(new RemoteObject[] {_bcolor.getField(true,"b"),RemoteObject.createImmutable(1.5)}, "*",0, 0)))));
 BA.debugLineNum = 113;BA.debugLine="If Vertical Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_vertical" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 114;BA.debugLine="Template.Initialize(mBase.Width / xui.Scale, mBa";
Debug.JustUpdateDeviceLine();
_template.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getScale")}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getScale"),_width}, "/+",1, 0))));
 }else {
 BA.debugLineNum = 116;BA.debugLine="Template.Initialize(mBase.Height / xui.Scale + W";
Debug.JustUpdateDeviceLine();
_template.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getScale"),_width}, "/+",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getScale")}, "/",0, 0))));
 };
 BA.debugLineNum = 119;BA.debugLine="Template.DrawRect(Template.TargetRect, Background";
Debug.JustUpdateDeviceLine();
_template.runVoidMethod ("_drawrect",(Object)(_template.getField(false,"_targetrect")),(Object)(__ref.getField(true,"_backgroundcolor" /*RemoteObject*/ )),(Object)(anotherprogressbar.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 120;BA.debugLine="If Vertical Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_vertical" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 121;BA.debugLine="Template.DrawLine(-Width / 2, Width / 2, Templat";
Debug.JustUpdateDeviceLine();
_template.runVoidMethod ("_drawline",(Object)(BA.numberCast(float.class, -(double) (0 + _width.<Integer>get().intValue())/(double)(double) (0 + 2))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_template.getField(true,"_mwidth"),_width,RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_template.getField(true,"_mheight"),_width,RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(true,"_argbtocolor",(Object)(_bcolor))),(Object)(_width));
 }else {
 BA.debugLineNum = 123;BA.debugLine="Template.DrawLine(Width / 2, -Width / 2, Templat";
Debug.JustUpdateDeviceLine();
_template.runVoidMethod ("_drawline",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, -(double) (0 + _width.<Integer>get().intValue())/(double)(double) (0 + 2))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_template.getField(true,"_mwidth"),_width,RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_template.getField(true,"_mheight"),_width,RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(true,"_argbtocolor",(Object)(_bcolor))),(Object)(_width));
 };
 BA.debugLineNum = 125;BA.debugLine="BusyBrush = bc.CreateBrushFromBitmapCreator(Templ";
Debug.JustUpdateDeviceLine();
__ref.setField ("_busybrush" /*RemoteObject*/ ,__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_createbrushfrombitmapcreator",(Object)(_template)));
 BA.debugLineNum = 126;BA.debugLine="If mValue = 100 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mvalue" /*RemoteObject*/ ),BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 127;BA.debugLine="bc.DrawRectRounded(bc.TargetRect, BackgroundColo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawrectrounded",(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(false,"_targetrect")),(Object)(__ref.getField(true,"_backgroundcolor" /*RemoteObject*/ )),(Object)(anotherprogressbar.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 15)));
 }else {
 BA.debugLineNum = 129;BA.debugLine="bc.DrawRectRounded2(bc.TargetRect, EmptyBrush, T";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawrectrounded2",(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(false,"_targetrect")),(Object)(__ref.getField(false,"_emptybrush" /*RemoteObject*/ )),(Object)(anotherprogressbar.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 15)));
 };
 BA.debugLineNum = 131;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, mIV)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_setbitmaptoimageview",(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_getbitmap")),(Object)(__ref.getField(false,"_miv" /*RemoteObject*/ )));
 BA.debugLineNum = 132;BA.debugLine="setVisible(mBase.Visible)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.anotherprogressbar.class, "_setvisible" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getVisible")));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
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