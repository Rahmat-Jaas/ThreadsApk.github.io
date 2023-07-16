package X;

import java.util.List;

/* renamed from: X.7FT  reason: invalid class name */
public final class AnonymousClass7FT {
    public static final C147738pp A01(AnonymousClass7Y3 r2) {
        C147738pp r1;
        C04220Ms.A0B(r2, 0);
        AnonymousClass7YG r22 = r2.A0a.A02;
        if ((r22.A00 & 8) != 0) {
            r1 = r22;
            while (true) {
                if ((r22.A01 & 8) == 0 || !(r22 instanceof C147738pp)) {
                    if ((r22.A00 & 8) == 0) {
                        break;
                    }
                    r22 = r22.A02;
                    r1 = r22;
                    if (r22 == null) {
                        break;
                    }
                } else {
                    break;
                }
            }
            return r1;
        }
        r1 = null;
        return r1;
    }

    public static final C147738pp A00(AnonymousClass7Y3 r2) {
        C147738pp r1;
        AnonymousClass7YG r22 = r2.A0a.A02;
        if ((r22.A00 & 8) != 0) {
            r1 = r22;
            while (true) {
                if ((r22.A01 & 8) == 0 || !(r22 instanceof C147738pp) || !((C147738pp) r22).BAK().A01) {
                    if ((r22.A00 & 8) == 0) {
                        break;
                    }
                    r22 = r22.A02;
                    r1 = r22;
                    if (r22 == null) {
                        break;
                    }
                } else {
                    break;
                }
            }
            return r1;
        }
        r1 = null;
        return r1;
    }

    public static C147738pp A02(Object obj) {
        AnonymousClass7Y3 r1 = (AnonymousClass7Y3) obj;
        C04220Ms.A0B(r1, 0);
        return A01(r1);
    }

    public static final void A03(AnonymousClass7Y3 r4, List list) {
        AnonymousClass84X A07 = r4.A07();
        int i = A07.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A07.A01;
            do {
                AnonymousClass7Y3 r1 = (AnonymousClass7Y3) objArr[i2];
                C147738pp A01 = A01(r1);
                if (A01 != null) {
                    list.add(A01);
                } else {
                    A03(r1, list);
                }
                i2++;
            } while (i2 < i);
        }
    }
}
