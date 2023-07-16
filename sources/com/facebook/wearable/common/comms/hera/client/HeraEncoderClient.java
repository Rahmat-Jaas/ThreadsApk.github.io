package com.facebook.wearable.common.comms.hera.client;

import X.C15020qa;
import com.facebook.jni.HybridData;

public final class HeraEncoderClient {
    public final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    public final native Object getEncodingInputSurface();

    public final native boolean init(String str, int i, int i2, int i3, int i4, int i5);

    public final native boolean isSupported();

    public final native boolean startEncoding(Object obj);

    public final native boolean startFileEncoding(String str);

    public final native boolean stopEncoding();

    public HeraEncoderClient() {
        C15020qa.A0A("heraclientandroid");
    }
}
