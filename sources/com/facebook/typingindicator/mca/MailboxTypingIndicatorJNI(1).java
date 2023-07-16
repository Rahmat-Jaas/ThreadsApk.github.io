package com.facebook.typingindicator.mca;

import X.C15020qa;
import java.util.List;

public class MailboxTypingIndicatorJNI {
    public static final native Object dispatchCqlOJJJO(int i, long j, long j2, long j3, Object obj);

    public static final native Object dispatchCqlOJJJOZ(int i, long j, long j2, long j3, Object obj, boolean z);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native void dispatchVDJOOZZ(int i, double d, long j, Object obj, Object obj2, boolean z, boolean z2);

    public static final native void dispatchVJJJOOZ(int i, long j, long j2, long j3, Object obj, Object obj2, boolean z);

    public static final native void dispatchVJO(int i, long j, Object obj);

    public static final native void dispatchVO(int i, Object obj);

    public static final native void dispatchVOOOZZ(int i, Object obj, Object obj2, Object obj3, boolean z, boolean z2);

    public static final native List getHeaderFields(int i);

    static {
        C15020qa.A0A("mailboxtypingindicatorjni");
    }
}
