package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape1S1001000_I2;
import kotlin.jvm.internal.KtLambdaShape1S1302000_I2;

/* renamed from: X.6N9  reason: invalid class name */
public final class AnonymousClass6N9 {
    public static final void A00(C147258p3 r14, C147188nY r15, Modifier modifier, String str, AnonymousClass0ZU r18, int i, int i2) {
        int i3;
        Object obj = r14;
        String str2 = str;
        Modifier modifier2 = modifier;
        AnonymousClass0ZU r8 = r18;
        C04220Ms.A0B(r8, 0);
        C147188nY r13 = r15;
        r15.Cvd(-914955518);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r15, r8) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r15, modifier2);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r15, str2);
        }
        if ((i3 & 731) != 146 || !r15.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                str2 = null;
            }
            if ((i2 & 8) != 0) {
                obj = AnonymousClass7GN.A00((AnonymousClass7W3) r13);
            }
            C874352s A00 = AnonymousClass7G5.A00((float) 16);
            AnonymousClass799 A002 = AnonymousClass799.A00(0);
            boolean A0y = C147188nY.A0y(r13, r8);
            AnonymousClass7W3 r4 = (AnonymousClass7W3) r13;
            Object A13 = r4.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = AnonymousClass7W3.A0H(r4, r8, 27);
            }
            C117656z2.A00(r13, AnonymousClass7Ac.A01(AnonymousClass79L.A00((float) 1, C120537Bh.A00(r13).A0p), C117646z1.A01(modifier2, A002, AnonymousClass7W3.A08(r4, A13, false)), A00), A00, AnonymousClass7JR.A00(r13, new KtLambdaShape1S1001000_I2(str2, i3, 4), 245056308), 196608, 24, C120537Bh.A00(r13).A07);
        } else {
            r15.CuJ();
        }
        C147178nW AKE = r13.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S1302000_I2(modifier2, r8, obj, str2, i5, i4, 2));
        }
    }
}
