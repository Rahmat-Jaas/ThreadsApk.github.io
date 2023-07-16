package com.instagram.security.attestation.playintegrity.client;

import X.AnonymousClass01V;
import X.C142248eR;

public final class PlayIntegrityRequester {
    public final C142248eR A00;
    public final AnonymousClass01V A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (((kotlin.coroutines.jvm.internal.KtCImplShape1S0302000_I2) r3).A05 != 2) goto L_0x000f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r21, X.C146958n9 r22) {
        /*
            r20 = this;
            r7 = 2
            r3 = r22
            boolean r0 = r3 instanceof kotlin.coroutines.jvm.internal.KtCImplShape1S0302000_I2
            if (r0 == 0) goto L_0x000f
            r0 = r3
            kotlin.coroutines.jvm.internal.KtCImplShape1S0302000_I2 r0 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0302000_I2) r0
            int r1 = r0.A05
            r0 = 1
            if (r1 == r7) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r8 = r20
            if (r0 == 0) goto L_0x0038
            r9 = r3
            kotlin.coroutines.jvm.internal.KtCImplShape1S0302000_I2 r9 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0302000_I2) r9
            int r2 = r9.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0038
            int r2 = r2 - r1
            r9.A01 = r2
        L_0x0022:
            java.lang.Object r3 = r9.A03
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r9.A01
            r2 = 1
            r5 = 533736699(0x1fd02cfb, float:8.816584E-20)
            if (r0 == 0) goto L_0x0043
            if (r0 != r2) goto L_0x003e
            int r4 = r9.A00
            java.lang.Object r6 = r9.A02
            com.instagram.security.attestation.playintegrity.client.PlayIntegrityRequester r6 = (com.instagram.security.attestation.playintegrity.client.PlayIntegrityRequester) r6
            goto L_0x0134
        L_0x0038:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0302000_I2 r9 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0302000_I2
            r9.<init>(r8, r3, r7)
            goto L_0x0022
        L_0x003e:
            java.lang.IllegalStateException r3 = X.AnonymousClass0wJ.A0a()
            throw r3
        L_0x0043:
            X.AnonymousClass0OU.A00(r3)
            X.8eR r0 = r8.A00
            r3 = 0
            r1 = r21
            if (r21 == 0) goto L_0x015e
            X.5qu r12 = new X.5qu
            r12.<init>(r1)
            X.7ma r0 = (X.C129707ma) r0
            X.6jI r11 = r0.A00
            X.7EO r4 = r11.A01
            if (r4 != 0) goto L_0x0080
            r1 = -2
            X.5lA r0 = new X.5lA
            r0.<init>(r1, r3)
            X.7HU r3 = new X.7HU
            r3.<init>()
            r3.A0A(r0)
        L_0x0068:
            X.6bn r1 = new X.6bn
            r1.<init>(r3)
            X.6pu r4 = new X.6pu
            r4.<init>()
            X.7o4 r10 = new X.7o4
            r10.<init>(r4)
            r4.A00 = r10
            java.lang.Class r0 = r1.getClass()
            r4.A02 = r0
            goto L_0x00f6
        L_0x0080:
            java.lang.String r1 = r12.A00     // Catch:{ IllegalArgumentException -> 0x00e4 }
            r0 = 10
            byte[] r19 = android.util.Base64.decode(r1, r0)     // Catch:{ IllegalArgumentException -> 0x00e4 }
            X.77Q r10 = r11.A00
            r1 = 0
            java.lang.Object[] r3 = new java.lang.Object[]{r12}
            java.lang.String r0 = "requestIntegrityToken(%s)"
            r10.A01(r0, r3)
            X.6rN r15 = new X.6rN
            r15.<init>()
            X.5rF r14 = new X.5rF
            r16 = r15
            r17 = r12
            r18 = r11
            r14.<init>(r15, r16, r17, r18, r19)
            java.lang.Object r10 = r4.A07
            monitor-enter(r10)
            java.util.Set r0 = r4.A0A     // Catch:{ all -> 0x015b }
            r0.add(r15)     // Catch:{ all -> 0x015b }
            X.7HU r3 = r15.A00     // Catch:{ all -> 0x015b }
            X.7mI r0 = new X.7mI     // Catch:{ all -> 0x015b }
            r0.<init>(r15, r4)     // Catch:{ all -> 0x015b }
            r3.A07(r0)     // Catch:{ all -> 0x015b }
            monitor-exit(r10)     // Catch:{ all -> 0x015b }
            monitor-enter(r10)
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A0B     // Catch:{ all -> 0x0158 }
            int r0 = r0.getAndIncrement()     // Catch:{ all -> 0x0158 }
            if (r0 <= 0) goto L_0x00d4
            X.77Q r13 = r4.A06     // Catch:{ all -> 0x0158 }
            java.lang.String r12 = "Already connected to the service."
            java.lang.Object[] r11 = new java.lang.Object[r1]     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = "PlayCore"
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ all -> 0x0158 }
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = r13.A00     // Catch:{ all -> 0x0158 }
            X.AnonymousClass77Q.A00(r0, r12, r11)     // Catch:{ all -> 0x0158 }
        L_0x00d4:
            monitor-exit(r10)     // Catch:{ all -> 0x0158 }
            X.6rN r0 = r14.A00
            X.5rD r1 = new X.5rD
            r1.<init>(r0, r14, r4)
            android.os.Handler r0 = r4.A01()
            r0.post(r1)
            goto L_0x0068
        L_0x00e4:
            r3 = move-exception
            r1 = -13
            X.5lA r0 = new X.5lA
            r0.<init>(r1, r3)
            X.7HU r3 = new X.7HU
            r3.<init>()
            r3.A0A(r0)
            goto L_0x0068
        L_0x00f6:
            X.7HU r3 = r1.A00     // Catch:{ Exception -> 0x0104 }
            r1 = 0
            com.facebook.redex.IDxCListenerShape673S0100000_2_I2 r0 = new com.facebook.redex.IDxCListenerShape673S0100000_2_I2     // Catch:{ Exception -> 0x0104 }
            r0.<init>(r4, r1)     // Catch:{ Exception -> 0x0104 }
            r3.A07(r0)     // Catch:{ Exception -> 0x0104 }
            r4.A02 = r3     // Catch:{ Exception -> 0x0104 }
            goto L_0x0117
        L_0x0104:
            r0 = move-exception
            X.MJO r3 = r10.A01
            X.756 r1 = new X.756
            r1.<init>(r0)
            X.LtE r0 = X.MJO.A01
            boolean r0 = r0.A02(r3, r1)
            if (r0 == 0) goto L_0x0117
            X.MJO.A03(r3)
        L_0x0117:
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r4 = r0.nextInt()
            X.01V r0 = r8.A01     // Catch:{ 5lA -> 0x0147 }
            r0.markerStart((int) r5, (int) r4)     // Catch:{ 5lA -> 0x0147 }
            r9.A02 = r8     // Catch:{ 5lA -> 0x0147 }
            r9.A00 = r4     // Catch:{ 5lA -> 0x0147 }
            r9.A01 = r2     // Catch:{ 5lA -> 0x0147 }
            java.lang.Object r3 = X.C29786Fu6.A00(r10, r9)     // Catch:{ 5lA -> 0x0147 }
            if (r3 != r6) goto L_0x0132
            return r6
        L_0x0132:
            r6 = r8
            goto L_0x0137
        L_0x0134:
            X.AnonymousClass0OU.A00(r3)     // Catch:{ 5lA -> 0x0145 }
        L_0x0137:
            X.01V r2 = r6.A01     // Catch:{ 5lA -> 0x0145 }
            r2.markerEnd(r5, r4, r7)     // Catch:{ 5lA -> 0x0145 }
            r1 = 533740763(0x1fd03cdb, float:8.8192103E-20)
            java.lang.String r0 = "success"
            r2.A0d(r1, r0)     // Catch:{ 5lA -> 0x0145 }
            return r3
        L_0x0145:
            r3 = move-exception
            goto L_0x0149
        L_0x0147:
            r3 = move-exception
            r6 = r8
        L_0x0149:
            X.01V r2 = r6.A01
            r0 = 3
            r2.markerEnd(r5, r4, r0)
            r1 = 533740510(0x1fd03bde, float:8.819047E-20)
            java.lang.String r0 = "fail"
            r2.A0d(r1, r0)
            throw r3
        L_0x0158:
            r3 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0158 }
            throw r3
        L_0x015b:
            r3 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x015b }
            throw r3
        L_0x015e:
            java.lang.String r0 = "Null nonce"
            java.lang.NullPointerException r3 = X.C18210wN.A0W(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.security.attestation.playintegrity.client.PlayIntegrityRequester.A00(java.lang.String, X.8n9):java.lang.Object");
    }

    public PlayIntegrityRequester(C142248eR r1, AnonymousClass01V r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
