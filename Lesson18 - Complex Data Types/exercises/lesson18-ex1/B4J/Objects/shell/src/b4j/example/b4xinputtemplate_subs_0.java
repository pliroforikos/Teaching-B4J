package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xinputtemplate_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
b4xinputtemplate._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xinputtemplate._xui);
 //BA.debugLineNum = 3;BA.debugLine="Public mBase As B4XView";
b4xinputtemplate._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xinputtemplate._mbase);
 //BA.debugLineNum = 4;BA.debugLine="Public Text As String";
b4xinputtemplate._text = RemoteObject.createImmutable("");__ref.setField("_text",b4xinputtemplate._text);
 //BA.debugLineNum = 5;BA.debugLine="Private xDialog As B4XDialog";
b4xinputtemplate._xdialog = RemoteObject.createNew ("b4j.example.b4xdialog");__ref.setField("_xdialog",b4xinputtemplate._xdialog);
 //BA.debugLineNum = 6;BA.debugLine="Public RegexPattern As String";
b4xinputtemplate._regexpattern = RemoteObject.createImmutable("");__ref.setField("_regexpattern",b4xinputtemplate._regexpattern);
 //BA.debugLineNum = 7;BA.debugLine="Public TextField1 As B4XView";
b4xinputtemplate._textfield1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_textfield1",b4xinputtemplate._textfield1);
 //BA.debugLineNum = 8;BA.debugLine="Public lblTitle As B4XView";
b4xinputtemplate._lbltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitle",b4xinputtemplate._lbltitle);
 //BA.debugLineNum = 12;BA.debugLine="Private mAllowDecimals As Boolean";
b4xinputtemplate._mallowdecimals = RemoteObject.createImmutable(false);__ref.setField("_mallowdecimals",b4xinputtemplate._mallowdecimals);
 //BA.debugLineNum = 13;BA.debugLine="Private BorderColor = xui.Color_White, BorderColo";
b4xinputtemplate._bordercolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White");__ref.setField("_bordercolor",b4xinputtemplate._bordercolor);
b4xinputtemplate._bordercolorinvalid = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red");__ref.setField("_bordercolorinvalid",b4xinputtemplate._bordercolorinvalid);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _configurefornumbers(RemoteObject __ref,RemoteObject _allowdecimals,RemoteObject _allownegative) throws Exception{
try {
		Debug.PushSubsStack("ConfigureForNumbers (b4xinputtemplate) ","b4xinputtemplate",19,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("configurefornumbers")) { return __ref.runUserSub(false, "b4xinputtemplate","configurefornumbers", __ref, _allowdecimals, _allownegative);}
Debug.locals.put("AllowDecimals", _allowdecimals);
Debug.locals.put("AllowNegative", _allownegative);
 BA.debugLineNum = 40;BA.debugLine="Public Sub ConfigureForNumbers (AllowDecimals As B";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 59;BA.debugLine="If AllowDecimals And AllowNegative Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_allowdecimals) && RemoteObject.solveBoolean(".",_allownegative)) { 
 BA.debugLineNum = 60;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_regexpattern" /*RemoteObject*/ ,BA.ObjectToString("^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$"));
 }else 
{ BA.debugLineNum = 61;BA.debugLine="Else If AllowDecimals And AllowNegative = False T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_allowdecimals) && RemoteObject.solveBoolean("=",_allownegative,b4xinputtemplate.__c.getField(true,"False"))) { 
 BA.debugLineNum = 62;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_regexpattern" /*RemoteObject*/ ,BA.ObjectToString("^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$"));
 }else 
{ BA.debugLineNum = 63;BA.debugLine="Else If AllowDecimals = False And AllowNegative =";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_allowdecimals,b4xinputtemplate.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_allownegative,b4xinputtemplate.__c.getField(true,"True"))) { 
 BA.debugLineNum = 64;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)$\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_regexpattern" /*RemoteObject*/ ,BA.ObjectToString("^-?(0|[1-9]\\d*)$"));
 }else 
{ BA.debugLineNum = 65;BA.debugLine="Else If AllowDecimals = False And AllowNegative =";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_allowdecimals,b4xinputtemplate.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_allownegative,b4xinputtemplate.__c.getField(true,"False"))) { 
 BA.debugLineNum = 66;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)$\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_regexpattern" /*RemoteObject*/ ,BA.ObjectToString("^(0|[1-9]\\d*)$"));
 }}}}
