package X;

import java.util.List;

/* renamed from: X.8MM  reason: invalid class name */
public final class AnonymousClass8MM extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8MM A00 = new AnonymousClass8MM();

    public AnonymousClass8MM() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        C04220Ms.A0B(obj, 0);
        List list = (List) obj;
        Object obj2 = list.get(0);
        C114346t5 r1 = null;
        if (obj2 != null) {
            number = (Number) obj2;
        } else {
            number = null;
        }
        float A02 = C86164wN.A02(number);
        Object A0k = C86134wK.A0k(list);
        if (A0k != null) {
            r1 = (C114346t5) A0k;
        }
        C04220Ms.A0A(r1);
        return new AnonymousClass7HC(AnonymousClass7Hi.A02(A02, r1.A00));
    }
}
