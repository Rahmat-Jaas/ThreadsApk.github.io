package X;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1;

/* renamed from: X.6MO  reason: invalid class name */
public final class AnonymousClass6MO {
    public static final void A00(LazyListState lazyListState, C147188nY r7, AnonymousClass0YY r8, int i) {
        int i2;
        boolean A1Y = AnonymousClass0wJ.A1Y(lazyListState, r8);
        r7.Cvd(-1256586431);
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r7, lazyListState) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r7, r8);
        }
        if ((i2 & 91) != 18 || !r7.BCM()) {
            Unit unit = Unit.A00;
            boolean A10 = C147188nY.A10(r7, lazyListState, r8, 511388516);
            AnonymousClass7W3 r3 = (AnonymousClass7W3) r7;
            Object A13 = r3.A13();
            if (A10 || A13 == AnonymousClass7GN.A00) {
                A13 = new KtSLambdaShape15S0201000_I2_1((Object) lazyListState, (Object) r8, (C146958n9) null, 39);
                r3.A14(A13);
            }
            AnonymousClass7W3.A0b(r7, r3, A13, unit, A1Y);
        } else {
            r7.CuJ();
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            C147178nW.A04(AKE, lazyListState, r8, i, 34);
        }
    }
}
