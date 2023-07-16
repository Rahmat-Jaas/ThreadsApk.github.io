package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FetchFanClubMembershipsFromUserResponseImpl extends TreeJNI implements C81204nM {

    public final class XigUserByIgidV2 extends TreeJNI implements C81204nM {

        public final class FanClubMemberships extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1Z();
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(FanClubMemberships.class, "fan_club_memberships");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XigUserByIgidV2.class, "xig_user_by_igid_v2(id:$user_id)");
    }
}
