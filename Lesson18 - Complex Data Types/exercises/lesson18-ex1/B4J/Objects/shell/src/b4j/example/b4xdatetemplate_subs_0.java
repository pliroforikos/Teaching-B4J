package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xdatetemplate_subs_0 {


public static RemoteObject  _btnmonth_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnMonth_Click (b4xdatetemplate) ","b4xdatetemplate",15,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("btnmonth_click")) { return __ref.runUserSub(false, "b4xdatetemplate","btnmonth_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _m = RemoteObject.createImmutable(0);
 BA.debugLineNum = 151;BA.debugLine="Private Sub btnMonth_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 152;BA.debugLine="Dim btn As B4XView = Sender";
Debug.JustUpdateDeviceLine();
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), b4xdatetemplate.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);
 BA.debugLineNum = 153;BA.debugLine="Dim m As Int = 12 + month - 1 + btn.Tag";
Debug.JustUpdateDeviceLine();
_m = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(12),__ref.getField(true,"_month" /*RemoteObject*/ ),RemoteObject.createImmutable(1),BA.numberCast(double.class, _btn.runMethod(false,"getTag"))}, "+-+",3, 0));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 154;BA.debugLine="month = (m Mod 12) + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_month" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(12)}, "%",0, 1)),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 155;BA.debugLine="DrawDays";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdatetemplate.class, "_drawdays" /*RemoteObject*/ );
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnyear_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnYear_Click (b4xdatetemplate) ","b4xdatetemplate",15,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("btnyear_click")) { return __ref.runUserSub(false, "b4xdatetemplate","btnyear_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 145;BA.debugLine="Private Sub btnYear_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="Dim btn As B4XView = Sender";
Debug.JustUpdateDeviceLine();
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), b4xdatetemplate.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);
 BA.debugLineNum = 147;BA.debugLine="year = year + btn.Tag";
Debug.JustUpdateDeviceLine();
__ref.setField ("_year" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_year" /*RemoteObject*/ ),BA.numberCast(double.class, _btn.runMethod(false,"getTag"))}, "+",1, 0)));
 BA.debugLineNum = 148;BA.debugLine="DrawDays";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdatetemplate.class, "_drawdays" /*RemoteObject*/ );
 BA.debugLineNum = 149;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
b4xdatetemplate._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xdatetemplate._xui);
 //BA.debugLineNum = 3;BA.debugLine="Private month, year As Int";
b4xdatetemplate._month = RemoteObject.createImmutable(0);__ref.setField("_month",b4xdatetemplate._month);
b4xdatetemplate._year = RemoteObject.createImmutable(0);__ref.setField("_year",b4xdatetemplate._year);
 //BA.debugLineNum = 4;BA.debugLine="Private boxW, boxH As Float";
b4xdatetemplate._boxw = RemoteObject.createImmutable(0f);__ref.setField("_boxw",b4xdatetemplate._boxw);
b4xdatetemplate._boxh = RemoteObject.createImmutable(0f);__ref.setField("_boxh",b4xdatetemplate._boxh);
 //BA.debugLineNum = 5;BA.debugLine="Private vCorrection As Float";
b4xdatetemplate._vcorrection = RemoteObject.createImmutable(0f);__ref.setField("_vcorrection",b4xdatetemplate._vcorrection);
 //BA.debugLineNum = 6;BA.debugLine="Private tempSelectedDay As Int";
b4xdatetemplate._tempselectedday = RemoteObject.createImmutable(0);__ref.setField("_tempselectedday",b4xdatetemplate._tempselectedday);
 //BA.debugLineNum = 7;BA.debugLine="Private dayOfWeekOffset As Int";
b4xdatetemplate._dayofweekoffset = RemoteObject.createImmutable(0);__ref.setField("_dayofweekoffset",b4xdatetemplate._dayofweekoffset);
 //BA.debugLineNum = 8;BA.debugLine="Private daysInMonth As Int";
b4xdatetemplate._daysinmonth = RemoteObject.createImmutable(0);__ref.setField("_daysinmonth",b4xdatetemplate._daysinmonth);
 //BA.debugLineNum = 9;BA.debugLine="Private DaysPaneBg As B4XView";
