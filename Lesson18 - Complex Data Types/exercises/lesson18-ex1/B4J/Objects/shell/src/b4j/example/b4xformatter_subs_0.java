package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xformatter_subs_0 {


public static RemoteObject  _addformatdata(RemoteObject __ref,RemoteObject _data,RemoteObject _rangestart,RemoteObject _rangeend,RemoteObject _includeedges) throws Exception{
try {
		Debug.PushSubsStack("AddFormatData (b4xformatter) ","b4xformatter",30,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("addformatdata")) { return __ref.runUserSub(false, "b4xformatter","addformatdata", __ref, _data, _rangestart, _rangeend, _includeedges);}
RemoteObject _factor = RemoteObject.createImmutable(0);
Debug.locals.put("Data", _data);
Debug.locals.put("RangeStart", _rangestart);
Debug.locals.put("RangeEnd", _rangeend);
Debug.locals.put("IncludeEdges", _includeedges);
 BA.debugLineNum = 63;BA.debugLine="Public Sub AddFormatData (Data As B4XFormatData, R";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 64;BA.debugLine="Dim factor As Double = Power(10, -Data.MaximumFra";
Debug.JustUpdateDeviceLine();
_factor = b4xformatter.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, 10)),(Object)(BA.numberCast(double.class, -(double) (0 + _data.getField(true,"MaximumFractions" /*RemoteObject*/ ).<Integer>get().intValue()))));Debug.locals.put("factor", _factor);Debug.locals.put("factor", _factor);
 BA.debugLineNum = 65;BA.debugLine="If IncludeEdges = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_includeedges,b4xformatter.__c.getField(true,"False"))) { 
 BA.debugLineNum = 66;BA.debugLine="RangeStart = RangeStart + factor";
Debug.JustUpdateDeviceLine();
_rangestart = RemoteObject.solve(new RemoteObject[] {_rangestart,_factor}, "+",1, 0);Debug.locals.put("RangeStart", _rangestart);
 BA.debugLineNum = 67;BA.debugLine="RangeEnd = RangeEnd - factor";
Debug.JustUpdateDeviceLine();
_rangeend = RemoteObject.solve(new RemoteObject[] {_rangeend,_factor}, "-",1, 0);Debug.locals.put("RangeEnd", _rangeend);
 };
 BA.debugLineNum = 69;BA.debugLine="RangeStart = RangeStart - factor / 2";
Debug.JustUpdateDeviceLine();
_rangestart = RemoteObject.solve(new RemoteObject[] {_rangestart,_factor,RemoteObject.createImmutable(2)}, "-/",1, 0);Debug.locals.put("RangeStart", _rangestart);
 BA.debugLineNum = 70;BA.debugLine="RangeEnd = RangeEnd + factor / 2";
Debug.JustUpdateDeviceLine();
_rangeend = RemoteObject.solve(new RemoteObject[] {_rangeend,_factor,RemoteObject.createImmutable(2)}, "+/",1, 0);Debug.locals.put("RangeEnd", _rangeend);
 BA.debugLineNum = 71;BA.debugLine="Data.RangeStart = RangeStart";
Debug.JustUpdateDeviceLine();
_data.setField ("RangeStart" /*RemoteObject*/ ,_rangestart);
 BA.debugLineNum = 72;BA.debugLine="Data.RangeEnd = RangeEnd";
