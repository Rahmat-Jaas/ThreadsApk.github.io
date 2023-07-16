package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass534;
import X.AnonymousClass54y;
import X.AnonymousClass6EV;
import X.AnonymousClass6QP;
import X.AnonymousClass70S;
import X.AnonymousClass74X;
import X.AnonymousClass79F;
import X.AnonymousClass79L;
import X.AnonymousClass7Ac;
import X.AnonymousClass7Aj;
import X.AnonymousClass7Ak;
import X.AnonymousClass7DE;
import X.AnonymousClass7G5;
import X.AnonymousClass7GN;
import X.AnonymousClass7HZ;
import X.AnonymousClass7Hi;
import X.AnonymousClass7I9;
import X.AnonymousClass7J3;
import X.AnonymousClass7JR;
import X.AnonymousClass7JS;
import X.AnonymousClass7K4;
import X.AnonymousClass7KB;
import X.AnonymousClass7KE;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7Kq;
import X.AnonymousClass7VA;
import X.AnonymousClass7W3;
import X.AnonymousClass7WO;
import X.C04220Ms;
import X.C102736Wi;
import X.C102746Wj;
import X.C104136bI;
import X.C114236su;
import X.C115286uo;
import X.C115656vh;
import X.C115686vk;
import X.C115986wE;
import X.C1190173e;
import X.C1200278c;
import X.C120537Bh;
import X.C120767Cj;
import X.C121117Ee;
import X.C121657He;
import X.C121807If;
import X.C123327Wm;
import X.C132877ue;
import X.C134817yQ;
import X.C141758cu;
import X.C142508ey;
import X.C142918fo;
import X.C146288ly;
import X.C146878n1;
import X.C147178nW;
import X.C147188nY;
import X.C147268p4;
import X.C18180wK;
import X.C18240wQ;
import X.C81784oM;
import X.C86104wH;
import X.C86154wM;
import X.C874352s;
import X.C876653q;
import X.C97846Dc;
import X.C97906Dk;
import X.C98236Es;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierNodeElement;
import androidx.compose.ui.platform.InspectableValueKt;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape2S0200001_I2;

