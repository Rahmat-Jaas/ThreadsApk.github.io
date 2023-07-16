package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import X.C86154wM;
import com.facebook.pando.TreeJNI;

public final class FBPayVerifyFactorMutationFragmentImpl extends TreeJNI implements C81204nM {

    public final class FbpayAuthFactorVerification extends TreeJNI implements C81204nM {

        public final class AuthenticationTicket extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayAuthTicketFragmentImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(AuthenticationTicket.class, "authentication_ticket");
        }

        public final String[] getScalarFields() {
            return C86154wM.A1b();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FbpayAuthFactorVerification.class, "fbpay_auth_factor_verification(data:$input)");
    }
}
