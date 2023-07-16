package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class WWWTestGraphQLSubscriptionResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbTestFleetBeaconSubscribe extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"test_id"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbTestFleetBeaconSubscribe.class, "xfb_test_fleet_beacon_subscribe(data:$input)");
    }
}
