package X;

import kotlin.coroutines.jvm.internal.KtSLambdaShape2S1200000_I2;
import kotlin.jvm.internal.KtLambdaShape21S0101000_I2;

/* renamed from: X.6O1  reason: invalid class name */
public final class AnonymousClass6O1 {
    public static final void A00(C147188nY r8, C105596dg r9, int i) {
        int i2;
        C147178nW AKE;
        int i3;
        C105596dg r3 = r9;
        C04220Ms.A0B(r9, 0);
        r8.Cvd(-1441368541);
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r8, r9) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r8.BCM()) {
            String str = (String) r9.A00.getValue();
            if (str == null) {
                AKE = r8.AKE();
                if (AKE != null) {
                    i3 = 45;
                    AnonymousClass7WO.A00(AKE, new KtLambdaShape21S0101000_I2(r9, i, i3));
                }
                return;
            }
            AnonymousClass7K5.A05(r8, str, new KtSLambdaShape2S1200000_I2(r3, C147188nY.A0o(r8), str, (C146958n9) null, 5));
        } else {
            r8.CuJ();
        }
        AKE = r8.AKE();
        if (AKE != null) {
            i3 = 44;
            AnonymousClass7WO.A00(AKE, new KtLambdaShape21S0101000_I2(r9, i, i3));
        }
    }
}
