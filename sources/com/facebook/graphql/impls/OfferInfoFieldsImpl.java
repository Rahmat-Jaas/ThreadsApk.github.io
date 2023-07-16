package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18170wI;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class OfferInfoFieldsImpl extends TreeJNI implements C81204nM {

    public final class OfferItems extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"discount_code", "expiration_date_text", C18170wI.A00(1034), "offer_id", "subtitle", DialogModule.KEY_TITLE};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(OfferItems.class, "offer_items");
    }
}
