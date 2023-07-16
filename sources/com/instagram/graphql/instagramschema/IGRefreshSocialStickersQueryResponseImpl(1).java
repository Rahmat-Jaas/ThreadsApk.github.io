package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGRefreshSocialStickersQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FetchIGUser extends TreeJNI implements C81204nM {

        public final class UserAvatar extends TreeJNI implements C81204nM {

            public final class RefreshSocialStickers extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"combined_config_hash", "ctime", "success"};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(RefreshSocialStickers.class, "refresh_social_stickers(query_params:$query_params)");
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
