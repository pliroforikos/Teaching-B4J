package b4j.example;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 400, 300);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
b4j.example.b4xpagesmanager _pagesmanager = null;
 //BA.debugLineNum = 11;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 12;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 13;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 14;BA.debugLine="Dim PagesManager As B4XPagesManager";
_pagesmanager = new b4j.example.b4xpagesmanager();
 //BA.debugLineNum = 15;BA.debugLine="PagesManager.Initialize(MainForm)";
_pagesmanager._initialize /*String*/ (ba,_mainform);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_closed() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub MainForm_Closed";
 //BA.debugLineNum = 29;BA.debugLine="B4XPages.Delegate.MainForm_Closed";
_b4xpages._delegate /*b4j.example.b4xpagesdelegator*/ ._mainform_closed /*String*/ ();
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub MainForm_CloseRequest (EventData As Event)";
 //BA.debugLineNum = 33;BA.debugLine="B4XPages.Delegate.MainForm_CloseRequest(EventData";
_b4xpages._delegate /*b4j.example.b4xpagesdelegator*/ ._mainform_closerequest /*String*/ (_eventdata);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub MainForm_FocusChanged (HasFocus As Boolean)";
 //BA.debugLineNum = 21;BA.debugLine="B4XPages.Delegate.MainForm_FocusChanged(HasFocus)";
_b4xpages._delegate /*b4j.example.b4xpagesdelegator*/ ._mainform_focuschanged /*String*/ (_hasfocus);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_iconifiedchanged(boolean _iconified) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Public Sub MainForm_IconifiedChanged (Iconified As";
 //BA.debugLineNum = 37;BA.debugLine="B4XPages.Delegate.MainForm_IconifiedChanged(Iconi";
_b4xpages._delegate /*b4j.example.b4xpagesdelegator*/ ._mainform_iconifiedchanged /*String*/ (_iconified);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub MainForm_Resize (Width As Double, Height As Do";
 //BA.debugLineNum = 25;BA.debugLine="B4XPages.Delegate.MainForm_Resize(Width, Height)";
_b4xpages._delegate /*b4j.example.b4xpagesdelegator*/ ._mainform_resize /*String*/ (_width,_height);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
b4xpages._process_globals();
b4xcollections._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
}
