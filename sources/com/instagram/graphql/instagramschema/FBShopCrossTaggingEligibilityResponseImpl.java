package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBShopCrossTaggingEligibilityResponseImpl extends TreeJNI implements C81204nM {

    public final class ShopCrossTaggingEligibility extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"eligible_for_cross_tagging"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(ShopCrossTaggingEligibility.class, "shop_cross_tagging_eligibility(page_id:$page_id)");
    }
}
