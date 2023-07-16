package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C85324us;
import X.C85334ut;
import X.C85344uu;
import com.facebook.pando.TreeJNI;

public final class IGPaymentsAccountDisabledRiskQueryResponseImpl extends TreeJNI implements C85344uu {

    public final class Me extends TreeJNI implements C85334ut {

        public final class PayConsumerPaymentAccount extends TreeJNI implements C85324us {
            public final String[] getScalarFields() {
                return new String[]{"payments_disabled"};
            }

            public final boolean B0R() {
                return getBooleanValue("payments_disabled");
            }
        }

        public final C85324us B0F() {
            return (C85324us) getTreeValue("pay_consumer_payment_account", PayConsumerPaymentAccount.class);
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(PayConsumerPaymentAccount.class, "pay_consumer_payment_account");
        }
    }

    public final C85334ut Atp() {
        return (C85334ut) getTreeValue("me", Me.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Me.class, "me");
    }
}
