package com.facebook.fbreact.specs;

import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeJSCSamplingProfilerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "JSCSamplingProfiler";

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void operationComplete(double d, String str, String str2);

    public NativeJSCSamplingProfilerSpec(IPD ipd) {
        super(ipd);
    }
}
