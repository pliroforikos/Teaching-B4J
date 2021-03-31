package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xmainpage", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _customer{
public boolean IsInitialized;
public String ID;
public String FirstName;
public String LastName;
public String Phone;
public void Initialize() {
IsInitialized = true;
ID = "";
FirstName = "";
LastName = "";
Phone = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.collections.List _customers = null;
public b4j.example.customlistview _customlistview1 = null;
public b4j.example.b4xfloattextfield _txtfirstname = null;
public b4j.example.b4xfloattextfield _txtid = null;
public b4j.example.b4xfloattextfield _txtlastname = null;
public b4j.example.b4xfloattextfield _txtphone = null;
public b4j.example.b4xdialog _dialog = null;
public b4j.example.keyvaluestore _kvsfile = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnloadfile = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _addspaces(b4j.example.b4xmainpage __ref,String _s1,int _pos) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "addspaces", false))
	 {return ((String) Debug.delegate(ba, "addspaces", new Object[] {_s1,_pos}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub addSpaces(s1 As String, pos As Int) As";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="If pos = 1 Then";
if (_pos==1) { 
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Do While s1.Length <= 8 Then";
while (_s1.length()<=8) {
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="s1 = s1 & \" \"";
_s1 = _s1+" ";
 }
;
 }else 
{RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="else if pos = 2 Or pos = 3 Then";
if (_pos==2 || _pos==3) { 
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="Do While s1.Length <= 20 Then";
while (_s1.length()<=20) {
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="s1 = s1 & \" \"";
_s1 = _s1+" ";
 }
;
 }}
;
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="Return s1";
if (true) return _s1;
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
int _i = 0;
b4j.example.b4xmainpage._customer _c = null;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Customers.Initialize";
__ref._customers /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="createList";
__ref._createlist /*String*/ (null);
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="For i = 0 To Customers.Size-1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._customers /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Private c As Customer";
_c = new b4j.example.b4xmainpage._customer();
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="c = Customers.Get(i)";
_c = (b4j.example.b4xmainpage._customer)(__ref._customers /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="LogCustomer(c)";
__ref._logcustomer /*String*/ (null,_c);
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="Log(\"---------------------------\")";
__c.Log("---------------------------");
 }
};
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="End Sub";
return "";
}
public String  _createlist(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createlist", false))
	 {return ((String) Debug.delegate(ba, "createlist", null));}
b4j.example.b4xmainpage._customer _cust = null;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub createList";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Private cust As Customer";
_cust = new b4j.example.b4xmainpage._customer();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="cust.Initialize";
_cust.Initialize();
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="cust.ID = \"A3473\"";
_cust.ID /*String*/  = "A3473";
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="cust.FirstName = \"John\"";
_cust.FirstName /*String*/  = "John";
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="cust.LastName = \"Smith\"";
_cust.LastName /*String*/  = "Smith";
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="cust.Phone = \"4563454\"";
_cust.Phone /*String*/  = "4563454";
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="Customers.Add(cust)";
__ref._customers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cust));
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="Private cust As Customer";
_cust = new b4j.example.b4xmainpage._customer();
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="cust.Initialize";
_cust.Initialize();
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="cust.ID = \"X51462\"";
_cust.ID /*String*/  = "X51462";
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="cust.FirstName = \"Paraskevas\"";
_cust.FirstName /*String*/  = "Paraskevas";
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="cust.LastName = \"Xatjixaralampos\"";
_cust.LastName /*String*/  = "Xatjixaralampos";
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="cust.Phone = \"612978323\"";
_cust.Phone /*String*/  = "612978323";
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="Customers.Add(cust)";
__ref._customers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cust));
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="Private cust As Customer";
_cust = new b4j.example.b4xmainpage._customer();
RDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="cust.Initialize";
_cust.Initialize();
RDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="cust.ID = \"B1753\"";
_cust.ID /*String*/  = "B1753";
RDebugUtils.currentLine=1048597;
 //BA.debugLineNum = 1048597;BA.debugLine="cust.FirstName = \"Selim\"";
_cust.FirstName /*String*/  = "Selim";
RDebugUtils.currentLine=1048598;
 //BA.debugLineNum = 1048598;BA.debugLine="cust.LastName = \"Al Huarizmi\"";
_cust.LastName /*String*/  = "Al Huarizmi";
RDebugUtils.currentLine=1048599;
 //BA.debugLineNum = 1048599;BA.debugLine="cust.Phone = \"6532578\"";
_cust.Phone /*String*/  = "6532578";
RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="Customers.Add(cust)";
__ref._customers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cust));
RDebugUtils.currentLine=1048602;
 //BA.debugLineNum = 1048602;BA.debugLine="Private cust As Customer";
