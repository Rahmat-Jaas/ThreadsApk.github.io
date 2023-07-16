package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import java.util.List;
import kotlin.jvm.internal.IDxLambdaShape2S0120000_2_I2;
import kotlin.jvm.internal.KtLambdaShape0S0230000_I2;
import kotlin.jvm.internal.KtLambdaShape18S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;
import kotlin.jvm.internal.KtLambdaShape2S0402000_I2;

/* renamed from: X.6yx  reason: invalid class name and case insensitive filesystem */
public final class C117606yx {
    public static final void A00(C147188nY r12, Modifier modifier, C972268l r14, List list, AnonymousClass0YY r16, int i, int i2) {
        Modifier modifier2 = modifier;
        List list2 = list;
        AnonymousClass0YY r6 = r16;
        int A07 = C86124wJ.A07(0, list, r6);
        C147188nY r3 = r12;
        r12.Cvd(1481543820);
        int i3 = i2;
        if ((i2 & 4) != 0) {
            modifier2 = Modifier.A00;
        }
        C972268l r4 = r14;
        int i4 = i;
        A01(r3, modifier2, AnonymousClass7JR.A00(r3, new KtLambdaShape18S0301000_I2(i4, 12, r14, list, r16), -1291109894), ((i >> 6) & 14) | 48, 0);
        C147178nW AKE = r3.AKE();
        if (AKE != null) {
            ((AnonymousClass7WO) AKE).A06 = new KtLambdaShape2S0402000_I2(r4, modifier2, r6, list2, i4, i3, A07);
        }
    }

    public static final void A01(C147188nY r15, Modifier modifier, AnonymousClass0YP r17, int i, int i2) {
        int i3;
        AnonymousClass0YY r5;
        Modifier modifier2 = modifier;
        AnonymousClass0YP r11 = r17;
        C04220Ms.A0B(r11, 1);
        r15.Cvd(2125286512);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r15, modifier2) | i;
        } else {
            i3 = i6;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r15, r11);
        }
        if ((i3 & 91) != 18 || !r15.BCM()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            C122847Ub A00 = AnonymousClass7Ad.A00(r15);
            C04220Ms.A0B(modifier2, 0);
            if (C86164wN.A1Q(1, A00)) {
                r5 = new KtLambdaShape0S0230000_I2(A00, (Object) null, 0, true, false);
            } else {
                r5 = InspectableValueKt.A00;
            }
            Modifier A06 = AnonymousClass7K4.A06(C120417Am.A02(modifier2, r5, new IDxLambdaShape2S0120000_2_I2(A00, 0, false, true)), (float) 16, 0);
            C123587Xr r7 = C123587Xr.A00;
            int i7 = (i3 >> 3) & 14;
            Object A0p = C147188nY.A0p(r15);
            Object A0n = C147188nY.A0n(r15);
            Object A0m = C147188nY.A0m(r15);
            AnonymousClass0ZU r0 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A06);
            int A01 = C86114wI.A01(i7);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r15;
            C147188nY.A0w(r15, r2, r0);
            C147188nY.A0x(r15, AnonymousClass7KP.A02(r15, r7, A0p, A0n, A0m), A002, (A01 >> 3) & 112);
            C86104wH.A1S(r15, r11, A01 >> 9);
            AnonymousClass7W3.A0u(r2, true);
        } else {
            r15.CuJ();
        }
        C147178nW AKE = r15.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0202000_I2(r11, i6, modifier2, i4, 8));
        }
    }
}
