package com.facebook.cipher.jni;

import com.facebook.jni.HybridData;

public class MacEncoderHybrid {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(byte[] bArr, byte[] bArr2);

    public native byte[] end();

    public native byte[] start();

    public native void write(byte[] bArr, int i, int i2);
}
