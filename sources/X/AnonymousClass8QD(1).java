package X;

import com.instagram.api.schemas.PollType;

/* renamed from: X.8QD  reason: invalid class name */
public final class AnonymousClass8QD extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8QD A00 = new AnonymousClass8QD();

    public AnonymousClass8QD() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = PollType.A01.get(obj);
        if (obj2 == null) {
            return PollType.UNRECOGNIZED;
        }
        return obj2;
    }
}
