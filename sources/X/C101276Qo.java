package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;
import kotlin.jvm.internal.KtLambdaShape5S0110000_I2;

/* renamed from: X.6Qo  reason: invalid class name and case insensitive filesystem */
public final class C101276Qo {
    public static final void A00(C147188nY r15, C303320p r16, float f, float f2, int i, int i2, int i3, boolean z) {
        int i4;
        float f3 = f2;
        float f4 = f;
        int i5 = i;
        C303320p r11 = r16;
        boolean z2 = z;
        C147188nY r3 = r15;
        r15.Cvd(-2014940282);
        int i6 = i3;
        int i7 = i3 & 1;
        int i8 = i2;
        if (i7 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = C147188nY.A0L(r3, z2) | i2;
        } else {
            i4 = i8;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= C147188nY.A0G(r3, r11);
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i4 |= 384;
        } else if ((i8 & 896) == 0) {
            i4 |= C86124wJ.A06(r3.ACW(i5) ? 1 : 0);
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i4 |= 3072;
        } else if ((i8 & 7168) == 0) {
            i4 |= C147188nY.A02(r3, f4);
        }
        int i12 = i3 & 16;
        if (i12 != 0) {
            i4 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((57344 & i2) == 0) {
            int i13 = 8192;
            if (r3.ACV(f3)) {
                i13 = Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            }
            i4 |= i13;
        }
        if ((46811 & i4) != 9362 || !r3.BCM()) {
            z2 = C18240wQ.A1R(i7, z2);
            if (i9 != 0) {
                r11 = C303320p.ACTIVE;
            }
            if (i10 != 0) {
                i5 = 1;
            }
            if (i11 != 0) {
                f4 = (float) 2;
            }
            if (i12 != 0) {
                f3 = (float) 2;
            }
            C147168nV A0j = C147188nY.A0j(r3);
            float CxL = A0j.CxL(f4);
            Float valueOf = Float.valueOf(CxL);
            float CxL2 = A0j.CxL(f3);
            boolean A12 = C147188nY.A12(r3, Float.valueOf(CxL2), C147188nY.A10(r3, new C114426tH(i5), valueOf, 1618982084));
            AnonymousClass7W3 r6 = (AnonymousClass7W3) r3;
            Object A13 = r6.A13();
            if (A12 || A13 == AnonymousClass7GN.A00) {
                A13 = new C138588Ib(i5, CxL, CxL2);
                r6.A14(A13);
            }
            AnonymousClass0YY A0A = AnonymousClass7W3.A0A(r6, A13, false);
            boolean A11 = C147188nY.A11(r3, Boolean.valueOf(z2), C147188nY.A0z(r3, r11, 511388516));
            Object A132 = r6.A13();
            if (A11 || A132 == AnonymousClass7GN.A00) {
                A132 = new KtLambdaShape5S0110000_I2(19, r11, z2);
                r6.A14(A132);
            }
            C1191773v.A00(r3, (Modifier) null, A0A, AnonymousClass7W3.A0A(r6, A132, false), 0, 2);
        } else {
            r3.CuJ();
        }
        C147178nW AKE = r3.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new C140088Rw(r11, f4, f3, i5, i8, i6, z2));
        }
    }
}
