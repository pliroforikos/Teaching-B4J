package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xbitset extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xbitset", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xbitset.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public int[] _data = null;
public int _msize = 0;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private data() As Int";
_data = new int[(int) (0)];
;
 //BA.debugLineNum = 7;BA.debugLine="Private mSize As Int";
_msize = 0;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public String  _clear() throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Public Sub Clear";
 //BA.debugLineNum = 57;BA.debugLine="Dim data(Bit.ShiftRight(mSize, 5) + 1) As Int";
_data = new int[(int) (__c.Bit.ShiftRight(_msize,(int) (5))+1)];
;
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public boolean  _get(int _index) throws Exception{
int _dindex = 0;
int _offset = 0;
int _blockvalue = 0;
 //BA.debugLineNum = 38;BA.debugLine="Public Sub Get(Index As Int) As Boolean";
 //BA.debugLineNum = 39;BA.debugLine="Dim dindex As Int = Bit.ShiftRight(Index, 5)";
_dindex = __c.Bit.ShiftRight(_index,(int) (5));
 //BA.debugLineNum = 40;BA.debugLine="Dim offset As Int = Bit.And(0x0000001f, Index)";
_offset = __c.Bit.And((int) (0x0000001f),_index);
 //BA.debugLineNum = 44;BA.debugLine="Dim BlockValue As Int = data(dindex)";
_blockvalue = _data[_dindex];
 //BA.debugLineNum = 46;BA.debugLine="Return Bit.And(BlockValue, Bit.ShiftLeft(1, offse";
if (true) return __c.Bit.And(_blockvalue,__c.Bit.ShiftLeft((int) (1),_offset))!=0;
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return false;
}
public int  _getsize() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Public Sub getSize As Int";
 //BA.debugLineNum = 50;BA.debugLine="Return mSize";
if (true) return _msize;
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,int _size) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize (Size As Int)";
 //BA.debugLineNum = 11;BA.debugLine="mSize = Size";
_msize = _size;
 //BA.debugLineNum = 12;BA.debugLine="Clear";
_clear();
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public String  _set(int _index,boolean _value) throws Exception{
int _dindex = 0;
int _offset = 0;
int _blockvalue = 0;
int _newblockvalue = 0;
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Set(Index As Int, Value As Boolean)";
 //BA.debugLineNum = 17;BA.debugLine="Dim dindex As Int = Bit.ShiftRight(Index, 5)";
_dindex = __c.Bit.ShiftRight(_index,(int) (5));
 //BA.debugLineNum = 18;BA.debugLine="Dim offset As Int = Bit.And(0x0000001f, Index)";
_offset = __c.Bit.And((int) (0x0000001f),_index);
 //BA.debugLineNum = 22;BA.debugLine="Dim BlockValue As Int = data(dindex)";
_blockvalue = _data[_dindex];
 //BA.debugLineNum = 24;BA.debugLine="Dim NewBlockValue As Int";
_newblockvalue = 0;
 //BA.debugLineNum = 25;BA.debugLine="If Value Then";
if (_value) { 
 //BA.debugLineNum = 26;BA.debugLine="NewBlockValue = Bit.Or(BlockValue, Bit.ShiftLeft";
_newblockvalue = __c.Bit.Or(_blockvalue,__c.Bit.ShiftLeft((int) (1),_offset));
 }else {
 //BA.debugLineNum = 28;BA.debugLine="NewBlockValue = Bit.And(BlockValue, Bit.Not(Bit.";
_newblockvalue = __c.Bit.And(_blockvalue,__c.Bit.Not(__c.Bit.ShiftLeft((int) (1),_offset)));
 };
 //BA.debugLineNum = 33;BA.debugLine="data(dindex) = NewBlockValue";
_data[_dindex] = _newblockvalue;
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
