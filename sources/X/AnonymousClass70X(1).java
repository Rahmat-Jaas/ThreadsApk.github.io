package X;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape13S0100000_I2_2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape18S0201000_I2_4;
import kotlin.jvm.internal.KtLambdaShape18S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape24S0101000_I2;
import kotlin.jvm.internal.KtLambdaShape24S0200000_I2_8;

/* renamed from: X.70X  reason: invalid class name */
public final class AnonymousClass70X {
    public static final void A00(LazyListState lazyListState, C147188nY r12, AnonymousClass0ZU r13, int i, int i2, int i3) {
        int i4;
        int i5 = i;
        LazyListState lazyListState2 = lazyListState;
        AnonymousClass0ZU r8 = r13;
        AnonymousClass0wJ.A1M(lazyListState, 0, r13);
        r12.Cvd(-1768530169);
        int i6 = i3;
        int i7 = i2;
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = C147188nY.A0F(r12, lazyListState2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= C147188nY.A04(r12, i);
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= C147188nY.A0B(r12, r13);
        }
        if ((i4 & 731) != 146 || !r12.BCM()) {
            if (i8 != 0) {
                i5 = 5;
            } else if (i < 0) {
                throw C18190wL.A0a("loadMoreThreshold must be positive");
            }
            AnonymousClass7W3 r5 = (AnonymousClass7W3) r12;
            Object A13 = r5.A13();
            Object obj = AnonymousClass7GN.A00;
            if (A13 == obj) {
                A13 = C123267Wf.A01(new KtLambdaShape24S0101000_I2(i5, 6, lazyListState2));
                r5.A14(A13);
            }
            boolean A10 = C147188nY.A10(r12, A13, r13, 511388516);
            Object A132 = r5.A13();
            if (A10 || A132 == obj) {
                A132 = new KtSLambdaShape18S0201000_I2_4(r13, A13, (C146958n9) null, 4);
                r5.A14(A132);
            }
            AnonymousClass7W3.A0b(r12, r5, A132, A13, false);
        } else {
            r12.CuJ();
        }
        C147178nW AKE = r12.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8RK(lazyListState2, r8, i5, i7, i6));
        }
    }

    public static final void A01(LazyListState lazyListState, C147188nY r12, AnonymousClass0ZU r13, AnonymousClass0ZU r14, int i) {
        int i2;
        C04220Ms.A0B(lazyListState, 0);
        AnonymousClass0ZU r9 = r13;
        AnonymousClass0ZU r10 = r14;
        AnonymousClass0wJ.A1O(r13, r14);
        r12.Cvd(124121991);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r12, lazyListState) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r12, r13);
        }
        if ((i & 896) == 0) {
            i2 |= C147188nY.A0B(r12, r14);
        }
        if ((i2 & 731) != 146 || !r12.BCM()) {
            AnonymousClass7W3 r5 = (AnonymousClass7W3) r12;
            Object A13 = r5.A13();
            Object obj = AnonymousClass7GN.A00;
            if (A13 == obj) {
                A13 = C123267Wf.A01(new KtLambdaShape24S0200000_I2_8(11, (Object) r13, (Object) lazyListState));
                r5.A14(A13);
            }
            if (C86104wH.A1X((C81784oM) A13)) {
                Unit unit = Unit.A00;
                boolean A0y = C147188nY.A0y(r12, r14);
                Object A132 = r5.A13();
                if (A0y || A132 == obj) {
                    A132 = new KtSLambdaShape13S0100000_I2_2(r14, (C146958n9) null, 19);
                    r5.A14(A132);
                }
                AnonymousClass7W3.A0b(r12, r5, A132, unit, false);
            }
        } else {
            r12.CuJ();
        }
        C147178nW AKE = r12.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape18S0301000_I2(i3, 22, r9, r10, lazyListState));
        }
    }
}
