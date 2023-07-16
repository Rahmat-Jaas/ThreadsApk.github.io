package X;

import com.facebook.graphql.impls.OfferInfoFieldsImpl;
import com.facebook.graphql.impls.PromoCodeComponentImpl;
import com.facebook.pando.TreeJNI;
import com.facebookpay.expresscheckout.models.PromoCodeList;
import java.util.List;

/* renamed from: X.6xt  reason: invalid class name and case insensitive filesystem */
public final class C116956xt {
    public static final List A00(M5J m5j) {
        TreeJNI treeJNI;
        TreeJNI treeValue;
        TreeJNI reinterpret;
        AnonymousClass7Kx A0R = C86104wH.A0R(m5j);
        if (A0R == null || (treeJNI = (TreeJNI) A0R.A01) == null || (treeValue = treeJNI.getTreeValue("offer_info", PromoCodeComponentImpl.OfferInfo.class)) == null || (reinterpret = treeValue.reinterpret(OfferInfoFieldsImpl.class)) == null) {
            return null;
        }
        return reinterpret.getTreeList("offer_items", OfferInfoFieldsImpl.OfferItems.class);
    }

    public static final List A01(M5J m5j) {
        PromoCodeList promoCodeList;
        AnonymousClass7Kx A0R = C86104wH.A0R(m5j);
        if (A0R == null || (promoCodeList = (PromoCodeList) A0R.A01) == null) {
            return null;
        }
        return promoCodeList.A00;
    }
}
