package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PromoCodeComponentImpl extends TreeJNI implements C81204nM {

    public final class OfferInfo extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{OfferInfoFieldsImpl.class};
        }
    }

    public final class PromoCodeFieldConfig extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayFormFieldImpl.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(PromoCodeFieldConfig.class, "promo_code_field_config", false), OfferInfo.class, "offer_info", false);
    }
}
