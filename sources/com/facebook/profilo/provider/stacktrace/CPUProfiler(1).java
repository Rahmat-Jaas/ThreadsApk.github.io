package com.facebook.profilo.provider.stacktrace;

import X.C15020qa;
import com.facebook.profilo.logger.MultiBufferLogger;

public class CPUProfiler {
    public static volatile int sAvailableTracers;
    public static volatile boolean sInitialized;

    public static native boolean nativeInitialize(MultiBufferLogger multiBufferLogger, int i, boolean z, boolean z2, int i2, int i3, boolean z3);

    public static native void nativeLoggerLoop();

    public static native void nativeResetFrameworkNamesSet();

    public static native boolean nativeStartProfiling(int i, int i2, int i3, boolean z, boolean z2);

    public static native void nativeStopProfiling();

    static {
        C15020qa.A0A("profilo_stacktrace");
    }
}
