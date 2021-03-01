package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xset extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xset", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xset.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.b4xorderedmap _map = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _add(Object _value) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Add(Value As Object)";
 //BA.debugLineNum = 10;BA.debugLine="map.Put(Value, \"\")";
_map._put /*String*/ (_value,(Object)(""));
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _aslist() throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Public Sub AsList As List";
 //BA.debugLineNum = 30;BA.debugLine="Return map.Keys";
if (true) return _map._getkeys /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private map As B4XOrderedMap";
_map = new b4j.example.b4xorderedmap();
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
public String  _clear() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Public Sub Clear";
 //BA.debugLineNum = 26;BA.debugLine="map.Clear";
_map._clear /*String*/ ();
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public boolean  _contains(Object _value) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Contains (Value As Object) As Boolean";
 //BA.debugLineNum = 18;BA.debugLine="Return map.ContainsKey(Value)";
if (true) return _map._containskey /*boolean*/ (_value);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return false;
}
public int  _getsize() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub getSize As Int";
 //BA.debugLineNum = 22;BA.debugLine="Return map.Size";
if (true) return _map._getsize /*int*/ ();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 5;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 6;BA.debugLine="map.Initialize";
_map._initialize /*String*/ (ba);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public String  _remove(Object _value) throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Remove(Value As Object)";
 //BA.debugLineNum = 14;BA.debugLine="map.Remove(Value)";
_map._remove /*String*/ (_value);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