;
 BA.debugLineNum = 68;BA.debugLine="mAllowDecimals = AllowDecimals";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mallowdecimals" /*RemoteObject*/ ,_allowdecimals);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dialogclosed(RemoteObject __ref,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("DialogClosed (b4xinputtemplate) ","b4xinputtemplate",19,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("dialogclosed")) { return __ref.runUserSub(false, "b4xinputtemplate","dialogclosed", __ref, _result);}
Debug.locals.put("Result", _result);
 BA.debugLineNum = 137;BA.debugLine="Private Sub DialogClosed(Result As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 138;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
 BA.debugLineNum = 139;BA.debugLine="Text = TextField1.Text";
Debug.JustUpdateDeviceLine();
__ref.setField ("_text" /*RemoteObject*/ ,__ref.getField(false,"_textfield1" /*RemoteObject*/ ).runMethod(true,"getText"));
 };
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref,RemoteObject _dialog) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (b4xinputtemplate) ","b4xinputtemplate",19,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "b4xinputtemplate","getpanel", __ref, _dialog);}
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 116;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 117;BA.debugLine="Return mBase";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 118;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (b4xinputtemplate) ","b4xinputtemplate",19,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xinputtemplate","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 17;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mbase" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mBase"))));
 BA.debugLineNum = 18;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 80dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, b4xinputtemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))),(Object)(BA.numberCast(double.class, b4xinputtemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))))));
 BA.debugLineNum = 19;BA.debugLine="mBase.LoadLayout(\"B4XInputTemplate\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("B4XInputTemplate")),__ref.getField(false, "ba"));
 BA.debugLineNum = 20;BA.debugLine="TextField1.TextColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textfield1" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 30;BA.debugLine="SetBorder(BorderColor)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xinputtemplate.class, "_setborder" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_bordercolor" /*RemoteObject*/ )));
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isvalid(RemoteObject __ref,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("IsValid (b4xinputtemplate) ","b4xinputtemplate",19,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("isvalid")) { return __ref.runUserSub(false, "b4xinputtemplate","isvalid", __ref, _new);}
Debug.locals.put("New", _new);
 BA.debugLineNum = 103;BA.debugLine="Private Sub IsValid(New As String) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 104;BA.debugLine="Return RegexPattern = \"\" Or Regex.IsMatch(RegexPa";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_regexpattern" /*RemoteObject*/ ),BA.ObjectToString("")) || RemoteObject.solveBoolean(".",b4xinputtemplate.__c.getField(false,"Regex").runMethod(true,"IsMatch",(Object)(__ref.getField(true,"_regexpattern" /*RemoteObject*/ )),(Object)(_new))));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _bc) throws Exception{
try {
		Debug.PushSubsStack("SetBorder (b4xinputtemplate) ","b4xinputtemplate",19,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "b4xinputtemplate","setborder", __ref, _bc);}
Debug.locals.put("bc", _bc);
 BA.debugLineNum = 99;BA.debugLine="Private Sub SetBorder(bc As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 100;BA.debugLine="TextField1.SetColorAndBorder(xui.Color_Transparen";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textfield1" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, b4xinputtemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(_bc),(Object)(BA.numberCast(double.class, b4xinputtemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbordercolor(RemoteObject __ref,RemoteObject _valid,RemoteObject _invalid) throws Exception{
try {
		Debug.PushSubsStack("SetBorderColor (b4xinputtemplate) ","b4xinputtemplate",19,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("setbordercolor")) { return __ref.runUserSub(false, "b4xinputtemplate","setbordercolor", __ref, _valid, _invalid);}
Debug.locals.put("Valid", _valid);
Debug.locals.put("Invalid", _invalid);
 BA.debugLineNum = 34;BA.debugLine="Public Sub SetBorderColor(Valid As Int, Invalid As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="BorderColor = Valid";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bordercolor" /*RemoteObject*/ ,_valid);
 BA.debugLineNum = 36;BA.debugLine="BorderColorInvalid = Invalid";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bordercolorinvalid" /*RemoteObject*/ ,_invalid);
 BA.debugLineNum = 37;BA.debugLine="SetBorder(BorderColor)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xinputtemplate.class, "_setborder" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_bordercolor" /*RemoteObject*/ )));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _show(RemoteObject __ref,RemoteObject _dialog) throws Exception{
try {
		Debug.PushSubsStack("Show (b4xinputtemplate) ","b4xinputtemplate",19,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "b4xinputtemplate","show", __ref, _dialog); return;}
ResumableSub_Show rsub = new ResumableSub_Show(null,__ref,_dialog);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.example.b4xinputtemplate parent,RemoteObject __ref,RemoteObject _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xinputtemplate parent;
RemoteObject _dialog;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (b4xinputtemplate) ","b4xinputtemplate",19,__ref.getField(false, "ba"),__ref,120);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 121;BA.debugLine="xDialog = Dialog";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xdialog" /*RemoteObject*/ ,_dialog);
 BA.debugLineNum = 122;BA.debugLine="xDialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xdialog" /*RemoteObject*/ ).setField ("_putattop" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A")) || RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i"))));
 BA.debugLineNum = 123;BA.debugLine="Sleep(20)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xinputtemplate", "show"),BA.numberCast(int.class, 20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 124;BA.debugLine="TextField1.Text = Text";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textfield1" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_text" /*RemoteObject*/ ));
 BA.debugLineNum = 125;BA.debugLine="Validate(Text)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xinputtemplate.class, "_validate" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_text" /*RemoteObject*/ )));
 BA.debugLineNum = 126;BA.debugLine="TextField1.RequestFocus";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textfield1" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _textfield1_action(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TextField1_Action (b4xinputtemplate) ","b4xinputtemplate",19,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("textfield1_action")) { return __ref.runUserSub(false, "b4xinputtemplate","textfield1_action", __ref);}
 BA.debugLineNum = 107;BA.debugLine="Private Sub TextField1_Action";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 108;BA.debugLine="TextField1_EnterPressed";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xinputtemplate.class, "_textfield1_enterpressed" /*RemoteObject*/ );
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _textfield1_enterpressed(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TextField1_EnterPressed (b4xinputtemplate) ","b4xinputtemplate",19,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("textfield1_enterpressed")) { return __ref.runUserSub(false, "b4xinputtemplate","textfield1_enterpressed", __ref);}
 BA.debugLineNum = 111;BA.debugLine="Private Sub TextField1_EnterPressed";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 112;BA.debugLine="If IsValid(TextField1.Text) Then xDialog.Close(xu";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (b4j.example.b4xinputtemplate.class, "_isvalid" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_textfield1" /*RemoteObject*/ ).runMethod(true,"getText"))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_xdialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_close" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));};
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _textfield1_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("TextField1_TextChanged (b4xinputtemplate) ","b4xinputtemplate",19,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("textfield1_textchanged")) { return __ref.runUserSub(false, "b4xinputtemplate","textfield1_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 71;BA.debugLine="Private Sub TextField1_TextChanged (Old As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 83;BA.debugLine="Validate (New)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xinputtemplate.class, "_validate" /*RemoteObject*/ ,(Object)(_new));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _validate(RemoteObject __ref,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("Validate (b4xinputtemplate) ","b4xinputtemplate",19,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("validate")) { return __ref.runUserSub(false, "b4xinputtemplate","validate", __ref, _new);}
RemoteObject _bc = RemoteObject.createImmutable(0);
RemoteObject _enabled = RemoteObject.createImmutable(false);
Debug.locals.put("New", _new);
 BA.debugLineNum = 86;BA.debugLine="Private Sub Validate (New As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 87;BA.debugLine="Dim bc As Int = BorderColor";
Debug.JustUpdateDeviceLine();
_bc = __ref.getField(true,"_bordercolor" /*RemoteObject*/ );Debug.locals.put("bc", _bc);Debug.locals.put("bc", _bc);
 BA.debugLineNum = 88;BA.debugLine="Dim enabled As Boolean = True";
Debug.JustUpdateDeviceLine();
_enabled = b4xinputtemplate.__c.getField(true,"True");Debug.locals.put("enabled", _enabled);Debug.locals.put("enabled", _enabled);
 BA.debugLineNum = 89;BA.debugLine="If IsValid(New) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.b4xinputtemplate.class, "_isvalid" /*RemoteObject*/ ,(Object)(_new)),b4xinputtemplate.__c.getField(true,"False"))) { 
 BA.debugLineNum = 90;BA.debugLine="If New.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 91;BA.debugLine="bc = BorderColorInvalid";
Debug.JustUpdateDeviceLine();
_bc = __ref.getField(true,"_bordercolorinvalid" /*RemoteObject*/ );Debug.locals.put("bc", _bc);
 };
 BA.debugLineNum = 93;BA.debugLine="enabled = False";
Debug.JustUpdateDeviceLine();
_enabled = b4xinputtemplate.__c.getField(true,"False");Debug.locals.put("enabled", _enabled);
 };
 BA.debugLineNum = 95;BA.debugLine="xDialog.SetButtonState(xui.DialogResponse_Positiv";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xdialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_setbuttonstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")),(Object)(_enabled));
 BA.debugLineNum = 96;BA.debugLine="SetBorder(bc)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xinputtemplate.class, "_setborder" /*RemoteObject*/ ,(Object)(_bc));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}