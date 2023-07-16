package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C148178qb;
import X.C148188qc;
import X.C148568rI;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

public final class IGPayoutGetFinancialEntityByAdminResponseImpl extends TreeJNI implements C148188qc {

    public final class PayFinancialEntityByAdmin extends TreeJNI implements C148178qb {
        public final C148568rI A9Q() {
            return (C148568rI) reinterpret(FinancialEntityFragmentImpl.class);
        }

        public final Class[] getInlineClasses() {
            return new Class[]{FinancialEntityFragmentImpl.class};
        }
    }

    public final ImmutableList B0I() {
        return getTreeList("pay_financial_entity_by_admin(where:$input)", PayFinancialEntityByAdmin.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(PayFinancialEntityByAdmin.class, "pay_financial_entity_by_admin(where:$input)");
    }
}
