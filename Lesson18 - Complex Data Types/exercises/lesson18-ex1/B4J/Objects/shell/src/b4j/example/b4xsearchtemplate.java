
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xsearchtemplate {
    public static RemoteObject myClass;
	public b4xsearchtemplate() {
	}
    public static PCBA staticBA = new PCBA(null, b4xsearchtemplate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _customlistview1 = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _xdialog = RemoteObject.declareNull("b4j.example.b4xdialog");
public static RemoteObject _searchfield = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _prefixlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _substringlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _texthighlightcolor = RemoteObject.createImmutable(0);
public static RemoteObject _itemhightlightcolor = RemoteObject.createImmutable(0);
public static RemoteObject _max_limit = RemoteObject.createImmutable(0);
public static RemoteObject _maxnumberofitemstoshow = RemoteObject.createImmutable(0);
public static RemoteObject _itemscache = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _allitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _selecteditem = RemoteObject.createImmutable("");
public static RemoteObject _lastterm = RemoteObject.createImmutable("");
public static RemoteObject _allowunlistedtext = RemoteObject.createImmutable(false);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AllItems",_ref.getField(false, "_allitems"),"AllowUnlistedText",_ref.getField(false, "_allowunlistedtext"),"CSSUtils",_ref.getField(false, "_cssutils"),"CustomListView1",_ref.getField(false, "_customlistview1"),"DateUtils",_ref.getField(false, "_dateutils"),"ItemHightlightColor",_ref.getField(false, "_itemhightlightcolor"),"ItemsCache",_ref.getField(false, "_itemscache"),"LastTerm",_ref.getField(false, "_lastterm"),"MAX_LIMIT",_ref.getField(false, "_max_limit"),"MaxNumberOfItemsToShow",_ref.getField(false, "_maxnumberofitemstoshow"),"mBase",_ref.getField(false, "_mbase"),"prefixList",_ref.getField(false, "_prefixlist"),"SearchField",_ref.getField(false, "_searchfield"),"SelectedItem",_ref.getField(false, "_selecteditem"),"substringList",_ref.getField(false, "_substringlist"),"TextHighlightColor",_ref.getField(false, "_texthighlightcolor"),"xDialog",_ref.getField(false, "_xdialog"),"xui",_ref.getField(false, "_xui")};
}
}