Debug.JustUpdateDeviceLine();
_data.setField ("RangeEnd" /*RemoteObject*/ ,_rangeend);
 BA.debugLineNum = 73;BA.debugLine="formats.Add(Data)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_formats" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_data)));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Type B4XFormatData (Prefix As String, Postfix As";
;
 //BA.debugLineNum = 6;BA.debugLine="Private formats As List";
b4xformatter._formats = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_formats",b4xformatter._formats);
 //BA.debugLineNum = 7;BA.debugLine="Public Const MAX_VALUE = 0x7fffffff, MIN_VALUE =";
b4xformatter._max_value = BA.numberCast(int.class, 0x7fffffff);__ref.setField("_max_value",b4xformatter._max_value);
b4xformatter._min_value = BA.numberCast(int.class, 0x80000000);__ref.setField("_min_value",b4xformatter._min_value);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI";
b4xformatter._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xformatter._xui);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _copyformatdata(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("CopyFormatData (b4xformatter) ","b4xformatter",30,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("copyformatdata")) { return __ref.runUserSub(false, "b4xformatter","copyformatdata", __ref, _data);}
RemoteObject _d = RemoteObject.declareNull("b4j.example.b4xformatter._b4xformatdata");
Debug.locals.put("Data", _data);
 BA.debugLineNum = 36;BA.debugLine="Public Sub CopyFormatData (Data As B4XFormatData)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="Dim d As B4XFormatData";
Debug.JustUpdateDeviceLine();
_d = RemoteObject.createNew ("b4j.example.b4xformatter._b4xformatdata");Debug.locals.put("d", _d);
 BA.debugLineNum = 38;BA.debugLine="d.Initialize";
Debug.JustUpdateDeviceLine();
_d.runVoidMethod ("Initialize");
 BA.debugLineNum = 39;BA.debugLine="d.DecimalPoint = Data.DecimalPoint";
Debug.JustUpdateDeviceLine();
_d.setField ("DecimalPoint" /*RemoteObject*/ ,_data.getField(true,"DecimalPoint" /*RemoteObject*/ ));
 BA.debugLineNum = 40;BA.debugLine="If Data.FormatFont.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_data.getField(false,"FormatFont" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 42;BA.debugLine="d.FormatFont = xui.CreateFont(Data.FormatFont.To";
Debug.JustUpdateDeviceLine();
_d.setField ("FormatFont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFont",(Object)((_data.getField(false,"FormatFont" /*RemoteObject*/ ).runMethod(false,"ToNativeFont").getObject())),(Object)(BA.numberCast(float.class, _data.getField(false,"FormatFont" /*RemoteObject*/ ).runMethod(true,"getSize")))));
 };
 BA.debugLineNum = 45;BA.debugLine="d.GroupingCharacter = Data.GroupingCharacter";
Debug.JustUpdateDeviceLine();
_d.setField ("GroupingCharacter" /*RemoteObject*/ ,_data.getField(true,"GroupingCharacter" /*RemoteObject*/ ));
 BA.debugLineNum = 46;BA.debugLine="d.MaximumFractions = Data.MaximumFractions";
Debug.JustUpdateDeviceLine();
_d.setField ("MaximumFractions" /*RemoteObject*/ ,_data.getField(true,"MaximumFractions" /*RemoteObject*/ ));
 BA.debugLineNum = 47;BA.debugLine="d.MinimumFractions = Data.MinimumFractions";
Debug.JustUpdateDeviceLine();
_d.setField ("MinimumFractions" /*RemoteObject*/ ,_data.getField(true,"MinimumFractions" /*RemoteObject*/ ));
 BA.debugLineNum = 48;BA.debugLine="d.MinimumIntegers = Data.MinimumIntegers";
Debug.JustUpdateDeviceLine();
_d.setField ("MinimumIntegers" /*RemoteObject*/ ,_data.getField(true,"MinimumIntegers" /*RemoteObject*/ ));
 BA.debugLineNum = 49;BA.debugLine="d.Postfix = Data.Postfix";
Debug.JustUpdateDeviceLine();
_d.setField ("Postfix" /*RemoteObject*/ ,_data.getField(true,"Postfix" /*RemoteObject*/ ));
 BA.debugLineNum = 50;BA.debugLine="d.Prefix = Data.Prefix";
Debug.JustUpdateDeviceLine();
_d.setField ("Prefix" /*RemoteObject*/ ,_data.getField(true,"Prefix" /*RemoteObject*/ ));
 BA.debugLineNum = 51;BA.debugLine="d.RangeEnd = Data.RangeEnd";
Debug.JustUpdateDeviceLine();
_d.setField ("RangeEnd" /*RemoteObject*/ ,_data.getField(true,"RangeEnd" /*RemoteObject*/ ));
 BA.debugLineNum = 52;BA.debugLine="d.RangeStart = Data.RangeStart";
Debug.JustUpdateDeviceLine();
_d.setField ("RangeStart" /*RemoteObject*/ ,_data.getField(true,"RangeStart" /*RemoteObject*/ ));
 BA.debugLineNum = 53;BA.debugLine="d.RemoveMinusSign = Data.RemoveMinusSign";
