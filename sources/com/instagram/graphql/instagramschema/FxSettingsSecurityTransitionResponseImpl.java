package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C85144ua;
import X.C85464vE;
import X.C85604vT;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class FxSettingsSecurityTransitionResponseImpl extends TreeJNI implements C85144ua {

    public final class FxcalSettings extends TreeJNI implements C85464vE {

        public final class AcTransitionOptionTwoGroupOfSettingsBanner extends TreeJNI implements C85604vT {
            public final String[] getScalarFields() {
                return new String[]{"primary_action_title", "primary_action_uri", DialogModule.KEY_TITLE};
            }

            public final String B3D() {
                return getStringValue("primary_action_title");
            }

            public final String B3E() {
                return getStringValue("primary_action_uri");
            }

            public final String BH2() {
                return getStringValue(DialogModule.KEY_TITLE);
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"security_accounts_center_subtitle"};
        }

        public final C85604vT AON() {
            return (C85604vT) getTreeValue("ac_transition_option_two_group_of_settings_banner", AcTransitionOptionTwoGroupOfSettingsBanner.class);
        }

        public final String B9U() {
            return getStringValue("security_accounts_center_subtitle");
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(AcTransitionOptionTwoGroupOfSettingsBanner.class, "ac_transition_option_two_group_of_settings_banner");
        }
    }

    public final C85464vE AkV() {
        return (C85464vE) getTreeValue("fxcal_settings", FxcalSettings.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FxcalSettings.class, "fxcal_settings");
    }
}
