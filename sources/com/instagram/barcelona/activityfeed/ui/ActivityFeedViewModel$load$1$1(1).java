package com.instagram.barcelona.activityfeed.ui;

import X.AnonymousClass0YY;
import X.AnonymousClass56Y;
import X.C146958n9;
import X.C39142Kno;
import X.C86164wN;
import X.C972268l;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.activityfeed.ui.ActivityFeedViewModel$load$1$1", f = "ActivityFeedViewModel.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
public final class ActivityFeedViewModel$load$1$1 extends C39142Kno implements AnonymousClass0YY {
    public int A00;
    public final /* synthetic */ C972268l A01;
    public final /* synthetic */ AnonymousClass56Y A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityFeedViewModel$load$1$1(C972268l r2, AnonymousClass56Y r3, C146958n9 r4, boolean z) {
        super(1, r4);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = z;
    }

    public final C146958n9 create(C146958n9 r5) {
        return new ActivityFeedViewModel$load$1$1(this.A01, this.A02, r5, this.A03);
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 174 */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0103, code lost:
        if (r0.A00 == null) goto L_0x0105;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            r4 = r19
            int r0 = r4.A00
            r10 = 1
            if (r0 == 0) goto L_0x000f
            X.AnonymousClass0OU.A00(r20)
        L_0x000c:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x000f:
            X.AnonymousClass0OU.A00(r20)
            X.56Y r5 = r4.A02
            X.4wE r11 = r5.A0C
            java.lang.Object r0 = r11.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r0
            java.lang.Object r0 = r0.A00
            X.68l r7 = r4.A01
            if (r0 == r7) goto L_0x0033
            X.4wE r8 = r5.A0B
        L_0x0024:
            java.lang.Object r6 = r8.getValue()
            X.8bW r2 = X.AnonymousClass8bW.A01
            X.68G r1 = X.AnonymousClass68G.NOT_LOADING
            r0 = 0
            boolean r0 = X.C86154wM.A1a(r1, r6, r2, r8, r0)
            if (r0 == 0) goto L_0x0024
        L_0x0033:
            X.68l r8 = X.C972268l.REQUESTED
            if (r7 != r8) goto L_0x00ba
            X.ExY r0 = r5.A08
            X.4wG r0 = r0.Aw6()
            java.lang.Object r0 = r0.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0301000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0301000_I2) r0
            java.lang.Object r9 = r0.A01
            java.util.List r9 = (java.util.List) r9
            boolean r0 = X.C18190wL.A1a(r9)
            if (r0 == 0) goto L_0x00d8
            X.4wE r6 = r5.A0B
        L_0x004f:
            java.lang.Object r12 = r6.getValue()
            android.app.Application r0 = r5.A08()
            android.content.Context r0 = X.C18230wP.A09(r0)
            X.8s2 r2 = X.C25603Doe.A00(r0, r9)
            com.instagram.newsfeed.data.ActivityPagedData r0 = r5.A01
            r1 = 0
            if (r0 == 0) goto L_0x0069
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x0069
            r1 = 1
        L_0x0069:
            X.68G r0 = X.AnonymousClass68G.LOADED
            boolean r0 = X.C86154wM.A1a(r0, r12, r2, r6, r1)
            if (r0 == 0) goto L_0x004f
        L_0x0071:
            java.lang.Object r2 = r11.getValue()
            r0 = r2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r0
            r6 = 0
            java.lang.Object r1 = r0.A01
            X.8s2 r1 = (X.AnonymousClass8s2) r1
            boolean r9 = X.C86154wM.A1Y(r10, r7, r1)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2
            r0.<init>((X.C972268l) r7, (X.AnonymousClass8s2) r1)
            boolean r0 = r11.ADi(r2, r0)
            if (r0 == 0) goto L_0x0071
            X.8sG r0 = r5.A02
            if (r0 == 0) goto L_0x0093
            r0.AC7(r6)
        L_0x0093:
            r5.A01 = r6
            if (r7 != r8) goto L_0x0110
            boolean r4 = r4.A03
            X.4qz r2 = X.AnonymousClass3J5.A00(r5)
            r1 = 32
            kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1
            r0.<init>(r5, r6, r1)
            r3 = 3
            X.C25237DiI.A00(r6, r6, r0, r2, r3)
            X.4qz r2 = X.AnonymousClass3J5.A00(r5)
            r1 = 6
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0111000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0111000_I2
            r0.<init>((java.lang.Object) r5, (X.C146958n9) r6, (int) r1, (boolean) r4)
            X.8sG r0 = X.C25237DiI.A00(r6, r6, r0, r2, r3)
            r5.A02 = r0
            goto L_0x000c
        L_0x00ba:
            java.util.Map r0 = r5.A0A
            java.lang.Object r12 = r0.get(r7)
            X.CJx r12 = (X.C22164CJx) r12
            if (r12 == 0) goto L_0x00d8
            java.util.List r9 = r12.A0C
            if (r9 == 0) goto L_0x00ce
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x00f0
        L_0x00ce:
            java.util.List r0 = r12.A0A
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00f0
        L_0x00d8:
            X.4wE r9 = r5.A0B
        L_0x00da:
            java.lang.Object r6 = r9.getValue()
            r0 = r6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r0
            X.68G r2 = X.AnonymousClass68G.LOADING
            java.lang.Object r1 = r0.A01
            X.8s2 r1 = (X.AnonymousClass8s2) r1
            boolean r0 = r0.A02
            boolean r0 = X.C86154wM.A1a(r2, r6, r1, r9, r0)
            if (r0 == 0) goto L_0x00da
            goto L_0x0071
        L_0x00f0:
            X.4wE r6 = r5.A0B
        L_0x00f2:
            java.lang.Object r13 = r6.getValue()
            java.util.List r0 = r12.A0A
            X.8s2 r2 = X.C25603Doe.A01(r0, r9)
            com.instagram.newsfeed.data.ActivityPagedData r0 = r5.A01
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = r0.A00
            r1 = 1
            if (r0 != 0) goto L_0x0106
        L_0x0105:
            r1 = 0
        L_0x0106:
            X.68G r0 = X.AnonymousClass68G.LOADED
            boolean r0 = X.C86154wM.A1a(r0, r13, r2, r6, r1)
            if (r0 == 0) goto L_0x00f2
            goto L_0x0071
        L_0x0110:
            boolean r2 = r4.A03
            r4.A00 = r10
            com.instagram.newsfeed.data.ActivityFeedRepository r12 = r5.A07
            int r1 = r7.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0131
            r0 = 3
            if (r1 == r0) goto L_0x012e
            if (r1 == r10) goto L_0x0134
            if (r1 == r9) goto L_0x012c
            r0 = 4
            if (r1 == r0) goto L_0x012c
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x012c:
            r13 = 0
            goto L_0x0136
        L_0x012e:
            java.lang.String r13 = "text_post_app_replies"
            goto L_0x0136
        L_0x0131:
            java.lang.String r13 = "text_post_app_mentions"
            goto L_0x0136
        L_0x0134:
            java.lang.String r13 = "verified"
        L_0x0136:
            com.instagram.service.session.UserSession r11 = r5.A09
            X.0TJ r8 = X.AnonymousClass0TJ.A05
            r0 = 36609837374641138(0x821074000013f2, double:3.2155467994811776E-306)
            long r15 = X.C63803iN.A03(r8, r11, r0)
            r14 = 4
            r18 = r9
            r17 = r10
            com.instagram.newsfeed.data.ActivityPagedData r0 = com.instagram.newsfeed.data.ActivityFeedRepository.A00(r12, r13, r14, r15, r17, r18)
            r5.A01 = r0
            X.4qz r1 = X.AnonymousClass3J5.A00(r5)
            r12 = 5
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0211000_I2 r8 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0211000_I2
            r13 = r2
            r11 = r6
            r10 = r7
            r9 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            r0 = 3
            X.8sG r0 = X.C25237DiI.A00(r6, r6, r8, r1, r0)
            r5.A02 = r0
            com.instagram.newsfeed.data.ActivityPagedData r0 = r5.A01
            if (r0 == 0) goto L_0x0170
            java.lang.Object r0 = com.instagram.newsfeed.data.ActivityPagedData.A00(r0, r4)
            if (r0 != r3) goto L_0x0170
        L_0x016d:
            if (r0 != r3) goto L_0x000c
            return r3
        L_0x0170:
            kotlin.Unit r0 = kotlin.Unit.A00
            goto L_0x016d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.activityfeed.ui.ActivityFeedViewModel$load$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((ActivityFeedViewModel$load$1$1) C86164wN.A0m(obj, this)).invokeSuspend(Unit.A00);
    }
}
