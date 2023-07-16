package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

public final class FBPayECPShippingOptionFragmentImpl extends TreeJNI implements C81204nM {

    public final class Price extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"amount", "currency_code"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{DevServerEntity.COLUMN_DESCRIPTION, "id", "label", "type"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Price.class, "price");
    }
}
