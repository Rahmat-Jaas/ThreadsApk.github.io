package com.instagram.shopping.controller.wishlist;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class UnsaveProductMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class ShopWishlistRemoveCartWishlistProduct extends TreeJNI implements C81204nM {

        public final class RemovedProduct extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"has_viewer_saved", "id"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(RemovedProduct.class, "removed_product");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(ShopWishlistRemoveCartWishlistProduct.class, "shop_wishlist_remove_cart_wishlist_product(params:$input)");
    }
}
