package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape9S0100000_I2;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.jvm.internal.KtLambdaShape0S1602000_I2;
import kotlin.jvm.internal.KtLambdaShape160S0100000_I2_15;
import kotlin.jvm.internal.KtLambdaShape1S1501000_I2;
import kotlin.jvm.internal.KtLambdaShape3S0311000_I2;
import kotlin.jvm.internal.KtLambdaShape88S0100000_I2_68;

/* renamed from: X.7Kb  reason: invalid class name and case insensitive filesystem */
public final class C122087Kb {
    public static final void A03(C147188nY r32, Modifier modifier, KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I2, KtCSuperShape0S2010000_I2 ktCSuperShape0S2010000_I2, AnonymousClass8f7 r36, C28032ExM exM, String str, AnonymousClass0YY r39, int i, int i2) {
        KtCSuperShape0S2010000_I2 ktCSuperShape0S2010000_I22 = ktCSuperShape0S2010000_I2;
        String str2 = str;
        KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I22 = ktCSuperShape0S0210000_I2;
        C28032ExM exM2 = exM;
        boolean A1Z = AnonymousClass0wJ.A1Z(exM2, ktCSuperShape0S0210000_I22);
        AnonymousClass8f7 r4 = r36;
        AnonymousClass0YY r2 = r39;
        C18230wP.A1R(r4, 2, r2);
        C147188nY r12 = r32;
        int i3 = i2;
        Modifier A0d = C147188nY.A0d(r12, modifier, 1120632771, i3);
        if ((i2 & 16) != 0) {
            str2 = null;
        }
        if ((i2 & 32) != 0) {
            ktCSuperShape0S2010000_I22 = null;
        }
        boolean A0y = C147188nY.A0y(r12, r2);
        AnonymousClass7W3 r8 = (AnonymousClass7W3) r12;
        Object A13 = r8.A13();
        if (A0y || A13 == AnonymousClass7GN.A00) {
            A13 = new KtLambdaShape88S0100000_I2_68(r2, 48);
            r8.A14(A13);
        }
        int i4 = i;
        AnonymousClass70T.A00((AnonymousClass79L) null, (C142668fO) null, (C147258p3) null, r12, (Modifier) null, (C142918fo) null, AnonymousClass7W3.A08(r8, A13, false), AnonymousClass7JR.A00(r12, new KtLambdaShape1S1501000_I2(A0d, exM2, r2, r36, ktCSuperShape0S0210000_I22, str2, i4, A1Z ? 1 : 0), 1350632008), 805306368, 510, 0, 0, false);
        C147178nW AKE = r12.AKE();
        if (AKE != null) {
            ((AnonymousClass7WO) AKE).A06 = new KtLambdaShape0S1602000_I2(r2, exM2, A0d, ktCSuperShape0S2010000_I22, ktCSuperShape0S0210000_I22, r4, str2, i4, i3, A1Z ? 1 : 0);
        }
    }

    public static final Modifier A00(C147188nY r4) {
        float f = (float) 0;
        Modifier A05 = AnonymousClass7K4.A05(Modifier.A02(r4, -1835126161).Cx6(AnonymousClass7Kq.A00), (float) 12, f, f, f);
        AnonymousClass7W3.A0z(r4, false);
        return A05;
    }

