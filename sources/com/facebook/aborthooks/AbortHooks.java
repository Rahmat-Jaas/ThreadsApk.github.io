package com.facebook.aborthooks;

import X.C15020qa;

public final class AbortHooks {
    public static final AbortHooks INSTANCE = new AbortHooks();
    public static volatile boolean sInstalled;

    public static final native void hookAbort();

    public static final native void hookAndroidLogAssert();

    public static final native void hookAndroidSetAbortMessage();

    public static final native void install();

    public static final native void setGlogFatalHandler();

    static {
        C15020qa.A0A("aborthooks");
    }
}
