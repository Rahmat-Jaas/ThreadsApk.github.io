package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IntegrityUserEligibleToUseRoomQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class IgNativeRoomUserEligibilityQuery extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"is_user_eligible_to_use_ig_room", "reason_for_blocking"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgNativeRoomUserEligibilityQuery.class, "ig_native_room_user_eligibility_query(data:$data)");
    }
}
