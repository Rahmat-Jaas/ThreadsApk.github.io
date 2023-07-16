package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IgPaymentsUpdatePaymentAccountNameMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class PaymentAccountUpdatePayerName extends TreeJNI implements C81204nM {

        public final class PaymentAccount extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"payer_name"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(PaymentAccount.class, "payment_account");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PaymentAccountUpdatePayerName.class, "payment_account_update_payer_name(data:$input)");
    }
}
