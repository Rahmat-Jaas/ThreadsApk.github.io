package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

public final class ECPPayPalConsentBottomSheetFragmentImpl extends TreeJNI implements C81204nM {

    public final class PaypalPolicy extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{PAYLinkableTextFragmentImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{DevServerEntity.COLUMN_DESCRIPTION, "header", "navigation_title", "primary_button_label", "secondary_button_label", "sub_header"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PaypalPolicy.class, "paypal_policy");
    }
}
