package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.jvm.internal.IDxRImplShape182S0000000_2_I2;
import kotlin.jvm.internal.KtLambdaShape2S0100001_I2;
import kotlin.jvm.internal.KtLambdaShape46S0200000_I2_7;

/* renamed from: X.7I0  reason: invalid class name */
public final class AnonymousClass7I0 {
    public static final void A00(C147188nY r8, int i) {
        r8.Cvd(1058621099);
        if (i != 0 || !r8.BCM()) {
            C123327Wm A01 = Modifier.A01(r8);
            C146288ly A00 = C120767Cj.A00(r8, AnonymousClass7KV.A0E, false);
            Object A0p = C147188nY.A0p(r8);
            Object A0n = C147188nY.A0n(r8);
            Object A0m = C147188nY.A0m(r8);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A01);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r8;
            C147188nY.A0w(r8, r2, r1);
            AnonymousClass7W3.A0a(r8, r2, A00, A0p);
            AnonymousClass7KP.A07(r8, A0n, A0m, A002);
            AnonymousClass7KV.A08(AnonymousClass7V3.A00, r8, A01, -1807363919);
            AnonymousClass7W3.A0f(r2);
        } else {
            r8.CuJ();
        }
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            C147178nW.A00(AKE, i, 14);
        }
    }

    public static final void A01(C147188nY r41, Modifier modifier, ImageUrl imageUrl, String str, String str2, int i) {
        int i2;
        C147188nY r0 = r41;
        r0.Cvd(-699970353);
        int i3 = i;
        ImageUrl imageUrl2 = imageUrl;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r0, imageUrl2) | i;
        } else {
            i2 = i3;
        }
        String str3 = str;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r0, str3);
        }
        String str4 = str2;
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0H(r0, str4);
        }
        if ((i3 & 7168) == 0) {
            i2 |= C147188nY.A0I(r0, modifier);
        }
        if ((i2 & 5851) != 1170 || !r0.BCM()) {
            Modifier A06 = AnonymousClass7K4.A06(modifier, (float) 12, 4);
            C146288ly A0g = C147188nY.A0g(r0, AnonymousClass7KV.A04);
            AnonymousClass534 A0a = C147188nY.A0a(r0);
            Object AEA = r0.AEA(A0a);
            AnonymousClass534 r8 = AnonymousClass7DE.A07;
            Object AEA2 = r0.AEA(r8);
            AnonymousClass534 r7 = AnonymousClass7DE.A0B;
            Object AEA3 = r0.AEA(r7);
            AnonymousClass0ZU r21 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A06);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r0;
            C147188nY.A0w(r0, r2, r21);
            r2.A0T = false;
            AnonymousClass0YP r15 = AnonymousClass74X.A03;
            AnonymousClass0YP A002 = AnonymousClass7Ak.A00(r0, A0g, AEA, r15);
            AnonymousClass0YP r14 = AnonymousClass74X.A02;
            AnonymousClass0YP A01 = AnonymousClass7Ak.A01(r0, AEA2, r14);
            Integer A05 = AnonymousClass7KP.A05(r0, AEA3, A01, A00);
            AnonymousClass7VA A0W = C147188nY.A0W(r0);
            r0.Cvb(1616343787);
            C147188nY r23 = r0;
            C115286uo A02 = C120577Bm.A02(r23, imageUrl2, (AnonymousClass0ZU) null, 6, 0);
            String A012 = AnonymousClass7JS.A01(r0, 2131832482);
            C146878n1 r28 = AnonymousClass74L.A00;
            C123327Wm r4 = Modifier.A00;
            C97846Dc.A00(r23, (Alignment) null, C115826vy.A01(AnonymousClass7Kq.A0F(r4, 56), AnonymousClass7G5.A00((float) 6)), (C104136bI) null, A02, r28, A012, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 24584, 104);
            C147268p4 r11 = AnonymousClass7J3.A02;
            float f = (float) 0;
            Modifier DB5 = A0W.DB5(AnonymousClass7K4.A05(r4, (float) 8, f, f, f), 1.0f, true);
            C146288ly A03 = AnonymousClass7KV.A03(r11, r0);
            Object A0s = C147188nY.A0s(r0, A0a);
            Object AEA4 = r0.AEA(r8);
            Object AEA5 = r0.AEA(r7);
            AnonymousClass0YM A003 = C98236Es.A00(DB5);
            C147188nY.A0w(r0, r2, r21);
            r2.A0T = false;
            AnonymousClass7Ak.A02(r0, A03, r15);
            AnonymousClass7Ak.A02(r0, A0s, A002);
            AnonymousClass7Ak.A02(r0, AEA4, r14);
            AnonymousClass7KP.A06(r0, AEA5, A05, A01, A003);
            C147188nY r212 = r0;
            String str5 = str3;
            AnonymousClass7I9.A02(r212, (Modifier) null, AnonymousClass7J9.A04(r0), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str5, 0, 1, 2, ((i2 >> 3) & 14) | 805306368, 6, 506, C120537Bh.A01(r0, -1853830731).A0h, 0, false);
            String str6 = str4;
            AnonymousClass7I9.A02(r212, (Modifier) null, AnonymousClass7J9.A02(r0), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str6, 0, 1, 2, ((i2 >> 6) & 14) | 805306368, 6, 506, AnonymousClass7KB.A03(r0), 0, false);
            AnonymousClass7W3.A0v(r2, true);
            A02(r0, C969167e.PLAY, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 54, 0);
            AnonymousClass7W3.A0v(r2, true);
        } else {
            r0.CuJ();
        }
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8RM(modifier, imageUrl2, str3, str4, i3));
        }
    }

    public static final void A02(C147188nY r8, C969167e r9, float f, int i, int i2) {
        int i3;
        C147188nY r3 = r8;
        r8.Cvd(91704752);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r8, r9) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A01(r8, f);
        }
        if ((i3 & 91) != 18 || !r8.BCM()) {
            if (i4 != 0) {
                r9 = C969167e.PLAY;
            }
            Modifier A0A = AnonymousClass7Kq.A0A(Modifier.A00, (float) 44);
            AnonymousClass8QH r5 = AnonymousClass8QH.A00;
            boolean A11 = C147188nY.A11(r8, Float.valueOf(f), C147188nY.A0z(r8, r9, 511388516));
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r3;
            Object A13 = r2.A13();
            if (A11 || A13 == AnonymousClass7GN.A00) {
                A13 = new KtLambdaShape2S0100001_I2(r9, f, 9);
                r2.A14(A13);
            }
            C1191773v.A00(r3, A0A, r5, AnonymousClass7W3.A0B(r2, A13, false), 54, 0);
        } else {
            r8.CuJ();
        }
        C147178nW AKE = r3.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8R8(r9, f, i, i2));
        }
    }

    public static final void A03(C147188nY r19, C149708ub r20, AnonymousClass0YY r21, int i) {
        C147188nY r12 = r19;
        r12.Cvd(657320292);
        C149708ub r3 = r20;
        C1197176o A00 = C120797Cn.A00(r12, r3.A03);
        int size = ((AnonymousClass83X) A00.A00.getValue()).size();
        C115226ui r6 = (C115226ui) A00.A01.getValue();
        C104236bS r4 = r6.A01;
        AnonymousClass0YY r2 = r21;
        if (r4 instanceof AnonymousClass59I) {
            r12.Cvb(-1862539560);
            A04(r12, new IDxRImplShape182S0000000_2_I2(r3, 12), 0);
        } else if ((r4 instanceof AnonymousClass59J) && size == 0) {
            r12.Cvb(-1862539432);
            A00(r12, 0);
        } else if (!(r4 instanceof AnonymousClass59K) || !r6.A00.A00 || size != 0) {
            r12.Cvb(-1862538993);
            C115696vl.A01((C142708fS) null, (C145058jl) null, (C145068jm) null, (LazyListState) null, r12, (C142878fk) null, (Modifier) null, new KtLambdaShape46S0200000_I2_7(11, r2, A00), 12582912, StringTreeSet.MAX_SYMBOL_COUNT, false, true);
        } else {
            r12.Cvb(-1862539280);
            AnonymousClass6QZ.A00(r12, new C132797uW(AnonymousClass6QP.A00(r12, R.drawable.empty_state_save), (float) 96), (AnonymousClass670) null, AnonymousClass7JS.A01(r12, 2131831511), AnonymousClass7JS.A01(r12, 2131831509), (String) null, (String) null, (AnonymousClass0ZU) null, 64, 113);
        }
        AnonymousClass7W3.A0z(r12, false);
        C147178nW AKE = r12.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, r2, r3, i, 39);
        }
    }

    public static final void A04(C147188nY r12, AnonymousClass0ZU r13, int i) {
        int i2;
        r12.Cvd(-177287549);
        AnonymousClass0ZU r10 = r13;
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r12, r13) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r12.BCM()) {
            C123327Wm A01 = Modifier.A01(r12);
            C146288ly A00 = C120767Cj.A00(r12, AnonymousClass7KV.A0E, false);
            Object A0p = C147188nY.A0p(r12);
            Object A0n = C147188nY.A0n(r12);
            Object A0m = C147188nY.A0m(r12);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A01);
            AnonymousClass7W3 r3 = (AnonymousClass7W3) r12;
            C147188nY.A0w(r12, r3, r1);
            AnonymousClass7W3.A0a(r12, r3, A00, A0p);
            AnonymousClass7KP.A07(r12, A0n, A0m, A002);
            AnonymousClass7V3 r4 = AnonymousClass7V3.A00;
            r12.Cvb(-2009460291);
            Object A012 = AnonymousClass7GN.A01(r3, C147188nY.A0r(r12, r3, -492369756));
            AnonymousClass7W3.A0w(r3, false);
            C147258p3 r6 = (C147258p3) A012;
            boolean A1X = C86104wH.A1X(C97866Dg.A00(r6, r12));
            int i3 = R.drawable.loadmore_icon_refresh;
            if (A1X) {
                i3 = R.drawable.loadmore_icon_refresh_pressed;
            }
            C86114wI.A17(r12, AnonymousClass7HZ.A00((C142668fO) null, r6, AnonymousClass7KV.A01(r4, A01), (AnonymousClass799) null, (String) null, r10, true), AnonymousClass6QP.A00(r12, i3), AnonymousClass7JS.A01(r12, 2131834950));
            AnonymousClass7W3.A0v(r3, true);
        } else {
            r12.CuJ();
        }
        C147178nW AKE = r12.AKE();
        if (AKE != null) {
            C147178nW.A01(AKE, r13, i, 17);
        }
    }
}
