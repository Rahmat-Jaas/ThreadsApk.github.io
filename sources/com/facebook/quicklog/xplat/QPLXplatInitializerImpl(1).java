package com.facebook.quicklog.xplat;

import X.C15020qa;
import X.C17500v0;
import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;

public final class QPLXplatInitializerImpl {
    public static final C17500v0 Companion = new C17500v0();
    public final HybridData mHybridData = initHybrid();

    public static final native HybridData initHybrid();

    public static final native void setupNativeQPLWithXAnalyticsHolder(XAnalyticsHolder xAnalyticsHolder);

    static {
        C15020qa.A0A("perfloggerxplat_init");
    }
}
