package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xturtle_subs_0 {


public static RemoteObject  _actionsloop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActionsLoop (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("actionsloop")) { return __ref.runUserSub(false, "b4xturtle","actionsloop", __ref);}
RemoteObject _accumulatedtime = RemoteObject.createImmutable(0);
RemoteObject _ta = RemoteObject.declareNull("b4j.example.b4xturtle._turtleaction");
RemoteObject _duration = RemoteObject.createImmutable(0);
RemoteObject _stage = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 150;BA.debugLine="Private Sub ActionsLoop";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 151;BA.debugLine="DrawTurtle";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_drawturtle" /*void*/ );
 BA.debugLineNum = 152;BA.debugLine="Dim AccumulatedTime As Int";
Debug.JustUpdateDeviceLine();
_accumulatedtime = RemoteObject.createImmutable(0);Debug.locals.put("AccumulatedTime", _accumulatedtime);
 BA.debugLineNum = 153;BA.debugLine="Do While Queue.Size > 0 And MainTimer.Enabled And";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean(">",__ref.getField(false,"_queue" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",__ref.getField(false,"_maintimer" /*RemoteObject*/ ).runMethod(true,"getEnabled")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"RabbitMode" /*RemoteObject*/ ),b4xturtle.__c.getField(true,"False"))) {
 BA.debugLineNum = 154;BA.debugLine="Dim ta As TurtleAction = Queue.Get(0)";
Debug.JustUpdateDeviceLine();
_ta = (__ref.getField(false,"_queue" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("ta", _ta);Debug.locals.put("ta", _ta);
 BA.debugLineNum = 155;BA.debugLine="Dim Duration As Int = ta.Duration / State.SpeedF";
Debug.JustUpdateDeviceLine();
_duration = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_ta.getField(true,"Duration" /*RemoteObject*/ ),__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"SpeedFactor" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("Duration", _duration);Debug.locals.put("Duration", _duration);
 BA.debugLineNum = 156;BA.debugLine="If Duration > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_duration,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 157;BA.debugLine="If ta.StartTime = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ta.getField(true,"StartTime" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 158;BA.debugLine="ta.StartTime = DateTime.Now - TimerInterval";
Debug.JustUpdateDeviceLine();
_ta.setField ("StartTime" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {b4xturtle.__c.getField(false,"DateTime").runMethod(true,"getNow"),__ref.getField(true,"_timerinterval" /*RemoteObject*/ )}, "-",1, 2));
 BA.debugLineNum = 159;BA.debugLine="RunAction(ta, 0)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_runaction" /*RemoteObject*/ ,(Object)(_ta),(Object)(BA.numberCast(float.class, 0)));
 };
 BA.debugLineNum = 161;BA.debugLine="Dim Stage As Float = Max(0, Min(1, (DateTime.No";
Debug.JustUpdateDeviceLine();
_stage = BA.numberCast(float.class, b4xturtle.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(b4xturtle.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {b4xturtle.__c.getField(false,"DateTime").runMethod(true,"getNow"),_ta.getField(true,"StartTime" /*RemoteObject*/ )}, "-",1, 2)),_duration}, "/",0, 0))))));Debug.locals.put("Stage", _stage);Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 162;BA.debugLine="RunAction(ta, Stage)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_runaction" /*RemoteObject*/ ,(Object)(_ta),(Object)(_stage));
 BA.debugLineNum = 163;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 164;BA.debugLine="Queue.RemoveAt(0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_queue" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 165;BA.debugLine="AccumulatedTime = AccumulatedTime + Duration";
Debug.JustUpdateDeviceLine();
_accumulatedtime = RemoteObject.solve(new RemoteObject[] {_accumulatedtime,_duration}, "+",1, 1);Debug.locals.put("AccumulatedTime", _accumulatedtime);
 BA.debugLineNum = 166;BA.debugLine="If AccumulatedTime > 2 * TimerInterval Then Re";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_accumulatedtime,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),__ref.getField(true,"_timerinterval" /*RemoteObject*/ )}, "*",0, 1)))) { 
if (true) return RemoteObject.createImmutable("");};
 }else {
 BA.debugLineNum = 168;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 }else {
 BA.debugLineNum = 171;BA.debugLine="RunAction(ta, 0)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_runaction" /*RemoteObject*/ ,(Object)(_ta),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 172;BA.debugLine="RunAction(ta, 1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_runaction" /*RemoteObject*/ ,(Object)(_ta),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 173;BA.debugLine="Queue.RemoveAt(0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_queue" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 };
 }
;
 BA.debugLineNum = 176;BA.debugLine="If State.RabbitMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"RabbitMode" /*RemoteObject*/ ),b4xturtle.__c.getField(true,"False"))) { 
 BA.debugLineNum = 177;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_done\"";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_done"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 178;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_done\")";
Debug.JustUpdateDeviceLine();
b4xturtle.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_done"))));
 };
 BA.debugLineNum = 180;BA.debugLine="MainTimer.Enabled = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_maintimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xturtle.__c.getField(true,"False"));
 };
 BA.debugLineNum = 182;BA.debugLine="RefreshTurtleAfterLoop";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_refreshturtleafterloop" /*void*/ );
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
public static RemoteObject  _addaction(RemoteObject __ref,RemoteObject _ta) throws Exception{
try {
		Debug.PushSubsStack("AddAction (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,230);
if (RapidSub.canDelegate("addaction")) { return __ref.runUserSub(false, "b4xturtle","addaction", __ref, _ta);}
Debug.locals.put("TA", _ta);
 BA.debugLineNum = 230;BA.debugLine="Private Sub AddAction(TA As TurtleAction) As B4XTu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 231;BA.debugLine="Queue.Add(TA)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_queue" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_ta)));
 BA.debugLineNum = 232;BA.debugLine="If State.RabbitMode Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"RabbitMode" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 233;BA.debugLine="RabbitLoop";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_rabbitloop" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 235;BA.debugLine="If MainTimer.Enabled = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_maintimer" /*RemoteObject*/ ).runMethod(true,"getEnabled"),b4xturtle.__c.getField(true,"False"))) { 
 BA.debugLineNum = 236;BA.debugLine="MainTimer.Enabled = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_maintimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xturtle.__c.getField(true,"True"));
 };
 };
 BA.debugLineNum = 239;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _arc(RemoteObject __ref,RemoteObject _sweepangle,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("Arc (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,918);
if (RapidSub.canDelegate("arc")) { return __ref.runUserSub(false, "b4xturtle","arc", __ref, _sweepangle, _radius);}
int _i = 0;
Debug.locals.put("SweepAngle", _sweepangle);
Debug.locals.put("Radius", _radius);
 BA.debugLineNum = 918;BA.debugLine="Public Sub Arc (SweepAngle As Float, Radius As Flo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 919;BA.debugLine="PushState";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_pushstate" /*RemoteObject*/ );
 BA.debugLineNum = 920;BA.debugLine="RabbitMode.TurnLeft(SweepAngle / 2).PenUp.MoveFor";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_rabbitmode" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xturtle.class, "_turnleft" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_sweepangle,RemoteObject.createImmutable(2)}, "/",0, 0)))).runClassMethod (b4j.example.b4xturtle.class, "_penup" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xturtle.class, "_moveforward" /*RemoteObject*/ ,(Object)(_radius)).runClassMethod (b4j.example.b4xturtle.class, "_pendown" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xturtle.class, "_turnright" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 90)));
 BA.debugLineNum = 921;BA.debugLine="For i = 0 To SweepAngle";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = (int) (0 + _sweepangle.<Float>get().floatValue());
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 922;BA.debugLine="MoveForward(2 * cPI * Radius / 360).TurnRight(1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_moveforward" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),b4xturtle.__c.getField(true,"cPI"),_radius,RemoteObject.createImmutable(360)}, "**/",0, 0)))).runClassMethod (b4j.example.b4xturtle.class, "_turnright" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 1)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 924;BA.debugLine="PopState";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_popstate" /*RemoteObject*/ );
 BA.debugLineNum = 925;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 926;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("base_resize")) { __ref.runUserSub(false, "b4xturtle","base_resize", __ref, _width, _height); return;}
ResumableSub_Base_Resize rsub = new ResumableSub_Base_Resize(null,__ref,_width,_height);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Base_Resize extends BA.ResumableSub {
public ResumableSub_Base_Resize(b4j.example.b4xturtle parent,RemoteObject __ref,RemoteObject _width,RemoteObject _height) {
this.parent = parent;
this.__ref = __ref;
this._width = _width;
this._height = _height;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xturtle parent;
RemoteObject _width;
RemoteObject _height;
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _myindex = RemoteObject.createImmutable(0);
RemoteObject _layer = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
int step5;
int limit5;
RemoteObject group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,104);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 105;BA.debugLine="If Width = 0 Or Height = 0 Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_width,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",_height,BA.numberCast(double.class, 0))) { 
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
 BA.debugLineNum = 106;BA.debugLine="mWidth = Width / mDPIScale";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mwidth" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,__ref.getField(true,"_mdpiscale" /*RemoteObject*/ )}, "/",0, 0)));
 BA.debugLineNum = 107;BA.debugLine="mHeight = Height / mDPIScale";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mheight" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,__ref.getField(true,"_mdpiscale" /*RemoteObject*/ )}, "/",0, 0)));
 BA.debugLineNum = 108;BA.debugLine="Log($\"B4XTurtle size: $1.0{mWidth}x$1.0{mHeight}\"";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("B4XTurtle size: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((__ref.getField(true,"_mwidth" /*RemoteObject*/ )))),RemoteObject.createImmutable("x"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((__ref.getField(true,"_mheight" /*RemoteObject*/ )))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 109;BA.debugLine="For i = 0 To mBase.NumberOfViews - 1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//for
this.state = 10;
step5 = 1;
limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 28;
if (true) break;

case 28:
//C
this.state = 10;
if ((step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5)) this.state = 9;
if (true) break;

case 29:
//C
this.state = 28;
_i = ((int)(0 + _i + step5)) ;
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 29;
 BA.debugLineNum = 110;BA.debugLine="Dim p As B4XView = mBase.GetView(i)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 111;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, Height)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_width),(Object)(_height));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 113;BA.debugLine="ResizeIndex = ResizeIndex + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_resizeindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_resizeindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 114;BA.debugLine="Dim MyIndex As Int = ResizeIndex";
Debug.JustUpdateDeviceLine();
_myindex = __ref.getField(true,"_resizeindex" /*RemoteObject*/ );Debug.locals.put("MyIndex", _myindex);Debug.locals.put("MyIndex", _myindex);
 BA.debugLineNum = 115;BA.debugLine="Do While TurtleBCIsDrawing";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//do while
this.state = 14;
while (__ref.getField(true,"_turtlebcisdrawing" /*RemoteObject*/ ).<Boolean>get().booleanValue()) {
this.state = 13;
if (true) break;
}
if (true) break;

case 13:
//C
this.state = 11;
 BA.debugLineNum = 116;BA.debugLine="Sleep(50)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xturtle", "base_resize"),BA.numberCast(int.class, 50));
this.state = 30;
return;
case 30:
//C
this.state = 11;
;
 if (true) break;
;
 BA.debugLineNum = 118;BA.debugLine="If MyIndex <> ResizeIndex Then Return";
Debug.JustUpdateDeviceLine();

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean("!",_myindex,BA.numberCast(double.class, __ref.getField(true,"_resizeindex" /*RemoteObject*/ )))) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
if (true) return ;
if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 119;BA.debugLine="For Each layer As B4XCanvas In Layers";
Debug.JustUpdateDeviceLine();
if (true) break;

case 20:
//for
this.state = 27;
group15 = __ref.getField(false,"_layers" /*RemoteObject*/ );
index15 = 0;
groupLen15 = group15.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("layer", _layer);
this.state = 31;
if (true) break;

case 31:
//C
this.state = 27;
if (index15 < groupLen15) {
this.state = 22;
_layer = (group15.runMethod(false,"Get",index15));Debug.locals.put("layer", _layer);}
if (true) break;

case 32:
//C
this.state = 31;
index15++;
Debug.locals.put("layer", _layer);
if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 120;BA.debugLine="If xui.IsB4i Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 23:
//if
this.state = 26;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i").<Boolean>get().booleanValue()) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 121;BA.debugLine="layer.ClearRect(layer.TargetRect)";
Debug.JustUpdateDeviceLine();
_layer.runVoidMethod ("ClearRect",(Object)(_layer.runMethod(false,"getTargetRect")));
 BA.debugLineNum = 122;BA.debugLine="layer.Invalidate";
Debug.JustUpdateDeviceLine();
_layer.runVoidMethod ("Invalidate");
 if (true) break;

case 26:
//C
this.state = 32;
;
 BA.debugLineNum = 124;BA.debugLine="layer.Resize(Width, Height)";
Debug.JustUpdateDeviceLine();
_layer.runVoidMethod ("Resize",(Object)(_width),(Object)(_height));
 if (true) break;
if (true) break;

case 27:
//C
this.state = -1;
Debug.locals.put("layer", _layer);
;
 BA.debugLineNum = 126;BA.debugLine="PrepareLayers";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_preparelayers" /*RemoteObject*/ );
 BA.debugLineNum = 127;BA.debugLine="DrawTurtle";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_drawturtle" /*void*/ );
 BA.debugLineNum = 128;BA.debugLine="End Sub";
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private mEventName As String 'ignore";
b4xturtle._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4xturtle._meventname);
 //BA.debugLineNum = 7;BA.debugLine="Private mCallBack As Object 'ignore";
b4xturtle._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",b4xturtle._mcallback);
 //BA.debugLineNum = 8;BA.debugLine="Public mBase As B4XView 'ignore";
b4xturtle._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xturtle._mbase);
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI 'ignore";
b4xturtle._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xturtle._xui);
 //BA.debugLineNum = 10;BA.debugLine="Private Layers As List";
b4xturtle._layers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_layers",b4xturtle._layers);
 //BA.debugLineNum = 11;BA.debugLine="Public TurtleLayer As B4XView";
b4xturtle._turtlelayer = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_turtlelayer",b4xturtle._turtlelayer);
 //BA.debugLineNum = 12;BA.debugLine="Private mDPIScale As Float";
b4xturtle._mdpiscale = RemoteObject.createImmutable(0f);__ref.setField("_mdpiscale",b4xturtle._mdpiscale);
 //BA.debugLineNum = 13;BA.debugLine="Private mTurtleBC As BitmapCreator";
b4xturtle._mturtlebc = RemoteObject.createNew ("b4j.example.bitmapcreator");__ref.setField("_mturtlebc",b4xturtle._mturtlebc);
 //BA.debugLineNum = 14;BA.debugLine="Type TurtleAction (Duration As Int, Param1 As Flo";
;
 //BA.debugLineNum = 15;BA.debugLine="Type TurtleState (UserX As Float, UserY As Float,";
;
 //BA.debugLineNum = 18;BA.debugLine="Type TurtleTouchArgs (X As Float, Y As Float, Up";
;
 //BA.debugLineNum = 19;BA.debugLine="Private Queue As List";
b4xturtle._queue = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_queue",b4xturtle._queue);
 //BA.debugLineNum = 20;BA.debugLine="Private MainTimer As Timer";
b4xturtle._maintimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_maintimer",b4xturtle._maintimer);
 //BA.debugLineNum = 21;BA.debugLine="Private TimerInterval As Int = 16";
b4xturtle._timerinterval = BA.numberCast(int.class, 16);__ref.setField("_timerinterval",b4xturtle._timerinterval);
 //BA.debugLineNum = 22;BA.debugLine="Private State As TurtleState";
b4xturtle._state = RemoteObject.createNew ("b4j.example.b4xturtle._turtlestate");__ref.setField("_state",b4xturtle._state);
 //BA.debugLineNum = 23;BA.debugLine="Public DistancePerSecond As Int = 200";
b4xturtle._distancepersecond = BA.numberCast(int.class, 200);__ref.setField("_distancepersecond",b4xturtle._distancepersecond);
 //BA.debugLineNum = 24;BA.debugLine="Private TransparentTurtleLayerBrush As BCBrush";
b4xturtle._transparentturtlelayerbrush = RemoteObject.createNew ("b4j.example.bcpath._bcbrush");__ref.setField("_transparentturtlelayerbrush",b4xturtle._transparentturtlelayerbrush);
 //BA.debugLineNum = 25;BA.debugLine="Private TurtleBCIsDrawing As Boolean";
b4xturtle._turtlebcisdrawing = RemoteObject.createImmutable(false);__ref.setField("_turtlebcisdrawing",b4xturtle._turtlebcisdrawing);
 //BA.debugLineNum = 26;BA.debugLine="Private TurtleBrush As BCBrush";
b4xturtle._turtlebrush = RemoteObject.createNew ("b4j.example.bcpath._bcbrush");__ref.setField("_turtlebrush",b4xturtle._turtlebrush);
 //BA.debugLineNum = 27;BA.debugLine="Private Panel1 As B4XView";
b4xturtle._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_panel1",b4xturtle._panel1);
 //BA.debugLineNum = 28;BA.debugLine="Public DegreesPerSecond As Int = 720";
b4xturtle._degreespersecond = BA.numberCast(int.class, 720);__ref.setField("_degreespersecond",b4xturtle._degreespersecond);
 //BA.debugLineNum = 29;BA.debugLine="Private mWidth, mHeight As Int";
b4xturtle._mwidth = RemoteObject.createImmutable(0);__ref.setField("_mwidth",b4xturtle._mwidth);
b4xturtle._mheight = RemoteObject.createImmutable(0);__ref.setField("_mheight",b4xturtle._mheight);
 //BA.debugLineNum = 30;BA.debugLine="Private StatesStack As List";
b4xturtle._statesstack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_statesstack",b4xturtle._statesstack);
 //BA.debugLineNum = 31;BA.debugLine="Private Ready As Boolean";
b4xturtle._ready = RemoteObject.createImmutable(false);__ref.setField("_ready",b4xturtle._ready);
 //BA.debugLineNum = 32;BA.debugLine="Private bcScale As Float = xui.Scale";
b4xturtle._bcscale = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getScale");__ref.setField("_bcscale",b4xturtle._bcscale);
 //BA.debugLineNum = 33;BA.debugLine="Private DebugLastTouchEvent As Long 'ignore";
b4xturtle._debuglasttouchevent = RemoteObject.createImmutable(0L);__ref.setField("_debuglasttouchevent",b4xturtle._debuglasttouchevent);
 //BA.debugLineNum = 34;BA.debugLine="Private TurtleColor As Int";
