package com.facebook.fbreact.specs;

import X.C145858lE;
import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeLinkingManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "LinkingManager";

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void canOpenURL(String str, C145858lE r2);

    @ReactMethod
    public abstract void getInitialURL(C145858lE r1);

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void openSettings(C145858lE r1);

    @ReactMethod
    public abstract void openURL(String str, C145858lE r2);

    @ReactMethod
    public abstract void removeListeners(double d);

    public NativeLinkingManagerSpec(IPD ipd) {
        super(ipd);
    }
}
