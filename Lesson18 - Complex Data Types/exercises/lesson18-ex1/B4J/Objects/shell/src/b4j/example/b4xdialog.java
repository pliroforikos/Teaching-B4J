
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xdialog {
    public static RemoteObject myClass;
	public b4xdialog() {
	}
    public static PCBA staticBA = new PCBA(null, b4xdialog.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _buttonsheight = RemoteObject.createImmutable(0);
public static RemoteObject _titlebarheight = RemoteObject.createImmutable(0);
public static RemoteObject _buttonwidth = RemoteObject.createImmutable(0);
public static RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _backgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _overlaycolor = RemoteObject.createImmutable(0);
public static RemoteObject _bordercolor = RemoteObject.createImmutable(0);
public static RemoteObject _bordercornersradius = RemoteObject.createImmutable(0);
public static RemoteObject _borderwidth = RemoteObject.createImmutable(0);
public static RemoteObject _buttonscolor = RemoteObject.createImmutable(0);
public static RemoteObject _buttonstextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _background = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _blurimageview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _blurbackground = RemoteObject.createImmutable(false);
public static RemoteObject _blurreducescale = RemoteObject.createImmutable(0);
public static RemoteObject _mparent = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _title = RemoteObject.declareNull("Object");
public static RemoteObject _titlebarcolor = RemoteObject.createImmutable(0);
public static RemoteObject _titlebartextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _bodytextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _titlebar = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _putattop = RemoteObject.createImmutable(false);
public static RemoteObject _titlebarfont = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
public static RemoteObject _buttonsfont = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
public static RemoteObject _buttonstextcolordisabled = RemoteObject.createImmutable(0);
public static RemoteObject _visibleanimationduration = RemoteObject.createImmutable(0);
public static RemoteObject _buttonsorder = null;
public static RemoteObject _buttonsstate = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Background",_ref.getField(false, "_background"),"BackgroundColor",_ref.getField(false, "_backgroundcolor"),"Base",_ref.getField(false, "_base"),"BlurBackground",_ref.getField(false, "_blurbackground"),"BlurImageView",_ref.getField(false, "_blurimageview"),"BlurReduceScale",_ref.getField(false, "_blurreducescale"),"BodyTextColor",_ref.getField(false, "_bodytextcolor"),"BorderColor",_ref.getField(false, "_bordercolor"),"BorderCornersRadius",_ref.getField(false, "_bordercornersradius"),"BorderWidth",_ref.getField(false, "_borderwidth"),"ButtonsColor",_ref.getField(false, "_buttonscolor"),"ButtonsFont",_ref.getField(false, "_buttonsfont"),"ButtonsHeight",_ref.getField(false, "_buttonsheight"),"ButtonsOrder",_ref.getField(false, "_buttonsorder"),"ButtonsState",_ref.getField(false, "_buttonsstate"),"ButtonsTextColor",_ref.getField(false, "_buttonstextcolor"),"ButtonsTextColorDisabled",_ref.getField(false, "_buttonstextcolordisabled"),"ButtonWidth",_ref.getField(false, "_buttonwidth"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"mParent",_ref.getField(false, "_mparent"),"OverlayColor",_ref.getField(false, "_overlaycolor"),"PutAtTop",_ref.getField(false, "_putattop"),"Title",_ref.getField(false, "_title"),"TitleBar",_ref.getField(false, "_titlebar"),"TitleBarColor",_ref.getField(false, "_titlebarcolor"),"TitleBarFont",_ref.getField(false, "_titlebarfont"),"TitleBarHeight",_ref.getField(false, "_titlebarheight"),"TitleBarTextColor",_ref.getField(false, "_titlebartextcolor"),"VisibleAnimationDuration",_ref.getField(false, "_visibleanimationduration"),"xui",_ref.getField(false, "_xui")};
}
}