Debug.JustUpdateDeviceLine();
_d.setField ("RemoveMinusSign" /*RemoteObject*/ ,_data.getField(true,"RemoveMinusSign" /*RemoteObject*/ ));
 BA.debugLineNum = 54;BA.debugLine="d.TextColor = Data.TextColor";
Debug.JustUpdateDeviceLine();
_d.setField ("TextColor" /*RemoteObject*/ ,_data.getField(true,"TextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 55;BA.debugLine="d.FractionPaddingChar = Data.FractionPaddingChar";
Debug.JustUpdateDeviceLine();
_d.setField ("FractionPaddingChar" /*RemoteObject*/ ,_data.getField(true,"FractionPaddingChar" /*RemoteObject*/ ));
 BA.debugLineNum = 56;BA.debugLine="d.IntegerPaddingChar = Data.IntegerPaddingChar";
Debug.JustUpdateDeviceLine();
_d.setField ("IntegerPaddingChar" /*RemoteObject*/ ,_data.getField(true,"IntegerPaddingChar" /*RemoteObject*/ ));
 BA.debugLineNum = 57;BA.debugLine="Return d";
Debug.JustUpdateDeviceLine();
if (true) return _d;
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createdefaultformat(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateDefaultFormat (b4xformatter) ","b4xformatter",30,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("createdefaultformat")) { return __ref.runUserSub(false, "b4xformatter","createdefaultformat", __ref);}
RemoteObject _d = RemoteObject.declareNull("b4j.example.b4xformatter._b4xformatdata");
 BA.debugLineNum = 17;BA.debugLine="Private Sub CreateDefaultFormat As B4XFormatData";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 18;BA.debugLine="Dim d As B4XFormatData";
Debug.JustUpdateDeviceLine();
_d = RemoteObject.createNew ("b4j.example.b4xformatter._b4xformatdata");Debug.locals.put("d", _d);
 BA.debugLineNum = 19;BA.debugLine="d.Initialize";
Debug.JustUpdateDeviceLine();
_d.runVoidMethod ("Initialize");
 BA.debugLineNum = 20;BA.debugLine="d.GroupingCharacter = \",\"";
Debug.JustUpdateDeviceLine();
_d.setField ("GroupingCharacter" /*RemoteObject*/ ,BA.ObjectToString(","));
 BA.debugLineNum = 21;BA.debugLine="d.DecimalPoint = \".\"";
Debug.JustUpdateDeviceLine();
_d.setField ("DecimalPoint" /*RemoteObject*/ ,BA.ObjectToString("."));
 BA.debugLineNum = 22;BA.debugLine="d.MaximumFractions = 3";
Debug.JustUpdateDeviceLine();
_d.setField ("MaximumFractions" /*RemoteObject*/ ,BA.numberCast(int.class, 3));
 BA.debugLineNum = 23;BA.debugLine="d.MinimumIntegers = 1";
Debug.JustUpdateDeviceLine();
_d.setField ("MinimumIntegers" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 24;BA.debugLine="d.IntegerPaddingChar = \"0\"";
Debug.JustUpdateDeviceLine();
_d.setField ("IntegerPaddingChar" /*RemoteObject*/ ,BA.ObjectToString("0"));
 BA.debugLineNum = 25;BA.debugLine="d.FractionPaddingChar = \"0\"";
Debug.JustUpdateDeviceLine();
_d.setField ("FractionPaddingChar" /*RemoteObject*/ ,BA.ObjectToString("0"));
 BA.debugLineNum = 26;BA.debugLine="Return d";
Debug.JustUpdateDeviceLine();
if (true) return _d;
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _format(RemoteObject __ref,RemoteObject _number) throws Exception{
try {
		Debug.PushSubsStack("Format (b4xformatter) ","b4xformatter",30,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("format")) { return __ref.runUserSub(false, "b4xformatter","format", __ref, _number);}
RemoteObject _data = RemoteObject.declareNull("b4j.example.b4xformatter._b4xformatdata");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _numberstartindex = RemoteObject.createImmutable(0);
RemoteObject _factor = RemoteObject.createImmutable(0);
RemoteObject _whole = RemoteObject.createImmutable(0);
RemoteObject _frac = RemoteObject.createImmutable(0);
RemoteObject _g = RemoteObject.createImmutable(0);
RemoteObject _fracstartindex = RemoteObject.createImmutable(0);
RemoteObject _lastzerocount = RemoteObject.createImmutable(0);
RemoteObject _multipler = RemoteObject.createImmutable(0);
RemoteObject _w = RemoteObject.createImmutable(0);
Debug.locals.put("Number", _number);
 BA.debugLineNum = 90;BA.debugLine="Public Sub Format (Number As Double) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="If Number < MIN_VALUE Or Number > MAX_VALUE Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_number,BA.numberCast(double.class, __ref.getField(true,"_min_value" /*RemoteObject*/ ))) || RemoteObject.solveBoolean(">",_number,BA.numberCast(double.class, __ref.getField(true,"_max_value" /*RemoteObject*/ )))) { 
if (true) return BA.ObjectToString("OVERFLOW");};
 BA.debugLineNum = 92;BA.debugLine="Dim data As B4XFormatData = GetFormatData (Number";
Debug.JustUpdateDeviceLine();
_data = __ref.runClassMethod (b4j.example.b4xformatter.class, "_getformatdata" /*RemoteObject*/ ,(Object)(_number));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 93;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 94;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 95;BA.debugLine="sb.Append(data.Prefix)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_data.getField(true,"Prefix" /*RemoteObject*/ )));
 BA.debugLineNum = 96;BA.debugLine="Dim NumberStartIndex As Int = sb.Length";
Debug.JustUpdateDeviceLine();
_numberstartindex = _sb.runMethod(true,"getLength");Debug.locals.put("NumberStartIndex", _numberstartindex);Debug.locals.put("NumberStartIndex", _numberstartindex);
 BA.debugLineNum = 97;BA.debugLine="Dim factor As Double = Power(10, -data.MaximumFra";
Debug.JustUpdateDeviceLine();
_factor = RemoteObject.solve(new RemoteObject[] {b4xformatter.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, 10)),(Object)(BA.numberCast(double.class, -(double) (0 + _data.getField(true,"MaximumFractions" /*RemoteObject*/ ).<Integer>get().intValue())-(double) (0 + 1)))),RemoteObject.createImmutable(5)}, "*",0, 0);Debug.locals.put("factor", _factor);Debug.locals.put("factor", _factor);
 BA.debugLineNum = 98;BA.debugLine="If Number < -factor And data.RemoveMinusSign = Fa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_number,BA.numberCast(double.class, -_factor.<Double>get().doubleValue())) && RemoteObject.solveBoolean("=",_data.getField(true,"RemoveMinusSign" /*RemoteObject*/ ),b4xformatter.__c.getField(true,"False"))) { 
 BA.debugLineNum = 99;BA.debugLine="sb.Append(\"-\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("-")));
 BA.debugLineNum = 100;BA.debugLine="NumberStartIndex = NumberStartIndex + 1";
Debug.JustUpdateDeviceLine();
_numberstartindex = RemoteObject.solve(new RemoteObject[] {_numberstartindex,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NumberStartIndex", _numberstartindex);
 };
 BA.debugLineNum = 102;BA.debugLine="Number = Abs(Number) + factor";
Debug.JustUpdateDeviceLine();
_number = RemoteObject.solve(new RemoteObject[] {b4xformatter.__c.runMethod(true,"Abs",(Object)(_number)),_factor}, "+",1, 0);Debug.locals.put("Number", _number);
 BA.debugLineNum = 103;BA.debugLine="Dim whole As Int = Number";
Debug.JustUpdateDeviceLine();
_whole = BA.numberCast(int.class, _number);Debug.locals.put("whole", _whole);Debug.locals.put("whole", _whole);
 BA.debugLineNum = 104;BA.debugLine="Dim frac As Double = Number - whole";
Debug.JustUpdateDeviceLine();
_frac = RemoteObject.solve(new RemoteObject[] {_number,_whole}, "-",1, 0);Debug.locals.put("frac", _frac);Debug.locals.put("frac", _frac);
 BA.debugLineNum = 105;BA.debugLine="Dim g As Int";
Debug.JustUpdateDeviceLine();
_g = RemoteObject.createImmutable(0);Debug.locals.put("g", _g);
 BA.debugLineNum = 106;BA.debugLine="Do While whole > 0";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean(">",_whole,BA.numberCast(double.class, 0))) {
 BA.debugLineNum = 107;BA.debugLine="If g > 0 And g Mod 3 = 0 And data.GroupingCharac";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_g,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_g,RemoteObject.createImmutable(3)}, "%",0, 1),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",_data.getField(true,"GroupingCharacter" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 108;BA.debugLine="sb.Insert(NumberStartIndex, data.GroupingCharac";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Insert",(Object)(_numberstartindex),(Object)(_data.getField(true,"GroupingCharacter" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 110;BA.debugLine="g = g + 1";
Debug.JustUpdateDeviceLine();
_g = RemoteObject.solve(new RemoteObject[] {_g,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("g", _g);
 BA.debugLineNum = 111;BA.debugLine="sb.Insert(NumberStartIndex, whole Mod 10)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Insert",(Object)(_numberstartindex),(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_whole,RemoteObject.createImmutable(10)}, "%",0, 1))));
 BA.debugLineNum = 112;BA.debugLine="whole = whole / 10";
Debug.JustUpdateDeviceLine();
_whole = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_whole,RemoteObject.createImmutable(10)}, "/",0, 0));Debug.locals.put("whole", _whole);
 }
