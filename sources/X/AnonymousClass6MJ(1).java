package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import kotlin.jvm.internal.KtLambdaShape0S0322000_I2;

/* renamed from: X.6MJ  reason: invalid class name */
public final class AnonymousClass6MJ {
    public static final void A00(C147258p3 r15, C147188nY r16, Modifier modifier, AnonymousClass0ZU r18, int i, int i2, boolean z, boolean z2) {
        int i3;
        Modifier A02;
        C147258p3 r13 = r15;
        boolean z3 = z2;
        AnonymousClass0ZU r11 = r18;
        Modifier modifier2 = modifier;
        C147188nY r3 = r16;
        r3.Cvd(-289131412);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r3, modifier2) | i;
        } else {
            i3 = i6;
        }
        boolean z4 = z;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0M(r3, z4);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i6 & 896) == 0) {
            i3 |= C147188nY.A0B(r3, r11);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i6 & 7168) == 0) {
            i3 |= C147188nY.A0O(r3, z3);
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((57344 & i) == 0) {
            i3 |= C147188nY.A0J(r3, r13);
        }
        if ((46811 & i3) != 9362 || !r3.BCM()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                r11 = null;
            }
            z3 = C86154wM.A1Z(i8, z3);
            if (i9 != 0) {
                r13 = (C147258p3) AnonymousClass7GN.A00((AnonymousClass7W3) r3);
            }
            Modifier A00 = AnonymousClass6EV.A00(AnonymousClass7Kq.A0F(modifier2, 24), C18230wP.A00(z3 ? 1 : 0));
            boolean A0y = C147188nY.A0y(r3, r11);
            AnonymousClass7W3 r4 = (AnonymousClass7W3) r3;
            Object A13 = r4.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = AnonymousClass7W3.A0C(r4, r11, 2);
            }
            Modifier A002 = AnonymousClass6E2.A00((C142668fO) null, r13, A00, (AnonymousClass799) null, AnonymousClass7W3.A0A(r4, A13, false), z, z3);
            if (z) {
                r3.Cvb(-286712371);
                long A022 = AnonymousClass7KB.A02(r3);
                C874352s r8 = AnonymousClass7G5.A00;
                A02 = C115656vh.A01(AnonymousClass7Ac.A02(A002, r8, (float) 8, A022), r8, AnonymousClass7KB.A00(r3));
            } else {
                r3.Cvb(-286712154);
                long j = C120537Bh.A00(r3).A0s;
                A02 = AnonymousClass7Ac.A02(A002, AnonymousClass7G5.A00, (float) 2, j);
            }
            C115686vk.A01(r3, A02, 0);
            AnonymousClass7W3.A0w(r4, false);
        } else {
            r3.CuJ();
        }
        C147178nW AKE = r3.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S0322000_I2(r11, modifier2, r13, i6, i4, 0, z4, z3));
        }
    }
}
