package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _addspaces(RemoteObject __ref,RemoteObject _s1,RemoteObject _pos) throws Exception{
try {
		Debug.PushSubsStack("addSpaces (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("addspaces")) { return __ref.runUserSub(false, "b4xmainpage","addspaces", __ref, _s1, _pos);}
Debug.locals.put("s1", _s1);
Debug.locals.put("pos", _pos);
 BA.debugLineNum = 69;BA.debugLine="Private Sub addSpaces(s1 As String, pos As Int) As";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="If pos = 1 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_pos,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 71;BA.debugLine="Do While s1.Length <= 8 Then";
Debug.ShouldStop(64);
while (RemoteObject.solveBoolean("k",_s1.runMethod(true,"length"),BA.numberCast(double.class, 8))) {
 BA.debugLineNum = 72;BA.debugLine="s1 = s1 & \" \"";
Debug.ShouldStop(128);
_s1 = RemoteObject.concat(_s1,RemoteObject.createImmutable(" "));Debug.locals.put("s1", _s1);
 }
;
 }else 
{ BA.debugLineNum = 74;BA.debugLine="else if pos = 2 Or pos = 3 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_pos,BA.numberCast(double.class, 2)) || RemoteObject.solveBoolean("=",_pos,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 75;BA.debugLine="Do While s1.Length <= 20 Then";
Debug.ShouldStop(1024);
while (RemoteObject.solveBoolean("k",_s1.runMethod(true,"length"),BA.numberCast(double.class, 20))) {
 BA.debugLineNum = 76;BA.debugLine="s1 = s1 & \" \"";
Debug.ShouldStop(2048);
_s1 = RemoteObject.concat(_s1,RemoteObject.createImmutable(" "));Debug.locals.put("s1", _s1);
 }
;
 }}
;
 BA.debugLineNum = 79;BA.debugLine="Return s1";
Debug.ShouldStop(16384);
if (true) return _s1;
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
int _i = 0;
RemoteObject _c = RemoteObject.declareNull("b4j.example.b4xmainpage._customer");
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 29;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Root = Root1";
Debug.ShouldStop(536870912);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 31;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="Customers.Initialize";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_customers" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 33;BA.debugLine="createList";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_createlist" /*RemoteObject*/ );
 BA.debugLineNum = 36;BA.debugLine="For i = 0 To Customers.Size-1";
Debug.ShouldStop(8);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customers" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 37;BA.debugLine="Private c As Customer";
Debug.ShouldStop(16);
_c = RemoteObject.createNew ("b4j.example.b4xmainpage._customer");Debug.locals.put("c", _c);
 BA.debugLineNum = 38;BA.debugLine="c = Customers.Get(i)";
Debug.ShouldStop(32);
_c = (__ref.getField(false,"_customers" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("c", _c);
 BA.debugLineNum = 39;BA.debugLine="LogCustomer(c)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_logcustomer" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 40;BA.debugLine="Log(\"---------------------------\")";
Debug.ShouldStop(128);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("---------------------------")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btninsert_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnInsert_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("btninsert_click")) { __ref.runUserSub(false, "b4xmainpage","btninsert_click", __ref); return;}
ResumableSub_btnInsert_Click rsub = new ResumableSub_btnInsert_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnInsert_Click extends BA.ResumableSub {
public ResumableSub_btnInsert_Click(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _newcustomer = RemoteObject.declareNull("b4j.example.b4xmainpage._customer");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnInsert_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,111);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 112;BA.debugLine="dialog.Initialize(Root)";
Debug.ShouldStop(32768);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 BA.debugLineNum = 113;BA.debugLine="dialog.Title = \"Insert Customer\"";
Debug.ShouldStop(65536);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Insert Customer")));
 BA.debugLineNum = 115;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(262144);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 116;BA.debugLine="p.SetLayoutAnimated(0,0,0, 350dip, 250dip)";
Debug.ShouldStop(524288);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 350))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 250))))));
 BA.debugLineNum = 118;BA.debugLine="p.LoadLayout(\"dlgInsertCustomer\")";
Debug.ShouldStop(2097152);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("dlgInsertCustomer")),__ref.getField(false, "ba"));
 BA.debugLineNum = 119;BA.debugLine="dialog.PutAtTop = True";
