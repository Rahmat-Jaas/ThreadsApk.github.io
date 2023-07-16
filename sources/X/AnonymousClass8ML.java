package X;

import java.util.List;

/* renamed from: X.8ML  reason: invalid class name */
public final class AnonymousClass8ML extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8ML A00 = new AnonymousClass8ML();

    public AnonymousClass8ML() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        C04220Ms.A0B(obj, 0);
        List list = (List) obj;
        Object obj2 = list.get(0);
        Number number2 = null;
        if (obj2 != null) {
            number = (Number) obj2;
        } else {
            number = null;
        }
        int A0A = C86134wK.A0A(number);
        Object A0k = C86134wK.A0k(list);
        if (A0k != null) {
            number2 = (Number) A0k;
        }
        return new C121767Ia(AnonymousClass6FM.A00(A0A, C86134wK.A0A(number2)));
    }
}
