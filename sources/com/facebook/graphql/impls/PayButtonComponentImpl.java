package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PayButtonComponentImpl extends TreeJNI implements C81204nM {

    public final class AuthRequirement extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{AuthFactorRequirementImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"type"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(AuthRequirement.class, "auth_requirement");
    }
}
