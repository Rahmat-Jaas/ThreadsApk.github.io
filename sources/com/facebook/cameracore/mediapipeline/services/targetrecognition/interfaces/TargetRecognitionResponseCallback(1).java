package com.facebook.cameracore.mediapipeline.services.targetrecognition.interfaces;

public interface TargetRecognitionResponseCallback {
    void handleCallbackError(String str, long j);

    void handleCallbackResponse(String str);
}
