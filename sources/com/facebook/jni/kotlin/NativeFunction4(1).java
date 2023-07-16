package com.facebook.jni.kotlin;

import X.AnonymousClass0YC;
import X.C04220Ms;
import X.C05250Se;
import com.facebook.jni.HybridData;

public final class NativeFunction4 extends C05250Se implements AnonymousClass0YC {
    public final HybridData mHybridData;

    public NativeFunction4(HybridData hybridData) {
        C04220Ms.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public native Object invoke(Object obj, Object obj2, Object obj3, Object obj4);
}
