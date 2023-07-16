package com.instagram.clips.audio.trending.repository;

import X.C04220Ms;
import X.C115116uX;
import X.D6H;
import androidx.paging.PagingSource;
import com.instagram.service.session.UserSession;

public final class TrendingAudioPagingSource extends PagingSource {
    public final D6H A00;
    public final UserSession A01;
    public final String A02;

    public TrendingAudioPagingSource(D6H d6h, UserSession userSession, String str) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = d6h;
        this.A02 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C112056ou r7, X.C146958n9 r8) {
        /*
            r6 = this;
            r3 = 25
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r3, r8)
            if (r0 == 0) goto L_0x006e
            r4 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 != r2) goto L_0x00b7
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0083
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r0 = r1.A00
            X.1Rj r0 = (X.C21581Rj) r0
            X.39f r0 = r0.A01
            if (r0 != 0) goto L_0x0076
            X.C18250wR.A0m()
            r0 = 0
            throw r0
        L_0x0039:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r6.A01
            java.lang.String r3 = r6.A02
            java.lang.Object r1 = r7.A00()
            java.lang.String r1 = (java.lang.String) r1
            r4.A00 = r2
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r0 = "music/top_trends/"
            r2.A0J(r0)
            java.lang.String r0 = "referrer_audio_id"
            r2.A0O(r0, r3)
            java.lang.String r0 = "max_id"
            r2.A0O(r0, r1)
            java.lang.Class<X.1Rj> r1 = X.C21581Rj.class
            java.lang.Class<X.3KM> r0 = X.AnonymousClass3KM.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r1 = 1092486062(0x411e03ae, float:9.875898)
            r0 = 0
            java.lang.Object r1 = X.C63623hv.A00(r2, r4, r1, r0)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x006e:
            r0 = 42
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2
            r4.<init>(r6, r8, r3, r0)
            goto L_0x0016
        L_0x0076:
            java.util.List r2 = r0.A01
            r1 = 0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2 r0 = r0.A00
            java.lang.String r0 = r0.A00
            X.59e r3 = new X.59e
            r3.<init>(r1, r0, r2)
            return r3
        L_0x0083:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00b2
            X.2L8 r1 = X.AnonymousClass1jB.A00(r1)
            boolean r0 = r1 instanceof X.AnonymousClass1j9
            if (r0 == 0) goto L_0x00a4
            X.1j9 r1 = (X.AnonymousClass1j9) r1
            X.8mT r0 = r1.A00
            X.1j3 r0 = (X.AnonymousClass1j3) r0
            java.lang.String r1 = r0.getStatus()
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
        L_0x009e:
            X.59d r3 = new X.59d
            r3.<init>(r0)
            return r3
        L_0x00a4:
            boolean r0 = r1 instanceof X.AnonymousClass1j8
            if (r0 == 0) goto L_0x00ad
            X.1j8 r1 = (X.AnonymousClass1j8) r1
            java.lang.Throwable r0 = r1.A00
            goto L_0x009e
        L_0x00ad:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00b2:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00b7:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.audio.trending.repository.TrendingAudioPagingSource.A01(X.6ou, X.8n9):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object A02(C115116uX r2) {
        return null;
    }
}
