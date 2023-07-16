package com.instagram.fanclub.promovideo;

import X.AnonymousClass23Z;
import X.AnonymousClass495;
import X.C04220Ms;
import X.C06810aP;
import X.C18180wK;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.service.session.UserSession;

public final class FanClubPromoAndWelcomeVideoApi {
    public final AnonymousClass23Z A00;
    public final AnonymousClass495 A01;
    public final UserSession A02;
    public final C06810aP A03;
    public final FanClubApi A04;

    public FanClubPromoAndWelcomeVideoApi(AnonymousClass23Z r2, AnonymousClass495 r3, FanClubApi fanClubApi, UserSession userSession, C06810aP r6) {
        C04220Ms.A0B(r2, 2);
        C18180wK.A1R(r6, r3);
        this.A02 = userSession;
        this.A00 = r2;
        this.A04 = fanClubApi;
        this.A03 = r6;
        this.A01 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi r11, X.C146958n9 r12) {
        /*
            r3 = 33
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r12)
            if (r0 == 0) goto L_0x0066
            r6 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0066
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r6.A01
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r1 = 1
            if (r0 == 0) goto L_0x004c
            if (r0 != r1) goto L_0x006b
            X.AnonymousClass0OU.A00(r2)
        L_0x0024:
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            r3 = 0
            if (r0 == 0) goto L_0x004b
            X.1jA r2 = (X.AnonymousClass1jA) r2
            if (r2 == 0) goto L_0x004b
            java.lang.Object r2 = r2.A00
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x004b
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2> r1 = com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl.XigUserByIgidV2.class
            java.lang.String r0 = "xig_user_by_igid_v2(id:$user_id)"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x004b
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2$FanClub> r1 = com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl.XigUserByIgidV2.FanClub.class
            java.lang.String r0 = "fan_club"
            com.facebook.pando.TreeJNI r0 = r2.getTreeValue(r0, r1)
            if (r0 == 0) goto L_0x004b
            java.lang.String r3 = X.C18220wO.A0m(r0)
        L_0x004b:
            return r3
        L_0x004c:
            X.AnonymousClass0OU.A00(r2)
            com.instagram.fanclub.api.FanClubApi r4 = r11.A04
            com.instagram.service.session.UserSession r0 = r11.A02
            java.lang.String r5 = r0.getUserId()
            r6.A00 = r1
            r7 = 0
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            java.lang.Object r2 = r4.A0B(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r2 != r3) goto L_0x0024
            return r3
        L_0x0066:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = X.C18190wL.A0y(r11, r12, r3)
            goto L_0x0016
        L_0x006b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi.A00(com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C146958n9 r8) {
        /*
            r7 = this;
            r3 = 44
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r8)
            if (r0 == 0) goto L_0x0068
            r6 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0068
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r6.A02
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0028
            if (r0 == r1) goto L_0x0058
            if (r0 != r3) goto L_0x006e
            X.AnonymousClass0OU.A00(r5)
        L_0x0027:
            return r5
        L_0x0028:
            X.AnonymousClass0OU.A00(r5)
            X.0aP r0 = r7.A03
            com.instagram.user.model.User r0 = r0.A00
            X.4tY r0 = r0.A0I()
            if (r0 == 0) goto L_0x004c
            java.lang.String r5 = r0.AhE()
            if (r5 == 0) goto L_0x004c
            r0 = r7
        L_0x003c:
            com.instagram.fanclub.api.FanClubApi r2 = r0.A04
            X.23Z r1 = r0.A00
            r0 = 0
            r6.A01 = r0
            r6.A00 = r3
            java.lang.Object r5 = r2.A03(r1, r5, r6)
            if (r5 != r4) goto L_0x0027
        L_0x004b:
            return r4
        L_0x004c:
            r6.A01 = r7
            r6.A00 = r1
            java.lang.Object r5 = A00(r7, r6)
            if (r5 == r4) goto L_0x004b
            r0 = r7
            goto L_0x005f
        L_0x0058:
            java.lang.Object r0 = r6.A01
            com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi r0 = (com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi) r0
            X.AnonymousClass0OU.A00(r5)
        L_0x005f:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x003c
            X.1jB r5 = X.AnonymousClass1jB.A01()
            return r5
        L_0x0068:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r6.<init>(r7, r8, r3)
            goto L_0x0016
        L_0x006e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi.A01(X.8n9):java.lang.Object");
    }
}
