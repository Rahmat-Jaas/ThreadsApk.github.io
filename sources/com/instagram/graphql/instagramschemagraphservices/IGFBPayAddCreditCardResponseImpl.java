package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import X.C86154wM;
import com.facebook.pando.TreeJNI;

public final class IGFBPayAddCreditCardResponseImpl extends TreeJNI implements C81204nM {

    public final class AddCreditCard extends TreeJNI implements C81204nM {

        public final class CreditCard extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"card_type", "expiry_month", "expiry_year", "id", "last4"};
            }
        }

        public final class PaymentsError extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayPaymentsErrorImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(CreditCard.class, "credit_card", false), PaymentsError.class, "payments_error", false);
        }

        public final String[] getScalarFields() {
            return C86154wM.A1b();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(AddCreditCard.class, "add_credit_card(data:$input)");
    }
}
