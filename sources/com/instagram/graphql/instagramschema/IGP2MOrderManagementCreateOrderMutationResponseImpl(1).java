package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGP2MOrderManagementCreateOrderMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbIgP2mCreateOrder extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"client_mutation_id", "order_id"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbIgP2mCreateOrder.class, "xfb_ig_p2m_create_order(data:$input)");
    }
}
