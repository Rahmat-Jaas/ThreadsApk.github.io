package com.facebook.mobileconfig.troubleshooting;

import X.C15020qa;
import com.facebook.jni.HybridData;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;

public class MobileConfigQEInfoManagerHolder {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl);

    public native boolean getQEInfo(MobileConfigQEInfoQueryParamsHolder mobileConfigQEInfoQueryParamsHolder, MobileConfigResponseCallback mobileConfigResponseCallback, String str, String str2);

    public native String getRNQEInfo();

    public native boolean hasRefreshedQEInfo();

    static {
        C15020qa.A0A("mobileconfigtroubleshooting-jni");
    }
}
