package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xtimedtemplate_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
b4xtimedtemplate._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xtimedtemplate._xui);
 //BA.debugLineNum = 3;BA.debugLine="Public mBase As B4XView";
b4xtimedtemplate._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xtimedtemplate._mbase);
 //BA.debugLineNum = 4;BA.debugLine="Private AnotherProgressBar1 As AnotherProgressBar";
b4xtimedtemplate._anotherprogressbar1 = RemoteObject.createNew ("b4j.example.anotherprogressbar");__ref.setField("_anotherprogressbar1",b4xtimedtemplate._anotherprogressbar1);
 //BA.debugLineNum = 5;BA.debugLine="Private mTemplate As Object";
b4xtimedtemplate._mtemplate = RemoteObject.createNew ("Object");__ref.setField("_mtemplate",b4xtimedtemplate._mtemplate);
 //BA.debugLineNum = 6;BA.debugLine="Public TimeoutMilliseconds As Int = 10000";
b4xtimedtemplate._timeoutmilliseconds = BA.numberCast(int.class, 10000);__ref.setField("_timeoutmilliseconds",b4xtimedtemplate._timeoutmilliseconds);
 //BA.debugLineNum = 7;BA.debugLine="Private Index As Int";
b4xtimedtemplate._index = RemoteObject.createImmutable(0);__ref.setField("_index",b4xtimedtemplate._index);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dialogclosed(RemoteObject __ref,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("DialogClosed (b4xtimedtemplate) ","b4xtimedtemplate",28,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("dialogclosed")) { return __ref.runUserSub(false, "b4xtimedtemplate","dialogclosed", __ref, _result);}
Debug.locals.put("Result", _result);
 BA.debugLineNum = 41;BA.debugLine="Private Sub DialogClosed(Result As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 42;BA.debugLine="Index = Index + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_index" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_index" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 43;BA.debugLine="CallSub2(mTemplate, \"DialogClosed\", Result)";
Debug.JustUpdateDeviceLine();
b4xtimedtemplate.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mtemplate" /*RemoteObject*/ )),(Object)(BA.ObjectToString("DialogClosed")),(Object)((_result)));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetPanel (b4xtimedtemplate) ","b4xtimedtemplate",28,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "b4xtimedtemplate","getpanel", __ref, _dialog);}
RemoteObject _innerpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 16;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 17;BA.debugLine="If mBase.NumberOfViews = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 18;BA.debugLine="Dim InnerPanel As B4XView = CallSub2(mTemplate,";
Debug.JustUpdateDeviceLine();
_innerpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_innerpanel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), b4xtimedtemplate.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mtemplate" /*RemoteObject*/ )),(Object)(BA.ObjectToString("GetPanel")),(Object)((_dialog))));Debug.locals.put("InnerPanel", _innerpanel);
 BA.debugLineNum = 19;BA.debugLine="If InnerPanel.Parent.IsInitialized Then InnerPan";
Debug.JustUpdateDeviceLine();
if (_innerpanel.runMethod(false,"getParent").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_innerpanel.runVoidMethod ("RemoveViewFromParent");};
 BA.debugLineNum = 20;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, InnerPanel.Widt";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_innerpanel.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {_innerpanel.runMethod(true,"getHeight"),b4xtimedtemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 19)))}, "+",1, 0)));
 BA.debugLineNum = 21;BA.debugLine="mBase.LoadLayout(\"TimedDialogTemplate\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("TimedDialogTemplate")),__ref.getField(false, "ba"));
 BA.debugLineNum = 22;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 23;BA.debugLine="mBase.AddView(InnerPanel, 0, 19dip, InnerPanel.W";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_innerpanel.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, b4xtimedtemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 19))))),(Object)(_innerpanel.runMethod(true,"getWidth")),(Object)(_innerpanel.runMethod(true,"getHeight")));
 };
 BA.debugLineNum = 25;BA.debugLine="Return mBase";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _innertemplate) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xtimedtemplate) ","b4xtimedtemplate",28,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xtimedtemplate","initialize", __ref, _ba, _innertemplate);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("InnerTemplate", _innertemplate);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize (InnerTemplate As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mbase" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mBase"))));
 BA.debugLineNum = 12;BA.debugLine="mTemplate = InnerTemplate";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtemplate" /*RemoteObject*/ ,_innertemplate);
 BA.debugLineNum = 14;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Show (b4xtimedtemplate) ","b4xtimedtemplate",28,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "b4xtimedtemplate","show", __ref, _dialog); return;}
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
public ResumableSub_Show(b4j.example.b4xtimedtemplate parent,RemoteObject __ref,RemoteObject _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xtimedtemplate parent;
RemoteObject _dialog;
RemoteObject _myindex = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (b4xtimedtemplate) ","b4xtimedtemplate",28,__ref.getField(false, "ba"),__ref,28);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 29;BA.debugLine="CallSub2(mTemplate, \"Show\", Dialog)";
Debug.JustUpdateDeviceLine();
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mtemplate" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Show")),(Object)((_dialog)));
 BA.debugLineNum = 30;BA.debugLine="AnotherProgressBar1.SetValueNoAnimation(0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_anotherprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.example.anotherprogressbar.class, "_setvaluenoanimation" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 31;BA.debugLine="AnotherProgressBar1.ValueChangePerSecond = 100 /";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_anotherprogressbar1" /*RemoteObject*/ ).setField ("_valuechangepersecond" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_timeoutmilliseconds" /*RemoteObject*/ ),RemoteObject.createImmutable(1000)}, "/",0, 0))}, "/",0, 0)));
 BA.debugLineNum = 32;BA.debugLine="AnotherProgressBar1.Value = 100";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_anotherprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.example.anotherprogressbar.class, "_setvalue" /*RemoteObject*/ ,BA.numberCast(int.class, 100));
 BA.debugLineNum = 33;BA.debugLine="Index = Index + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_index" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_index" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 34;BA.debugLine="Dim MyIndex As Int = Index";
Debug.JustUpdateDeviceLine();
_myindex = __ref.getField(true,"_index" /*RemoteObject*/ );Debug.locals.put("MyIndex", _myindex);Debug.locals.put("MyIndex", _myindex);
 BA.debugLineNum = 35;BA.debugLine="Sleep(TimeoutMilliseconds)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xtimedtemplate", "show"),__ref.getField(true,"_timeoutmilliseconds" /*RemoteObject*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 BA.debugLineNum = 36;BA.debugLine="If MyIndex = Index Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_myindex,BA.numberCast(double.class, __ref.getField(true,"_index" /*RemoteObject*/ )))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 37;BA.debugLine="Dialog.Close(xui.DialogResponse_Cancel)";
Debug.JustUpdateDeviceLine();
_dialog.runClassMethod (b4j.example.b4xdialog.class, "_close" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 39;BA.debugLine="End Sub";
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
}