package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class IncentiveItemInfoImpl extends TreeJNI implements C81204nM {

    public final class DiscountAmount extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{CurrencyAmountImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"expiration_date_text", "incentive_credential_id", "incentive_id", "incentive_type", "is_best_offer", "promo_code", "subtitle", DialogModule.KEY_TITLE};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(DiscountAmount.class, "discount_amount");
    }
}
