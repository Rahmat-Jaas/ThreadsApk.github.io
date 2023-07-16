package com.facebook.jni.kotlin;

import X.C04220Ms;
import X.C05250Se;
import X.C06070Xn;
import com.facebook.jni.HybridData;

public final class NativeFunction7 extends C05250Se implements C06070Xn {
    public final HybridData mHybridData;

    public NativeFunction7(HybridData hybridData) {
        C04220Ms.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public native Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);
}
