package com.facebook.mobileboost.framework.os.jni;

import X.AnonymousClass0LU;
import X.C15020qa;

public class MobileBoostNative {
    public static boolean sNativeLibLoaded;

    public static native void disableSmartFsync();

    public static native boolean enableLicmFix(boolean z);

    public static native boolean enableSmartFsync(boolean z);

    public static native boolean removeAllHiddenApiCheckHardening(int i, boolean z);

    public static native boolean setHiddenApiCheckHardening(int i, boolean z);

    static {
        try {
            sNativeLibLoaded = C15020qa.A0A("fb_mboost");
        } catch (UnsatisfiedLinkError e) {
            AnonymousClass0LU.A0G("MobileBoostJNI", "Failed to load MobileBoostNative lib.", e);
            sNativeLibLoaded = false;
        }
    }
}
