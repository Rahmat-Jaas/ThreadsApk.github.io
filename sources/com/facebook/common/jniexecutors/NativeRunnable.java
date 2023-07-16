package com.facebook.common.jniexecutors;

import X.AnonymousClass00U;
import X.AnonymousClass0qM;
import X.C13780oI;
import com.facebook.jni.HybridData;

public class NativeRunnable implements Runnable {
    public HybridData mHybridData;
    public volatile String mNativeExecutor;

    private native void nativeRun();

    static {
        AnonymousClass0qM.A02("jniexecutors");
    }

    public void run() {
        C13780oI.A03("%s", this, -693752208);
        try {
            nativeRun();
        } finally {
            C13780oI.A00(570492259);
        }
    }

    public String toString() {
        String str = this.mNativeExecutor;
        if (str == null) {
            return "NativeRunnable";
        }
        return AnonymousClass00U.A0L("NativeRunnable - ", str);
    }

    public NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
