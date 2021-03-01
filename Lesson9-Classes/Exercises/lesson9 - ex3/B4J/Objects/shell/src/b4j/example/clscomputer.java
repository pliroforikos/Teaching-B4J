
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clscomputer {
    public static RemoteObject myClass;
	public clscomputer() {
	}
    public static PCBA staticBA = new PCBA(null, clscomputer.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _strtype = RemoteObject.createImmutable("");
public static RemoteObject _strmodel = RemoteObject.createImmutable("");
public static RemoteObject _strcpu = RemoteObject.createImmutable("");
public static RemoteObject _fltprice = RemoteObject.createImmutable(0f);
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"fltPrice",_ref.getField(false, "_fltprice"),"fx",_ref.getField(false, "_fx"),"strCpu",_ref.getField(false, "_strcpu"),"strModel",_ref.getField(false, "_strmodel"),"strType",_ref.getField(false, "_strtype")};
}
}