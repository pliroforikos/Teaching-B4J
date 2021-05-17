
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class phone {
    public static RemoteObject myClass;
	public phone() {
	}
    public static PCBA staticBA = new PCBA(null, phone.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _strname = RemoteObject.createImmutable("");
public static RemoteObject _strscreensize = RemoteObject.createImmutable("");
public static RemoteObject _intmemory = RemoteObject.createImmutable(0);
public static RemoteObject _fltram = RemoteObject.createImmutable(0);
public static RemoteObject _strcpu = RemoteObject.createImmutable("");
public static RemoteObject _intamount = RemoteObject.createImmutable(0);
public static RemoteObject _stros = RemoteObject.createImmutable("");
public static RemoteObject _fltprice = RemoteObject.createImmutable(0f);
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"fltPrice",_ref.getField(false, "_fltprice"),"fltRAM",_ref.getField(false, "_fltram"),"fx",_ref.getField(false, "_fx"),"intAmount",_ref.getField(false, "_intamount"),"intMemory",_ref.getField(false, "_intmemory"),"strCPU",_ref.getField(false, "_strcpu"),"strName",_ref.getField(false, "_strname"),"strOS",_ref.getField(false, "_stros"),"strScreenSize",_ref.getField(false, "_strscreensize")};
}
}