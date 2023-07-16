package X;

import com.instagram.api.schemas.MusicProduct;

/* renamed from: X.8Q6  reason: invalid class name */
public final class AnonymousClass8Q6 extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8Q6 A00 = new AnonymousClass8Q6();

    public AnonymousClass8Q6() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = MusicProduct.A01.get(obj);
        if (obj2 == null) {
            return MusicProduct.UNRECOGNIZED;
        }
        return obj2;
    }
}
