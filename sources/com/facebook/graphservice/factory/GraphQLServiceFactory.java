package com.facebook.graphservice.factory;

import X.AnonymousClass0qM;
import X.C03730Km;
import X.C145828l9;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.serialization.TreeJsonSerializerJNI;
import com.facebook.graphservice.serialization.TreeSerializerJNI;
import com.facebook.graphservice.tree.TreeBuilderJNI;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.jni.HybridData;

public class GraphQLServiceFactory implements C145828l9 {
    public final HybridData mHybridData;

    private native String clientDocIdForQueryNameHash(long j);

    public static native HybridData initHybridData(GraphServiceAsset graphServiceAsset, boolean z);

    private native long legacyPersistIdForQueryNameHash(long j);

    private native TreeBuilderJNI moveTreeBuilder(TreeBuilderJNI treeBuilderJNI, Class cls, int i);

    private native TreeBuilderJNI newTreeBuilderFromTree(TreeJNI treeJNI, Class cls, int i);

    private native TreeBuilderJNI newTreeBuilderFromType(String str, Class cls, int i);

    private native TreeBuilderJNI newUpdateBuilderFromTree(TreeJNI treeJNI, Class cls, int i);

    private native long ossPersistIdForQueryNameHash(long j);

    private native String queryTextForQueryNameHash(long j);

    private native String[] transientParametersForQueryNameHash(long j);

    public native TreeJsonSerializerJNI newTreeJsonSerializer();

    public native TreeSerializerJNI newTreeSerializer();

    public String schemaForQuery(String str) {
        return null;
    }

    static {
        AnonymousClass0qM.A02("graphservice-jni-factory");
    }

    public GraphQLServiceFactory(GraphServiceAsset graphServiceAsset) {
        this.mHybridData = initHybridData(graphServiceAsset, false);
    }

    public String clientDocIdForQuery(String str) {
        return clientDocIdForQueryNameHash(Long.parseLong(C03730Km.A00(str).substring(0, 8), 16));
    }

    public String persistIdForQuery(String str) {
        return Long.toString(ossPersistIdForQueryNameHash(Long.parseLong(C03730Km.A00(str).substring(0, 8), 16)));
    }

    public GraphQLServiceFactory() {
        this.mHybridData = null;
    }
}
