package com.facebook.native_bridge;

import X.C15020qa;
import com.facebook.jni.HybridData;

public class NativeLocationManager {
    public static final double[] EMPTY = {0.0d, 0.0d};
    public final HybridData mHybridData;

    private native HybridData initHybrid();

    static {
        C15020qa.A0A("native_bridge");
    }
}
