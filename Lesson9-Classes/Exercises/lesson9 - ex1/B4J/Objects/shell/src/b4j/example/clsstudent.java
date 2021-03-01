
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clsstudent {
    public static RemoteObject myClass;
	public clsstudent() {
	}
    public static PCBA staticBA = new PCBA(null, clsstudent.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _strregnum = RemoteObject.createImmutable("");
public static RemoteObject _strname = RemoteObject.createImmutable("");
public static RemoteObject _strsurname = RemoteObject.createImmutable("");
public static RemoteObject _strphone = RemoteObject.createImmutable("");
public static RemoteObject _stremail = RemoteObject.createImmutable("");
public static RemoteObject _strclass = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"fx",_ref.getField(false, "_fx"),"strClass",_ref.getField(false, "_strclass"),"strEmail",_ref.getField(false, "_stremail"),"strName",_ref.getField(false, "_strname"),"strPhone",_ref.getField(false, "_strphone"),"strRegNum",_ref.getField(false, "_strregnum"),"strSurname",_ref.getField(false, "_strsurname")};
}
}