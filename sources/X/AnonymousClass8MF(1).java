package X;

import java.util.List;

/* renamed from: X.8MF  reason: invalid class name */
public final class AnonymousClass8MF extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8MF A00 = new AnonymousClass8MF();

    public AnonymousClass8MF() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C121117Ee r8;
        C114326t3 r9;
        AnonymousClass7HC r0;
        AnonymousClass79W r10;
        C04220Ms.A0B(obj, 0);
        List list = (List) obj;
        Object obj2 = list.get(0);
        if (obj2 != null) {
            r8 = (C121117Ee) obj2;
        } else {
            r8 = null;
        }
        Object A0k = C86134wK.A0k(list);
        if (A0k != null) {
            r9 = (C114326t3) A0k;
        } else {
            r9 = null;
        }
        Object obj3 = list.get(2);
        C141738cs r1 = C1192274b.A0G;
        if (C04220Ms.A0I(obj3, false) || obj3 == null) {
            r0 = null;
        } else {
            r0 = (AnonymousClass7HC) AnonymousClass7Wc.A00(r1, obj3);
        }
        C04220Ms.A0A(r0);
        long j = r0.A00;
        Object obj4 = list.get(3);
        C141738cs r12 = C1192274b.A0E;
        if (C04220Ms.A0I(obj4, false) || obj4 == null) {
            r10 = null;
        } else {
            r10 = (AnonymousClass79W) AnonymousClass7Wc.A00(r12, obj4);
        }
        return new C121237Ex((AnonymousClass79A) null, (C114276sy) null, (C114316t2) null, (AnonymousClass795) null, r8, r9, r10, (AnonymousClass79X) null, j);
    }
}
