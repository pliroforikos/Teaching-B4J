
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
public static RemoteObject _phone1 = RemoteObject.declareNull("b4j.example.phone");
public static RemoteObject _phone2 = RemoteObject.declareNull("b4j.example.phone");
public static RemoteObject _phone3 = RemoteObject.declareNull("b4j.example.phone");
public static RemoteObject _phone4 = RemoteObject.declareNull("b4j.example.phone");
public static RemoteObject _phone5 = RemoteObject.declareNull("b4j.example.phone");
public static RemoteObject _phone6 = RemoteObject.declareNull("b4j.example.phone");
public static RemoteObject _phone7 = RemoteObject.declareNull("b4j.example.phone");
public static RemoteObject _phone8 = RemoteObject.declareNull("b4j.example.phone");
public static RemoteObject _pgphones = RemoteObject.declareNull("b4j.example.b4xpagesphones");
public static RemoteObject _pgwarehouse = RemoteObject.declareNull("b4j.example.b4xpagewarehouse");
public static RemoteObject _pgrevenue = RemoteObject.declareNull("b4j.example.b4xpagerevenue");
public static RemoteObject _flttotalincome = RemoteObject.createImmutable(0f);
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"fltTotalIncome",_ref.getField(false, "_flttotalincome"),"pgPhones",_ref.getField(false, "_pgphones"),"pgRevenue",_ref.getField(false, "_pgrevenue"),"pgWarehouse",_ref.getField(false, "_pgwarehouse"),"phone1",_ref.getField(false, "_phone1"),"phone2",_ref.getField(false, "_phone2"),"phone3",_ref.getField(false, "_phone3"),"phone4",_ref.getField(false, "_phone4"),"phone5",_ref.getField(false, "_phone5"),"phone6",_ref.getField(false, "_phone6"),"phone7",_ref.getField(false, "_phone7"),"phone8",_ref.getField(false, "_phone8"),"Root",_ref.getField(false, "_root"),"xui",_ref.getField(false, "_xui")};
}
}