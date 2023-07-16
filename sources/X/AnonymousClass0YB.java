package X;

import com.facebook.errorreporting.lacrima.common.IDxLProviderShape84S0100000_I2;
import com.facebook.redex.IDxListenerShape44S0400000_I2;

/* renamed from: X.0YB  reason: invalid class name */
public final class AnonymousClass0YB implements AnonymousClass0OE {
    public final AnonymousClass0OA A00;
    public final AnonymousClass0OB A01;
    public final AnonymousClass0OB A02;
    public final Integer A03;
    public final boolean A04;

    public final void BPo(AnonymousClass0OK r16) {
        int i;
        AnonymousClass0OK r8 = r16;
        C04100Mg A022 = r8.A02();
        AnonymousClass0PC r3 = (AnonymousClass0PC) this.A01.AFC(r8);
        if (r3 == null || A022 == null) {
            AnonymousClass0LU.A0O("lacrima", "DetectorConfig.init failed (detector): %s", getClass().getSimpleName());
            return;
        }
        C13810oL.A01(AnonymousClass00U.A0L("init.", r3.Awx().A00), -1766607885);
        try {
            synchronized (A022.A03) {
                try {
                    A022.A07.add(r3);
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                    throw th;
                }
            }
            AnonymousClass0OB r2 = this.A02;
            if (r2 != null) {
                C04560Oe r1 = r8.A0B;
                if (r1 == null) {
                    r1 = new IDxLProviderShape84S0100000_I2(r8, 4);
                    r8.A0B = r1;
                }
                C04840Pi r0 = (C04840Pi) r1.get();
                C07410bT r22 = (C07410bT) r2.AFC(r8);
                if (r22 == null) {
                    AnonymousClass0LU.A0O("lacrima", "DetectorConfig.init failed (mixer): %s", getClass().getSimpleName());
                    i = -1095190557;
                    C13810oL.A00(i);
                }
                synchronized (C04840Pi.A05) {
                    try {
                        r0.A02.add(r22);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                AnonymousClass0ND r12 = AnonymousClass0ND.CRITICAL_REPORT;
                boolean z = this.A04;
                A022.A09(new AnonymousClass0YE(r8, z), r12, r3);
                A022.A09(new AnonymousClass0YE(r8, z), AnonymousClass0ND.LARGE_REPORT, r3);
            }
            AnonymousClass0OA r6 = this.A00;
            for (C04050Mb A05 : r6.A03) {
                A022.A05(A05, AnonymousClass0ND.CRITICAL_REPORT, r3);
            }
            for (AnonymousClass0OB AFC : r6.A02) {
                C04050Mb r13 = (C04050Mb) AFC.AFC(r8);
                if (r13 != null) {
                    A022.A05(r13, AnonymousClass0ND.CRITICAL_REPORT, r3);
                }
            }
            for (AnonymousClass0OB iDxListenerShape44S0400000_I2 : r6.A04) {
                A022.A0A(new AnonymousClass0YG(new IDxListenerShape44S0400000_I2(A022, r6, iDxListenerShape44S0400000_I2, r8, 0)), AnonymousClass0ND.CRITICAL_REPORT, r3);
            }
            for (C04050Mb A052 : r6.A08) {
                A022.A05(A052, AnonymousClass0ND.LARGE_REPORT, r3);
            }
            for (AnonymousClass0OB AFC2 : r6.A07) {
                C04050Mb r14 = (C04050Mb) AFC2.AFC(r8);
                if (r14 != null) {
                    A022.A05(r14, AnonymousClass0ND.LARGE_REPORT, r3);
                }
            }
            for (AnonymousClass0OB iDxListenerShape44S0400000_I22 : r6.A09) {
                A022.A0A(new AnonymousClass0YG(new IDxListenerShape44S0400000_I2(A022, r6, iDxListenerShape44S0400000_I22, r8, 1)), AnonymousClass0ND.LARGE_REPORT, r3);
            }
            for (AnonymousClass0OB AFC3 : r6.A01) {
                C04090Mf r15 = (C04090Mf) AFC3.AFC(r8);
                if (r15 != null) {
                    A022.A0A(r15, AnonymousClass0ND.CRITICAL_REPORT, r3);
                }
            }
            for (AnonymousClass0OB AFC4 : r6.A00) {
                C04090Mf r17 = (C04090Mf) AFC4.AFC(r8);
                if (r17 != null) {
                    A022.A09(r17, AnonymousClass0ND.CRITICAL_REPORT, r3);
                }
            }
            for (AnonymousClass0OB AFC5 : r6.A06) {
                C04090Mf r18 = (C04090Mf) AFC5.AFC(r8);
                if (r18 != null) {
                    A022.A0A(r18, AnonymousClass0ND.LARGE_REPORT, r3);
                }
            }
            for (AnonymousClass0OB AFC6 : r6.A05) {
                C04090Mf r19 = (C04090Mf) AFC6.AFC(r8);
                if (r19 != null) {
                    A022.A09(r19, AnonymousClass0ND.LARGE_REPORT, r3);
                }
            }
            r3.start();
            i = -2012532271;
            C13810oL.A00(i);
        } catch (Throwable th3) {
            C13810oL.A00(-1128163010);
            throw th3;
        }
    }

    public AnonymousClass0YB(AnonymousClass0OA r1, AnonymousClass0OB r2, AnonymousClass0OB r3, Integer num, boolean z) {
        this.A01 = r2;
        this.A03 = num;
        this.A04 = z;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final Integer BM7() {
        return this.A03;
    }
}
