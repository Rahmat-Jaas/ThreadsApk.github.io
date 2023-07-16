package com.instagram.wellbeing.respectfulcommentnudge.impl;

import X.C120757Ci;
import com.instagram.wellbeing.respectfulcommentnudge.data.RepositoryImpl;
import com.instagram.wellbeing.respectfulcommentnudge.data.RespectfulNudgeApi;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class RespectfulNudgePluginImpl {
    public static RespectfulNudgePluginImpl A02;
    public final C120757Ci A00;
    public final RepositoryImpl A01;

    public RespectfulNudgePluginImpl() {
        this((C120757Ci) null, (RepositoryImpl) null, (DefaultConstructorMarker) null, 3);
    }

    public /* synthetic */ RespectfulNudgePluginImpl(C120757Ci r4, RepositoryImpl repositoryImpl, DefaultConstructorMarker defaultConstructorMarker, int i) {
        RepositoryImpl repositoryImpl2 = new RepositoryImpl((C120757Ci) null, (RespectfulNudgeApi) null, (DefaultConstructorMarker) null, 3);
        C120757Ci r0 = C120757Ci.A00;
        this.A01 = repositoryImpl2;
        this.A00 = r0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C13330nS r14, X.BZI r15, X.BKU r16, com.instagram.service.session.UserSession r17, java.lang.Integer r18, java.util.List r19, X.C146958n9 r20, boolean r21) {
        /*
            r13 = this;
            r7 = r16
            r6 = r15
            r5 = r14
            r3 = 24
            r4 = r20
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2.A00(r3, r4)
            if (r0 == 0) goto L_0x006b
            r11 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2 r11 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006b
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x001c:
            java.lang.Object r3 = r11.A05
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r11.A00
            r1 = 1
            if (r0 == 0) goto L_0x0042
            if (r0 != r1) goto L_0x0111
            java.lang.Object r5 = r11.A04
            X.0nS r5 = (X.C13330nS) r5
            java.lang.Object r6 = r11.A03
            X.BZI r6 = (X.BZI) r6
            java.lang.Object r7 = r11.A02
            X.BKU r7 = (X.BKU) r7
            X.AnonymousClass0OU.A00(r3)
        L_0x0036:
            X.68H r3 = (X.AnonymousClass68H) r3
            int r0 = r3.ordinal()
            switch(r0) {
                case 0: goto L_0x00d9;
                case 1: goto L_0x0091;
                case 2: goto L_0x0089;
                case 3: goto L_0x0081;
                case 4: goto L_0x0079;
                case 5: goto L_0x0071;
                default: goto L_0x003f;
            }
        L_0x003f:
            X.68I r2 = X.AnonymousClass68I.NONE
            return r2
        L_0x0042:
            X.AnonymousClass0OU.A00(r3)
            com.instagram.wellbeing.respectfulcommentnudge.data.RepositoryImpl r4 = r13.A01
            int r0 = r18.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x0068
            java.lang.String r9 = "loading"
        L_0x0051:
            r11.A01 = r13
            r11.A02 = r7
            r11.A03 = r15
            r11.A04 = r14
            r11.A00 = r1
            r8 = r17
            r10 = r19
            r12 = r21
            java.lang.Object r3 = r4.A01(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r3 != r2) goto L_0x0036
            return r2
        L_0x0068:
            java.lang.String r9 = "commenting"
            goto L_0x0051
        L_0x006b:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2 r11 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2
            r11.<init>(r13, r4, r3)
            goto L_0x001c
        L_0x0071:
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            X.C120757Ci.A00(r5, r6, r7, r0)
            X.68I r2 = X.AnonymousClass68I.PERSISTENT_WARNING_LIGHTWEIGHT
            return r2
        L_0x0079:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            X.C120757Ci.A00(r5, r6, r7, r0)
            X.68I r2 = X.AnonymousClass68I.PERSISTENT_WELCOME_LIGHTWEIGHT
            return r2
        L_0x0081:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            X.C120757Ci.A00(r5, r6, r7, r0)
            X.68I r2 = X.AnonymousClass68I.LWN_WARNING
            return r2
        L_0x0089:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            X.C120757Ci.A00(r5, r6, r7, r0)
            X.68I r2 = X.AnonymousClass68I.LWN_WELCOME
            return r2
        L_0x0091:
            r0 = 0
            X.AnonymousClass0wJ.A1M(r7, r0, r5)
            if (r6 != 0) goto L_0x00d6
            java.lang.Integer r0 = X.AnonymousClass006.A01
        L_0x0099:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A0L(r5)
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x00d3
            java.lang.String r1 = "heated_thread_ig_led"
        L_0x00a5:
            java.lang.String r0 = "source_of_action"
            r3.A0T(r0, r1)
            java.util.Map r0 = X.AnonymousClass4WJ.A0A()
            r3.A1h(r0)
            r2 = 0
            if (r6 == 0) goto L_0x00d1
            java.lang.String r0 = r6.A0e
            if (r0 == 0) goto L_0x00d1
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r0)
        L_0x00bc:
            java.lang.String r0 = "parent_comment_id"
            r3.A0S(r0, r1)
            if (r6 == 0) goto L_0x00cb
            java.lang.String r0 = r6.A0f
            if (r0 == 0) goto L_0x00cb
            java.lang.Long r2 = X.AnonymousClass0wJ.A0d(r0)
        L_0x00cb:
            X.C86114wI.A1E(r3, r7, r2)
            X.68I r2 = X.AnonymousClass68I.DEFAULT
            return r2
        L_0x00d1:
            r1 = r2
            goto L_0x00bc
        L_0x00d3:
            java.lang.String r1 = "comment_reply"
            goto L_0x00a5
        L_0x00d6:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            goto L_0x0099
        L_0x00d9:
            r0 = 0
            X.AnonymousClass0wJ.A1M(r7, r0, r5)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A0L(r5)
            java.lang.String r1 = "heated_thread_empathy"
            java.lang.String r0 = "source_of_action"
            r3.A0T(r0, r1)
            java.util.Map r0 = X.AnonymousClass4WJ.A0A()
            r3.A1h(r0)
            r2 = 0
            if (r6 == 0) goto L_0x010f
            java.lang.String r0 = r6.A0e
            if (r0 == 0) goto L_0x010f
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r0)
        L_0x00fa:
            java.lang.String r0 = "parent_comment_id"
            r3.A0S(r0, r1)
            if (r6 == 0) goto L_0x0109
            java.lang.String r0 = r6.A0f
            if (r0 == 0) goto L_0x0109
            java.lang.Long r2 = X.AnonymousClass0wJ.A0d(r0)
        L_0x0109:
            X.C86114wI.A1E(r3, r7, r2)
            X.68I r2 = X.AnonymousClass68I.EMPATHY
            return r2
        L_0x010f:
            r1 = r2
            goto L_0x00fa
        L_0x0111:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl.A00(X.0nS, X.BZI, X.BKU, com.instagram.service.session.UserSession, java.lang.Integer, java.util.List, X.8n9, boolean):java.lang.Object");
    }
}