b4xdatetemplate._dayspanebg = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_dayspanebg",b4xdatetemplate._dayspanebg);
 //BA.debugLineNum = 10;BA.debugLine="Private DaysPaneFg As B4XView";
b4xdatetemplate._dayspanefg = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_dayspanefg",b4xdatetemplate._dayspanefg);
 //BA.debugLineNum = 11;BA.debugLine="Private cvs As B4XCanvas";
b4xdatetemplate._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvs",b4xdatetemplate._cvs);
 //BA.debugLineNum = 12;BA.debugLine="Private cvsBackground As B4XCanvas";
b4xdatetemplate._cvsbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvsbackground",b4xdatetemplate._cvsbackground);
 //BA.debugLineNum = 13;BA.debugLine="Private selectedDate As Long";
b4xdatetemplate._selecteddate = RemoteObject.createImmutable(0L);__ref.setField("_selecteddate",b4xdatetemplate._selecteddate);
 //BA.debugLineNum = 14;BA.debugLine="Private selectedYear, selectedMonth, selectedDay";
b4xdatetemplate._selectedyear = RemoteObject.createImmutable(0);__ref.setField("_selectedyear",b4xdatetemplate._selectedyear);
b4xdatetemplate._selectedmonth = RemoteObject.createImmutable(0);__ref.setField("_selectedmonth",b4xdatetemplate._selectedmonth);
b4xdatetemplate._selectedday = RemoteObject.createImmutable(0);__ref.setField("_selectedday",b4xdatetemplate._selectedday);
 //BA.debugLineNum = 15;BA.debugLine="Public HighlightedColor As Int = 0xFF001BBD";
b4xdatetemplate._highlightedcolor = BA.numberCast(int.class, 0xff001bbd);__ref.setField("_highlightedcolor",b4xdatetemplate._highlightedcolor);
 //BA.debugLineNum = 16;BA.debugLine="Public SelectedColor As Int = 0xFF0BA29B";
b4xdatetemplate._selectedcolor = BA.numberCast(int.class, 0xff0ba29b);__ref.setField("_selectedcolor",b4xdatetemplate._selectedcolor);
 //BA.debugLineNum = 17;BA.debugLine="Public DaysInMonthColor As Int = xui.Color_White";
b4xdatetemplate._daysinmonthcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White");__ref.setField("_daysinmonthcolor",b4xdatetemplate._daysinmonthcolor);
 //BA.debugLineNum = 18;BA.debugLine="Public DaysInWeekColor As Int = xui.Color_Gray";
b4xdatetemplate._daysinweekcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Gray");__ref.setField("_daysinweekcolor",b4xdatetemplate._daysinweekcolor);
 //BA.debugLineNum = 19;BA.debugLine="Private cvsDays As B4XCanvas";
b4xdatetemplate._cvsdays = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvsdays",b4xdatetemplate._cvsdays);
 //BA.debugLineNum = 20;BA.debugLine="Private DaysTitlesPane As B4XView";
b4xdatetemplate._daystitlespane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_daystitlespane",b4xdatetemplate._daystitlespane);
 //BA.debugLineNum = 21;BA.debugLine="Public FirstDay As Int = 0";
b4xdatetemplate._firstday = BA.numberCast(int.class, 0);__ref.setField("_firstday",b4xdatetemplate._firstday);
 //BA.debugLineNum = 22;BA.debugLine="Public MinYear = 1970, MaxYear = 2030 As Int";
b4xdatetemplate._minyear = BA.numberCast(int.class, 1970);__ref.setField("_minyear",b4xdatetemplate._minyear);
b4xdatetemplate._maxyear = BA.numberCast(int.class, 2030);__ref.setField("_maxyear",b4xdatetemplate._maxyear);
 //BA.debugLineNum = 23;BA.debugLine="Public btnMonthLeft As B4XView";
b4xdatetemplate._btnmonthleft = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnmonthleft",b4xdatetemplate._btnmonthleft);
 //BA.debugLineNum = 24;BA.debugLine="Public btnMonthRight As B4XView";
