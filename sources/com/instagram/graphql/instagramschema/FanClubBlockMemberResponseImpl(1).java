package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FanClubBlockMemberResponseImpl extends TreeJNI implements C81204nM {

    public final class XigBlockMemberFanClub extends TreeJNI implements C81204nM {

        public final class FanClub extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1Z();
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(FanClub.class, "fan_club");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XigBlockMemberFanClub.class, "xig_block_member_fan_club(data:$input)");
    }
}
