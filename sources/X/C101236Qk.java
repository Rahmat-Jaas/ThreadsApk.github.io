package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape156S0100000_I2_11;
import kotlin.jvm.internal.KtLambdaShape1S1002000_I2;
import kotlin.jvm.internal.KtLambdaShape4S1100000_I2;

/* renamed from: X.6Qk  reason: invalid class name and case insensitive filesystem */
public final class C101236Qk {
    public static final void A00(C147188nY r4, String str, int i, int i2) {
        int i3;
        r4.Cvd(1999360640);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r4, str) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !r4.BCM()) {
            if (i4 != 0) {
                str = null;
            }
            Context A0T = C147188nY.A0T(r4);
            AnonymousClass7W3 A0Y = C147188nY.A0Y(r4);
            Object A13 = A0Y.A13();
            if (A13 == AnonymousClass7GN.A00) {
                A13 = new C18330wh(A0T);
                A0Y.A14(A13);
            }
            AnonymousClass7W3.A0w(A0Y, false);
            AnonymousClass7K5.A06(r4, new KtLambdaShape4S1100000_I2(str, A13, 31));
            AnonymousClass7K5.A04(r4, Unit.A00, new KtLambdaShape156S0100000_I2_11(A13, 30));
        } else {
            r4.CuJ();
        }
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S1002000_I2(i2, i, str, 0));
        }
    }
}
