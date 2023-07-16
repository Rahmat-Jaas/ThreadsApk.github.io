package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C85104uW;
import X.C85114uX;
import com.facebook.pando.TreeJNI;

public final class FxSettingsCookiesSubtitleResponseImpl extends TreeJNI implements C85114uX {

    public final class FxcalSettings extends TreeJNI implements C85104uW {
        public final String[] getScalarFields() {
            return new String[]{"ig_cookies_accounts_center_subtitle"};
        }

        public final String Ans() {
            return getStringValue("ig_cookies_accounts_center_subtitle");
        }
    }

    public final C85104uW AkT() {
        return (C85104uW) getTreeValue("fxcal_settings", FxcalSettings.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FxcalSettings.class, "fxcal_settings");
    }
}
