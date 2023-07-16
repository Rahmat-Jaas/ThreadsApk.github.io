package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape10S0401000_I2;
import kotlin.jvm.internal.KtLambdaShape2S0402000_I2;

/* renamed from: X.6Dt  reason: invalid class name and case insensitive filesystem */
public final class C97996Dt {
    public static final void A00(C147308p8 r13, C111656o6 r14, C147188nY r15, Modifier modifier, AnonymousClass0YP r17, int i, int i2) {
        int i3;
        C111656o6 r8 = r14;
        Modifier modifier2 = modifier;
        C147308p8 r6 = r13;
        AnonymousClass0YP r9 = r17;
        C18180wK.A1P(r13, 0, r9);
        C147188nY r2 = r15;
        r15.Cvd(852831187);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r15, r13) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r15, modifier2);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r15, r14);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0C(r15, r9);
        }
        if ((i3 & 5851) != 1170 || !r15.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                r8 = null;
            }
            C98046Dy.A00(r2, AnonymousClass7JR.A00(r2, new KtLambdaShape10S0401000_I2(modifier2, r8, C115806vw.A01(r15, r13), r17, i3, 1), 1342877611), 6);
        } else {
            r15.CuJ();
        }
        C147178nW AKE = r2.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0402000_I2(r6, modifier2, r8, r9, i5, i4, 0));
        }
    }
}