Debug.ShouldStop(4194304);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 120;BA.debugLine="Wait For (dialog.ShowCustom(p, \"OK\", \"\", \"Cancel\"";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "btninsert_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancel")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 121;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 122;BA.debugLine="Private newCustomer As Customer";
Debug.ShouldStop(33554432);
_newcustomer = RemoteObject.createNew ("b4j.example.b4xmainpage._customer");Debug.locals.put("newCustomer", _newcustomer);
 BA.debugLineNum = 123;BA.debugLine="newCustomer.ID = txtID.Text";
Debug.ShouldStop(67108864);
_newcustomer.setField ("ID" /*RemoteObject*/ ,__ref.getField(false,"_txtid" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));
 BA.debugLineNum = 124;BA.debugLine="newCustomer.FirstName = txtFirstName.Text";
Debug.ShouldStop(134217728);
_newcustomer.setField ("FirstName" /*RemoteObject*/ ,__ref.getField(false,"_txtfirstname" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));
 BA.debugLineNum = 125;BA.debugLine="newCustomer.LastName = txtLastName.Text";
Debug.ShouldStop(268435456);
_newcustomer.setField ("LastName" /*RemoteObject*/ ,__ref.getField(false,"_txtlastname" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));
 BA.debugLineNum = 126;BA.debugLine="newCustomer.Phone = txtPhone.Text";
Debug.ShouldStop(536870912);
_newcustomer.setField ("Phone" /*RemoteObject*/ ,__ref.getField(false,"_txtphone" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));
 BA.debugLineNum = 127;BA.debugLine="Customers.Add(newCustomer)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_customers" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_newcustomer)));
 BA.debugLineNum = 128;BA.debugLine="btnLoad_Click";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_btnload_click" /*RemoteObject*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public static void  _complete(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _btnload_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnLoad_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("btnload_click")) { return __ref.runUserSub(false, "b4xmainpage","btnload_click", __ref);}
int _i = 0;
RemoteObject _c = RemoteObject.declareNull("b4j.example.b4xmainpage._customer");
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _s1 = RemoteObject.createImmutable("");
RemoteObject _s2 = RemoteObject.createImmutable("");
RemoteObject _s3 = RemoteObject.createImmutable("");
RemoteObject _s4 = RemoteObject.createImmutable("");
 BA.debugLineNum = 47;BA.debugLine="Private Sub btnLoad_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="If CustomListView1.IsInitialized Then";
Debug.ShouldStop(32768);
if (__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 49;BA.debugLine="CustomListView1.Clear";
Debug.ShouldStop(65536);
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_clear");
 };
 BA.debugLineNum = 51;BA.debugLine="For i = 0 To Customers.Size-1";
Debug.ShouldStop(262144);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customers" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 52;BA.debugLine="Private c As Customer";
Debug.ShouldStop(524288);
_c = RemoteObject.createNew ("b4j.example.b4xmainpage._customer");Debug.locals.put("c", _c);
 BA.debugLineNum = 53;BA.debugLine="Private str As String";