b4xturtle._turtlecolor = RemoteObject.createImmutable(0);__ref.setField("_turtlecolor",b4xturtle._turtlecolor);
 //BA.debugLineNum = 35;BA.debugLine="Private ResizeIndex As Int";
b4xturtle._resizeindex = RemoteObject.createImmutable(0);__ref.setField("_resizeindex",b4xturtle._resizeindex);
 //BA.debugLineNum = 36;BA.debugLine="Public Tag As Object";
b4xturtle._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",b4xturtle._tag);
 //BA.debugLineNum = 37;BA.debugLine="Private RabbitLoopRunning As Boolean";
b4xturtle._rabbitlooprunning = RemoteObject.createImmutable(false);__ref.setField("_rabbitlooprunning",b4xturtle._rabbitlooprunning);
 //BA.debugLineNum = 38;BA.debugLine="Private FloodBC As BitmapCreator";
b4xturtle._floodbc = RemoteObject.createNew ("b4j.example.bitmapcreator");__ref.setField("_floodbc",b4xturtle._floodbc);
 //BA.debugLineNum = 39;BA.debugLine="Private const AlphaLevelToTreatAsTransparent As I";
b4xturtle._alphaleveltotreatastransparent = BA.numberCast(int.class, 100);__ref.setField("_alphaleveltotreatastransparent",b4xturtle._alphaleveltotreatastransparent);
 //BA.debugLineNum = 41;BA.debugLine="Private fx As JFX";
b4xturtle._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",b4xturtle._fx);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("Clear_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,356);
if (RapidSub.canDelegate("clear_action")) { return __ref.runUserSub(false, "b4xturtle","clear_action", __ref, _ta, _stage);}
RemoteObject _layer = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 356;BA.debugLine="Private Sub Clear_Action (TA As TurtleAction, Stag";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 357;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 358;BA.debugLine="Dim layer As B4XCanvas = GetLayer";
Debug.JustUpdateDeviceLine();
_layer = __ref.runClassMethod (b4j.example.b4xturtle.class, "_getlayer" /*RemoteObject*/ );Debug.locals.put("layer", _layer);Debug.locals.put("layer", _layer);
 BA.debugLineNum = 359;BA.debugLine="layer.ClearRect(layer.TargetRect)";
Debug.JustUpdateDeviceLine();
_layer.runVoidMethod ("ClearRect",(Object)(_layer.runMethod(false,"getTargetRect")));
 BA.debugLineNum = 360;BA.debugLine="RefreshMain";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_refreshmain" /*RemoteObject*/ );
 };
 BA.debugLineNum = 362;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearrect(RemoteObject __ref,RemoteObject _left,RemoteObject _top,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("ClearRect (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,243);
if (RapidSub.canDelegate("clearrect")) { return __ref.runUserSub(false, "b4xturtle","clearrect", __ref, _left, _top, _width, _height);}
RemoteObject _ta = RemoteObject.declareNull("b4j.example.b4xturtle._turtleaction");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
Debug.locals.put("Left", _left);
Debug.locals.put("Top", _top);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 243;BA.debugLine="Public Sub ClearRect (Left As Float, Top As Float,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 244;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
Debug.JustUpdateDeviceLine();
_ta = __ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(RemoteObject.createImmutable("ClearRect_Action")));Debug.locals.put("ta", _ta);Debug.locals.put("ta", _ta);
 BA.debugLineNum = 245;BA.debugLine="Dim r As B4XRect";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("r", _r);
 BA.debugLineNum = 246;BA.debugLine="r.Initialize(UserToCanvas(Left), UserToCanvas(Top";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("Initialize",(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_usertocanvas" /*RemoteObject*/ ,(Object)(_left))),(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_usertocanvas" /*RemoteObject*/ ,(Object)(_top))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 247;BA.debugLine="r.Width = UserToCanvas(Width)";
Debug.JustUpdateDeviceLine();
_r.runMethod(true,"setWidth",BA.numberCast(int.class, __ref.runClassMethod (b4j.example.b4xturtle.class, "_usertocanvas" /*RemoteObject*/ ,(Object)(_width))));
 BA.debugLineNum = 248;BA.debugLine="r.Height = UserToCanvas(Height)";
Debug.JustUpdateDeviceLine();
_r.runMethod(true,"setHeight",__ref.runClassMethod (b4j.example.b4xturtle.class, "_usertocanvas" /*RemoteObject*/ ,(Object)(_height)));
 BA.debugLineNum = 249;BA.debugLine="ta.Extra = Array(r)";
Debug.JustUpdateDeviceLine();
_ta.setField ("Extra" /*RemoteObject*/ ,b4xturtle.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_r)}))));
 BA.debugLineNum = 250;BA.debugLine="Return AddAction(ta)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(_ta));
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearrect_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("ClearRect_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,253);
if (RapidSub.canDelegate("clearrect_action")) { return __ref.runUserSub(false, "b4xturtle","clearrect_action", __ref, _ta, _stage);}
Debug.locals.put("ta", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 253;BA.debugLine="Private Sub ClearRect_Action (ta As TurtleAction,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 254;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 255;BA.debugLine="GetLayer.ClearRect(ta.Extra.Get(0))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_getlayer" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)((_ta.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 256;BA.debugLine="RefreshMain";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_refreshmain" /*RemoteObject*/ );
 };
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearscreen(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearScreen (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,271);
if (RapidSub.canDelegate("clearscreen")) { return __ref.runUserSub(false, "b4xturtle","clearscreen", __ref);}
 BA.debugLineNum = 271;BA.debugLine="Public Sub ClearScreen As B4XTurtle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 272;BA.debugLine="Return AddAction(CreateTurtleAction(0, 0, \"Clear_";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(RemoteObject.createImmutable("Clear_Action")))));
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _colorsequal(RemoteObject __ref,RemoteObject _pm1,RemoteObject _pm2) throws Exception{
try {
		Debug.PushSubsStack("ColorsEqual (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,864);
if (RapidSub.canDelegate("colorsequal")) { return __ref.runUserSub(false, "b4xturtle","colorsequal", __ref, _pm1, _pm2);}
RemoteObject _a = RemoteObject.createImmutable(0);
Debug.locals.put("pm1", _pm1);
Debug.locals.put("pm2", _pm2);
 BA.debugLineNum = 864;BA.debugLine="Private Sub ColorsEqual(pm1 As PremultipliedColor,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 865;BA.debugLine="Dim a As Int = Bit.And(0xff, pm1.a)";
Debug.JustUpdateDeviceLine();
_a = b4xturtle.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, 0xff)),(Object)(_pm1.getField(true,"a")));Debug.locals.put("a", _a);Debug.locals.put("a", _a);
 BA.debugLineNum = 866;BA.debugLine="Return (a > 0 And a < AlphaLevelToTreatAsTranspar";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_a,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("<",_a,BA.numberCast(double.class, __ref.getField(true,"_alphaleveltotreatastransparent" /*RemoteObject*/ )))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_pm1.getField(true,"a"),BA.numberCast(double.class, _pm2.getField(true,"a"))) && RemoteObject.solveBoolean("=",_pm1.getField(true,"r"),BA.numberCast(double.class, _pm2.getField(true,"r"))) && RemoteObject.solveBoolean("=",_pm1.getField(true,"g"),BA.numberCast(double.class, _pm2.getField(true,"g"))) && RemoteObject.solveBoolean("=",_pm1.getField(true,"b"),BA.numberCast(double.class, _pm2.getField(true,"b")))))));
 BA.debugLineNum = 867;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcanvaslayer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateCanvasLayer (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("createcanvaslayer")) { return __ref.runUserSub(false, "b4xturtle","createcanvaslayer", __ref);}
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 84;BA.debugLine="Private Sub CreateCanvasLayer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 85;BA.debugLine="Dim cvs As B4XCanvas";
Debug.JustUpdateDeviceLine();
_cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 86;BA.debugLine="If Layers.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_layers" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 87;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 88;BA.debugLine="mBase.AddView(p, 0, 0, mBase.Width, mBase.Height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 89;BA.debugLine="cvs.Initialize(p)";
Debug.JustUpdateDeviceLine();
_cvs.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_p));
 BA.debugLineNum = 90;BA.debugLine="TurtleLayer.BringToFront";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_turtlelayer" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 BA.debugLineNum = 92;BA.debugLine="Private jo = p As JavaObject";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _p.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 93;BA.debugLine="jo.RunMethod(\"setMouseTransparent\", Array As Obj";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMouseTransparent")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(b4xturtle.__c.getField(true,"True"))})));
 }else {
 BA.debugLineNum = 99;BA.debugLine="cvs.Initialize(Panel1)";
Debug.JustUpdateDeviceLine();
_cvs.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_panel1" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 101;BA.debugLine="Layers.Add(cvs)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_layers" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cvs)));
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
public static RemoteObject  _createimageview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateImageView (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("createimageview")) { return __ref.runUserSub(false, "b4xturtle","createimageview", __ref);}
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
 BA.debugLineNum = 140;BA.debugLine="Private Sub CreateImageView As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 141;BA.debugLine="Dim iv As ImageView";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 142;BA.debugLine="iv.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 143;BA.debugLine="Return iv";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _iv.getObject());
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createturtleaction(RemoteObject __ref,RemoteObject _duration,RemoteObject _param1,RemoteObject _runsub) throws Exception{
try {
		Debug.PushSubsStack("CreateTurtleAction (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,772);
if (RapidSub.canDelegate("createturtleaction")) { return __ref.runUserSub(false, "b4xturtle","createturtleaction", __ref, _duration, _param1, _runsub);}
RemoteObject _t1 = RemoteObject.declareNull("b4j.example.b4xturtle._turtleaction");
Debug.locals.put("Duration", _duration);
Debug.locals.put("Param1", _param1);
Debug.locals.put("RunSub", _runsub);
 BA.debugLineNum = 772;BA.debugLine="Private Sub CreateTurtleAction (Duration As Int, P";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 773;BA.debugLine="Dim t1 As TurtleAction";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4j.example.b4xturtle._turtleaction");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 774;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 775;BA.debugLine="t1.Duration = Duration";
Debug.JustUpdateDeviceLine();
_t1.setField ("Duration" /*RemoteObject*/ ,_duration);
 BA.debugLineNum = 776;BA.debugLine="t1.Param1 = Param1";
Debug.JustUpdateDeviceLine();
_t1.setField ("Param1" /*RemoteObject*/ ,_param1);
 BA.debugLineNum = 777;BA.debugLine="t1.RunSub = RunSub";
Debug.JustUpdateDeviceLine();
_t1.setField ("RunSub" /*RemoteObject*/ ,_runsub);
 BA.debugLineNum = 778;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 779;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createturtlestate(RemoteObject __ref,RemoteObject _userx,RemoteObject _usery,RemoteObject _degree,RemoteObject _pendown1,RemoteObject _pencolor,RemoteObject _penthickness,RemoteObject _speedfactor,RemoteObject _fnt,RemoteObject _alignment,RemoteObject _turtlevisible,RemoteObject _rabbitmode1,RemoteObject _canvaslayer) throws Exception{
try {
		Debug.PushSubsStack("CreateTurtleState (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,752);
if (RapidSub.canDelegate("createturtlestate")) { return __ref.runUserSub(false, "b4xturtle","createturtlestate", __ref, _userx, _usery, _degree, _pendown1, _pencolor, _penthickness, _speedfactor, _fnt, _alignment, _turtlevisible, _rabbitmode1, _canvaslayer);}
RemoteObject _t1 = RemoteObject.declareNull("b4j.example.b4xturtle._turtlestate");
Debug.locals.put("UserX", _userx);
Debug.locals.put("UserY", _usery);
Debug.locals.put("Degree", _degree);
Debug.locals.put("PenDown1", _pendown1);
Debug.locals.put("PenColor", _pencolor);
Debug.locals.put("PenThickness", _penthickness);
Debug.locals.put("SpeedFactor", _speedfactor);
Debug.locals.put("Fnt", _fnt);
Debug.locals.put("Alignment", _alignment);
Debug.locals.put("TurtleVisible", _turtlevisible);
Debug.locals.put("RabbitMode1", _rabbitmode1);
Debug.locals.put("CanvasLayer", _canvaslayer);
 BA.debugLineNum = 752;BA.debugLine="Private Sub CreateTurtleState (UserX As Float, Use";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 755;BA.debugLine="Dim t1 As TurtleState";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4j.example.b4xturtle._turtlestate");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 756;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 757;BA.debugLine="t1.UserX = UserX";
Debug.JustUpdateDeviceLine();
_t1.setField ("UserX" /*RemoteObject*/ ,_userx);
 BA.debugLineNum = 758;BA.debugLine="t1.UserY = UserY";
Debug.JustUpdateDeviceLine();
_t1.setField ("UserY" /*RemoteObject*/ ,_usery);
 BA.debugLineNum = 759;BA.debugLine="t1.Degree = Degree";
Debug.JustUpdateDeviceLine();
_t1.setField ("Degree" /*RemoteObject*/ ,_degree);
 BA.debugLineNum = 760;BA.debugLine="t1.PenDown = PenDown1";
Debug.JustUpdateDeviceLine();
_t1.setField ("PenDown" /*RemoteObject*/ ,_pendown1);
 BA.debugLineNum = 761;BA.debugLine="t1.PenColor = PenColor";
Debug.JustUpdateDeviceLine();
_t1.setField ("PenColor" /*RemoteObject*/ ,_pencolor);
 BA.debugLineNum = 762;BA.debugLine="t1.PenThickness = PenThickness";
Debug.JustUpdateDeviceLine();
_t1.setField ("PenThickness" /*RemoteObject*/ ,_penthickness);
 BA.debugLineNum = 763;BA.debugLine="t1.SpeedFactor = SpeedFactor";
Debug.JustUpdateDeviceLine();
_t1.setField ("SpeedFactor" /*RemoteObject*/ ,_speedfactor);
 BA.debugLineNum = 764;BA.debugLine="t1.Fnt = Fnt";
Debug.JustUpdateDeviceLine();
_t1.setField ("Fnt" /*RemoteObject*/ ,_fnt);
 BA.debugLineNum = 765;BA.debugLine="t1.Alignment = Alignment";
Debug.JustUpdateDeviceLine();
_t1.setField ("Alignment" /*RemoteObject*/ ,_alignment);
 BA.debugLineNum = 766;BA.debugLine="t1.TurtleVisible = TurtleVisible";
Debug.JustUpdateDeviceLine();
_t1.setField ("TurtleVisible" /*RemoteObject*/ ,_turtlevisible);
 BA.debugLineNum = 767;BA.debugLine="t1.RabbitMode = RabbitMode1";
Debug.JustUpdateDeviceLine();
_t1.setField ("RabbitMode" /*RemoteObject*/ ,_rabbitmode1);
 BA.debugLineNum = 768;BA.debugLine="t1.CanvasLayer = CanvasLayer";
Debug.JustUpdateDeviceLine();
_t1.setField ("CanvasLayer" /*RemoteObject*/ ,_canvaslayer);
 BA.debugLineNum = 769;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 770;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createturtletouchargs(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _up,RemoteObject _down,RemoteObject _move) throws Exception{
try {
		Debug.PushSubsStack("CreateTurtleTouchArgs (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,801);
if (RapidSub.canDelegate("createturtletouchargs")) { return __ref.runUserSub(false, "b4xturtle","createturtletouchargs", __ref, _x, _y, _up, _down, _move);}
RemoteObject _t1 = RemoteObject.declareNull("b4j.example.b4xturtle._turtletouchargs");
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
Debug.locals.put("Up", _up);
Debug.locals.put("Down", _down);
Debug.locals.put("Move", _move);
 BA.debugLineNum = 801;BA.debugLine="Private Sub CreateTurtleTouchArgs (X As Float, Y A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 802;BA.debugLine="Dim t1 As TurtleTouchArgs";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4j.example.b4xturtle._turtletouchargs");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 803;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 804;BA.debugLine="t1.X = X";
Debug.JustUpdateDeviceLine();
_t1.setField ("X" /*RemoteObject*/ ,_x);
 BA.debugLineNum = 805;BA.debugLine="t1.Y = Y";
Debug.JustUpdateDeviceLine();
_t1.setField ("Y" /*RemoteObject*/ ,_y);
 BA.debugLineNum = 806;BA.debugLine="t1.Up = Up";
Debug.JustUpdateDeviceLine();
_t1.setField ("Up" /*RemoteObject*/ ,_up);
 BA.debugLineNum = 807;BA.debugLine="t1.Down = Down";
Debug.JustUpdateDeviceLine();
_t1.setField ("Down" /*RemoteObject*/ ,_down);
 BA.debugLineNum = 808;BA.debugLine="t1.Move = Move";
Debug.JustUpdateDeviceLine();
_t1.setField ("Move" /*RemoteObject*/ ,_move);
 BA.debugLineNum = 809;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 810;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("designercreateview")) { __ref.runUserSub(false, "b4xturtle","designercreateview", __ref, _base, _lbl, _props); return;}
ResumableSub_DesignerCreateView rsub = new ResumableSub_DesignerCreateView(null,__ref,_base,_lbl,_props);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DesignerCreateView extends BA.ResumableSub {
public ResumableSub_DesignerCreateView(b4j.example.b4xturtle parent,RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) {
this.parent = parent;
this.__ref = __ref;
this._base = _base;
this._lbl = _lbl;
this._props = _props;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xturtle parent;
RemoteObject _base;
RemoteObject _lbl;
RemoteObject _props;
RemoteObject _paneleventname = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,60);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 61;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 62;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 62;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 63;BA.debugLine="TurtleColor = xui.PaintOrColorToColor(Props.Get(\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_turtlecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TurtleColor")))))));
 BA.debugLineNum = 64;BA.debugLine="Dim PanelEventName As String";
Debug.JustUpdateDeviceLine();
_paneleventname = RemoteObject.createImmutable("");Debug.locals.put("PanelEventName", _paneleventname);
 BA.debugLineNum = 65;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Touch\"";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 8;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Touch"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
this.state = 3;
;}
else {
this.state = 5;
;}if (true) break;

case 3:
//C
this.state = 8;
_paneleventname = BA.ObjectToString("Panel1");Debug.locals.put("PanelEventName", _paneleventname);
if (true) break;