_cust = new b4j.example.b4xmainpage._customer();
RDebugUtils.currentLine=1048603;
 //BA.debugLineNum = 1048603;BA.debugLine="cust.Initialize";
_cust.Initialize();
RDebugUtils.currentLine=1048604;
 //BA.debugLineNum = 1048604;BA.debugLine="cust.ID = \"C6544\"";
_cust.ID /*String*/  = "C6544";
RDebugUtils.currentLine=1048605;
 //BA.debugLineNum = 1048605;BA.debugLine="cust.FirstName = \"Mateo\"";
_cust.FirstName /*String*/  = "Mateo";
RDebugUtils.currentLine=1048606;
 //BA.debugLineNum = 1048606;BA.debugLine="cust.LastName = \"Sandor\"";
_cust.LastName /*String*/  = "Sandor";
RDebugUtils.currentLine=1048607;
 //BA.debugLineNum = 1048607;BA.debugLine="cust.Phone = \"7345346\"";
_cust.Phone /*String*/  = "7345346";
RDebugUtils.currentLine=1048608;
 //BA.debugLineNum = 1048608;BA.debugLine="Customers.Add(cust)";
__ref._customers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cust));
RDebugUtils.currentLine=1048610;
 //BA.debugLineNum = 1048610;BA.debugLine="Private cust As Customer";
_cust = new b4j.example.b4xmainpage._customer();
RDebugUtils.currentLine=1048611;
 //BA.debugLineNum = 1048611;BA.debugLine="cust.Initialize";
_cust.Initialize();
RDebugUtils.currentLine=1048612;
 //BA.debugLineNum = 1048612;BA.debugLine="cust.ID = \"C6323\"";
_cust.ID /*String*/  = "C6323";
RDebugUtils.currentLine=1048613;
 //BA.debugLineNum = 1048613;BA.debugLine="cust.FirstName = \"Lucía\"";
_cust.FirstName /*String*/  = "Lucía";
RDebugUtils.currentLine=1048614;
 //BA.debugLineNum = 1048614;BA.debugLine="cust.LastName = \"Graham\"";
_cust.LastName /*String*/  = "Graham";
RDebugUtils.currentLine=1048615;
 //BA.debugLineNum = 1048615;BA.debugLine="cust.Phone = \"1231345\"";
_cust.Phone /*String*/  = "1231345";
RDebugUtils.currentLine=1048616;
 //BA.debugLineNum = 1048616;BA.debugLine="Customers.Add(cust)";
__ref._customers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cust));
RDebugUtils.currentLine=1048618;
 //BA.debugLineNum = 1048618;BA.debugLine="Private cust As Customer";
_cust = new b4j.example.b4xmainpage._customer();
RDebugUtils.currentLine=1048619;
 //BA.debugLineNum = 1048619;BA.debugLine="cust.Initialize";
_cust.Initialize();
RDebugUtils.currentLine=1048620;
 //BA.debugLineNum = 1048620;BA.debugLine="cust.ID = \"F1462\"";
_cust.ID /*String*/  = "F1462";
RDebugUtils.currentLine=1048621;
 //BA.debugLineNum = 1048621;BA.debugLine="cust.FirstName = \"Noam\"";
_cust.FirstName /*String*/  = "Noam";
RDebugUtils.currentLine=1048622;
 //BA.debugLineNum = 1048622;BA.debugLine="cust.LastName = \"Bell\"";
_cust.LastName /*String*/  = "Bell";
RDebugUtils.currentLine=1048623;
 //BA.debugLineNum = 1048623;BA.debugLine="cust.Phone = \"6978323\"";
_cust.Phone /*String*/  = "6978323";
RDebugUtils.currentLine=1048624;
 //BA.debugLineNum = 1048624;BA.debugLine="Customers.Add(cust)";
__ref._customers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cust));
RDebugUtils.currentLine=1048625;
 //BA.debugLineNum = 1048625;BA.debugLine="End Sub";
