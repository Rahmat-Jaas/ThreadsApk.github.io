package X;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0201100_I2;
import kotlin.jvm.internal.KtLambdaShape1S0101100_I2;

/* renamed from: X.6MP  reason: invalid class name */
public final class AnonymousClass6MP {
    public static final void A00(C147188nY r9, AnonymousClass0ZU r10, int i, long j) {
        int i2;
        AnonymousClass0ZU r2 = r10;
        C04220Ms.A0B(r10, 1);
        r9.Cvd(-1565436339);
        int i3 = i;
        long j2 = j;
        if ((i & 14) == 0) {
            i2 = C147188nY.A05(r9, j) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r9, r10);
        }
        if ((i2 & 91) != 18 || !r9.BCM()) {
            AnonymousClass7K5.A05(r9, Unit.A00, new KtSLambdaShape1S0201100_I2(r2, r9.AEA(AnonymousClass7DA.A03), (C146958n9) null, 1, j2));
        } else {
            r9.CuJ();
        }
        C147178nW AKE = r9.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S0101100_I2(j2, i3, 2, r10));
        }
    }
}
