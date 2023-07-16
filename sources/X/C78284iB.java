package X;

import com.instagram.api.schemas.DayOfTheWeek;

/* renamed from: X.4iB  reason: invalid class name and case insensitive filesystem */
public final class C78284iB extends C02220Ah implements AnonymousClass0YY {
    public static final C78284iB A00 = new C78284iB();

    public C78284iB() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C04220Ms.A0B(obj, 0);
        Object obj2 = DayOfTheWeek.A01.get(obj);
        if (obj2 == null) {
            return DayOfTheWeek.UNRECOGNIZED;
        }
        return obj2;
    }
}
