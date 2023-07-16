package com.instagram.fanclub.gifting;

import X.AnonymousClass3WK;
import X.C04220Ms;
import X.C31580Grx;
import com.instagram.service.session.UserSession;

public final class FanClubGiftingApi {
    public final C31580Grx A00;
    public final UserSession A01;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r18, X.C146958n9 r19) {
        /*
            r17 = this;
            r3 = 25
            r6 = r19
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r6)
            r5 = r17
            if (r0 == 0) goto L_0x0088
            r4 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0088
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r4.A01
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x004c
            if (r0 != r2) goto L_0x0092
            X.AnonymousClass0OU.A00(r1)
        L_0x0028:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = X.C62903b6.A06(r1)
            X.1jA r1 = X.AnonymousClass1jA.A00(r0)
        L_0x0036:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0042
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x008d
            X.1jB r1 = X.AnonymousClass1jB.A01()
        L_0x0042:
            return r1
        L_0x0043:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0036
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x004c:
            X.AnonymousClass0OU.A00(r1)
            r13 = 0
            X.3zb r6 = X.C67463zb.A00()
            X.3zb r1 = X.C67463zb.A00()
            java.lang.String r0 = "user_id"
            r7 = r18
            r6.A05(r0, r7)
            boolean r0 = X.AnonymousClass0wJ.A1W(r7)
            X.8l9 r7 = X.C63233h2.A04(r0)
            java.util.Map r9 = com.facebook.graphql.calls.GraphQlCallInput.A03(r6)
            java.util.Map r10 = com.facebook.graphql.calls.GraphQlCallInput.A03(r1)
            java.lang.Class<com.instagram.fanclub.api.FanClubGiftOptionsResponseImpl> r11 = com.instagram.fanclub.api.FanClubGiftOptionsResponseImpl.class
            java.lang.String r8 = "FanClubGiftOptions"
            r12 = 0
            java.lang.String r16 = "xig_user_by_igid_v2"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.Grx r0 = r5.A00
            r4.A00 = r2
            java.lang.Object r1 = r0.A06(r6, r4)
            if (r1 != r3) goto L_0x0028
            return r3
        L_0x0088:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r4 = X.C18190wL.A0y(r5, r6, r3)
            goto L_0x001a
        L_0x008d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0092:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.gifting.FanClubGiftingApi.A00(java.lang.String, X.8n9):java.lang.Object");
    }

    public /* synthetic */ FanClubGiftingApi(UserSession userSession) {
        C31580Grx A012 = AnonymousClass3WK.A01(userSession);
        C04220Ms.A0B(A012, 2);
        this.A01 = userSession;
        this.A00 = A012;
    }
}
