package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGFBPayExperienceEnabledResponseImpl extends TreeJNI implements C81204nM {

    public final class FbpayAccountExtended extends TreeJNI implements C81204nM {

        public final class FbpayAccount extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"is_connected"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(FbpayAccount.class, "fbpay_account");
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"fbpay_experience_enabled(log_exposure_for_qe:true)"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FbpayAccountExtended.class, "fbpay_account_extended");
    }
}
