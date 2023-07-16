package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayLoggingPolicyImpl extends TreeJNI implements C81204nM {

    public final class ClientSuppressionPolicy extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"event_name", "payload_field", "suppression_mode"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"logging_policy_product"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(ClientSuppressionPolicy.class, "client_suppression_policy");
    }
}
