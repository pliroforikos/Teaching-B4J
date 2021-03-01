package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xturtle extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xturtle", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xturtle.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _turtleaction{
public boolean IsInitialized;
public int Duration;
public float Param1;
public long StartTime;
public String RunSub;
public anywheresoftware.b4a.objects.collections.List Extra;
public void Initialize() {
IsInitialized = true;
Duration = 0;
Param1 = 0f;
StartTime = 0L;
RunSub = "";
Extra = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _turtlestate{
public boolean IsInitialized;
public float UserX;
public float UserY;
public float Degree;
public boolean PenDown;
public int PenColor;
public float PenThickness;
public float SpeedFactor;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont Fnt;
public String Alignment;
public boolean TurtleVisible;
public boolean RabbitMode;
public int CanvasLayer;
public anywheresoftware.b4a.objects.collections.List PolygonPoints;
public boolean TrackPolygon;
public void Initialize() {
IsInitialized = true;
UserX = 0f;
UserY = 0f;
Degree = 0f;
PenDown = false;
PenColor = 0;
PenThickness = 0f;
SpeedFactor = 0f;
Fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
Alignment = "";
TurtleVisible = false;
RabbitMode = false;
CanvasLayer = 0;
PolygonPoints = new anywheresoftware.b4a.objects.collections.List();
TrackPolygon = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _turtletouchargs{
public boolean IsInitialized;
public float X;
public float Y;
public boolean Up;
public boolean Down;
public boolean Move;
public void Initialize() {
IsInitialized = true;
X = 0f;
Y = 0f;
Up = false;
Down = false;
Move = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.collections.List _layers = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _turtlelayer = null;
public float _mdpiscale = 0f;
public b4j.example.bitmapcreator _mturtlebc = null;
public anywheresoftware.b4a.objects.collections.List _queue = null;
public anywheresoftware.b4a.objects.Timer _maintimer = null;
public int _timerinterval = 0;
public b4j.example.b4xturtle._turtlestate _state = null;
public int _distancepersecond = 0;
public b4j.example.bcpath._bcbrush _transparentturtlelayerbrush = null;
public boolean _turtlebcisdrawing = false;
public b4j.example.bcpath._bcbrush _turtlebrush = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _panel1 = null;
public int _degreespersecond = 0;
public int _mwidth = 0;
public int _mheight = 0;
public anywheresoftware.b4a.objects.collections.List _statesstack = null;
public boolean _ready = false;
public float _bcscale = 0f;
public long _debuglasttouchevent = 0L;
public int _turtlecolor = 0;
public int _resizeindex = 0;
public Object _tag = null;
public boolean _rabbitlooprunning = false;
public b4j.example.bitmapcreator _floodbc = null;
public int _alphaleveltotreatastransparent = 0;
public anywheresoftware.b4j.objects.JFX _fx = null;
public b4j.example.main _main = null;
public b4j.example.b4xturtle  _moveforward(b4j.example.b4xturtle __ref,float _distance) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "moveforward", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "moveforward", new Object[] {_distance}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub MoveForward (Distance As Float) As B4XT";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Return AddAction(CreateTurtleAction(Abs(Distance)";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,__ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (__c.Abs(_distance)/(double)__ref._distancepersecond /*int*/ *1000),_distance,"Forward_Action"));
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _turnleft(b4j.example.b4xturtle __ref,float _degrees) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "turnleft", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "turnleft", new Object[] {_degrees}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub TurnLeft (Degrees As Float) As B4XTurtl";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Return TurnRight(-Degrees)";
if (true) return __ref._turnright /*b4j.example.b4xturtle*/ (null,(float) (-_degrees));
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _stop(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "stop", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "stop", null));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub Stop As B4XTurtle";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Queue.Clear";
__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Return Me";
if (true) return (b4j.example.b4xturtle)(this);
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _clearscreen(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "clearscreen", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "clearscreen", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub ClearScreen As B4XTurtle";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Return AddAction(CreateTurtleAction(0, 0, \"Clear_";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,__ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (0),"Clear_Action"));
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _home(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "home", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "home", null));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub Home As B4XTurtle";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Return AddAction(CreateTurtleAction(0, 0, \"Home_A";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,__ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (0),"Home_Action"));
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _setpencolor(b4j.example.b4xturtle __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "setpencolor", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "setpencolor", new Object[] {_clr}));}
b4j.example.b4xturtle._turtleaction _ta = null;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub SetPenColor (Clr As Int) As B4XTurtle";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
_ta = __ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (0),"PenColor_Action");
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="ta.Extra = Array(Clr)";
_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_clr)});
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Return AddAction(ta)";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,_ta);
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _setpensize(b4j.example.b4xturtle __ref,float _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "setpensize", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "setpensize", new Object[] {_size}));}
b4j.example.b4xturtle._turtleaction _ta = null;
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Public Sub SetPenSize(Size As Float) As B4XTurtle";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, Si";
_ta = __ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),_size,"SetPenSize_Action");
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Return AddAction(ta)";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,_ta);
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="End Sub";
return null;
}
public String  _actionsloop(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "actionsloop", true))
	 {return ((String) Debug.delegate(ba, "actionsloop", null));}
int _accumulatedtime = 0;
b4j.example.b4xturtle._turtleaction _ta = null;
int _duration = 0;
float _stage = 0f;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub ActionsLoop";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="DrawTurtle";
__ref._drawturtle /*void*/ (null);
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Dim AccumulatedTime As Int";
_accumulatedtime = 0;
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Do While Queue.Size > 0 And MainTimer.Enabled And";
while (__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0 && __ref._maintimer /*anywheresoftware.b4a.objects.Timer*/ .getEnabled() && __ref._state /*b4j.example.b4xturtle._turtlestate*/ .RabbitMode /*boolean*/ ==__c.False) {
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="Dim ta As TurtleAction = Queue.Get(0)";
_ta = (b4j.example.b4xturtle._turtleaction)(__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Dim Duration As Int = ta.Duration / State.SpeedF";
_duration = (int) (_ta.Duration /*int*/ /(double)__ref._state /*b4j.example.b4xturtle._turtlestate*/ .SpeedFactor /*float*/ );
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="If Duration > 0 Then";
if (_duration>0) { 
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="If ta.StartTime = 0 Then";
if (_ta.StartTime /*long*/ ==0) { 
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="ta.StartTime = DateTime.Now - TimerInterval";
_ta.StartTime /*long*/  = (long) (__c.DateTime.getNow()-__ref._timerinterval /*int*/ );
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="RunAction(ta, 0)";
__ref._runaction /*String*/ (null,_ta,(float) (0));
 };
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="Dim Stage As Float = Max(0, Min(1, (DateTime.No";
_stage = (float) (__c.Max(0,__c.Min(1,(__c.DateTime.getNow()-_ta.StartTime /*long*/ )/(double)_duration)));
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="RunAction(ta, Stage)";
__ref._runaction /*String*/ (null,_ta,_stage);
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=786446;
 //BA.debugLineNum = 786446;BA.debugLine="Queue.RemoveAt(0)";
__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
RDebugUtils.currentLine=786447;
 //BA.debugLineNum = 786447;BA.debugLine="AccumulatedTime = AccumulatedTime + Duration";
_accumulatedtime = (int) (_accumulatedtime+_duration);
RDebugUtils.currentLine=786448;
 //BA.debugLineNum = 786448;BA.debugLine="If AccumulatedTime > 2 * TimerInterval Then Re";
if (_accumulatedtime>2*__ref._timerinterval /*int*/ ) { 
if (true) return "";};
 }else {
RDebugUtils.currentLine=786450;
 //BA.debugLineNum = 786450;BA.debugLine="Return";
if (true) return "";
 };
 }else {
RDebugUtils.currentLine=786453;
 //BA.debugLineNum = 786453;BA.debugLine="RunAction(ta, 0)";
__ref._runaction /*String*/ (null,_ta,(float) (0));
RDebugUtils.currentLine=786454;
 //BA.debugLineNum = 786454;BA.debugLine="RunAction(ta, 1)";
__ref._runaction /*String*/ (null,_ta,(float) (1));
RDebugUtils.currentLine=786455;
 //BA.debugLineNum = 786455;BA.debugLine="Queue.RemoveAt(0)";
__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 };
 }
;
RDebugUtils.currentLine=786458;
 //BA.debugLineNum = 786458;BA.debugLine="If State.RabbitMode = False Then";
if (__ref._state /*b4j.example.b4xturtle._turtlestate*/ .RabbitMode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=786459;
 //BA.debugLineNum = 786459;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_done\"";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_done",(int) (0))) { 
RDebugUtils.currentLine=786460;
 //BA.debugLineNum = 786460;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_done\")";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_done");
 };
RDebugUtils.currentLine=786462;
 //BA.debugLineNum = 786462;BA.debugLine="MainTimer.Enabled = False";
__ref._maintimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
 };
RDebugUtils.currentLine=786464;
 //BA.debugLineNum = 786464;BA.debugLine="RefreshTurtleAfterLoop";
__ref._refreshturtleafterloop /*void*/ (null);
RDebugUtils.currentLine=786465;
 //BA.debugLineNum = 786465;BA.debugLine="End Sub";
return "";
}
public void  _drawturtle(b4j.example.b4xturtle __ref) throws Exception{
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "drawturtle", true))
	 {Debug.delegate(ba, "drawturtle", null); return;}
