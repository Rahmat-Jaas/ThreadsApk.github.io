package com.instagram.comments.mvvm.data.network;

public final class MediaChildCommentNetworkFetcherKt {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2 r11, com.instagram.service.session.UserSession r12, X.C146958n9 r13) {
        /*
            r0 = 41
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r0, r13)
            if (r0 == 0) goto L_0x00b4
            r4 = r13
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b4
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r6 = 1
            r13 = 0
            if (r0 == 0) goto L_0x0057
            if (r0 != r6) goto L_0x00e1
            java.lang.Object r11 = r4.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2 r11 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2) r11
            X.AnonymousClass0OU.A00(r1)
        L_0x0029:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00d5
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r4 = r1.A00
            X.5u5 r4 = (X.AnonymousClass5u5) r4
            java.util.List r0 = r4.A05
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r3 = r0.iterator()
        L_0x003f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r1 = r3.next()
            X.9B1 r1 = (X.AnonymousClass9B1) r1
            java.lang.String r0 = r11.A03
            X.9S0 r0 = X.A5O.A00(r1, r0)
            if (r0 == 0) goto L_0x003f
            r2.add(r0)
            goto L_0x003f
        L_0x0057:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Object r8 = r11.A00
            int r0 = X.AnonymousClass0wJ.A04(r8)
            if (r0 == r13) goto L_0x00ad
            if (r0 != r6) goto L_0x00e9
            java.lang.Object r0 = r11.A01
            X.5IG r0 = (X.AnonymousClass5IG) r0
            boolean r1 = r0.A07
        L_0x006a:
            if (r1 == 0) goto L_0x00e6
            r5 = 2
            X.H1T r7 = X.AnonymousClass0wJ.A0P(r12)
            java.lang.String r2 = r11.A02
            java.lang.String r1 = r11.A03
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r1}
            java.lang.String r1 = "media/%s/comments/%s/inline_child_comments/"
            r7.A0T(r1, r2)
            java.lang.Class<X.5u5> r2 = X.AnonymousClass5u5.class
            java.lang.Class<X.70A> r1 = X.AnonymousClass70A.class
            r7.A0B(r2, r1)
            java.lang.Integer r1 = X.AnonymousClass006.A01
            if (r8 != r1) goto L_0x00a4
            java.lang.String r1 = r0.A04
            java.lang.String r0 = "max_id"
        L_0x008d:
            r7.A0P(r0, r1)
        L_0x0090:
            X.H8c r2 = r7.A02()
            r1 = 12
            r4.A01 = r11
            r4.A00 = r6
            r0 = 722993640(0x2b1801e8, float:5.4003893E-13)
            java.lang.Object r1 = X.C63623hv.A01(r2, r4, r0, r5, r1)
            if (r1 != r3) goto L_0x0029
            return r3
        L_0x00a4:
            java.lang.Integer r1 = X.AnonymousClass006.A00
            if (r8 != r1) goto L_0x0090
            java.lang.String r1 = r0.A05
            java.lang.String r0 = "min_id"
            goto L_0x008d
        L_0x00ad:
            java.lang.Object r0 = r11.A01
            X.5IG r0 = (X.AnonymousClass5IG) r0
            boolean r1 = r0.A06
            goto L_0x006a
        L_0x00b4:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2
            r4.<init>(r13)
            goto L_0x0016
        L_0x00bb:
            boolean r11 = r4.A07
            java.lang.String r7 = r4.A03
            int r9 = r4.A01
            boolean r12 = r4.A06
            java.lang.String r8 = r4.A04
            int r10 = r4.A00
            java.lang.Integer r5 = X.AnonymousClass006.A00
            X.5IG r4 = new X.5IG
            r6 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.5MD r3 = new X.5MD
            r3.<init>(r4, r2)
            return r3
        L_0x00d5:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00dc
            X.7pj r3 = X.C130307pj.A00
            return r3
        L_0x00dc:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00e6:
            X.7pk r3 = X.C130317pk.A00
            return r3
        L_0x00e9:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.MediaChildCommentNetworkFetcherKt.A00(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2, com.instagram.service.session.UserSession, X.8n9):java.lang.Object");
    }
}
