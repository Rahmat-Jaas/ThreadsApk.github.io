package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C85094uV;
import X.C85584vR;
import X.C85594vS;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class FxSettingsAdsTransitionResponseImpl extends TreeJNI implements C85094uV {

    public final class FxcalSettings extends TreeJNI implements C85594vS {

        public final class AcTransitionOptionTwoGroupOfSettingsBanner extends TreeJNI implements C85584vR {
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
            return new String[]{"ads_accounts_center_subtitle", "should_show_node_in_accounts_center(interface:\"IG_ANDROID\",selected_node_id:\"AD_TOPICS\")"};
        }

        public final C85584vR AOM() {
            return (C85584vR) getTreeValue("ac_transition_option_two_group_of_settings_banner", AcTransitionOptionTwoGroupOfSettingsBanner.class);
        }

        public final String APk() {
            return getStringValue("ads_accounts_center_subtitle");
        }

        public final boolean BBP() {
            return getBooleanValue("should_show_node_in_accounts_center(interface:\"IG_ANDROID\",selected_node_id:\"AD_TOPICS\")");
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(AcTransitionOptionTwoGroupOfSettingsBanner.class, "ac_transition_option_two_group_of_settings_banner");
        }
    }

    public final C85594vS AkS() {
        return (C85594vS) getTreeValue("fxcal_settings", FxcalSettings.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FxcalSettings.class, "fxcal_settings");
    }
}
