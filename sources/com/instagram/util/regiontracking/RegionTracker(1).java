package com.instagram.util.regiontracking;

import X.C15020qa;
import com.facebook.jni.HybridData;

public class RegionTracker {
    public final HybridData mHybridData;

    public static native HybridData initHybrid();

    private native void nativeAddRegion(long j, float f, float f2, float f3, float f4);

    private native long nativeCreateRegionTracker(int i, float f, float f2, boolean z);

    private native void nativeDispose(long j);

    private native Object nativeUpdate(long j, Object obj, int i, int i2, float[] fArr, boolean z);

    static {
        C15020qa.A0A("regiontracking");
    }
}
