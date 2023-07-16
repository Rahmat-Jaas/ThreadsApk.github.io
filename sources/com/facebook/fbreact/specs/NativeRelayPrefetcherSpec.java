package com.facebook.fbreact.specs;

import X.C145858lE;
import X.I02;
import X.I03;
import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeRelayPrefetcherSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RelayPrefetcher";

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String generateHashWithActorID(String str, String str2, ReadableMap readableMap) {
        return "";
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract I02 getPrefetchedQueryIDs();

    @ReactMethod
    public abstract void provideResponseIfAvailable(String str, C145858lE r2);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract I03 provideResponseIfAvailableSync(String str);

    public NativeRelayPrefetcherSpec(IPD ipd) {
        super(ipd);
    }
}