return "";
}
public String  _logcustomer(b4j.example.b4xmainpage __ref,b4j.example.b4xmainpage._customer _cust) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "logcustomer", false))
	 {return ((String) Debug.delegate(ba, "logcustomer", new Object[] {_cust}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub LogCustomer(cust As Customer)";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Log(cust.ID)";
__c.Log(_cust.ID /*String*/ );
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Log(cust.FirstName)";
__c.Log(_cust.FirstName /*String*/ );
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Log(cust.LastName)";
__c.Log(_cust.LastName /*String*/ );
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="Log(cust.Phone)";
__c.Log(_cust.Phone /*String*/ );
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="End Sub";
return "";
}
public void  _btninsert_click(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btninsert_click", false))
	 {Debug.delegate(ba, "btninsert_click", null); return;}
ResumableSub_btnInsert_Click rsub = new ResumableSub_btnInsert_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnInsert_Click extends BA.ResumableSub {
public ResumableSub_btnInsert_Click(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _result = 0;
b4j.example.b4xmainpage._customer _newcustomer = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="dialog.Initialize(Root)";
__ref._dialog /*b4j.example.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="dialog.Title = \"Insert Customer\"";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = (Object)("Insert Customer");
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="p.SetLayoutAnimated(0,0,0, 350dip, 250dip)";
_p.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (350)),parent.__c.DipToCurrent((int) (250)));
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="p.LoadLayout(\"dlgInsertCustomer\")";
_p.LoadLayout("dlgInsertCustomer",ba);
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="dialog.PutAtTop = True";
__ref._dialog /*b4j.example.b4xdialog*/ ._putattop /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="Wait For (dialog.ShowCustom(p, \"OK\", \"\", \"Cancel\"";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "btninsert_click"), __ref._dialog /*b4j.example.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancel")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="Private newCustomer As Customer";
_newcustomer = new b4j.example.b4xmainpage._customer();
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="newCustomer.ID = txtID.Text";
_newcustomer.ID /*String*/  = __ref._txtid /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null);
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="newCustomer.FirstName = txtFirstName.Text";
_newcustomer.FirstName /*String*/  = __ref._txtfirstname /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null);
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="newCustomer.LastName = txtLastName.Text";
_newcustomer.LastName /*String*/  = __ref._txtlastname /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null);
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="newCustomer.Phone = txtPhone.Text";
_newcustomer.Phone /*String*/  = __ref._txtphone /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null);
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="Customers.Add(newCustomer)";
__ref._customers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_newcustomer));
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="btnLoad_Click";
__ref._btnload_click /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnload_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnload_click", false))
	 {return ((String) Debug.delegate(ba, "btnload_click", null));}
int _i = 0;
b4j.example.b4xmainpage._customer _c = null;
String _str = "";
String _s1 = "";
String _s2 = "";
String _s3 = "";
String _s4 = "";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub btnLoad_Click";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="If CustomListView1.IsInitialized Then";
if (__ref._customlistview1 /*b4j.example.customlistview*/ .IsInitialized()) { 
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4j.example.customlistview*/ ._clear();
 };
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="For i = 0 To Customers.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._customers /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="Private c As Customer";
_c = new b4j.example.b4xmainpage._customer();
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="Private str As String";
_str = "";
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="c = Customers.Get(i)";
_c = (b4j.example.b4xmainpage._customer)(__ref._customers /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="Private s1, s2, s3, s4 As String";
_s1 = "";
_s2 = "";
_s3 = "";
_s4 = "";
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="s1 = addSpaces(c.ID, 1)";
_s1 = __ref._addspaces /*String*/ (null,_c.ID /*String*/ ,(int) (1));
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="s2 = addSpaces(c.FirstName, 2)";
_s2 = __ref._addspaces /*String*/ (null,_c.FirstName /*String*/ ,(int) (2));
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="s3 = addSpaces(c.LastName, 3)";
_s3 = __ref._addspaces /*String*/ (null,_c.LastName /*String*/ ,(int) (3));
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="s4 = c.Phone";
_s4 = _c.Phone /*String*/ ;
RDebugUtils.currentLine=655374;
 //BA.debugLineNum = 655374;BA.debugLine="str = $\"${s1}${s2}${s3}${s4}\"$";
_str = (""+__c.SmartStringFormatter("",(Object)(_s1))+""+__c.SmartStringFormatter("",(Object)(_s2))+""+__c.SmartStringFormatter("",(Object)(_s3))+""+__c.SmartStringFormatter("",(Object)(_s4))+"");
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="CustomListView1.AddTextItem(str, c.ID)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._addtextitem((Object)(_str),(Object)(_c.ID /*String*/ ));
 }
};
RDebugUtils.currentLine=655377;
 //BA.debugLineNum = 655377;BA.debugLine="End Sub";
