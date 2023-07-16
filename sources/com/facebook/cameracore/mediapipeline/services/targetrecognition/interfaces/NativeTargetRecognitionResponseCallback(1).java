package com.facebook.cameracore.mediapipeline.services.targetrecognition.interfaces;

import X.C15020qa;
import com.facebook.jni.HybridData;

public class NativeTargetRecognitionResponseCallback implements TargetRecognitionResponseCallback {
    public final HybridData mHybridData;

    public native void handleError(String str, long j);

    public native void handleResponse(String str);

    static {
        C15020qa.A0A("target-recognition-android");
    }

    public NativeTargetRecognitionResponseCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void handleCallbackError(String str, long j) {
        handleError(str, j);
    }

    public void handleCallbackResponse(String str) {
        handleResponse(str);
    }
}
