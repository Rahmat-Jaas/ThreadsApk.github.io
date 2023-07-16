package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayAddEmailMutationFragmentImpl extends TreeJNI implements C81204nM {

    public final class AddPaymentAccountEmail extends TreeJNI implements C81204nM {

        public final class PaymentAccountEmail extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayEmailFragmentImpl.class};
            }
        }

        public final class PaymentsError extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayPaymentsUserFacingErrorFragmentImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(PaymentAccountEmail.class, "payment_account_email", false), PaymentsError.class, "payments_error", false);
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(AddPaymentAccountEmail.class, "add_payment_account_email(data:$data)");
    }
}
