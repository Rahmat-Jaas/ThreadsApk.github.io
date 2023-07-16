package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.jvm.internal.KtLambdaShape1S1500000_I2;
import kotlin.jvm.internal.KtLambdaShape3S0302000_I2;

/* renamed from: X.73v  reason: invalid class name and case insensitive filesystem */
public final class C1191773v {
    public static final AnonymousClass0YY A00 = C78054ho.A00;
    public static final AnonymousClass7XF A01 = new AnonymousClass7XF();

    public static final void A00(C147188nY r20, Modifier modifier, AnonymousClass0YY r22, AnonymousClass0YY r23, int i, int i2) {
        int i3;
        AnonymousClass0YY r7 = r23;
        Modifier modifier2 = modifier;
        AnonymousClass0YY r14 = r22;
        C04220Ms.A0B(r14, 0);
        C147188nY r9 = r20;
        r9.Cvd(-1783766393);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r9, r14) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r9, modifier2);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0B(r9, r7);
        }
        if ((i3 & 731) != 146 || !r9.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                r7 = A00;
            }
            AnonymousClass7W3 A0Y = C147188nY.A0Y(r9);
            Object A13 = A0Y.A13();
            if (A13 == AnonymousClass7GN.A00) {
                A13 = new NestedScrollDispatcher();
                A0Y.A14(A13);
            }
            AnonymousClass7W3.A0w(A0Y, false);
            NestedScrollDispatcher nestedScrollDispatcher = (NestedScrollDispatcher) A13;
            Modifier A002 = C120417Am.A00(r9, C98186En.A00(modifier2, A01, nestedScrollDispatcher));
            Object AEA = r9.AEA(AnonymousClass7DE.A02);
            Object A0n = C147188nY.A0n(r9);
            Object AEA2 = r9.AEA(AnonymousClass7DA.A03);
            Object AEA3 = r9.AEA(AnonymousClass7DA.A04);
            r9.Cvb(-430628662);
            KtLambdaShape1S1500000_I2 ktLambdaShape1S1500000_I2 = new KtLambdaShape1S1500000_I2(C147188nY.A0o(r9), r14, AnonymousClass6EH.A00(r9), nestedScrollDispatcher, r9.AEA(C102686Wd.A00), String.valueOf(A0Y.A02), 0);
            AnonymousClass7W3.A0w(A0Y, false);
            r9.Cvb(1886828752);
            if (!(A0Y.A0b instanceof C874952z)) {
                throw C18180wK.A0a("Invalid applier");
            }
            AnonymousClass7W3.A0s(A0Y, (Object) null, (Object) null, 125, 1);
            A0Y.A0R = true;
            if (A0Y.A0P) {
                r9.AFy(C86154wM.A13(ktLambdaShape1S1500000_I2, 40));
            } else {
                r9.DA8();
            }
            AnonymousClass7Ak.A02(r9, A002, AnonymousClass8XC.A00);
            AnonymousClass7Ak.A02(r9, AEA, AnonymousClass8XD.A00);
            AnonymousClass7Ak.A02(r9, AEA2, AnonymousClass8XE.A00);
            AnonymousClass7Ak.A02(r9, AEA3, AnonymousClass8XF.A00);
            AnonymousClass7Ak.A02(r9, A0n, AnonymousClass8XG.A00);
            AnonymousClass7Ak.A02(r9, r7, AnonymousClass8XB.A00);
            AnonymousClass7W3.A0w(A0Y, true);
            AnonymousClass7W3.A0w(A0Y, false);
        } else {
            r9.CuJ();
        }
        C147178nW AKE = r9.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S0302000_I2(r7, modifier2, r14, i5, i4, 4));
        }
    }
}
