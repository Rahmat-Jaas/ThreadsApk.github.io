package com.facebook.cameracore.ardelivery.xplat.scripting;

import X.AnonymousClass6GU;
import X.C15020qa;
import com.facebook.cameracore.ardelivery.scripting.ScriptingPackageMetadata;
import com.facebook.jni.HybridData;

public final class XplatScriptingMetadataCompletionCallback {
    public static final AnonymousClass6GU Companion = new AnonymousClass6GU();
    public final HybridData mHybridData;

    public final native void onFailure(String str);

    public final native void onSuccess(ScriptingPackageMetadata scriptingPackageMetadata);

    static {
        C15020qa.A0A("ard-scripting-downloader");
    }

    public XplatScriptingMetadataCompletionCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
