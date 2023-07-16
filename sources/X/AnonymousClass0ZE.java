package X;

import com.facebook.redex.IDxCFactoryShape203S0200000_I2;

/* renamed from: X.0ZE  reason: invalid class name */
public final class AnonymousClass0ZE implements AnonymousClass0P4 {
    public final AnonymousClass01P A00;

    public final AnonymousClass0OC A7n(AnonymousClass0OC r5, Integer num) {
        AnonymousClass0OB r2;
        String str;
        AnonymousClass0ND r3;
        Integer num2;
        int i;
        C04220Ms.A0B(num, 0);
        C04220Ms.A0B(r5, 1);
        if (num == AnonymousClass006.A0C) {
            if (C07960cV.A05(AnonymousClass0e5.A00(36320768895883477L))) {
                num2 = AnonymousClass006.A00;
                i = 7;
            }
            return r5;
        }
        if (num != AnonymousClass006.A0j) {
            Integer num3 = AnonymousClass006.A0Y;
            if (num == num3 || num == AnonymousClass006.A0u || num == AnonymousClass006.A1L) {
                r2 = AnonymousClass0ZC.A00;
                if (num == AnonymousClass006.A1L && C07960cV.A05(AnonymousClass0e5.A00(36320768896014551L))) {
                    str = "ufad";
                } else if (num == AnonymousClass006.A0u) {
                    if (C07960cV.A05(AnonymousClass0e5.A00(36320768895752403L))) {
                        str = "anr";
                    }
                } else if (num == num3 && C07960cV.A05(AnonymousClass0e5.A00(36320768895949014L))) {
                    str = "native_crash";
                }
                AnonymousClass0YO r1 = new AnonymousClass0YO(str);
                r3 = AnonymousClass0ND.CRITICAL_REPORT;
                r5.A05.A01.add(r1);
                r5.A01(r3, r2);
            }
        } else if (C07960cV.A05(AnonymousClass0e5.A00(36320768895817940L))) {
            num2 = AnonymousClass006.A01;
            i = 8;
        }
        return r5;
        r2 = new IDxCFactoryShape203S0200000_I2(i, num2, this);
        r3 = AnonymousClass0ND.CRITICAL_REPORT;
        r5.A01(r3, r2);
        return r5;
    }

    public final AnonymousClass0OM A7o(AnonymousClass0OM r2, AnonymousClass0Z8 r3) {
        C04220Ms.A0B(r2, 1);
        return r2;
    }

    public AnonymousClass0ZE(AnonymousClass01P r1) {
        this.A00 = r1;
    }
}
