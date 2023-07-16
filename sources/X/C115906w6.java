package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;
import kotlin.jvm.internal.KtLambdaShape3S0302000_I2;

/* renamed from: X.6w6  reason: invalid class name and case insensitive filesystem */
public final class C115906w6 {
    public static final void A01(C147188nY r10, Modifier modifier, AnonymousClass0YP r12, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AnonymousClass0YP r7 = r12;
        C04220Ms.A0B(r12, 1);
        C147188nY r4 = r10;
        r10.Cvd(-1298353104);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r4, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r4, r7);
        }
        if ((i3 & 91) != 18 || !r4.BCM()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            AnonymousClass7W3 A0Y = C147188nY.A0Y(r4);
            Object A13 = A0Y.A13();
            if (A13 == AnonymousClass7GN.A00) {
                A13 = new C1195976a();
                A0Y.A14(A13);
            }
            AnonymousClass7W3.A0w(A0Y, false);
            int i7 = i3 << 3;
            A00(r4, modifier2, (C1195976a) A13, r7, (i7 & 112) | 8 | (i7 & 896), 0);
        } else {
            r4.CuJ();
        }
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0202000_I2(r7, i6, modifier2, i4, 4));
        }
    }

    public static final void A00(C147188nY r15, Modifier modifier, C1195976a r17, AnonymousClass0YP r18, int i, int i2) {
        Modifier modifier2 = modifier;
        C1195976a r12 = r17;
        AnonymousClass0YP r14 = r18;
        AnonymousClass0wJ.A1M(r12, 0, r14);
        r15.Cvd(-511989831);
        int i3 = i2;
        if ((i2 & 2) != 0) {
            modifier2 = Modifier.A00;
        }
        C115506vH A00 = AnonymousClass6EH.A00(r15);
        Modifier A002 = C120417Am.A00(r15, modifier2);
        Object AEA = r15.AEA(AnonymousClass7DE.A02);
        Object A0n = C147188nY.A0n(r15);
        Object A0m = C147188nY.A0m(r15);
        AnonymousClass0ZU r10 = AnonymousClass7Y3.A0e;
        AnonymousClass7W3 A0Z = C147188nY.A0Z(r15, 1886828752);
        AnonymousClass7W3.A0s(A0Z, (Object) null, (Object) null, 125, 1);
        A0Z.A0R = true;
        if (A0Z.A0P) {
            r15.AFy(C86154wM.A13(r10, 19));
        } else {
            r15.DA8();
        }
        AnonymousClass7Ak.A02(r15, r12, r12.A04);
        AnonymousClass7Ak.A02(r15, A00, r12.A02);
        AnonymousClass7Ak.A02(r15, r14, r12.A03);
        AnonymousClass7Ak.A02(r15, AEA, AnonymousClass74X.A01);
        AnonymousClass7Ak.A02(r15, A0m, AnonymousClass7Ak.A01(r15, A0n, AnonymousClass74X.A02));
        AnonymousClass7Ak.A02(r15, A002, AnonymousClass74X.A04);
        AnonymousClass7W3.A0w(A0Z, true);
        AnonymousClass7W3.A0w(A0Z, false);
        r15.Cvb(-607848778);
        if (!r15.BCM()) {
            AnonymousClass7K5.A06(r15, C86154wM.A13(r12, 20));
        }
        AnonymousClass7W3.A0w(A0Z, false);
        C81784oM A01 = C115806vw.A01(r15, r12);
        Unit unit = Unit.A00;
        boolean A0y = C147188nY.A0y(r15, A01);
        Object A13 = A0Z.A13();
        if (A0y || A13 == AnonymousClass7GN.A00) {
            A13 = C86154wM.A10(A01, 35);
            A0Z.A14(A13);
        }
        AnonymousClass7W3.A0c(r15, A0Z, A13, unit, false);
        C147178nW AKE = r15.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S0302000_I2(r12, modifier2, r14, i, i3, 3));
        }
    }
}
