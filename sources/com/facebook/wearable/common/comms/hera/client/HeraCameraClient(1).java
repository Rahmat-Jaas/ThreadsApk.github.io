package com.facebook.wearable.common.comms.hera.client;

import X.C15020qa;
import com.facebook.jni.HybridData;

public final class HeraCameraClient {
    public final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    public final native boolean init();

    public HeraCameraClient() {
        C15020qa.A0A("heraclientandroid");
        init();
    }
}
