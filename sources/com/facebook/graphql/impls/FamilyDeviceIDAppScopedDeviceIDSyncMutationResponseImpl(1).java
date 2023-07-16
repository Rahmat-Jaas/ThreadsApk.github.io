package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FamilyDeviceIDAppScopedDeviceIDSyncMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class FdidSyncClientIds extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"testing"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FdidSyncClientIds.class, "fdid_sync_client_ids(input:$input)");
    }
}
