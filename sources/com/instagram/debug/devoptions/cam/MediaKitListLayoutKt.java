package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass534;
import X.AnonymousClass72M;
import X.AnonymousClass72N;
import X.AnonymousClass74X;
import X.AnonymousClass799;
import X.AnonymousClass79L;
import X.AnonymousClass7Ac;
import X.AnonymousClass7Aj;
import X.AnonymousClass7Ak;
import X.AnonymousClass7DE;
import X.AnonymousClass7G5;
import X.AnonymousClass7HZ;
import X.AnonymousClass7Hi;
import X.AnonymousClass7I9;
import X.AnonymousClass7J3;
import X.AnonymousClass7K4;
import X.AnonymousClass7KB;
import X.AnonymousClass7KE;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7Kq;
import X.AnonymousClass7VA;
import X.AnonymousClass7W3;
import X.AnonymousClass7WO;
import X.C06750aI;
import X.C111366nD;
import X.C114236su;
import X.C115656vh;
import X.C115686vk;
import X.C115696vl;
import X.C115826vy;
import X.C120537Bh;
import X.C120767Cj;
import X.C121117Ee;
import X.C121657He;
import X.C121807If;
import X.C123327Wm;
import X.C134817yQ;
import X.C142708fS;
import X.C142878fk;
import X.C145058jl;
import X.C145068jm;
import X.C146288ly;
import X.C147178nW;
import X.C147188nY;
import X.C81784oM;
import X.C86104wH;
import X.C86134wK;
import X.C86154wM;
import X.C876653q;
import X.C89865Hh;
import X.C98236Es;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.mediakit.model.MediaKitVisibility;
import java.util.List;

