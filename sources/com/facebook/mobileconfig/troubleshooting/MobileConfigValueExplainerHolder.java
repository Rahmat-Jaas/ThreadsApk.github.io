package com.facebook.mobileconfig.troubleshooting;

import X.C15020qa;
import com.facebook.jni.HybridData;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import java.util.Set;

public class MobileConfigValueExplainerHolder {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl);

    public native String getClientDrivenInfo(String str, Set set, int i);

    static {
        C15020qa.A0A("mobileconfigtroubleshooting-jni");
    }
}
