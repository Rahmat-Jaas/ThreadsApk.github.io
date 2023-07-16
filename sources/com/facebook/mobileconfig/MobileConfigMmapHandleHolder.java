package com.facebook.mobileconfig;

import X.AnonymousClass0qM;
import X.AnonymousClass3V0;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public class MobileConfigMmapHandleHolder extends AnonymousClass3V0 {
    public final HybridData mHybridData;

    public native String getFilename();

    static {
        AnonymousClass0qM.A02("mobileconfig-jni");
    }

    public MobileConfigMmapHandleHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public ByteBuffer getJavaByteBuffer() {
        return A00(getFilename());
    }
}
