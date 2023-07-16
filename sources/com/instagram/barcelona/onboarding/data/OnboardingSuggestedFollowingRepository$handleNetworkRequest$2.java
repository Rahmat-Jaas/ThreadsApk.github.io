package com.instagram.barcelona.onboarding.data;

import X.AnonymousClass0YY;
import X.C146958n9;
import X.C39142Kno;
import X.C86164wN;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.onboarding.data.OnboardingSuggestedFollowingRepository$handleNetworkRequest$2", f = "OnboardingSuggestedFollowingRepository.kt", i = {0}, l = {74, 103}, m = "invokeSuspend", n = {"nextMaxId"}, s = {"L$0"})
public final class OnboardingSuggestedFollowingRepository$handleNetworkRequest$2 extends C39142Kno implements AnonymousClass0YY {
    public int A00;
    public Object A01;
    public final /* synthetic */ KtCSuperShape0S1200000_I2 A02;
    public final /* synthetic */ OnboardingSuggestedFollowingRepository A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingSuggestedFollowingRepository$handleNetworkRequest$2(KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2, OnboardingSuggestedFollowingRepository onboardingSuggestedFollowingRepository, String str, C146958n9 r5, boolean z) {
        super(1, r5);
        this.A02 = ktCSuperShape0S1200000_I2;
        this.A05 = z;
        this.A03 = onboardingSuggestedFollowingRepository;
        this.A04 = str;
    }

