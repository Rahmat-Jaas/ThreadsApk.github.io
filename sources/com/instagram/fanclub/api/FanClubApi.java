package com.instagram.fanclub.api;

import X.C04220Ms;
import X.C146418mD;
import X.C63233h2;
import X.C67463zb;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.service.session.UserSession;

public final class FanClubApi {
    public final UserSession A00;

    public FanClubApi(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final C146418mD A00(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C04220Ms.A0B(str, 0);
        C67463zb A002 = C67463zb.A00();
        C67463zb A003 = C67463zb.A00();
        A002.A03("should_fetch_blocked_member_count", false);
        A002.A03("should_fetch_member_count", false);
        A002.A03("should_fetch_sku", false);
        A002.A03("should_fetch_early_pricing", false);
        A002.A03("should_fetch_enabled_benefits", false);
        A002.A03("should_fetch_seconds_until_notification", false);
        A002.A03("should_fetch_customized_benefits", false);
        A002.A05("user_id", str);
        A01(A002, "should_fetch_blocked_member_count", "should_fetch_member_count", z, z2);
        A01(A002, "should_fetch_sku", "should_fetch_enabled_benefits", z3, z4);
        A01(A002, "should_fetch_early_pricing", "should_fetch_seconds_until_notification", z5, z6);
        A002.A03("should_fetch_customized_benefits", Boolean.valueOf(z7));
        return new PandoGraphQLRequest(C63233h2.A04(true), "FanClubInfoForCreator", GraphQlCallInput.A03(A002), GraphQlCallInput.A03(A003), FanClubInfoForCreatorResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xig_user_by_igid_v2");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.lang.String r8, java.lang.String r9, X.C146958n9 r10) {
        /*
            r7 = this;
            r3 = 5
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r10)
            if (r0 == 0) goto L_0x0087
            r4 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0087
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r6) goto L_0x0091
            X.AnonymousClass0OU.A00(r1)
        L_0x0023:
            r5 = r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0030
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x008c
            X.1jB r5 = X.AnonymousClass1jB.A01()
        L_0x0030:
            return r5
        L_0x0031:
            X.AnonymousClass0OU.A00(r1)
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r3 = new com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000
            r3.<init>()
            java.lang.String r1 = X.C18180wK.A0e()
            java.lang.String r0 = "client_mutation_id"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r3, r1, r0)
            java.lang.String r0 = "fan_club_id"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r3, r8, r0)
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r2 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            java.lang.String r0 = "user_id"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r2, r9, r0)
            java.lang.String r1 = "BLOCK"
            java.lang.String r0 = "block_action_type"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r2, r1, r0)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r2)
            java.lang.String r0 = "user_args"
            r3.A0A(r0, r1)
            X.3zb r2 = X.C67463zb.A00()
            X.C67463zb.A01(r3, r2)
            X.AnonymousClass7Ko.A0B(r6)
            java.lang.Class<X.14y> r1 = X.C205014y.class
            java.lang.String r0 = "FanClubBlockMember"
            X.3zc r1 = X.C67473zc.A00(r2, r1, r0)
            com.instagram.service.session.UserSession r0 = r7.A00
            r3 = 0
            X.H8c r2 = X.C18200wM.A0S(r1, r0)
            r1 = 14
            r4.A00 = r6
            r0 = 338680868(0x142fdc24, float:8.878657E-27)
            java.lang.Object r1 = X.C63623hv.A01(r2, r4, r0, r3, r1)
            if (r1 != r5) goto L_0x0023
            return r5
        L_0x0087:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r4 = X.C18190wL.A0y(r7, r10, r3)
            goto L_0x0015
        L_0x008c:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0091:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A04(java.lang.String, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0B(java.lang.String r15, X.C146958n9 r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22) {
        /*
            r14 = this;
            r6 = r15
            r12 = 0
            r3 = 32
            r4 = r16
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1.A00(r3, r4)
            if (r0 == 0) goto L_0x010f
            r5 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x010f
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001a:
            java.lang.Object r4 = r5.A03
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x00e9
            if (r0 != r2) goto L_0x011b
            java.lang.Object r6 = r5.A02
            java.lang.Object r1 = r5.A01
            com.instagram.fanclub.api.FanClubApi r1 = (com.instagram.fanclub.api.FanClubApi) r1
            X.AnonymousClass0OU.A00(r4)
        L_0x002e:
            X.3b6 r4 = (X.C62903b6) r4
            boolean r0 = r4 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00e0
            X.1jA r4 = (X.AnonymousClass1jA) r4
            java.lang.Object r2 = r4.A00
            X.5z0 r2 = (X.AnonymousClass5z0) r2
            com.instagram.service.session.UserSession r1 = r1.A00
            boolean r0 = X.C18250wR.A1J(r1, r6)
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r4 = r2.A01
            com.facebook.pando.TreeJNI r4 = (com.facebook.pando.TreeJNI) r4
            if (r4 == 0) goto L_0x00dd
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2> r3 = com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl.XigUserByIgidV2.class
            java.lang.String r0 = "xig_user_by_igid_v2(id:$user_id)"
            com.facebook.pando.TreeJNI r4 = r4.getTreeValue(r0, r3)
            if (r4 == 0) goto L_0x00dd
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2$FanClub> r3 = com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl.XigUserByIgidV2.FanClub.class
            java.lang.String r0 = "fan_club"
            com.facebook.pando.TreeJNI r5 = r4.getTreeValue(r0, r3)
            com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2$FanClub r5 = (com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl.XigUserByIgidV2.FanClub) r5
        L_0x005c:
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r3 = 36318067361517681(0x81071700031071, double:3.031030268318362E-306)
            boolean r0 = X.C63803iN.A0E(r0, r1, r3)
            if (r0 == 0) goto L_0x00bd
            if (r5 == 0) goto L_0x00bd
            com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2$FanClub$Package r4 = r5.A00()
            if (r4 == 0) goto L_0x0090
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2$FanClub$Package$Members> r3 = com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl.XigUserByIgidV2.FanClub.Package.Members.class
            java.lang.String r0 = "members"
            com.facebook.pando.TreeJNI r3 = r4.getTreeValue(r0, r3)
            if (r3 == 0) goto L_0x0090
            java.lang.String r0 = "count"
            int r4 = r3.getIntValue(r0)
            X.6ew r0 = X.AnonymousClass2SP.A00(r1)
            android.content.SharedPreferences r0 = r0.A00
            android.content.SharedPreferences$Editor r3 = r0.edit()
            java.lang.String r0 = "fan_club_member_count"
            X.AnonymousClass0wJ.A11(r3, r0, r4)
        L_0x0090:
            java.lang.String r11 = X.C18220wO.A0m(r5)
            if (r11 == 0) goto L_0x00bd
            com.instagram.user.model.User r3 = X.AnonymousClass0wJ.A0Y(r1)
            X.4tY r0 = r3.A0I()
            if (r0 == 0) goto L_0x00d0
            com.instagram.api.schemas.FanClubInfoDict r0 = r0.Cyd()
            java.lang.Boolean r6 = r0.A01
            java.lang.Integer r9 = r0.A04
            java.lang.String r12 = r0.A07
            com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse r5 = r0.A00
            java.lang.Boolean r7 = r0.A02
            java.lang.Boolean r8 = r0.A03
            java.lang.Integer r10 = r0.A05
            com.instagram.api.schemas.FanClubInfoDict r4 = new com.instagram.api.schemas.FanClubInfoDict
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x00b7:
            r3.A1n(r4)
            X.C18210wN.A1J(r1, r3)
        L_0x00bd:
            java.lang.Object r0 = r2.A01
            X.1jA r4 = X.AnonymousClass1jA.A00(r0)
        L_0x00c3:
            boolean r0 = r4 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r4 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0116
            X.1jB r4 = X.AnonymousClass1jB.A01()
        L_0x00cf:
            return r4
        L_0x00d0:
            r5 = 0
            com.instagram.api.schemas.FanClubInfoDict r4 = new com.instagram.api.schemas.FanClubInfoDict
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r12 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00b7
        L_0x00dd:
            r5 = 0
            goto L_0x005c
        L_0x00e0:
            boolean r0 = r4 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x00c3
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00e9:
            X.AnonymousClass0OU.A00(r4)
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r13 = r22
            X.8mD r1 = A00(r6, r7, r8, r9, r10, r11, r12, r13)
            com.instagram.service.session.UserSession r0 = r14.A00
            X.Grx r0 = X.AnonymousClass3WK.A01(r0)
            X.C18240wQ.A1M(r14, r15, r5, r2)
            java.lang.Object r4 = r0.A06(r1, r5)
            if (r4 != r3) goto L_0x010c
            return r3
        L_0x010c:
            r1 = r14
            goto L_0x002e
        L_0x010f:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1
            r5.<init>(r14, r4, r3)
            goto L_0x001a
        L_0x0116:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x011b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0B(java.lang.String, X.8n9, boolean, boolean, boolean, boolean, boolean, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0C(java.util.List r8, X.C146958n9 r9) {
        /*
            r7 = this;
            r3 = 7
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r9)
            if (r0 == 0) goto L_0x005f
            r6 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005f
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r6.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r4) goto L_0x0069
            X.AnonymousClass0OU.A00(r1)
        L_0x0023:
            r5 = r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0030
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0064
            X.1jB r5 = X.AnonymousClass1jB.A01()
        L_0x0030:
            return r5
        L_0x0031:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            r3 = 0
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r0 = "fan_club/make_preview_content_into_exclusive/"
            r2.A0J(r0)
            java.lang.String r1 = X.C18200wM.A0o(r8)
            java.lang.String r0 = "media_ids"
            r2.A0O(r0, r1)
            java.lang.Class<X.4vo> r1 = X.C85814vo.class
            java.lang.Class<X.3Za> r0 = X.AnonymousClass3Za.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r1 = 14
            r6.A00 = r4
            r0 = 210647125(0xc8e3855, float:2.1912468E-31)
            java.lang.Object r1 = X.C63623hv.A01(r2, r6, r0, r3, r1)
            if (r1 != r5) goto L_0x0023
            return r5
        L_0x005f:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = X.C18190wL.A0y(r7, r9, r3)
            goto L_0x0015
        L_0x0064:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0069:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0C(java.util.List, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0E(java.util.List r8, X.C146958n9 r9, boolean r10) {
        /*
            r7 = this;
            r3 = 6
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r9)
            if (r0 == 0) goto L_0x006c
            r5 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006c
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A01
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r6 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 != r6) goto L_0x0090
            X.AnonymousClass0OU.A00(r1)
        L_0x0023:
            r4 = r1
            X.3b6 r4 = (X.C62903b6) r4
            boolean r0 = r4 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0071
            X.1jA r4 = (X.AnonymousClass1jA) r4
            java.lang.Object r0 = r4.A00
            X.1Qq r0 = (X.AnonymousClass1Qq) r0
            X.32w r0 = r0.A00
            if (r0 != 0) goto L_0x007a
            X.C18250wR.A0m()
            r0 = 0
            throw r0
        L_0x0039:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            r3 = 0
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r0 = "fan_club/make_exclusive_content_into_preview/"
            r2.A0J(r0)
            java.lang.String r1 = X.C18200wM.A0o(r8)
            java.lang.String r0 = "media_ids"
            r2.A0O(r0, r1)
            java.lang.String r0 = "need_replace"
            r2.A0R(r0, r10)
            java.lang.Class<X.1Qq> r1 = X.AnonymousClass1Qq.class
            java.lang.Class<X.3Ju> r0 = X.C59173Ju.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r1 = 14
            r5.A00 = r6
            r0 = 210647125(0xc8e3855, float:2.1912468E-31)
            java.lang.Object r1 = X.C63623hv.A01(r2, r5, r0, r3, r1)
            if (r1 != r4) goto L_0x0023
            return r4
        L_0x006c:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r5 = X.C18190wL.A0y(r7, r9, r3)
            goto L_0x0015
        L_0x0071:
            boolean r0 = r4 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x007e
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x007a:
            X.1jA r4 = X.AnonymousClass1jA.A00(r0)
        L_0x007e:
            boolean r0 = r4 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x008a
            boolean r0 = r4 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x008b
            X.1jB r4 = X.AnonymousClass1jB.A01()
        L_0x008a:
            return r4
        L_0x008b:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0090:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0E(java.util.List, X.8n9, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.instagram.api.schemas.FanClubCategoryType r11, X.C146958n9 r12, boolean r13) {
        /*
            r10 = this;
            r4 = 11
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r4, r12)
            if (r0 == 0) goto L_0x0093
            r3 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0093
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r3.A01
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r3.A00
            r5 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r5) goto L_0x009e
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            r4 = r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0031
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0099
            X.1jB r4 = X.AnonymousClass1jB.A01()
        L_0x0031:
            return r4
        L_0x0032:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r7 = r10.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36599198741236781(0x8206c700090c2d, double:3.208818884877924E-306)
            int r0 = X.C63803iN.A01(r2, r7, r0)
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r13)
            r6 = 0
            X.C04220Ms.A0B(r11, r5)
            X.H1T r2 = X.C18180wK.A0P(r7)
            java.lang.String r7 = "category"
            java.lang.String r1 = "fan_club/"
            java.lang.String r0 = "category_members/"
            X.AnonymousClass0wJ.A1J(r2, r1, r0)
            java.lang.Class<X.1Rf> r1 = X.C21541Rf.class
            java.lang.Class<X.3Jt> r0 = X.C59163Jt.class
            r2.A0B(r1, r0)
            java.lang.String r0 = r11.A00
            r2.A0O(r7, r0)
            int r1 = r9.intValue()
            java.lang.String r0 = "limit"
            r2.A0K(r0, r1)
            if (r8 == 0) goto L_0x007c
            boolean r1 = r8.booleanValue()
            java.lang.String r0 = "should_include_unconnected"
            r2.A0R(r0, r1)
        L_0x007c:
            X.H8c r2 = r2.A02()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubCategoryMembersResponse>>"
            X.C04220Ms.A0C(r2, r0)
            r1 = 14
            r3.A00 = r5
            r0 = 1037542755(0x3dd7a563, float:0.10529592)
            java.lang.Object r1 = X.C63623hv.A01(r2, r3, r0, r6, r1)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x0093:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r3 = X.C18190wL.A0y(r10, r12, r4)
            goto L_0x0016
        L_0x0099:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x009e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A02(com.instagram.api.schemas.FanClubCategoryType, X.8n9, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass23Z r10, java.lang.String r11, X.C146958n9 r12) {
        /*
            r9 = this;
            r3 = 15
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r12)
            if (r0 == 0) goto L_0x0091
            r6 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0091
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r3 = 0
            r8 = 2
            r7 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0056
            if (r0 == r7) goto L_0x00d0
            if (r0 != r8) goto L_0x0096
            X.AnonymousClass0OU.A00(r1)
        L_0x0029:
            r4 = r1
            X.3b6 r4 = (X.C62903b6) r4
            boolean r0 = r4 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x004d
            java.lang.Object r0 = X.C62903b6.A05(r4)
            X.332 r0 = (X.AnonymousClass332) r0
            X.422 r0 = r0.A00
            if (r0 == 0) goto L_0x003c
            X.BKU r3 = r0.A00
        L_0x003c:
            X.1jA r4 = X.AnonymousClass1jA.A00(r3)
        L_0x0040:
            boolean r0 = r4 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0104
            boolean r0 = r4 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0100
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x004d:
            boolean r0 = r4 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0040
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0056:
            X.AnonymousClass0OU.A00(r1)
            int r0 = r10.ordinal()
            if (r0 == r5) goto L_0x00a0
            if (r0 != r7) goto L_0x009b
            com.instagram.service.session.UserSession r0 = r9.A00
            X.C04220Ms.A0B(r11, r7)
            X.H1T r7 = X.C18180wK.A0P(r0)
            java.lang.String r2 = "fan_club_id"
            java.lang.String r1 = "fan_club/"
            java.lang.String r0 = "welcome_video/"
            X.AnonymousClass0wJ.A1J(r7, r1, r0)
            java.lang.Class<X.1Qw> r1 = X.C21451Qw.class
            java.lang.Class<X.3K4> r0 = X.AnonymousClass3K4.class
            r7.A0B(r1, r0)
            X.H8c r2 = X.C18200wM.A0T(r7, r2, r11)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubWelcomeVideoInfoResponse>>"
            X.C04220Ms.A0C(r2, r0)
            r1 = 14
            r6.A00 = r8
            r0 = 876706038(0x344178f6, float:1.8018531E-7)
            java.lang.Object r1 = X.C63623hv.A01(r2, r6, r0, r5, r1)
            if (r1 != r4) goto L_0x0029
            return r4
        L_0x0091:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = X.C18190wL.A0y(r9, r12, r3)
            goto L_0x0016
        L_0x0096:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x009b:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00a0:
            com.instagram.service.session.UserSession r0 = r9.A00
            X.C04220Ms.A0B(r11, r7)
            X.H1T r8 = X.C18180wK.A0P(r0)
            java.lang.String r2 = "fan_club_id"
            java.lang.String r1 = "fan_club/"
            java.lang.String r0 = "promotional_video/"
            X.AnonymousClass0wJ.A1J(r8, r1, r0)
            java.lang.Class<X.1Qt> r1 = X.C21421Qt.class
            java.lang.Class<X.3K1> r0 = X.AnonymousClass3K1.class
            r8.A0B(r1, r0)
            X.H8c r2 = X.C18200wM.A0T(r8, r2, r11)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubPromoVideoInfoResponse>>"
            X.C04220Ms.A0C(r2, r0)
            r1 = 876706038(0x344178f6, float:1.8018531E-7)
            r0 = 14
            r6.A00 = r7
            java.lang.Object r1 = X.C63623hv.A01(r2, r6, r1, r5, r0)
            if (r1 != r4) goto L_0x00d3
            return r4
        L_0x00d0:
            X.AnonymousClass0OU.A00(r1)
        L_0x00d3:
            r4 = r1
            X.3b6 r4 = (X.C62903b6) r4
            boolean r0 = r4 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00f7
            java.lang.Object r0 = X.C62903b6.A05(r4)
            X.32z r0 = (X.AnonymousClass32z) r0
            X.422 r0 = r0.A00
            if (r0 == 0) goto L_0x00e6
            X.BKU r3 = r0.A00
        L_0x00e6:
            X.1jA r4 = X.AnonymousClass1jA.A00(r3)
        L_0x00ea:
            boolean r0 = r4 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0104
            boolean r0 = r4 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0100
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00f7:
            boolean r0 = r4 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x00ea
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0100:
            X.1jB r4 = X.AnonymousClass1jB.A01()
        L_0x0104:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A03(X.23Z, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(java.lang.String r9, java.lang.String r10, X.C146958n9 r11) {
        /*
            r8 = this;
            r4 = 14
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r4, r11)
            if (r0 == 0) goto L_0x0072
            r3 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0072
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r3.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r3.A00
            r6 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r6) goto L_0x007c
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            r5 = r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0031
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0077
            X.1jB r5 = X.AnonymousClass1jB.A01()
        L_0x0031:
            return r5
        L_0x0032:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r8.A00
            r2 = 0
            X.H1T r7 = X.C18180wK.A0P(r0)
            java.lang.String r1 = "fan_club/"
            java.lang.String r0 = "members/"
            X.AnonymousClass0wJ.A1J(r7, r1, r0)
            java.lang.Class<X.1Rg> r1 = X.C21551Rg.class
            java.lang.Class<X.3Jz> r0 = X.C59223Jz.class
            r7.A0B(r1, r0)
            if (r9 == 0) goto L_0x0051
            java.lang.String r0 = "max_id"
            r7.A0O(r0, r9)
        L_0x0051:
            if (r10 == 0) goto L_0x0058
            java.lang.String r0 = "query"
            r7.A0O(r0, r10)
        L_0x0058:
            java.lang.String r0 = "should_include_unconnected"
            r7.A0R(r0, r2)
            X.H8c r1 = r7.A02()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubMembersResponse>>"
            X.C04220Ms.A0C(r1, r0)
            r3.A00 = r6
            r0 = 1240235265(0x49ec7d01, float:1937312.1)
            java.lang.Object r1 = X.C63623hv.A01(r1, r3, r0, r2, r4)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x0072:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r3 = X.C18190wL.A0y(r8, r11, r4)
            goto L_0x0016
        L_0x0077:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x007c:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A05(java.lang.String, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(java.lang.String r8, java.lang.String r9, X.C146958n9 r10) {
        /*
            r7 = this;
            r3 = 20
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r10)
            if (r0 == 0) goto L_0x0078
            r4 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0078
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r6) goto L_0x0082
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            r5 = r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0031
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x007d
            X.1jB r5 = X.AnonymousClass1jB.A01()
        L_0x0031:
            return r5
        L_0x0032:
            X.AnonymousClass0OU.A00(r1)
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r3 = new com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000
            r3.<init>()
            java.lang.String r1 = X.C18180wK.A0e()
            java.lang.String r0 = "client_mutation_id"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r3, r1, r0)
            java.lang.String r0 = "fan_club_id"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r3, r8, r0)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r9)
            java.lang.String r0 = "users"
            r3.A0A(r0, r1)
            X.3zb r2 = X.C67463zb.A00()
            X.C67463zb.A01(r3, r2)
            X.AnonymousClass7Ko.A0B(r6)
            java.lang.Class<X.14z> r1 = X.AnonymousClass14z.class
            java.lang.String r0 = "FanClubUnBlockMember"
            X.3zc r1 = X.C67473zc.A00(r2, r1, r0)
            com.instagram.service.session.UserSession r0 = r7.A00
            r3 = 0
            X.H8c r2 = X.C18200wM.A0S(r1, r0)
            r1 = 14
            r4.A00 = r6
            r0 = 1620689189(0x6099c125, float:8.863342E19)
            java.lang.Object r1 = X.C63623hv.A01(r2, r4, r0, r3, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x0078:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r4 = X.C18190wL.A0y(r7, r10, r3)
            goto L_0x0016
        L_0x007d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0082:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A06(java.lang.String, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(java.lang.String r8, X.C146958n9 r9) {
        /*
            r7 = this;
            r3 = 9
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r9)
            if (r0 == 0) goto L_0x0068
            r4 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0068
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r6) goto L_0x0072
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            r5 = r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0031
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x006d
            X.1jB r5 = X.AnonymousClass1jB.A01()
        L_0x0031:
            return r5
        L_0x0032:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            r3 = 0
            X.H1T r2 = X.C18180wK.A0P(r0)
            java.lang.String r1 = "fan_club/"
            java.lang.String r0 = "blocked_members/"
            X.AnonymousClass0wJ.A1J(r2, r1, r0)
            java.lang.Class<X.1RT> r1 = X.AnonymousClass1RT.class
            java.lang.Class<X.3Jr> r0 = X.C59143Jr.class
            r2.A0B(r1, r0)
            if (r8 == 0) goto L_0x0051
            java.lang.String r0 = "next_cursor"
            r2.A0O(r0, r8)
        L_0x0051:
            X.H8c r2 = r2.A02()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubBlockedMembersResponse>>"
            X.C04220Ms.A0C(r2, r0)
            r1 = 14
            r4.A00 = r6
            r0 = 1264748884(0x4b628954, float:1.4846292E7)
            java.lang.Object r1 = X.C63623hv.A01(r2, r4, r0, r3, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x0068:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r4 = X.C18190wL.A0y(r7, r9, r3)
            goto L_0x0016
        L_0x006d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0072:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A07(java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(java.lang.String r8, X.C146958n9 r9) {
        /*
            r7 = this;
            r3 = 12
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r9)
            if (r0 == 0) goto L_0x0068
            r4 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0068
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r6) goto L_0x0072
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            r5 = r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0031
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x006d
            X.1jB r5 = X.AnonymousClass1jB.A01()
        L_0x0031:
            return r5
        L_0x0032:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            r3 = 0
            X.H1T r2 = X.C18180wK.A0P(r0)
            java.lang.String r1 = "fan_club/"
            java.lang.String r0 = "creators_subscribed_to/"
            X.AnonymousClass0wJ.A1J(r2, r1, r0)
            java.lang.Class<X.1RU> r1 = X.AnonymousClass1RU.class
            java.lang.Class<X.3Jv> r0 = X.C59183Jv.class
            r2.A0B(r1, r0)
            if (r8 == 0) goto L_0x0051
            java.lang.String r0 = "max_id"
            r2.A0O(r0, r8)
        L_0x0051:
            X.H8c r2 = r2.A02()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubCreatorsSubscribedToResponse>>"
            X.C04220Ms.A0C(r2, r0)
            r1 = 14
            r4.A00 = r6
            r0 = 1561350127(0x5d104fef, float:6.4992455E17)
            java.lang.Object r1 = X.C63623hv.A01(r2, r4, r0, r3, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x0068:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r4 = X.C18190wL.A0y(r7, r9, r3)
            goto L_0x0016
        L_0x006d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0072:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A08(java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.String r8, X.C146958n9 r9) {
        /*
            r7 = this;
            r3 = 13
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r9)
            if (r0 == 0) goto L_0x0068
            r4 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0068
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r6) goto L_0x0072
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            r5 = r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0031
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x006d
            X.1jB r5 = X.AnonymousClass1jB.A01()
        L_0x0031:
            return r5
        L_0x0032:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            r3 = 0
            X.H1T r2 = X.C18180wK.A0P(r0)
            java.lang.String r1 = "fan_club/"
            java.lang.String r0 = "followed_creators_to_susbcribe_to/"
            X.AnonymousClass0wJ.A1J(r2, r1, r0)
            java.lang.Class<X.1RV> r1 = X.AnonymousClass1RV.class
            java.lang.Class<X.3Jx> r0 = X.C59203Jx.class
            r2.A0B(r1, r0)
            if (r8 == 0) goto L_0x0051
            java.lang.String r0 = "max_id"
            r2.A0O(r0, r8)
        L_0x0051:
            X.H8c r2 = r2.A02()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubFollowedCreatorsToSubscribeToResponse>>"
            X.C04220Ms.A0C(r2, r0)
            r1 = 14
            r4.A00 = r6
            r0 = 1327216684(0x4f1bb82c, float:2.61253837E9)
            java.lang.Object r1 = X.C63623hv.A01(r2, r4, r0, r3, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x0068:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r4 = X.C18190wL.A0y(r7, r9, r3)
            goto L_0x0016
        L_0x006d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0072:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A09(java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0A(java.lang.String r16, X.C146958n9 r17, boolean r18, boolean r19) {
        /*
            r15 = this;
            r4 = 21
            r5 = r17
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r4, r5)
            if (r0 == 0) goto L_0x009f
            r3 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009f
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0018:
            java.lang.Object r4 = r3.A01
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 != r1) goto L_0x00aa
            X.AnonymousClass0OU.A00(r4)
        L_0x0026:
            X.3b6 r4 = (X.C62903b6) r4
            boolean r0 = r4 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = X.C62903b6.A06(r4)
            X.1jA r4 = X.AnonymousClass1jA.A00(r0)
        L_0x0034:
            boolean r0 = r4 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0040
            boolean r0 = r4 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00a5
            X.1jB r4 = X.AnonymousClass1jB.A01()
        L_0x0040:
            return r4
        L_0x0041:
            boolean r0 = r4 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0034
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x004a:
            X.AnonymousClass0OU.A00(r4)
            r11 = 0
            X.3zb r7 = X.C67463zb.A00()
            X.3zb r6 = X.C67463zb.A00()
            r10 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            java.lang.String r5 = "should_fetch_early_pricing"
            r7.A03(r5, r0)
            java.lang.String r4 = "should_fetch_member_count"
            r7.A03(r4, r0)
            java.lang.String r0 = "user_id"
            r8 = r16
            r7.A05(r0, r8)
            boolean r0 = X.AnonymousClass0wJ.A1W(r8)
            r9 = r18
            r8 = r19
            A01(r7, r5, r4, r9, r8)
            X.8l9 r5 = X.C63233h2.A04(r0)
            java.util.Map r7 = com.facebook.graphql.calls.GraphQlCallInput.A03(r7)
            java.util.Map r8 = com.facebook.graphql.calls.GraphQlCallInput.A03(r6)
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoResponseImpl> r9 = com.instagram.fanclub.api.FanClubInfoResponseImpl.class
            java.lang.String r6 = "FanClubInfo"
            java.lang.String r14 = "xig_user_by_igid_v2"
            com.facebook.pando.PandoGraphQLRequest r4 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r13 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            com.instagram.service.session.UserSession r0 = r15.A00
            X.Grx r0 = X.AnonymousClass3WK.A01(r0)
            r3.A00 = r1
            java.lang.Object r4 = r0.A06(r4, r3)
            if (r4 != r2) goto L_0x0026
            return r2
        L_0x009f:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r3 = X.C18190wL.A0y(r15, r5, r4)
            goto L_0x0018
        L_0x00a5:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00aa:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0A(java.lang.String, X.8n9, boolean, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0D(java.util.List r8, X.C146958n9 r9) {
        /*
            r7 = this;
            r3 = 19
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r9)
            if (r0 == 0) goto L_0x0060
            r6 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0060
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r4) goto L_0x006a
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            r5 = r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0031
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0065
            X.1jB r5 = X.AnonymousClass1jB.A01()
        L_0x0031:
            return r5
        L_0x0032:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            r3 = 0
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r0 = "fan_club/replace_previews/"
            r2.A0J(r0)
            java.lang.String r1 = X.C18200wM.A0o(r8)
            java.lang.String r0 = "media_ids"
            r2.A0O(r0, r1)
            java.lang.Class<X.4vo> r1 = X.C85814vo.class
            java.lang.Class<X.3Za> r0 = X.AnonymousClass3Za.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r1 = 14
            r6.A00 = r4
            r0 = 210647125(0xc8e3855, float:2.1912468E-31)
            java.lang.Object r1 = X.C63623hv.A01(r2, r6, r0, r3, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x0060:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = X.C18190wL.A0y(r7, r9, r3)
            goto L_0x0016
        L_0x0065:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x006a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0D(java.util.List, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0F(X.C146958n9 r8) {
        /*
            r7 = this;
            r3 = 8
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r8)
            if (r0 == 0) goto L_0x005f
            r6 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005f
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x003a
            if (r0 != r4) goto L_0x0083
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            r5 = r1
            X.3b6 r5 = (X.C62903b6) r5
            boolean r0 = r5 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0064
            X.1jA r5 = (X.AnonymousClass1jA) r5
            java.lang.Object r0 = r5.A00
            X.1Qr r0 = (X.C21411Qr) r0
            X.32x r0 = r0.A00
            if (r0 != 0) goto L_0x006d
            X.C18250wR.A0m()
            r0 = 0
            throw r0
        L_0x003a:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            X.H1T r2 = X.AnonymousClass0wJ.A0P(r0)
            java.lang.String r0 = "fan_club/content_preview_ids/"
            r2.A0J(r0)
            java.lang.Class<X.1Qr> r1 = X.C21411Qr.class
            java.lang.Class<X.3Jw> r0 = X.C59193Jw.class
            X.H8c r3 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r2 = 0
            r1 = 14
            r6.A00 = r4
            r0 = 210647125(0xc8e3855, float:2.1912468E-31)
            java.lang.Object r1 = X.C63623hv.A01(r3, r6, r0, r2, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x005f:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = X.C18190wL.A0y(r7, r8, r3)
            goto L_0x0016
        L_0x0064:
            boolean r0 = r5 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0071
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x006d:
            X.1jA r5 = X.AnonymousClass1jA.A00(r0)
        L_0x0071:
            boolean r0 = r5 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x007d
            boolean r0 = r5 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x007e
            X.1jB r5 = X.AnonymousClass1jB.A01()
        L_0x007d:
            return r5
        L_0x007e:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0083:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0F(X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0G(X.C146958n9 r8) {
        /*
            r7 = this;
            r3 = 16
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r8)
            if (r0 == 0) goto L_0x0070
            r5 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r5
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
            r4 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 != r4) goto L_0x007a
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x003b
            X.1jA r1 = X.C62903b6.A04(r1)
        L_0x002e:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x003a
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0075
            X.1jB r1 = X.AnonymousClass1jB.A01()
        L_0x003a:
            return r1
        L_0x003b:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x002e
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0044:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            r3 = 0
            X.H1T r2 = X.C18180wK.A0P(r0)
            java.lang.String r1 = "fan_club/"
            java.lang.String r0 = "subscription_settings_recommendations/"
            X.AnonymousClass0wJ.A1J(r2, r1, r0)
            java.lang.Class<X.1Qu> r1 = X.C21431Qu.class
            java.lang.Class<X.3K2> r0 = X.AnonymousClass3K2.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubSubscriptionSettingsRecommendationsResponse>>"
            X.C04220Ms.A0C(r2, r0)
            r1 = 14
            r5.A00 = r4
            r0 = 937648080(0x37e35fd0, float:2.7105125E-5)
            java.lang.Object r1 = X.C63623hv.A01(r2, r5, r0, r3, r1)
            if (r1 != r6) goto L_0x0024
            return r6
        L_0x0070:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r5 = X.C18190wL.A0y(r7, r8, r3)
            goto L_0x0016
        L_0x0075:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x007a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0G(X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0H(X.C146958n9 r8) {
        /*
            r7 = this;
            r3 = 17
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r8)
            if (r0 == 0) goto L_0x005e
            r6 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005e
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r4) goto L_0x0068
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            r5 = r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0031
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0063
            X.1jB r5 = X.AnonymousClass1jB.A01()
        L_0x0031:
            return r5
        L_0x0032:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            r3 = 0
            X.H1T r2 = X.C18180wK.A0P(r0)
            java.lang.String r1 = "fan_club/"
            java.lang.String r0 = "unconnected_creators_to_susbcribe_to/"
            X.AnonymousClass0wJ.A1J(r2, r1, r0)
            java.lang.Class<X.1Qv> r1 = X.C21441Qv.class
            java.lang.Class<X.3K3> r0 = X.AnonymousClass3K3.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubUnconnectedCreatorsToSubscribeToResponse>>"
            X.C04220Ms.A0C(r2, r0)
            r1 = 14
            r6.A00 = r4
            r0 = 1595688088(0x5f1c4498, float:1.1260292E19)
            java.lang.Object r1 = X.C63623hv.A01(r2, r6, r0, r3, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x005e:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = X.C18190wL.A0y(r7, r8, r3)
            goto L_0x0016
        L_0x0063:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0H(X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0I(X.C146958n9 r8) {
        /*
            r7 = this;
            r3 = 18
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r8)
            if (r0 == 0) goto L_0x005f
            r6 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005f
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x003a
            if (r0 != r4) goto L_0x0083
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            r5 = r1
            X.3b6 r5 = (X.C62903b6) r5
            boolean r0 = r5 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0064
            X.1jA r5 = (X.AnonymousClass1jA) r5
            java.lang.Object r0 = r5.A00
            X.1Qs r0 = (X.AnonymousClass1Qs) r0
            X.32y r0 = r0.A00
            if (r0 != 0) goto L_0x006d
            X.C18250wR.A0m()
            r0 = 0
            throw r0
        L_0x003a:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            X.H1T r2 = X.AnonymousClass0wJ.A0P(r0)
            java.lang.String r0 = "fan_club/subscription_next_steps_recommendations/"
            r2.A0J(r0)
            java.lang.Class<X.1Qs> r1 = X.AnonymousClass1Qs.class
            java.lang.Class<X.3K0> r0 = X.AnonymousClass3K0.class
            X.H8c r3 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r2 = 0
            r1 = 14
            r6.A00 = r4
            r0 = 1269204293(0x4ba68545, float:2.1826186E7)
            java.lang.Object r1 = X.C63623hv.A01(r3, r6, r0, r2, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x005f:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = X.C18190wL.A0y(r7, r8, r3)
            goto L_0x0016
        L_0x0064:
            boolean r0 = r5 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0071
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x006d:
            X.1jA r5 = X.AnonymousClass1jA.A00(r0)
        L_0x0071:
            boolean r0 = r5 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x007d
            boolean r0 = r5 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x007e
            X.1jB r5 = X.AnonymousClass1jB.A01()
        L_0x007d:
            return r5
        L_0x007e:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0083:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0I(X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0J(X.C146958n9 r15) {
        /*
            r14 = this;
            r4 = 22
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r4, r15)
            if (r0 == 0) goto L_0x008f
            r1 = r15
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r1 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r1
            int r3 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x008f
            int r3 = r3 - r2
            r1.A00 = r3
        L_0x0016:
            java.lang.Object r3 = r1.A01
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r1.A00
            r9 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 != r9) goto L_0x0099
            X.AnonymousClass0OU.A00(r3)
        L_0x0024:
            X.3b6 r3 = (X.C62903b6) r3
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = X.C62903b6.A06(r3)
            X.1jA r3 = X.AnonymousClass1jA.A00(r0)
        L_0x0032:
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x003e
            boolean r0 = r3 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0094
            X.1jB r3 = X.AnonymousClass1jB.A01()
        L_0x003e:
            return r3
        L_0x003f:
            boolean r0 = r3 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0032
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0048:
            X.AnonymousClass0OU.A00(r3)
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r4 = new com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000
            r4.<init>()
            java.lang.String r3 = X.C18180wK.A0e()
            java.lang.String r0 = "client_mutation_id"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r4, r3, r0)
            r10 = 0
            X.3zb r3 = X.C67463zb.A00()
            X.3zb r0 = X.C67463zb.A00()
            java.lang.String r12 = "input"
            r3.A02(r4, r12)
            X.8l9 r4 = X.C63233h2.A04(r9)
            java.util.Map r6 = com.facebook.graphql.calls.GraphQlCallInput.A03(r3)
            java.util.Map r7 = com.facebook.graphql.calls.GraphQlCallInput.A03(r0)
            java.lang.Class<com.instagram.fanclub.api.SendSubscriptionNotificationResponseImpl> r8 = com.instagram.fanclub.api.SendSubscriptionNotificationResponseImpl.class
            java.lang.String r5 = "SendSubscriptionNotification"
            r11 = 8
            java.lang.String r13 = "xig_ig_fan_club_send_subscription_notification"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.instagram.service.session.UserSession r0 = r14.A00
            X.Grx r0 = X.AnonymousClass3WK.A01(r0)
            r1.A00 = r9
            java.lang.Object r3 = r0.A06(r3, r1)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x008f:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r1 = X.C18190wL.A0y(r14, r15, r4)
            goto L_0x0016
        L_0x0094:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0099:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0J(X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0K(X.C146958n9 r11, boolean r12) {
        /*
            r10 = this;
            r3 = 10
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r11)
            if (r0 == 0) goto L_0x0089
            r4 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0089
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r6) goto L_0x0093
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            r5 = r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0031
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x008e
            X.1jB r5 = X.AnonymousClass1jB.A01()
        L_0x0031:
            return r5
        L_0x0032:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r9 = r10.A00
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r12)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36599198741236781(0x8206c700090c2d, double:3.208818884877924E-306)
            int r0 = X.C63803iN.A01(r2, r9, r0)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r0)
            r3 = 0
            X.H1T r2 = X.C18180wK.A0P(r9)
            java.lang.String r1 = "fan_club/"
            java.lang.String r0 = "categories_metadata/"
            X.AnonymousClass0wJ.A1J(r2, r1, r0)
            java.lang.Class<X.1Qp> r1 = X.C21401Qp.class
            java.lang.Class<X.3Js> r0 = X.C59153Js.class
            r2.A0B(r1, r0)
            if (r8 == 0) goto L_0x0069
            boolean r1 = r8.booleanValue()
            java.lang.String r0 = "should_include_unconnected"
            r2.A0R(r0, r1)
        L_0x0069:
            int r1 = r7.intValue()
            java.lang.String r0 = "limit"
            r2.A0K(r0, r1)
            X.H8c r2 = r2.A02()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubCategoriesMetadataResponse>>"
            X.C04220Ms.A0C(r2, r0)
            r1 = 14
            r4.A00 = r6
            r0 = 849052330(0x329b82aa, float:1.8103794E-8)
            java.lang.Object r1 = X.C63623hv.A01(r2, r4, r0, r3, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x0089:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r4 = X.C18190wL.A0y(r10, r11, r3)
            goto L_0x0016
        L_0x008e:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0093:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0K(X.8n9, boolean):java.lang.Object");
    }

    public static void A01(C67463zb r1, String str, String str2, boolean z, boolean z2) {
        r1.A03(str, Boolean.valueOf(z));
        r1.A03(str2, Boolean.valueOf(z2));
    }
}
