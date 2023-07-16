package com.facebook.cameracore.mediapipeline.services.multipeer.implementation;

import com.facebook.jni.HybridData;

public final class MultipeerBinaryMessageTopicHandlerHybrid {
    public final HybridData mHybridData;

    public final native void onMessageNative(byte[] bArr);

    public MultipeerBinaryMessageTopicHandlerHybrid(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
