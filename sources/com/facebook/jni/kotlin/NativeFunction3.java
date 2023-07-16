package com.facebook.jni.kotlin;

import X.AnonymousClass0YM;
import X.C04220Ms;
import X.C05250Se;
import com.facebook.jni.HybridData;

public final class NativeFunction3 extends C05250Se implements AnonymousClass0YM {
    public final HybridData mHybridData;

    public NativeFunction3(HybridData hybridData) {
        C04220Ms.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public native Object invoke(Object obj, Object obj2, Object obj3);
}
