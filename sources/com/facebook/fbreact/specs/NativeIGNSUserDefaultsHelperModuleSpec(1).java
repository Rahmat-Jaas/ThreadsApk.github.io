package com.facebook.fbreact.specs;

import X.IPD;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGNSUserDefaultsHelperModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGNSUserDefaultsHelperModule";

    @ReactMethod
    public abstract void getBoolValueForKey(String str, Callback callback);

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void setBoolValue(boolean z, String str);

    public NativeIGNSUserDefaultsHelperModuleSpec(IPD ipd) {
        super(ipd);
    }
}
