package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.5Dj  reason: invalid class name and case insensitive filesystem */
public final class C89375Dj extends AnonymousClass0V3 {
    public static C89375Dj A00(String str, String str2) {
        C89375Dj r1 = new C89375Dj();
        r1.A0A(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, str);
        if (!(str2 == null || str2.length() == 0)) {
            r1.A0A("offer_id", str2);
        }
        return r1;
    }
}
