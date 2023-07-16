package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PayeeFragmentImpl extends TreeJNI implements C81204nM {

    public final class Payee extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"payee_name", "payee_profile_uri"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"id"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Payee.class, "payee");
    }
}
