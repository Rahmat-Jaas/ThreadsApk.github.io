package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape1S1102000_I2;

/* renamed from: X.6Lt  reason: invalid class name and case insensitive filesystem */
public final class C100046Lt {
    public static final void A00(C147188nY r22, Modifier modifier, String str, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        String str2 = str;
        C04220Ms.A0B(str2, 0);
        C147188nY r5 = r22;
        r5.Cvd(-580075390);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r5, str2) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r5, modifier2);
        }
        if ((i3 & 91) != 18 || !r5.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            float f = (float) 0;
            AnonymousClass7I9.A02(r5, AnonymousClass7K4.A05(modifier2, f, (float) 3, f, f), AnonymousClass7J9.A02(r5), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str2, 0, 3, 2, (i3 & 14) | 805306368, 6, 508, 0, 0, false);
        } else {
            r5.CuJ();
        }
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S1102000_I2(modifier2, str2, i5, i4, 0));
        }
    }
}
