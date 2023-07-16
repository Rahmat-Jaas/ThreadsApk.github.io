package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FxSettingsPersonalDetailsShouldShowInAcResponseImpl extends TreeJNI implements C81204nM {

    public final class FxcalSettings extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"should_show_node_in_accounts_center(interface:\"IG_ANDROID\",selected_node_id:\"PERSONAL_INFO\")"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FxcalSettings.class, "fxcal_settings");
    }
}
