package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.jvm.internal.KtLambdaShape0S2302000_I2;
import kotlin.jvm.internal.KtLambdaShape10S0401000_I2;
import kotlin.jvm.internal.KtLambdaShape33S0100000_I2_13;
import kotlin.jvm.internal.KtLambdaShape6S0400000_I2;
import kotlin.jvm.internal.KtLambdaShape9S0401000_I2;

/* renamed from: X.7Hs  reason: invalid class name */
public final class AnonymousClass7Hs {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (r9 != 0) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C147188nY r22, androidx.compose.ui.Modifier r23, X.AnonymousClass56U r24, X.AnonymousClass0ZU r25, X.AnonymousClass0YP r26, int r27, int r28) {
        /*
            r7 = r25
            r6 = r26
            r4 = r24
            r5 = r23
            boolean r1 = X.AnonymousClass0wJ.A1Y(r7, r6)
            r0 = -1316496495(0xffffffffb187db91, float:-3.953979E-9)
            r11 = r22
            r11.Cvd(r0)
            r21 = r28
            r0 = r28 & 1
            r3 = r27
            if (r0 == 0) goto L_0x00f3
            r2 = r27 | 6
        L_0x001e:
            r0 = r28 & 2
            if (r0 == 0) goto L_0x00e8
            r2 = r2 | 48
        L_0x0024:
            r10 = r28 & 4
            if (r10 == 0) goto L_0x00dd
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x002a:
            r9 = r28 & 8
            if (r9 == 0) goto L_0x005f
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r0 = 8
            if (r9 != r0) goto L_0x005f
            r8 = r2 & 5851(0x16db, float:8.199E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r8 != r0) goto L_0x005f
            boolean r0 = r11.BCM()
            if (r0 == 0) goto L_0x005f
            r11.CuJ()
        L_0x0043:
            X.8nW r1 = r11.AKE()
            if (r1 == 0) goto L_0x005e
            r22 = 12
            kotlin.jvm.internal.KtLambdaShape2S0402000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape2S0402000_I2
            r17 = r7
            r18 = r4
            r19 = r6
            r20 = r3
            r15 = r0
            r16 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r1.D9d(r0)
        L_0x005e:
            return
        L_0x005f:
            r11.CvD()
            r0 = r27 & 1
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r11.Acj()
            if (r0 != 0) goto L_0x00b2
            r11.CuJ()
            if (r9 == 0) goto L_0x0073
        L_0x0071:
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0073:
            r11.AKA()
            X.4wG r0 = r4.A03
            r10 = 0
            X.4oM r25 = X.AnonymousClass7Aj.A01(r11, r0)
            X.7Wm r8 = androidx.compose.ui.Modifier.A00
            long r0 = X.AnonymousClass7KB.A01(r11)
            androidx.compose.ui.Modifier r0 = X.C115656vh.A00(r8, r0)
            androidx.compose.ui.Modifier r12 = r0.Cx6(r5)
            long r17 = X.AnonymousClass7KB.A01(r11)
            r1 = -1549912080(0xffffffffa39e37f0, float:-1.7154085E-17)
            r28 = 6
            kotlin.jvm.internal.KtLambdaShape9S0401000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape9S0401000_I2
            r22 = r0
            r23 = r4
            r24 = r6
            r26 = r7
            r27 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28)
            X.8sI r14 = X.AnonymousClass7JR.A00(r11, r0, r1)
            r19 = 0
            r15 = 196608(0x30000, float:2.75506E-40)
            r16 = 26
            r13 = r10
            X.AnonymousClass70T.A01(r10, r11, r12, r13, r14, r15, r16, r17, r19)
            goto L_0x0043
        L_0x00b2:
            if (r10 == 0) goto L_0x00b6
            X.7Wm r5 = androidx.compose.ui.Modifier.A00
        L_0x00b6:
            if (r9 == 0) goto L_0x0073
            android.app.Application r4 = X.C147188nY.A0S(r11)
            X.0kW r0 = X.C1189973c.A00(r11)
            X.7b5 r12 = new X.7b5
            r12.<init>(r4, r0)
            X.06C r13 = X.AnonymousClass7CD.A00(r11)
            if (r13 == 0) goto L_0x0102
            r16 = 0
            X.6o9 r14 = X.C86104wH.A0J(r13)
            java.lang.Class<X.56U> r15 = X.AnonymousClass56U.class
            X.3ak r4 = X.C98396Fj.A00(r11, r12, r13, r14, r15, r16)
            X.AnonymousClass7W3.A0z(r11, r1)
            X.56U r4 = (X.AnonymousClass56U) r4
            goto L_0x0071
        L_0x00dd:
            r0 = r3 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x002a
            int r0 = X.C147188nY.A0H(r11, r5)
            r2 = r2 | r0
            goto L_0x002a
        L_0x00e8:
            r0 = r27 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0024
            int r0 = X.C147188nY.A0A(r11, r6)
            r2 = r2 | r0
            goto L_0x0024
        L_0x00f3:
            r0 = r27 & 14
            if (r0 != 0) goto L_0x00ff
            int r2 = X.C147188nY.A09(r11, r7)
            r2 = r2 | r27
            goto L_0x001e
        L_0x00ff:
            r2 = r3
            goto L_0x001e
        L_0x0102:
            java.lang.String r0 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Hs.A03(X.8nY, androidx.compose.ui.Modifier, X.56U, X.0ZU, X.0YP, int, int):void");
    }

    public static final void A04(C147188nY r64, Modifier modifier, ImageUrl imageUrl, String str, String str2, AnonymousClass0ZU r69, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C147188nY r0 = r64;
        r0.Cvd(511673765);
        int i4 = i2;
        AnonymousClass0ZU r642 = r69;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r0, r642) | i;
        } else {
            i3 = i5;
        }
        String str3 = str;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r0, str3);
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r0, str4);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0I(r0, imageUrl);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((57344 & i) == 0) {
            i3 |= C147188nY.A0J(r0, modifier2);
        }
        if ((46811 & i3) != 9362 || !r0.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            float f = (float) 18;
            float f2 = (float) 16;
            float f3 = f2;
            Modifier A04 = AnonymousClass7K4.A04(modifier2, f2, f);
            boolean A0y = C147188nY.A0y(r0, r642);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r0;
            Object A13 = r2.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = AnonymousClass7W3.A0H(r2, r642, 29);
            }
            Modifier A03 = AnonymousClass7HZ.A03(A04, AnonymousClass7W3.A08(r2, A13, false), false);
            C146288ly A06 = AnonymousClass7KV.A06(r0);
            AnonymousClass534 A0a = C147188nY.A0a(r0);
            Object AEA = r0.AEA(A0a);
            AnonymousClass534 r4 = AnonymousClass7DE.A07;
            Object AEA2 = r0.AEA(r4);
            AnonymousClass534 r15 = AnonymousClass7DE.A0B;
            Object AEA3 = r0.AEA(r15);
            AnonymousClass0ZU r25 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A03);
            C147188nY.A0w(r0, r2, r25);
            r2.A0T = false;
            AnonymousClass0YP r24 = AnonymousClass74X.A03;
            AnonymousClass0YP A002 = AnonymousClass7Ak.A00(r0, A06, AEA, r24);
            AnonymousClass0YP r22 = AnonymousClass74X.A02;
            AnonymousClass0YP A01 = AnonymousClass7Ak.A01(r0, AEA2, r22);
            Integer A05 = AnonymousClass7KP.A05(r0, AEA3, A01, A00);
            AnonymousClass7VA A0W = C147188nY.A0W(r0);
            C123327Wm A02 = Modifier.A02(r0, -340162551);
            float f4 = (float) 0;
            Modifier A052 = AnonymousClass7K4.A05(A02, f4, f4, (float) 12, f4);
            Alignment A003 = AnonymousClass7KV.A00(r0);
            C146288ly A004 = C120767Cj.A00(r0, A003, false);
            Object A0s = C147188nY.A0s(r0, A0a);
            Object AEA4 = r0.AEA(r4);
            Object AEA5 = r0.AEA(r15);
            AnonymousClass0YM A005 = C98236Es.A00(A052);
            C147188nY.A0w(r0, r2, r25);
            r2.A0T = false;
            AnonymousClass7Ak.A02(r0, A004, r24);
            AnonymousClass7Ak.A02(r0, A0s, A002);
            AnonymousClass7Ak.A02(r0, AEA4, r22);
            AnonymousClass7KP.A06(r0, AEA5, A05, A01, A005);
            AnonymousClass7V3 r16 = AnonymousClass7V3.A00;
            r0.Cvb(-564332145);
            C147188nY r52 = r0;
            C97846Dc.A00(r52, (Alignment) null, AnonymousClass7G5.A02(A02, (float) 50), (C104136bI) null, C120577Bm.A01(r0, imageUrl), (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
            Modifier A09 = AnonymousClass7Kq.A09(A02, f);
            long A006 = AnonymousClass7KB.A00(r0);
            r0.AEA(AnonymousClass6YT.A00);
            Modifier A012 = C115656vh.A01(A09, AnonymousClass7D5.A01, A006);
            Modifier A86 = r16.A86(AnonymousClass7KV.A07, A012);
            C146288ly A0h = C147188nY.A0h(r0, A003);
            Object A0s2 = C147188nY.A0s(r0, A0a);
            Object AEA6 = r0.AEA(r4);
            Object AEA7 = r0.AEA(r15);
            AnonymousClass0YM A007 = C98236Es.A00(A86);
            C147188nY.A0w(r0, r2, r25);
            r2.A0T = false;
            AnonymousClass7Ak.A02(r0, A0h, r24);
            AnonymousClass7Ak.A02(r0, A0s2, A002);
            AnonymousClass7Ak.A02(r0, AEA6, r22);
            AnonymousClass7KP.A06(r0, AEA7, A05, A01, A007);
            r0.Cvb(345157781);
            C97846Dc.A00(r52, (Alignment) null, AnonymousClass7KV.A01(r16, AnonymousClass7Kq.A09(A02, f3)), (C104136bI) null, AnonymousClass6QP.A00(r0, R.drawable.icon_instagram), (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
            boolean A11 = AnonymousClass7W3.A11(r2);
            AnonymousClass7W3.A0v(r2, A11);
            AnonymousClass7VA r8 = A0W;
            Modifier A008 = C146818mu.A00(r8, A02, A11);
            C141758cu r162 = AnonymousClass7KV.A04;
            Modifier A009 = r8.A00(r162, A008);
            C146288ly A053 = AnonymousClass7KV.A05(r0);
            Object A0s3 = C147188nY.A0s(r0, A0a);
            Object AEA8 = r0.AEA(r4);
            Object AEA9 = r0.AEA(r15);
            AnonymousClass0YM A0010 = C98236Es.A00(A009);
            C147188nY.A0w(r0, r2, r25);
            r2.A0T = false;
            AnonymousClass7Ak.A02(r0, A053, r24);
            AnonymousClass7Ak.A02(r0, A0s3, A002);
            AnonymousClass7Ak.A02(r0, AEA8, r22);
            AnonymousClass7KP.A06(r0, AEA9, A05, A01, A0010);
            r0.Cvb(1731254783);
            Modifier A054 = AnonymousClass7K4.A05(A02, f4, f4, f4, (float) 4);
            long A032 = AnonymousClass7Hi.A03(14);
            C147188nY r27 = r0;
            AnonymousClass7I9.A02(r27, A054, AnonymousClass7J9.A00(r0), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str3, 0, A11 ? 1 : 0, 0, ((i3 >> 3) & 14) | 805309488, 0, 1524, 0, A032, false);
            long A033 = AnonymousClass7KB.A03(r0);
            long A034 = AnonymousClass7Hi.A03(14);
            AnonymousClass7I9.A02(r0, (Modifier) null, AnonymousClass7J9.A03(r0), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str4, 0, A11 ? 1 : 0, 0, ((i3 >> 6) & 14) | 805309440, 0, 1522, A033, A034, false);
            AnonymousClass7W3.A0v(r2, A11);
            C1190173e.A00(r27, A0W.A00(r162, AnonymousClass7Kq.A0F(A02, 24)), AnonymousClass6QP.A00(r0, R.drawable.instagram_chevron_right_pano_outline_24), (String) null, 56, 8, 0);
            AnonymousClass7W3.A0v(r2, A11);
        } else {
            r0.CuJ();
        }
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S2302000_I2(r642, modifier2, imageUrl, str4, str3, i5, i4, 0));
        }
    }

    public static final void A00(C147188nY r22, Modifier modifier, int i) {
        int i2;
        C147188nY r7 = r22;
        r7.Cvd(375915093);
        int i3 = i;
        Modifier modifier2 = modifier;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r7, modifier2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !r7.BCM()) {
            Object A0o = C147188nY.A0o(r7);
            C86164wN.A1F(A0o);
            String A01 = AnonymousClass7JS.A01(r7, 2131821969);
            C04220Ms.A0B(modifier2, 0);
            AnonymousClass7I9.A02(r7, C117646z1.A01(AnonymousClass6FI.A00(AnonymousClass7K4.A08(Modifier.A04(modifier2), 24), AnonymousClass8OD.A00, true), AnonymousClass799.A00(0), new KtLambdaShape33S0100000_I2_13(A0o, 28)), AnonymousClass7J9.A02(r7), (C114236su) null, (C134817yQ) null, C121117Ee.A01(3), A01, 0, 0, 0, 0, 0, 1980, 0, 0, false);
        } else {
            r7.CuJ();
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            C147178nW.A02(AKE, modifier2, i3, 29);
        }
    }

    public static final void A01(C147188nY r17, Modifier modifier, KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I2, AnonymousClass56U r20, AnonymousClass0YP r21, int i) {
        C147188nY r6 = r17;
        r6.Cvd(978581666);
        KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I22 = ktCSuperShape0S0210000_I2;
        boolean z = ktCSuperShape0S0210000_I22.A02;
        Modifier modifier2 = modifier;
        AnonymousClass56U r15 = r20;
        AnonymousClass0YP r172 = r21;
        int i2 = i;
        AnonymousClass7JP.A06(AnonymousClass7KU.A04(C78544ib.A00), AnonymousClass7KU.A06((C147218oz) null, 3), r6, (Modifier) null, (String) null, AnonymousClass7JR.A00(r6, new KtLambdaShape10S0401000_I2(ktCSuperShape0S0210000_I22, r15, modifier2, r172, i2, 4), -42242358), 200064, 18, !z);
        AnonymousClass7JP.A06(AnonymousClass7KU.A01((C147218oz) null, 3).A00(AnonymousClass7KU.A04(C78554ic.A00)), AnonymousClass7KU.A06((C147218oz) null, 3).A00(AnonymousClass7KU.A09(C78564id.A00)), r6, (Modifier) null, (String) null, C103726ad.A01, 200064, 18, z);
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape9S0401000_I2(r15, modifier2, ktCSuperShape0S0210000_I22, r172, i2, 4));
        }
    }

    public static final void A02(C147188nY r22, Modifier modifier, KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I2, AnonymousClass56U r25, AnonymousClass0YP r26, int i) {
        C147188nY r8 = r22;
        r8.Cvd(-553099046);
        LazyListState A00 = C97946Do.A00(r8, 0, 3);
        KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I22 = ktCSuperShape0S0210000_I2;
        Object obj = ktCSuperShape0S0210000_I22.A01;
        Object A0o = C147188nY.A0o(r8);
        C86164wN.A1F(A0o);
        Modifier modifier2 = modifier;
        AnonymousClass56U r16 = r25;
        AnonymousClass0YP r19 = r26;
        C115696vl.A01((C142708fS) null, (C145058jl) null, (C145068jm) null, A00, r8, (C142878fk) null, AnonymousClass7K4.A06(modifier2, (float) 16, 0), new KtLambdaShape6S0400000_I2(15, A0o, r16, r19, obj), 12582912, 124, false, true);
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            Modifier modifier3 = modifier2;
            AKE.D9d(new KtLambdaShape9S0401000_I2(r16, modifier3, ktCSuperShape0S0210000_I22, r19, i, 5));
        }
    }
}
