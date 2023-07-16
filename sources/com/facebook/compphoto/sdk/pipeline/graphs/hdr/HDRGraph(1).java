package com.facebook.compphoto.sdk.pipeline.graphs.hdr;

import X.C15020qa;
import com.facebook.jni.HybridData;

public class HDRGraph {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    public native void render(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    static {
        C15020qa.A0A("compphoto-sdk-pipeline-graphs-hdr-native-android");
    }
}
