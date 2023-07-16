package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import X.C86154wM;
import com.facebook.pando.TreeJNI;

public final class IGFBPayDisableCreditCardResponseImpl extends TreeJNI implements C81204nM {

    public final class DisableCreditCard extends TreeJNI implements C81204nM {

        public final class CreditCard extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"card_type", "expiry_month", "expiry_year", "id", "last4"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(CreditCard.class, "credit_card");
        }

        public final String[] getScalarFields() {
            return C86154wM.A1b();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(DisableCreditCard.class, "disable_credit_card(data:$input)");
    }
}
