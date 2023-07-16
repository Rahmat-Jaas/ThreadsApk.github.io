package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class TaxInfoFragmentImpl extends TreeJNI implements C81204nM {

    public final class TaxForm extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"file_name"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(TaxForm.class, "tax_form");
    }
}
