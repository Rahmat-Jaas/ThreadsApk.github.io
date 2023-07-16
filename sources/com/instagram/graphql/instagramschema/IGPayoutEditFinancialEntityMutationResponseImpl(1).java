package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.AnonymousClass8qZ;
import X.C108776iv;
import X.C148168qa;
import X.C148568rI;
import com.facebook.pando.TreeJNI;

public final class IGPayoutEditFinancialEntityMutationResponseImpl extends TreeJNI implements C148168qa {

    public final class UpdatePayFinancialEntity extends TreeJNI implements AnonymousClass8qZ {
        public final C148568rI A9Q() {
            return (C148568rI) reinterpret(FinancialEntityFragmentImpl.class);
        }

        public final Class[] getInlineClasses() {
            return new Class[]{FinancialEntityFragmentImpl.class};
        }
    }

    public final AnonymousClass8qZ BJe() {
        return (AnonymousClass8qZ) getTreeValue("update_pay_financial_entity(input:$input)", UpdatePayFinancialEntity.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(UpdatePayFinancialEntity.class, "update_pay_financial_entity(input:$input)");
    }
}
