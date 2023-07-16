package com.instagram.shopping.controller.wishlist;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class SaveProductMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbIgShopWishlistAddProductIgid extends TreeJNI implements C81204nM {

        public final class UpdatedCartWishlistProducts extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"has_viewer_saved", "id"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(UpdatedCartWishlistProducts.class, "updated_cart_wishlist_products");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbIgShopWishlistAddProductIgid.class, "xfb_ig_shop_wishlist_add_product_igid(data:$input)");
    }
}
