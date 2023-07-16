package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C10300i6;
import X.C142308ee;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import X.C883457r;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient;
import kotlin.Unit;

public class KtSLambdaShape0S0412000_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public final int A07 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S0412000_I2(C142308ee r2, C883457r r3, ImageUrl imageUrl, ImageUrl imageUrl2, C146958n9 r6, int i, boolean z) {
        super(2, r6);
        this.A04 = r2;
        this.A05 = r3;
        this.A00 = i;
        this.A02 = imageUrl;
        this.A03 = imageUrl2;
        this.A06 = z;
    }

    public final C146958n9 create(Object obj, C146958n9 r13) {
        C146958n9 r8 = r13;
        if (this.A07 != 0) {
            return new KtSLambdaShape0S0412000_I2((C10300i6) this.A02, (PlayIntegrityAttestationClient) this.A05, r13, this.A06);
        }
        return new KtSLambdaShape0S0412000_I2((C142308ee) this.A04, (C883457r) this.A05, (ImageUrl) this.A02, (ImageUrl) this.A03, r8, this.A00, this.A06);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r4 = r24
            r10 = r25
            int r0 = r4.A07
            if (r0 == 0) goto L_0x0148
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A01
            java.lang.String r8 = "validate_end"
            java.lang.String r6 = "nonce_end"
            r9 = 3
            r7 = 2
            r11 = 1
            r3 = 533737437(0x1fd02fdd, float:8.817061E-20)
            if (r0 == 0) goto L_0x002b
            int r1 = r4.A00
            if (r0 == r11) goto L_0x0056
            if (r0 == r7) goto L_0x008f
            java.lang.Object r6 = r4.A04
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r4.A03
            java.lang.String r2 = (java.lang.String) r2
            X.AnonymousClass0OU.A00(r10)     // Catch:{ all -> 0x0116 }
            goto L_0x0121
        L_0x002b:
            X.AnonymousClass0OU.A00(r10)
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r1 = r0.nextInt()
            java.lang.Object r10 = r4.A05
            com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient r10 = (com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient) r10
            X.01V r2 = r10.A02
            r2.markerStart((int) r3, (int) r1)
            java.lang.String r0 = "nonce_start"
            r2.markerPoint((int) r3, (int) r1, (java.lang.String) r0)     // Catch:{ all -> 0x013d }
            java.lang.Object r2 = r4.A02     // Catch:{ all -> 0x013d }
            X.0i6 r2 = (X.C10300i6) r2     // Catch:{ all -> 0x013d }
            java.lang.String r0 = r10.A05     // Catch:{ all -> 0x013d }
            r4.A00 = r1     // Catch:{ all -> 0x013d }
            r4.A01 = r11     // Catch:{ all -> 0x013d }
            java.lang.Object r10 = com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient.A00(r2, r10, r0, r4)     // Catch:{ all -> 0x013d }
            if (r10 != r5) goto L_0x0059
            return r5
        L_0x0056:
            X.AnonymousClass0OU.A00(r10)     // Catch:{ all -> 0x013d }
        L_0x0059:
            X.5sg r10 = (X.AnonymousClass5sg) r10     // Catch:{ all -> 0x013d }
            java.lang.Object r12 = r4.A05
            com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient r12 = (com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient) r12
            X.01V r0 = r12.A02
            r0.markerPoint((int) r3, (int) r1, (java.lang.String) r6)
            if (r10 == 0) goto L_0x0136
            X.6d8 r0 = r10.A00
            if (r0 != 0) goto L_0x006f
            X.C18250wR.A0m()
            r2 = 0
            throw r2
        L_0x006f:
            java.lang.String r2 = r0.A00
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r10 = r12.A00
            if (r10 == 0) goto L_0x007e
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r11)
            java.lang.String r0 = "has_challenge_nonce"
            r10.A0Q(r0, r6)
        L_0x007e:
            com.instagram.security.attestation.playintegrity.client.IgGooglePlayIntegrityAttestor r6 = r12.A04
            android.content.Context r0 = r12.A01
            r4.A03 = r2
            r4.A00 = r1
            r4.A01 = r7
            java.lang.Object r10 = r6.A00(r0, r2, r4)
            if (r10 != r5) goto L_0x0096
            return r5
        L_0x008f:
            java.lang.Object r2 = r4.A03
            java.lang.String r2 = (java.lang.String) r2
            X.AnonymousClass0OU.A00(r10)
        L_0x0096:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2 r10 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2) r10
            java.lang.String r6 = r10.A00
            java.lang.Object r0 = r4.A05
            com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient r0 = (com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient) r0
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r12 = r0.A00
            if (r12 == 0) goto L_0x00b2
            int r10 = r6.length()
            if (r10 > 0) goto L_0x00a9
            r11 = 0
        L_0x00a9:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            java.lang.String r10 = "has_integrity_token"
            r12.A0Q(r10, r11)
        L_0x00b2:
            boolean r10 = r4.A06
            if (r10 == 0) goto L_0x012a
            r10 = 0
            X.C04220Ms.A0B(r6, r10)
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r12 = X.C86154wM.A0L()
            java.lang.String r11 = r0.A05
            java.lang.String r10 = "app_scoped_device_id"
            r12.A0D(r11, r10)
            java.lang.String r10 = "integrity_verdict"
            r12.A0D(r6, r10)
            r20 = 0
            X.3zb r11 = X.C67463zb.A00()
            X.3zb r10 = X.C67463zb.A00()
            X.C67463zb.A01(r12, r11)
            r19 = 1
            X.8l9 r14 = X.C63233h2.A00()
            java.util.Map r16 = r11.getParamsCopy()
            java.util.Map r17 = r10.getParamsCopy()
            java.lang.Class<com.instagram.graphql.instagramschema.IgAppAttestationAndroidGooglePlayIntegrityChallengeValidateResponseImpl> r18 = com.instagram.graphql.instagramschema.IgAppAttestationAndroidGooglePlayIntegrityChallengeValidateResponseImpl.class
            java.lang.String r15 = "IgAppAttestationAndroidGooglePlayIntegrityChallengeValidate"
            r21 = 96
            java.lang.String r23 = "xfb_ig_app_attestation_android_google_play_integrity_challenge_validate"
            com.facebook.pando.PandoGraphQLRequest r13 = new com.facebook.pando.PandoGraphQLRequest
            r22 = r20
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.7nk r12 = new X.7nk
            r12.<init>()
            X.01V r11 = r0.A02     // Catch:{ all -> 0x0116 }
            java.lang.String r10 = "validate_start"
            r11.markerPoint((int) r3, (int) r1, (java.lang.String) r10)     // Catch:{ all -> 0x0116 }
            X.Grx r0 = r0.A03     // Catch:{ all -> 0x0116 }
            r0.AMA(r13, r12)     // Catch:{ all -> 0x0116 }
            r4.A03 = r2     // Catch:{ all -> 0x0116 }
            r4.A04 = r6     // Catch:{ all -> 0x0116 }
            r4.A00 = r1     // Catch:{ all -> 0x0116 }
            r4.A01 = r9     // Catch:{ all -> 0x0116 }
            com.google.common.util.concurrent.SettableFuture r0 = r12.A00     // Catch:{ all -> 0x0116 }
            java.lang.Object r0 = X.C29786Fu6.A00(r0, r4)     // Catch:{ all -> 0x0116 }
            if (r0 != r5) goto L_0x0121
            return r5
        L_0x0116:
            r2 = move-exception
            java.lang.Object r0 = r4.A05
            com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient r0 = (com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient) r0
            X.01V r0 = r0.A02
            r0.markerPoint((int) r3, (int) r1, (java.lang.String) r8)
            throw r2
        L_0x0121:
            java.lang.Object r0 = r4.A05
            com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient r0 = (com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient) r0
            X.01V r4 = r0.A02
            r4.markerPoint((int) r3, (int) r1, (java.lang.String) r8)
        L_0x012a:
            X.01V r0 = r0.A02
            r0.markerEnd(r3, r1, r7)
            r0 = 0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r5 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2
            r5.<init>(r2, r6, r0)
            return r5
        L_0x0136:
            java.lang.String r0 = "Server did not respond with a nonce"
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r0)
            throw r2
        L_0x013d:
            r2 = move-exception
            java.lang.Object r0 = r4.A05
            com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient r0 = (com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient) r0
            X.01V r0 = r0.A02
            r0.markerPoint((int) r3, (int) r1, (java.lang.String) r6)
            throw r2
        L_0x0148:
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A01
            r2 = 1
            if (r0 == 0) goto L_0x0157
            if (r0 != r2) goto L_0x025d
            X.AnonymousClass0OU.A00(r10)
        L_0x0154:
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        L_0x0157:
            X.AnonymousClass0OU.A00(r10)
            java.lang.Object r1 = r4.A04
            X.8ee r1 = (X.C142308ee) r1
            boolean r0 = r1 instanceof X.AnonymousClass5LX
            r11 = 0
            if (r0 == 0) goto L_0x024a
            java.lang.Object r12 = r4.A05
            X.57r r12 = (X.C883457r) r12
            X.4wE r10 = r12.A05
            X.5LX r1 = (X.AnonymousClass5LX) r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1201000_I2 r9 = r1.A01
            java.lang.Object r8 = r9.A02
            java.util.List r8 = (java.util.List) r8
            int r7 = r4.A00
            java.util.Iterator r1 = r8.iterator()
            r14 = 0
        L_0x0178:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x018b
            java.lang.Object r0 = r1.next()
            X.5Hc r0 = (X.AnonymousClass5Hc) r0
            boolean r0 = r0.A06
            if (r0 != 0) goto L_0x018c
            int r14 = r14 + 1
            goto L_0x0178
        L_0x018b:
            r14 = -1
        L_0x018c:
            java.util.ArrayList r3 = X.C18200wM.A0s(r8)
            if (r14 < 0) goto L_0x01bd
            java.lang.Object r1 = r3.get(r14)
            X.5Hc r1 = (X.AnonymousClass5Hc) r1
            java.lang.String r0 = r1.A04
            r16 = r0
            java.lang.String r15 = r1.A02
            int r13 = r1.A00
            java.lang.String r6 = r1.A05
            java.lang.String r5 = r1.A03
            X.3Dd r1 = r1.A01
            X.5Hc r0 = new X.5Hc
            r22 = r11
            r21 = r13
            r20 = r5
            r19 = r6
            r18 = r15
            r17 = r16
            r16 = r1
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r3.set(r14, r0)
        L_0x01bd:
            java.lang.Object r0 = r3.get(r7)
            X.5Hc r0 = (X.AnonymousClass5Hc) r0
            java.lang.String r14 = r0.A04
            java.lang.String r13 = r0.A02
            int r6 = r0.A00
            java.lang.String r5 = r0.A05
            java.lang.String r1 = r0.A03
            X.3Dd r0 = r0.A01
            X.5Hc r15 = new X.5Hc
            r16 = r0
            r17 = r14
            r18 = r13
            r19 = r5
            r20 = r1
            r21 = r6
            r22 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r3.set(r7, r15)
            java.lang.String r2 = r9.A03
            int r1 = r9.A00
            java.lang.Object r0 = r9.A01
            X.20f r0 = (X.C302320f) r0
            X.C18180wK.A1P(r2, r11, r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1201000_I2 r6 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1201000_I2
            r6.<init>((X.C302320f) r0, (java.lang.String) r2, (java.util.List) r3, (int) r1)
            java.lang.Object r3 = r8.get(r7)
            X.5Hc r3 = (X.AnonymousClass5Hc) r3
            java.lang.Object r2 = r4.A02
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            java.lang.Object r0 = r4.A03
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            boolean r5 = r4.A06
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0310000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0310000_I2
            r1.<init>((X.AnonymousClass5Hc) r3, (com.instagram.common.typedurl.ImageUrl) r2, (com.instagram.common.typedurl.ImageUrl) r0, (boolean) r5)
            X.5LX r0 = new X.5LX
            r0.<init>(r1, r6, r11)
            r10.CrC(r0)
            X.7EX r4 = r12.A00
            java.lang.Object r0 = r8.get(r7)
            X.5Hc r0 = (X.AnonymousClass5Hc) r0
            java.lang.String r3 = r0.A04
            int r1 = r9.A00
            java.lang.Integer r0 = X.AnonymousClass006.A00
            X.5Ch r2 = X.AnonymousClass7EX.A00(r4, r0, r0)
            X.C86134wK.A1F(r2, r1)
            java.lang.String r0 = "gift_id"
            r2.A0A(r0, r3)
            java.util.List r1 = r4.A00
            java.lang.String r0 = "gift_options"
            r2.A0B(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "send_button_enabled"
            r2.A07(r0, r1)
            X.0nS r1 = r4.A02
            X.C04220Ms.A05(r1)
            com.instagram.appreciation.analytics.LoggingFanData r0 = r4.A01
            java.lang.String r0 = r0.A03
            X.C86104wH.A1I(X.AnonymousClass0wJ.A0M(r1, "user_click_appreciationgiver_atomic"), r2, r0, X.AnonymousClass4WJ.A0A(), 2819)
            goto L_0x0154
        L_0x024a:
            boolean r0 = r1 instanceof X.AnonymousClass5LW
            if (r0 != 0) goto L_0x0154
            java.lang.Object r1 = r4.A05
            X.57r r1 = (X.C883457r) r1
            r4.A01 = r2
            java.lang.String r0 = "appreciation_gifting_gift_selection_failure"
            java.lang.Object r0 = X.C883457r.A00(r1, r0, r4)
            if (r0 != r5) goto L_0x0154
            return r5
        L_0x025d:
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0a()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape0S0412000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape0S0412000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S0412000_I2(C10300i6 r2, PlayIntegrityAttestationClient playIntegrityAttestationClient, C146958n9 r4, boolean z) {
        super(2, r4);
        this.A05 = playIntegrityAttestationClient;
        this.A02 = r2;
        this.A06 = z;
    }
}
