package com.facebook.wearable.common.comms.hera.client;

import X.C15020qa;
import com.facebook.jni.HybridData;

public final class HeraDecoderClient {
    public final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    public final native void decodeFrameBuffer(long j, int i, int i2, Object obj);

    public final native Object getDecodingOutputSurface();

    public final native boolean init(String str, int i, int i2);

    public final native boolean isDecoderOutputSurfaceEqualTo(Object obj);

    public final native boolean isSupported();

    public final native boolean setDecodingOutputSurface(Object obj);

    public final native boolean startDecoding(Object obj);

    public final native boolean stopDecoding();

    public HeraDecoderClient() {
        C15020qa.A0A("heraclientandroid");
    }
}
