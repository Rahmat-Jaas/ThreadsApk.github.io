package com.facebook.graphservice;

import X.AnonymousClass0qM;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.jni.HybridData;

public class GraphQLServiceToken implements GraphQLService.Token {
    public final HybridData mHybridData;

    public native void cancel();

    static {
        AnonymousClass0qM.A02("graphservice-jni");
    }

    public GraphQLServiceToken(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
