package com.facebook.mobileboost.framework.os.jni.lite;

import X.C15020qa;

public class MobileBoostNativeLite {
    public static boolean sNativeLibLoaded;

    public static native void clearMlockCache();

    public static native void mlockPages(String str, int i, int i2, int i3, boolean z);

    public static native boolean mlockPagesAreCached(String str, int i);

    static {
        try {
            sNativeLibLoaded = C15020qa.A0A("fb_mboost-lite");
        } catch (UnsatisfiedLinkError unused) {
            sNativeLibLoaded = false;
        }
    }
}
