package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGFBPayCompletePaypalLinkingMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class CompletePaypalLinking extends TreeJNI implements C81204nM {

        public final class PaypalBa extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{IgPaymentsPayPalCredentialViewMeImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(PaypalBa.class, "paypal_ba");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(CompletePaypalLinking.class, "complete_paypal_linking(data:$data)");
    }
}
