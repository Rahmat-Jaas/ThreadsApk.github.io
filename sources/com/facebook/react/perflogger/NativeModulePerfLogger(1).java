package com.facebook.react.perflogger;

import X.C15020qa;
import X.C18210wN;
import com.facebook.jni.HybridData;

public abstract class NativeModulePerfLogger {
    public static volatile boolean sIsSoLibraryLoaded;
    public final HybridData mHybridData;

    public NativeModulePerfLogger() {
        synchronized (this) {
        }
        synchronized (NativeModulePerfLogger.class) {
            if (!sIsSoLibraryLoaded) {
                C15020qa.A0A("reactperfloggerjni");
                sIsSoLibraryLoaded = true;
            }
        }
        throw C18210wN.A0W("initHybrid");
    }
}
