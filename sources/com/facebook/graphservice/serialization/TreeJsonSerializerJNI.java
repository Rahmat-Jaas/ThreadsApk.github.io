package com.facebook.graphservice.serialization;

import X.AnonymousClass0qM;
import com.facebook.graphservice.interfaces.TreeJsonSerializer;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.jni.HybridData;

public class TreeJsonSerializerJNI implements TreeJsonSerializer {
    public final HybridData mHybridData;

    private native TreeJNI deserializeFromJsonNative(String str, long j, Class cls, int i, String str2);

    static {
        AnonymousClass0qM.A02("graphservice-jni-serialization");
    }

    public TreeJsonSerializerJNI(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