case 5:
//C
this.state = 8;
_paneleventname = BA.ObjectToString("");Debug.locals.put("PanelEventName", _paneleventname);
if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 66;BA.debugLine="Panel1 = xui.CreatePanel(PanelEventName)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_panel1" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(_paneleventname)));
 BA.debugLineNum = 67;BA.debugLine="mBase.AddView(Panel1, 0, 0, mBase.Width, mBase.He";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_panel1" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 68;BA.debugLine="CreateCanvasLayer";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_createcanvaslayer" /*RemoteObject*/ );
 BA.debugLineNum = 69;BA.debugLine="TurtleLayer = CreateImageView";
Debug.JustUpdateDeviceLine();
__ref.setField ("_turtlelayer" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xturtle.class, "_createimageview" /*RemoteObject*/ ));
 BA.debugLineNum = 70;BA.debugLine="mBase.AddView(TurtleLayer, 0, 0, 2dip, 2dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_turtlelayer" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 71;BA.debugLine="mDPIScale = xui.Scale";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mdpiscale" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getScale"));
 BA.debugLineNum = 72;BA.debugLine="If (xui.IsB4A) Then Base_Resize(mBase.Width, mBas";
Debug.JustUpdateDeviceLine();
if (true) break;

case 9:
//if
this.state = 14;
if ((__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A")).<Boolean>get().booleanValue()) { 
this.state = 11;
;}if (true) break;

case 11:
//C
this.state = 14;
__ref.runClassMethod (b4j.example.b4xturtle.class, "_base_resize" /*void*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 73;BA.debugLine="If xui.IsB4i Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 15:
//if
this.state = 20;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i").<Boolean>get().booleanValue()) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
 BA.debugLineNum = 74;BA.debugLine="Sleep(300)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xturtle", "designercreateview"),BA.numberCast(int.class, 300));
this.state = 21;
return;
case 21:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 76;BA.debugLine="Sleep(20)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xturtle", "designercreateview"),BA.numberCast(int.class, 20));
this.state = 22;
return;
case 22:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 78;BA.debugLine="Ready = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ready" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 79;BA.debugLine="Home_Action(Null, 1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_home_action" /*RemoteObject*/ ,(Object)((parent.__c.getField(false,"Null"))),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 80;BA.debugLine="MainTimer.Enabled = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_maintimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 81;BA.debugLine="CallSub(mCallBack, mEventName & \"_Start\")";
Debug.JustUpdateDeviceLine();
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Start"))));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
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
public static RemoteObject  _drawbitmap(RemoteObject __ref,RemoteObject _bmp) throws Exception{
try {
		Debug.PushSubsStack("DrawBitmap (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,283);
if (RapidSub.canDelegate("drawbitmap")) { return __ref.runUserSub(false, "b4xturtle","drawbitmap", __ref, _bmp);}
RemoteObject _ta = RemoteObject.declareNull("b4j.example.b4xturtle._turtleaction");
Debug.locals.put("Bmp", _bmp);
 BA.debugLineNum = 283;BA.debugLine="Public Sub DrawBitmap (Bmp As B4XBitmap) As B4XTur";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 284;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
Debug.JustUpdateDeviceLine();
_ta = __ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(RemoteObject.createImmutable("DrawBitmap_Action")));Debug.locals.put("ta", _ta);Debug.locals.put("ta", _ta);
 BA.debugLineNum = 285;BA.debugLine="ta.Extra = Array(Bmp)";
Debug.JustUpdateDeviceLine();
_ta.setField ("Extra" /*RemoteObject*/ ,b4xturtle.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_bmp.getObject())}))));
 BA.debugLineNum = 286;BA.debugLine="Return AddAction(ta)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(_ta));
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawbitmap_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("DrawBitmap_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,289);
if (RapidSub.canDelegate("drawbitmap_action")) { return __ref.runUserSub(false, "b4xturtle","drawbitmap_action", __ref, _ta, _stage);}
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _dest = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _width = RemoteObject.createImmutable(0f);
RemoteObject _height = RemoteObject.createImmutable(0f);
Debug.locals.put("ta", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 289;BA.debugLine="Private Sub DrawBitmap_Action (ta As TurtleAction,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 290;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 291;BA.debugLine="Dim cvs As B4XCanvas = GetLayer";
Debug.JustUpdateDeviceLine();
_cvs = __ref.runClassMethod (b4j.example.b4xturtle.class, "_getlayer" /*RemoteObject*/ );Debug.locals.put("cvs", _cvs);Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 292;BA.debugLine="Dim bmp As B4XBitmap = ta.Extra.Get(0)";
Debug.JustUpdateDeviceLine();
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _ta.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 293;BA.debugLine="Dim dest As B4XRect";
Debug.JustUpdateDeviceLine();
_dest = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("dest", _dest);
 BA.debugLineNum = 294;BA.debugLine="Dim width As Float = bmp.Width";
Debug.JustUpdateDeviceLine();
_width = BA.numberCast(float.class, _bmp.runMethod(true,"getWidth"));Debug.locals.put("width", _width);Debug.locals.put("width", _width);
 BA.debugLineNum = 295;BA.debugLine="Dim height As Float = bmp.Height";
Debug.JustUpdateDeviceLine();
_height = BA.numberCast(float.class, _bmp.runMethod(true,"getHeight"));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 296;BA.debugLine="dest.Initialize(UserToCanvas(State.UserX - width";
Debug.JustUpdateDeviceLine();
_dest.runVoidMethod ("Initialize",(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_usertocanvas" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserX" /*RemoteObject*/ ),_width,RemoteObject.createImmutable(2)}, "-/",1, 0))))),(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_usertocanvas" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserY" /*RemoteObject*/ ),_height,RemoteObject.createImmutable(2)}, "-/",1, 0))))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 297;BA.debugLine="dest.Width = UserToCanvas(width)";
Debug.JustUpdateDeviceLine();
_dest.runMethod(true,"setWidth",BA.numberCast(int.class, __ref.runClassMethod (b4j.example.b4xturtle.class, "_usertocanvas" /*RemoteObject*/ ,(Object)(_width))));
 BA.debugLineNum = 298;BA.debugLine="dest.Height = UserToCanvas(height)";
Debug.JustUpdateDeviceLine();
_dest.runMethod(true,"setHeight",__ref.runClassMethod (b4j.example.b4xturtle.class, "_usertocanvas" /*RemoteObject*/ ,(Object)(_height)));
 BA.debugLineNum = 299;BA.debugLine="cvs.DrawBitmapRotated(bmp, dest, State.Degree)";
Debug.JustUpdateDeviceLine();
_cvs.runVoidMethod ("DrawBitmapRotated",(Object)((_bmp.getObject())),(Object)(_dest),(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Degree" /*RemoteObject*/ )));
 BA.debugLineNum = 300;BA.debugLine="RefreshMain";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_refreshmain" /*RemoteObject*/ );
 };
 BA.debugLineNum = 302;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawpolygon(RemoteObject __ref,RemoteObject _cvs1,RemoteObject _points,RemoteObject _color,RemoteObject _filled,RemoteObject _strokewidth) throws Exception{
try {
		Debug.PushSubsStack("DrawPolygon (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,928);
if (RapidSub.canDelegate("drawpolygon")) { return __ref.runUserSub(false, "b4xturtle","drawpolygon", __ref, _cvs1, _points, _color, _filled, _strokewidth);}
RemoteObject _jcvs = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _xpoints = null;
RemoteObject _ypoints = null;
int _i = 0;
RemoteObject _point = null;
RemoteObject _paint = RemoteObject.declareNull("Object");
Debug.locals.put("cvs1", _cvs1);
Debug.locals.put("Points", _points);
Debug.locals.put("Color", _color);
Debug.locals.put("Filled", _filled);
Debug.locals.put("StrokeWidth", _strokewidth);
 BA.debugLineNum = 928;BA.debugLine="Private Sub DrawPolygon (cvs1 As B4XCanvas, Points";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 929;BA.debugLine="If Points.Size < 1 Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_points.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 940;BA.debugLine="Dim jcvs As JavaObject = cvs1";
Debug.JustUpdateDeviceLine();
_jcvs = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jcvs = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _cvs1);Debug.locals.put("jcvs", _jcvs);
 BA.debugLineNum = 941;BA.debugLine="jcvs = jcvs.GetFieldJO(\"cvs\").RunMethodJO(\"getObj";
Debug.JustUpdateDeviceLine();
_jcvs = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jcvs.runMethod(false,"GetFieldJO",(Object)(RemoteObject.createImmutable("cvs"))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getObject")),(Object)((b4xturtle.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getGraphicsContext2D")),(Object)((b4xturtle.__c.getField(false,"Null")))));
 BA.debugLineNum = 942;BA.debugLine="jcvs.RunMethod(\"save\", Null)";
Debug.JustUpdateDeviceLine();
_jcvs.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("save")),(Object)((b4xturtle.__c.getField(false,"Null"))));
 BA.debugLineNum = 943;BA.debugLine="Dim xpoints(Points.Size), ypoints(Points.Size) As";
Debug.JustUpdateDeviceLine();
_xpoints = RemoteObject.createNewArray ("double", new int[] {_points.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("xpoints", _xpoints);
_ypoints = RemoteObject.createNewArray ("double", new int[] {_points.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("ypoints", _ypoints);
 BA.debugLineNum = 944;BA.debugLine="For i = 0 To Points.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_points.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 945;BA.debugLine="Dim point() As Float = Points.Get(i)";
Debug.JustUpdateDeviceLine();
_point = (_points.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("point", _point);Debug.locals.put("point", _point);
 BA.debugLineNum = 946;BA.debugLine="xpoints(i) = point(0)";
Debug.JustUpdateDeviceLine();
_xpoints.setArrayElement (BA.numberCast(double.class, _point.getArrayElement(true,BA.numberCast(int.class, 0))),BA.numberCast(int.class, _i));
 BA.debugLineNum = 947;BA.debugLine="ypoints(i) = point(1)";
Debug.JustUpdateDeviceLine();
_ypoints.setArrayElement (BA.numberCast(double.class, _point.getArrayElement(true,BA.numberCast(int.class, 1))),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 949;BA.debugLine="Dim paint As Object = fx.Colors.From32Bit(Color)";
Debug.JustUpdateDeviceLine();
_paint = (__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(_color)));Debug.locals.put("paint", _paint);Debug.locals.put("paint", _paint);
 BA.debugLineNum = 950;BA.debugLine="If Filled Then";
Debug.JustUpdateDeviceLine();
if (_filled.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 951;BA.debugLine="jcvs.RunMethod(\"setFill\", Array(paint))";
Debug.JustUpdateDeviceLine();
_jcvs.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFill")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_paint})));
 BA.debugLineNum = 952;BA.debugLine="jcvs.RunMethod(\"fillPolygon\", Array(xpoints, ypo";
Debug.JustUpdateDeviceLine();
_jcvs.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("fillPolygon")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_xpoints),(_ypoints),(_points.runMethod(true,"getSize"))})));
 }else {
 BA.debugLineNum = 954;BA.debugLine="jcvs.RunMethod(\"setStroke\", Array(paint))";
Debug.JustUpdateDeviceLine();
_jcvs.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setStroke")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_paint})));
 BA.debugLineNum = 955;BA.debugLine="jcvs.RunMethod(\"setLineWidth\", Array(StrokeWidth";
Debug.JustUpdateDeviceLine();
_jcvs.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setLineWidth")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_strokewidth)})));
 BA.debugLineNum = 956;BA.debugLine="jcvs.RunMethod(\"strokePolygon\", Array(xpoints, y";
Debug.JustUpdateDeviceLine();
_jcvs.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("strokePolygon")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_xpoints),(_ypoints),(_points.runMethod(true,"getSize"))})));
 };
 BA.debugLineNum = 958;BA.debugLine="jcvs.RunMethod(\"restore\", Null)";
Debug.JustUpdateDeviceLine();
_jcvs.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("restore")),(Object)((b4xturtle.__c.getField(false,"Null"))));
 BA.debugLineNum = 960;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawtext(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("DrawText (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,587);
if (RapidSub.canDelegate("drawtext")) { return __ref.runUserSub(false, "b4xturtle","drawtext", __ref, _text);}
RemoteObject _ta = RemoteObject.declareNull("b4j.example.b4xturtle._turtleaction");
Debug.locals.put("Text", _text);
 BA.debugLineNum = 587;BA.debugLine="Public Sub DrawText (Text As String) As B4XTurtle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 588;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
Debug.JustUpdateDeviceLine();
_ta = __ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(RemoteObject.createImmutable("DrawText_Action")));Debug.locals.put("ta", _ta);Debug.locals.put("ta", _ta);
 BA.debugLineNum = 589;BA.debugLine="ta.Extra = Array(Text)";
Debug.JustUpdateDeviceLine();
_ta.setField ("Extra" /*RemoteObject*/ ,b4xturtle.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_text)}))));
 BA.debugLineNum = 590;BA.debugLine="Return AddAction(ta)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(_ta));
 BA.debugLineNum = 591;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawtext_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("DrawText_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,593);
if (RapidSub.canDelegate("drawtext_action")) { return __ref.runUserSub(false, "b4xturtle","drawtext_action", __ref, _ta, _stage);}
RemoteObject _text = RemoteObject.createImmutable("");
RemoteObject _layer = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _baseline = RemoteObject.createImmutable(0);
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 593;BA.debugLine="Private Sub DrawText_Action (TA As TurtleAction, S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 594;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 595;BA.debugLine="Dim text As String = TA.Extra.Get(0)";
Debug.JustUpdateDeviceLine();
_text = BA.ObjectToString(_ta.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("text", _text);Debug.locals.put("text", _text);
 BA.debugLineNum = 596;BA.debugLine="Dim layer As B4XCanvas = GetLayer";
Debug.JustUpdateDeviceLine();
_layer = __ref.runClassMethod (b4j.example.b4xturtle.class, "_getlayer" /*RemoteObject*/ );Debug.locals.put("layer", _layer);Debug.locals.put("layer", _layer);
 BA.debugLineNum = 597;BA.debugLine="Dim r As B4XRect = layer.MeasureText(text, State";
Debug.JustUpdateDeviceLine();
_r = _layer.runMethod(false,"MeasureText",(Object)(_text),(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(false,"Fnt" /*RemoteObject*/ )));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 598;BA.debugLine="Dim BaseLine As Int = UserToCanvas(State.UserY)";
Debug.JustUpdateDeviceLine();
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4j.example.b4xturtle.class, "_usertocanvas" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserY" /*RemoteObject*/ ))),_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_r.runMethod(true,"getTop")}, "-/-",2, 0));Debug.locals.put("BaseLine", _baseline);Debug.locals.put("BaseLine", _baseline);
 BA.debugLineNum = 599;BA.debugLine="layer.DrawText(text, UserToCanvas(State.UserX),";
Debug.JustUpdateDeviceLine();
_layer.runVoidMethod ("DrawText",(Object)(_text),(Object)(BA.numberCast(double.class, __ref.runClassMethod (b4j.example.b4xturtle.class, "_usertocanvas" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserX" /*RemoteObject*/ ))))),(Object)(BA.numberCast(double.class, _baseline)),(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(false,"Fnt" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"PenColor" /*RemoteObject*/ )),(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.text.TextAlignment"),__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Alignment" /*RemoteObject*/ ))));
 BA.debugLineNum = 600;BA.debugLine="RefreshMain";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_refreshmain" /*RemoteObject*/ );
 };
 BA.debugLineNum = 602;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _drawturtle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawTurtle (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,710);
if (RapidSub.canDelegate("drawturtle")) { __ref.runUserSub(false, "b4xturtle","drawturtle", __ref); return;}
ResumableSub_DrawTurtle rsub = new ResumableSub_DrawTurtle(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DrawTurtle extends BA.ResumableSub {
public ResumableSub_DrawTurtle(b4j.example.b4xturtle parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xturtle parent;
RemoteObject _tasks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _h = RemoteObject.createImmutable(0);
RemoteObject _t = RemoteObject.createImmutable(0);
RemoteObject _p1x = RemoteObject.createImmutable(0f);
RemoteObject _p1y = RemoteObject.createImmutable(0f);
RemoteObject _p2x = RemoteObject.createImmutable(0f);
RemoteObject _p2y = RemoteObject.createImmutable(0f);
RemoteObject _p3x = RemoteObject.createImmutable(0f);
RemoteObject _p3y = RemoteObject.createImmutable(0f);
RemoteObject _path = RemoteObject.declareNull("b4j.example.bcpath");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DrawTurtle (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,710);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 711;BA.debugLine="If State.TurtleVisible = False Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"TurtleVisible" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
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
 BA.debugLineNum = 712;BA.debugLine="If TurtleBCIsDrawing Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 10;
if (__ref.getField(true,"_turtlebcisdrawing" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 714;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 716;BA.debugLine="If mTurtleBC.IsInitialized = False Then Return";
Debug.JustUpdateDeviceLine();

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mturtlebc" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),parent.__c.getField(true,"False"))) { 
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
 BA.debugLineNum = 717;BA.debugLine="TurtleBCIsDrawing = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_turtlebcisdrawing" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 718;BA.debugLine="Dim tasks As List";
Debug.JustUpdateDeviceLine();
_tasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("tasks", _tasks);
 BA.debugLineNum = 719;BA.debugLine="tasks.Initialize";
Debug.JustUpdateDeviceLine();
_tasks.runVoidMethod ("Initialize");
 BA.debugLineNum = 720;BA.debugLine="tasks.Add(mTurtleBC.AsyncDrawRect(mTurtleBC.Targe";
Debug.JustUpdateDeviceLine();
_tasks.runVoidMethod ("Add",(Object)((__ref.getField(false,"_mturtlebc" /*RemoteObject*/ ).runMethod(false,"_asyncdrawrect",(Object)(__ref.getField(false,"_mturtlebc" /*RemoteObject*/ ).getField(false,"_targetrect")),(Object)(__ref.getField(false,"_transparentturtlelayerbrush" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 721;BA.debugLine="Dim h As Int = 12";
Debug.JustUpdateDeviceLine();
_h = BA.numberCast(int.class, 12);Debug.locals.put("h", _h);Debug.locals.put("h", _h);
 BA.debugLineNum = 722;BA.debugLine="Dim t As Int = 15";
Debug.JustUpdateDeviceLine();
_t = BA.numberCast(int.class, 15);Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 723;BA.debugLine="Dim p1x As Float = State.UserX - h * CosD(60 + St";
Debug.JustUpdateDeviceLine();
_p1x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserX" /*RemoteObject*/ ),_h,parent.__c.runMethod(true,"CosD",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(60),__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Degree" /*RemoteObject*/ )}, "+",1, 0)))}, "-*",1, 0));Debug.locals.put("p1x", _p1x);Debug.locals.put("p1x", _p1x);
 BA.debugLineNum = 724;BA.debugLine="Dim p1y As Float = State.UserY - h * SinD(60 + St";
Debug.JustUpdateDeviceLine();
_p1y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserY" /*RemoteObject*/ ),_h,parent.__c.runMethod(true,"SinD",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(60),__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Degree" /*RemoteObject*/ )}, "+",1, 0)))}, "-*",1, 0));Debug.locals.put("p1y", _p1y);Debug.locals.put("p1y", _p1y);
 BA.debugLineNum = 725;BA.debugLine="Dim p2x As Float = State.UserX - h * SinD(30 + St";
