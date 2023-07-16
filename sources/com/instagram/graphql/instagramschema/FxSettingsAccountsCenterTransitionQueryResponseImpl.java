package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C85084uU;
import X.C85444vC;
import X.C85654vY;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class FxSettingsAccountsCenterTransitionQueryResponseImpl extends TreeJNI implements C85084uU {

    public final class FxcalSettings extends TreeJNI implements C85444vC {

        public final class AcTransitionPreTransitionBanner extends TreeJNI implements C85654vY {
            public final String[] getScalarFields() {
                return new String[]{"content", "primary_action_title", "primary_action_uri", DialogModule.KEY_TITLE};
            }

            public final String AZU() {
                return getStringValue("content");
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
            return new String[]{"should_user_see_pre_transition_banner"};
        }

        public final C85654vY AOO() {
            return (C85654vY) getTreeValue("ac_transition_pre_transition_banner", AcTransitionPreTransitionBanner.class);
        }

        public final boolean BBd() {
            return getBooleanValue("should_user_see_pre_transition_banner");
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(AcTransitionPreTransitionBanner.class, "ac_transition_pre_transition_banner");
        }
    }

    public final C85444vC AkR() {
        return (C85444vC) getTreeValue("fxcal_settings", FxcalSettings.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FxcalSettings.class, "fxcal_settings");
    }
}
