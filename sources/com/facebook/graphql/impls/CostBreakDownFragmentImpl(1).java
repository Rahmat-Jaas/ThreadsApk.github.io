package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class CostBreakDownFragmentImpl extends TreeJNI implements C81204nM {

    public final class CostBreakdown extends TreeJNI implements C81204nM {

        public final class Breakdown extends TreeJNI implements C81204nM {

            public final class Amount extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"amount", "currency", "formatted_amount"};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"label"};
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(Amount.class, "amount");
            }
        }

        public final class Disclaimer extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{PAYTextWithLinksFragmentImpl.class};
            }
        }

        public final class PayoutAmountRow extends TreeJNI implements C81204nM {

            public final class Amount extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"formatted_amount"};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"label"};
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(Amount.class, "amount");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(Disclaimer.class, "disclaimer", false), C18190wL.A0G(Breakdown.class, "breakdown", true), C18190wL.A0G(PayoutAmountRow.class, "payout_amount_row", false)};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"id"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(CostBreakdown.class, "cost_breakdown");
    }
}
