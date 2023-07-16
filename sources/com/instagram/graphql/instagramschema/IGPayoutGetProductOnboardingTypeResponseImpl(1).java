package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGPayoutGetProductOnboardingTypeResponseImpl extends TreeJNI implements C81204nM {

    public final class PayoutSubtypeConfig extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"onboarding_type"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PayoutSubtypeConfig.class, "payout_subtype_config(input:$input)");
    }
}
