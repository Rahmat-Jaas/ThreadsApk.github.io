package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape27S0201000_I2;
import kotlin.jvm.internal.KtLambdaShape3S0302000_I2;

/* renamed from: X.7Cw  reason: invalid class name and case insensitive filesystem */
public final class C120867Cw {
    public static final AnonymousClass534 A00 = AnonymousClass533.A00(C74514aZ.A00);
    public static final AnonymousClass534 A01 = AnonymousClass533.A00(C74524aa.A00);

    public static final void A00(C115556vT r12, C147188nY r13, Modifier modifier, AnonymousClass0YP r15, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C115556vT r10 = r12;
        AnonymousClass0YP r122 = r15;
        AnonymousClass0wJ.A1M(r10, 0, r15);
        C147188nY r5 = r13;
        r13.Cvd(-1716560953);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r5, r10) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r5, modifier2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0B(r5, r15);
        }
        if ((i3 & 731) != 146 || !r5.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            r5.Cvb(-362020521);
            AnonymousClass534 r6 = A01;
            C115596vX r9 = (C115596vX) r5.AEA(r6);
            String str = (String) r5.AEA(A00);
            boolean A0z = C147188nY.A0z(r5, r10, 1157296644);
            AnonymousClass7W3 r7 = (AnonymousClass7W3) r5;
            Object A13 = r7.A13();
            if (A0z || A13 == AnonymousClass7GN.A00) {
                A13 = new C115596vX(r10, r9, str);
                r7.A14(A13);
            }
            AnonymousClass7W3.A0w(r7, false);
            boolean A0z2 = C147188nY.A0z(r5, A13, 1157296644);
            Object A132 = r7.A13();
            if (A0z2 || A132 == AnonymousClass7GN.A00) {
                A132 = AnonymousClass7W3.A0C(r7, A13, 3);
            }
            AnonymousClass7W3.A0c(r5, r7, A132, A13, false);
            AnonymousClass7W3.A0w(r7, false);
            AnonymousClass7JR.A05(r5, new KtLambdaShape27S0201000_I2(i3, 31, modifier2, r15), AnonymousClass7DS.A01(r6, A13, true), 1756692615);
        } else {
            r5.CuJ();
        }
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S0302000_I2(r10, modifier2, r122, i5, i4, 8));
        }
    }

    public static final void A01(C147188nY r4, String str, AnonymousClass0YP r6, int i) {
        int i2;
        boolean A1Z = AnonymousClass0wJ.A1Z(str, r6);
        r4.Cvd(1359717094);
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r4, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r4, r6);
        }
        if ((i2 & 91) != 18 || !r4.BCM()) {
            AnonymousClass7Ai.A01(r4, r6, AnonymousClass7DS.A01(A00, str, A1Z), i2);
        } else {
            r4.CuJ();
        }
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            C147178nW.A06(AKE, r6, str, i, A1Z ? 1 : 0);
        }
    }
}
