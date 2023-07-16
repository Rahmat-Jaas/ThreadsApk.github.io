package com.facebook.jni.kotlin;

import X.AnonymousClass0ZU;
import X.C04220Ms;
import X.C05250Se;
import com.facebook.jni.HybridData;

public final class NativeFunction0 extends C05250Se implements AnonymousClass0ZU {
    public final HybridData mHybridData;

    public NativeFunction0(HybridData hybridData) {
        C04220Ms.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public native Object invoke();
}
