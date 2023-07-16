package com.facebook.wearable.common.comms.hera.client;

import X.AnonymousClass00U;
import X.C15020qa;
import android.util.Log;
import com.facebook.jni.HybridData;

public final class HeraNativeClient {
    public final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    public final native void testPrintLog();

    public final native String testStringFromAndroidCpp();

    public final native String testStringFromCoreCpp();

    public HeraNativeClient() {
        C15020qa.A0A("heraclientandroid");
        Log.w("HeraNativeLogs", AnonymousClass00U.A0L("Got string from android cpp : ", testStringFromAndroidCpp()));
        Log.w("HeraNativeLogs", AnonymousClass00U.A0L("Got string from core cpp : ", testStringFromCoreCpp()));
        testPrintLog();
    }
}
