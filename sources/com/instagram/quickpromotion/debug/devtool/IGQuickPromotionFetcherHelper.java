package com.instagram.quickpromotion.debug.devtool;

public final class IGQuickPromotionFetcherHelper {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.content.Context r25, com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper r26, com.instagram.quickpromotion.intf.QuickPromotionSlot r27, com.instagram.service.session.UserSession r28, java.util.Map r29, X.C146958n9 r30) {
        /*
            r9 = r26
            r4 = r27
            r10 = r28
            r11 = r29
            r3 = 17
            r5 = r30
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2.A00(r3, r5)
            if (r0 == 0) goto L_0x0070
            r7 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0070
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0020:
            java.lang.Object r1 = r7.A05
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 != r5) goto L_0x015f
            java.lang.Object r11 = r7.A04
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r10 = r7.A03
            com.instagram.service.session.UserSession r10 = (com.instagram.service.session.UserSession) r10
            java.lang.Object r4 = r7.A02
            com.instagram.quickpromotion.intf.QuickPromotionSlot r4 = (com.instagram.quickpromotion.intf.QuickPromotionSlot) r4
            java.lang.Object r9 = r7.A01
            X.AnonymousClass0OU.A00(r1)
        L_0x003c:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0144
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r12 = r1.A00
            X.64g r12 = (X.C963064g) r12
            X.C04220Ms.A04(r12)
            monitor-enter(r9)
            goto L_0x0076
        L_0x004d:
            X.AnonymousClass0OU.A00(r1)
            if (r25 == 0) goto L_0x006e
            int r1 = X.C18190wL.A03(r25)
        L_0x0056:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            X.H8c r3 = X.C60933Rd.A00(r4, r10, r0, r1)
            r2 = 0
            r1 = 14
            r7.A01 = r9
            X.C18250wR.A1D(r4, r10, r11, r7, r5)
            r0 = 700377912(0x29beeb38, float:8.478499E-14)
            java.lang.Object r1 = X.C63623hv.A01(r3, r7, r0, r2, r1)
            if (r1 != r6) goto L_0x003c
            return r6
        L_0x006e:
            r1 = 1
            goto L_0x0056
        L_0x0070:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2
            r7.<init>(r9, r5, r3)
            goto L_0x0020
        L_0x0076:
            java.util.List r0 = X.M5W.A01(r4)     // Catch:{ all -> 0x0141 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x0141 }
        L_0x007e:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0141 }
            if (r0 == 0) goto L_0x0156
            java.lang.Object r0 = r16.next()     // Catch:{ all -> 0x0141 }
            X.Lct r0 = (X.C40337Lct) r0     // Catch:{ all -> 0x0141 }
            com.instagram.quickpromotion.intf.QuickPromotionSurface r8 = r0.A00     // Catch:{ all -> 0x0141 }
            java.util.List r0 = r12.A00(r8)     // Catch:{ all -> 0x0141 }
            if (r0 == 0) goto L_0x007e
            java.util.List r1 = r12.A00(r8)     // Catch:{ all -> 0x0141 }
            int r0 = r8.A00     // Catch:{ all -> 0x0141 }
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0141 }
            java.lang.Object r6 = r11.get(r7)     // Catch:{ all -> 0x0141 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x0141 }
            if (r6 != 0) goto L_0x00a8
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x0141 }
        L_0x00a8:
            if (r1 == 0) goto L_0x0137
            java.util.Iterator r15 = r1.iterator()     // Catch:{ all -> 0x0141 }
        L_0x00ae:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0141 }
            if (r0 == 0) goto L_0x0137
            java.lang.Object r13 = r15.next()     // Catch:{ all -> 0x0141 }
            X.3Cq r13 = (X.C57833Cq) r13     // Catch:{ all -> 0x0141 }
            X.3GI r14 = r13.A02     // Catch:{ all -> 0x0141 }
            X.C04220Ms.A06(r14)     // Catch:{ all -> 0x0141 }
            java.lang.Long r0 = r13.A03     // Catch:{ all -> 0x0141 }
            if (r0 != 0) goto L_0x00c6
            r2 = 0
            goto L_0x00ca
        L_0x00c6:
            long r2 = r0.longValue()     // Catch:{ all -> 0x0141 }
        L_0x00ca:
            X.38p r0 = r13.A01     // Catch:{ all -> 0x0141 }
            if (r0 == 0) goto L_0x00d2
            java.lang.Long r0 = r0.A00     // Catch:{ all -> 0x0141 }
            if (r0 != 0) goto L_0x00db
        L_0x00d2:
            long r0 = X.C18180wK.A04()     // Catch:{ all -> 0x0141 }
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0141 }
        L_0x00db:
            X.C04220Ms.A09(r0)     // Catch:{ all -> 0x0141 }
            long r2 = r0.longValue()     // Catch:{ all -> 0x0141 }
            X.3XY r4 = X.AnonymousClass3XY.A01()     // Catch:{ all -> 0x0141 }
            java.lang.String r1 = r10.getUserId()     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = r14.A05     // Catch:{ all -> 0x0141 }
            X.3Ye r5 = X.AnonymousClass3XY.A00(r4, r1, r0)     // Catch:{ all -> 0x0141 }
            if (r5 != 0) goto L_0x00fd
            java.lang.String r1 = r10.getUserId()     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = r14.A05     // Catch:{ all -> 0x0141 }
            X.3Ye r5 = new X.3Ye     // Catch:{ all -> 0x0141 }
            r5.<init>(r1, r0, r2)     // Catch:{ all -> 0x0141 }
        L_0x00fd:
            X.3GI r4 = r13.A02     // Catch:{ all -> 0x0141 }
            X.C04220Ms.A06(r4)     // Catch:{ all -> 0x0141 }
            java.lang.String r21 = r10.getUserId()     // Catch:{ all -> 0x0141 }
            java.util.List r0 = r4.A06     // Catch:{ all -> 0x0141 }
            if (r0 == 0) goto L_0x013c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0141 }
            X.1tt r0 = (X.C28221tt) r0     // Catch:{ all -> 0x0141 }
            int r14 = r13.A00     // Catch:{ all -> 0x0141 }
            boolean r13 = r13.A04     // Catch:{ all -> 0x0141 }
            r23 = 0
            r22 = r14
            r25 = r2
            r27 = r23
            r29 = r1
            r30 = r13
            r18 = r0
            r19 = r4
            r20 = r5
            r17 = r8
            X.1u0 r1 = X.C36802Ss.A00(r17, r18, r19, r20, r21, r22, r23, r25, r27, r29, r30)     // Catch:{ all -> 0x0141 }
            X.18L r0 = new X.18L     // Catch:{ all -> 0x0141 }
            r0.<init>(r1)     // Catch:{ all -> 0x0141 }
            r6.add(r0)     // Catch:{ all -> 0x0141 }
            goto L_0x00ae
        L_0x0137:
            r11.put(r7, r6)     // Catch:{ all -> 0x0141 }
            goto L_0x007e
        L_0x013c:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()     // Catch:{ all -> 0x0141 }
            throw r0     // Catch:{ all -> 0x0141 }
        L_0x0141:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0144:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x015a
            X.1jB r1 = (X.AnonymousClass1jB) r1
            java.lang.Object r0 = r1.A00
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "ERROR:QP_IG_DEV_TOOL"
            X.AnonymousClass0LU.A0B(r0, r1)
            goto L_0x0157
        L_0x0156:
            monitor-exit(r9)
        L_0x0157:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        L_0x015a:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x015f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper.A00(android.content.Context, com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper, com.instagram.quickpromotion.intf.QuickPromotionSlot, com.instagram.service.session.UserSession, java.util.Map, X.8n9):java.lang.Object");
    }
}
