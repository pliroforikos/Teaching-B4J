
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clsbook {
    public static RemoteObject myClass;
	public clsbook() {
	}
    public static PCBA staticBA = new PCBA(null, clsbook.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _strwriter = RemoteObject.createImmutable("");
public static RemoteObject _strtitle = RemoteObject.createImmutable("");
public static RemoteObject _stryear = RemoteObject.createImmutable("");
public static RemoteObject _strpublisher = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"fx",_ref.getField(false, "_fx"),"strPublisher",_ref.getField(false, "_strpublisher"),"strTitle",_ref.getField(false, "_strtitle"),"strWriter",_ref.getField(false, "_strwriter"),"strYear",_ref.getField(false, "_stryear")};
}
}