ResumableSub_DrawTurtle rsub = new ResumableSub_DrawTurtle(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_DrawTurtle extends BA.ResumableSub {
public ResumableSub_DrawTurtle(b4j.example.b4xturtle parent,b4j.example.b4xturtle __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xturtle __ref;
b4j.example.b4xturtle parent;
anywheresoftware.b4a.objects.collections.List _tasks = null;
int _h = 0;
int _t = 0;
float _p1x = 0f;
float _p1y = 0f;
float _p2x = 0f;
float _p2y = 0f;
float _p3x = 0f;
float _p3y = 0f;
b4j.example.bcpath _path = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xturtle";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="If State.TurtleVisible = False Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._state /*b4j.example.b4xturtle._turtlestate*/ .TurtleVisible /*boolean*/ ==parent.__c.False) { 
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
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="If TurtleBCIsDrawing Then";
if (true) break;

case 7:
//if
this.state = 10;
if (__ref._turtlebcisdrawing /*boolean*/ ) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="If mTurtleBC.IsInitialized = False Then Return";

case 10:
//if
this.state = 15;
if (__ref._mturtlebc /*b4j.example.bitmapcreator*/ .IsInitialized()==parent.__c.False) { 
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
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="TurtleBCIsDrawing = True";
__ref._turtlebcisdrawing /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="Dim tasks As List";
_tasks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="tasks.Initialize";
_tasks.Initialize();
RDebugUtils.currentLine=4849674;
 //BA.debugLineNum = 4849674;BA.debugLine="tasks.Add(mTurtleBC.AsyncDrawRect(mTurtleBC.Targe";
_tasks.Add((Object)(__ref._mturtlebc /*b4j.example.bitmapcreator*/ ._asyncdrawrect(__ref._mturtlebc /*b4j.example.bitmapcreator*/ ._targetrect,__ref._transparentturtlelayerbrush /*b4j.example.bcpath._bcbrush*/ ,parent.__c.True,(int) (0))));
RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="Dim h As Int = 12";
_h = (int) (12);
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="Dim t As Int = 15";
_t = (int) (15);
RDebugUtils.currentLine=4849677;
 //BA.debugLineNum = 4849677;BA.debugLine="Dim p1x As Float = State.UserX - h * CosD(60 + St";
_p1x = (float) (__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserX /*float*/ -_h*parent.__c.CosD(60+__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/ ));
RDebugUtils.currentLine=4849678;
 //BA.debugLineNum = 4849678;BA.debugLine="Dim p1y As Float = State.UserY - h * SinD(60 + St";
_p1y = (float) (__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserY /*float*/ -_h*parent.__c.SinD(60+__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/ ));
RDebugUtils.currentLine=4849679;
 //BA.debugLineNum = 4849679;BA.debugLine="Dim p2x As Float = State.UserX - h * SinD(30 + St";
_p2x = (float) (__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserX /*float*/ -_h*parent.__c.SinD(30+__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/ ));
RDebugUtils.currentLine=4849680;
 //BA.debugLineNum = 4849680;BA.debugLine="Dim p2y As Float = State.UserY + h * CosD(30 + St";
_p2y = (float) (__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserY /*float*/ +_h*parent.__c.CosD(30+__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/ ));
RDebugUtils.currentLine=4849681;
 //BA.debugLineNum = 4849681;BA.debugLine="Dim p3x As Float = State.UserX + t * CosD(State.D";
_p3x = (float) (__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserX /*float*/ +_t*parent.__c.CosD(__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/ ));
RDebugUtils.currentLine=4849682;
 //BA.debugLineNum = 4849682;BA.debugLine="Dim p3y As Float = State.UserY + t * SinD(State.D";
_p3y = (float) (__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserY /*float*/ +_t*parent.__c.SinD(__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/ ));
RDebugUtils.currentLine=4849684;
 //BA.debugLineNum = 4849684;BA.debugLine="Dim path As BCPath";
_path = new b4j.example.bcpath();
RDebugUtils.currentLine=4849685;
 //BA.debugLineNum = 4849685;BA.debugLine="path.Initialize(p2x * bcScale, p2y * bcScale).Lin";
_path._initialize(ba,(float) (_p2x*__ref._bcscale /*float*/ ),(float) (_p2y*__ref._bcscale /*float*/ ))._lineto((float) (_p1x*__ref._bcscale /*float*/ ),(float) (_p1y*__ref._bcscale /*float*/ ))._lineto((float) (_p3x*__ref._bcscale /*float*/ ),(float) (_p3y*__ref._bcscale /*float*/ ))._lineto((float) (_p2x*__ref._bcscale /*float*/ ),(float) (_p2y*__ref._bcscale /*float*/ ));
RDebugUtils.currentLine=4849686;
 //BA.debugLineNum = 4849686;BA.debugLine="tasks.Add(mTurtleBC.AsyncDrawPath(path, TurtleBru";
_tasks.Add((Object)(__ref._mturtlebc /*b4j.example.bitmapcreator*/ ._asyncdrawpath(_path,__ref._turtlebrush /*b4j.example.bcpath._bcbrush*/ ,parent.__c.False,(int) (2*__ref._bcscale /*float*/ ))));
RDebugUtils.currentLine=4849692;
 //BA.debugLineNum = 4849692;BA.debugLine="mTurtleBC.DrawBitmapCreatorsAsync(Me, \"TurtleBC\",";
__ref._mturtlebc /*b4j.example.bitmapcreator*/ ._drawbitmapcreatorsasync(parent,"TurtleBC",_tasks);
RDebugUtils.currentLine=4849693;
 //BA.debugLineNum = 4849693;BA.debugLine="Wait For TurtleBC_BitmapReady (bmp As B4XBitmap)";
parent.__c.WaitFor("turtlebc_bitmapready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xturtle", "drawturtle"), null);
this.state = 20;
return;
case 20:
//C
this.state = 16;
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) result[1];
;
RDebugUtils.currentLine=4849694;
 //BA.debugLineNum = 4849694;BA.debugLine="If xui.IsB4J Then";
if (true) break;

case 16:
//if
this.state = 19;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=4849695;
 //BA.debugLineNum = 4849695;BA.debugLine="bmp = mTurtleBC.Bitmap";
_bmp = __ref._mturtlebc /*b4j.example.bitmapcreator*/ ._getbitmap();
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=4849697;
 //BA.debugLineNum = 4849697;BA.debugLine="mTurtleBC.SetBitmapToImageView(bmp, TurtleLayer)";
__ref._mturtlebc /*b4j.example.bitmapcreator*/ ._setbitmaptoimageview(_bmp,__ref._turtlelayer /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=4849698;
 //BA.debugLineNum = 4849698;BA.debugLine="TurtleBCIsDrawing = False";
__ref._turtlebcisdrawing /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=4849699;
 //BA.debugLineNum = 4849699;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _runaction(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "runaction", true))
	 {return ((String) Debug.delegate(ba, "runaction", new Object[] {_ta,_stage}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub RunAction (TA As TurtleAction, Stage A";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="If TA.RunSub = \"Forward_Action\" Then";
if ((_ta.RunSub /*String*/ ).equals("Forward_Action")) { 
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Forward_Action(TA, Stage)";
__ref._forward_action /*String*/ (null,_ta,_stage);
 }else 
{RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Else If TA.RunSub = \"Right_Action\" Then";
if ((_ta.RunSub /*String*/ ).equals("Right_Action")) { 
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="Right_Action(TA, Stage)";
__ref._right_action /*String*/ (null,_ta,_stage);
 }else 
{RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="Else If TA.RunSub = \"MoveTo_Action\" Then";
if ((_ta.RunSub /*String*/ ).equals("MoveTo_Action")) { 
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="MoveTo_Action(TA, Stage)";
__ref._moveto_action /*String*/ (null,_ta,_stage);
 }else {
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="CallSub3(Me, TA.RunSub, TA, Stage)";
__c.CallSubDebug3(ba,this,_ta.RunSub /*String*/ ,(Object)(_ta),(Object)(_stage));
 }}}
;
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="End Sub";
return "";
}
public void  _refreshturtleafterloop(b4j.example.b4xturtle __ref) throws Exception{
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "refreshturtleafterloop", true))
	 {Debug.delegate(ba, "refreshturtleafterloop", null); return;}
ResumableSub_RefreshTurtleAfterLoop rsub = new ResumableSub_RefreshTurtleAfterLoop(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_RefreshTurtleAfterLoop extends BA.ResumableSub {
public ResumableSub_RefreshTurtleAfterLoop(b4j.example.b4xturtle parent,b4j.example.b4xturtle __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xturtle __ref;
b4j.example.b4xturtle parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xturtle";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Do While TurtleBCIsDrawing";
if (true) break;

case 1:
//do while
this.state = 4;
while (__ref._turtlebcisdrawing /*boolean*/ ) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Sleep(10)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xturtle", "refreshturtleafterloop"),(int) (10));
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
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="DrawTurtle";
__ref._drawturtle /*void*/ (null);
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4j.example.b4xturtle  _addaction(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "addaction", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "addaction", new Object[] {_ta}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub AddAction(TA As TurtleAction) As B4XTu";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Queue.Add(TA)";
__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_ta));
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="If State.RabbitMode Then";
if (__ref._state /*b4j.example.b4xturtle._turtlestate*/ .RabbitMode /*boolean*/ ) { 
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="RabbitLoop";
__ref._rabbitloop /*String*/ (null);
 }else {
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="If MainTimer.Enabled = False Then";
if (__ref._maintimer /*anywheresoftware.b4a.objects.Timer*/ .getEnabled()==__c.False) { 
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="MainTimer.Enabled = True";
__ref._maintimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 };
 };
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="Return Me";
if (true) return (b4j.example.b4xturtle)(this);
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="End Sub";
return null;
}
public String  _rabbitloop(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "rabbitloop", true))
	 {return ((String) Debug.delegate(ba, "rabbitloop", null));}
b4j.example.b4xturtle._turtleaction _ta = null;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub RabbitLoop";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="If RabbitLoopRunning Then Return";
if (__ref._rabbitlooprunning /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="RabbitLoopRunning = True";
__ref._rabbitlooprunning /*boolean*/  = __c.True;
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Do While Queue.Size > 0 And State.RabbitMode";
while (__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0 && __ref._state /*b4j.example.b4xturtle._turtlestate*/ .RabbitMode /*boolean*/ ) {
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Dim ta As TurtleAction = Queue.Get(0)";
_ta = (b4j.example.b4xturtle._turtleaction)(__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="RunAction(ta, 0)";
__ref._runaction /*String*/ (null,_ta,(float) (0));
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="RunAction(ta, 1)";
__ref._runaction /*String*/ (null,_ta,(float) (1));
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="Queue.RemoveAt(0)";
__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 }
;
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="RabbitLoopRunning = False";
__ref._rabbitlooprunning /*boolean*/  = __c.False;
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xturtle  _arc(b4j.example.b4xturtle __ref,float _sweepangle,float _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "arc", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "arc", new Object[] {_sweepangle,_radius}));}
int _i = 0;
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Public Sub Arc (SweepAngle As Float, Radius As Flo";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="PushState";
__ref._pushstate /*b4j.example.b4xturtle*/ (null);
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="RabbitMode.TurnLeft(SweepAngle / 2).PenUp.MoveFor";
__ref._rabbitmode /*b4j.example.b4xturtle*/ (null)._turnleft /*b4j.example.b4xturtle*/ (null,(float) (_sweepangle/(double)2))._penup /*b4j.example.b4xturtle*/ (null)._moveforward /*b4j.example.b4xturtle*/ (null,_radius)._pendown /*b4j.example.b4xturtle*/ (null)._turnright /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="For i = 0 To SweepAngle";
{
final int step3 = 1;
final int limit3 = (int) (_sweepangle);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="MoveForward(2 * cPI * Radius / 360).TurnRight(1)";
__ref._moveforward /*b4j.example.b4xturtle*/ (null,(float) (2*__c.cPI*_radius/(double)360))._turnright /*b4j.example.b4xturtle*/ (null,(float) (1));
 }
};
RDebugUtils.currentLine=6094854;
 //BA.debugLineNum = 6094854;BA.debugLine="PopState";
__ref._popstate /*b4j.example.b4xturtle*/ (null);
RDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="Return Me";
if (true) return (b4j.example.b4xturtle)(this);
RDebugUtils.currentLine=6094856;
 //BA.debugLineNum = 6094856;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _pushstate(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "pushstate", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "pushstate", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub PushState As B4XTurtle";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Return AddAction(CreateTurtleAction(0, 0, \"PushSt";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,__ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (0),"PushState_Action"));
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _rabbitmode(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "rabbitmode", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "rabbitmode", null));}
b4j.example.b4xturtle._turtleaction _ta = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub RabbitMode As B4XTurtle";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 1,";
_ta = __ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (1),"Rabbit_Action");
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="If Queue.Size = 0 Then";
if (__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="Rabbit_Action(ta, 1)";
__ref._rabbit_action /*void*/ (null,_ta,(float) (1));
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="Return Me";
if (true) return (b4j.example.b4xturtle)(this);
 }else {
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="Return AddAction(ta)";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,_ta);
 };
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _penup(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "penup", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "penup", null));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub PenUp As B4XTurtle";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Return AddAction(CreateTurtleAction(0, 0, \"PenUpD";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,__ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (0),"PenUpDown_Action"));
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _pendown(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "pendown", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "pendown", null));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub PenDown As B4XTurtle";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Return AddAction(CreateTurtleAction(0, 1, \"PenUpD";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,__ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (1),"PenUpDown_Action"));
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _turnright(b4j.example.b4xturtle __ref,float _degrees) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "turnright", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "turnright", new Object[] {_degrees}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub TurnRight (Degrees As Float) As B4XTurt";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Return AddAction(CreateTurtleAction(Abs(Degrees)";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,__ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (__c.Abs(_degrees)/(double)__ref._degreespersecond /*int*/ *1000),_degrees,"Right_Action"));
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _popstate(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "popstate", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "popstate", null));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub PopState As B4XTurtle";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Return AddAction(CreateTurtleAction(0, 1, \"PushSt";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,__ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (1),"PushState_Action"));
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return null;
}
public void  _base_resize(b4j.example.b4xturtle __ref,double _width,double _height) throws Exception{
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {Debug.delegate(ba, "base_resize", new Object[] {_width,_height}); return;}
ResumableSub_Base_Resize rsub = new ResumableSub_Base_Resize(this,__ref,_width,_height);
rsub.resume(ba, null);
}
public static class ResumableSub_Base_Resize extends BA.ResumableSub {
public ResumableSub_Base_Resize(b4j.example.b4xturtle parent,b4j.example.b4xturtle __ref,double _width,double _height) {
this.parent = parent;
this.__ref = __ref;
this._width = _width;
this._height = _height;
this.__ref = parent;
}
b4j.example.b4xturtle __ref;
b4j.example.b4xturtle parent;
double _width;
double _height;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _myindex = 0;
anywheresoftware.b4a.objects.B4XCanvas _layer = null;
int step5;
int limit5;
anywheresoftware.b4a.BA.IterableList group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xturtle";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="If Width = 0 Or Height = 0 Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_width==0 || _height==0) { 
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
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="mWidth = Width / mDPIScale";
__ref._mwidth /*int*/  = (int) (_width/(double)__ref._mdpiscale /*float*/ );
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="mHeight = Height / mDPIScale";
__ref._mheight /*int*/  = (int) (_height/(double)__ref._mdpiscale /*float*/ );
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="Log($\"B4XTurtle size: $1.0{mWidth}x$1.0{mHeight}\"";
parent.__c.Log(("B4XTurtle size: "+parent.__c.SmartStringFormatter("1.0",(Object)(__ref._mwidth /*int*/ ))+"x"+parent.__c.SmartStringFormatter("1.0",(Object)(__ref._mheight /*int*/ ))+""));
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="For i = 0 To mBase.NumberOfViews - 1";
if (true) break;

case 7:
//for
this.state = 10;
step5 = 1;
limit5 = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
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
if (true) break;

case 9:
//C
this.state = 29;
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="Dim p As B4XView = mBase.GetView(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i);
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, Height)";
_p.SetLayoutAnimated((int) (0),0,0,_width,_height);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="ResizeIndex = ResizeIndex + 1";
__ref._resizeindex /*int*/  = (int) (__ref._resizeindex /*int*/ +1);
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="Dim MyIndex As Int = ResizeIndex";
_myindex = __ref._resizeindex /*int*/ ;
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="Do While TurtleBCIsDrawing";
if (true) break;

case 11:
//do while
this.state = 14;
while (__ref._turtlebcisdrawing /*boolean*/ ) {
this.state = 13;
if (true) break;
}
if (true) break;

case 13:
//C
this.state = 11;
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xturtle", "base_resize"),(int) (50));
this.state = 30;
return;
case 30:
//C
this.state = 11;
;
 if (true) break;
;
RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="If MyIndex <> ResizeIndex Then Return";

