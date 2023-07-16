package com.instagram.shopping.api.partneraccounts;

import com.instagram.service.session.UserSession;

public final class PartnerAccountsApiImpl {
    public final UserSession A00;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.Boolean r8, java.lang.Boolean r9, java.lang.String r10, java.lang.String r11, X.C146958n9 r12) {
        /*
            r7 = this;
            r3 = 40
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape10S0201000_I2_8.A00(r3, r12)
            if (r0 == 0) goto L_0x006d
            r4 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape10S0201000_I2_8 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape10S0201000_I2_8) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r6) goto L_0x007a
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            r5 = r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0031
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0075
            X.1jB r5 = X.AnonymousClass1jB.A01()
        L_0x0031:
            return r5
        L_0x0032:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            X.H1T r1 = X.C18180wK.A0P(r0)
            java.lang.String r0 = "commerce/permissions/creator/"
            r1.A0J(r0)
            X.C18250wR.A16(r1)
            X.C18240wQ.A18(r1)
            java.lang.String r0 = "merchant_id"
            r1.A0O(r0, r10)
            java.lang.String r0 = "creator_id"
            r1.A0O(r0, r11)
            java.lang.String r0 = "shop_linking_toggle_status"
            r1.A0M(r0, r8)
            java.lang.String r0 = "product_tagging_toggle_status"
            r1.A0M(r0, r9)
            X.H8c r3 = r1.A02()
            r2 = 0
            r1 = 14
            r4.A00 = r6
            r0 = 123274766(0x759060e, float:1.6327045E-34)
            java.lang.Object r1 = X.C63623hv.A01(r3, r4, r0, r2, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x006d:
            r0 = 42
            kotlin.coroutines.jvm.internal.KtCImplShape10S0201000_I2_8 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape10S0201000_I2_8
            r4.<init>(r7, r12, r3, r0)
            goto L_0x0016
        L_0x0075:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x007a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.api.partneraccounts.PartnerAccountsApiImpl.A00(java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, X.8n9):java.lang.Object");
    }

    public PartnerAccountsApiImpl(UserSession userSession) {
        this.A00 = userSession;
    }
}
