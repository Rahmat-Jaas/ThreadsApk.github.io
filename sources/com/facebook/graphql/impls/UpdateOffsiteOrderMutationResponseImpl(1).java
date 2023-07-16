package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class UpdateOffsiteOrderMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class UpdateOffsiteOrder extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"actor_id", "client_mutation_id", "order_id"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(UpdateOffsiteOrder.class, "update_offsite_order(input:$input)");
    }
}
