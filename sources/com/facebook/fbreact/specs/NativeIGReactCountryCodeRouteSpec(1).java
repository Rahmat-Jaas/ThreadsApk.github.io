package com.facebook.fbreact.specs;

import X.C145858lE;
import X.IPD;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGReactCountryCodeRouteSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGReactCountryCodeRoute";

    @ReactMethod
    public abstract void extractCountryCodeAndNumber(String str, C145858lE r2);

    public String getName() {
        return "IGReactCountryCodeRoute";
    }

    @ReactMethod
    public abstract void presentCountryCodeSelector(String str, Callback callback);

    public NativeIGReactCountryCodeRouteSpec(IPD ipd) {
        super(ipd);
    }
}
