package X;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1;

/* renamed from: X.6NM  reason: invalid class name */
public final class AnonymousClass6NM {
    public static final void A00(C147188nY r6, C970567t r7, AnonymousClass0ZU r8, int i) {
        int i2;
        int i3;
        boolean A1Z = AnonymousClass0wJ.A1Z(r8, r7);
        r6.Cvd(-1831313840);
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r6, r8) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r6, r7);
        }
        if ((i2 & 91) != 18 || !r6.BCM()) {
            int ordinal = r7.ordinal();
            if (ordinal == 0) {
                i3 = 97726445;
                r6.Cvb(i3);
            } else if (ordinal != A1Z) {
                if (ordinal != 2) {
                    i3 = 97726878;
                    if (ordinal == 3) {
                        r6.Cvb(97726667);
                        AnonymousClass7K5.A05(r6, Unit.A00, new KtSLambdaShape6S0200000_I2_1(C147188nY.A0o(r6), (Object) r8, (C146958n9) null, 31));
                    }
                } else {
                    i3 = 97726618;
                }
                r6.Cvb(i3);
            } else {
                r6.Cvb(97726507);
                C101236Qk.A00(r6, AnonymousClass7JS.A01(r6, 2131832819), 0, 0);
            }
            AnonymousClass7W3.A0z(r6, false);
        } else {
            r6.CuJ();
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, r8, r7, i, 0);
        }
    }
}
