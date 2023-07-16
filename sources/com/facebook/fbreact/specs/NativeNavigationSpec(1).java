package com.facebook.fbreact.specs;

import X.AnonymousClass0wJ;
import X.IPD;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeNavigationSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Navigation";

    @ReactMethod
    public abstract void clearRightBarButton(double d);

    @ReactMethod
    public abstract void dismiss(double d, ReadableMap readableMap);

    public String getName() {
        return "Navigation";
    }

    @ReactMethod
    public void getSavedInstanceState(double d, String str, Callback callback) {
    }

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void navigate(double d, String str, ReadableMap readableMap);

    @ReactMethod
    public abstract void openURL(double d, String str);

    @ReactMethod
    public abstract void pop(double d);

    @ReactMethod
    public void popToScreen(double d, double d2) {
    }

    @ReactMethod
    public void present(double d, String str) {
    }

    @ReactMethod
    public abstract void reloadReact();

    @ReactMethod
    public void replaceTarget(double d, String str, String str2) {
    }

    @ReactMethod
    public void setBadgeConfig(ReadableMap readableMap) {
    }

    @ReactMethod
    public abstract void setBarLeftAction(double d, ReadableMap readableMap);

    @ReactMethod
    public abstract void setBarPrimaryAction(double d, ReadableMap readableMap);

    @ReactMethod
    public abstract void setBarTitle(double d, String str);

    @ReactMethod
    public void setBarTitleWithConfig(double d, ReadableMap readableMap) {
    }

    @ReactMethod
    public void setInstanceStateToSave(double d, String str, ReadableMap readableMap) {
    }

    @ReactMethod
    public void setRouteStack(double d, ReadableArray readableArray) {
    }

    @ReactMethod
    public void setSections(ReadableArray readableArray) {
    }

    @ReactMethod
    public void updateAppRegistryConfiguration(String str) {
    }

    @ReactMethod
    public void updateNativeRoutesConfiguration(String str) {
    }

    public final Map getConstants() {
        return AnonymousClass0wJ.A0y();
    }

    public NativeNavigationSpec(IPD ipd) {
        super(ipd);
    }
}
