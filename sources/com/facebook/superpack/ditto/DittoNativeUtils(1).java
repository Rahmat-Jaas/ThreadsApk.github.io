package com.facebook.superpack.ditto;

import X.C15020qa;

public class DittoNativeUtils {
    public static native long allocateDirty(int i);

    public static native void free(long j);

    static {
        C15020qa.A0A("ditto-jni");
    }
}