b4xdatetemplate._btnmonthright = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnmonthright",b4xdatetemplate._btnmonthright);
 //BA.debugLineNum = 25;BA.debugLine="Public btnYearLeft As B4XView";
b4xdatetemplate._btnyearleft = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnyearleft",b4xdatetemplate._btnyearleft);
 //BA.debugLineNum = 26;BA.debugLine="Public btnYearRight As B4XView";
b4xdatetemplate._btnyearright = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnyearright",b4xdatetemplate._btnyearright);
 //BA.debugLineNum = 27;BA.debugLine="Public lblMonth As B4XView";
b4xdatetemplate._lblmonth = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblmonth",b4xdatetemplate._lblmonth);
 //BA.debugLineNum = 28;BA.debugLine="Public lblYear As B4XView";
b4xdatetemplate._lblyear = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblyear",b4xdatetemplate._lblyear);
 //BA.debugLineNum = 29;BA.debugLine="Private pnlDialog As B4XView";
b4xdatetemplate._pnldialog = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnldialog",b4xdatetemplate._pnldialog);
 //BA.debugLineNum = 30;BA.debugLine="Private months As List";
b4xdatetemplate._months = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_months",b4xdatetemplate._months);
 //BA.debugLineNum = 31;BA.debugLine="Private mDialog As B4XDialog";
