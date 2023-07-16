package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* renamed from: X.7Cj  reason: invalid class name and case insensitive filesystem */
public final class C120767Cj {
    public static final C146288ly A00;
    public static final C146288ly A01 = AnonymousClass7Xl.A00;

    public static final C146288ly A00(C147188nY r4, Alignment alignment, boolean z) {
        C146288ly r0;
        C04220Ms.A0B(alignment, 0);
        r4.Cvb(56522820);
        if (!alignment.equals(AnonymousClass7KV.A0E) || z) {
            boolean A11 = C147188nY.A11(r4, Boolean.valueOf(z), C147188nY.A0z(r4, alignment, 511388516));
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r4;
            Object A13 = r2.A13();
            if (A11 || A13 == AnonymousClass7GN.A00) {
                A13 = new C123527Xg(alignment, z);
                r2.A14(A13);
            }
            AnonymousClass7W3.A0w(r2, false);
            r0 = (C146288ly) A13;
        } else {
            r0 = A00;
        }
        AnonymousClass7W3.A0z(r4, false);
        return r0;
    }

    public static final void A01(C147188nY r8, Modifier modifier, int i) {
        int i2;
        C04220Ms.A0B(modifier, 0);
        r8.Cvd(-211209833);
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r8, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r8.BCM()) {
            C146288ly r7 = A01;
            Object A0p = C147188nY.A0p(r8);
            Object A0n = C147188nY.A0n(r8);
            Object A0m = C147188nY.A0m(r8);
            AnonymousClass0ZU r3 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(modifier);
            int A012 = C86114wI.A01(((i2 << 3) & 112) | 384);
            AnonymousClass7W3 r0 = (AnonymousClass7W3) r8;
            C147188nY.A0w(r8, r0, r3);
            AnonymousClass7W3.A0a(r8, r0, r7, A0p);
            AnonymousClass7KP.A08(r8, A0n, A0m, A002, A012);
            AnonymousClass7W3.A0d(r0);
        } else {
            r8.CuJ();
        }
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            C147178nW.A02(AKE, modifier, i, 1);
        }
    }

    static {
        Alignment alignment = AnonymousClass7KV.A0E;
        C04220Ms.A0B(alignment, 0);
        A00 = new C123527Xg(alignment, false);
    }
}
