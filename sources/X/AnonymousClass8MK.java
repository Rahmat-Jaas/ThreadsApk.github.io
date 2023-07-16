package X;

import java.util.List;

/* renamed from: X.8MK  reason: invalid class name */
public final class AnonymousClass8MK extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8MK A00 = new AnonymousClass8MK();

    public AnonymousClass8MK() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass7HC r0;
        C04220Ms.A0B(obj, 0);
        List list = (List) obj;
        Object obj2 = list.get(0);
        C141738cs r5 = C1192274b.A0G;
        AnonymousClass7HC r1 = null;
        if (C04220Ms.A0I(obj2, false) || obj2 == null) {
            r0 = null;
        } else {
            r0 = (AnonymousClass7HC) AnonymousClass7Wc.A00(r5, obj2);
        }
        C04220Ms.A0A(r0);
        long j = r0.A00;
        Object A0k = C86134wK.A0k(list);
        if (!C04220Ms.A0I(A0k, false) && A0k != null) {
            r1 = (AnonymousClass7HC) AnonymousClass7Wc.A00(r5, A0k);
        }
        C04220Ms.A0A(r1);
        return new AnonymousClass79W(j, r1.A00);
    }
}
