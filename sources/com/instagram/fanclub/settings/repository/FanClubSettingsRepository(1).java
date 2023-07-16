package com.instagram.fanclub.settings.repository;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C106376ew;
import X.C18190wL;
import X.C18230wP;
import X.C27457Enn;
import X.C695148w;
import X.C86074wE;
import X.C86094wG;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.monetization.repository.MonetizationRepository;

public final class FanClubSettingsRepository {
    public final C695148w A00;
    public final FanClubSettingsRecommendationsRepository A01;
    public final MonetizationRepository A02;
    public final C106376ew A03;
    public final C86094wG A04;
    public final C86094wG A05;
    public final FanClubApi A06;
    public final String A07;
    public final C86074wE A08;
    public final C86074wE A09;

    public FanClubSettingsRepository(FanClubApi fanClubApi, C695148w r4, FanClubSettingsRecommendationsRepository fanClubSettingsRecommendationsRepository, MonetizationRepository monetizationRepository, C106376ew r7, String str) {
        C04220Ms.A0B(str, 1);
        AnonymousClass0wJ.A1R(monetizationRepository, fanClubSettingsRecommendationsRepository);
        C18230wP.A1R(r7, 5, r4);
        this.A07 = str;
        this.A06 = fanClubApi;
        this.A02 = monetizationRepository;
        this.A01 = fanClubSettingsRecommendationsRepository;
        this.A03 = r7;
        this.A00 = r4;
        C27457Enn A0z = C18190wL.A0z(false);
        this.A09 = A0z;
        this.A05 = A0z;
        C27457Enn A0z2 = C18190wL.A0z(0);
        this.A08 = A0z2;
        this.A04 = A0z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r0 != r5) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C146958n9 r10, boolean r11) {
        /*
            r9 = this;
            r3 = 2
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2.A00(r3, r10)
            if (r0 == 0) goto L_0x00a2
            r6 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a2
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r6.A02
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r6.A00
            r7 = 4
            r8 = 3
            r2 = 1
            if (r1 == 0) goto L_0x003f
            if (r1 == r2) goto L_0x0035
            if (r1 == r3) goto L_0x0069
            if (r1 == r8) goto L_0x0069
            if (r1 != r7) goto L_0x00a9
            java.lang.Object r8 = r6.A01
            X.4wE r8 = (X.C86074wE) r8
            X.AnonymousClass0OU.A00(r0)
        L_0x002f:
            r8.CrC(r0)
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0035:
            boolean r11 = r6.A04
            java.lang.Object r4 = r6.A01
            com.instagram.fanclub.settings.repository.FanClubSettingsRepository r4 = (com.instagram.fanclub.settings.repository.FanClubSettingsRepository) r4
            X.AnonymousClass0OU.A00(r0)
            goto L_0x0053
        L_0x003f:
            X.AnonymousClass0OU.A00(r0)
            com.instagram.monetization.repository.MonetizationRepository r1 = r9.A02
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.FAN_CLUB_CREATOR
            r6.A01 = r9
            r6.A04 = r11
            r6.A00 = r2
            java.lang.Object r0 = r1.A00(r0, r6)
            if (r0 == r5) goto L_0x0061
            r4 = r9
        L_0x0053:
            com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository r0 = r4.A01
            r6.A01 = r4
            if (r11 == 0) goto L_0x0062
            r6.A00 = r3
            java.lang.Object r0 = r0.A00(r6)
        L_0x005f:
            if (r0 != r5) goto L_0x0070
        L_0x0061:
            return r5
        L_0x0062:
            r6.A00 = r8
            java.lang.Object r0 = r0.A01(r6)
            goto L_0x005f
        L_0x0069:
            java.lang.Object r4 = r6.A01
            com.instagram.fanclub.settings.repository.FanClubSettingsRepository r4 = (com.instagram.fanclub.settings.repository.FanClubSettingsRepository) r4
            X.AnonymousClass0OU.A00(r0)
        L_0x0070:
            X.48w r3 = r4.A00
            X.4qz r2 = r3.A01
            r1 = 0
            r0 = 34
            kotlin.coroutines.jvm.internal.KtSLambdaShape10S0101000_I2_7 r0 = X.C18240wQ.A0n(r3, r1, r0)
            X.C25237DiI.A00(r1, r1, r0, r2, r8)
            X.4wE r8 = r4.A09
            com.instagram.monetization.repository.MonetizationRepository r4 = r4.A02
            r6.A01 = r8
            r6.A00 = r7
            X.8n9 r0 = X.C25598DoY.A02(r6)
            X.Eei r3 = new X.Eei
            r3.<init>(r0)
            X.Ito r2 = X.C35383Ito.A05
            r1 = 46
            kotlin.jvm.internal.KtLambdaShape171S0100000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape171S0100000_I2
            r0.<init>(r3, r1)
            X.C37416Jrb.A0A(r2, r4, r0)
            java.lang.Object r0 = r3.A00()
            if (r0 != r5) goto L_0x002f
            return r5
        L_0x00a2:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2
            r6.<init>(r9, r10, r3)
            goto L_0x0015
        L_0x00a9:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.settings.repository.FanClubSettingsRepository.A01(X.8n9, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C146958n9 r12) {
        /*
            r11 = this;
            r3 = 47
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r12)
            if (r0 == 0) goto L_0x0083
            r4 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0083
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r4.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x006b
            if (r0 != r5) goto L_0x0089
            java.lang.Object r3 = r4.A01
            com.instagram.fanclub.settings.repository.FanClubSettingsRepository r3 = (com.instagram.fanclub.settings.repository.FanClubSettingsRepository) r3
            X.AnonymousClass0OU.A00(r2)
        L_0x0028:
            X.3b6 r2 = (X.C62903b6) r2
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0062
            X.1jA r2 = (X.AnonymousClass1jA) r2
            java.lang.Object r2 = r2.A00
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x005f
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2> r1 = com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl.XigUserByIgidV2.class
            java.lang.String r0 = "xig_user_by_igid_v2(id:$user_id)"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x005f
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2$FanClub> r1 = com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl.XigUserByIgidV2.FanClub.class
            java.lang.String r0 = "fan_club"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x005f
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2$FanClub$BlockedMembers> r1 = com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl.XigUserByIgidV2.FanClub.BlockedMembers.class
            java.lang.String r0 = "blocked_members"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x005f
            java.lang.String r0 = "count"
            int r1 = r1.getIntValue(r0)
            X.4wE r0 = r3.A08
            X.C86074wE.A00(r0, r1)
        L_0x005f:
            kotlin.Unit r1 = kotlin.Unit.A00
        L_0x0061:
            return r1
        L_0x0062:
            boolean r0 = r2 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x005f
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x006b:
            X.AnonymousClass0OU.A00(r2)
            com.instagram.fanclub.api.FanClubApi r2 = r11.A06
            java.lang.String r3 = r11.A07
            r4.A01 = r11
            r4.A00 = r5
            r6 = 0
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            java.lang.Object r2 = r2.A0B(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r2 == r1) goto L_0x0061
            r3 = r11
            goto L_0x0028
        L_0x0083:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r4.<init>(r11, r12, r3)
            goto L_0x0016
        L_0x0089:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.settings.repository.FanClubSettingsRepository.A00(X.8n9):java.lang.Object");
    }
}
