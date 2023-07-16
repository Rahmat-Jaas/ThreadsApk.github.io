package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.AnonymousClass4v6;
import X.C108776iv;
import X.C18210wN;
import X.C81204nM;
import X.C85414v5;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

public final class IgPaymentsSettingsPaymentMethodsViewImpl extends TreeJNI implements AnonymousClass4v6 {

    public final class PayConsumerPaymentAccount extends TreeJNI implements C85414v5 {

        public final class PaymentCredentials extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{IgPaymentsCredentialMethodViewImpl.class};
            }
        }

        public final ImmutableList B0N() {
            return getTreeList("payment_credentials(payment_type:$payment_type)", PaymentCredentials.class);
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(PaymentCredentials.class, "payment_credentials(payment_type:$payment_type)");
        }
    }

    public final C85414v5 B0G() {
        return (C85414v5) getTreeValue("pay_consumer_payment_account", PayConsumerPaymentAccount.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PayConsumerPaymentAccount.class, "pay_consumer_payment_account");
    }

    public final String[] getScalarFields() {
        return C18210wN.A1Z();
    }
}
