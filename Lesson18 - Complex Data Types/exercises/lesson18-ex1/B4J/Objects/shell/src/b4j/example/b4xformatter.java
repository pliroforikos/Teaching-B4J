
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xformatter {
    public static RemoteObject myClass;
	public b4xformatter() {
	}
    public static PCBA staticBA = new PCBA(null, b4xformatter.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _formats = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _max_value = RemoteObject.createImmutable(0);
public static RemoteObject _min_value = RemoteObject.createImmutable(0);
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"formats",_ref.getField(false, "_formats"),"MAX_VALUE",_ref.getField(false, "_max_value"),"MIN_VALUE",_ref.getField(false, "_min_value"),"xui",_ref.getField(false, "_xui")};
}
}