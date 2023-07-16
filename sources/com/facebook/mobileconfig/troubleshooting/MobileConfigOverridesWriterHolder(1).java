package com.facebook.mobileconfig.troubleshooting;

import X.C15020qa;
import com.facebook.jni.HybridData;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;

public class MobileConfigOverridesWriterHolder {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl);

    public native BisectHelperHolder getNewMCBisectHelper(BisectDefaultValuesProvider bisectDefaultValuesProvider);

    public native String importOverridesFromTask(String str);

    public native String importOverridesFromUser(String str);

    public native String loadOverridesFromTaskAndSaveResponse(String str);

    static {
        C15020qa.A0A("mobileconfigtroubleshooting-jni");
    }

    public MobileConfigOverridesWriterHolder(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl) {
        this.mHybridData = initHybrid(mobileConfigManagerHolderImpl);
    }
}
