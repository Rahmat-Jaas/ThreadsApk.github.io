package com.instagram.graphql.instagramschema;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

public final class IGFilteredAvatarStickersQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FetchIGUser extends TreeJNI implements C81204nM {

        public final class UserAvatar extends TreeJNI implements C81204nM {

            public final class IgFilteredStickers extends TreeJNI implements C81204nM {

                public final class Stickers extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"accessibility_label", "cdn_url", "file_format", "fps", IgReactMediaPickerNativeModule.HEIGHT, "id", "instruction_key_id", "media_type", "number_of_avatars", "template", IgReactMediaPickerNativeModule.WIDTH};
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{AnonymousClass000.A00(52), "config_hash", "has_next_page", AnonymousClass000.A00(1014), AnonymousClass000.A00(1353)};
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1b(Stickers.class, "stickers");
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(IgFilteredStickers.class, "ig_filtered_stickers(query_params:$query_params)");
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
