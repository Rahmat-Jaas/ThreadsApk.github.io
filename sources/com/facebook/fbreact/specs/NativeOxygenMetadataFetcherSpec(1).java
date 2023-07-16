package com.facebook.fbreact.specs;

import X.C18210wN;
import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeOxygenMetadataFetcherSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "OxygenMetadataFetcher";

    public String getName() {
        return NAME;
    }

    public abstract Map getTypedExportedConstants();

    public final Map getConstants() {
        throw C18210wN.A0W("getTypedExportedConstants");
    }

    public NativeOxygenMetadataFetcherSpec(IPD ipd) {
        super(ipd);
    }
}
