
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xpage2 {
    public static RemoteObject myClass;
	public b4xpage2() {
	}
    public static PCBA staticBA = new PCBA(null, b4xpage2.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _lblglobal1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lblglobal2 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"lblGlobal1",_ref.getField(false, "_lblglobal1"),"lblGlobal2",_ref.getField(false, "_lblglobal2"),"Root",_ref.getField(false, "_root"),"xui",_ref.getField(false, "_xui")};
}
}