package com.instagram.barcelona.onboarding.data;

import X.AnonymousClass0YY;
import X.C120957Dj;
import X.C146958n9;
import X.C39142Kno;
import X.C86164wN;
import X.C968466x;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.onboarding.data.OnboardingFollowingTabbedRepository$handleNetworkRequest$2", f = "OnboardingFollowingTabbedRepository.kt", i = {0}, l = {82, 121}, m = "invokeSuspend", n = {"nextMaxId"}, s = {"L$0"})
public final class OnboardingFollowingTabbedRepository$handleNetworkRequest$2 extends C39142Kno implements AnonymousClass0YY {
    public int A00;
    public Object A01;
    public final /* synthetic */ KtCSuperShape0S1200000_I2 A02;
    public final /* synthetic */ KtCSuperShape0S1200000_I2 A03;
    public final /* synthetic */ C968466x A04;
    public final /* synthetic */ C120957Dj A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingFollowingTabbedRepository$handleNetworkRequest$2(KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2, KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I22, C968466x r4, C120957Dj r5, String str, C146958n9 r7, boolean z) {
        super(1, r7);
        this.A03 = ktCSuperShape0S1200000_I2;
        this.A07 = z;
        this.A05 = r5;
        this.A04 = r4;
        this.A02 = ktCSuperShape0S1200000_I22;
        this.A06 = str;
    }

