package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class xuiviewsutils_subs_0 {


public static RemoteObject  _addstubtoclvifneeded(RemoteObject _customlistview1,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("AddStubToCLVIfNeeded (xuiviewsutils) ","xuiviewsutils",34,xuiviewsutils.ba,xuiviewsutils.mostCurrent,34);
if (RapidSub.canDelegate("addstubtoclvifneeded")) { return b4j.example.xuiviewsutils.remoteMe.runUserSub(false, "xuiviewsutils","addstubtoclvifneeded", _customlistview1, _color);}
RemoteObject _lastitem = RemoteObject.declareNull("b4j.example.customlistview._clvitem");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _height = RemoteObject.createImmutable(0);
Debug.locals.put("CustomListView1", _customlistview1);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 34;BA.debugLine="Public Sub AddStubToCLVIfNeeded(CustomListView1 As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="If CustomListView1.Size = 0 Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_customlistview1.runMethod(true,"_getsize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 36;BA.debugLine="Dim LastItem As CLVItem = CustomListView1.GetRawL";
Debug.JustUpdateDeviceLine();
_lastitem = _customlistview1.runMethod(false,"_getrawlistitem",(Object)(RemoteObject.solve(new RemoteObject[] {_customlistview1.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("LastItem", _lastitem);Debug.locals.put("LastItem", _lastitem);
 BA.debugLineNum = 37;BA.debugLine="If LastItem.Offset + LastItem.Panel.Height < Cust";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_lastitem.getField(true,"Offset"),_lastitem.getField(false,"Panel").runMethod(true,"getHeight")}, "+",1, 0),_customlistview1.runMethod(false,"_asview").runMethod(true,"getHeight"))) { 
 BA.debugLineNum = 39;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"stub\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = xuiviewsutils._xui.runMethod(false,"CreatePanel",xuiviewsutils.ba,(Object)(RemoteObject.createImmutable("stub")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 40;BA.debugLine="p.Color = Color";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setColor",_color);
 BA.debugLineNum = 41;BA.debugLine="Dim Height As Int = CustomListView1.AsView.Heigh";
Debug.JustUpdateDeviceLine();
_height = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_customlistview1.runMethod(false,"_asview").runMethod(true,"getHeight"),_lastitem.getField(true,"Offset"),_lastitem.getField(false,"Panel").runMethod(true,"getHeight"),xuiviewsutils.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "---",3, 0));Debug.locals.put("Height", _height);Debug.locals.put("Height", _height);
 BA.debugLineNum = 42;BA.debugLine="If xui.IsB4J Then Height = Height + 5";
Debug.JustUpdateDeviceLine();
if (xuiviewsutils._xui.runMethod(true,"getIsB4J").<Boolean>get().booleanValue()) { 
_height = RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(5)}, "+",1, 1);Debug.locals.put("Height", _height);};
 BA.debugLineNum = 43;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, CustomListView1.AsV";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_customlistview1.runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(BA.numberCast(double.class, _height)));
 BA.debugLineNum = 44;BA.debugLine="CustomListView1.Add(p, \"\")";
Debug.JustUpdateDeviceLine();
_customlistview1.runVoidMethod ("_add",(Object)(_p),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 45;BA.debugLine="CustomListView1.sv.ScrollViewContentHeight = Cus";
Debug.JustUpdateDeviceLine();
_customlistview1.getField(false,"_sv").runMethod(true,"setScrollViewContentHeight",RemoteObject.solve(new RemoteObject[] {_customlistview1.getField(false,"_sv").runMethod(true,"getScrollViewContentHeight"),_customlistview1.runMethod(true,"_getdividersize")}, "-",1, 0));
 };
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createb4ximageview() throws Exception{
try {
		Debug.PushSubsStack("CreateB4XImageView (xuiviewsutils) ","xuiviewsutils",34,xuiviewsutils.ba,xuiviewsutils.mostCurrent,85);
if (RapidSub.canDelegate("createb4ximageview")) { return b4j.example.xuiviewsutils.remoteMe.runUserSub(false, "xuiviewsutils","createb4ximageview");}
RemoteObject _iv = RemoteObject.declareNull("b4j.example.b4ximageview");
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 85;BA.debugLine="Public Sub CreateB4XImageView As B4XImageView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="Dim iv As B4XImageView";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("b4j.example.b4ximageview");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 87;BA.debugLine="iv.Initialize(Null, \"\")";
Debug.JustUpdateDeviceLine();
_iv.runClassMethod (b4j.example.b4ximageview.class, "_initialize" /*RemoteObject*/ ,xuiviewsutils.ba,(Object)(xuiviewsutils.__c.getField(false,"Null")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 88;BA.debugLine="Dim base As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_base = xuiviewsutils._xui.runMethod(false,"CreatePanel",xuiviewsutils.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("base", _base);Debug.locals.put("base", _base);
 BA.debugLineNum = 89;BA.debugLine="base.SetLayoutAnimated(0, 0, 0, 100dip, 100dip)";
Debug.JustUpdateDeviceLine();
_base.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, xuiviewsutils.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))))),(Object)(BA.numberCast(double.class, xuiviewsutils.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))))));
 BA.debugLineNum = 90;BA.debugLine="iv.DesignerCreateView(base, Null, CreateMap(\"Roun";
