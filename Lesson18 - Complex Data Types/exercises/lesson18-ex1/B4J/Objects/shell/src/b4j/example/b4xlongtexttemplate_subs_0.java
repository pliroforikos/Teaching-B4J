package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xlongtexttemplate_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
b4xlongtexttemplate._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xlongtexttemplate._xui);
 //BA.debugLineNum = 3;BA.debugLine="Public mBase As B4XView";
b4xlongtexttemplate._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xlongtexttemplate._mbase);
 //BA.debugLineNum = 4;BA.debugLine="Public CustomListView1 As CustomListView";
b4xlongtexttemplate._customlistview1 = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_customlistview1",b4xlongtexttemplate._customlistview1);
 //BA.debugLineNum = 5;BA.debugLine="Public Text As Object";
b4xlongtexttemplate._text = RemoteObject.createNew ("Object");__ref.setField("_text",b4xlongtexttemplate._text);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dialogclosed(RemoteObject __ref,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("DialogClosed (b4xlongtexttemplate) ","b4xlongtexttemplate",22,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("dialogclosed")) { return __ref.runUserSub(false, "b4xlongtexttemplate","dialogclosed", __ref, _result);}
Debug.locals.put("Result", _result);
 BA.debugLineNum = 41;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetPanel (b4xlongtexttemplate) ","b4xlongtexttemplate",22,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "b4xlongtexttemplate","getpanel", __ref, _dialog);}
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 30;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 31;BA.debugLine="Return mBase";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 32;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (b4xlongtexttemplate) ","b4xlongtexttemplate",22,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xlongtexttemplate","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _sv = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 9;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mbase" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mBase"))));
 BA.debugLineNum = 10;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 300dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, b4xlongtexttemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))),(Object)(BA.numberCast(double.class, b4xlongtexttemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 11;BA.debugLine="mBase.LoadLayout(\"LongTextTemplate\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("LongTextTemplate")),__ref.getField(false, "ba"));
 BA.debugLineNum = 12;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 13;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 14;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",BA.numberCast(int.class, 0xff555555));
 BA.debugLineNum = 15;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextcolor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 16;BA.debugLine="CustomListView1.sv.Color = 0xFF464646";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setColor",BA.numberCast(int.class, 0xff464646));
 BA.debugLineNum = 18;BA.debugLine="Dim sv As Node = CustomListView1.sv";
Debug.JustUpdateDeviceLine();
_sv = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
_sv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").getObject());Debug.locals.put("sv", _sv);
 BA.debugLineNum = 19;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
Debug.JustUpdateDeviceLine();
_sv.runMethod(false,"getStyleClasses").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("b4xdialog"))));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Resize (b4xlongtexttemplate) ","b4xlongtexttemplate",22,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("resize")) { return __ref.runUserSub(false, "b4xlongtexttemplate","resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 24;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height)));
 BA.debugLineNum = 25;BA.debugLine="CustomListView1.AsView.SetLayoutAnimated(0, 0, 0,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height)));
 BA.debugLineNum = 26;BA.debugLine="CustomListView1.Base_Resize(Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_base_resize",(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height)));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _dialog) throws Exception{
try {
		Debug.PushSubsStack("Show (b4xlongtexttemplate) ","b4xlongtexttemplate",22,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "b4xlongtexttemplate","show", __ref, _dialog);}
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 34;BA.debugLine="Private Sub Show (Dialog As B4XDialog) 'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="CustomListView1.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 36;BA.debugLine="CustomListView1.AddTextItem(Text, \"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)(__ref.getField(false,"_text" /*RemoteObject*/ )),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 37;BA.debugLine="CustomListView1.GetPanel(0).GetView(0).SetTextAli";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("TOP")),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 38;BA.debugLine="XUIViewsUtils.AddStubToCLVIfNeeded(CustomListView";
Debug.JustUpdateDeviceLine();
b4xlongtexttemplate._xuiviewsutils.runVoidMethod ("_addstubtoclvifneeded" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_customlistview1" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(true,"_defaulttextbackgroundcolor")));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
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