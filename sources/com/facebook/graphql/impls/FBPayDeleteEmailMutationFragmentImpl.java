package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import X.C86154wM;
import com.facebook.pando.TreeJNI;

public final class FBPayDeleteEmailMutationFragmentImpl extends TreeJNI implements C81204nM {

    public final class PayDeletePaymentAccountEmail extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return C86154wM.A1b();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PayDeletePaymentAccountEmail.class, "pay_delete_payment_account_email(data:$data)");
    }
}