b4xdatetemplate._mdialog = RemoteObject.createNew ("b4j.example.b4xdialog");__ref.setField("_mdialog",b4xdatetemplate._mdialog);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dayspanefg_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("DaysPaneFg_Touch (b4xdatetemplate) ","b4xdatetemplate",15,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("dayspanefg_touch")) { return __ref.runUserSub(false, "b4xdatetemplate","dayspanefg_touch", __ref, _action, _x, _y);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 158;BA.debugLine="Private Sub DaysPaneFg_Touch (Action As Int, X As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 159;BA.debugLine="Dim p As B4XView = DaysPaneFg";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_dayspanefg" /*RemoteObject*/ );Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 160;BA.debugLine="HandleMouse(X, Y, Action <> p.TOUCH_ACTION_UP)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdatetemplate.class, "_handlemouse" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _x)),(Object)(BA.numberCast(double.class, _y)),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("!",_action,BA.numberCast(double.class, _p.getField(true,"TOUCH_ACTION_UP"))))));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("DialogClosed (b4xdatetemplate) ","b4xdatetemplate",15,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("dialogclosed")) { return __ref.runUserSub(false, "b4xdatetemplate","dialogclosed", __ref, _result);}
Debug.locals.put("Result", _result);
 BA.debugLineNum = 182;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawbox(RemoteObject __ref,RemoteObject _c,RemoteObject _clr,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("DrawBox (b4xdatetemplate) ","b4xdatetemplate",15,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("drawbox")) { return __ref.runUserSub(false, "b4xdatetemplate","drawbox", __ref, _c, _clr, _x, _y);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
Debug.locals.put("c", _c);
Debug.locals.put("clr", _clr);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 86;BA.debugLine="Private Sub DrawBox(c As B4XCanvas, clr As Int, x";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 87;BA.debugLine="Dim r As B4XRect";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("r", _r);
 BA.debugLineNum = 88;BA.debugLine="r.Initialize(x * boxW, y * boxH, x * boxW + boxW,";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_boxw" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_boxh" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_boxw" /*RemoteObject*/ ),__ref.getField(true,"_boxw" /*RemoteObject*/ )}, "*+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_boxh" /*RemoteObject*/ ),__ref.getField(true,"_boxh" /*RemoteObject*/ )}, "*+",1, 0))));
 BA.debugLineNum = 89;BA.debugLine="c.DrawRect(r, clr, True, 1dip)";
Debug.JustUpdateDeviceLine();
_c.runVoidMethod ("DrawRect",(Object)(_r),(Object)(_clr),(Object)(b4xdatetemplate.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, b4xdatetemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawdays(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawDays (b4xdatetemplate) ","b4xdatetemplate",15,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("drawdays")) { return __ref.runUserSub(false, "b4xdatetemplate","drawdays", __ref);}
RemoteObject _firstdayofmonth = RemoteObject.createImmutable(0L);
RemoteObject _daysfont = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
int _day = 0;
RemoteObject _row = RemoteObject.createImmutable(0);
 BA.debugLineNum = 57;BA.debugLine="Private Sub DrawDays";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="lblMonth.Text = months.Get(month - 1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblmonth" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(__ref.getField(false,"_months" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_month" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)))));
 BA.debugLineNum = 59;BA.debugLine="lblYear.Text = year";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblyear" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(__ref.getField(true,"_year" /*RemoteObject*/ )));
 BA.debugLineNum = 60;BA.debugLine="SetYearsButtonState";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdatetemplate.class, "_setyearsbuttonstate" /*RemoteObject*/ );
 BA.debugLineNum = 61;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 62;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 63;BA.debugLine="Dim firstDayOfMonth As Long = DateUtils.setDate(y";
Debug.JustUpdateDeviceLine();
_firstdayofmonth = RemoteObject.solve(new RemoteObject[] {b4xdatetemplate._dateutils.runMethod(true,"_setdate",(Object)(__ref.getField(true,"_year" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_month" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1))),RemoteObject.createImmutable(1)}, "-",1, 2);Debug.locals.put("firstDayOfMonth", _firstdayofmonth);Debug.locals.put("firstDayOfMonth", _firstdayofmonth);
 BA.debugLineNum = 64;BA.debugLine="dayOfWeekOffset = (7 + DateTime.GetDayOfWeek(firs";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dayofweekoffset" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(7),b4xdatetemplate.__c.getField(false,"DateTime").runMethod(true,"GetDayOfWeek",(Object)(_firstdayofmonth)),__ref.getField(true,"_firstday" /*RemoteObject*/ )}, "+-",2, 1)),RemoteObject.createImmutable(7)}, "%",0, 1));
 BA.debugLineNum = 65;BA.debugLine="daysInMonth = DateUtils.NumberOfDaysInMonth(month";
Debug.JustUpdateDeviceLine();
__ref.setField ("_daysinmonth" /*RemoteObject*/ ,b4xdatetemplate._dateutils.runMethod(true,"_numberofdaysinmonth",(Object)(__ref.getField(true,"_month" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_year" /*RemoteObject*/ ))));
 BA.debugLineNum = 66;BA.debugLine="If year = selectedYear And month = selectedMonth";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_year" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_selectedyear" /*RemoteObject*/ ))) && RemoteObject.solveBoolean("=",__ref.getField(true,"_month" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_selectedmonth" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 68;BA.debugLine="DrawBox(cvs, SelectedColor, (selectedDay - 1 + d";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdatetemplate.class, "_drawbox" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_selectedcolor" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedday" /*RemoteObject*/ ),RemoteObject.createImmutable(1),__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ )}, "-+",2, 1)),RemoteObject.createImmutable(7)}, "%",0, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedday" /*RemoteObject*/ ),RemoteObject.createImmutable(1),__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ )}, "-+",2, 1)),RemoteObject.createImmutable(7)}, "/",0, 0))));
 };
 BA.debugLineNum = 71;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
Debug.JustUpdateDeviceLine();
_daysfont = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
_daysfont = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 14)));Debug.locals.put("daysFont", _daysfont);Debug.locals.put("daysFont", _daysfont);
 BA.debugLineNum = 72;BA.debugLine="For day = 1 To daysInMonth";
Debug.JustUpdateDeviceLine();
{
final int step13 = 1;
final int limit13 = __ref.getField(true,"_daysinmonth" /*RemoteObject*/ ).<Integer>get().intValue();
_day = 1 ;
for (;(step13 > 0 && _day <= limit13) || (step13 < 0 && _day >= limit13) ;_day = ((int)(0 + _day + step13))  ) {
Debug.locals.put("day", _day);
 BA.debugLineNum = 73;BA.debugLine="Dim row As Int = (day - 1 + dayOfWeekOffset) / 7";
Debug.JustUpdateDeviceLine();
_row = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_day),RemoteObject.createImmutable(1),__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ )}, "-+",2, 1)),RemoteObject.createImmutable(7)}, "/",0, 0));Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 74;BA.debugLine="cvs.DrawText(day, (((dayOfWeekOffset + day - 1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawText",(Object)(BA.NumberToString(_day)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ ),RemoteObject.createImmutable(_day),RemoteObject.createImmutable(1)}, "+-",2, 1)),RemoteObject.createImmutable(7)}, "%",0, 1)),RemoteObject.createImmutable(0.5)}, "+",1, 0)),__ref.getField(true,"_boxw" /*RemoteObject*/ )}, "*",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(0.5)}, "+",1, 0)),__ref.getField(true,"_boxh" /*RemoteObject*/ ),__ref.getField(true,"_vcorrection" /*RemoteObject*/ )}, "*+",1, 0)),(Object)(_daysfont),(Object)(__ref.getField(true,"_daysinmonthcolor" /*RemoteObject*/ )),(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.text.TextAlignment"),RemoteObject.createImmutable("CENTER"))));
 }
}Debug.locals.put("day", _day);
;
 BA.debugLineNum = 77;BA.debugLine="cvsBackground.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 78;BA.debugLine="cvs.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getDate (b4xdatetemplate) ","b4xdatetemplate",15,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("getdate")) { return __ref.runUserSub(false, "b4xdatetemplate","getdate", __ref);}
 BA.debugLineNum = 93;BA.debugLine="Public Sub getDate As Long";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 94;BA.debugLine="Return selectedDate";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_selecteddate" /*RemoteObject*/ );
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref,RemoteObject _dialog) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (b4xdatetemplate) ","b4xdatetemplate",15,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "b4xdatetemplate","getpanel", __ref, _dialog);}
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 163;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 164;BA.debugLine="Return pnlDialog";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_pnldialog" /*RemoteObject*/ );
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handlemouse(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _move) throws Exception{
try {
		Debug.PushSubsStack("HandleMouse (b4xdatetemplate) ","b4xdatetemplate",15,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("handlemouse")) { return __ref.runUserSub(false, "b4xdatetemplate","handlemouse", __ref, _x, _y, _move);}
RemoteObject _boxx = RemoteObject.createImmutable(0);
RemoteObject _boxy = RemoteObject.createImmutable(0);
RemoteObject _newselectedday = RemoteObject.createImmutable(0);
RemoteObject _validday = RemoteObject.createImmutable(false);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("move", _move);
 BA.debugLineNum = 118;BA.debugLine="Private Sub HandleMouse(x As Double, y As Double,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="Dim boxX = x / boxW, boxY =  y / boxH As Int";
Debug.JustUpdateDeviceLine();
_boxx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_boxw" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("boxX", _boxx);Debug.locals.put("boxX", _boxx);
_boxy = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_boxh" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("boxY", _boxy);Debug.locals.put("boxY", _boxy);
 BA.debugLineNum = 120;BA.debugLine="Dim newSelectedDay As Int = boxY * 7 + boxX + 1 -";
Debug.JustUpdateDeviceLine();
_newselectedday = RemoteObject.solve(new RemoteObject[] {_boxy,RemoteObject.createImmutable(7),_boxx,RemoteObject.createImmutable(1),__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ )}, "*++-",3, 1);Debug.locals.put("newSelectedDay", _newselectedday);Debug.locals.put("newSelectedDay", _newselectedday);
 BA.debugLineNum = 121;BA.debugLine="Dim validDay As Boolean = newSelectedDay > 0 And";
Debug.JustUpdateDeviceLine();
_validday = BA.ObjectToBoolean(RemoteObject.solveBoolean(">",_newselectedday,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",_newselectedday,BA.numberCast(double.class, __ref.getField(true,"_daysinmonth" /*RemoteObject*/ ))));Debug.locals.put("validDay", _validday);Debug.locals.put("validDay", _validday);
 BA.debugLineNum = 122;BA.debugLine="If move Then";
Debug.JustUpdateDeviceLine();
if (_move.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 123;BA.debugLine="If newSelectedDay = tempSelectedDay Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_newselectedday,BA.numberCast(double.class, __ref.getField(true,"_tempselectedday" /*RemoteObject*/ )))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 124;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 125;BA.debugLine="tempSelectedDay = newSelectedDay";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tempselectedday" /*RemoteObject*/ ,_newselectedday);
 BA.debugLineNum = 126;BA.debugLine="If validDay Then";
Debug.JustUpdateDeviceLine();
if (_validday.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 127;BA.debugLine="DrawBox(cvsBackground, HighlightedColor, boxX,";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdatetemplate.class, "_drawbox" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_cvsbackground" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_highlightedcolor" /*RemoteObject*/ )),(Object)(_boxx),(Object)(_boxy));
 };
 }else {
 BA.debugLineNum = 130;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 131;BA.debugLine="If validDay Then";
Debug.JustUpdateDeviceLine();
if (_validday.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 132;BA.debugLine="SelectDay(newSelectedDay)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdatetemplate.class, "_selectday" /*RemoteObject*/ ,(Object)(_newselectedday));
 BA.debugLineNum = 133;BA.debugLine="Hide";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdatetemplate.class, "_hide" /*RemoteObject*/ );
 };
 };
 BA.debugLineNum = 137;BA.debugLine="cvsBackground.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (b4xdatetemplate) ","b4xdatetemplate",15,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "b4xdatetemplate","hide", __ref);}
 BA.debugLineNum = 140;BA.debugLine="Private Sub Hide";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 141;BA.debugLine="mDialog.Close(xui.DialogResponse_Positive)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_close" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xdatetemplate) ","b4xdatetemplate",15,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xdatetemplate","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 34;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="pnlDialog = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pnldialog" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 36;BA.debugLine="pnlDialog.SetLayoutAnimated(0, 0, 0, 320dip,300di";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnldialog" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, b4xdatetemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 320))))),(Object)(BA.numberCast(double.class, b4xdatetemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 37;BA.debugLine="pnlDialog.LoadLayout(\"DateTemplate\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnldialog" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("DateTemplate")),__ref.getField(false, "ba"));
 BA.debugLineNum = 38;BA.debugLine="pnlDialog.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnldialog" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 39;BA.debugLine="month = DateTime.GetMonth(DateTime.Now)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_month" /*RemoteObject*/ ,b4xdatetemplate.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(b4xdatetemplate.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 40;BA.debugLine="year = DateTime.GetYear(DateTime.Now)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_year" /*RemoteObject*/ ,b4xdatetemplate.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(b4xdatetemplate.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 41;BA.debugLine="months = DateUtils.GetMonthsNames";
Debug.JustUpdateDeviceLine();
__ref.setField ("_months" /*RemoteObject*/ ,b4xdatetemplate._dateutils.runMethod(false,"_getmonthsnames"));
 BA.debugLineNum = 42;BA.debugLine="selectedDate = DateTime.Now";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selecteddate" /*RemoteObject*/ ,b4xdatetemplate.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 43;BA.debugLine="setDate(selectedDate)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selecteddate" /*RemoteObject*/ )));
 BA.debugLineNum = 44;BA.debugLine="cvs.Initialize(DaysPaneFg)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_dayspanefg" /*RemoteObject*/ )));
 BA.debugLineNum = 45;BA.debugLine="cvsBackground.Initialize(DaysPaneBg)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_dayspanebg" /*RemoteObject*/ )));
 BA.debugLineNum = 46;BA.debugLine="boxW = cvs.TargetRect.Width / 7";
