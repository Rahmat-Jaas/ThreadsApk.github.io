package com.facebook.reliability.ulimit;

import X.C15020qa;

public class Ulimit {
    public static final boolean sNativeLibLoaded;

    public static native void setNativeMaxUlimit();

    static {
        boolean z;
        try {
            C15020qa.A0A("reliability");
            z = true;
        } catch (UnsatisfiedLinkError unused) {
            z = false;
        }
        sNativeLibLoaded = z;
    }
}
