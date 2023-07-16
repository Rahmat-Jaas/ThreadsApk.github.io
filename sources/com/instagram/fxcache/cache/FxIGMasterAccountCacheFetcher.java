package com.instagram.fxcache.cache;

public final class FxIGMasterAccountCacheFetcher {
    public static final FxIGMasterAccountCacheFetcher A00 = new FxIGMasterAccountCacheFetcher();

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.fxcache.cache.FxIGMasterAccountCacheFetcher r17, X.AnonymousClass3HK r18, com.instagram.service.session.UserSession r19, X.C146958n9 r20) {
        /*
            r0 = r18
            r4 = 2
            r6 = r20
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3.A00(r4, r6)
            if (r1 == 0) goto L_0x0142
            r5 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3) r5
            int r3 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0142
            int r3 = r3 - r2
            r5.A00 = r3
        L_0x0019:
            java.lang.Object r3 = r5.A02
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r5.A00
            r2 = 1
            if (r1 == 0) goto L_0x00f6
            if (r1 != r2) goto L_0x019d
            java.lang.Object r0 = r5.A01
            X.3HK r0 = (X.AnonymousClass3HK) r0
            X.AnonymousClass0OU.A00(r3)
        L_0x002b:
            X.3b6 r3 = (X.C62903b6) r3
            boolean r1 = r3 instanceof X.AnonymousClass1jA
            if (r1 == 0) goto L_0x015a
            java.lang.Object r4 = X.C62903b6.A06(r3)
            if (r4 == 0) goto L_0x0155
            com.facebook.pando.TreeJNI r4 = (com.facebook.pando.TreeJNI) r4
            java.lang.Class<com.instagram.graphql.instagramschema.FxIGMasterAccountQueryResponseImpl$FxcalAccounts> r3 = com.instagram.graphql.instagramschema.FxIGMasterAccountQueryResponseImpl.FxcalAccounts.class
            java.lang.String r1 = "fxcal_accounts"
            com.google.common.collect.ImmutableList r3 = X.C18230wP.A0P(r4, r3, r1)
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r7 = r3.iterator()
        L_0x0049:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0163
            com.facebook.pando.TreeJNI r5 = X.C18210wN.A0G(r7)
            X.218 r4 = X.AnonymousClass218.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r3 = "account_type"
            java.lang.Enum r3 = r5.getEnumValue(r3, r4)
            X.218 r3 = (X.AnonymousClass218) r3
            if (r3 == 0) goto L_0x0049
            int r4 = r3.ordinal()
            if (r4 == r2) goto L_0x00b8
            r3 = 3
            if (r4 != r3) goto L_0x0049
            java.lang.String r3 = "InstagramCALAccountData"
            boolean r3 = r5.isFulfilled(r3)
            if (r3 == 0) goto L_0x0049
            java.lang.Class<com.instagram.graphql.instagramschema.FxIGMasterAccountQueryResponseImpl$FxcalAccounts$InlineInstagramCALAccountData> r3 = com.instagram.graphql.instagramschema.FxIGMasterAccountQueryResponseImpl.FxcalAccounts.InlineInstagramCALAccountData.class
            com.facebook.pando.TreeJNI r6 = r5.reinterpret(r3)
            r14 = 0
            if (r6 == 0) goto L_0x0049
            java.lang.Class<com.instagram.graphql.instagramschema.FxIGMasterAccountQueryResponseImpl$FxcalAccounts$InlineInstagramCALAccountData$IgUser> r4 = com.instagram.graphql.instagramschema.FxIGMasterAccountQueryResponseImpl.FxcalAccounts.InlineInstagramCALAccountData.IgUser.class
            java.lang.String r3 = "ig_user"
            com.facebook.pando.TreeJNI r6 = r6.getTreeValue(r3, r4)
            if (r6 == 0) goto L_0x0049
            java.lang.String r4 = "strong_id__"
            java.lang.String r3 = r6.getStringValue(r4)
            if (r3 == 0) goto L_0x0049
            java.lang.String r10 = r6.getStringValue(r4)
            if (r10 == 0) goto L_0x014b
            java.lang.String r12 = "INSTAGRAM"
            java.lang.String r13 = X.C18220wO.A0l(r6)
            java.lang.Class<com.instagram.graphql.instagramschema.FxIGMasterAccountQueryResponseImpl$FxcalAccounts$InlineInstagramCALAccountData$IgUser$ProfilePicture> r4 = com.instagram.graphql.instagramschema.FxIGMasterAccountQueryResponseImpl.FxcalAccounts.InlineInstagramCALAccountData.IgUser.ProfilePicture.class
            java.lang.String r3 = "profile_picture"
            com.facebook.pando.TreeJNI r3 = r6.getTreeValue(r3, r4)
            if (r3 == 0) goto L_0x00a5
            java.lang.String r14 = X.C18250wR.A0Y(r3)
        L_0x00a5:
            java.lang.String r3 = "obfuscated_id"
            java.lang.String r16 = r5.getStringValue(r3)
            java.lang.String r11 = ""
            r9 = 0
            fxcache.model.FxCalAccount r8 = new fxcache.model.FxCalAccount
            r15 = r11
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r1.add(r8)
            goto L_0x0049
        L_0x00b8:
            java.lang.String r3 = "FacebookCALAccountData"
            boolean r3 = r5.isFulfilled(r3)
            if (r3 == 0) goto L_0x0049
            java.lang.Class<com.instagram.graphql.instagramschema.FxIGMasterAccountQueryResponseImpl$FxcalAccounts$InlineFacebookCALAccountData> r3 = com.instagram.graphql.instagramschema.FxIGMasterAccountQueryResponseImpl.FxcalAccounts.InlineFacebookCALAccountData.class
            com.facebook.pando.TreeJNI r6 = r5.reinterpret(r3)
            r14 = 0
            if (r6 == 0) goto L_0x0049
            java.lang.Class<com.instagram.graphql.instagramschema.FxIGMasterAccountQueryResponseImpl$FxcalAccounts$InlineFacebookCALAccountData$FbUser> r4 = com.instagram.graphql.instagramschema.FxIGMasterAccountQueryResponseImpl.FxcalAccounts.InlineFacebookCALAccountData.FbUser.class
            java.lang.String r3 = "fb_user"
            com.facebook.pando.TreeJNI r6 = r6.getTreeValue(r3, r4)
            if (r6 == 0) goto L_0x0049
            java.lang.String r4 = "strong_id__"
            java.lang.String r3 = r6.getStringValue(r4)
            if (r3 == 0) goto L_0x0049
            java.lang.String r10 = r6.getStringValue(r4)
            if (r10 == 0) goto L_0x0150
            java.lang.String r12 = "FACEBOOK"
            java.lang.String r13 = X.C18220wO.A0l(r6)
            java.lang.Class<com.instagram.graphql.instagramschema.FxIGMasterAccountQueryResponseImpl$FxcalAccounts$InlineFacebookCALAccountData$FbUser$ProfilePicture> r4 = com.instagram.graphql.instagramschema.FxIGMasterAccountQueryResponseImpl.FxcalAccounts.InlineFacebookCALAccountData.FbUser.ProfilePicture.class
            java.lang.String r3 = "profile_picture(height:$fb_profile_image_size,width:$fb_profile_image_size)"
            com.facebook.pando.TreeJNI r3 = r6.getTreeValue(r3, r4)
            if (r3 == 0) goto L_0x00a5
            java.lang.String r14 = X.C18250wR.A0Y(r3)
            goto L_0x00a5
        L_0x00f6:
            X.AnonymousClass0OU.A00(r3)
            r15 = 0
            X.3zb r8 = X.C67463zb.A00()
            X.3zb r7 = X.C67463zb.A00()
            r1 = 50
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r6 = "fb_profile_image_size"
            r8.A04(r6, r1)
            r3 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r3)
            r8.A04(r6, r1)
            X.8l9 r9 = X.C63233h2.A00()
            java.util.Map r11 = com.facebook.graphql.calls.GraphQlCallInput.A03(r8)
            java.util.Map r12 = com.facebook.graphql.calls.GraphQlCallInput.A03(r7)
            java.lang.Class<com.instagram.graphql.instagramschema.FxIGMasterAccountQueryResponseImpl> r13 = com.instagram.graphql.instagramschema.FxIGMasterAccountQueryResponseImpl.class
            java.lang.String r10 = "FxIGMasterAccountQuery"
            r14 = 0
            java.lang.String r18 = "fxcal_accounts"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.Grx r1 = X.AnonymousClass3WK.A01(r19)
            r5.A01 = r0
            r5.A00 = r2
            java.lang.Object r3 = r1.A06(r8, r5)
            if (r3 != r4) goto L_0x002b
            return r4
        L_0x0142:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3
            r1 = r17
            r5.<init>(r1, r6, r4)
            goto L_0x0019
        L_0x014b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0150:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0155:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x015a:
            boolean r1 = r3 instanceof X.AnonymousClass1jB
            if (r1 != 0) goto L_0x0173
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0163:
            long r3 = java.lang.System.currentTimeMillis()
            fxcache.model.FxCalAccountLinkageInfo r2 = new fxcache.model.FxCalAccountLinkageInfo
            r2.<init>(r1, r3)
            r0.A00(r2)
            X.1jA r3 = X.C62903b6.A03()
        L_0x0173:
            boolean r1 = r3 instanceof X.AnonymousClass1jA
            if (r1 != 0) goto L_0x018c
            boolean r1 = r3 instanceof X.AnonymousClass1jB
            if (r1 == 0) goto L_0x0198
            X.2L8 r2 = X.AnonymousClass1jB.A00(r3)
            boolean r1 = r2 instanceof X.AnonymousClass1j9
            if (r1 == 0) goto L_0x018f
            java.lang.String r1 = "FxIGMasterAccountCacheFetcher: unknown error"
            java.lang.RuntimeException r1 = X.C18250wR.A0V(r1)
        L_0x0189:
            r0.A01(r1)
        L_0x018c:
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x018f:
            boolean r1 = r2 instanceof X.AnonymousClass1j8
            if (r1 == 0) goto L_0x018c
            X.1j8 r2 = (X.AnonymousClass1j8) r2
            java.lang.Throwable r1 = r2.A00
            goto L_0x0189
        L_0x0198:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x019d:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fxcache.cache.FxIGMasterAccountCacheFetcher.A00(com.instagram.fxcache.cache.FxIGMasterAccountCacheFetcher, X.3HK, com.instagram.service.session.UserSession, X.8n9):java.lang.Object");
    }
}
