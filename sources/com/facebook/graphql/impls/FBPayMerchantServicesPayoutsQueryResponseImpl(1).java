package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayMerchantServicesPayoutsQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class PayFinancialEntityWrapper extends TreeJNI implements C81204nM {

        public final class PayoutBatchItems extends TreeJNI implements C81204nM {

            public final class Edges extends TreeJNI implements C81204nM {

                public final class Node extends TreeJNI implements C81204nM {
                    public final Class[] getInlineClasses() {
                        return new Class[]{PayoutActivityItemImpl.class};
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(Node.class, "node");
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(Edges.class, "edges");
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"financial_id"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(PayoutBatchItems.class, "payout_batch_items(after:$after,first:$first)");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PayFinancialEntityWrapper.class, "pay_financial_entity_wrapper(id:$id)");
    }
}
