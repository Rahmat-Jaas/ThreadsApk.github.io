package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.AnonymousClass4v3;
import X.C108776iv;
import X.C85744vh;
import com.facebook.pando.TreeJNI;

public final class IGUserConsentQueryResponseImpl extends TreeJNI implements AnonymousClass4v3 {

    public final class IgUserConsent extends TreeJNI implements C85744vh {
        public final String[] getScalarFields() {
            return new String[]{"consent_required", "cross_site_tracking_opt_in", "first_party_tracking_opt_in", "has_consent_choices", "show_settings", "third_party_tracking_opt_in"};
        }

        public final boolean AZ9() {
            return getBooleanValue("consent_required");
        }

        public final boolean Aii() {
            return getBooleanValue("first_party_tracking_opt_in");
        }

        public final boolean Ald() {
            return getBooleanValue("has_consent_choices");
        }

        public final boolean BBz() {
            return getBooleanValue("show_settings");
        }

        public final boolean BGJ() {
            return getBooleanValue("third_party_tracking_opt_in");
        }

        public final boolean BNq() {
            return hasFieldValue("consent_required");
        }

        public final boolean BNz() {
            return hasFieldValue("first_party_tracking_opt_in");
        }

        public final boolean BO3() {
            return hasFieldValue("has_consent_choices");
        }

        public final boolean BOc() {
            return hasFieldValue("show_settings");
        }

        public final boolean BOi() {
            return hasFieldValue("third_party_tracking_opt_in");
        }
    }

    public final C85744vh AoG() {
        return (C85744vh) getTreeValue("ig_user_consent", IgUserConsent.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgUserConsent.class, "ig_user_consent");
    }
}
