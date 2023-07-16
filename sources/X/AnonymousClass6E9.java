package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;

/* renamed from: X.6E9  reason: invalid class name */
public final class AnonymousClass6E9 {
    public static final void A00(C147188nY r13, Modifier modifier, AnonymousClass0YP r15, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AnonymousClass0YP r8 = r15;
        C04220Ms.A0B(r15, 1);
        r13.Cvd(-2105228848);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r13, r15);
        }
        if ((i3 & 91) != 18 || !r13.BCM()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            C123557Xo r7 = C123557Xo.A00;
            int i7 = ((i3 >> 3) & 14) | ((i3 << 3) & 112);
            Object A0p = C147188nY.A0p(r13);
            Object A0n = C147188nY.A0n(r13);
            Object A0m = C147188nY.A0m(r13);
            AnonymousClass0ZU r0 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(modifier2);
            int A01 = C86114wI.A01(i7);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r13;
            C147188nY.A0w(r13, r2, r0);
            C147188nY.A0x(r13, AnonymousClass7KP.A02(r13, r7, A0p, A0n, A0m), A00, (A01 >> 3) & 112);
            C86104wH.A1S(r13, r15, A01 >> 9);
            AnonymousClass7W3.A0u(r2, true);
        } else {
            r13.CuJ();
        }
        C147178nW AKE = r13.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0202000_I2(r8, i6, modifier2, i4, 1));
        }
    }
}
