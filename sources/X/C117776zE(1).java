package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6zE  reason: invalid class name and case insensitive filesystem */
public final class C117776zE {
    public static final void A01(C147188nY r40, Modifier modifier, ImageUrl imageUrl, String str, String str2, String str3, int i) {
        int i2;
        C04220Ms.A0B(modifier, 4);
        C147188nY r0 = r40;
        r0.Cvd(1045546429);
        int i3 = i;
        String str4 = str;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r0, str4) | i;
        } else {
            i2 = i3;
        }
        String str5 = str2;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r0, str5);
        }
        ImageUrl imageUrl2 = imageUrl;
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0H(r0, imageUrl2);
        }
        String str6 = str3;
        if ((i3 & 7168) == 0) {
            i2 |= C147188nY.A0I(r0, str6);
        }
        if ((57344 & i) == 0) {
            i2 |= C147188nY.A0J(r0, modifier);
        }
        if ((46811 & i2) != 9362 || !r0.BCM()) {
            int i4 = ((i2 >> 12) & 14) | 48;
            C146288ly A03 = AnonymousClass7KV.A03(AnonymousClass7J3.A01((float) 2), r0);
            AnonymousClass534 A0a = C147188nY.A0a(r0);
            Object AEA = r0.AEA(A0a);
            AnonymousClass534 r12 = AnonymousClass7DE.A07;
            Object AEA2 = r0.AEA(r12);
            AnonymousClass534 r11 = AnonymousClass7DE.A0B;
            Object AEA3 = r0.AEA(r11);
            AnonymousClass0ZU r10 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(modifier);
            int A01 = C86114wI.A01((i4 << 3) & 112);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r0;
            C147188nY.A0w(r0, r1, r10);
            r1.A0T = false;
            AnonymousClass0YP r9 = AnonymousClass74X.A03;
            AnonymousClass0YP A002 = AnonymousClass7Ak.A00(r0, A03, AEA, r9);
            AnonymousClass0YP r8 = AnonymousClass74X.A02;
            AnonymousClass0YP A012 = AnonymousClass7Ak.A01(r0, AEA2, r8);
            int A003 = AnonymousClass7KP.A00(r0, AEA3, A012, A00, A01);
            r0.Cvb(-1326171641);
            if (((((i4 >> 6) & 112) | 6) & 81) != 16 || !r0.BCM()) {
                C147268p4 A013 = AnonymousClass7J3.A01((float) 4);
                C123327Wm A02 = Modifier.A02(r0, 693286680);
                C146288ly A004 = AnonymousClass72N.A00(A013, r0, AnonymousClass7KV.A05);
                Object A0s = C147188nY.A0s(r0, A0a);
                Object AEA4 = r0.AEA(r12);
                Object AEA5 = r0.AEA(r11);
                AnonymousClass0YM A005 = C98236Es.A00(A02);
                C147188nY.A0w(r0, r1, r10);
                r1.A0T = false;
                AnonymousClass7Ak.A02(r0, A004, r9);
                AnonymousClass7Ak.A02(r0, A0s, A002);
                C86104wH.A1R(AnonymousClass7KP.A03(r0, AEA4, AEA5, r8, A012), r0, A005, 0);
                r0.Cvb(A003);
                r0.Cvb(-1287843293);
                r0.Cvb(-377270827);
                if (imageUrl != null) {
                    C147188nY r4 = r0;
                    C97846Dc.A00(r4, (Alignment) null, AnonymousClass7Kq.A0F(A02, 12), (C104136bI) null, C120577Bm.A02(r0, imageUrl2, (AnonymousClass0ZU) null, 6, 0), (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 440, 120);
                }
                AnonymousClass7W3.A0w(r1, false);
                r0.Cvb(1158215801);
                if (str != null) {
                    C147188nY r22 = r0;
                    String str7 = str4;
                    AnonymousClass7I9.A02(r22, Modifier.A04(A02), AnonymousClass7J9.A01(r0), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str7, 0, 1, 2, 805306416 | (i2 & 14), 6, HttpStatus.SC_GATEWAY_TIMEOUT, AnonymousClass7KB.A03(r0), 0, false);
                }
                AnonymousClass7W3.A0w(r1, false);
                AnonymousClass7W3.A0v(r1, true);
                String str8 = str5;
                if (str2 == null) {
                    str8 = str6;
                }
                C147188nY r222 = r0;
                AnonymousClass7I9.A02(r222, Modifier.A04(A02), AnonymousClass7J9.A02(r0).A01(new C121807If((C134817yQ) null, (C121117Ee) null, 196607, 0, 0, AnonymousClass7Hi.A03(18))), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str8, 0, 2, 2, 805306416, 6, HttpStatus.SC_GATEWAY_TIMEOUT, AnonymousClass7KB.A02(r0), 0, false);
            } else {
                r0.CuJ();
            }
            AnonymousClass7W3.A0f(r1);
        } else {
            r0.CuJ();
        }
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8RY(modifier, imageUrl2, str4, str5, str6, i3));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e3, code lost:
        if (r1 == X.C970267q.REPOST_PREVIEW) goto L_0x00e5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x03bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147188nY r47, androidx.compose.ui.Modifier r48, com.instagram.api.schemas.LineType r49, X.C970267q r50, com.instagram.common.typedurl.ImageUrl r51, com.instagram.common.typedurl.ImageUrl r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, X.AnonymousClass0ZU r56, X.AnonymousClass0ZU r57, int r58, int r59, int r60, boolean r61) {
        /*
            r27 = r50
            r30 = r56
            r29 = r57
            r28 = r48
            r32 = 4
            r46 = r55
            r1 = r32
            r0 = r46
            X.C04220Ms.A0B(r0, r1)
            r16 = 5
            r50 = r49
            r1 = r16
            r0 = r50
            X.C04220Ms.A0B(r0, r1)
            r0 = 1791984449(0x6acf8341, float:1.2543374E26)
            r2 = r47
            r2.Cvd(r0)
            r8 = r60
            r0 = r60 & 1
            r6 = r58
            r49 = r53
            if (r0 == 0) goto L_0x0412
            r0 = r58 | 6
        L_0x0032:
            r1 = r60 & 2
            r31 = r51
            if (r1 == 0) goto L_0x0405
            r0 = r0 | 48
        L_0x003a:
            r1 = r60 & 4
            r33 = r52
            if (r1 == 0) goto L_0x03f8
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0042:
            r1 = r60 & 8
            r48 = r54
            if (r1 == 0) goto L_0x03eb
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x004a:
            r1 = r60 & 16
            if (r1 == 0) goto L_0x03db
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0050:
            r1 = r60 & 32
            if (r1 == 0) goto L_0x03cd
            r1 = 196608(0x30000, float:2.75506E-40)
        L_0x0056:
            r0 = r0 | r1
        L_0x0057:
            r1 = r60 & 64
            r34 = r61
            if (r1 == 0) goto L_0x03bb
            r1 = 1572864(0x180000, float:2.204052E-39)
        L_0x005f:
            r0 = r0 | r1
        L_0x0060:
            r3 = r8 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x03a9
            r1 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0066:
            r0 = r0 | r1
        L_0x0067:
            r4 = r8 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x0397
            r1 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x006d:
            r0 = r0 | r1
        L_0x006e:
            r5 = r8 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0385
            r1 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0074:
            r0 = r0 | r1
        L_0x0075:
            r7 = r8 & 1024(0x400, float:1.435E-42)
            r47 = r59
            if (r7 == 0) goto L_0x0373
            r10 = r59 | 6
        L_0x007d:
            r1 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r9 = r0 & r1
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r1) goto L_0x00c0
            r9 = r10 & 11
            r1 = 2
            if (r9 != r1) goto L_0x00c0
            boolean r1 = r2.BCM()
            if (r1 == 0) goto L_0x00c0
            r2.CuJ()
        L_0x0095:
            X.8nW r1 = r2.AKE()
            if (r1 == 0) goto L_0x00bf
            X.8Tv r0 = new X.8Tv
            r35 = r0
            r36 = r28
            r37 = r50
            r38 = r27
            r39 = r31
            r40 = r33
            r41 = r49
            r42 = r48
            r43 = r46
            r44 = r30
            r45 = r29
            r46 = r6
            r48 = r8
            r49 = r34
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            X.AnonymousClass7WO.A00(r1, r0)
        L_0x00bf:
            return
        L_0x00c0:
            if (r3 == 0) goto L_0x00c4
            X.7Wm r28 = androidx.compose.ui.Modifier.A00
        L_0x00c4:
            if (r4 == 0) goto L_0x00c8
            X.67q r27 = X.C970267q.POST
        L_0x00c8:
            if (r5 == 0) goto L_0x00cc
            r30 = 0
        L_0x00cc:
            if (r7 == 0) goto L_0x00d0
            r29 = 0
        L_0x00d0:
            if (r61 == 0) goto L_0x036f
            X.687 r3 = X.AnonymousClass687.Middle
        L_0x00d4:
            r1 = r50
            X.687 r7 = X.AnonymousClass6MK.A00(r1, r3)
            X.67q r3 = X.C970267q.POST
            r1 = r27
            if (r1 == r3) goto L_0x00e5
            X.67q r3 = X.C970267q.REPOST_PREVIEW
            r4 = 0
            if (r1 != r3) goto L_0x00e6
        L_0x00e5:
            r4 = 1
        L_0x00e6:
            r5 = 0
            r3 = r32
            r1 = r28
            androidx.compose.ui.Modifier r10 = X.AnonymousClass73T.A00(r2, r1, r7, r3, r4)
            X.6hH r1 = X.C103106Xv.A00
            float r9 = r1.A00
            r26 = 0
            X.67q r7 = X.C970267q.TARGET_POST
            r3 = r9
            r4 = 16
            r1 = r27
            if (r1 == r7) goto L_0x00ff
            float r3 = (float) r4
        L_0x00ff:
            float r1 = (float) r4
            r45 = r1
            r25 = 0
            float r7 = (float) r5
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7K4.A05(r10, r9, r7, r3, r1)
            X.8ly r13 = X.AnonymousClass7KV.A07(r2, r5)
            r24 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1 = r24
            X.534 r12 = X.C147188nY.A0b(r2, r1)
            java.lang.Object r3 = r2.AEA(r12)
            X.534 r11 = X.AnonymousClass7DE.A07
            java.lang.Object r10 = r2.AEA(r11)
            X.534 r23 = X.AnonymousClass7DE.A0B
            r1 = r23
            java.lang.Object r9 = r2.AEA(r1)
            X.0ZU r22 = X.AnonymousClass74X.A00
            X.0YM r4 = X.C98236Es.A00(r4)
            r1 = r2
            X.7W3 r1 = (X.AnonymousClass7W3) r1
            r14 = r22
            X.C147188nY.A0w(r2, r1, r14)
            r1.A0T = r5
            X.0YP r21 = X.AnonymousClass74X.A03
            r14 = r21
            X.0YP r20 = X.AnonymousClass7Ak.A00(r2, r13, r3, r14)
            X.0YP r19 = X.AnonymousClass74X.A02
            r3 = r19
            X.0YP r10 = X.AnonymousClass7Ak.A01(r2, r10, r3)
            java.lang.Integer r18 = X.AnonymousClass7KP.A05(r2, r9, r10, r4)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.Cvb(r3)
            X.7V3 r17 = X.AnonymousClass7V3.A00
            r3 = 1727189575(0x66f2d247, float:5.733458E23)
            X.7Wm r9 = androidx.compose.ui.Modifier.A02(r2, r3)
            X.534 r13 = X.AnonymousClass6YT.A00
            r2.AEA(r13)
            X.52s r15 = X.AnonymousClass7D5.A00
            androidx.compose.ui.Modifier r14 = X.C115826vy.A01(r9, r15)
            X.799 r16 = X.AnonymousClass799.A00(r16)
            r3 = r30
            boolean r3 = X.C147188nY.A0y(r2, r3)
            java.lang.Object r4 = r1.A13()
            if (r3 != 0) goto L_0x017a
            java.lang.Object r3 = X.AnonymousClass7GN.A00
            if (r4 != r3) goto L_0x0182
        L_0x017a:
            r4 = 25
            r3 = r30
            kotlin.jvm.internal.KtLambdaShape33S0100000_I2_13 r4 = X.AnonymousClass7W3.A0H(r1, r3, r4)
        L_0x0182:
            X.0ZU r3 = X.AnonymousClass7W3.A08(r1, r4, r5)
            r4 = r16
            androidx.compose.ui.Modifier r14 = X.C117646z1.A01(r14, r4, r3)
            X.7KB r3 = X.C120537Bh.A00(r2)
            long r3 = r3.A0W
            r2.AEA(r13)
            r13 = r26
            androidx.compose.ui.Modifier r14 = X.AnonymousClass7Ac.A02(r14, r15, r13, r3)
            if (r52 != 0) goto L_0x02a9
            r3 = -690480848(0xffffffffd6d81930, float:-1.18801346E14)
            r2.Cvb(r3)
            X.C04220Ms.A0B(r14, r5)
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.Modifier.A04(r14)
            r3 = 72
            float r3 = (float) r3
            androidx.compose.ui.Modifier r14 = X.AnonymousClass7Kq.A08(r4, r3)
            long r3 = X.AnonymousClass7KB.A00(r2)
            X.8fo r17 = X.C102746Wj.A00
            r13 = r17
            androidx.compose.ui.Modifier r4 = X.C115656vh.A01(r14, r13, r3)
            r3 = 12
            float r3 = (float) r3
            r45 = r3
            androidx.compose.ui.Modifier r16 = X.AnonymousClass7K4.A05(r4, r3, r7, r7, r7)
            X.8cu r4 = X.AnonymousClass7KV.A04
            X.8jk r3 = X.C147188nY.A0U(r2)
            r15 = 48
            X.8ly r13 = X.AnonymousClass72N.A00(r3, r2, r4)
            r3 = r24
            java.lang.Object r12 = X.C147188nY.A0t(r2, r12, r3)
            java.lang.Object r14 = r2.AEA(r11)
            r3 = r23
            java.lang.Object r11 = r2.AEA(r3)
            X.0YM r4 = X.C98236Es.A00(r16)
            r3 = r22
            X.C147188nY.A0w(r2, r1, r3)
            r1.A0T = r5
            r3 = r21
            X.AnonymousClass7Ak.A02(r2, r13, r3)
            r3 = r20
            X.AnonymousClass7Ak.A02(r2, r12, r3)
            r3 = r19
            X.AnonymousClass7Ak.A02(r2, r14, r3)
            r3 = r18
            X.AnonymousClass7KP.A06(r2, r11, r3, r10, r4)
            X.7VA r10 = X.AnonymousClass7VA.A00
            r3 = -540402874(0xffffffffdfca1b46, float:-2.9126622E19)
            r2.Cvb(r3)
            androidx.compose.ui.Modifier r12 = X.AnonymousClass7Kq.A0F(r9, r15)
            X.7KB r3 = X.C120537Bh.A00(r2)
            long r3 = r3.A0b
            r11 = r32
            float r11 = (float) r11
            X.52s r11 = X.AnonymousClass7G5.A00(r11)
            androidx.compose.ui.Modifier r4 = X.C115656vh.A01(r12, r11, r3)
            if (r51 == 0) goto L_0x0291
            r3 = 294899771(0x1193d03b, float:2.3320843E-28)
            r2.Cvb(r3)
            r3 = r31
            X.6uo r39 = X.C120577Bm.A01(r2, r3)
            r43 = 56
            r44 = 120(0x78, float:1.68E-43)
            r35 = r2
            r36 = r25
            r37 = r4
            r38 = r25
            r40 = r25
            r41 = r25
            r42 = r26
            X.C97846Dc.A00(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
        L_0x0241:
            X.AnonymousClass7W3.A0w(r1, r5)
            r4 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            androidx.compose.ui.Modifier r12 = r10.DB5(r9, r4, r3)
            long r10 = X.AnonymousClass7KB.A00(r2)
            r4 = r17
            androidx.compose.ui.Modifier r10 = X.C115656vh.A01(r12, r4, r10)
            r4 = 10
            float r4 = (float) r4
            androidx.compose.ui.Modifier r17 = X.AnonymousClass7K4.A04(r10, r4, r7)
            r4 = r0 & 14
            r10 = r4 | 384(0x180, float:5.38E-43)
            int r4 = r0 >> 6
            r4 = r4 & 112(0x70, float:1.57E-43)
            r10 = r10 | r4
            int r0 = r0 >> 3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r0
            r16 = r2
            r18 = r25
            r19 = r49
            r20 = r48
            r21 = r46
            r22 = r10
            A01(r16, r17, r18, r19, r20, r21, r22)
            if (r29 == 0) goto L_0x0286
            r0 = r45
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7K4.A05(r9, r7, r7, r0, r7)
            r0 = r29
            X.AnonymousClass6M9.A00(r2, r4, r0, r15, r5)
        L_0x0286:
            X.AnonymousClass7W3.A0v(r1, r3)
        L_0x0289:
            X.AnonymousClass7W3.A0w(r1, r5)
            X.AnonymousClass7W3.A0v(r1, r3)
            goto L_0x0095
        L_0x0291:
            r3 = 294899947(0x1193d0eb, float:2.3321266E-28)
            r2.Cvb(r3)
            r3 = 2131232748(0x7f0807ec, float:1.8081614E38)
            X.6uo r12 = X.AnonymousClass6QP.A00(r2, r3)
            r11 = 3
            r3 = r25
            androidx.compose.ui.Modifier r3 = X.AnonymousClass7Kq.A03(r3, r4, r11)
            X.C86124wJ.A1G(r2, r3, r12)
            goto L_0x0241
        L_0x02a9:
            r3 = -690479432(0xffffffffd6d81eb8, float:-1.18813224E14)
            r2.Cvb(r3)
            X.8ly r13 = X.AnonymousClass7KV.A05(r2)
            r3 = r24
            java.lang.Object r12 = X.C147188nY.A0t(r2, r12, r3)
            java.lang.Object r4 = r2.AEA(r11)
            r3 = r23
            java.lang.Object r11 = r2.AEA(r3)
            X.0YM r14 = X.C98236Es.A00(r14)
            r3 = r22
            X.C147188nY.A0w(r2, r1, r3)
            r1.A0T = r5
            r3 = r21
            X.AnonymousClass7Ak.A02(r2, r13, r3)
            r3 = r20
            X.AnonymousClass7Ak.A02(r2, r12, r3)
            r3 = r19
            X.AnonymousClass7Ak.A02(r2, r4, r3)
            r3 = r18
            X.AnonymousClass7KP.A06(r2, r11, r3, r10, r14)
            r3 = 85756129(0x51c88e1, float:7.3602254E-36)
            r2.Cvb(r3)
            int r14 = r0 >> 6
            r3 = 1
            r4 = r33
            X.6uo r39 = X.C120577Bm.A01(r2, r4)
            X.54z r4 = X.AnonymousClass7Kq.A02
            androidx.compose.ui.Modifier r12 = r9.Cx6(r4)
            r10 = 216(0xd8, float:3.03E-43)
            float r11 = (float) r10
            r10 = 2143289344(0x7fc00000, float:NaN)
            androidx.compose.ui.Modifier r11 = X.AnonymousClass7Kq.A0C(r12, r10, r11)
            r10 = 1072790539(0x3ff17c0b, float:1.886598)
            androidx.compose.ui.Modifier r13 = X.C97876Dh.A00(r11, r10, r3)
            long r10 = X.AnonymousClass7KB.A00(r2)
            X.8fo r12 = X.C102746Wj.A00
            androidx.compose.ui.Modifier r37 = X.C115656vh.A01(r13, r12, r10)
            X.8n1 r40 = X.AnonymousClass74L.A00
            r43 = 24632(0x6038, float:3.4517E-41)
            r44 = 104(0x68, float:1.46E-43)
            r35 = r2
            r36 = r25
            r38 = r25
            r41 = r25
            r42 = r26
            X.C97846Dc.A00(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            androidx.compose.ui.Modifier r4 = r9.Cx6(r4)
            long r10 = X.AnonymousClass7KB.A00(r2)
            androidx.compose.ui.Modifier r10 = X.C115656vh.A01(r4, r12, r10)
            r4 = r45
            androidx.compose.ui.Modifier r11 = X.AnonymousClass7K4.A03(r10, r4)
            r16 = r0 & 14
            r4 = r14 & 112(0x70, float:1.57E-43)
            r16 = r16 | r4
            int r4 = r0 << 3
            r4 = r4 & 896(0x380, float:1.256E-42)
            r16 = r16 | r4
            int r0 = r0 >> 3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r16 = r16 | r0
            r10 = r2
            r12 = r31
            r13 = r49
            r14 = r48
            r15 = r46
            A01(r10, r11, r12, r13, r14, r15, r16)
            X.AnonymousClass7W3.A0v(r1, r3)
            if (r29 == 0) goto L_0x0289
            androidx.compose.ui.Alignment r4 = X.AnonymousClass7KV.A0D
            r0 = r17
            androidx.compose.ui.Modifier r4 = r0.A86(r4, r9)
            r0 = 12
            float r0 = (float) r0
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7K4.A05(r4, r7, r0, r0, r7)
            r0 = r29
            X.AnonymousClass6M9.A00(r2, r4, r0, r5, r5)
            goto L_0x0289
        L_0x036f:
            X.687 r3 = X.AnonymousClass687.Start
            goto L_0x00d4
        L_0x0373:
            r1 = r59 & 14
            if (r1 != 0) goto L_0x0381
            r1 = r29
            int r1 = X.C147188nY.A09(r2, r1)
            r10 = r59 | r1
            goto L_0x007d
        L_0x0381:
            r10 = r47
            goto L_0x007d
        L_0x0385:
            r1 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r58 & r1
            if (r1 != 0) goto L_0x0075
            r1 = r30
            boolean r1 = r2.ACa(r1)
            int r1 = X.C86104wH.A02(r1)
            goto L_0x0074
        L_0x0397:
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r58 & r1
            if (r1 != 0) goto L_0x006e
            r1 = r27
            boolean r1 = r2.ACY(r1)
            int r1 = X.C86104wH.A03(r1)
            goto L_0x006d
        L_0x03a9:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r58 & r1
            if (r1 != 0) goto L_0x0067
            r1 = r28
            boolean r1 = r2.ACY(r1)
            int r1 = X.C86104wH.A04(r1)
            goto L_0x0066
        L_0x03bb:
            r1 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r58
            if (r1 != 0) goto L_0x0060
            r1 = r34
            boolean r1 = r2.ACZ(r1)
            int r1 = X.C86104wH.A01(r1)
            goto L_0x005f
        L_0x03cd:
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r58
            if (r1 != 0) goto L_0x0057
            r1 = r50
            int r1 = X.C147188nY.A0K(r2, r1)
            goto L_0x0056
        L_0x03db:
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r58
            if (r1 != 0) goto L_0x0050
            r1 = r46
            int r1 = X.C147188nY.A0J(r2, r1)
            r0 = r0 | r1
            goto L_0x0050
        L_0x03eb:
            r1 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x004a
            r1 = r48
            int r1 = X.C147188nY.A0I(r2, r1)
            r0 = r0 | r1
            goto L_0x004a
        L_0x03f8:
            r1 = r6 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x0042
            r1 = r33
            int r1 = X.C147188nY.A0H(r2, r1)
            r0 = r0 | r1
            goto L_0x0042
        L_0x0405:
            r1 = r58 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x003a
            r1 = r31
            int r1 = X.C147188nY.A0G(r2, r1)
            r0 = r0 | r1
            goto L_0x003a
        L_0x0412:
            r0 = r58 & 14
            if (r0 != 0) goto L_0x0420
            r0 = r49
            int r0 = X.C147188nY.A0F(r2, r0)
            r0 = r0 | r58
            goto L_0x0032
        L_0x0420:
            r0 = r6
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117776zE.A00(X.8nY, androidx.compose.ui.Modifier, com.instagram.api.schemas.LineType, X.67q, com.instagram.common.typedurl.ImageUrl, com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String, java.lang.String, X.0ZU, X.0ZU, int, int, int, boolean):void");
    }
}
