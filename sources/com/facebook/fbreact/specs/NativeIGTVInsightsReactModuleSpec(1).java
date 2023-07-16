package com.facebook.fbreact.specs;

import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGTVInsightsReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGIGTVInsightsReactModule";

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void seekToTime(double d);

    public NativeIGTVInsightsReactModuleSpec(IPD ipd) {
        super(ipd);
    }
}
