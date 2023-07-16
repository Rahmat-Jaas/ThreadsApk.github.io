package X;

import com.instagram.api.schemas.CreatorSegmentation;

/* renamed from: X.8NR  reason: invalid class name */
public final class AnonymousClass8NR extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8NR A00 = new AnonymousClass8NR();

    public AnonymousClass8NR() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = CreatorSegmentation.A01.get(obj);
        if (obj2 == null) {
            return CreatorSegmentation.UNRECOGNIZED;
        }
        return obj2;
    }
}
