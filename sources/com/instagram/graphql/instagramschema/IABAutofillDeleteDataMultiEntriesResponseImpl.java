package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class IABAutofillDeleteDataMultiEntriesResponseImpl extends TreeJNI implements C81204nM {

    public final class IgIabAutofillDeleteMultiEntries extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgIabAutofillDeleteMultiEntries.class, "ig_iab_autofill_delete_multi_entries(request:$request)");
    }
}
