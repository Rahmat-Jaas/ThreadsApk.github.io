package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGAvatarPrivacySettingsUpdateSettingsResponseImpl extends TreeJNI implements C81204nM {

    public final class XigUpdateUsabilityAvatarPrivacySetting extends TreeJNI implements C81204nM {

        public final class AvatarPrivacySetting extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"id", "surface", "usability"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(AvatarPrivacySetting.class, "avatar_privacy_setting");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XigUpdateUsabilityAvatarPrivacySetting.class, "xig_update_usability_avatar_privacy_setting(data:{\"avatar_privacy_setting_id\":$avatar_settings_id,\"client_mutation_id\":1,\"usability\":$usability})");
    }
}
