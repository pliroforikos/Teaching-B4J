
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
public static RemoteObject _pggolden = RemoteObject.declareNull("b4j.example.b4xpagegoldenretriever");
public static RemoteObject _pgbeagle = RemoteObject.declareNull("b4j.example.b4xpagebeagle");
public static RemoteObject _pgjack = RemoteObject.declareNull("b4j.example.b4xpagejackrussell");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"pgBeagle",_ref.getField(false, "_pgbeagle"),"pgGolden",_ref.getField(false, "_pggolden"),"pgJack",_ref.getField(false, "_pgjack"),"Root",_ref.getField(false, "_root"),"xui",_ref.getField(false, "_xui")};
}
}