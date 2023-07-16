package com.facebook.hermes.instrumentation;

import X.C15020qa;

public class HermesSamplingProfiler {
    public static native void disable();

    public static native void dumpSampledTraceToFile(String str);

    public static native void enable();

    static {
        C15020qa.A0A("jsijniprofiler");
    }
}
