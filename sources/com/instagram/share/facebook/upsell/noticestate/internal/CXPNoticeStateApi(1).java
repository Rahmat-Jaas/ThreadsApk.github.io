package com.instagram.share.facebook.upsell.noticestate.internal;

import X.AnonymousClass0wJ;
import X.AnonymousClass3WK;
import X.AnonymousClass4WJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18210wN;
import X.C18220wO;
import X.C18250wR;
import X.C207916c;
import X.C313425p;
import X.C31580Grx;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.upsell.noticestate.graphql.SyncCXPNoticeStateMutationResponseImpl;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

public final class CXPNoticeStateApi {
    public final C31580Grx A00;

    public static final ImmutableList A00(Map map) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ArrayList<Object> A0w = C18220wO.A0w(map);
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
            GraphQlCallInput.A05(A002, A0o.getKey().toString(), "variant");
            GraphQlCallInput.A05(A002, Integer.valueOf(((C207916c) A0o.getValue()).A00), "impression_count");
            GraphQlCallInput.A05(A002, Integer.valueOf(((C207916c) A0o.getValue()).A01), "sequence_number");
            GraphQlCallInput.A05(A002, Integer.valueOf(((C207916c) A0o.getValue()).A02), "last_impression_time");
            A0w.add(A002);
        }
        for (Object add : A0w) {
            builder.add(add);
        }
        return C18250wR.A0F(builder);
    }

    public static final EnumMap A01(SyncCXPNoticeStateMutationResponseImpl syncCXPNoticeStateMutationResponseImpl, Map map) {
        ImmutableList treeList;
        EnumMap enumMap = new EnumMap(C313425p.class);
        if (!(syncCXPNoticeStateMutationResponseImpl == null || (treeList = syncCXPNoticeStateMutationResponseImpl.getTreeList("xcxp_sync_notice_state(params:$client_states)", SyncCXPNoticeStateMutationResponseImpl.XcxpSyncNoticeState.class)) == null)) {
            Iterator it = treeList.iterator();
            while (it.hasNext()) {
                TreeJNI A0G = C18210wN.A0G(it);
                Enum enumValue = A0G.getEnumValue("variant", C313425p.A0O);
                if (enumValue != null && map.containsKey(enumValue)) {
                    enumMap.put(enumValue, new C207916c(((C207916c) AnonymousClass4WJ.A07(enumValue, map)).A01, A0G.getIntValue("impression_count"), A0G.getIntValue("last_impression_time"), true));
                }
            }
        }
        return enumMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.util.Map r19, X.C146958n9 r20) {
        /*
            r18 = this;
            r2 = r19
            r6 = 27
            r7 = r20
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2.A00(r6, r7)
            r5 = r18
            if (r0 == 0) goto L_0x008e
            r4 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2) r4
            int r3 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x008e
            int r3 = r3 - r1
            r4.A00 = r3
        L_0x001c:
            java.lang.Object r1 = r4.A03
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r13 = 1
            if (r0 == 0) goto L_0x003f
            if (r0 != r13) goto L_0x0099
            java.lang.Object r2 = r4.A02
            java.util.Map r2 = (java.util.Map) r2
            X.AnonymousClass0OU.A00(r1)
        L_0x002e:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = X.C62903b6.A06(r1)
            com.instagram.share.facebook.upsell.noticestate.graphql.SyncCXPNoticeStateMutationResponseImpl r0 = (com.instagram.share.facebook.upsell.noticestate.graphql.SyncCXPNoticeStateMutationResponseImpl) r0
            java.util.EnumMap r3 = A01(r0, r2)
            return r3
        L_0x003f:
            X.AnonymousClass0OU.A00(r1)
            com.google.common.collect.ImmutableList r7 = A00(r2)
            r14 = 0
            X.3zb r6 = X.C67463zb.A00()
            X.3zb r1 = X.C67463zb.A00()
            java.lang.String r0 = "client_states"
            r6.A06(r0, r7)
            X.8l9 r8 = X.C63233h2.A04(r13)
            java.util.Map r10 = com.facebook.graphql.calls.GraphQlCallInput.A03(r6)
            java.util.Map r11 = com.facebook.graphql.calls.GraphQlCallInput.A03(r1)
            java.lang.Class<com.instagram.share.facebook.upsell.noticestate.graphql.SyncCXPNoticeStateMutationResponseImpl> r12 = com.instagram.share.facebook.upsell.noticestate.graphql.SyncCXPNoticeStateMutationResponseImpl.class
            java.lang.String r9 = "SyncCXPNoticeStateMutation"
            r15 = 0
            java.lang.String r17 = "xcxp_sync_notice_state"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r6 = 3
            X.E5N r1 = X.C18250wR.A0J(r14, r6)
            r0 = 1158112076(0x4507634c, float:2166.206)
            X.0gQ r6 = r1.BQy(r0, r6)
            r1 = 22
            kotlin.coroutines.jvm.internal.KtSLambdaShape22S0201000_I2_8 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape22S0201000_I2_8
            r0.<init>(r7, r5, r14, r1)
            r4.A01 = r5
            r4.A02 = r2
            r4.A00 = r13
            java.lang.Object r1 = X.C25599DoZ.A00(r4, r6, r0)
            if (r1 != r3) goto L_0x002e
            return r3
        L_0x008e:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2
            r4.<init>(r5, r7, r6)
            goto L_0x001c
        L_0x0094:
            X.4To r3 = X.AnonymousClass4To.A00()
            return r3
        L_0x0099:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateApi.A02(java.util.Map, X.8n9):java.lang.Object");
    }

    public CXPNoticeStateApi(UserSession userSession) {
        C31580Grx A01 = AnonymousClass3WK.A01(userSession);
        C04220Ms.A0B(A01, 1);
        this.A00 = A01;
    }
}
