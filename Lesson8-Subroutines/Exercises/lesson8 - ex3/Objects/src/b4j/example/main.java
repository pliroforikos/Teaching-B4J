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
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtside = null;
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
public static String  _btndraw_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btndraw_click", false))
	 {return ((String) Debug.delegate(ba, "btndraw_click", null));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Private Sub btnDraw_Click";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="drawSquare";
_drawsquare();
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="End Sub";
return "";
}
public static String  _drawsquare() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "drawsquare", false))
	 {return ((String) Debug.delegate(ba, "drawsquare", null));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Private Sub drawSquare";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Turtle.MoveForward(txtSide.Text)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float)(Double.parseDouble(_txtside.getText())));
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="Turtle.TurnLeft(90)";
_turtle._turnleft /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="Turtle.MoveForward(txtSide.Text)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float)(Double.parseDouble(_txtside.getText())));
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="Turtle.TurnLeft(90)";
_turtle._turnleft /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=6946823;
 //BA.debugLineNum = 6946823;BA.debugLine="Turtle.MoveForward(txtSide.Text)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float)(Double.parseDouble(_txtside.getText())));
RDebugUtils.currentLine=6946824;
 //BA.debugLineNum = 6946824;BA.debugLine="Turtle.TurnLeft(90)";
_turtle._turnleft /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=6946826;
 //BA.debugLineNum = 6946826;BA.debugLine="Turtle.MoveForward(txtSide.Text)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float)(Double.parseDouble(_txtside.getText())));
RDebugUtils.currentLine=6946827;
 //BA.debugLineNum = 6946827;BA.debugLine="Turtle.TurnLeft(90)";
_turtle._turnleft /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=6946828;
 //BA.debugLineNum = 6946828;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Turtle_Start";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Turtle.SetPenColor(xui.Color_Blue).SetPenSize(5)";
_turtle._setpencolor /*b4j.example.b4xturtle*/ (null,_xui.Color_Blue)._setpensize /*b4j.example.b4xturtle*/ (null,(float) (5));
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="End Sub";
return "";
}
}