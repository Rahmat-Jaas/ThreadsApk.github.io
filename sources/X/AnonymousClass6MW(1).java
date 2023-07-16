package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.jvm.internal.KtLambdaShape18S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape1S0502000_I2;

/* renamed from: X.6MW  reason: invalid class name */
public final class AnonymousClass6MW {
    public static final void A00(C147188nY r25, Modifier modifier, C146178lm r27, AnonymousClass0ZU r28, AnonymousClass0YY r29, AnonymousClass0YP r30, int i, int i2) {
        int i3;
        float f;
        C968366w r19;
        Modifier modifier2 = modifier;
        C146178lm r3 = r27;
        AnonymousClass0ZU r2 = r28;
        boolean A1Z = AnonymousClass0wJ.A1Z(r3, r2);
        AnonymousClass0YY r15 = r29;
        AnonymousClass0YP r14 = r30;
        int A07 = C86124wJ.A07(2, r15, r14);
        C147188nY r4 = r25;
        r4.Cvd(-925702862);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r4, r3) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r4, r2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0B(r4, r15);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0C(r4, r14);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((57344 & i) == 0) {
            i3 |= C147188nY.A0J(r4, modifier2);
        }
        if ((46811 & i3) != 9362 || !r4.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            String valueOf = String.valueOf(r3.AnQ());
            float width = (float) r3.getWidth();
            float height = (float) r3.getHeight();
            if (width <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || height <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f = 1.0f;
            } else {
                f = width / height;
            }
            if (r3 instanceof C90255Lc) {
                r19 = C968366w.Video;
            } else if ((r3 instanceof C90245Lb) || (r3 instanceof C90235La)) {
                r19 = C968366w.Image;
            } else {
                throw AnonymousClass4VZ.A00();
            }
            C970267q r18 = C970267q.POST;
            float f2 = (float) 0;
            Modifier A05 = AnonymousClass7K4.A05(AnonymousClass73T.A00(r4, modifier2, AnonymousClass687.Middle, 4, A1Z), f2, f2, f2, (float) 16);
            boolean A0y = C147188nY.A0y(r4, r2);
            AnonymousClass7W3 r9 = (AnonymousClass7W3) r4;
            Object A13 = r9.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = AnonymousClass7W3.A0G(r9, r2, A07);
            }
            C117766zD.A01(r4, C117646z1.A00(A05, (AnonymousClass799) null, (String) null, AnonymousClass7W3.A08(r9, A13, false), 15, false), r18, r19, valueOf, (AnonymousClass0ZU) null, AnonymousClass7JR.A00(r4, new KtLambdaShape18S0301000_I2(i3, 16, r3, r14, r15), 348685373), f, 1597446, 0);
        } else {
            r4.CuJ();
        }
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S0502000_I2(r15, r14, r3, r2, modifier2, i5, i4, 2));
        }
    }
}
