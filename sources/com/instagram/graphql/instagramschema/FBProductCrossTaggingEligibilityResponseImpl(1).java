package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBProductCrossTaggingEligibilityResponseImpl extends TreeJNI implements C81204nM {

    public final class ProductCrossTaggingEligibility extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"eligible_for_cross_tagging", "product_id"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(ProductCrossTaggingEligibility.class, "product_cross_tagging_eligibility(page_id:$page_id,product_ids:$product_ids)");
    }
}
