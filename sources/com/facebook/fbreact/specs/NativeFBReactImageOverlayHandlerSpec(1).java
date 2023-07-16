package com.facebook.fbreact.specs;

import X.IPD;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeFBReactImageOverlayHandlerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "FBReactImageOverlayHandler";

    @ReactMethod
    public void extractPixelColorFromImages(ReadableMap readableMap, Callback callback) {
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void processImage(ReadableMap readableMap, Callback callback) {
    }

    public NativeFBReactImageOverlayHandlerSpec(IPD ipd) {
        super(ipd);
    }
}
