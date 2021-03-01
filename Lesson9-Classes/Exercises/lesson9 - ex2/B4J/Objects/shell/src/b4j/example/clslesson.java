
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clslesson {
    public static RemoteObject myClass;
	public clslesson() {
	}
    public static PCBA staticBA = new PCBA(null, clslesson.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _strlesson = RemoteObject.createImmutable("");
public static RemoteObject _strclass = RemoteObject.createImmutable("");
public static RemoteObject _strhours = RemoteObject.createImmutable("");
public static RemoteObject _strprofessor = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"fx",_ref.getField(false, "_fx"),"strClass",_ref.getField(false, "_strclass"),"strHours",_ref.getField(false, "_strhours"),"strLesson",_ref.getField(false, "_strlesson"),"strProfessor",_ref.getField(false, "_strprofessor")};
}
}