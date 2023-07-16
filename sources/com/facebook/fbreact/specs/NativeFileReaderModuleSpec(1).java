package com.facebook.fbreact.specs;

import X.C145858lE;
import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeFileReaderModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "FileReaderModule";

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void readAsDataURL(ReadableMap readableMap, C145858lE r2);

    @ReactMethod
    public abstract void readAsText(ReadableMap readableMap, String str, C145858lE r3);

    public NativeFileReaderModuleSpec(IPD ipd) {
        super(ipd);
    }
}
