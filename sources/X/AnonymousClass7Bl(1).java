package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.jvm.internal.KtLambdaShape0S0212003_I2;

/* renamed from: X.7Bl  reason: invalid class name */
public final class AnonymousClass7Bl {
    public static final void A01(C147188nY r36, C115286uo r37, C115286uo r38, float f, float f2, float f3, int i, int i2, boolean z) {
        float f4 = f3;
        float f5 = f2;
        C115286uo r18 = r38;
        C115286uo r13 = r37;
        C04220Ms.A0B(r13, 1);
        C147188nY r14 = r36;
        r14.Cvd(1974982665);
        int i3 = i2;
        if ((i2 & 4) != 0) {
            r18 = null;
        }
        if ((i2 & 8) != 0) {
            f5 = (float) 2;
        }
        if ((i2 & 16) != 0) {
            f4 = 0.65f;
        }
        boolean A1R = C18240wQ.A1R(i2 & 32, z);
        C123327Wm r3 = Modifier.A00;
        float f6 = f;
        Modifier A09 = AnonymousClass7Kq.A09(r3, f6);
        Alignment A00 = AnonymousClass7KV.A00(r14);
        C146288ly A002 = C120767Cj.A00(r14, A00, false);
        Object A0p = C147188nY.A0p(r14);
        Object A0n = C147188nY.A0n(r14);
        Object A0m = C147188nY.A0m(r14);
        AnonymousClass0ZU r1 = AnonymousClass74X.A00;
        AnonymousClass0YM A003 = C98236Es.A00(A09);
        AnonymousClass7W3 r2 = (AnonymousClass7W3) r14;
        C147188nY.A0w(r14, r2, r1);
        AnonymousClass7W3.A0a(r14, r2, A002, A0p);
        AnonymousClass7KP.A07(r14, A0n, A0m, A003);
        AnonymousClass7V3 r4 = AnonymousClass7V3.A00;
        r14.Cvb(-1849168445);
        if (r18 != null) {
            r14.Cvb(1592455106);
            Modifier A092 = AnonymousClass7Kq.A09(r3, f * f4);
            long A004 = AnonymousClass7KB.A00(r14);
            C874352s r8 = AnonymousClass7G5.A00;
            Modifier A01 = C115826vy.A01(AnonymousClass7K4.A03(AnonymousClass7Ac.A02(A092, r8, f5, A004), f5), r8);
            C97846Dc.A00(r14, (Alignment) null, r4.A86(A00, A01), (C104136bI) null, r18, (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
            C97846Dc.A00(r14, (Alignment) null, r4.A86(AnonymousClass7KV.A07, A01), (C104136bI) null, r13, (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
        } else {
            r14.Cvb(1592455658);
            C97846Dc.A00(r14, (Alignment) null, AnonymousClass7G5.A02(r3, f6), (C104136bI) null, r13, (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
        }
        AnonymousClass7W3.A0w(r2, false);
        if (A1R) {
            A00(r14, r4.A86(AnonymousClass7KV.A07, r3), 0);
        }
        AnonymousClass7W3.A0v(r2, true);
        C147178nW AKE = r14.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S0212003_I2(r13, r18, f6, f5, f4, i, i3, 1, A1R));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C147188nY r22, com.instagram.common.typedurl.ImageUrl r23, com.instagram.common.typedurl.ImageUrl r24, float r25, float r26, float r27, int r28, int r29, boolean r30) {
        /*
            r1 = r30
            r3 = r27
            r4 = r26
            r5 = r24
            r0 = 1
            r6 = r23
            X.C04220Ms.A0B(r6, r0)
            r0 = -2060397753(0xffffffff8530d347, float:-8.314286E-36)
            r8 = r22
            r8.Cvd(r0)
            r18 = r29
            r0 = r29 & 1
            r11 = 2
            r10 = r25
            r2 = r28
            if (r0 == 0) goto L_0x0106
            r7 = r28 | 6
        L_0x0023:
            r0 = r29 & 2
            if (r0 == 0) goto L_0x00fb
            r7 = r7 | 48
        L_0x0029:
            r17 = r29 & 4
            if (r17 == 0) goto L_0x00f0
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x002f:
            r16 = r29 & 8
            if (r16 == 0) goto L_0x00e5
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0035:
            r15 = r29 & 16
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r15 == 0) goto L_0x00d4
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x003e:
            r12 = r29 & 32
            r14 = 458752(0x70000, float:6.42848E-40)
            if (r12 == 0) goto L_0x00ca
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x0046:
            r7 = r7 | r0
        L_0x0047:
            r13 = 374491(0x5b6db, float:5.24774E-40)
            r13 = r13 & r7
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r13 != r0) goto L_0x0074
            boolean r0 = r8.BCM()
            if (r0 == 0) goto L_0x0074
            r8.CuJ()
        L_0x0059:
            X.8nW r0 = r8.AKE()
            if (r0 == 0) goto L_0x0073
            r19 = 0
            kotlin.jvm.internal.KtLambdaShape0S0212003_I2 r11 = new kotlin.jvm.internal.KtLambdaShape0S0212003_I2
            r20 = r1
            r16 = r3
            r17 = r2
            r14 = r10
            r15 = r4
            r12 = r6
            r13 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.D9d(r11)
        L_0x0073:
            return
        L_0x0074:
            r21 = 0
            if (r17 == 0) goto L_0x007a
            r5 = r21
        L_0x007a:
            if (r16 == 0) goto L_0x007d
            float r4 = (float) r11
        L_0x007d:
            if (r15 == 0) goto L_0x0082
            r3 = 1059481190(0x3f266666, float:0.65)
        L_0x0082:
            boolean r1 = X.C18240wQ.A1R(r12, r1)
            r23 = 0
            r22 = 6
            r19 = r8
            r20 = r6
            X.6uo r20 = X.C120577Bm.A02(r19, r20, r21, r22, r23)
            r0 = -1155798979(0xffffffffbb1be83d, float:-0.0023789548)
            r8.Cvb(r0)
            if (r5 == 0) goto L_0x00a8
            r25 = r8
            r26 = r5
            r27 = r21
            r28 = r22
            r29 = r23
            X.6uo r21 = X.C120577Bm.A02(r25, r26, r27, r28, r29)
        L_0x00a8:
            r0 = r8
            X.7W3 r0 = (X.AnonymousClass7W3) r0
            r11 = 0
            X.AnonymousClass7W3.A0w(r0, r11)
            r0 = r7 & 14
            r12 = r0 | 576(0x240, float:8.07E-43)
            r0 = r7 & 7168(0x1c00, float:1.0045E-41)
            int r25 = X.C86144wL.A04(r12, r0, r7, r9)
            r7 = r7 & r14
            r25 = r25 | r7
            r22 = r10
            r23 = r4
            r24 = r3
            r26 = r11
            r27 = r1
            A01(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0059
        L_0x00ca:
            r0 = r28 & r14
            if (r0 != 0) goto L_0x0047
            int r0 = X.C147188nY.A0Q(r8, r1)
            goto L_0x0046
        L_0x00d4:
            r0 = r28 & r9
            if (r0 != 0) goto L_0x003e
            boolean r12 = r8.ACV(r3)
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x00e2
            r0 = 16384(0x4000, float:2.2959E-41)
        L_0x00e2:
            r7 = r7 | r0
            goto L_0x003e
        L_0x00e5:
            r0 = r2 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0035
            int r0 = X.C147188nY.A02(r8, r4)
            r7 = r7 | r0
            goto L_0x0035
        L_0x00f0:
            r0 = r2 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x002f
            int r0 = X.C147188nY.A0H(r8, r5)
            r7 = r7 | r0
            goto L_0x002f
        L_0x00fb:
            r0 = r28 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0029
            int r0 = X.C147188nY.A0G(r8, r6)
            r7 = r7 | r0
            goto L_0x0029
        L_0x0106:
            r0 = r28 & 14
            if (r0 != 0) goto L_0x0116
            boolean r0 = r8.ACV(r10)
            r7 = 2
            if (r0 == 0) goto L_0x0112
            r7 = 4
        L_0x0112:
            r7 = r7 | r28
            goto L_0x0023
        L_0x0116:
            r7 = r2
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Bl.A02(X.8nY, com.instagram.common.typedurl.ImageUrl, com.instagram.common.typedurl.ImageUrl, float, float, float, int, int, boolean):void");
    }

    public static final void A00(C147188nY r7, Modifier modifier, int i) {
        int i2;
        r7.Cvd(425148867);
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r7, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r7.BCM()) {
            float f = (float) 2;
            C120767Cj.A01(r7, C115656vh.A00(AnonymousClass7K4.A03(AnonymousClass7Ac.A02(AnonymousClass7Kq.A0F(modifier, 14), AnonymousClass7G5.A00, f, AnonymousClass7KB.A00(r7)), f), C120537Bh.A00(r7).A00), 0);
        } else {
            r7.CuJ();
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            C147178nW.A01(AKE, modifier, i, 2);
        }
    }
}
