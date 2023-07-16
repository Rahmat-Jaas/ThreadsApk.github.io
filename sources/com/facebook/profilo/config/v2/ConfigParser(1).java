package com.facebook.profilo.config.v2;

import X.C15020qa;
import com.facebook.jni.HybridData;

public class ConfigParser {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(String str);

    public native Config parseConfig();

    static {
        C15020qa.A0A("profilo_configjni");
    }

    public ConfigParser(String str) {
        this.mHybridData = initHybrid(str);
    }
}
