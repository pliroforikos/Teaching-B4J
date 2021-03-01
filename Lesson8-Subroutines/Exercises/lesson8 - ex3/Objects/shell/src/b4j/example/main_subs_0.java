package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,18);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 18;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(262144);
main._mainform = _form1;
 BA.debugLineNum = 20;BA.debugLine="MainForm.RootPane.LoadLayout(\"Main\")";
Debug.ShouldStop(524288);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("Main")));
 BA.debugLineNum = 21;BA.debugLine="MainForm.Show";
Debug.ShouldStop(1048576);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndraw_click() throws Exception{
try {
		Debug.PushSubsStack("btnDraw_Click (main) ","main",0,main.ba,main.mostCurrent,45);
if (RapidSub.canDelegate("btndraw_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btndraw_click");}
 BA.debugLineNum = 45;BA.debugLine="Private Sub btnDraw_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="drawSquare";
Debug.ShouldStop(8192);
_drawsquare();
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawsquare() throws Exception{
try {
		Debug.PushSubsStack("drawSquare (main) ","main",0,main.ba,main.mostCurrent,49);
if (RapidSub.canDelegate("drawsquare")) { return b4j.example.main.remoteMe.runUserSub(false, "main","drawsquare");}
 BA.debugLineNum = 49;BA.debugLine="Private Sub drawSquare";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Turtle.MoveForward(txtSide.Text)";
Debug.ShouldStop(131072);
main._turtle.runClassMethod (b4j.example.b4xturtle.class, "_moveforward" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, main._txtside.runMethod(true,"getText"))));
 BA.debugLineNum = 51;BA.debugLine="Turtle.TurnLeft(90)";
Debug.ShouldStop(262144);
main._turtle.runClassMethod (b4j.example.b4xturtle.class, "_turnleft" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 90)));
 BA.debugLineNum = 53;BA.debugLine="Turtle.MoveForward(txtSide.Text)";
Debug.ShouldStop(1048576);
main._turtle.runClassMethod (b4j.example.b4xturtle.class, "_moveforward" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, main._txtside.runMethod(true,"getText"))));
 BA.debugLineNum = 54;BA.debugLine="Turtle.TurnLeft(90)";
Debug.ShouldStop(2097152);
main._turtle.runClassMethod (b4j.example.b4xturtle.class, "_turnleft" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 90)));
 BA.debugLineNum = 56;BA.debugLine="Turtle.MoveForward(txtSide.Text)";
Debug.ShouldStop(8388608);
main._turtle.runClassMethod (b4j.example.b4xturtle.class, "_moveforward" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, main._txtside.runMethod(true,"getText"))));
 BA.debugLineNum = 57;BA.debugLine="Turtle.TurnLeft(90)";
Debug.ShouldStop(16777216);
main._turtle.runClassMethod (b4j.example.b4xturtle.class, "_turnleft" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 90)));
 BA.debugLineNum = 59;BA.debugLine="Turtle.MoveForward(txtSide.Text)";
Debug.ShouldStop(67108864);
main._turtle.runClassMethod (b4j.example.b4xturtle.class, "_moveforward" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, main._txtside.runMethod(true,"getText"))));
 BA.debugLineNum = 60;BA.debugLine="Turtle.TurnLeft(90)";
Debug.ShouldStop(134217728);
main._turtle.runClassMethod (b4j.example.b4xturtle.class, "_turnleft" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 90)));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menubar1_action() throws Exception{
try {
		Debug.PushSubsStack("MenuBar1_Action (main) ","main",0,main.ba,main.mostCurrent,24);
if (RapidSub.canDelegate("menubar1_action")) { return b4j.example.main.remoteMe.runUserSub(false, "main","menubar1_action");}
RemoteObject _mi = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
 BA.debugLineNum = 24;BA.debugLine="Sub MenuBar1_Action";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Dim Mi As MenuItem = Sender";
Debug.ShouldStop(16777216);
_mi = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
_mi = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper"), main.__c.runMethod(false,"Sender",main.ba));Debug.locals.put("Mi", _mi);
 BA.debugLineNum = 26;BA.debugLine="Select Mi.Tag";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(_mi.runMethod(false,"getTag"),RemoteObject.createImmutable(("Restart")),RemoteObject.createImmutable(("Exit")))) {
case 0: {
 BA.debugLineNum = 28;BA.debugLine="Turtle.Stop.ClearScreen.Home";
Debug.ShouldStop(134217728);
main._turtle.runClassMethod (b4j.example.b4xturtle.class, "_stop" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xturtle.class, "_clearscreen" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xturtle.class, "_home" /*RemoteObject*/ );
 BA.debugLineNum = 29;BA.debugLine="Turtle_Start";
Debug.ShouldStop(268435456);
_turtle_start();
 break; }
case 1: {
 BA.debugLineNum = 31;BA.debugLine="MainForm.Close";
Debug.ShouldStop(1073741824);
main._mainform.runVoidMethod ("Close");
 break; }
}
;
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
main.myClass = BA.getDeviceClass ("b4j.example.main");
b4xturtle.myClass = BA.getDeviceClass ("b4j.example.b4xturtle");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 10;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 11;BA.debugLine="Private xui As XUI 'ignore";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 12;BA.debugLine="Private Turtle As B4XTurtle";
main._turtle = RemoteObject.createNew ("b4j.example.b4xturtle");
 //BA.debugLineNum = 13;BA.debugLine="Private MenuBar1 As MenuBar";
main._menubar1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private txtSide As TextField";
main._txtside = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _turtle_start() throws Exception{
try {
		Debug.PushSubsStack("Turtle_Start (main) ","main",0,main.ba,main.mostCurrent,37);
if (RapidSub.canDelegate("turtle_start")) { return b4j.example.main.remoteMe.runUserSub(false, "main","turtle_start");}
 BA.debugLineNum = 37;BA.debugLine="Sub Turtle_Start";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Turtle.SetPenColor(xui.Color_Blue).SetPenSize(5)";
Debug.ShouldStop(32);
main._turtle.runClassMethod (b4j.example.b4xturtle.class, "_setpencolor" /*RemoteObject*/ ,(Object)(main._xui.getField(true,"Color_Blue"))).runClassMethod (b4j.example.b4xturtle.class, "_setpensize" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 5)));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}