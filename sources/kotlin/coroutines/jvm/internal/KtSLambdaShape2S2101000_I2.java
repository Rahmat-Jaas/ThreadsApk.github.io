package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YY;
import X.C146958n9;
import X.C39142Kno;
import X.C86164wN;
import kotlin.Unit;

public class KtSLambdaShape2S2101000_I2 extends C39142Kno implements AnonymousClass0YY {
    public int A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape2S2101000_I2(Object obj, String str, String str2, C146958n9 r5, int i) {
        super(1, r5);
        this.A04 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }

    public final C146958n9 create(C146958n9 r7) {
        String str;
        String str2;
        int i;
        int i2 = this.A04;
        Object obj = this.A01;
        C146958n9 r4 = r7;
        switch (i2) {
            case 0:
                str = this.A02;
                str2 = this.A03;
                i = 0;
                break;
            case 1:
                str2 = this.A03;
                str = this.A02;
                i = 1;
                break;
            default:
                str = this.A02;
                str2 = this.A03;
                i = 2;
                break;
        }
        return new KtSLambdaShape2S2101000_I2(obj, str, str2, r4, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f2, code lost:
        if ((r14 instanceof X.AnonymousClass1jB) != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x023b, code lost:
        X.C18250wR.A0m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x023f, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.A04
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0119;
                default: goto L_0x0007;
            }
        L_0x0007:
            int r1 = r13.A00
            r0 = 1
            if (r1 == 0) goto L_0x0012
            X.AnonymousClass0OU.A00(r14)
        L_0x000f:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x0012:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r4 = r13.A01
            com.instagram.barcelona.profile.followinggraph.data.FollowerListDataSource r4 = (com.instagram.barcelona.profile.followinggraph.data.FollowerListDataSource) r4
            java.lang.String r3 = r13.A02
            java.lang.String r1 = r13.A03
            r13.A00 = r0
            r0 = 0
            java.lang.Object r0 = com.instagram.barcelona.profile.followinggraph.data.FollowerListDataSource.A00(r4, r3, r1, r13, r0)
            if (r0 != r2) goto L_0x000f
            return r2
        L_0x0027:
            int r0 = r13.A00
            r7 = 1
            if (r0 == 0) goto L_0x0065
            X.AnonymousClass0OU.A00(r14)
        L_0x002f:
            X.3b6 r14 = (X.C62903b6) r14
            boolean r0 = r14 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00f0
            X.1jA r14 = (X.AnonymousClass1jA) r14
            java.lang.Object r0 = r14.A00
            X.5sp r0 = (X.C93895sp) r0
            X.6dF r0 = r0.A01
            if (r0 == 0) goto L_0x023b
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3210000_I2 r0 = r0.A00
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r0 = r0.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x00f4
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0051:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r0 = r1.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1420000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1420000_I2) r0
            X.5IF r0 = X.AnonymousClass6O3.A00(r0)
            r8.add(r0)
            goto L_0x0051
        L_0x0065:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r8 = r13.A01
            X.64o r8 = (X.C963664o) r8
            X.4wE r5 = r8.A07
            java.lang.String r9 = r13.A02
        L_0x0070:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r3
            r1 = 0
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            java.util.List r0 = X.C963664o.A00(r8, r9, r0, r7)
            r6 = 14
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2.A01(r3, r1, r1, r0, r6)
            boolean r0 = r5.ADi(r4, r0)
            if (r0 == 0) goto L_0x0070
            com.instagram.service.session.UserSession r0 = r8.A02
            java.lang.String r8 = r13.A03
            r13.A00 = r7
            X.H1T r7 = X.AnonymousClass0wJ.A0P(r0)
            java.lang.String r5 = "text_feed/{post_id}/inline_replies/"
            r7.A0J(r5)
            java.lang.String r4 = "[_@]"
            java.lang.String[] r0 = r9.split(r4)
            r3 = 0
            r1 = r0[r3]
            java.lang.String r0 = "post_id"
            r7.A0O(r0, r1)
            java.lang.String[] r0 = r8.split(r4)
            r1 = r0[r3]
            java.lang.String r0 = "permalink_post_id"
            r7.A0O(r0, r1)
            java.lang.Class<X.5sp> r1 = X.C93895sp.class
            java.lang.Class<X.6yg> r0 = X.C117436yg.class
            r7.A0B(r1, r0)
            X.H8c r1 = X.C86134wK.A0W(r7, r5)
            r0 = 104842234(0x63fc3fa, float:3.6067088E-35)
            java.lang.Object r14 = X.C63623hv.A01(r1, r13, r0, r3, r6)
            if (r14 != r2) goto L_0x002f
            return r2
        L_0x00c7:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x00f4
            java.lang.Object r7 = r13.A01
            X.64o r7 = (X.C963664o) r7
            X.4wE r6 = r7.A07
            java.lang.String r5 = r13.A02
        L_0x00d5:
            java.lang.Object r4 = r6.getValue()
            r3 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r3
            r0 = 0
            java.util.List r2 = X.C963664o.A00(r7, r5, r8, r0)
            r1 = 0
            r0 = 14
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2.A01(r3, r1, r1, r2, r0)
            boolean r0 = r6.ADi(r4, r0)
            if (r0 == 0) goto L_0x00d5
            goto L_0x000f
        L_0x00f0:
            boolean r0 = r14 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x000f
        L_0x00f4:
            java.lang.Object r7 = r13.A01
            X.64o r7 = (X.C963664o) r7
            java.lang.String r6 = r13.A02
            X.4wE r5 = r7.A07
        L_0x00fc:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r3
            r2 = 0
            r1 = 0
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            java.util.List r1 = X.C963664o.A00(r7, r6, r0, r1)
            r0 = 14
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2.A01(r3, r2, r2, r1, r0)
            boolean r0 = r5.ADi(r4, r0)
            if (r0 == 0) goto L_0x00fc
            goto L_0x000f
        L_0x0119:
            int r0 = r13.A00
            r5 = 1
            if (r0 == 0) goto L_0x0156
            X.AnonymousClass0OU.A00(r14)
        L_0x0121:
            X.3b6 r14 = (X.C62903b6) r14
            boolean r0 = r14 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0216
            X.1jA r14 = (X.AnonymousClass1jA) r14
            java.lang.Object r0 = r14.A00
            X.5t2 r0 = (X.AnonymousClass5t2) r0
            X.6jN r7 = r0.A00
            if (r7 == 0) goto L_0x023b
            java.util.List r0 = r7.A01
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r0.iterator()
        L_0x013b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0185
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3210000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3210000_I2) r0
            java.lang.Object r0 = r0.A00
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x013b
            r6.add(r1)
            goto L_0x013b
        L_0x0156:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r4 = r13.A01
            com.instagram.barcelona.profile.data.ProfileFeedDataSource r4 = (com.instagram.barcelona.profile.data.ProfileFeedDataSource) r4
            X.4wE r3 = r4.A09
        L_0x015f:
            java.lang.Object r1 = r3.getValue()
            r6 = r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r6
            r7 = 0
            java.lang.Integer r8 = X.AnonymousClass006.A0C
            r12 = 0
            r11 = 29
            r9 = r7
            r10 = r7
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2.A00(r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = r3.ADi(r1, r0)
            if (r0 == 0) goto L_0x015f
            java.lang.String r1 = r13.A03
            java.lang.String r0 = r13.A02
            r13.A00 = r5
            java.lang.Object r14 = com.instagram.barcelona.profile.data.ProfileFeedDataSource.A00(r4, r1, r0, r13)
            if (r14 != r2) goto L_0x0121
            return r2
        L_0x0185:
            java.lang.Object r3 = r13.A01
            com.instagram.barcelona.profile.data.ProfileFeedDataSource r3 = (com.instagram.barcelona.profile.data.ProfileFeedDataSource) r3
            X.4wE r5 = r3.A08
        L_0x018b:
            java.lang.Object r8 = r5.getValue()
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0w(r6)
            java.util.Iterator r4 = r6.iterator()
        L_0x019a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01b9
            java.lang.Object r1 = r4.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3210000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3210000_I2) r1
            java.lang.Integer r2 = X.AnonymousClass006.A00
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.5HQ r1 = X.AnonymousClass6O2.A00(r1)
            X.5I1 r0 = new X.5I1
            r0.<init>(r1, r2)
            r9.add(r0)
            goto L_0x019a
        L_0x01b9:
            java.util.List r0 = X.AnonymousClass00J.A0V(r9, r10)
            java.util.HashSet r4 = X.C18200wM.A0u()
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r9 = r0.iterator()
        L_0x01c9:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01ea
            java.lang.Object r1 = r9.next()
            r0 = r1
            X.5I1 r0 = (X.AnonymousClass5I1) r0
            X.5HQ r0 = r0.A00
            java.util.List r0 = r0.A03
            java.lang.Object r0 = X.AnonymousClass00J.A0C(r0)
            X.5IF r0 = (X.AnonymousClass5IF) r0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape6S0100000_I2 r0 = r0.A00
            java.lang.String r0 = r0.A01()
            X.C86164wN.A1G(r0, r1, r4, r2)
            goto L_0x01c9
        L_0x01ea:
            boolean r0 = r5.ADi(r8, r2)
            if (r0 == 0) goto L_0x018b
            java.lang.String r0 = r7.A00
            r3.A00 = r0
            X.4wE r2 = r3.A09
        L_0x01f6:
            java.lang.Object r1 = r2.getValue()
            r4 = r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r4
            r5 = 0
            java.lang.Integer r6 = X.AnonymousClass006.A00
            java.lang.String r0 = r3.A00
            boolean r10 = X.C18220wO.A1U(r0)
            r9 = 21
            r7 = r5
            r8 = r5
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2.A00(r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x01f6
            goto L_0x000f
        L_0x0216:
            boolean r0 = r14 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x000f
            java.lang.Object r0 = r13.A01
            com.instagram.barcelona.profile.data.ProfileFeedDataSource r0 = (com.instagram.barcelona.profile.data.ProfileFeedDataSource) r0
            X.4wE r2 = r0.A09
        L_0x0220:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r3
            r4 = 0
            java.lang.Integer r5 = X.AnonymousClass006.A0N
            r9 = 0
            r8 = 29
            r6 = r4
            r7 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2.A00(r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x0220
            goto L_0x000f
        L_0x023b:
            X.C18250wR.A0m()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape2S2101000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((KtSLambdaShape2S2101000_I2) C86164wN.A0m(obj, this)).invokeSuspend(Unit.A00);
    }
}
