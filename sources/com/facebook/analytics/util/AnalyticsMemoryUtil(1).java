package com.facebook.analytics.util;

import X.C15020qa;

public final class AnalyticsMemoryUtil {
    public static native String[] getLoadedLibraries();

    public static native long getPeakRss();

    static {
        C15020qa.A0A("analyticsutil-jni");
    }
}
