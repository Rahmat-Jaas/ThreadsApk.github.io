package com.facebook.fbreact.specs;

import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGPromoteClaimPageModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGPromoteClaimPageReactModule";

    @ReactMethod
    public abstract void didClaimPage(ReadableMap readableMap);

    public String getName() {
        return NAME;
    }

    public NativeIGPromoteClaimPageModuleSpec(IPD ipd) {
        super(ipd);
    }
}
