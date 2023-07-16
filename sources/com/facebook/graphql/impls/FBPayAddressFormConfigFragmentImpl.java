package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayAddressFormConfigFragmentImpl extends TreeJNI implements C81204nM {

    public final class CountryToFields extends TreeJNI implements C81204nM {

        public final class FormFields extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayFormFieldImpl.class};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"country_code"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(FormFields.class, "form_fields");
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"default_country"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(CountryToFields.class, "country_to_fields");
    }
}
