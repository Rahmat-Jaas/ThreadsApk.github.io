package com.facebook.fbreact.specs;

import X.C18210wN;
import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeIGReactAlertBarSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGReactAlertBar";

    public String getName() {
        return NAME;
    }

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void showErrors(ReadableMap readableMap);

    @ReactMethod
    public abstract void showMessage(String str, double d);

    public final Map getConstants() {
        throw C18210wN.A0W("getTypedExportedConstants");
    }

    public NativeIGReactAlertBarSpec(IPD ipd) {
        super(ipd);
    }
}
