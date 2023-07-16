package X;

import androidx.compose.ui.Modifier;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape2S0212000_I2;

/* renamed from: X.6M5  reason: invalid class name */
public final class AnonymousClass6M5 {
    public static final void A00(C147188nY r14, Modifier modifier, AnonymousClass0ZU r16, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        AnonymousClass0ZU r11 = r16;
        C04220Ms.A0B(r11, 0);
        C147188nY r6 = r14;
        r14.Cvd(1580599782);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r14, r11) | i;
        } else {
            i3 = i5;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0M(r14, z2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r14, modifier2);
        }
        if ((i3 & 731) != 146 || !r14.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            int i7 = R.drawable.instagram_volume_pano_outline_24;
            if (z) {
                i7 = R.drawable.instagram_volume_off_pano_outline_24;
            }
            C115286uo A00 = AnonymousClass6QP.A00(r14, i7);
            int i8 = 2131821626;
            if (z) {
                i8 = 2131821627;
            }
            AnonymousClass6M8.A00(r6, modifier2, A00, (AnonymousClass5I3) null, AnonymousClass7JS.A01(r14, i8), r11, (i3 & 14) | 64 | ((i3 << 3) & 7168), 16);
        } else {
            r14.CuJ();
        }
        C147178nW AKE = r14.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0212000_I2(r11, modifier2, i5, i4, 0, z2));
        }
    }
}
