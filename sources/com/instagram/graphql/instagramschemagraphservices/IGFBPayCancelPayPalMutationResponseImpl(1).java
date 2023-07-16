package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGFBPayCancelPayPalMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class CancelPaypalBa extends TreeJNI implements C81204nM {

        public final class BillingAgreement extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{IgPaymentsPayPalCredentialViewMeImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(BillingAgreement.class, "billing_agreement");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(CancelPaypalBa.class, "cancel_paypal_ba(data:$data)");
    }
}
