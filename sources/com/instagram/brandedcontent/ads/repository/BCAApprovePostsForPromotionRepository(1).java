package com.instagram.brandedcontent.ads.repository;

import X.AnonymousClass5z3;
import X.C148838sG;
import X.C18190wL;
import X.C18230wP;
import X.C27457Enn;
import X.C86074wE;
import X.C86094wG;
import com.instagram.service.session.UserSession;

public final class BCAApprovePostsForPromotionRepository {
    public final BrandedContentAdsApi A00;
    public final C86074wE A01;
    public final C86094wG A02;

    public /* synthetic */ BCAApprovePostsForPromotionRepository(UserSession userSession) {
        this.A00 = new BrandedContentAdsApi(userSession);
        C27457Enn A0z = C18190wL.A0z(AnonymousClass5z3.A00);
        this.A01 = A0z;
        this.A02 = C18230wP.A0x((C148838sG) null, A0z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
        r1 = new X.AnonymousClass5z2(new X.AnonymousClass5uF(X.AnonymousClass00J.A0N(r5)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            X.4wE r2 = r9.A01
            java.lang.Object r1 = r2.getValue()
            X.6Pk r1 = (X.C100976Pk) r1
            boolean r0 = r1 instanceof X.AnonymousClass5z3
            if (r0 != 0) goto L_0x0090
            boolean r0 = r1 instanceof X.AnonymousClass5z2
            if (r0 == 0) goto L_0x00a1
            X.5z2 r1 = (X.AnonymousClass5z2) r1
            java.lang.Object r0 = r1.A00
            X.5uF r0 = (X.AnonymousClass5uF) r0
            java.util.List r8 = r0.A00
            java.util.ArrayList r5 = X.C18200wM.A0s(r8)
            java.util.Iterator r4 = r8.iterator()
            r7 = 0
            r3 = 0
        L_0x0022:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0082
            int r1 = r3 + 1
            java.lang.Object r0 = r4.next()
            X.6hW r0 = (X.C107916hW) r0
            com.instagram.user.model.User r0 = r0.A00
            if (r0 == 0) goto L_0x00ad
            java.lang.String r0 = r0.getId()
            boolean r0 = X.C04220Ms.A0I(r0, r10)
            if (r0 == 0) goto L_0x009f
            int r6 = X.C86144wL.A02(r3)
            java.lang.Object r0 = r8.get(r6)
            X.6hW r0 = (X.C107916hW) r0
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x00aa
            java.util.ArrayList r4 = X.C18200wM.A0s(r0)
            java.util.Iterator r3 = r4.iterator()
        L_0x0054:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0082
            int r1 = r7 + 1
            java.lang.Object r0 = r3.next()
            X.6mB r0 = (X.C110736mB) r0
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x00b0
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x009d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            if (r0 == 0) goto L_0x0082
            int r0 = r0.intValue()
            r4.remove(r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0094
            r5.remove(r6)
        L_0x0082:
            java.util.List r1 = X.AnonymousClass00J.A0N(r5)
            X.5uF r0 = new X.5uF
            r0.<init>(r1)
            X.5z2 r1 = new X.5z2
            r1.<init>(r0)
        L_0x0090:
            r2.CrC(r1)
            return
        L_0x0094:
            java.lang.Object r0 = r5.get(r6)
            X.6hW r0 = (X.C107916hW) r0
            r0.A01 = r4
            goto L_0x0082
        L_0x009d:
            r7 = r1
            goto L_0x0054
        L_0x009f:
            r3 = r1
            goto L_0x0022
        L_0x00a1:
            boolean r0 = r1 instanceof X.AnonymousClass5z1
            if (r0 != 0) goto L_0x0090
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00aa:
            java.lang.String r0 = "pendingSponsorBoosts"
            goto L_0x00b2
        L_0x00ad:
            java.lang.String r0 = "sponsor"
            goto L_0x00b2
        L_0x00b0:
            java.lang.String r0 = "adMediaId"
        L_0x00b2:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.ads.repository.BCAApprovePostsForPromotionRepository.A00(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r6, java.lang.String r7, X.C146958n9 r8) {
        /*
            r5 = this;
            r3 = 17
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r3, r8)
            if (r0 == 0) goto L_0x005c
            r4 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A04
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x004b
            if (r0 != r1) goto L_0x0062
            java.lang.Object r7 = r4.A03
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r4.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r4.A01
            com.instagram.brandedcontent.ads.repository.BCAApprovePostsForPromotionRepository r1 = (com.instagram.brandedcontent.ads.repository.BCAApprovePostsForPromotionRepository) r1
            X.AnonymousClass0OU.A00(r3)
        L_0x0030:
            X.3b6 r3 = (X.C62903b6) r3
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0042
            X.1jA r3 = (X.AnonymousClass1jA) r3
            java.lang.Object r0 = r3.A00
            r1.A00(r6, r7)
            X.1jA r3 = X.AnonymousClass1jA.A00(r0)
        L_0x0041:
            return r3
        L_0x0042:
            boolean r0 = r3 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0041
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x004b:
            X.AnonymousClass0OU.A00(r3)
            com.instagram.brandedcontent.ads.repository.BrandedContentAdsApi r0 = r5.A00
            X.C86114wI.A1J(r5, r6, r7, r4, r1)
            java.lang.Object r3 = r0.A02(r7, r4)
            if (r3 != r2) goto L_0x005a
            return r2
        L_0x005a:
            r1 = r5
            goto L_0x0030
        L_0x005c:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r4.<init>(r5, r8, r3)
            goto L_0x0016
        L_0x0062:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.ads.repository.BCAApprovePostsForPromotionRepository.A01(java.lang.String, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r6, java.lang.String r7, X.C146958n9 r8) {
        /*
            r5 = this;
            r3 = 18
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r3, r8)
            if (r0 == 0) goto L_0x005c
            r4 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A04
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x004b
            if (r0 != r1) goto L_0x0062
            java.lang.Object r7 = r4.A03
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r4.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r4.A01
            com.instagram.brandedcontent.ads.repository.BCAApprovePostsForPromotionRepository r1 = (com.instagram.brandedcontent.ads.repository.BCAApprovePostsForPromotionRepository) r1
            X.AnonymousClass0OU.A00(r3)
        L_0x0030:
            X.3b6 r3 = (X.C62903b6) r3
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0042
            X.1jA r3 = (X.AnonymousClass1jA) r3
            java.lang.Object r0 = r3.A00
            r1.A00(r6, r7)
            X.1jA r3 = X.AnonymousClass1jA.A00(r0)
        L_0x0041:
            return r3
        L_0x0042:
            boolean r0 = r3 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0041
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x004b:
            X.AnonymousClass0OU.A00(r3)
            com.instagram.brandedcontent.ads.repository.BrandedContentAdsApi r0 = r5.A00
            X.C86114wI.A1J(r5, r6, r7, r4, r1)
            java.lang.Object r3 = r0.A03(r7, r4)
            if (r3 != r2) goto L_0x005a
            return r2
        L_0x005a:
            r1 = r5
            goto L_0x0030
        L_0x005c:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r4.<init>(r5, r8, r3)
            goto L_0x0016
        L_0x0062:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.ads.repository.BCAApprovePostsForPromotionRepository.A02(java.lang.String, java.lang.String, X.8n9):java.lang.Object");
    }
}
