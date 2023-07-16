package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class CTDAutomatedResponsesStateV2MutationResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbCtdUpdateSavedResponseState extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"client_mutation_id"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbCtdUpdateSavedResponseState.class, "xfb_ctd_update_saved_response_state(data:$input)");
    }
}
