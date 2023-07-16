package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PayoutRecordImpl extends TreeJNI implements C81204nM {

    public final class PayoutRecordPayoutRecord extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{PayoutDetailsImpl.class, PayeeFragmentImpl.class, CostBreakDownFragmentImpl.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PayoutRecordPayoutRecord.class, "payout_record(payout_record_id:$payoutRecordId)");
    }
}
