package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape3S0311000_I2;

/* renamed from: X.6MS  reason: invalid class name */
public final class AnonymousClass6MS {
    public static final void A00(C147188nY r15, Modifier modifier, Integer num, AnonymousClass0ZU r18, int i, boolean z) {
        int i2;
        Modifier modifier2 = modifier;
        AnonymousClass0ZU r9 = r18;
        C18180wK.A1P(r9, 0, modifier2);
        C147188nY r6 = r15;
        r15.Cvd(-191272757);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r15, r9) | i;
        } else {
            i2 = i3;
        }
        boolean z2 = z;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0M(r15, z2);
        }
        Integer num2 = num;
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0H(r15, num2);
        }
        if ((i3 & 7168) == 0) {
            i2 |= C147188nY.A0I(r15, modifier2);
        }
        if ((i2 & 5851) != 1170 || !r15.BCM()) {
            AnonymousClass6M2.A00(r6, modifier2, AnonymousClass698.Cancel, r9, AnonymousClass7JR.A00(r15, new C139998Ql(z2), -1426458487), AnonymousClass7JR.A01(r15, num2, 5, -703168054), ((i2 << 3) & 112) | 27654 | ((i2 >> 3) & 896), 96, false, false);
        } else {
            r15.CuJ();
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S0311000_I2(modifier2, r9, num2, i3, 0, z2));
        }
    }
}
