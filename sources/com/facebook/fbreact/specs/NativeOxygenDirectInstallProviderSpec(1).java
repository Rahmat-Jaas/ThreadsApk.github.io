package com.facebook.fbreact.specs;

import X.IPD;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeOxygenDirectInstallProviderSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "OxygenDirectInstallProvider";

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void install(String str, double d, Callback callback, Callback callback2);

    public NativeOxygenDirectInstallProviderSpec(IPD ipd) {
        super(ipd);
    }
}
