package X;

import androidx.compose.ui.Modifier;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;

/* renamed from: X.6M9  reason: invalid class name */
public final class AnonymousClass6M9 {
    public static final void A00(C147188nY r12, Modifier modifier, AnonymousClass0ZU r14, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AnonymousClass0ZU r9 = r14;
        C04220Ms.A0B(r14, 0);
        C147188nY r4 = r12;
        r12.Cvd(1523353432);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r4, r9) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r4, modifier);
        }
        if ((i3 & 91) != 18 || !r4.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            AnonymousClass6M8.A00(r4, modifier2, AnonymousClass6QP.A00(r4, R.drawable.instagram_x_pano_outline_24), (AnonymousClass5I3) null, AnonymousClass7JS.A01(r4, 2131834624), r9, (i3 & 14) | 64 | ((i3 << 6) & 7168), 16);
        } else {
            r4.CuJ();
        }
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0202000_I2(modifier2, i5, r9, i4, 10));
        }
    }
}
