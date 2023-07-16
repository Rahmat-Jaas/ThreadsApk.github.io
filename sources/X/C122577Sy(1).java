package X;

import com.facebookpay.common.recyclerview.adapteritems.PuxPromoCodeItem;
import com.facebookpay.expresscheckout.models.ECPOffer;

/* renamed from: X.7Sy  reason: invalid class name and case insensitive filesystem */
public final class C122577Sy implements C142618fJ {
    public static final C122577Sy A00 = new C122577Sy();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        boolean z;
        String str;
        ECPOffer eCPOffer = (ECPOffer) obj;
        if (eCPOffer != null) {
            z = true;
            str = eCPOffer.A02;
        } else {
            z = false;
            str = null;
        }
        return new PuxPromoCodeItem(AnonymousClass69U.A0c, str, z);
    }
}
