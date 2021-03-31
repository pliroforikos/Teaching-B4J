
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
public static RemoteObject _customers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _customlistview1 = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _txtfirstname = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _txtid = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _txtlastname = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _txtphone = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _dialog = RemoteObject.declareNull("b4j.example.b4xdialog");
public static RemoteObject _kvsfile = RemoteObject.declareNull("b4j.example.keyvaluestore");
public static RemoteObject _btnloadfile = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"btnLoadFIle",_ref.getField(false, "_btnloadfile"),"CSSUtils",_ref.getField(false, "_cssutils"),"Customers",_ref.getField(false, "_customers"),"CustomListView1",_ref.getField(false, "_customlistview1"),"DateUtils",_ref.getField(false, "_dateutils"),"dialog",_ref.getField(false, "_dialog"),"kvsFile",_ref.getField(false, "_kvsfile"),"Root",_ref.getField(false, "_root"),"txtFirstName",_ref.getField(false, "_txtfirstname"),"txtID",_ref.getField(false, "_txtid"),"txtLastName",_ref.getField(false, "_txtlastname"),"txtPhone",_ref.getField(false, "_txtphone"),"xui",_ref.getField(false, "_xui")};
}
}