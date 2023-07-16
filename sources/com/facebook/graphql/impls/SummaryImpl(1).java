package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class SummaryImpl extends TreeJNI implements C81204nM {

    public final class SummaryInfo extends TreeJNI implements C81204nM {

        public final class CostBreakdown extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{BreakDownImpl.class, PayoutAmountRowImpl.class, DisclaimerImpl.class};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"section_title"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(CostBreakdown.class, "cost_breakdown");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(SummaryInfo.class, "summary_info");
    }
}
