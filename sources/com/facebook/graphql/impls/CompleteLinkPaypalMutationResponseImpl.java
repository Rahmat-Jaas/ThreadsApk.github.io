package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class CompleteLinkPaypalMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class PayCompletePaypalLinking extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"paypal_ba_id"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PayCompletePaypalLinking.class, "pay_complete_paypal_linking(data:$input)");
    }
}