case 14:
//if
this.state = 19;
if (_myindex!=__ref._resizeindex /*int*/ ) { 
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
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="For Each layer As B4XCanvas In Layers";
if (true) break;

case 20:
//for
this.state = 27;
group15 = __ref._layers /*anywheresoftware.b4a.objects.collections.List*/ ;
index15 = 0;
groupLen15 = group15.getSize();
this.state = 31;
if (true) break;

case 31:
//C
this.state = 27;
if (index15 < groupLen15) {
this.state = 22;
_layer = (anywheresoftware.b4a.objects.B4XCanvas)(group15.Get(index15));}
if (true) break;

case 32:
//C
this.state = 31;
index15++;
if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="If xui.IsB4i Then";
if (true) break;

case 23:
//if
this.state = 26;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="layer.ClearRect(layer.TargetRect)";
_layer.ClearRect(_layer.getTargetRect());
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="layer.Invalidate";
_layer.Invalidate();
 if (true) break;

case 26:
//C
this.state = 32;
;
RDebugUtils.currentLine=524308;
 //BA.debugLineNum = 524308;BA.debugLine="layer.Resize(Width, Height)";
_layer.Resize(_width,_height);
 if (true) break;
if (true) break;

case 27:
//C
this.state = -1;
;
RDebugUtils.currentLine=524310;
 //BA.debugLineNum = 524310;BA.debugLine="PrepareLayers";
__ref._preparelayers /*String*/ (null);
RDebugUtils.currentLine=524311;
 //BA.debugLineNum = 524311;BA.debugLine="DrawTurtle";
__ref._drawturtle /*void*/ (null);
RDebugUtils.currentLine=524312;
 //BA.debugLineNum = 524312;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _preparelayers(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "preparelayers", true))
	 {return ((String) Debug.delegate(ba, "preparelayers", null));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub PrepareLayers";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="If xui.IsB4A Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="mTurtleBC.Initialize(Panel1.Width, Panel1.Height";
__ref._mturtlebc /*b4j.example.bitmapcreator*/ ._initialize(ba,(int) (__ref._panel1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(int) (__ref._panel1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
 }else {
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="mTurtleBC.Initialize(Panel1.Width * bcScale, Pan";
__ref._mturtlebc /*b4j.example.bitmapcreator*/ ._initialize(ba,(int) (__ref._panel1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()*__ref._bcscale /*float*/ ),(int) (__ref._panel1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*__ref._bcscale /*float*/ ));
 };
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="TransparentTurtleLayerBrush = mTurtleBC.CreateBru";
__ref._transparentturtlelayerbrush /*b4j.example.bcpath._bcbrush*/  = __ref._mturtlebc /*b4j.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="TurtleBrush = mTurtleBC.CreateBrushFromColor(Turt";
__ref._turtlebrush /*b4j.example.bcpath._bcbrush*/  = __ref._mturtlebc /*b4j.example.bitmapcreator*/ ._createbrushfromcolor(__ref._turtlecolor /*int*/ );
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="Private Layers As List";
_layers = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="Public TurtleLayer As B4XView";
_turtlelayer = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="Private mDPIScale As Float";
_mdpiscale = 0f;
RDebugUtils.currentLine=262152;
 //BA.debugLineNum = 262152;BA.debugLine="Private mTurtleBC As BitmapCreator";
_mturtlebc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=262153;
 //BA.debugLineNum = 262153;BA.debugLine="Type TurtleAction (Duration As Int, Param1 As Flo";
;
RDebugUtils.currentLine=262154;
 //BA.debugLineNum = 262154;BA.debugLine="Type TurtleState (UserX As Float, UserY As Float,";
;
RDebugUtils.currentLine=262157;
 //BA.debugLineNum = 262157;BA.debugLine="Type TurtleTouchArgs (X As Float, Y As Float, Up";
;
RDebugUtils.currentLine=262158;
 //BA.debugLineNum = 262158;BA.debugLine="Private Queue As List";
_queue = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=262159;
 //BA.debugLineNum = 262159;BA.debugLine="Private MainTimer As Timer";
_maintimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=262160;
 //BA.debugLineNum = 262160;BA.debugLine="Private TimerInterval As Int = 16";
_timerinterval = (int) (16);
RDebugUtils.currentLine=262161;
 //BA.debugLineNum = 262161;BA.debugLine="Private State As TurtleState";
_state = new b4j.example.b4xturtle._turtlestate();
RDebugUtils.currentLine=262162;
 //BA.debugLineNum = 262162;BA.debugLine="Public DistancePerSecond As Int = 200";
_distancepersecond = (int) (200);
RDebugUtils.currentLine=262163;
 //BA.debugLineNum = 262163;BA.debugLine="Private TransparentTurtleLayerBrush As BCBrush";
_transparentturtlelayerbrush = new b4j.example.bcpath._bcbrush();
RDebugUtils.currentLine=262164;
 //BA.debugLineNum = 262164;BA.debugLine="Private TurtleBCIsDrawing As Boolean";
_turtlebcisdrawing = false;
RDebugUtils.currentLine=262165;
 //BA.debugLineNum = 262165;BA.debugLine="Private TurtleBrush As BCBrush";
_turtlebrush = new b4j.example.bcpath._bcbrush();
RDebugUtils.currentLine=262166;
 //BA.debugLineNum = 262166;BA.debugLine="Private Panel1 As B4XView";
_panel1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=262167;
 //BA.debugLineNum = 262167;BA.debugLine="Public DegreesPerSecond As Int = 720";
_degreespersecond = (int) (720);
RDebugUtils.currentLine=262168;
 //BA.debugLineNum = 262168;BA.debugLine="Private mWidth, mHeight As Int";
_mwidth = 0;
_mheight = 0;
RDebugUtils.currentLine=262169;
 //BA.debugLineNum = 262169;BA.debugLine="Private StatesStack As List";
_statesstack = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=262170;
 //BA.debugLineNum = 262170;BA.debugLine="Private Ready As Boolean";
_ready = false;
RDebugUtils.currentLine=262171;
 //BA.debugLineNum = 262171;BA.debugLine="Private bcScale As Float = xui.Scale";
_bcscale = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale();
RDebugUtils.currentLine=262172;
 //BA.debugLineNum = 262172;BA.debugLine="Private DebugLastTouchEvent As Long 'ignore";
_debuglasttouchevent = 0L;
RDebugUtils.currentLine=262173;
 //BA.debugLineNum = 262173;BA.debugLine="Private TurtleColor As Int";
_turtlecolor = 0;
RDebugUtils.currentLine=262174;
 //BA.debugLineNum = 262174;BA.debugLine="Private ResizeIndex As Int";
_resizeindex = 0;
RDebugUtils.currentLine=262175;
 //BA.debugLineNum = 262175;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=262176;
 //BA.debugLineNum = 262176;BA.debugLine="Private RabbitLoopRunning As Boolean";
_rabbitlooprunning = false;
RDebugUtils.currentLine=262177;
 //BA.debugLineNum = 262177;BA.debugLine="Private FloodBC As BitmapCreator";
_floodbc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=262178;
 //BA.debugLineNum = 262178;BA.debugLine="Private const AlphaLevelToTreatAsTransparent As I";
_alphaleveltotreatastransparent = (int) (100);
RDebugUtils.currentLine=262180;
 //BA.debugLineNum = 262180;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=262182;
 //BA.debugLineNum = 262182;BA.debugLine="End Sub";
return "";
}
public String  _clear_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "clear_action", true))
	 {return ((String) Debug.delegate(ba, "clear_action", new Object[] {_ta,_stage}));}
anywheresoftware.b4a.objects.B4XCanvas _layer = null;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub Clear_Action (TA As TurtleAction, Stag";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Dim layer As B4XCanvas = GetLayer";
_layer = __ref._getlayer /*anywheresoftware.b4a.objects.B4XCanvas*/ (null);
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="layer.ClearRect(layer.TargetRect)";
_layer.ClearRect(_layer.getTargetRect());
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="RefreshMain";
__ref._refreshmain /*String*/ (null);
 };
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XCanvas  _getlayer(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "getlayer", true))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas) Debug.delegate(ba, "getlayer", null));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Private Sub GetLayer As B4XCanvas";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Return Layers.Get(State.CanvasLayer)";
if (true) return (anywheresoftware.b4a.objects.B4XCanvas)(__ref._layers /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._state /*b4j.example.b4xturtle._turtlestate*/ .CanvasLayer /*int*/ ));
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="End Sub";
return null;
}
public String  _refreshmain(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "refreshmain", true))
	 {return ((String) Debug.delegate(ba, "refreshmain", null));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub RefreshMain";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="GetLayer.Invalidate";
__ref._getlayer /*anywheresoftware.b4a.objects.B4XCanvas*/ (null).Invalidate();
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xturtle  _clearrect(b4j.example.b4xturtle __ref,float _left,float _top,float _width,float _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "clearrect", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "clearrect", new Object[] {_left,_top,_width,_height}));}
b4j.example.b4xturtle._turtleaction _ta = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub ClearRect (Left As Float, Top As Float,";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
_ta = __ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (0),"ClearRect_Action");
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="r.Initialize(UserToCanvas(Left), UserToCanvas(Top";
_r.Initialize(__ref._usertocanvas /*float*/ (null,_left),__ref._usertocanvas /*float*/ (null,_top),(float) (0),(float) (0));
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="r.Width = UserToCanvas(Width)";
_r.setWidth((int) (__ref._usertocanvas /*float*/ (null,_width)));
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="r.Height = UserToCanvas(Height)";
_r.setHeight(__ref._usertocanvas /*float*/ (null,_height));
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="ta.Extra = Array(r)";
_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_r)});
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="Return AddAction(ta)";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,_ta);
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle._turtleaction  _createturtleaction(b4j.example.b4xturtle __ref,int _duration,float _param1,String _runsub) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "createturtleaction", true))
	 {return ((b4j.example.b4xturtle._turtleaction) Debug.delegate(ba, "createturtleaction", new Object[] {_duration,_param1,_runsub}));}
b4j.example.b4xturtle._turtleaction _t1 = null;
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Private Sub CreateTurtleAction (Duration As Int, P";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Dim t1 As TurtleAction";
_t1 = new b4j.example.b4xturtle._turtleaction();
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="t1.Duration = Duration";
_t1.Duration /*int*/  = _duration;
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="t1.Param1 = Param1";
_t1.Param1 /*float*/  = _param1;
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="t1.RunSub = RunSub";
_t1.RunSub /*String*/  = _runsub;
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="End Sub";
return null;
}
public float  _usertocanvas(b4j.example.b4xturtle __ref,float _x) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "usertocanvas", true))
	 {return ((Float) Debug.delegate(ba, "usertocanvas", new Object[] {_x}));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub UserToCanvas (X As Float) As Float";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Return X * mDPIScale";
if (true) return (float) (_x*__ref._mdpiscale /*float*/ );
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="End Sub";
return 0f;
}
public String  _clearrect_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "clearrect_action", true))
	 {return ((String) Debug.delegate(ba, "clearrect_action", new Object[] {_ta,_stage}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub ClearRect_Action (ta As TurtleAction,";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="GetLayer.ClearRect(ta.Extra.Get(0))";
__ref._getlayer /*anywheresoftware.b4a.objects.B4XCanvas*/ (null).ClearRect((anywheresoftware.b4a.objects.B4XCanvas.B4XRect)(_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="RefreshMain";
__ref._refreshmain /*String*/ (null);
 };
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="End Sub";
return "";
}
public boolean  _colorsequal(b4j.example.b4xturtle __ref,b4j.example.bitmapcreator._premultipliedcolor _pm1,b4j.example.bitmapcreator._premultipliedcolor _pm2) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "colorsequal", true))
	 {return ((Boolean) Debug.delegate(ba, "colorsequal", new Object[] {_pm1,_pm2}));}
int _a = 0;
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Private Sub ColorsEqual(pm1 As PremultipliedColor,";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Dim a As Int = Bit.And(0xff, pm1.a)";
_a = __c.Bit.And((int) (0xff),_pm1.a);
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="Return (a > 0 And a < AlphaLevelToTreatAsTranspar";
if (true) return (_a>0 && _a<__ref._alphaleveltotreatastransparent /*int*/ ) || (_pm1.a==_pm2.a && _pm1.r==_pm2.r && _pm1.g==_pm2.g && _pm1.b==_pm2.b);
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="End Sub";
return false;
}
public String  _createcanvaslayer(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "createcanvaslayer", true))
	 {return ((String) Debug.delegate(ba, "createcanvaslayer", null));}
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Private Sub CreateCanvasLayer";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Dim cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="If Layers.Size > 0 Then";
if (__ref._layers /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="mBase.AddView(p, 0, 0, mBase.Width, mBase.Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_p.getObject()),0,0,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="cvs.Initialize(p)";
_cvs.Initialize(ba,_p);
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="TurtleLayer.BringToFront";
__ref._turtlelayer /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Private jo = p As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="jo.RunMethod(\"setMouseTransparent\", Array As Obj";
_jo.RunMethod("setMouseTransparent",new Object[]{(Object)(__c.True)});
 }else {
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="cvs.Initialize(Panel1)";
_cvs.Initialize(ba,__ref._panel1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
 };
RDebugUtils.currentLine=458769;
 //BA.debugLineNum = 458769;BA.debugLine="Layers.Add(cvs)";
__ref._layers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cvs));
RDebugUtils.currentLine=458770;
 //BA.debugLineNum = 458770;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createimageview(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "createimageview", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createimageview", null));}
anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub CreateImageView As B4XView";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="Return iv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle._turtlestate  _createturtlestate(b4j.example.b4xturtle __ref,float _userx,float _usery,float _degree,boolean _pendown1,int _pencolor,float _penthickness,float _speedfactor,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,String _alignment,boolean _turtlevisible,boolean _rabbitmode1,int _canvaslayer) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "createturtlestate", true))
	 {return ((b4j.example.b4xturtle._turtlestate) Debug.delegate(ba, "createturtlestate", new Object[] {_userx,_usery,_degree,_pendown1,_pencolor,_penthickness,_speedfactor,_fnt,_alignment,_turtlevisible,_rabbitmode1,_canvaslayer}));}
