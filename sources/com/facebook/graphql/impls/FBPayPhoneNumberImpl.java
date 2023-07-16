package com.facebook.graphql.impls;

import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayPhoneNumberImpl extends TreeJNI implements C81204nM {
    public final String[] getScalarFields() {
        return new String[]{"formatted_intl_number_with_plus", "id", "is_default", "normalized_phone_number"};
    }

    public final Class[] getInlineClasses() {
        return new Class[]{FBPayOneTimePhoneNumberImpl.class};
    }
}
