package X;

import com.instagram.api.schemas.AssetRecommendationType;

/* renamed from: X.8NP  reason: invalid class name */
public final class AnonymousClass8NP extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8NP A00 = new AnonymousClass8NP();

    public AnonymousClass8NP() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = AssetRecommendationType.A01.get(obj);
        if (obj2 == null) {
            return AssetRecommendationType.UNRECOGNIZED;
        }
        return obj2;
    }
}
