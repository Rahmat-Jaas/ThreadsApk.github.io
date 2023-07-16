package com.instagram.appreciation.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class ContentAppreciationMetricsDataImpl extends TreeJNI implements C81204nM {

    public final class EstimatedEarnings extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"amount_with_offset", "formatted_amount"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"date_range_start_timestamp", "formatted_date_range"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(EstimatedEarnings.class, "estimated_earnings");
    }
}
