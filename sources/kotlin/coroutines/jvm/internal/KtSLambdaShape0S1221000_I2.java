package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import X.C884257z;
import X.C968466x;
import kotlin.Unit;

public class KtSLambdaShape0S1221000_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S1221000_I2(C884257z r2, C968466x r3, String str, C146958n9 r5, int i, boolean z, boolean z2) {
        super(2, r5);
        this.A06 = i;
        this.A05 = z;
        this.A02 = r2;
        this.A04 = z2;
        this.A03 = str;
        this.A01 = r3;
    }

    public final C146958n9 create(Object obj, C146958n9 r10) {
        int i;
        int i2 = this.A06;
        boolean z = this.A05;
        C884257z r1 = (C884257z) this.A02;
        boolean z2 = this.A04;
        String str = this.A03;
        C968466x r2 = (C968466x) this.A01;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new KtSLambdaShape0S1221000_I2(r1, r2, str, r10, i, z, z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            r3 = r20
            int r0 = r3.A00
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r4) goto L_0x0024
            X.AnonymousClass0OU.A00(r21)
        L_0x000f:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x0012:
            X.AnonymousClass0OU.A00(r21)
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x0027
            r0 = 200(0xc8, double:9.9E-322)
            r3.A00 = r4
            java.lang.Object r0 = X.AnonymousClass729.A01(r3, r0)
            if (r0 != r2) goto L_0x0027
            return r2
        L_0x0024:
            X.AnonymousClass0OU.A00(r21)
        L_0x0027:
            java.lang.Object r0 = r3.A02
            X.57z r0 = (X.C884257z) r0
            X.7Dj r9 = r0.A02
            boolean r12 = r3.A04
            java.lang.String r10 = r3.A03
            java.lang.Object r8 = r3.A01
            X.66x r8 = (X.C968466x) r8
            r3.A00 = r5
            if (r12 == 0) goto L_0x007f
            r14 = 0
            r18 = 7
            r19 = 4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r6 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2
            r13 = r6
            r15 = r14
            r16 = r14
            r17 = r14
            r13.<init>((X.AnonymousClass67Y) r14, (java.lang.String) r15, (kotlin.jvm.internal.DefaultConstructorMarker) r16, (X.AnonymousClass8s2) r17, (int) r18, (int) r19)
        L_0x0049:
            int r1 = r8.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0072
            if (r1 != r4) goto L_0x0084
            X.3V6 r4 = r9.A01
            X.4wG r0 = r9.A05
            java.lang.Object r0 = r0.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r0
            java.lang.Object r7 = r0.A02
        L_0x005e:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r7 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r7
            r11 = 0
            com.instagram.barcelona.onboarding.data.OnboardingFollowingTabbedRepository$handleNetworkRequest$2 r5 = new com.instagram.barcelona.onboarding.data.OnboardingFollowingTabbedRepository$handleNetworkRequest$2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            kotlin.Unit r1 = kotlin.Unit.A00
            java.lang.Object r0 = r4.A00(r1, r3, r5)
            if (r0 == r2) goto L_0x006f
            r0 = r1
        L_0x006f:
            if (r0 != r2) goto L_0x000f
            return r2
        L_0x0072:
            X.3V6 r4 = r9.A00
            X.4wG r0 = r9.A05
            java.lang.Object r0 = r0.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r0
            java.lang.Object r7 = r0.A01
            goto L_0x005e
        L_0x007f:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r6 = X.C120957Dj.A00(r8, r9)
            goto L_0x0049
        L_0x0084:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape0S1221000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape0S1221000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
