package com.facebook.graphservice;

import X.AnonymousClass0qM;
import X.AnonymousClass2BG;
import X.C13780oI;
import X.C18210wN;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.interfaces.GraphQLQuery;
import com.facebook.jni.HybridData;
import com.facebook.nativeutil.NativeMap;

public class GraphQLQueryBuilder {
    public final HybridData mHybridData;

    public static native HybridData initHybridData(GraphQLConfigHintsJNI graphQLConfigHintsJNI, String str, String str2, long j, NativeMap nativeMap, Class cls, int i, GraphServiceAsset graphServiceAsset, boolean z);

    public native GraphQLQuery getResult();

    static {
        AnonymousClass0qM.A02("graphservice-jni");
    }

    public GraphQLQueryBuilder(AnonymousClass2BG r3, String str, String str2, long j, NativeMap nativeMap, Class cls, int i, GraphServiceAsset graphServiceAsset, boolean z) {
        C13780oI.A03("GraphQLQueryBuilder(%s)", str2, 2067294751);
        throw C18210wN.A0W("cacheTtlSeconds");
    }
}