    public static final void A01(C147188nY r14, int i) {
        C147188nY r8 = r14;
        r14.Cvd(969225915);
        int i2 = i;
        if (i != 0 || !r14.BCM()) {
            Modifier A00 = A00(r14);
            C146288ly A0g = C147188nY.A0g(r14, AnonymousClass7KV.A04);
            Object A0p = C147188nY.A0p(r14);
            Object A0n = C147188nY.A0n(r14);
            Object A0m = C147188nY.A0m(r14);
            AnonymousClass0ZU r3 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A00);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r8;
            C147188nY.A0w(r14, r1, r3);
            AnonymousClass7W3.A0a(r14, r1, A0g, A0p);
            AnonymousClass7KP.A07(r14, A0n, A0m, A002);
            r14.Cvb(-228823777);
            C115286uo A003 = AnonymousClass6QP.A00(r14, R.drawable.blue_dot_medium);
            C123327Wm r5 = Modifier.A00;
            float f = (float) 0;
            float f2 = (float) 8;
            C1190173e.A00(r8, AnonymousClass7Kq.A09(AnonymousClass7K4.A05(r5, (float) 12, f, f, f), f2), A003, (String) null, 440, 0, C120537Bh.A00(r14).A0U);
            C1190173e.A00(r8, AnonymousClass7Kq.A0F(AnonymousClass7K4.A05(r5, f2, f, f, f), 16), AnonymousClass6QP.A00(r8, R.drawable.instagram_chevron_right_pano_outline_16), (String) null, 440, 0, C120537Bh.A00(r8).A0l);
            AnonymousClass7W3.A0f(r1);
        } else {
            r14.CuJ();
        }
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            C147178nW.A00(AKE, i2, 8);
        }
    }

    public static final void A02(C147188nY r8, int i) {
        r8.Cvd(1937671358);
        if (i != 0 || !r8.BCM()) {
            Modifier A00 = A00(r8);
            C146288ly A0h = C147188nY.A0h(r8, AnonymousClass7KV.A0B);
            Object A0p = C147188nY.A0p(r8);
            Object A0n = C147188nY.A0n(r8);
            Object A0m = C147188nY.A0m(r8);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A00);
            AnonymousClass7W3 r4 = (AnonymousClass7W3) r8;
            C147188nY.A0w(r8, r4, r1);
            AnonymousClass7W3.A0a(r8, r4, A0h, A0p);
            AnonymousClass7KP.A07(r8, A0n, A0m, A002);
            r8.Cvb(1081691896);
            float f = (float) 0;
            AnonymousClass7KB.A06(r8, AnonymousClass7Kq.A0F(AnonymousClass7K4.A05(Modifier.A00, (float) 8, f, f, f), 16), AnonymousClass6QP.A00(r8, R.drawable.instagram_chevron_right_pano_outline_16));
            AnonymousClass7W3.A0f(r4);
        } else {
            r8.CuJ();
        }
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            C147178nW.A00(AKE, i, 9);
        }
    }

    public static final void A04(C147188nY r18, ImageUrl imageUrl, ImageUrl imageUrl2, AnonymousClass0YY r21, int i, boolean z) {
        int i2;
        boolean z2;
        AnonymousClass7W3 r7;
        C147188nY r9 = r18;
        r9.Cvd(1519747538);
        int i3 = i;
        ImageUrl imageUrl3 = imageUrl;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r9, imageUrl3) | i;
        } else {
            i2 = i3;
        }
        ImageUrl imageUrl4 = imageUrl2;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r9, imageUrl4);
        }
        boolean z3 = z;
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0N(r9, z3);
        }
        AnonymousClass0YY r1 = r21;
        if ((i3 & 7168) == 0) {
            i2 |= C147188nY.A0C(r9, r1);
        }
        if ((i2 & 5851) != 1170 || !r9.BCM()) {
            if (imageUrl2 != null) {
                r9.Cvb(-1392064002);
                C147188nY r12 = r9;
                z2 = false;
                AnonymousClass7Bl.A01(r12, C120577Bm.A02(r12, imageUrl3, (AnonymousClass0ZU) null, 6, 0), C120577Bm.A02(r18, imageUrl4, (AnonymousClass0ZU) null, 6, 0), (float) 44, (float) 1, 0.72727275f, 28230, 32, false);
                r7 = (AnonymousClass7W3) r9;
            } else {
                r9.Cvb(-1392063688);
                float f = (float) 52;
                float f2 = (float) 44;
                z2 = false;
                boolean A0y = C147188nY.A0y(r9, r1);
                r7 = (AnonymousClass7W3) r9;
                Object A13 = r7.A13();
                if (A0y || A13 == AnonymousClass7GN.A00) {
                    A13 = new KtLambdaShape160S0100000_I2_15(r1, 31);
                    r7.A14(A13);
                }
                C120547Bi.A02(r9, (Modifier) null, imageUrl3, AnonymousClass7W3.A0A(r7, A13, false), f, f2, (i2 & 14) | 432 | ((i2 << 6) & 57344), 40, z3, false);
            }
            AnonymousClass7W3.A0w(r7, z2);
        } else {
            r9.CuJ();
        }
        C147178nW AKE = r9.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S0311000_I2(imageUrl4, r1, imageUrl3, i3, 2, z3));
        }
    }

    public static final void A05(C147188nY r18, ImageUrl imageUrl, AnonymousClass0YY r20, int i) {
        int i2;
        C147188nY r12 = r18;
        r12.Cvd(269222815);
        int i3 = i;
        ImageUrl imageUrl2 = imageUrl;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r12, imageUrl2) | i;
        } else {
            i2 = i3;
        }
        AnonymousClass0YY r4 = r20;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r12, r4);
        }
        if ((i2 & 91) != 18 || !r12.BCM()) {
            Modifier A00 = A00(r12);
            Alignment alignment = AnonymousClass7KV.A0B;
            r12.Cvb(733328855);
            C146288ly A002 = C120767Cj.A00(r12, alignment, false);
            AnonymousClass534 A0a = C147188nY.A0a(r12);
            Object AEA = r12.AEA(A0a);
            Object A0n = C147188nY.A0n(r12);
            Object A0m = C147188nY.A0m(r12);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A003 = C98236Es.A00(A00);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r12;
            C147188nY.A0w(r12, r2, r1);
            AnonymousClass7W3.A0a(r12, r2, A002, AEA);
            AnonymousClass7KP.A07(r12, A0n, A0m, A003);
            r12.Cvb(-122742311);
            C115286uo A02 = C120577Bm.A02(r12, imageUrl2, (AnonymousClass0ZU) null, 6, 0);
            float CxD = C147188nY.A0k(r12, A0a).CxD(0.5f);
            Modifier A0F = AnonymousClass7Kq.A0F(AnonymousClass7K4.A04(Modifier.A00, (float) 0, (float) 8), 44);
            boolean A0y = C147188nY.A0y(r12, r4);
            Object A13 = r2.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = new KtLambdaShape88S0100000_I2_68(r4, 43);
                r2.A14(A13);
            }
            C97846Dc.A00(r12, (Alignment) null, AnonymousClass7Ac.A02(AnonymousClass7HZ.A03(A0F, AnonymousClass7W3.A08(r2, A13, false), false), C102746Wj.A00, CxD, C120537Bh.A00(r12).A0s), (C104136bI) null, A02, AnonymousClass74L.A00, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 24632, 104);
            AnonymousClass7W3.A0f(r2);
        } else {
            r12.CuJ();
        }
        C147178nW AKE = r12.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, imageUrl2, r4, i3, 34);
        }
    }

    public static final void A06(C147188nY r5, AnonymousClass8f7 r6, AnonymousClass0YY r7, int i) {
        r5.Cvd(1637598655);
        if (r6 instanceof C133767wL) {
            r5.Cvb(-536351889);
            A01(r5, 0);
        } else if (r6 instanceof C133777wM) {
            r5.Cvb(-536351835);
            A02(r5, 0);
        } else if (KtCSuperShape9S0100000_I2.A00(0, r6)) {
            r5.Cvb(-536351773);
            boolean A0z = C147188nY.A0z(r5, r7, 1157296644);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r5;
            Object A13 = r2.A13();
            if (A0z || A13 == AnonymousClass7GN.A00) {
                A13 = new KtLambdaShape160S0100000_I2_15(r7, 32);
                r2.A14(A13);
            }
            A09(r5, AnonymousClass7W3.A0B(r2, A13, false), 0);
        } else if (KtCSuperShape9S0100000_I2.A00(1, r6)) {
            r5.Cvb(-536351664);
            ImageUrl imageUrl = (ImageUrl) ((KtCSuperShape9S0100000_I2) r6).A00;
            boolean A0z2 = C147188nY.A0z(r5, r7, 1157296644);
            AnonymousClass7W3 r22 = (AnonymousClass7W3) r5;
            Object A132 = r22.A13();
            if (A0z2 || A132 == AnonymousClass7GN.A00) {
                A132 = new KtLambdaShape160S0100000_I2_15(r7, 33);
                r22.A14(A132);
            }
            A05(r5, imageUrl, AnonymousClass7W3.A0B(r22, A132, false), 0);
        } else if (r6 instanceof C90635Mu) {
            r5.Cvb(-536351507);
            String str = ((C90635Mu) r6).A00;
            boolean A0z3 = C147188nY.A0z(r5, r7, 1157296644);
            AnonymousClass7W3 r23 = (AnonymousClass7W3) r5;
            Object A133 = r23.A13();
            if (A0z3 || A133 == AnonymousClass7GN.A00) {
                A133 = new KtLambdaShape160S0100000_I2_15(r7, 34);
                r23.A14(A133);
            }
            A08(r5, str, AnonymousClass7W3.A0B(r23, A133, false), 0);
        } else if (r6 instanceof C90645Mv) {
            r5.Cvb(-536351329);
            int i2 = ((C90645Mv) r6).A00;
            boolean A0z4 = C147188nY.A0z(r5, r7, 1157296644);
            AnonymousClass7W3 r24 = (AnonymousClass7W3) r5;
            Object A134 = r24.A13();
            if (A0z4 || A134 == AnonymousClass7GN.A00) {
                A134 = new KtLambdaShape160S0100000_I2_15(r7, 35);
                r24.A14(A134);
            }
            A0B(r5, AnonymousClass7W3.A0B(r24, A134, false), i2, 0);
        } else if (r6 instanceof C133797wO) {
            r5.Cvb(-536351150);
            boolean A0z5 = C147188nY.A0z(r5, r7, 1157296644);
            AnonymousClass7W3 r25 = (AnonymousClass7W3) r5;
            Object A135 = r25.A13();
            if (A0z5 || A135 == AnonymousClass7GN.A00) {
                A135 = new KtLambdaShape160S0100000_I2_15(r7, 36);
                r25.A14(A135);
            }
            A0A(r5, AnonymousClass7W3.A0B(r25, A135, false), 0);
        } else {
            int i3 = -536351050;
            if (r6 instanceof C133787wN) {
                i3 = -536351058;
            }
            r5.Cvb(i3);
        }
        AnonymousClass7W3.A0z(r5, false);
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, r6, r7, i, 33);
        }
    }

    public static final void A07(C147188nY r16, C28032ExM exM, AnonymousClass0YY r18, int i) {
        C147188nY r10 = r16;
        r10.Cvd(-1622609429);
        C123327Wm r7 = Modifier.A00;
        Modifier A0F = AnonymousClass7Kq.A0F(r7, 60);
        Alignment alignment = AnonymousClass7KV.A09;
        r10.Cvb(733328855);
        C146288ly A00 = C120767Cj.A00(r10, alignment, false);
        AnonymousClass534 A0a = C147188nY.A0a(r10);
        Object AEA = r10.AEA(A0a);
        Object A0n = C147188nY.A0n(r10);
        Object A0m = C147188nY.A0m(r10);
        AnonymousClass0ZU r4 = AnonymousClass74X.A00;
        AnonymousClass0YM A002 = C98236Es.A00(A0F);
        AnonymousClass7W3 r2 = (AnonymousClass7W3) r10;
        C147188nY.A0w(r10, r2, r4);
        AnonymousClass7W3.A0a(r10, r2, A00, AEA);
        AnonymousClass7KP.A07(r10, A0n, A0m, A002);
        r10.Cvb(-888626447);
        C28032ExM exM2 = exM;
        AnonymousClass0YY r5 = r18;
        int i2 = i;
        if (exM2 instanceof C90665My) {
            r10.Cvb(1729638734);
            C90665My r0 = (C90665My) exM2;
            A04(r10, r0.A01, r0.A00, r5, (i << 6) & 7168, r0.A03);
        } else if (exM2 instanceof C90655Mx) {
            r10.Cvb(1729638938);
            C115286uo A003 = AnonymousClass6QP.A00(r10, ((C90655Mx) exM2).A00);
            float CxD = C147188nY.A0k(r10, A0a).CxD(0.5f);
            Modifier A0F2 = AnonymousClass7Kq.A0F(AnonymousClass7K4.A04(r7, (float) 0, (float) 4), 44);
            C874352s r8 = AnonymousClass7G5.A00;
            Modifier A01 = C115826vy.A01(A0F2, r8);
            boolean A0y = C147188nY.A0y(r10, r5);
            Object A13 = r2.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = new KtLambdaShape88S0100000_I2_68(r5, 49);
                r2.A14(A13);
            }
            C97846Dc.A00(r10, (Alignment) null, AnonymousClass7Ac.A01(AnonymousClass79L.A00(CxD, C120537Bh.A00(r10).A0s), AnonymousClass7HZ.A03(A01, AnonymousClass7W3.A08(r2, A13, false), false), r8), C115866w2.A01(C120537Bh.A00(r10).A0g), A003, AnonymousClass74L.A02, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 24632, 40);
        } else {
            r10.Cvb(1729639595);
        }
        AnonymousClass7W3.A0w(r2, false);
        AnonymousClass7W3.A0f(r2);
        C147178nW AKE = r10.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, r5, exM2, i2, 35);
        }
    }

    public static final void A08(C147188nY r19, String str, AnonymousClass0YY r21, int i) {
        int i2;
        C147188nY r13 = r19;
        r13.Cvd(995815171);
        int i3 = i;
        String str2 = str;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r13, str2) | i;
        } else {
            i2 = i3;
        }
        AnonymousClass0YY r3 = r21;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r13, r3);
        }
        if ((i2 & 91) != 18 || !r13.BCM()) {
            Modifier A00 = A00(r13);
            C146288ly A0h = C147188nY.A0h(r13, AnonymousClass7KV.A0B);
            Object A0p = C147188nY.A0p(r13);
            Object A0n = C147188nY.A0n(r13);
            Object A0m = C147188nY.A0m(r13);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A00);
            AnonymousClass7W3 r5 = (AnonymousClass7W3) r13;
            C147188nY.A0w(r13, r5, r1);
            AnonymousClass7W3.A0a(r13, r5, A0h, A0p);
            AnonymousClass7KP.A07(r13, A0n, A0m, A002);
            r13.Cvb(-1560350275);
            boolean A0y = C147188nY.A0y(r13, r3);
            Object A13 = r5.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = new KtLambdaShape88S0100000_I2_68(r3, 44);
                r5.A14(A13);
            }
            String str3 = str2;
            AnonymousClass70P.A00((C147258p3) null, r13, (Modifier) null, (C968666z) null, AnonymousClass70Q.A00(r13), str3, AnonymousClass7W3.A08(r5, A13, false), (i2 << 3) & 112, 220, false, false);
            AnonymousClass7W3.A0f(r5);
        } else {
            r13.CuJ();
        }
        C147178nW AKE = r13.AKE();
        if (AKE != null) {
            C147178nW.A06(AKE, r3, str2, i3, 8);
        }
    }

    public static final void A09(C147188nY r14, AnonymousClass0YY r15, int i) {
        int i2;
        C147188nY r10 = r14;
        r14.Cvd(1111964997);
        int i3 = i;
        AnonymousClass0YY r3 = r15;
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r14, r15) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !r14.BCM()) {
            Modifier A00 = A00(r14);
            C146288ly A0h = C147188nY.A0h(r14, AnonymousClass7KV.A0B);
            Object A0p = C147188nY.A0p(r14);
            Object A0n = C147188nY.A0n(r14);
            Object A0m = C147188nY.A0m(r14);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A00);
            AnonymousClass7W3 r4 = (AnonymousClass7W3) r10;
            C147188nY.A0w(r14, r4, r1);
            AnonymousClass7W3.A0a(r14, r4, A0h, A0p);
            AnonymousClass7KP.A07(r14, A0n, A0m, A002);
            r14.Cvb(1330551295);
            AnonymousClass68N r12 = AnonymousClass68N.FOLLOW;
            float f = (float) 0;
            Modifier A05 = AnonymousClass7K4.A05(Modifier.A00, (float) 8, f, f, f);
            boolean A0y = C147188nY.A0y(r14, r15);
            Object A13 = r4.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = new KtLambdaShape88S0100000_I2_68(r15, 42);
                r4.A14(A13);
            }
            C101266Qn.A00(r10, A05, r12, (C303220o) null, AnonymousClass7W3.A09(r4, A13, false), 54, 4);
            AnonymousClass7W3.A0f(r4);
        } else {
            r14.CuJ();
        }
        C147178nW AKE = r10.AKE();
        if (AKE != null) {
            C147178nW.A01(AKE, r3, i3, 11);
        }
    }

    public static final void A0A(C147188nY r8, AnonymousClass0YY r9, int i) {
        int i2;
        r8.Cvd(-612966280);
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r8, r9) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r8.BCM()) {
            Modifier A00 = A00(r8);
            C146288ly A0h = C147188nY.A0h(r8, AnonymousClass7KV.A0B);
            Object A0p = C147188nY.A0p(r8);
            Object A0n = C147188nY.A0n(r8);
            Object A0m = C147188nY.A0m(r8);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A00);
            AnonymousClass7W3 r5 = (AnonymousClass7W3) r8;
            C147188nY.A0w(r8, r5, r1);
            AnonymousClass7W3.A0a(r8, r5, A0h, A0p);
            AnonymousClass7KP.A07(r8, A0n, A0m, A002);
            r8.Cvb(735811378);
            C115286uo A003 = AnonymousClass6QP.A00(r8, R.drawable.instagram_x_pano_outline_12);
            String A01 = AnonymousClass7JS.A01(r8, 2131826195);
            float f = (float) 0;
            Modifier A05 = AnonymousClass7K4.A05(Modifier.A00, (float) 12, f, f, f);
            boolean A0y = C147188nY.A0y(r8, r9);
            Object A13 = r5.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = new KtLambdaShape88S0100000_I2_68(r9, 47);
                r5.A14(A13);
            }
            AnonymousClass7KB.A07(r8, AnonymousClass7HZ.A03(A05, AnonymousClass7W3.A08(r5, A13, false), false), A003, A01);
            AnonymousClass7W3.A0f(r5);
        } else {
            r8.CuJ();
        }
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            C147178nW.A01(AKE, r9, i, 12);
        }
    }

    public static final void A0B(C147188nY r17, AnonymousClass0YY r18, int i, int i2) {
        int i3;
        C147188nY r11 = r17;
        r11.Cvd(-1859383424);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 14) == 0) {
            i3 = C147188nY.A03(r11, i5) | i2;
        } else {
            i3 = i4;
        }
        AnonymousClass0YY r4 = r18;
        if ((i2 & 112) == 0) {
            i3 |= C147188nY.A0A(r11, r4);
        }
        if ((i3 & 91) != 18 || !r11.BCM()) {
            Modifier A00 = A00(r11);
            C146288ly A0g = C147188nY.A0g(r11, AnonymousClass7KV.A04);
            Object A0p = C147188nY.A0p(r11);
            Object A0n = C147188nY.A0n(r11);
            Object A0m = C147188nY.A0m(r11);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A00);
            AnonymousClass7W3 r5 = (AnonymousClass7W3) r11;
            C147188nY.A0w(r11, r5, r1);
            AnonymousClass7W3.A0a(r11, r5, A0g, A0p);
            AnonymousClass7KP.A07(r11, A0n, A0m, A002);
            r11.Cvb(-478943076);
            boolean A0z = C147188nY.A0z(r11, r4, 1157296644);
            Object A13 = r5.A13();
            if (A0z || A13 == AnonymousClass7GN.A00) {
                A13 = new KtLambdaShape88S0100000_I2_68(r4, 45);
                r5.A14(A13);
            }
            AnonymousClass0ZU A08 = AnonymousClass7W3.A08(r5, A13, false);
            AnonymousClass70P.A00((C147258p3) null, r11, (Modifier) null, (C968666z) null, AnonymousClass70Q.A00(r11), AnonymousClass7JS.A01(r11, i5), A08, 0, 220, false, false);
            C115286uo A003 = AnonymousClass6QP.A00(r11, R.drawable.instagram_x_pano_outline_12);
            String A01 = AnonymousClass7JS.A01(r11, 2131826195);
            float f = (float) 0;
            Modifier A05 = AnonymousClass7K4.A05(Modifier.A00, (float) 12, f, f, f);
            boolean A0z2 = C147188nY.A0z(r11, r4, 1157296644);
            Object A132 = r5.A13();
            if (A0z2 || A132 == AnonymousClass7GN.A00) {
                A132 = new KtLambdaShape88S0100000_I2_68(r4, 46);
                r5.A14(A132);
            }
            AnonymousClass7KB.A07(r11, AnonymousClass7HZ.A03(A05, AnonymousClass7W3.A08(r5, A132, false), false), A003, A01);
            AnonymousClass7W3.A0f(r5);
        } else {
            r11.CuJ();
        }
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            C147178nW.A03(AKE, r4, i5, i4, 13);
        }
    }
}
