package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayShopPayInitLinkMutationFragmentImpl extends TreeJNI implements C81204nM {

    public final class FbpayShoppayLinkAccountInit extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"client_mutation_id", "external_auth_url"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FbpayShoppayLinkAccountInit.class, "fbpay_shoppay_link_account_init(data:$input)");
    }
}
