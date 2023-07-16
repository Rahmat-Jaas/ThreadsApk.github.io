package com.facebook.acra.util;

import X.AnonymousClass09L;
import java.util.concurrent.atomic.AtomicBoolean;

public class NativeProcFileReader extends AnonymousClass09L {
    public static final AtomicBoolean sReadyToUse = new AtomicBoolean(false);

    private native int[] getOpenFDLimitsNative();

    public native int getOpenFDCount();

    public native String getOpenFileDescriptors();

    public NativeProcFileReader() {
        if (!sReadyToUse.get()) {
            throw new IllegalStateException("Class is not ready");
        }
    }
}
