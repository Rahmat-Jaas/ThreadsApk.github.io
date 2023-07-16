package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.AnonymousClass8r0;
import X.C108776iv;
import X.C148138qV;
import X.C148418qz;
import X.C23849CzL;
import X.C86104wH;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

public final class IGAREffectsGalleryCategoriesQueryResponseImpl extends TreeJNI implements C148138qV {

    public final class ArEffectCategories extends TreeJNI implements AnonymousClass8r0 {

        public final class ProductCategories extends TreeJNI implements C148418qz {
            public final String[] getScalarFields() {
                return new String[]{"display_name", "product_category_identifier", "type"};
            }

            public final String AdZ() {
                return getStringValue("display_name");
            }

            public final C23849CzL B3f() {
                return (C23849CzL) C86104wH.A0a(this, C23849CzL.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "product_category_identifier");
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"default_product_category_identifier"};
        }

        public final C23849CzL Acc() {
            return (C23849CzL) C86104wH.A0a(this, C23849CzL.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "default_product_category_identifier");
        }

        public final ImmutableList B3e() {
            return getTreeList("product_categories(show_green_screen_category_for_reels:$show_green_screen_category_for_reels)", ProductCategories.class);
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(ProductCategories.class, "product_categories(show_green_screen_category_for_reels:$show_green_screen_category_for_reels)");
        }
    }

    public final AnonymousClass8r0 ARB() {
        return (AnonymousClass8r0) getTreeValue("ar_effect_categories(device_capabilities:$device_capabilities,include_flm_effects:$include_flm_effects,product:$product)", ArEffectCategories.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(ArEffectCategories.class, "ar_effect_categories(device_capabilities:$device_capabilities,include_flm_effects:$include_flm_effects,product:$product)");
    }
}
