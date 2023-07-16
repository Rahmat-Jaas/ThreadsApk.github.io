package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class HasAvatarQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class Viewer extends TreeJNI implements C81204nM {

        public final class User extends TreeJNI implements C81204nM {

            public final class UserAvatar extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"config_hash", "id"};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(UserAvatar.class, "user_avatar");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(User.class, "user");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Viewer.class, "viewer");
    }
}
