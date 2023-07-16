package com.instagram.security.attestation.keystore.worker;

public final class KeyAttestationUtils {
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c4, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c6, code lost:
        r2 = e;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c8, code lost:
        r2 = e;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cc, code lost:
        r2 = e;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ce, code lost:
        r2 = e;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d0, code lost:
        if (r5 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d2, code lost:
        r5.A00.A00 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e3, code lost:
        return new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5000000_I2) null, (kotlin.jvm.internal.DefaultConstructorMarker) null, 2, 19, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e4, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e6, code lost:
        r2 = e;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e8, code lost:
        r2 = e;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0122, code lost:
        r1 = X.AnonymousClass6BG.API_NETWORK_OR_GRAPHQL;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0132, code lost:
        r2.getMessage();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0044, B:36:0x009c] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0044, B:38:0x009e] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b8 A[Catch:{ 6CP -> 0x00c8, 661 -> 0x00c6, 6CC -> 0x00c4, IllegalStateException -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[ExcHandler: IllegalStateException (unused java.lang.IllegalStateException), PHI: r5 
      PHI: (r5v7 X.360) = (r5v9 X.360), (r5v0 X.360), (r5v0 X.360), (r5v0 X.360), (r5v11 X.360), (r5v11 X.360) binds: [B:42:0x00b4, B:36:0x009c, B:37:?, B:38:0x009e, B:10:0x0044, B:11:?] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:10:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.content.Context r13, com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r14, X.C10300i6 r15, X.AnonymousClass360 r16, java.lang.String r17, X.C146958n9 r18, X.C27952Ew2 r19, boolean r20) {
        /*
            r12 = r14
            r4 = r17
            r5 = r16
            r3 = 3
            r6 = r18
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1.A00(r3, r6)
            if (r0 == 0) goto L_0x003e
            r10 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1 r10 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1) r10
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003e
            int r2 = r2 - r1
            r10.A00 = r2
        L_0x001c:
            java.lang.Object r1 = r10.A05
            X.D0E r9 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r10.A00
            java.lang.String r8 = "error"
            r7 = 817903298(0x30c036c2, float:1.3985402E-9)
            r16 = 2
            r6 = 1
            r18 = 0
            r14 = 0
            if (r0 == 0) goto L_0x004d
            if (r0 != r6) goto L_0x0048
            java.lang.Object r5 = r10.A04
            X.360 r5 = (X.AnonymousClass360) r5
            java.lang.Object r12 = r10.A03
            X.0A3 r12 = (X.AnonymousClass0A3) r12
            java.lang.Object r4 = r10.A02
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0044
        L_0x003e:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1 r10 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1
            r10.<init>(r3, r6)
            goto L_0x001c
        L_0x0044:
            X.AnonymousClass0OU.A00(r1)     // Catch:{ 6CP -> 0x00ea, 661 -> 0x011a, 6CC -> 0x012a, IllegalStateException -> 0x00d0 }
            goto L_0x00b4
        L_0x0048:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x004d:
            X.AnonymousClass0OU.A00(r1)
            X.0ev r0 = X.C09140ev.A02
            java.lang.String r3 = r0.A04(r13)
            if (r3 == 0) goto L_0x0147
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0147
            if (r12 == 0) goto L_0x0065
            java.lang.String r0 = "app_scoped_device_id"
            r12.A0T(r0, r3)
        L_0x0065:
            java.lang.Class<X.6rU> r1 = X.C113476rU.class
            monitor-enter(r1)
            X.6rU r2 = X.C113476rU.A01     // Catch:{ all -> 0x0144 }
            if (r2 != 0) goto L_0x0073
            X.6rU r2 = new X.6rU     // Catch:{ all -> 0x0144 }
            r2.<init>()     // Catch:{ all -> 0x0144 }
            X.C113476rU.A01 = r2     // Catch:{ all -> 0x0144 }
        L_0x0073:
            monitor-exit(r1)
            r11 = r15
            boolean r0 = r15 instanceof X.C07530bf
            if (r0 == 0) goto L_0x0093
            r0 = r11
            X.0bf r0 = (X.C07530bf) r0
            X.Grx r1 = X.AnonymousClass3WK.A00(r0)
        L_0x0080:
            X.01V r13 = X.AnonymousClass01V.A0p
            X.C04220Ms.A06(r13)
            com.instagram.security.attestation.keystore.client.KeyAttestationClient r0 = new com.instagram.security.attestation.keystore.client.KeyAttestationClient
            r0.<init>(r2, r13, r1, r3)
            if (r12 == 0) goto L_0x008e
            r0.A00 = r12
        L_0x008e:
            boolean r2 = X.C18180wK.A1V(r20)
            goto L_0x009c
        L_0x0093:
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r15)     // Catch:{ IllegalStateException -> 0x0150 }
            X.Grx r1 = X.AnonymousClass3WK.A01(r0)     // Catch:{ IllegalStateException -> 0x0150 }
            goto L_0x0080
        L_0x009c:
            r10.A01 = r15     // Catch:{ 6CP -> 0x00e8, 661 -> 0x00e6, 6CC -> 0x00e4, IllegalStateException -> 0x00d0 }
            r10.A02 = r4     // Catch:{ 6CP -> 0x00ce, 661 -> 0x00cc, 6CC -> 0x00ca, IllegalStateException -> 0x00d0 }
            r10.A03 = r12     // Catch:{ 6CP -> 0x00ce, 661 -> 0x00cc, 6CC -> 0x00ca, IllegalStateException -> 0x00d0 }
            r10.A04 = r5     // Catch:{ 6CP -> 0x00ce, 661 -> 0x00cc, 6CC -> 0x00ca, IllegalStateException -> 0x00d0 }
            r10.A00 = r6     // Catch:{ 6CP -> 0x00ce, 661 -> 0x00cc, 6CC -> 0x00ca, IllegalStateException -> 0x00d0 }
            com.instagram.security.attestation.keystore.client.KeyAttestationClient$attest$2 r1 = new com.instagram.security.attestation.keystore.client.KeyAttestationClient$attest$2     // Catch:{ 6CP -> 0x00ce, 661 -> 0x00cc, 6CC -> 0x00ca, IllegalStateException -> 0x00d0 }
            r1.<init>(r15, r0, r14, r2)     // Catch:{ 6CP -> 0x00ce, 661 -> 0x00cc, 6CC -> 0x00ca, IllegalStateException -> 0x00d0 }
            r0 = r19
            java.lang.Object r1 = X.C25599DoZ.A00(r10, r0, r1)     // Catch:{ 6CP -> 0x00ce, 661 -> 0x00cc, 6CC -> 0x00ca, IllegalStateException -> 0x00d0 }
            if (r1 != r9) goto L_0x00b4
            return r9
        L_0x00b4:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5000000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5000000_I2) r1     // Catch:{ 6CP -> 0x00c8, 661 -> 0x00c6, 6CC -> 0x00c4, IllegalStateException -> 0x00d0 }
            if (r5 == 0) goto L_0x00bc
            X.1ui r0 = r5.A00     // Catch:{ 6CP -> 0x00c8, 661 -> 0x00c6, 6CC -> 0x00c4, IllegalStateException -> 0x00d0 }
            r0.A00 = r1     // Catch:{ 6CP -> 0x00c8, 661 -> 0x00c6, 6CC -> 0x00c4, IllegalStateException -> 0x00d0 }
        L_0x00bc:
            r0 = 19
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r9 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2     // Catch:{ 6CP -> 0x00c8, 661 -> 0x00c6, 6CC -> 0x00c4, IllegalStateException -> 0x00d0 }
            r9.<init>((int) r0, (java.lang.Object) r1, (boolean) r6)     // Catch:{ 6CP -> 0x00c8, 661 -> 0x00c6, 6CC -> 0x00c4, IllegalStateException -> 0x00d0 }
            return r9
        L_0x00c4:
            r2 = move-exception
            goto L_0x012b
        L_0x00c6:
            r2 = move-exception
            goto L_0x011b
        L_0x00c8:
            r2 = move-exception
            goto L_0x00eb
        L_0x00ca:
            r2 = move-exception
            goto L_0x012b
        L_0x00cc:
            r2 = move-exception
            goto L_0x011b
        L_0x00ce:
            r2 = move-exception
            goto L_0x00eb
        L_0x00d0:
            if (r5 == 0) goto L_0x00d6
            X.1ui r0 = r5.A00
            r0.A00 = r14
        L_0x00d6:
            r4 = 19
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r9 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2
            r1 = r14
            r2 = r14
            r3 = r16
            r5 = r6
            r0 = r9
            r0.<init>((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5000000_I2) r1, (kotlin.jvm.internal.DefaultConstructorMarker) r2, (int) r3, (int) r4, (boolean) r5)
            return r9
        L_0x00e4:
            r2 = move-exception
            goto L_0x012b
        L_0x00e6:
            r2 = move-exception
            goto L_0x011b
        L_0x00e8:
            r2 = move-exception
            goto L_0x00eb
        L_0x00ea:
            r2 = move-exception
        L_0x00eb:
            java.lang.String r6 = "Key attestation failed during AttestationKeystore operation"
            X.AnonymousClass0LU.A0E(r4, r6, r2)
            boolean r3 = r2 instanceof X.C91185fm
            X.0on r0 = X.C10770iu.A00()
            X.0oo r1 = r0.ABJ(r4, r7)
            if (r3 == 0) goto L_0x010c
            java.lang.String r0 = "Key attestation failed due to insecure key generation"
            r1.A8U(r8, r0)
            r1.Ciu(r2)
            r1.report()
            if (r12 == 0) goto L_0x0130
            X.6BG r1 = X.AnonymousClass6BG.INSECURE_KEY_ATTESTATION
            goto L_0x0124
        L_0x010c:
            r1.A8U(r8, r6)
            r1.Ciu(r2)
            r1.report()
            if (r12 == 0) goto L_0x0130
            X.6BG r1 = X.AnonymousClass6BG.OTHER_KEY_ATTESTATION
            goto L_0x0124
        L_0x011a:
            r2 = move-exception
        L_0x011b:
            java.lang.String r0 = "Key attestation failed during GraphQL execution"
            X.C86104wH.A1T(r4, r0, r7, r2)
            if (r12 == 0) goto L_0x0130
            X.6BG r1 = X.AnonymousClass6BG.API_NETWORK_OR_GRAPHQL
        L_0x0124:
            java.lang.String r0 = "error_type"
            r12.A0O(r1, r0)
            goto L_0x0130
        L_0x012a:
            r2 = move-exception
        L_0x012b:
            java.lang.String r0 = "Key attestation failure related to nonce"
            X.C86104wH.A1T(r4, r0, r7, r2)
        L_0x0130:
            if (r5 == 0) goto L_0x0135
            r2.getMessage()
        L_0x0135:
            r4 = 19
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r9 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2
            r1 = r14
            r2 = r14
            r3 = r16
            r5 = r18
            r0 = r9
            r0.<init>((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5000000_I2) r1, (kotlin.jvm.internal.DefaultConstructorMarker) r2, (int) r3, (int) r4, (boolean) r5)
            return r9
        L_0x0144:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0147:
            if (r12 == 0) goto L_0x0150
            X.6BG r1 = X.AnonymousClass6BG.EMPTY_APP_SCOPED_DEVICE_ID
            java.lang.String r0 = "error_type"
            r12.A0O(r1, r0)
        L_0x0150:
            r17 = 19
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r13 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2
            r15 = r14
            r13.<init>((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5000000_I2) r14, (kotlin.jvm.internal.DefaultConstructorMarker) r15, (int) r16, (int) r17, (boolean) r18)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.security.attestation.keystore.worker.KeyAttestationUtils.A00(android.content.Context, com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000, X.0i6, X.360, java.lang.String, X.8n9, X.Ew2, boolean):java.lang.Object");
    }
}
