package com.facebook.msys.mci;

import X.AnonymousClass737;
import X.C13810oL;

public class JsonSerialization {
    public static boolean sInitialized;

    public static native void nativeInitialize();

    /* JADX INFO: finally extract failed */
    public static synchronized boolean initialize() {
        boolean z;
        int i;
        synchronized (JsonSerialization.class) {
            C13810oL.A01("JsonSerialization.initialize", 1276323159);
            try {
                if (sInitialized) {
                    z = false;
                    i = -1039187552;
                } else {
                    nativeInitialize();
                    z = true;
                    sInitialized = true;
                    i = 1579119685;
                }
                C13810oL.A00(i);
            } catch (Throwable th) {
                C13810oL.A00(1228065072);
                throw th;
            }
        }
        return z;
    }

    public static boolean isMCPEnabledForJsonSerialization() {
        return false;
    }

    static {
        AnonymousClass737.A00();
    }
}
