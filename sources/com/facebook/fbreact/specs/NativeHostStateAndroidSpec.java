package com.facebook.fbreact.specs;

import X.IPD;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeHostStateAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "HostStateAndroid";

    @ReactMethod
    public abstract void getCurrentHostState(Callback callback, Callback callback2);

    public String getName() {
        return NAME;
    }

    public NativeHostStateAndroidSpec(IPD ipd) {
        super(ipd);
    }
}
