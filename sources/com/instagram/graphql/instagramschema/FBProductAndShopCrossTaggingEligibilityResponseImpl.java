package com.instagram.graphql.instagramschema;

import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBProductAndShopCrossTaggingEligibilityResponseImpl extends TreeJNI implements C81204nM {

    public final class ProductCrossTaggingEligibility extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"eligible_for_cross_tagging", "product_id"};
        }
    }

    public final class ShopCrossTaggingEligibility extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"eligible_for_cross_tagging"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(ProductCrossTaggingEligibility.class, "product_cross_tagging_eligibility(page_id:$page_id,product_ids:$product_ids)", true), ShopCrossTaggingEligibility.class, "shop_cross_tagging_eligibility(page_id:$page_id)", false);
    }
}
