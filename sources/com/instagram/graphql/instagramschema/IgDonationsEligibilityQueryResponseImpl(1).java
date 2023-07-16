package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IgDonationsEligibilityQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class Me extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"can_viewer_donate", "id"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Me.class, "me");
    }
}
