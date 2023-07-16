package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class EarningsBreakdownFragmentImpl extends TreeJNI implements C81204nM {

    public final class AggregatedPayoutAmount extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"formatted_amount"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"accessibility_label", "product_icon_uri", "product_icon_uri_dark", "source_name"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(AggregatedPayoutAmount.class, "aggregated_payout_amount");
    }
}
