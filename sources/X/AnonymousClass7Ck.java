package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.KtLambdaShape27S0201000_I2;
import kotlin.jvm.internal.KtLambdaShape2S0201100_I2;

/* renamed from: X.7Ck  reason: invalid class name */
public final class AnonymousClass7Ck {
    public static final float A00;
    public static final float A01;

    public static final void A00(C147188nY r4, Modifier modifier, int i) {
        int i2;
        C04220Ms.A0B(modifier, 0);
        r4.Cvd(694251107);
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r4, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r4.BCM()) {
            Modifier A0D = AnonymousClass7Kq.A0D(modifier, A01, A00);
            C04220Ms.A0B(A0D, 0);
            C115686vk.A01(r4, C120417Am.A02(A0D, InspectableValueKt.A00, C140898Za.A00), 0);
        } else {
            r4.CuJ();
        }
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            C147178nW.A02(AKE, modifier, i, 5);
        }
    }

    public static final void A01(C147188nY r10, Modifier modifier, AnonymousClass0YP r12, int i, long j) {
        int i2;
        Modifier modifier2 = modifier;
        C04220Ms.A0B(modifier, 1);
        C147188nY r11 = r10;
        r10.Cvd(-5185995);
        int i3 = i;
        long j2 = j;
        if ((i & 14) == 0) {
            i2 = C147188nY.A05(r10, j) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r10, modifier2);
        }
        AnonymousClass0YP r9 = r12;
        if ((i & 896) == 0) {
            i2 |= C147188nY.A0B(r10, r12);
        }
        if ((i2 & 731) != 146 || !r10.BCM()) {
            AnonymousClass7FJ.A01(AnonymousClass67A.TopMiddle, r11, AnonymousClass7JR.A00(r11, new KtLambdaShape27S0201000_I2(i2, 9, modifier2, r12), -1458480226), (i2 & 14) | 432, j);
        } else {
            r10.CuJ();
        }
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0201100_I2(i3, 0, j2, modifier2, r9));
        }
    }

    static {
        float f = (float) 25;
        A00 = f;
        A01 = (f * 2.0f) / 2.4142137f;
    }
}
