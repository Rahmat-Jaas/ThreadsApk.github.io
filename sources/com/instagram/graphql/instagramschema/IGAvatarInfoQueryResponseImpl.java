package com.instagram.graphql.instagramschema;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18170wI;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGAvatarInfoQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FetchIGUser extends TreeJNI implements C81204nM {

        public final class UserAvatar extends TreeJNI implements C81204nM {

            public final class IgUserAvatarInfo extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{AnonymousClass000.A00(52), "config_hash"};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(IgUserAvatarInfo.class, AnonymousClass000.A00(927));
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(UserAvatar.class, "user_avatar");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FetchIGUser.class, C18170wI.A00(14));
    }
}