Debug.JustUpdateDeviceLine();
_p2x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserX" /*RemoteObject*/ ),_h,parent.__c.runMethod(true,"SinD",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(30),__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Degree" /*RemoteObject*/ )}, "+",1, 0)))}, "-*",1, 0));Debug.locals.put("p2x", _p2x);Debug.locals.put("p2x", _p2x);
 BA.debugLineNum = 726;BA.debugLine="Dim p2y As Float = State.UserY + h * CosD(30 + St";
Debug.JustUpdateDeviceLine();
_p2y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserY" /*RemoteObject*/ ),_h,parent.__c.runMethod(true,"CosD",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(30),__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Degree" /*RemoteObject*/ )}, "+",1, 0)))}, "+*",1, 0));Debug.locals.put("p2y", _p2y);Debug.locals.put("p2y", _p2y);
 BA.debugLineNum = 727;BA.debugLine="Dim p3x As Float = State.UserX + t * CosD(State.D";
Debug.JustUpdateDeviceLine();
_p3x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserX" /*RemoteObject*/ ),_t,parent.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, __ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Degree" /*RemoteObject*/ ))))}, "+*",1, 0));Debug.locals.put("p3x", _p3x);Debug.locals.put("p3x", _p3x);
 BA.debugLineNum = 728;BA.debugLine="Dim p3y As Float = State.UserY + t * SinD(State.D";
Debug.JustUpdateDeviceLine();
_p3y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserY" /*RemoteObject*/ ),_t,parent.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, __ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Degree" /*RemoteObject*/ ))))}, "+*",1, 0));Debug.locals.put("p3y", _p3y);Debug.locals.put("p3y", _p3y);
 BA.debugLineNum = 730;BA.debugLine="Dim path As BCPath";
Debug.JustUpdateDeviceLine();
_path = RemoteObject.createNew ("b4j.example.bcpath");Debug.locals.put("path", _path);
 BA.debugLineNum = 731;BA.debugLine="path.Initialize(p2x * bcScale, p2y * bcScale).Lin";
Debug.JustUpdateDeviceLine();
_path.runMethod(false,"_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_p2x,__ref.getField(true,"_bcscale" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_p2y,__ref.getField(true,"_bcscale" /*RemoteObject*/ )}, "*",0, 0)))).runMethod(false,"_lineto",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_p1x,__ref.getField(true,"_bcscale" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_p1y,__ref.getField(true,"_bcscale" /*RemoteObject*/ )}, "*",0, 0)))).runMethod(false,"_lineto",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_p3x,__ref.getField(true,"_bcscale" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_p3y,__ref.getField(true,"_bcscale" /*RemoteObject*/ )}, "*",0, 0)))).runVoidMethod ("_lineto",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_p2x,__ref.getField(true,"_bcscale" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_p2y,__ref.getField(true,"_bcscale" /*RemoteObject*/ )}, "*",0, 0))));
 BA.debugLineNum = 732;BA.debugLine="tasks.Add(mTurtleBC.AsyncDrawPath(path, TurtleBru";
Debug.JustUpdateDeviceLine();
_tasks.runVoidMethod ("Add",(Object)((__ref.getField(false,"_mturtlebc" /*RemoteObject*/ ).runMethod(false,"_asyncdrawpath",(Object)(_path),(Object)(__ref.getField(false,"_turtlebrush" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),__ref.getField(true,"_bcscale" /*RemoteObject*/ )}, "*",0, 0)))))));
 BA.debugLineNum = 738;BA.debugLine="mTurtleBC.DrawBitmapCreatorsAsync(Me, \"TurtleBC\",";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mturtlebc" /*RemoteObject*/ ).runVoidMethod ("_drawbitmapcreatorsasync",(Object)(__ref),(Object)(BA.ObjectToString("TurtleBC")),(Object)(_tasks));
 BA.debugLineNum = 739;BA.debugLine="Wait For TurtleBC_BitmapReady (bmp As B4XBitmap)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","turtlebc_bitmapready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xturtle", "drawturtle"), null);
this.state = 20;
return;
case 20:
//C
this.state = 16;
_bmp = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("bmp", _bmp);
;
 BA.debugLineNum = 740;BA.debugLine="If xui.IsB4J Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 16:
//if
this.state = 19;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J").<Boolean>get().booleanValue()) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 741;BA.debugLine="bmp = mTurtleBC.Bitmap";
Debug.JustUpdateDeviceLine();
_bmp = __ref.getField(false,"_mturtlebc" /*RemoteObject*/ ).runMethod(false,"_getbitmap");Debug.locals.put("bmp", _bmp);
 if (true) break;

case 19:
//C
this.state = -1;
;
 BA.debugLineNum = 743;BA.debugLine="mTurtleBC.SetBitmapToImageView(bmp, TurtleLayer)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mturtlebc" /*RemoteObject*/ ).runVoidMethod ("_setbitmaptoimageview",(Object)(_bmp),(Object)(__ref.getField(false,"_turtlelayer" /*RemoteObject*/ )));
 BA.debugLineNum = 744;BA.debugLine="TurtleBCIsDrawing = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_turtlebcisdrawing" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 745;BA.debugLine="End Sub";
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
public static void  _turtlebc_bitmapready(RemoteObject __ref,RemoteObject _bmp) throws Exception{
}
public static RemoteObject  _fill(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Fill (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,870);
if (RapidSub.canDelegate("fill")) { return __ref.runUserSub(false, "b4xturtle","fill", __ref);}
RemoteObject _ta = RemoteObject.declareNull("b4j.example.b4xturtle._turtleaction");
 BA.debugLineNum = 870;BA.debugLine="Public Sub Fill As B4XTurtle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 871;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
Debug.JustUpdateDeviceLine();
_ta = __ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(RemoteObject.createImmutable("Fill_Action")));Debug.locals.put("ta", _ta);Debug.locals.put("ta", _ta);
 BA.debugLineNum = 872;BA.debugLine="Return AddAction(ta)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(_ta));
 BA.debugLineNum = 873;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fill_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("Fill_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,875);
if (RapidSub.canDelegate("fill_action")) { return __ref.runUserSub(false, "b4xturtle","fill_action", __ref, _ta, _stage);}
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 875;BA.debugLine="Private Sub Fill_Action (TA As TurtleAction, Stage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 876;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 877;BA.debugLine="FloodFill (State.UserX, State.UserY, State.PenCo";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_floodfill" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserX" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserY" /*RemoteObject*/ ))),(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"PenColor" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 879;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fillpolygon(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FillPolygon (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,897);
if (RapidSub.canDelegate("fillpolygon")) { return __ref.runUserSub(false, "b4xturtle","fillpolygon", __ref);}
RemoteObject _ta = RemoteObject.declareNull("b4j.example.b4xturtle._turtleaction");
 BA.debugLineNum = 897;BA.debugLine="Public Sub FillPolygon As B4XTurtle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 898;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
Debug.JustUpdateDeviceLine();
_ta = __ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(RemoteObject.createImmutable("FillPolygon_Action")));Debug.locals.put("ta", _ta);Debug.locals.put("ta", _ta);
 BA.debugLineNum = 899;BA.debugLine="Return AddAction(ta)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(_ta));
 BA.debugLineNum = 900;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fillpolygon_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("FillPolygon_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,902);
if (RapidSub.canDelegate("fillpolygon_action")) { return __ref.runUserSub(false, "b4xturtle","fillpolygon_action", __ref, _ta, _stage);}
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 902;BA.debugLine="Private Sub FillPolygon_Action (TA As TurtleAction";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 903;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 904;BA.debugLine="State.TrackPolygon = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("TrackPolygon" /*RemoteObject*/ ,b4xturtle.__c.getField(true,"False"));
 BA.debugLineNum = 905;BA.debugLine="DrawPolygon(GetLayer, State.PolygonPoints, State";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_drawpolygon" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_getlayer" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(false,"PolygonPoints" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"PenColor" /*RemoteObject*/ )),(Object)(b4xturtle.__c.getField(true,"True")),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 906;BA.debugLine="RefreshMain";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_refreshmain" /*RemoteObject*/ );
 BA.debugLineNum = 907;BA.debugLine="State.PolygonPoints.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).getField(false,"PolygonPoints" /*RemoteObject*/ ).runVoidMethod ("Clear");
 };
 BA.debugLineNum = 909;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _floodfill(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _replacementcolor) throws Exception{
try {
		Debug.PushSubsStack("FloodFill (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,812);
if (RapidSub.canDelegate("floodfill")) { return __ref.runUserSub(false, "b4xturtle","floodfill", __ref, _x, _y, _replacementcolor);}
RemoteObject _layer = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _xx = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _yy = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tpm = RemoteObject.declareNull("b4j.example.bitmapcreator._premultipliedcolor");
RemoteObject _rpm = RemoteObject.declareNull("b4j.example.bitmapcreator._premultipliedcolor");
RemoteObject _argb = RemoteObject.declareNull("b4j.example.bitmapcreator._argbcolor");
RemoteObject _r = RemoteObject.createImmutable((byte)0);
RemoteObject _g = RemoteObject.createImmutable((byte)0);
RemoteObject _b = RemoteObject.createImmutable((byte)0);
RemoteObject _a = RemoteObject.createImmutable((byte)0);
RemoteObject _nx = RemoteObject.createImmutable(0);
RemoteObject _ny = RemoteObject.createImmutable(0);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
Debug.locals.put("ReplacementColor", _replacementcolor);
 BA.debugLineNum = 812;BA.debugLine="Private Sub FloodFill (X As Int, Y As Int, Replace";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 814;BA.debugLine="If FloodBC.IsInitialized = False Or FloodBC.mWidt";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_floodbc" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),b4xturtle.__c.getField(true,"False")) || RemoteObject.solveBoolean("!",__ref.getField(false,"_floodbc" /*RemoteObject*/ ).getField(true,"_mwidth"),BA.numberCast(double.class, __ref.getField(true,"_mwidth" /*RemoteObject*/ ))) || RemoteObject.solveBoolean("!",__ref.getField(false,"_floodbc" /*RemoteObject*/ ).getField(true,"_mheight"),BA.numberCast(double.class, __ref.getField(true,"_mheight" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 815;BA.debugLine="FloodBC.Initialize(mWidth, mHeight)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_floodbc" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_mwidth" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mheight" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 817;BA.debugLine="Dim layer As B4XCanvas = GetLayer";
Debug.JustUpdateDeviceLine();
_layer = __ref.runClassMethod (b4j.example.b4xturtle.class, "_getlayer" /*RemoteObject*/ );Debug.locals.put("layer", _layer);Debug.locals.put("layer", _layer);
 BA.debugLineNum = 818;BA.debugLine="Dim bmp As B4XBitmap = layer.CreateBitmap";
Debug.JustUpdateDeviceLine();
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp = _layer.runMethod(false,"CreateBitmap");Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 819;BA.debugLine="FloodBC.CopyPixelsFromBitmap(bmp)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_floodbc" /*RemoteObject*/ ).runVoidMethod ("_copypixelsfrombitmap",(Object)(_bmp));
 BA.debugLineNum = 820;BA.debugLine="Dim xx As List";
Debug.JustUpdateDeviceLine();
_xx = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("xx", _xx);
 BA.debugLineNum = 821;BA.debugLine="xx.Initialize";
Debug.JustUpdateDeviceLine();
_xx.runVoidMethod ("Initialize");
 BA.debugLineNum = 822;BA.debugLine="Dim yy As List";
Debug.JustUpdateDeviceLine();
_yy = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("yy", _yy);
 BA.debugLineNum = 823;BA.debugLine="yy.Initialize";
Debug.JustUpdateDeviceLine();
_yy.runVoidMethod ("Initialize");
 BA.debugLineNum = 824;BA.debugLine="Dim tpm, rpm As PremultipliedColor";
Debug.JustUpdateDeviceLine();
_tpm = RemoteObject.createNew ("b4j.example.bitmapcreator._premultipliedcolor");Debug.locals.put("tpm", _tpm);
_rpm = RemoteObject.createNew ("b4j.example.bitmapcreator._premultipliedcolor");Debug.locals.put("rpm", _rpm);
 BA.debugLineNum = 825;BA.debugLine="Dim argb As ARGBColor";
Debug.JustUpdateDeviceLine();
_argb = RemoteObject.createNew ("b4j.example.bitmapcreator._argbcolor");Debug.locals.put("argb", _argb);
 BA.debugLineNum = 826;BA.debugLine="FloodBC.GetPremultipliedColor(X, Y, tpm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_floodbc" /*RemoteObject*/ ).runVoidMethod ("_getpremultipliedcolor",(Object)(_x),(Object)(_y),(Object)(_tpm));
 BA.debugLineNum = 827;BA.debugLine="FloodBC.ARGBToPremultipliedColor(FloodBC.ColorToA";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_floodbc" /*RemoteObject*/ ).runVoidMethod ("_argbtopremultipliedcolor",(Object)(__ref.getField(false,"_floodbc" /*RemoteObject*/ ).runMethod(false,"_colortoargb",(Object)(_replacementcolor),(Object)(_argb))),(Object)(_rpm));
 BA.debugLineNum = 828;BA.debugLine="Dim r = rpm.r, g = rpm.g, b = rpm.b, a = rpm.a As";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(byte.class, _rpm.getField(true,"r"));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
_g = BA.numberCast(byte.class, _rpm.getField(true,"g"));Debug.locals.put("g", _g);Debug.locals.put("g", _g);
_b = BA.numberCast(byte.class, _rpm.getField(true,"b"));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
_a = BA.numberCast(byte.class, _rpm.getField(true,"a"));Debug.locals.put("a", _a);Debug.locals.put("a", _a);
 BA.debugLineNum = 829;BA.debugLine="rpm.r = r";
Debug.JustUpdateDeviceLine();
_rpm.setField ("r",BA.numberCast(int.class, _r));
 BA.debugLineNum = 830;BA.debugLine="rpm.g = g";
Debug.JustUpdateDeviceLine();
_rpm.setField ("g",BA.numberCast(int.class, _g));
 BA.debugLineNum = 831;BA.debugLine="rpm.b = b";
Debug.JustUpdateDeviceLine();
_rpm.setField ("b",BA.numberCast(int.class, _b));
 BA.debugLineNum = 832;BA.debugLine="rpm.a = a";
Debug.JustUpdateDeviceLine();
_rpm.setField ("a",BA.numberCast(int.class, _a));
 BA.debugLineNum = 833;BA.debugLine="If ColorsEqual(rpm, tpm) Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (b4j.example.b4xturtle.class, "_colorsequal" /*RemoteObject*/ ,(Object)(_rpm),(Object)(_tpm)).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 834;BA.debugLine="SetAndAddToQueue(X, Y, xx, yy, tpm, rpm)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_setandaddtoqueue" /*RemoteObject*/ ,(Object)(_x),(Object)(_y),(Object)(_xx),(Object)(_yy),(Object)(_tpm),(Object)(_rpm));
 BA.debugLineNum = 835;BA.debugLine="Do While xx.Size > 0";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean(">",_xx.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) {
 BA.debugLineNum = 836;BA.debugLine="Dim nx As Int = xx.Get(0)";
Debug.JustUpdateDeviceLine();
_nx = BA.numberCast(int.class, _xx.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("nx", _nx);Debug.locals.put("nx", _nx);
 BA.debugLineNum = 837;BA.debugLine="Dim ny As Int = yy.Get(0)";
Debug.JustUpdateDeviceLine();
_ny = BA.numberCast(int.class, _yy.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("ny", _ny);Debug.locals.put("ny", _ny);
 BA.debugLineNum = 838;BA.debugLine="xx.RemoveAt(0)";
Debug.JustUpdateDeviceLine();
_xx.runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 839;BA.debugLine="yy.RemoveAt(0)";
Debug.JustUpdateDeviceLine();
_yy.runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 840;BA.debugLine="SetAndAddToQueue(nx, ny + 1, xx, yy, tpm, rpm)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_setandaddtoqueue" /*RemoteObject*/ ,(Object)(_nx),(Object)(RemoteObject.solve(new RemoteObject[] {_ny,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_xx),(Object)(_yy),(Object)(_tpm),(Object)(_rpm));
 BA.debugLineNum = 841;BA.debugLine="SetAndAddToQueue(nx, ny - 1, xx, yy, tpm, rpm)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_setandaddtoqueue" /*RemoteObject*/ ,(Object)(_nx),(Object)(RemoteObject.solve(new RemoteObject[] {_ny,RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(_xx),(Object)(_yy),(Object)(_tpm),(Object)(_rpm));
 BA.debugLineNum = 842;BA.debugLine="SetAndAddToQueue(nx + 1, ny, xx, yy, tpm, rpm)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_setandaddtoqueue" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {_nx,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_ny),(Object)(_xx),(Object)(_yy),(Object)(_tpm),(Object)(_rpm));
 BA.debugLineNum = 843;BA.debugLine="SetAndAddToQueue(nx - 1, ny, xx, yy, tpm, rpm)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_setandaddtoqueue" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {_nx,RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(_ny),(Object)(_xx),(Object)(_yy),(Object)(_tpm),(Object)(_rpm));
 }
;
 BA.debugLineNum = 845;BA.debugLine="layer.ClearRect(layer.TargetRect)";
Debug.JustUpdateDeviceLine();
_layer.runVoidMethod ("ClearRect",(Object)(_layer.runMethod(false,"getTargetRect")));
 BA.debugLineNum = 846;BA.debugLine="layer.DrawBitmap(FloodBC.Bitmap, layer.TargetRect";
Debug.JustUpdateDeviceLine();
_layer.runVoidMethod ("DrawBitmap",(Object)((__ref.getField(false,"_floodbc" /*RemoteObject*/ ).runMethod(false,"_getbitmap").getObject())),(Object)(_layer.runMethod(false,"getTargetRect")));
 BA.debugLineNum = 847;BA.debugLine="layer.Invalidate";
Debug.JustUpdateDeviceLine();
_layer.runVoidMethod ("Invalidate");
 BA.debugLineNum = 848;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _forward_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("Forward_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,378);
if (RapidSub.canDelegate("forward_action")) { return __ref.runUserSub(false, "b4xturtle","forward_action", __ref, _ta, _stage);}
RemoteObject _destx = RemoteObject.createImmutable(0f);
RemoteObject _desty = RemoteObject.createImmutable(0f);
RemoteObject _newactionsadded = RemoteObject.createImmutable(false);
RemoteObject _f = RemoteObject.createImmutable(0f);
RemoteObject _f2 = RemoteObject.createImmutable(0f);
int _i = 0;
RemoteObject _t = RemoteObject.declareNull("b4j.example.b4xturtle._turtleaction");
RemoteObject _startx = RemoteObject.createImmutable(0f);
RemoteObject _starty = RemoteObject.createImmutable(0f);
RemoteObject _stagefixed = RemoteObject.createImmutable(0f);
RemoteObject _x = RemoteObject.createImmutable(0f);
RemoteObject _y = RemoteObject.createImmutable(0f);
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 378;BA.debugLine="Private Sub Forward_Action (TA As TurtleAction, St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 379;BA.debugLine="If Stage = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 380;BA.debugLine="TA.Extra = Array(State.UserX, State.UserY)";
Debug.JustUpdateDeviceLine();
_ta.setField ("Extra" /*RemoteObject*/ ,b4xturtle.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserX" /*RemoteObject*/ )),(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserY" /*RemoteObject*/ ))}))));
 BA.debugLineNum = 381;BA.debugLine="Dim DestX As Float = State.UserX + CosD(State.De";