Debug.ShouldStop(1048576);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 54;BA.debugLine="c = Customers.Get(i)";
Debug.ShouldStop(2097152);
_c = (__ref.getField(false,"_customers" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("c", _c);
 BA.debugLineNum = 55;BA.debugLine="Private s1, s2, s3, s4 As String";
Debug.ShouldStop(4194304);
_s1 = RemoteObject.createImmutable("");Debug.locals.put("s1", _s1);
_s2 = RemoteObject.createImmutable("");Debug.locals.put("s2", _s2);
_s3 = RemoteObject.createImmutable("");Debug.locals.put("s3", _s3);
_s4 = RemoteObject.createImmutable("");Debug.locals.put("s4", _s4);
 BA.debugLineNum = 56;BA.debugLine="s1 = addSpaces(c.ID, 1)";
Debug.ShouldStop(8388608);
_s1 = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_addspaces" /*RemoteObject*/ ,(Object)(_c.getField(true,"ID" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("s1", _s1);
 BA.debugLineNum = 57;BA.debugLine="s2 = addSpaces(c.FirstName, 2)";
Debug.ShouldStop(16777216);
_s2 = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_addspaces" /*RemoteObject*/ ,(Object)(_c.getField(true,"FirstName" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("s2", _s2);
 BA.debugLineNum = 58;BA.debugLine="s3 = addSpaces(c.LastName, 3)";
Debug.ShouldStop(33554432);
_s3 = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_addspaces" /*RemoteObject*/ ,(Object)(_c.getField(true,"LastName" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("s3", _s3);
 BA.debugLineNum = 59;BA.debugLine="s4 = c.Phone";
Debug.ShouldStop(67108864);
_s4 = _c.getField(true,"Phone" /*RemoteObject*/ );Debug.locals.put("s4", _s4);
 BA.debugLineNum = 61;BA.debugLine="str = $\"${s1}${s2}${s3}${s4}\"$";
Debug.ShouldStop(268435456);
_str = (RemoteObject.concat(RemoteObject.createImmutable(""),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s1))),RemoteObject.createImmutable(""),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s2))),RemoteObject.createImmutable(""),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s3))),RemoteObject.createImmutable(""),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s4))),RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 BA.debugLineNum = 62;BA.debugLine="CustomListView1.AddTextItem(str, c.ID)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)((_str)),(Object)((_c.getField(true,"ID" /*RemoteObject*/ ))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnloadfile_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnLoadFIle_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("btnloadfile_click")) { return __ref.runUserSub(false, "b4xmainpage","btnloadfile_click", __ref);}
 BA.debugLineNum = 202;BA.debugLine="Private Sub btnLoadFIle_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 203;BA.debugLine="loadFile";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_loadfile" /*RemoteObject*/ );
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsavefile_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSaveFile_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,185);
if (RapidSub.canDelegate("btnsavefile_click")) { return __ref.runUserSub(false, "b4xmainpage","btnsavefile_click", __ref);}
 BA.debugLineNum = 185;BA.debugLine="Private Sub btnSaveFile_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 186;BA.debugLine="saveFile";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_savefile" /*RemoteObject*/ );
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Type Customer(ID As String, FirstName As String,";
;
 //BA.debugLineNum = 12;BA.debugLine="Private Customers As List";
b4xmainpage._customers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_customers",b4xmainpage._customers);
 //BA.debugLineNum = 13;BA.debugLine="Private CustomListView1 As CustomListView";
b4xmainpage._customlistview1 = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_customlistview1",b4xmainpage._customlistview1);
 //BA.debugLineNum = 14;BA.debugLine="Private txtFirstName As B4XFloatTextField";
b4xmainpage._txtfirstname = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtfirstname",b4xmainpage._txtfirstname);
 //BA.debugLineNum = 15;BA.debugLine="Private txtID As B4XFloatTextField";
b4xmainpage._txtid = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtid",b4xmainpage._txtid);
 //BA.debugLineNum = 16;BA.debugLine="Private txtLastName As B4XFloatTextField";
b4xmainpage._txtlastname = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtlastname",b4xmainpage._txtlastname);
 //BA.debugLineNum = 17;BA.debugLine="Private txtPhone As B4XFloatTextField";
b4xmainpage._txtphone = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtphone",b4xmainpage._txtphone);
 //BA.debugLineNum = 18;BA.debugLine="Private dialog As B4XDialog";
b4xmainpage._dialog = RemoteObject.createNew ("b4j.example.b4xdialog");__ref.setField("_dialog",b4xmainpage._dialog);
 //BA.debugLineNum = 20;BA.debugLine="Private kvsFile  As KeyValueStore";
b4xmainpage._kvsfile = RemoteObject.createNew ("b4j.example.keyvaluestore");__ref.setField("_kvsfile",b4xmainpage._kvsfile);
 //BA.debugLineNum = 21;BA.debugLine="Private btnLoadFIle As Button";
b4xmainpage._btnloadfile = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnloadfile",b4xmainpage._btnloadfile);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createlist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("createList (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("createlist")) { return __ref.runUserSub(false, "b4xmainpage","createlist", __ref);}
RemoteObject _cust = RemoteObject.declareNull("b4j.example.b4xmainpage._customer");
 BA.debugLineNum = 133;BA.debugLine="Private Sub createList";
Debug.ShouldStop(16);
 BA.debugLineNum = 134;BA.debugLine="Private cust As Customer";
Debug.ShouldStop(32);
_cust = RemoteObject.createNew ("b4j.example.b4xmainpage._customer");Debug.locals.put("cust", _cust);
 BA.debugLineNum = 135;BA.debugLine="cust.Initialize";
Debug.ShouldStop(64);
_cust.runVoidMethod ("Initialize");
 BA.debugLineNum = 136;BA.debugLine="cust.ID = \"A3473\"";
Debug.ShouldStop(128);
_cust.setField ("ID" /*RemoteObject*/ ,BA.ObjectToString("A3473"));
 BA.debugLineNum = 137;BA.debugLine="cust.FirstName = \"John\"";
Debug.ShouldStop(256);
_cust.setField ("FirstName" /*RemoteObject*/ ,BA.ObjectToString("John"));
 BA.debugLineNum = 138;BA.debugLine="cust.LastName = \"Smith\"";
Debug.ShouldStop(512);
_cust.setField ("LastName" /*RemoteObject*/ ,BA.ObjectToString("Smith"));
 BA.debugLineNum = 139;BA.debugLine="cust.Phone = \"4563454\"";
Debug.ShouldStop(1024);
_cust.setField ("Phone" /*RemoteObject*/ ,BA.ObjectToString("4563454"));
 BA.debugLineNum = 140;BA.debugLine="Customers.Add(cust)";
Debug.ShouldStop(2048);
__ref.getField(false,"_customers" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cust)));
 BA.debugLineNum = 142;BA.debugLine="Private cust As Customer";
