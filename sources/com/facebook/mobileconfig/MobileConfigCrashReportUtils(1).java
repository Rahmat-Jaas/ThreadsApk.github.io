package com.facebook.mobileconfig;

import X.AnonymousClass0qM;
import com.facebook.jni.HybridData;
import java.util.Map;

public class MobileConfigCrashReportUtils {
    public static MobileConfigCrashReportUtils sInstance;
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    public native void addCanaryData(String str, String str2);

    public native void clear();

    public native long count();

    public native Map getAllCanaryData();

    public native Map getAllLastFetchTimestamps();

    public native void setUpdateListener(MobileConfigCanaryChangeListener mobileConfigCanaryChangeListener);

    static {
        AnonymousClass0qM.A02("mobileconfig-jni");
    }
}
