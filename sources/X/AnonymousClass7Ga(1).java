package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;
import kotlin.jvm.internal.KtLambdaShape2S0212000_I2;

/* renamed from: X.7Ga  reason: invalid class name */
public final class AnonymousClass7Ga {
    public static final float A00 = ((float) 2);
    public static final float A01 = ((float) 16);
    public static final float A02 = ((float) 10);
    public static final float A03 = ((float) 20);

    public static final void A00(C147188nY r28, Modifier modifier, AnonymousClass8s2 r30, int i, int i2) {
        int i3;
        AnonymousClass7W3 r1;
        C147178nW AKE;
        int i4;
        Modifier modifier2 = modifier;
        AnonymousClass8s2<ImageUrl> r4 = r30;
        C04220Ms.A0B(r4, 0);
        C147188nY r14 = r28;
        r14.Cvd(-344039711);
        int i5 = i2;
        int i6 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r14, r4) | i;
        } else {
            i3 = i6;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r14, modifier2);
        }
        if ((i3 & 91) != 18 || !r14.BCM()) {
            if (i7 != 0) {
                modifier2 = Modifier.A00;
            }
            if (r4.isEmpty()) {
                AKE = r14.AKE();
                if (AKE != null) {
                    i4 = 16;
                    AnonymousClass7WO.A00(AKE, new KtLambdaShape2S0202000_I2(modifier2, i6, r4, i5, i4));
                }
                return;
            }
            int size = r4.size();
            if (size == 1) {
                r14.Cvb(2096263030);
                int i8 = ((i3 >> 3) & 14) | 48;
                C146288ly A0i = C147188nY.A0i(r14, AnonymousClass7KV.A09);
                Object A0p = C147188nY.A0p(r14);
                Object A0n = C147188nY.A0n(r14);
                Object A0m = C147188nY.A0m(r14);
                r1 = (AnonymousClass7W3) r14;
                C147188nY.A0w(r14, r1, AnonymousClass74X.A00);
                AnonymousClass7W3.A0a(r14, r1, A0i, A0p);
                AnonymousClass7KP.A08(r14, A0n, A0m, C98236Es.A00(modifier2), ((((i8 << 3) & 112) << 9) & 7168) | 6);
                int A05 = C86124wJ.A05(i8);
                r14.Cvb(-1338451805);
                if ((A05 & 81) != 16 || !r14.BCM()) {
                    C97846Dc.A00(r14, (Alignment) null, AnonymousClass7G5.A02(Modifier.A00, (float) 18), (C104136bI) null, C120577Bm.A01(r14, (ImageUrl) r4.get(0)), (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
                }
                r14.CuJ();
            } else if (size != 2) {
                r14.Cvb(2096263650);
                int i9 = ((i3 >> 3) & 14) | 48;
                C146288ly A0i2 = C147188nY.A0i(r14, AnonymousClass7KV.A0E);
                Object A0p2 = C147188nY.A0p(r14);
                Object A0n2 = C147188nY.A0n(r14);
                Object A0m2 = C147188nY.A0m(r14);
                AnonymousClass0ZU r5 = AnonymousClass74X.A00;
                AnonymousClass0YM A002 = C98236Es.A00(modifier2);
                int A012 = C86114wI.A01((i9 << 3) & 112);
                r1 = (AnonymousClass7W3) r14;
                C147188nY.A0w(r14, r1, r5);
                AnonymousClass7W3.A0a(r14, r1, A0i2, A0p2);
                AnonymousClass7KP.A08(r14, A0n2, A0m2, A002, A012);
                int A052 = C86124wJ.A05(i9);
                r14.Cvb(324850682);
                if ((A052 & 81) != 16 || !r14.BCM()) {
                    C147188nY r27 = r14;
                    C115286uo A022 = C120577Bm.A02(r27, (ImageUrl) r4.get(0), (AnonymousClass0ZU) null, 6, 0);
                    C123327Wm r6 = Modifier.A00;
                    float f = (float) 0;
                    Modifier A0F = AnonymousClass7Kq.A0F(AnonymousClass7K4.A05(r6, (float) 16, (float) 2, f, f), 18);
                    C874352s r3 = AnonymousClass7G5.A00;
                    C97846Dc.A00(r14, (Alignment) null, C115826vy.A01(A0F, r3), (C104136bI) null, A022, (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
                    C97846Dc.A00(r14, (Alignment) null, C115826vy.A01(AnonymousClass7Kq.A0F(AnonymousClass7K4.A05(r6, f, (float) 11, f, f), 12), r3), (C104136bI) null, C120577Bm.A02(r27, (ImageUrl) r4.get(1), (AnonymousClass0ZU) null, 6, 0), (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
                    C97846Dc.A00(r14, (Alignment) null, C115826vy.A01(AnonymousClass7Kq.A0F(AnonymousClass7K4.A05(r6, (float) 13, (float) 23, f, f), 9), r3), (C104136bI) null, C120577Bm.A02(r27, (ImageUrl) r4.get(2), (AnonymousClass0ZU) null, 6, 0), (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
                }
                r14.CuJ();
            } else {
                r14.Cvb(2096263325);
                float f2 = (float) 0;
                int i10 = ((i3 >> 3) & 14) | 48;
                C146288ly A0i3 = C147188nY.A0i(r14, AnonymousClass7KV.A0B);
                Object A0p3 = C147188nY.A0p(r14);
                Object A0n3 = C147188nY.A0n(r14);
                Object A0m3 = C147188nY.A0m(r14);
                AnonymousClass0ZU r62 = AnonymousClass74X.A00;
                AnonymousClass0YM A003 = C98236Es.A00(modifier2);
                int A013 = C86114wI.A01((i10 << 3) & 112);
                r1 = (AnonymousClass7W3) r14;
                C147188nY.A0w(r14, r1, r62);
                AnonymousClass7W3.A0a(r14, r1, A0i3, A0p3);
                AnonymousClass7KP.A08(r14, A0n3, A0m3, A003, A013);
                int A053 = C86124wJ.A05(i10);
                r14.Cvb(-322732518);
                if ((A053 & 81) != 16 || !r14.BCM()) {
                    for (ImageUrl A023 : r4) {
                        A02(r14, A023, f2, 0);
                        f2 += A02;
                    }
                }
                r14.CuJ();
            }
            AnonymousClass7W3.A0v(r1, true);
            AnonymousClass7W3.A0w(r1, false);
        } else {
            r14.CuJ();
        }
        AKE = r14.AKE();
        if (AKE != null) {
            i4 = 17;
            AnonymousClass7WO.A00(AKE, new KtLambdaShape2S0202000_I2(modifier2, i6, r4, i5, i4));
        }
    }

    public static final void A01(C147188nY r27, Modifier modifier, AnonymousClass8s2 r29, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        AnonymousClass8s2 r26 = r29;
        C04220Ms.A0B(r26, 1);
        C147188nY r8 = r27;
        r8.Cvd(51753465);
        int i4 = i2;
        int i5 = i;
        boolean z2 = z;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0L(r8, z2) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r8, r26);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r8, modifier2);
        }
        if ((i3 & 731) != 146 || !r8.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            float f = (float) 0;
            int i7 = ((i3 >> 6) & 14) | 48;
            C146288ly A0h = C147188nY.A0h(r8, AnonymousClass7KV.A0B);
            AnonymousClass534 A0b = C147188nY.A0b(r8, -1323940314);
            Object AEA = r8.AEA(A0b);
            AnonymousClass534 r13 = AnonymousClass7DE.A07;
            Object AEA2 = r8.AEA(r13);
            AnonymousClass534 r12 = AnonymousClass7DE.A0B;
            Object AEA3 = r8.AEA(r12);
            AnonymousClass0ZU r20 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(modifier2);
            int A012 = C86114wI.A01((i7 << 3) & 112);
            AnonymousClass7W3 r4 = (AnonymousClass7W3) r8;
            C147188nY.A0w(r8, r4, r20);
            r4.A0T = false;
            AnonymousClass0YP r11 = AnonymousClass74X.A03;
            AnonymousClass0YP A003 = AnonymousClass7Ak.A00(r8, A0h, AEA, r11);
            AnonymousClass0YP r10 = AnonymousClass74X.A02;
            AnonymousClass0YP A013 = AnonymousClass7Ak.A01(r8, AEA2, r10);
            int A004 = AnonymousClass7KP.A00(r8, AEA3, A013, A002, A012);
            r8.Cvb(-964799361);
            if (((((i7 >> 6) & 112) | 6) & 81) != 16 || !r8.BCM()) {
                r8.Cvb(-11445170);
                float f2 = f;
                for (ImageUrl A022 : AnonymousClass00J.A0Q(r26, 2)) {
                    A02(r8, A022, f2, 0);
                    f2 += A02;
                }
                AnonymousClass7W3.A0w(r4, false);
                C123327Wm r0 = Modifier.A00;
                Modifier A09 = AnonymousClass7Kq.A09(AnonymousClass7K4.A05(r0, f2, f, f, f), A03);
                float f3 = A00;
                AnonymousClass79L A005 = AnonymousClass79L.A00(f3, C147188nY.A0R(r8, C103086Xt.A00));
                C874352s r3 = AnonymousClass7G5.A00;
                Modifier A032 = AnonymousClass7K4.A03(AnonymousClass7Ac.A01(A005, A09, r3), f3);
                if (z) {
                    AnonymousClass6MF.A00(r8, C115656vh.A01(A032, r3, C120537Bh.A01(r8, -11444673).A0d), (AnonymousClass5HL) null, 0, 2);
                } else {
                    Modifier A014 = C115656vh.A01(A032, r3, C120537Bh.A01(r8, -11444534).A0h);
                    C146288ly A0h2 = C147188nY.A0h(r8, AnonymousClass7KV.A09);
                    Object A0t = C147188nY.A0t(r8, A0b, -1323940314);
                    Object AEA4 = r8.AEA(r13);
                    Object AEA5 = r8.AEA(r12);
                    AnonymousClass0YM A006 = C98236Es.A00(A014);
                    C147188nY.A0w(r8, r4, r20);
                    r4.A0T = false;
                    AnonymousClass7Ak.A02(r8, A0h2, r11);
                    AnonymousClass7Ak.A02(r8, A0t, A003);
                    C86104wH.A1R(AnonymousClass7KP.A03(r8, AEA4, AEA5, r10, A013), r8, A006, 0);
                    r8.Cvb(A004);
                    r8.Cvb(1784867625);
                    C1190173e.A00(r8, AnonymousClass7Kq.A0F(r0, 8), AnonymousClass6QP.A00(r8, R.drawable.barcelona_arrow_down_outline_08), (String) null, 440, 0, AnonymousClass7KB.A00(r8));
                    AnonymousClass7W3.A0v(r4, true);
                }
                AnonymousClass7W3.A0w(r4, false);
            } else {
                r8.CuJ();
            }
            AnonymousClass7W3.A0v(r4, true);
        } else {
            r8.CuJ();
        }
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0212000_I2(r26, modifier2, i5, i4, 6, z2));
        }
    }

    public static final void A02(C147188nY r19, ImageUrl imageUrl, float f, int i) {
        int i2;
        C147188nY r13 = r19;
        r13.Cvd(-289520658);
        int i3 = i;
        float f2 = f;
        if ((i & 14) == 0) {
            int i4 = 2;
            if (r13.ACV(f2)) {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i3;
        }
        ImageUrl imageUrl2 = imageUrl;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r13, imageUrl2);
        }
        if ((i2 & 91) != 18 || !r13.BCM()) {
            C123327Wm r5 = Modifier.A00;
            float f3 = (float) 0;
            Modifier A09 = AnonymousClass7Kq.A09(AnonymousClass7K4.A05(r5, f2, f3, f3, f3), A03);
            AnonymousClass79L A002 = AnonymousClass79L.A00(A00, C147188nY.A0R(r13, C103086Xt.A00));
            C874352s r6 = AnonymousClass7G5.A00;
            Modifier A012 = AnonymousClass7Ac.A01(A002, A09, r6);
            Alignment alignment = AnonymousClass7KV.A09;
            r13.Cvb(733328855);
            C146288ly A003 = C120767Cj.A00(r13, alignment, false);
            Object A0p = C147188nY.A0p(r13);
            Object A0n = C147188nY.A0n(r13);
            Object A0m = C147188nY.A0m(r13);
            AnonymousClass0ZU r7 = AnonymousClass74X.A00;
            AnonymousClass0YM A004 = C98236Es.A00(A012);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r13;
            C147188nY.A0w(r13, r1, r7);
            AnonymousClass7W3.A0a(r13, r1, A003, A0p);
            AnonymousClass7KP.A07(r13, A0n, A0m, A004);
            r13.Cvb(-2121693400);
            C97846Dc.A00(r13, (Alignment) null, C115826vy.A01(AnonymousClass7Kq.A09(r5, A01), r6), (C104136bI) null, C120577Bm.A02(r13, imageUrl2, (AnonymousClass0ZU) null, 6, 0), (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
            AnonymousClass7W3.A0f(r1);
        } else {
            r13.CuJ();
        }
        C147178nW AKE = r13.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new C140038Qu(imageUrl2, f2, i3));
        }
    }
}
