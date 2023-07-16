package X;

import com.instagram.api.schemas.OverlayAdsFormatEnum;

/* renamed from: X.8NW  reason: invalid class name */
public final class AnonymousClass8NW extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8NW A00 = new AnonymousClass8NW();

    public AnonymousClass8NW() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = OverlayAdsFormatEnum.A01.get(obj);
        if (obj2 == null) {
            return OverlayAdsFormatEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
