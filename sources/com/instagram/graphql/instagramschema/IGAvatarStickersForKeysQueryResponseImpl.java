package com.instagram.graphql.instagramschema;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGAvatarStickersForKeysQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FetchIGUser extends TreeJNI implements C81204nM {

        public final class UserAvatar extends TreeJNI implements C81204nM {

            public final class IgStickersForKeys extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"cdn_url", "id", "media_type", "template"};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(IgStickersForKeys.class, AnonymousClass000.A00(372));
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(UserAvatar.class, "user_avatar");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FetchIGUser.class, "fetch__IGUser(igid:$user_id)");
    }
}
