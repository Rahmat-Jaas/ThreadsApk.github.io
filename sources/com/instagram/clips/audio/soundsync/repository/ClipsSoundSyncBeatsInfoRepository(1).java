package com.instagram.clips.audio.soundsync.repository;

import android.util.LruCache;
import com.instagram.service.session.UserSession;

public final class ClipsSoundSyncBeatsInfoRepository {
    public final LruCache A00 = new LruCache(10);
    public final UserSession A01;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncBeatsInfoRepository r7, X.C109216je r8, X.C146958n9 r9) {
        /*
            r3 = 24
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1.A00(r3, r9)
            if (r0 == 0) goto L_0x005c
            r6 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005c
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A02
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r4) goto L_0x0072
            java.lang.Object r8 = r6.A01
            X.6je r8 = (X.C109216je) r8
            X.AnonymousClass0OU.A00(r1)
        L_0x0028:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0062
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r0 = r1.A00
            X.5tf r0 = (X.C94045tf) r0
            int r2 = r8.A01
            int r1 = r8.A00
            java.util.List r0 = r0.A00
            X.6uM r5 = new X.6uM
            r5.<init>(r0, r2, r1)
            return r5
        L_0x0040:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r1 = r7.A01
            java.lang.String r0 = r8.A02
            X.H8c r3 = X.C102036To.A00(r1, r0)
            r2 = 0
            r1 = 14
            r6.A01 = r8
            r6.A00 = r4
            r0 = 732577955(0x2baa40a3, float:1.2097167E-12)
            java.lang.Object r1 = X.C63623hv.A01(r3, r6, r0, r2, r1)
            if (r1 != r5) goto L_0x0028
            return r5
        L_0x005c:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1
            r6.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x0062:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "IG Clips fetch beats info network request failed"
            java.io.IOException r0 = X.C86154wM.A0V(r0)
            throw r0
        L_0x006d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0072:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncBeatsInfoRepository.A00(com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncBeatsInfoRepository, X.6je, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C109216je r7, X.C146958n9 r8) {
        /*
            r6 = this;
            r3 = 21
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r3, r8)
            if (r0 == 0) goto L_0x002a
            r5 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002a
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A04
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 != r3) goto L_0x0034
            java.lang.Object r0 = r5.A03
            java.lang.Object r2 = r5.A02
            java.lang.Object r3 = r5.A01
            com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncBeatsInfoRepository r3 = (com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncBeatsInfoRepository) r3
            goto L_0x0030
        L_0x002a:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x0030:
            X.AnonymousClass0OU.A00(r1)     // Catch:{ IOException -> 0x0063 }
            goto L_0x005c
        L_0x0034:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0039:
            X.AnonymousClass0OU.A00(r1)
            java.lang.String r2 = r7.A02
            int r1 = r7.A01
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            kotlin.Pair r2 = X.C18180wK.A0p(r2, r0)
            android.util.LruCache r0 = r6.A00
            java.lang.Object r0 = r0.get(r2)
            if (r0 != 0) goto L_0x0063
            X.C86114wI.A1J(r6, r2, r0, r5, r3)     // Catch:{ IOException -> 0x0063 }
            java.lang.Object r1 = A00(r6, r7, r5)     // Catch:{ IOException -> 0x0063 }
            if (r1 != r4) goto L_0x005b
            return r4
        L_0x005b:
            r3 = r6
        L_0x005c:
            android.util.LruCache r0 = r3.A00     // Catch:{ IOException -> 0x0062 }
            r0.put(r2, r1)     // Catch:{ IOException -> 0x0062 }
            return r1
        L_0x0062:
            return r1
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncBeatsInfoRepository.A01(X.6je, X.8n9):java.lang.Object");
    }

    public ClipsSoundSyncBeatsInfoRepository(UserSession userSession) {
        this.A01 = userSession;
    }
}