b4j.example.b4xturtle._turtlestate _t1 = null;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Private Sub CreateTurtleState (UserX As Float, Use";
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="Dim t1 As TurtleState";
_t1 = new b4j.example.b4xturtle._turtlestate();
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="t1.UserX = UserX";
_t1.UserX /*float*/  = _userx;
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="t1.UserY = UserY";
_t1.UserY /*float*/  = _usery;
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="t1.Degree = Degree";
_t1.Degree /*float*/  = _degree;
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="t1.PenDown = PenDown1";
_t1.PenDown /*boolean*/  = _pendown1;
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="t1.PenColor = PenColor";
_t1.PenColor /*int*/  = _pencolor;
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="t1.PenThickness = PenThickness";
_t1.PenThickness /*float*/  = _penthickness;
RDebugUtils.currentLine=4980747;
 //BA.debugLineNum = 4980747;BA.debugLine="t1.SpeedFactor = SpeedFactor";
_t1.SpeedFactor /*float*/  = _speedfactor;
RDebugUtils.currentLine=4980748;
 //BA.debugLineNum = 4980748;BA.debugLine="t1.Fnt = Fnt";
_t1.Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _fnt;
RDebugUtils.currentLine=4980749;
 //BA.debugLineNum = 4980749;BA.debugLine="t1.Alignment = Alignment";
_t1.Alignment /*String*/  = _alignment;
RDebugUtils.currentLine=4980750;
 //BA.debugLineNum = 4980750;BA.debugLine="t1.TurtleVisible = TurtleVisible";
_t1.TurtleVisible /*boolean*/  = _turtlevisible;
RDebugUtils.currentLine=4980751;
 //BA.debugLineNum = 4980751;BA.debugLine="t1.RabbitMode = RabbitMode1";
_t1.RabbitMode /*boolean*/  = _rabbitmode1;
RDebugUtils.currentLine=4980752;
 //BA.debugLineNum = 4980752;BA.debugLine="t1.CanvasLayer = CanvasLayer";
_t1.CanvasLayer /*int*/  = _canvaslayer;
RDebugUtils.currentLine=4980753;
 //BA.debugLineNum = 4980753;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=4980754;
 //BA.debugLineNum = 4980754;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle._turtletouchargs  _createturtletouchargs(b4j.example.b4xturtle __ref,float _x,float _y,boolean _up,boolean _down,boolean _move) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "createturtletouchargs", true))
	 {return ((b4j.example.b4xturtle._turtletouchargs) Debug.delegate(ba, "createturtletouchargs", new Object[] {_x,_y,_up,_down,_move}));}
b4j.example.b4xturtle._turtletouchargs _t1 = null;
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Private Sub CreateTurtleTouchArgs (X As Float, Y A";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Dim t1 As TurtleTouchArgs";
_t1 = new b4j.example.b4xturtle._turtletouchargs();
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="t1.X = X";
_t1.X /*float*/  = _x;
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="t1.Y = Y";
_t1.Y /*float*/  = _y;
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="t1.Up = Up";
_t1.Up /*boolean*/  = _up;
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="t1.Down = Down";
_t1.Down /*boolean*/  = _down;
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="t1.Move = Move";
_t1.Move /*boolean*/  = _move;
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=5308425;
 //BA.debugLineNum = 5308425;BA.debugLine="End Sub";
return null;
}
public void  _designercreateview(b4j.example.b4xturtle __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}); return;}
ResumableSub_DesignerCreateView rsub = new ResumableSub_DesignerCreateView(this,__ref,_base,_lbl,_props);
rsub.resume(ba, null);
}
public static class ResumableSub_DesignerCreateView extends BA.ResumableSub {
public ResumableSub_DesignerCreateView(b4j.example.b4xturtle parent,b4j.example.b4xturtle __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) {
this.parent = parent;
this.__ref = __ref;
this._base = _base;
this._lbl = _lbl;
this._props = _props;
this.__ref = parent;
}
b4j.example.b4xturtle __ref;
b4j.example.b4xturtle parent;
Object _base;
anywheresoftware.b4j.objects.LabelWrapper _lbl;
anywheresoftware.b4a.objects.collections.Map _props;
String _paneleventname = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xturtle";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(parent);
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="TurtleColor = xui.PaintOrColorToColor(Props.Get(\"";
__ref._turtlecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("TurtleColor")));
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="Dim PanelEventName As String";
_paneleventname = "";
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Touch\"";
if (true) break;

case 1:
//if
this.state = 8;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Touch",(int) (1))) { 
this.state = 3;
;}
else {
this.state = 5;
;}if (true) break;

case 3:
//C
this.state = 8;
_paneleventname = "Panel1";
if (true) break;

case 5:
//C
this.state = 8;
_paneleventname = "";
if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="Panel1 = xui.CreatePanel(PanelEventName)";
__ref._panel1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,_paneleventname);
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="mBase.AddView(Panel1, 0, 0, mBase.Width, mBase.He";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._panel1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="CreateCanvasLayer";
__ref._createcanvaslayer /*String*/ (null);
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="TurtleLayer = CreateImageView";
__ref._turtlelayer /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null);
RDebugUtils.currentLine=393226;
 //BA.debugLineNum = 393226;BA.debugLine="mBase.AddView(TurtleLayer, 0, 0, 2dip, 2dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._turtlelayer /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,parent.__c.DipToCurrent((int) (2)),parent.__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="mDPIScale = xui.Scale";
__ref._mdpiscale /*float*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale();
RDebugUtils.currentLine=393228;
 //BA.debugLineNum = 393228;BA.debugLine="If (xui.IsB4A) Then Base_Resize(mBase.Width, mBas";
if (true) break;

case 9:
//if
this.state = 14;
if ((__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A())) { 
this.state = 11;
;}if (true) break;

case 11:
//C
this.state = 14;
__ref._base_resize /*void*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="If xui.IsB4i Then";
if (true) break;

case 15:
//if
this.state = 20;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
RDebugUtils.currentLine=393230;
 //BA.debugLineNum = 393230;BA.debugLine="Sleep(300)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xturtle", "designercreateview"),(int) (300));
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
RDebugUtils.currentLine=393232;
 //BA.debugLineNum = 393232;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xturtle", "designercreateview"),(int) (20));
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
RDebugUtils.currentLine=393234;
 //BA.debugLineNum = 393234;BA.debugLine="Ready = True";
__ref._ready /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=393235;
 //BA.debugLineNum = 393235;BA.debugLine="Home_Action(Null, 1)";
__ref._home_action /*String*/ (null,(b4j.example.b4xturtle._turtleaction)(parent.__c.Null),(float) (1));
RDebugUtils.currentLine=393236;
 //BA.debugLineNum = 393236;BA.debugLine="MainTimer.Enabled = True";
__ref._maintimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=393237;
 //BA.debugLineNum = 393237;BA.debugLine="CallSub(mCallBack, mEventName & \"_Start\")";
parent.__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Start");
RDebugUtils.currentLine=393238;
 //BA.debugLineNum = 393238;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _home_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "home_action", true))
	 {return ((String) Debug.delegate(ba, "home_action", new Object[] {_ta,_stage}));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Private Sub Home_Action (TA As TurtleAction, Stage";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="State.Degree = 0";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/  = (float) (0);
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="State.UserX = mWidth / 2";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserX /*float*/  = (float) (__ref._mwidth /*int*/ /(double)2);
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="State.UserY = mHeight / 2";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserY /*float*/  = (float) (__ref._mheight /*int*/ /(double)2);
 };
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xturtle  _drawbitmap(b4j.example.b4xturtle __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "drawbitmap", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "drawbitmap", new Object[] {_bmp}));}
b4j.example.b4xturtle._turtleaction _ta = null;
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub DrawBitmap (Bmp As B4XBitmap) As B4XTur";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
_ta = __ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (0),"DrawBitmap_Action");
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="ta.Extra = Array(Bmp)";
_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_bmp.getObject())});
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Return AddAction(ta)";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,_ta);
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="End Sub";
return null;
}
public String  _drawbitmap_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "drawbitmap_action", true))
	 {return ((String) Debug.delegate(ba, "drawbitmap_action", new Object[] {_ta,_stage}));}
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _dest = null;
float _width = 0f;
float _height = 0f;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub DrawBitmap_Action (ta As TurtleAction,";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Dim cvs As B4XCanvas = GetLayer";
_cvs = __ref._getlayer /*anywheresoftware.b4a.objects.B4XCanvas*/ (null);
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Dim bmp As B4XBitmap = ta.Extra.Get(0)";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="Dim dest As B4XRect";
_dest = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="Dim width As Float = bmp.Width";
_width = (float) (_bmp.getWidth());
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="Dim height As Float = bmp.Height";
_height = (float) (_bmp.getHeight());
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="dest.Initialize(UserToCanvas(State.UserX - width";
_dest.Initialize(__ref._usertocanvas /*float*/ (null,(float) (__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserX /*float*/ -_width/(double)2)),__ref._usertocanvas /*float*/ (null,(float) (__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserY /*float*/ -_height/(double)2)),(float) (0),(float) (0));
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="dest.Width = UserToCanvas(width)";
_dest.setWidth((int) (__ref._usertocanvas /*float*/ (null,_width)));
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="dest.Height = UserToCanvas(height)";
_dest.setHeight(__ref._usertocanvas /*float*/ (null,_height));
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="cvs.DrawBitmapRotated(bmp, dest, State.Degree)";
_cvs.DrawBitmapRotated((javafx.scene.image.Image)(_bmp.getObject()),_dest,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/ );
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="RefreshMain";
__ref._refreshmain /*String*/ (null);
 };
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="End Sub";
return "";
}
public String  _drawpolygon(b4j.example.b4xturtle __ref,anywheresoftware.b4a.objects.B4XCanvas _cvs1,anywheresoftware.b4a.objects.collections.List _points,int _color,boolean _filled,double _strokewidth) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "drawpolygon", true))
	 {return ((String) Debug.delegate(ba, "drawpolygon", new Object[] {_cvs1,_points,_color,_filled,_strokewidth}));}
anywheresoftware.b4j.object.JavaObject _jcvs = null;
double[] _xpoints = null;
double[] _ypoints = null;
int _i = 0;
float[] _point = null;
Object _paint = null;
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Private Sub DrawPolygon (cvs1 As B4XCanvas, Points";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="If Points.Size < 1 Then Return";
if (_points.getSize()<1) { 
if (true) return "";};
RDebugUtils.currentLine=6160396;
 //BA.debugLineNum = 6160396;BA.debugLine="Dim jcvs As JavaObject = cvs1";
_jcvs = new anywheresoftware.b4j.object.JavaObject();
_jcvs = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_cvs1));
RDebugUtils.currentLine=6160397;
 //BA.debugLineNum = 6160397;BA.debugLine="jcvs = jcvs.GetFieldJO(\"cvs\").RunMethodJO(\"getObj";
_jcvs = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jcvs.GetFieldJO("cvs").RunMethodJO("getObject",(Object[])(__c.Null)).RunMethod("getGraphicsContext2D",(Object[])(__c.Null))));
RDebugUtils.currentLine=6160398;
 //BA.debugLineNum = 6160398;BA.debugLine="jcvs.RunMethod(\"save\", Null)";
_jcvs.RunMethod("save",(Object[])(__c.Null));
RDebugUtils.currentLine=6160399;
 //BA.debugLineNum = 6160399;BA.debugLine="Dim xpoints(Points.Size), ypoints(Points.Size) As";
_xpoints = new double[_points.getSize()];
;
_ypoints = new double[_points.getSize()];
;
RDebugUtils.currentLine=6160400;
 //BA.debugLineNum = 6160400;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=6160401;
 //BA.debugLineNum = 6160401;BA.debugLine="Dim point() As Float = Points.Get(i)";
_point = (float[])(_points.Get(_i));
RDebugUtils.currentLine=6160402;
 //BA.debugLineNum = 6160402;BA.debugLine="xpoints(i) = point(0)";
_xpoints[_i] = _point[(int) (0)];
RDebugUtils.currentLine=6160403;
 //BA.debugLineNum = 6160403;BA.debugLine="ypoints(i) = point(1)";
_ypoints[_i] = _point[(int) (1)];
 }
};
RDebugUtils.currentLine=6160405;
 //BA.debugLineNum = 6160405;BA.debugLine="Dim paint As Object = fx.Colors.From32Bit(Color)";
_paint = (Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(_color));
RDebugUtils.currentLine=6160406;
 //BA.debugLineNum = 6160406;BA.debugLine="If Filled Then";
if (_filled) { 
RDebugUtils.currentLine=6160407;
 //BA.debugLineNum = 6160407;BA.debugLine="jcvs.RunMethod(\"setFill\", Array(paint))";
_jcvs.RunMethod("setFill",new Object[]{_paint});
RDebugUtils.currentLine=6160408;
 //BA.debugLineNum = 6160408;BA.debugLine="jcvs.RunMethod(\"fillPolygon\", Array(xpoints, ypo";
_jcvs.RunMethod("fillPolygon",new Object[]{(Object)(_xpoints),(Object)(_ypoints),(Object)(_points.getSize())});
 }else {
RDebugUtils.currentLine=6160410;
 //BA.debugLineNum = 6160410;BA.debugLine="jcvs.RunMethod(\"setStroke\", Array(paint))";
_jcvs.RunMethod("setStroke",new Object[]{_paint});
RDebugUtils.currentLine=6160411;
 //BA.debugLineNum = 6160411;BA.debugLine="jcvs.RunMethod(\"setLineWidth\", Array(StrokeWidth";
_jcvs.RunMethod("setLineWidth",new Object[]{(Object)(_strokewidth)});
RDebugUtils.currentLine=6160412;
 //BA.debugLineNum = 6160412;BA.debugLine="jcvs.RunMethod(\"strokePolygon\", Array(xpoints, y";
_jcvs.RunMethod("strokePolygon",new Object[]{(Object)(_xpoints),(Object)(_ypoints),(Object)(_points.getSize())});
 };
