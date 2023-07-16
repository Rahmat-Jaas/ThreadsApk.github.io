package X;

import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2;
import kotlin.jvm.internal.KtLambdaShape21S0101000_I2;

/* renamed from: X.6O0  reason: invalid class name */
public final class AnonymousClass6O0 {
    public static final void A00(C147188nY r8, C105586df r9, int i) {
        int i2;
        C147178nW AKE;
        int i3;
        C105586df r3 = r9;
        C04220Ms.A0B(r9, 0);
        r8.Cvd(1195730399);
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r8, r9) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r8.BCM()) {
            Object value = r9.A00.getValue();
            if (value == null) {
                AKE = r8.AKE();
                if (AKE != null) {
                    i3 = 43;
                    AnonymousClass7WO.A00(AKE, new KtLambdaShape21S0101000_I2(r9, i, i3));
                }
                return;
            }
            Object A0o = C147188nY.A0o(r8);
            C86164wN.A1F(A0o);
            AnonymousClass7K5.A05(r8, value, new KtSLambdaShape1S0300000_I2(r3, value, A0o, (C146958n9) null, 18));
        } else {
            r8.CuJ();
        }
        AKE = r8.AKE();
        if (AKE != null) {
            i3 = 42;
            AnonymousClass7WO.A00(AKE, new KtLambdaShape21S0101000_I2(r9, i, i3));
        }
    }
}
