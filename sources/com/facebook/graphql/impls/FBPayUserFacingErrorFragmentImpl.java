package com.facebook.graphql.impls;

import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;

public final class FBPayUserFacingErrorFragmentImpl extends TreeJNI implements C81204nM {
    public final String[] getScalarFields() {
        return new String[]{TraceFieldType.ErrorCode, TraceFieldType.Error, "error_title"};
    }
}
