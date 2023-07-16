package com.facebook.fbreact.specs;

import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeI18nMergedAssetsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "I18nMergedAssets";

    public String getName() {
        return NAME;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getString(double d);

    public NativeI18nMergedAssetsSpec(IPD ipd) {
        super(ipd);
    }
}