Debug.ShouldStop(8192);
_cust = RemoteObject.createNew ("b4j.example.b4xmainpage._customer");Debug.locals.put("cust", _cust);
 BA.debugLineNum = 143;BA.debugLine="cust.Initialize";
Debug.ShouldStop(16384);
_cust.runVoidMethod ("Initialize");
 BA.debugLineNum = 144;BA.debugLine="cust.ID = \"X51462\"";
Debug.ShouldStop(32768);
_cust.setField ("ID" /*RemoteObject*/ ,BA.ObjectToString("X51462"));
 BA.debugLineNum = 145;BA.debugLine="cust.FirstName = \"Paraskevas\"";
Debug.ShouldStop(65536);
_cust.setField ("FirstName" /*RemoteObject*/ ,BA.ObjectToString("Paraskevas"));
 BA.debugLineNum = 146;BA.debugLine="cust.LastName = \"Xatjixaralampos\"";
Debug.ShouldStop(131072);
_cust.setField ("LastName" /*RemoteObject*/ ,BA.ObjectToString("Xatjixaralampos"));
 BA.debugLineNum = 147;BA.debugLine="cust.Phone = \"612978323\"";
Debug.ShouldStop(262144);
_cust.setField ("Phone" /*RemoteObject*/ ,BA.ObjectToString("612978323"));
 BA.debugLineNum = 148;BA.debugLine="Customers.Add(cust)";
Debug.ShouldStop(524288);
__ref.getField(false,"_customers" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cust)));
 BA.debugLineNum = 151;BA.debugLine="Private cust As Customer";
Debug.ShouldStop(4194304);
_cust = RemoteObject.createNew ("b4j.example.b4xmainpage._customer");Debug.locals.put("cust", _cust);
 BA.debugLineNum = 152;BA.debugLine="cust.Initialize";
Debug.ShouldStop(8388608);
_cust.runVoidMethod ("Initialize");
 BA.debugLineNum = 153;BA.debugLine="cust.ID = \"B1753\"";
Debug.ShouldStop(16777216);
_cust.setField ("ID" /*RemoteObject*/ ,BA.ObjectToString("B1753"));
 BA.debugLineNum = 154;BA.debugLine="cust.FirstName = \"Selim\"";
Debug.ShouldStop(33554432);
_cust.setField ("FirstName" /*RemoteObject*/ ,BA.ObjectToString("Selim"));
 BA.debugLineNum = 155;BA.debugLine="cust.LastName = \"Al Huarizmi\"";
