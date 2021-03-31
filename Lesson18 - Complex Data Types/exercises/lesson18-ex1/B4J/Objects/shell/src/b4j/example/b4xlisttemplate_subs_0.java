package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xlisttemplate_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
b4xlisttemplate._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xlisttemplate._xui);
 //BA.debugLineNum = 3;BA.debugLine="Public mBase As B4XView";
b4xlisttemplate._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xlisttemplate._mbase);
 //BA.debugLineNum = 4;BA.debugLine="Public CustomListView1 As CustomListView";
b4xlisttemplate._customlistview1 = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_customlistview1",b4xlisttemplate._customlistview1);
 //BA.debugLineNum = 5;BA.debugLine="Public Options As List";
b4xlisttemplate._options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_options",b4xlisttemplate._options);
 //BA.debugLineNum = 6;BA.debugLine="Public SelectedItem As String";
b4xlisttemplate._selecteditem = RemoteObject.createImmutable("");__ref.setField("_selecteditem",b4xlisttemplate._selecteditem);
 //BA.debugLineNum = 7;BA.debugLine="Private xDialog As B4XDialog";
b4xlisttemplate._xdialog = RemoteObject.createNew ("b4j.example.b4xdialog");__ref.setField("_xdialog",b4xlisttemplate._xdialog);
 //BA.debugLineNum = 8;BA.debugLine="Public AllowMultiSelection As Boolean";
b4xlisttemplate._allowmultiselection = RemoteObject.createImmutable(false);__ref.setField("_allowmultiselection",b4xlisttemplate._allowmultiselection);
 //BA.debugLineNum = 9;BA.debugLine="Public SelectionColor As Int = 0xAA0086FF";
b4xlisttemplate._selectioncolor = BA.numberCast(int.class, 0xaa0086ff);__ref.setField("_selectioncolor",b4xlisttemplate._selectioncolor);
 //BA.debugLineNum = 10;BA.debugLine="Public SelectedItems As List";
b4xlisttemplate._selecteditems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_selecteditems",b4xlisttemplate._selecteditems);
 //BA.debugLineNum = 11;BA.debugLine="Public MultiSelectionMinimum As Int = 0";
b4xlisttemplate._multiselectionminimum = BA.numberCast(int.class, 0);__ref.setField("_multiselectionminimum",b4xlisttemplate._multiselectionminimum);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _customlistview1_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CustomListView1_ItemClick (b4xlisttemplate) ","b4xlisttemplate",20,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("customlistview1_itemclick")) { return __ref.runUserSub(false, "b4xlisttemplate","customlistview1_itemclick", __ref, _index, _value);}
RemoteObject _item = RemoteObject.declareNull("b4j.example.customlistview._clvitem");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 76;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 77;BA.debugLine="If Value = \"\" Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 78;BA.debugLine="If AllowMultiSelection Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_allowmultiselection" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 79;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
Debug.JustUpdateDeviceLine();
_item = __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getrawlistitem",(Object)(_index));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 80;BA.debugLine="SelectItem (Item, True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xlisttemplate.class, "_selectitem" /*RemoteObject*/ ,(Object)(_item),(Object)(b4xlisttemplate.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 82;BA.debugLine="SelectedItem = Value";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selecteditem" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 83;BA.debugLine="SelectedItems.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_selecteditems" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 84;BA.debugLine="SelectedItems.Add(Value)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_selecteditems" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_value));
 BA.debugLineNum = 85;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xdialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_close" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));
 };
 BA.debugLineNum = 87;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("DialogClosed (b4xlisttemplate) ","b4xlisttemplate",20,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("dialogclosed")) { return __ref.runUserSub(false, "b4xlisttemplate","dialogclosed", __ref, _result);}
Debug.locals.put("Result", _result);
 BA.debugLineNum = 89;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetPanel (b4xlisttemplate) ","b4xlisttemplate",20,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "b4xlisttemplate","getpanel", __ref, _dialog);}
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 37;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="Return mBase";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 39;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (b4xlisttemplate) ","b4xlisttemplate",20,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xlisttemplate","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _sv = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 15;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mbase" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mBase"))));
 BA.debugLineNum = 16;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 300dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, b4xlisttemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))),(Object)(BA.numberCast(double.class, b4xlisttemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 17;BA.debugLine="mBase.LoadLayout(\"ListTemplate\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ListTemplate")),__ref.getField(false, "ba"));
 BA.debugLineNum = 18;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 19;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 20;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",BA.numberCast(int.class, 0xff555555));
 BA.debugLineNum = 21;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextcolor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 23;BA.debugLine="Dim sv As Node = CustomListView1.sv";
