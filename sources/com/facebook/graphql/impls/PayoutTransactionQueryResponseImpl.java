package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PayoutTransactionQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbBusinessPaymentsHub extends TreeJNI implements C81204nM {

        public final class PayoutTransactions extends TreeJNI implements C81204nM {

            public final class Edges extends TreeJNI implements C81204nM {

                public final class Node extends TreeJNI implements C81204nM {
                    public final Class[] getInlineClasses() {
                        return new Class[]{TransactionFragmentImpl.class};
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(Node.class, "node");
                }
            }

            public final class PageInfo extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{PaginationInfoImpl.class};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(PageInfo.class, "page_info", false), Edges.class, "edges", true);
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(PayoutTransactions.class, "payout_transactions(after:$after,fe_id:$fe_id,filter:{\"filter_type\":$filter_type},first:$first,session_id:$session_id)");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbBusinessPaymentsHub.class, "xfb_business_payments_hub(interface_type:$interface_type)");
    }
}
