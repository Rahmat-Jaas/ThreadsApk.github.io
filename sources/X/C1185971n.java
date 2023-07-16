package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.shopping.controller.wishlist.SaveProductMutationResponseImpl;
import com.instagram.shopping.controller.wishlist.UnsaveProductMutationResponseImpl;

/* renamed from: X.71n  reason: invalid class name and case insensitive filesystem */
public final class C1185971n {
    public static final C85754vi A00(String str, String str2) {
        C67463zb A00 = C67463zb.A00();
        C67463zb A002 = C67463zb.A00();
        GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
        GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
        A003.A0F(str, "product_id");
        A003.A0F(str2, I17.A00(117));
        A0L.A0A("ig_compound_product_ids", C18180wK.A0n(A003));
        A00.A02(A0L, "input");
        return new PandoGraphQLRequest(C63233h2.A01(), "SaveProductMutation", A00.getParamsCopy(), A002.getParamsCopy(), SaveProductMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 8, "input", "xfb_ig_shop_wishlist_add_product_igid");
    }

    public static final C85754vi A01(String str, String str2) {
        C67463zb A00 = C67463zb.A00();
        C67463zb A002 = C67463zb.A00();
        GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
        A0L.A0D(str, "product_id");
        A0L.A0D(str2, "merchant_id");
        A00.A02(A0L, "input");
        return new PandoGraphQLRequest(C63233h2.A01(), "UnsaveProductMutation", A00.getParamsCopy(), A002.getParamsCopy(), UnsaveProductMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 8, "input", "shop_wishlist_remove_cart_wishlist_product");
    }
}