Debug.JustUpdateDeviceLine();
_sv = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
_sv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").getObject());Debug.locals.put("sv", _sv);
 BA.debugLineNum = 24;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
Debug.JustUpdateDeviceLine();
_sv.runMethod(false,"getStyleClasses").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("b4xdialog"))));
 BA.debugLineNum = 26;BA.debugLine="Options.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 27;BA.debugLine="SelectedItems.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_selecteditems" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 28;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Resize (b4xlisttemplate) ","b4xlisttemplate",20,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("resize")) { return __ref.runUserSub(false, "b4xlisttemplate","resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 31;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height)));
 BA.debugLineNum = 33;BA.debugLine="CustomListView1.Base_Resize(Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_base_resize",(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height)));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectitem(RemoteObject __ref,RemoteObject _item,RemoteObject _toggle) throws Exception{
try {
		Debug.PushSubsStack("SelectItem (b4xlisttemplate) ","b4xlisttemplate",20,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("selectitem")) { return __ref.runUserSub(false, "b4xlisttemplate","selectitem", __ref, _item, _toggle);}
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _selected = RemoteObject.createImmutable(false);
Debug.locals.put("Item", _item);
Debug.locals.put("Toggle", _toggle);
 BA.debugLineNum = 59;BA.debugLine="Private Sub SelectItem (Item As CLVItem, Toggle As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="Dim index As Int = SelectedItems.IndexOf(Item.Val";
Debug.JustUpdateDeviceLine();
_index = __ref.getField(false,"_selecteditems" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)(_item.getField(false,"Value")));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 61;BA.debugLine="Dim Selected As Boolean = index > -1";
Debug.JustUpdateDeviceLine();
_selected = BA.ObjectToBoolean(RemoteObject.solveBoolean(">",_index,BA.numberCast(double.class, -(double) (0 + 1))));Debug.locals.put("Selected", _selected);Debug.locals.put("Selected", _selected);
 BA.debugLineNum = 62;BA.debugLine="If Toggle Then Selected = Not(Selected)";
Debug.JustUpdateDeviceLine();
if (_toggle.<Boolean>get().booleanValue()) { 
_selected = b4xlisttemplate.__c.runMethod(true,"Not",(Object)(_selected));Debug.locals.put("Selected", _selected);};
 BA.debugLineNum = 63;BA.debugLine="If Selected Then";
Debug.JustUpdateDeviceLine();
if (_selected.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 64;BA.debugLine="If Not(Toggle) Then Item.Panel.Color = Selection";
Debug.JustUpdateDeviceLine();
if (b4xlisttemplate.__c.runMethod(true,"Not",(Object)(_toggle)).<Boolean>get().booleanValue()) { 
_item.getField(false,"Panel").runMethod(true,"setColor",__ref.getField(true,"_selectioncolor" /*RemoteObject*/ ));};
 BA.debugLineNum = 65;BA.debugLine="Item.Color = CustomListView1.DefaultTextBackgrou";
Debug.JustUpdateDeviceLine();
_item.setField ("Color",__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(true,"_defaulttextbackgroundcolor"));
 BA.debugLineNum = 66;BA.debugLine="If index = -1 Then SelectedItems.Add(Item.Value)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, -(double) (0 + 1)))) { 
__ref.getField(false,"_selecteditems" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_item.getField(false,"Value")));};
 }else {
 BA.debugLineNum = 68;BA.debugLine="Item.Color = SelectionColor";
Debug.JustUpdateDeviceLine();
_item.setField ("Color",__ref.getField(true,"_selectioncolor" /*RemoteObject*/ ));
 BA.debugLineNum = 69;BA.debugLine="If Not(Toggle) Then Item.Panel.Color = CustomLis";
Debug.JustUpdateDeviceLine();
if (b4xlisttemplate.__c.runMethod(true,"Not",(Object)(_toggle)).<Boolean>get().booleanValue()) { 
_item.getField(false,"Panel").runMethod(true,"setColor",__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(true,"_defaulttextbackgroundcolor"));};
 BA.debugLineNum = 70;BA.debugLine="If index > -1 Then SelectedItems.RemoveAt(index)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_index,BA.numberCast(double.class, -(double) (0 + 1)))) { 
__ref.getField(false,"_selecteditems" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_index));};
 };
 BA.debugLineNum = 72;BA.debugLine="xDialog.SetButtonState(xui.DialogResponse_Positiv";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xdialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_setbuttonstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("g",__ref.getField(false,"_selecteditems" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, __ref.getField(true,"_multiselectionminimum" /*RemoteObject*/ ))))));
 BA.debugLineNum = 73;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Show (b4xlisttemplate) ","b4xlisttemplate",20,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "b4xlisttemplate","show", __ref, _dialog); return;}
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
public ResumableSub_Show(b4j.example.b4xlisttemplate parent,RemoteObject __ref,RemoteObject _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xlisttemplate parent;
RemoteObject _dialog;
RemoteObject _opt = RemoteObject.declareNull("Object");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("b4j.example.customlistview._clvitem");
RemoteObject group3;
int index3;
int groupLen3;
int step8;
int limit8;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (b4xlisttemplate) ","b4xlisttemplate",20,__ref.getField(false, "ba"),__ref,41);
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
 BA.debugLineNum = 42;BA.debugLine="xDialog = Dialog";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xdialog" /*RemoteObject*/ ,_dialog);
 BA.debugLineNum = 43;BA.debugLine="CustomListView1.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 44;BA.debugLine="For Each opt As Object In Options";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//for
this.state = 4;
group3 = __ref.getField(false,"_options" /*RemoteObject*/ );
index3 = 0;
groupLen3 = group3.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("opt", _opt);
this.state = 12;
if (true) break;

case 12:
//C
this.state = 4;
if (index3 < groupLen3) {
this.state = 3;
_opt = group3.runMethod(false,"Get",index3);Debug.locals.put("opt", _opt);}
if (true) break;

case 13:
//C
this.state = 12;
index3++;
Debug.locals.put("opt", _opt);
if (true) break;

case 3:
//C
this.state = 13;
 BA.debugLineNum = 45;BA.debugLine="CustomListView1.AddTextItem(opt, opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)(_opt),(Object)(_opt));
 if (true) break;
if (true) break;
Debug.locals.put("opt", _opt);
;
 BA.debugLineNum = 47;BA.debugLine="If AllowMultiSelection Then";
Debug.JustUpdateDeviceLine();

case 4:
//if
this.state = 11;
if (__ref.getField(true,"_allowmultiselection" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 48;BA.debugLine="Sleep(20)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xlisttemplate", "show"),BA.numberCast(int.class, 20));
this.state = 14;
return;
case 14:
//C
this.state = 7;
;
 BA.debugLineNum = 49;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//for
this.state = 10;
step8 = 1;
limit8 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 15;
if (true) break;

case 15:
//C
this.state = 10;
if ((step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8)) this.state = 9;
if (true) break;

case 16:
//C
this.state = 15;
_i = ((int)(0 + _i + step8)) ;
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 16;
 BA.debugLineNum = 50;BA.debugLine="Dim item As CLVItem = CustomListView1.GetRawLis";
Debug.JustUpdateDeviceLine();
_item = __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getrawlistitem",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 51;BA.debugLine="SelectItem (item, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xlisttemplate.class, "_selectitem" /*RemoteObject*/ ,(Object)(_item),(Object)(parent.__c.getField(true,"False")));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("i", _i);
;
 if (true) break;

case 11:
//C
this.state = -1;
;
 BA.debugLineNum = 54;BA.debugLine="XUIViewsUtils.AddStubToCLVIfNeeded(CustomListView";
Debug.JustUpdateDeviceLine();
parent._xuiviewsutils.runVoidMethod ("_addstubtoclvifneeded" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_customlistview1" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(true,"_defaulttextbackgroundcolor")));
 BA.debugLineNum = 55;BA.debugLine="SelectedItem = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selecteditem" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
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