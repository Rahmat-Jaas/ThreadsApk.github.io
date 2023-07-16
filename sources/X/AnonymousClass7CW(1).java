package X;

import androidx.compose.ui.Modifier;
import com.instagram.barcelona.bds.components.header.EnterAlwaysState;
import kotlin.jvm.internal.KtLambdaShape1S3100000_I2;
import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;
import kotlin.jvm.internal.KtLambdaShape3S0111000_I2;

/* renamed from: X.7CW  reason: invalid class name */
public final class AnonymousClass7CW {
    public static final C122747Tr A00 = C122747Tr.A00(AnonymousClass6aT.A02, 2, 100, 0);

    public static final void A01(C147188nY r14, Modifier modifier, AnonymousClass0YP r16, int i, int i2) {
        int i3;
        AnonymousClass0YP r13 = r16;
        C04220Ms.A0B(r13, 1);
        C147188nY r5 = r14;
        r14.Cvd(1613025844);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r5, modifier) | i;
        } else {
            i3 = i6;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r5, r13);
        }
        if ((i3 & 91) != 18 || !r5.BCM()) {
            if (i5 != 0) {
                modifier = Modifier.A00;
            }
            int i7 = i3 & 14;
            C146288ly A002 = C120767Cj.A00(r5, AnonymousClass7KV.A00(r5), false);
            Object A0p = C147188nY.A0p(r5);
            Object A0n = C147188nY.A0n(r5);
            Object A0m = C147188nY.A0m(r5);
            AnonymousClass0ZU r7 = AnonymousClass74X.A00;
            AnonymousClass0YM A003 = C98236Es.A00(modifier);
            int A01 = C86114wI.A01((i7 << 3) & 112);
            AnonymousClass7W3 r3 = (AnonymousClass7W3) r5;
            C147188nY.A0w(r5, r3, r7);
            AnonymousClass7W3.A0a(r5, r3, A002, A0p);
            AnonymousClass7KP.A08(r5, A0n, A0m, A003, A01);
            int A05 = C86124wJ.A05(i7);
            r5.Cvb(-2108148626);
            if ((A05 & 81) != 16 || !r5.BCM()) {
                C86104wH.A1S(r5, r13, i3 >> 3);
            } else {
                r5.CuJ();
            }
            AnonymousClass7W3.A0v(r3, true);
        } else {
            r5.CuJ();
        }
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0202000_I2(r13, i6, modifier, i4, 9));
        }
    }

    public static final EnterAlwaysState A00(C147188nY r11, int i, int i2, boolean z) {
        r11.Cvb(-488251880);
        if ((i2 & 2) != 0) {
            z = true;
        }
        AnonymousClass8cU A002 = AnonymousClass72K.A00(r11);
        C04220Ms.A0B(A002, 0);
        C139978Qj r1 = new C139978Qj();
        KtLambdaShape1S3100000_I2 ktLambdaShape1S3100000_I2 = new KtLambdaShape1S3100000_I2(A002, "MaxHeight", "CanScroll", "ScrollOffset", 1);
        EnterAlwaysState enterAlwaysState = (EnterAlwaysState) AnonymousClass6EN.A00(r11, AnonymousClass6EM.A00(C86154wM.A10(ktLambdaShape1S3100000_I2, 9), C86164wN.A0u(r1, 15)), new KtLambdaShape3S0111000_I2(A002, i, 1, z), new Object[0], 4);
        AnonymousClass7W3.A0z(r11, false);
        return enterAlwaysState;
    }
}
