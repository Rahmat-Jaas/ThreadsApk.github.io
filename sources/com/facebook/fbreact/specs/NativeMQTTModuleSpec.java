package com.facebook.fbreact.specs;

import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeMQTTModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "MQTTModule";

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void subscribe(String str, String str2);

    @ReactMethod
    public abstract void unsubscribe(String str);

    public NativeMQTTModuleSpec(IPD ipd) {
        super(ipd);
    }
}
