package com.instagram.wellbeing.respectfulcommentnudge.data;

import X.BKU;
import X.C021209x;
import X.C120757Ci;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class RepositoryImpl {
    public final C120757Ci A00;
    public final RespectfulNudgeApi A01;

    public RepositoryImpl() {
        this((C120757Ci) null, (RespectfulNudgeApi) null, (DefaultConstructorMarker) null, 3);
    }

    public /* synthetic */ RepositoryImpl(C120757Ci r3, RespectfulNudgeApi respectfulNudgeApi, DefaultConstructorMarker defaultConstructorMarker, int i) {
        RespectfulNudgeApi respectfulNudgeApi2 = new RespectfulNudgeApi();
        C120757Ci r0 = C120757Ci.A00;
        this.A01 = respectfulNudgeApi2;
        this.A00 = r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a5, code lost:
        if ((java.lang.System.currentTimeMillis() - X.C18180wK.A05(X.AnonymousClass3WS.A01(r3).A00, X.C18170wI.A00(1365))) > X.C86154wM.A08(java.util.concurrent.TimeUnit.DAYS)) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C13330nS r19, X.BZI r20, X.BKU r21, com.instagram.service.session.UserSession r22, java.lang.String r23, java.util.List r24, X.C146958n9 r25, boolean r26) {
        /*
            r18 = this;
            r3 = r22
            r4 = 38
            r5 = r25
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4.A00(r4, r5)
            r7 = r18
            if (r0 == 0) goto L_0x018f
            r6 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x018f
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x001c:
            java.lang.Object r8 = r6.A02
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0078
            if (r0 != r4) goto L_0x019c
            java.lang.Object r3 = r6.A01
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            X.AnonymousClass0OU.A00(r8)
        L_0x002e:
            X.6iP r8 = (X.C108466iP) r8
            java.util.List r6 = r8.A01
            if (r6 == 0) goto L_0x004c
            X.1tl r5 = X.AnonymousClass3WS.A01(r3)
            android.content.SharedPreferences$Editor r3 = X.C28161tl.A02(r5)
            long r1 = java.lang.System.currentTimeMillis()
            r0 = 421(0x1a5, float:5.9E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.AnonymousClass0wJ.A12(r3, r0, r1)
            X.C28161tl.A07(r5, r6)
        L_0x004c:
            boolean r0 = r8 instanceof X.C965465n
            if (r0 == 0) goto L_0x0053
            X.68H r5 = X.AnonymousClass68H.EMPATHY
            return r5
        L_0x0053:
            boolean r0 = r8 instanceof X.AnonymousClass65m
            if (r0 == 0) goto L_0x005a
            X.68H r5 = X.AnonymousClass68H.DEFAULT
            return r5
        L_0x005a:
            boolean r0 = r8 instanceof X.AnonymousClass65l
            if (r0 == 0) goto L_0x0069
            java.lang.Boolean r0 = r8.A00
            boolean r0 = X.C18190wL.A1Z(r0, r4)
            if (r0 == 0) goto L_0x0196
            X.68H r5 = X.AnonymousClass68H.PERSISTENT_WELCOME_LIGHTWEIGHT
            return r5
        L_0x0069:
            boolean r0 = r8 instanceof X.C965365k
            if (r0 == 0) goto L_0x013b
            java.lang.Boolean r0 = r8.A00
            boolean r0 = X.C18190wL.A1Z(r0, r4)
            if (r0 == 0) goto L_0x0199
            X.68H r5 = X.AnonymousClass68H.PERSISTENT_WARNING_LIGHTWEIGHT
            return r5
        L_0x0078:
            X.AnonymousClass0OU.A00(r8)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36321481860324186(0x810a3200001b5a, double:3.033189611112679E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 != 0) goto L_0x00a7
            X.1tl r0 = X.AnonymousClass3WS.A01(r3)
            long r10 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r1 = r0.A00
            r0 = 1365(0x555, float:1.913E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            long r0 = X.C18180wK.A05(r1, r0)
            long r10 = r10 - r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            long r8 = X.C86154wM.A08(r0)
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x013b
        L_0x00a7:
            java.lang.String r1 = "loading"
            r17 = r23
            r0 = r17
            boolean r0 = X.C04220Ms.A0I(r0, r1)
            r8 = r21
            if (r0 == 0) goto L_0x0164
            r9 = 0
            X.C04220Ms.A0B(r3, r9)
            r0 = 36328108994930978(0x81103900012922, double:3.037380637723343E-306)
            boolean r16 = X.C63803iN.A0E(r2, r3, r0)
            r10 = r19
            if (r16 == 0) goto L_0x013e
            X.1tl r1 = X.AnonymousClass3WS.A01(r3)
            long r13 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r15 = r1.A00
            r0 = 421(0x1a5, float:5.9E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            long r11 = X.C18180wK.A05(r15, r0)
            long r13 = r13 - r11
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            long r11 = X.C86154wM.A08(r0)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x013e
            r0 = 1217(0x4c1, float:1.705E-42)
            java.lang.String r14 = X.C18170wI.A00(r0)
            java.lang.String r13 = "Corrupted List Data for "
            r0 = 765(0x2fd, float:1.072E-42)
            java.lang.String r12 = X.C18170wI.A00(r0)
            java.util.ArrayList r11 = X.AnonymousClass0wJ.A0v()
            java.lang.String r0 = ""
            java.lang.String r15 = r15.getString(r14, r0)
            if (r15 == 0) goto L_0x011f
            int r0 = r15.length()
            if (r0 == 0) goto L_0x011f
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ LWW | IllegalStateException -> 0x0117 }
            r1.<init>()     // Catch:{ LWW | IllegalStateException -> 0x0117 }
            java.lang.Class r0 = r11.getClass()     // Catch:{ LWW | IllegalStateException -> 0x0117 }
            java.lang.Object r0 = r1.A06(r15, r0)     // Catch:{ LWW | IllegalStateException -> 0x0117 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ LWW | IllegalStateException -> 0x0117 }
            if (r0 == 0) goto L_0x0124
            goto L_0x0123
        L_0x0117:
            java.lang.String r0 = X.AnonymousClass00U.A0L(r13, r14)
            X.C10450iM.A03(r12, r0)
            goto L_0x0124
        L_0x011f:
            X.C28161tl.A07(r1, r11)
            goto L_0x0124
        L_0x0123:
            r11 = r0
        L_0x0124:
            java.lang.String r0 = r8.A0N
            boolean r0 = r11.contains(r0)
            if (r0 != 0) goto L_0x013e
            X.C04220Ms.A0B(r10, r4)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = A00(r10, r8)
            java.lang.String r0 = "m21_nudge_efficiency_test_request_skipped"
            X.C18190wL.A1I(r1, r0)
            r1.Bb4()
        L_0x013b:
            X.68H r5 = X.AnonymousClass68H.NONE
            return r5
        L_0x013e:
            r0 = 36328108994865441(0x81103900002921, double:3.037380637681897E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0182
            X.AnonymousClass0wJ.A1M(r8, r4, r10)
            if (r16 == 0) goto L_0x017f
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
        L_0x0150:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = A00(r10, r8)
            int r0 = r0.intValue()
            int r0 = 4 - r0
            if (r0 == 0) goto L_0x017c
            java.lang.String r0 = "m21_nudge_efficiency_control_request_triggered"
        L_0x015e:
            X.C18190wL.A1I(r1, r0)
            r1.Bb4()
        L_0x0164:
            com.instagram.wellbeing.respectfulcommentnudge.data.RespectfulNudgeApi r9 = r7.A01
            r6.A01 = r3
            r6.A00 = r4
            r10 = r20
            r14 = r24
            r16 = r26
            r15 = r6
            r11 = r8
            r12 = r3
            r13 = r17
            java.lang.Object r8 = r9.A00(r10, r11, r12, r13, r14, r15, r16)
            if (r8 != r5) goto L_0x002e
            return r5
        L_0x017c:
            java.lang.String r0 = "m21_nudge_efficiency_test_request_triggered"
            goto L_0x015e
        L_0x017f:
            java.lang.Integer r0 = X.AnonymousClass006.A0j
            goto L_0x0150
        L_0x0182:
            X.C04220Ms.A0B(r8, r9)
            X.C04220Ms.A0B(r10, r4)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = A00(r10, r8)
            java.lang.String r0 = "m21_nudge_request_triggered"
            goto L_0x015e
        L_0x018f:
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4
            r6.<init>(r7, r5, r4)
            goto L_0x001c
        L_0x0196:
            X.68H r5 = X.AnonymousClass68H.WELCOME_LIGHTWEIGHT
            return r5
        L_0x0199:
            X.68H r5 = X.AnonymousClass68H.WARNING_LIGHTWEIGHT
            return r5
        L_0x019c:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.respectfulcommentnudge.data.RepositoryImpl.A01(X.0nS, X.BZI, X.BKU, com.instagram.service.session.UserSession, java.lang.String, java.util.List, X.8n9, boolean):java.lang.Object");
    }

    public static USLEBaseShape0S0000000 A00(C021209x r2, BKU bku) {
        USLEBaseShape0S0000000 A0L = USLEBaseShape0S0000000.A0L(r2);
        A0L.A0T("source_of_action", "m21_nudge");
        A0L.A0T("media_id", bku.A0f.A4Y);
        return A0L;
    }
}