Debug.JustUpdateDeviceLine();
_destx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserX" /*RemoteObject*/ ),b4xturtle.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, __ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Degree" /*RemoteObject*/ )))),_ta.getField(true,"Param1" /*RemoteObject*/ )}, "+*",1, 0));Debug.locals.put("DestX", _destx);Debug.locals.put("DestX", _destx);
 BA.debugLineNum = 382;BA.debugLine="Dim DestY As Float = State.UserY + SinD(State.De";
Debug.JustUpdateDeviceLine();
_desty = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserY" /*RemoteObject*/ ),b4xturtle.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, __ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Degree" /*RemoteObject*/ )))),_ta.getField(true,"Param1" /*RemoteObject*/ )}, "+*",1, 0));Debug.locals.put("DestY", _desty);Debug.locals.put("DestY", _desty);
 BA.debugLineNum = 383;BA.debugLine="Dim NewActionsAdded As Boolean";
Debug.JustUpdateDeviceLine();
_newactionsadded = RemoteObject.createImmutable(false);Debug.locals.put("NewActionsAdded", _newactionsadded);
 BA.debugLineNum = 384;BA.debugLine="Dim f As Float";
Debug.JustUpdateDeviceLine();
_f = RemoteObject.createImmutable(0f);Debug.locals.put("f", _f);
 BA.debugLineNum = 385;BA.debugLine="If DestX >= mWidth Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",_destx,BA.numberCast(double.class, __ref.getField(true,"_mwidth" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 386;BA.debugLine="f = 1 - (DestX - mWidth) / (DestX - State.UserX";
Debug.JustUpdateDeviceLine();
_f = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),(RemoteObject.solve(new RemoteObject[] {_destx,__ref.getField(true,"_mwidth" /*RemoteObject*/ )}, "-",1, 0)),(RemoteObject.solve(new RemoteObject[] {_destx,__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserX" /*RemoteObject*/ )}, "-",1, 0))}, "-/",1, 0));Debug.locals.put("f", _f);
 BA.debugLineNum = 387;BA.debugLine="SetPosition(0, -1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_setposition" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, -(double) (0 + 1))));
 BA.debugLineNum = 388;BA.debugLine="NewActionsAdded = True";
Debug.JustUpdateDeviceLine();
_newactionsadded = b4xturtle.__c.getField(true,"True");Debug.locals.put("NewActionsAdded", _newactionsadded);
 }else 
{ BA.debugLineNum = 389;BA.debugLine="Else if DestX < 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_destx,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 390;BA.debugLine="f = 1 - (-DestX) / (State.UserX - DestX)";
Debug.JustUpdateDeviceLine();
_f = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),RemoteObject.createImmutable((-(double) (0 + _destx.<Float>get().floatValue()))),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserX" /*RemoteObject*/ ),_destx}, "-",1, 0))}, "-/",1, 0));Debug.locals.put("f", _f);
 BA.debugLineNum = 391;BA.debugLine="SetPosition(mWidth, -1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_setposition" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, __ref.getField(true,"_mwidth" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, -(double) (0 + 1))));
 BA.debugLineNum = 392;BA.debugLine="NewActionsAdded = True";
Debug.JustUpdateDeviceLine();
_newactionsadded = b4xturtle.__c.getField(true,"True");Debug.locals.put("NewActionsAdded", _newactionsadded);
 }}
;
 BA.debugLineNum = 394;BA.debugLine="If DestY >= mHeight Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",_desty,BA.numberCast(double.class, __ref.getField(true,"_mheight" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 395;BA.debugLine="Dim f2 As Float = 1 - (DestY - mHeight) / (Dest";
Debug.JustUpdateDeviceLine();
_f2 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),(RemoteObject.solve(new RemoteObject[] {_desty,__ref.getField(true,"_mheight" /*RemoteObject*/ )}, "-",1, 0)),(RemoteObject.solve(new RemoteObject[] {_desty,__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserY" /*RemoteObject*/ )}, "-",1, 0))}, "-/",1, 0));Debug.locals.put("f2", _f2);Debug.locals.put("f2", _f2);
 BA.debugLineNum = 396;BA.debugLine="If NewActionsAdded And f2 < f Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_newactionsadded) && RemoteObject.solveBoolean("<",_f2,BA.numberCast(double.class, _f))) { 
 BA.debugLineNum = 397;BA.debugLine="f = f2";
Debug.JustUpdateDeviceLine();
_f = _f2;Debug.locals.put("f", _f);
 BA.debugLineNum = 398;BA.debugLine="Queue.RemoveAt(Queue.Size - 1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_queue" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_queue" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 399;BA.debugLine="SetPosition(-1, 0)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_setposition" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, -(double) (0 + 1))),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 400;BA.debugLine="NewActionsAdded = True";
Debug.JustUpdateDeviceLine();
_newactionsadded = b4xturtle.__c.getField(true,"True");Debug.locals.put("NewActionsAdded", _newactionsadded);
 }else 
{ BA.debugLineNum = 401;BA.debugLine="Else If NewActionsAdded = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_newactionsadded,b4xturtle.__c.getField(true,"False"))) { 
 BA.debugLineNum = 402;BA.debugLine="f = f2";
Debug.JustUpdateDeviceLine();
_f = _f2;Debug.locals.put("f", _f);
 BA.debugLineNum = 403;BA.debugLine="SetPosition(-1, 0)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_setposition" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, -(double) (0 + 1))),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 404;BA.debugLine="NewActionsAdded = True";
Debug.JustUpdateDeviceLine();
_newactionsadded = b4xturtle.__c.getField(true,"True");Debug.locals.put("NewActionsAdded", _newactionsadded);
 }}
;
 }else 
{ BA.debugLineNum = 406;BA.debugLine="Else If DestY < 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_desty,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 407;BA.debugLine="Dim f2 As Float = 1 - (-DestY) / (State.UserY -";
Debug.JustUpdateDeviceLine();
_f2 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),RemoteObject.createImmutable((-(double) (0 + _desty.<Float>get().floatValue()))),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserY" /*RemoteObject*/ ),_desty}, "-",1, 0))}, "-/",1, 0));Debug.locals.put("f2", _f2);Debug.locals.put("f2", _f2);
 BA.debugLineNum = 408;BA.debugLine="If NewActionsAdded And f2 < f Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_newactionsadded) && RemoteObject.solveBoolean("<",_f2,BA.numberCast(double.class, _f))) { 
 BA.debugLineNum = 409;BA.debugLine="f = f2";
Debug.JustUpdateDeviceLine();
_f = _f2;Debug.locals.put("f", _f);
 BA.debugLineNum = 410;BA.debugLine="Queue.RemoveAt(Queue.Size - 1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_queue" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_queue" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 411;BA.debugLine="SetPosition(-1, mHeight)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_setposition" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, -(double) (0 + 1))),(Object)(BA.numberCast(float.class, __ref.getField(true,"_mheight" /*RemoteObject*/ ))));
 BA.debugLineNum = 412;BA.debugLine="NewActionsAdded = True";
Debug.JustUpdateDeviceLine();
_newactionsadded = b4xturtle.__c.getField(true,"True");Debug.locals.put("NewActionsAdded", _newactionsadded);
 }else 
{ BA.debugLineNum = 413;BA.debugLine="Else If NewActionsAdded = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_newactionsadded,b4xturtle.__c.getField(true,"False"))) { 
 BA.debugLineNum = 414;BA.debugLine="f = f2";
Debug.JustUpdateDeviceLine();
_f = _f2;Debug.locals.put("f", _f);
 BA.debugLineNum = 415;BA.debugLine="SetPosition(-1, mHeight)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_setposition" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, -(double) (0 + 1))),(Object)(BA.numberCast(float.class, __ref.getField(true,"_mheight" /*RemoteObject*/ ))));
 BA.debugLineNum = 416;BA.debugLine="NewActionsAdded = True";
Debug.JustUpdateDeviceLine();
_newactionsadded = b4xturtle.__c.getField(true,"True");Debug.locals.put("NewActionsAdded", _newactionsadded);
 }}
;
 }}
;
 BA.debugLineNum = 419;BA.debugLine="If NewActionsAdded Then";
Debug.JustUpdateDeviceLine();
if (_newactionsadded.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 420;BA.debugLine="If f = 0 Then f = 0.0001";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_f,BA.numberCast(double.class, 0))) { 
_f = BA.numberCast(float.class, 0.0001);Debug.locals.put("f", _f);};
 BA.debugLineNum = 421;BA.debugLine="TA.Duration = TA.Duration * f";
Debug.JustUpdateDeviceLine();
_ta.setField ("Duration" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_ta.getField(true,"Duration" /*RemoteObject*/ ),_f}, "*",0, 0)));
 BA.debugLineNum = 422;BA.debugLine="TA.Param1 = TA.Param1 * f";
Debug.JustUpdateDeviceLine();
_ta.setField ("Param1" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_ta.getField(true,"Param1" /*RemoteObject*/ ),_f}, "*",0, 0)));
 BA.debugLineNum = 423;BA.debugLine="MoveForward((1 - f) * TA.Param1 / f)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_moveforward" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_f}, "-",1, 0)),_ta.getField(true,"Param1" /*RemoteObject*/ ),_f}, "*/",0, 0))));
 BA.debugLineNum = 424;BA.debugLine="For i = 1 To 2";
Debug.JustUpdateDeviceLine();
{
final int step46 = 1;
final int limit46 = 2;
_i = 1 ;
for (;(step46 > 0 && _i <= limit46) || (step46 < 0 && _i >= limit46) ;_i = ((int)(0 + _i + step46))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 425;BA.debugLine="Dim t As TurtleAction = Queue.Get(Queue.Size -";
Debug.JustUpdateDeviceLine();
_t = (__ref.getField(false,"_queue" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_queue" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(3),RemoteObject.createImmutable(_i)}, "-+",2, 1))));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 426;BA.debugLine="Queue.RemoveAt(Queue.Size - 3 + i)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_queue" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_queue" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(3),RemoteObject.createImmutable(_i)}, "-+",2, 1)));
 BA.debugLineNum = 427;BA.debugLine="Queue.InsertAt(i, t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_queue" /*RemoteObject*/ ).runVoidMethod ("InsertAt",(Object)(BA.numberCast(int.class, _i)),(Object)((_t)));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 430;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 432;BA.debugLine="Dim StartX As Float = TA.Extra.Get(0)";
Debug.JustUpdateDeviceLine();
_startx = BA.numberCast(float.class, _ta.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("StartX", _startx);Debug.locals.put("StartX", _startx);
 BA.debugLineNum = 433;BA.debugLine="Dim StartY As Float = TA.Extra.Get(1)";
Debug.JustUpdateDeviceLine();
_starty = BA.numberCast(float.class, _ta.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("StartY", _starty);Debug.locals.put("StartY", _starty);
 BA.debugLineNum = 434;BA.debugLine="Dim StageFixed As Float = Min(1, Stage + 0.01)";
Debug.JustUpdateDeviceLine();
_stagefixed = BA.numberCast(float.class, b4xturtle.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_stage,RemoteObject.createImmutable(0.01)}, "+",1, 0))));Debug.locals.put("StageFixed", _stagefixed);Debug.locals.put("StageFixed", _stagefixed);
 BA.debugLineNum = 435;BA.debugLine="Dim X As Float = StartX + CosD(State.Degree) * TA";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_startx,b4xturtle.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, __ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Degree" /*RemoteObject*/ )))),_ta.getField(true,"Param1" /*RemoteObject*/ ),_stagefixed}, "+**",1, 0));Debug.locals.put("X", _x);Debug.locals.put("X", _x);
 BA.debugLineNum = 436;BA.debugLine="Dim Y As Float = StartY + SinD(State.Degree) * TA";
Debug.JustUpdateDeviceLine();
_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_starty,b4xturtle.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, __ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Degree" /*RemoteObject*/ )))),_ta.getField(true,"Param1" /*RemoteObject*/ ),_stagefixed}, "+**",1, 0));Debug.locals.put("Y", _y);Debug.locals.put("Y", _y);
 BA.debugLineNum = 437;BA.debugLine="If State.PenDown Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"PenDown" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 438;BA.debugLine="GetLayer.DrawLine(UserToCanvas(State.UserX), Use";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_getlayer" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_usertocanvas" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserX" /*RemoteObject*/ )))),(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_usertocanvas" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserY" /*RemoteObject*/ )))),(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_usertocanvas" /*RemoteObject*/ ,(Object)(_x))),(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_usertocanvas" /*RemoteObject*/ ,(Object)(_y))),(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"PenColor" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_usertocanvas" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"PenThickness" /*RemoteObject*/ )))));
 };
 BA.debugLineNum = 440;BA.debugLine="If State.TrackPolygon Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"TrackPolygon" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 441;BA.debugLine="State.PolygonPoints.Add(Array As Float(UserToCan";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).getField(false,"PolygonPoints" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("float",new int[] {2},new Object[] {__ref.runClassMethod (b4j.example.b4xturtle.class, "_usertocanvas" /*RemoteObject*/ ,(Object)(_x)),__ref.runClassMethod (b4j.example.b4xturtle.class, "_usertocanvas" /*RemoteObject*/ ,(Object)(_y))}))));
 };
 BA.debugLineNum = 443;BA.debugLine="State.UserX = StartX + CosD(State.Degree) * TA.Pa";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("UserX" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_startx,b4xturtle.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, __ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Degree" /*RemoteObject*/ )))),_ta.getField(true,"Param1" /*RemoteObject*/ ),_stage}, "+**",1, 0)));
 BA.debugLineNum = 444;BA.debugLine="State.UserY = StartY + SinD(State.Degree) * TA.Pa";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("UserY" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_starty,b4xturtle.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, __ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Degree" /*RemoteObject*/ )))),_ta.getField(true,"Param1" /*RemoteObject*/ ),_stage}, "+**",1, 0)));
 BA.debugLineNum = 445;BA.debugLine="DrawTurtle";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_drawturtle" /*void*/ );
 BA.debugLineNum = 446;BA.debugLine="RefreshMain";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_refreshmain" /*RemoteObject*/ );
 BA.debugLineNum = 447;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getangle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetAngle (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,521);
if (RapidSub.canDelegate("getangle")) { return __ref.runUserSub(false, "b4xturtle","getangle", __ref);}
 BA.debugLineNum = 521;BA.debugLine="Public Sub GetAngle As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 522;BA.debugLine="Return State.Degree";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Degree" /*RemoteObject*/ );
 BA.debugLineNum = 523;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentlayer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCurrentLayer (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,496);
if (RapidSub.canDelegate("getcurrentlayer")) { return __ref.runUserSub(false, "b4xturtle","getcurrentlayer", __ref);}
 BA.debugLineNum = 496;BA.debugLine="Public Sub GetCurrentLayer As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 497;BA.debugLine="Return State.CanvasLayer";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"CanvasLayer" /*RemoteObject*/ );
 BA.debugLineNum = 498;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,786);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "b4xturtle","getheight", __ref);}
 BA.debugLineNum = 786;BA.debugLine="Public Sub getHeight As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 787;BA.debugLine="Return mHeight";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mheight" /*RemoteObject*/ );
 BA.debugLineNum = 788;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getismoving(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getIsMoving (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,214);
if (RapidSub.canDelegate("getismoving")) { return __ref.runUserSub(false, "b4xturtle","getismoving", __ref);}
 BA.debugLineNum = 214;BA.debugLine="Public Sub getIsMoving As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 215;BA.debugLine="Return Queue.Size > 0";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(false,"_queue" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0)));
 BA.debugLineNum = 216;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlayer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetLayer (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,850);
if (RapidSub.canDelegate("getlayer")) { return __ref.runUserSub(false, "b4xturtle","getlayer", __ref);}
 BA.debugLineNum = 850;BA.debugLine="Private Sub GetLayer As B4XCanvas";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 851;BA.debugLine="Return Layers.Get(State.CanvasLayer)";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.getField(false,"_layers" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"CanvasLayer" /*RemoteObject*/ ))));
 BA.debugLineNum = 852;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpencolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetPenColor (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,305);
if (RapidSub.canDelegate("getpencolor")) { return __ref.runUserSub(false, "b4xturtle","getpencolor", __ref);}
 BA.debugLineNum = 305;BA.debugLine="Public Sub GetPenColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 306;BA.debugLine="Return State.PenColor";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"PenColor" /*RemoteObject*/ );
 BA.debugLineNum = 307;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getwidth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getWidth (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,782);
