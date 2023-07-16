package com.facebook.fbreact.specs;

import X.C145858lE;
import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGBrandedContentReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGBrandedContentReactModule";

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void openAdCreationPartners(double d);

    @ReactMethod
    public abstract void openAllowlistedPartners(double d, ReadableArray readableArray);

    @ReactMethod
    public abstract void openRequestAdCreationAccess(double d);

    @ReactMethod
    public abstract void updateWhitelistSettings(boolean z, boolean z2, String str, String str2, C145858lE r5);

    public NativeIGBrandedContentReactModuleSpec(IPD ipd) {
        super(ipd);
    }
}
