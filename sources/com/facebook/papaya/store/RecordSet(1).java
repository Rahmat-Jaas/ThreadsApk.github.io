package com.facebook.papaya.store;

import X.C15020qa;
import com.facebook.jni.HybridData;

public class RecordSet {
    public final HybridData mHybridData;

    private native Record nativeGet(int i);

    private native int nativeSize();

    static {
        C15020qa.A0A("papaya-store-interface");
    }

    public RecordSet(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public Record get(int i) {
        return nativeGet(i);
    }

    public int size() {
        return nativeSize();
    }
}
