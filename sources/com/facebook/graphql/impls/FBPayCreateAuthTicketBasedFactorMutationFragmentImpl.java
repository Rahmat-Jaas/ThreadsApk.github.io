package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import X.C86154wM;
import com.facebook.pando.TreeJNI;

public final class FBPayCreateAuthTicketBasedFactorMutationFragmentImpl extends TreeJNI implements C81204nM {

    public final class FbpayCreateAuthenticationTicketBasedFactor extends TreeJNI implements C81204nM {

        public final class AuthenticationTicket extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayAuthTicketFragmentImpl.class};
            }
        }

        public final class PaymentsError extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayUserFacingErrorFragmentImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(AuthenticationTicket.class, "authentication_ticket", false), PaymentsError.class, "payments_error", false);
        }

        public final String[] getScalarFields() {
            return C86154wM.A1b();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FbpayCreateAuthenticationTicketBasedFactor.class, "fbpay_create_authentication_ticket_based_factor(data:$input)");
    }
}
