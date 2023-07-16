package com.instagram.barcelona.profile.followinggraph.data;

import X.AnonymousClass1jC;
import X.AnonymousClass1jE;
import X.AnonymousClass1k8;
import X.AnonymousClass3V6;
import X.C04220Ms;
import X.C148838sG;
import X.C18190wL;
import X.C18230wP;
import X.C27457Enn;
import X.C304621k;
import X.C86074wE;
import X.C86094wG;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.instagram.barcelona.profile.api.FollowingGraphApi;
import com.instagram.service.session.UserSession;

public final class FollowerListDataSource {
    public String A00;
    public final FollowingGraphApi A01;
    public final C304621k A02;
    public final AnonymousClass3V6 A03 = new AnonymousClass3V6(AnonymousClass1k8.A00);
    public final UserSession A04;
    public final String A05;
    public final C86074wE A06;
    public final C86094wG A07;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if ((r0 instanceof X.AnonymousClass1jA) == false) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0127 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.barcelona.profile.followinggraph.data.FollowerListDataSource r9, java.lang.String r10, java.lang.String r11, X.C146958n9 r12, boolean r13) {
        /*
            r1 = 0
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2.A00(r1, r12)
            if (r0 == 0) goto L_0x0128
            r4 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x0128
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x0015:
            java.lang.Object r0 = r4.A03
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r6 = r4.A00
            r8 = 0
            r2 = 2
            r3 = 1
            if (r6 == 0) goto L_0x0094
            if (r6 == r3) goto L_0x00ee
            if (r6 != r2) goto L_0x014c
            boolean r13 = r4.A05
            java.lang.Object r6 = r4.A02
            X.3b6 r6 = (X.C62903b6) r6
            java.lang.Object r9 = r4.A01
            com.instagram.barcelona.profile.followinggraph.data.FollowerListDataSource r9 = (com.instagram.barcelona.profile.followinggraph.data.FollowerListDataSource) r9
            X.AnonymousClass0OU.A00(r0)
        L_0x0031:
            boolean r0 = r0 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0036
        L_0x0035:
            r8 = 1
        L_0x0036:
            if (r13 == 0) goto L_0x0087
            r0 = 3
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2
            r2.<init>((int) r0)
        L_0x003e:
            boolean r0 = r6 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x013d
            if (r8 == 0) goto L_0x013d
            X.1jA r6 = (X.AnonymousClass1jA) r6
            java.lang.Object r0 = r6.A00
            X.4K4 r0 = (X.AnonymousClass4K4) r0
            X.B6m r6 = r0.D7H()
            java.lang.String r0 = r0.A02
            r9.A00 = r0
            java.lang.Object r1 = r2.A01
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r0 = r6.A0E
            if (r0 != 0) goto L_0x005c
            X.0ZV r0 = X.AnonymousClass0ZV.A00
        L_0x005c:
            java.util.List r0 = X.AnonymousClass00J.A0V(r0, r1)
            java.util.HashSet r5 = X.C18200wM.A0u()
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r0.iterator()
        L_0x006c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x012f
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = r0.getId()
            boolean r0 = r5.add(r0)
            if (r0 == 0) goto L_0x006c
            r4.add(r1)
            goto L_0x006c
        L_0x0087:
            X.4wE r0 = r9.A06
            java.lang.Object r0 = r0.getValue()
            X.33u r0 = (X.C555833u) r0
            java.lang.Object r2 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r2
            goto L_0x003e
        L_0x0094:
            X.AnonymousClass0OU.A00(r0)
            if (r13 == 0) goto L_0x00e3
            r6 = 3
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2
            r0.<init>((int) r6)
        L_0x009f:
            X.4wE r7 = r9.A06
            X.1jE r6 = new X.1jE
            r6.<init>(r0)
            r7.CrC(r6)
            r4.A01 = r9
            r4.A05 = r13
            r4.A00 = r3
            X.21k r0 = r9.A02
            int r0 = r0.ordinal()
            if (r0 == r3) goto L_0x00c6
            if (r0 == r1) goto L_0x00d1
            if (r0 != r2) goto L_0x0151
            com.instagram.barcelona.profile.api.FollowingGraphApi r6 = r9.A01
            java.lang.String r0 = "text_feed/pending_users/"
        L_0x00bf:
            java.lang.Object r0 = com.instagram.barcelona.profile.api.FollowingGraphApi.A00(r6, r10, r0, r11, r4)
            if (r0 != r5) goto L_0x00f7
            return r5
        L_0x00c6:
            com.instagram.barcelona.profile.api.FollowingGraphApi r6 = r9.A01
            java.lang.String r0 = r9.A05
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "friendships/%s/following/"
            goto L_0x00db
        L_0x00d1:
            com.instagram.barcelona.profile.api.FollowingGraphApi r6 = r9.A01
            java.lang.String r0 = r9.A05
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "friendships/%s/followers/"
        L_0x00db:
            java.lang.String r0 = X.C18180wK.A0j(r0, r1)
            X.C04220Ms.A06(r0)
            goto L_0x00bf
        L_0x00e3:
            X.4wE r0 = r9.A06
            java.lang.Object r0 = r0.getValue()
            X.33u r0 = (X.C555833u) r0
            java.lang.Object r0 = r0.A00
            goto L_0x009f
        L_0x00ee:
            boolean r13 = r4.A05
            java.lang.Object r9 = r4.A01
            com.instagram.barcelona.profile.followinggraph.data.FollowerListDataSource r9 = (com.instagram.barcelona.profile.followinggraph.data.FollowerListDataSource) r9
            X.AnonymousClass0OU.A00(r0)
        L_0x00f7:
            r6 = r0
            X.3b6 r6 = (X.C62903b6) r6
            boolean r0 = r6 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0035
            r0 = r6
            X.1jA r0 = (X.AnonymousClass1jA) r0
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r0.A00
            X.4K4 r0 = (X.AnonymousClass4K4) r0
            if (r0 == 0) goto L_0x0035
            X.B6m r0 = r0.D7H()
            java.util.List r1 = r0.A0E
            if (r1 == 0) goto L_0x0035
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0035
            com.instagram.barcelona.profile.api.FollowingGraphApi r0 = r9.A01
            r4.A01 = r9
            r4.A02 = r6
            r4.A05 = r13
            r4.A00 = r2
            java.lang.Object r0 = r0.A01(r1, r4)
            if (r0 != r5) goto L_0x0031
            return r5
        L_0x0128:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2
            r4.<init>(r9, r12, r1)
            goto L_0x0015
        L_0x012f:
            java.lang.Integer r2 = r6.A06
            r1 = 3
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2
            r0.<init>((java.lang.Integer) r2, (java.util.List) r4, (int) r1, (boolean) r3)
            X.1jC r1 = new X.1jC
            r1.<init>(r0)
            goto L_0x0144
        L_0x013d:
            kotlin.Unit r0 = kotlin.Unit.A00
            X.1jD r1 = new X.1jD
            r1.<init>(r2, r0)
        L_0x0144:
            X.4wE r0 = r9.A06
            r0.CrC(r1)
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x014c:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0151:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.profile.followinggraph.data.FollowerListDataSource.A00(com.instagram.barcelona.profile.followinggraph.data.FollowerListDataSource, java.lang.String, java.lang.String, X.8n9, boolean):java.lang.Object");
    }

    public /* synthetic */ FollowerListDataSource(C304621k r5, UserSession userSession, String str) {
        FollowingGraphApi followingGraphApi = new FollowingGraphApi(userSession);
        C04220Ms.A0B(r5, 2);
        this.A04 = userSession;
        this.A02 = r5;
        this.A05 = str;
        this.A01 = followingGraphApi;
        C27457Enn A0z = C18190wL.A0z(new AnonymousClass1jE(new KtCSuperShape0S0210000_I2(3)));
        this.A06 = A0z;
        this.A07 = C18230wP.A0x((C148838sG) null, A0z);
    }

    public final void A01() {
        C86074wE r3 = this.A06;
        do {
        } while (!r3.ADi(r3.getValue(), new AnonymousClass1jC(new KtCSuperShape0S0210000_I2(3))));
    }
}
