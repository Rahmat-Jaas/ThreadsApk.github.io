package com.instagram.fbpay.hub.contactinfo.graphql;

import X.AnonymousClass0wJ;
import X.AnonymousClass6H6;
import X.C108776iv;
import X.C81204nM;
import X.C86114wI;
import com.facebook.pando.TreeJNI;

public final class IGFBPayShareableContactInfoQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class Me extends TreeJNI implements C81204nM {

        public final class PayConsumerPaymentAccount extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"payer_name"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(PayConsumerPaymentAccount.class, "pay_consumer_payment_account");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Me.class, "me");
    }

    public final Class[] getInlineClasses() {
        try {
            return new Class[]{AnonymousClass6H6.A00(1388533533)};
        } catch (ClassNotFoundException e) {
            throw C86114wI.A0k(e);
        }
    }
}
