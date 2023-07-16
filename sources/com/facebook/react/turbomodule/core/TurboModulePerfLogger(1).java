package com.facebook.react.turbomodule.core;

import com.facebook.react.perflogger.NativeModulePerfLogger;

public class TurboModulePerfLogger {
    public static native void jniEnableCppLogging(NativeModulePerfLogger nativeModulePerfLogger);
}
