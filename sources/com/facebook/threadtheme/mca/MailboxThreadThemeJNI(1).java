package com.facebook.threadtheme.mca;

import X.C15020qa;
import java.util.List;

public class MailboxThreadThemeJNI {
    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchDasmOOOOOOZ(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z);

    public static final native Object dispatchOIJOO(int i, int i2, long j, Object obj, Object obj2);

    public static final native void dispatchVJOO(int i, long j, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOOOOZ(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z);

    public static final native List getHeaderFields(int i);

    static {
        C15020qa.A0A("mailboxthreadthemejni");
    }
}
