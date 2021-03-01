
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xpagegoldenretriever {
    public static RemoteObject myClass;
	public b4xpagegoldenretriever() {
	}
    public static PCBA staticBA = new PCBA(null, b4xpagegoldenretriever.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _txtarinfos = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");
public static RemoteObject _imgpic1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
public static RemoteObject _imgpic2 = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"imgPic1",_ref.getField(false, "_imgpic1"),"imgPic2",_ref.getField(false, "_imgpic2"),"Root",_ref.getField(false, "_root"),"txtArInfos",_ref.getField(false, "_txtarinfos"),"xui",_ref.getField(false, "_xui")};
}
}