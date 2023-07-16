package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FinancialEntitiesFragmentImpl extends TreeJNI implements C81204nM {

    public final class PayFinancialEntitiesForHub extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FinancialEntityImpl.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(PayFinancialEntitiesForHub.class, "pay_financial_entities_for_hub(session_id:$session_id)");
    }
}
