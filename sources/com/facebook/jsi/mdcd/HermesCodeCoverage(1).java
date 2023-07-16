package com.facebook.jsi.mdcd;

import java.util.Map;

public class HermesCodeCoverage {
    public static native void disableNative();

    public static native void enableNative();

    public static native Map getExecutedFunctionsNative();

    public static native boolean isEnabledNative();
}
