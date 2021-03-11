
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xturtle {
    public static RemoteObject myClass;
	public b4xturtle() {
	}
    public static PCBA staticBA = new PCBA(null, b4xturtle.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _layers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _turtlelayer = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mdpiscale = RemoteObject.createImmutable(0f);
public static RemoteObject _mturtlebc = RemoteObject.declareNull("b4j.example.bitmapcreator");
public static RemoteObject _queue = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _maintimer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _timerinterval = RemoteObject.createImmutable(0);
public static RemoteObject _state = RemoteObject.declareNull("b4j.example.b4xturtle._turtlestate");
public static RemoteObject _distancepersecond = RemoteObject.createImmutable(0);
public static RemoteObject _transparentturtlelayerbrush = RemoteObject.declareNull("b4j.example.bcpath._bcbrush");
public static RemoteObject _turtlebcisdrawing = RemoteObject.createImmutable(false);
public static RemoteObject _turtlebrush = RemoteObject.declareNull("b4j.example.bcpath._bcbrush");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _degreespersecond = RemoteObject.createImmutable(0);
public static RemoteObject _mwidth = RemoteObject.createImmutable(0);
public static RemoteObject _mheight = RemoteObject.createImmutable(0);
public static RemoteObject _statesstack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _ready = RemoteObject.createImmutable(false);
public static RemoteObject _bcscale = RemoteObject.createImmutable(0f);
public static RemoteObject _debuglasttouchevent = RemoteObject.createImmutable(0L);
public static RemoteObject _turtlecolor = RemoteObject.createImmutable(0);
public static RemoteObject _resizeindex = RemoteObject.createImmutable(0);
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _rabbitlooprunning = RemoteObject.createImmutable(false);
public static RemoteObject _floodbc = RemoteObject.declareNull("b4j.example.bitmapcreator");
public static RemoteObject _alphaleveltotreatastransparent = RemoteObject.createImmutable(0);
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AlphaLevelToTreatAsTransparent",_ref.getField(false, "_alphaleveltotreatastransparent"),"bcScale",_ref.getField(false, "_bcscale"),"DebugLastTouchEvent",_ref.getField(false, "_debuglasttouchevent"),"DegreesPerSecond",_ref.getField(false, "_degreespersecond"),"DistancePerSecond",_ref.getField(false, "_distancepersecond"),"FloodBC",_ref.getField(false, "_floodbc"),"fx",_ref.getField(false, "_fx"),"Layers",_ref.getField(false, "_layers"),"MainTimer",_ref.getField(false, "_maintimer"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mDPIScale",_ref.getField(false, "_mdpiscale"),"mEventName",_ref.getField(false, "_meventname"),"mHeight",_ref.getField(false, "_mheight"),"mTurtleBC",_ref.getField(false, "_mturtlebc"),"mWidth",_ref.getField(false, "_mwidth"),"Panel1",_ref.getField(false, "_panel1"),"Queue",_ref.getField(false, "_queue"),"RabbitLoopRunning",_ref.getField(false, "_rabbitlooprunning"),"Ready",_ref.getField(false, "_ready"),"ResizeIndex",_ref.getField(false, "_resizeindex"),"State",_ref.getField(false, "_state"),"StatesStack",_ref.getField(false, "_statesstack"),"Tag",_ref.getField(false, "_tag"),"TimerInterval",_ref.getField(false, "_timerinterval"),"TransparentTurtleLayerBrush",_ref.getField(false, "_transparentturtlelayerbrush"),"TurtleBCIsDrawing",_ref.getField(false, "_turtlebcisdrawing"),"TurtleBrush",_ref.getField(false, "_turtlebrush"),"TurtleColor",_ref.getField(false, "_turtlecolor"),"TurtleLayer",_ref.getField(false, "_turtlelayer"),"xui",_ref.getField(false, "_xui")};
}
}