Debug.ShouldStop(67108864);
_cust.setField ("LastName" /*RemoteObject*/ ,BA.ObjectToString("Al Huarizmi"));
 BA.debugLineNum = 156;BA.debugLine="cust.Phone = \"6532578\"";
Debug.ShouldStop(134217728);
_cust.setField ("Phone" /*RemoteObject*/ ,BA.ObjectToString("6532578"));
 BA.debugLineNum = 157;BA.debugLine="Customers.Add(cust)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_customers" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cust)));
 BA.debugLineNum = 159;BA.debugLine="Private cust As Customer";
Debug.ShouldStop(1073741824);
_cust = RemoteObject.createNew ("b4j.example.b4xmainpage._customer");Debug.locals.put("cust", _cust);
 BA.debugLineNum = 160;BA.debugLine="cust.Initialize";
Debug.ShouldStop(-2147483648);
_cust.runVoidMethod ("Initialize");
 BA.debugLineNum = 161;BA.debugLine="cust.ID = \"C6544\"";
Debug.ShouldStop(1);
_cust.setField ("ID" /*RemoteObject*/ ,BA.ObjectToString("C6544"));
 BA.debugLineNum = 162;BA.debugLine="cust.FirstName = \"Mateo\"";
Debug.ShouldStop(2);
_cust.setField ("FirstName" /*RemoteObject*/ ,BA.ObjectToString("Mateo"));
 BA.debugLineNum = 163;BA.debugLine="cust.LastName = \"Sandor\"";
Debug.ShouldStop(4);
_cust.setField ("LastName" /*RemoteObject*/ ,BA.ObjectToString("Sandor"));
 BA.debugLineNum = 164;BA.debugLine="cust.Phone = \"7345346\"";
Debug.ShouldStop(8);
_cust.setField ("Phone" /*RemoteObject*/ ,BA.ObjectToString("7345346"));
 BA.debugLineNum = 165;BA.debugLine="Customers.Add(cust)";
Debug.ShouldStop(16);
__ref.getField(false,"_customers" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cust)));
 BA.debugLineNum = 167;BA.debugLine="Private cust As Customer";
Debug.ShouldStop(64);
_cust = RemoteObject.createNew ("b4j.example.b4xmainpage._customer");Debug.locals.put("cust", _cust);
 BA.debugLineNum = 168;BA.debugLine="cust.Initialize";
Debug.ShouldStop(128);
_cust.runVoidMethod ("Initialize");
 BA.debugLineNum = 169;BA.debugLine="cust.ID = \"C6323\"";
Debug.ShouldStop(256);
_cust.setField ("ID" /*RemoteObject*/ ,BA.ObjectToString("C6323"));
 BA.debugLineNum = 170;BA.debugLine="cust.FirstName = \"Lucía\"";
Debug.ShouldStop(512);
_cust.setField ("FirstName" /*RemoteObject*/ ,BA.ObjectToString("Lucía"));
 BA.debugLineNum = 171;BA.debugLine="cust.LastName = \"Graham\"";
Debug.ShouldStop(1024);
_cust.setField ("LastName" /*RemoteObject*/ ,BA.ObjectToString("Graham"));
 BA.debugLineNum = 172;BA.debugLine="cust.Phone = \"1231345\"";
Debug.ShouldStop(2048);
_cust.setField ("Phone" /*RemoteObject*/ ,BA.ObjectToString("1231345"));
 BA.debugLineNum = 173;BA.debugLine="Customers.Add(cust)";
Debug.ShouldStop(4096);
__ref.getField(false,"_customers" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cust)));
 BA.debugLineNum = 175;BA.debugLine="Private cust As Customer";
Debug.ShouldStop(16384);
_cust = RemoteObject.createNew ("b4j.example.b4xmainpage._customer");Debug.locals.put("cust", _cust);
 BA.debugLineNum = 176;BA.debugLine="cust.Initialize";
Debug.ShouldStop(32768);
_cust.runVoidMethod ("Initialize");
 BA.debugLineNum = 177;BA.debugLine="cust.ID = \"F1462\"";
Debug.ShouldStop(65536);
_cust.setField ("ID" /*RemoteObject*/ ,BA.ObjectToString("F1462"));
 BA.debugLineNum = 178;BA.debugLine="cust.FirstName = \"Noam\"";
