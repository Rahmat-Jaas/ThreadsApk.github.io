package com.facebook.jni;

import X.AnonymousClass0qM;

public class ThreadScopeSupport {
    public static native void runStdFunctionImpl(long j);

    static {
        AnonymousClass0qM.A02("fbjni");
    }

    public static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }
}
