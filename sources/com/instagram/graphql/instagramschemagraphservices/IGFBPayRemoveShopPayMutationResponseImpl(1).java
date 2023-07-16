package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import X.C86154wM;
import com.facebook.pando.TreeJNI;

public final class IGFBPayRemoveShopPayMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class RemoveShopPayAccount extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return C86154wM.A1b();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(RemoveShopPayAccount.class, "remove_shop_pay_account(data:$data)");
    }
}
