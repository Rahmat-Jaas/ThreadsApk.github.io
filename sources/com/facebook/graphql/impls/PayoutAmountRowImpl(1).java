package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PayoutAmountRowImpl extends TreeJNI implements C81204nM {

    public final class PayoutAmountRowPayoutAmountRow extends TreeJNI implements C81204nM {

        public final class Amount extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"formatted_amount"};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"accessibility_label", "label"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Amount.class, "amount");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PayoutAmountRowPayoutAmountRow.class, "payout_amount_row");
    }
}
