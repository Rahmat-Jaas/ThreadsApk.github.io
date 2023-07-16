package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FXSSOInfoQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbFxSsoInfo extends TreeJNI implements C81204nM {

        public final class SsoAccountInfo extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"sso_setting_enabled"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(SsoAccountInfo.class, "sso_account_info");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbFxSsoInfo.class, "xfb_fx_sso_info(account_type:\"FACEBOOK\")");
    }
}
