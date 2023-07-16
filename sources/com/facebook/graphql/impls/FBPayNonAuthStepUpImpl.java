package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayNonAuthStepUpImpl extends TreeJNI implements C81204nM {

    public final class PaypalConsentBottomSheet extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{ECPPayPalConsentBottomSheetFragmentImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"paypal_id", "step_up_type"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PaypalConsentBottomSheet.class, "paypal_consent_bottom_sheet");
    }
}
