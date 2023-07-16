package com.facebook.fbreact.specs;

import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGInsightsReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGInsightsReactModule";

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void navigateToCreatePromotion();

    @ReactMethod
    public abstract void navigateToSeeMorePromotions();

    @ReactMethod
    public abstract void navigateToSingleFeedView(String str);

    @ReactMethod
    public abstract void navigateToStoriesCamera();

    @ReactMethod
    public abstract void navigateToTopPostsCamera();

    @ReactMethod
    public abstract void onFilterChangedInsightsAccountGrowth(double d, double d2);

    @ReactMethod
    public void showInsightsFilterView(String str, String str2, String str3, String str4, String str5) {
    }

    public NativeIGInsightsReactModuleSpec(IPD ipd) {
        super(ipd);
    }
}
