package com.facebook.fbreact.specs;

import X.C18210wN;
import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeI18nAssetsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "I18nAssets";

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getAssetContent(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract double getDictionarySize();

    public String getName() {
        return "I18nAssets";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getString(String str);

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public void invalidateCaches() {
    }

    public final Map getConstants() {
        throw C18210wN.A0W("getTypedExportedConstants");
    }

    public NativeI18nAssetsSpec(IPD ipd) {
        super(ipd);
    }
}
