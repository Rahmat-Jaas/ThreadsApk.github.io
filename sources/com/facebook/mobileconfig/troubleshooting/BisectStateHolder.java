package com.facebook.mobileconfig.troubleshooting;

import X.C15020qa;
import X.C84544tO;
import com.facebook.jni.HybridData;

public class BisectStateHolder implements C84544tO {
    public final HybridData mHybridData;

    public native boolean canContinue();

    public native String getCulprit();

    public native int getLeft();

    public native int getMiddle();

    public native int getNumberOfStepsMade();

    public native int getNumberOfStepsRemaining();

    public native int getRight();

    public native int getSize();

    public native String getTaskNumber();

    public native String getUniqueId();

    public native boolean isRunning();

    static {
        C15020qa.A0A("mobileconfigtroubleshooting-jni");
    }

    public BisectStateHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