public final class MediaKitListLayoutKt {
    public static final void Actions(C89865Hh r30, Delegate delegate, C147188nY r32, int i) {
        C89865Hh r8 = r30;
        Delegate delegate2 = delegate;
        boolean A1Z = AnonymousClass0wJ.A1Z(r8, delegate2);
        C147188nY r15 = r32;
        r15.Cvd(1903158580);
        String valueOf = String.valueOf(r8.A03);
        String str = r8.A04;
        float f = 0.33f;
        if (str != null) {
            f = 0.25f;
        }
        C123327Wm A02 = Modifier.A02(r15, 693286680);
        C146288ly A00 = AnonymousClass72N.A00(AnonymousClass7J3.A01, r15, AnonymousClass7KV.A05);
        Object A0p = C147188nY.A0p(r15);
        Object A0n = C147188nY.A0n(r15);
        Object A0m = C147188nY.A0m(r15);
        AnonymousClass0ZU r2 = AnonymousClass74X.A00;
        AnonymousClass0YM A002 = C98236Es.A00(A02);
        AnonymousClass7W3 r12 = (AnonymousClass7W3) r15;
        C147188nY.A0w(r15, r12, r2);
        AnonymousClass7W3.A0a(r15, r12, A00, A0p);
        AnonymousClass7KP.A07(r15, A0n, A0m, A002);
        AnonymousClass7VA r1 = AnonymousClass7VA.A00;
        r15.Cvb(937827480);
        AnonymousClass7I9.A02(r15, AnonymousClass7HZ.A03(r1.DB5(A02, f, A1Z), new MediaKitListLayoutKt$Actions$1$1(delegate2, valueOf), false), (C121807If) null, (C114236su) null, (C134817yQ) null, C121117Ee.A01(3), "Edit", 0, 0, 0, 6, 0, 4024, AnonymousClass7KB.A04(r15), 0, false);
        AnonymousClass7I9.A02(r15, AnonymousClass7HZ.A02(r1.DB5(A02, f, A1Z), (AnonymousClass799) null, new MediaKitListLayoutKt$Actions$1$2(delegate2, valueOf), 7, false), (C121807If) null, (C114236su) null, (C134817yQ) null, C121117Ee.A01(3), "Duplicate", 0, 0, 0, 6, 0, 4024, AnonymousClass7KB.A02(r15), 0, false);
        AnonymousClass7I9.A02(r15, AnonymousClass7HZ.A02(r1.DB5(A02, f, A1Z), (AnonymousClass799) null, new MediaKitListLayoutKt$Actions$1$3(delegate2, valueOf), 7, false), (C121807If) null, (C114236su) null, (C134817yQ) null, C121117Ee.A01(3), "Delete", 0, 0, 0, 6, 0, 4024, C120537Bh.A00(r15).A0A, 0, false);
        if (str != null) {
            AnonymousClass7I9.A02(r15, AnonymousClass7HZ.A02(r1.DB5(A02, f, A1Z), (AnonymousClass799) null, new MediaKitListLayoutKt$Actions$1$4$1(delegate2, r8), 7, false), (C121807If) null, (C114236su) null, (C134817yQ) null, C121117Ee.A01(3), "Share", 0, 0, 0, 6, 0, 4024, AnonymousClass7KB.A02(r15), 0, false);
        }
        AnonymousClass7W3.A0v(r12, A1Z);
        C147178nW AKE = r15.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new MediaKitListLayoutKt$Actions$2(r8, delegate2, i));
        }
    }

    public static final void MediaKitItem(C89865Hh r51, Delegate delegate, C147188nY r53, int i) {
        Delegate delegate2 = delegate;
        boolean A1Z = AnonymousClass0wJ.A1Z(r51, delegate2);
        C147188nY r0 = r53;
        r0.Cvd(-1099344168);
        C123327Wm r15 = Modifier.A00;
        Modifier A03 = AnonymousClass7HZ.A03(r15, new MediaKitListLayoutKt$MediaKitItem$1(delegate2, r51), false);
        C146288ly A07 = AnonymousClass7KV.A07(r0, false);
        AnonymousClass534 A0b = C147188nY.A0b(r0, -1323940314);
        Object AEA = r0.AEA(A0b);
        AnonymousClass534 r12 = AnonymousClass7DE.A07;
        Object AEA2 = r0.AEA(r12);
        AnonymousClass534 r11 = AnonymousClass7DE.A0B;
        Object AEA3 = r0.AEA(r11);
        AnonymousClass0ZU r10 = AnonymousClass74X.A00;
        AnonymousClass0YM A00 = C98236Es.A00(A03);
        AnonymousClass7W3 r1 = (AnonymousClass7W3) r0;
        C147188nY.A0w(r0, r1, r10);
        r1.A0T = false;
        AnonymousClass0YP r9 = AnonymousClass74X.A03;
        AnonymousClass0YP A002 = AnonymousClass7Ak.A00(r0, A07, AEA, r9);
        AnonymousClass0YP r8 = AnonymousClass74X.A02;
        AnonymousClass0YP A01 = AnonymousClass7Ak.A01(r0, AEA2, r8);
        Integer A05 = AnonymousClass7KP.A05(r0, AEA3, A01, A00);
        r0.Cvb(2058660585);
        r0.Cvb(-853044462);
        C146288ly A052 = AnonymousClass7KV.A05(r0);
        Object A0t = C147188nY.A0t(r0, A0b, -1323940314);
        Object AEA4 = r0.AEA(r12);
        Object AEA5 = r0.AEA(r11);
        AnonymousClass0YM A003 = C98236Es.A00(r15);
        C147188nY.A0w(r0, r1, r10);
        r1.A0T = false;
        AnonymousClass7Ak.A02(r0, A052, r9);
        AnonymousClass7Ak.A02(r0, A0t, A002);
        A003.invoke(AnonymousClass7KP.A03(r0, AEA4, AEA5, r8, A01), r0, A05);
        r0.Cvb(2058660585);
        r0.Cvb(92025692);
        C146288ly A06 = AnonymousClass7KV.A06(r0);
        Object A0t2 = C147188nY.A0t(r0, A0b, -1323940314);
        Object AEA6 = r0.AEA(r12);
        Object AEA7 = r0.AEA(r11);
        AnonymousClass0YM A004 = C98236Es.A00(r15);
        C147188nY.A0w(r0, r1, r10);
        r1.A0T = false;
        AnonymousClass7Ak.A02(r0, A06, r9);
        AnonymousClass7Ak.A02(r0, A0t2, A002);
        A004.invoke(AnonymousClass7KP.A03(r0, AEA6, AEA7, r8, A01), r0, A05);
        r0.Cvb(2058660585);
        r0.Cvb(-1649847432);
        String str = r51.A05;
        long A032 = AnonymousClass7Hi.A03(16);
        C147188nY r21 = r0;
        AnonymousClass7I9.A02(r21, (Modifier) null, (C121807If) null, (C114236su) null, new C134817yQ(600), (C121117Ee) null, str, 0, 0, 0, 199680, 0, 4050, AnonymousClass7KB.A02(r0), A032, false);
        float f = (float) 4;
        C115686vk.A01(r0, AnonymousClass7Kq.A0A(r15, f), 6);
        MediaKitVisibility mediaKitVisibility = r51.A00;
        Modifier A012 = C115826vy.A01(AnonymousClass7K4.A03(C115656vh.A00(r15, C121657He.A04(C86154wM.A0G(bgColor(mediaKitVisibility)), AnonymousClass7KE.A03(bgColor(mediaKitVisibility)), AnonymousClass7KE.A02(bgColor(mediaKitVisibility)), AnonymousClass7KE.A01(bgColor(mediaKitVisibility)), 0.7f)), f), AnonymousClass7G5.A00(f));
        String str2 = mediaKitVisibility.A00;
        long A033 = AnonymousClass7Hi.A03(12);
        C147188nY r32 = r0;
        AnonymousClass7I9.A02(r32, A012, (C121807If) null, (C114236su) null, C134817yQ.A01, (C121117Ee) null, str2, 0, 0, 0, 199680, 0, 4048, AnonymousClass7KB.A02(r0), A033, false);
        AnonymousClass7W3.A0v(r1, A1Z);
        C115686vk.A00(r0, r15, f);
        String str3 = r51.A02;
        if (str3 == null) {
            str3 = "[Empty description]";
        }
        String str4 = str3;
        AnonymousClass7I9.A02(r21, (Modifier) null, (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, str4, 0, 0, 0, 3072, 0, 4082, AnonymousClass7KB.A02(r0), AnonymousClass7Hi.A03(14), false);
        C115686vk.A00(r0, r15, f);
        AnonymousClass7I9.A02(r21, (Modifier) null, (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, String.valueOf(r51.A03), 0, 0, 0, 3072, 0, 4082, AnonymousClass7KB.A02(r0), AnonymousClass7Hi.A03(14), false);
        C115686vk.A00(r0, r15, (float) 6);
        boolean z = A1Z;
        LayoutKt.SectionDivider(false, r0, 0, z ? 1 : 0);
        AnonymousClass7W3.A0v(r1, z);
        AnonymousClass7W3.A0v(r1, z);
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            C89865Hh r02 = r51;
            AnonymousClass7WO.A00(AKE, new MediaKitListLayoutKt$MediaKitItem$3(r02, delegate2, i));
        }
    }

    public static final void MediaKitListView(List list, Delegate delegate, C147188nY r14, int i) {
        boolean A1Z = AnonymousClass0wJ.A1Z(list, delegate);
        r14.Cvd(-1829790660);
        C115696vl.A01((C142708fS) null, (C145058jl) null, (C145068jm) null, (LazyListState) null, r14, (C142878fk) null, (Modifier) null, new MediaKitListLayoutKt$MediaKitListView$1(list, delegate, i), 12582912, StringTreeSet.MAX_SYMBOL_COUNT, false, A1Z);
        C147178nW AKE = r14.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new MediaKitListLayoutKt$MediaKitListView$2(list, delegate, i));
        }
    }

    public static final void MediaKitSummaryItem(C89865Hh r18, Delegate delegate, C147188nY r20, int i) {
        C89865Hh r11 = r18;
        Delegate delegate2 = delegate;
        boolean A1Z = AnonymousClass0wJ.A1Z(r11, delegate2);
        C147188nY r9 = r20;
        r9.Cvd(-589835938);
        C123327Wm r13 = Modifier.A00;
        float f = (float) 8;
        Modifier A01 = AnonymousClass7Ac.A01(new AnonymousClass79L(getGradientBrush(r9, 0), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), C115826vy.A01(AnonymousClass7K4.A04(r13, (float) 16, f), AnonymousClass7G5.A00(f)), AnonymousClass7G5.A00(f));
        C146288ly A07 = AnonymousClass7KV.A07(r9, false);
        AnonymousClass534 A0b = C147188nY.A0b(r9, -1323940314);
        Object AEA = r9.AEA(A0b);
        AnonymousClass534 r8 = AnonymousClass7DE.A07;
        Object AEA2 = r9.AEA(r8);
        AnonymousClass534 r7 = AnonymousClass7DE.A0B;
        Object AEA3 = r9.AEA(r7);
        AnonymousClass0ZU r6 = AnonymousClass74X.A00;
        AnonymousClass0YM A00 = C98236Es.A00(A01);
        AnonymousClass7W3 r5 = (AnonymousClass7W3) r9;
        C147188nY.A0w(r9, r5, r6);
        r5.A0T = false;
        AnonymousClass0YP r4 = AnonymousClass74X.A03;
        AnonymousClass0YP A002 = AnonymousClass7Ak.A00(r9, A07, AEA, r4);
        AnonymousClass0YP r3 = AnonymousClass74X.A02;
        AnonymousClass0YP A012 = AnonymousClass7Ak.A01(r9, AEA2, r3);
        Integer A05 = AnonymousClass7KP.A05(r9, AEA3, A012, A00);
        r9.Cvb(2058660585);
        r9.Cvb(-571326492);
        Modifier A08 = AnonymousClass7K4.A08(r13, 12);
        C146288ly A052 = AnonymousClass7KV.A05(r9);
        Object A0t = C147188nY.A0t(r9, A0b, -1323940314);
        Object AEA4 = r9.AEA(r8);
        Object AEA5 = r9.AEA(r7);
        AnonymousClass0YM A003 = C98236Es.A00(A08);
        C147188nY.A0w(r9, r5, r6);
        r5.A0T = false;
        AnonymousClass7Ak.A02(r9, A052, r4);
        AnonymousClass7Ak.A02(r9, A0t, A002);
        A003.invoke(AnonymousClass7KP.A03(r9, AEA4, AEA5, r3, A012), r9, A05);
        r9.Cvb(2058660585);
        r9.Cvb(574658650);
        int i2 = i;
        int i3 = (i & 112) | 8;
        MediaKitItem(r11, delegate2, r9, i3);
        C115686vk.A01(r9, AnonymousClass7Kq.A08(r13, (float) 10), 6);
        Actions(r11, delegate2, r9, i3);
        C115686vk.A00(r9, r13, (float) 2);
        boolean z = A1Z;
        AnonymousClass7W3.A0v(r5, z);
        AnonymousClass7W3.A0v(r5, z);
        C147178nW AKE = r9.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new MediaKitListLayoutKt$MediaKitSummaryItem$2(r11, delegate2, i2));
        }
    }

    public static final long bgColor(MediaKitVisibility mediaKitVisibility) {
        if (mediaKitVisibility == MediaKitVisibility.PUBLIC) {
            return AnonymousClass7KE.A03;
        }
        return AnonymousClass7KE.A04;
    }

    public static final void MediaKitEmptyLayout(C147188nY r37, int i) {
        C147188nY r1 = r37;
        r1.Cvd(1443023225);
        int i2 = i;
        if (i != 0 || !r1.BCM()) {
            C123327Wm r3 = Modifier.A00;
            Modifier A05 = Modifier.A05(r3);
            Alignment alignment = AnonymousClass7KV.A09;
            r1.Cvb(733328855);
            C146288ly A00 = C120767Cj.A00(r1, alignment, false);
            AnonymousClass534 A0b = C147188nY.A0b(r1, -1323940314);
            Object AEA = r1.AEA(A0b);
            AnonymousClass534 r6 = AnonymousClass7DE.A07;
            Object AEA2 = r1.AEA(r6);
            AnonymousClass534 r5 = AnonymousClass7DE.A0B;
            Object AEA3 = r1.AEA(r5);
            AnonymousClass0ZU r14 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A05);
            AnonymousClass7W3 r0 = (AnonymousClass7W3) r1;
            C147188nY.A0w(r1, r0, r14);
            r0.A0T = false;
            AnonymousClass0YP r13 = AnonymousClass74X.A03;
            AnonymousClass0YP A003 = AnonymousClass7Ak.A00(r1, A00, AEA, r13);
            AnonymousClass0YP r12 = AnonymousClass74X.A02;
            AnonymousClass0YP A01 = AnonymousClass7Ak.A01(r1, AEA2, r12);
            Integer A052 = AnonymousClass7KP.A05(r1, AEA3, A01, A002);
            r1.Cvb(2058660585);
            r1.Cvb(305457663);
            C142878fk r15 = AnonymousClass7KV.A00;
            float f = (float) 32;
            Modifier A03 = AnonymousClass7K4.A03(r3, f);
            C146288ly A004 = AnonymousClass72M.A00(C147188nY.A0V(r1), r1, r15);
            Object A0t = C147188nY.A0t(r1, A0b, -1323940314);
            Object AEA4 = r1.AEA(r6);
            Object AEA5 = r1.AEA(r5);
            AnonymousClass0YM A005 = C98236Es.A00(A03);
            C147188nY.A0w(r1, r0, r14);
            r0.A0T = false;
            AnonymousClass7Ak.A02(r1, A004, r13);
            AnonymousClass7Ak.A02(r1, A0t, A003);
            A005.invoke(AnonymousClass7KP.A03(r1, AEA4, AEA5, r12, A01), r1, A052);
            r1.Cvb(2058660585);
            r1.Cvb(783139957);
            LayoutKt.Illustration(R.drawable.ig_illustrations_illo_add_photos_videos, (Modifier) null, r1, 0, 2);
            C115686vk.A00(r1, r3, f);
            long A032 = AnonymousClass7Hi.A03(22);
            C147188nY r21 = r1;
            AnonymousClass7I9.A02(r21, (Modifier) null, (C121807If) null, (C114236su) null, new C134817yQ(800), (C121117Ee) null, "Create your first portfolio", 0, 0, 0, 199686, 0, 4050, AnonymousClass7KB.A02(r1), A032, false);
            C115686vk.A01(r1, AnonymousClass7Kq.A08(r3, (float) 8), 6);
            long A006 = AnonymousClass7Hi.A00();
            long A04 = C121657He.A04(C86154wM.A0G(AnonymousClass7KB.A02(r1)), AnonymousClass7KE.A03(AnonymousClass7KB.A02(r1)), AnonymousClass7KE.A02(AnonymousClass7KB.A02(r1)), AnonymousClass7KE.A01(AnonymousClass7KB.A02(r1)), 0.8f);
            AnonymousClass7I9.A02(r21, (Modifier) null, (C121807If) null, (C114236su) null, new C134817yQ(400), C121117Ee.A00(), "You have not published any portfolio yet, please click 'New' on top right corner to start creating your first portfolio!", 0, 0, 0, 199686, 0, 3986, A04, A006, false);
            AnonymousClass7W3.A0v(r0, AnonymousClass7W3.A11(r0));
        } else {
            r1.CuJ();
        }
        C147178nW AKE = r1.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new MediaKitListLayoutKt$MediaKitEmptyLayout$2(i2));
        }
    }

    public static final void MediaKitListLayout(MediaKitDevOptionViewModel mediaKitDevOptionViewModel, Delegate delegate, C147188nY r6, int i) {
        boolean A1Y = AnonymousClass0wJ.A1Y(mediaKitDevOptionViewModel, delegate);
        r6.Cvd(-389520027);
        if (C86104wH.A1X(AnonymousClass7Aj.A01(r6, mediaKitDevOptionViewModel.loadingListState))) {
            r6.Cvb(162847577);
            LayoutKt.LoadingLayout(r6, A1Y);
        } else {
            r6.Cvb(162847608);
            C81784oM A01 = AnonymousClass7Aj.A01(r6, mediaKitDevOptionViewModel.mediaKitListFlow);
            MediaKitListView((List) A01.getValue(), delegate, r6, (i & 112) | 8);
            if (((List) A01.getValue()).isEmpty()) {
                MediaKitEmptyLayout(r6, A1Y ? 1 : 0);
            }
        }
        AnonymousClass7W3.A0z(r6, A1Y);
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new MediaKitListLayoutKt$MediaKitListLayout$1(mediaKitDevOptionViewModel, delegate, i));
        }
    }

    public static final List MediaKitListLayout$lambda$0(C81784oM r0) {
        return (List) r0.getValue();
    }

    public static final C111366nD getGradientBrush(C147188nY r9, int i) {
        r9.Cvb(-831570107);
        C876653q r3 = new C876653q(getGradientStoke(r9, 0), C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), C86104wH.A0C(Float.POSITIVE_INFINITY, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        AnonymousClass7W3.A0z(r9, false);
        return r3;
    }

    public static final List getGradientStoke(C147188nY r7, int i) {
        r7.Cvb(-1097742663);
        List A17 = C06750aI.A17(C86134wK.A0I(C120537Bh.A00(r7).A0J), C86134wK.A0I(C120537Bh.A00(r7).A0I), C86134wK.A0I(C120537Bh.A00(r7).A0D), C86134wK.A0I(C120537Bh.A00(r7).A0E), C86134wK.A0I(C120537Bh.A00(r7).A0F));
        AnonymousClass7W3.A0z(r7, false);
        return A17;
    }
}
