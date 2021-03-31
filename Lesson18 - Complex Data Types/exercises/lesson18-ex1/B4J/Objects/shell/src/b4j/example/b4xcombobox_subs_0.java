package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xcombobox_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4xcombobox) ","b4xcombobox",14,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "b4xcombobox","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 55;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private mEventName As String 'ignore";
b4xcombobox._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4xcombobox._meventname);
 //BA.debugLineNum = 4;BA.debugLine="Private mCallBack As Object 'ignore";
b4xcombobox._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",b4xcombobox._mcallback);
 //BA.debugLineNum = 5;BA.debugLine="Public mBase As B4XView";
b4xcombobox._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xcombobox._mbase);
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI 'ignore";
b4xcombobox._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xcombobox._xui);
 //BA.debugLineNum = 7;BA.debugLine="Private LastSelectedIndex As Int";
b4xcombobox._lastselectedindex = RemoteObject.createImmutable(0);__ref.setField("_lastselectedindex",b4xcombobox._lastselectedindex);
 //BA.debugLineNum = 9;BA.debugLine="Public cmbBox As ComboBox";
b4xcombobox._cmbbox = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");__ref.setField("_cmbbox",b4xcombobox._cmbbox);
 //BA.debugLineNum = 17;BA.debugLine="Public DelayBeforeChangeEvent As Int";
b4xcombobox._delaybeforechangeevent = RemoteObject.createImmutable(0);__ref.setField("_delaybeforechangeevent",b4xcombobox._delaybeforechangeevent);
 //BA.debugLineNum = 19;BA.debugLine="Private DelayIndex As Int";
b4xcombobox._delayindex = RemoteObject.createImmutable(0);__ref.setField("_delayindex",b4xcombobox._delayindex);
 //BA.debugLineNum = 20;BA.debugLine="Public Tag As Object";
b4xcombobox._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",b4xcombobox._tag);
 //BA.debugLineNum = 21;BA.debugLine="Public B4iCancelButton As String = \"Cancel\"";
b4xcombobox._b4icancelbutton = BA.ObjectToString("Cancel");__ref.setField("_b4icancelbutton",b4xcombobox._b4icancelbutton);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cmbbox_selectedindexchanged(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CmbBox_SelectedIndexChanged (b4xcombobox) ","b4xcombobox",14,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("cmbbox_selectedindexchanged")) { return __ref.runUserSub(false, "b4xcombobox","cmbbox_selectedindexchanged", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 153;BA.debugLine="Private Sub CmbBox_SelectedIndexChanged(Index As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 154;BA.debugLine="RaiseEvent";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xcombobox.class, "_raiseevent" /*void*/ );
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (b4xcombobox) ","b4xcombobox",14,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "b4xcombobox","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xbox = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 32;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 33;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 35;BA.debugLine="Dim xlbl As B4XView = Lbl";
Debug.JustUpdateDeviceLine();
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 37;BA.debugLine="cmbBox.Initialize(\"cmbBox\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cmbbox" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("cmbBox")));
 BA.debugLineNum = 38;BA.debugLine="Dim xbox As B4XView = cmbBox";
Debug.JustUpdateDeviceLine();
_xbox = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xbox = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_cmbbox" /*RemoteObject*/ ).getObject());Debug.locals.put("xbox", _xbox);
 BA.debugLineNum = 39;BA.debugLine="xbox.Font = xlbl.Font";
