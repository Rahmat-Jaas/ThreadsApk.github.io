package com.facebook.graphql.rtgql.graphqlsubscriptionssdk.base;

import X.C04220Ms;
import com.facebook.jni.HybridData;

public class GraphQLSubscriptionsSDKProviderBase {
    public final HybridData mHybridData;

    public GraphQLSubscriptionsSDKProviderBase(HybridData hybridData) {
        C04220Ms.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public final HybridData getMHybridData() {
        return this.mHybridData;
    }
}
