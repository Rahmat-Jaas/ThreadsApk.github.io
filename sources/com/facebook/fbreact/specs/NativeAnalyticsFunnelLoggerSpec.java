package com.facebook.fbreact.specs;

import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeAnalyticsFunnelLoggerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "AnalyticsFunnelLogger";

    @ReactMethod
    public abstract void addActionToFunnel(String str, double d, String str2, String str3, ReadableMap readableMap);

    @ReactMethod
    public abstract void addFunnelTag(String str, double d, String str2);

    @ReactMethod
    public abstract void cancelFunnel(String str, double d);

    @ReactMethod
    public abstract void endFunnel(String str, double d);

    public String getName() {
        return "AnalyticsFunnelLogger";
    }

    @ReactMethod
    public abstract void startFunnel(String str, double d);

    @ReactMethod
    public void startFunnel_DEV_MODE(String str, double d) {
    }

    public NativeAnalyticsFunnelLoggerSpec(IPD ipd) {
        super(ipd);
    }
}
