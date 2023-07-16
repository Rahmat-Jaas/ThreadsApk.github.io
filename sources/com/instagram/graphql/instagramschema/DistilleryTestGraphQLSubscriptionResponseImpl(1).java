package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import X.I17;
import com.facebook.pando.TreeJNI;

public final class DistilleryTestGraphQLSubscriptionResponseImpl extends TreeJNI implements C81204nM {

    public final class XdtTestFleetBeaconSubscribe extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"a_test_id", I17.A00(49)};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XdtTestFleetBeaconSubscribe.class, "xdt_test_fleet_beacon_subscribe(input:$input)");
    }
}
