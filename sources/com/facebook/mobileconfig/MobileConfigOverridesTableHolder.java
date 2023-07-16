package com.facebook.mobileconfig;

import X.AnonymousClass0TK;
import X.AnonymousClass0qM;
import com.facebook.jni.HybridData;

public class MobileConfigOverridesTableHolder implements AnonymousClass0TK {
    public final HybridData mHybridData;

    public native boolean boolOverrideForParam(long j, boolean z);

    public native double doubleOverrideForParam(long j, double d);

    public native String experimentOverrideForUniverse(String str);

    public native String groupOverrideForUniverse(String str);

    public native boolean hasBoolOverrideForParam(long j);

    public native boolean hasDoubleOverrideForParam(long j);

    public native boolean hasIntOverrideForParam(long j);

    public native boolean hasNullOverrideForParam(long j);

    public native boolean hasOverrideForUniverse(String str);

    public native boolean hasStringOverrideForParam(long j);

    public native long intOverrideForParam(long j, long j2);

    public native void removeAllOverrides();

    public native void removeOverrideForParam(long j);

    public native void removeOverridesForQEUniverse(String str);

    public native void setOverridesFileUpdatedCallback(MobileConfigUpdateOverridesTableCallback mobileConfigUpdateOverridesTableCallback);

    public native String stringOverrideForParam(long j, String str);

    public native void updateOverrideForBool(long j, boolean z);

    public native void updateOverrideForDouble(long j, double d);

    public native void updateOverrideForInt(long j, long j2);

    public native void updateOverrideForQE(String str, String str2, String str3);

    public native void updateOverrideForString(long j, String str);

    static {
        AnonymousClass0qM.A02("mobileconfig-jni");
    }

    public MobileConfigOverridesTableHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void updateOverrideForParam(long j, double d) {
        updateOverrideForDouble(j, d);
    }

    public void updateOverrideForParam(long j, long j2) {
        updateOverrideForInt(j, j2);
    }

    public void updateOverrideForParam(long j, String str) {
        updateOverrideForString(j, str);
    }

    public void updateOverrideForParam(long j, boolean z) {
        updateOverrideForBool(j, z);
    }
}
