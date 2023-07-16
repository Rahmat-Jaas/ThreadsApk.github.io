package com.instagram.fbpay.auth.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IgPaymentsPINDeleteMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class PaymentPinDelete extends TreeJNI implements C81204nM {

        public final class Viewer extends TreeJNI implements C81204nM {

            public final class User extends TreeJNI implements C81204nM {

                public final class PaymentPin extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return C18210wN.A1Z();
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(PaymentPin.class, "payment_pin");
                }

                public final String[] getScalarFields() {
                    return C18210wN.A1Z();
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(User.class, "user");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Viewer.class, "viewer");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PaymentPinDelete.class, "payment_pin_delete(data:$input)");
    }
}
