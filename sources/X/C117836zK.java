package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape2S0112000_I2;
import kotlin.jvm.internal.KtLambdaShape3S0302000_I2;

/* renamed from: X.6zK  reason: invalid class name and case insensitive filesystem */
public final class C117836zK {
    public static final void A00(C147188nY r15, Modifier modifier, AnonymousClass67Z r17, AnonymousClass0ZU r18, int i, int i2) {
        int i3;
        AnonymousClass0ZU r13 = r18;
        Modifier modifier2 = modifier;
        AnonymousClass67Z r12 = r17;
        C04220Ms.A0B(r12, 0);
        C147188nY r2 = r15;
        r15.Cvd(-1914921877);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r2, r12) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r2, modifier2);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0B(r2, r13);
        }
        if ((i3 & 731) != 146 || !r2.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                r13 = C74714at.A00;
            }
            int i8 = i3 >> 3;
            int i9 = i8 & 14;
            C146288ly A07 = AnonymousClass7KV.A07(r2, false);
            Object A0p = C147188nY.A0p(r2);
            Object A0n = C147188nY.A0n(r2);
            Object A0m = C147188nY.A0m(r2);
            AnonymousClass0ZU r6 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(modifier2);
            int A01 = C86114wI.A01((i9 << 3) & 112);
            AnonymousClass7W3 r4 = (AnonymousClass7W3) r2;
            C147188nY.A0w(r2, r4, r6);
            AnonymousClass7W3.A0a(r2, r4, A07, A0p);
            AnonymousClass7KP.A08(r2, A0n, A0m, A00, A01);
            r2.Cvb(-1896412431);
            if (((((i9 >> 6) & 112) | 6) & 81) != 16 || !r2.BCM()) {
                int ordinal = r12.ordinal();
                if (ordinal == 1) {
                    r2.Cvb(-2046391534);
                    A01(r2, r13, (i8 & 112) | 6, 0, true);
                } else if (ordinal == 2) {
                    r2.Cvb(-2046391450);
                    A01(r2, (AnonymousClass0ZU) null, 6, 2, false);
                } else if (ordinal != 0) {
                    r2.Cvb(-2046391331);
                } else {
                    r2.Cvb(-2046391385);
                    AnonymousClass6MF.A00(r2, (Modifier) null, C101296Qq.A00(r2), 0, 1);
                }
                AnonymousClass7W3.A0w(r4, false);
            } else {
                r2.CuJ();
            }
            AnonymousClass7W3.A0f(r4);
        } else {
            r2.CuJ();
        }
        C147178nW AKE = r2.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S0302000_I2(r12, r13, modifier2, i5, i4, 13));
        }
    }

    public static final void A01(C147188nY r23, AnonymousClass0ZU r24, int i, int i2, boolean z) {
        int i3;
        AnonymousClass0ZU r0 = r24;
        C147188nY r5 = r23;
        r5.Cvd(1159320229);
        int i4 = i2;
        int i5 = i;
        boolean z2 = z;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0L(r5, z2) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r5, r0);
        }
        if ((i3 & 91) != 18 || !r5.BCM()) {
            if (i6 != 0) {
                r0 = C74704as.A00;
            }
            String A01 = AnonymousClass7JS.A01(r5, 2131822137);
            C123327Wm r13 = Modifier.A00;
            boolean A0y = C147188nY.A0y(r5, r0);
            AnonymousClass7W3 r4 = (AnonymousClass7W3) r5;
            Object A13 = r4.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = AnonymousClass7W3.A0J(r4, r0, 36);
            }
            AnonymousClass7I9.A02(r5, C117646z1.A00(r13, (AnonymousClass799) null, (String) null, AnonymousClass7W3.A09(r4, A13, false), 13, z2), C120537Bh.A02(r5).A09, (C114236su) null, (C134817yQ) null, (C121117Ee) null, A01, 0, 0, 0, 0, 0, 2040, AnonymousClass7KB.A04(r5), 0, false);
        } else {
            r5.CuJ();
        }
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0112000_I2(r0, i5, i4, 1, z2));
        }
    }
}
