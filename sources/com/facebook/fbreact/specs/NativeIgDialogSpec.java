package com.facebook.fbreact.specs;

import X.IPD;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeIgDialogSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IgDialog";

    public String getName() {
        return "IgDialog";
    }

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void showDialog(String str, String str2, ReadableMap readableMap, Callback callback, Callback callback2);

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativeIgDialogSpec(IPD ipd) {
        super(ipd);
    }
}
