package com.instagram.debug.network;

import X.C10300i6;

public final class DebugNetworkShapingConfigurationFactory {
    public static final DebugNetworkShapingConfigurationFactory INSTANCE = new DebugNetworkShapingConfigurationFactory();

    public static final NetworkShapingConfiguration createNetworkShapingCallbackConfiguration() {
        return new DebugNetworkShapingConfigurationFactory$createNetworkShapingCallbackConfiguration$1();
    }

    public static final NetworkShapingConfiguration createNetworkShapingServiceLayerConfiguration(C10300i6 r1) {
        return new DebugNetworkShapingConfigurationFactory$createNetworkShapingServiceLayerConfiguration$1(r1);
    }

    public static final NetworkShapingConfiguration createStaticConfiguration(long j, int i, int i2) {
        return new DebugNetworkShapingConfigurationFactory$createStaticConfiguration$1(j, i, i2);
    }
}
