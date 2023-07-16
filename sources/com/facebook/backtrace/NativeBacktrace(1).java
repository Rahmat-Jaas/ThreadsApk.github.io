package com.facebook.backtrace;

import X.C15020qa;

public final class NativeBacktrace {
    public static final NativeBacktrace INSTANCE = new NativeBacktrace();

    public static final native String getBacktrace(long j, int i, boolean z);

    public static final native boolean getElfCachingEnabled();

    public static final native void setElfCachingEnabled(boolean z);

    static {
        C15020qa.A0A("backtrace-jni");
    }
}
