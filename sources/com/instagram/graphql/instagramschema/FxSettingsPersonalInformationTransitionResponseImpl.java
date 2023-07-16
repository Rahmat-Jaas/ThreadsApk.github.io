package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class FxSettingsPersonalInformationTransitionResponseImpl extends TreeJNI implements C81204nM {

    public final class FxcalSettings extends TreeJNI implements C81204nM {

        public final class AcTransitionOptionTwoGroupOfSettingsBanner extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"primary_action_title", "primary_action_uri", DialogModule.KEY_TITLE};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"ac_transition_ig_personal_information_header"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(AcTransitionOptionTwoGroupOfSettingsBanner.class, "ac_transition_option_two_group_of_settings_banner");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FxcalSettings.class, "fxcal_settings");
    }
}
