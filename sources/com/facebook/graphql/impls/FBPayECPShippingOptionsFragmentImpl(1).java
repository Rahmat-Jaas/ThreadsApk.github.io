package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayECPShippingOptionsFragmentImpl extends TreeJNI implements C81204nM {

    public final class ShippingOptions extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayECPShippingOptionFragmentImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"default_selection_id"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(ShippingOptions.class, "shipping_options");
    }
}
