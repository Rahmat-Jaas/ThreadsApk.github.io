package com.facebook.fbreact.specs;

import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeFBShopNativeModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "FBShopNativeModule";

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void launchFeedbackPopover(double d, String str, boolean z);

    @ReactMethod
    public abstract void storeFrontViewLayoutChanged(double d, double d2, double d3, double d4);

    public NativeFBShopNativeModuleSpec(IPD ipd) {
        super(ipd);
    }
}
