package X;

import androidx.compose.animation.core.MutableTransitionState;

/* renamed from: X.7JP  reason: invalid class name */
public final class AnonymousClass7JP {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C1203679w r20, X.C1203779x r21, androidx.compose.animation.core.MutableTransitionState r22, X.C142758fX r23, X.C147188nY r24, androidx.compose.ui.Modifier r25, java.lang.String r26, X.AnonymousClass0YM r27, int r28, int r29) {
        /*
            r13 = r22
            r4 = r26
            r1 = r21
            r15 = r20
            r12 = r23
            r14 = r25
            boolean r21 = X.AnonymousClass0wJ.A1Y(r12, r13)
            r0 = 6
            r3 = r27
            X.C04220Ms.A0B(r3, r0)
            r0 = -850656618(0xffffffffcd4c0296, float:-2.13920096E8)
            r5 = r24
            r5.Cvd(r0)
            r20 = r29
            r0 = r29 & 1
            r2 = r28
            if (r0 == 0) goto L_0x0100
            r0 = r28 | 48
        L_0x0028:
            r8 = r29 & 2
            if (r8 == 0) goto L_0x00f5
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x002e:
            r9 = r29 & 4
            if (r9 == 0) goto L_0x00ea
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0034:
            r11 = r29 & 8
            r6 = 57344(0xe000, float:8.0356E-41)
            if (r11 == 0) goto L_0x00df
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x003d:
            r10 = r29 & 16
            r6 = 458752(0x70000, float:6.42848E-40)
            if (r10 == 0) goto L_0x00d5
            r6 = 196608(0x30000, float:2.75506E-40)
        L_0x0045:
            r0 = r0 | r6
        L_0x0046:
            r6 = r29 & 32
            if (r6 == 0) goto L_0x00c5
            r6 = 1572864(0x180000, float:2.204052E-39)
        L_0x004c:
            r0 = r0 | r6
        L_0x004d:
            r6 = 2995921(0x2db6d1, float:4.19818E-39)
            r7 = r0 & r6
            r6 = 599184(0x92490, float:8.39636E-40)
            if (r7 != r6) goto L_0x0078
            boolean r6 = r5.BCM()
            if (r6 == 0) goto L_0x0078
            r5.CuJ()
        L_0x0060:
            X.8nW r0 = r5.AKE()
            if (r0 == 0) goto L_0x0077
            kotlin.jvm.internal.KtLambdaShape0S1602000_I2 r11 = new kotlin.jvm.internal.KtLambdaShape0S1602000_I2
            r19 = r2
            r18 = r4
            r17 = r3
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.7WO r0 = (X.AnonymousClass7WO) r0
            r0.A06 = r11
        L_0x0077:
            return
        L_0x0078:
            if (r8 == 0) goto L_0x007c
            X.7Wm r14 = androidx.compose.ui.Modifier.A00
        L_0x007c:
            r8 = 3
            r7 = 0
            if (r9 == 0) goto L_0x008e
            r6 = 15
            X.79w r9 = X.AnonymousClass7KU.A02(r7, r7, r6)
            X.79w r6 = X.AnonymousClass7KU.A01(r7, r8)
            X.79w r15 = r9.A00(r6)
        L_0x008e:
            if (r11 == 0) goto L_0x009e
            r1 = 15
            X.79x r6 = X.AnonymousClass7KU.A07(r7, r7, r1)
            X.79x r1 = X.AnonymousClass7KU.A06(r7, r8)
            X.79x r1 = r6.A00(r1)
        L_0x009e:
            if (r10 == 0) goto L_0x00a2
            java.lang.String r4 = "AnimatedVisibility"
        L_0x00a2:
            int r7 = r0 >> 3
            X.6vT r24 = X.AnonymousClass7FH.A01(r13, r5, r4)
            X.4h1 r27 = X.C77564h1.A00
            r6 = r0 & 896(0x380, float:1.256E-42)
            r6 = r6 | 48
            int r29 = X.C86134wK.A05(r0, r6)
            r0 = 458752(0x70000, float:6.42848E-40)
            r7 = r7 & r0
            r29 = r29 | r7
            r22 = r15
            r23 = r1
            r25 = r5
            r26 = r14
            r28 = r3
            A03(r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0060
        L_0x00c5:
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r28 & r6
            if (r6 != 0) goto L_0x004d
            boolean r6 = r5.ACY(r3)
            int r6 = X.C86104wH.A01(r6)
            goto L_0x004c
        L_0x00d5:
            r6 = r28 & r6
            if (r6 != 0) goto L_0x0046
            int r6 = X.C147188nY.A0K(r5, r4)
            goto L_0x0045
        L_0x00df:
            r6 = r28 & r6
            if (r6 != 0) goto L_0x003d
            int r6 = X.C147188nY.A0J(r5, r1)
            r0 = r0 | r6
            goto L_0x003d
        L_0x00ea:
            r6 = r2 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0034
            int r6 = X.C147188nY.A0I(r5, r15)
            r0 = r0 | r6
            goto L_0x0034
        L_0x00f5:
            r6 = r2 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x002e
            int r6 = X.C147188nY.A0H(r5, r14)
            r0 = r0 | r6
            goto L_0x002e
        L_0x0100:
            r0 = r28 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x010c
            int r0 = X.C147188nY.A0G(r5, r13)
            r0 = r0 | r28
            goto L_0x0028
        L_0x010c:
            r0 = r2
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JP.A01(X.79w, X.79x, androidx.compose.animation.core.MutableTransitionState, X.8fX, X.8nY, androidx.compose.ui.Modifier, java.lang.String, X.0YM, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C1203679w r16, X.C1203779x r17, androidx.compose.animation.core.MutableTransitionState r18, X.C147188nY r19, androidx.compose.ui.Modifier r20, java.lang.String r21, X.AnonymousClass0YM r22, int r23, int r24) {
        /*
            r5 = r21
            r1 = r17
            r2 = r16
            r3 = r20
            r0 = 0
            r6 = r18
            X.C04220Ms.A0B(r6, r0)
            r0 = -222898426(0xfffffffff2b6d706, float:-7.243036E30)
            r7 = r19
            r7.Cvd(r0)
            r16 = r24
            r0 = r24 & 1
            r4 = r23
            if (r0 == 0) goto L_0x00ea
            r8 = r23 | 6
        L_0x0020:
            r11 = r24 & 2
            if (r11 == 0) goto L_0x00df
            r8 = r8 | 48
        L_0x0026:
            r15 = r24 & 4
            if (r15 == 0) goto L_0x00d4
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x002c:
            r14 = r24 & 8
            if (r14 == 0) goto L_0x00c9
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0032:
            r13 = r24 & 16
            r0 = 57344(0xe000, float:8.0356E-41)
            if (r13 == 0) goto L_0x00be
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x003b:
            r0 = r24 & 32
            r12 = 458752(0x70000, float:6.42848E-40)
            r9 = r22
            if (r0 == 0) goto L_0x00b5
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x0045:
            r8 = r8 | r0
        L_0x0046:
            r10 = 374491(0x5b6db, float:5.24774E-40)
            r10 = r10 & r8
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r0) goto L_0x006e
            boolean r0 = r7.BCM()
            if (r0 == 0) goto L_0x006e
            r7.CuJ()
        L_0x0058:
            X.8nW r0 = r7.AKE()
            if (r0 == 0) goto L_0x006d
            X.8SA r8 = new X.8SA
            r15 = r4
            r14 = r9
            r13 = r5
            r12 = r3
            r11 = r6
            r10 = r1
            r9 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            X.AnonymousClass7WO.A00(r0, r8)
        L_0x006d:
            return
        L_0x006e:
            if (r11 == 0) goto L_0x0072
            X.7Wm r3 = androidx.compose.ui.Modifier.A00
        L_0x0072:
            r11 = 3
            r10 = 0
            if (r15 == 0) goto L_0x0082
            X.79w r2 = X.AnonymousClass7KU.A01(r10, r11)
            X.79w r0 = X.AnonymousClass7KU.A00()
            X.79w r2 = r2.A00(r0)
        L_0x0082:
            if (r14 == 0) goto L_0x0090
            X.79x r1 = X.AnonymousClass7KU.A06(r10, r11)
            X.79x r0 = X.AnonymousClass7KU.A05()
            X.79x r1 = r1.A00(r0)
        L_0x0090:
            if (r13 == 0) goto L_0x0094
            java.lang.String r5 = "AnimatedVisibility"
        L_0x0094:
            X.6vT r19 = X.AnonymousClass7FH.A01(r6, r7, r5)
            X.4h4 r22 = X.C77594h4.A00
            int r10 = r8 << 3
            r0 = r10 & 896(0x380, float:1.256E-42)
            r0 = r0 | 48
            int r24 = X.C86134wK.A05(r10, r0)
            r8 = r8 & r12
            r24 = r24 | r8
            r17 = r2
            r18 = r1
            r20 = r7
            r21 = r3
            r23 = r9
            A03(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0058
        L_0x00b5:
            r0 = r23 & r12
            if (r0 != 0) goto L_0x0046
            int r0 = X.C147188nY.A0K(r7, r9)
            goto L_0x0045
        L_0x00be:
            r0 = r23 & r0
            if (r0 != 0) goto L_0x003b
            int r0 = X.C147188nY.A0J(r7, r5)
            r8 = r8 | r0
            goto L_0x003b
        L_0x00c9:
            r0 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0032
            int r0 = X.C147188nY.A0I(r7, r1)
            r8 = r8 | r0
            goto L_0x0032
        L_0x00d4:
            r0 = r4 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x002c
            int r0 = X.C147188nY.A0H(r7, r2)
            r8 = r8 | r0
            goto L_0x002c
        L_0x00df:
            r0 = r23 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0026
            int r0 = X.C147188nY.A0G(r7, r3)
            r8 = r8 | r0
            goto L_0x0026
        L_0x00ea:
            r0 = r23 & 14
            if (r0 != 0) goto L_0x00f6
            int r8 = X.C147188nY.A0F(r7, r6)
            r8 = r8 | r23
            goto L_0x0020
        L_0x00f6:
            r8 = r4
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JP.A02(X.79w, X.79x, androidx.compose.animation.core.MutableTransitionState, X.8nY, androidx.compose.ui.Modifier, java.lang.String, X.0YM, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C1203679w r17, X.C1203779x r18, X.C115556vT r19, X.C147188nY r20, androidx.compose.ui.Modifier r21, X.AnonymousClass0YY r22, X.AnonymousClass0YM r23, int r24, int r25) {
        /*
            r9 = r19
            r11 = r22
            r13 = r18
            r12 = r17
            r10 = r21
            boolean r17 = X.AnonymousClass0wJ.A1Z(r9, r11)
            r0 = 5
            r14 = r23
            X.C04220Ms.A0B(r14, r0)
            r0 = 1031950689(0x3d825161, float:0.06363178)
            r1 = r20
            r1.Cvd(r0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r16 = r25
            r0 = r25 & r0
            r15 = r24
            if (r0 == 0) goto L_0x00e5
            r2 = r24 | 6
        L_0x0028:
            r0 = r25 & 1
            if (r0 == 0) goto L_0x00da
            r2 = r2 | 48
        L_0x002e:
            r4 = r25 & 2
            if (r4 == 0) goto L_0x00cf
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0034:
            r8 = r25 & 4
            if (r8 == 0) goto L_0x00c4
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x003a:
            r7 = r25 & 8
            r6 = 57344(0xe000, float:8.0356E-41)
            if (r7 == 0) goto L_0x00ba
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0043:
            r3 = r25 & 16
            r0 = 458752(0x70000, float:6.42848E-40)
            if (r3 == 0) goto L_0x00b1
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x004b:
            r2 = r2 | r0
        L_0x004c:
            r3 = 374491(0x5b6db, float:5.24774E-40)
            r3 = r3 & r2
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r3 != r0) goto L_0x006e
            boolean r0 = r1.BCM()
            if (r0 == 0) goto L_0x006e
            r1.CuJ()
        L_0x005e:
            X.8nW r0 = r1.AKE()
            if (r0 == 0) goto L_0x006d
            kotlin.jvm.internal.KtLambdaShape1S0602000_I2 r8 = new kotlin.jvm.internal.KtLambdaShape1S0602000_I2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.7WO r0 = (X.AnonymousClass7WO) r0
            r0.A06 = r8
        L_0x006d:
            return
        L_0x006e:
            if (r4 == 0) goto L_0x0072
            X.7Wm r10 = androidx.compose.ui.Modifier.A00
        L_0x0072:
            r5 = 3
            r4 = 0
            if (r8 == 0) goto L_0x0082
            X.79w r3 = X.AnonymousClass7KU.A01(r4, r5)
            X.79w r0 = X.AnonymousClass7KU.A00()
            X.79w r12 = r3.A00(r0)
        L_0x0082:
            if (r7 == 0) goto L_0x0090
            X.79x r3 = X.AnonymousClass7KU.A05()
            X.79x r0 = X.AnonymousClass7KU.A06(r4, r5)
            X.79x r13 = r3.A00(r0)
        L_0x0090:
            r0 = r2 & 14
            int r25 = X.C86114wI.A03(r2, r0)
            r0 = r2 & r6
            r25 = r25 | r0
            r0 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r0
            r25 = r25 | r2
            r18 = r12
            r19 = r13
            r20 = r9
            r21 = r1
            r22 = r10
            r23 = r11
            r24 = r14
            A03(r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x005e
        L_0x00b1:
            r0 = r24 & r0
            if (r0 != 0) goto L_0x004c
            int r0 = X.C147188nY.A0K(r1, r14)
            goto L_0x004b
        L_0x00ba:
            r0 = r24 & r6
            if (r0 != 0) goto L_0x0043
            int r0 = X.C147188nY.A0J(r1, r13)
            r2 = r2 | r0
            goto L_0x0043
        L_0x00c4:
            r0 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x003a
            int r0 = X.C147188nY.A0I(r1, r12)
            r2 = r2 | r0
            goto L_0x003a
        L_0x00cf:
            r0 = r15 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0034
            int r0 = X.C147188nY.A0H(r1, r10)
            r2 = r2 | r0
            goto L_0x0034
        L_0x00da:
            r0 = r24 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x002e
            int r0 = X.C147188nY.A0G(r1, r11)
            r2 = r2 | r0
            goto L_0x002e
        L_0x00e5:
            r0 = r24 & 14
            if (r0 != 0) goto L_0x00f1
            int r2 = X.C147188nY.A0F(r1, r9)
            r2 = r2 | r24
            goto L_0x0028
        L_0x00f1:
            r2 = r15
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JP.A04(X.79w, X.79x, X.6vT, X.8nY, androidx.compose.ui.Modifier, X.0YY, X.0YM, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C1203679w r17, X.C1203779x r18, X.C142758fX r19, X.C147188nY r20, androidx.compose.ui.Modifier r21, java.lang.String r22, X.AnonymousClass0YM r23, int r24, int r25, boolean r26) {
        /*
            r6 = r22
            r9 = r18
            r1 = r17
            r7 = r21
            r2 = 0
            r8 = r19
            r5 = r23
            X.C18230wP.A1R(r8, r2, r5)
            r0 = 1766503102(0x694ab2be, float:1.5315444E25)
            r10 = r20
            r10.Cvd(r0)
            r18 = r25
            r0 = r25 & 1
            r4 = r24
            r3 = r26
            if (r0 == 0) goto L_0x010b
            r0 = r24 | 48
        L_0x0024:
            r16 = r25 & 2
            if (r16 == 0) goto L_0x0100
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x002a:
            r13 = r25 & 4
            if (r13 == 0) goto L_0x00f5
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0030:
            r15 = r25 & 8
            r11 = 57344(0xe000, float:8.0356E-41)
            if (r15 == 0) goto L_0x00ea
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0039:
            r14 = r25 & 16
            r11 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00e0
            r11 = 196608(0x30000, float:2.75506E-40)
        L_0x0041:
            r0 = r0 | r11
        L_0x0042:
            r11 = r25 & 32
            if (r11 == 0) goto L_0x00d0
            r11 = 1572864(0x180000, float:2.204052E-39)
        L_0x0048:
            r0 = r0 | r11
        L_0x0049:
            r11 = 2995921(0x2db6d1, float:4.19818E-39)
            r12 = r0 & r11
            r11 = 599184(0x92490, float:8.39636E-40)
            if (r12 != r11) goto L_0x0078
            boolean r11 = r10.BCM()
            if (r11 == 0) goto L_0x0078
            r10.CuJ()
        L_0x005c:
            X.8nW r0 = r10.AKE()
            if (r0 == 0) goto L_0x0077
            kotlin.jvm.internal.KtLambdaShape0S1512000_I2 r10 = new kotlin.jvm.internal.KtLambdaShape0S1512000_I2
            r20 = r3
            r19 = r2
            r17 = r4
            r16 = r6
            r15 = r5
            r14 = r9
            r13 = r1
            r12 = r7
            r11 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.D9d(r10)
        L_0x0077:
            return
        L_0x0078:
            if (r16 == 0) goto L_0x007c
            X.7Wm r7 = androidx.compose.ui.Modifier.A00
        L_0x007c:
            r11 = 3
            r12 = 0
            if (r13 == 0) goto L_0x008e
            X.79w r13 = X.AnonymousClass7KU.A01(r12, r11)
            r1 = 15
            X.79w r1 = X.AnonymousClass7KU.A02(r12, r12, r1)
            X.79w r1 = r13.A00(r1)
        L_0x008e:
            if (r15 == 0) goto L_0x009e
            X.79x r11 = X.AnonymousClass7KU.A06(r12, r11)
            r9 = 15
            X.79x r9 = X.AnonymousClass7KU.A07(r12, r12, r9)
            X.79x r9 = r11.A00(r9)
        L_0x009e:
            if (r14 == 0) goto L_0x00a2
            java.lang.String r6 = "AnimatedVisibility"
        L_0x00a2:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r3)
            int r14 = r0 >> 3
            r12 = r14 & 14
            int r11 = r0 >> 12
            r11 = r11 & 112(0x70, float:1.57E-43)
            r12 = r12 | r11
            X.6vT r21 = X.AnonymousClass7FH.A02(r10, r13, r6, r12, r2)
            X.4h3 r24 = X.C77584h3.A00
            r11 = r0 & 896(0x380, float:1.256E-42)
            r11 = r11 | 48
            int r26 = X.C86134wK.A05(r0, r11)
            r0 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r0
            r26 = r26 | r14
            r19 = r1
            r20 = r9
            r22 = r10
            r23 = r7
            r25 = r5
            A03(r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x005c
        L_0x00d0:
            r11 = 3670016(0x380000, float:5.142788E-39)
            r11 = r24 & r11
            if (r11 != 0) goto L_0x0049
            boolean r11 = r10.ACY(r5)
            int r11 = X.C86104wH.A01(r11)
            goto L_0x0048
        L_0x00e0:
            r11 = r24 & r11
            if (r11 != 0) goto L_0x0042
            int r11 = X.C147188nY.A0K(r10, r6)
            goto L_0x0041
        L_0x00ea:
            r11 = r24 & r11
            if (r11 != 0) goto L_0x0039
            int r11 = X.C147188nY.A0J(r10, r9)
            r0 = r0 | r11
            goto L_0x0039
        L_0x00f5:
            r11 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0030
            int r11 = X.C147188nY.A0I(r10, r1)
            r0 = r0 | r11
            goto L_0x0030
        L_0x0100:
            r11 = r4 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x002a
            int r11 = X.C147188nY.A0H(r10, r7)
            r0 = r0 | r11
            goto L_0x002a
        L_0x010b:
            r0 = r24 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0117
            int r0 = X.C147188nY.A0M(r10, r3)
            r0 = r0 | r24
            goto L_0x0024
        L_0x0117:
            r0 = r4
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JP.A05(X.79w, X.79x, X.8fX, X.8nY, androidx.compose.ui.Modifier, java.lang.String, X.0YM, int, int, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C1203679w r16, X.C1203779x r17, X.C147188nY r18, androidx.compose.ui.Modifier r19, java.lang.String r20, X.AnonymousClass0YM r21, int r22, int r23, boolean r24) {
        /*
            r6 = r20
            r1 = r17
            r2 = r16
            r15 = r19
            r0 = 5
            r5 = r21
            X.C04220Ms.A0B(r5, r0)
            r0 = 2088733774(0x7c7f8c4e, float:5.3075257E36)
            r7 = r18
            r7.Cvd(r0)
            r21 = r23
            r0 = r23 & 1
            r3 = r24
            r4 = r22
            if (r0 == 0) goto L_0x00f9
            r8 = r22 | 6
        L_0x0022:
            r10 = r23 & 2
            if (r10 == 0) goto L_0x00ee
            r8 = r8 | 48
        L_0x0028:
            r14 = r23 & 4
            if (r14 == 0) goto L_0x00e3
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x002e:
            r13 = r23 & 8
            if (r13 == 0) goto L_0x00d8
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0034:
            r12 = r23 & 16
            r0 = 57344(0xe000, float:8.0356E-41)
            if (r12 == 0) goto L_0x00cd
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x003d:
            r0 = r23 & 32
            r11 = 458752(0x70000, float:6.42848E-40)
            if (r0 == 0) goto L_0x00c3
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x0045:
            r8 = r8 | r0
        L_0x0046:
            r9 = 374491(0x5b6db, float:5.24774E-40)
            r9 = r9 & r8
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r9 != r0) goto L_0x0075
            boolean r0 = r7.BCM()
            if (r0 == 0) goto L_0x0075
            r7.CuJ()
        L_0x0058:
            X.8nW r0 = r7.AKE()
            if (r0 == 0) goto L_0x0074
            r22 = 0
            kotlin.jvm.internal.KtLambdaShape0S1412000_I2 r14 = new kotlin.jvm.internal.KtLambdaShape0S1412000_I2
            r23 = r3
            r20 = r4
            r19 = r6
            r18 = r1
            r17 = r5
            r16 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0.D9d(r14)
        L_0x0074:
            return
        L_0x0075:
            if (r10 == 0) goto L_0x0079
            X.7Wm r15 = androidx.compose.ui.Modifier.A00
        L_0x0079:
            r10 = 3
            r9 = 0
            if (r14 == 0) goto L_0x0089
            X.79w r2 = X.AnonymousClass7KU.A01(r9, r10)
            X.79w r0 = X.AnonymousClass7KU.A00()
            X.79w r2 = r2.A00(r0)
        L_0x0089:
            if (r13 == 0) goto L_0x0097
            X.79x r1 = X.AnonymousClass7KU.A05()
            X.79x r0 = X.AnonymousClass7KU.A06(r9, r10)
            X.79x r1 = r1.A00(r0)
        L_0x0097:
            if (r12 == 0) goto L_0x009b
            java.lang.String r6 = "AnimatedVisibility"
        L_0x009b:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            r9 = r8 & 14
            int r0 = r8 >> 9
            r0 = r0 & 112(0x70, float:1.57E-43)
            r9 = r9 | r0
            r0 = 0
            X.6vT r13 = X.AnonymousClass7FH.A02(r7, r10, r6, r9, r0)
            X.4h2 r16 = X.C77574h2.A00
            int r9 = r8 << 3
            r0 = r9 & 896(0x380, float:1.256E-42)
            r0 = r0 | 48
            int r18 = X.C86134wK.A05(r9, r0)
            r8 = r8 & r11
            r18 = r18 | r8
            r11 = r2
            r12 = r1
            r14 = r7
            r17 = r5
            A03(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0058
        L_0x00c3:
            r0 = r22 & r11
            if (r0 != 0) goto L_0x0046
            int r0 = X.C147188nY.A0K(r7, r5)
            goto L_0x0045
        L_0x00cd:
            r0 = r22 & r0
            if (r0 != 0) goto L_0x003d
            int r0 = X.C147188nY.A0J(r7, r6)
            r8 = r8 | r0
            goto L_0x003d
        L_0x00d8:
            r0 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0034
            int r0 = X.C147188nY.A0I(r7, r1)
            r8 = r8 | r0
            goto L_0x0034
        L_0x00e3:
            r0 = r4 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x002e
            int r0 = X.C147188nY.A0H(r7, r2)
            r8 = r8 | r0
            goto L_0x002e
        L_0x00ee:
            r0 = r22 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0028
            int r0 = X.C147188nY.A0G(r7, r15)
            r8 = r8 | r0
            goto L_0x0028
        L_0x00f9:
            r0 = r22 & 14
            if (r0 != 0) goto L_0x0105
            int r8 = X.C147188nY.A0L(r7, r3)
            r8 = r8 | r22
            goto L_0x0022
        L_0x0105:
            r8 = r4
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JP.A06(X.79w, X.79x, X.8nY, androidx.compose.ui.Modifier, java.lang.String, X.0YM, int, int, boolean):void");
    }

    public static final AnonymousClass677 A00(C115556vT r3, C147188nY r4, Object obj, AnonymousClass0YY r6) {
        AnonymousClass677 r0;
        Object value;
        r4.Cvb(361571134);
        r4.CvO(-721837504, r3);
        if (C86104wH.A1X(r3.A02)) {
            if (!AnonymousClass0wJ.A1X(r6.invoke(obj))) {
                value = r6.invoke(MutableTransitionState.A00(r3));
            }
            r0 = AnonymousClass677.Visible;
            AnonymousClass7W3.A0g((AnonymousClass7W3) r4);
            return r0;
        }
        AnonymousClass7W3 A0Y = C147188nY.A0Y(r4);
        Object A13 = A0Y.A13();
        if (A13 == AnonymousClass7GN.A00) {
            A13 = AnonymousClass7WR.A00(A0Y, C18180wK.A0X());
        }
        AnonymousClass7W3.A0w(A0Y, false);
        C147368pE r1 = (C147368pE) A13;
        if (AnonymousClass0wJ.A1X(r6.invoke(MutableTransitionState.A00(r3)))) {
            C147368pE.A04(r1, true);
        }
        if (!AnonymousClass0wJ.A1X(r6.invoke(obj))) {
            value = r1.getValue();
        }
        r0 = AnonymousClass677.Visible;
        AnonymousClass7W3.A0g((AnonymousClass7W3) r4);
        return r0;
        if (AnonymousClass0wJ.A1X(value)) {
            r0 = AnonymousClass677.PostExit;
        } else {
            r0 = AnonymousClass677.PreEnter;
        }
        AnonymousClass7W3.A0g((AnonymousClass7W3) r4);
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x030e, code lost:
        if (r9 == null) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x032f, code lost:
        if (r9 == null) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0436, code lost:
        if (r10 == null) goto L_0x043f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x046b, code lost:
        if (r10 != null) goto L_0x046d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0498, code lost:
        if (r6 != null) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0549, code lost:
        if (r6 != null) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x054d, code lost:
        if (r6 != null) goto L_0x04a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0551, code lost:
        r6 = X.AnonymousClass79F.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x055f, code lost:
        if (r6 != null) goto L_0x0474;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0563, code lost:
        r10 = X.AnonymousClass79F.A01;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x055e  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x057b  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x05b9  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C1203679w r37, X.C1203779x r38, X.C115556vT r39, X.C147188nY r40, androidx.compose.ui.Modifier r41, X.AnonymousClass0YY r42, X.AnonymousClass0YM r43, int r44) {
        /*
            r0 = 808253933(0x302cf9ed, float:6.29284E-10)
            r3 = r40
            r3.Cvd(r0)
            r25 = r44
            r0 = r44 & 14
            r4 = r39
            if (r0 != 0) goto L_0x05f0
            int r15 = X.C147188nY.A0F(r3, r4)
            r15 = r15 | r44
        L_0x0016:
            r0 = r44 & 112(0x70, float:1.57E-43)
            r40 = r42
            if (r0 != 0) goto L_0x0023
            r0 = r40
            int r0 = X.C147188nY.A0G(r3, r0)
            r15 = r15 | r0
        L_0x0023:
            r0 = r25
            r0 = r0 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0030
            r0 = r41
            int r0 = X.C147188nY.A0H(r3, r0)
            r15 = r15 | r0
        L_0x0030:
            r0 = r25
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r26 = r37
            if (r0 != 0) goto L_0x003f
            r0 = r26
            int r0 = X.C147188nY.A0I(r3, r0)
            r15 = r15 | r0
        L_0x003f:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r44 & r0
            r27 = r38
            if (r0 != 0) goto L_0x004f
            r0 = r27
            int r0 = X.C147188nY.A0J(r3, r0)
            r15 = r15 | r0
        L_0x004f:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r44
            r39 = r43
            if (r0 != 0) goto L_0x005e
            r0 = r39
            int r0 = X.C147188nY.A0K(r3, r0)
            r15 = r15 | r0
        L_0x005e:
            r1 = 374491(0x5b6db, float:5.24774E-40)
            r1 = r1 & r15
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r0) goto L_0x008e
            boolean r0 = r3.BCM()
            if (r0 == 0) goto L_0x008e
            r3.CuJ()
        L_0x0070:
            X.8nW r1 = r3.AKE()
            if (r1 == 0) goto L_0x008d
            r10 = 1
            kotlin.jvm.internal.KtLambdaShape4S0601000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape4S0601000_I2
            r2 = r0
            r3 = r4
            r4 = r41
            r5 = r40
            r6 = r27
            r7 = r39
            r8 = r26
            r9 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.D9d(r0)
        L_0x008d:
            return
        L_0x008e:
            r7 = r15 & 14
            r9 = 1157296644(0x44faf204, float:2007.563)
            boolean r0 = X.C147188nY.A0z(r3, r4, r9)
            r2 = r3
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            java.lang.Object r10 = r2.A13()
            if (r0 != 0) goto L_0x00a4
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r10 != r0) goto L_0x00b2
        L_0x00a4:
            java.lang.Object r1 = androidx.compose.animation.core.MutableTransitionState.A00(r4)
            r0 = r40
            java.lang.Object r0 = r0.invoke(r1)
            androidx.compose.runtime.ParcelableSnapshotMutableState r10 = X.AnonymousClass7WR.A00(r2, r0)
        L_0x00b2:
            r1 = 0
            X.AnonymousClass7W3.A0w(r2, r1)
            X.8pE r10 = (X.C147368pE) r10
            X.8pE r5 = r4.A06
            java.lang.Object r6 = r5.getValue()
            r0 = r40
            java.lang.Object r0 = r0.invoke(r6)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 != 0) goto L_0x00dc
            java.lang.Object r0 = r10.getValue()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 != 0) goto L_0x00dc
            X.8pE r0 = r4.A02
            boolean r0 = X.C86104wH.A1X(r0)
            if (r0 == 0) goto L_0x0070
        L_0x00dc:
            r11 = r7 | 48
            r0 = 1215497572(0x48730564, float:248853.56)
            r3.Cvb(r0)
            r14 = r11 & 14
            boolean r0 = X.C147188nY.A0z(r3, r4, r9)
            java.lang.Object r8 = r2.A13()
            if (r0 != 0) goto L_0x00f4
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r8 != r0) goto L_0x00fb
        L_0x00f4:
            java.lang.Object r8 = androidx.compose.animation.core.MutableTransitionState.A00(r4)
            r2.A14(r8)
        L_0x00fb:
            X.AnonymousClass7W3.A0w(r2, r1)
            X.8pE r7 = r4.A02
            boolean r0 = X.C86104wH.A1X(r7)
            if (r0 == 0) goto L_0x010a
            java.lang.Object r8 = androidx.compose.animation.core.MutableTransitionState.A00(r4)
        L_0x010a:
            r6 = -1220581778(0xffffffffb73f666e, float:-1.1408336E-5)
            r3.Cvb(r6)
            r0 = r40
            X.677 r13 = A00(r4, r3, r8, r0)
            java.lang.Object r5 = X.AnonymousClass7W3.A06(r2, r5)
            r3.Cvb(r6)
            X.677 r12 = A00(r4, r3, r5, r0)
            X.AnonymousClass7W3.A0w(r2, r1)
            int r0 = r11 << 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r14 = r14 | r0
            java.lang.String r11 = "EnterExitTransition"
            r6 = 0
            r0 = -198307638(0xfffffffff42e10ca, float:-5.5163585E31)
            r3.Cvb(r0)
            boolean r5 = X.C147188nY.A0z(r3, r4, r9)
            java.lang.Object r0 = r2.A13()
            if (r5 != 0) goto L_0x0140
            java.lang.Object r5 = X.AnonymousClass7GN.A00
            if (r0 != r5) goto L_0x0155
        L_0x0140:
            androidx.compose.animation.core.MutableTransitionState r8 = new androidx.compose.animation.core.MutableTransitionState
            r8.<init>(r13)
            java.lang.String r5 = r4.A0B
            java.lang.String r0 = " > "
            java.lang.String r5 = X.AnonymousClass00U.A0V(r5, r0, r11)
            X.6vT r0 = new X.6vT
            r0.<init>(r8, r5)
            r2.A14(r0)
        L_0x0155:
            X.AnonymousClass7W3.A0w(r2, r1)
            X.6vT r0 = (X.C115556vT) r0
            r11 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r5 = X.C147188nY.A10(r3, r4, r0, r11)
            java.lang.Object r8 = r2.A13()
            if (r5 != 0) goto L_0x016b
            java.lang.Object r5 = X.AnonymousClass7GN.A00
            if (r8 != r5) goto L_0x0174
        L_0x016b:
            r5 = 13
            kotlin.jvm.internal.KtLambdaShape39S0200000_I2 r8 = X.C86164wN.A10(r4, r0, r5)
            r2.A14(r8)
        L_0x0174:
            X.AnonymousClass7W3.A0c(r3, r2, r8, r0, r1)
            boolean r5 = X.C86104wH.A1X(r7)
            if (r5 == 0) goto L_0x05dd
            long r7 = r4.A00
            r0.A04(r13, r7, r12)
        L_0x0182:
            X.AnonymousClass7W3.A0w(r2, r1)
            X.AnonymousClass7W3.A0w(r2, r1)
            boolean r5 = X.C147188nY.A10(r3, r0, r10, r11)
            java.lang.Object r7 = r2.A13()
            if (r5 != 0) goto L_0x0196
            java.lang.Object r5 = X.AnonymousClass7GN.A00
            if (r7 != r5) goto L_0x019e
        L_0x0196:
            kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2 r7 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2
            r7.<init>((java.lang.Object) r0, (java.lang.Object) r10, (X.C146958n9) r6, (int) r1)
            r2.A14(r7)
        L_0x019e:
            X.AnonymousClass7W3.A0b(r3, r2, r7, r0, r1)
            int r8 = r15 >> 3
            r7 = r8 & 112(0x70, float:1.57E-43)
            r5 = r8 & 896(0x380, float:1.256E-42)
            r7 = r7 | r5
            int r28 = X.C86134wK.A05(r8, r7)
            r5 = -1967270694(0xffffffff8abdd4da, float:-1.8280104E-32)
            r3.Cvb(r5)
            androidx.compose.animation.core.MutableTransitionState r5 = r0.A01
            X.8pE r5 = r5.A00
            r38 = r5
            java.lang.Object r5 = r38.getValue()
            X.677 r7 = X.AnonymousClass677.Visible
            if (r5 == r7) goto L_0x01c8
            X.8pE r5 = r0.A06
            java.lang.Object r5 = r5.getValue()
            if (r5 != r7) goto L_0x0540
        L_0x01c8:
            r7 = r28 & 14
            boolean r5 = X.C147188nY.A0z(r3, r0, r9)
            java.lang.Object r8 = r2.A13()
            if (r5 != 0) goto L_0x01d8
            java.lang.Object r5 = X.AnonymousClass7GN.A00
            if (r8 != r5) goto L_0x01e0
        L_0x01d8:
            X.7Tg r8 = new X.7Tg
            r8.<init>(r0)
            r2.A14(r8)
        L_0x01e0:
            X.AnonymousClass7W3.A0w(r2, r1)
            X.7Tg r8 = (X.C122637Tg) r8
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            int r5 = r28 >> 3
            int r13 = X.C86154wM.A02(r5, r7)
            java.lang.String r24 = "Built-in"
            r5 = 1
            r10 = r26
            r7 = r27
            int r23 = X.C18200wM.A02(r5, r10, r7)
            r22 = 3
            r7 = 914000546(0x367a8aa2, float:3.7333598E-6)
            X.7Wm r10 = androidx.compose.ui.Modifier.A02(r3, r7)
            r7 = r26
            X.52U r7 = (X.AnonymousClass52U) r7
            X.79e r7 = r7.A00
            r37 = r7
            X.6tJ r7 = r7.A03
            X.4oM r16 = X.C115806vw.A01(r3, r7)
            r7 = r27
            X.52V r7 = (X.AnonymousClass52V) r7
            X.79e r7 = r7.A00
            X.6tJ r11 = r7.A03
            X.4oM r17 = X.C115806vw.A01(r3, r11)
            kotlin.jvm.internal.KtLambdaShape5S1300000_I2 r11 = new kotlin.jvm.internal.KtLambdaShape5S1300000_I2
            r14 = r11
            r15 = r0
            r18 = r24
            r19 = r5
            r14.<init>(r15, r16, r17, r18, r19)
            X.0YY r12 = androidx.compose.ui.platform.InspectableValueKt.A00
            androidx.compose.ui.Modifier r11 = X.C120417Am.A02(r10, r12, r11)
            r10 = r37
            X.6uQ r10 = r10.A00
            X.4oM r16 = X.C115806vw.A01(r3, r10)
            X.6uQ r10 = r7.A00
            X.4oM r17 = X.C115806vw.A01(r3, r10)
            kotlin.jvm.internal.KtLambdaShape5S1300000_I2 r10 = new kotlin.jvm.internal.KtLambdaShape5S1300000_I2
            r14 = r10
            r19 = r1
            r14.<init>(r15, r16, r17, r18, r19)
            androidx.compose.ui.Modifier r21 = X.C120417Am.A02(r11, r12, r10)
            r20 = r13 & 14
            boolean r11 = X.C147188nY.A0z(r3, r0, r9)
            java.lang.Object r10 = r2.A13()
            if (r11 != 0) goto L_0x0256
            java.lang.Object r11 = X.AnonymousClass7GN.A00
            if (r10 != r11) goto L_0x025e
        L_0x0256:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            androidx.compose.runtime.ParcelableSnapshotMutableState r10 = X.AnonymousClass7WR.A00(r2, r10)
        L_0x025e:
            X.AnonymousClass7W3.A0w(r2, r1)
            X.8pE r10 = (X.C147368pE) r10
            boolean r9 = X.C147188nY.A0z(r3, r0, r9)
            java.lang.Object r11 = r2.A13()
            if (r9 != 0) goto L_0x0271
            java.lang.Object r9 = X.AnonymousClass7GN.A00
            if (r11 != r9) goto L_0x0279
        L_0x0271:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            androidx.compose.runtime.ParcelableSnapshotMutableState r11 = X.AnonymousClass7WR.A00(r2, r9)
        L_0x0279:
            X.AnonymousClass7W3.A0w(r2, r1)
            X.8pE r11 = (X.C147368pE) r11
            java.lang.Object r12 = r38.getValue()
            X.8pE r9 = r0.A06
            r36 = r9
            java.lang.Object r9 = r36.getValue()
            if (r12 != r9) goto L_0x05c0
            X.8pE r9 = r0.A02
            boolean r9 = X.C86104wH.A1X(r9)
            if (r9 != 0) goto L_0x05c0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            r10.CrC(r9)
        L_0x029b:
            r11.CrC(r9)
        L_0x029e:
            r9 = 1657241561(0x62c77fd9, float:1.8400572E21)
            r3.Cvb(r9)
            boolean r9 = X.C86104wH.A1X(r10)
            r19 = 57344(0xe000, float:8.0356E-41)
            r16 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L_0x05b9
            kotlin.jvm.internal.KtLambdaShape50S0200000_I2 r17 = new kotlin.jvm.internal.KtLambdaShape50S0200000_I2
            r13 = r17
            r12 = r27
            r9 = r26
            r13.<init>(r5, r12, r9)
            r9 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            java.lang.Object r12 = X.C147188nY.A0r(r3, r2, r9)
            java.lang.Object r9 = X.AnonymousClass7GN.A00
            if (r12 != r9) goto L_0x02d0
            java.lang.String r12 = " alpha"
            r9 = r24
            java.lang.String r12 = X.AnonymousClass00U.A0L(r9, r12)
            r2.A14(r12)
        L_0x02d0:
            X.AnonymousClass7W3.A0w(r2, r1)
            java.lang.String r12 = (java.lang.String) r12
            r9 = r20
            r9 = r9 | 384(0x180, float:5.38E-43)
            r13 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r3.Cvb(r13)
            X.8cW r31 = X.C103866ar.A02
            r15 = r9 & 14
            int r14 = r9 << 3
            r9 = r14 & 896(0x380, float:1.256E-42)
            r15 = r15 | r9
            r9 = r14 & 7168(0x1c00, float:1.0045E-41)
            r13 = r19
            int r15 = X.C86144wL.A04(r15, r9, r14, r13)
            r13 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r9 = r38
            java.lang.Object r9 = X.C147188nY.A0u(r3, r9, r13)
            X.677 r9 = (X.AnonymousClass677) r9
            r13 = 755689166(0x2d0ae6ce, float:7.895641E-12)
            int r14 = X.C147188nY.A07(r3, r9, r13)
            if (r14 == r5) goto L_0x0310
            if (r14 == r1) goto L_0x05b5
            r9 = r23
            if (r14 != r9) goto L_0x060d
            r9 = r7
        L_0x030b:
            X.6se r9 = r9.A01
            r14 = 0
            if (r9 != 0) goto L_0x0312
        L_0x0310:
            r14 = 1065353216(0x3f800000, float:1.0)
        L_0x0312:
            X.AnonymousClass7W3.A0w(r2, r1)
            java.lang.Float r33 = java.lang.Float.valueOf(r14)
            java.lang.Object r9 = r36.getValue()
            X.677 r9 = (X.AnonymousClass677) r9
            int r13 = X.C147188nY.A07(r3, r9, r13)
            if (r13 == r5) goto L_0x0331
            if (r13 == r1) goto L_0x05b1
            r9 = r23
            if (r13 != r9) goto L_0x0608
            r9 = r7
        L_0x032c:
            X.6se r9 = r9.A01
            r13 = 0
            if (r9 != 0) goto L_0x0333
        L_0x0331:
            r13 = 1065353216(0x3f800000, float:1.0)
        L_0x0333:
            X.AnonymousClass7W3.A0w(r2, r1)
            java.lang.Float r34 = java.lang.Float.valueOf(r13)
            X.8pE r9 = r0.A04
            java.lang.Object r14 = r9.getValue()
            int r9 = r15 >> 3
            r9 = r9 & 112(0x70, float:1.57E-43)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r9 = r17
            java.lang.Object r9 = r9.invoke(r14, r3, r13)
            X.8oz r9 = (X.C147218oz) r9
            r18 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r29 = r9
            r30 = r0
            r32 = r3
            r35 = r12
            X.4oM r9 = X.AnonymousClass7FH.A03(r29, r30, r31, r32, r33, r34, r35)
            X.AnonymousClass7W3.A0w(r2, r1)
            X.AnonymousClass7W3.A0w(r2, r1)
        L_0x0365:
            X.AnonymousClass7W3.A0w(r2, r1)
            boolean r11 = X.C86104wH.A1X(r11)
            if (r11 == 0) goto L_0x057b
            r10 = 1657242461(0x62c7835d, float:1.8401839E21)
            r3.Cvb(r10)
            kotlin.jvm.internal.KtLambdaShape50S0200000_I2 r15 = new kotlin.jvm.internal.KtLambdaShape50S0200000_I2
            r13 = r23
            r12 = r27
            r11 = r26
            r15.<init>(r13, r12, r11)
            r10 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            java.lang.Object r12 = X.C147188nY.A0r(r3, r2, r10)
            java.lang.Object r17 = X.AnonymousClass7GN.A00
            r10 = r17
            if (r12 != r10) goto L_0x0397
            java.lang.String r11 = " scale"
            r10 = r24
            java.lang.String r12 = X.AnonymousClass00U.A0L(r10, r11)
            r2.A14(r12)
        L_0x0397:
            X.AnonymousClass7W3.A0w(r2, r1)
            java.lang.String r12 = (java.lang.String) r12
            r10 = r20
            r10 = r10 | 384(0x180, float:5.38E-43)
            r11 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r3.Cvb(r11)
            X.8cW r31 = X.C103866ar.A02
            r13 = r10 & 14
            int r10 = r10 << r22
            r11 = r10 & 896(0x380, float:1.256E-42)
            r13 = r13 | r11
            r11 = r10 & 7168(0x1c00, float:1.0045E-41)
            r13 = r13 | r11
            r10 = r10 & r19
            r10 = r10 | r13
            r13 = r38
            r11 = r18
            java.lang.Object r11 = X.C147188nY.A0u(r3, r13, r11)
            X.677 r11 = (X.AnonymousClass677) r11
            r13 = -596129937(0xffffffffdc77c76f, float:-2.78974395E17)
            int r14 = X.C147188nY.A07(r3, r11, r13)
            if (r14 == r5) goto L_0x0577
            if (r14 == r1) goto L_0x0573
            r11 = r23
            if (r14 != r11) goto L_0x0603
            r11 = r7
        L_0x03cf:
            X.6u1 r11 = r11.A02
            if (r11 == 0) goto L_0x0577
            float r11 = r11.A00
        L_0x03d5:
            X.AnonymousClass7W3.A0w(r2, r1)
            java.lang.Float r33 = java.lang.Float.valueOf(r11)
            java.lang.Object r11 = r36.getValue()
            X.677 r11 = (X.AnonymousClass677) r11
            int r13 = X.C147188nY.A07(r3, r11, r13)
            if (r13 == r5) goto L_0x03f7
            if (r13 == r1) goto L_0x056f
            r11 = r23
            if (r13 != r11) goto L_0x05fe
            r11 = r7
        L_0x03ef:
            X.6u1 r11 = r11.A02
            if (r11 == 0) goto L_0x03f7
            float r11 = r11.A00
            r16 = r11
        L_0x03f7:
            X.AnonymousClass7W3.A0w(r2, r1)
            java.lang.Float r34 = java.lang.Float.valueOf(r16)
            X.8pE r11 = r0.A04
            r19 = r11
            java.lang.Object r13 = r19.getValue()
            int r10 = r10 >> 3
            r10 = r10 & 112(0x70, float:1.57E-43)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            java.lang.Object r10 = r15.invoke(r13, r3, r11)
            X.8oz r10 = (X.C147218oz) r10
            r29 = r10
            r30 = r0
            r32 = r3
            r35 = r12
            X.4oM r13 = X.AnonymousClass7FH.A03(r29, r30, r31, r32, r33, r34, r35)
            X.AnonymousClass7W3.A0w(r2, r1)
            r10 = r38
            java.lang.Object r11 = X.AnonymousClass7W3.A06(r2, r10)
            X.677 r10 = X.AnonymousClass677.PreEnter
            if (r11 != r10) goto L_0x0567
            r10 = r37
            X.6u1 r10 = r10.A02
            if (r10 != 0) goto L_0x0438
            r10 = r7
        L_0x0434:
            X.6u1 r10 = r10.A02
            if (r10 == 0) goto L_0x043f
        L_0x0438:
            long r10 = r10.A01
            X.79F r6 = new X.79F
            r6.<init>(r10)
        L_0x043f:
            X.8cW r31 = X.AnonymousClass7KU.A03
            r10 = r20
            r10 = r10 | 3136(0xc40, float:4.394E-42)
            r16 = r10
            r10 = r18
            r3.Cvb(r10)
            X.8ZN r15 = X.AnonymousClass8ZN.A00
            java.lang.Object r10 = r38.getValue()
            X.677 r10 = (X.AnonymousClass677) r10
            r12 = -288165413(0xffffffffeed2f1db, float:-3.2642119E28)
            int r11 = X.C147188nY.A07(r3, r10, r12)
            if (r11 == r5) goto L_0x055e
            if (r11 == r1) goto L_0x0555
            r10 = r23
            if (r11 != r10) goto L_0x05f9
            X.6u1 r10 = r7.A02
            if (r10 != 0) goto L_0x046d
            r10 = r37
        L_0x0469:
            X.6u1 r10 = r10.A02
            if (r10 == 0) goto L_0x0563
        L_0x046d:
            long r10 = r10.A01
            X.79F r14 = new X.79F
            r14.<init>(r10)
        L_0x0474:
            long r10 = r14.A00
        L_0x0476:
            X.AnonymousClass7W3.A0w(r2, r1)
            X.79F r14 = new X.79F
            r14.<init>(r10)
            java.lang.Object r10 = r36.getValue()
            X.677 r10 = (X.AnonymousClass677) r10
            int r10 = X.C147188nY.A07(r3, r10, r12)
            if (r10 == r5) goto L_0x054d
            if (r10 == r1) goto L_0x0545
            r6 = r23
            if (r10 != r6) goto L_0x05f4
            X.6u1 r6 = r7.A02
            if (r6 != 0) goto L_0x049a
            r7 = r37
        L_0x0496:
            X.6u1 r6 = r7.A02
            if (r6 == 0) goto L_0x0551
        L_0x049a:
            long r10 = r6.A01
            X.79F r6 = new X.79F
            r6.<init>(r10)
        L_0x04a1:
            long r6 = r6.A00
        L_0x04a3:
            X.AnonymousClass7W3.A0w(r2, r1)
            X.79F r10 = new X.79F
            r10.<init>(r6)
            java.lang.Object r11 = r19.getValue()
            int r6 = r16 >> 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Object r6 = r15.invoke(r11, r3, r7)
            X.8oz r6 = (X.C147218oz) r6
            java.lang.String r35 = "TransformOriginInterruptionHandling"
            r29 = r6
            r33 = r14
            r34 = r10
            X.4oM r7 = X.AnonymousClass7FH.A03(r29, r30, r31, r32, r33, r34, r35)
            X.AnonymousClass7W3.A0w(r2, r1)
            r0 = 1618982084(0x607fb4c4, float:7.370227E19)
            boolean r0 = X.C147188nY.A10(r3, r9, r13, r0)
            boolean r0 = X.C147188nY.A12(r3, r7, r0)
            java.lang.Object r6 = r2.A13()
            if (r0 != 0) goto L_0x04e1
            r0 = r17
            if (r6 != r0) goto L_0x04e9
        L_0x04e1:
            r0 = 4
            kotlin.jvm.internal.KtLambdaShape10S0300000_I2 r6 = X.C86154wM.A0y(r9, r7, r13, r0)
            r2.A14(r6)
        L_0x04e9:
            X.0YY r6 = X.AnonymousClass7W3.A0B(r2, r6, r1)
            r0 = r21
            androidx.compose.ui.Modifier r21 = X.C115876w3.A01(r0, r6)
        L_0x04f3:
            X.AnonymousClass7W3.A0w(r2, r1)
            X.AnonymousClass7W3.A0w(r2, r1)
            r6 = r41
            r0 = r21
            androidx.compose.ui.Modifier r12 = r6.Cx6(r0)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            java.lang.Object r11 = X.C147188nY.A0r(r3, r2, r0)
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r11 != r0) goto L_0x0514
            X.7Xf r11 = new X.7Xf
            r11.<init>(r8)
            r2.A14(r11)
        L_0x0514:
            X.AnonymousClass7W3.A0w(r2, r1)
            java.lang.Object r10 = X.C147188nY.A0p(r3)
            java.lang.Object r9 = X.C147188nY.A0n(r3)
            java.lang.Object r7 = X.C147188nY.A0m(r3)
            X.0ZU r6 = X.AnonymousClass74X.A00
            X.0YM r0 = X.C98236Es.A00(r12)
            X.C147188nY.A0w(r3, r2, r6)
            X.AnonymousClass7W3.A0a(r3, r2, r11, r10)
            X.AnonymousClass7KP.A07(r3, r9, r7, r0)
            int r0 = r28 >> 9
            r0 = r0 & 112(0x70, float:1.57E-43)
            r6 = r0 | 8
            r0 = r39
            X.C86104wH.A1R(r8, r3, r0, r6)
            X.AnonymousClass7W3.A0u(r2, r5)
        L_0x0540:
            X.AnonymousClass7W3.A0w(r2, r1)
            goto L_0x0070
        L_0x0545:
            r6 = r37
            X.6u1 r6 = r6.A02
            if (r6 == 0) goto L_0x0496
            goto L_0x049a
        L_0x054d:
            if (r6 == 0) goto L_0x0551
            goto L_0x04a1
        L_0x0551:
            long r6 = X.AnonymousClass79F.A01
            goto L_0x04a3
        L_0x0555:
            r10 = r37
            X.6u1 r10 = r10.A02
            if (r10 != 0) goto L_0x046d
            r10 = r7
            goto L_0x0469
        L_0x055e:
            r14 = r6
            if (r6 == 0) goto L_0x0563
            goto L_0x0474
        L_0x0563:
            long r10 = X.AnonymousClass79F.A01
            goto L_0x0476
        L_0x0567:
            X.6u1 r10 = r7.A02
            if (r10 != 0) goto L_0x0438
            r10 = r37
            goto L_0x0434
        L_0x056f:
            r11 = r37
            goto L_0x03ef
        L_0x0573:
            r11 = r37
            goto L_0x03cf
        L_0x0577:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03d5
        L_0x057b:
            boolean r0 = X.C86104wH.A1X(r10)
            if (r0 == 0) goto L_0x05a9
            r0 = 1657244550(0x62c78b86, float:1.8404779E21)
            r3.Cvb(r0)
            boolean r0 = X.C147188nY.A0y(r3, r9)
            java.lang.Object r6 = r2.A13()
            if (r0 != 0) goto L_0x0595
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r6 != r0) goto L_0x059d
        L_0x0595:
            r0 = 6
            kotlin.jvm.internal.KtLambdaShape145S0100000_I2 r6 = X.C86144wL.A16(r9, r0)
            r2.A14(r6)
        L_0x059d:
            X.0YY r6 = X.AnonymousClass7W3.A0B(r2, r6, r1)
            r0 = r21
            androidx.compose.ui.Modifier r21 = X.C115876w3.A01(r0, r6)
            goto L_0x04f3
        L_0x05a9:
            r0 = 1657244642(0x62c78be2, float:1.8404908E21)
            r3.Cvb(r0)
            goto L_0x04f3
        L_0x05b1:
            r9 = r37
            goto L_0x032c
        L_0x05b5:
            r9 = r37
            goto L_0x030b
        L_0x05b9:
            r18 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            X.8pE r9 = X.AnonymousClass7KU.A04
            goto L_0x0365
        L_0x05c0:
            r9 = r37
            X.6se r9 = r9.A01
            if (r9 != 0) goto L_0x05ca
            X.6se r9 = r7.A01
            if (r9 == 0) goto L_0x05cd
        L_0x05ca:
            X.C147368pE.A04(r10, r5)
        L_0x05cd:
            r9 = r37
            X.6u1 r9 = r9.A02
            if (r9 != 0) goto L_0x05d7
            X.6u1 r9 = r7.A02
            if (r9 == 0) goto L_0x029e
        L_0x05d7:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            goto L_0x029b
        L_0x05dd:
            int r5 = r14 >> 3
            r7 = r5 & 8
            int r5 = r14 >> 6
            r5 = r5 & 14
            r7 = r7 | r5
            r0.A03(r3, r12, r7)
            X.8pE r5 = r0.A02
            X.C147368pE.A04(r5, r1)
            goto L_0x0182
        L_0x05f0:
            r15 = r25
            goto L_0x0016
        L_0x05f4:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x05f9:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x05fe:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0603:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0608:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x060d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JP.A03(X.79w, X.79x, X.6vT, X.8nY, androidx.compose.ui.Modifier, X.0YY, X.0YM, int):void");
    }
}
