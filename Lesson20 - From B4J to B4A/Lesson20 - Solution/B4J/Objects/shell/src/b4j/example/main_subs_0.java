package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,12);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
RemoteObject _pagesmanager = RemoteObject.declareNull("b4j.example.b4xpagesmanager");
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 12;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(4096);
main._mainform = _form1;
 BA.debugLineNum = 14;BA.debugLine="MainForm.Show";
Debug.ShouldStop(8192);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 15;BA.debugLine="Dim PagesManager As B4XPagesManager";
Debug.ShouldStop(16384);
_pagesmanager = RemoteObject.createNew ("b4j.example.b4xpagesmanager");Debug.locals.put("PagesManager", _pagesmanager);
 BA.debugLineNum = 16;BA.debugLine="PagesManager.Initialize(MainForm)";
Debug.ShouldStop(32768);
_pagesmanager.runClassMethod (b4j.example.b4xpagesmanager.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(main._mainform));
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_closed() throws Exception{
try {
		Debug.PushSubsStack("MainForm_Closed (main) ","main",0,main.ba,main.mostCurrent,29);
if (RapidSub.canDelegate("mainform_closed")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_closed");}
 BA.debugLineNum = 29;BA.debugLine="Sub MainForm_Closed";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="B4XPages.Delegate.MainForm_Closed";
Debug.ShouldStop(536870912);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_closed" /*RemoteObject*/ );
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_closerequest(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("MainForm_CloseRequest (main) ","main",0,main.ba,main.mostCurrent,33);
if (RapidSub.canDelegate("mainform_closerequest")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_closerequest", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 33;BA.debugLine="Sub MainForm_CloseRequest (EventData As Event)";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="B4XPages.Delegate.MainForm_CloseRequest(EventData";
Debug.ShouldStop(2);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_closerequest" /*RemoteObject*/ ,(Object)(_eventdata));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("MainForm_FocusChanged (main) ","main",0,main.ba,main.mostCurrent,21);
if (RapidSub.canDelegate("mainform_focuschanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 21;BA.debugLine="Sub MainForm_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="B4XPages.Delegate.MainForm_FocusChanged(HasFocus)";
Debug.ShouldStop(2097152);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_focuschanged" /*RemoteObject*/ ,(Object)(_hasfocus));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_iconifiedchanged(RemoteObject _iconified) throws Exception{
try {
		Debug.PushSubsStack("MainForm_IconifiedChanged (main) ","main",0,main.ba,main.mostCurrent,37);
if (RapidSub.canDelegate("mainform_iconifiedchanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_iconifiedchanged", _iconified);}
Debug.locals.put("Iconified", _iconified);
 BA.debugLineNum = 37;BA.debugLine="Public Sub MainForm_IconifiedChanged (Iconified As";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="B4XPages.Delegate.MainForm_IconifiedChanged(Iconi";
Debug.ShouldStop(32);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_iconifiedchanged" /*RemoteObject*/ ,(Object)(_iconified));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_resize(RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("MainForm_Resize (main) ","main",0,main.ba,main.mostCurrent,25);
if (RapidSub.canDelegate("mainform_resize")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_resize", _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 25;BA.debugLine="Sub MainForm_Resize (Width As Double, Height As Do";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="B4XPages.Delegate.MainForm_Resize(Width, Height)";
Debug.ShouldStop(33554432);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_resize" /*RemoteObject*/ ,(Object)(_width),(Object)(_height));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
b4xpages_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
b4xmainpage.myClass = BA.getDeviceClass ("b4j.example.b4xmainpage");
b4xpages.myClass = BA.getDeviceClass ("b4j.example.b4xpages");
b4xbitset.myClass = BA.getDeviceClass ("b4j.example.b4xbitset");
b4xbytesbuilder.myClass = BA.getDeviceClass ("b4j.example.b4xbytesbuilder");
b4xcollections.myClass = BA.getDeviceClass ("b4j.example.b4xcollections");
b4xorderedmap.myClass = BA.getDeviceClass ("b4j.example.b4xorderedmap");
b4xset.myClass = BA.getDeviceClass ("b4j.example.b4xset");
b4xpagesdelegator.myClass = BA.getDeviceClass ("b4j.example.b4xpagesdelegator");
b4xpagesmanager.myClass = BA.getDeviceClass ("b4j.example.b4xpagesmanager");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}