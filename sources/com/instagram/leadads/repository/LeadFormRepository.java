package com.instagram.leadads.repository;

import com.instagram.service.session.UserSession;

public final class LeadFormRepository {
    public final UserSession A00;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r1.getBooleanValue("xig_ig_lead_gen_form_recon(data:$input)") != false) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.List r21, X.C146958n9 r22) {
        /*
            r16 = this;
            r4 = 25
            r5 = r22
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6.A00(r4, r5)
            r6 = r16
            if (r0 == 0) goto L_0x00c2
            r3 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c2
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r3.A01
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r3.A00
            r11 = 1
            if (r0 == 0) goto L_0x0050
            if (r0 != r11) goto L_0x00c8
            X.AnonymousClass0OU.A00(r1)
        L_0x0028:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0045
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r0 = r1.A00
            com.facebook.pando.TreeJNI r1 = X.C685344e.A03(r0)
            if (r1 == 0) goto L_0x004e
            java.lang.String r0 = "xig_ig_lead_gen_form_recon(data:$input)"
            boolean r0 = r1.getBooleanValue(r0)
            if (r0 == 0) goto L_0x004e
        L_0x0040:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            return r0
        L_0x0045:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x004e
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x004e:
            r11 = 0
            goto L_0x0040
        L_0x0050:
            X.AnonymousClass0OU.A00(r1)
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r5 = X.C86154wM.A0L()
            java.lang.String r0 = "ad_id"
            r1 = r17
            r5.A0D(r1, r0)
            java.lang.String r0 = "form_id"
            r1 = r18
            r5.A0D(r1, r0)
            java.lang.String r0 = "media_id"
            r1 = r19
            r5.A0D(r1, r0)
            com.instagram.service.session.UserSession r4 = r6.A00
            X.0aP r0 = X.C04620Ok.A00(r4)
            com.instagram.user.model.User r0 = r0.A00
            java.lang.String r1 = r0.A14()
            r0 = 9
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            r5.A0D(r1, r0)
            java.lang.String r0 = "fields_data"
            r1 = r21
            r5.A0A(r0, r1)
            java.lang.String r0 = "business_id"
            r1 = r20
            r5.A0D(r1, r0)
            r12 = 0
            X.3zb r1 = X.C67463zb.A00()
            X.3zb r0 = X.C67463zb.A00()
            X.C67463zb.A01(r5, r1)
            X.8l9 r6 = X.C63233h2.A00()
            java.util.Map r8 = r1.getParamsCopy()
            java.util.Map r9 = r0.getParamsCopy()
            java.lang.Class<com.instagram.graphql.instagramschema.LeadGenReconNotifMutationResponseImpl> r10 = com.instagram.graphql.instagramschema.LeadGenReconNotifMutationResponseImpl.class
            java.lang.String r7 = "LeadGenReconNotifMutation"
            r13 = 96
            java.lang.String r15 = "xig_ig_lead_gen_form_recon"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.Grx r0 = X.AnonymousClass3WK.A01(r4)
            r3.A00 = r11
            java.lang.Object r1 = r0.A06(r5, r3)
            if (r1 != r2) goto L_0x0028
            return r2
        L_0x00c2:
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r3 = X.C86154wM.A0w(r6, r5, r4)
            goto L_0x001a
        L_0x00c8:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadads.repository.LeadFormRepository.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.8n9):java.lang.Object");
    }

    public LeadFormRepository(UserSession userSession) {
        this.A00 = userSession;
    }
}
