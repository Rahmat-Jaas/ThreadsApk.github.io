package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class AREffectConsentStateQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class Viewer extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"flm_ar_effect_consent_state"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Viewer.class, "viewer");
    }
}