;
 BA.debugLineNum = 114;BA.debugLine="Do While sb.Length - NumberStartIndex < data.Mini";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),_numberstartindex}, "-",1, 1),BA.numberCast(double.class, _data.getField(true,"MinimumIntegers" /*RemoteObject*/ )))) {
 BA.debugLineNum = 115;BA.debugLine="sb.Insert(NumberStartIndex, data.IntegerPaddingC";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Insert",(Object)(_numberstartindex),(Object)(_data.getField(true,"IntegerPaddingChar" /*RemoteObject*/ )));
 }
;
 BA.debugLineNum = 117;BA.debugLine="If data.MaximumFractions > 0 And (data.MinimumFra";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_data.getField(true,"MaximumFractions" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_data.getField(true,"MinimumFractions" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_frac,BA.numberCast(double.class, 0)))))) { 
 BA.debugLineNum = 118;BA.debugLine="Dim FracStartIndex As Int = sb.Length";
Debug.JustUpdateDeviceLine();
_fracstartindex = _sb.runMethod(true,"getLength");Debug.locals.put("FracStartIndex", _fracstartindex);Debug.locals.put("FracStartIndex", _fracstartindex);
 BA.debugLineNum = 119;BA.debugLine="Dim LastZeroCount As Int";
Debug.JustUpdateDeviceLine();
_lastzerocount = RemoteObject.createImmutable(0);Debug.locals.put("LastZeroCount", _lastzerocount);
 BA.debugLineNum = 120;BA.debugLine="Dim Multipler As Int = 10";
Debug.JustUpdateDeviceLine();
_multipler = BA.numberCast(int.class, 10);Debug.locals.put("Multipler", _multipler);Debug.locals.put("Multipler", _multipler);
 BA.debugLineNum = 121;BA.debugLine="Do While frac >= 2 * factor And sb.Length - Frac";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("g",_frac,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_factor}, "*",0, 0)) && RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),_fracstartindex}, "-",1, 1),BA.numberCast(double.class, _data.getField(true,"MaximumFractions" /*RemoteObject*/ )))) {
 BA.debugLineNum = 122;BA.debugLine="Dim w As Int = (frac * Multipler)";
Debug.JustUpdateDeviceLine();
_w = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {_frac,_multipler}, "*",0, 0)));Debug.locals.put("w", _w);Debug.locals.put("w", _w);
 BA.debugLineNum = 123;BA.debugLine="w = w Mod 10";
