package com.facebook.redex;

import X.AnonymousClass0LU;
import X.C04220Ms;
import X.C143338gY;
import X.C685344e;
import X.C83334rD;
import com.facebook.pando.TreeJNI;
import com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl;

public class IDxFCallbackShape138S0000000_2_I2 implements C83334rD {
    public final int A00;

    public IDxFCallbackShape138S0000000_2_I2(int i) {
        this.A00 = i;
    }

    public final void onFailure(Throwable th) {
        if (1 - this.A00 == 0) {
            C04220Ms.A0B(th, 0);
            AnonymousClass0LU.A0E("CommerceCartUpdateGlobalCart", "maybeRefreshTotalCount#onFailure ", th);
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C143338gY r4;
        TreeJNI A03;
        TreeJNI treeValue;
        TreeJNI treeValue2;
        if (1 - this.A00 == 0 && (r4 = (C143338gY) obj) != null && (A03 = C685344e.A03(r4)) != null && (treeValue = A03.getTreeValue("xfb_shops_viewer", CommerceShopsViewerCartResponseImpl.XfbShopsViewer.class)) != null && (treeValue2 = treeValue.getTreeValue("cart", CommerceShopsViewerCartResponseImpl.XfbShopsViewer.Cart.class)) != null) {
            treeValue2.getIntValue("total_item_count");
        }
    }
}
