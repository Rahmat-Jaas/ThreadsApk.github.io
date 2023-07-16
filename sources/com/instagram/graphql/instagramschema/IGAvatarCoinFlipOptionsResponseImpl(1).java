package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18170wI;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class IGAvatarCoinFlipOptionsResponseImpl extends TreeJNI implements C81204nM {

    public final class FetchIGUser extends TreeJNI implements C81204nM {

        public final class UserAvatar extends TreeJNI implements C81204nM {

            public final class IgFetchCoinFlipOptions extends TreeJNI implements C81204nM {

                public final class BackgroundOptions extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"accessibility_label", "cdn_url", "id", FXPFAccessLibraryDebugFragment.NAME};
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1b(BackgroundOptions.class, "background_options");
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(IgFetchCoinFlipOptions.class, "ig_fetch_coin_flip_options(query_params:$query_params)");
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