RDebugUtils.currentLine=6160414;
 //BA.debugLineNum = 6160414;BA.debugLine="jcvs.RunMethod(\"restore\", Null)";
_jcvs.RunMethod("restore",(Object[])(__c.Null));
RDebugUtils.currentLine=6160416;
 //BA.debugLineNum = 6160416;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xturtle  _drawtext(b4j.example.b4xturtle __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "drawtext", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "drawtext", new Object[] {_text}));}
b4j.example.b4xturtle._turtleaction _ta = null;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Public Sub DrawText (Text As String) As B4XTurtle";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
_ta = __ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (0),"DrawText_Action");
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="ta.Extra = Array(Text)";
_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_text)});
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="Return AddAction(ta)";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,_ta);
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="End Sub";
return null;
}
public String  _drawtext_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "drawtext_action", true))
	 {return ((String) Debug.delegate(ba, "drawtext_action", new Object[] {_ta,_stage}));}
String _text = "";
anywheresoftware.b4a.objects.B4XCanvas _layer = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Private Sub DrawText_Action (TA As TurtleAction, S";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Dim text As String = TA.Extra.Get(0)";
_text = BA.ObjectToString(_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="Dim layer As B4XCanvas = GetLayer";
_layer = __ref._getlayer /*anywheresoftware.b4a.objects.B4XCanvas*/ (null);
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="Dim r As B4XRect = layer.MeasureText(text, State";
_r = _layer.MeasureText(_text,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="Dim BaseLine As Int = UserToCanvas(State.UserY)";
_baseline = (int) (__ref._usertocanvas /*float*/ (null,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserY /*float*/ )-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="layer.DrawText(text, UserToCanvas(State.UserX),";
_layer.DrawText(_text,__ref._usertocanvas /*float*/ (null,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserX /*float*/ ),_baseline,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .PenColor /*int*/ ,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Alignment /*String*/ ));
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="RefreshMain";
__ref._refreshmain /*String*/ (null);
 };
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xturtle  _fill(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "fill", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "fill", null));}
b4j.example.b4xturtle._turtleaction _ta = null;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Public Sub Fill As B4XTurtle";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
_ta = __ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (0),"Fill_Action");
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Return AddAction(ta)";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,_ta);
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="End Sub";
return null;
}
public String  _fill_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "fill_action", true))
	 {return ((String) Debug.delegate(ba, "fill_action", new Object[] {_ta,_stage}));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Private Sub Fill_Action (TA As TurtleAction, Stage";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="FloodFill (State.UserX, State.UserY, State.PenCo";
__ref._floodfill /*String*/ (null,(int) (__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserX /*float*/ ),(int) (__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserY /*float*/ ),__ref._state /*b4j.example.b4xturtle._turtlestate*/ .PenColor /*int*/ );
 };
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="End Sub";
return "";
}
public String  _floodfill(b4j.example.b4xturtle __ref,int _x,int _y,int _replacementcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "floodfill", true))
	 {return ((String) Debug.delegate(ba, "floodfill", new Object[] {_x,_y,_replacementcolor}));}
anywheresoftware.b4a.objects.B4XCanvas _layer = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.collections.List _xx = null;
anywheresoftware.b4a.objects.collections.List _yy = null;
b4j.example.bitmapcreator._premultipliedcolor _tpm = null;
b4j.example.bitmapcreator._premultipliedcolor _rpm = null;
b4j.example.bitmapcreator._argbcolor _argb = null;
byte _r = (byte)0;
byte _g = (byte)0;
byte _b = (byte)0;
byte _a = (byte)0;
int _nx = 0;
int _ny = 0;
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Private Sub FloodFill (X As Int, Y As Int, Replace";
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="If FloodBC.IsInitialized = False Or FloodBC.mWidt";
if (__ref._floodbc /*b4j.example.bitmapcreator*/ .IsInitialized()==__c.False || __ref._floodbc /*b4j.example.bitmapcreator*/ ._mwidth!=__ref._mwidth /*int*/  || __ref._floodbc /*b4j.example.bitmapcreator*/ ._mheight!=__ref._mheight /*int*/ ) { 
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="FloodBC.Initialize(mWidth, mHeight)";
__ref._floodbc /*b4j.example.bitmapcreator*/ ._initialize(ba,__ref._mwidth /*int*/ ,__ref._mheight /*int*/ );
 };
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="Dim layer As B4XCanvas = GetLayer";
_layer = __ref._getlayer /*anywheresoftware.b4a.objects.B4XCanvas*/ (null);
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="Dim bmp As B4XBitmap = layer.CreateBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _layer.CreateBitmap();
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="FloodBC.CopyPixelsFromBitmap(bmp)";
__ref._floodbc /*b4j.example.bitmapcreator*/ ._copypixelsfrombitmap(_bmp);
RDebugUtils.currentLine=5373960;
 //BA.debugLineNum = 5373960;BA.debugLine="Dim xx As List";
_xx = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5373961;
 //BA.debugLineNum = 5373961;BA.debugLine="xx.Initialize";
_xx.Initialize();
RDebugUtils.currentLine=5373962;
 //BA.debugLineNum = 5373962;BA.debugLine="Dim yy As List";
_yy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5373963;
 //BA.debugLineNum = 5373963;BA.debugLine="yy.Initialize";
_yy.Initialize();
RDebugUtils.currentLine=5373964;
 //BA.debugLineNum = 5373964;BA.debugLine="Dim tpm, rpm As PremultipliedColor";
_tpm = new b4j.example.bitmapcreator._premultipliedcolor();
_rpm = new b4j.example.bitmapcreator._premultipliedcolor();
RDebugUtils.currentLine=5373965;
 //BA.debugLineNum = 5373965;BA.debugLine="Dim argb As ARGBColor";
_argb = new b4j.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=5373966;
 //BA.debugLineNum = 5373966;BA.debugLine="FloodBC.GetPremultipliedColor(X, Y, tpm)";
__ref._floodbc /*b4j.example.bitmapcreator*/ ._getpremultipliedcolor(_x,_y,_tpm);
RDebugUtils.currentLine=5373967;
 //BA.debugLineNum = 5373967;BA.debugLine="FloodBC.ARGBToPremultipliedColor(FloodBC.ColorToA";
__ref._floodbc /*b4j.example.bitmapcreator*/ ._argbtopremultipliedcolor(__ref._floodbc /*b4j.example.bitmapcreator*/ ._colortoargb(_replacementcolor,_argb),_rpm);
RDebugUtils.currentLine=5373968;
 //BA.debugLineNum = 5373968;BA.debugLine="Dim r = rpm.r, g = rpm.g, b = rpm.b, a = rpm.a As";
_r = (byte) (_rpm.r);
_g = (byte) (_rpm.g);
_b = (byte) (_rpm.b);
_a = (byte) (_rpm.a);
RDebugUtils.currentLine=5373969;
 //BA.debugLineNum = 5373969;BA.debugLine="rpm.r = r";
_rpm.r = (int) (_r);
RDebugUtils.currentLine=5373970;
 //BA.debugLineNum = 5373970;BA.debugLine="rpm.g = g";
_rpm.g = (int) (_g);
RDebugUtils.currentLine=5373971;
 //BA.debugLineNum = 5373971;BA.debugLine="rpm.b = b";
_rpm.b = (int) (_b);
RDebugUtils.currentLine=5373972;
 //BA.debugLineNum = 5373972;BA.debugLine="rpm.a = a";
_rpm.a = (int) (_a);
RDebugUtils.currentLine=5373973;
 //BA.debugLineNum = 5373973;BA.debugLine="If ColorsEqual(rpm, tpm) Then Return";
if (__ref._colorsequal /*boolean*/ (null,_rpm,_tpm)) { 
if (true) return "";};
RDebugUtils.currentLine=5373974;
 //BA.debugLineNum = 5373974;BA.debugLine="SetAndAddToQueue(X, Y, xx, yy, tpm, rpm)";
__ref._setandaddtoqueue /*String*/ (null,_x,_y,_xx,_yy,_tpm,_rpm);
RDebugUtils.currentLine=5373975;
 //BA.debugLineNum = 5373975;BA.debugLine="Do While xx.Size > 0";
while (_xx.getSize()>0) {
RDebugUtils.currentLine=5373976;
 //BA.debugLineNum = 5373976;BA.debugLine="Dim nx As Int = xx.Get(0)";
_nx = (int)(BA.ObjectToNumber(_xx.Get((int) (0))));
RDebugUtils.currentLine=5373977;
 //BA.debugLineNum = 5373977;BA.debugLine="Dim ny As Int = yy.Get(0)";
_ny = (int)(BA.ObjectToNumber(_yy.Get((int) (0))));
RDebugUtils.currentLine=5373978;
 //BA.debugLineNum = 5373978;BA.debugLine="xx.RemoveAt(0)";
_xx.RemoveAt((int) (0));
RDebugUtils.currentLine=5373979;
 //BA.debugLineNum = 5373979;BA.debugLine="yy.RemoveAt(0)";
_yy.RemoveAt((int) (0));
RDebugUtils.currentLine=5373980;
 //BA.debugLineNum = 5373980;BA.debugLine="SetAndAddToQueue(nx, ny + 1, xx, yy, tpm, rpm)";
__ref._setandaddtoqueue /*String*/ (null,_nx,(int) (_ny+1),_xx,_yy,_tpm,_rpm);
RDebugUtils.currentLine=5373981;
 //BA.debugLineNum = 5373981;BA.debugLine="SetAndAddToQueue(nx, ny - 1, xx, yy, tpm, rpm)";
__ref._setandaddtoqueue /*String*/ (null,_nx,(int) (_ny-1),_xx,_yy,_tpm,_rpm);
RDebugUtils.currentLine=5373982;
 //BA.debugLineNum = 5373982;BA.debugLine="SetAndAddToQueue(nx + 1, ny, xx, yy, tpm, rpm)";
__ref._setandaddtoqueue /*String*/ (null,(int) (_nx+1),_ny,_xx,_yy,_tpm,_rpm);
RDebugUtils.currentLine=5373983;
 //BA.debugLineNum = 5373983;BA.debugLine="SetAndAddToQueue(nx - 1, ny, xx, yy, tpm, rpm)";
__ref._setandaddtoqueue /*String*/ (null,(int) (_nx-1),_ny,_xx,_yy,_tpm,_rpm);
 }
;
RDebugUtils.currentLine=5373985;
 //BA.debugLineNum = 5373985;BA.debugLine="layer.ClearRect(layer.TargetRect)";
_layer.ClearRect(_layer.getTargetRect());
RDebugUtils.currentLine=5373986;
 //BA.debugLineNum = 5373986;BA.debugLine="layer.DrawBitmap(FloodBC.Bitmap, layer.TargetRect";
_layer.DrawBitmap((javafx.scene.image.Image)(__ref._floodbc /*b4j.example.bitmapcreator*/ ._getbitmap().getObject()),_layer.getTargetRect());
RDebugUtils.currentLine=5373987;
 //BA.debugLineNum = 5373987;BA.debugLine="layer.Invalidate";
_layer.Invalidate();
RDebugUtils.currentLine=5373988;
 //BA.debugLineNum = 5373988;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xturtle  _fillpolygon(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "fillpolygon", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "fillpolygon", null));}
b4j.example.b4xturtle._turtleaction _ta = null;
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Public Sub FillPolygon As B4XTurtle";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
_ta = __ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (0),"FillPolygon_Action");
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="Return AddAction(ta)";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,_ta);
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="End Sub";
return null;
}
public String  _fillpolygon_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "fillpolygon_action", true))
	 {return ((String) Debug.delegate(ba, "fillpolygon_action", new Object[] {_ta,_stage}));}
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Private Sub FillPolygon_Action (TA As TurtleAction";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="State.TrackPolygon = False";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .TrackPolygon /*boolean*/  = __c.False;
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="DrawPolygon(GetLayer, State.PolygonPoints, State";
__ref._drawpolygon /*String*/ (null,__ref._getlayer /*anywheresoftware.b4a.objects.B4XCanvas*/ (null),__ref._state /*b4j.example.b4xturtle._turtlestate*/ .PolygonPoints /*anywheresoftware.b4a.objects.collections.List*/ ,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .PenColor /*int*/ ,__c.True,0);
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="RefreshMain";
__ref._refreshmain /*String*/ (null);
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="State.PolygonPoints.Clear";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .PolygonPoints /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
 };
RDebugUtils.currentLine=5963783;
 //BA.debugLineNum = 5963783;BA.debugLine="End Sub";
return "";
}
public String  _setandaddtoqueue(b4j.example.b4xturtle __ref,int _x,int _y,anywheresoftware.b4a.objects.collections.List _xx,anywheresoftware.b4a.objects.collections.List _yy,b4j.example.bitmapcreator._premultipliedcolor _tpm,b4j.example.bitmapcreator._premultipliedcolor _rpm) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "setandaddtoqueue", true))
	 {return ((String) Debug.delegate(ba, "setandaddtoqueue", new Object[] {_x,_y,_xx,_yy,_tpm,_rpm}));}
