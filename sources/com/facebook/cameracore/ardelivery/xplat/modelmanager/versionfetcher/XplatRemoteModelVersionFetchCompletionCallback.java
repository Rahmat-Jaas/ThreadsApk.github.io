package com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher;

import X.AnonymousClass6GT;
import X.C15020qa;
import com.facebook.jni.HybridData;

public final class XplatRemoteModelVersionFetchCompletionCallback {
    public static final AnonymousClass6GT Companion = new AnonymousClass6GT();
    public HybridData mHybridData;

    public final native void onFailure(String str);

    public final native void onSuccess(XplatModelVersionResponse xplatModelVersionResponse);

    static {
        C15020qa.A0A("ard-remote-model-fetch-callback");
    }

    public XplatRemoteModelVersionFetchCompletionCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