Debug.JustUpdateDeviceLine();
_iv.runClassMethod (b4j.example.b4ximageview.class, "_designercreateview" /*RemoteObject*/ ,(Object)((_base.getObject())),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), xuiviewsutils.__c.getField(false,"Null")),(Object)(xuiviewsutils.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Round")),(xuiviewsutils.__c.getField(true,"False")),RemoteObject.createImmutable(("ResizeMode")),RemoteObject.createImmutable(("FIT")),RemoteObject.createImmutable(("BackgroundColor")),RemoteObject.createImmutable((0xffaaaaaa)),RemoteObject.createImmutable(("CornersRadius")),RemoteObject.createImmutable((0))}))));
 BA.debugLineNum = 91;BA.debugLine="Return iv";
Debug.JustUpdateDeviceLine();
if (true) return _iv;
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlabel() throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (xuiviewsutils) ","xuiviewsutils",34,xuiviewsutils.ba,xuiviewsutils.mostCurrent,78);
if (RapidSub.canDelegate("createlabel")) { return b4j.example.xuiviewsutils.remoteMe.runUserSub(false, "xuiviewsutils","createlabel");}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
 BA.debugLineNum = 78;BA.debugLine="Public Sub CreateLabel As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 79;BA.debugLine="Dim lbl As Label";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 80;BA.debugLine="lbl.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_lbl.runVoidMethod ("Initialize",xuiviewsutils.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 81;BA.debugLine="Return lbl";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize() throws Exception{
try {
		Debug.PushSubsStack("Initialize (xuiviewsutils) ","xuiviewsutils",34,xuiviewsutils.ba,xuiviewsutils.mostCurrent,10);
if (RapidSub.canDelegate("initialize")) { return b4j.example.xuiviewsutils.remoteMe.runUserSub(false, "xuiviewsutils","initialize");}
 BA.debugLineNum = 10;BA.debugLine="Private Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="If UtilsInitialized Then Return";
Debug.JustUpdateDeviceLine();
if (xuiviewsutils._utilsinitialized.<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 12;BA.debugLine="UtilsInitialized = True";
Debug.JustUpdateDeviceLine();
xuiviewsutils._utilsinitialized = xuiviewsutils.__c.getField(true,"True");
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _performhapticfeedback(RemoteObject _view) throws Exception{
try {
		Debug.PushSubsStack("PerformHapticFeedback (xuiviewsutils) ","xuiviewsutils",34,xuiviewsutils.ba,xuiviewsutils.mostCurrent,21);
if (RapidSub.canDelegate("performhapticfeedback")) { return b4j.example.xuiviewsutils.remoteMe.runUserSub(false, "xuiviewsutils","performhapticfeedback", _view);}
Debug.locals.put("View", _view);
 BA.debugLineNum = 21;BA.debugLine="Public Sub PerformHapticFeedback (View As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 22;BA.debugLine="Initialize";
Debug.JustUpdateDeviceLine();
_initialize();
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private UtilsInitialized As Boolean";
xuiviewsutils._utilsinitialized = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 7;BA.debugLine="Private xui As XUI";
xuiviewsutils._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setbitmapandfill(RemoteObject _imageview,RemoteObject _bmp) throws Exception{
try {
		Debug.PushSubsStack("SetBitmapAndFill (xuiviewsutils) ","xuiviewsutils",34,xuiviewsutils.ba,xuiviewsutils.mostCurrent,65);
if (RapidSub.canDelegate("setbitmapandfill")) { return b4j.example.xuiviewsutils.remoteMe.runUserSub(false, "xuiviewsutils","setbitmapandfill", _imageview, _bmp);}
RemoteObject _iiv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
Debug.locals.put("ImageView", _imageview);
Debug.locals.put("Bmp", _bmp);
 BA.debugLineNum = 65;BA.debugLine="Public Sub SetBitmapAndFill (ImageView As B4XView,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="ImageView.SetBitmap(Bmp)";
Debug.JustUpdateDeviceLine();
_imageview.runVoidMethod ("SetBitmap",(Object)((_bmp.getObject())));
 BA.debugLineNum = 67;BA.debugLine="Dim iiv As ImageView = ImageView";
Debug.JustUpdateDeviceLine();
_iiv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
_iiv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper"), _imageview.getObject());Debug.locals.put("iiv", _iiv);
 BA.debugLineNum = 71;BA.debugLine="iiv.PreserveRatio = False";
Debug.JustUpdateDeviceLine();
_iiv.runMethod(true,"setPreserveRatio",xuiviewsutils.__c.getField(true,"False"));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextorcsbuildertolabel(RemoteObject _xlbl,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("SetTextOrCSBuilderToLabel (xuiviewsutils) ","xuiviewsutils",34,xuiviewsutils.ba,xuiviewsutils.mostCurrent,50);
if (RapidSub.canDelegate("settextorcsbuildertolabel")) { return b4j.example.xuiviewsutils.remoteMe.runUserSub(false, "xuiviewsutils","settextorcsbuildertolabel", _xlbl, _text);}
Debug.locals.put("xlbl", _xlbl);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 50;BA.debugLine="Public Sub SetTextOrCSBuilderToLabel(xlbl As B4XVi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="xlbl.Text = Text";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setText",BA.ObjectToString(_text));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
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