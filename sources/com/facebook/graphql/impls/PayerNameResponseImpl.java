package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PayerNameResponseImpl extends TreeJNI implements C81204nM {

    public final class Error extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{SharedPaymentsErrorImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"error_step", "payer_name_on_file"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Error.class, "error");
    }
}
