package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagesdelegator extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xpagesdelegator", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpagesdelegator.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _activity_pause() throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Public Sub Activity_Pause";
 //BA.debugLineNum = 53;BA.debugLine="B4XPages.GetManager.Activity_Pause";
_b4xpages._getmanager /*b4j.example.b4xpagesmanager*/ ()._activity_pause /*String*/ ();
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _activity_resume() throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Public Sub Activity_Resume";
 //BA.debugLineNum = 49;BA.debugLine="B4XPages.GetManager.Activity_Resume";
_b4xpages._getmanager /*b4j.example.b4xpagesmanager*/ ()._activity_resume /*String*/ ();
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 4;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public String  _mainform_closed() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Public Sub MainForm_Closed";
 //BA.debugLineNum = 14;BA.debugLine="B4XPages.GetManager.MainForm_Closed";
_b4xpages._getmanager /*b4j.example.b4xpagesmanager*/ ()._mainform_closed /*String*/ ();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public String  _mainform_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Public Sub MainForm_CloseRequest (EventData As Eve";
 //BA.debugLineNum = 18;BA.debugLine="B4XPages.GetManager.MainForm_CloseRequest (EventD";
_b4xpages._getmanager /*b4j.example.b4xpagesmanager*/ ()._mainform_closerequest /*String*/ (_eventdata);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _mainform_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Public Sub MainForm_FocusChanged (HasFocus As Bool";
 //BA.debugLineNum = 10;BA.debugLine="B4XPages.GetManager.MainForm_FocusChanged (HasFoc";
_b4xpages._getmanager /*b4j.example.b4xpagesmanager*/ ()._mainform_focuschanged /*String*/ (_hasfocus);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _mainform_iconifiedchanged(boolean _iconified) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub MainForm_IconifiedChanged (Iconified As";
 //BA.debugLineNum = 22;BA.debugLine="B4XPages.GetManager.MainForm_IconifiedChanged(Ico";
_b4xpages._getmanager /*b4j.example.b4xpagesmanager*/ ()._mainform_iconifiedchanged /*String*/ (_iconified);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _mainform_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
 //BA.debugLineNum = 45;BA.debugLine="B4XPages.GetManager.MainForm_Resize(Width, Height";
_b4xpages._getmanager /*b4j.example.b4xpagesmanager*/ ()._mainform_resize /*String*/ (_width,_height);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
