package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import kotlin.jvm.internal.KtLambdaShape3S0302000_I2;

/* renamed from: X.6M0  reason: invalid class name */
public final class AnonymousClass6M0 {
    public static final void A00(C147188nY r24, Modifier modifier, AnonymousClass0ZU r26, AnonymousClass0ZU r27, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AnonymousClass0ZU r4 = r26;
        AnonymousClass0ZU r3 = r27;
        boolean A1Z = AnonymousClass0wJ.A1Z(r4, r3);
        C147188nY r5 = r24;
        r5.Cvd(6390730);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r5, r4) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r5, r3);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r5, modifier2);
        }
        if ((i3 & 731) != 146 || !r5.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            int i7 = ((i3 >> 6) & 14) | 48;
            C146288ly A02 = AnonymousClass7KV.A02(AnonymousClass7J3.A01((float) 4), r5);
            Object A0p = C147188nY.A0p(r5);
            Object A0n = C147188nY.A0n(r5);
            Object A0m = C147188nY.A0m(r5);
            AnonymousClass0ZU r9 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(modifier2);
            int A01 = C86114wI.A01((i7 << 3) & 112);
            AnonymousClass7W3 r0 = (AnonymousClass7W3) r5;
            C147188nY.A0w(r5, r0, r9);
            AnonymousClass7W3.A0a(r5, r0, A02, A0p);
            AnonymousClass7KP.A08(r5, A0n, A0m, A00, A01);
            int A05 = C86124wJ.A05(i7);
            r5.Cvb(-1918609362);
            if ((A05 & 81) != 16 || !r5.BCM()) {
                String A012 = AnonymousClass7JS.A01(r5, 2131821871);
                C146458mH A013 = AnonymousClass7BV.A01(r5);
                boolean A0z = C147188nY.A0z(r5, r4, 1157296644);
                Object A13 = r0.A13();
                if (A0z || A13 == AnonymousClass7GN.A00) {
                    A13 = AnonymousClass7W3.A0F(r0, r4, 20);
                }
                C147188nY r17 = r5;
                AnonymousClass6M6.A00((C147258p3) null, r17, (Modifier) null, (C966466d) null, A013, A012, AnonymousClass7W3.A08(r0, A13, false), Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, 220, false, false);
                String A014 = AnonymousClass7JS.A01(r5, 2131821872);
                C146458mH A015 = AnonymousClass7BV.A01(r5);
                boolean A0z2 = C147188nY.A0z(r5, r3, 1157296644);
                Object A132 = r0.A13();
                if (A0z2 || A132 == AnonymousClass7GN.A00) {
                    A132 = AnonymousClass7W3.A0F(r0, r3, 21);
                }
                AnonymousClass6M6.A00((C147258p3) null, r17, (Modifier) null, (C966466d) null, A015, A014, AnonymousClass7W3.A09(r0, A132, false), Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, 220, false, false);
            } else {
                r5.CuJ();
            }
            AnonymousClass7W3.A0v(r0, A1Z);
        } else {
            r5.CuJ();
        }
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S0302000_I2(r3, r4, modifier2, i5, i4, 6));
        }
    }
}
