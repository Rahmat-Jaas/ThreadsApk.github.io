package com.instagram.fanclub.consideration;

import X.AnonymousClass2O7;
import X.AnonymousClass3Y8;
import X.AnonymousClass495;
import X.AnonymousClass6VR;
import X.C18190wL;
import X.C25550Dnj;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.service.session.UserSession;

public final class FanClubConsiderationRepository {
    public final AnonymousClass495 A00;
    public final FanClubApi A01;
    public final UserSession A02;
    public final C25550Dnj A03;
    public final AnonymousClass3Y8 A04;

    public /* synthetic */ FanClubConsiderationRepository(UserSession userSession) {
        FanClubApi fanClubApi = new FanClubApi(userSession);
        C25550Dnj A002 = AnonymousClass6VR.A00(userSession);
        AnonymousClass3Y8 r2 = AnonymousClass3Y8.A02;
        AnonymousClass495 A003 = AnonymousClass2O7.A00(userSession);
        C18190wL.A1S(A002, 3, A003);
        this.A02 = userSession;
        this.A01 = fanClubApi;
        this.A03 = A002;
        this.A04 = r2;
        this.A00 = A003;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.D0E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.D0E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.D0E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.D0E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: X.D0E} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.Boolean r9, java.lang.Boolean r10, java.lang.String r11, X.C146958n9 r12) {
        /*
            r8 = this;
            r4 = 37
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r4, r12)
            if (r0 == 0) goto L_0x00bf
            r3 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00bf
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r3.A04
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r3.A00
            r5 = 1
            if (r1 == 0) goto L_0x008a
            if (r1 != r5) goto L_0x00c6
            java.lang.Object r10 = r3.A03
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.lang.Object r9 = r3.A02
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            java.lang.Object r2 = r3.A01
            com.instagram.fanclub.consideration.FanClubConsiderationRepository r2 = (com.instagram.fanclub.consideration.FanClubConsiderationRepository) r2
            X.AnonymousClass0OU.A00(r0)
        L_0x0030:
            r6 = r0
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            if (r6 == 0) goto L_0x0089
            X.4tY r7 = r6.A0I()
            if (r7 == 0) goto L_0x006b
            java.lang.String r4 = "FanClubConsiderationViewModel_validateDataAndReport_null"
            java.lang.String r0 = r7.AhE()
            java.lang.String r1 = "fanClubId"
            if (r0 != 0) goto L_0x0048
            X.C10450iM.A03(r4, r1)
        L_0x0048:
            java.lang.String r0 = r7.AhG()
            if (r0 != 0) goto L_0x0051
            X.C10450iM.A03(r4, r1)
        L_0x0051:
            com.instagram.service.session.UserSession r3 = r2.A02
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 36320223434905425(0x81090d00001751, double:3.032393777810582E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x006b
            java.lang.Boolean r0 = r7.BTr()
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "isFanClubReferralEligible"
            X.C10450iM.A03(r4, r0)
        L_0x006b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            boolean r0 = X.C04220Ms.A0I(r9, r1)
            if (r0 == 0) goto L_0x007c
            boolean r0 = r9.booleanValue()
            r6.A2e(r0)
        L_0x007c:
            boolean r0 = X.C04220Ms.A0I(r10, r1)
            if (r0 == 0) goto L_0x0089
            boolean r0 = r10.booleanValue()
            r6.A2L(r0)
        L_0x0089:
            return r6
        L_0x008a:
            X.AnonymousClass0OU.A00(r0)
            r3.A01 = r8
            r3.A02 = r9
            r3.A03 = r10
            r3.A00 = r5
            X.8n9 r0 = X.C25598DoY.A02(r3)
            X.Eei r4 = new X.Eei
            r4.<init>(r0)
            X.Dnj r0 = r8.A03
            com.instagram.user.model.User r0 = r0.A03(r11)
            if (r0 == 0) goto L_0x00b1
            r4.resumeWith(r0)
        L_0x00a9:
            java.lang.Object r0 = r4.A00()
            if (r0 == r6) goto L_0x0089
            r2 = r8
            goto L_0x0030
        L_0x00b1:
            X.3Y8 r3 = r8.A04
            com.instagram.service.session.UserSession r2 = r8.A02
            r1 = 0
            com.facebook.redex.IDxFListenerShape748S0100000_1_I2 r0 = new com.facebook.redex.IDxFListenerShape748S0100000_1_I2
            r0.<init>(r4, r1)
            r3.A00(r2, r0, r11)
            goto L_0x00a9
        L_0x00bf:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r3 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r3.<init>(r8, r12, r4)
            goto L_0x0016
        L_0x00c6:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.consideration.FanClubConsiderationRepository.A00(java.lang.Boolean, java.lang.Boolean, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r13, X.C146958n9 r14) {
        /*
            r12 = this;
            r3 = 30
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r14)
            if (r0 == 0) goto L_0x008d
            r5 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008d
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r7 = 1
            if (r0 == 0) goto L_0x0075
            if (r0 != r7) goto L_0x0098
            java.lang.Object r2 = r5.A01
            com.instagram.fanclub.consideration.FanClubConsiderationRepository r2 = (com.instagram.fanclub.consideration.FanClubConsiderationRepository) r2
            X.AnonymousClass0OU.A00(r4)
        L_0x0028:
            X.3b6 r4 = (X.C62903b6) r4
            boolean r0 = r4 instanceof X.AnonymousClass1jA
            r3 = 0
            if (r0 == 0) goto L_0x004a
            X.1jA r4 = (X.AnonymousClass1jA) r4
            java.lang.Object r2 = r4.A00
        L_0x0033:
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x0049
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2> r1 = com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl.XigUserByIgidV2.class
            java.lang.String r0 = "xig_user_by_igid_v2(id:$user_id)"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x0049
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2$FanClub> r1 = com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl.XigUserByIgidV2.FanClub.class
            java.lang.String r0 = "fan_club"
            com.facebook.pando.TreeJNI r3 = r2.getTreeValue(r0, r1)
        L_0x0049:
            return r3
        L_0x004a:
            boolean r0 = r4 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0093
            X.495 r1 = r2.A00
            com.instagram.service.session.UserSession r0 = r2.A02
            java.lang.String r2 = X.C18230wP.A0q(r0)
            X.0nS r1 = r1.A00
            java.lang.String r0 = "ig_fan_club_fetch_fan_club_from_user_failure"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1197(0x4ad, float:1.677E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            java.lang.String r0 = "creator_management_consideration"
            X.C18230wP.A1H(r1, r0)
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r2)
            X.C18250wR.A0x(r1, r0)
            r1.Bb4()
            r2 = r3
            goto L_0x0033
        L_0x0075:
            X.AnonymousClass0OU.A00(r4)
            com.instagram.fanclub.api.FanClubApi r3 = r12.A01
            r5.A01 = r12
            r5.A00 = r7
            r6 = 0
            r4 = r13
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            java.lang.Object r4 = r3.A0B(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r4 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r2 = r12
            goto L_0x0028
        L_0x008d:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r5.<init>(r12, r14, r3)
            goto L_0x0016
        L_0x0093:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0098:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.consideration.FanClubConsiderationRepository.A01(java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r9, X.C146958n9 r10, boolean r11) {
        /*
            r8 = this;
            r3 = 31
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r10)
            if (r0 == 0) goto L_0x0094
            r7 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0094
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r7.A02
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x0075
            if (r0 != r5) goto L_0x00a0
            java.lang.Object r2 = r7.A01
            com.instagram.fanclub.consideration.FanClubConsiderationRepository r2 = (com.instagram.fanclub.consideration.FanClubConsiderationRepository) r2
            X.AnonymousClass0OU.A00(r1)
        L_0x0028:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            r3 = 0
            if (r0 == 0) goto L_0x004a
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r2 = r1.A00
        L_0x0033:
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x0049
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoResponseImpl$XigUserByIgidV2> r1 = com.instagram.fanclub.api.FanClubInfoResponseImpl.XigUserByIgidV2.class
            java.lang.String r0 = "xig_user_by_igid_v2(id:$user_id)"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x0049
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoResponseImpl$XigUserByIgidV2$FanClub> r1 = com.instagram.fanclub.api.FanClubInfoResponseImpl.XigUserByIgidV2.FanClub.class
            java.lang.String r0 = "fan_club"
            com.facebook.pando.TreeJNI r3 = r2.getTreeValue(r0, r1)
        L_0x0049:
            return r3
        L_0x004a:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x009b
            X.495 r1 = r2.A00
            com.instagram.service.session.UserSession r0 = r2.A02
            java.lang.String r2 = X.C18230wP.A0q(r0)
            X.0nS r1 = r1.A00
            java.lang.String r0 = "ig_fan_club_fetch_fan_club_from_user_failure"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1197(0x4ad, float:1.677E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            java.lang.String r0 = "fan_onboarding_consideration"
            X.C18230wP.A1H(r1, r0)
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r2)
            X.C18250wR.A0x(r1, r0)
            r1.Bb4()
            r2 = r3
            goto L_0x0033
        L_0x0075:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.fanclub.api.FanClubApi r4 = r8.A01
            com.instagram.service.session.UserSession r3 = r8.A02
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36323934286717106(0x810c6d000120b2, double:3.03474053543869E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            r7.A01 = r8
            r7.A00 = r5
            java.lang.Object r1 = r4.A0A(r9, r7, r0, r11)
            if (r1 != r6) goto L_0x0092
            return r6
        L_0x0092:
            r2 = r8
            goto L_0x0028
        L_0x0094:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r7.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x009b:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00a0:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.consideration.FanClubConsiderationRepository.A02(java.lang.String, X.8n9, boolean):java.lang.Object");
    }
}
