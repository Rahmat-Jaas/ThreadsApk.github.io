package com.instagram.share.facebook.upsell.data;

import X.AnonymousClass006;
import X.AnonymousClass2TZ;
import X.AnonymousClass3VY;
import X.C04220Ms;
import X.C134647y7;
import X.C18190wL;
import X.C18230wP;
import X.C27457Enn;
import X.C86074wE;
import X.C86094wG;
import X.DIV;
import android.content.Context;
import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository;

public final class CLNoticeRepository extends C134647y7 {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass3VY A02;
    public final CXPNoticeStateRepository A03;
    public final C86074wE A04;
    public final C86094wG A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CLNoticeRepository(Context context, UserSession userSession) {
        super("CXPNotices", AnonymousClass2TZ.A00(664689487));
        C04220Ms.A0B(context, 1);
        AnonymousClass3VY r3 = new AnonymousClass3VY(userSession, 479857365);
        CXPNoticeStateRepository cXPNoticeStateRepository = new CXPNoticeStateRepository(userSession, AnonymousClass006.A00);
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = cXPNoticeStateRepository;
        this.A00 = C18230wP.A09(context);
        C27457Enn A0z = C18190wL.A0z(DIV.A01);
        this.A04 = A0z;
        this.A05 = A0z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C146958n9 r19) {
        /*
            r18 = this;
            r3 = 10
            r5 = r19
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4.A00(r3, r5)
            r4 = r18
            if (r0 == 0) goto L_0x0155
            r14 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r14 = (kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4) r14
            int r2 = r14.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0155
            int r2 = r2 - r1
            r14.A00 = r2
        L_0x001a:
            java.lang.Object r5 = r14.A02
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r14.A00
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L_0x0115
            if (r0 != r2) goto L_0x015c
            java.lang.Object r4 = r14.A01
            com.instagram.share.facebook.upsell.data.CLNoticeRepository r4 = (com.instagram.share.facebook.upsell.data.CLNoticeRepository) r4
            X.AnonymousClass0OU.A00(r5)
        L_0x002d:
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r9 = "CLNoticeRepository"
            java.lang.String r6 = X.AnonymousClass31P.A00
            java.lang.Object r5 = r5.get(r6)
            com.instagram.share.facebook.graphql.FetchCXPNoticesQueryResponseImpl$XcxpFetchNoticeUser$NoticeEligibility r5 = (com.instagram.share.facebook.graphql.FetchCXPNoticesQueryResponseImpl.XcxpFetchNoticeUser.NoticeEligibility) r5
            r8 = 3
            if (r5 != 0) goto L_0x0066
            java.lang.String r0 = ": key doesn't exist in result"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r6, r0)
            X.AnonymousClass0LU.A0B(r9, r0)
            X.3VY r0 = r4.A02
            r0.A03(r8)
            X.4wE r4 = r4.A04
        L_0x004c:
            java.lang.Object r3 = r4.getValue()
            kotlin.Pair r0 = X.C18180wK.A0p(r6, r1)
            java.util.Map r2 = X.AnonymousClass4WK.A0O(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1100000_I2_1 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1100000_I2_1
            r0.<init>((java.lang.String) r1, (java.util.Map) r2)
            boolean r0 = r4.ADi(r3, r0)
            if (r0 == 0) goto L_0x004c
        L_0x0063:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x0066:
            com.instagram.service.session.UserSession r7 = r4.A01
            X.C49392rJ.A00(r7, r5)
            X.25p r2 = r5.A00()
            X.25p r0 = X.C313425p.A0F
            r3 = 2
            if (r2 != r0) goto L_0x00a2
            java.lang.String r0 = ": No available notice variant"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r6, r0)
            X.AnonymousClass0LU.A0B(r9, r0)
            X.3VY r0 = r4.A02
            r0.A03(r3)
            X.4wE r7 = r4.A04
        L_0x0084:
            java.lang.Object r4 = r7.getValue()
            java.lang.String r0 = "client_session_id"
            java.lang.String r3 = r5.getStringValue(r0)
            kotlin.Pair r0 = X.C18180wK.A0p(r6, r1)
            java.util.Map r2 = X.AnonymousClass4WK.A0O(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1100000_I2_1 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1100000_I2_1
            r0.<init>((java.lang.String) r3, (java.util.Map) r2)
            boolean r0 = r7.ADi(r4, r0)
            if (r0 == 0) goto L_0x0084
            goto L_0x0063
        L_0x00a2:
            X.3Vs r7 = X.C49402rK.A00(r7, r5)
            if (r7 != 0) goto L_0x00e6
            java.lang.String r0 = ": Unsupported notice variant on the client"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r6, r0)
            X.AnonymousClass0LU.A0B(r9, r0)
            X.3VY r3 = r4.A02
            X.25p r2 = r5.A00()
            java.lang.String r0 = "unmapped_variant:"
            java.lang.String r2 = X.AnonymousClass0wJ.A0t(r0, r2)
            java.lang.String r0 = "failure_reason"
            r3.A02(r0, r2)
            r3.A03(r8)
            X.4wE r7 = r4.A04
        L_0x00c7:
            java.lang.Object r4 = r7.getValue()
            java.lang.String r0 = "client_session_id"
            java.lang.String r3 = r5.getStringValue(r0)
            kotlin.Pair r0 = X.C18180wK.A0p(r6, r1)
            java.util.Map r2 = X.AnonymousClass4WK.A0O(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1100000_I2_1 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1100000_I2_1
            r0.<init>((java.lang.String) r3, (java.util.Map) r2)
            boolean r0 = r7.ADi(r4, r0)
            if (r0 == 0) goto L_0x00c7
            goto L_0x0063
        L_0x00e6:
            X.3VY r2 = r4.A02
            java.lang.String r1 = r7.A02()
            java.lang.String r0 = "notice_variant"
            r2.A02(r0, r1)
            r2.A03(r3)
            X.4wE r4 = r4.A04
        L_0x00f6:
            java.lang.Object r3 = r4.getValue()
            java.lang.String r0 = "client_session_id"
            java.lang.String r2 = r5.getStringValue(r0)
            kotlin.Pair r0 = X.C18180wK.A0p(r6, r7)
            java.util.Map r1 = X.AnonymousClass4WK.A0O(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1100000_I2_1 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1100000_I2_1
            r0.<init>((java.lang.String) r2, (java.util.Map) r1)
            boolean r0 = r4.ADi(r3, r0)
            if (r0 == 0) goto L_0x00f6
            goto L_0x0063
        L_0x0115:
            X.AnonymousClass0OU.A00(r5)
            X.25U r6 = X.AnonymousClass25U.A03
            X.3VY r12 = r4.A02
            java.lang.String r5 = r6.toString()
            r0 = 3
            X.AnonymousClass3VY.A00(r12, r1, r1, r5, r0)
            java.util.UUID r0 = X.C03480Iw.A00()
            java.lang.String r5 = X.C18190wL.A0n(r0)
            com.instagram.service.session.UserSession r11 = r4.A01
            boolean r17 = r6.A01(r11)
            com.instagram.share.facebook.upsell.api.CLNoticeApi r7 = com.instagram.share.facebook.upsell.api.CLNoticeApi.A00
            com.google.common.collect.ImmutableList r10 = r6.A00
            android.content.Context r0 = r4.A00
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r8 = X.C61843Wa.A00(r0, r5)
            com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository r13 = r4.A03
            if (r17 == 0) goto L_0x0153
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0060000_I2 r9 = X.AnonymousClass3P2.A00(r11)
        L_0x0144:
            long r15 = r6.A00(r11)
            r14.A01 = r4
            r14.A00 = r2
            java.lang.Object r5 = r7.A01(r8, r9, r10, r11, r12, r13, r14, r15, r17)
            if (r5 != r3) goto L_0x002d
            return r3
        L_0x0153:
            r9 = r1
            goto L_0x0144
        L_0x0155:
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r14 = new kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4
            r14.<init>(r4, r5, r3)
            goto L_0x001a
        L_0x015c:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.facebook.upsell.data.CLNoticeRepository.A00(X.8n9):java.lang.Object");
    }
}
