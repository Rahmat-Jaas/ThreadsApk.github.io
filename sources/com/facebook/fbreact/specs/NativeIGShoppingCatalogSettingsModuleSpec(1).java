package com.facebook.fbreact.specs;

import X.IPD;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGShoppingCatalogSettingsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGShoppingCatalogSettingsModule";

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void launchCatalogSelectionPage(double d, String str, String str2, String str3);

    @ReactMethod
    public abstract void selectCatalog(String str, String str2, Callback callback, Callback callback2);

    public NativeIGShoppingCatalogSettingsModuleSpec(IPD ipd) {
        super(ipd);
    }
}
