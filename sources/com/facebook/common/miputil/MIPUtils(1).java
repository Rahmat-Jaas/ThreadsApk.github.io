package com.facebook.common.miputil;

import X.C15020qa;
import com.facebook.jni.HybridData;

public class MIPUtils {
    public final HybridData mHybridData = initHybrid();

    private native byte[] getProfileRawData(boolean z, byte b);

    public static native HybridData initHybrid();

    public native void dumpProfileInfoToFile(String str, boolean z, byte b);

    public native void resetProfileRawData(byte b);

    static {
        C15020qa.A0A("mip_utils_jni");
    }
}
