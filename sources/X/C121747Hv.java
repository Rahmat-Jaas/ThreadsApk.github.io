package X;

import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.jvm.internal.KtLambdaShape1S1001000_I2;

/* renamed from: X.7Hv  reason: invalid class name and case insensitive filesystem */
public final class C121747Hv {
    public static final void A01(C147188nY r16, ImageUrl imageUrl, int i) {
        int i2;
        C147188nY r10 = r16;
        r10.Cvd(529490249);
        int i3 = i;
        ImageUrl imageUrl2 = imageUrl;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r10, imageUrl2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !r10.BCM()) {
            Modifier A06 = AnonymousClass7K4.A06(Modifier.A00, (float) 2, 0);
            C146288ly A07 = AnonymousClass7KV.A07(r10, false);
            Object A0p = C147188nY.A0p(r10);
            Object A0n = C147188nY.A0n(r10);
            Object A0m = C147188nY.A0m(r10);
            AnonymousClass0ZU r3 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A06);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r10;
            C147188nY.A0w(r10, r1, r3);
            AnonymousClass7W3.A0a(r10, r1, A07, A0p);
            AnonymousClass7KP.A07(r10, A0n, A0m, A00);
            r10.Cvb(1000306435);
            AnonymousClass7Bl.A02(r10, imageUrl2, (ImageUrl) null, (float) 19, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, ((i2 << 3) & 112) | 6, 60, false);
            AnonymousClass7W3.A0f(r1);
        } else {
            r10.CuJ();
        }
        C147178nW AKE = r10.AKE();
        if (AKE != null) {
            C147178nW.A02(AKE, imageUrl2, i3, 48);
        }
    }

    public static final void A02(C147188nY r9, ImageUrl imageUrl, ImageUrl imageUrl2, int i) {
        int i2;
        C147188nY r3 = r9;
        r9.Cvd(1880244732);
        ImageUrl imageUrl3 = imageUrl;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r9, imageUrl) | i;
        } else {
            i2 = i;
        }
        ImageUrl imageUrl4 = imageUrl2;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r9, imageUrl2);
        }
        if ((i2 & 91) != 18 || !r9.BCM()) {
            int i3 = i2 << 3;
            AnonymousClass7Bl.A02(r3, imageUrl3, imageUrl4, (float) 30, (float) 1, 0.75f, (i3 & 112) | 27654 | (i3 & 896), 32, false);
        } else {
            r9.CuJ();
        }
        C147178nW AKE = r3.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, imageUrl4, imageUrl3, i, 21);
        }
    }

    public static final void A03(C147188nY r11, C146798ms r12, String str, int i) {
        int i2;
        C123327Wm A02;
        AnonymousClass7W3 r6;
        r11.Cvd(-78618822);
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r11, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r11, r12);
        }
        if ((i2 & 91) != 18 || !r11.BCM()) {
            if (C04220Ms.A0I(r12, C132837ua.A00)) {
                r11.Cvb(427341150);
                A04(str, r11, i2 & 14);
            } else {
                if (C04220Ms.A0I(r12, C132847ub.A00)) {
                    float f = (float) 0;
                    Modifier A05 = AnonymousClass7K4.A05(Modifier.A02(r11, 427341221), f, (float) 4, f, f);
                    C141758cu r1 = AnonymousClass7KV.A04;
                    r11.Cvb(693286680);
                    C146288ly A00 = AnonymousClass72N.A00(AnonymousClass7J3.A01, r11, r1);
                    Object A0q = C147188nY.A0q(r11, -1323940314);
                    Object A0n = C147188nY.A0n(r11);
                    Object A0m = C147188nY.A0m(r11);
                    AnonymousClass0ZU r13 = AnonymousClass74X.A00;
                    AnonymousClass0YM A002 = C98236Es.A00(A05);
                    r6 = (AnonymousClass7W3) r11;
                    C147188nY.A0w(r11, r6, r13);
                    AnonymousClass7W3.A0a(r11, r6, A00, A0q);
                    AnonymousClass7KP.A07(r11, A0n, A0m, A002);
                    r11.Cvb(2032429461);
                } else {
                    if (r12 instanceof AnonymousClass5MU) {
                        A02 = Modifier.A02(r11, 427341444);
                        float f2 = (float) 0;
                        Modifier A052 = AnonymousClass7K4.A05(A02, f2, (float) 4, f2, f2);
                        C141758cu r14 = AnonymousClass7KV.A04;
                        r11.Cvb(693286680);
                        C146288ly A003 = AnonymousClass72N.A00(AnonymousClass7J3.A01, r11, r14);
                        Object A0q2 = C147188nY.A0q(r11, -1323940314);
                        Object A0n2 = C147188nY.A0n(r11);
                        Object A0m2 = C147188nY.A0m(r11);
                        AnonymousClass0ZU r15 = AnonymousClass74X.A00;
                        AnonymousClass0YM A004 = C98236Es.A00(A052);
                        r6 = (AnonymousClass7W3) r11;
                        C147188nY.A0w(r11, r6, r15);
                        AnonymousClass7W3.A0a(r11, r6, A003, A0q2);
                        AnonymousClass7KP.A07(r11, A0n2, A0m2, A004);
                        r11.Cvb(2067253398);
                        A01(r11, ((AnonymousClass5MU) r12).A00, 0);
                    } else if (r12 instanceof AnonymousClass5MV) {
                        A02 = Modifier.A02(r11, 427341786);
                        float f3 = (float) 0;
                        Modifier A053 = AnonymousClass7K4.A05(A02, f3, (float) 4, f3, f3);
                        C141758cu r16 = AnonymousClass7KV.A04;
                        r11.Cvb(693286680);
                        C146288ly A005 = AnonymousClass72N.A00(AnonymousClass7J3.A01, r11, r16);
                        Object A0q3 = C147188nY.A0q(r11, -1323940314);
                        Object A0n3 = C147188nY.A0n(r11);
                        Object A0m3 = C147188nY.A0m(r11);
                        AnonymousClass0ZU r17 = AnonymousClass74X.A00;
                        AnonymousClass0YM A006 = C98236Es.A00(A053);
                        r6 = (AnonymousClass7W3) r11;
                        C147188nY.A0w(r11, r6, r17);
                        AnonymousClass7W3.A0a(r11, r6, A005, A0q3);
                        AnonymousClass7KP.A07(r11, A0n3, A0m3, A006);
                        r11.Cvb(2102077335);
                        AnonymousClass5MV r0 = (AnonymousClass5MV) r12;
                        A02(r11, r0.A00, r0.A01, 0);
                    } else {
                        r11.Cvb(427342203);
                    }
                    C115686vk.A01(r11, AnonymousClass7Kq.A0A(A02, (float) 6), 6);
                }
                A04(str, r11, i2 & 14);
                AnonymousClass7W3.A0f(r6);
            }
            AnonymousClass7W3.A0y(r11);
        } else {
            r11.CuJ();
        }
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            C147178nW.A06(AKE, r12, str, i, 5);
        }
    }

    public static final void A04(String str, C147188nY r19, int i) {
        int i2;
        C147188nY r3 = r19;
        r3.Cvd(1495189499);
        int i3 = i;
        String str2 = str;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r3, str2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !r3.BCM()) {
            AnonymousClass7I9.A02(r3, (Modifier) null, AnonymousClass7J9.A01(r3), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str2, 0, 2, 2, 805306368 | (i2 & 14), 6, 506, AnonymousClass7KB.A03(r3), 0, false);
        } else {
            r3.CuJ();
        }
        C147178nW AKE = r3.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S1001000_I2(str2, i3, 5));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147188nY r41, androidx.compose.ui.Modifier r42, com.instagram.common.typedurl.ImageUrl r43, X.C146798ms r44, X.AnonymousClass5I7 r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, X.AnonymousClass0ZU r49, X.AnonymousClass0YY r50, X.AnonymousClass0YM r51, int r52, int r53, int r54, boolean r55, boolean r56, boolean r57, boolean r58) {
        /*
            r34 = r46
            r25 = r42
            r17 = r49
            r32 = r47
            r19 = r45
            r23 = r55
            r22 = r56
            r21 = r57
            r20 = r58
            r58 = r43
            r18 = r44
            r35 = r50
            r33 = r48
            r16 = r51
            r1 = r58
            r0 = r34
            boolean r57 = X.AnonymousClass0wJ.A1Y(r1, r0)
            r0 = -358959659(0xffffffffea9ab5d5, float:-9.351663E25)
            r7 = r41
            r7.Cvd(r0)
            r4 = r54
            r0 = r54 & 1
            r6 = r52
            if (r0 == 0) goto L_0x0222
            r1 = r52 | 6
        L_0x0036:
            r0 = r54 & 2
            if (r0 == 0) goto L_0x0215
            r1 = r1 | 48
        L_0x003c:
            r24 = r54 & 4
            if (r24 == 0) goto L_0x0208
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0042:
            r29 = r54 & 8
            r14 = 2048(0x800, float:2.87E-42)
            if (r29 == 0) goto L_0x01fb
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x004a:
            r28 = r54 & 16
            if (r28 == 0) goto L_0x01eb
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0050:
            r27 = r54 & 32
            if (r27 == 0) goto L_0x01dd
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x0056:
            r1 = r1 | r0
        L_0x0057:
            r15 = r54 & 64
            if (r15 == 0) goto L_0x01cb
            r0 = 1572864(0x180000, float:2.204052E-39)
        L_0x005d:
            r1 = r1 | r0
        L_0x005e:
            r13 = r4 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x01b9
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0064:
            r1 = r1 | r0
        L_0x0065:
            r12 = r4 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x01a7
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x006b:
            r1 = r1 | r0
        L_0x006c:
            r11 = r4 & 512(0x200, float:7.175E-43)
            r26 = 805306368(0x30000000, float:4.656613E-10)
            if (r11 == 0) goto L_0x0194
            r1 = r1 | r26
        L_0x0074:
            r10 = r4 & 1024(0x400, float:1.435E-42)
            r5 = r53
            if (r10 == 0) goto L_0x0183
            r9 = r53 | 6
        L_0x007c:
            r8 = r4 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0176
            r9 = r9 | 48
        L_0x0082:
            r3 = r4 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L_0x0169
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x0088:
            r2 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0158
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x008e:
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r14 = r1 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r14 != r0) goto L_0x00d9
            r0 = r9 & 5851(0x16db, float:8.199E-42)
            r14 = r0
            r0 = 1170(0x492, float:1.64E-42)
            if (r14 != r0) goto L_0x00d9
            boolean r0 = r7.BCM()
            if (r0 == 0) goto L_0x00d9
            r7.CuJ()
        L_0x00a8:
            X.8nW r1 = r7.AKE()
            if (r1 == 0) goto L_0x00d8
            X.8UF r0 = new X.8UF
            r26 = r58
            r27 = r18
            r28 = r19
            r29 = r34
            r30 = r32
            r31 = r33
            r32 = r17
            r33 = r35
            r34 = r16
            r35 = r6
            r36 = r5
            r37 = r4
            r38 = r23
            r39 = r22
            r40 = r21
            r41 = r20
            r24 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            X.AnonymousClass7WO.A00(r1, r0)
        L_0x00d8:
            return
        L_0x00d9:
            if (r24 == 0) goto L_0x00dd
            X.7Wm r25 = androidx.compose.ui.Modifier.A00
        L_0x00dd:
            r24 = 0
            if (r29 == 0) goto L_0x00e3
            r32 = r24
        L_0x00e3:
            if (r28 == 0) goto L_0x00e7
            r33 = r24
        L_0x00e7:
            r14 = r23
            r0 = r27
            boolean r23 = X.C18240wQ.A1R(r0, r14)
            r0 = r22
            boolean r22 = X.C18240wQ.A1R(r15, r0)
            r0 = r21
            boolean r21 = X.C18240wQ.A1R(r13, r0)
            r0 = r20
            boolean r20 = X.C18240wQ.A1R(r12, r0)
            if (r11 == 0) goto L_0x0105
            X.5I7 r19 = X.AnonymousClass5I7.A04
        L_0x0105:
            if (r10 == 0) goto L_0x0109
            X.7ua r18 = X.C132837ua.A00
        L_0x0109:
            if (r8 == 0) goto L_0x010d
            X.4cG r17 = X.C75454cG.A00
        L_0x010d:
            if (r3 == 0) goto L_0x0111
            r35 = r24
        L_0x0111:
            if (r2 == 0) goto L_0x0115
            X.0YM r16 = X.AnonymousClass30i.A00
        L_0x0115:
            r43 = 0
            X.8U5 r2 = new X.8U5
            r29 = r58
            r30 = r18
            r31 = r19
            r36 = r16
            r37 = r1
            r38 = r9
            r39 = r23
            r40 = r22
            r41 = r21
            r42 = r20
            r27 = r2
            r28 = r25
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r0 = 762634416(0x2d74e0b0, float:1.3919685E-11)
            X.8sI r50 = X.AnonymousClass7JR.A00(r7, r2, r0)
            int r0 = r9 >> 3
            r51 = r0 & 14
            r51 = r51 | r26
            r53 = 0
            r52 = 510(0x1fe, float:7.15E-43)
            r44 = r43
            r45 = r43
            r46 = r7
            r47 = r43
            r48 = r43
            r49 = r17
            r55 = r53
            X.AnonymousClass70T.A00(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r55, r57)
            goto L_0x00a8
        L_0x0158:
            r0 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x008e
            r0 = r16
            boolean r0 = r7.ACa(r0)
            if (r0 != 0) goto L_0x0166
            r14 = 1024(0x400, float:1.435E-42)
        L_0x0166:
            r9 = r9 | r14
            goto L_0x008e
        L_0x0169:
            r0 = r5 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0088
            r0 = r35
            int r0 = X.C147188nY.A0B(r7, r0)
            r9 = r9 | r0
            goto L_0x0088
        L_0x0176:
            r0 = r53 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0082
            r0 = r17
            int r0 = X.C147188nY.A0A(r7, r0)
            r9 = r9 | r0
            goto L_0x0082
        L_0x0183:
            r0 = r53 & 14
            if (r0 != 0) goto L_0x0191
            r0 = r18
            int r0 = X.C147188nY.A0F(r7, r0)
            r9 = r53 | r0
            goto L_0x007c
        L_0x0191:
            r9 = r5
            goto L_0x007c
        L_0x0194:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r52 & r0
            if (r0 != 0) goto L_0x0074
            r0 = r19
            boolean r0 = r7.ACY(r0)
            int r0 = X.C86104wH.A02(r0)
            r1 = r1 | r0
            goto L_0x0074
        L_0x01a7:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r52 & r0
            if (r0 != 0) goto L_0x006c
            r0 = r20
            boolean r0 = r7.ACZ(r0)
            int r0 = X.C86104wH.A03(r0)
            goto L_0x006b
        L_0x01b9:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r52 & r0
            if (r0 != 0) goto L_0x0065
            r0 = r21
            boolean r0 = r7.ACZ(r0)
            int r0 = X.C86104wH.A04(r0)
            goto L_0x0064
        L_0x01cb:
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r52 & r0
            if (r0 != 0) goto L_0x005e
            r0 = r22
            boolean r0 = r7.ACZ(r0)
            int r0 = X.C86104wH.A01(r0)
            goto L_0x005d
        L_0x01dd:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r52 & r0
            if (r0 != 0) goto L_0x0057
            r0 = r23
            int r0 = X.C147188nY.A0Q(r7, r0)
            goto L_0x0056
        L_0x01eb:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r52 & r0
            if (r0 != 0) goto L_0x0050
            r0 = r33
            int r0 = X.C147188nY.A0J(r7, r0)
            r1 = r1 | r0
            goto L_0x0050
        L_0x01fb:
            r0 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x004a
            r0 = r32
            int r0 = X.C147188nY.A0I(r7, r0)
            r1 = r1 | r0
            goto L_0x004a
        L_0x0208:
            r0 = r6 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0042
            r0 = r25
            int r0 = X.C147188nY.A0H(r7, r0)
            r1 = r1 | r0
            goto L_0x0042
        L_0x0215:
            r0 = r52 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x003c
            r0 = r34
            int r0 = X.C147188nY.A0G(r7, r0)
            r1 = r1 | r0
            goto L_0x003c
        L_0x0222:
            r0 = r52 & 14
            if (r0 != 0) goto L_0x022e
            int r1 = X.C147188nY.A0F(r7, r1)
            r1 = r1 | r52
            goto L_0x0036
        L_0x022e:
            r1 = r6
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121747Hv.A00(X.8nY, androidx.compose.ui.Modifier, com.instagram.common.typedurl.ImageUrl, X.8ms, X.5I7, java.lang.String, java.lang.String, java.lang.String, X.0ZU, X.0YY, X.0YM, int, int, int, boolean, boolean, boolean, boolean):void");
    }
}
