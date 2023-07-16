package com.facebook.fbreact.specs;

import X.C145858lE;
import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeShareModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ShareModule";

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void share(ReadableMap readableMap, String str, C145858lE r3);

    public NativeShareModuleSpec(IPD ipd) {
        super(ipd);
    }
}
