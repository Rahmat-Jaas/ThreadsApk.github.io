package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayMerchantServicesEarningsDetailsQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class PayFinancialEntityWrapper extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{PayoutRecordImpl.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PayFinancialEntityWrapper.class, "pay_financial_entity_wrapper(id:$id)");
    }
}