Debug.JustUpdateDeviceLine();
_xbox.runMethod(false,"setFont",_xlbl.runMethod(false,"getFont"));
 BA.debugLineNum = 40;BA.debugLine="mBase.AddView(cmbBox, 0, 0, mBase.Width, mBase.He";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_cmbbox" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getitem(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetItem (b4xcombobox) ","b4xcombobox",14,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("getitem")) { return __ref.runUserSub(false, "b4xcombobox","getitem", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 127;BA.debugLine="Public Sub GetItem(Index As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 129;BA.debugLine="Return cmbBox.Items.Get(Index)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(__ref.getField(false,"_cmbbox" /*RemoteObject*/ ).runMethod(false,"getItems").runMethod(false,"Get",(Object)(_index)));
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedIndex (b4xcombobox) ","b4xcombobox",14,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("getselectedindex")) { return __ref.runUserSub(false, "b4xcombobox","getselectedindex", __ref);}
 BA.debugLineNum = 98;BA.debugLine="Public Sub getSelectedIndex As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 100;BA.debugLine="Return cmbBox.SelectedIndex";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_cmbbox" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex");
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselecteditem(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedItem (b4xcombobox) ","b4xcombobox",14,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("getselecteditem")) { return __ref.runUserSub(false, "b4xcombobox","getselecteditem", __ref);}
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 121;BA.debugLine="Public Sub getSelectedItem As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 122;BA.debugLine="Dim i As Int = getSelectedIndex";
Debug.JustUpdateDeviceLine();
_i = __ref.runClassMethod (b4j.example.b4xcombobox.class, "_getselectedindex" /*RemoteObject*/ );Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 123;BA.debugLine="If i = -1 Then Return \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, -(double) (0 + 1)))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 124;BA.debugLine="Return GetItem(i)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xcombobox.class, "_getitem" /*RemoteObject*/ ,(Object)(_i));
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSize (b4xcombobox) ","b4xcombobox",14,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("getsize")) { return __ref.runUserSub(false, "b4xcombobox","getsize", __ref);}
 BA.debugLineNum = 76;BA.debugLine="Public Sub getSize As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 78;BA.debugLine="Return cmbBox.Items.Size";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_cmbbox" /*RemoteObject*/ ).runMethod(false,"getItems").runMethod(true,"getSize");
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _indexof(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("IndexOf (b4xcombobox) ","b4xcombobox",14,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("indexof")) { return __ref.runUserSub(false, "b4xcombobox","indexof", __ref, _item);}
Debug.locals.put("Item", _item);
 BA.debugLineNum = 87;BA.debugLine="Public Sub IndexOf(Item As String) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 89;BA.debugLine="Return cmbBox.Items.IndexOf(Item)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_cmbbox" /*RemoteObject*/ ).runMethod(false,"getItems").runMethod(true,"IndexOf",(Object)((_item)));
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xcombobox) ","b4xcombobox",14,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xcombobox","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 25;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 26;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 27;BA.debugLine="LastSelectedIndex = -1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastselectedindex" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 28;BA.debugLine="If xui.IsB4J Then DelayBeforeChangeEvent = 500";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J").<Boolean>get().booleanValue()) { 
__ref.setField ("_delaybeforechangeevent" /*RemoteObject*/ ,BA.numberCast(int.class, 500));};
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _raiseevent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RaiseEvent (b4xcombobox) ","b4xcombobox",14,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("raiseevent")) { __ref.runUserSub(false, "b4xcombobox","raiseevent", __ref); return;}
ResumableSub_RaiseEvent rsub = new ResumableSub_RaiseEvent(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RaiseEvent extends BA.ResumableSub {
public ResumableSub_RaiseEvent(b4j.example.b4xcombobox parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xcombobox parent;
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _myindex = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RaiseEvent (b4xcombobox) ","b4xcombobox",14,__ref.getField(false, "ba"),__ref,137);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 138;BA.debugLine="Dim index As Int = getSelectedIndex";
Debug.JustUpdateDeviceLine();
_index = __ref.runClassMethod (b4j.example.b4xcombobox.class, "_getselectedindex" /*RemoteObject*/ );Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 139;BA.debugLine="If LastSelectedIndex = index Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_lastselectedindex" /*RemoteObject*/ ),BA.numberCast(double.class, _index))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 140;BA.debugLine="If DelayBeforeChangeEvent > 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 16;
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_delaybeforechangeevent" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 141;BA.debugLine="DelayIndex = DelayIndex + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_delayindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_delayindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 142;BA.debugLine="Dim MyIndex As Int = DelayIndex";
Debug.JustUpdateDeviceLine();
_myindex = __ref.getField(true,"_delayindex" /*RemoteObject*/ );Debug.locals.put("MyIndex", _myindex);Debug.locals.put("MyIndex", _myindex);
 BA.debugLineNum = 143;BA.debugLine="Sleep(DelayBeforeChangeEvent)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xcombobox", "raiseevent"),__ref.getField(true,"_delaybeforechangeevent" /*RemoteObject*/ ));
this.state = 21;
return;
case 21:
//C
this.state = 10;
;
 BA.debugLineNum = 144;BA.debugLine="If MyIndex <> DelayIndex Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_myindex,BA.numberCast(double.class, __ref.getField(true,"_delayindex" /*RemoteObject*/ )))) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 146;BA.debugLine="LastSelectedIndex = index";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastselectedindex" /*RemoteObject*/ ,_index);
 BA.debugLineNum = 147;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Select";
Debug.JustUpdateDeviceLine();
if (true) break;

case 17:
//if
this.state = 20;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_SelectedIndexChanged"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 148;BA.debugLine="CallSub2(mCallBack, mEventName & \"_SelectedIndex";
Debug.JustUpdateDeviceLine();
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_SelectedIndexChanged"))),(Object)((_index)));
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 150;BA.debugLine="End Sub";
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
public static RemoteObject  _setitems(RemoteObject __ref,RemoteObject _items) throws Exception{
try {
		Debug.PushSubsStack("SetItems (b4xcombobox) ","b4xcombobox",14,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("setitems")) { return __ref.runUserSub(false, "b4xcombobox","setitems", __ref, _items);}
Debug.locals.put("Items", _items);
 BA.debugLineNum = 59;BA.debugLine="Public Sub SetItems(Items As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 61;BA.debugLine="cmbBox.Items.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cmbbox" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("Clear");
 BA.debugLineNum = 62;BA.debugLine="cmbBox.Items.AddAll(Items)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cmbbox" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("AddAll",(Object)(_items));
 BA.debugLineNum = 72;BA.debugLine="If Items.Size > 0 Then setSelectedIndex(0)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_items.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.runClassMethod (b4j.example.b4xcombobox.class, "_setselectedindex" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));};
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
public static RemoteObject  _setselectedindex(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("setSelectedIndex (b4xcombobox) ","b4xcombobox",14,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("setselectedindex")) { return __ref.runUserSub(false, "b4xcombobox","setselectedindex", __ref, _i);}
Debug.locals.put("i", _i);
 BA.debugLineNum = 106;BA.debugLine="Public Sub setSelectedIndex(i As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 107;BA.debugLine="LastSelectedIndex = i";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastselectedindex" /*RemoteObject*/ ,_i);
 BA.debugLineNum = 109;BA.debugLine="cmbBox.SelectedIndex = i";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cmbbox" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_i);
 BA.debugLineNum = 118;BA.debugLine="End Sub";
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