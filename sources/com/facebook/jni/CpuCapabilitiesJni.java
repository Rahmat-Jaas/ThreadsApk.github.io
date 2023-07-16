package com.facebook.jni;

import X.AnonymousClass0qM;

public class CpuCapabilitiesJni {
    public static native boolean nativeDeviceSupportsNeon();

    public static native boolean nativeDeviceSupportsVFPFP16();

    public static native boolean nativeDeviceSupportsX86();

    static {
        AnonymousClass0qM.A02("fb");
    }
}
