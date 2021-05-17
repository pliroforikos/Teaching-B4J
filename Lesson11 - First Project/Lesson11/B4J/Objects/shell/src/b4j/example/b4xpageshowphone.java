
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xpageshowphone {
    public static RemoteObject myClass;
	public b4xpageshowphone() {
	}
    public static PCBA staticBA = new PCBA(null, b4xpageshowphone.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _lblcpu = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbllname = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lblmemory = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lblos = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lblram = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lblscreen = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lblstorage = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbltotal = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _txtquantity = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _pgsell = RemoteObject.declareNull("b4j.example.b4xpagesell");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"lblCPU",_ref.getField(false, "_lblcpu"),"lbllName",_ref.getField(false, "_lbllname"),"lblMemory",_ref.getField(false, "_lblmemory"),"lblOS",_ref.getField(false, "_lblos"),"lblRam",_ref.getField(false, "_lblram"),"lblScreen",_ref.getField(false, "_lblscreen"),"lblStorage",_ref.getField(false, "_lblstorage"),"lblTotal",_ref.getField(false, "_lbltotal"),"pgSell",_ref.getField(false, "_pgsell"),"Root",_ref.getField(false, "_root"),"txtQuantity",_ref.getField(false, "_txtquantity"),"xui",_ref.getField(false, "_xui")};
}
}