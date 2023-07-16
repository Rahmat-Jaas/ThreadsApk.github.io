package com.instagram.arp.api;

import com.instagram.service.session.UserSession;

public final class AvatarTaskHelper {
    public final UserSession A00;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.arp.api.AvatarTaskHelper r5, java.lang.String r6, X.C146958n9 r7, X.AnonymousClass0YY r8) {
        /*
            r3 = 43
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r7)
            if (r0 == 0) goto L_0x0053
            r4 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0053
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0045
            if (r1 != r0) goto L_0x005e
            java.lang.Object r6 = r4.A01
            java.lang.String r6 = (java.lang.String) r6
            X.AnonymousClass0OU.A00(r3)
        L_0x0028:
            r2 = r3
            X.3b6 r2 = (X.C62903b6) r2
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0044
            boolean r0 = r2 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0059
            X.1jB r2 = (X.AnonymousClass1jB) r2
            java.lang.Object r1 = r2.A00
            java.lang.String r0 = "Failed with error: "
            java.lang.String r0 = X.AnonymousClass0wJ.A0t(r0, r1)
            X.C10450iM.A03(r6, r0)
            X.1jB r2 = X.AnonymousClass1jB.A01()
        L_0x0044:
            return r2
        L_0x0045:
            X.AnonymousClass0OU.A00(r3)
            r4.A01 = r6
            r4.A00 = r0
            java.lang.Object r3 = r8.invoke(r4)
            if (r3 != r2) goto L_0x0028
            return r2
        L_0x0053:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2
            r4.<init>(r5, r7, r3)
            goto L_0x0016
        L_0x0059:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x005e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arp.api.AvatarTaskHelper.A00(com.instagram.arp.api.AvatarTaskHelper, java.lang.String, X.8n9, X.0YY):java.lang.Object");
    }

    public AvatarTaskHelper(UserSession userSession) {
        this.A00 = userSession;
    }
}
