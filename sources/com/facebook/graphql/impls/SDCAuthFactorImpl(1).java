package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class SDCAuthFactorImpl extends TreeJNI implements C81204nM {

    public final class AuthAmount extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"amount", "currency"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"auth_factor_type", "cred_id", DialogModule.KEY_TITLE};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(AuthAmount.class, "auth_amount");
    }
}
