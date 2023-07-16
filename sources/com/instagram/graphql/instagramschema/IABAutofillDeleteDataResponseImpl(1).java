package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class IABAutofillDeleteDataResponseImpl extends TreeJNI implements C81204nM {

    public final class IabAutofillDelete extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IabAutofillDelete.class, "iab_autofill_delete(request:$request)");
    }
}
