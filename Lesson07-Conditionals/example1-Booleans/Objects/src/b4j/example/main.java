package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
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
            frm.initWithStage(ba, stage, 600, 600);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static b4j.example.b4xturtle _turtle = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper _menubar1 = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="MainForm.RootPane.LoadLayout(\"Main\")";
_mainform.getRootPane().LoadLayout(ba,"Main");
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="End Sub";
return "";
}
public static String  _menubar1_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "menubar1_action", false))
	 {return ((String) Debug.delegate(ba, "menubar1_action", null));}
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub MenuBar1_Action";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Dim Mi As MenuItem = Sender";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi = (anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper(), (javafx.scene.control.MenuItem)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Select Mi.Tag";
switch (BA.switchObjectToInt(_mi.getTag(),(Object)("Restart"),(Object)("Exit"))) {
case 0: {
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="Turtle.Stop.ClearScreen.Home";
_turtle._stop /*b4j.example.b4xturtle*/ (null)._clearscreen /*b4j.example.b4xturtle*/ (null)._home /*b4j.example.b4xturtle*/ (null);
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="Turtle_Start";
_turtle_start();
 break; }
case 1: {
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="MainForm.Close";
_mainform.Close();
 break; }
}
;
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="End Sub";
return "";
}
public static String  _turtle_start() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "turtle_start", false))
	 {return ((String) Debug.delegate(ba, "turtle_start", null));}
int _intdistance = 0;
int _inttotaltravel = 0;
float _fltd = 0f;
String _strν = "";
String _s = "";
boolean _blnl1 = false;
boolean _blnl2 = false;
String _s2 = "";
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Turtle_Start";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Private intDistance = 100 As Int	' Notice the dif";
_intdistance = (int) (100);
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="Private intTotalTravel As Int = 0 	' of two integ";
_inttotaltravel = (int) (0);
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="Private fltD As Float = 100.45";
_fltd = (float) (100.45);
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="Private strΝ As String = \"100\"";
_strν = "100";
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="Private s As String = \"School\"";
_s = "School";
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="Log( fltD > intDistance)		'Shows True";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_fltd>_intdistance));
RDebugUtils.currentLine=196617;
 //BA.debugLineNum = 196617;BA.debugLine="Log( strΝ = intDistance)		'Shows True";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString((_strν).equals(BA.NumberToString(_intdistance))));
RDebugUtils.currentLine=196618;
 //BA.debugLineNum = 196618;BA.debugLine="Log( strΝ = intTotalTravel)		'Shows False";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString((_strν).equals(BA.NumberToString(_inttotaltravel))));
RDebugUtils.currentLine=196619;
 //BA.debugLineNum = 196619;BA.debugLine="Log( s = intTotalTravel) 		'Shows False";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString((_s).equals(BA.NumberToString(_inttotaltravel))));
RDebugUtils.currentLine=196620;
 //BA.debugLineNum = 196620;BA.debugLine="Log( intTotalTravel <> strΝ ) 	'Shows True";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_inttotaltravel!=(double)(Double.parseDouble(_strν))));
RDebugUtils.currentLine=196623;
 //BA.debugLineNum = 196623;BA.debugLine="Private blnL1, blnL2 As Boolean";
_blnl1 = false;
_blnl2 = false;
RDebugUtils.currentLine=196624;
 //BA.debugLineNum = 196624;BA.debugLine="blnL1 = True";
_blnl1 = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=196625;
 //BA.debugLineNum = 196625;BA.debugLine="blnL2 = False";
_blnl2 = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=196626;
 //BA.debugLineNum = 196626;BA.debugLine="Private s2 As String = \"School\"";
_s2 = "School";
RDebugUtils.currentLine=196628;
 //BA.debugLineNum = 196628;BA.debugLine="Log (blnL1 And blnL2)	' Shows False";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_blnl1 && _blnl2));
RDebugUtils.currentLine=196629;
 //BA.debugLineNum = 196629;BA.debugLine="Log (blnL1 Or blnL2)	' Shows True";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_blnl1 || _blnl2));
RDebugUtils.currentLine=196630;
 //BA.debugLineNum = 196630;BA.debugLine="Log (Not(blnL1))		' Shows False";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Not(_blnl1)));
RDebugUtils.currentLine=196631;
 //BA.debugLineNum = 196631;BA.debugLine="Log (Not(blnL2))		' Shows True";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Not(_blnl2)));
RDebugUtils.currentLine=196633;
 //BA.debugLineNum = 196633;BA.debugLine="Log(s = s2)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString((_s).equals(_s2)));
RDebugUtils.currentLine=196637;
 //BA.debugLineNum = 196637;BA.debugLine="End Sub";
return "";
}
}