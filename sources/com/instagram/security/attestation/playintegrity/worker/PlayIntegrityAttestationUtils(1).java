package com.instagram.security.attestation.playintegrity.worker;

public final class PlayIntegrityAttestationUtils {
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r6 = e;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
        r1 = e;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        r6 = e;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ae, code lost:
        r1 = e;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b5, code lost:
        return new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b6, code lost:
        r6 = e;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b9, code lost:
        X.C86104wH.A1T(r2, "Play Integrity attestation failure related to nonce", 817896512, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bf, code lost:
        r1 = e;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d9, code lost:
        r5.A0O(X.AnonymousClass6BD.INTEGRITY_SERVICE, "error_type");
        r5.A0S("integrity_error_code", new java.lang.Long((long) r6.A00.A01));
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0038, B:29:0x0088] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0038, B:31:0x008a] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[ExcHandler: IllegalStateException (unused java.lang.IllegalStateException), SYNTHETIC, Splitter:B:10:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8 A[ExcHandler: 6CD (r1v5 'e' X.6CD A[CUSTOM_DECLARE]), PHI: r2 
      PHI: (r2v4 java.lang.String) = (r2v5 java.lang.String), (r2v0 java.lang.String), (r2v0 java.lang.String), (r2v0 java.lang.String), (r2v7 java.lang.String), (r2v7 java.lang.String) binds: [B:36:0x00a2, B:29:0x0088, B:30:?, B:31:0x008a, B:10:0x0038, B:11:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:10:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.content.Context r12, com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r13, X.C10300i6 r14, java.lang.String r15, X.C146958n9 r16, X.C27952Ew2 r17, boolean r18) {
        /*
            r5 = r13
            r2 = r15
            r9 = 0
            r4 = 4
            r6 = r16
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1.A00(r4, r6)
            if (r0 == 0) goto L_0x0032
            r8 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1 r8 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1) r8
            int r3 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0032
            int r3 = r3 - r1
            r8.A00 = r3
        L_0x001a:
            java.lang.Object r1 = r8.A05
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r8.A00
            r3 = 817896512(0x30c01c40, float:1.3977868E-9)
            r6 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0041
            if (r0 != r6) goto L_0x003c
            java.lang.Object r5 = r8.A03
            X.0A3 r5 = (X.AnonymousClass0A3) r5
            java.lang.Object r2 = r8.A02
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0038
        L_0x0032:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1 r8 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1
            r8.<init>(r4, r6)
            goto L_0x001a
        L_0x0038:
            X.AnonymousClass0OU.A00(r1)     // Catch:{ 661 -> 0x00c1, 6CD -> 0x00b8, 5lA -> 0x00d1, IllegalStateException -> 0x00b0 }
            goto L_0x00a0
        L_0x003c:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0041:
            X.AnonymousClass0OU.A00(r1)
            X.0ev r0 = X.C09140ev.A02
            java.lang.String r10 = r0.A04(r12)
            if (r10 == 0) goto L_0x00f5
            int r0 = r10.length()
            if (r0 == 0) goto L_0x00f5
            if (r13 == 0) goto L_0x0059
            java.lang.String r0 = "app_scoped_device_id"
            r13.A0T(r0, r10)
        L_0x0059:
            r1 = r14
            boolean r0 = r14 instanceof X.C07530bf
            if (r0 == 0) goto L_0x007f
            r0 = r1
            X.0bf r0 = (X.C07530bf) r0
            X.Grx r14 = X.AnonymousClass3WK.A00(r0)
        L_0x0065:
            X.01V r13 = X.AnonymousClass01V.A0p
            X.C04220Ms.A06(r13)
            com.instagram.security.attestation.playintegrity.client.IgGooglePlayIntegrityAttestor r15 = new com.instagram.security.attestation.playintegrity.client.IgGooglePlayIntegrityAttestor
            r15.<init>(r13)
            com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient r11 = new com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient
            r16 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            if (r5 == 0) goto L_0x007a
            r11.A00 = r5
        L_0x007a:
            boolean r10 = X.C18180wK.A1V(r18)
            goto L_0x0088
        L_0x007f:
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r14)     // Catch:{ IllegalStateException -> 0x00fe }
            X.Grx r14 = X.AnonymousClass3WK.A01(r0)     // Catch:{ IllegalStateException -> 0x00fe }
            goto L_0x0065
        L_0x0088:
            r8.A01 = r1     // Catch:{ 661 -> 0x00bf, 6CD -> 0x00b8, 5lA -> 0x00b6, IllegalStateException -> 0x00b0 }
            r8.A02 = r2     // Catch:{ 661 -> 0x00ae, 6CD -> 0x00b8, 5lA -> 0x00ac, IllegalStateException -> 0x00b0 }
            r8.A03 = r5     // Catch:{ 661 -> 0x00ae, 6CD -> 0x00b8, 5lA -> 0x00ac, IllegalStateException -> 0x00b0 }
            r8.A04 = r9     // Catch:{ 661 -> 0x00ae, 6CD -> 0x00b8, 5lA -> 0x00ac, IllegalStateException -> 0x00b0 }
            r8.A00 = r6     // Catch:{ 661 -> 0x00ae, 6CD -> 0x00b8, 5lA -> 0x00ac, IllegalStateException -> 0x00b0 }
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0412000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0412000_I2     // Catch:{ 661 -> 0x00ae, 6CD -> 0x00b8, 5lA -> 0x00ac, IllegalStateException -> 0x00b0 }
            r0.<init>(r1, r11, r9, r10)     // Catch:{ 661 -> 0x00ae, 6CD -> 0x00b8, 5lA -> 0x00ac, IllegalStateException -> 0x00b0 }
            r1 = r17
            java.lang.Object r1 = X.C25599DoZ.A00(r8, r1, r0)     // Catch:{ 661 -> 0x00ae, 6CD -> 0x00b8, 5lA -> 0x00ac, IllegalStateException -> 0x00b0 }
            if (r1 != r7) goto L_0x00a0
            return r7
        L_0x00a0:
            r0 = 20
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r7 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2     // Catch:{ 661 -> 0x00aa, 6CD -> 0x00b8, 5lA -> 0x00a8, IllegalStateException -> 0x00b0 }
            r7.<init>((int) r0, (java.lang.Object) r1, (boolean) r6)     // Catch:{ 661 -> 0x00aa, 6CD -> 0x00b8, 5lA -> 0x00a8, IllegalStateException -> 0x00b0 }
            return r7
        L_0x00a8:
            r6 = move-exception
            goto L_0x00d2
        L_0x00aa:
            r1 = move-exception
            goto L_0x00c2
        L_0x00ac:
            r6 = move-exception
            goto L_0x00d2
        L_0x00ae:
            r1 = move-exception
            goto L_0x00c2
        L_0x00b0:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r7 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2
            r7.<init>((boolean) r6)
            return r7
        L_0x00b6:
            r6 = move-exception
            goto L_0x00d2
        L_0x00b8:
            r1 = move-exception
            java.lang.String r0 = "Play Integrity attestation failure related to nonce"
            X.C86104wH.A1T(r2, r0, r3, r1)
            goto L_0x00ef
        L_0x00bf:
            r1 = move-exception
            goto L_0x00c2
        L_0x00c1:
            r1 = move-exception
        L_0x00c2:
            java.lang.String r0 = "Play Integrity attestation failed during GraphQL execution"
            X.C86104wH.A1T(r2, r0, r3, r1)
            if (r5 == 0) goto L_0x00ef
            X.6BD r1 = X.AnonymousClass6BD.API_NETWORK_OR_GRAPHQL
            java.lang.String r0 = "error_type"
            r5.A0O(r1, r0)
            goto L_0x00ef
        L_0x00d1:
            r6 = move-exception
        L_0x00d2:
            java.lang.String r0 = "Play Integrity attestation failed while requesting integrity token from Google"
            X.C86104wH.A1T(r2, r0, r3, r6)
            if (r5 == 0) goto L_0x00ef
            X.6BD r1 = X.AnonymousClass6BD.INTEGRITY_SERVICE
            java.lang.String r0 = "error_type"
            r5.A0O(r1, r0)
            com.google.android.gms.common.api.Status r0 = r6.A00
            int r0 = r0.A01
            long r2 = (long) r0
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r2)
            java.lang.String r0 = "integrity_error_code"
            r5.A0S(r0, r1)
        L_0x00ef:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r7 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2
            r7.<init>((boolean) r4)
            return r7
        L_0x00f5:
            if (r13 == 0) goto L_0x00fe
            X.6BD r1 = X.AnonymousClass6BD.EMPTY_APP_SCOPED_DEVICE_ID
            java.lang.String r0 = "error_type"
            r13.A0O(r1, r0)
        L_0x00fe:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2
            r0.<init>((boolean) r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.security.attestation.playintegrity.worker.PlayIntegrityAttestationUtils.A00(android.content.Context, com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000, X.0i6, java.lang.String, X.8n9, X.Ew2, boolean):java.lang.Object");
    }
}
