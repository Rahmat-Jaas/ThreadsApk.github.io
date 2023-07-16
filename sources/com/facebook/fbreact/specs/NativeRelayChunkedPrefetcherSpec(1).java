package com.facebook.fbreact.specs;

import X.I02;
import X.I03;
import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeRelayChunkedPrefetcherSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RelayChunkedPrefetcher";

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String generateHashWithActorID(String str, String str2, ReadableMap readableMap) {
        return "";
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract I02 getPrefetchedQueryIDs();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public I03 provideResponseIfAvailableSync(String str) {
        return null;
    }

    @ReactMethod
    public abstract void removeListeners(double d);

    public NativeRelayChunkedPrefetcherSpec(IPD ipd) {
        super(ipd);
    }
}
