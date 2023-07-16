package com.instagram.barcelona.linkpreview.api;

public final class LinkFetchUtil {
    public static final LinkFetchUtil A00 = new LinkFetchUtil();

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.barcelona.linkpreview.api.LinkFetchUtil r16, com.instagram.service.session.UserSession r17, java.lang.String r18, X.C146958n9 r19, X.AnonymousClass0YY r20) {
        /*
            r9 = r18
            r3 = r20
            r4 = 28
            r5 = r19
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r4, r5)
            if (r0 == 0) goto L_0x0075
            r7 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0075
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x001c:
            java.lang.Object r1 = r7.A03
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x0047
            if (r0 != r5) goto L_0x00ca
            java.lang.Object r3 = r7.A02
            X.0YY r3 = (X.AnonymousClass0YY) r3
            java.lang.Object r9 = r7.A01
            java.lang.String r9 = (java.lang.String) r9
            X.AnonymousClass0OU.A00(r1)
        L_0x0032:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00b5
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r0 = r1.A00
            X.5t3 r0 = (X.AnonymousClass5t3) r0
            X.6ko r2 = r0.A02
            if (r2 != 0) goto L_0x007d
            X.C18250wR.A0m()
            r0 = 0
            throw r0
        L_0x0047:
            X.AnonymousClass0OU.A00(r1)
            X.C86124wJ.A1S(r9, r3, r7, r5)
            X.H1T r4 = X.AnonymousClass0wJ.A0P(r17)
            java.lang.String r2 = "text_feed/link_preview/"
            r4.A0J(r2)
            java.lang.String r0 = "url"
            r4.A0O(r0, r9)
            java.lang.Class<X.5t3> r1 = X.AnonymousClass5t3.class
            java.lang.Class<X.6yU> r0 = X.C117316yU.class
            r4.A0B(r1, r0)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r2, r9)
            X.H8c r2 = X.C86134wK.A0W(r4, r0)
            r1 = 991731(0xf21f3, float:1.389711E-39)
            r0 = 0
            java.lang.Object r1 = X.C63623hv.A00(r2, r7, r1, r0)
            if (r1 != r6) goto L_0x0032
            return r6
        L_0x0075:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r0 = r16
            r7.<init>(r0, r5, r4)
            goto L_0x001c
        L_0x007d:
            com.instagram.api.schemas.LinkType r13 = r2.A02
            com.instagram.api.schemas.LinkAttachmentDisallowedReason r12 = r2.A00
            X.BKU r1 = r2.A03
            com.instagram.api.schemas.LinkType r0 = com.instagram.api.schemas.LinkType.QUOTE
            if (r13 == r0) goto L_0x0088
            r5 = 0
        L_0x0088:
            r11 = 0
            r14 = r11
            if (r5 == 0) goto L_0x008d
            r14 = r1
        L_0x008d:
            X.5Ko r0 = r2.A01
            if (r0 == 0) goto L_0x00ab
            java.lang.String r5 = r0.A02
            com.instagram.common.typedurl.ImageUrl r4 = r0.A00
            com.instagram.common.typedurl.ImageUrl r2 = r0.A01
            java.lang.String r1 = r0.A03
            java.lang.String r0 = r0.A04
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3200000_I2 r11 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3200000_I2
            r15 = r11
            r17 = r2
            r18 = r5
            r19 = r1
            r20 = r0
            r16 = r4
            r15.<init>((com.instagram.common.typedurl.ImageUrl) r16, (com.instagram.common.typedurl.ImageUrl) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20)
        L_0x00ab:
            r16 = 0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1410000_I2 r4 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1410000_I2
            r10 = r4
            r15 = r9
            r10.<init>((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3200000_I2) r11, (com.instagram.api.schemas.LinkAttachmentDisallowedReason) r12, (com.instagram.api.schemas.LinkType) r13, (X.BKU) r14, (java.lang.String) r15, (boolean) r16)
            goto L_0x00c4
        L_0x00b5:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00c7
            com.instagram.api.schemas.LinkType r7 = com.instagram.api.schemas.LinkType.UNRECOGNIZED
            r10 = 0
            r5 = 0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1410000_I2 r4 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1410000_I2
            r6 = r5
            r8 = r5
            r4.<init>((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3200000_I2) r5, (com.instagram.api.schemas.LinkAttachmentDisallowedReason) r6, (com.instagram.api.schemas.LinkType) r7, (X.BKU) r8, (java.lang.String) r9, (boolean) r10)
        L_0x00c4:
            r3.invoke(r4)
        L_0x00c7:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        L_0x00ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.linkpreview.api.LinkFetchUtil.A00(com.instagram.barcelona.linkpreview.api.LinkFetchUtil, com.instagram.service.session.UserSession, java.lang.String, X.8n9, X.0YY):java.lang.Object");
    }
}
