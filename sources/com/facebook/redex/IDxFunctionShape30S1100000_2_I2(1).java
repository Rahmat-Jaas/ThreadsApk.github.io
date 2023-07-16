package com.facebook.redex;

import X.C142618fJ;

public class IDxFunctionShape30S1100000_2_I2 implements C142618fJ {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxFunctionShape30S1100000_2_I2(String str, Object obj, int i) {
        this.A02 = i;
        this.A01 = str;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01f7, code lost:
        return X.AnonymousClass6BW.A00(r0, r2, r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x020d, code lost:
        return java.lang.Boolean.valueOf(r1.equalsIgnoreCase(r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r18) {
        /*
            r17 = this;
            r5 = r17
            r0 = r18
            int r1 = r5.A02
            switch(r1) {
                case 0: goto L_0x00a5;
                case 1: goto L_0x0073;
                case 2: goto L_0x00ec;
                case 3: goto L_0x0159;
                case 4: goto L_0x01aa;
                case 5: goto L_0x01f8;
                case 6: goto L_0x01ff;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.6sA r0 = (X.C113806sA) r0
            java.lang.Object r1 = r5.A00
            X.6q4 r1 = (X.C112716q4) r1
            X.6i3 r4 = r1.A03
            java.lang.String r6 = r5.A01
            java.lang.String r5 = "FBPAY_HUB"
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r3 = X.C86114wI.A0K()
            com.instagram.service.session.UserSession r1 = r4.A01
            java.lang.String r2 = r1.getUserId()
            java.lang.String r1 = "actor_id"
            r3.A0D(r2, r1)
            java.lang.String r1 = "logging_id"
            r3.A0D(r6, r1)
            java.lang.String r1 = X.C61953Wm.A00()
            r3.A0D(r6, r1)
            java.lang.String r2 = "instagram://shop_pay_did_finish"
            java.lang.String r1 = "app_url"
            r3.A0D(r2, r1)
            java.lang.String r1 = "payment_type"
            r3.A0D(r5, r1)
            r12 = 0
            X.3zb r2 = X.C67463zb.A00()
            X.3zb r1 = X.C67463zb.A00()
            java.lang.String r14 = "input"
            r2.A02(r3, r14)
            r11 = 1
            X.8l9 r6 = X.C63233h2.A01()
            java.util.Map r8 = r2.getParamsCopy()
            java.util.Map r9 = r1.getParamsCopy()
            java.lang.Class<com.instagram.fbpay.shoppay.graphql.IGFBPayShopPayInitLinkMutationResponseImpl> r10 = com.instagram.fbpay.shoppay.graphql.IGFBPayShopPayInitLinkMutationResponseImpl.class
            java.lang.String r7 = "IGFBPayShopPayInitLinkMutation"
            r13 = 12
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.Grx r3 = r4.A00
            r1 = 11
            com.facebook.redex.IDxFunctionShape362S0100000_2_I2 r2 = new com.facebook.redex.IDxFunctionShape362S0100000_2_I2
            r2.<init>(r4, r1)
            X.McB r1 = X.C103226Yh.A00
            X.5kG r0 = X.C92935kG.A00(r0, r3, r5, r2, r1)
        L_0x0072:
            return r0
        L_0x0073:
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r0 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r0
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            boolean r2 = r0 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem
            r1 = 0
            if (r2 == 0) goto L_0x00a3
            r2 = r0
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r2 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem) r2
            if (r2 == 0) goto L_0x00a3
            java.lang.String r3 = r2.A0A
        L_0x0085:
            java.lang.String r2 = r5.A01
            boolean r2 = X.C04220Ms.A0I(r3, r2)
            if (r2 == 0) goto L_0x0072
            r4 = r0
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r4 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem) r4
            java.lang.Object r3 = r5.A00
            X.88h r3 = (X.C1373688h) r3
            if (r3 == 0) goto L_0x00a1
            java.lang.Integer r2 = r3.A01
        L_0x0098:
            r4.A00 = r2
            if (r3 == 0) goto L_0x009e
            java.util.List r1 = r3.A02
        L_0x009e:
            r4.A06 = r1
            return r0
        L_0x00a1:
            r2 = r1
            goto L_0x0098
        L_0x00a3:
            r3 = r1
            goto L_0x0085
        L_0x00a5:
            X.6sA r0 = (X.C113806sA) r0
            java.lang.Object r1 = r5.A00
            X.7jN r1 = (X.C128317jN) r1
            X.0Oa r1 = r1.A00
            r1.getValue()
            java.lang.String r6 = r5.A01
            r5 = 0
            java.lang.Class<X.6x2> r2 = X.C116476x2.class
            java.lang.String r1 = "create"
            java.lang.Object r4 = X.C86114wI.A0g(r5, r2, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00e6 }
            X.7eu r4 = (X.C126287eu) r4     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00e6 }
            X.3zb r3 = r4.A00
            java.lang.String r1 = "id"
            r3.A05(r1, r6)
            r1 = 1
            r4.A02 = r1
            r1 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "first"
            r3.A04(r1, r2)
            java.lang.String r1 = "after"
            r3.A05(r1, r5)
            X.8mD r6 = r4.build()
            X.C04220Ms.A06(r6)
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r2 = X.C1370385p.A00()
            X.7nM r1 = X.AnonymousClass7nM.A00
            goto L_0x01f3
        L_0x00e6:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x00ec:
            X.6sA r0 = (X.C113806sA) r0
            java.lang.Object r1 = r5.A00
            X.6gW r1 = (X.C107296gW) r1
            X.6eT r1 = r1.A01
            java.lang.String r6 = r5.A01
            java.lang.String r5 = X.C18180wK.A0e()
            com.instagram.service.session.UserSession r1 = r1.A00
            java.lang.String r4 = r1.getUserId()
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r3 = X.C86154wM.A0L()
            java.lang.String r2 = "CONNECT_VIA_IAW"
            java.lang.String r1 = "payment_type"
            r3.A0D(r2, r1)
            java.lang.String r2 = ""
            java.lang.String r1 = "platform_trust_token"
            r3.A0D(r2, r1)
            java.lang.String r1 = "target_account_id"
            r3.A0D(r6, r1)
            java.lang.String r1 = "logging_id"
            r3.A0D(r2, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x0127
            java.lang.String r1 = "client_mutation_id"
            r3.A0D(r5, r1)
        L_0x0127:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x0132
            java.lang.String r1 = "actor_id"
            r3.A0D(r4, r1)
        L_0x0132:
            java.lang.Class<X.6wz> r2 = X.C116446wz.class
            java.lang.String r1 = "create"
            java.lang.Object r2 = X.C86104wH.A0p(r1, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0153 }
            X.7fT r2 = (X.C126577fT) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0153 }
            X.3zb r1 = r2.A00
            X.C67463zb.A01(r3, r1)
            r1 = 1
            r2.A02 = r1
            X.4vi r6 = r2.AB4()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r2 = X.C1370385p.A00()
            r1 = 7
            com.facebook.redex.IDxFunctionShape101S0000000_2_I2 r1 = X.C86164wN.A0N(r1)
            goto L_0x01f3
        L_0x0153:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x0159:
            X.6sA r0 = (X.C113806sA) r0
            java.lang.Object r1 = r5.A00
            X.6q3 r1 = (X.C112706q3) r1
            com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI r3 = r1.A01
            java.lang.String r2 = r5.A01
            r13 = 0
            X.3zb r6 = X.C67463zb.A00()
            X.3zb r5 = X.C67463zb.A00()
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r4 = X.C86154wM.A0L()
            X.C86154wM.A1M(r4)
            java.lang.String r1 = "ba_token"
            r4.A0D(r2, r1)
            java.lang.String r2 = "1"
            java.lang.String r1 = "client_mutation_id"
            r4.A0D(r2, r1)
            java.lang.String r1 = X.C61953Wm.A00()
            r4.A0D(r2, r1)
            java.lang.String r15 = "data"
            r6.A02(r4, r15)
            r12 = 1
            X.8l9 r7 = X.C63233h2.A01()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.IGFBPayCompletePaypalLinkingMutationResponseImpl> r11 = com.instagram.graphql.instagramschemagraphservices.IGFBPayCompletePaypalLinkingMutationResponseImpl.class
            java.lang.String r8 = "IGFBPayCompletePaypalLinkingMutation"
            r14 = 40
            java.lang.String r16 = "complete_paypal_linking"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.Grx r2 = r3.A03
            X.McB r1 = X.AnonymousClass74P.A01
            goto L_0x01f3
        L_0x01aa:
            X.6sA r0 = (X.C113806sA) r0
            java.lang.Object r1 = r5.A00
            X.6q3 r1 = (X.C112706q3) r1
            com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI r3 = r1.A01
            java.lang.String r2 = r5.A01
            r13 = 0
            X.3zb r6 = X.C67463zb.A00()
            X.3zb r5 = X.C67463zb.A00()
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r4 = X.C86154wM.A0L()
            X.C86154wM.A1M(r4)
            java.lang.String r1 = "billing_agreement_id"
            r4.A0D(r2, r1)
            java.lang.String r2 = "1"
            java.lang.String r1 = "client_mutation_id"
            r4.A0D(r2, r1)
            java.lang.String r15 = "data"
            r6.A02(r4, r15)
            r12 = 1
            X.8l9 r7 = X.C63233h2.A01()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.IGFBPayCancelPayPalMutationResponseImpl> r11 = com.instagram.graphql.instagramschemagraphservices.IGFBPayCancelPayPalMutationResponseImpl.class
            java.lang.String r8 = "IGFBPayCancelPayPalMutation"
            r14 = 40
            java.lang.String r16 = "cancel_paypal_ba"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.Grx r2 = r3.A03
            X.McB r1 = X.AnonymousClass74P.A00
        L_0x01f3:
            X.5kG r0 = X.AnonymousClass6BW.A00(r0, r2, r6, r1)
            return r0
        L_0x01f8:
            X.7Dk r0 = (X.C120967Dk) r0
            java.lang.String r1 = r0.A03
            java.lang.String r0 = r5.A01
            goto L_0x0205
        L_0x01ff:
            X.7Dk r0 = (X.C120967Dk) r0
            java.lang.String r1 = r5.A01
            java.lang.String r0 = r0.A02
        L_0x0205:
            boolean r0 = r1.equalsIgnoreCase(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFunctionShape30S1100000_2_I2.apply(java.lang.Object):java.lang.Object");
    }
}