if (RapidSub.canDelegate("getwidth")) { return __ref.runUserSub(false, "b4xturtle","getwidth", __ref);}
 BA.debugLineNum = 782;BA.debugLine="Public Sub getWidth As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 783;BA.debugLine="Return mWidth";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mwidth" /*RemoteObject*/ );
 BA.debugLineNum = 784;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getx(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetX (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,501);
if (RapidSub.canDelegate("getx")) { return __ref.runUserSub(false, "b4xturtle","getx", __ref);}
 BA.debugLineNum = 501;BA.debugLine="Public Sub GetX As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 502;BA.debugLine="Return State.UserX";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserX" /*RemoteObject*/ );
 BA.debugLineNum = 503;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gety(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetY (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,511);
if (RapidSub.canDelegate("gety")) { return __ref.runUserSub(false, "b4xturtle","gety", __ref);}
 BA.debugLineNum = 511;BA.debugLine="Public Sub GetY As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 512;BA.debugLine="Return State.UserY";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserY" /*RemoteObject*/ );
 BA.debugLineNum = 513;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _home(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Home (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,266);
if (RapidSub.canDelegate("home")) { return __ref.runUserSub(false, "b4xturtle","home", __ref);}
 BA.debugLineNum = 266;BA.debugLine="Public Sub Home As B4XTurtle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 267;BA.debugLine="Return AddAction(CreateTurtleAction(0, 0, \"Home_A";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(RemoteObject.createImmutable("Home_Action")))));
 BA.debugLineNum = 268;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _home_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("Home_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,364);
if (RapidSub.canDelegate("home_action")) { return __ref.runUserSub(false, "b4xturtle","home_action", __ref, _ta, _stage);}
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 364;BA.debugLine="Private Sub Home_Action (TA As TurtleAction, Stage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 365;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 366;BA.debugLine="State.Degree = 0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("Degree" /*RemoteObject*/ ,BA.numberCast(float.class, 0));
 BA.debugLineNum = 367;BA.debugLine="State.UserX = mWidth / 2";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("UserX" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mwidth" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 368;BA.debugLine="State.UserY = mHeight / 2";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("UserY" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mheight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0)));
 };
 BA.debugLineNum = 370;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xturtle","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 46;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 47;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 48;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 49;BA.debugLine="Queue.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_queue" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 50;BA.debugLine="MainTimer.Initialize(\"MainTimer\", TimerInterval)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_maintimer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("MainTimer")),(Object)(BA.numberCast(long.class, __ref.getField(true,"_timerinterval" /*RemoteObject*/ ))));
 BA.debugLineNum = 51;BA.debugLine="State = CreateTurtleState(100, 100, 0, True, xui.";
Debug.JustUpdateDeviceLine();
__ref.setField ("_state" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtlestate" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 100)),(Object)(BA.numberCast(float.class, 100)),(Object)(BA.numberCast(float.class, 0)),(Object)(b4xturtle.__c.getField(true,"True")),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black")),(Object)(BA.numberCast(float.class, 2)),(Object)(BA.numberCast(float.class, 1)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20)))),(Object)(BA.ObjectToString("CENTER")),(Object)(b4xturtle.__c.getField(true,"True")),(Object)(b4xturtle.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 52;BA.debugLine="StatesStack.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_statesstack" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 53;BA.debugLine="Layers.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_layers" /*RemoteObject*/ ).runVoidMethod ("Initialize");
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
public static RemoteObject  _maintimer_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MainTimer_Tick (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("maintimer_tick")) { return __ref.runUserSub(false, "b4xturtle","maintimer_tick", __ref);}
 BA.debugLineNum = 146;BA.debugLine="Private Sub MainTimer_Tick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 147;BA.debugLine="ActionsLoop";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_actionsloop" /*RemoteObject*/ );
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
public static RemoteObject  _movebackward(RemoteObject __ref,RemoteObject _distance) throws Exception{
try {
		Debug.PushSubsStack("MoveBackward (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,261);
if (RapidSub.canDelegate("movebackward")) { return __ref.runUserSub(false, "b4xturtle","movebackward", __ref, _distance);}
Debug.locals.put("Distance", _distance);
 BA.debugLineNum = 261;BA.debugLine="Public Sub MoveBackward (Distance As Float) As B4X";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 262;BA.debugLine="Return MoveForward(-Distance)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_moveforward" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, -(double) (0 + _distance.<Float>get().floatValue()))));
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _moveforward(RemoteObject __ref,RemoteObject _distance) throws Exception{
try {
		Debug.PushSubsStack("MoveForward (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,373);
if (RapidSub.canDelegate("moveforward")) { return __ref.runUserSub(false, "b4xturtle","moveforward", __ref, _distance);}
Debug.locals.put("Distance", _distance);
 BA.debugLineNum = 373;BA.debugLine="Public Sub MoveForward (Distance As Float) As B4XT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 374;BA.debugLine="Return AddAction(CreateTurtleAction(Abs(Distance)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4xturtle.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _distance))),__ref.getField(true,"_distancepersecond" /*RemoteObject*/ ),RemoteObject.createImmutable(1000)}, "/*",0, 0))),(Object)(_distance),(Object)(RemoteObject.createImmutable("Forward_Action")))));
 BA.debugLineNum = 375;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _moveto(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("MoveTo (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,470);
if (RapidSub.canDelegate("moveto")) { return __ref.runUserSub(false, "b4xturtle","moveto", __ref, _x, _y);}
RemoteObject _ta = RemoteObject.declareNull("b4j.example.b4xturtle._turtleaction");
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 470;BA.debugLine="Public Sub MoveTo(X As Float, Y As Float) As B4XTu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 471;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
Debug.JustUpdateDeviceLine();
_ta = __ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(RemoteObject.createImmutable("MoveTo_Action")));Debug.locals.put("ta", _ta);Debug.locals.put("ta", _ta);
 BA.debugLineNum = 472;BA.debugLine="ta.Extra = Array(X, Y)";
Debug.JustUpdateDeviceLine();
_ta.setField ("Extra" /*RemoteObject*/ ,b4xturtle.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_x),(_y)}))));
 BA.debugLineNum = 473;BA.debugLine="Return AddAction(ta)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(_ta));
 BA.debugLineNum = 474;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _moveto_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("MoveTo_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,476);
if (RapidSub.canDelegate("moveto_action")) { return __ref.runUserSub(false, "b4xturtle","moveto_action", __ref, _ta, _stage);}
RemoteObject _dx = RemoteObject.createImmutable(0f);
RemoteObject _dy = RemoteObject.createImmutable(0f);
RemoteObject _newdegree = RemoteObject.createImmutable(0f);
RemoteObject _d2 = RemoteObject.createImmutable(0f);
RemoteObject _delta = RemoteObject.createImmutable(0f);
int _i = 0;
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 476;BA.debugLine="Private Sub MoveTo_Action (TA As TurtleAction, Sta";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 477;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 478;BA.debugLine="Dim dx As Float = TA.Extra.Get(0) - State.UserX";
Debug.JustUpdateDeviceLine();
_dx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _ta.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserX" /*RemoteObject*/ )}, "-",1, 0));Debug.locals.put("dx", _dx);Debug.locals.put("dx", _dx);
 BA.debugLineNum = 479;BA.debugLine="Dim dy As Float = TA.Extra.Get(1) - State.UserY";
Debug.JustUpdateDeviceLine();
_dy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _ta.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))),__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserY" /*RemoteObject*/ )}, "-",1, 0));Debug.locals.put("dy", _dy);Debug.locals.put("dy", _dy);
 BA.debugLineNum = 480;BA.debugLine="Dim NewDegree As Float = ATan2D(dy, dx)";
Debug.JustUpdateDeviceLine();
_newdegree = BA.numberCast(float.class, b4xturtle.__c.runMethod(true,"ATan2D",(Object)(BA.numberCast(double.class, _dy)),(Object)(BA.numberCast(double.class, _dx))));Debug.locals.put("NewDegree", _newdegree);Debug.locals.put("NewDegree", _newdegree);
 BA.debugLineNum = 481;BA.debugLine="Dim d2 As Float = State.Degree";
Debug.JustUpdateDeviceLine();
_d2 = __ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Degree" /*RemoteObject*/ );Debug.locals.put("d2", _d2);Debug.locals.put("d2", _d2);
 BA.debugLineNum = 482;BA.debugLine="If NewDegree < d2 Then NewDegree = NewDegree + 3";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_newdegree,BA.numberCast(double.class, _d2))) { 
_newdegree = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_newdegree,RemoteObject.createImmutable(360)}, "+",1, 0));Debug.locals.put("NewDegree", _newdegree);};
 BA.debugLineNum = 483;BA.debugLine="Dim delta As Float = NewDegree - d2";
Debug.JustUpdateDeviceLine();
_delta = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_newdegree,_d2}, "-",1, 0));Debug.locals.put("delta", _delta);Debug.locals.put("delta", _delta);
 BA.debugLineNum = 484;BA.debugLine="If delta >= 180 Then delta = delta - 360";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",_delta,BA.numberCast(double.class, 180))) { 
_delta = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_delta,RemoteObject.createImmutable(360)}, "-",1, 0));Debug.locals.put("delta", _delta);};
 BA.debugLineNum = 485;BA.debugLine="TurnRight(delta)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_turnright" /*RemoteObject*/ ,(Object)(_delta));
 BA.debugLineNum = 486;BA.debugLine="MoveForward(Sqrt(Power(dy, 2) + Power(dx, 2)))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_moveforward" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, b4xturtle.__c.runMethod(true,"Sqrt",(Object)(RemoteObject.solve(new RemoteObject[] {b4xturtle.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, _dy)),(Object)(BA.numberCast(double.class, 2))),b4xturtle.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, _dx)),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0))))));
 BA.debugLineNum = 487;BA.debugLine="For i = 1 To 2";
Debug.JustUpdateDeviceLine();
{
final int step11 = 1;
final int limit11 = 2;
_i = 1 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 488;BA.debugLine="Dim TA As TurtleAction = Queue.Get(Queue.Size -";
Debug.JustUpdateDeviceLine();
_ta = (__ref.getField(false,"_queue" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_queue" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("TA", _ta);Debug.locals.put("TA", _ta);
 BA.debugLineNum = 489;BA.debugLine="Queue.RemoveAt(Queue.Size - 1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_queue" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_queue" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 490;BA.debugLine="Queue.InsertAt(1, TA)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_queue" /*RemoteObject*/ ).runVoidMethod ("InsertAt",(Object)(BA.numberCast(int.class, 1)),(Object)((_ta)));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 493;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel1_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("Panel1_Touch (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,790);
if (RapidSub.canDelegate("panel1_touch")) { return __ref.runUserSub(false, "b4xturtle","panel1_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 790;BA.debugLine="Private Sub Panel1_Touch (Action As Int, X As Floa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 795;BA.debugLine="If Action <> Panel1.TOUCH_ACTION_MOVE_NOTOUCH The";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_action,BA.numberCast(double.class, __ref.getField(false,"_panel1" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE_NOTOUCH")))) { 
 BA.debugLineNum = 796;BA.debugLine="CallSub2(mCallBack, mEventName & \"_Touch\", Creat";
Debug.JustUpdateDeviceLine();
b4xturtle.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Touch"))),(Object)((__ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtletouchargs" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getScale")}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getScale")}, "/",0, 0))),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_panel1" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_UP"))))),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_panel1" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_DOWN"))))),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_panel1" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE")))))))));
 };
 BA.debugLineNum = 799;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pause(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Pause (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,205);
if (RapidSub.canDelegate("pause")) { return __ref.runUserSub(false, "b4xturtle","pause", __ref);}
 BA.debugLineNum = 205;BA.debugLine="Public Sub Pause";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 206;BA.debugLine="MainTimer.Enabled = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_maintimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xturtle.__c.getField(true,"False"));
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pencolor_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("PenColor_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,309);
if (RapidSub.canDelegate("pencolor_action")) { return __ref.runUserSub(false, "b4xturtle","pencolor_action", __ref, _ta, _stage);}
Debug.locals.put("ta", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 309;BA.debugLine="Private Sub PenColor_Action (ta As TurtleAction, S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 310;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 311;BA.debugLine="State.PenColor = ta.Extra.Get(0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("PenColor" /*RemoteObject*/ ,BA.numberCast(int.class, _ta.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))));
 };
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pendown(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PenDown (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,320);
if (RapidSub.canDelegate("pendown")) { return __ref.runUserSub(false, "b4xturtle","pendown", __ref);}
 BA.debugLineNum = 320;BA.debugLine="Public Sub PenDown As B4XTurtle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 321;BA.debugLine="Return AddAction(CreateTurtleAction(0, 1, \"PenUpD";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 1)),(Object)(RemoteObject.createImmutable("PenUpDown_Action")))));
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _penup(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PenUp (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,316);
if (RapidSub.canDelegate("penup")) { return __ref.runUserSub(false, "b4xturtle","penup", __ref);}
 BA.debugLineNum = 316;BA.debugLine="Public Sub PenUp As B4XTurtle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 317;BA.debugLine="Return AddAction(CreateTurtleAction(0, 0, \"PenUpD";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(RemoteObject.createImmutable("PenUpDown_Action")))));
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _penupdown_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("PenUpDown_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,324);
if (RapidSub.canDelegate("penupdown_action")) { return __ref.runUserSub(false, "b4xturtle","penupdown_action", __ref, _ta, _stage);}
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 324;BA.debugLine="Private Sub PenUpDown_Action (TA As TurtleAction,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 325;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 326;BA.debugLine="State.PenDown = TA.Param1 = 1";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("PenDown" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_ta.getField(true,"Param1" /*RemoteObject*/ ),BA.numberCast(double.class, 1))));
 };
 BA.debugLineNum = 328;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _popstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PopState (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,336);
if (RapidSub.canDelegate("popstate")) { return __ref.runUserSub(false, "b4xturtle","popstate", __ref);}
 BA.debugLineNum = 336;BA.debugLine="Public Sub PopState As B4XTurtle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 337;BA.debugLine="Return AddAction(CreateTurtleAction(0, 1, \"PushSt";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 1)),(Object)(RemoteObject.createImmutable("PushState_Action")))));
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _preparelayers(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PrepareLayers (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("preparelayers")) { return __ref.runUserSub(false, "b4xturtle","preparelayers", __ref);}
 BA.debugLineNum = 130;BA.debugLine="Private Sub PrepareLayers";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 131;BA.debugLine="If xui.IsB4A Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 132;BA.debugLine="mTurtleBC.Initialize(Panel1.Width, Panel1.Height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mturtlebc" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, __ref.getField(false,"_panel1" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_panel1" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 }else {
 BA.debugLineNum = 134;BA.debugLine="mTurtleBC.Initialize(Panel1.Width * bcScale, Pan";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mturtlebc" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_panel1" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_bcscale" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_panel1" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_bcscale" /*RemoteObject*/ )}, "*",0, 0))));
 };
 BA.debugLineNum = 136;BA.debugLine="TransparentTurtleLayerBrush = mTurtleBC.CreateBru";
Debug.JustUpdateDeviceLine();
__ref.setField ("_transparentturtlelayerbrush" /*RemoteObject*/ ,__ref.getField(false,"_mturtlebc" /*RemoteObject*/ ).runMethod(false,"_createbrushfromcolor",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"))));
 BA.debugLineNum = 137;BA.debugLine="TurtleBrush = mTurtleBC.CreateBrushFromColor(Turt";
Debug.JustUpdateDeviceLine();
__ref.setField ("_turtlebrush" /*RemoteObject*/ ,__ref.getField(false,"_mturtlebc" /*RemoteObject*/ ).runMethod(false,"_createbrushfromcolor",(Object)(__ref.getField(true,"_turtlecolor" /*RemoteObject*/ ))));
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pushstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PushState (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,331);
if (RapidSub.canDelegate("pushstate")) { return __ref.runUserSub(false, "b4xturtle","pushstate", __ref);}
 BA.debugLineNum = 331;BA.debugLine="Public Sub PushState As B4XTurtle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 332;BA.debugLine="Return AddAction(CreateTurtleAction(0, 0, \"PushSt";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(RemoteObject.createImmutable("PushState_Action")))));
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pushstate_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("PushState_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,340);
if (RapidSub.canDelegate("pushstate_action")) { return __ref.runUserSub(false, "b4xturtle","pushstate_action", __ref, _ta, _stage);}
RemoteObject _push = RemoteObject.createImmutable(false);
RemoteObject _newstate = RemoteObject.declareNull("b4j.example.b4xturtle._turtlestate");
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 340;BA.debugLine="Private Sub PushState_Action (TA As TurtleAction,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 341;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 342;BA.debugLine="Dim push As Boolean = TA.Param1 = 0";
Debug.JustUpdateDeviceLine();
_push = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_ta.getField(true,"Param1" /*RemoteObject*/ ),BA.numberCast(double.class, 0)));Debug.locals.put("push", _push);Debug.locals.put("push", _push);
 BA.debugLineNum = 343;BA.debugLine="If push Then";
Debug.JustUpdateDeviceLine();
if (_push.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 344;BA.debugLine="Dim NewState As TurtleState = CreateTurtleState";
Debug.JustUpdateDeviceLine();
_newstate = __ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtlestate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserX" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserY" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Degree" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"PenDown" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"PenColor" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"PenThickness" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"SpeedFactor" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(false,"Fnt" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Alignment" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"TurtleVisible" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"RabbitMode" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"CanvasLayer" /*RemoteObject*/ )));Debug.locals.put("NewState", _newstate);Debug.locals.put("NewState", _newstate);
 BA.debugLineNum = 347;BA.debugLine="StatesStack.Add(State)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_statesstack" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.getField(false,"_state" /*RemoteObject*/ ))));
 BA.debugLineNum = 348;BA.debugLine="State = NewState";
