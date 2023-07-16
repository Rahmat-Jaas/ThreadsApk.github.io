package com.facebook.graphservice.asset;

import X.AnonymousClass00U;
import X.AnonymousClass0FK;
import X.AnonymousClass0KW;
import X.AnonymousClass0QN;
import X.AnonymousClass0qM;
import X.AnonymousClass0wJ;
import X.C013306f;
import X.C02720Cp;
import X.C03140Em;
import X.C109746kY;
import X.C1366883x;
import X.C18190wL;
import X.C18250wR;
import X.C86114wI;
import X.C86124wJ;
import X.C86154wM;
import X.C91285fx;
import android.content.Context;
import com.facebook.graphservice.nativeconfigloader.GraphServiceNativeConfigLoader;
import com.facebook.jni.HybridData;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;

public class GraphServiceAsset {
    public static Context sApplicationContext;
    public static final Map sAssets = new C013306f(1);
    public static String sDefaultConfigName;
    public final GraphQLServiceConfig mConfig;
    public final HybridData mHybridData;

    public static native String getDefaultConfigNameNative();

    public static native HybridData initHybridData(String str, String str2, String str3, boolean z);

    public static native GraphQLServiceConfig resolveBuildConfig(String str);

    public class GraphQLServiceConfig {
        public final String assetFilename;
        public final String cacheNamespace;
        public final String rootBuildConfigName;
        public final String serverEndpoint;

        public GraphQLServiceConfig(String str, String str2, String str3, String str4) {
            this.rootBuildConfigName = str;
            this.assetFilename = str2;
            this.cacheNamespace = str3;
            this.serverEndpoint = str4;
        }
    }

    static {
        AnonymousClass0qM.A02("fb");
        AnonymousClass0qM.A02("graphservice-jni-asset");
    }

    public static synchronized GraphServiceAsset getInstance(String str) {
        GraphServiceAsset graphServiceAsset;
        synchronized (GraphServiceAsset.class) {
            Map map = sAssets;
            if (map.containsKey(str)) {
                graphServiceAsset = (GraphServiceAsset) map.get(str);
                graphServiceAsset.getClass();
            } else {
                try {
                    GraphServiceNativeConfigLoader.loadNativeConfigs();
                    GraphQLServiceConfig resolveBuildConfig = resolveBuildConfig(str);
                    if (map.containsKey(resolveBuildConfig.rootBuildConfigName)) {
                        map.put(str, (GraphServiceAsset) map.get(resolveBuildConfig.rootBuildConfigName));
                        graphServiceAsset = (GraphServiceAsset) map.get(str);
                        graphServiceAsset.getClass();
                    } else {
                        Context context = sApplicationContext;
                        if (context == null) {
                            context = C02720Cp.A00();
                            sApplicationContext = context;
                        }
                        AnonymousClass0KW.A00(context, "GraphServiceAsset unable to get the application context. Please initialize it manually by calling useContext.");
                        String str2 = resolveBuildConfig.assetFilename;
                        File A0U = C86154wM.A0U(C91285fx.A00(context).AOC((C109746kY) null, 709674273), resolveBuildConfig.cacheNamespace);
                        File A0U2 = C86154wM.A0U(A0U, str2);
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        Executor executor = AnonymousClass0FK.A07;
                        A0v.add(new C03140Em(AnonymousClass00U.A0L(str2, ".checksum"), AnonymousClass00U.A0V("uncompressed_", str2, ".checksum")));
                        A0v.add(new AnonymousClass0QN(AnonymousClass00U.A0L(str2, ".xzs"), str2));
                        for (int i = 0; i < A0v.size(); i = C86124wJ.A0D(A0U, A0v, i)) {
                        }
                        new AnonymousClass0FK(context, A0U, "GraphServiceUnpacker", A0v, executor).A03();
                        try {
                            C1366883x<C1366883x> r1 = new C1366883x(sApplicationContext);
                            r1.A01 = 0;
                            for (C1366883x r0 : r1) {
                                if (r0 != null) {
                                    synchronized (r0.A03) {
                                        try {
                                        } catch (Throwable th) {
                                            th = th;
                                        }
                                    }
                                    th = C18190wL.A0a(AnonymousClass00U.A0J("method not found: ", r0.A00 << 8));
                                    throw th;
                                }
                            }
                            throw C18250wR.A0V("Found no IGraphServiceAssetSocket implementation");
                        } catch (NoClassDefFoundError unused) {
                            GraphServiceAsset graphServiceAsset2 = new GraphServiceAsset(A0U2.getCanonicalPath(), resolveBuildConfig, false);
                            map.put(str, graphServiceAsset2);
                            map.put(resolveBuildConfig.rootBuildConfigName, graphServiceAsset2);
                            return graphServiceAsset2;
                        }
                    }
                } catch (IOException e) {
                    throw C86114wI.A0k(e);
                }
            }
        }
        return graphServiceAsset;
    }

    public GraphServiceAsset(String str, GraphQLServiceConfig graphQLServiceConfig, boolean z) {
        this.mHybridData = initHybridData(graphQLServiceConfig.rootBuildConfigName, str, graphQLServiceConfig.serverEndpoint, z);
        this.mConfig = graphQLServiceConfig;
        GraphServiceNativeConfigLoader.loadNativeConfigs();
    }
}
