package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape1S0211000_I2;

/* renamed from: X.6NQ  reason: invalid class name */
public final class AnonymousClass6NQ {
    public static final void A00(C147188nY r16, Modifier modifier, AnonymousClass0YY r18, int i, boolean z) {
        int i2;
        Modifier modifier2 = modifier;
        AnonymousClass0YY r1 = r18;
        AnonymousClass0wJ.A1O(r1, modifier2);
        C147188nY r13 = r16;
        r13.Cvd(429705900);
        int i3 = i;
        boolean z2 = z;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0L(r13, z2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r13, r1);
        }
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0H(r13, modifier2);
        }
        if ((i2 & 731) != 146 || !r13.BCM()) {
            Modifier A04 = AnonymousClass7K4.A04(modifier2, (float) 0, (float) 16);
            C146288ly A05 = AnonymousClass7KV.A05(r13);
            Object A0p = C147188nY.A0p(r13);
            Object A0n = C147188nY.A0n(r13);
            Object A0m = C147188nY.A0m(r13);
            AnonymousClass0ZU r4 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A04);
            AnonymousClass7W3 r0 = (AnonymousClass7W3) r13;
            C147188nY.A0w(r13, r0, r4);
            AnonymousClass7W3.A0a(r13, r0, A05, A0p);
            AnonymousClass7KP.A07(r13, A0n, A0m, A00);
            r13.Cvb(-34851978);
            boolean A0z = C147188nY.A0z(r13, r1, 1157296644);
            Object A13 = r0.A13();
            if (A0z || A13 == AnonymousClass7GN.A00) {
                A13 = AnonymousClass7W3.A0J(r0, r1, 37);
            }
            AnonymousClass0ZU A08 = AnonymousClass7W3.A08(r0, A13, false);
            String A01 = AnonymousClass7JS.A01(r13, 2131822143);
            C123327Wm r42 = Modifier.A00;
            AnonymousClass54z r3 = AnonymousClass7Kq.A02;
            C101156Qc.A00(r13, r42.Cx6(r3), (C968867b) null, A01, A08, 384, 24, false);
            boolean A0z2 = C147188nY.A0z(r13, r1, 1157296644);
            Object A132 = r0.A13();
            if (A0z2 || A132 == AnonymousClass7GN.A00) {
                A132 = AnonymousClass7W3.A0J(r0, r1, 38);
            }
            AnonymousClass0ZU A082 = AnonymousClass7W3.A08(r0, A132, false);
            C101156Qc.A00(r13, r42.Cx6(r3), (C968867b) null, AnonymousClass7JS.A01(r13, 2131822141), A082, 384, 24, false);
            if (z2) {
                boolean A0z3 = C147188nY.A0z(r13, r1, 1157296644);
                Object A133 = r0.A13();
                if (A0z3 || A133 == AnonymousClass7GN.A00) {
                    A133 = AnonymousClass7W3.A0J(r0, r1, 39);
                }
                AnonymousClass0ZU A09 = AnonymousClass7W3.A09(r0, A133, false);
                C101156Qc.A00(r13, r42.Cx6(r3), C968867b.Destructive, AnonymousClass7JS.A01(r13, 2131822145), A09, 3456, 16, false);
            }
            AnonymousClass7W3.A0f(r0);
        } else {
            r13.CuJ();
        }
        C147178nW AKE = r13.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S0211000_I2(modifier2, r1, i3, 3, z2));
        }
    }
}
