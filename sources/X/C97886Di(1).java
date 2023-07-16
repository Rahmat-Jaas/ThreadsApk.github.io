package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape0S0312000_I2;
import kotlin.jvm.internal.KtLambdaShape27S0201000_I2;

/* renamed from: X.6Di  reason: invalid class name and case insensitive filesystem */
public final class C97886Di {
    public static final void A00(C147188nY r13, Alignment alignment, Modifier modifier, AnonymousClass0YM r16, int i, int i2, boolean z) {
        int i3;
        boolean z2 = z;
        Alignment alignment2 = alignment;
        Modifier modifier2 = modifier;
        AnonymousClass0YM r8 = r16;
        C04220Ms.A0B(r8, 3);
        r13.Cvd(1781813501);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r13, modifier) | i;
        } else {
            i3 = i6;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r13, alignment);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i6 & 896) == 0) {
            i3 |= C147188nY.A0N(r13, z2);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i6 & 7168) == 0) {
            i3 |= C147188nY.A0I(r13, r8);
        }
        if ((i3 & 5851) != 1170 || !r13.BCM()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                alignment2 = AnonymousClass7KV.A0E;
            }
            if (i8 != 0) {
                z2 = false;
            }
            C146288ly A00 = C120767Cj.A00(r13, alignment2, z2);
            boolean A10 = C147188nY.A10(r13, r8, A00, 511388516);
            AnonymousClass7W3 r3 = (AnonymousClass7W3) r13;
            Object A13 = r3.A13();
            if (A10 || A13 == AnonymousClass7GN.A00) {
                A13 = new KtLambdaShape27S0201000_I2(i3, 4, A00, r8);
                r3.A14(A13);
            }
            AnonymousClass7W3.A0w(r3, false);
            C115906w6.A01(r13, modifier2, (AnonymousClass0YP) A13, i3 & 14, 0);
        } else {
            r13.CuJ();
        }
        C147178nW AKE = r13.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S0312000_I2(modifier2, alignment2, r8, i6, i4, 0, z2));
        }
    }
}