    public final C146958n9 create(C146958n9 r9) {
        KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2 = this.A03;
        boolean z = this.A07;
        C120957Dj r4 = this.A05;
        return new OnboardingFollowingTabbedRepository$handleNetworkRequest$2(ktCSuperShape0S1200000_I2, this.A02, this.A04, r4, this.A06, r9, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fe, code lost:
        if (X.AnonymousClass0wJ.A1X(r5) != false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0197, code lost:
        if ((r5 instanceof X.AnonymousClass1jB) != false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0199, code lost:
        r4 = r0.A05;
        r1 = r0.A03;
        X.C120957Dj.A01(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2.A01(X.AnonymousClass67Y.Fail, r1.A02, (X.AnonymousClass8s2) r1.A01), r0.A04, r4, X.C86114wI.A0T(r4.A05));
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r5 = r26
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            r0 = r25
            int r4 = r0.A00
            r13 = 0
            r3 = 2
            r1 = 1
            r2 = 0
            if (r4 == 0) goto L_0x00b8
            if (r4 == r1) goto L_0x00f3
            X.AnonymousClass0OU.A00(r5)
        L_0x0013:
            X.3b6 r5 = (X.C62903b6) r5
            boolean r4 = r5 instanceof X.AnonymousClass1jA
            if (r4 == 0) goto L_0x0195
            X.1jA r5 = (X.AnonymousClass1jA) r5
            java.lang.Object r4 = r5.A00
            X.4K4 r4 = (X.AnonymousClass4K4) r4
            X.B6m r5 = r4.D7H()
            java.util.List r7 = r5.A0E
            if (r7 == 0) goto L_0x01d0
            X.7Dj r6 = r0.A05
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r12 = r7.iterator()
        L_0x0031:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto L_0x018a
            com.instagram.user.model.User r11 = X.C18220wO.A0c(r12)
            java.lang.String r10 = r11.getId()
            X.4wG r7 = r6.A05
            X.67v r7 = X.C86114wI.A0T(r7)
            int r8 = r7.ordinal()
            if (r8 == r2) goto L_0x0080
            if (r8 == r3) goto L_0x0031
            if (r8 == r1) goto L_0x0066
            r7 = 3
            if (r8 != r7) goto L_0x0185
            java.util.List r7 = r6.A03
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r8 = r7.iterator()
        L_0x005c:
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L_0x007a
            X.AnonymousClass5IJ.A00(r10, r9, r8)
            goto L_0x005c
        L_0x0066:
            java.util.List r7 = r6.A04
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r8 = r7.iterator()
        L_0x0070:
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L_0x0083
            X.AnonymousClass5IJ.A00(r10, r9, r8)
            goto L_0x0070
        L_0x007a:
            boolean r7 = r9.isEmpty()
            if (r7 != 0) goto L_0x0031
        L_0x0080:
            r18 = 1
            goto L_0x0089
        L_0x0083:
            boolean r18 = r9.isEmpty()
            if (r18 == 0) goto L_0x0031
        L_0x0089:
            java.lang.String r15 = r11.getId()
            java.lang.String r16 = r11.BK7()
            java.lang.String r17 = r11.Ak1()
            boolean r19 = r11.BZi()
            com.instagram.common.typedurl.ImageUrl r14 = r11.B4M()
            boolean r20 = r11.A37()
            java.lang.Boolean r7 = r11.A0k()
            if (r7 == 0) goto L_0x00b5
            boolean r21 = r7.booleanValue()
        L_0x00ab:
            X.5IJ r13 = new X.5IJ
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r5.add(r13)
            goto L_0x0031
        L_0x00b5:
            r21 = 0
            goto L_0x00ab
        L_0x00b8:
            X.AnonymousClass0OU.A00(r5)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r6 = r0.A03
            java.lang.String r14 = r6.A02
            if (r14 != 0) goto L_0x00c7
            boolean r4 = r0.A07
            if (r4 != 0) goto L_0x00c7
            goto L_0x01f2
        L_0x00c7:
            X.7Dj r8 = r0.A05
            X.67Y r5 = X.AnonymousClass67Y.Loading
            java.lang.Object r4 = r6.A01
            X.8s2 r4 = (X.AnonymousClass8s2) r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r6 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2.A01(r5, r14, r4)
            X.4wG r4 = r8.A05
            X.67v r5 = X.C86114wI.A0T(r4)
            X.66x r4 = r0.A04
            X.C120957Dj.A01(r6, r4, r8, r5)
            boolean r4 = r0.A07
            if (r4 == 0) goto L_0x0102
            com.instagram.service.session.UserSession r4 = r8.A02
            com.instagram.barcelona.onboarding.data.OnboardingRespository r4 = X.AnonymousClass6NJ.A00(r4)
            r0.A01 = r14
            r0.A00 = r1
            java.lang.Object r5 = r4.A06(r0)
            if (r5 != r7) goto L_0x00fa
            return r7
        L_0x00f3:
            java.lang.Object r14 = r0.A01
            java.lang.String r14 = (java.lang.String) r14
            X.AnonymousClass0OU.A00(r5)
        L_0x00fa:
            boolean r4 = X.AnonymousClass0wJ.A1X(r5)
            if (r4 != 0) goto L_0x0102
            goto L_0x0199
        L_0x0102:
            X.66x r5 = r0.A04
            int r8 = r5.ordinal()
            if (r8 == r2) goto L_0x0153
            if (r8 != r1) goto L_0x01f5
            java.lang.String r17 = "not_public"
        L_0x010e:
            X.7Dj r4 = r0.A05
            X.4wG r6 = r4.A05
            java.lang.Object r9 = r6.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r9 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r9
            java.lang.Object r10 = r9.A00
            X.67v r9 = X.C970767v.SelectSome
            if (r10 != r9) goto L_0x0156
            java.lang.String r11 = r0.A06
            X.C120957Dj.A00(r5, r4)
            java.util.List r0 = r4.A03
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r12 = r0.iterator()
        L_0x012d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r9 = r12.next()
            r7 = r9
            X.5IJ r7 = (X.AnonymousClass5IJ) r7
            X.68K r3 = r7.A01()
            if (r8 == r2) goto L_0x0150
            X.68K r0 = X.AnonymousClass68K.CANCEL
        L_0x0142:
            if (r3 != r0) goto L_0x012d
            java.lang.String r0 = r7.A03
            boolean r0 = X.AnonymousClass8bP.A0j(r0, r11, r1)
            if (r0 == 0) goto L_0x012d
            r10.add(r9)
            goto L_0x012d
        L_0x0150:
            X.68K r0 = X.AnonymousClass68K.FOLLOWING
            goto L_0x0142
        L_0x0153:
            java.lang.String r17 = "public_only"
            goto L_0x010e
        L_0x0156:
            com.instagram.service.session.UserSession r10 = r4.A02
            java.lang.String r4 = r0.A06
            java.lang.String r12 = X.AnonymousClass0hA.A02(r4)
            java.lang.String r11 = "friendships/following/"
            r15 = r13
            r16 = r13
            r18 = r2
            r19 = r2
            r20 = r2
            r21 = r2
            r22 = r2
            r23 = r1
            r24 = r2
            X.H8c r6 = X.AnonymousClass3Zx.A03(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r5 = 762262848(0x2d6f3540, float:1.3597401E-11)
            r4 = 14
            r0.A01 = r13
            r0.A00 = r3
            java.lang.Object r5 = X.C63623hv.A01(r6, r0, r5, r2, r4)
            if (r5 != r7) goto L_0x0013
            return r7
        L_0x0185:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x018a:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r1 = r0.A03
            java.lang.Object r1 = r1.A01
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r1 = X.AnonymousClass00J.A0V(r5, r1)
            goto L_0x01d6
        L_0x0195:
            boolean r1 = r5 instanceof X.AnonymousClass1jB
            if (r1 == 0) goto L_0x01f2
        L_0x0199:
            X.7Dj r4 = r0.A05
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r1 = r0.A03
            X.67Y r3 = X.AnonymousClass67Y.Fail
            java.lang.Object r2 = r1.A01
            X.8s2 r2 = (X.AnonymousClass8s2) r2
            java.lang.String r1 = r1.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r2 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2.A01(r3, r1, r2)
            X.4wG r1 = r4.A05
            X.67v r1 = X.C86114wI.A0T(r1)
            X.66x r0 = r0.A04
            X.C120957Dj.A01(r2, r0, r4, r1)
            goto L_0x01f2
        L_0x01b5:
            X.83g r0 = new X.83g
            r0.<init>(r11)
            java.util.List r0 = X.AnonymousClass00J.A0W(r10, r0)
            X.8s2 r1 = X.AnonymousClass7C0.A00(r0)
            X.67Y r0 = X.AnonymousClass67Y.Success
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r1 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2.A01(r0, r13, r1)
            X.67v r0 = X.C86114wI.A0T(r6)
            X.C120957Dj.A01(r1, r5, r4, r0)
            goto L_0x01f2
        L_0x01d0:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r1 = r0.A03
            java.lang.Object r1 = r1.A01
            java.lang.Iterable r1 = (java.lang.Iterable) r1
        L_0x01d6:
            X.7Dj r5 = r0.A05
            X.66x r3 = r0.A04
            X.C120957Dj.A00(r3, r5)
            X.8s2 r2 = X.AnonymousClass7C0.A00(r1)
            X.67Y r1 = X.AnonymousClass67Y.Success
            java.lang.String r0 = r4.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r1 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2.A01(r1, r0, r2)
            X.4wG r0 = r5.A05
            X.67v r0 = X.C86114wI.A0T(r0)
            X.C120957Dj.A01(r1, r3, r5, r0)
        L_0x01f2:
            kotlin.Unit r7 = kotlin.Unit.A00
            return r7
        L_0x01f5:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.onboarding.data.OnboardingFollowingTabbedRepository$handleNetworkRequest$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((OnboardingFollowingTabbedRepository$handleNetworkRequest$2) C86164wN.A0m(obj, this)).invokeSuspend(Unit.A00);
    }
}
