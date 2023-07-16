package com.facebook.fbreact.specs;

import X.C145858lE;
import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGReactApiHelperSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGReactApiHelper";

    @ReactMethod
    public abstract void getApiUrlWithPath(String str, C145858lE r2);

    @ReactMethod
    public abstract void getHttpHeaders(C145858lE r1);

    public String getName() {
        return NAME;
    }

    public NativeIGReactApiHelperSpec(IPD ipd) {
        super(ipd);
    }
}
