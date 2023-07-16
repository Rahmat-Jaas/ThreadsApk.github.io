package com.facebook.fbreact.specs;

import X.IPD;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGShoppingBusinessSignupModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGShoppingSignupReactModule";

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void registerGetStarted(Callback callback, Callback callback2);

    @ReactMethod
    public abstract void registerNotInterestedInShopping();

    @ReactMethod
    public abstract void syncShoppingOnboardingState(Callback callback, Callback callback2);

    public NativeIGShoppingBusinessSignupModuleSpec(IPD ipd) {
        super(ipd);
    }
}
