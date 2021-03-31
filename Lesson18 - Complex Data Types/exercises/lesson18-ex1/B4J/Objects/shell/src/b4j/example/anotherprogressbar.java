
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class anotherprogressbar {
    public static RemoteObject myClass;
	public anotherprogressbar() {
	}
    public static PCBA staticBA = new PCBA(null, anotherprogressbar.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _busybrush = RemoteObject.declareNull("b4j.example.bcpath._bcbrush");
public static RemoteObject _backgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _busyindex = RemoteObject.createImmutable(0);
public static RemoteObject _bc = RemoteObject.declareNull("b4j.example.bitmapcreator");
public static RemoteObject _miv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _transparentbrush = RemoteObject.declareNull("b4j.example.bcpath._bcbrush");
public static RemoteObject _vertical = RemoteObject.createImmutable(false);
public static RemoteObject _currentvalue = RemoteObject.createImmutable(0f);
public static RemoteObject _emptycolor = RemoteObject.createImmutable(0);
public static RemoteObject _emptybrush = RemoteObject.declareNull("b4j.example.bcpath._bcbrush");
public static RemoteObject _mvalue = RemoteObject.createImmutable(0);
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _valuechangepersecond = RemoteObject.createImmutable(0f);
public static RemoteObject _cornerradius = RemoteObject.createImmutable(0);
public static RemoteObject _brushoffsetdelta = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BackgroundColor",_ref.getField(false, "_backgroundcolor"),"bc",_ref.getField(false, "_bc"),"BrushOffsetDelta",_ref.getField(false, "_brushoffsetdelta"),"BusyBrush",_ref.getField(false, "_busybrush"),"BusyIndex",_ref.getField(false, "_busyindex"),"CornerRadius",_ref.getField(false, "_cornerradius"),"CSSUtils",_ref.getField(false, "_cssutils"),"CurrentValue",_ref.getField(false, "_currentvalue"),"DateUtils",_ref.getField(false, "_dateutils"),"EmptyBrush",_ref.getField(false, "_emptybrush"),"EmptyColor",_ref.getField(false, "_emptycolor"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"mIV",_ref.getField(false, "_miv"),"mValue",_ref.getField(false, "_mvalue"),"Tag",_ref.getField(false, "_tag"),"TransparentBrush",_ref.getField(false, "_transparentbrush"),"ValueChangePerSecond",_ref.getField(false, "_valuechangepersecond"),"Vertical",_ref.getField(false, "_vertical"),"xui",_ref.getField(false, "_xui")};
}
}