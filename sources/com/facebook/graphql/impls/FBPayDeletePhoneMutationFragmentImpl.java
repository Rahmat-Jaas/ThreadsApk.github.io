package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayDeletePhoneMutationFragmentImpl extends TreeJNI implements C81204nM {

    public final class DeleteFbpayAccountPhone extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"deleted"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(DeleteFbpayAccountPhone.class, "delete_fbpay_account_phone(data:$data)");
    }
}
