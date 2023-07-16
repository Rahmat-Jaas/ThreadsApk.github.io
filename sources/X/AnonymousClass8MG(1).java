package X;

import java.util.List;

/* renamed from: X.8MG  reason: invalid class name */
public final class AnonymousClass8MG extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8MG A00 = new AnonymousClass8MG();

    public AnonymousClass8MG() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass7KE r0;
        AnonymousClass7KC r02;
        C04220Ms.A0B(obj, 0);
        List list = (List) obj;
        Object obj2 = list.get(0);
        C141738cs r1 = C1192274b.A04;
        Number number = null;
        if (C04220Ms.A0I(obj2, false) || obj2 == null) {
            r0 = null;
        } else {
            r0 = (AnonymousClass7KE) AnonymousClass7Wc.A00(r1, obj2);
        }
        C04220Ms.A0A(r0);
        long j = r0.A00;
        Object A0k = C86134wK.A0k(list);
        C141738cs r12 = C1192274b.A08;
        if (C04220Ms.A0I(A0k, false) || A0k == null) {
            r02 = null;
        } else {
            r02 = (AnonymousClass7KC) AnonymousClass7Wc.A00(r12, A0k);
        }
        C04220Ms.A0A(r02);
        long j2 = r02.A00;
        Object obj3 = list.get(2);
        if (obj3 != null) {
            number = (Number) obj3;
        }
        return new C1201679b(C86164wN.A02(number), j, j2);
    }
}
