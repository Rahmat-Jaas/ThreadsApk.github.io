package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayUpdateEmailMutationFragmentImpl extends TreeJNI implements C81204nM {

    public final class PayUpdatePaymentAccountEmail extends TreeJNI implements C81204nM {

        public final class Email extends TreeJNI implements C81204nM {
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
            return C18180wK.A1a(C18190wL.A0G(Email.class, "email", false), PaymentsError.class, "payments_error", false);
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PayUpdatePaymentAccountEmail.class, "pay_update_payment_account_email(data:$data)");
    }
}
