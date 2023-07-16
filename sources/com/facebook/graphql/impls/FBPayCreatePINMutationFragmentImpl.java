package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import X.C86154wM;
import com.facebook.pando.TreeJNI;

public final class FBPayCreatePINMutationFragmentImpl extends TreeJNI implements C81204nM {

    public final class FbpayCreateFbpayPin extends TreeJNI implements C81204nM {

        public final class AuthenticationTicket extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayAuthTicketFragmentImpl.class};
            }
        }

        public final class FbpayPin extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"fbpay_pin_status", "id"};
            }
        }

        public final class PaymentsError extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayUserFacingErrorFragmentImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(FbpayPin.class, "fbpay_pin", false), C18190wL.A0G(AuthenticationTicket.class, "authentication_ticket", false), C18190wL.A0G(PaymentsError.class, "payments_error", false)};
        }

        public final String[] getScalarFields() {
            return C86154wM.A1b();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FbpayCreateFbpayPin.class, "fbpay_create_fbpay_pin(data:$input)");
    }
}
