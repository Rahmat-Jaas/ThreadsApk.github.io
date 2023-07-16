package com.facebook.fbreact.specs;

import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGInsightsStoryPresenterReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGInsightsStoryPresenterReactModule";

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void openStoryViewerForMediaIDs(ReadableArray readableArray, String str, double d, String str2);

    public NativeIGInsightsStoryPresenterReactModuleSpec(IPD ipd) {
        super(ipd);
    }
}
