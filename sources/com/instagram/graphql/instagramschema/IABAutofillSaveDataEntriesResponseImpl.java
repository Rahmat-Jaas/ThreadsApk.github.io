package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C148038qL;
import X.C148048qM;
import com.facebook.pando.TreeJNI;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class IABAutofillSaveDataEntriesResponseImpl extends TreeJNI implements C148048qM {

    public final class IgIabAutofillSaveDataEntries extends TreeJNI implements C148038qL {
        public final String[] getScalarFields() {
            return new String[]{"ent_id", "last_update_time", IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS};
        }

        public final String Afv() {
            return getStringValue("ent_id");
        }
    }

    public final C148038qL Anz() {
        return (C148038qL) getTreeValue("ig_iab_autofill_save_data_entries(request:$request)", IgIabAutofillSaveDataEntries.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgIabAutofillSaveDataEntries.class, "ig_iab_autofill_save_data_entries(request:$request)");
    }
}
