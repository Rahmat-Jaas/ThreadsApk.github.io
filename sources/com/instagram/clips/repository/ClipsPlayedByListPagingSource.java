package com.instagram.clips.repository;

import X.A4B;
import X.C115116uX;
import androidx.paging.PagingSource;
import com.instagram.service.session.UserSession;

public final class ClipsPlayedByListPagingSource extends PagingSource {
    public final A4B A00;
    public final UserSession A01;
    public final String A02;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C112056ou r8, X.C146958n9 r9) {
        /*
            r7 = this;
            r3 = 39
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r3, r9)
            if (r0 == 0) goto L_0x0070
            r5 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0070
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
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
            X.1RY r0 = (X.AnonymousClass1RY) r0
            X.37H r0 = r0.A00
            if (r0 != 0) goto L_0x0078
            X.C18250wR.A0m()
            r0 = 0
            throw r0
        L_0x0039:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r1 = r7.A01
            java.lang.String r0 = r7.A02
            java.lang.Object r4 = r8.A00()
            java.lang.String r4 = (java.lang.String) r4
            r5.A00 = r2
            r3 = 0
            X.H1T r2 = X.AnonymousClass0wJ.A0P(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "media/%s/list_clips_media_viewer/"
            r2.A0T(r0, r1)
            java.lang.Class<X.1RY> r1 = X.AnonymousClass1RY.class
            java.lang.Class<X.3KI> r0 = X.AnonymousClass3KI.class
            r2.A0B(r1, r0)
            java.lang.String r0 = "max_id"
            r2.A0P(r0, r4)
            X.H8c r1 = r2.A02()
            r0 = 1479938921(0x58361369, float:8.0077793E14)
            java.lang.Object r1 = X.C63623hv.A00(r1, r5, r0, r3)
            if (r1 != r6) goto L_0x0024
            return r6
        L_0x0070:
            r0 = 42
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2
            r5.<init>(r7, r9, r3, r0)
            goto L_0x0016
        L_0x0078:
            java.util.List r2 = r0.A01
            r1 = 0
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
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.repository.ClipsPlayedByListPagingSource.A01(X.6ou, X.8n9):java.lang.Object");
    }

    public ClipsPlayedByListPagingSource(A4B a4b, UserSession userSession, String str) {
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = a4b;
    }

    public final /* bridge */ /* synthetic */ Object A02(C115116uX r2) {
        return null;
    }
}
