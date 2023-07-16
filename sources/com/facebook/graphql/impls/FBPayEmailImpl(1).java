package com.facebook.graphql.impls;

import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayEmailImpl extends TreeJNI implements C81204nM {
    public final String[] getScalarFields() {
        return new String[]{"id", "is_default", "normalized_email_address", "user_input_email_address"};
    }

    public final Class[] getInlineClasses() {
        return new Class[]{FBPayOneTimeEmailImpl.class};
    }
}
