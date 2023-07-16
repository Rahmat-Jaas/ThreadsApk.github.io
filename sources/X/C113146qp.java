package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.6qp  reason: invalid class name and case insensitive filesystem */
public final class C113146qp {
    public boolean A00;
    public final long A01;
    public final M5J A02;
    public final M5J A03;
    public final AnonymousClass3V6 A04;
    public final UserSession A05;
    public final C86074wE A06;
    public final C86074wE A07;
    public final C86074wE A08;
    public final C86074wE A09;
    public final C86094wG A0A;
    public final C83224qz A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (X.C63803iN.A0E(r7, r8, 36321645069278165L) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r15 = this;
            com.instagram.service.session.UserSession r8 = r15.A05
            X.0TJ r7 = X.AnonymousClass0TJ.A05
            r0 = 36321645069147091(0x810a5800011bd3, double:3.033292825029473E-306)
            boolean r0 = X.C63803iN.A0E(r7, r8, r0)
            if (r0 != 0) goto L_0x001e
            r6 = 0
            X.C04220Ms.A0B(r8, r6)
            r0 = 36321645069278165(0x810a5800031bd5, double:3.033292825112365E-306)
            boolean r0 = X.C63803iN.A0E(r7, r8, r0)
            if (r0 == 0) goto L_0x00c6
        L_0x001e:
            r6 = 0
            boolean r0 = r15.A00
            if (r0 != 0) goto L_0x00c6
            r4 = 1
            r15.A00 = r4
            java.lang.String r0 = "ccp_v2"
            int r9 = X.C121967Iz.A00(r8, r0)
            X.Grx r5 = X.AnonymousClass3WK.A01(r8)
            java.lang.Class<X.6wh> r1 = X.C116266wh.class
            java.lang.String r0 = "create"
            java.lang.Object r3 = X.C86104wH.A0p(r0, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003b }
            X.7er r3 = (X.C126257er) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003b }
            goto L_0x0041
        L_0x003b:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x0041:
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r2 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            java.lang.String r1 = "IG"
            r0 = 505(0x1f9, float:7.08E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r2.A0F(r1, r0)
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r13 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            java.lang.String r14 = "FB"
            r0 = 977(0x3d1, float:1.369E-42)
            java.lang.String r12 = X.C18170wI.A00(r0)
            r13.A0F(r14, r12)
            java.lang.String r1 = "STORY"
            r0 = 507(0x1fb, float:7.1E-43)
            java.lang.String r11 = X.C18170wI.A00(r0)
            r13.A0F(r1, r11)
            r0 = 978(0x3d2, float:1.37E-42)
            java.lang.String r10 = X.C18170wI.A00(r0)
            r13.A0F(r1, r10)
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r1 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            r1.A0F(r14, r12)
            java.lang.String r0 = "REELS"
            r1.A0F(r0, r11)
            r1.A0F(r0, r10)
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000[] r0 = new com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000[]{r13, r1}
            java.util.List r1 = X.C06750aI.A17(r0)
            r0 = 966(0x3c6, float:1.354E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r2.A0A(r0, r1)
            X.3zb r1 = r3.A00
            r0 = 945(0x3b1, float:1.324E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r1.A02(r2, r0)
            r3.A02 = r4
            X.8mD r4 = r3.build()
            X.C04220Ms.A06(r4)
            long r1 = r15.A01
            X.8mD r0 = r4.setMaxToleratedCacheAgeMs(r1)
            r0.setFreshCacheAgeMs(r1)
            X.22C r3 = X.AnonymousClass22C.IG
            X.6iI r2 = new X.6iI
            r2.<init>(r15, r9)
            X.C04220Ms.A0B(r5, r6)
            r0 = 9
            com.facebook.redex.IDxFCallbackShape114S0200000_2_I2 r1 = new com.facebook.redex.IDxFCallbackShape114S0200000_2_I2
            r1.<init>(r0, r3, r2)
            X.6Ba r0 = X.C97356Ba.A01
            r5.AMB(r4, r1, r0)
        L_0x00c6:
            X.C04220Ms.A0B(r8, r6)
            r0 = 36321645069278165(0x810a5800031bd5, double:3.033292825112365E-306)
            boolean r0 = X.C63803iN.A0E(r7, r8, r0)
            r3 = 0
            if (r0 != 0) goto L_0x00e2
            X.4qz r2 = r15.A0B
            r0 = 21
            kotlin.coroutines.jvm.internal.KtSLambdaShape14S0101000_I2_11 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0101000_I2_11
            r1.<init>(r15, r3, r0)
            r0 = 3
            X.C25237DiI.A00(r3, r3, r1, r2, r0)
        L_0x00e2:
            r0 = 1
            boolean r0 = X.C34732Kr.A00(r8, r0)
            if (r0 == 0) goto L_0x0101
            r0 = 36323079588159112(0x810ba600001e88, double:3.0342000206290196E-306)
            boolean r0 = X.C63803iN.A0E(r7, r8, r0)
            if (r0 == 0) goto L_0x0101
            X.4qz r2 = r15.A0B
            r0 = 22
            kotlin.coroutines.jvm.internal.KtSLambdaShape14S0101000_I2_11 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0101000_I2_11
            r1.<init>(r15, r3, r0)
            r0 = 3
            X.C25237DiI.A00(r3, r3, r1, r2, r0)
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113146qp.A00():void");
    }

    public C113146qp(AnonymousClass3V6 r8, UserSession userSession, C83224qz r10) {
        this.A05 = userSession;
        this.A0B = r10;
        this.A04 = r8;
        AnonymousClass0TJ r6 = AnonymousClass0TJ.A05;
        this.A01 = C63803iN.A03(r6, userSession, 36603120046051376L);
        Lr0 lr0 = DIV.A01;
        C27457Enn A0z = C18190wL.A0z(lr0);
        this.A06 = A0z;
        this.A0A = A0z;
        C27457Enn A0z2 = C18190wL.A0z(lr0);
        this.A09 = A0z2;
        this.A03 = C29110FiC.A00((C27952Ew2) null, A0z2, 3);
        C27457Enn A0z3 = C18190wL.A0z(lr0);
        this.A07 = A0z3;
        C27457Enn A0z4 = C18190wL.A0z(lr0);
        this.A08 = A0z4;
        C04220Ms.A0B(userSession, 0);
        this.A02 = C29110FiC.A00((C27952Ew2) null, C63803iN.A0E(r6, userSession, 36321645069278165L) ? A0z4 : A0z3, 3);
    }
}
