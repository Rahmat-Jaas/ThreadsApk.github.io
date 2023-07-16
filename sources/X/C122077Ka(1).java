package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.api.schemas.ProfileTheme;
import com.instagram.api.schemas.ProfileThemeType;
import com.instagram.common.gallery.GalleryItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape20S0201000_I2_6;
import kotlin.jvm.internal.KtLambdaShape10S0401000_I2;
import kotlin.jvm.internal.KtLambdaShape18S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape19S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape1S0221000_I2;
import kotlin.jvm.internal.KtLambdaShape28S0200000_I2_12;
import kotlin.jvm.internal.KtLambdaShape2S0200001_I2;
import kotlin.jvm.internal.KtLambdaShape7S0501000_I2;

/* renamed from: X.7Ka  reason: invalid class name and case insensitive filesystem */
public final class C122077Ka {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x005b, code lost:
        if (((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r5.getValue()).A02 != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(androidx.compose.foundation.lazy.LazyListState r17, X.C147188nY r18, X.AnonymousClass06E r19, X.AnonymousClass57T r20, int r21) {
        /*
            r4 = 0
            r7 = r17
            X.C04220Ms.A0B(r7, r4)
            r1 = r19
            r0 = r20
            X.AnonymousClass0wJ.A1O(r0, r1)
            r2 = -2051074896(0xffffffff85bf14b0, float:-1.7969153E-35)
            r8 = r18
            r8.Cvd(r2)
            X.4wG r2 = r0.A05
            r13 = 0
            X.4oM r6 = X.AnonymousClass7Aj.A01(r8, r2)
            android.content.Context r3 = X.C147188nY.A0T(r8)
            com.instagram.service.session.UserSession r2 = X.AnonymousClass7CZ.A00(r8)
            X.7bT r9 = new X.7bT
            r9.<init>(r3, r1, r2)
            X.06C r10 = X.AnonymousClass7CD.A00(r8)
            if (r10 == 0) goto L_0x00df
            X.6o9 r11 = X.C86104wH.A0J(r10)
            java.lang.Class<X.F6t> r12 = X.F6t.class
            r19 = 1
            X.3ak r11 = X.C98396Fj.A00(r8, r9, r10, r11, r12, r13)
            X.AnonymousClass7W3.A0z(r8, r4)
            X.F6t r11 = (X.F6t) r11
            X.4wG r2 = r11.A04
            X.4oM r5 = X.AnonymousClass7Aj.A01(r8, r2)
            java.lang.Object r2 = r6.getValue()
            X.5IH r2 = (X.AnonymousClass5IH) r2
            X.676 r3 = r2.A01
            X.676 r2 = X.AnonymousClass676.Photo
            if (r3 != r2) goto L_0x005d
            java.lang.Object r2 = r5.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r2
            boolean r2 = r2.A02
            r4 = 1
            if (r2 == 0) goto L_0x005e
        L_0x005d:
            r4 = 0
        L_0x005e:
            java.lang.Object r2 = r6.getValue()
            X.5IH r2 = (X.AnonymousClass5IH) r2
            java.util.List r12 = r2.A03
            java.lang.Object r2 = r6.getValue()
            X.5IH r2 = (X.AnonymousClass5IH) r2
            java.lang.Integer r3 = r2.A02
            java.lang.Integer r2 = X.AnonymousClass006.A00
            boolean r18 = X.C18240wQ.A1Y(r3, r2)
            java.lang.Object r2 = r6.getValue()
            X.5IH r2 = (X.AnonymousClass5IH) r2
            com.instagram.api.schemas.ProfileTheme r9 = r2.A00
            r2 = 12
            kotlin.jvm.internal.IDxRImplShape189S0000000_2_I2 r13 = new kotlin.jvm.internal.IDxRImplShape189S0000000_2_I2
            r13.<init>(r0, r2)
            r2 = 13
            kotlin.jvm.internal.IDxRImplShape189S0000000_2_I2 r14 = new kotlin.jvm.internal.IDxRImplShape189S0000000_2_I2
            r14.<init>(r0, r2)
            java.lang.Object r2 = r6.getValue()
            X.5IH r2 = (X.AnonymousClass5IH) r2
            boolean r2 = r2.A05
            if (r2 != 0) goto L_0x0098
            if (r4 != 0) goto L_0x0098
            r19 = 0
        L_0x0098:
            java.lang.Object r2 = r6.getValue()
            X.5IH r2 = (X.AnonymousClass5IH) r2
            boolean r3 = r2.A09
            java.lang.Object r2 = r6.getValue()
            X.5IH r2 = (X.AnonymousClass5IH) r2
            boolean r2 = r2.A04
            r4 = 14
            kotlin.jvm.internal.IDxRImplShape189S0000000_2_I2 r15 = new kotlin.jvm.internal.IDxRImplShape189S0000000_2_I2
            r15.<init>(r0, r4)
            java.lang.Object r4 = r5.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r4
            java.lang.Object r10 = r4.A01
            com.instagram.common.gallery.GalleryItem r10 = (com.instagram.common.gallery.GalleryItem) r10
            r4 = 134221888(0x8001040, float:3.85377E-34)
            r5 = r21
            r16 = r21 & 14
            r16 = r16 | r4
            r17 = 64
            r20 = r3
            r21 = r2
            A02(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.8nW r3 = r8.AKE()
            if (r3 == 0) goto L_0x00de
            r6 = 28
            kotlin.jvm.internal.KtLambdaShape18S0301000_I2 r2 = new kotlin.jvm.internal.KtLambdaShape18S0301000_I2
            r4 = r2
            r8 = r1
            r9 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            r3.D9d(r2)
        L_0x00de:
            return
        L_0x00df:
            java.lang.String r0 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122077Ka.A01(androidx.compose.foundation.lazy.LazyListState, X.8nY, X.06E, X.57T, int):void");
    }

    public static final Modifier A00(C147188nY r8, AnonymousClass0ZU r9, int i, boolean z) {
        r8.Cvb(789396610);
        if ((i & 1) != 0) {
            z = false;
        }
        Modifier modifier = Modifier.A00;
        Modifier A08 = AnonymousClass7K4.A08(modifier, 3);
        C04220Ms.A0B(A08, 0);
        float f = (float) 16;
        Modifier A03 = AnonymousClass7HZ.A03(C115826vy.A01(C97876Dh.A00(Modifier.A04(A08), 1.0f, false), AnonymousClass7G5.A00(f)), r9, false);
        if (z) {
            long j = C120537Bh.A00(r8).A0p;
            modifier = AnonymousClass7Ac.A02(modifier, AnonymousClass7G5.A00(f), (float) 1, j);
        }
        Modifier Cx6 = A03.Cx6(modifier);
        AnonymousClass7W3.A0z(r8, false);
        return Cx6;
    }

    public static final void A02(LazyListState lazyListState, C147188nY r36, ProfileTheme profileTheme, GalleryItem galleryItem, F6t f6t, List list, AnonymousClass0YY r41, AnonymousClass0YY r42, AnonymousClass0YY r43, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        C147188nY r2 = r36;
        r2.Cvd(-1390008012);
        boolean z5 = z2;
        boolean z6 = z;
        boolean z7 = z4;
        boolean z8 = z3;
        ProfileTheme profileTheme2 = profileTheme;
        GalleryItem galleryItem2 = galleryItem;
        F6t f6t2 = f6t;
        List list2 = list;
        AnonymousClass0YY r8 = r41;
        AnonymousClass0YY r9 = r42;
        AnonymousClass0YY r10 = r43;
        int i3 = i;
        int i4 = i2;
        LazyListState lazyListState2 = lazyListState;
        LazyListState lazyListState3 = lazyListState2;
        C147188nY r35 = r2;
        C115696vl.A01((C142708fS) null, (C145058jl) null, (C145068jm) null, lazyListState3, r35, AnonymousClass7KV.A00, (Modifier) null, new AnonymousClass8K3(profileTheme2, galleryItem2, f6t2, list2, r8, r10, r9, i3, i4, z6, z7, z5, z8), ((i << 3) & 112) | 12779520, 93, false, false);
        C147178nW AKE = r2.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8U0(lazyListState2, profileTheme2, galleryItem2, f6t2, list2, r8, r9, r10, i3, i4, z6, z5, z8, z7));
        }
    }

    public static final void A03(C147188nY r8, int i) {
        C147188nY r2 = r8;
        r8.Cvd(-672376840);
        if (i != 0 || !r8.BCM()) {
            C101286Qp.A00(r2, AnonymousClass7K4.A08(Modifier.A00, 10), (AnonymousClass5HL) null, 6, 6, 0);
        } else {
            r8.CuJ();
        }
        C147178nW AKE = r2.AKE();
        if (AKE != null) {
            C147178nW.A00(AKE, i, 5);
        }
    }

    public static final void A04(C147188nY r7, ProfileTheme profileTheme, int i) {
        r7.Cvd(510534296);
        float f = (float) 18;
        long A04 = AnonymousClass7KB.A04(r7);
        Modifier A02 = AnonymousClass7Ac.A02(C115826vy.A01(C97876Dh.A00(Modifier.A04(Modifier.A00), 1.0f, false), AnonymousClass7G5.A00(f)), AnonymousClass7G5.A00(f), (float) 2, A04);
        C146288ly A0h = C147188nY.A0h(r7, AnonymousClass7KV.A09);
        Object A0p = C147188nY.A0p(r7);
        Object A0n = C147188nY.A0n(r7);
        Object A0m = C147188nY.A0m(r7);
        AnonymousClass0ZU r1 = AnonymousClass74X.A00;
        AnonymousClass0YM A00 = C98236Es.A00(A02);
        AnonymousClass7W3 r2 = (AnonymousClass7W3) r7;
        C147188nY.A0w(r7, r2, r1);
        AnonymousClass7W3.A0a(r7, r2, A0h, A0p);
        AnonymousClass7KP.A07(r7, A0n, A0m, A00);
        r7.Cvb(1464981458);
        A09(r7, profileTheme, AnonymousClass4dC.A00, 56);
        AnonymousClass7W3.A0f(r2);
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            C147178nW.A01(AKE, profileTheme, i, 8);
        }
    }

    public static final void A05(C147188nY r34, ProfileTheme profileTheme, F6t f6t, List list, AnonymousClass0YY r38, AnonymousClass0YY r39, int i) {
        C147188nY r14 = r34;
        r14.Cvd(-1196860676);
        r14.Cvb(773894976);
        AnonymousClass7W3 A0Y = C147188nY.A0Y(r14);
        Object A13 = A0Y.A13();
        Object obj = AnonymousClass7GN.A00;
        C83224qz A00 = AnonymousClass7WN.A00(A0Y, C86104wH.A0b(r14, A0Y, A13, obj, A13));
        List A17 = C06750aI.A17(AnonymousClass7JS.A01(r14, 2131828069), AnonymousClass7JS.A01(r14, 2131828066));
        PagerState A002 = AnonymousClass74J.A00(r14, 0, 3);
        int A05 = A002.A05();
        AnonymousClass0YY r9 = r39;
        boolean A10 = C147188nY.A10(r14, A002, r9, 511388516);
        Object A132 = A0Y.A13();
        if (A10 || A132 == obj) {
            A132 = new KtSLambdaShape20S0201000_I2_6(r9, A002, (C146958n9) null, 25);
            A0Y.A14(A132);
        }
        AnonymousClass7W3.A0b(r14, A0Y, A132, A002, false);
        C123327Wm A003 = Modifier.A00(r14);
        C146288ly A04 = AnonymousClass7KV.A04(r14);
        Object A0p = C147188nY.A0p(r14);
        Object A0n = C147188nY.A0n(r14);
        Object A0m = C147188nY.A0m(r14);
        AnonymousClass0ZU r4 = AnonymousClass74X.A00;
        AnonymousClass0YM A004 = C98236Es.A00(A003);
        C147188nY.A0w(r14, A0Y, r4);
        AnonymousClass7W3.A0a(r14, A0Y, A04, A0p);
        AnonymousClass7KP.A07(r14, A0n, A0m, A004);
        C147188nY r22 = r14;
        AnonymousClass72V.A00(r22, (Modifier) null, (AnonymousClass0YP) null, AnonymousClass7JR.A00(r14, new KtLambdaShape18S0301000_I2(A05, 29, A00, A002, A17), 512963978), (AnonymousClass0YM) null, A05, 1572864, 58, C120537Bh.A01(r14, 597344754).A0y, 0);
        ProfileTheme profileTheme2 = profileTheme;
        F6t f6t2 = f6t;
        List list2 = list;
        AnonymousClass0YY r30 = r38;
        int i2 = i;
        AnonymousClass7C8.A01((SnapFlingBehavior) null, (C145068jm) null, (AnonymousClass8cm) null, A002, r14, (C141758cu) null, (Modifier) null, (C146088lc) null, (AnonymousClass0YY) null, AnonymousClass7JR.A00(r14, new KtLambdaShape10S0401000_I2(profileTheme, list2, r30, f6t2, i2, 6), -1062092397), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 2, 0, 6, 3072, 8186, false, false);
        AnonymousClass7W3.A0v(A0Y, true);
        C147178nW AKE = r14.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape7S0501000_I2(profileTheme2, list2, r30, r9, f6t2, i2, 4));
        }
    }

    public static final void A06(C147188nY r17, ProfileTheme profileTheme, List list, AnonymousClass0YY r20, int i) {
        C147188nY r8 = r17;
        r8.Cvd(-13770908);
        AnonymousClass7VM r6 = new AnonymousClass7VM();
        float f = (float) 24;
        AnonymousClass0YY r172 = r20;
        int i2 = i;
        C97956Dp.A00((C142708fS) null, AnonymousClass7J3.A01(f), AnonymousClass7J3.A01(f), (C145068jm) null, r6, (LazyGridState) null, r8, AnonymousClass7K4.A05(AnonymousClass7Kq.A08(Modifier.A00, (float) 350), f, f, f, (float) 0), new KtLambdaShape19S0301000_I2(i2, 10, r172, profileTheme, list), 1769520, HttpStatus.SC_PRECONDITION_FAILED, false, false);
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape18S0301000_I2(i2, 30, r172, profileTheme, list));
        }
    }

    public static final void A07(C147188nY r17, ProfileTheme profileTheme, AnonymousClass0ZU r19, int i) {
        AnonymousClass0YY r11;
        Modifier Cx6;
        C147188nY r3 = r17;
        r3.Cvd(2013061911);
        AnonymousClass0ZU r2 = r19;
        Modifier A00 = A00(r3, r2, 1, false);
        ProfileTheme profileTheme2 = profileTheme;
        List list = profileTheme2.A06;
        if (list.size() == 1) {
            String A0p = C18190wL.A0p(list, 0);
            AnonymousClass725.A00(16);
            Cx6 = C115656vh.A00(A00, C121657He.A02(Long.parseLong(A0p, 16)));
        } else {
            ArrayList A0w = AnonymousClass0wJ.A0w(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0k = C18180wK.A0k(it);
                AnonymousClass725.A00(16);
                A0w.add(C86134wK.A0I(C121657He.A02(Long.parseLong(A0k, 16))));
            }
            C876653q r14 = new C876653q(A0w, AnonymousClass7KC.A03, AnonymousClass7KC.A01);
            C142918fo r10 = C102746Wj.A00;
            if (C86164wN.A1Q(0, A00)) {
                r11 = new KtLambdaShape2S0200001_I2(r14, r10, 1.0f, 0);
            } else {
                r11 = InspectableValueKt.A00;
            }
            Cx6 = A00.Cx6(new AnonymousClass54y(r14, (AnonymousClass7KE) null, r10, r11, 1.0f, 1));
        }
        C120767Cj.A01(r3, Cx6, 0);
        C147178nW AKE = r3.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, r2, profileTheme2, i, 29);
        }
    }

    public static final void A08(C147188nY r11, ProfileTheme profileTheme, AnonymousClass0ZU r13, int i) {
        String str;
        C147188nY r2 = r11;
        r11.Cvd(861784607);
        if (C34822La.A00(C147188nY.A0T(r11))) {
            str = profileTheme.A02;
        } else {
            str = profileTheme.A05;
        }
        C97846Dc.A00(r2, (Alignment) null, A00(r11, r13, 0, true), (C104136bI) null, C120577Bm.A01(r11, C18250wR.A0K(str)), AnonymousClass74L.A00, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 24632, 104);
        C147178nW AKE = r2.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, r13, profileTheme, i, 30);
        }
    }

    public static final void A09(C147188nY r2, ProfileTheme profileTheme, AnonymousClass0ZU r4, int i) {
        r2.Cvd(401493726);
        if (profileTheme == null) {
            r2.Cvb(-1704493270);
            A0B(r2, r4, (i >> 3) & 14);
        } else {
            ProfileThemeType profileThemeType = profileTheme.A00;
            if (profileThemeType == ProfileThemeType.THEME || profileThemeType == ProfileThemeType.CUSTOM_IMAGE) {
                r2.Cvb(-1704493127);
                A08(r2, profileTheme, r4, (i & 112) | 8);
            } else if (profileThemeType == ProfileThemeType.COLOR_GRADIENT) {
                r2.Cvb(-1704493025);
                A07(r2, profileTheme, r4, (i & 112) | 8);
            } else {
                r2.Cvb(-1704492985);
            }
        }
        AnonymousClass7W3.A0y(r2);
        C147178nW AKE = r2.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, r4, profileTheme, i, 31);
        }
    }

    public static final void A0A(C147188nY r19, GalleryItem galleryItem, AnonymousClass0YY r21, int i, boolean z, boolean z2) {
        C147188nY r3 = r19;
        r3.Cvd(-1683348394);
        String A01 = AnonymousClass7JS.A01(r3, 2131835122);
        boolean z3 = z;
        boolean z4 = !z;
        Modifier A04 = Modifier.A04(Modifier.A00);
        int i2 = 2131828068;
        boolean z5 = z2;
        if (z2) {
            i2 = 2131828067;
        }
        String A012 = AnonymousClass7JS.A01(r3, i2);
        GalleryItem galleryItem2 = galleryItem;
        AnonymousClass0YY r0 = r21;
        AnonymousClass6QT.A00(r3, A04, A01, (String) null, A012, new KtLambdaShape28S0200000_I2_12(27, (Object) r0, (Object) galleryItem2), (AnonymousClass0ZU) null, 384, 0, 1520, z4, false, false, false, false);
        C147178nW AKE = r3.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S0221000_I2(r0, galleryItem2, i, 4, z5, z3));
        }
    }

    public static final void A0B(C147188nY r5, AnonymousClass0ZU r6, int i) {
        int i2;
        r5.Cvd(7476047);
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r5, r6) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r5.BCM()) {
            C120767Cj.A01(r5, A00(r5, r6, 0, true).Cx6(C115656vh.A00(Modifier.A00, AnonymousClass7KB.A00(r5))), 0);
        } else {
            r5.CuJ();
        }
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            C147178nW.A01(AKE, r6, i, 7);
        }
    }
}
