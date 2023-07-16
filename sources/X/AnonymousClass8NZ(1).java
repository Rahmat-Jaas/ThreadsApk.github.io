package X;

import com.instagram.api.schemas.SellerBadgeSurfaces;

/* renamed from: X.8NZ  reason: invalid class name */
public final class AnonymousClass8NZ extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8NZ A00 = new AnonymousClass8NZ();

    public AnonymousClass8NZ() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C04220Ms.A0B(obj, 0);
        Object obj2 = SellerBadgeSurfaces.A01.get(obj);
        if (obj2 == null) {
            return SellerBadgeSurfaces.UNRECOGNIZED;
        }
        return obj2;
    }
}
