package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpagebeagle_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xpagebeagle) ","b4xpagebeagle",3,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpagebeagle","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 13;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="Root = Root1";
Debug.ShouldStop(8192);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 16;BA.debugLine="Root.LoadLayout(\"frmBeagle\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("frmBeagle")),__ref.getField(false, "ba"));
 BA.debugLineNum = 17;BA.debugLine="txtArInfos.Text = $\" 		Small, compact, And hardy,";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtarinfos" /*RemoteObject*/ ).runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		Small, compact, And hardy, Beagles are active companions For kids And adults alike. Canines of this dog breed are merry And fun loving, but being hounds, they can also be stubborn And require patient, creative training techniques.\n"),RemoteObject.createImmutable("		Their noses guide them through life, And they’re never happier than when following an interesting scent. Beagles originally were bred As scenthounds To track small game, mostly rabbits And hare. They’re still used For this purpose in many countries today, including the United States. But you’ll find plenty of these pups living As companion dogs And loving, furry family members.\n"),RemoteObject.createImmutable("		DogTime recommends with your small Beagle. You should also For any outdoor adventures you have with your pup!\n"),RemoteObject.createImmutable("	"))));
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
b4xpagebeagle._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpagebeagle._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpagebeagle._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpagebeagle._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private txtArInfos As TextArea";
b4xpagebeagle._txtarinfos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");__ref.setField("_txtarinfos",b4xpagebeagle._txtarinfos);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xpagebeagle) ","b4xpagebeagle",3,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpagebeagle","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="Return Me";
Debug.ShouldStop(256);
if (true) return __ref;
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}