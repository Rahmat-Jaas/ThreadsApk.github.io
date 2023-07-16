package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayMerchantServicesEarningsQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class PayFinancialEntityWrapper extends TreeJNI implements C81204nM {

        public final class PayoutRecords extends TreeJNI implements C81204nM {

            public final class Edges extends TreeJNI implements C81204nM {

                public final class Node extends TreeJNI implements C81204nM {
                    public final Class[] getInlineClasses() {
                        return new Class[]{PayoutRecordItemImpl.class};
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

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(PayoutRecords.class, "payout_records(after:$after,batch_item_id:$batch_item_id,first:$first)");
        }
    }

    public final class XfbBusinessPaymentsHub extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"show_action_column_in_earning_table"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(XfbBusinessPaymentsHub.class, "xfb_business_payments_hub(interface_type:$interface_type)", false), PayFinancialEntityWrapper.class, "pay_financial_entity_wrapper(id:$id)", false);
    }
}
