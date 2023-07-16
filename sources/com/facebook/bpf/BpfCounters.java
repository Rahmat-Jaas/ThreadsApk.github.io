package com.facebook.bpf;

import X.AnonymousClass0LU;
import X.AnonymousClass0qM;
import X.C03010Du;
import java.util.HashMap;

public class BpfCounters {
    public static final boolean A00;

    public static native void closeBpfMapImpl(int i);

    public static native void getBpfCountersImpl(HashMap hashMap, int i);

    public static native int openBpfMapImpl(String str);

    static {
        Class<BpfCounters> cls = BpfCounters.class;
        boolean z = false;
        if (!C03010Du.A00.isEmpty()) {
            try {
                AnonymousClass0qM.A02("bpfcounters");
                z = true;
            } catch (UnsatisfiedLinkError e) {
                AnonymousClass0LU.A04(cls, "Could not load bpfcounters library", e);
                AnonymousClass0LU.A02(cls, "Consider adding dependency on bpfcounters-jni");
            }
        }
        A00 = z;
    }
}
