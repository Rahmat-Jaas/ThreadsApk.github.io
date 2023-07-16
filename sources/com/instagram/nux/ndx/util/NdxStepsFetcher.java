package com.instagram.nux.ndx.util;

import X.C04220Ms;
import com.instagram.nux.ndx.api.NDXIGStepsAPI;
import com.instagram.service.session.UserSession;

public final class NdxStepsFetcher {
    public final NDXIGStepsAPI A00;
    public final UserSession A01;

    public /* synthetic */ NdxStepsFetcher(UserSession userSession, Integer num) {
        NDXIGStepsAPI nDXIGStepsAPI = new NDXIGStepsAPI();
        C04220Ms.A0B(num, 2);
        this.A01 = userSession;
        this.A00 = nDXIGStepsAPI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r2 != null) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(int r7, X.C146958n9 r8) {
        /*
            r6 = this;
            r3 = 17
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7.A00(r3, r8)
            if (r0 == 0) goto L_0x0060
            r5 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0060
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x004e
            if (r0 != r3) goto L_0x0068
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            X.3b6 r1 = (X.C62903b6) r1
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x003e
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r2 = r1.A00
            java.util.AbstractCollection r2 = (java.util.AbstractCollection) r2
            if (r2 == 0) goto L_0x003c
        L_0x0036:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            return r2
        L_0x003e:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0036
            kotlin.Unit r0 = kotlin.Unit.A00
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "NDX IG Server Step Fetch Error"
            X.C10450iM.A03(r0, r1)
            goto L_0x0036
        L_0x004e:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.nux.ndx.api.NDXIGStepsAPI r2 = r6.A00
            com.instagram.service.session.UserSession r1 = r6.A01
            java.lang.String r0 = "NDX_IG4A_MA_FEATURE"
            r5.A00 = r3
            java.lang.Object r1 = r2.A00(r1, r0, r5, r7)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x0060:
            r0 = 42
            kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7
            r5.<init>(r6, r8, r3, r0)
            goto L_0x0016
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.ndx.util.NdxStepsFetcher.A00(int, X.8n9):java.lang.Object");
    }
}
