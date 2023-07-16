package com.facebook.fbreact.specs;

import X.C18210wN;
import X.IPD;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

public abstract class NativeBuildInfoSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "BuildInfo";

    public String getName() {
        return NAME;
    }

    public abstract Map getTypedExportedConstants();

    public final Map getConstants() {
        throw C18210wN.A0W("getTypedExportedConstants");
    }

    public NativeBuildInfoSpec(IPD ipd) {
        super(ipd);
    }
}
