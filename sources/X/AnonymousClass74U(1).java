package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.74U  reason: invalid class name */
public final class AnonymousClass74U {
    public static final float A00 = ((float) 40);
    public static final C122757Ts A01 = new C122757Ts(0.4f, 0.2f);
    public static final C122757Ts A02 = new C122757Ts(0.2f, 0.8f);
    public static final C122757Ts A03 = new C122757Ts(0.4f, 1.0f);
    public static final C122757Ts A04 = new C122757Ts(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.65f);
    public static final C122757Ts A05 = new C122757Ts(0.1f, 0.45f);

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r4.ACX(r12) == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147188nY r27, androidx.compose.ui.Modifier r28, float r29, int r30, int r31, long r32) {
        /*
            r10 = r29
            r12 = r32
            r7 = r28
            r0 = -1751398827(0xffffffff979bc655, float:-1.0066706E-24)
            r4 = r27
            r4.Cvd(r0)
            r27 = r31
            r6 = r31 & 1
            r31 = 2
            r5 = r30
            if (r6 == 0) goto L_0x012f
            r3 = r30 | 6
        L_0x001a:
            r0 = r30 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x002d
            r0 = r27 & 2
            if (r0 != 0) goto L_0x002a
            boolean r1 = r4.ACX(r12)
            r0 = 32
            if (r1 != 0) goto L_0x002c
        L_0x002a:
            r0 = 16
        L_0x002c:
            r3 = r3 | r0
        L_0x002d:
            r2 = r27 & 4
            if (r2 == 0) goto L_0x0120
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0033:
            r1 = r3 & 731(0x2db, float:1.024E-42)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L_0x005d
            boolean r0 = r4.BCM()
            if (r0 == 0) goto L_0x005d
            r4.CuJ()
        L_0x0042:
            X.8nW r1 = r4.AKE()
            if (r1 == 0) goto L_0x005c
            r28 = 0
            kotlin.jvm.internal.KtLambdaShape0S0102101_I2 r0 = new kotlin.jvm.internal.KtLambdaShape0S0102101_I2
            r23 = r0
            r24 = r7
            r25 = r10
            r26 = r5
            r29 = r12
            r23.<init>(r24, r25, r26, r27, r28, r29)
            r1.D9d(r0)
        L_0x005c:
            return
        L_0x005d:
            r4.CvD()
            r0 = r30 & 1
            if (r0 == 0) goto L_0x010e
            boolean r0 = r4.Acj()
            if (r0 != 0) goto L_0x010e
            r4.CuJ()
        L_0x006d:
            r4.AKA()
            java.lang.String r11 = "CircularProgressIndicator"
            X.8nV r0 = X.C147188nY.A0j(r4)
            float r29 = r0.CxL(r10)
            r30 = 0
            r2 = 0
            r33 = 26
            X.53w r19 = new X.53w
            r28 = r19
            r32 = r2
            r28.<init>(r29, r30, r31, r32, r33)
            X.6pq r21 = X.C120387Aa.A00(r4, r11)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r2)
            r0 = 5
            java.lang.Integer r25 = java.lang.Integer.valueOf(r0)
            X.8cW r22 = X.C103866ar.A05
            X.8fN r6 = X.AnonymousClass6aT.A01
            r0 = 6660(0x1a04, float:9.333E-42)
            X.7Tr r8 = new X.7Tr
            r8.<init>(r6, r0, r2)
            java.lang.Integer r3 = X.AnonymousClass006.A00
            long r0 = (long) r2
            X.7Tk r9 = new X.7Tk
            r9.<init>(r8, r3, r0)
            r23 = r4
            r26 = r11
            r20 = r9
            X.4oM r15 = X.C120387Aa.A01(r20, r21, r22, r23, r24, r25, r26)
            r25 = 1133445120(0x438f0000, float:286.0)
            r9 = 1332(0x534, float:1.867E-42)
            X.7Tr r8 = new X.7Tr
            r8.<init>(r6, r9, r2)
            X.7Tk r6 = new X.7Tk
            r6.<init>(r8, r3, r0)
            r20 = r6
            r22 = r4
            r23 = r11
            r24 = r30
            X.4oM r18 = X.C120387Aa.A02(r20, r21, r22, r23, r24, r25)
            r25 = 1133576192(0x43910000, float:290.0)
            X.8No r6 = X.C139338No.A00
            X.7Tp r8 = X.AnonymousClass6DV.A00(r6)
            X.7Tk r6 = new X.7Tk
            r6.<init>(r8, r3, r0)
            r20 = r6
            X.4oM r16 = X.C120387Aa.A02(r20, r21, r22, r23, r24, r25)
            X.8Np r6 = X.C139348Np.A00
            X.7Tp r8 = X.AnonymousClass6DV.A00(r6)
            X.7Tk r6 = new X.7Tk
            r6.<init>(r8, r3, r0)
            r20 = r6
            X.4oM r17 = X.C120387Aa.A02(r20, r21, r22, r23, r24, r25)
            X.C04220Ms.A0B(r7, r2)
            X.8L4 r1 = X.AnonymousClass8L4.A00
            r0 = 1
            androidx.compose.ui.Modifier r1 = X.AnonymousClass6FI.A00(r7, r1, r0)
            float r0 = A00
            androidx.compose.ui.Modifier r0 = X.AnonymousClass7Kq.A09(r1, r0)
            X.8JT r14 = new X.8JT
            r20 = r10
            r21 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            X.AnonymousClass6DZ.A00(r4, r0, r14, r2)
            goto L_0x0042
        L_0x010e:
            if (r6 == 0) goto L_0x0112
            X.7Wm r7 = androidx.compose.ui.Modifier.A00
        L_0x0112:
            r0 = r27 & 2
            if (r0 == 0) goto L_0x011a
            long r12 = X.AnonymousClass7KB.A00(r4)
        L_0x011a:
            if (r2 == 0) goto L_0x006d
            float r10 = X.C103496Zk.A00
            goto L_0x006d
        L_0x0120:
            r0 = r5 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0033
            boolean r0 = r4.ACV(r10)
            int r0 = X.C86124wJ.A06(r0)
            r3 = r3 | r0
            goto L_0x0033
        L_0x012f:
            r0 = r30 & 14
            if (r0 != 0) goto L_0x013b
            int r3 = X.C147188nY.A0F(r4, r7)
            r3 = r3 | r30
            goto L_0x001a
        L_0x013b:
            r3 = r5
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74U.A00(X.8nY, androidx.compose.ui.Modifier, float, int, int, long):void");
    }
}