    public final C146958n9 create(C146958n9 r7) {
        return new OnboardingSuggestedFollowingRepository$handleNetworkRequest$2(this.A02, this.A03, this.A04, r7, this.A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r9.isEmpty() == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fb, code lost:
        if (X.AnonymousClass0wJ.A1X(r4) != false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0141, code lost:
        if ((r4 instanceof X.AnonymousClass1jB) != false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0143, code lost:
        r4 = r0.A03;
        r0 = r0.A02;
        r1 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2.A01(X.AnonymousClass67Y.Fail, r0.A02, (X.AnonymousClass8s2) r0.A01);
        r3 = r4.A04;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r4 = r23
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            r0 = r22
            int r3 = r0.A00
            r10 = 0
            r2 = 2
            r1 = 1
            if (r3 == 0) goto L_0x00b7
            if (r3 == r1) goto L_0x00f0
            X.AnonymousClass0OU.A00(r4)
        L_0x0012:
            X.3b6 r4 = (X.C62903b6) r4
            boolean r3 = r4 instanceof X.AnonymousClass1jA
            if (r3 == 0) goto L_0x013f
            X.1jA r4 = (X.AnonymousClass1jA) r4
            java.lang.Object r5 = r4.A00
            X.4K4 r5 = (X.AnonymousClass4K4) r5
            X.B6m r3 = r5.D7H()
            java.util.List r3 = r3.A0E
            if (r3 == 0) goto L_0x0156
            com.instagram.barcelona.onboarding.data.OnboardingSuggestedFollowingRepository r7 = r0.A03
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0w(r3)
            java.util.Iterator r12 = r3.iterator()
        L_0x0030:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x0134
            com.instagram.user.model.User r11 = X.C18220wO.A0c(r12)
            java.lang.String r10 = r11.getId()
            X.4wG r3 = r7.A04
            X.67v r3 = X.C86114wI.A0T(r3)
            int r8 = r3.ordinal()
            r6 = 0
            if (r8 == r6) goto L_0x0080
            if (r8 == r1) goto L_0x0066
            if (r8 == r2) goto L_0x0086
            r3 = 3
            if (r8 != r3) goto L_0x012f
            java.util.List r3 = r7.A02
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r8 = r3.iterator()
        L_0x005c:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x007a
            X.AnonymousClass5IJ.A00(r10, r9, r8)
            goto L_0x005c
        L_0x0066:
            java.util.List r3 = r7.A03
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r6 = r3.iterator()
        L_0x0070:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0082
            X.AnonymousClass5IJ.A00(r10, r8, r6)
            goto L_0x0070
        L_0x007a:
            boolean r3 = r9.isEmpty()
            if (r3 != 0) goto L_0x0086
        L_0x0080:
            r6 = 1
            goto L_0x0086
        L_0x0082:
            boolean r6 = r8.isEmpty()
        L_0x0086:
            java.lang.String r15 = r11.getId()
            java.lang.String r16 = r11.BK7()
            java.lang.String r17 = r11.Ak1()
            boolean r19 = r11.BZi()
            com.instagram.common.typedurl.ImageUrl r14 = r11.B4M()
            boolean r20 = r11.A37()
            java.lang.Boolean r3 = r11.A0k()
            if (r3 == 0) goto L_0x00b4
            boolean r21 = r3.booleanValue()
        L_0x00a8:
            X.5IJ r13 = new X.5IJ
            r18 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r4.add(r13)
            goto L_0x0030
        L_0x00b4:
            r21 = 0
            goto L_0x00a8
        L_0x00b7:
            X.AnonymousClass0OU.A00(r4)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r7 = r0.A02
            java.lang.String r11 = r7.A02
            if (r11 != 0) goto L_0x00c6
            boolean r3 = r0.A05
            if (r3 != 0) goto L_0x00c6
            goto L_0x0176
        L_0x00c6:
            com.instagram.barcelona.onboarding.data.OnboardingSuggestedFollowingRepository r5 = r0.A03
            X.67Y r4 = X.AnonymousClass67Y.Loading
            java.lang.Object r3 = r7.A01
            X.8s2 r3 = (X.AnonymousClass8s2) r3
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r4 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2.A01(r4, r11, r3)
            X.4wG r3 = r5.A04
            X.67v r3 = X.C86114wI.A0T(r3)
            com.instagram.barcelona.onboarding.data.OnboardingSuggestedFollowingRepository.A00(r4, r5, r3)
            boolean r3 = r0.A05
            if (r3 == 0) goto L_0x00fe
            com.instagram.service.session.UserSession r3 = r5.A01
            com.instagram.barcelona.onboarding.data.OnboardingRespository r3 = X.AnonymousClass6NJ.A00(r3)
            r0.A01 = r11
            r0.A00 = r1
            java.lang.Object r4 = r3.A06(r0)
            if (r4 != r6) goto L_0x00f7
            return r6
        L_0x00f0:
            java.lang.Object r11 = r0.A01
            java.lang.String r11 = (java.lang.String) r11
            X.AnonymousClass0OU.A00(r4)
        L_0x00f7:
            boolean r3 = X.AnonymousClass0wJ.A1X(r4)
            if (r3 != 0) goto L_0x00fe
            goto L_0x0143
        L_0x00fe:
            com.instagram.barcelona.onboarding.data.OnboardingSuggestedFollowingRepository r3 = r0.A03
            com.instagram.service.session.UserSession r7 = r3.A01
            java.lang.String r3 = r0.A04
            java.lang.String r9 = X.AnonymousClass0hA.A02(r3)
            r15 = 0
            java.lang.String r8 = "friendships/following/"
            java.lang.String r14 = "all"
            r12 = r10
            r13 = r10
            r16 = r15
            r17 = r15
            r18 = r15
            r19 = r15
            r20 = r1
            r21 = r15
            X.H8c r5 = X.AnonymousClass3Zx.A03(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r4 = 762262848(0x2d6f3540, float:1.3597401E-11)
            r3 = 14
            r0.A01 = r10
            r0.A00 = r2
            java.lang.Object r4 = X.C63623hv.A01(r5, r0, r4, r15, r3)
            if (r4 != r6) goto L_0x0012
            return r6
        L_0x012f:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0134:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r1 = r0.A02
            java.lang.Object r1 = r1.A01
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r1 = X.AnonymousClass00J.A0V(r4, r1)
            goto L_0x015c
        L_0x013f:
            boolean r1 = r4 instanceof X.AnonymousClass1jB
            if (r1 == 0) goto L_0x0176
        L_0x0143:
            com.instagram.barcelona.onboarding.data.OnboardingSuggestedFollowingRepository r4 = r0.A03
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r0 = r0.A02
            X.67Y r2 = X.AnonymousClass67Y.Fail
            java.lang.Object r1 = r0.A01
            X.8s2 r1 = (X.AnonymousClass8s2) r1
            java.lang.String r0 = r0.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r1 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2.A01(r2, r0, r1)
            X.4wG r3 = r4.A04
            goto L_0x016f
        L_0x0156:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r1 = r0.A02
            java.lang.Object r1 = r1.A01
            java.lang.Iterable r1 = (java.lang.Iterable) r1
        L_0x015c:
            com.instagram.barcelona.onboarding.data.OnboardingSuggestedFollowingRepository r4 = r0.A03
            X.4wG r3 = r4.A04
            r3.getValue()
            X.8s2 r2 = X.AnonymousClass7C0.A00(r1)
            X.67Y r1 = X.AnonymousClass67Y.Success
            java.lang.String r0 = r5.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r1 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2.A01(r1, r0, r2)
        L_0x016f:
            X.67v r0 = X.C86114wI.A0T(r3)
            com.instagram.barcelona.onboarding.data.OnboardingSuggestedFollowingRepository.A00(r1, r4, r0)
        L_0x0176:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.onboarding.data.OnboardingSuggestedFollowingRepository$handleNetworkRequest$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((OnboardingSuggestedFollowingRepository$handleNetworkRequest$2) C86164wN.A0m(obj, this)).invokeSuspend(Unit.A00);
    }
}