Debug.JustUpdateDeviceLine();
__ref.setField ("_state" /*RemoteObject*/ ,_newstate);
 }else {
 BA.debugLineNum = 350;BA.debugLine="State = StatesStack.Get(StatesStack.Size - 1)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_state" /*RemoteObject*/ ,(__ref.getField(false,"_statesstack" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_statesstack" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))));
 BA.debugLineNum = 351;BA.debugLine="StatesStack.RemoveAt(StatesStack.Size - 1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_statesstack" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_statesstack" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 };
 };
 BA.debugLineNum = 354;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _rabbit_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("Rabbit_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,674);
if (RapidSub.canDelegate("rabbit_action")) { __ref.runUserSub(false, "b4xturtle","rabbit_action", __ref, _ta, _stage); return;}
ResumableSub_Rabbit_Action rsub = new ResumableSub_Rabbit_Action(null,__ref,_ta,_stage);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Rabbit_Action extends BA.ResumableSub {
public ResumableSub_Rabbit_Action(b4j.example.b4xturtle parent,RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) {
this.parent = parent;
this.__ref = __ref;
this._ta = _ta;
this._stage = _stage;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xturtle parent;
RemoteObject _ta;
RemoteObject _stage;
RemoteObject _newmode = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Rabbit_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,674);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 675;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 676;BA.debugLine="Dim NewMode As Boolean = TA.Param1 = 1";
Debug.JustUpdateDeviceLine();
_newmode = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_ta.getField(true,"Param1" /*RemoteObject*/ ),BA.numberCast(double.class, 1)));Debug.locals.put("NewMode", _newmode);Debug.locals.put("NewMode", _newmode);
 BA.debugLineNum = 677;BA.debugLine="If NewMode = State.RabbitMode Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_newmode,__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"RabbitMode" /*RemoteObject*/ ))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 678;BA.debugLine="State.RabbitMode = NewMode";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("RabbitMode" /*RemoteObject*/ ,_newmode);
 BA.debugLineNum = 679;BA.debugLine="If State.RabbitMode Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 15;
if (__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"RabbitMode" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 680;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xturtle", "rabbit_action"),BA.numberCast(int.class, 0));
this.state = 17;
return;
case 17:
//C
this.state = 15;
;
 BA.debugLineNum = 681;BA.debugLine="RabbitLoop";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_rabbitloop" /*RemoteObject*/ );
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 683;BA.debugLine="Resume";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_resume" /*RemoteObject*/ );
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 686;BA.debugLine="End Sub";
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
public static RemoteObject  _rabbitloop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RabbitLoop (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,185);
if (RapidSub.canDelegate("rabbitloop")) { return __ref.runUserSub(false, "b4xturtle","rabbitloop", __ref);}
RemoteObject _ta = RemoteObject.declareNull("b4j.example.b4xturtle._turtleaction");
 BA.debugLineNum = 185;BA.debugLine="Private Sub RabbitLoop";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 186;BA.debugLine="If RabbitLoopRunning Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_rabbitlooprunning" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 187;BA.debugLine="RabbitLoopRunning = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_rabbitlooprunning" /*RemoteObject*/ ,b4xturtle.__c.getField(true,"True"));
 BA.debugLineNum = 188;BA.debugLine="Do While Queue.Size > 0 And State.RabbitMode";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean(">",__ref.getField(false,"_queue" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"RabbitMode" /*RemoteObject*/ ))) {
 BA.debugLineNum = 189;BA.debugLine="Dim ta As TurtleAction = Queue.Get(0)";
Debug.JustUpdateDeviceLine();
_ta = (__ref.getField(false,"_queue" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("ta", _ta);Debug.locals.put("ta", _ta);
 BA.debugLineNum = 190;BA.debugLine="RunAction(ta, 0)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_runaction" /*RemoteObject*/ ,(Object)(_ta),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 191;BA.debugLine="RunAction(ta, 1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_runaction" /*RemoteObject*/ ,(Object)(_ta),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 192;BA.debugLine="Queue.RemoveAt(0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_queue" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 }
;
 BA.debugLineNum = 194;BA.debugLine="RabbitLoopRunning = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_rabbitlooprunning" /*RemoteObject*/ ,b4xturtle.__c.getField(true,"False"));
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rabbitmode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RabbitMode (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,658);
if (RapidSub.canDelegate("rabbitmode")) { return __ref.runUserSub(false, "b4xturtle","rabbitmode", __ref);}
RemoteObject _ta = RemoteObject.declareNull("b4j.example.b4xturtle._turtleaction");
 BA.debugLineNum = 658;BA.debugLine="Public Sub RabbitMode As B4XTurtle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 659;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 1,";
Debug.JustUpdateDeviceLine();
_ta = __ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 1)),(Object)(RemoteObject.createImmutable("Rabbit_Action")));Debug.locals.put("ta", _ta);Debug.locals.put("ta", _ta);
 BA.debugLineNum = 660;BA.debugLine="If Queue.Size = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_queue" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 661;BA.debugLine="Rabbit_Action(ta, 1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_rabbit_action" /*void*/ ,(Object)(_ta),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 662;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 }else {
 BA.debugLineNum = 664;BA.debugLine="Return AddAction(ta)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(_ta));
 };
 BA.debugLineNum = 666;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _randomcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RandomColor (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,913);
if (RapidSub.canDelegate("randomcolor")) { return __ref.runUserSub(false, "b4xturtle","randomcolor", __ref);}
 BA.debugLineNum = 913;BA.debugLine="Public Sub RandomColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 914;BA.debugLine="Return Rnd(0xff000000, 0xffffffff)";
Debug.JustUpdateDeviceLine();
if (true) return b4xturtle.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0xff000000)),(Object)(BA.numberCast(int.class, 0xffffffff)));
 BA.debugLineNum = 915;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshmain(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RefreshMain (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,449);
if (RapidSub.canDelegate("refreshmain")) { return __ref.runUserSub(false, "b4xturtle","refreshmain", __ref);}
 BA.debugLineNum = 449;BA.debugLine="Private Sub RefreshMain";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 450;BA.debugLine="GetLayer.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_getlayer" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 451;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _refreshturtleafterloop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RefreshTurtleAfterLoop (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("refreshturtleafterloop")) { __ref.runUserSub(false, "b4xturtle","refreshturtleafterloop", __ref); return;}
ResumableSub_RefreshTurtleAfterLoop rsub = new ResumableSub_RefreshTurtleAfterLoop(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RefreshTurtleAfterLoop extends BA.ResumableSub {
public ResumableSub_RefreshTurtleAfterLoop(b4j.example.b4xturtle parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xturtle parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RefreshTurtleAfterLoop (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,197);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 198;BA.debugLine="Do While TurtleBCIsDrawing";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//do while
this.state = 4;
while (__ref.getField(true,"_turtlebcisdrawing" /*RemoteObject*/ ).<Boolean>get().booleanValue()) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
 BA.debugLineNum = 199;BA.debugLine="Sleep(10)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xturtle", "refreshturtleafterloop"),BA.numberCast(int.class, 10));
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
 BA.debugLineNum = 201;BA.debugLine="DrawTurtle";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_drawturtle" /*void*/ );
 BA.debugLineNum = 202;BA.debugLine="End Sub";
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
public static RemoteObject  _resume(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Resume (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("resume")) { return __ref.runUserSub(false, "b4xturtle","resume", __ref);}
 BA.debugLineNum = 210;BA.debugLine="Public Sub Resume";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 211;BA.debugLine="If Ready And Queue.Size > 0 Then MainTimer.Enable";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_ready" /*RemoteObject*/ )) && RemoteObject.solveBoolean(">",__ref.getField(false,"_queue" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_maintimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xturtle.__c.getField(true,"True"));};
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _right_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("Right_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,688);
if (RapidSub.canDelegate("right_action")) { return __ref.runUserSub(false, "b4xturtle","right_action", __ref, _ta, _stage);}
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 688;BA.debugLine="Private Sub Right_Action (TA As TurtleAction, Stag";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 689;BA.debugLine="If Stage = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 690;BA.debugLine="TA.Extra = Array(State.Degree)";
Debug.JustUpdateDeviceLine();
_ta.setField ("Extra" /*RemoteObject*/ ,b4xturtle.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Degree" /*RemoteObject*/ ))}))));
 }else 
{ BA.debugLineNum = 691;BA.debugLine="Else If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 692;BA.debugLine="State.Degree = TA.Extra.Get(0) + TA.Param1";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("Degree" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _ta.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),_ta.getField(true,"Param1" /*RemoteObject*/ )}, "+",1, 0)));
 BA.debugLineNum = 696;BA.debugLine="State.Degree = ((State.Degree Mod 360) + 360) Mo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("Degree" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"Degree" /*RemoteObject*/ ),RemoteObject.createImmutable(360)}, "%",0, 0)),RemoteObject.createImmutable(360)}, "+",1, 0)),RemoteObject.createImmutable(360)}, "%",0, 0)));
 }else {
 BA.debugLineNum = 699;BA.debugLine="State.Degree = TA.Extra.Get(0) + TA.Param1 * Sta";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("Degree" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _ta.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),_ta.getField(true,"Param1" /*RemoteObject*/ ),_stage}, "+*",1, 0)));
 }}
;
 BA.debugLineNum = 701;BA.debugLine="DrawTurtle";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_drawturtle" /*void*/ );
 BA.debugLineNum = 702;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _runaction(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("RunAction (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,218);
if (RapidSub.canDelegate("runaction")) { return __ref.runUserSub(false, "b4xturtle","runaction", __ref, _ta, _stage);}
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 218;BA.debugLine="Private Sub RunAction (TA As TurtleAction, Stage A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 219;BA.debugLine="If TA.RunSub = \"Forward_Action\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ta.getField(true,"RunSub" /*RemoteObject*/ ),BA.ObjectToString("Forward_Action"))) { 
 BA.debugLineNum = 220;BA.debugLine="Forward_Action(TA, Stage)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_forward_action" /*RemoteObject*/ ,(Object)(_ta),(Object)(_stage));
 }else 
{ BA.debugLineNum = 221;BA.debugLine="Else If TA.RunSub = \"Right_Action\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ta.getField(true,"RunSub" /*RemoteObject*/ ),BA.ObjectToString("Right_Action"))) { 
 BA.debugLineNum = 222;BA.debugLine="Right_Action(TA, Stage)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_right_action" /*RemoteObject*/ ,(Object)(_ta),(Object)(_stage));
 }else 
{ BA.debugLineNum = 223;BA.debugLine="Else If TA.RunSub = \"MoveTo_Action\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ta.getField(true,"RunSub" /*RemoteObject*/ ),BA.ObjectToString("MoveTo_Action"))) { 
 BA.debugLineNum = 224;BA.debugLine="MoveTo_Action(TA, Stage)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_moveto_action" /*RemoteObject*/ ,(Object)(_ta),(Object)(_stage));
 }else {
 BA.debugLineNum = 226;BA.debugLine="CallSub3(Me, TA.RunSub, TA, Stage)";
Debug.JustUpdateDeviceLine();
b4xturtle.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(_ta.getField(true,"RunSub" /*RemoteObject*/ )),(Object)((_ta)),(Object)((_stage)));
 }}}
