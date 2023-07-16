package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class WWWLiveQueryTestResponseImpl extends TreeJNI implements C81204nM {

    public final class XigLiveQueryFleetBeaconTest extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"test_id"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XigLiveQueryFleetBeaconTest.class, "xig_live_query_fleet_beacon_test(test_id:$testId)");
    }
}
