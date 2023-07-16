package com.instagram.clips.midcard.util;

public final class ClipsMidcardValidDisplayModelUtil {
    public static final ClipsMidcardValidDisplayModelUtil A00 = new ClipsMidcardValidDisplayModelUtil();

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0163 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.content.Context r38, X.AnonymousClass5Ha r39, com.instagram.clips.midcard.util.ClipsMidcardValidDisplayModelUtil r40, com.instagram.service.session.UserSession r41, X.C146958n9 r42) {
        /*
            r10 = r38
            r1 = r40
            r6 = r39
            r3 = r41
            r11 = 1
            r7 = r42
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2.A00(r11, r7)
            if (r0 == 0) goto L_0x0164
            r5 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2) r5
            int r4 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L_0x0164
            int r4 = r4 - r2
            r5.A00 = r4
        L_0x001f:
            java.lang.Object r0 = r5.A07
            X.D0E r12 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r5.A00
            r4 = 4
            r8 = 3
            r9 = 2
            r13 = 0
            if (r2 == 0) goto L_0x0037
            if (r2 == r11) goto L_0x006f
            if (r2 == r9) goto L_0x00ab
            if (r2 == r8) goto L_0x00e1
            if (r2 != r4) goto L_0x016b
            X.AnonymousClass0OU.A00(r0)
        L_0x0036:
            return r13
        L_0x0037:
            X.AnonymousClass0OU.A00(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2500000_I2 r0 = r6.A02
            java.lang.Object r0 = r0.A03
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2) r0
            java.lang.Object r0 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2) r0
            java.lang.Object r0 = r0.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2) r0
            if (r0 == 0) goto L_0x006d
            java.lang.String r7 = r0.A01
        L_0x004c:
            android.content.Context r0 = X.C86154wM.A09(r10)
            android.app.Application r0 = (android.app.Application) r0
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r2 = X.AnonymousClass6PY.A00(r0, r3)
            if (r7 == 0) goto L_0x014f
            r5.A01 = r1
            r5.A02 = r6
            r5.A03 = r3
            r5.A04 = r10
            r5.A05 = r7
            r5.A06 = r2
            r5.A00 = r11
            java.lang.Object r0 = r2.A00(r7, r5)
            if (r0 != r12) goto L_0x008a
            return r12
        L_0x006d:
            r7 = r13
            goto L_0x004c
        L_0x006f:
            java.lang.Object r2 = r5.A06
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r2 = (com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository) r2
            java.lang.Object r7 = r5.A05
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r10 = r5.A04
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r3 = r5.A03
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            java.lang.Object r6 = r5.A02
            X.5Ha r6 = (X.AnonymousClass5Ha) r6
            java.lang.Object r1 = r5.A01
            com.instagram.clips.midcard.util.ClipsMidcardValidDisplayModelUtil r1 = (com.instagram.clips.midcard.util.ClipsMidcardValidDisplayModelUtil) r1
            X.AnonymousClass0OU.A00(r0)
        L_0x008a:
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x014f
            java.lang.Integer r0 = X.AnonymousClass006.A1L
            com.instagram.clips.drafts.model.validation.ClipsDraftValidator r0 = X.D6X.A00(r10, r3, r0)
            r5.A01 = r1
            r5.A02 = r6
            r5.A03 = r3
            r5.A04 = r7
            r5.A05 = r2
            r5.A06 = r13
            r5.A00 = r9
            java.lang.Object r0 = r0.A01(r7, r5)
            if (r0 != r12) goto L_0x00c2
            return r12
        L_0x00ab:
            java.lang.Object r2 = r5.A05
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r2 = (com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository) r2
            java.lang.Object r7 = r5.A04
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r3 = r5.A03
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            java.lang.Object r6 = r5.A02
            X.5Ha r6 = (X.AnonymousClass5Ha) r6
            java.lang.Object r1 = r5.A01
            com.instagram.clips.midcard.util.ClipsMidcardValidDisplayModelUtil r1 = (com.instagram.clips.midcard.util.ClipsMidcardValidDisplayModelUtil) r1
            X.AnonymousClass0OU.A00(r0)
        L_0x00c2:
            X.DZc r0 = (X.C24772DZc) r0
            java.util.List r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x014f
            r5.A01 = r1
            r5.A02 = r6
            r5.A03 = r3
            r5.A04 = r13
            r5.A05 = r13
            r5.A00 = r8
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r0 = r2.A01
            java.lang.Object r0 = r0.A0A(r7, r5)
            if (r0 != r12) goto L_0x00f0
            return r12
        L_0x00e1:
            java.lang.Object r3 = r5.A03
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            java.lang.Object r6 = r5.A02
            X.5Ha r6 = (X.AnonymousClass5Ha) r6
            java.lang.Object r1 = r5.A01
            com.instagram.clips.midcard.util.ClipsMidcardValidDisplayModelUtil r1 = (com.instagram.clips.midcard.util.ClipsMidcardValidDisplayModelUtil) r1
            X.AnonymousClass0OU.A00(r0)
        L_0x00f0:
            X.CKW r0 = (X.CKW) r0
            if (r0 == 0) goto L_0x014f
            X.CL9 r0 = r0.A04
            if (r0 == 0) goto L_0x014f
            java.lang.String r0 = r0.A0D
            if (r0 == 0) goto L_0x014f
            java.lang.String r5 = r6.A06
            java.lang.Integer r24 = X.AnonymousClass006.A03
            X.0ZV r34 = X.AnonymousClass0ZV.A00
            int r4 = r6.A00
            int r3 = r6.A01
            com.instagram.api.schemas.ClipsMidCardType r2 = r6.A04
            java.io.File r1 = X.C86144wL.A0Z(r0)
            r0 = -1
            com.instagram.common.typedurl.ImageUrl r21 = X.AnonymousClass3WG.A01(r1, r0, r0)
            r41 = 0
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r3)
            r40 = 364904432(0x15bffff0, float:7.7548084E-26)
            X.93a r12 = new X.93a
            r14 = r13
            r15 = r13
            r16 = r13
            r19 = r13
            r20 = r13
            r22 = r13
            r23 = r13
            r25 = r0
            r26 = r5
            r27 = r13
            r28 = r13
            r29 = r13
            r30 = r13
            r31 = r13
            r32 = r13
            r33 = r13
            r35 = r13
            r36 = r13
            r37 = r13
            r38 = r13
            r39 = r4
            r42 = r41
            r17 = r2
            r18 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return r12
        L_0x014f:
            r5.A01 = r13
            r5.A02 = r13
            r5.A03 = r13
            r5.A04 = r13
            r5.A05 = r13
            r5.A06 = r13
            r5.A00 = r4
            java.lang.Object r0 = A01(r6, r1, r3, r5)
            if (r0 != r12) goto L_0x0036
            return r12
        L_0x0164:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2
            r5.<init>(r1, r7, r11)
            goto L_0x001f
        L_0x016b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.midcard.util.ClipsMidcardValidDisplayModelUtil.A00(android.content.Context, X.5Ha, com.instagram.clips.midcard.util.ClipsMidcardValidDisplayModelUtil, com.instagram.service.session.UserSession, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.AnonymousClass5Ha r36, com.instagram.clips.midcard.util.ClipsMidcardValidDisplayModelUtil r37, com.instagram.service.session.UserSession r38, X.C146958n9 r39) {
        /*
            r3 = 31
            r4 = r39
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1.A00(r3, r4)
            if (r0 == 0) goto L_0x00cc
            r5 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00cc
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r5.A02
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r6 = 1
            if (r0 == 0) goto L_0x006b
            if (r0 != r6) goto L_0x00da
            X.AnonymousClass0OU.A00(r1)
        L_0x0026:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            r3 = 817892914(0x30c00e32, float:1.3973873E-9)
            if (r0 == 0) goto L_0x0062
            X.0on r2 = X.C10770iu.A00()
            java.lang.String r1 = "ClipsMidcardValidDisplayModelUtil"
            java.lang.String r0 = ": Write midcard seen state when draft data is invalid"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            X.0oo r0 = r2.ABJ(r0, r3)
            r0.report()
            X.1jA r1 = X.C62903b6.A03()
        L_0x0044:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x005f
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00d5
            X.0on r2 = X.C10770iu.A00()
            java.lang.String r1 = "ClipsMidcardValidDisplayModelUtil"
            java.lang.String r0 = ": Failed to write midcard seen state when draft data is invalid"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            X.0oo r0 = r2.ABJ(r0, r3)
            r0.report()
        L_0x005f:
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x0062:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0044
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x006b:
            X.AnonymousClass0OU.A00(r1)
            r13 = r36
            java.lang.String r3 = r13.A06
            java.lang.Integer r19 = X.AnonymousClass006.A03
            X.0ZV r29 = X.AnonymousClass0ZV.A00
            int r2 = r13.A00
            int r1 = r13.A01
            com.instagram.api.schemas.ClipsMidCardType r12 = r13.A04
            r36 = 0
            r8 = 0
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r35 = 901775344(0x35bffff0, float:1.4305097E-6)
            X.93a r7 = new X.93a
            r9 = r8
            r10 = r8
            r11 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r20 = r0
            r21 = r3
            r22 = r8
            r23 = r8
            r24 = r8
            r25 = r8
            r26 = r8
            r27 = r8
            r28 = r8
            r30 = r8
            r31 = r8
            r32 = r8
            r33 = r8
            r34 = r2
            r37 = r36
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r0 = r38
            X.H8c r3 = X.C18644Aix.A00(r7, r0)
            r2 = 2
            r1 = 12
            r5.A01 = r0
            r5.A00 = r6
            r0 = 575058749(0x2246b33d, float:2.6928892E-18)
            java.lang.Object r1 = X.C63623hv.A01(r3, r5, r0, r2, r1)
            if (r1 != r4) goto L_0x0026
            return r4
        L_0x00cc:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1
            r0 = r37
            r5.<init>(r0, r4, r3)
            goto L_0x0018
        L_0x00d5:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00da:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.midcard.util.ClipsMidcardValidDisplayModelUtil.A01(X.5Ha, com.instagram.clips.midcard.util.ClipsMidcardValidDisplayModelUtil, com.instagram.service.session.UserSession, X.8n9):java.lang.Object");
    }
}
