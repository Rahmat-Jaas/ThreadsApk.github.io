package com.instagram.debug.network;

import X.AnonymousClass0wJ;
import X.C10300i6;
import X.C18190wL;
import X.C18220wO;
import java.lang.ref.WeakReference;

public final class DebugNetworkShapingConfigurationFactory$createNetworkShapingServiceLayerConfiguration$1 extends NetworkShapingConfiguration {
    public final int failNetworkRequestAfterBytesCount = -1;
    public final int failNetworkRequestProbability = 1;
    public final WeakReference sessionRef;

    public int getFailNetworkRequestAfterBytesCount() {
        return this.failNetworkRequestAfterBytesCount;
    }

    public int getFailNetworkRequestProbability() {
        return this.failNetworkRequestProbability;
    }

    public final WeakReference getSessionRef() {
        return this.sessionRef;
    }

    public long getSleepTimePerChunk() {
        C10300i6 r0 = (C10300i6) this.sessionRef.get();
        if (r0 != null) {
            long sleepPerChunkOverride = DebugNetworkShapingServerOverrideHelper.getSleepPerChunkOverride(r0);
            if (sleepPerChunkOverride != 0) {
                return sleepPerChunkOverride;
            }
        }
        return (long) AnonymousClass0wJ.A04(C18220wO.A0f(C18190wL.A0X().A0b));
    }

    public DebugNetworkShapingConfigurationFactory$createNetworkShapingServiceLayerConfiguration$1(C10300i6 r2) {
        this.sessionRef = new WeakReference(r2);
    }
}
