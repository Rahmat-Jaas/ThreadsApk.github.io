package com.facebook.mobileconfig.troubleshooting;

import X.C15020qa;
import X.C84434t8;
import com.facebook.jni.HybridData;

public class BisectHelperHolder implements C84434t8 {
    public final HybridData mHybridData;

    public native BisectStateHolder getCurrentState();

    public native boolean goBackOneStep();

    public native void setBisectPath(String str);

    public native void startBisection(String str, BisectCallback bisectCallback);

    public native void startUsingExistingFile(String str);

    public native boolean stopBisection();

    public native boolean userDidNotReproduceBug();

    public native boolean userDidReproduceBug();

    static {
        C15020qa.A0A("mobileconfigtroubleshooting-jni");
    }

    public BisectHelperHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
