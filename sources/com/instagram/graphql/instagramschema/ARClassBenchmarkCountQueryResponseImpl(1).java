package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.intent.IntentModule;

public final class ARClassBenchmarkCountQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbArclassBenchmarkCount extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbArclassBenchmarkCount.class, "xfb_arclass_benchmark_count(benchmark_version:$benchmark_version)");
    }
}
