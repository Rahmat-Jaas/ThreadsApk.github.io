package com.facebook.fbreact.specs;

import X.C145858lE;
import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGReactAPISpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGReactAPI";

    @ReactMethod
    public abstract void get(String str, ReadableMap readableMap, C145858lE r3);

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void post(String str, ReadableMap readableMap, C145858lE r3);

    public NativeIGReactAPISpec(IPD ipd) {
        super(ipd);
    }
}