Debug.ShouldStop(131072);
_cust.setField ("FirstName" /*RemoteObject*/ ,BA.ObjectToString("Noam"));
 BA.debugLineNum = 179;BA.debugLine="cust.LastName = \"Bell\"";
Debug.ShouldStop(262144);
_cust.setField ("LastName" /*RemoteObject*/ ,BA.ObjectToString("Bell"));
 BA.debugLineNum = 180;BA.debugLine="cust.Phone = \"6978323\"";
Debug.ShouldStop(524288);
_cust.setField ("Phone" /*RemoteObject*/ ,BA.ObjectToString("6978323"));
 BA.debugLineNum = 181;BA.debugLine="Customers.Add(cust)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_customers" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cust)));
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _customlistview1_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CustomListView1_ItemClick (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("customlistview1_itemclick")) { return __ref.runUserSub(false, "b4xmainpage","customlistview1_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 91;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="deleteRecord(Index, Value)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_deleterecord" /*void*/ ,(Object)(_index),(Object)(_value));
 BA.debugLineNum = 93;BA.debugLine="Log(Index & \" \" & Value)";
Debug.ShouldStop(268435456);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(_index,RemoteObject.createImmutable(" "),_value)));
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _deleterecord(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("deleteRecord (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("deleterecord")) { __ref.runUserSub(false, "b4xmainpage","deleterecord", __ref, _index, _value); return;}
ResumableSub_deleteRecord rsub = new ResumableSub_deleteRecord(null,__ref,_index,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_deleteRecord extends BA.ResumableSub {
public ResumableSub_deleteRecord(b4j.example.b4xmainpage parent,RemoteObject __ref,RemoteObject _index,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _index;
RemoteObject _value;
RemoteObject _dlg = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("deleteRecord (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,98);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("index", _index);
Debug.locals.put("value", _value);
 BA.debugLineNum = 99;BA.debugLine="Dim dlg As Object";
Debug.ShouldStop(4);
_dlg = RemoteObject.createNew ("Object");Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 100;BA.debugLine="dlg = xui.Msgbox2Async(\"Do you want to delete Cus";
Debug.ShouldStop(8);
_dlg = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Do you want to delete Customer?")),(Object)(BA.ObjectToString("Warning")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 101;BA.debugLine="Wait for (dlg) Msgbox_Result (Result As Int)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "deleterecord"), _dlg);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 102;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 103;BA.debugLine="CustomListView1.RemoveAt(index)";
Debug.ShouldStop(64);
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(_index));
 BA.debugLineNum = 104;BA.debugLine="Customers.RemoveAt(index)";
Debug.ShouldStop(128);
__ref.getField(false,"_customers" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 105;BA.debugLine="kvsFile.Remove(value)";
Debug.ShouldStop(256);
__ref.getField(false,"_kvsfile" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_remove" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_value)));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 107;BA.debugLine="btnLoad_Click";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_btnload_click" /*RemoteObject*/ );
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
public static void  _msgbox_result(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadfile(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("loadFile (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,207);
if (RapidSub.canDelegate("loadfile")) { return __ref.runUserSub(false, "b4xmainpage","loadfile", __ref);}
RemoteObject _lstkeys = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _cust = RemoteObject.declareNull("b4j.example.b4xmainpage._customer");
 BA.debugLineNum = 207;BA.debugLine="Private Sub loadFile";
Debug.ShouldStop(16384);
 BA.debugLineNum = 208;BA.debugLine="kvsFile.Initialize(File.DirTemp & \"lesson18\", \"ex";
Debug.ShouldStop(32768);
__ref.getField(false,"_kvsfile" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirTemp"),RemoteObject.createImmutable("lesson18"))),(Object)(RemoteObject.createImmutable("ex1.dat")));
 BA.debugLineNum = 209;BA.debugLine="Private lstKeys As List = kvsFile.ListKeys";
Debug.ShouldStop(65536);
_lstkeys = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstkeys = __ref.getField(false,"_kvsfile" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_listkeys" /*RemoteObject*/ );Debug.locals.put("lstKeys", _lstkeys);Debug.locals.put("lstKeys", _lstkeys);
 BA.debugLineNum = 210;BA.debugLine="Customers.Initialize";
Debug.ShouldStop(131072);
__ref.getField(false,"_customers" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 211;BA.debugLine="For i = 0 To lstKeys.Size-1";
Debug.ShouldStop(262144);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_lstkeys.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 212;BA.debugLine="Private cust As Customer";
Debug.ShouldStop(524288);
_cust = RemoteObject.createNew ("b4j.example.b4xmainpage._customer");Debug.locals.put("cust", _cust);
 BA.debugLineNum = 213;BA.debugLine="cust = kvsFile.Get(lstKeys.Get(i))";
Debug.ShouldStop(1048576);
_cust = (__ref.getField(false,"_kvsfile" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_get" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_lstkeys.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))))));Debug.locals.put("cust", _cust);
 BA.debugLineNum = 214;BA.debugLine="Customers.Add(cust)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_customers" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cust)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 216;BA.debugLine="btnLoad_Click";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_btnload_click" /*RemoteObject*/ );
 BA.debugLineNum = 217;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logcustomer(RemoteObject __ref,RemoteObject _cust) throws Exception{
try {
		Debug.PushSubsStack("LogCustomer (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("logcustomer")) { return __ref.runUserSub(false, "b4xmainpage","logcustomer", __ref, _cust);}
Debug.locals.put("cust", _cust);
 BA.debugLineNum = 83;BA.debugLine="Private Sub LogCustomer(cust As Customer)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Log(cust.ID)";
Debug.ShouldStop(524288);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(_cust.getField(true,"ID" /*RemoteObject*/ )));
 BA.debugLineNum = 85;BA.debugLine="Log(cust.FirstName)";
Debug.ShouldStop(1048576);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(_cust.getField(true,"FirstName" /*RemoteObject*/ )));
 BA.debugLineNum = 86;BA.debugLine="Log(cust.LastName)";
Debug.ShouldStop(2097152);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(_cust.getField(true,"LastName" /*RemoteObject*/ )));
 BA.debugLineNum = 87;BA.debugLine="Log(cust.Phone)";
Debug.ShouldStop(4194304);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(_cust.getField(true,"Phone" /*RemoteObject*/ )));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savefile(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("saveFile (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("savefile")) { return __ref.runUserSub(false, "b4xmainpage","savefile", __ref);}
int _i = 0;
RemoteObject _savingcustomer = RemoteObject.declareNull("b4j.example.b4xmainpage._customer");
 BA.debugLineNum = 190;BA.debugLine="Private Sub saveFile";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 191;BA.debugLine="File.MakeDir(File.DirTemp, \"lesson18\")";
Debug.ShouldStop(1073741824);
b4xmainpage.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(RemoteObject.createImmutable("lesson18")));
 BA.debugLineNum = 192;BA.debugLine="kvsFile.Initialize(File.DirTemp & \"lesson18\", \"ex";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_kvsfile" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirTemp"),RemoteObject.createImmutable("lesson18"))),(Object)(RemoteObject.createImmutable("ex1.dat")));
 BA.debugLineNum = 193;BA.debugLine="Log(File. DirTemp  & \"lesson18\")";
Debug.ShouldStop(1);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirTemp"),RemoteObject.createImmutable("lesson18"))));
 BA.debugLineNum = 194;BA.debugLine="For i = 0 To Customers.Size - 1";
Debug.ShouldStop(2);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customers" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 195;BA.debugLine="Private savingCustomer As Customer";
Debug.ShouldStop(4);
_savingcustomer = RemoteObject.createNew ("b4j.example.b4xmainpage._customer");Debug.locals.put("savingCustomer", _savingcustomer);
 BA.debugLineNum = 196;BA.debugLine="savingCustomer = Customers.Get(i)";
Debug.ShouldStop(8);
_savingcustomer = (__ref.getField(false,"_customers" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("savingCustomer", _savingcustomer);
 BA.debugLineNum = 197;BA.debugLine="kvsFile.Put(savingCustomer.ID, savingCustomer)";
Debug.ShouldStop(16);
__ref.getField(false,"_kvsfile" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(_savingcustomer.getField(true,"ID" /*RemoteObject*/ )),(Object)((_savingcustomer)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}