package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape4S0100100_I2;

/* renamed from: X.73T  reason: invalid class name */
public final class AnonymousClass73T {
    public static final float A00 = ((float) 2);

    public static final Modifier A00(C147188nY r7, Modifier modifier, AnonymousClass687 r9, int i, boolean z) {
        Modifier modifier2;
        long j;
        boolean z2 = false;
        C18200wM.A1S(modifier, r9);
        r7.Cvb(-70862857);
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        if (z) {
            if (!z2 || r9 == AnonymousClass687.End) {
                modifier2 = Modifier.A00;
            } else {
                C123327Wm r2 = Modifier.A00;
                C107766hH r0 = C103106Xv.A00;
                float f = r0.A01 - r0.A00;
                float f2 = (float) 0;
                modifier2 = AnonymousClass7K4.A05(r2, f, f2, f2, f2);
            }
            if (r9 != AnonymousClass687.None) {
                if (C97836Db.A00(r7)) {
                    j = 4281546296L;
                } else {
                    j = 4293256677L;
                }
                long A02 = C121657He.A02(j);
                boolean A11 = C147188nY.A11(r7, C86134wK.A0I(A02), C147188nY.A0z(r7, r9, 511388516));
                AnonymousClass7W3 r6 = (AnonymousClass7W3) r7;
                Object A13 = r6.A13();
                if (A11 || A13 == AnonymousClass7GN.A00) {
                    A13 = new KtLambdaShape4S0100100_I2(A02, r9, 8);
                    r6.A14(A13);
                }
                modifier = C115836vz.A00(modifier, AnonymousClass7W3.A0B(r6, A13, false));
            }
            modifier = modifier.Cx6(modifier2);
        }
        AnonymousClass7W3.A0z(r7, false);
        return modifier;
    }
}
