package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape6S1000000_I2;

/* renamed from: X.6Ms  reason: invalid class name and case insensitive filesystem */
public final class C100286Ms {
    public static final void A00(C147188nY r26, Modifier modifier, double d, int i, int i2) {
        int i3;
        int i4;
        Modifier modifier2 = modifier;
        C147188nY r6 = r26;
        r6.Cvd(-49969802);
        double d2 = d;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            AnonymousClass7W3 r5 = (AnonymousClass7W3) r6;
            Object A13 = r5.A13();
            if (!(A13 instanceof Double) || d != C86124wJ.A00(A13)) {
                r5.A14(Double.valueOf(d2));
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i | i4;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r6, modifier2);
        }
        if ((i3 & 91) != 18 || !r6.BCM()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            Context A0T = C147188nY.A0T(r6);
            Double valueOf = Double.valueOf(d2);
            boolean A0z = C147188nY.A0z(r6, valueOf, 1157296644);
            AnonymousClass7W3 r0 = (AnonymousClass7W3) r6;
            Object A132 = r0.A13();
            if (A0z || A132 == AnonymousClass7GN.A00) {
                A132 = C19591Ayr.A09(A0T.getResources(), AnonymousClass68E.MINUTES, AnonymousClass006.A00, d2, false);
                r0.A14(A132);
            }
            AnonymousClass7W3.A0w(r0, false);
            C04220Ms.A09(A132);
            String str = (String) A132;
            boolean A0z2 = C147188nY.A0z(r6, valueOf, 1157296644);
            Object A133 = r0.A13();
            if (A0z2 || A133 == AnonymousClass7GN.A00) {
                A133 = C19591Ayr.A09(A0T.getResources(), AnonymousClass68E.SECONDS, AnonymousClass006.A0N, d2, false);
                r0.A14(A133);
            }
            AnonymousClass7W3.A0w(r0, false);
            C04220Ms.A09(A133);
            String str2 = (String) A133;
            boolean A0z3 = C147188nY.A0z(r6, str2, 1157296644);
            Object A134 = r0.A13();
            if (A0z3 || A134 == AnonymousClass7GN.A00) {
                A134 = new KtLambdaShape6S1000000_I2(str2, 16);
                r0.A14(A134);
            }
            AnonymousClass7I9.A02(r6, AnonymousClass6FI.A00(modifier2, AnonymousClass7W3.A0B(r0, A134, false), false), AnonymousClass7J9.A02(r6), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str, 0, 0, 0, 0, 0, 2040, AnonymousClass7KB.A03(r6), 0, false);
        } else {
            r6.CuJ();
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8R2(modifier2, d, i, i2));
        }
    }
}
