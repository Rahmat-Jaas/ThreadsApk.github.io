package com.instagram.wellbeing.equity.diversity;

import X.AnonymousClass3Eg;
import X.AnonymousClass7Ja;
import X.C04220Ms;
import X.C18220wO;
import X.C694248m;
import X.C77474fq;
import X.C83224qz;
import com.instagram.service.session.UserSession;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape143S0100000_I2_123;

public final class DiversityInfoRepository {
    public final UserSession A00;
    public final C83224qz A01 = AnonymousClass7Ja.A02();
    public final AnonymousClass3Eg A02;
    public final Map A03;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r15, java.lang.String r16, X.C146958n9 r17) {
        /*
            r1 = r15
            r2 = r16
            r6 = 44
            r7 = r17
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2.A00(r6, r7)
            if (r0 == 0) goto L_0x00c8
            r5 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2) r5
            int r4 = r5.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L_0x00c8
            int r4 = r4 - r3
            r5.A00 = r4
        L_0x001b:
            java.lang.Object r6 = r5.A03
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0085
            if (r0 != r3) goto L_0x00d4
            java.lang.Object r2 = r5.A02
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r5.A01
            com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r1 = (com.instagram.wellbeing.equity.diversity.DiversityInfoRepository) r1
            X.AnonymousClass0OU.A00(r6)
        L_0x0031:
            X.3b6 r6 = (X.C62903b6) r6
            boolean r0 = r6 instanceof X.AnonymousClass1jA
            java.lang.String r4 = "get_diversity_info"
            if (r0 == 0) goto L_0x007c
            X.1jA r6 = (X.AnonymousClass1jA) r6
            java.lang.Object r5 = r6.A00
            X.5z0 r5 = (X.AnonymousClass5z0) r5
            X.3Eg r0 = r1.A02
            long r2 = java.lang.Long.parseLong(r2)
            r0.A00(r2, r4)
            java.lang.Object r3 = r5.A01
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x007a
            java.lang.Class<com.instagram.graphql.instagramschema.DiverseOwnedBusinessResponseImpl$IgShopDiversityProfile> r2 = com.instagram.graphql.instagramschema.DiverseOwnedBusinessResponseImpl.IgShopDiversityProfile.class
            java.lang.String r0 = "ig_shop_diversity_profile(business_igid:$id)"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r0, r2)
            if (r2 == 0) goto L_0x007a
            java.lang.Class<com.instagram.graphql.instagramschema.DiversityProfileImpl> r0 = com.instagram.graphql.instagramschema.DiversityProfileImpl.class
            com.facebook.pando.TreeJNI r0 = r2.reinterpret(r0)
        L_0x005e:
            X.1jA r6 = X.AnonymousClass1jA.A00(r0)
        L_0x0062:
            boolean r0 = r6 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0079
            boolean r0 = r6 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00cf
            X.2L8 r3 = X.AnonymousClass1jB.A00(r6)
            X.3Eg r2 = r1.A02
            com.instagram.service.session.UserSession r0 = r1.A00
            A04(r3, r0, r2, r4)
            X.1jB r6 = X.AnonymousClass1jB.A01()
        L_0x0079:
            return r6
        L_0x007a:
            r0 = 0
            goto L_0x005e
        L_0x007c:
            boolean r0 = r6 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0062
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0085:
            X.AnonymousClass0OU.A00(r6)
            r14 = 0
            X.3zb r7 = X.C67463zb.A00()
            X.3zb r6 = X.C67463zb.A00()
            java.lang.String r0 = "id"
            r7.A05(r0, r2)
            boolean r0 = X.AnonymousClass0wJ.A1W(r2)
            X.8l9 r8 = X.C63233h2.A03(r0)
            java.util.Map r10 = com.facebook.graphql.calls.GraphQlCallInput.A03(r7)
            java.util.Map r11 = com.facebook.graphql.calls.GraphQlCallInput.A03(r6)
            java.lang.Class<com.instagram.graphql.instagramschema.DiverseOwnedBusinessResponseImpl> r12 = com.instagram.graphql.instagramschema.DiverseOwnedBusinessResponseImpl.class
            java.lang.String r9 = "DiverseOwnedBusiness"
            r13 = 0
            java.lang.String r17 = "ig_shop_diversity_profile"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.instagram.service.session.UserSession r0 = r1.A00
            X.Grx r0 = X.AnonymousClass3WK.A01(r0)
            r5.A01 = r1
            r5.A02 = r2
            r5.A00 = r3
            java.lang.Object r6 = r0.A06(r7, r5)
            if (r6 != r4) goto L_0x0031
            return r4
        L_0x00c8:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2
            r5.<init>(r15, r7, r6)
            goto L_0x001b
        L_0x00cf:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A02(com.instagram.wellbeing.equity.diversity.DiversityInfoRepository, java.lang.String, X.8n9):java.lang.Object");
    }

    public static final C694248m A00(DiversityInfoRepository diversityInfoRepository) {
        UserSession userSession = diversityInfoRepository.A00;
        C04220Ms.A0B(userSession, 0);
        return (C694248m) userSession.A01(C694248m.class, C77474fq.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r14, com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r15, X.C146958n9 r16) {
        /*
            r4 = 37
            r5 = r16
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4.A00(r4, r5)
            if (r0 == 0) goto L_0x00bd
            r2 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r2 = (kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00bd
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0018:
            java.lang.Object r4 = r2.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r2.A00
            r10 = 1
            if (r0 == 0) goto L_0x0080
            if (r0 != r10) goto L_0x00c9
            java.lang.Object r15 = r2.A01
            com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r15 = (com.instagram.wellbeing.equity.diversity.DiversityInfoRepository) r15
            X.AnonymousClass0OU.A00(r4)
        L_0x002a:
            X.3b6 r4 = (X.C62903b6) r4
            boolean r0 = r4 instanceof X.AnonymousClass1jA
            java.lang.String r3 = "update_diversity_info"
            if (r0 == 0) goto L_0x0077
            X.1jA r4 = (X.AnonymousClass1jA) r4
            java.lang.Object r4 = r4.A00
            X.5z0 r4 = (X.AnonymousClass5z0) r4
            X.3Eg r2 = r15.A02
            com.instagram.service.session.UserSession r0 = r15.A00
            long r0 = X.C18200wM.A0B(r0)
            r2.A00(r0, r3)
            java.lang.Object r2 = r4.A01
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x0075
            java.lang.Class<com.instagram.graphql.instagramschema.DiverseOwnedBusinessMutateResponseImpl$IgShopDiversityProfileUpdate> r1 = com.instagram.graphql.instagramschema.DiverseOwnedBusinessMutateResponseImpl.IgShopDiversityProfileUpdate.class
            java.lang.String r0 = "ig_shop_diversity_profile_update(data:$input)"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0075
            java.lang.Class<com.instagram.graphql.instagramschema.DiversityProfileImpl> r0 = com.instagram.graphql.instagramschema.DiversityProfileImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
        L_0x0059:
            X.1jA r4 = X.AnonymousClass1jA.A00(r0)
        L_0x005d:
            boolean r0 = r4 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0074
            boolean r0 = r4 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00c4
            X.2L8 r2 = X.AnonymousClass1jB.A00(r4)
            X.3Eg r1 = r15.A02
            com.instagram.service.session.UserSession r0 = r15.A00
            A04(r2, r0, r1, r3)
            X.1jB r4 = X.AnonymousClass1jB.A01()
        L_0x0074:
            return r4
        L_0x0075:
            r0 = 0
            goto L_0x0059
        L_0x0077:
            boolean r0 = r4 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x005d
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0080:
            X.AnonymousClass0OU.A00(r4)
            r11 = 0
            X.3zb r4 = X.C67463zb.A00()
            X.3zb r3 = X.C67463zb.A00()
            X.C67463zb.A01(r14, r4)
            boolean r0 = X.AnonymousClass0wJ.A1W(r14)
            X.8l9 r5 = X.C63233h2.A03(r0)
            java.util.Map r7 = com.facebook.graphql.calls.GraphQlCallInput.A03(r4)
            java.util.Map r8 = com.facebook.graphql.calls.GraphQlCallInput.A03(r3)
            java.lang.Class<com.instagram.graphql.instagramschema.DiverseOwnedBusinessMutateResponseImpl> r9 = com.instagram.graphql.instagramschema.DiverseOwnedBusinessMutateResponseImpl.class
            java.lang.String r6 = "DiverseOwnedBusinessMutate"
            r12 = 0
            java.lang.String r14 = "ig_shop_diversity_profile_update"
            com.facebook.pando.PandoGraphQLRequest r4 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            com.instagram.service.session.UserSession r0 = r15.A00
            X.Grx r0 = X.AnonymousClass3WK.A01(r0)
            r2.A01 = r15
            r2.A00 = r10
            java.lang.Object r4 = r0.A06(r4, r2)
            if (r4 != r1) goto L_0x002a
            return r1
        L_0x00bd:
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r2 = new kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4
            r2.<init>(r15, r5, r4)
            goto L_0x0018
        L_0x00c4:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00c9:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A01(com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000, com.instagram.wellbeing.equity.diversity.DiversityInfoRepository, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r14, X.C146958n9 r15) {
        /*
            r4 = 36
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4.A00(r4, r15)
            if (r0 == 0) goto L_0x00b8
            r1 = r15
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r1 = (kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4) r1
            int r3 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x00b8
            int r3 = r3 - r2
            r1.A00 = r3
        L_0x0016:
            java.lang.Object r4 = r1.A02
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r1.A00
            r9 = 1
            if (r0 == 0) goto L_0x0082
            if (r0 != r9) goto L_0x00c4
            java.lang.Object r14 = r1.A01
            com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r14 = (com.instagram.wellbeing.equity.diversity.DiversityInfoRepository) r14
            X.AnonymousClass0OU.A00(r4)
        L_0x0028:
            X.3b6 r4 = (X.C62903b6) r4
            boolean r0 = r4 instanceof X.AnonymousClass1jA
            java.lang.String r3 = "delete_diversity_info"
            if (r0 == 0) goto L_0x0079
            X.1jA r4 = (X.AnonymousClass1jA) r4
            java.lang.Object r4 = r4.A00
            X.5z0 r4 = (X.AnonymousClass5z0) r4
            X.3Eg r2 = r14.A02
            com.instagram.service.session.UserSession r0 = r14.A00
            long r0 = X.C18200wM.A0B(r0)
            r2.A00(r0, r3)
            java.lang.Object r2 = r4.A01
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x0077
            java.lang.Class<com.instagram.graphql.instagramschema.DiverseOwnedBusinessDeleteResponseImpl$IgShopDiversityProfileDelete> r1 = com.instagram.graphql.instagramschema.DiverseOwnedBusinessDeleteResponseImpl.IgShopDiversityProfileDelete.class
            java.lang.String r0 = "ig_shop_diversity_profile_delete"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0077
            java.lang.String r0 = "success"
            boolean r0 = r1.getBooleanValue(r0)
        L_0x0057:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.1jA r4 = X.AnonymousClass1jA.A00(r0)
        L_0x005f:
            boolean r0 = r4 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0076
            boolean r0 = r4 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00bf
            X.2L8 r2 = X.AnonymousClass1jB.A00(r4)
            X.3Eg r1 = r14.A02
            com.instagram.service.session.UserSession r0 = r14.A00
            A04(r2, r0, r1, r3)
            X.1jB r4 = X.AnonymousClass1jB.A01()
        L_0x0076:
            return r4
        L_0x0077:
            r0 = 0
            goto L_0x0057
        L_0x0079:
            boolean r0 = r4 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x005f
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0082:
            X.AnonymousClass0OU.A00(r4)
            r10 = 0
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r3 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r0 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            X.8l9 r4 = X.C63233h2.A00()
            java.util.Map r6 = r3.A07()
            java.util.Map r7 = r0.A07()
            java.lang.Class<com.instagram.graphql.instagramschema.DiverseOwnedBusinessDeleteResponseImpl> r8 = com.instagram.graphql.instagramschema.DiverseOwnedBusinessDeleteResponseImpl.class
            java.lang.String r5 = "DiverseOwnedBusinessDelete"
            r11 = 0
            java.lang.String r13 = "ig_shop_diversity_profile_delete"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.instagram.service.session.UserSession r0 = r14.A00
            X.Grx r0 = X.AnonymousClass3WK.A01(r0)
            r1.A01 = r14
            r1.A00 = r9
            java.lang.Object r4 = r0.A06(r3, r1)
            if (r4 != r2) goto L_0x0028
            return r2
        L_0x00b8:
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r1 = new kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4
            r1.<init>(r14, r15, r4)
            goto L_0x0016
        L_0x00bf:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00c4:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A03(com.instagram.wellbeing.equity.diversity.DiversityInfoRepository, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        X.C18190wL.A1I(r2, r0);
        X.C18210wN.A1A(r2, "error");
        r2.A0T("event_source", com.facebook.common.dextricks.DexOptimization.OPT_KEY_CLIENT);
        r2.A1J(r3);
        X.C18210wN.A1B(r2, r8);
        r2.Bb4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0058, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        r0 = "diversity_info_gql_failure_unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3 != null) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r3.equals("UnknownNetworkError") != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        r5 = X.C18200wM.A0B(r6);
        r4 = !r0;
        r2 = X.C18180wK.A0I(X.AnonymousClass0wJ.A0M(r7.A00, "ig_smb_sensitive_event"), 1432);
        r2.A0S("ig_userid", java.lang.Long.valueOf(r5));
        r2.A0T("product", "network_call");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if (r4 == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        r0 = "diversity_info_gql_failure";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.AnonymousClass2L8 r5, com.instagram.service.session.UserSession r6, X.AnonymousClass3Eg r7, java.lang.String r8) {
        /*
            boolean r0 = r5 instanceof X.AnonymousClass1j8
            java.lang.String r1 = "UnknownNetworkError"
            if (r0 == 0) goto L_0x005c
            X.1j8 r5 = (X.AnonymousClass1j8) r5
            java.lang.Throwable r0 = r5.A00
            java.lang.String r3 = r0.getLocalizedMessage()
            if (r3 == 0) goto L_0x0017
        L_0x0010:
            boolean r1 = r3.equals(r1)
            r0 = 0
            if (r1 == 0) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            long r5 = X.C18200wM.A0B(r6)
            r4 = r0 ^ 1
            X.0nS r1 = r7.A00
            java.lang.String r0 = "ig_smb_sensitive_event"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1432(0x598, float:2.007E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.String r0 = "ig_userid"
            r2.A0S(r0, r1)
            java.lang.String r1 = "network_call"
            java.lang.String r0 = "product"
            r2.A0T(r0, r1)
            if (r4 == 0) goto L_0x0059
            java.lang.String r0 = "diversity_info_gql_failure"
        L_0x0040:
            X.C18190wL.A1I(r2, r0)
            java.lang.String r0 = "error"
            X.C18210wN.A1A(r2, r0)
            java.lang.String r1 = "client"
            java.lang.String r0 = "event_source"
            r2.A0T(r0, r1)
            r2.A1J(r3)
            X.C18210wN.A1B(r2, r8)
            r2.Bb4()
            return
        L_0x0059:
            java.lang.String r0 = "diversity_info_gql_failure_unknown"
            goto L_0x0040
        L_0x005c:
            boolean r0 = r5 instanceof X.AnonymousClass1j9
            if (r0 == 0) goto L_0x0062
            r3 = r1
            goto L_0x0010
        L_0x0062:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A04(X.2L8, com.instagram.service.session.UserSession, X.3Eg, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(java.lang.String r6, X.C146958n9 r7) {
        /*
            r5 = this;
            r4 = 43
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2.A00(r4, r7)
            if (r0 == 0) goto L_0x007b
            r3 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007b
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r3.A03
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L_0x0055
            if (r0 != r2) goto L_0x008a
            java.lang.Object r6 = r3.A02
            java.lang.Object r3 = r3.A01
            com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r3 = (com.instagram.wellbeing.equity.diversity.DiversityInfoRepository) r3
            X.AnonymousClass0OU.A00(r1)
        L_0x002a:
            r4 = r1
            X.3b6 r4 = (X.C62903b6) r4
            boolean r0 = r4 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0081
            X.1jA r4 = (X.AnonymousClass1jA) r4
            java.lang.Object r2 = r4.A00
            com.instagram.graphql.instagramschema.DiversityProfileImpl r2 = (com.instagram.graphql.instagramschema.DiversityProfileImpl) r2
            java.util.Map r0 = r3.A03
            java.lang.Object r0 = r0.get(r6)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x008f
            java.util.Iterator r1 = r0.iterator()
        L_0x0045:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r0 = r1.next()
            X.AcJ r0 = (X.C18251AcJ) r0
            r0.A00(r2)
            goto L_0x0045
        L_0x0055:
            X.AnonymousClass0OU.A00(r1)
            X.48m r1 = A00(r5)
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            android.util.LruCache r0 = r1.A00
            java.lang.Object r0 = r0.get(r6)
            if (r0 == 0) goto L_0x006d
            X.1jA r4 = X.AnonymousClass1jA.A00(r0)
            return r4
        L_0x006d:
            r3.A01 = r5
            r3.A02 = r6
            r3.A00 = r2
            java.lang.Object r1 = A02(r5, r6, r3)
            if (r1 == r4) goto L_0x00a2
            r3 = r5
            goto L_0x002a
        L_0x007b:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2 r3 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2
            r3.<init>(r5, r7, r4)
            goto L_0x0016
        L_0x0081:
            boolean r0 = r4 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x00a2
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x008a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x008f:
            X.48m r1 = A00(r3)
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            if (r2 == 0) goto L_0x00a3
            android.util.LruCache r0 = r1.A00
            r0.put(r6, r2)
        L_0x009e:
            X.1jA r4 = X.AnonymousClass1jA.A00(r2)
        L_0x00a2:
            return r4
        L_0x00a3:
            r2 = 0
            goto L_0x009e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A05(java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(java.util.List r8, java.lang.String r9, X.C146958n9 r10) {
        /*
            r7 = this;
            r3 = 45
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2.A00(r3, r10)
            if (r0 == 0) goto L_0x009b
            r5 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A03
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r5.A00
            r4 = 1
            if (r1 == 0) goto L_0x0069
            if (r1 != r4) goto L_0x00ab
            java.lang.Object r3 = r5.A02
            java.lang.Object r5 = r5.A01
            com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r5 = (com.instagram.wellbeing.equity.diversity.DiversityInfoRepository) r5
            X.AnonymousClass0OU.A00(r0)
        L_0x002a:
            r6 = r0
            X.3b6 r6 = (X.C62903b6) r6
            boolean r0 = r6 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00a2
            X.1jA r6 = (X.AnonymousClass1jA) r6
            java.lang.Object r2 = r6.A00
            com.instagram.graphql.instagramschema.DiversityProfileImpl r2 = (com.instagram.graphql.instagramschema.DiversityProfileImpl) r2
            if (r2 == 0) goto L_0x00bd
            X.214 r1 = X.AnonymousClass214.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "platform_visibility"
            com.google.common.collect.ImmutableList r1 = r2.getEnumList(r0, r1)
            if (r1 == 0) goto L_0x00bd
            X.214 r0 = X.AnonymousClass214.INSTAGRAM
            boolean r0 = r1.contains(r0)
            if (r0 != r4) goto L_0x00bd
            java.util.Map r0 = r5.A03
            java.lang.Object r0 = r0.get(r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x00b0
            java.util.Iterator r1 = r0.iterator()
        L_0x0059:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r0 = r1.next()
            X.AcJ r0 = (X.C18251AcJ) r0
            r0.A00(r2)
            goto L_0x0059
        L_0x0069:
            X.AnonymousClass0OU.A00(r0)
            com.instagram.service.session.UserSession r0 = r7.A00
            java.lang.String r3 = r0.getUserId()
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r2 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            java.lang.String r0 = "diversity_type"
            r2.A0A(r0, r8)
            java.lang.String r0 = "ethnicity"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r2, r9, r0)
            X.48m r1 = A00(r7)
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            android.util.LruCache r0 = r1.A00
            r0.remove(r3)
            r5.A01 = r7
            r5.A02 = r3
            r5.A00 = r4
            java.lang.Object r0 = A01(r2, r7, r5)
            if (r0 == r6) goto L_0x00c1
            r5 = r7
            goto L_0x002a
        L_0x009b:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2
            r5.<init>(r7, r10, r3)
            goto L_0x0016
        L_0x00a2:
            boolean r0 = r6 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x00c1
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00ab:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00b0:
            X.48m r1 = A00(r5)
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            android.util.LruCache r0 = r1.A00
            r0.put(r3, r2)
        L_0x00bd:
            X.1jA r6 = X.AnonymousClass1jA.A00(r2)
        L_0x00c1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A06(java.util.List, java.lang.String, X.8n9):java.lang.Object");
    }

    public DiversityInfoRepository(UserSession userSession) {
        this.A00 = userSession;
        C04220Ms.A0B(userSession, 0);
        this.A02 = (AnonymousClass3Eg) userSession.A01(AnonymousClass3Eg.class, new KtLambdaShape143S0100000_I2_123(userSession, 15));
        this.A03 = C18220wO.A0y();
    }
}
