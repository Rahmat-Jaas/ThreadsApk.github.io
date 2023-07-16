package com.facebook.papaya.client.model_loader;

import X.AnonymousClass6HU;
import X.C04220Ms;
import X.C15020qa;
import com.facebook.jni.HybridData;

public abstract class IModelLoader {
    public static final AnonymousClass6HU Companion = new AnonymousClass6HU();
    public final HybridData mHybridData;

    public IModelLoader(HybridData hybridData) {
        C04220Ms.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    static {
        C15020qa.A0A("papaya-model_loader");
    }
}
