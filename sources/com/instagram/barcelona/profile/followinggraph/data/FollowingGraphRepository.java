package com.instagram.barcelona.profile.followinggraph.data;

import X.AnonymousClass3LY;
import X.AnonymousClass3V6;
import X.AnonymousClass4VZ;
import X.AnonymousClass7E6;
import X.BBZ;
import X.C146958n9;
import X.C304621k;
import X.C84714tk;
import X.C86094wG;
import X.D0E;
import android.content.Context;
import com.instagram.service.session.UserSession;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape3S1101000_I2;

public final class FollowingGraphRepository {
    public final Context A00;
    public final FollowerListDataSource A01;
    public final FollowerListDataSource A02;
    public final FollowerListDataSource A03;
    public final UserSession A04;
    public final String A05;
    public final C84714tk A06;
    public final C86094wG A07;
    public final C86094wG A08;
    public final C86094wG A09;

    public /* synthetic */ FollowingGraphRepository(Context context, UserSession userSession, String str, String str2) {
        FollowerListDataSource followerListDataSource = new FollowerListDataSource(C304621k.Following, userSession, str);
        FollowerListDataSource followerListDataSource2 = new FollowerListDataSource(C304621k.Follower, userSession, str);
        FollowerListDataSource followerListDataSource3 = new FollowerListDataSource(C304621k.Pending, userSession, str);
        this.A04 = userSession;
        this.A05 = str2;
        this.A02 = followerListDataSource;
        this.A01 = followerListDataSource2;
        this.A03 = followerListDataSource3;
        this.A00 = context.getApplicationContext();
        this.A08 = followerListDataSource.A07;
        this.A07 = followerListDataSource2.A07;
        this.A09 = followerListDataSource3.A07;
        this.A06 = new AnonymousClass7E6(AnonymousClass3LY.A00(userSession)).A02(BBZ.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r19, X.C146958n9 r20) {
        /*
            r18 = this;
            r14 = r19
            r3 = 33
            r4 = r20
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r4)
            r7 = r18
            if (r0 == 0) goto L_0x0101
            r6 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0101
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x001c:
            java.lang.Object r2 = r6.A03
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x00d1
            if (r0 != r4) goto L_0x0112
            java.lang.Object r14 = r6.A02
            java.lang.Object r1 = r6.A01
            com.instagram.barcelona.profile.followinggraph.data.FollowingGraphRepository r1 = (com.instagram.barcelona.profile.followinggraph.data.FollowingGraphRepository) r1
            X.AnonymousClass0OU.A00(r2)
        L_0x0030:
            X.3b6 r2 = (X.C62903b6) r2
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x003e
            boolean r0 = r2 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x010d
            X.1jB r2 = X.AnonymousClass1jB.A01()
        L_0x003e:
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x007e
            X.1jA r2 = (X.AnonymousClass1jA) r2
            java.lang.Object r5 = r2.A00
            com.instagram.barcelona.profile.followinggraph.data.FollowerListDataSource r1 = r1.A01
            r0 = 0
            X.C04220Ms.A0B(r14, r0)
            X.4wE r3 = r1.A06
        L_0x004e:
            java.lang.Object r6 = r3.getValue()
            r7 = r6
            X.33u r7 = (X.C555833u) r7
            java.lang.Object r10 = r7.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r10 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r10
            java.lang.Object r9 = r10.A01
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r9.iterator()
        L_0x0065:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0087
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = r0.getId()
            boolean r0 = X.C04220Ms.A0I(r0, r14)
            X.C18240wQ.A1N(r1, r8, r0)
            goto L_0x0065
        L_0x007e:
            boolean r0 = r2 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x00ba
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0087:
            java.lang.Object r0 = r10.A00
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00cf
            int r2 = r0.intValue()
            int r1 = r9.size()
            int r0 = r8.size()
            int r1 = r1 - r0
            int r2 = r2 - r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
        L_0x009f:
            r0 = 3
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2
            r2.<init>((java.lang.Integer) r1, (java.util.List) r8, (int) r0, (boolean) r4)
            boolean r0 = r7 instanceof X.AnonymousClass1jD
            if (r0 == 0) goto L_0x00bb
            kotlin.Unit r1 = kotlin.Unit.A00
            X.1jD r0 = new X.1jD
            r0.<init>(r2, r1)
        L_0x00b0:
            boolean r0 = r3.ADi(r6, r0)
            if (r0 == 0) goto L_0x004e
            X.1jA r2 = X.AnonymousClass1jA.A00(r5)
        L_0x00ba:
            return r2
        L_0x00bb:
            boolean r0 = r7 instanceof X.AnonymousClass1jE
            if (r0 == 0) goto L_0x00c5
            X.1jE r0 = new X.1jE
            r0.<init>(r2)
            goto L_0x00b0
        L_0x00c5:
            boolean r0 = r7 instanceof X.AnonymousClass1jC
            if (r0 == 0) goto L_0x0108
            X.1jC r0 = new X.1jC
            r0.<init>(r2)
            goto L_0x00b0
        L_0x00cf:
            r1 = 0
            goto L_0x009f
        L_0x00d1:
            X.AnonymousClass0OU.A00(r2)
            android.content.Context r8 = r7.A00
            X.C04220Ms.A05(r8)
            com.instagram.service.session.UserSession r12 = r7.A04
            java.lang.String r15 = "remove_follower"
            java.lang.String r0 = r7.A05
            r9 = 0
            r10 = r9
            r11 = r9
            r13 = r9
            r17 = r9
            r16 = r0
            X.H8c r3 = X.C25705DqT.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2 = 0
            r1 = 14
            r6.A01 = r7
            r6.A02 = r14
            r6.A00 = r4
            r0 = 1475019450(0x57eb02ba, float:5.16793886E14)
            java.lang.Object r2 = X.C63623hv.A01(r3, r6, r0, r2, r1)
            if (r2 != r5) goto L_0x00fe
            return r5
        L_0x00fe:
            r1 = r7
            goto L_0x0030
        L_0x0101:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r6.<init>(r7, r4, r3)
            goto L_0x001c
        L_0x0108:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x010d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0112:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.profile.followinggraph.data.FollowingGraphRepository.A02(java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C146958n9 r7) {
        /*
            r6 = this;
            r3 = 12
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1.A00(r3, r7)
            if (r0 == 0) goto L_0x0062
            r5 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0062
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A02
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 != r3) goto L_0x006d
            java.lang.Object r2 = r5.A01
            com.instagram.barcelona.profile.followinggraph.data.FollowingGraphRepository r2 = (com.instagram.barcelona.profile.followinggraph.data.FollowingGraphRepository) r2
            X.AnonymousClass0OU.A00(r0)
        L_0x0028:
            boolean r1 = r0 instanceof X.AnonymousClass1jB
            if (r1 == 0) goto L_0x0032
            r3 = 0
        L_0x002d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
        L_0x0031:
            return r4
        L_0x0032:
            boolean r0 = r0 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0068
            com.instagram.barcelona.profile.followinggraph.data.FollowerListDataSource r0 = r2.A03
            r0.A01()
            goto L_0x002d
        L_0x003c:
            X.AnonymousClass0OU.A00(r0)
            com.instagram.service.session.UserSession r0 = r6.A04
            r5.A01 = r6
            r5.A00 = r3
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r0 = "text_feed/remove_all_prefollows/"
            r2.A0J(r0)
            java.lang.Class<X.IZ2> r1 = X.IZ2.class
            java.lang.Class<X.JYx> r0 = X.C36509JYx.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r1 = 693691735(0x2958e557, float:4.8160555E-14)
            r0 = 0
            java.lang.Object r0 = X.C63623hv.A00(r2, r5, r1, r0)
            if (r0 == r4) goto L_0x0031
            r2 = r6
            goto L_0x0028
        L_0x0062:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1
            r5.<init>(r6, r7, r3)
            goto L_0x0016
        L_0x0068:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x006d:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.profile.followinggraph.data.FollowingGraphRepository.A03(X.8n9):java.lang.Object");
    }

    public static final FollowerListDataSource A00(C304621k r1, FollowingGraphRepository followingGraphRepository) {
        int ordinal = r1.ordinal();
        if (ordinal == 1) {
            return followingGraphRepository.A02;
        }
        if (ordinal == 0) {
            return followingGraphRepository.A01;
        }
        if (ordinal == 2) {
            return followingGraphRepository.A03;
        }
        throw AnonymousClass4VZ.A00();
    }

    public final Object A01(C304621k r6, String str, C146958n9 r8) {
        FollowerListDataSource A002 = A00(r6, this);
        AnonymousClass3V6 r3 = A002.A03;
        r3.A01();
        KtSLambdaShape3S1101000_I2 ktSLambdaShape3S1101000_I2 = new KtSLambdaShape3S1101000_I2(A002, str, (C146958n9) null, 1);
        Unit unit = Unit.A00;
        Object A003 = r3.A00(unit, r8, ktSLambdaShape3S1101000_I2);
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (A003 != d0e) {
            A003 = unit;
        }
        if (A003 != d0e) {
            return unit;
        }
        return A003;
    }
}
