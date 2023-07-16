package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PayoutSettingsQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class PayFinancialEntity extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{PayoutMethodsFragmentImpl.class, TaxInfoFragmentImpl.class, PayoutAccountInfoFragmentImpl.class, AccountAdminsFragmentImpl.class, EditLinksFragmentImpl.class, PayoutOwnerFragmentImpl.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PayFinancialEntity.class, "pay_financial_entity(id:$id)");
    }
}
