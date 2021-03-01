package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class clscomputer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.clscomputer", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.clscomputer.class).invoke(this, new Object[] {null});
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
public String _strtype = "";
public String _strmodel = "";
public String _strcpu = "";
public float _fltprice = 0f;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _newcomputer(b4j.example.clscomputer __ref,String _tp,String _model,String _cpu,float _price) throws Exception{
__ref = this;
RDebugUtils.currentModule="clscomputer";
if (Debug.shouldDelegate(ba, "newcomputer", false))
	 {return ((String) Debug.delegate(ba, "newcomputer", new Object[] {_tp,_model,_cpu,_price}));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub newComputer(tp As String , model As Str";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="strType = tp";
__ref._strtype /*String*/  = _tp;
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="strModel = model";
__ref._strmodel /*String*/  = _model;
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="strCpu = cpu";
__ref._strcpu /*String*/  = _cpu;
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="fltPrice = price";
__ref._fltprice /*float*/  = _price;
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="End Sub";
return "";
}
public String  _showcomputer(b4j.example.clscomputer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clscomputer";
if (Debug.shouldDelegate(ba, "showcomputer", false))
	 {return ((String) Debug.delegate(ba, "showcomputer", null));}
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Public Sub showComputer";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Log(\"Type 		: \" & strType)";
__c.Log("Type 		: "+__ref._strtype /*String*/ );
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="Log(\"Model		: \" & strModel)";
__c.Log("Model		: "+__ref._strmodel /*String*/ );
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="Log(\"CPU		: \" & strCpu)";
__c.Log("CPU		: "+__ref._strcpu /*String*/ );
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="Log(\"Price		: \" & fltPrice)";
__c.Log("Price		: "+BA.NumberToString(__ref._fltprice /*float*/ ));
RDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.clscomputer __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clscomputer";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="strType = \"\"";
__ref._strtype /*String*/  = "";
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="strModel = \"\"";
__ref._strmodel /*String*/  = "";
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="strCpu = \"\"";
__ref._strcpu /*String*/  = "";
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="fltPrice = 0";
__ref._fltprice /*float*/  = (float) (0);
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="End Sub";
return "";
}
public String  _changecpu(b4j.example.clscomputer __ref,String _cpu) throws Exception{
__ref = this;
RDebugUtils.currentModule="clscomputer";
if (Debug.shouldDelegate(ba, "changecpu", false))
	 {return ((String) Debug.delegate(ba, "changecpu", new Object[] {_cpu}));}
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="public Sub changeCpu(cpu As String)";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="strCpu = cpu";
__ref._strcpu /*String*/  = _cpu;
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="End Sub";
return "";
}
public String  _changeprice(b4j.example.clscomputer __ref,float _price) throws Exception{
__ref = this;
RDebugUtils.currentModule="clscomputer";
if (Debug.shouldDelegate(ba, "changeprice", false))
	 {return ((String) Debug.delegate(ba, "changeprice", new Object[] {_price}));}
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="public Sub changePrice(price As Float)";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="fltPrice = price";
__ref._fltprice /*float*/  = _price;
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.clscomputer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clscomputer";
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="Public strType, strModel, strCpu As String";
_strtype = "";
_strmodel = "";
_strcpu = "";
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="Public fltPrice As Float";
_fltprice = 0f;
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="End Sub";
return "";
}
}