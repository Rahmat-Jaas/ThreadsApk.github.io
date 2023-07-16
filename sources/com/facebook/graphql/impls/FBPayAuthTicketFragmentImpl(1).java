package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayAuthTicketFragmentImpl extends TreeJNI implements C81204nM {

    public final class AuthTicketCapabilities extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"cap_name", "ttl"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"associated_credential_id", "auth_ticket_status", "auth_ticket_type", "fingerprint", "id", "ttl"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(AuthTicketCapabilities.class, "auth_ticket_capabilities");
    }
}