;
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setandaddtoqueue(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _xx,RemoteObject _yy,RemoteObject _tpm,RemoteObject _rpm) throws Exception{
try {
		Debug.PushSubsStack("SetAndAddToQueue (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,854);
if (RapidSub.canDelegate("setandaddtoqueue")) { return __ref.runUserSub(false, "b4xturtle","setandaddtoqueue", __ref, _x, _y, _xx, _yy, _tpm, _rpm);}
RemoteObject _temp = RemoteObject.declareNull("b4j.example.bitmapcreator._premultipliedcolor");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("xx", _xx);
Debug.locals.put("yy", _yy);
Debug.locals.put("tpm", _tpm);
Debug.locals.put("rpm", _rpm);
 BA.debugLineNum = 854;BA.debugLine="Private Sub SetAndAddToQueue (x As Int, y As Int,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 855;BA.debugLine="If x < 0 Or x >= FloodBC.mWidth Or y < 0 Or y >=";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_x,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("g",_x,BA.numberCast(double.class, __ref.getField(false,"_floodbc" /*RemoteObject*/ ).getField(true,"_mwidth"))) || RemoteObject.solveBoolean("<",_y,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("g",_y,BA.numberCast(double.class, __ref.getField(false,"_floodbc" /*RemoteObject*/ ).getField(true,"_mheight")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 856;BA.debugLine="Dim temp As PremultipliedColor";
Debug.JustUpdateDeviceLine();
_temp = RemoteObject.createNew ("b4j.example.bitmapcreator._premultipliedcolor");Debug.locals.put("temp", _temp);
 BA.debugLineNum = 857;BA.debugLine="If ColorsEqual(FloodBC.GetPremultipliedColor(x, y";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (b4j.example.b4xturtle.class, "_colorsequal" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_floodbc" /*RemoteObject*/ ).runMethod(false,"_getpremultipliedcolor",(Object)(_x),(Object)(_y),(Object)(_temp))),(Object)(_tpm)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 858;BA.debugLine="FloodBC.SetPremultipliedColor(x, y, rpm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_floodbc" /*RemoteObject*/ ).runVoidMethod ("_setpremultipliedcolor",(Object)(_x),(Object)(_y),(Object)(_rpm));
 BA.debugLineNum = 859;BA.debugLine="xx.Add(x)";
Debug.JustUpdateDeviceLine();
_xx.runVoidMethod ("Add",(Object)((_x)));
 BA.debugLineNum = 860;BA.debugLine="yy.Add(y)";
Debug.JustUpdateDeviceLine();
_yy.runVoidMethod ("Add",(Object)((_y)));
 };
 BA.debugLineNum = 862;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setangle(RemoteObject __ref,RemoteObject _degrees) throws Exception{
try {
		Debug.PushSubsStack("SetAngle (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,645);
if (RapidSub.canDelegate("setangle")) { return __ref.runUserSub(false, "b4xturtle","setangle", __ref, _degrees);}
RemoteObject _ta = RemoteObject.declareNull("b4j.example.b4xturtle._turtleaction");
Debug.locals.put("Degrees", _degrees);
 BA.debugLineNum = 645;BA.debugLine="Public Sub SetAngle (Degrees As Float) As B4XTurtl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 646;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, De";
Debug.JustUpdateDeviceLine();
_ta = __ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(_degrees),(Object)(RemoteObject.createImmutable("SetAngle_Action")));Debug.locals.put("ta", _ta);Debug.locals.put("ta", _ta);
 BA.debugLineNum = 647;BA.debugLine="Return AddAction(ta)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(_ta));
 BA.debugLineNum = 648;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setangle_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("SetAngle_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,650);
if (RapidSub.canDelegate("setangle_action")) { return __ref.runUserSub(false, "b4xturtle","setangle_action", __ref, _ta, _stage);}
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 650;BA.debugLine="Private Sub SetAngle_Action (TA As TurtleAction, S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 651;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 652;BA.debugLine="State.Degree = TA.Param1";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("Degree" /*RemoteObject*/ ,_ta.getField(true,"Param1" /*RemoteObject*/ ));
 BA.debugLineNum = 653;BA.debugLine="DrawTurtle";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_drawturtle" /*void*/ );
 };
 BA.debugLineNum = 655;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcurrentlayer(RemoteObject __ref,RemoteObject _layerindex) throws Exception{
try {
		Debug.PushSubsStack("SetCurrentLayer (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,558);
if (RapidSub.canDelegate("setcurrentlayer")) { return __ref.runUserSub(false, "b4xturtle","setcurrentlayer", __ref, _layerindex);}
Debug.locals.put("LayerIndex", _layerindex);
 BA.debugLineNum = 558;BA.debugLine="Public Sub SetCurrentLayer (LayerIndex As Int) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 559;BA.debugLine="Return AddAction(CreateTurtleAction(0, LayerIndex";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, _layerindex)),(Object)(RemoteObject.createImmutable("SetCurrentLayer_Action")))));
 BA.debugLineNum = 560;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcurrentlayer_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("SetCurrentLayer_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,562);
if (RapidSub.canDelegate("setcurrentlayer_action")) { return __ref.runUserSub(false, "b4xturtle","setcurrentlayer_action", __ref, _ta, _stage);}
RemoteObject _index = RemoteObject.createImmutable(0);
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 562;BA.debugLine="Private Sub SetCurrentLayer_Action (TA As TurtleAc";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 563;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 564;BA.debugLine="Dim index As Int = TA.Param1";
Debug.JustUpdateDeviceLine();
_index = BA.numberCast(int.class, _ta.getField(true,"Param1" /*RemoteObject*/ ));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 565;BA.debugLine="If index > Layers.Size - 1 Or index < 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_index,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_layers" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))) || RemoteObject.solveBoolean("<",_index,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 566;BA.debugLine="Log(\"Error: invalid layer index.\")";
Debug.JustUpdateDeviceLine();
b4xturtle.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Error: invalid layer index.")));
 BA.debugLineNum = 567;BA.debugLine="index = Max(0, Min(index, Layers.Size - 1))";
Debug.JustUpdateDeviceLine();
_index = BA.numberCast(int.class, b4xturtle.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(b4xturtle.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _index)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_layers" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))))));Debug.locals.put("index", _index);
 };
 BA.debugLineNum = 569;BA.debugLine="State.CanvasLayer = index";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("CanvasLayer" /*RemoteObject*/ ,_index);
 };
 BA.debugLineNum = 571;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfontandalignment(RemoteObject __ref,RemoteObject _fnt,RemoteObject _alignment) throws Exception{
try {
		Debug.PushSubsStack("SetFontAndAlignment (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,605);
if (RapidSub.canDelegate("setfontandalignment")) { return __ref.runUserSub(false, "b4xturtle","setfontandalignment", __ref, _fnt, _alignment);}
RemoteObject _ta = RemoteObject.declareNull("b4j.example.b4xturtle._turtleaction");
Debug.locals.put("Fnt", _fnt);
Debug.locals.put("Alignment", _alignment);
 BA.debugLineNum = 605;BA.debugLine="Public Sub SetFontAndAlignment (Fnt As B4XFont, Al";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 606;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
Debug.JustUpdateDeviceLine();
_ta = __ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(RemoteObject.createImmutable("SetFontAndAlignment_Action")));Debug.locals.put("ta", _ta);Debug.locals.put("ta", _ta);
 BA.debugLineNum = 607;BA.debugLine="ta.Extra = Array(Fnt, Alignment)";
Debug.JustUpdateDeviceLine();
_ta.setField ("Extra" /*RemoteObject*/ ,b4xturtle.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_fnt.getObject()),(_alignment)}))));
 BA.debugLineNum = 608;BA.debugLine="Return AddAction(ta)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(_ta));
 BA.debugLineNum = 609;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfontandalignment_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("SetFontAndAlignment_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,611);
if (RapidSub.canDelegate("setfontandalignment_action")) { return __ref.runUserSub(false, "b4xturtle","setfontandalignment_action", __ref, _ta, _stage);}
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 611;BA.debugLine="Private Sub SetFontAndAlignment_Action (TA As Turt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 612;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 613;BA.debugLine="State.Fnt = TA.Extra.Get(0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).getField(false,"Fnt" /*RemoteObject*/ ).setObject (_ta.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 614;BA.debugLine="State.Alignment = TA.Extra.Get(1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("Alignment" /*RemoteObject*/ ,BA.ObjectToString(_ta.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))));
 };
 BA.debugLineNum = 616;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnumberoflayer_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("SetNumberOfLayer_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,538);
if (RapidSub.canDelegate("setnumberoflayer_action")) { return __ref.runUserSub(false, "b4xturtle","setnumberoflayer_action", __ref, _ta, _stage);}
RemoteObject _n = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 538;BA.debugLine="Private Sub SetNumberOfLayer_Action (TA As TurtleA";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 539;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 540;BA.debugLine="Dim n As Int = Max(1, TA.Param1)";
Debug.JustUpdateDeviceLine();
_n = BA.numberCast(int.class, b4xturtle.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 1)),(Object)(BA.numberCast(double.class, _ta.getField(true,"Param1" /*RemoteObject*/ )))));Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 541;BA.debugLine="If n < Layers.Size Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_n,BA.numberCast(double.class, __ref.getField(false,"_layers" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
 BA.debugLineNum = 542;BA.debugLine="For i = n To Layers.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_layers" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = _n.<Integer>get().intValue() ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 543;BA.debugLine="Dim cvs As B4XCanvas = Layers.Get(Layers.Size";
Debug.JustUpdateDeviceLine();
_cvs = (__ref.getField(false,"_layers" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_layers" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("cvs", _cvs);Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 544;BA.debugLine="cvs.TargetView.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_cvs.runMethod(false,"getTargetView").runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 545;BA.debugLine="cvs.Release";
Debug.JustUpdateDeviceLine();
_cvs.runVoidMethod ("Release");
 BA.debugLineNum = 546;BA.debugLine="Layers.RemoveAt(Layers.Size - 1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_layers" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_layers" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 548;BA.debugLine="Else if n > Layers.Size Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_n,BA.numberCast(double.class, __ref.getField(false,"_layers" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
 BA.debugLineNum = 549;BA.debugLine="For i = 1 To n - Layers.Size";
Debug.JustUpdateDeviceLine();
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_n,__ref.getField(false,"_layers" /*RemoteObject*/ ).runMethod(true,"getSize")}, "-",1, 1).<Integer>get().intValue();
_i = 1 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 550;BA.debugLine="CreateCanvasLayer";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_createcanvaslayer" /*RemoteObject*/ );
 }
}Debug.locals.put("i", _i);
;
 }}
;
 BA.debugLineNum = 553;BA.debugLine="State.CanvasLayer = Min(State.CanvasLayer, Layer";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("CanvasLayer" /*RemoteObject*/ ,BA.numberCast(int.class, b4xturtle.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"CanvasLayer" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_layers" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))));
 };
 BA.debugLineNum = 555;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnumberoflayers(RemoteObject __ref,RemoteObject _numberoflayers) throws Exception{
try {
		Debug.PushSubsStack("SetNumberOfLayers (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,534);
if (RapidSub.canDelegate("setnumberoflayers")) { return __ref.runUserSub(false, "b4xturtle","setnumberoflayers", __ref, _numberoflayers);}
Debug.locals.put("NumberOfLayers", _numberoflayers);
 BA.debugLineNum = 534;BA.debugLine="Public Sub SetNumberOfLayers (NumberOfLayers As In";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 535;BA.debugLine="Return AddAction(CreateTurtleAction(0, NumberOfLa";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, _numberoflayers)),(Object)(RemoteObject.createImmutable("SetNumberOfLayer_Action")))));
 BA.debugLineNum = 536;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpencolor(RemoteObject __ref,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("SetPenColor (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,276);
if (RapidSub.canDelegate("setpencolor")) { return __ref.runUserSub(false, "b4xturtle","setpencolor", __ref, _clr);}
RemoteObject _ta = RemoteObject.declareNull("b4j.example.b4xturtle._turtleaction");
Debug.locals.put("Clr", _clr);
 BA.debugLineNum = 276;BA.debugLine="Public Sub SetPenColor (Clr As Int) As B4XTurtle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 277;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
Debug.JustUpdateDeviceLine();
_ta = __ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(RemoteObject.createImmutable("PenColor_Action")));Debug.locals.put("ta", _ta);Debug.locals.put("ta", _ta);
 BA.debugLineNum = 278;BA.debugLine="ta.Extra = Array(Clr)";
Debug.JustUpdateDeviceLine();
_ta.setField ("Extra" /*RemoteObject*/ ,b4xturtle.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_clr)}))));
 BA.debugLineNum = 279;BA.debugLine="Return AddAction(ta)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(_ta));
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpensize(RemoteObject __ref,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("SetPenSize (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,574);
if (RapidSub.canDelegate("setpensize")) { return __ref.runUserSub(false, "b4xturtle","setpensize", __ref, _size);}
RemoteObject _ta = RemoteObject.declareNull("b4j.example.b4xturtle._turtleaction");
Debug.locals.put("Size", _size);
 BA.debugLineNum = 574;BA.debugLine="Public Sub SetPenSize(Size As Float) As B4XTurtle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 575;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, Si";
Debug.JustUpdateDeviceLine();
_ta = __ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(_size),(Object)(RemoteObject.createImmutable("SetPenSize_Action")));Debug.locals.put("ta", _ta);Debug.locals.put("ta", _ta);
 BA.debugLineNum = 576;BA.debugLine="Return AddAction(ta)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(_ta));
 BA.debugLineNum = 577;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpensize_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("SetPenSize_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,579);
if (RapidSub.canDelegate("setpensize_action")) { return __ref.runUserSub(false, "b4xturtle","setpensize_action", __ref, _ta, _stage);}
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 579;BA.debugLine="Private Sub SetPenSize_Action (TA As TurtleAction,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 580;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 581;BA.debugLine="State.PenThickness = TA.Param1";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("PenThickness" /*RemoteObject*/ ,_ta.getField(true,"Param1" /*RemoteObject*/ ));
 BA.debugLineNum = 582;BA.debugLine="DrawTurtle";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_drawturtle" /*void*/ );
 };
 BA.debugLineNum = 584;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setposition(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("SetPosition (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,463);
if (RapidSub.canDelegate("setposition")) { return __ref.runUserSub(false, "b4xturtle","setposition", __ref, _x, _y);}
RemoteObject _ta = RemoteObject.declareNull("b4j.example.b4xturtle._turtleaction");
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 463;BA.debugLine="Private Sub SetPosition (X As Float, Y As Float) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 464;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
Debug.JustUpdateDeviceLine();
_ta = __ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(RemoteObject.createImmutable("SetPosition_Action")));Debug.locals.put("ta", _ta);Debug.locals.put("ta", _ta);
 BA.debugLineNum = 465;BA.debugLine="ta.Extra = Array(X, Y)";
Debug.JustUpdateDeviceLine();
_ta.setField ("Extra" /*RemoteObject*/ ,b4xturtle.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_x),(_y)}))));
 BA.debugLineNum = 466;BA.debugLine="Return AddAction(ta)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(_ta));
 BA.debugLineNum = 467;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setposition_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("SetPosition_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,525);
if (RapidSub.canDelegate("setposition_action")) { return __ref.runUserSub(false, "b4xturtle","setposition_action", __ref, _ta, _stage);}
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 525;BA.debugLine="Private Sub SetPosition_Action (TA As TurtleAction";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 526;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 527;BA.debugLine="If TA.Extra.Get(0) >= 0 Then State.UserX = Max(0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",BA.numberCast(double.class, _ta.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("UserX" /*RemoteObject*/ ,BA.numberCast(float.class, b4xturtle.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(b4xturtle.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(true,"_mwidth" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _ta.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))))))));};
 BA.debugLineNum = 528;BA.debugLine="If TA.Extra.Get(1) >= 0 Then State.UserY = Max(0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",BA.numberCast(double.class, _ta.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("UserY" /*RemoteObject*/ ,BA.numberCast(float.class, b4xturtle.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(b4xturtle.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(true,"_mheight" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _ta.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))))))));};
 BA.debugLineNum = 529;BA.debugLine="DrawTurtle";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_drawturtle" /*void*/ );
 };
 BA.debugLineNum = 531;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setspeedfactor(RemoteObject __ref,RemoteObject _factor) throws Exception{
try {
		Debug.PushSubsStack("SetSpeedFactor (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,635);
if (RapidSub.canDelegate("setspeedfactor")) { return __ref.runUserSub(false, "b4xturtle","setspeedfactor", __ref, _factor);}
Debug.locals.put("Factor", _factor);
 BA.debugLineNum = 635;BA.debugLine="Public Sub SetSpeedFactor(Factor As Float) As B4XT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 636;BA.debugLine="Return AddAction(CreateTurtleAction(0, Factor, \"S";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(_factor),(Object)(RemoteObject.createImmutable("SetSpeedFactor_Action")))));
 BA.debugLineNum = 637;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setspeedfactor_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("SetSpeedFactor_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,639);
if (RapidSub.canDelegate("setspeedfactor_action")) { return __ref.runUserSub(false, "b4xturtle","setspeedfactor_action", __ref, _ta, _stage);}
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 639;BA.debugLine="Private Sub SetSpeedFactor_Action (TA As TurtleAct";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 640;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 641;BA.debugLine="State.SpeedFactor = TA.Param1";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("SpeedFactor" /*RemoteObject*/ ,_ta.getField(true,"Param1" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 643;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setturtlevisible(RemoteObject __ref,RemoteObject _visible) throws Exception{
try {
		Debug.PushSubsStack("SetTurtleVisible (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,619);
if (RapidSub.canDelegate("setturtlevisible")) { return __ref.runUserSub(false, "b4xturtle","setturtlevisible", __ref, _visible);}
RemoteObject _ta = RemoteObject.declareNull("b4j.example.b4xturtle._turtleaction");
Debug.locals.put("Visible", _visible);
 BA.debugLineNum = 619;BA.debugLine="Public Sub SetTurtleVisible (Visible As Boolean) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 620;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
Debug.JustUpdateDeviceLine();
_ta = __ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(RemoteObject.createImmutable("SetTurtleVisible_Action")));Debug.locals.put("ta", _ta);Debug.locals.put("ta", _ta);
 BA.debugLineNum = 621;BA.debugLine="ta.Extra = Array(Visible)";
Debug.JustUpdateDeviceLine();
_ta.setField ("Extra" /*RemoteObject*/ ,b4xturtle.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_visible)}))));
 BA.debugLineNum = 622;BA.debugLine="Return AddAction(ta)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(_ta));
 BA.debugLineNum = 623;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setturtlevisible_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("SetTurtleVisible_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,625);
if (RapidSub.canDelegate("setturtlevisible_action")) { return __ref.runUserSub(false, "b4xturtle","setturtlevisible_action", __ref, _ta, _stage);}
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 625;BA.debugLine="Private Sub SetTurtleVisible_Action (TA As TurtleA";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 626;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 627;BA.debugLine="State.TurtleVisible = TA.Extra.Get(0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("TurtleVisible" /*RemoteObject*/ ,BA.ObjectToBoolean(_ta.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 628;BA.debugLine="TurtleLayer.Visible = State.TurtleVisible";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_turtlelayer" /*RemoteObject*/ ).runMethod(true,"setVisible",__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"TurtleVisible" /*RemoteObject*/ ));
 BA.debugLineNum = 629;BA.debugLine="DrawTurtle";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_drawturtle" /*void*/ );
 };
 BA.debugLineNum = 631;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setx(RemoteObject __ref,RemoteObject _x) throws Exception{
try {
		Debug.PushSubsStack("SetX (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,505);
if (RapidSub.canDelegate("setx")) { return __ref.runUserSub(false, "b4xturtle","setx", __ref, _x);}
Debug.locals.put("x", _x);
 BA.debugLineNum = 505;BA.debugLine="Public Sub SetX (x As Float) As B4XTurtle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 506;BA.debugLine="SetPosition(x, -1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_setposition" /*RemoteObject*/ ,(Object)(_x),(Object)(BA.numberCast(float.class, -(double) (0 + 1))));
 BA.debugLineNum = 507;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 508;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sety(RemoteObject __ref,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("SetY (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,515);
if (RapidSub.canDelegate("sety")) { return __ref.runUserSub(false, "b4xturtle","sety", __ref, _y);}
Debug.locals.put("y", _y);
 BA.debugLineNum = 515;BA.debugLine="Public Sub SetY(y As Float) As B4XTurtle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 516;BA.debugLine="SetPosition(-1, y)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xturtle.class, "_setposition" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, -(double) (0 + 1))),(Object)(_y));
 BA.debugLineNum = 517;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 518;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startpolygon(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StartPolygon (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,882);
if (RapidSub.canDelegate("startpolygon")) { return __ref.runUserSub(false, "b4xturtle","startpolygon", __ref);}
RemoteObject _ta = RemoteObject.declareNull("b4j.example.b4xturtle._turtleaction");
 BA.debugLineNum = 882;BA.debugLine="Public Sub StartPolygon As B4XTurtle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 883;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
Debug.JustUpdateDeviceLine();
_ta = __ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(RemoteObject.createImmutable("StartPolygon_Action")));Debug.locals.put("ta", _ta);Debug.locals.put("ta", _ta);
 BA.debugLineNum = 884;BA.debugLine="Return AddAction(ta)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(_ta));
 BA.debugLineNum = 885;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startpolygon_action(RemoteObject __ref,RemoteObject _ta,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("StartPolygon_Action (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,887);
if (RapidSub.canDelegate("startpolygon_action")) { return __ref.runUserSub(false, "b4xturtle","startpolygon_action", __ref, _ta, _stage);}
Debug.locals.put("TA", _ta);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 887;BA.debugLine="Private Sub StartPolygon_Action (TA As TurtleActio";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 888;BA.debugLine="If Stage = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 889;BA.debugLine="State.TrackPolygon = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).setField ("TrackPolygon" /*RemoteObject*/ ,b4xturtle.__c.getField(true,"True"));
 BA.debugLineNum = 890;BA.debugLine="If State.PolygonPoints.IsInitialized = False The";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_state" /*RemoteObject*/ ).getField(false,"PolygonPoints" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),b4xturtle.__c.getField(true,"False"))) { 
__ref.getField(false,"_state" /*RemoteObject*/ ).getField(false,"PolygonPoints" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 891;BA.debugLine="State.PolygonPoints.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).getField(false,"PolygonPoints" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 892;BA.debugLine="State.PolygonPoints.Add(Array As Float(UserToCan";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_state" /*RemoteObject*/ ).getField(false,"PolygonPoints" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("float",new int[] {2},new Object[] {__ref.runClassMethod (b4j.example.b4xturtle.class, "_usertocanvas" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserX" /*RemoteObject*/ ))),__ref.runClassMethod (b4j.example.b4xturtle.class, "_usertocanvas" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_state" /*RemoteObject*/ ).getField(true,"UserY" /*RemoteObject*/ )))}))));
 };
 BA.debugLineNum = 894;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Stop (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,705);
if (RapidSub.canDelegate("stop")) { return __ref.runUserSub(false, "b4xturtle","stop", __ref);}
 BA.debugLineNum = 705;BA.debugLine="Public Sub Stop As B4XTurtle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 706;BA.debugLine="Queue.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_queue" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 707;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 708;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _turnleft(RemoteObject __ref,RemoteObject _degrees) throws Exception{
try {
		Debug.PushSubsStack("TurnLeft (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,459);
if (RapidSub.canDelegate("turnleft")) { return __ref.runUserSub(false, "b4xturtle","turnleft", __ref, _degrees);}
Debug.locals.put("Degrees", _degrees);
 BA.debugLineNum = 459;BA.debugLine="Public Sub TurnLeft (Degrees As Float) As B4XTurtl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 460;BA.debugLine="Return TurnRight(-Degrees)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_turnright" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, -(double) (0 + _degrees.<Float>get().floatValue()))));
 BA.debugLineNum = 461;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _turnright(RemoteObject __ref,RemoteObject _degrees) throws Exception{
try {
		Debug.PushSubsStack("TurnRight (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,454);
if (RapidSub.canDelegate("turnright")) { return __ref.runUserSub(false, "b4xturtle","turnright", __ref, _degrees);}
Debug.locals.put("Degrees", _degrees);
 BA.debugLineNum = 454;BA.debugLine="Public Sub TurnRight (Degrees As Float) As B4XTurt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 455;BA.debugLine="Return AddAction(CreateTurtleAction(Abs(Degrees)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4xturtle.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _degrees))),__ref.getField(true,"_degreespersecond" /*RemoteObject*/ ),RemoteObject.createImmutable(1000)}, "/*",0, 0))),(Object)(_degrees),(Object)(RemoteObject.createImmutable("Right_Action")))));
 BA.debugLineNum = 456;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _turtlemode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TurtleMode (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,669);
if (RapidSub.canDelegate("turtlemode")) { return __ref.runUserSub(false, "b4xturtle","turtlemode", __ref);}
RemoteObject _ta = RemoteObject.declareNull("b4j.example.b4xturtle._turtleaction");
 BA.debugLineNum = 669;BA.debugLine="Public Sub TurtleMode As B4XTurtle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 670;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
Debug.JustUpdateDeviceLine();
_ta = __ref.runClassMethod (b4j.example.b4xturtle.class, "_createturtleaction" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(RemoteObject.createImmutable("Rabbit_Action")));Debug.locals.put("ta", _ta);Debug.locals.put("ta", _ta);
 BA.debugLineNum = 671;BA.debugLine="Return AddAction(ta)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xturtle.class, "_addaction" /*RemoteObject*/ ,(Object)(_ta));
 BA.debugLineNum = 672;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _usertocanvas(RemoteObject __ref,RemoteObject _x) throws Exception{
try {
		Debug.PushSubsStack("UserToCanvas (b4xturtle) ","b4xturtle",1,__ref.getField(false, "ba"),__ref,748);
if (RapidSub.canDelegate("usertocanvas")) { return __ref.runUserSub(false, "b4xturtle","usertocanvas", __ref, _x);}
Debug.locals.put("X", _x);
 BA.debugLineNum = 748;BA.debugLine="Private Sub UserToCanvas (X As Float) As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 749;BA.debugLine="Return X * mDPIScale";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_mdpiscale" /*RemoteObject*/ )}, "*",0, 0));
 BA.debugLineNum = 750;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}