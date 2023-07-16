package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class ECPUserFacingErrorMaybeDeadImpl extends TreeJNI implements C81204nM {

    public final class UserFacingError extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{SharedPaymentsErrorMaybeDeadImpl.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(UserFacingError.class, "user_facing_error");
    }
}
