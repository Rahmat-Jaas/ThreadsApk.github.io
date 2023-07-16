package com.facebook.fbreact.specs;

import X.C145858lE;
import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeImageLoaderAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ImageLoader";

    @ReactMethod
    public abstract void abortRequest(double d);

    public String getName() {
        return "ImageLoader";
    }

    @ReactMethod
    public abstract void getSize(String str, C145858lE r2);

    @ReactMethod
    public abstract void getSizeWithHeaders(String str, ReadableMap readableMap, C145858lE r3);

    @ReactMethod
    public abstract void prefetchImage(String str, double d, C145858lE r4);

    @ReactMethod
    public abstract void queryCache(ReadableArray readableArray, C145858lE r2);

    public NativeImageLoaderAndroidSpec(IPD ipd) {
        super(ipd);
    }
}
