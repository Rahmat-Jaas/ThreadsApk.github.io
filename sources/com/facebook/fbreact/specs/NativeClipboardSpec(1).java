package com.facebook.fbreact.specs;

import X.C145858lE;
import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeClipboardSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Clipboard";

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void getString(C145858lE r1);

    @ReactMethod
    public abstract void setString(String str);

    public NativeClipboardSpec(IPD ipd) {
        super(ipd);
    }
}