b4j.example.bitmapcreator._premultipliedcolor _temp = null;
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Private Sub SetAndAddToQueue (x As Int, y As Int,";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="If x < 0 Or x >= FloodBC.mWidth Or y < 0 Or y >=";
if (_x<0 || _x>=__ref._floodbc /*b4j.example.bitmapcreator*/ ._mwidth || _y<0 || _y>=__ref._floodbc /*b4j.example.bitmapcreator*/ ._mheight) { 
if (true) return "";};
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Dim temp As PremultipliedColor";
_temp = new b4j.example.bitmapcreator._premultipliedcolor();
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="If ColorsEqual(FloodBC.GetPremultipliedColor(x, y";
if (__ref._colorsequal /*boolean*/ (null,__ref._floodbc /*b4j.example.bitmapcreator*/ ._getpremultipliedcolor(_x,_y,_temp),_tpm)) { 
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="FloodBC.SetPremultipliedColor(x, y, rpm)";
__ref._floodbc /*b4j.example.bitmapcreator*/ ._setpremultipliedcolor(_x,_y,_rpm);
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="xx.Add(x)";
_xx.Add((Object)(_x));
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="yy.Add(y)";
_yy.Add((Object)(_y));
 };
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="End Sub";
return "";
}
public String  _forward_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "forward_action", true))
	 {return ((String) Debug.delegate(ba, "forward_action", new Object[] {_ta,_stage}));}
float _destx = 0f;
float _desty = 0f;
boolean _newactionsadded = false;
float _f = 0f;
float _f2 = 0f;
int _i = 0;
b4j.example.b4xturtle._turtleaction _t = null;
float _startx = 0f;
float _starty = 0f;
float _stagefixed = 0f;
float _x = 0f;
float _y = 0f;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub Forward_Action (TA As TurtleAction, St";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="If Stage = 0 Then";
if (_stage==0) { 
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="TA.Extra = Array(State.UserX, State.UserY)";
_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserX /*float*/ ),(Object)(__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserY /*float*/ )});
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Dim DestX As Float = State.UserX + CosD(State.De";
_destx = (float) (__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserX /*float*/ +__c.CosD(__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/ )*_ta.Param1 /*float*/ );
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Dim DestY As Float = State.UserY + SinD(State.De";
_desty = (float) (__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserY /*float*/ +__c.SinD(__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/ )*_ta.Param1 /*float*/ );
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="Dim NewActionsAdded As Boolean";
_newactionsadded = false;
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="Dim f As Float";
_f = 0f;
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="If DestX >= mWidth Then";
if (_destx>=__ref._mwidth /*int*/ ) { 
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="f = 1 - (DestX - mWidth) / (DestX - State.UserX";
_f = (float) (1-(_destx-__ref._mwidth /*int*/ )/(double)(_destx-__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserX /*float*/ ));
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="SetPosition(0, -1)";
__ref._setposition /*b4j.example.b4xturtle*/ (null,(float) (0),(float) (-1));
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="NewActionsAdded = True";
_newactionsadded = __c.True;
 }else 
{RDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="Else if DestX < 0 Then";
if (_destx<0) { 
RDebugUtils.currentLine=2555916;
 //BA.debugLineNum = 2555916;BA.debugLine="f = 1 - (-DestX) / (State.UserX - DestX)";
_f = (float) (1-(-_destx)/(double)(__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserX /*float*/ -_destx));
RDebugUtils.currentLine=2555917;
 //BA.debugLineNum = 2555917;BA.debugLine="SetPosition(mWidth, -1)";
__ref._setposition /*b4j.example.b4xturtle*/ (null,(float) (__ref._mwidth /*int*/ ),(float) (-1));
RDebugUtils.currentLine=2555918;
 //BA.debugLineNum = 2555918;BA.debugLine="NewActionsAdded = True";
_newactionsadded = __c.True;
 }}
;
RDebugUtils.currentLine=2555920;
 //BA.debugLineNum = 2555920;BA.debugLine="If DestY >= mHeight Then";
if (_desty>=__ref._mheight /*int*/ ) { 
RDebugUtils.currentLine=2555921;
 //BA.debugLineNum = 2555921;BA.debugLine="Dim f2 As Float = 1 - (DestY - mHeight) / (Dest";
_f2 = (float) (1-(_desty-__ref._mheight /*int*/ )/(double)(_desty-__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserY /*float*/ ));
RDebugUtils.currentLine=2555922;
 //BA.debugLineNum = 2555922;BA.debugLine="If NewActionsAdded And f2 < f Then";
if (_newactionsadded && _f2<_f) { 
RDebugUtils.currentLine=2555923;
 //BA.debugLineNum = 2555923;BA.debugLine="f = f2";
_f = _f2;
RDebugUtils.currentLine=2555924;
 //BA.debugLineNum = 2555924;BA.debugLine="Queue.RemoveAt(Queue.Size - 1)";
__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=2555925;
 //BA.debugLineNum = 2555925;BA.debugLine="SetPosition(-1, 0)";
__ref._setposition /*b4j.example.b4xturtle*/ (null,(float) (-1),(float) (0));
RDebugUtils.currentLine=2555926;
 //BA.debugLineNum = 2555926;BA.debugLine="NewActionsAdded = True";
_newactionsadded = __c.True;
 }else 
{RDebugUtils.currentLine=2555927;
 //BA.debugLineNum = 2555927;BA.debugLine="Else If NewActionsAdded = False Then";
if (_newactionsadded==__c.False) { 
RDebugUtils.currentLine=2555928;
 //BA.debugLineNum = 2555928;BA.debugLine="f = f2";
_f = _f2;
RDebugUtils.currentLine=2555929;
 //BA.debugLineNum = 2555929;BA.debugLine="SetPosition(-1, 0)";
__ref._setposition /*b4j.example.b4xturtle*/ (null,(float) (-1),(float) (0));
RDebugUtils.currentLine=2555930;
 //BA.debugLineNum = 2555930;BA.debugLine="NewActionsAdded = True";
_newactionsadded = __c.True;
 }}
;
 }else 
{RDebugUtils.currentLine=2555932;
 //BA.debugLineNum = 2555932;BA.debugLine="Else If DestY < 0 Then";
if (_desty<0) { 
RDebugUtils.currentLine=2555933;
 //BA.debugLineNum = 2555933;BA.debugLine="Dim f2 As Float = 1 - (-DestY) / (State.UserY -";
_f2 = (float) (1-(-_desty)/(double)(__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserY /*float*/ -_desty));
RDebugUtils.currentLine=2555934;
 //BA.debugLineNum = 2555934;BA.debugLine="If NewActionsAdded And f2 < f Then";
if (_newactionsadded && _f2<_f) { 
RDebugUtils.currentLine=2555935;
 //BA.debugLineNum = 2555935;BA.debugLine="f = f2";
_f = _f2;
RDebugUtils.currentLine=2555936;
 //BA.debugLineNum = 2555936;BA.debugLine="Queue.RemoveAt(Queue.Size - 1)";
__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=2555937;
 //BA.debugLineNum = 2555937;BA.debugLine="SetPosition(-1, mHeight)";
__ref._setposition /*b4j.example.b4xturtle*/ (null,(float) (-1),(float) (__ref._mheight /*int*/ ));
RDebugUtils.currentLine=2555938;
 //BA.debugLineNum = 2555938;BA.debugLine="NewActionsAdded = True";
_newactionsadded = __c.True;
 }else 
{RDebugUtils.currentLine=2555939;
 //BA.debugLineNum = 2555939;BA.debugLine="Else If NewActionsAdded = False Then";
if (_newactionsadded==__c.False) { 
RDebugUtils.currentLine=2555940;
 //BA.debugLineNum = 2555940;BA.debugLine="f = f2";
_f = _f2;
RDebugUtils.currentLine=2555941;
 //BA.debugLineNum = 2555941;BA.debugLine="SetPosition(-1, mHeight)";
__ref._setposition /*b4j.example.b4xturtle*/ (null,(float) (-1),(float) (__ref._mheight /*int*/ ));
RDebugUtils.currentLine=2555942;
 //BA.debugLineNum = 2555942;BA.debugLine="NewActionsAdded = True";
_newactionsadded = __c.True;
 }}
;
 }}
;
RDebugUtils.currentLine=2555945;
 //BA.debugLineNum = 2555945;BA.debugLine="If NewActionsAdded Then";
if (_newactionsadded) { 
RDebugUtils.currentLine=2555946;
 //BA.debugLineNum = 2555946;BA.debugLine="If f = 0 Then f = 0.0001";
if (_f==0) { 
_f = (float) (0.0001);};
RDebugUtils.currentLine=2555947;
 //BA.debugLineNum = 2555947;BA.debugLine="TA.Duration = TA.Duration * f";
_ta.Duration /*int*/  = (int) (_ta.Duration /*int*/ *_f);
RDebugUtils.currentLine=2555948;
 //BA.debugLineNum = 2555948;BA.debugLine="TA.Param1 = TA.Param1 * f";
_ta.Param1 /*float*/  = (float) (_ta.Param1 /*float*/ *_f);
RDebugUtils.currentLine=2555949;
 //BA.debugLineNum = 2555949;BA.debugLine="MoveForward((1 - f) * TA.Param1 / f)";
__ref._moveforward /*b4j.example.b4xturtle*/ (null,(float) ((1-_f)*_ta.Param1 /*float*/ /(double)_f));
RDebugUtils.currentLine=2555950;
 //BA.debugLineNum = 2555950;BA.debugLine="For i = 1 To 2";
{
final int step46 = 1;
final int limit46 = (int) (2);
_i = (int) (1) ;
for (;_i <= limit46 ;_i = _i + step46 ) {
RDebugUtils.currentLine=2555951;
 //BA.debugLineNum = 2555951;BA.debugLine="Dim t As TurtleAction = Queue.Get(Queue.Size -";
_t = (b4j.example.b4xturtle._turtleaction)(__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-3+_i)));
RDebugUtils.currentLine=2555952;
 //BA.debugLineNum = 2555952;BA.debugLine="Queue.RemoveAt(Queue.Size - 3 + i)";
__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-3+_i));
RDebugUtils.currentLine=2555953;
 //BA.debugLineNum = 2555953;BA.debugLine="Queue.InsertAt(i, t)";
__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_i,(Object)(_t));
 }
};
 };
RDebugUtils.currentLine=2555956;
 //BA.debugLineNum = 2555956;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2555958;
 //BA.debugLineNum = 2555958;BA.debugLine="Dim StartX As Float = TA.Extra.Get(0)";
_startx = (float)(BA.ObjectToNumber(_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
RDebugUtils.currentLine=2555959;
 //BA.debugLineNum = 2555959;BA.debugLine="Dim StartY As Float = TA.Extra.Get(1)";
_starty = (float)(BA.ObjectToNumber(_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1))));
RDebugUtils.currentLine=2555960;
 //BA.debugLineNum = 2555960;BA.debugLine="Dim StageFixed As Float = Min(1, Stage + 0.01)";
_stagefixed = (float) (__c.Min(1,_stage+0.01));
RDebugUtils.currentLine=2555961;
 //BA.debugLineNum = 2555961;BA.debugLine="Dim X As Float = StartX + CosD(State.Degree) * TA";
_x = (float) (_startx+__c.CosD(__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/ )*_ta.Param1 /*float*/ *_stagefixed);
RDebugUtils.currentLine=2555962;
 //BA.debugLineNum = 2555962;BA.debugLine="Dim Y As Float = StartY + SinD(State.Degree) * TA";
_y = (float) (_starty+__c.SinD(__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/ )*_ta.Param1 /*float*/ *_stagefixed);
RDebugUtils.currentLine=2555963;
 //BA.debugLineNum = 2555963;BA.debugLine="If State.PenDown Then";
if (__ref._state /*b4j.example.b4xturtle._turtlestate*/ .PenDown /*boolean*/ ) { 
RDebugUtils.currentLine=2555964;
 //BA.debugLineNum = 2555964;BA.debugLine="GetLayer.DrawLine(UserToCanvas(State.UserX), Use";
__ref._getlayer /*anywheresoftware.b4a.objects.B4XCanvas*/ (null).DrawLine(__ref._usertocanvas /*float*/ (null,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserX /*float*/ ),__ref._usertocanvas /*float*/ (null,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserY /*float*/ ),__ref._usertocanvas /*float*/ (null,_x),__ref._usertocanvas /*float*/ (null,_y),__ref._state /*b4j.example.b4xturtle._turtlestate*/ .PenColor /*int*/ ,__ref._usertocanvas /*float*/ (null,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .PenThickness /*float*/ ));
 };
RDebugUtils.currentLine=2555966;
 //BA.debugLineNum = 2555966;BA.debugLine="If State.TrackPolygon Then";
if (__ref._state /*b4j.example.b4xturtle._turtlestate*/ .TrackPolygon /*boolean*/ ) { 
RDebugUtils.currentLine=2555967;
 //BA.debugLineNum = 2555967;BA.debugLine="State.PolygonPoints.Add(Array As Float(UserToCan";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .PolygonPoints /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new float[]{__ref._usertocanvas /*float*/ (null,_x),__ref._usertocanvas /*float*/ (null,_y)}));
 };
RDebugUtils.currentLine=2555969;
 //BA.debugLineNum = 2555969;BA.debugLine="State.UserX = StartX + CosD(State.Degree) * TA.Pa";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserX /*float*/  = (float) (_startx+__c.CosD(__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/ )*_ta.Param1 /*float*/ *_stage);
