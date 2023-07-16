package com.instagram.security.attestation.playintegrity.client;

import X.AnonymousClass01V;
import X.C18180wK;
import X.C31580Grx;
import android.content.Context;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

public final class PlayIntegrityAttestationClient {
    public USLEBaseShape0S0000000 A00;
    public final Context A01;
    public final AnonymousClass01V A02;
    public final C31580Grx A03;
    public final IgGooglePlayIntegrityAttestor A04;
    public final String A05;

    public PlayIntegrityAttestationClient(Context context, AnonymousClass01V r3, C31580Grx grx, IgGooglePlayIntegrityAttestor igGooglePlayIntegrityAttestor, String str) {
        C18180wK.A1Q(grx, 1, context);
        this.A03 = grx;
        this.A04 = igGooglePlayIntegrityAttestor;
        this.A05 = str;
        this.A01 = context;
        this.A02 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C10300i6 r7, com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient r8, java.lang.String r9, X.C146958n9 r10) {
        /*
            r3 = 24
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape10S0201000_I2_8.A00(r3, r10)
            if (r0 == 0) goto L_0x0057
            r5 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape10S0201000_I2_8 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape10S0201000_I2_8) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0057
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r4) goto L_0x006e
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x005f
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r6 = r1.A00
            return r6
        L_0x002f:
            X.AnonymousClass0OU.A00(r1)
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r7)
            java.lang.String r0 = "attestation/create_android_playintegrity/"
            r2.A0J(r0)
            java.lang.String r0 = "app_scoped_device_id"
            r2.A0O(r0, r9)
            java.lang.Class<X.5sg> r1 = X.AnonymousClass5sg.class
            java.lang.Class<X.6yJ> r0 = X.C117206yJ.class
            X.H8c r3 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r2 = 0
            r1 = 14
            r5.A00 = r4
            r0 = 1335113021(0x4f94353d, float:4.973034E9)
            java.lang.Object r1 = X.C63623hv.A01(r3, r5, r0, r2, r1)
            if (r1 != r6) goto L_0x0024
            return r6
        L_0x0057:
            r0 = 42
            kotlin.coroutines.jvm.internal.KtCImplShape10S0201000_I2_8 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape10S0201000_I2_8
            r5.<init>(r8, r10, r3, r0)
            goto L_0x0016
        L_0x005f:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0069
            X.6CD r0 = new X.6CD
            r0.<init>()
            throw r0
        L_0x0069:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x006e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient.A00(X.0i6, com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient, java.lang.String, X.8n9):java.lang.Object");
    }
}
