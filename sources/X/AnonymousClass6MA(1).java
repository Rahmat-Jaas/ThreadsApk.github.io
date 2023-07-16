package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape2S0212000_I2;

/* renamed from: X.6MA  reason: invalid class name */
public final class AnonymousClass6MA {
    public static final void A00(C147188nY r21, Modifier modifier, AnonymousClass0YP r23, int i, int i2, boolean z) {
        int i3;
        boolean z2 = z;
        Modifier modifier2 = modifier;
        AnonymousClass0YP r10 = r23;
        C04220Ms.A0B(r10, 2);
        C147188nY r11 = r21;
        r11.Cvd(512336209);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = 2;
        int i7 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r11, modifier2) | i;
        } else {
            i3 = i7;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0M(r11, z2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i7 & 896) == 0) {
            i3 |= C147188nY.A0B(r11, r10);
        }
        if ((i3 & 731) != 146 || !r11.BCM()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i8 != 0) {
                z2 = true;
            }
            int i9 = (i3 & 14) | 384;
            C146288ly A07 = AnonymousClass7KV.A07(r11, true);
            Object A0p = C147188nY.A0p(r11);
            Object A0n = C147188nY.A0n(r11);
            Object A0m = C147188nY.A0m(r11);
            AnonymousClass0ZU r0 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(modifier2);
            int A01 = C86114wI.A01((i9 << 3) & 112);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r11;
            C147188nY.A0w(r11, r1, r0);
            AnonymousClass7W3.A0a(r11, r1, A07, A0p);
            AnonymousClass7KP.A08(r11, A0n, A0m, A00, A01);
            AnonymousClass7V3 r3 = AnonymousClass7V3.A00;
            int A05 = C86124wJ.A05(i9);
            r11.Cvb(1764239831);
            if ((A05 & 14) == 0) {
                if (r11.ACY(r3)) {
                    i6 = 4;
                }
                A05 |= i6;
            }
            if ((A05 & 91) != 18 || !r11.BCM()) {
                C86104wH.A1S(r11, r10, i3 >> 6);
                if (z2) {
                    Modifier A002 = r3.A00(Modifier.A00);
                    Object A012 = AnonymousClass7GN.A01(r1, C147188nY.A0r(r11, r1, -492369756));
                    AnonymousClass7W3.A0w(r1, false);
                    C115686vk.A01(r11, AnonymousClass7HZ.A00((C142668fO) null, (C147258p3) A012, A002, (AnonymousClass799) null, (String) null, C74494aX.A00, true), 0);
                }
            } else {
                r11.CuJ();
            }
            AnonymousClass7W3.A0v(r1, true);
        } else {
            r11.CuJ();
        }
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AnonymousClass0YP r212 = r10;
            Modifier modifier3 = modifier2;
            AKE.D9d(new KtLambdaShape2S0212000_I2(modifier3, r212, i7, i4, 1, z2));
        }
    }
}
