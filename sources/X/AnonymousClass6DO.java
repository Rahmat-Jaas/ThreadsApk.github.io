package X;

import androidx.activity.IDxPCallbackShape33S0100000_2_I2;
import kotlin.jvm.internal.KtLambdaShape2S0112000_I2;
import kotlin.jvm.internal.KtLambdaShape4S0110000_I2;

/* renamed from: X.6DO  reason: invalid class name */
public final class AnonymousClass6DO {
    public static final void A00(C147188nY r11, AnonymousClass0ZU r12, int i, int i2, boolean z) {
        int i3;
        boolean z2 = z;
        AnonymousClass0ZU r6 = r12;
        C04220Ms.A0B(r12, 1);
        r11.Cvd(-361453782);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0L(r11, z) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r11, r12);
        }
        if ((i3 & 91) != 18 || !r11.BCM()) {
            if (i5 != 0) {
                z2 = true;
            }
            C81784oM A01 = C115806vw.A01(r11, r12);
            AnonymousClass7W3 A0Z = C147188nY.A0Z(r11, -3687241);
            Object A13 = A0Z.A13();
            Object obj = AnonymousClass7GN.A00;
            if (A13 == obj) {
                A13 = new IDxPCallbackShape33S0100000_2_I2(A01, z2);
                A0Z.A14(A13);
            }
            AnonymousClass7W3.A0w(A0Z, false);
            boolean A11 = C147188nY.A11(r11, Boolean.valueOf(z2), C147188nY.A0z(r11, A13, -3686552));
            Object A132 = A0Z.A13();
            if (A11 || A132 == obj) {
                A132 = new KtLambdaShape4S0110000_I2(0, A13, z2);
                A0Z.A14(A132);
            }
            AnonymousClass7K5.A06(r11, AnonymousClass7W3.A09(A0Z, A132, false));
            AnonymousClass092 A00 = AnonymousClass72I.A00(r11);
            if (A00 != null) {
                AnonymousClass00F onBackPressedDispatcher = A00.getOnBackPressedDispatcher();
                Object AEA = r11.AEA(AnonymousClass7DA.A03);
                AnonymousClass7K5.A02(r11, AEA, onBackPressedDispatcher, C86154wM.A0y(A13, AEA, onBackPressedDispatcher, 2));
            } else {
                throw C18180wK.A0a("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
        } else {
            r11.CuJ();
        }
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0112000_I2(r6, i6, i4, 0, z2));
        }
    }
}