Debug.JustUpdateDeviceLine();
_w = RemoteObject.solve(new RemoteObject[] {_w,RemoteObject.createImmutable(10)}, "%",0, 1);Debug.locals.put("w", _w);
 BA.debugLineNum = 124;BA.debugLine="If w = 0 Then LastZeroCount = LastZeroCount + 1";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_w,BA.numberCast(double.class, 0))) { 
_lastzerocount = RemoteObject.solve(new RemoteObject[] {_lastzerocount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("LastZeroCount", _lastzerocount);}
else {
_lastzerocount = BA.numberCast(int.class, 0);Debug.locals.put("LastZeroCount", _lastzerocount);};
 BA.debugLineNum = 125;BA.debugLine="sb.Append(w)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(BA.NumberToString(_w)));
 BA.debugLineNum = 126;BA.debugLine="Multipler = Multipler * 10";
Debug.JustUpdateDeviceLine();
_multipler = RemoteObject.solve(new RemoteObject[] {_multipler,RemoteObject.createImmutable(10)}, "*",0, 1);Debug.locals.put("Multipler", _multipler);
 }
;
 BA.debugLineNum = 128;BA.debugLine="If data.FractionPaddingChar <> \"0\" And LastZeroC";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_data.getField(true,"FractionPaddingChar" /*RemoteObject*/ ),BA.ObjectToString("0")) && RemoteObject.solveBoolean(">",_lastzerocount,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 129;BA.debugLine="sb.Remove(sb.Length - LastZeroCount, sb.Length)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),_lastzerocount}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 130;BA.debugLine="LastZeroCount = 0";
Debug.JustUpdateDeviceLine();
_lastzerocount = BA.numberCast(int.class, 0);Debug.locals.put("LastZeroCount", _lastzerocount);
 };
 BA.debugLineNum = 132;BA.debugLine="Do While sb.Length - FracStartIndex < data.Minim";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),_fracstartindex}, "-",1, 1),BA.numberCast(double.class, _data.getField(true,"MinimumFractions" /*RemoteObject*/ )))) {
 BA.debugLineNum = 133;BA.debugLine="sb.Append(data.FractionPaddingChar)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_data.getField(true,"FractionPaddingChar" /*RemoteObject*/ )));
 BA.debugLineNum = 134;BA.debugLine="LastZeroCount = 0";
Debug.JustUpdateDeviceLine();
_lastzerocount = BA.numberCast(int.class, 0);Debug.locals.put("LastZeroCount", _lastzerocount);
 }
