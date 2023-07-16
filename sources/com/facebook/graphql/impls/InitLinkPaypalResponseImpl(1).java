package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class InitLinkPaypalResponseImpl extends TreeJNI implements C81204nM {

    public final class InitLinkPaypal extends TreeJNI implements C81204nM {

        public final class PaymentsError extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{SharedPaymentsErrorImpl.class};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"paypal_link_url"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(PaymentsError.class, "payments_error");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(InitLinkPaypal.class, "init_link_paypal(input:$input)");
    }
}
