package com.instagram.barcelona.permalink.data;

import X.AnonymousClass0YY;
import X.C146958n9;
import X.C39142Kno;
import X.C86164wN;
import X.C963664o;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$handleNetworkRequest$2", f = "BarcelonaPermalinkRepository.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
public final class BarcelonaPermalinkRepository$handleNetworkRequest$2 extends C39142Kno implements AnonymousClass0YY {
    public int A00;
    public final /* synthetic */ C963664o A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BarcelonaPermalinkRepository$handleNetworkRequest$2(C963664o r2, C146958n9 r3, boolean z, boolean z2) {
        super(1, r3);
        this.A01 = r2;
        this.A02 = z;
        this.A03 = z2;
    }

    public final C146958n9 create(C146958n9 r5) {
        return new BarcelonaPermalinkRepository$handleNetworkRequest$2(this.A01, r5, this.A02, this.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r7 == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r12.A03 != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r6 = r9.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r9.ADi(r6, com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2.A01((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r6, (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) null, X.AnonymousClass006.A01, (java.util.List) null, 7)) == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        r0 = r8.A02;
        r1 = r8.A05;
        r12.A00 = 1;
        r6 = X.AnonymousClass0wJ.A0P(r0);
        r6.A0J("text_feed/{post_id}/replies/");
        r6.A0O("post_id", r1.split("[_@]")[0]);
        r6.A0P(X.I17.A00(291), r7);
        r6.A0B(X.AnonymousClass5tA.class, X.C117446yh.class);
        r13 = X.C63623hv.A00(X.C86134wK.A0W(r6, "text_feed/{post_id}/replies/"), r12, 104842234, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0093, code lost:
        if (r13 != r5) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0095, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r12.A00
            r4 = 1
            if (r0 == 0) goto L_0x001f
            X.AnonymousClass0OU.A00(r13)
        L_0x000a:
            X.3b6 r13 = (X.C62903b6) r13
            boolean r0 = r13 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00cd
            X.1jA r13 = (X.AnonymousClass1jA) r13
            java.lang.Object r0 = r13.A00
            X.5tA r0 = (X.AnonymousClass5tA) r0
            X.6mT r7 = r0.A02
            if (r7 != 0) goto L_0x0096
            X.C18250wR.A0m()
            r0 = 0
            throw r0
        L_0x001f:
            X.AnonymousClass0OU.A00(r13)
            X.64o r8 = r12.A01
            boolean r1 = r12.A02
            r7 = 0
            X.4wE r9 = r8.A07
            java.lang.Object r0 = r9.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r0
            java.lang.Object r0 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r0
            if (r1 == 0) goto L_0x0041
            if (r0 == 0) goto L_0x003b
            java.lang.String r7 = r0.A01
        L_0x0039:
            if (r7 != 0) goto L_0x0046
        L_0x003b:
            boolean r0 = r12.A03
            if (r0 != 0) goto L_0x0046
            goto L_0x012e
        L_0x0041:
            if (r0 == 0) goto L_0x003b
            java.lang.String r7 = r0.A02
            goto L_0x0039
        L_0x0046:
            java.lang.Object r6 = r9.getValue()
            r3 = r6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r3
            r2 = 0
            java.lang.Integer r1 = X.AnonymousClass006.A01
            r0 = 7
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2.A01(r3, r2, r1, r2, r0)
            boolean r0 = r9.ADi(r6, r0)
            if (r0 == 0) goto L_0x0046
            com.instagram.service.session.UserSession r0 = r8.A02
            java.lang.String r1 = r8.A05
            r12.A00 = r4
            X.H1T r6 = X.AnonymousClass0wJ.A0P(r0)
            java.lang.String r3 = "text_feed/{post_id}/replies/"
            r6.A0J(r3)
            java.lang.String r0 = "[_@]"
            java.lang.String[] r0 = r1.split(r0)
            r2 = 0
            r1 = r0[r2]
            java.lang.String r0 = "post_id"
            r6.A0O(r0, r1)
            r0 = 291(0x123, float:4.08E-43)
            java.lang.String r0 = X.I17.A00(r0)
            r6.A0P(r0, r7)
            java.lang.Class<X.5tA> r1 = X.AnonymousClass5tA.class
            java.lang.Class<X.6yh> r0 = X.C117446yh.class
            r6.A0B(r1, r0)
            X.H8c r1 = X.C86134wK.A0W(r6, r3)
            r0 = 104842234(0x63fc3fa, float:3.6067088E-35)
            java.lang.Object r13 = X.C63623hv.A00(r1, r12, r0, r2)
            if (r13 != r5) goto L_0x000a
            return r5
        L_0x0096:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3210000_I2 r0 = r7.A01
            r11 = 0
            if (r0 == 0) goto L_0x00cb
            X.5HQ r2 = X.AnonymousClass6O2.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A00
            X.5I1 r1 = new X.5I1
            r1.<init>(r2, r0)
        L_0x00a6:
            java.util.List r0 = r7.A04
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x00b0:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r0 = r6.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3210000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3210000_I2) r0
            X.5HQ r5 = X.AnonymousClass6O2.A00(r0)
            java.lang.Integer r3 = X.AnonymousClass006.A01
            X.5I1 r0 = new X.5I1
            r0.<init>(r5, r3)
            r2.add(r0)
            goto L_0x00b0
        L_0x00cb:
            r1 = r11
            goto L_0x00a6
        L_0x00cd:
            boolean r0 = r13 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x012e
            X.64o r0 = r12.A01
            X.4wE r5 = r0.A07
        L_0x00d5:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r3
            r2 = 0
            java.lang.Integer r1 = X.AnonymousClass006.A0N
            r0 = 7
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2.A01(r3, r2, r1, r2, r0)
            boolean r0 = r5.ADi(r4, r0)
            if (r0 == 0) goto L_0x00d5
            goto L_0x012e
        L_0x00eb:
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x0131
            java.util.List r0 = X.C18180wK.A0n(r1)
            java.util.List r9 = X.AnonymousClass00J.A0V(r2, r0)
            X.64o r0 = r12.A01
            X.4wE r6 = r0.A07
        L_0x00fb:
            java.lang.Object r8 = r6.getValue()
            java.util.List r5 = X.AnonymousClass00J.A0K(r9)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r0 = r7.A00
            java.lang.String r3 = r0.A01
            java.lang.String r2 = r0.A00
            boolean r0 = r7.A05
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 14
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r4 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2
            r4.<init>((java.lang.Boolean) r1, (java.lang.String) r3, (java.lang.String) r2, (int) r0)
            java.lang.String r3 = r7.A03
            java.lang.String r1 = r7.A02
            r0 = 15
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2
            r2.<init>(r3, r1, r0)
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2
            r0.<init>((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2) r2, (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r4, (java.lang.Integer) r1, (java.util.List) r5)
            boolean r0 = r6.ADi(r8, r0)
            if (r0 == 0) goto L_0x00fb
        L_0x012e:
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        L_0x0131:
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x01fd
            X.64o r0 = r12.A01
            X.4wE r3 = r0.A07
            java.lang.Object r0 = r3.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r0
            java.lang.Object r0 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r0
            if (r0 == 0) goto L_0x01e6
            java.lang.Object r0 = r0.A00
            boolean r0 = X.C18190wL.A1Z(r0, r4)
            if (r0 == 0) goto L_0x01e6
            boolean r0 = X.C18190wL.A1a(r2)
            if (r0 == 0) goto L_0x01e6
            java.lang.Object r0 = r3.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r0
            java.lang.Object r0 = r0.A01
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x01e6
            java.lang.Object r0 = r3.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r0
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = X.AnonymousClass00J.A0E(r0)
            X.5I1 r1 = (X.AnonymousClass5I1) r1
            java.lang.Object r0 = r3.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r0
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            java.util.List r8 = X.AnonymousClass00J.A0Y(r0, r4)
            java.lang.Object r9 = X.AnonymousClass00J.A0C(r2)
            X.5I1 r9 = (X.AnonymousClass5I1) r9
            java.util.List r6 = X.AnonymousClass00J.A0P(r2, r4)
            X.5HQ r2 = r9.A00
            X.5HQ r0 = r1.A00
            java.util.List r1 = r0.A03
            java.util.List r0 = r2.A03
            java.util.List r5 = X.AnonymousClass00J.A0V(r0, r1)
            java.lang.String r4 = r2.A02
            java.lang.String r1 = r2.A01
            com.instagram.api.schemas.ThreadContainerType r0 = r2.A00
            X.5HQ r2 = new X.5HQ
            r2.<init>(r0, r4, r1, r5)
            java.lang.Integer r1 = r9.A01
            X.5I1 r0 = new X.5I1
            r0.<init>(r2, r1)
            java.util.List r0 = X.AnonymousClass00J.A0X(r0, r8)
            java.util.List r10 = X.AnonymousClass00J.A0V(r6, r0)
        L_0x01b1:
            java.lang.Object r8 = r3.getValue()
            r9 = r8
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r9 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r9
            java.util.List r6 = X.AnonymousClass00J.A0K(r10)
            java.lang.Object r0 = r9.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r0
            if (r0 == 0) goto L_0x01e4
            java.lang.String r5 = r0.A02
        L_0x01c4:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r0 = r7.A00
            java.lang.String r4 = r0.A00
            boolean r0 = r7.A05
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 14
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2
            r2.<init>((java.lang.Boolean) r1, (java.lang.String) r5, (java.lang.String) r4, (int) r0)
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            r0 = 4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2.A01(r9, r2, r1, r6, r0)
            boolean r0 = r3.ADi(r8, r0)
            if (r0 == 0) goto L_0x01b1
            goto L_0x012e
        L_0x01e4:
            r5 = r11
            goto L_0x01c4
        L_0x01e6:
            java.util.List r0 = X.C18180wK.A0n(r1)
            java.util.List r1 = X.AnonymousClass00J.A0V(r2, r0)
            java.lang.Object r0 = r3.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r0
            java.lang.Object r0 = r0.A01
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r10 = X.AnonymousClass00J.A0V(r1, r0)
            goto L_0x01b1
        L_0x01fd:
            java.util.List r0 = X.C18180wK.A0n(r1)
            java.util.List r1 = X.AnonymousClass00J.A0V(r2, r0)
            X.64o r0 = r12.A01
            X.4wE r8 = r0.A07
            java.lang.Object r0 = r8.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r0
            java.lang.Object r0 = r0.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r10 = X.AnonymousClass00J.A0V(r0, r1)
        L_0x0217:
            java.lang.Object r9 = r8.getValue()
            r6 = r9
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r6
            java.util.List r5 = X.AnonymousClass00J.A0K(r10)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r0 = r7.A00
            java.lang.String r4 = r0.A01
            java.lang.Object r0 = r6.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r0
            if (r0 == 0) goto L_0x0248
            java.lang.String r3 = r0.A01
            java.lang.Object r1 = r0.A00
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L_0x0232:
            r0 = 14
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2
            r2.<init>((java.lang.Boolean) r1, (java.lang.String) r4, (java.lang.String) r3, (int) r0)
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            r0 = 4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2.A01(r6, r2, r1, r5, r0)
            boolean r0 = r8.ADi(r9, r0)
            if (r0 == 0) goto L_0x0217
            goto L_0x012e
        L_0x0248:
            r3 = r11
            r1 = r11
            goto L_0x0232
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$handleNetworkRequest$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((BarcelonaPermalinkRepository$handleNetworkRequest$2) C86164wN.A0m(obj, this)).invokeSuspend(Unit.A00);
    }
}
