package com.facebook.jni.kotlin;

import X.AnonymousClass0YY;
import X.C04220Ms;
import X.C05250Se;
import com.facebook.jni.HybridData;

public final class NativeFunction1 extends C05250Se implements AnonymousClass0YY {
    public final HybridData mHybridData;

    public NativeFunction1(HybridData hybridData) {
        C04220Ms.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public native Object invoke(Object obj);
}