RDebugUtils.currentLine=2555970;
 //BA.debugLineNum = 2555970;BA.debugLine="State.UserY = StartY + SinD(State.Degree) * TA.Pa";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserY /*float*/  = (float) (_starty+__c.SinD(__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/ )*_ta.Param1 /*float*/ *_stage);
RDebugUtils.currentLine=2555971;
 //BA.debugLineNum = 2555971;BA.debugLine="DrawTurtle";
__ref._drawturtle /*void*/ (null);
RDebugUtils.currentLine=2555972;
 //BA.debugLineNum = 2555972;BA.debugLine="RefreshMain";
__ref._refreshmain /*String*/ (null);
RDebugUtils.currentLine=2555973;
 //BA.debugLineNum = 2555973;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xturtle  _setposition(b4j.example.b4xturtle __ref,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "setposition", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "setposition", new Object[] {_x,_y}));}
b4j.example.b4xturtle._turtleaction _ta = null;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Private Sub SetPosition (X As Float, Y As Float) A";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
_ta = __ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (0),"SetPosition_Action");
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="ta.Extra = Array(X, Y)";
_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_x),(Object)(_y)});
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="Return AddAction(ta)";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,_ta);
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="End Sub";
return null;
}
public float  _getangle(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "getangle", true))
	 {return ((Float) Debug.delegate(ba, "getangle", null));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Public Sub GetAngle As Float";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Return State.Degree";
if (true) return __ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/ ;
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="End Sub";
return 0f;
}
public int  _getcurrentlayer(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "getcurrentlayer", true))
	 {return ((Integer) Debug.delegate(ba, "getcurrentlayer", null));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Public Sub GetCurrentLayer As Int";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Return State.CanvasLayer";
if (true) return __ref._state /*b4j.example.b4xturtle._turtlestate*/ .CanvasLayer /*int*/ ;
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="End Sub";
return 0;
}
public int  _getheight(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "getheight", true))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Return mHeight";
if (true) return __ref._mheight /*int*/ ;
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="End Sub";
return 0;
}
public boolean  _getismoving(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "getismoving", true))
	 {return ((Boolean) Debug.delegate(ba, "getismoving", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub getIsMoving As Boolean";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Return Queue.Size > 0";
if (true) return __ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0;
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return false;
}
public int  _getpencolor(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "getpencolor", true))
	 {return ((Integer) Debug.delegate(ba, "getpencolor", null));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub GetPenColor As Int";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Return State.PenColor";
if (true) return __ref._state /*b4j.example.b4xturtle._turtlestate*/ .PenColor /*int*/ ;
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return 0;
}
public int  _getwidth(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "getwidth", true))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Return mWidth";
if (true) return __ref._mwidth /*int*/ ;
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="End Sub";
return 0;
}
public float  _getx(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "getx", true))
	 {return ((Float) Debug.delegate(ba, "getx", null));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub GetX As Float";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Return State.UserX";
if (true) return __ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserX /*float*/ ;
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="End Sub";
return 0f;
}
public float  _gety(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "gety", true))
	 {return ((Float) Debug.delegate(ba, "gety", null));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Public Sub GetY As Float";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Return State.UserY";
if (true) return __ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserY /*float*/ ;
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="End Sub";
return 0f;
}
public String  _initialize(b4j.example.b4xturtle __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="Queue.Initialize";
__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="MainTimer.Initialize(\"MainTimer\", TimerInterval)";
__ref._maintimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"MainTimer",(long) (__ref._timerinterval /*int*/ ));
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="State = CreateTurtleState(100, 100, 0, True, xui.";
__ref._state /*b4j.example.b4xturtle._turtlestate*/  = __ref._createturtlestate /*b4j.example.b4xturtle._turtlestate*/ (null,(float) (100),(float) (100),(float) (0),__c.True,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black,(float) (2),(float) (1),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20)),"CENTER",__c.True,__c.False,(int) (0));
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="StatesStack.Initialize";
__ref._statesstack /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="Layers.Initialize";
__ref._layers /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=327691;
 //BA.debugLineNum = 327691;BA.debugLine="End Sub";
return "";
}
public String  _maintimer_tick(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "maintimer_tick", true))
	 {return ((String) Debug.delegate(ba, "maintimer_tick", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub MainTimer_Tick";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="ActionsLoop";
__ref._actionsloop /*String*/ (null);
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xturtle  _movebackward(b4j.example.b4xturtle __ref,float _distance) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "movebackward", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "movebackward", new Object[] {_distance}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub MoveBackward (Distance As Float) As B4X";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Return MoveForward(-Distance)";
if (true) return __ref._moveforward /*b4j.example.b4xturtle*/ (null,(float) (-_distance));
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _moveto(b4j.example.b4xturtle __ref,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "moveto", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "moveto", new Object[] {_x,_y}));}
b4j.example.b4xturtle._turtleaction _ta = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub MoveTo(X As Float, Y As Float) As B4XTu";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
_ta = __ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (0),"MoveTo_Action");
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="ta.Extra = Array(X, Y)";
_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_x),(Object)(_y)});
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="Return AddAction(ta)";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,_ta);
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="End Sub";
return null;
}
public String  _moveto_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "moveto_action", true))
	 {return ((String) Debug.delegate(ba, "moveto_action", new Object[] {_ta,_stage}));}
float _dx = 0f;
float _dy = 0f;
float _newdegree = 0f;
float _d2 = 0f;
float _delta = 0f;
int _i = 0;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub MoveTo_Action (TA As TurtleAction, Sta";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Dim dx As Float = TA.Extra.Get(0) - State.UserX";
_dx = (float) ((double)(BA.ObjectToNumber(_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))))-__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserX /*float*/ );
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Dim dy As Float = TA.Extra.Get(1) - State.UserY";
_dy = (float) ((double)(BA.ObjectToNumber(_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1))))-__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserY /*float*/ );
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="Dim NewDegree As Float = ATan2D(dy, dx)";
_newdegree = (float) (__c.ATan2D(_dy,_dx));
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="Dim d2 As Float = State.Degree";
_d2 = __ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/ ;
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="If NewDegree < d2 Then NewDegree = NewDegree + 3";
if (_newdegree<_d2) { 
_newdegree = (float) (_newdegree+360);};
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="Dim delta As Float = NewDegree - d2";
_delta = (float) (_newdegree-_d2);
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="If delta >= 180 Then delta = delta - 360";
if (_delta>=180) { 
_delta = (float) (_delta-360);};
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="TurnRight(delta)";
__ref._turnright /*b4j.example.b4xturtle*/ (null,_delta);
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="MoveForward(Sqrt(Power(dy, 2) + Power(dx, 2)))";
__ref._moveforward /*b4j.example.b4xturtle*/ (null,(float) (__c.Sqrt(__c.Power(_dy,2)+__c.Power(_dx,2))));
RDebugUtils.currentLine=2949131;
 //BA.debugLineNum = 2949131;BA.debugLine="For i = 1 To 2";
{
final int step11 = 1;
final int limit11 = (int) (2);
_i = (int) (1) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="Dim TA As TurtleAction = Queue.Get(Queue.Size -";
_ta = (b4j.example.b4xturtle._turtleaction)(__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="Queue.RemoveAt(Queue.Size - 1)";
__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=2949134;
 //BA.debugLineNum = 2949134;BA.debugLine="Queue.InsertAt(1, TA)";
__ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt((int) (1),(Object)(_ta));
 }
};
 };
RDebugUtils.currentLine=2949137;
 //BA.debugLineNum = 2949137;BA.debugLine="End Sub";
return "";
}
public String  _panel1_touch(b4j.example.b4xturtle __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "panel1_touch", true))
	 {return ((String) Debug.delegate(ba, "panel1_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Private Sub Panel1_Touch (Action As Int, X As Floa";
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="If Action <> Panel1.TOUCH_ACTION_MOVE_NOTOUCH The";
if (_action!=__ref._panel1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="CallSub2(mCallBack, mEventName & \"_Touch\", Creat";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Touch",(Object)(__ref._createturtletouchargs /*b4j.example.b4xturtle._turtletouchargs*/ (null,(float) (_x/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()),(float) (_y/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()),_action==__ref._panel1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP,_action==__ref._panel1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN,_action==__ref._panel1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE)));
 };
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="End Sub";
return "";
}
public String  _pause(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "pause", true))
	 {return ((String) Debug.delegate(ba, "pause", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Pause";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="MainTimer.Enabled = False";
__ref._maintimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return "";
}
public String  _pencolor_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "pencolor_action", true))
	 {return ((String) Debug.delegate(ba, "pencolor_action", new Object[] {_ta,_stage}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub PenColor_Action (ta As TurtleAction, S";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="State.PenColor = ta.Extra.Get(0)";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .PenColor /*int*/  = (int)(BA.ObjectToNumber(_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
 };
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="End Sub";
return "";
}
public String  _penupdown_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "penupdown_action", true))
	 {return ((String) Debug.delegate(ba, "penupdown_action", new Object[] {_ta,_stage}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub PenUpDown_Action (TA As TurtleAction,";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="State.PenDown = TA.Param1 = 1";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .PenDown /*boolean*/  = _ta.Param1 /*float*/ ==1;
 };
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="End Sub";
return "";
}
public String  _pushstate_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "pushstate_action", true))
	 {return ((String) Debug.delegate(ba, "pushstate_action", new Object[] {_ta,_stage}));}
boolean _push = false;
b4j.example.b4xturtle._turtlestate _newstate = null;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Private Sub PushState_Action (TA As TurtleAction,";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Dim push As Boolean = TA.Param1 = 0";
_push = _ta.Param1 /*float*/ ==0;
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="If push Then";
if (_push) { 
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="Dim NewState As TurtleState = CreateTurtleState";
_newstate = __ref._createturtlestate /*b4j.example.b4xturtle._turtlestate*/ (null,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserX /*float*/ ,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserY /*float*/ ,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/ ,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .PenDown /*boolean*/ ,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .PenColor /*int*/ ,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .PenThickness /*float*/ ,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .SpeedFactor /*float*/ ,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Alignment /*String*/ ,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .TurtleVisible /*boolean*/ ,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .RabbitMode /*boolean*/ ,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .CanvasLayer /*int*/ );
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="StatesStack.Add(State)";
__ref._statesstack /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._state /*b4j.example.b4xturtle._turtlestate*/ ));
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="State = NewState";
__ref._state /*b4j.example.b4xturtle._turtlestate*/  = _newstate;
 }else {
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="State = StatesStack.Get(StatesStack.Size - 1)";
__ref._state /*b4j.example.b4xturtle._turtlestate*/  = (b4j.example.b4xturtle._turtlestate)(__ref._statesstack /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._statesstack /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="StatesStack.RemoveAt(StatesStack.Size - 1)";
__ref._statesstack /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._statesstack /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 };
 };
RDebugUtils.currentLine=2293774;
 //BA.debugLineNum = 2293774;BA.debugLine="End Sub";
return "";
}
public void  _rabbit_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "rabbit_action", true))
	 {Debug.delegate(ba, "rabbit_action", new Object[] {_ta,_stage}); return;}
ResumableSub_Rabbit_Action rsub = new ResumableSub_Rabbit_Action(this,__ref,_ta,_stage);
rsub.resume(ba, null);
}
public static class ResumableSub_Rabbit_Action extends BA.ResumableSub {
public ResumableSub_Rabbit_Action(b4j.example.b4xturtle parent,b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) {
this.parent = parent;
this.__ref = __ref;
this._ta = _ta;
this._stage = _stage;
this.__ref = parent;
}
b4j.example.b4xturtle __ref;
b4j.example.b4xturtle parent;
b4j.example.b4xturtle._turtleaction _ta;
float _stage;
boolean _newmode = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xturtle";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="If Stage = 1 Then";
if (true) break;

case 1:
//if
this.state = 16;
if (_stage==1) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="Dim NewMode As Boolean = TA.Param1 = 1";
_newmode = _ta.Param1 /*float*/ ==1;
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="If NewMode = State.RabbitMode Then Return";
if (true) break;

case 4:
//if
this.state = 9;
if (_newmode==__ref._state /*b4j.example.b4xturtle._turtlestate*/ .RabbitMode /*boolean*/ ) { 
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
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="State.RabbitMode = NewMode";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .RabbitMode /*boolean*/  = _newmode;
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="If State.RabbitMode Then";
if (true) break;

case 10:
//if
this.state = 15;
if (__ref._state /*b4j.example.b4xturtle._turtlestate*/ .RabbitMode /*boolean*/ ) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xturtle", "rabbit_action"),(int) (0));
this.state = 17;
return;
case 17:
//C
this.state = 15;
;
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="RabbitLoop";
__ref._rabbitloop /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="Resume";
__ref._resume /*String*/ (null);
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
RDebugUtils.currentLine=4653068;
 //BA.debugLineNum = 4653068;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _resume(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "resume", true))
	 {return ((String) Debug.delegate(ba, "resume", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub Resume";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="If Ready And Queue.Size > 0 Then MainTimer.Enable";
if (__ref._ready /*boolean*/  && __ref._queue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._maintimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);};
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
public int  _randomcolor(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "randomcolor", true))
	 {return ((Integer) Debug.delegate(ba, "randomcolor", null));}
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Public Sub RandomColor As Int";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Return Rnd(0xff000000, 0xffffffff)";
if (true) return __c.Rnd((int) (0xff000000),(int) (0xffffffff));
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="End Sub";
return 0;
}
public String  _right_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "right_action", true))
	 {return ((String) Debug.delegate(ba, "right_action", new Object[] {_ta,_stage}));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Private Sub Right_Action (TA As TurtleAction, Stag";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="If Stage = 0 Then";
if (_stage==0) { 
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="TA.Extra = Array(State.Degree)";
_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/ )});
 }else 
{RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="Else If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="State.Degree = TA.Extra.Get(0) + TA.Param1";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/  = (float) ((double)(BA.ObjectToNumber(_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))))+_ta.Param1 /*float*/ );
RDebugUtils.currentLine=4718600;
 //BA.debugLineNum = 4718600;BA.debugLine="State.Degree = ((State.Degree Mod 360) + 360) Mo";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/  = (float) (((__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/ %360)+360)%360);
 }else {
RDebugUtils.currentLine=4718603;
 //BA.debugLineNum = 4718603;BA.debugLine="State.Degree = TA.Extra.Get(0) + TA.Param1 * Sta";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/  = (float) ((double)(BA.ObjectToNumber(_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))))+_ta.Param1 /*float*/ *_stage);
 }}
