package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C148278ql;
import X.C148288qm;
import X.C148298qn;
import X.C148478r8;
import X.C18220wO;
import X.C86104wH;
import X.C86154wM;
import X.C966866h;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

public final class PayoutBatchItemFragmentImpl extends TreeJNI implements C148298qn {

    public final class Edges extends TreeJNI implements C148288qm {

        public final class Node extends TreeJNI implements C148478r8 {
            public final String[] getScalarFields() {
                return new String[]{"id", "payment_date", "payout_batch_item_status"};
            }

            public final class PayoutBatchItemPayoutAmount extends TreeJNI implements C148278ql {
                public final String[] getScalarFields() {
                    return new String[]{"formatted_amount"};
                }

                public final String AjX() {
                    return C86154wM.A0k(this);
                }
            }

            public final String B0O() {
                return getStringValue("payment_date");
            }

            public final C148278ql B0W() {
                return (C148278ql) getTreeValue("payout_batch_item_payout_amount", PayoutBatchItemPayoutAmount.class);
            }

            public final C966866h B0Y() {
                return (C966866h) C86104wH.A0a(this, C966866h.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "payout_batch_item_status");
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(PayoutBatchItemPayoutAmount.class, "payout_batch_item_payout_amount");
            }

            public final String getId() {
                return C18220wO.A0m(this);
            }
        }

        public final C148478r8 Axc() {
            return (C148478r8) getTreeValue("node", Node.class);
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Node.class, "node");
        }
    }

    public final ImmutableList Aeb() {
        return getTreeList("edges", Edges.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(Edges.class, "edges");
    }
}
