
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xmainpage {
    public static RemoteObject myClass;
	public b4xmainpage() {
	}
    public static PCBA staticBA = new PCBA(null, b4xmainpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _lblnumber = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _fltnumber1 = RemoteObject.createImmutable(0f);
public static RemoteObject _fltnumber2 = RemoteObject.createImmutable(0f);
public static RemoteObject _operation = RemoteObject.createImmutable("");
public static RemoteObject _done = RemoteObject.createImmutable(false);
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"done",_ref.getField(false, "_done"),"fltNumber1",_ref.getField(false, "_fltnumber1"),"fltNumber2",_ref.getField(false, "_fltnumber2"),"lblNumber",_ref.getField(false, "_lblnumber"),"operation",_ref.getField(false, "_operation"),"Root",_ref.getField(false, "_root"),"xui",_ref.getField(false, "_xui")};
}
}