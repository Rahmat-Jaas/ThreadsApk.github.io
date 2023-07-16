package com.facebook.fbreact.specs;

import X.C145858lE;
import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGPurchaseExperienceBridgeModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGPurchaseExperienceBridgeModule";

    @ReactMethod
    public void authenticate(double d, ReadableMap readableMap, C145858lE r4) {
    }

    @ReactMethod
    public abstract void checkoutConfirmationWillDismiss();

    @ReactMethod
    public abstract void dismissCheckout(double d, ReadableArray readableArray, boolean z, boolean z2);

    public String getName() {
        return "IGPurchaseExperienceBridgeModule";
    }

    @ReactMethod
    public void initCheckout(double d, ReadableMap readableMap) {
    }

    @ReactMethod
    public abstract void onPaymentSuccess(String str, boolean z, String str2, ReadableArray readableArray, ReadableArray readableArray2);

    @ReactMethod
    public void openConnectFlow(double d, String str, String str2, C145858lE r5) {
    }

    @ReactMethod
    public void openPaypalConsentFlow(double d, String str, String str2, String str3, C145858lE r6) {
    }

    @ReactMethod
    public void openShopPayFlow(double d, String str, String str2, C145858lE r5) {
    }

    @ReactMethod
    public void openShopPayInterstitial(double d, String str, String str2, C145858lE r5) {
    }

    @ReactMethod
    public abstract void sharePurchaseToStory(double d, String str, String str2);

    public NativeIGPurchaseExperienceBridgeModuleSpec(IPD ipd) {
        super(ipd);
    }
}
