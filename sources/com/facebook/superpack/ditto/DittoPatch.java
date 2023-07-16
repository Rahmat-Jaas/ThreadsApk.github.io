package com.facebook.superpack.ditto;

import X.C15020qa;
import java.io.Closeable;
import java.io.InputStream;

public class DittoPatch implements Closeable {
    public static native long applyNative(long j, long j2);

    public static native void closeNative(long j);

    public static native long readNative(InputStream inputStream);

    static {
        C15020qa.A0A("ditto-jni");
    }
}
