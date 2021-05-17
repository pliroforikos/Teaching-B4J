package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class phone extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.phone", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.phone.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _strname = "";
public String _strscreensize = "";
public int _intmemory = 0;
public int _fltram = 0;
public String _strcpu = "";
public int _intamount = 0;
public String _stros = "";
public float _fltprice = 0f;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _initialize(b4j.example.phone __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="phone";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="strName = \"\"";
__ref._strname /*String*/  = "";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="strScreenSize  = \"\"";
__ref._strscreensize /*String*/  = "";
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="intMemory  = 0";
__ref._intmemory /*int*/  = (int) (0);
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="fltRAM  = 0";
__ref._fltram /*int*/  = (int) (0);
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="strCPU = \"\"";
__ref._strcpu /*String*/  = "";
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="intAmount = 0";
__ref._intamount /*int*/  = (int) (0);
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="strOS = \"\"";
__ref._stros /*String*/  = "";
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="fltPrice = 0";
__ref._fltprice /*float*/  = (float) (0);
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="End Sub";
return "";
}
public String  _newphone(b4j.example.phone __ref,String _name,String _scrsize,int _mem,int _ram,String _cpu,int _amount,String _os,float _price) throws Exception{
__ref = this;
RDebugUtils.currentModule="phone";
if (Debug.shouldDelegate(ba, "newphone", false))
	 {return ((String) Debug.delegate(ba, "newphone", new Object[] {_name,_scrsize,_mem,_ram,_cpu,_amount,_os,_price}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub newPhone(name As String, scrSize As Str";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="strName = name";
__ref._strname /*String*/  = _name;
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="strScreenSize  = scrSize";
__ref._strscreensize /*String*/  = _scrsize;
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="intMemory  = mem";
__ref._intmemory /*int*/  = _mem;
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="fltRAM  = ram";
__ref._fltram /*int*/  = _ram;
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="strCPU = cpu";
__ref._strcpu /*String*/  = _cpu;
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="intAmount = amount";
__ref._intamount /*int*/  = _amount;
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="strOS = OS";
__ref._stros /*String*/  = _os;
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="fltPrice = price";
__ref._fltprice /*float*/  = _price;
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="End Sub";
return "";
}
public String  _btnsell_click(b4j.example.phone __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phone";
if (Debug.shouldDelegate(ba, "btnsell_click", false))
	 {return ((String) Debug.delegate(ba, "btnsell_click", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub btnSell_Click";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.phone __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phone";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Public strName As String";
_strname = "";
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Public strScreenSize As String";
_strscreensize = "";
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Public intMemory As Int";
_intmemory = 0;
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Public fltRAM As Int";
_fltram = 0;
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Public strCPU As String";
_strcpu = "";
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="Public intAmount As Int";
_intamount = 0;
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="Public strOS As String";
_stros = "";
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="Public fltPrice As Float";
_fltprice = 0f;
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="End Sub";
return "";
}
public String  _storage(b4j.example.phone __ref,int _amount) throws Exception{
__ref = this;
RDebugUtils.currentModule="phone";
if (Debug.shouldDelegate(ba, "storage", false))
	 {return ((String) Debug.delegate(ba, "storage", new Object[] {_amount}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub storage(amount As Int)";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="intAmount = intAmount - amount";
__ref._intamount /*int*/  = (int) (__ref._intamount /*int*/ -_amount);
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return "";
}
public String  _txtquantity_textchanged(b4j.example.phone __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="phone";
if (Debug.shouldDelegate(ba, "txtquantity_textchanged", false))
	 {return ((String) Debug.delegate(ba, "txtquantity_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub txtQuantity_TextChanged (Old As String";
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
}