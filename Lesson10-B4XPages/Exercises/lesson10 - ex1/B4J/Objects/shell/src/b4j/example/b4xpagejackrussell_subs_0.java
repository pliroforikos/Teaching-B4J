package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpagejackrussell_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xpagejackrussell) ","b4xpagejackrussell",4,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpagejackrussell","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 13;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="Root = Root1";
Debug.ShouldStop(8192);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 16;BA.debugLine="Root.LoadLayout(\"frmJack\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("frmJack")),__ref.getField(false, "ba"));
 BA.debugLineNum = 17;BA.debugLine="txtArInfos.Text = $\" 		Developed in England some";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtarinfos" /*RemoteObject*/ ).runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		Developed in England some 200 years ago To hunt foxes, the Jack Russell Terrier, also known As the Parson Russell Terrier, Is a lively, independent, And clever little dog. They’re charming And affectionate, but they’re also a handful To train And manage. For experienced dog parents only!\n"),RemoteObject.createImmutable("		Although these are purebred dogs, you may still find them in shelters And rescues. Remember To adopt! Don’t shop If this Is the breed For you.\n"),RemoteObject.createImmutable("		At first, this small, adorable, And affectionate dog may seem like a good choice For new pet parents And apartment dwellers. But you may find yourself surprised at this little pup’s energy And intensity. These dogs need plenty of exercise And firm, consistent training, Or Else they may act out with unwanted behaviors. That said, If you know how To handle a Bit of rowdiness And can keep up with an energetic pup, you’ll be rewarded with a loving And loyal friend For life.\n"),RemoteObject.createImmutable("		DogTime recommends with your small Jack Russell Terrier. You should also To help burn off your pup’s high energy!\n"),RemoteObject.createImmutable("	"))));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
b4xpagejackrussell._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpagejackrussell._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpagejackrussell._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpagejackrussell._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private txtArInfos As TextArea";
b4xpagejackrussell._txtarinfos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");__ref.setField("_txtarinfos",b4xpagejackrussell._txtarinfos);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xpagejackrussell) ","b4xpagejackrussell",4,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpagejackrussell","initialize", __ref, _ba);}
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