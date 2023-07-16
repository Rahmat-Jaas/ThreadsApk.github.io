package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PayoutsSummaryFragmentImpl extends TreeJNI implements C81204nM {

    public final class LastPayoutTotalAmount extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"formatted_amount"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"last_payout_paid_date", "last_total_payouts_percentage_delta", "last_total_payouts_percentage_delta_text"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(LastPayoutTotalAmount.class, "last_payout_total_amount");
    }
}
