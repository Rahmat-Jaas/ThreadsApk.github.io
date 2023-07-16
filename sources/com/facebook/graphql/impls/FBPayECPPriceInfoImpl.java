package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class FBPayECPPriceInfoImpl extends TreeJNI implements C81204nM {

    public final class Amount extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"amount", "currency"};
        }
    }

    public final class Metadata extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"offer_ids"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{DevServerEntity.COLUMN_DESCRIPTION, "label", IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "type"};
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(Amount.class, "amount", false), Metadata.class, "metadata", false);
    }
}
