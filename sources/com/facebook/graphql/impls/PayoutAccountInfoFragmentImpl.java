package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PayoutAccountInfoFragmentImpl extends TreeJNI implements C81204nM {

    public final class CompanyAddress extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"country_code"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"company_name", "company_type"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(CompanyAddress.class, "company_address");
    }
}
