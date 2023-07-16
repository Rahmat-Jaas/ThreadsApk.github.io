package X;

import java.util.List;

/* renamed from: X.8ME  reason: invalid class name */
public final class AnonymousClass8ME extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8ME A00 = new AnonymousClass8ME();

    public AnonymousClass8ME() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        long A0C;
        C04220Ms.A0B(obj, 0);
        if (obj.equals(false)) {
            A0C = AnonymousClass7KC.A02;
        } else {
            List list = (List) obj;
            Object obj2 = list.get(0);
            Number number2 = null;
            if (obj2 != null) {
                number = (Number) obj2;
            } else {
                number = null;
            }
            float A02 = C86164wN.A02(number);
            Object A0k = C86134wK.A0k(list);
            if (A0k != null) {
                number2 = (Number) A0k;
            }
            A0C = C86104wH.A0C(A02, C86164wN.A02(number2));
        }
        return C86124wJ.A0O(A0C);
    }
}
