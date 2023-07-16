package com.facebook.fbreact.specs;

import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeFBReactScreenshotObserverSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "FBReactScreenshotObserver";

    @ReactMethod
    public abstract void addListener(String str);

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void removeListeners(double d);

    @ReactMethod
    public void startObserving() {
    }

    @ReactMethod
    public void stopObserving() {
    }

    public NativeFBReactScreenshotObserverSpec(IPD ipd) {
        super(ipd);
    }
}