return "";
}
public String  _btnloadfile_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnloadfile_click", false))
	 {return ((String) Debug.delegate(ba, "btnloadfile_click", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub btnLoadFIle_Click";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="loadFile";
__ref._loadfile /*String*/ (null);
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public String  _loadfile(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "loadfile", false))
	 {return ((String) Debug.delegate(ba, "loadfile", null));}
anywheresoftware.b4a.objects.collections.List _lstkeys = null;
int _i = 0;
b4j.example.b4xmainpage._customer _cust = null;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub loadFile";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="kvsFile.Initialize(File.DirTemp & \"lesson18\", \"ex";
__ref._kvsfile /*b4j.example.keyvaluestore*/ ._initialize /*String*/ (null,ba,__c.File.getDirTemp()+"lesson18","ex1.dat");
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Private lstKeys As List = kvsFile.ListKeys";
_lstkeys = new anywheresoftware.b4a.objects.collections.List();
_lstkeys = __ref._kvsfile /*b4j.example.keyvaluestore*/ ._listkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="Customers.Initialize";
__ref._customers /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="For i = 0 To lstKeys.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_lstkeys.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="Private cust As Customer";
_cust = new b4j.example.b4xmainpage._customer();
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="cust = kvsFile.Get(lstKeys.Get(i))";
_cust = (b4j.example.b4xmainpage._customer)(__ref._kvsfile /*b4j.example.keyvaluestore*/ ._get /*Object*/ (null,BA.ObjectToString(_lstkeys.Get(_i))));
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="Customers.Add(cust)";
__ref._customers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cust));
 }
};
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="btnLoad_Click";
__ref._btnload_click /*String*/ (null);
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="End Sub";
return "";
}
public String  _btnsavefile_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnsavefile_click", false))
	 {return ((String) Debug.delegate(ba, "btnsavefile_click", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub btnSaveFile_Click";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="saveFile";
__ref._savefile /*String*/ (null);
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return "";
}
public String  _savefile(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "savefile", false))
	 {return ((String) Debug.delegate(ba, "savefile", null));}
int _i = 0;
b4j.example.b4xmainpage._customer _savingcustomer = null;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub saveFile";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="File.MakeDir(File.DirTemp, \"lesson18\")";
__c.File.MakeDir(__c.File.getDirTemp(),"lesson18");
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="kvsFile.Initialize(File.DirTemp & \"lesson18\", \"ex";
__ref._kvsfile /*b4j.example.keyvaluestore*/ ._initialize /*String*/ (null,ba,__c.File.getDirTemp()+"lesson18","ex1.dat");
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Log(File. DirTemp  & \"lesson18\")";
__c.Log(__c.File.getDirTemp()+"lesson18");
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="For i = 0 To Customers.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._customers /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="Private savingCustomer As Customer";
_savingcustomer = new b4j.example.b4xmainpage._customer();
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="savingCustomer = Customers.Get(i)";
_savingcustomer = (b4j.example.b4xmainpage._customer)(__ref._customers /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="kvsFile.Put(savingCustomer.ID, savingCustomer)";
__ref._kvsfile /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,_savingcustomer.ID /*String*/ ,(Object)(_savingcustomer));
 }
};
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Type Customer(ID As String, FirstName As String,";
;
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private Customers As List";
_customers = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private CustomListView1 As CustomListView";
_customlistview1 = new b4j.example.customlistview();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private txtFirstName As B4XFloatTextField";
_txtfirstname = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Private txtID As B4XFloatTextField";
_txtid = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Private txtLastName As B4XFloatTextField";
_txtlastname = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="Private txtPhone As B4XFloatTextField";
_txtphone = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="Private dialog As B4XDialog";
_dialog = new b4j.example.b4xdialog();
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="Private kvsFile  As KeyValueStore";
_kvsfile = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="Private btnLoadFIle As Button";
_btnloadfile = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="End Sub";
return "";
}
public String  _customlistview1_itemclick(b4j.example.b4xmainpage __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "customlistview1_itemclick", false))
	 {return ((String) Debug.delegate(ba, "customlistview1_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="deleteRecord(Index, Value)";
__ref._deleterecord /*void*/ (null,_index,_value);
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Log(Index & \" \" & Value)";
__c.Log(BA.NumberToString(_index)+" "+BA.ObjectToString(_value));
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="End Sub";
return "";
}
public void  _deleterecord(b4j.example.b4xmainpage __ref,int _index,Object _value) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "deleterecord", false))
	 {Debug.delegate(ba, "deleterecord", new Object[] {_index,_value}); return;}
ResumableSub_deleteRecord rsub = new ResumableSub_deleteRecord(this,__ref,_index,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_deleteRecord extends BA.ResumableSub {
public ResumableSub_deleteRecord(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,int _index,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this._value = _value;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
int _index;
Object _value;
Object _dlg = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Dim dlg As Object";
_dlg = new Object();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="dlg = xui.Msgbox2Async(\"Do you want to delete Cus";
_dlg = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"Do you want to delete Customer?","Warning","Yes","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Wait for (dlg) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "deleterecord"), _dlg);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="CustomListView1.RemoveAt(index)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._removeat(_index);
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Customers.RemoveAt(index)";
__ref._customers /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="kvsFile.Remove(value)";
__ref._kvsfile /*b4j.example.keyvaluestore*/ ._remove /*String*/ (null,BA.ObjectToString(_value));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="btnLoad_Click";
__ref._btnload_click /*String*/ (null);
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
}