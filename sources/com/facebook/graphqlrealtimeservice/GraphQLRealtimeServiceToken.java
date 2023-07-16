package com.facebook.graphqlrealtimeservice;

import X.AnonymousClass0qM;
import X.AnonymousClass6H7;
import com.facebook.graphqlrealtimeservice.interfaces.GraphQLRealtimeService;
import com.facebook.jni.HybridData;

public final class GraphQLRealtimeServiceToken implements GraphQLRealtimeService.Token {
    public static final AnonymousClass6H7 Companion = new AnonymousClass6H7();
    public final HybridData mHybridData;

    public native void cancel();

    static {
        AnonymousClass0qM.A02("graphqlrealtimeservice-jni");
    }

    public GraphQLRealtimeServiceToken(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
