package X;

import com.instagram.api.schemas.SellerBadgeType;

/* renamed from: X.8Na  reason: invalid class name and case insensitive filesystem */
public final class C139198Na extends C02220Ah implements AnonymousClass0YY {
    public static final C139198Na A00 = new C139198Na();

    public C139198Na() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = SellerBadgeType.A01.get(obj);
        if (obj2 == null) {
            return SellerBadgeType.UNRECOGNIZED;
        }
        return obj2;
    }
}
