package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4jtextflow_subs_0 {


public static RemoteObject  _append(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("Append (b4jtextflow) ","b4jtextflow",35,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("append")) { return __ref.runUserSub(false, "b4jtextflow","append", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Append(text As String) As B4JTextFlow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 17;BA.debugLine="Dim lastItem As JavaObject";
Debug.JustUpdateDeviceLine();
b4jtextflow._lastitem = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_lastitem",b4jtextflow._lastitem);
 BA.debugLineNum = 18;BA.debugLine="lastItem.InitializeNewInstance(\"javafx.scene.text";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lastitem" /*RemoteObject*/ ).runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.text.Text")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_text)})));
 BA.debugLineNum = 19;BA.debugLine="texts.Add(lastItem)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_texts" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.getField(false,"_lastitem" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 20;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
b4jtextflow._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",b4jtextflow._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private texts As List";
b4jtextflow._texts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_texts",b4jtextflow._texts);
 //BA.debugLineNum = 4;BA.debugLine="Private lastItem As JavaObject";
b4jtextflow._lastitem = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_lastitem",b4jtextflow._lastitem);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createtextflow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateTextFlow (b4jtextflow) ","b4jtextflow",35,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("createtextflow")) { return __ref.runUserSub(false, "b4jtextflow","createtextflow", __ref);}
RemoteObject _tf = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 45;BA.debugLine="Public Sub CreateTextFlow As Pane";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 46;BA.debugLine="Dim tf As JavaObject";
Debug.JustUpdateDeviceLine();
_tf = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("tf", _tf);
 BA.debugLineNum = 47;BA.debugLine="tf.InitializeNewInstance(\"javafx.scene.text.TextF";
Debug.JustUpdateDeviceLine();
_tf.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.text.TextFlow")),(Object)((b4jtextflow.__c.getField(false,"Null"))));
 BA.debugLineNum = 48;BA.debugLine="tf.RunMethod(\"setTextAlignment\", Array(\"CENTER\"))";
Debug.JustUpdateDeviceLine();
_tf.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setTextAlignment")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("CENTER"))})));
 BA.debugLineNum = 49;BA.debugLine="tf.RunMethodJO(\"getChildren\", Null).RunMethod(\"ad";
Debug.JustUpdateDeviceLine();
_tf.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getChildren")),(Object)((b4jtextflow.__c.getField(false,"Null")))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addAll")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_texts" /*RemoteObject*/ ).getObject())})));
 BA.debugLineNum = 50;BA.debugLine="Return tf";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), _tf.getObject());
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4jtextflow) ","b4jtextflow",35,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4jtextflow","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 8;BA.debugLine="Reset";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4jtextflow.class, "_reset" /*RemoteObject*/ );
 BA.debugLineNum = 9;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reset(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Reset (b4jtextflow) ","b4jtextflow",35,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("reset")) { return __ref.runUserSub(false, "b4jtextflow","reset", __ref);}
 BA.debugLineNum = 11;BA.debugLine="Public Sub Reset As B4JTextFlow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 12;BA.debugLine="texts.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_texts" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 13;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("SetColor (b4jtextflow) ","b4jtextflow",35,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("setcolor")) { return __ref.runUserSub(false, "b4jtextflow","setcolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 28;BA.debugLine="Public Sub SetColor(Color As Int) As B4JTextFlow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="lastItem.RunMethod(\"setFill\", Array(fx.Colors.Fro";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lastitem" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFill")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(_color)))})));
 BA.debugLineNum = 30;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfont(RemoteObject __ref,RemoteObject _font) throws Exception{
try {
		Debug.PushSubsStack("SetFont (b4jtextflow) ","b4jtextflow",35,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("setfont")) { return __ref.runUserSub(false, "b4jtextflow","setfont", __ref, _font);}
Debug.locals.put("Font", _font);
 BA.debugLineNum = 23;BA.debugLine="Public Sub SetFont(Font As Font) As B4JTextFlow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 24;BA.debugLine="lastItem.RunMethod(\"setFont\", Array(Font))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lastitem" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFont")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_font.getObject())})));
 BA.debugLineNum = 25;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstrikethrough(RemoteObject __ref,RemoteObject _strikethrough) throws Exception{
try {
		Debug.PushSubsStack("SetStrikethrough (b4jtextflow) ","b4jtextflow",35,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("setstrikethrough")) { return __ref.runUserSub(false, "b4jtextflow","setstrikethrough", __ref, _strikethrough);}
Debug.locals.put("Strikethrough", _strikethrough);
 BA.debugLineNum = 38;BA.debugLine="Public Sub SetStrikethrough(Strikethrough As Boole";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="lastItem.RunMethod(\"setStrikethrough\", Array(Stri";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lastitem" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setStrikethrough")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_strikethrough)})));
 BA.debugLineNum = 40;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setunderline(RemoteObject __ref,RemoteObject _underline) throws Exception{
try {
		Debug.PushSubsStack("SetUnderline (b4jtextflow) ","b4jtextflow",35,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("setunderline")) { return __ref.runUserSub(false, "b4jtextflow","setunderline", __ref, _underline);}
Debug.locals.put("Underline", _underline);
 BA.debugLineNum = 33;BA.debugLine="Public Sub SetUnderline(Underline As Boolean) As B";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="lastItem.RunMethod(\"setUnderline\", Array(Underlin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lastitem" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setUnderline")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_underline)})));
 BA.debugLineNum = 35;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}