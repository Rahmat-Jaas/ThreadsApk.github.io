package X;

import com.instagram.bloks.extensions.plugins.bkactioninapppurchasefetchpriceandbuy.BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Oa  reason: invalid class name and case insensitive filesystem */
public final class C100626Oa {
    public static final Object A00(AnonymousClass601 r23, C63893iY r24) {
        AnonymousClass68V r0;
        AnonymousClass601 r6 = r23;
        C63893iY r3 = r24;
        Object A0B = C63893iY.A0B(r3, AnonymousClass0wJ.A1Z(r3, r6) ? 1 : 0);
        A0B.getClass();
        String A00 = C18170wI.A00(9);
        Iterable<Object> iterable = (Iterable) A0B;
        ArrayList A0w = AnonymousClass0wJ.A0w(iterable);
        for (Object A0I : iterable) {
            if (C04220Ms.A0I(A0I, "subs")) {
                r0 = AnonymousClass68V.ITEM_TYPE_SUBS;
            } else {
                r0 = AnonymousClass68V.ITEM_TYPE_INAPP;
            }
            A0w.add(r0);
        }
        Object A09 = C63893iY.A09(r3);
        String A0h = C86164wN.A0h(A09);
        String str = (String) C63893iY.A0C(r3, A0h, 4);
        String str2 = (String) C63893iY.A0C(r3, A0h, 5);
        Object A0B2 = C63893iY.A0B(r3, 6);
        A0B2.getClass();
        String str3 = (String) C63893iY.A0C(r3, A0h, 7);
        C109326jp A06 = C63893iY.A06(r3, 8);
        Map A0I2 = AnonymousClass4WJ.A0I(C18180wK.A0p(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "NOT_FETCHED"), C18180wK.A0p("fetch_status_error_code", ""), C18180wK.A0p("fetch_status_error_description", ""), C18180wK.A0p("product_status", ""), C18180wK.A0p("product_price", C18220wO.A0y()), C18180wK.A0p("purchase_product_status", ""), C18180wK.A0p("purchase_product_status_error_code", ""), C18180wK.A0p("purchase_product_status_error_description", ""), C18180wK.A0p(AnonymousClass000.A00(948), ""), C18180wK.A0p(AnonymousClass000.A00(880), ""), C18180wK.A0p("price_info", C18220wO.A0y()));
        C107866hR r5 = new C107866hR(r6, A06);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1(r5, r6, (String) A09, str3, str, str2, A0w, (List) C63893iY.A0C(r3, A00, 3), (Map) A0B2, A0I2, (C146958n9) null), AnonymousClass7Ja.A03(AnonymousClass6ZB.A00), 3);
        return null;
    }
}