Debug.JustUpdateDeviceLine();
__ref.setField ("_boxw" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"),RemoteObject.createImmutable(7)}, "/",0, 0)));
 BA.debugLineNum = 47;BA.debugLine="boxH = cvs.TargetRect.Height / 6";
Debug.JustUpdateDeviceLine();
__ref.setField ("_boxh" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getHeight"),RemoteObject.createImmutable(6)}, "/",0, 0)));
 BA.debugLineNum = 48;BA.debugLine="vCorrection = 5dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vcorrection" /*RemoteObject*/ ,BA.numberCast(float.class, b4xdatetemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))));
 BA.debugLineNum = 49;BA.debugLine="cvsDays.Initialize(DaysTitlesPane)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvsdays" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_daystitlespane" /*RemoteObject*/ )));
 BA.debugLineNum = 51;BA.debugLine="Dim p As Pane = DaysPaneFg";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), __ref.getField(false,"_dayspanefg" /*RemoteObject*/ ).getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 52;BA.debugLine="Private fx As JFX";
Debug.JustUpdateDeviceLine();
_fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");Debug.locals.put("fx", _fx);
 BA.debugLineNum = 53;BA.debugLine="p.MouseCursor = fx.Cursors.HAND";
Debug.JustUpdateDeviceLine();
_p.runMethod(false,"setMouseCursor",_fx.getField(false,"Cursors").getField(false,"HAND"));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectday(RemoteObject __ref,RemoteObject _day) throws Exception{
try {
		Debug.PushSubsStack("SelectDay (b4xdatetemplate) ","b4xdatetemplate",15,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("selectday")) { return __ref.runUserSub(false, "b4xdatetemplate","selectday", __ref, _day);}
Debug.locals.put("day", _day);
 BA.debugLineNum = 110;BA.debugLine="Private Sub SelectDay(day As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 111;BA.debugLine="selectedDate = DateUtils.setDate(year, month, day";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selecteddate" /*RemoteObject*/ ,b4xdatetemplate._dateutils.runMethod(true,"_setdate",(Object)(__ref.getField(true,"_year" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_month" /*RemoteObject*/ )),(Object)(_day)));
 BA.debugLineNum = 112;BA.debugLine="selectedDay = day";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selectedday" /*RemoteObject*/ ,_day);
 BA.debugLineNum = 113;BA.debugLine="selectedMonth = month";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selectedmonth" /*RemoteObject*/ ,__ref.getField(true,"_month" /*RemoteObject*/ ));
 BA.debugLineNum = 114;BA.debugLine="selectedYear = year";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selectedyear" /*RemoteObject*/ ,__ref.getField(true,"_year" /*RemoteObject*/ ));
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdate(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("setDate (b4xdatetemplate) ","b4xdatetemplate",15,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("setdate")) { return __ref.runUserSub(false, "b4xdatetemplate","setdate", __ref, _date);}
Debug.locals.put("date", _date);
 BA.debugLineNum = 97;BA.debugLine="Public Sub setDate(date As Long)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="If lblYear.IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_lblyear" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),b4xdatetemplate.__c.getField(true,"False"))) { 
 BA.debugLineNum = 100;BA.debugLine="selectedDate = date";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selecteddate" /*RemoteObject*/ ,_date);
 BA.debugLineNum = 101;BA.debugLine="Return 'the date will be set after the layout is";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 103;BA.debugLine="year = DateTime.GetYear(date)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_year" /*RemoteObject*/ ,b4xdatetemplate.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_date)));
 BA.debugLineNum = 104;BA.debugLine="month = DateTime.GetMonth(date)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_month" /*RemoteObject*/ ,b4xdatetemplate.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_date)));
 BA.debugLineNum = 105;BA.debugLine="SelectDay(DateTime.GetDayOfMonth(date))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdatetemplate.class, "_selectday" /*RemoteObject*/ ,(Object)(b4xdatetemplate.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_date))));
 BA.debugLineNum = 106;BA.debugLine="lblYear.Text = year";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblyear" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(__ref.getField(true,"_year" /*RemoteObject*/ )));
 BA.debugLineNum = 107;BA.debugLine="lblMonth.Text = months.Get(month - 1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblmonth" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(__ref.getField(false,"_months" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_month" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)))));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setyearsbuttonstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetYearsButtonState (b4xdatetemplate) ","b4xdatetemplate",15,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("setyearsbuttonstate")) { return __ref.runUserSub(false, "b4xdatetemplate","setyearsbuttonstate", __ref);}
 BA.debugLineNum = 81;BA.debugLine="Private Sub SetYearsButtonState";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="btnYearLeft.Enabled = year > MinYear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnyearleft" /*RemoteObject*/ ).runMethod(true,"setEnabled",BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(true,"_year" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_minyear" /*RemoteObject*/ )))));
 BA.debugLineNum = 83;BA.debugLine="btnYearRight.Enabled = year < MaxYear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnyearright" /*RemoteObject*/ ).runMethod(true,"setEnabled",BA.ObjectToBoolean(RemoteObject.solveBoolean("<",__ref.getField(true,"_year" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_maxyear" /*RemoteObject*/ )))));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Show (b4xdatetemplate) ","b4xdatetemplate",15,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "b4xdatetemplate","show", __ref, _dialog); return;}
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
public ResumableSub_Show(b4j.example.b4xdatetemplate parent,RemoteObject __ref,RemoteObject _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xdatetemplate parent;
RemoteObject _dialog;
RemoteObject _days = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _daysfont = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
int _i = 0;
RemoteObject _d = RemoteObject.createImmutable("");
int step4;
int limit4;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (b4xdatetemplate) ","b4xdatetemplate",15,__ref.getField(false, "ba"),__ref,167);
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
 BA.debugLineNum = 168;BA.debugLine="Dim days As List = DateUtils.GetDaysNames";
Debug.JustUpdateDeviceLine();
_days = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_days = parent._dateutils.runMethod(false,"_getdaysnames");Debug.locals.put("days", _days);Debug.locals.put("days", _days);
 BA.debugLineNum = 169;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
Debug.JustUpdateDeviceLine();
_daysfont = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
_daysfont = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 14)));Debug.locals.put("daysFont", _daysfont);Debug.locals.put("daysFont", _daysfont);
 BA.debugLineNum = 170;BA.debugLine="cvsDays.ClearRect(cvsDays.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvsdays" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_cvsdays" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 171;BA.debugLine="For i = FirstDay To FirstDay + 7 - 1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//for
this.state = 4;
step4 = 1;
limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_firstday" /*RemoteObject*/ ),RemoteObject.createImmutable(7),RemoteObject.createImmutable(1)}, "+-",2, 1).<Integer>get().intValue();
_i = __ref.getField(true,"_firstday" /*RemoteObject*/ ).<Integer>get().intValue() ;
Debug.locals.put("i", _i);
this.state = 5;
if (true) break;

case 5:
//C
this.state = 4;
if ((step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4)) this.state = 3;
if (true) break;

case 6:
//C
this.state = 5;
_i = ((int)(0 + _i + step4)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 172;BA.debugLine="Dim d As String = days.Get(i Mod 7)";
Debug.JustUpdateDeviceLine();
_d = BA.ObjectToString(_days.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(7)}, "%",0, 1))));Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 173;BA.debugLine="cvsDays.DrawText(d.SubString2(0, 2), (i - FirstD";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvsdays" /*RemoteObject*/ ).runVoidMethod ("DrawText",(Object)(_d.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),__ref.getField(true,"_firstday" /*RemoteObject*/ ),RemoteObject.createImmutable(0.5)}, "-+",2, 0)),__ref.getField(true,"_boxw" /*RemoteObject*/ )}, "*",0, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))))),(Object)(_daysfont),(Object)(__ref.getField(true,"_daysinweekcolor" /*RemoteObject*/ )),(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.text.TextAlignment"),RemoteObject.createImmutable("CENTER"))));
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 175;BA.debugLine="cvsDays.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvsdays" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 176;BA.debugLine="mDialog = Dialog";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mdialog" /*RemoteObject*/ ,_dialog);
 BA.debugLineNum = 177;BA.debugLine="DrawDays";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdatetemplate.class, "_drawdays" /*RemoteObject*/ );
 BA.debugLineNum = 178;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xdatetemplate", "show"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 179;BA.debugLine="SetYearsButtonState";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdatetemplate.class, "_setyearsbuttonstate" /*RemoteObject*/ );
 BA.debugLineNum = 180;BA.debugLine="End Sub";
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