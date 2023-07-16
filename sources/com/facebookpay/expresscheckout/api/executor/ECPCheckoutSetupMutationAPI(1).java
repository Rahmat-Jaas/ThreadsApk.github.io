package com.facebookpay.expresscheckout.api.executor;

import X.AnonymousClass0OY;
import X.C04530Oa;
import X.C138058Ga;

public final class ECPCheckoutSetupMutationAPI {
    public final C04530Oa A00 = AnonymousClass0OY.A02(C138058Ga.A00);

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.util.List r16, X.C146958n9 r17) {
        /*
            r10 = this;
            r3 = 20
            r5 = r17
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r3, r5)
            if (r0 == 0) goto L_0x00ce
            r4 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ce
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r4.A01
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r2) goto L_0x00d4
            X.AnonymousClass0OU.A00(r1)
        L_0x0026:
            X.7EC r1 = (X.AnonymousClass7EC) r1
            X.7Kx r0 = r1.A02()
            return r0
        L_0x002d:
            X.AnonymousClass0OU.A00(r1)
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r5 = X.C86154wM.A0L()
            r6 = 0
            r1 = 10
            r0 = 62
            java.lang.String r0 = X.AnonymousClass7C6.A01(r6, r1, r0)
            r5.A0D(r11, r0)
            java.lang.String r0 = "product_id"
            r5.A0D(r12, r0)
            java.lang.String r0 = "receiver_id"
            r5.A0D(r13, r0)
            java.lang.String r0 = "order_id"
            r5.A0D(r14, r0)
            r0 = r16
            if (r16 == 0) goto L_0x007d
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0x(r0, r1)
            java.util.Iterator r8 = r0.iterator()
        L_0x005b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r7 = r8.next()
            com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue r7 = (com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue) r7
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r6 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            java.lang.String r1 = r7.A00
            java.lang.String r0 = "key"
            r6.A0F(r1, r0)
            java.lang.String r1 = r7.A01
            java.lang.String r0 = "value"
            r6.A0F(r1, r0)
            r9.add(r6)
            goto L_0x005b
        L_0x007d:
            r1 = 0
            goto L_0x0083
        L_0x007f:
            java.util.List r1 = X.AnonymousClass00J.A0N(r9)
        L_0x0083:
            java.lang.String r0 = "product_data"
            r5.A0A(r0, r1)
            if (r15 == 0) goto L_0x009c
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r1 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            r0 = 142(0x8e, float:1.99E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r1.A0F(r15, r0)
            java.lang.String r0 = "bloks_input"
            r5.A0B(r1, r0)
        L_0x009c:
            java.lang.Class<X.6we> r1 = X.C116236we.class
            java.lang.String r0 = "create"
            java.lang.Object r1 = X.C86104wH.A0p(r0, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00d9 }
            X.7fE r1 = (X.C126427fE) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00d9 }
            X.3zb r0 = r1.A00
            X.C67463zb.A01(r5, r0)
            r1.A02 = r2
            X.4vi r1 = r1.AB4()
            java.lang.String r0 = "NETWORK_ONLY"
            X.6p4 r0 = X.AnonymousClass6I0.A00(r0)
            X.C04220Ms.A06(r1)
            r0.A00(r1)
            X.0Oa r0 = r10.A00
            java.lang.Object r0 = r0.getValue()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r0 = (com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor) r0
            r4.A00 = r2
            java.lang.Object r1 = r0.A00(r1, r4)
            if (r1 != r3) goto L_0x0026
            return r3
        L_0x00ce:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r4 = X.C86114wI.A0x(r10, r5, r3)
            goto L_0x0018
        L_0x00d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00d9:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.api.executor.ECPCheckoutSetupMutationAPI.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.8n9):java.lang.Object");
    }
}
