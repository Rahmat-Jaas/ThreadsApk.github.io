package com.instagram.fbpay.auth.graphql;

import X.AnonymousClass0wJ;
import X.AnonymousClass6H6;
import X.C108776iv;
import X.C81204nM;
import X.C86114wI;
import X.C86154wM;
import com.facebook.pando.TreeJNI;

public final class IGResetPINWithPasswordMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class PaymentPinUpdate extends TreeJNI implements C81204nM {

        public final class AuthenticationTicket extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                try {
                    return new Class[]{AnonymousClass6H6.A00(-1563793709)};
                } catch (ClassNotFoundException e) {
                    throw C86114wI.A0k(e);
                }
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
        return AnonymousClass0wJ.A1a(PaymentPinUpdate.class, "payment_pin_update(data:$input)");
    }
}
