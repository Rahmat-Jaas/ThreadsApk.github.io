package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import X.C86154wM;
import com.facebook.pando.TreeJNI;

public final class FBPayCompleteShopPayAccountLinkingMutationFragmentImpl extends TreeJNI implements C81204nM {

    public final class FbpayCompleteLinkShoppayAccount extends TreeJNI implements C81204nM {

        public final class ShoppayAccount extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"id", "shoppay_user_id", "shoppay_username"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(ShoppayAccount.class, "shoppay_account");
        }

        public final String[] getScalarFields() {
            return C86154wM.A1b();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FbpayCompleteLinkShoppayAccount.class, "fbpay_complete_link_shoppay_account(data:$input)");
    }
}
