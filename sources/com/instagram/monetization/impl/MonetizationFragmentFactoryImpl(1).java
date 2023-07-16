package com.instagram.monetization.impl;

import X.C11630kW;

public final class MonetizationFragmentFactoryImpl implements C11630kW {
    public final String getModuleName() {
        return "com.instagram.monetization.impl.MonetizationFragmentFactoryImpl";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r6 == r0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.Fragment A00(com.instagram.api.schemas.UserMonetizationProductType r6, com.instagram.service.session.UserSession r7, java.lang.String r8, boolean r9) {
        /*
            r5 = this;
            X.AnonymousClass0wJ.A1N(r7, r6)
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT
            if (r6 != r0) goto L_0x0055
            r4 = 1
            java.lang.String r0 = "eligible_pending_opt_in"
            boolean r0 = r0.equals(r8)
            boolean r3 = X.C18180wK.A1V(r0)
            java.lang.String r0 = "not_eligible"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0053
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36317861202890778(0x8106e70000101a, double:3.030899892772574E-306)
            boolean r0 = X.C63803iN.A0E(r2, r7, r0)
            if (r0 != 0) goto L_0x0053
        L_0x0027:
            if (r3 != 0) goto L_0x0058
            if (r4 != 0) goto L_0x0058
        L_0x002b:
            java.lang.String r0 = "not_eligible"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0038
            java.lang.Integer r0 = X.AnonymousClass006.A01
            X.C62873b3.A01(r5, r7, r0)
        L_0x0038:
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36323882747043987(0x810c6100002093, double:3.034707941541876E-306)
            boolean r0 = X.C63803iN.A0E(r2, r7, r0)
            if (r0 == 0) goto L_0x0050
            java.lang.String r1 = "com.bloks.www.ig.creator_monetization.screens.creator_monetization_status"
        L_0x0047:
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            X.1c8 r0 = X.C62853b1.A03(r7, r1, r0)
            return r0
        L_0x0050:
            java.lang.String r1 = "com.instagram.creator_monetization.account_integrity.screens.monetization_integrity_status"
            goto L_0x0047
        L_0x0053:
            r4 = 0
            goto L_0x0027
        L_0x0055:
            if (r6 != r0) goto L_0x0038
            goto L_0x002b
        L_0x0058:
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r1 = r6.A00
            java.lang.String r0 = "ARGUMENT_PRODUCT_TYPE"
            r2.putString(r0, r1)
            if (r8 == 0) goto L_0x006a
            java.lang.String r0 = "ARGUMENT_ELIGIBILITY"
            r2.putString(r0, r8)
        L_0x006a:
            java.lang.String r0 = "ARGUMENT_TEMPORARY_INELIGIBILITY_STATUS"
            r2.putBoolean(r0, r9)
            X.1Zb r0 = new X.1Zb
            r0.<init>()
            r0.setArguments(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.impl.MonetizationFragmentFactoryImpl.A00(com.instagram.api.schemas.UserMonetizationProductType, com.instagram.service.session.UserSession, java.lang.String, boolean):androidx.fragment.app.Fragment");
    }
}
