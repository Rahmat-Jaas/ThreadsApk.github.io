package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class WWWTestGraphQLSubscriptionPublishResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbFleetBeaconPublish extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"success"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbFleetBeaconPublish.class, "xfb_fleet_beacon_publish(data:$input)");
    }
}
