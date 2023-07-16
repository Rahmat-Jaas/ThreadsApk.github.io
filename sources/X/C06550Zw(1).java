package X;

import com.facebook.redex.IDxCFactoryShape111S0000000_I2;
import com.facebook.redex.IDxCFactoryShape495S0100000_I2;

/* renamed from: X.0Zw  reason: invalid class name and case insensitive filesystem */
public final class C06550Zw implements AnonymousClass0P4 {
    public final long A00;

    public final AnonymousClass0OC A7n(AnonymousClass0OC r4, Integer num) {
        C04220Ms.A0B(num, 0);
        C04220Ms.A0B(r4, 1);
        if (num == AnonymousClass006.A01) {
            AnonymousClass0OB r2 = AnonymousClass0Oq.A02;
            if (r2 == null) {
                r2 = new IDxCFactoryShape111S0000000_I2(8);
                AnonymousClass0Oq.A02 = r2;
            }
            AnonymousClass0ND r1 = AnonymousClass0ND.CRITICAL_REPORT;
            r4.A01(r1, r2);
            r4.A01(r1, C06530Zt.A00);
            r4.A01(r1, C06540Zv.A00);
        } else {
            Integer num2 = AnonymousClass006.A02;
            if (num == AnonymousClass006.A0C || num == AnonymousClass006.A15 || num == AnonymousClass006.A0j || num == num2) {
                AnonymousClass0OB r12 = AnonymousClass0Oq.A01;
                if (r12 == null) {
                    r12 = new IDxCFactoryShape111S0000000_I2(9);
                    AnonymousClass0Oq.A01 = r12;
                }
                r4.A01(AnonymousClass0ND.CRITICAL_REPORT, r12);
            }
            if (num == num2) {
                AnonymousClass0OB r22 = AnonymousClass0Oq.A01;
                if (r22 == null) {
                    r22 = new IDxCFactoryShape111S0000000_I2(9);
                    AnonymousClass0Oq.A01 = r22;
                }
                r4.A05.A00.add(new IDxCFactoryShape495S0100000_I2((Object) r22, 9));
                return r4;
            }
        }
        return r4;
    }

    public final AnonymousClass0OM A7o(AnonymousClass0OM r6, AnonymousClass0Z8 r7) {
        C04220Ms.A0B(r7, 0);
        C04220Ms.A0B(r6, 1);
        Integer num = AnonymousClass006.A04;
        long j = this.A00;
        AnonymousClass0OC r3 = new AnonymousClass0OC(AnonymousClass006.A0O);
        r3.A00 = new C06200Yb(j);
        r3.A02 = AnonymousClass006.A0C;
        AnonymousClass0OB r1 = AnonymousClass0Oq.A00;
        if (r1 == null) {
            r1 = new IDxCFactoryShape111S0000000_I2(10);
            AnonymousClass0Oq.A00 = r1;
        }
        AnonymousClass0ND r2 = AnonymousClass0ND.CRITICAL_REPORT;
        r3.A01(r2, r1);
        r3.A02(r2, new IDxCFactoryShape111S0000000_I2(11));
        r7.A00(r3, num);
        r6.A00(r3.A00());
        return r6;
    }

    public C06550Zw(long j) {
        this.A00 = j;
    }
}
