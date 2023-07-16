package com.instagram.share.facebook.upsell.api;

public final class CLNoticeApi {
    public static final CLNoticeApi A00 = new CLNoticeApi();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: X.2AC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: X.2AC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: X.2AC} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass2AC r31, X.AnonymousClass29W r32, X.AnonymousClass2AD r33, com.instagram.service.session.UserSession r34, X.C146958n9 r35) {
        /*
            r30 = this;
            r29 = r31
            r11 = r33
            r8 = 3
            r3 = r35
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2.A00(r8, r3)
            if (r0 == 0) goto L_0x01c4
            r7 = r3
            kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01c4
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x001b:
            java.lang.Object r9 = r7.A07
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A00
            r5 = 1
            java.lang.String r16 = " + "
            if (r0 == 0) goto L_0x00e8
            if (r0 != r5) goto L_0x01d2
            java.lang.Object r4 = r7.A06
            com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository r4 = (com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository) r4
            java.lang.Object r3 = r7.A05
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r7.A04
            X.3VY r2 = (X.AnonymousClass3VY) r2
            java.lang.Object r1 = r7.A03
            java.lang.Object r11 = r7.A02
            java.lang.Object r0 = r7.A01
            r29 = r0
            X.AnonymousClass0OU.A00(r9)
        L_0x003f:
            X.3b6 r9 = (X.C62903b6) r9
            boolean r0 = r9 instanceof X.AnonymousClass1jA
            java.lang.String r6 = "VIEW"
            if (r0 == 0) goto L_0x00df
            java.lang.Object r9 = X.C62903b6.A06(r9)
            com.facebook.pando.TreeJNI r9 = (com.facebook.pando.TreeJNI) r9
            if (r9 == 0) goto L_0x005e
            java.lang.Class<com.instagram.share.facebook.graphql.RecordCXPNoticeInteractionMutationResponseImpl$XcxpRecordNoticeInteraction> r7 = com.instagram.share.facebook.graphql.RecordCXPNoticeInteractionMutationResponseImpl.XcxpRecordNoticeInteraction.class
            java.lang.String r0 = "xcxp_record_notice_interaction(params:$params)"
            com.facebook.pando.TreeJNI r7 = r9.getTreeValue(r0, r7)
            if (r7 == 0) goto L_0x005e
            java.lang.String r0 = "strong_id__"
            r7.getStringValue(r0)
        L_0x005e:
            boolean r0 = X.C04220Ms.A0I(r1, r6)
            if (r0 == 0) goto L_0x0091
            X.25p r0 = X.C313425p.A0O
            java.lang.Enum r10 = com.facebook.graphql.enums.EnumHelper.A00(r3, r0)
            X.25p r10 = (X.C313425p) r10
            X.C04220Ms.A06(r10)
            X.3Ee r12 = r4.A02
            X.16c r0 = r4.A00(r10)
            int r9 = r0.A01
            int r7 = r0.A00
            int r3 = r0.A02
            X.16c r0 = new X.16c
            r0.<init>(r9, r7, r3, r5)
            java.lang.String r5 = X.AnonymousClass3P4.A00(r0)
            android.content.SharedPreferences r0 = r12.A00
            android.content.SharedPreferences$Editor r3 = r0.edit()
            java.lang.String r0 = r10.toString()
            X.C18180wK.A0v(r3, r0, r5)
        L_0x0091:
            r0 = 2
            r2.A03(r0)
            X.1jA r9 = X.C62903b6.A03()
        L_0x0099:
            boolean r0 = r9 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x00dc
            boolean r0 = r9 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x01cd
            X.1jB r9 = (X.AnonymousClass1jB) r9
            java.lang.Object r9 = r9.A00
            java.lang.String r7 = "CLNoticeApi"
            java.lang.StringBuilder r3 = X.C18200wM.A0r()
            r0 = r29
            r3.append(r0)
            r0 = r16
            r3.append(r0)
            r3.append(r11)
            java.lang.String r0 = ": syncing user interaction state failed."
            java.lang.String r5 = X.C18180wK.A0i(r0, r3)
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[]{r9}
            X.AnonymousClass0LU.A0N(r7, r5, r0)
            r2.A03(r8)
            boolean r0 = X.C04220Ms.A0I(r1, r6)
            if (r0 == 0) goto L_0x00dc
            X.3Ee r0 = r4.A02
            android.content.SharedPreferences r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "has_synced_notice_states"
            X.AnonymousClass0wJ.A13(r1, r0, r3)
        L_0x00dc:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        L_0x00df:
            boolean r0 = r9 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0099
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00e8:
            X.AnonymousClass0OU.A00(r9)
            r0 = 0
            r1 = r32
            int r1 = X.C18230wP.A04(r1, r0)
            if (r1 == r0) goto L_0x0135
            if (r1 == r5) goto L_0x0132
            r0 = 2
            if (r1 != r0) goto L_0x00dc
            java.lang.String r1 = "DECLINE"
        L_0x00fb:
            r3 = 479862200(0x1c9a1db8, float:1.0198547E-21)
            X.3VY r2 = new X.3VY
            r28 = r34
            r0 = r28
            r2.<init>(r0, r3)
            java.lang.String r15 = r29.toString()
            java.lang.String r14 = r11.toString()
            r0 = 0
            r13 = 4
            X.AnonymousClass3VY.A00(r2, r15, r14, r0, r13)
            java.lang.String r12 = X.C61843Wa.A01(r29)
            java.lang.String r3 = X.C61843Wa.A02(r11)
            java.lang.String r4 = "failure_reason"
            if (r12 != 0) goto L_0x0129
            java.lang.String r0 = "unmapped_entrypoint"
        L_0x0122:
            r2.A02(r4, r0)
            r2.A03(r8)
            goto L_0x00dc
        L_0x0129:
            if (r3 != 0) goto L_0x0138
            java.lang.String r1 = "unmapped_variant:"
            java.lang.String r0 = X.AnonymousClass0wJ.A0t(r1, r0)
            goto L_0x0122
        L_0x0132:
            java.lang.String r1 = "ACCEPT"
            goto L_0x00fb
        L_0x0135:
            java.lang.String r1 = "VIEW"
            goto L_0x00fb
        L_0x0138:
            java.lang.Integer r10 = X.AnonymousClass006.A00
            com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository r4 = new com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository
            r9 = r28
            r4.<init>(r9, r10)
            X.AnonymousClass3VY.A00(r2, r15, r14, r0, r13)
            r9 = r29
            r7.A01 = r9
            r7.A02 = r11
            r7.A03 = r1
            r7.A04 = r2
            r7.A05 = r3
            r7.A06 = r4
            r7.A00 = r5
            java.lang.String r9 = "VIEW"
            boolean r9 = r1.equals(r9)
            if (r9 == 0) goto L_0x0169
            X.3FA r9 = X.C49382rI.A00(r28)
            X.4nV r9 = r9.A01
            X.41a r9 = (X.C679041a) r9
            X.MUg r9 = r9.A00
            r9.clear()
        L_0x0169:
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r13 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            long r9 = X.C18190wL.A07()
            int r14 = (int) r9
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r14)
            java.lang.String r9 = "interaction_time"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r13, r10, r9)
            java.lang.String r9 = "interaction_type"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r13, r1, r9)
            java.lang.String r9 = "entrypoint"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r13, r12, r9)
            java.lang.String r9 = "variant"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r13, r3, r9)
            X.3zb r12 = X.C67463zb.A00()
            X.3zb r10 = X.C67463zb.A00()
            java.lang.String r9 = "params"
            r12.A02(r13, r9)
            X.8l9 r18 = X.C63233h2.A04(r5)
            java.util.Map r20 = com.facebook.graphql.calls.GraphQlCallInput.A03(r12)
            java.util.Map r21 = com.facebook.graphql.calls.GraphQlCallInput.A03(r10)
            java.lang.Class<com.instagram.share.facebook.graphql.RecordCXPNoticeInteractionMutationResponseImpl> r22 = com.instagram.share.facebook.graphql.RecordCXPNoticeInteractionMutationResponseImpl.class
            java.lang.String r19 = "RecordCXPNoticeInteractionMutation"
            r25 = 0
            java.lang.String r27 = "xcxp_record_notice_interaction"
            com.facebook.pando.PandoGraphQLRequest r9 = new com.facebook.pando.PandoGraphQLRequest
            r23 = r5
            r24 = r0
            r26 = r0
            r17 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.Grx r0 = X.AnonymousClass3WK.A01(r28)
            java.lang.Object r9 = r0.A06(r9, r7)
            if (r9 != r6) goto L_0x003f
            return r6
        L_0x01c4:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2
            r0 = r30
            r7.<init>(r0, r3, r8)
            goto L_0x001b
        L_0x01cd:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x01d2:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.facebook.upsell.api.CLNoticeApi.A00(X.2AC, X.29W, X.2AD, com.instagram.service.session.UserSession, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.instagram.service.session.UserSession r6, X.AnonymousClass3VY r7, com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository r8, X.C146958n9 r9) {
        /*
            r5 = this;
            r3 = 9
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4.A00(r3, r9)
            if (r0 == 0) goto L_0x005d
            r4 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x004b
            if (r0 != r1) goto L_0x0063
            java.lang.Object r7 = r4.A01
            X.3VY r7 = (X.AnonymousClass3VY) r7
            X.AnonymousClass0OU.A00(r3)
        L_0x0028:
            boolean r0 = X.AnonymousClass0wJ.A1X(r3)
            if (r0 == 0) goto L_0x0040
            java.lang.String r2 = "notice_states_synced"
            boolean r0 = r7.A00
            if (r0 != 0) goto L_0x0043
            java.lang.String r1 = "CLNoticePerformanceLogger"
            java.lang.String r0 = "Marker not started."
            X.AnonymousClass0LU.A0C(r1, r0)
        L_0x003b:
            java.lang.String r0 = "is_notice_state_synced"
            r7.A01(r0)
        L_0x0040:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x0043:
            X.01V r1 = r7.A02
            int r0 = r7.A01
            r1.markerPoint(r0, r2)
            goto L_0x003b
        L_0x004b:
            X.AnonymousClass0OU.A00(r3)
            java.util.Map r0 = X.AnonymousClass3P3.A01(r6)
            r4.A01 = r7
            r4.A00 = r1
            java.lang.Object r3 = r8.A02(r0, r4)
            if (r3 != r2) goto L_0x0028
            return r2
        L_0x005d:
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4
            r4.<init>(r5, r9, r3)
            goto L_0x0016
        L_0x0063:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.facebook.upsell.api.CLNoticeApi.A02(com.instagram.service.session.UserSession, X.3VY, com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02b2 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r29, com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0060000_I2 r30, com.google.common.collect.ImmutableList r31, com.instagram.service.session.UserSession r32, X.AnonymousClass3VY r33, com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository r34, X.C146958n9 r35, long r36, boolean r38) {
        /*
            r28 = this;
            r11 = r35
            r10 = r32
            r15 = r29
            r5 = r36
            r0 = r31
            r1 = r33
            r2 = r30
            r9 = r38
            boolean r3 = r11 instanceof X.AnonymousClass4WS
            r14 = r28
            if (r3 == 0) goto L_0x02b3
            r8 = r11
            X.4WS r8 = (X.AnonymousClass4WS) r8
            int r7 = r8.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r7 & r4
            if (r3 == 0) goto L_0x02b3
            int r7 = r7 - r4
            r8.A00 = r7
        L_0x0024:
            java.lang.Object r12 = r8.A09
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r4 = r8.A00
            java.lang.String r11 = "result_source"
            r13 = 2
            r3 = 1
            if (r4 == 0) goto L_0x01b2
            if (r4 == r3) goto L_0x01d0
            if (r4 != r13) goto L_0x02bf
            boolean r9 = r8.A08
            java.lang.Object r4 = r8.A06
            X.0MJ r4 = (X.AnonymousClass0MJ) r4
            java.lang.Object r3 = r8.A05
            X.0MJ r3 = (X.AnonymousClass0MJ) r3
            java.lang.Object r2 = r8.A04
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0060000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0060000_I2) r2
            java.lang.Object r1 = r8.A03
            X.3VY r1 = (X.AnonymousClass3VY) r1
            java.lang.Object r0 = r8.A02
            com.google.common.collect.ImmutableList r0 = (com.google.common.collect.ImmutableList) r0
            X.AnonymousClass0OU.A00(r12)
        L_0x004d:
            X.3b6 r12 = (X.C62903b6) r12
            boolean r5 = r12 instanceof X.AnonymousClass1jA
            java.lang.String r7 = "failure_reason"
            if (r5 == 0) goto L_0x01a9
            X.1jA r12 = (X.AnonymousClass1jA) r12
            java.lang.Object r10 = r12.A00
            X.5z0 r10 = (X.AnonymousClass5z0) r10
            boolean r5 = r10.mFromDiskCache
            if (r5 == 0) goto L_0x01a5
            java.lang.String r5 = "from_disk"
        L_0x0061:
            r1.A02(r11, r5)
            java.lang.String r8 = "response_received"
            boolean r5 = r1.A00
            if (r5 != 0) goto L_0x019c
            java.lang.String r6 = "CLNoticePerformanceLogger"
            java.lang.String r5 = "Marker not started."
            X.AnonymousClass0LU.A0C(r6, r5)
        L_0x0071:
            java.lang.Object r8 = r10.A01
            com.facebook.pando.TreeJNI r8 = (com.facebook.pando.TreeJNI) r8
            if (r8 == 0) goto L_0x0191
            java.lang.Class<com.instagram.share.facebook.graphql.FetchCXPNoticesQueryResponseImpl$XcxpFetchNoticeUser> r6 = com.instagram.share.facebook.graphql.FetchCXPNoticesQueryResponseImpl.XcxpFetchNoticeUser.class
            java.lang.String r5 = "xcxp_fetch_notice_user"
            com.facebook.pando.TreeJNI r8 = r8.getTreeValue(r5, r6)
            if (r8 == 0) goto L_0x0191
            java.lang.Class<com.instagram.share.facebook.graphql.FetchCXPNoticesQueryResponseImpl$XcxpFetchNoticeUser$NoticeEligibility> r6 = com.instagram.share.facebook.graphql.FetchCXPNoticesQueryResponseImpl.XcxpFetchNoticeUser.NoticeEligibility.class
            java.lang.String r5 = "notice_eligibility(entrypoints:$entrypoints,metadata:$metadata)"
            com.google.common.collect.ImmutableList r5 = r8.getTreeList(r5, r6)
            if (r5 == 0) goto L_0x0191
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x00c1
            java.lang.String r2 = "CLNoticeApi"
            java.lang.String r0 = "The server's response is empty array."
            X.AnonymousClass0LU.A0B(r2, r0)
            java.lang.String r0 = "empty_server_response"
        L_0x009a:
            r1.A02(r7, r0)
        L_0x009d:
            X.1jA r12 = X.C62903b6.A03()
        L_0x00a1:
            boolean r0 = r12 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x00be
            boolean r0 = r12 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x02ba
            X.1jB r12 = (X.AnonymousClass1jB) r12
            java.lang.Object r0 = r12.A00
            java.lang.String r2 = r0.toString()
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            java.lang.String r0 = "error_returned:"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r2)
            r1.A02(r7, r0)
        L_0x00be:
            java.lang.Object r7 = r4.A00
            return r7
        L_0x00c1:
            java.util.ArrayList r14 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r13 = r0.iterator()
        L_0x00c9:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x0102
            java.lang.Object r11 = r13.next()
            boolean r6 = r5 instanceof java.util.Collection
            if (r6 == 0) goto L_0x00e1
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x00e1
        L_0x00dd:
            r14.add(r11)
            goto L_0x00c9
        L_0x00e1:
            java.util.Iterator r12 = r5.iterator()
        L_0x00e5:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L_0x00dd
            com.facebook.pando.TreeJNI r10 = X.C18210wN.A0G(r12)
            X.25d r8 = X.C313125d.A02
            java.lang.String r6 = "entrypoint"
            java.lang.Enum r6 = r10.getEnumValue(r6, r8)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            boolean r6 = X.C04220Ms.A0I(r6, r11)
            if (r6 == 0) goto L_0x00e5
            goto L_0x00c9
        L_0x0102:
            boolean r6 = X.C18250wR.A1K(r14)
            if (r6 == 0) goto L_0x0122
            java.lang.String r10 = "CLNoticeApi"
            java.lang.String r8 = "The server's response does not include the requested entrypoints: "
            r11 = 0
            r16 = 63
            r12 = r11
            r13 = r11
            r15 = r11
            java.lang.String r6 = X.AnonymousClass00J.A0H(r11, r12, r13, r14, r15, r16)
            java.lang.String r6 = X.AnonymousClass00U.A0L(r8, r6)
            X.AnonymousClass0LU.A0B(r10, r6)
            java.lang.String r6 = "missing_entrypoint_server_response"
            r1.A02(r7, r6)
        L_0x0122:
            if (r9 == 0) goto L_0x0156
            java.lang.Object r11 = r3.A00
            if (r11 == 0) goto L_0x0156
            X.3FA r11 = (X.AnonymousClass3FA) r11
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x0132
            r11.A00 = r2
        L_0x0132:
            java.util.Iterator r10 = r5.iterator()
        L_0x0136:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x0185
            com.facebook.pando.TreeJNI r9 = X.C18210wN.A0G(r10)
            X.4nV r8 = r11.A01
            X.25d r6 = X.C313125d.A02
            java.lang.String r5 = "entrypoint"
            java.lang.Enum r5 = r9.getEnumValue(r5, r6)
            java.lang.String r6 = java.lang.String.valueOf(r5)
            X.41a r8 = (X.C679041a) r8
            X.MUg r5 = r8.A00
            r5.put(r6, r9)
            goto L_0x0136
        L_0x0156:
            r0 = 10
            int r0 = X.C02260Al.A0z(r5, r0)
            int r0 = X.AnonymousClass4WK.A0L(r0)
            java.util.LinkedHashMap r8 = X.C18190wL.A0v(r0)
            java.util.Iterator r6 = r5.iterator()
        L_0x0168:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x018d
            java.lang.Object r5 = r6.next()
            r3 = r5
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            X.25d r2 = X.C313125d.A02
            java.lang.String r0 = "entrypoint"
            java.lang.Enum r0 = r3.getEnumValue(r0, r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.put(r0, r5)
            goto L_0x0168
        L_0x0185:
            java.lang.Object r3 = r3.A00
            X.3FA r3 = (X.AnonymousClass3FA) r3
            java.util.Map r8 = r3.A00(r2, r0)
        L_0x018d:
            r4.A00 = r8
            goto L_0x009d
        L_0x0191:
            java.lang.String r2 = "CLNoticeApi"
            java.lang.String r0 = "The server's response is null."
            X.AnonymousClass0LU.A0B(r2, r0)
            java.lang.String r0 = "null_server_response"
            goto L_0x009a
        L_0x019c:
            X.01V r6 = r1.A02
            int r5 = r1.A01
            r6.markerPoint(r5, r8)
            goto L_0x0071
        L_0x01a5:
            java.lang.String r5 = "from_network"
            goto L_0x0061
        L_0x01a9:
            boolean r0 = r12 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x00a1
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x01b2:
            X.AnonymousClass0OU.A00(r12)
            r8.A02 = r14
            r8.A03 = r10
            r8.A04 = r0
            r8.A05 = r15
            r8.A06 = r1
            r8.A07 = r2
            r8.A08 = r9
            r8.A01 = r5
            r8.A00 = r3
            r3 = r34
            java.lang.Object r3 = r14.A02(r10, r1, r3, r8)
            if (r3 != r7) goto L_0x01eb
            return r7
        L_0x01d0:
            long r5 = r8.A01
            boolean r9 = r8.A08
            java.lang.Object r2 = r8.A07
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0060000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0060000_I2) r2
            java.lang.Object r1 = r8.A06
            X.3VY r1 = (X.AnonymousClass3VY) r1
            java.lang.Object r15 = r8.A05
            com.facebook.graphql.calls.GraphQlCallInput r15 = (com.facebook.graphql.calls.GraphQlCallInput) r15
            java.lang.Object r0 = r8.A04
            com.google.common.collect.ImmutableList r0 = (com.google.common.collect.ImmutableList) r0
            java.lang.Object r10 = r8.A03
            com.instagram.service.session.UserSession r10 = (com.instagram.service.session.UserSession) r10
            X.AnonymousClass0OU.A00(r12)
        L_0x01eb:
            X.0MJ r3 = new X.0MJ
            r3.<init>()
            if (r9 == 0) goto L_0x0243
            X.3FA r6 = X.C49382rI.A00(r10)
            r3.A00 = r6
            r4 = 0
            X.C04220Ms.A0B(r0, r4)
            java.lang.Object r4 = r6.A00
            boolean r4 = X.C04220Ms.A0I(r4, r2)
            if (r4 == 0) goto L_0x0241
            boolean r4 = r0 instanceof java.util.Collection
            if (r4 == 0) goto L_0x021c
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x021c
        L_0x020e:
            java.lang.String r4 = "from_memory"
            r1.A02(r11, r4)
            java.lang.Object r1 = r3.A00
            X.3FA r1 = (X.AnonymousClass3FA) r1
            java.util.Map r7 = r1.A00(r2, r0)
            return r7
        L_0x021c:
            java.util.Iterator r14 = r0.iterator()
        L_0x0220:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x020e
            java.lang.Object r12 = r14.next()
            X.4nV r4 = r6.A01
            X.41a r4 = (X.C679041a) r4
            X.MUg r4 = r4.A00
            r12.getClass()
            int r5 = r4.A00(r12)
            X.MVr r4 = r4.A01(r5)
            java.lang.Object r4 = r4.A08(r12, r5)
            if (r4 != 0) goto L_0x0220
        L_0x0241:
            r5 = 0
        L_0x0243:
            X.0MJ r4 = new X.0MJ
            r4.<init>()
            X.4To r12 = X.AnonymousClass4To.A00()
            r4.A00 = r12
            r8.A02 = r0
            r8.A03 = r1
            r8.A04 = r2
            r8.A05 = r3
            r8.A06 = r4
            r17 = 0
            r12 = r17
            r8.A07 = r12
            r8.A08 = r9
            r8.A00 = r13
            X.3zb r14 = X.C67463zb.A00()
            X.3zb r13 = X.C67463zb.A00()
            java.lang.String r12 = "entrypoints"
            r14.A06(r12, r0)
            boolean r16 = X.AnonymousClass0wJ.A1W(r0)
            java.lang.String r12 = "metadata"
            r13.A02(r15, r12)
            boolean r12 = X.AnonymousClass0wJ.A1W(r15)
            X.AnonymousClass7Ko.A0B(r16)
            X.8l9 r18 = X.C63233h2.A04(r12)
            java.util.Map r20 = com.facebook.graphql.calls.GraphQlCallInput.A03(r14)
            java.util.Map r21 = com.facebook.graphql.calls.GraphQlCallInput.A03(r13)
            java.lang.Class<com.instagram.share.facebook.graphql.FetchCXPNoticesQueryResponseImpl> r22 = com.instagram.share.facebook.graphql.FetchCXPNoticesQueryResponseImpl.class
            java.lang.String r19 = "FetchCXPNoticesQuery"
            r23 = 0
            java.lang.String r27 = "xcxp_fetch_notice_user"
            com.facebook.pando.PandoGraphQLRequest r12 = new com.facebook.pando.PandoGraphQLRequest
            r25 = r23
            r26 = r17
            r24 = r17
            r17 = r12
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.8mD r12 = r12.setFreshCacheAgeMs(r5)
            X.8mD r6 = r12.setMaxToleratedCacheAgeMs(r5)
            X.Grx r5 = X.AnonymousClass3WK.A01(r10)
            java.lang.Object r12 = r5.A06(r6, r8)
            if (r12 != r7) goto L_0x004d
            return r7
        L_0x02b3:
            X.4WS r8 = new X.4WS
            r8.<init>(r14, r11)
            goto L_0x0024
        L_0x02ba:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x02bf:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.facebook.upsell.api.CLNoticeApi.A01(com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000, com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0060000_I2, com.google.common.collect.ImmutableList, com.instagram.service.session.UserSession, X.3VY, com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository, X.8n9, long, boolean):java.lang.Object");
    }
}
