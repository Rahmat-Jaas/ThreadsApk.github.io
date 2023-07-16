package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PayoutMethodsFragmentImpl extends TreeJNI implements C81204nM {

    public final class PayoutInfo extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"bank_account_number", "bank_name", "credential_id", "direct_debit_credential_status", "onboarding_type", "payout_credential_type", "paypal_email"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(PayoutInfo.class, "payout_info");
    }
}
