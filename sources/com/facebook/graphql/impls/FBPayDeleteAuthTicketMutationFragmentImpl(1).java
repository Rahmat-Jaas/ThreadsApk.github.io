package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import X.C86154wM;
import com.facebook.pando.TreeJNI;

public final class FBPayDeleteAuthTicketMutationFragmentImpl extends TreeJNI implements C81204nM {

    public final class FbpayDeleteAuthenticationTicket extends TreeJNI implements C81204nM {

        public final class PaymentsError extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayUserFacingErrorFragmentImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(PaymentsError.class, "payments_error");
        }

        public final String[] getScalarFields() {
            return C86154wM.A1b();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FbpayDeleteAuthenticationTicket.class, "fbpay_delete_authentication_ticket(data:$input)");
    }
}
