package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C148058qN;
import X.C148068qO;
import X.C148078qP;
import X.C148098qR;
import com.facebook.pando.TreeJNI;

public final class IGAREffectCollectionQueryResponseImpl extends TreeJNI implements C148078qP {

    public final class ArEffectCategories extends TreeJNI implements C148068qO {

        public final class Results extends TreeJNI implements C148058qN {
            public final C148098qR A9U() {
                return (C148098qR) reinterpret(IGAREffectCollectionResultImpl.class);
            }

            public final Class[] getInlineClasses() {
                return new Class[]{IGAREffectCollectionResultImpl.class};
            }
        }

        public final C148058qN B7z() {
            return (C148058qN) getTreeValue("product_category(product_category_identifier:$product_category_identifier)", Results.class);
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Results.class, "product_category(product_category_identifier:$product_category_identifier)");
        }
    }

    public final C148068qO ARA() {
        return (C148068qO) getTreeValue("ar_effect_categories(device_capabilities:$device_capabilities,filter_checks:$filter_checks,include_flm_effects:$include_flm_effects,product:$product)", ArEffectCategories.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(ArEffectCategories.class, "ar_effect_categories(device_capabilities:$device_capabilities,filter_checks:$filter_checks,include_flm_effects:$include_flm_effects,product:$product)");
    }
}
