package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class BreakDownImpl extends TreeJNI implements C81204nM {

    public final class Breakdown extends TreeJNI implements C81204nM {

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
        return AnonymousClass0wJ.A1b(Breakdown.class, "breakdown");
    }
}