;
 BA.debugLineNum = 136;BA.debugLine="LastZeroCount = Min(LastZeroCount, sb.Length - F";
Debug.JustUpdateDeviceLine();
_lastzerocount = BA.numberCast(int.class, b4xformatter.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _lastzerocount)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),_fracstartindex,_data.getField(true,"MinimumFractions" /*RemoteObject*/ )}, "--",2, 1)))));Debug.locals.put("LastZeroCount", _lastzerocount);
 BA.debugLineNum = 137;BA.debugLine="If LastZeroCount > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_lastzerocount,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 138;BA.debugLine="sb.Remove(sb.Length - LastZeroCount, sb.Length)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),_lastzerocount}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 };
 BA.debugLineNum = 140;BA.debugLine="If sb.Length > FracStartIndex Then sb.Insert(Fra";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, _fracstartindex))) { 
_sb.runVoidMethod ("Insert",(Object)(_fracstartindex),(Object)(_data.getField(true,"DecimalPoint" /*RemoteObject*/ )));};
 };
 BA.debugLineNum = 142;BA.debugLine="sb.Append(data.Postfix)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_data.getField(true,"Postfix" /*RemoteObject*/ )));
 BA.debugLineNum = 143;BA.debugLine="Return sb.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _formatlabel(RemoteObject __ref,RemoteObject _number,RemoteObject _label) throws Exception{
