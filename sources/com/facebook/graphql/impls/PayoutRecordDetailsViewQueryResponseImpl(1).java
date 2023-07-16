package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PayoutRecordDetailsViewQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbBusinessPaymentsHub extends TreeJNI implements C81204nM {

        public final class EarningDetailsView extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{EarningDetailImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(EarningDetailsView.class, "earning_details_view(fe_id:$fe_id,managed_merchant_acc_id:$mma_id,payout_record_id:$payout_record_id,session_id:$session_id)");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbBusinessPaymentsHub.class, "xfb_business_payments_hub(interface_type:$interface_type)");
    }
}
