
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4ximageview {
    public static RemoteObject myClass;
	public b4ximageview() {
	}
    public static PCBA staticBA = new PCBA(null, b4ximageview.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mresizemode = RemoteObject.createImmutable("");
public static RemoteObject _mround = RemoteObject.createImmutable(false);
public static RemoteObject _mbitmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
public static RemoteObject _mbackgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _mcornersradius = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"iv",_ref.getField(false, "_iv"),"mBackgroundColor",_ref.getField(false, "_mbackgroundcolor"),"mBase",_ref.getField(false, "_mbase"),"mBitmap",_ref.getField(false, "_mbitmap"),"mCallBack",_ref.getField(false, "_mcallback"),"mCornersRadius",_ref.getField(false, "_mcornersradius"),"mEventName",_ref.getField(false, "_meventname"),"mResizeMode",_ref.getField(false, "_mresizemode"),"mRound",_ref.getField(false, "_mround"),"Tag",_ref.getField(false, "_tag"),"xui",_ref.getField(false, "_xui")};
}
}