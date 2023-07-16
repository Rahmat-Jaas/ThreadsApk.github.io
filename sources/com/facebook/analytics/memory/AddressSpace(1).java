package com.facebook.analytics.memory;

import X.AnonymousClass0LU;
import X.C15020qa;

public final class AddressSpace {
    public static volatile boolean sInitialized;

    public static native int nativeGetLargestAddressSpaceChunkKb();

    public static int getLargestChunkKb() {
        try {
            if (sInitialized) {
                return nativeGetLargestAddressSpaceChunkKb();
            }
            if (C15020qa.A08()) {
                C15020qa.A0A("addressspace");
                sInitialized = true;
                return nativeGetLargestAddressSpaceChunkKb();
            }
            return -1;
        } catch (UnsatisfiedLinkError e) {
            AnonymousClass0LU.A0E("AddressSpace", "Error querying address space", e);
        }
    }
}
