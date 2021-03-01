package b4j.example;


import anywheresoftware.b4a.BA;

public class b4xpages extends Object{
public static b4xpages mostCurrent = new b4xpages();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xpages", null);
		ba.loadHtSubs(b4xpages.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.b4xpages", ba);
		}
	}
    public static Class<?> getObject() {
		return b4xpages.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static Object _mpm = null;
public static b4j.example.b4xpagesdelegator _delegate = null;
public static Object _globalcontext = null;
public static b4j.example.main _main = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static String  _addpage(String _id,Object _b4xpage) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
 //BA.debugLineNum = 38;BA.debugLine="GetManager.AddPage(Id, B4XPage)";
_getmanager()._addpage /*String*/ (_id,_b4xpage);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public static String  _addpageandcreate(String _id,Object _b4xpage) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
 //BA.debugLineNum = 43;BA.debugLine="GetManager.AddPageAndCreate(Id, B4XPage)";
_getmanager()._addpageandcreate /*String*/ (_id,_b4xpage);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public static String  _closepage(Object _b4xpage) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
 //BA.debugLineNum = 63;BA.debugLine="GetManager.ClosePage (B4XPage)";
_getmanager()._closepage /*String*/ (_b4xpage);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public static b4j.example.b4xpagesmanager  _getmanager() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Public Sub GetManager As B4XPagesManager";
 //BA.debugLineNum = 15;BA.debugLine="Return mPM";
if (true) return (b4j.example.b4xpagesmanager)(_mpm);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4j.objects.Form  _getnativeparent(Object _b4xpage) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Public Sub GetNativeParent (B4XPage As Object) As";
 //BA.debugLineNum = 87;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Pare";
if (true) return _getmanager()._findpifromb4xpage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (_b4xpage).Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ ;
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public static Object  _getpage(String _id) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Public Sub GetPage (Id As String) As Object";
 //BA.debugLineNum = 28;BA.debugLine="Return GetManager.GetPage(Id)";
if (true) return _getmanager()._getpage /*Object*/ (_id);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public static String  _getpageid(Object _b4xpage) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Public Sub GetPageId (B4XPage As Object) As String";
 //BA.debugLineNum = 33;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Id";
if (true) return _getmanager()._findpifromb4xpage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (_b4xpage).Id /*String*/ ;
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public static String  _internalsetpagesmanager(Object _pm) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Public Sub InternalSetPagesManager(PM As Object)";
 //BA.debugLineNum = 20;BA.debugLine="Delegate.Initialize";
_delegate._initialize /*String*/ (ba);
 //BA.debugLineNum = 21;BA.debugLine="mPM = PM";
_mpm = _pm;
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public static boolean  _isinitialized() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Public Sub IsInitialized As Boolean";
 //BA.debugLineNum = 10;BA.debugLine="Return mPM Is B4XPagesManager";
if (true) return _mpm instanceof b4j.example.b4xpagesmanager;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return false;
}
public static b4j.example.b4xmainpage  _mainpage() throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Public Sub MainPage As B4XMainPage";
 //BA.debugLineNum = 74;BA.debugLine="Return GetManager.MainPage";
if (true) return _getmanager()._mainpage /*b4j.example.b4xmainpage*/ ;
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private mPM As Object";
_mpm = new Object();
 //BA.debugLineNum = 3;BA.debugLine="Public Delegate As B4XPagesDelegator";
_delegate = new b4j.example.b4xpagesdelegator();
 //BA.debugLineNum = 4;BA.debugLine="Public GlobalContext As Object";
_globalcontext = new Object();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public static String  _settitle(Object _b4xpage,Object _title) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
 //BA.debugLineNum = 69;BA.debugLine="GetManager.SetTitle(B4XPage, Title)";
_getmanager()._settitle /*String*/ (_b4xpage,_title);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public static String  _showpage(String _id) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Public Sub ShowPage (Id As String)";
 //BA.debugLineNum = 51;BA.debugLine="GetManager.ShowPage(Id)";
_getmanager()._showpage /*String*/ (_id);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public static String  _showpageandremovepreviouspages(String _id) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
 //BA.debugLineNum = 57;BA.debugLine="GetManager.ShowPageAndRemovePreviousPages (Id)";
_getmanager()._showpageandremovepreviouspages /*String*/ (_id);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
}