;
RDebugUtils.currentLine=4718605;
 //BA.debugLineNum = 4718605;BA.debugLine="DrawTurtle";
__ref._drawturtle /*void*/ (null);
RDebugUtils.currentLine=4718606;
 //BA.debugLineNum = 4718606;BA.debugLine="End Sub";
return "";
}
public String  _setangle_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "setangle_action", true))
	 {return ((String) Debug.delegate(ba, "setangle_action", new Object[] {_ta,_stage}));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Private Sub SetAngle_Action (TA As TurtleAction, S";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="State.Degree = TA.Param1";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Degree /*float*/  = _ta.Param1 /*float*/ ;
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="DrawTurtle";
__ref._drawturtle /*void*/ (null);
 };
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="End Sub";
return "";
}
public String  _setcurrentlayer_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "setcurrentlayer_action", true))
	 {return ((String) Debug.delegate(ba, "setcurrentlayer_action", new Object[] {_ta,_stage}));}
int _index = 0;
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Private Sub SetCurrentLayer_Action (TA As TurtleAc";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Dim index As Int = TA.Param1";
_index = (int) (_ta.Param1 /*float*/ );
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="If index > Layers.Size - 1 Or index < 0 Then";
if (_index>__ref._layers /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1 || _index<0) { 
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="Log(\"Error: invalid layer index.\")";
__c.Log("Error: invalid layer index.");
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="index = Max(0, Min(index, Layers.Size - 1))";
_index = (int) (__c.Max(0,__c.Min(_index,__ref._layers /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
 };
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="State.CanvasLayer = index";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .CanvasLayer /*int*/  = _index;
 };
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xturtle  _setfontandalignment(b4j.example.b4xturtle __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,String _alignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "setfontandalignment", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "setfontandalignment", new Object[] {_fnt,_alignment}));}
b4j.example.b4xturtle._turtleaction _ta = null;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub SetFontAndAlignment (Fnt As B4XFont, Al";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
_ta = __ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (0),"SetFontAndAlignment_Action");
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="ta.Extra = Array(Fnt, Alignment)";
_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_fnt.getObject()),(Object)(_alignment)});
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="Return AddAction(ta)";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,_ta);
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="End Sub";
return null;
}
public String  _setfontandalignment_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "setfontandalignment_action", true))
	 {return ((String) Debug.delegate(ba, "setfontandalignment_action", new Object[] {_ta,_stage}));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Private Sub SetFontAndAlignment_Action (TA As Turt";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="State.Fnt = TA.Extra.Get(0)";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="State.Alignment = TA.Extra.Get(1)";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .Alignment /*String*/  = BA.ObjectToString(_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)));
 };
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="End Sub";
return "";
}
public String  _setnumberoflayer_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "setnumberoflayer_action", true))
	 {return ((String) Debug.delegate(ba, "setnumberoflayer_action", new Object[] {_ta,_stage}));}
int _n = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Private Sub SetNumberOfLayer_Action (TA As TurtleA";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Dim n As Int = Max(1, TA.Param1)";
_n = (int) (__c.Max(1,_ta.Param1 /*float*/ ));
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="If n < Layers.Size Then";
if (_n<__ref._layers /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="For i = n To Layers.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._layers /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = _n ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="Dim cvs As B4XCanvas = Layers.Get(Layers.Size";
_cvs = (anywheresoftware.b4a.objects.B4XCanvas)(__ref._layers /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._layers /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="cvs.TargetView.RemoveViewFromParent";
_cvs.getTargetView().RemoveViewFromParent();
RDebugUtils.currentLine=3538951;
 //BA.debugLineNum = 3538951;BA.debugLine="cvs.Release";
_cvs.Release();
RDebugUtils.currentLine=3538952;
 //BA.debugLineNum = 3538952;BA.debugLine="Layers.RemoveAt(Layers.Size - 1)";
__ref._layers /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._layers /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 }
};
 }else 
{RDebugUtils.currentLine=3538954;
 //BA.debugLineNum = 3538954;BA.debugLine="Else if n > Layers.Size Then";
if (_n>__ref._layers /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=3538955;
 //BA.debugLineNum = 3538955;BA.debugLine="For i = 1 To n - Layers.Size";
{
final int step11 = 1;
final int limit11 = (int) (_n-__ref._layers /*anywheresoftware.b4a.objects.collections.List*/ .getSize());
_i = (int) (1) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=3538956;
 //BA.debugLineNum = 3538956;BA.debugLine="CreateCanvasLayer";
__ref._createcanvaslayer /*String*/ (null);
 }
};
 }}
;
RDebugUtils.currentLine=3538959;
 //BA.debugLineNum = 3538959;BA.debugLine="State.CanvasLayer = Min(State.CanvasLayer, Layer";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .CanvasLayer /*int*/  = (int) (__c.Min(__ref._state /*b4j.example.b4xturtle._turtlestate*/ .CanvasLayer /*int*/ ,__ref._layers /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 };
RDebugUtils.currentLine=3538961;
 //BA.debugLineNum = 3538961;BA.debugLine="End Sub";
return "";
}
public String  _setpensize_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "setpensize_action", true))
	 {return ((String) Debug.delegate(ba, "setpensize_action", new Object[] {_ta,_stage}));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Private Sub SetPenSize_Action (TA As TurtleAction,";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="State.PenThickness = TA.Param1";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .PenThickness /*float*/  = _ta.Param1 /*float*/ ;
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="DrawTurtle";
__ref._drawturtle /*void*/ (null);
 };
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="End Sub";
return "";
}
public String  _setposition_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "setposition_action", true))
	 {return ((String) Debug.delegate(ba, "setposition_action", new Object[] {_ta,_stage}));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub SetPosition_Action (TA As TurtleAction";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="If TA.Extra.Get(0) >= 0 Then State.UserX = Max(0";
if ((double)(BA.ObjectToNumber(_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))))>=0) { 
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserX /*float*/  = (float) (__c.Max(0,__c.Min(__ref._mwidth /*int*/ ,(double)(BA.ObjectToNumber(_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)))))));};
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="If TA.Extra.Get(1) >= 0 Then State.UserY = Max(0";
if ((double)(BA.ObjectToNumber(_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1))))>=0) { 
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserY /*float*/  = (float) (__c.Max(0,__c.Min(__ref._mheight /*int*/ ,(double)(BA.ObjectToNumber(_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)))))));};
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="DrawTurtle";
__ref._drawturtle /*void*/ (null);
 };
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="End Sub";
return "";
}
public String  _setspeedfactor_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "setspeedfactor_action", true))
	 {return ((String) Debug.delegate(ba, "setspeedfactor_action", new Object[] {_ta,_stage}));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Private Sub SetSpeedFactor_Action (TA As TurtleAct";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="State.SpeedFactor = TA.Param1";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .SpeedFactor /*float*/  = _ta.Param1 /*float*/ ;
 };
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="End Sub";
return "";
}
public String  _setturtlevisible_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "setturtlevisible_action", true))
	 {return ((String) Debug.delegate(ba, "setturtlevisible_action", new Object[] {_ta,_stage}));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Private Sub SetTurtleVisible_Action (TA As TurtleA";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="State.TurtleVisible = TA.Extra.Get(0)";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .TurtleVisible /*boolean*/  = BA.ObjectToBoolean(_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="TurtleLayer.Visible = State.TurtleVisible";
__ref._turtlelayer /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__ref._state /*b4j.example.b4xturtle._turtlestate*/ .TurtleVisible /*boolean*/ );
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="DrawTurtle";
__ref._drawturtle /*void*/ (null);
 };
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="End Sub";
return "";
}
public String  _startpolygon_action(b4j.example.b4xturtle __ref,b4j.example.b4xturtle._turtleaction _ta,float _stage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "startpolygon_action", true))
	 {return ((String) Debug.delegate(ba, "startpolygon_action", new Object[] {_ta,_stage}));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Private Sub StartPolygon_Action (TA As TurtleActio";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="If Stage = 1 Then";
if (_stage==1) { 
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="State.TrackPolygon = True";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .TrackPolygon /*boolean*/  = __c.True;
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="If State.PolygonPoints.IsInitialized = False The";
if (__ref._state /*b4j.example.b4xturtle._turtlestate*/ .PolygonPoints /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .PolygonPoints /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="State.PolygonPoints.Clear";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .PolygonPoints /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="State.PolygonPoints.Add(Array As Float(UserToCan";
__ref._state /*b4j.example.b4xturtle._turtlestate*/ .PolygonPoints /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new float[]{__ref._usertocanvas /*float*/ (null,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserX /*float*/ ),__ref._usertocanvas /*float*/ (null,__ref._state /*b4j.example.b4xturtle._turtlestate*/ .UserY /*float*/ )}));
 };
RDebugUtils.currentLine=5832711;
 //BA.debugLineNum = 5832711;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xturtle  _setangle(b4j.example.b4xturtle __ref,float _degrees) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "setangle", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "setangle", new Object[] {_degrees}));}
b4j.example.b4xturtle._turtleaction _ta = null;
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub SetAngle (Degrees As Float) As B4XTurtl";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, De";
_ta = __ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),_degrees,"SetAngle_Action");
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Return AddAction(ta)";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,_ta);
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _setcurrentlayer(b4j.example.b4xturtle __ref,int _layerindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "setcurrentlayer", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "setcurrentlayer", new Object[] {_layerindex}));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Public Sub SetCurrentLayer (LayerIndex As Int) As";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Return AddAction(CreateTurtleAction(0, LayerIndex";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,__ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (_layerindex),"SetCurrentLayer_Action"));
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _setnumberoflayers(b4j.example.b4xturtle __ref,int _numberoflayers) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "setnumberoflayers", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "setnumberoflayers", new Object[] {_numberoflayers}));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Public Sub SetNumberOfLayers (NumberOfLayers As In";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Return AddAction(CreateTurtleAction(0, NumberOfLa";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,__ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (_numberoflayers),"SetNumberOfLayer_Action"));
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _setspeedfactor(b4j.example.b4xturtle __ref,float _factor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "setspeedfactor", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "setspeedfactor", new Object[] {_factor}));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub SetSpeedFactor(Factor As Float) As B4XT";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Return AddAction(CreateTurtleAction(0, Factor, \"S";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,__ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),_factor,"SetSpeedFactor_Action"));
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _setturtlevisible(b4j.example.b4xturtle __ref,boolean _visible) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "setturtlevisible", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "setturtlevisible", new Object[] {_visible}));}
b4j.example.b4xturtle._turtleaction _ta = null;
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub SetTurtleVisible (Visible As Boolean) A";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
_ta = __ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (0),"SetTurtleVisible_Action");
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="ta.Extra = Array(Visible)";
_ta.Extra /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_visible)});
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="Return AddAction(ta)";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,_ta);
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _setx(b4j.example.b4xturtle __ref,float _x) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "setx", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "setx", new Object[] {_x}));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub SetX (x As Float) As B4XTurtle";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="SetPosition(x, -1)";
__ref._setposition /*b4j.example.b4xturtle*/ (null,_x,(float) (-1));
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Return Me";
if (true) return (b4j.example.b4xturtle)(this);
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _sety(b4j.example.b4xturtle __ref,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "sety", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "sety", new Object[] {_y}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Public Sub SetY(y As Float) As B4XTurtle";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="SetPosition(-1, y)";
__ref._setposition /*b4j.example.b4xturtle*/ (null,(float) (-1),_y);
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Return Me";
if (true) return (b4j.example.b4xturtle)(this);
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _startpolygon(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "startpolygon", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "startpolygon", null));}
b4j.example.b4xturtle._turtleaction _ta = null;
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Public Sub StartPolygon As B4XTurtle";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
_ta = __ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (0),"StartPolygon_Action");
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="Return AddAction(ta)";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,_ta);
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xturtle  _turtlemode(b4j.example.b4xturtle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xturtle";
if (Debug.shouldDelegate(ba, "turtlemode", true))
	 {return ((b4j.example.b4xturtle) Debug.delegate(ba, "turtlemode", null));}
b4j.example.b4xturtle._turtleaction _ta = null;
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub TurtleMode As B4XTurtle";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Dim ta As TurtleAction = CreateTurtleAction(0, 0,";
_ta = __ref._createturtleaction /*b4j.example.b4xturtle._turtleaction*/ (null,(int) (0),(float) (0),"Rabbit_Action");
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="Return AddAction(ta)";
if (true) return __ref._addaction /*b4j.example.b4xturtle*/ (null,_ta);
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="End Sub";
return null;
}
}