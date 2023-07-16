package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape2S0212000_I2;

/* renamed from: X.6z5  reason: invalid class name and case insensitive filesystem */
public final class C117686z5 {
    public static void A01(C147188nY r5, Modifier modifier, AnonymousClass0ZU r7, boolean z) {
        A00(r5, AnonymousClass7Kq.A08(modifier, (float) 64), r7, 384, 0, z);
    }

    public static final void A00(C147188nY r19, Modifier modifier, AnonymousClass0ZU r21, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        AnonymousClass0ZU r12 = r21;
        C04220Ms.A0B(r12, 1);
        C147188nY r13 = r19;
        r13.Cvd(-1383285302);
        int i4 = i2;
        boolean z2 = z;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0L(r13, z2) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r13, r12);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r13, modifier2);
        }
        if ((i3 & 731) != 146 || !r13.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (z) {
                r13.Cvb(1148601665);
                AnonymousClass6MF.A00(r13, AnonymousClass7Kq.A03((Alignment) null, modifier2, 3), (AnonymousClass5HL) null, 0, 2);
            } else {
                r13.Cvb(1148601724);
                AnonymousClass7W3 A0Y = C147188nY.A0Y(r13);
                Object A13 = A0Y.A13();
                Object obj = AnonymousClass7GN.A00;
                if (A13 == obj) {
                    A13 = AnonymousClass7WR.A00(A0Y, false);
                }
                AnonymousClass7W3.A0w(A0Y, false);
                C81784oM r4 = (C81784oM) A13;
                Unit unit = Unit.A00;
                boolean A0y = C147188nY.A0y(r13, r4);
                Object A132 = A0Y.A13();
                if (A0y || A132 == obj) {
                    A132 = AnonymousClass7W3.A07(A0Y, r4, 8);
                }
                AnonymousClass7W3.A0b(r13, A0Y, A132, unit, false);
                Modifier A03 = AnonymousClass7Kq.A03((Alignment) null, C117646z1.A00(modifier2, (AnonymousClass799) null, (String) null, r12, 15, false), 3);
                C146288ly A07 = AnonymousClass7KV.A07(r13, false);
                Object A0p = C147188nY.A0p(r13);
                Object A0n = C147188nY.A0n(r13);
                Object A0m = C147188nY.A0m(r13);
                AnonymousClass0ZU r0 = AnonymousClass74X.A00;
                AnonymousClass0YM A00 = C98236Es.A00(A03);
                C147188nY.A0w(r13, A0Y, r0);
                AnonymousClass7W3.A0a(r13, A0Y, A07, A0p);
                AnonymousClass7KP.A07(r13, A0n, A0m, A00);
                r13.Cvb(-1510719628);
                if (C86104wH.A1X(r4)) {
                    AnonymousClass6MB.A00(r13, (Modifier) null, r12, (i3 >> 3) & 14, 2);
                }
                AnonymousClass7W3.A0v(A0Y, true);
            }
            AnonymousClass7W3.A0z(r13, false);
        } else {
            r13.CuJ();
        }
        C147178nW AKE = r13.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0212000_I2(modifier2, r12, i5, i4, 2, z2));
        }
    }
}
