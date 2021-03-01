package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagegoldenretriever extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xpagegoldenretriever", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpagegoldenretriever.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _txtarinfos = null;
public anywheresoftware.b4j.objects.ImageViewWrapper _imgpic1 = null;
public anywheresoftware.b4j.objects.ImageViewWrapper _imgpic2 = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public Object  _initialize(b4j.example.b4xpagegoldenretriever __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpagegoldenretriever";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4j.example.b4xpagegoldenretriever __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagegoldenretriever";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="Root.LoadLayout(\"frmGolden\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("frmGolden",ba);
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="txtArInfos.Text = $\" 	The Golden Retriever is one";
__ref._txtarinfos /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .setText(("\n"+"	The Golden Retriever is one of the most popular dog breeds in the United States. The breed’s friendly, tolerant attitude makes them great family pets, and their intelligence makes them highly capable working dogs.\n"+"	Golden Retrievers excel at retrieving game For hunters, tracking, sniffing out contraband For law enforcement, And As therapy And service dogs. They’re also natural athletes And Do well in dog sports such As agility And competitive obedience.\n"+"	These dogs are fairly easy To train And get along in just about any home Or family. They’re great with kids And very protective of their humans. If you want a loyal, loving, And smart companion, consider adopting one of these pups into your pack.\n"+"	DogTime recommends To your medium-sized Golden. You should also For your high shedding pup!\n"+"	"));
RDebugUtils.currentLine=7929869;
 //BA.debugLineNum = 7929869;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xpagegoldenretriever __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagegoldenretriever";
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="Private txtArInfos As TextArea";
_txtarinfos = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper();
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="Private imgPic1 As ImageView";
_imgpic1 = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="Private imgPic2 As ImageView";
_imgpic2 = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="End Sub";
return "";
}
}