try {
		Debug.PushSubsStack("FormatLabel (b4xformatter) ","b4xformatter",30,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("formatlabel")) { return __ref.runUserSub(false, "b4xformatter","formatlabel", __ref, _number, _label);}
RemoteObject _data = RemoteObject.declareNull("b4j.example.b4xformatter._b4xformatdata");
Debug.locals.put("Number", _number);
Debug.locals.put("Label", _label);
 BA.debugLineNum = 148;BA.debugLine="Public Sub FormatLabel (Number As Double, Label As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 149;BA.debugLine="Label.Text = Format(Number)";
Debug.JustUpdateDeviceLine();
_label.runMethod(true,"setText",__ref.runClassMethod (b4j.example.b4xformatter.class, "_format" /*RemoteObject*/ ,(Object)(_number)));
 BA.debugLineNum = 150;BA.debugLine="Dim data As B4XFormatData = GetFormatData(Number)";
Debug.JustUpdateDeviceLine();
_data = __ref.runClassMethod (b4j.example.b4xformatter.class, "_getformatdata" /*RemoteObject*/ ,(Object)(_number));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 151;BA.debugLine="If data.TextColor <> 0 Then Label.TextColor = dat";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_data.getField(true,"TextColor" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
_label.runMethod(true,"setTextColor",_data.getField(true,"TextColor" /*RemoteObject*/ ));};
 BA.debugLineNum = 152;BA.debugLine="If data.FormatFont.IsInitialized Then Label.Font";
Debug.JustUpdateDeviceLine();
if (_data.getField(false,"FormatFont" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_label.runMethod(false,"setFont",_data.getField(false,"FormatFont" /*RemoteObject*/ ));};
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdefaultformat(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetDefaultFormat (b4xformatter) ","b4xformatter",30,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("getdefaultformat")) { return __ref.runUserSub(false, "b4xformatter","getdefaultformat", __ref);}
 BA.debugLineNum = 76;BA.debugLine="Public Sub GetDefaultFormat As B4XFormatData";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 77;BA.debugLine="Return formats.Get(0)";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.getField(false,"_formats" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getformatdata(RemoteObject __ref,RemoteObject _number) throws Exception{
try {
		Debug.PushSubsStack("GetFormatData (b4xformatter) ","b4xformatter",30,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("getformatdata")) { return __ref.runUserSub(false, "b4xformatter","getformatdata", __ref, _number);}
int _i = 0;
RemoteObject _d = RemoteObject.declareNull("b4j.example.b4xformatter._b4xformatdata");
Debug.locals.put("Number", _number);
 BA.debugLineNum = 81;BA.debugLine="Public Sub GetFormatData (Number As Double) As B4X";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="For i = formats.Size - 1 To 1 Step - 1";
Debug.JustUpdateDeviceLine();
{
final int step1 = -1;
final int limit1 = 1;
_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_formats" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 83;BA.debugLine="Dim d As B4XFormatData = formats.Get(i)";
Debug.JustUpdateDeviceLine();
_d = (__ref.getField(false,"_formats" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 84;BA.debugLine="If Number <= d.RangeEnd And Number >= d.RangeSta";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_number,_d.getField(true,"RangeEnd" /*RemoteObject*/ )) && RemoteObject.solveBoolean("g",_number,_d.getField(true,"RangeStart" /*RemoteObject*/ ))) { 
if (true) return _d;};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 86;BA.debugLine="Return formats.Get(0)";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.getField(false,"_formats" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (b4xformatter) ","b4xformatter",30,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xformatter","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _d = RemoteObject.declareNull("b4j.example.b4xformatter._b4xformatdata");
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 12;BA.debugLine="formats.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_formats" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 13;BA.debugLine="Dim d As B4XFormatData = CreateDefaultFormat";
Debug.JustUpdateDeviceLine();
_d = __ref.runClassMethod (b4j.example.b4xformatter.class, "_createdefaultformat" /*RemoteObject*/ );Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 14;BA.debugLine="AddFormatData(d, MIN_VALUE, MAX_VALUE, True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xformatter.class, "_addformatdata" /*RemoteObject*/ ,(Object)(_d),(Object)(BA.numberCast(double.class, __ref.getField(true,"_min_value" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_max_value" /*RemoteObject*/ ))),(Object)(b4xformatter.__c.getField(true,"True")));
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newformatdata(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NewFormatData (b4xformatter) ","b4xformatter",30,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("newformatdata")) { return __ref.runUserSub(false, "b4xformatter","newformatdata", __ref);}
 BA.debugLineNum = 30;BA.debugLine="Public Sub NewFormatData As B4XFormatData";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 31;BA.debugLine="Return CopyFormatData(GetDefaultFormat)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.b4xformatter.class, "_copyformatdata" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ )));
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
}