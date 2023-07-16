package X;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape0S1203000_I2;
import kotlin.jvm.internal.KtLambdaShape12S0401000_I2;
import kotlin.jvm.internal.KtLambdaShape172S0100000_I2_1;
import kotlin.jvm.internal.KtLambdaShape18S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape1S0211000_I2;
import kotlin.jvm.internal.KtLambdaShape1S1302000_I2;
import kotlin.jvm.internal.KtLambdaShape3S0002000_I2;
import kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56;

/* renamed from: X.7Iu  reason: invalid class name and case insensitive filesystem */
public final class C121917Iu {
    public static final void A00(LazyListState lazyListState, C147188nY r24, C883557s r25, AnonymousClass0YY r26, int i) {
        LazyListState lazyListState2 = lazyListState;
        C883557s r2 = r25;
        boolean A1Z = AnonymousClass0wJ.A1Z(lazyListState2, r2);
        AnonymousClass0YY r1 = r26;
        C04220Ms.A0B(r1, 2);
        C147188nY r13 = r24;
        r13.Cvd(-1056209562);
        C81784oM A01 = AnonymousClass7Aj.A01(r13, r2.A06);
        AnonymousClass7W3 A0Y = C147188nY.A0Y(r13);
        Object A13 = A0Y.A13();
        Object obj = AnonymousClass7GN.A00;
        if (A13 == obj) {
            A13 = AnonymousClass7WR.A00(A0Y, false);
        }
        AnonymousClass7W3.A0w(A0Y, false);
        C81784oM r3 = (C81784oM) A13;
        int i2 = i;
        C115696vl.A01((C142708fS) null, (C145058jl) null, (C145068jm) null, lazyListState2, r13, (C142878fk) null, (Modifier) null, new KtLambdaShape12S0401000_I2(r1, A01, r2, r3, i2, 2), ((i2 << 3) & 112) | 12582912, 125, false, A1Z);
        r13.Cvb(1933695377);
        if (C86104wH.A1X(r3)) {
            String str = r2.A01;
            boolean A0y = C147188nY.A0y(r13, r3);
            Object A132 = A0Y.A13();
            if (A0y || A132 == obj) {
                A132 = AnonymousClass7W3.A0P(A0Y, r3, 44);
            }
            C101726Sj.A00(r13, str, AnonymousClass7W3.A09(A0Y, A132, false), new KtLambdaShape76S0100000_I2_56(r2, 45), 0);
        }
        if (((KtCSuperShape0S0210000_I2) AnonymousClass7W3.A06(A0Y, A01)).A00 == AnonymousClass006.A01) {
            C101236Qk.A00(r13, AnonymousClass7JS.A01(r13, 2131832819), 0, 0);
        }
        C147178nW AKE = r13.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape18S0301000_I2(i2, 27, r1, lazyListState2, r2));
        }
    }

    public static void A01(C147188nY r7, Modifier modifier, String str, AnonymousClass0ZU r10) {
        A03(r7, modifier, str, r10, (AnonymousClass0YM) null, 6, 8);
    }

    public static final void A02(C147188nY r10, Modifier modifier, String str, AnonymousClass0ZU r13, int i, int i2, int i3) {
        int i4;
        int i5 = i;
        r10.Cvd(-1493997497);
        int i6 = i3;
        Modifier modifier2 = modifier;
        int i7 = i2;
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = C147188nY.A0F(r10, modifier) | i2;
        } else {
            i4 = i2;
        }
        String str2 = str;
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= C147188nY.A0G(r10, str);
        }
        AnonymousClass0ZU r5 = r13;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= C147188nY.A0B(r10, r13);
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            int i9 = 1024;
            if (r10.ACW(i)) {
                i9 = 2048;
            }
            i4 |= i9;
        }
        if ((i4 & 5851) != 1170 || !r10.BCM()) {
            if (i8 != 0) {
                i5 = 0;
            }
            A03(r10, modifier, str, r13, AnonymousClass7JR.A00(r10, new KtLambdaShape3S0002000_I2(i5, i4, 1), -1413406658), C86154wM.A02(i4, (i4 & 14) | 3072), 0);
        } else {
            r10.CuJ();
        }
        C147178nW AKE = r10.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S1203000_I2(modifier2, r5, str2, i5, i7, i6, 3));
        }
    }

    public static final void A03(C147188nY r29, Modifier modifier, String str, AnonymousClass0ZU r32, AnonymousClass0YM r33, int i, int i2) {
        int i3;
        AnonymousClass0YM r5 = r33;
        C147188nY r15 = r29;
        r15.Cvd(868046384);
        int i4 = i2;
        Modifier modifier2 = modifier;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r15, modifier2) | i;
        } else {
            i3 = i5;
        }
        String str2 = str;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r15, str2);
        }
        AnonymousClass0ZU r7 = r32;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0B(r15, r7);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0C(r15, r5);
        }
        if ((i3 & 5851) != 1170 || !r15.BCM()) {
            if (i6 != 0) {
                r5 = null;
            }
            float f = (float) 0;
            Modifier A04 = AnonymousClass7K4.A04(AnonymousClass7Kq.A07(AnonymousClass7HZ.A03(modifier2, r7, false), AnonymousClass6YV.A00), AnonymousClass6FH.A00(r15, R.dimen.abc_floating_window_z), f);
            C146288ly A0g = C147188nY.A0g(r15, AnonymousClass7KV.A04);
            Object A0p = C147188nY.A0p(r15);
            Object A0n = C147188nY.A0n(r15);
            Object A0m = C147188nY.A0m(r15);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A04);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r15;
            C147188nY.A0w(r15, r2, r1);
            AnonymousClass7W3.A0a(r15, r2, A0g, A0p);
            AnonymousClass7KP.A07(r15, A0n, A0m, A00);
            AnonymousClass7VA r12 = AnonymousClass7VA.A00;
            AnonymousClass7I9.A02(r15, r12.DB5(AnonymousClass7K4.A04(Modifier.A02(r15, -1357303220), f, AnonymousClass6FH.A00(r15, R.dimen.account_section_text_margin_horizontal)), 1.0f, true), AnonymousClass7J9.A03(r15), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str2, 0, 0, 0, (i3 >> 3) & 14, 0, 2044, 0, 0, false);
            if (r5 != null) {
                C86104wH.A1R(r12, r15, r5, ((i3 >> 6) & 112) | 6);
            }
            AnonymousClass7W3.A0v(r2, true);
        } else {
            r15.CuJ();
        }
        C147178nW AKE = r15.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S1302000_I2(modifier2, r7, r5, str2, i5, i4, 7));
        }
    }

    public static final void A04(C147188nY r9, Modifier modifier, AnonymousClass0ZU r11, int i) {
        int i2;
        C147188nY r5 = r9;
        r9.Cvd(-2033155770);
        Modifier modifier2 = modifier;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r9, modifier) | i;
        } else {
            i2 = i;
        }
        AnonymousClass0ZU r8 = r11;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r9, r11);
        }
        if ((i2 & 91) != 18 || !r9.BCM()) {
            Context A0T = C147188nY.A0T(r9);
            AnonymousClass7W3 A0Y = C147188nY.A0Y(r9);
            Object A13 = A0Y.A13();
            if (A13 == AnonymousClass7GN.A00) {
                C04220Ms.A0B(A0T, 0);
                A13 = C18742Ake.A00(A0T, R.drawable.instagram_star_pano_filled_24);
                A0Y.A14(A13);
            }
            AnonymousClass7W3.A0w(A0Y, false);
            A03(r5, modifier2, AnonymousClass7JS.A01(r9, 2131834664), r8, AnonymousClass7JR.A00(r9, new KtLambdaShape172S0100000_I2_1(A13, 0), -2138003601), (i2 & 14) | 3072 | ((i2 << 3) & 896), 0);
        } else {
            r9.CuJ();
        }
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, modifier2, r8, i, 28);
        }
    }

    public static final void A05(C147188nY r11, Modifier modifier, AnonymousClass0ZU r13, int i, boolean z) {
        int i2;
        C147188nY r3 = r11;
        r11.Cvd(564392400);
        int i3 = i;
        Modifier modifier2 = modifier;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r11, modifier) | i;
        } else {
            i2 = i;
        }
        boolean z2 = z;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0M(r11, z);
        }
        AnonymousClass0ZU r6 = r13;
        if ((i & 896) == 0) {
            i2 |= C147188nY.A0B(r11, r13);
        }
        if ((i2 & 731) != 146 || !r11.BCM()) {
            int i4 = 2131821132;
            if (z) {
                i4 = 2131828036;
            }
            A03(r3, modifier2, AnonymousClass7JS.A01(r11, i4), r6, C103246Yj.A00, (i2 & 14) | 3072 | (i2 & 896), 0);
        } else {
            r11.CuJ();
        }
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S0211000_I2(modifier2, r13, i3, 7, z2));
        }
    }
}