public final class LayoutKt {
    public static final void BrandedContentOptions(CamDevOptionsViewModel camDevOptionsViewModel, C147188nY r10, int i) {
        C04220Ms.A0B(camDevOptionsViewModel, 0);
        C147188nY r7 = r10;
        r10.Cvd(-1253890269);
        C123327Wm A00 = Modifier.A00(r10);
        C146288ly A04 = AnonymousClass7KV.A04(r10);
        Object A0p = C147188nY.A0p(r10);
        Object A0n = C147188nY.A0n(r10);
        Object A0m = C147188nY.A0m(r10);
        AnonymousClass0ZU r2 = AnonymousClass74X.A00;
        AnonymousClass0YM A002 = C98236Es.A00(A00);
        AnonymousClass7W3 r1 = (AnonymousClass7W3) r7;
        C147188nY.A0w(r10, r1, r2);
        AnonymousClass7W3.A0a(r10, r1, A04, A0p);
        AnonymousClass7KP.A07(r10, A0n, A0m, A002);
        r10.Cvb(-171344103);
        SwitchMenuItem(AnonymousClass7JS.A01(r10, 2131825026), C86104wH.A1X(AnonymousClass7Aj.A01(r10, camDevOptionsViewModel.bcEligibilityLoading)), C86104wH.A1X(AnonymousClass7Aj.A01(r10, camDevOptionsViewModel.bcEligibility)), new LayoutKt$BrandedContentOptions$1$1(camDevOptionsViewModel), r7, 0);
        SwitchMenuItem(AnonymousClass7JS.A01(r10, 2131825004), C86104wH.A1X(AnonymousClass7Aj.A01(r10, camDevOptionsViewModel.creatorMarketplaceOnboardingLoading)), C86104wH.A1X(AnonymousClass7Aj.A01(r10, camDevOptionsViewModel.isOnboardedToCreatorMarketplace)), new LayoutKt$BrandedContentOptions$1$2(camDevOptionsViewModel), r7, 0);
        AnonymousClass7W3.A0f(r1);
        C147178nW AKE = r10.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new LayoutKt$BrandedContentOptions$2(camDevOptionsViewModel, i));
        }
    }

    public static final void CamDevOptionsMenuItem(CamDevOptionsViewModel camDevOptionsViewModel, boolean z, String str, AnonymousClass0ZU r16, C147188nY r17, int i, int i2) {
        CamDevOptionsViewModel camDevOptionsViewModel2 = camDevOptionsViewModel;
        C04220Ms.A0B(camDevOptionsViewModel, 0);
        String str2 = str;
        AnonymousClass0ZU r15 = r16;
        AnonymousClass0wJ.A1Q(str2, r15);
        C147188nY r3 = r17;
        r3.Cvd(-89140571);
        int i3 = i2;
        boolean A1Z = C86154wM.A1Z(i2 & 2, z);
        int i4 = i;
        AnonymousClass70S.A00(r3, AnonymousClass7HZ.A03(AnonymousClass7Kq.A08(Modifier.A04(Modifier.A00), (float) 50), new LayoutKt$CamDevOptionsMenuItem$1(A1Z, camDevOptionsViewModel2, r15), false), (C115286uo) null, (C142508ey) null, str2, (String) null, (i >> 6) & 14, 60, false);
        SectionDivider(false, r3, 0, 1);
        C147178nW AKE = r3.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new LayoutKt$CamDevOptionsMenuItem$2(camDevOptionsViewModel2, A1Z, str2, r15, i4, i3));
        }
    }

    public static final void Illustration(int i, Modifier modifier, C147188nY r14, int i2, int i3) {
        int i4;
        Modifier modifier2 = modifier;
        C147188nY r7 = r14;
        r14.Cvd(-47649604);
        int i5 = i3;
        int i6 = i2;
        int i7 = i;
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = C147188nY.A03(r14, i) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= C147188nY.A0G(r14, modifier);
        }
        if ((i4 & 91) != 18 || !r14.BCM()) {
            if (i8 != 0) {
                modifier2 = AnonymousClass7Kq.A0F(Modifier.A00, 80);
            }
            C97846Dc.A00(r7, (Alignment) null, modifier2, (C104136bI) null, AnonymousClass6QP.A00(r14, i), (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, ((i4 << 3) & 896) | 56, 120);
        } else {
            r14.CuJ();
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new LayoutKt$Illustration$1(i7, modifier2, i6, i5));
        }
    }

    public static final void MediaKitOptions(CamDevOptionsViewModel camDevOptionsViewModel, C147188nY r13, int i) {
        CamDevOptionsViewModel camDevOptionsViewModel2 = camDevOptionsViewModel;
        C04220Ms.A0B(camDevOptionsViewModel, 0);
        C147188nY r11 = r13;
        r13.Cvd(255116388);
        C123327Wm A00 = Modifier.A00(r13);
        C146288ly A04 = AnonymousClass7KV.A04(r13);
        Object A0p = C147188nY.A0p(r13);
        Object A0n = C147188nY.A0n(r13);
        Object A0m = C147188nY.A0m(r13);
        AnonymousClass0ZU r2 = AnonymousClass74X.A00;
        AnonymousClass0YM A002 = C98236Es.A00(A00);
        AnonymousClass7W3 r1 = (AnonymousClass7W3) r11;
        C147188nY.A0w(r13, r1, r2);
        AnonymousClass7W3.A0a(r13, r1, A04, A0p);
        AnonymousClass7KP.A07(r13, A0n, A0m, A002);
        r13.Cvb(1770114266);
        CamDevOptionsMenuItem(camDevOptionsViewModel2, false, AnonymousClass7JS.A01(r13, 2131825321), new LayoutKt$MediaKitOptions$1$1(camDevOptionsViewModel), r11, 56, 0);
        CamDevOptionsMenuItem(camDevOptionsViewModel2, false, AnonymousClass7JS.A01(r11, 2131825322), new LayoutKt$MediaKitOptions$1$2(camDevOptionsViewModel2), r11, 56, 0);
        AnonymousClass7W3.A0f(r1);
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new LayoutKt$MediaKitOptions$2(camDevOptionsViewModel2, i));
        }
    }

    public static final void MenuSection(CamDevOptionsViewModel camDevOptionsViewModel, C147188nY r16, int i) {
        C04220Ms.A0B(camDevOptionsViewModel, 0);
        C147188nY r7 = r16;
        r7.Cvd(1799397758);
        C123327Wm A00 = Modifier.A00(r7);
        C146288ly A04 = AnonymousClass7KV.A04(r7);
        Object A0p = C147188nY.A0p(r7);
        Object A0n = C147188nY.A0n(r7);
        Object A0m = C147188nY.A0m(r7);
        AnonymousClass0ZU r1 = AnonymousClass74X.A00;
        AnonymousClass0YM A002 = C98236Es.A00(A00);
        AnonymousClass7W3 r2 = (AnonymousClass7W3) r7;
        C147188nY.A0w(r7, r2, r1);
        AnonymousClass7W3.A0a(r7, r2, A04, A0p);
        AnonymousClass7KP.A07(r7, A0n, A0m, A002);
        r7.Cvb(1814058228);
        SectionCard("Branded Content", (Boolean) AnonymousClass7Aj.A01(r7, camDevOptionsViewModel.bcEligibility).getValue(), AnonymousClass7JR.A00(r7, new LayoutKt$MenuSection$1$1(camDevOptionsViewModel), 282814876), r7, 390, 0);
        SectionCard("Creator Portfolio", (Boolean) null, AnonymousClass7JR.A00(r7, new LayoutKt$MenuSection$1$2(camDevOptionsViewModel), -288674861), r7, 390, 2);
        AnonymousClass7W3.A0f(r2);
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new LayoutKt$MenuSection$2(camDevOptionsViewModel, i));
        }
    }

    public static final void SectionCard(String str, Boolean bool, AnonymousClass0YP r22, C147188nY r23, int i, int i2) {
        int i3;
        String str2 = str;
        AnonymousClass0YP r12 = r22;
        AnonymousClass0wJ.A1M(str2, 0, r12);
        C147188nY r14 = r23;
        r14.Cvd(2039708064);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r14, str2) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r14, bool);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0B(r14, r12);
        }
        if ((i3 & 731) != 146 || !r14.BCM()) {
            if (i6 != 0) {
                bool = null;
            }
            C123327Wm r19 = Modifier.A00;
            float f = (float) 8;
            Modifier A01 = AnonymousClass7Ac.A01(new AnonymousClass79L(MediaKitListLayoutKt.getGradientBrush(r14, 0), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), AnonymousClass7K4.A04(r19, (float) 16, f), AnonymousClass7G5.A00(f));
            C146288ly A07 = AnonymousClass7KV.A07(r14, false);
            AnonymousClass534 A0a = C147188nY.A0a(r14);
            Object AEA = r14.AEA(A0a);
            AnonymousClass534 r8 = AnonymousClass7DE.A07;
            Object AEA2 = r14.AEA(r8);
            AnonymousClass534 r7 = AnonymousClass7DE.A0B;
            Object AEA3 = r14.AEA(r7);
            AnonymousClass0ZU r6 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A01);
            AnonymousClass7W3 r5 = (AnonymousClass7W3) r14;
            C147188nY.A0w(r14, r5, r6);
            r5.A0T = false;
            AnonymousClass0YP r4 = AnonymousClass74X.A03;
            AnonymousClass0YP A002 = AnonymousClass7Ak.A00(r14, A07, AEA, r4);
            AnonymousClass0YP r3 = AnonymousClass74X.A02;
            AnonymousClass0YP A012 = AnonymousClass7Ak.A01(r14, AEA2, r3);
            Integer A05 = AnonymousClass7KP.A05(r14, AEA3, A012, A00);
            r14.Cvb(2058660585);
            r14.Cvb(-1760172250);
            C146288ly A052 = AnonymousClass7KV.A05(r14);
            Object A0s = C147188nY.A0s(r14, A0a);
            Object AEA4 = r14.AEA(r8);
            Object AEA5 = r14.AEA(r7);
            AnonymousClass0YM A003 = C98236Es.A00(r19);
            C147188nY.A0w(r14, r5, r6);
            r5.A0T = false;
            AnonymousClass7Ak.A02(r14, A052, r4);
            AnonymousClass7Ak.A02(r14, A0s, A002);
            A003.invoke(AnonymousClass7KP.A03(r14, AEA4, AEA5, r3, A012), r14, A05);
            r14.Cvb(2058660585);
            r14.Cvb(-1106209124);
            SectionCardHeader(str2, AnonymousClass7JR.A00(r14, new LayoutKt$SectionCard$1$1$1(bool), -2106760366), r14, (i3 & 14) | 48, 0);
            C86104wH.A1S(r14, r12, i3 >> 6);
            AnonymousClass7W3.A0v(r5, AnonymousClass7W3.A11(r5));
        } else {
            r14.CuJ();
        }
        C147178nW AKE = r14.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new LayoutKt$SectionCard$2(str2, bool, r12, i5, i4));
        }
    }

    public static final void SwitchMenuItem(String str, boolean z, boolean z2, AnonymousClass0ZU r16, C147188nY r17, int i) {
        int i2;
        AnonymousClass0ZU r3 = r16;
        C18180wK.A1P(str, 0, r3);
        C147188nY r9 = r17;
        r9.Cvd(-1922385999);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r9, str) | i;
        } else {
            i2 = i3;
        }
        boolean z3 = z;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0M(r9, z);
        }
        boolean z4 = z2;
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0N(r9, z2);
        }
        if ((i3 & 7168) == 0) {
            i2 |= C147188nY.A0C(r9, r3);
        }
        if ((i2 & 5851) != 1170 || !r9.BCM()) {
            boolean A10 = C147188nY.A10(r9, Boolean.valueOf(z), r3, 511388516);
            AnonymousClass7W3 r6 = (AnonymousClass7W3) r9;
            Object A13 = r6.A13();
            if (A10 || A13 == AnonymousClass7GN.A00) {
                A13 = new LayoutKt$SwitchMenuItem$1$1(z, r3);
                r6.A14(A13);
            }
            AnonymousClass70S.A00(r9, (Modifier) null, (C115286uo) null, new C132877ue(AnonymousClass7W3.A0B(r6, A13, false), z2), str, (String) null, i2 & 14, 30, false);
            SectionDivider(false, r9, 0, 1);
        } else {
            r9.CuJ();
        }
        C147178nW AKE = r9.AKE();
        if (AKE != null) {
            boolean z5 = z3;
            AnonymousClass7WO.A00(AKE, new LayoutKt$SwitchMenuItem$2(str, z5, z4, r3, i3));
        }
    }

    public static final void SectionCardHeader(String str, AnonymousClass0YP r38, C147188nY r39, int i, int i2) {
        int i3;
        AnonymousClass0YP r3 = r38;
        String str2 = str;
        C04220Ms.A0B(str2, 0);
        C147188nY r6 = r39;
        r6.Cvd(-107398551);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r6, str2) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r6, r3);
        }
        if ((i3 & 91) != 18 || !r6.BCM()) {
            if (i6 != 0) {
                r3 = ComposableSingletons$LayoutKt.f4lambda1;
            }
            C123327Wm r22 = Modifier.A00;
            Modifier A08 = AnonymousClass7Kq.A08(Modifier.A04(r22), (float) 50);
            C146288ly A06 = AnonymousClass7KV.A06(r6);
            AnonymousClass534 A0a = C147188nY.A0a(r6);
            Object AEA = r6.AEA(A0a);
            AnonymousClass534 r20 = AnonymousClass7DE.A07;
            Object AEA2 = r6.AEA(r20);
            AnonymousClass534 r19 = AnonymousClass7DE.A0B;
            Object AEA3 = r6.AEA(r19);
            AnonymousClass0ZU r15 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A08);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r6;
            C147188nY.A0w(r6, r2, r15);
            r2.A0T = false;
            AnonymousClass0YP r14 = AnonymousClass74X.A03;
            AnonymousClass0YP A002 = AnonymousClass7Ak.A00(r6, A06, AEA, r14);
            AnonymousClass0YP r13 = AnonymousClass74X.A02;
            AnonymousClass0YP A01 = AnonymousClass7Ak.A01(r6, AEA2, r13);
            Integer A05 = AnonymousClass7KP.A05(r6, AEA3, A01, A00);
            r6.Cvb(2058660585);
            AnonymousClass7VA r10 = AnonymousClass7VA.A00;
            r6.Cvb(-1926848819);
            long A03 = AnonymousClass7Hi.A03(18);
            C134817yQ r28 = C134817yQ.A01;
            long A02 = AnonymousClass7KB.A02(r6);
            C141758cu r7 = AnonymousClass7KV.A04;
            float f = (float) 16;
            float f2 = (float) 0;
            C147188nY r24 = r6;
            AnonymousClass7I9.A02(r24, AnonymousClass7K4.A05(r10.A00(r7, r22), f, f2, (float) 8, f2), (C121807If) null, (C114236su) null, r28, (C121117Ee) null, str2, 0, 0, 0, (i3 & 14) | 199680, 0, 4048, A02, A03, false);
            Modifier A052 = AnonymousClass7K4.A05(r10.A00(r7, r22), f2, f2, f, f2);
            C146288ly A07 = AnonymousClass7KV.A07(r6, false);
            Object A0s = C147188nY.A0s(r6, A0a);
            Object AEA4 = r6.AEA(r20);
            Object AEA5 = r6.AEA(r19);
            AnonymousClass0YM A003 = C98236Es.A00(A052);
            C147188nY.A0w(r6, r2, r15);
            r2.A0T = false;
            AnonymousClass7Ak.A02(r6, A07, r14);
            AnonymousClass7Ak.A02(r6, A0s, A002);
            A003.invoke(AnonymousClass7KP.A03(r6, AEA4, AEA5, r13, A01), r6, A05);
            r6.Cvb(2058660585);
            r6.Cvb(1386175315);
            r3.invoke(r6, Integer.valueOf((i3 >> 3) & 14));
            boolean A11 = AnonymousClass7W3.A11(r2);
            AnonymousClass7W3.A0v(r2, A11);
            SectionDivider(A11, r6, 6, 0);
        } else {
            r6.CuJ();
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new LayoutKt$SectionCardHeader$2(str2, r3, i5, i4));
        }
    }

    public static final void EligibilityIcon(boolean z, C147188nY r11, int i) {
        int i2;
        long j;
        C147188nY r2 = r11;
        r11.Cvd(-1794950526);
        if ((i & 14) == 0) {
            i2 = C147188nY.A0L(r11, z) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r11.BCM()) {
            int i3 = R.drawable.instagram_circle_x_pano_outline_24;
            if (z) {
                i3 = R.drawable.instagram_circle_check_pano_outline_24;
            }
            C115286uo A00 = AnonymousClass6QP.A00(r11, i3);
            if (z) {
                j = C120537Bh.A01(r11, 1811770740).A0t;
            } else {
                j = C120537Bh.A01(r11, 1811770768).A0A;
            }
            AnonymousClass7W3.A0w((AnonymousClass7W3) r2, false);
            C1190173e.A00(r2, AnonymousClass7Kq.A0F(Modifier.A00, 16), A00, (String) null, 440, 0, j);
        } else {
            r11.CuJ();
        }
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new LayoutKt$EligibilityIcon$1(z, i));
        }
    }

    public static final void LoadingLayout(C147188nY r6, int i) {
        C147188nY r1 = r6;
        r6.Cvd(703367178);
        if (i != 0 || !r6.BCM()) {
            C115986wE.A01(r1, (C1200278c) null, LayoutKt$LoadingLayout$1.INSTANCE, ComposableSingletons$LayoutKt.f6lambda3, 390, 2);
        } else {
            r6.CuJ();
        }
        C147178nW AKE = r1.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new LayoutKt$LoadingLayout$2(i));
        }
    }

    public static final void SectionDivider(boolean z, C147188nY r5, int i, int i2) {
        int i3;
        r5.Cvd(1982666968);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0L(r5, z) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !r5.BCM()) {
            if (i4 != 0) {
                z = false;
            }
            Modifier A00 = AnonymousClass6EV.A00(Modifier.A00, 0.2f);
            C04220Ms.A0B(A00, 0);
            Modifier A002 = C115656vh.A00(AnonymousClass7Kq.A08(Modifier.A04(A00), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), C120537Bh.A00(r5).A09);
            if (!z) {
                A002 = AnonymousClass7K4.A07(A002, 0);
            }
            C120767Cj.A01(r5, A002, 0);
        } else {
            r5.CuJ();
        }
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new LayoutKt$SectionDivider$1(z, i, i2));
        }
    }

    public static final void SpikeLoading(C147188nY r9, int i) {
        r9.Cvd(1257092726);
        if (i != 0 || !r9.BCM()) {
            C141758cu r4 = AnonymousClass7KV.A04;
            C147268p4 A01 = AnonymousClass7J3.A01((float) 6);
            float f = (float) 0;
            Modifier A05 = AnonymousClass7K4.A05(Modifier.A00, f, 50.0f, f, f);
            C146288ly A0e = C147188nY.A0e(A01, r9, r4);
            Object A0p = C147188nY.A0p(r9);
            Object A0n = C147188nY.A0n(r9);
            Object A0m = C147188nY.A0m(r9);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A05);
            AnonymousClass7W3 r42 = (AnonymousClass7W3) r9;
            C147188nY.A0w(r9, r42, r1);
            AnonymousClass7W3.A0a(r9, r42, A0e, A0p);
            AnonymousClass7KP.A07(r9, A0n, A0m, A00);
            r9.Cvb(-1854284910);
            int i2 = 0;
            do {
                int i3 = i2 * 70;
                SpikeLoading$Dot$12(C18240wQ.A00(AnimationSpecKt.animateOffsetY(i3, (String) null, r9, 0, 2).getValue()), C18240wQ.A00(AnimationSpecKt.animateHeight(i3, (String) null, r9, 0, 2).getValue()), r9, 0);
                i2++;
            } while (i2 < 4);
            AnonymousClass7W3.A0f(r42);
        } else {
            r9.CuJ();
        }
        C147178nW AKE = r9.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new LayoutKt$SpikeLoading$2(i));
        }
    }

    public static final void SpikeLoading$Dot$12(float f, float f2, C147188nY r11, int i) {
        AnonymousClass0YY r8;
        C147188nY r1 = r11;
        Modifier A00 = C97906Dk.A00(AnonymousClass7Kq.A0D(Modifier.A02(r11, 1859130167), (float) 8, f2), (float) 0, -f);
        C876653q r7 = new C876653q(MediaKitListLayoutKt.getGradientStoke(r11, 0), C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Float.POSITIVE_INFINITY));
        C874352s r72 = AnonymousClass7G5.A00;
        C04220Ms.A0B(A00, 0);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r8 = new KtLambdaShape2S0200001_I2(r7, r72, 1.0f, 0);
        } else {
            r8 = InspectableValueKt.A00;
        }
        C115686vk.A01(r1, A00.Cx6(new AnonymousClass54y(r7, (AnonymousClass7KE) null, r72, r8, 1.0f, 1)), 0);
        AnonymousClass7W3.A0z(r1, false);
    }

    public static final float SpikeLoading$lambda$15$lambda$13(C81784oM r0) {
        return C18240wQ.A00(r0.getValue());
    }

    public static final float SpikeLoading$lambda$15$lambda$14(C81784oM r0) {
        return C18240wQ.A00(r0.getValue());
    }

    public static final void SquareLoading(C147188nY r21, int i) {
        C147188nY r7 = r21;
        r7.Cvd(1857371747);
        int i2 = i;
        if (i != 0 || !r7.BCM()) {
            int[] iArr = {-1, -1, 1, 1};
            int[] iArr2 = {-1, 1, -1, 1};
            C81784oM animateRotation = AnimationSpecKt.animateRotation((String) null, r7, 0, 1);
            Alignment alignment = AnonymousClass7KV.A09;
            Modifier A0F = AnonymousClass7Kq.A0F(Modifier.A00, 80);
            float A00 = C18240wQ.A00(animateRotation.getValue());
            C04220Ms.A0B(A0F, 0);
            if (A00 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                long j = AnonymousClass79F.A01;
                C142918fo r11 = C102746Wj.A00;
                long j2 = C102736Wi.A00;
                A0F = A0F.Cx6(new GraphicsLayerModifierNodeElement(r11, 1.0f, 1.0f, 1.0f, A00, j, j2, j2, false));
            }
            C146288ly A0h = C147188nY.A0h(r7, alignment);
            Object A0p = C147188nY.A0p(r7);
            Object A0n = C147188nY.A0n(r7);
            Object A0m = C147188nY.A0m(r7);
            AnonymousClass0ZU r8 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A0F);
            AnonymousClass7W3 r12 = (AnonymousClass7W3) r7;
            C147188nY.A0w(r7, r12, r8);
            AnonymousClass7W3.A0a(r7, r12, A0h, A0p);
            AnonymousClass7KP.A07(r7, A0n, A0m, A002);
            r7.Cvb(-1454205847);
            int i3 = 0;
            do {
                SquareLoading$Dot(C18240wQ.A00(AnimationSpecKt.animateOffset(iArr[i3], (String) null, r7, 0, 2).getValue()), C18240wQ.A00(AnimationSpecKt.animateOffset(iArr2[i3], (String) null, r7, 0, 2).getValue()), r7, 0);
                i3++;
            } while (i3 < 4);
            AnonymousClass7W3.A0v(r12, true);
        } else {
            r7.CuJ();
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new LayoutKt$SquareLoading$2(i2));
        }
    }

    public static final void SquareLoading$Dot(float f, float f2, C147188nY r5, int i) {
        C115686vk.A01(r5, C115656vh.A01(C97906Dk.A00(AnonymousClass7Kq.A0F(Modifier.A02(r5, -954304062), 16), f, f2), AnonymousClass7G5.A00, C121657He.A04(C86154wM.A0G(AnonymousClass7KB.A02(r5)), AnonymousClass7KE.A03(AnonymousClass7KB.A02(r5)), AnonymousClass7KE.A02(AnonymousClass7KB.A02(r5)), AnonymousClass7KE.A01(AnonymousClass7KB.A02(r5)), 0.7f)), 0);
        AnonymousClass7W3.A0z(r5, false);
    }

    public static final float SquareLoading$lambda$11$lambda$10(C81784oM r0) {
        return C18240wQ.A00(r0.getValue());
    }

    public static final float SquareLoading$lambda$11$lambda$9(C81784oM r0) {
        return C18240wQ.A00(r0.getValue());
    }

    public static final float SquareLoading$lambda$8(C81784oM r0) {
        return C18240wQ.A00(r0.getValue());
    }
}
